package com.tencent.qcloud.core.task;

import androidx.annotation.o0;
import bolts.ExecutorException;
import bolts.c;
import bolts.e;
import bolts.g;
import bolts.h;
import bolts.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.common.QCloudResultListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.common.QCloudTaskStateListener;
import com.tencent.qcloud.core.logger.COSLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public abstract class QCloudTask<T> implements Callable<T> {
    public static final int PRIORITY_HIGH = 3;
    public static final int PRIORITY_LOW = 1;
    protected static final int PRIORITY_NORMAL = 2;
    public static final int STATE_COMPLETE = 3;
    public static final int STATE_EXECUTING = 2;
    public static final int STATE_QUEUEING = 1;
    public static final int WEIGHT_HIGH = 2;
    public static final int WEIGHT_LOW = 0;
    public static final int WEIGHT_NORMAL = 1;
    private boolean domainSwitch;
    private int downloadMaxThreadCount;
    private final String identifier;
    private e mCancellationTokenSource;
    private int mState;
    private h<T> mTask;
    private Executor observerExecutor;
    private OnRequestWeightListener onRequestWeightListener;
    private final Object tag;
    private int uploadMaxThreadCount;
    private Executor workerExecutor;
    private int weight = 0;
    private boolean enableTraffic = true;
    private Set<QCloudResultListener<T>> mResultListeners = new HashSet(2);
    private Set<QCloudProgressListener> mProgressListeners = new HashSet(2);
    private Set<QCloudTaskStateListener> mStateListeners = new HashSet(2);
    private TaskManager taskManager = TaskManager.getInstance();

    private static class AtomTask<TResult> implements Runnable, Comparable<Runnable> {
        private static AtomicInteger increment = new AtomicInteger(0);
        private Callable<TResult> callable;
        private c ct;
        private int priority;
        private int taskIdentifier = increment.addAndGet(1);
        private i<TResult> tcs;

        public AtomTask(i<TResult> iVar, c cVar, Callable<TResult> callable, int i4) {
            this.tcs = iVar;
            this.ct = cVar;
            this.callable = callable;
            this.priority = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = this.ct;
            if (cVar != null && cVar.a()) {
                this.tcs.b();
                return;
            }
            try {
                this.tcs.d(this.callable.call());
            } catch (CancellationException unused) {
                this.tcs.b();
            } catch (Exception e4) {
                this.tcs.c(e4);
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(@o0 Runnable runnable) {
            if (!(runnable instanceof AtomTask)) {
                return 0;
            }
            AtomTask atomTask = (AtomTask) runnable;
            int i4 = atomTask.priority - this.priority;
            return i4 != 0 ? i4 : this.taskIdentifier - atomTask.taskIdentifier;
        }
    }

    public interface OnRequestWeightListener {
        int onWeight();
    }

    public QCloudTask(String str, Object obj) {
        this.identifier = str;
        this.tag = obj;
    }

    private static <TResult> h<TResult> callTask(Callable<TResult> callable, Executor executor, c cVar, int i4) {
        i iVar = new i();
        try {
            executor.execute(new AtomTask(iVar, cVar, callable, i4));
        } catch (Exception e4) {
            iVar.c(new ExecutorException(e4));
        }
        return iVar.a();
    }

    private void executeListener(Runnable runnable) {
        Executor executor = this.observerExecutor;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    private synchronized void setState(int i4) {
        this.mState = i4;
    }

    public final QCloudTask<T> addProgressListener(QCloudProgressListener qCloudProgressListener) {
        if (qCloudProgressListener != null) {
            this.mProgressListeners.add(qCloudProgressListener);
        }
        return this;
    }

    public final QCloudTask<T> addProgressListeners(List<QCloudProgressListener> list) {
        if (list != null) {
            this.mProgressListeners.addAll(list);
        }
        return this;
    }

    public final QCloudTask<T> addResultListener(QCloudResultListener<T> qCloudResultListener) {
        if (qCloudResultListener != null) {
            this.mResultListeners.add(qCloudResultListener);
        }
        return this;
    }

    public final QCloudTask<T> addResultListeners(List<QCloudResultListener<T>> list) {
        if (list != null) {
            this.mResultListeners.addAll(list);
        }
        return this;
    }

    public final QCloudTask<T> addStateListener(QCloudTaskStateListener qCloudTaskStateListener) {
        if (qCloudTaskStateListener != null) {
            this.mStateListeners.add(qCloudTaskStateListener);
        }
        return this;
    }

    public final QCloudTask<T> addStateListeners(List<QCloudTaskStateListener> list) {
        if (list != null) {
            this.mStateListeners.addAll(list);
        }
        return this;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        String s4 = ProtectedSandApp.s("妅\u0001");
        String s5 = ProtectedSandApp.s("妆\u0001");
        try {
            COSLogger.dProcess(s5, ProtectedSandApp.s("妇\u0001"), getIdentifier());
            onStateChanged(2);
            return execute();
        } finally {
            COSLogger.dProcess(s5, s4, getIdentifier());
            onStateChanged(3);
            this.taskManager.remove(this);
        }
    }

    public void cancel() {
        COSLogger.dProcess(ProtectedSandApp.s("妆\u0001"), ProtectedSandApp.s("妈\u0001"), this);
        e eVar = this.mCancellationTokenSource;
        if (eVar != null) {
            eVar.c();
        }
    }

    public final h<T> cast() {
        return this.mTask;
    }

    protected abstract T execute() throws QCloudClientException, QCloudServiceException;

    public final T executeNow() throws QCloudClientException, QCloudServiceException {
        executeNowSilently();
        Exception exception = getException();
        if (exception == null) {
            return getResult();
        }
        if (exception instanceof QCloudClientException) {
            throw ((QCloudClientException) exception);
        }
        if (exception instanceof QCloudServiceException) {
            throw ((QCloudServiceException) exception);
        }
        throw new QCloudClientException(exception);
    }

    public final void executeNowSilently() {
        this.taskManager.add(this);
        onStateChanged(1);
        this.mTask = h.c(this);
    }

    public final List<QCloudProgressListener> getAllProgressListeners() {
        return new ArrayList(this.mProgressListeners);
    }

    public final List<QCloudResultListener<T>> getAllResultListeners() {
        return new ArrayList(this.mResultListeners);
    }

    public final List<QCloudTaskStateListener> getAllStateListeners() {
        return new ArrayList(this.mStateListeners);
    }

    public int getDownloadMaxThreadCount() {
        return this.downloadMaxThreadCount;
    }

    public Exception getException() {
        if (this.mTask.J()) {
            return this.mTask.E();
        }
        if (this.mTask.H()) {
            return new QCloudClientException(ProtectedSandApp.s("妉\u0001"));
        }
        return null;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public T getResult() {
        return this.mTask.F();
    }

    public final synchronized int getState() {
        return this.mState;
    }

    public final Object getTag() {
        return this.tag;
    }

    public int getUploadMaxThreadCount() {
        return this.uploadMaxThreadCount;
    }

    public int getWeight() {
        OnRequestWeightListener onRequestWeightListener = this.onRequestWeightListener;
        if (onRequestWeightListener != null) {
            return onRequestWeightListener.onWeight();
        }
        return 0;
    }

    public final boolean isCanceled() {
        e eVar = this.mCancellationTokenSource;
        return eVar != null && eVar.h();
    }

    public final boolean isCompleted() {
        return getState() == 3;
    }

    public boolean isDomainSwitch() {
        return this.domainSwitch;
    }

    public boolean isEnableTraffic() {
        return this.enableTraffic;
    }

    public final boolean isExecuting() {
        return getState() == 2;
    }

    public final QCloudTask<T> observeOn(Executor executor) {
        this.observerExecutor = executor;
        return this;
    }

    protected void onFailure() {
        Throwable exception = getException();
        if (exception == null || this.mResultListeners.size() <= 0) {
            return;
        }
        Iterator it = new ArrayList(this.mResultListeners).iterator();
        while (it.hasNext()) {
            QCloudResultListener qCloudResultListener = (QCloudResultListener) it.next();
            if (exception instanceof QCloudClientException) {
                qCloudResultListener.onFailure((QCloudClientException) exception, null);
            } else if (exception instanceof QCloudServiceException) {
                qCloudResultListener.onFailure(null, (QCloudServiceException) exception);
            } else {
                qCloudResultListener.onFailure(new QCloudClientException(exception.getCause() == null ? exception : exception.getCause()), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onProgress(final long j4, final long j5) {
        if (this.mProgressListeners.size() > 0) {
            executeListener(new Runnable() { // from class: com.tencent.qcloud.core.task.QCloudTask.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = new ArrayList(QCloudTask.this.mProgressListeners).iterator();
                    while (it.hasNext()) {
                        ((QCloudProgressListener) it.next()).onProgress(j4, j5);
                    }
                }
            });
        }
    }

    protected void onStateChanged(int i4) {
        setState(i4);
        if (this.mStateListeners.size() > 0) {
            executeListener(new Runnable() { // from class: com.tencent.qcloud.core.task.QCloudTask.3
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = new ArrayList(QCloudTask.this.mStateListeners).iterator();
                    while (it.hasNext()) {
                        ((QCloudTaskStateListener) it.next()).onStateChanged(QCloudTask.this.identifier, QCloudTask.this.mState);
                    }
                }
            });
        }
    }

    protected void onSuccess() {
        if (this.mResultListeners.size() > 0) {
            Iterator it = new ArrayList(this.mResultListeners).iterator();
            while (it.hasNext()) {
                ((QCloudResultListener) it.next()).onSuccess(getResult());
            }
        }
    }

    public final void removeAllListeners() {
        this.mResultListeners.clear();
        this.mProgressListeners.clear();
    }

    public final QCloudTask<T> removeProgressListener(QCloudProgressListener qCloudProgressListener) {
        if (qCloudProgressListener != null) {
            this.mProgressListeners.remove(qCloudProgressListener);
        }
        return this;
    }

    public final QCloudTask<T> removeResultListener(QCloudResultListener<T> qCloudResultListener) {
        if (qCloudResultListener != null) {
            this.mResultListeners.remove(qCloudResultListener);
        }
        return this;
    }

    public final QCloudTask<T> removeStateListener(QCloudTaskStateListener qCloudTaskStateListener) {
        if (qCloudTaskStateListener != null) {
            this.mStateListeners.remove(qCloudTaskStateListener);
        }
        return this;
    }

    protected QCloudTask<T> scheduleOn(Executor executor, e eVar) {
        return scheduleOn(executor, eVar, 2);
    }

    public void setDomainSwitch(boolean z4) {
        this.domainSwitch = z4;
    }

    public void setDownloadMaxThreadCount(int i4) {
        this.downloadMaxThreadCount = i4;
    }

    public void setOnRequestWeightListener(OnRequestWeightListener onRequestWeightListener) {
        this.onRequestWeightListener = onRequestWeightListener;
    }

    public void setTransferThreadControl(boolean z4) {
        this.enableTraffic = z4;
    }

    public void setUploadMaxThreadCount(int i4) {
        this.uploadMaxThreadCount = i4;
    }

    protected QCloudTask<T> scheduleOn(Executor executor, e eVar, int i4) {
        this.taskManager.add(this);
        onStateChanged(1);
        this.workerExecutor = executor;
        this.mCancellationTokenSource = eVar;
        if (i4 <= 0) {
            i4 = 2;
        }
        h<T> callTask = callTask(this, executor, eVar != null ? eVar.g() : null, i4);
        this.mTask = callTask;
        callTask.u(new g<T, h<Void>>() { // from class: com.tencent.qcloud.core.task.QCloudTask.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bolts.g
            public h<Void> then(h<T> hVar) throws Exception {
                if (hVar.J() || hVar.H()) {
                    if (QCloudTask.this.observerExecutor != null) {
                        return h.f(new Callable<Void>() { // from class: com.tencent.qcloud.core.task.QCloudTask.1.1
                            @Override // java.util.concurrent.Callable
                            public Void call() throws Exception {
                                try {
                                    QCloudTask.this.onFailure();
                                    return null;
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                    throw new Error(e4);
                                }
                            }
                        }, QCloudTask.this.observerExecutor, null);
                    }
                    try {
                        QCloudTask.this.onFailure();
                        return null;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        throw new Error(e4);
                    }
                }
                if (QCloudTask.this.observerExecutor != null) {
                    return h.f(new Callable<Void>() { // from class: com.tencent.qcloud.core.task.QCloudTask.1.2
                        @Override // java.util.concurrent.Callable
                        public Void call() throws Exception {
                            try {
                                QCloudTask.this.onSuccess();
                                return null;
                            } catch (Exception e5) {
                                e5.printStackTrace();
                                throw new Error(e5);
                            }
                        }
                    }, QCloudTask.this.observerExecutor, null);
                }
                try {
                    QCloudTask.this.onSuccess();
                    return null;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    throw new Error(e5);
                }
            }
        });
        return this;
    }

    public void cancel(boolean z4) {
        cancel();
        if (z4) {
            this.taskManager.remove(this);
        }
    }
}
