package com.luck.picture.lib.thread;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.g0;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.collection.r2;
import androidx.constraintlayout.core.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Thread;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class PictureThreadUtils {
    private static final byte TYPE_CACHED = -2;
    private static final byte TYPE_CPU = -8;
    private static final byte TYPE_IO = -4;
    private static final byte TYPE_SINGLE = -1;
    private static Executor sDeliver;
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private static final Map<Integer, Map<Integer, ExecutorService>> TYPE_PRIORITY_POOLS = new HashMap();
    private static final Map<Task, ExecutorService> TASK_POOL_MAP = new ConcurrentHashMap();
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final Timer TIMER = new Timer();

    private static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile ThreadPoolExecutor4Util mPool;

        LinkedBlockingQueue4Util() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(@o0 Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer((LinkedBlockingQueue4Util) runnable);
            }
            return false;
        }

        LinkedBlockingQueue4Util(boolean z4) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z4) {
                this.mCapacity = 0;
            }
        }

        LinkedBlockingQueue4Util(int i4) {
            this.mCapacity = i4;
        }
    }

    public static abstract class SimpleTask<T> extends Task<T> {
        @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
        public void onCancel() {
            Objects.toString(Thread.currentThread());
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
        public void onFail(Throwable th) {
        }
    }

    public static abstract class Task<T> implements Runnable {
        private static final int CANCELLED = 4;
        private static final int COMPLETING = 3;
        private static final int EXCEPTIONAL = 2;
        private static final int INTERRUPTED = 5;
        private static final int NEW = 0;
        private static final int RUNNING = 1;
        private static final int TIMEOUT = 6;
        private Executor deliver;
        private volatile boolean isSchedule;
        private OnTimeoutListener mTimeoutListener;
        private long mTimeoutMillis;
        private Timer mTimer;
        private volatile Thread runner;
        private final AtomicInteger state = new AtomicInteger(0);

        public interface OnTimeoutListener {
            void onTimeout();
        }

        private Executor getDeliver() {
            Executor executor = this.deliver;
            return executor == null ? PictureThreadUtils.getGlobalDeliver() : executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchedule(boolean z4) {
            this.isSchedule = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void timeout() {
            synchronized (this.state) {
                try {
                    if (this.state.get() > 1) {
                        return;
                    }
                    this.state.set(6);
                    if (this.runner != null) {
                        this.runner.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void cancel() {
            cancel(true);
        }

        public abstract T doInBackground() throws Throwable;

        public boolean isCanceled() {
            return this.state.get() >= 4;
        }

        public boolean isDone() {
            return this.state.get() > 1;
        }

        public abstract void onCancel();

        @i
        protected void onDone() {
            PictureThreadUtils.TASK_POOL_MAP.remove(this);
            Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
                this.mTimer = null;
                this.mTimeoutListener = null;
            }
        }

        public abstract void onFail(Throwable th);

        public abstract void onSuccess(T t4);

        @Override // java.lang.Runnable
        public void run() {
            if (this.isSchedule) {
                if (this.runner == null) {
                    if (!this.state.compareAndSet(0, 1)) {
                        return;
                    } else {
                        this.runner = Thread.currentThread();
                    }
                } else if (this.state.get() != 1) {
                    return;
                }
            } else {
                if (!this.state.compareAndSet(0, 1)) {
                    return;
                }
                this.runner = Thread.currentThread();
                if (this.mTimeoutListener != null) {
                    Timer timer = new Timer();
                    this.mTimer = timer;
                    timer.schedule(new TimerTask() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            if (Task.this.isDone() || Task.this.mTimeoutListener == null) {
                                return;
                            }
                            Task.this.timeout();
                            Task.this.mTimeoutListener.onTimeout();
                            Task.this.onDone();
                        }
                    }, this.mTimeoutMillis);
                }
            }
            try {
                final T doInBackground = doInBackground();
                if (this.isSchedule) {
                    if (this.state.get() != 1) {
                        return;
                    }
                    getDeliver().execute(new Runnable() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            Task.this.onSuccess(doInBackground);
                        }
                    });
                } else if (this.state.compareAndSet(1, 3)) {
                    getDeliver().execute(new Runnable() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            Task.this.onSuccess(doInBackground);
                            Task.this.onDone();
                        }
                    });
                }
            } catch (InterruptedException unused) {
                this.state.compareAndSet(4, 5);
            } catch (Throwable th) {
                if (this.state.compareAndSet(1, 2)) {
                    getDeliver().execute(new Runnable() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.4
                        @Override // java.lang.Runnable
                        public void run() {
                            Task.this.onFail(th);
                            Task.this.onDone();
                        }
                    });
                }
            }
        }

        public Task<T> setDeliver(Executor executor) {
            this.deliver = executor;
            return this;
        }

        public Task<T> setTimeout(long j4, OnTimeoutListener onTimeoutListener) {
            this.mTimeoutMillis = j4;
            this.mTimeoutListener = onTimeoutListener;
            return this;
        }

        public void cancel(boolean z4) {
            synchronized (this.state) {
                try {
                    if (this.state.get() > 1) {
                        return;
                    }
                    this.state.set(4);
                    if (z4 && this.runner != null) {
                        this.runner.interrupt();
                    }
                    getDeliver().execute(new Runnable() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.5
                        @Override // java.lang.Runnable
                        public void run() {
                            Task.this.onCancel();
                            Task.this.onDone();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static final class ThreadPoolExecutor4Util extends ThreadPoolExecutor {
        private final AtomicInteger mSubmittedCount;
        private LinkedBlockingQueue4Util mWorkQueue;

        ThreadPoolExecutor4Util(int i4, int i5, long j4, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i4, i5, j4, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.mSubmittedCount = new AtomicInteger();
            linkedBlockingQueue4Util.mPool = this;
            this.mWorkQueue = linkedBlockingQueue4Util;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ExecutorService createPool(int i4, int i5) {
            return i4 != -8 ? i4 != -4 ? i4 != -2 ? i4 != -1 ? new ThreadPoolExecutor4Util(i4, i4, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory(r2.a(ProtectedSandApp.s("ᛈ\u0001"), i4, ProtectedSandApp.s("ᛉ\u0001")), i5)) : new ThreadPoolExecutor4Util(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory(ProtectedSandApp.s("ᛊ\u0001"), i5)) : new ThreadPoolExecutor4Util(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory(ProtectedSandApp.s("ᛋ\u0001"), i5)) : new ThreadPoolExecutor4Util((PictureThreadUtils.CPU_COUNT * 2) + 1, (PictureThreadUtils.CPU_COUNT * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory(ProtectedSandApp.s("ᛌ\u0001"), i5)) : new ThreadPoolExecutor4Util(PictureThreadUtils.CPU_COUNT + 1, (PictureThreadUtils.CPU_COUNT * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory(ProtectedSandApp.s("ᛍ\u0001"), i5));
        }

        private int getSubmittedCount() {
            return this.mSubmittedCount.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            this.mSubmittedCount.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.mSubmittedCount.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                this.mWorkQueue.offer(runnable);
            } catch (Throwable unused2) {
                this.mSubmittedCount.decrementAndGet();
            }
        }
    }

    static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {
        private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        UtilsThreadFactory(String str, int i4) {
            this(str, i4, false);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@o0 Runnable runnable) {
            Thread thread = new Thread(runnable, this.namePrefix + getAndIncrement()) { // from class: com.luck.picture.lib.thread.PictureThreadUtils.UtilsThreadFactory.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        super.run();
                    } catch (Throwable unused) {
                    }
                }
            };
            thread.setDaemon(this.isDaemon);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.UtilsThreadFactory.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    System.out.println(th);
                }
            });
            thread.setPriority(this.priority);
            return thread;
        }

        UtilsThreadFactory(String str, int i4, boolean z4) {
            StringBuilder a5 = e.a(str, ProtectedSandApp.s("ᛎ\u0001"));
            a5.append(POOL_NUMBER.getAndIncrement());
            a5.append(ProtectedSandApp.s("ᛏ\u0001"));
            this.namePrefix = a5.toString();
            this.priority = i4;
            this.isDaemon = z4;
        }
    }

    public static void cancel(Task task) {
        if (task == null) {
            return;
        }
        task.cancel();
    }

    private static <T> void execute(ExecutorService executorService, Task<T> task) {
        execute(executorService, task, 0L, 0L, null);
    }

    private static <T> void executeAtFixedRate(ExecutorService executorService, Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        execute(executorService, task, j4, j5, timeUnit);
    }

    public static <T> void executeByCached(Task<T> task) {
        execute(getPoolByTypeAndPriority(-2), task);
    }

    public static <T> void executeByCachedAtFixRate(Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCachedWithDelay(Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-2), task, j4, timeUnit);
    }

    public static <T> void executeByCpu(Task<T> task) {
        execute(getPoolByTypeAndPriority(-8), task);
    }

    public static <T> void executeByCpuAtFixRate(Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCpuWithDelay(Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-8), task, j4, timeUnit);
    }

    public static <T> void executeByCustom(ExecutorService executorService, Task<T> task) {
        execute(executorService, task);
    }

    public static <T> void executeByCustomAtFixRate(ExecutorService executorService, Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(executorService, task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCustomWithDelay(ExecutorService executorService, Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(executorService, task, j4, timeUnit);
    }

    public static <T> void executeByFixed(@g0(from = 1) int i4, Task<T> task) {
        execute(getPoolByTypeAndPriority(i4), task);
    }

    public static <T> void executeByFixedAtFixRate(@g0(from = 1) int i4, Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByFixedWithDelay(@g0(from = 1) int i4, Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(i4), task, j4, timeUnit);
    }

    public static <T> void executeByIo(Task<T> task) {
        execute(getPoolByTypeAndPriority(-4), task);
    }

    public static <T> void executeByIoAtFixRate(Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByIoWithDelay(Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-4), task, j4, timeUnit);
    }

    public static <T> void executeBySingle(Task<T> task) {
        execute(getPoolByTypeAndPriority(-1), task);
    }

    public static <T> void executeBySingleAtFixRate(Task<T> task, long j4, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1), task, 0L, j4, timeUnit);
    }

    public static <T> void executeBySingleWithDelay(Task<T> task, long j4, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-1), task, j4, timeUnit);
    }

    private static <T> void executeWithDelay(ExecutorService executorService, Task<T> task, long j4, TimeUnit timeUnit) {
        execute(executorService, task, j4, 0L, timeUnit);
    }

    public static ExecutorService getCachedPool() {
        return getPoolByTypeAndPriority(-2);
    }

    public static ExecutorService getCpuPool() {
        return getPoolByTypeAndPriority(-8);
    }

    public static ExecutorService getFixedPool(@g0(from = 1) int i4) {
        return getPoolByTypeAndPriority(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Executor getGlobalDeliver() {
        if (sDeliver == null) {
            sDeliver = new Executor() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.3
                @Override // java.util.concurrent.Executor
                public void execute(@o0 Runnable runnable) {
                    PictureThreadUtils.runOnUiThread(runnable);
                }
            };
        }
        return sDeliver;
    }

    public static ExecutorService getIoPool() {
        return getPoolByTypeAndPriority(-4);
    }

    public static Handler getMainHandler() {
        return HANDLER;
    }

    private static ExecutorService getPoolByTypeAndPriority(int i4) {
        return getPoolByTypeAndPriority(i4, 5);
    }

    public static ExecutorService getSinglePool() {
        return getPoolByTypeAndPriority(-1);
    }

    public static boolean isInUiThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j4) {
        HANDLER.postDelayed(runnable, j4);
    }

    public static void setDeliver(Executor executor) {
        sDeliver = executor;
    }

    public static void cancel(Task... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return;
        }
        for (Task task : taskArr) {
            if (task != null) {
                task.cancel();
            }
        }
    }

    private static <T> void execute(final ExecutorService executorService, final Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        Map<Task, ExecutorService> map = TASK_POOL_MAP;
        synchronized (map) {
            try {
                if (map.get(task) != null) {
                    return;
                }
                map.put(task, executorService);
                if (j5 != 0) {
                    task.setSchedule(true);
                    TIMER.scheduleAtFixedRate(new TimerTask() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.2
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            executorService.execute(task);
                        }
                    }, timeUnit.toMillis(j4), timeUnit.toMillis(j5));
                } else if (j4 == 0) {
                    executorService.execute(task);
                } else {
                    TIMER.schedule(new TimerTask() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            executorService.execute(task);
                        }
                    }, timeUnit.toMillis(j4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <T> void executeByCached(Task<T> task, @g0(from = 1, to = 10) int i4) {
        execute(getPoolByTypeAndPriority(-2, i4), task);
    }

    public static <T> void executeByCachedAtFixRate(Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2, i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCachedWithDelay(Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeWithDelay(getPoolByTypeAndPriority(-2, i4), task, j4, timeUnit);
    }

    public static <T> void executeByCpu(Task<T> task, @g0(from = 1, to = 10) int i4) {
        execute(getPoolByTypeAndPriority(-8, i4), task);
    }

    public static <T> void executeByCpuAtFixRate(Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8, i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByCpuWithDelay(Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeWithDelay(getPoolByTypeAndPriority(-8, i4), task, j4, timeUnit);
    }

    public static <T> void executeByCustomAtFixRate(ExecutorService executorService, Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(executorService, task, j4, j5, timeUnit);
    }

    public static <T> void executeByFixed(@g0(from = 1) int i4, Task<T> task, @g0(from = 1, to = 10) int i5) {
        execute(getPoolByTypeAndPriority(i4, i5), task);
    }

    public static <T> void executeByFixedAtFixRate(@g0(from = 1) int i4, Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i5) {
        executeAtFixedRate(getPoolByTypeAndPriority(i4, i5), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByFixedWithDelay(@g0(from = 1) int i4, Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i5) {
        executeWithDelay(getPoolByTypeAndPriority(i4, i5), task, j4, timeUnit);
    }

    public static <T> void executeByIo(Task<T> task, @g0(from = 1, to = 10) int i4) {
        execute(getPoolByTypeAndPriority(-4, i4), task);
    }

    public static <T> void executeByIoAtFixRate(Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4, i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeByIoWithDelay(Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeWithDelay(getPoolByTypeAndPriority(-4, i4), task, j4, timeUnit);
    }

    public static <T> void executeBySingle(Task<T> task, @g0(from = 1, to = 10) int i4) {
        execute(getPoolByTypeAndPriority(-1, i4), task);
    }

    public static <T> void executeBySingleAtFixRate(Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1, i4), task, 0L, j4, timeUnit);
    }

    public static <T> void executeBySingleWithDelay(Task<T> task, long j4, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeWithDelay(getPoolByTypeAndPriority(-1, i4), task, j4, timeUnit);
    }

    public static ExecutorService getCachedPool(@g0(from = 1, to = 10) int i4) {
        return getPoolByTypeAndPriority(-2, i4);
    }

    public static ExecutorService getCpuPool(@g0(from = 1, to = 10) int i4) {
        return getPoolByTypeAndPriority(-8, i4);
    }

    public static ExecutorService getFixedPool(@g0(from = 1) int i4, @g0(from = 1, to = 10) int i5) {
        return getPoolByTypeAndPriority(i4, i5);
    }

    public static ExecutorService getIoPool(@g0(from = 1, to = 10) int i4) {
        return getPoolByTypeAndPriority(-4, i4);
    }

    private static ExecutorService getPoolByTypeAndPriority(int i4, int i5) {
        ExecutorService executorService;
        Map<Integer, Map<Integer, ExecutorService>> map = TYPE_PRIORITY_POOLS;
        synchronized (map) {
            try {
                Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i4));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorService = ThreadPoolExecutor4Util.createPool(i4, i5);
                    concurrentHashMap.put(Integer.valueOf(i5), executorService);
                    map.put(Integer.valueOf(i4), concurrentHashMap);
                } else {
                    executorService = map2.get(Integer.valueOf(i5));
                    if (executorService == null) {
                        executorService = ThreadPoolExecutor4Util.createPool(i4, i5);
                        map2.put(Integer.valueOf(i5), executorService);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static ExecutorService getSinglePool(@g0(from = 1, to = 10) int i4) {
        return getPoolByTypeAndPriority(-1, i4);
    }

    public static <T> void executeByCachedAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2), task, j4, j5, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8), task, j4, j5, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(@g0(from = 1) int i4, Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(i4), task, j4, j5, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4), task, j4, j5, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1), task, j4, j5, timeUnit);
    }

    public static class SyncValue<T> {
        private T mValue;
        private CountDownLatch mLatch = new CountDownLatch(1);
        private AtomicBoolean mFlag = new AtomicBoolean();

        public T getValue() {
            if (!this.mFlag.get()) {
                try {
                    this.mLatch.await();
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
            return this.mValue;
        }

        public void setValue(T t4) {
            if (this.mFlag.compareAndSet(false, true)) {
                this.mValue = t4;
                this.mLatch.countDown();
            }
        }

        public T getValue(long j4, TimeUnit timeUnit, T t4) {
            if (!this.mFlag.get()) {
                try {
                    this.mLatch.await(j4, timeUnit);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                    return t4;
                }
            }
            return this.mValue;
        }
    }

    public static <T> void executeByCachedAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2, i4), task, j4, j5, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8, i4), task, j4, j5, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(@g0(from = 1) int i4, Task<T> task, long j4, long j5, TimeUnit timeUnit, @g0(from = 1, to = 10) int i5) {
        executeAtFixedRate(getPoolByTypeAndPriority(i4, i5), task, j4, j5, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4, i4), task, j4, j5, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(Task<T> task, long j4, long j5, TimeUnit timeUnit, @g0(from = 1, to = 10) int i4) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1, i4), task, j4, j5, timeUnit);
    }

    public static void cancel(List<Task> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (Task task : list) {
            if (task != null) {
                task.cancel();
            }
        }
    }

    public static void cancel(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor4Util) {
            for (Map.Entry<Task, ExecutorService> entry : TASK_POOL_MAP.entrySet()) {
                if (entry.getValue() == executorService) {
                    cancel(entry.getKey());
                }
            }
        }
    }
}
