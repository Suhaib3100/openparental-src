package com.tencent.qcloud.core.task;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class TaskExecutors {
    public static final ThreadPoolExecutor COMMAND_EXECUTOR;
    public static ThreadPoolExecutor DOWNLOAD_EXECUTOR = null;
    public static int DOWNLOAD_THREAD_COUNT = 6;
    public static final UIThreadExecutor UI_THREAD_EXECUTOR;
    public static ThreadPoolExecutor UPLOAD_EXECUTOR = null;
    public static int UPLOAD_THREAD_COUNT = 4;

    static final class TaskThreadFactory implements ThreadFactory {
        private final AtomicInteger increment = new AtomicInteger(1);
        private final int priority;
        private final String tag;

        TaskThreadFactory(String str, int i4) {
            this.tag = str;
            this.priority = i4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@o0 Runnable runnable) {
            Thread thread = new Thread(runnable, ProtectedSandApp.s("媦\u0001") + this.tag + this.increment.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(this.priority);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, new LinkedBlockingQueue(Integer.MAX_VALUE), new TaskThreadFactory(ProtectedSandApp.s("媧\u0001"), 8));
        COMMAND_EXECUTOR = threadPoolExecutor;
        int i4 = UPLOAD_THREAD_COUNT;
        UPLOAD_EXECUTOR = new ThreadPoolExecutor(i4, i4, 5L, timeUnit, new PriorityBlockingQueue(), new TaskThreadFactory(ProtectedSandApp.s("媨\u0001"), 3));
        int i5 = DOWNLOAD_THREAD_COUNT;
        DOWNLOAD_EXECUTOR = new ThreadPoolExecutor(i5, i5, 5L, timeUnit, new LinkedBlockingQueue(Integer.MAX_VALUE), new TaskThreadFactory(ProtectedSandApp.s("媩\u0001"), 3));
        UI_THREAD_EXECUTOR = new UIThreadExecutor();
        UPLOAD_EXECUTOR.allowCoreThreadTimeOut(true);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DOWNLOAD_EXECUTOR.allowCoreThreadTimeOut(true);
    }

    public static void initExecutor(int i4, int i5) {
        UPLOAD_THREAD_COUNT = i4;
        DOWNLOAD_THREAD_COUNT = i5;
        UPLOAD_EXECUTOR.setCorePoolSize(i4);
        UPLOAD_EXECUTOR.setMaximumPoolSize(UPLOAD_THREAD_COUNT);
        DOWNLOAD_EXECUTOR.setCorePoolSize(DOWNLOAD_THREAD_COUNT);
        DOWNLOAD_EXECUTOR.setMaximumPoolSize(DOWNLOAD_THREAD_COUNT);
    }
}
