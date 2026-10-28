package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.m0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader.java */
/* loaded from: classes3.dex */
public abstract class a<D> extends c<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a<D>.RunnableC0507a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a<D>.RunnableC0507a mTask;
    long mUpdateThrottle;

    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    final class RunnableC0507a extends d<Void, Void, D> implements Runnable {

        /* renamed from: r, reason: collision with root package name */
        private final CountDownLatch f30513r = new CountDownLatch(1);

        /* renamed from: s, reason: collision with root package name */
        boolean f30514s;

        RunnableC0507a() {
        }

        @Override // androidx.loader.content.d
        protected void m(D d5) {
            try {
                a.this.dispatchOnCancelled(this, d5);
            } finally {
                this.f30513r.countDown();
            }
        }

        @Override // androidx.loader.content.d
        protected void n(D d5) {
            try {
                a.this.dispatchOnLoadComplete(this, d5);
            } finally {
                this.f30513r.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30514s = false;
            a.this.executePendingTask();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.loader.content.d
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.onLoadInBackground();
            } catch (OperationCanceledException e4) {
                if (this.f30539e.get()) {
                    return null;
                }
                throw e4;
            }
        }

        public void v() {
            try {
                this.f30513r.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@o0 Context context) {
        this(context, d.f30531m);
    }

    public void cancelLoadInBackground() {
    }

    void dispatchOnCancelled(a<D>.RunnableC0507a runnableC0507a, D d5) {
        onCanceled(d5);
        if (this.mCancellingTask == runnableC0507a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(a<D>.RunnableC0507a runnableC0507a, D d5) {
        if (this.mTask != runnableC0507a) {
            dispatchOnCancelled(runnableC0507a, d5);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d5);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d5);
    }

    @Override // androidx.loader.content.c
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f30514s);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f30514s);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            m0.c(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            m0.b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f30514s) {
            this.mTask.f30514s = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.e(this.mExecutor, null);
        } else {
            this.mTask.f30514s = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    @q0
    public abstract D loadInBackground();

    @Override // androidx.loader.content.c
    protected boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f30514s) {
                this.mTask.f30514s = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f30514s) {
            this.mTask.f30514s = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean a5 = this.mTask.a(false);
        if (a5) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return a5;
    }

    public void onCanceled(@q0 D d5) {
    }

    @Override // androidx.loader.content.c
    protected void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0507a();
        executePendingTask();
    }

    @q0
    protected D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j4) {
        this.mUpdateThrottle = j4;
        if (j4 != 0) {
            this.mHandler = new Handler();
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void waitForLoader() {
        a<D>.RunnableC0507a runnableC0507a = this.mTask;
        if (runnableC0507a != null) {
            runnableC0507a.v();
        }
    }

    private a(@o0 Context context, @o0 Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }
}
