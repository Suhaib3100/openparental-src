package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@KeepName
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zaa = new zaq();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private zas mResultGuardian;

    @o0
    protected final CallbackHandler<R> zab;

    @o0
    protected final WeakReference<GoogleApiClient> zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList<PendingResult.StatusListener> zag;

    @q0
    private ResultCallback<? super R> zah;
    private final AtomicReference<zadb> zai;

    @q0
    private R zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;

    @q0
    private ICancelToken zao;
    private volatile zada<R> zap;
    private boolean zaq;

    @Deprecated
    BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new CallbackHandler<>(Looper.getMainLooper());
        this.zac = new WeakReference<>(null);
    }

    private final R zaa() {
        R r5;
        synchronized (this.zae) {
            Preconditions.checkState(!this.zal, ProtectedSandApp.s("ⅴ"));
            Preconditions.checkState(isReady(), ProtectedSandApp.s("ⅵ"));
            r5 = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        zadb andSet = this.zai.getAndSet(null);
        if (andSet != null) {
            andSet.zaa.zab.remove(this);
        }
        return (R) Preconditions.checkNotNull(r5);
    }

    private final void zab(R r5) {
        this.zaj = r5;
        this.zak = r5.getStatus();
        zar zarVar = null;
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            ResultCallback<? super R> resultCallback = this.zah;
            if (resultCallback != null) {
                this.zab.removeMessages(2);
                this.zab.zaa(resultCallback, zaa());
            } else if (this.zaj instanceof Releasable) {
                this.mResultGuardian = new zas(this, zarVar);
            }
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.zag;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.get(i5).onComplete(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(@q0 Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
                ProtectedSandApp.s("ⅶ").concat(String.valueOf(result));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@o0 PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, ProtectedSandApp.s("ⅷ"));
        synchronized (this.zae) {
            if (isReady()) {
                statusListener.onComplete(this.zak);
            } else {
                this.zag.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @o0
    public final R await() {
        Preconditions.checkNotMainThread(ProtectedSandApp.s("ⅸ"));
        Preconditions.checkState(!this.zal, ProtectedSandApp.s("ⅹ"));
        Preconditions.checkState(this.zap == null, ProtectedSandApp.s("ⅺ"));
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), ProtectedSandApp.s("ⅻ"));
        return zaa();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                ICancelToken iCancelToken = this.zao;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(Status.RESULT_CANCELED));
            }
        }
    }

    @o0
    @KeepForSdk
    protected abstract R createFailedResult(@o0 Status status);

    @KeepForSdk
    @Deprecated
    public final void forceFailureUnlessReady(@o0 Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        boolean z5;
        synchronized (this.zae) {
            z5 = this.zam;
        }
        return z5;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    @KeepForSdk
    protected final void setCancelToken(@o0 ICancelToken iCancelToken) {
        synchronized (this.zae) {
            this.zao = iCancelToken;
        }
    }

    @KeepForSdk
    public final void setResult(@o0 R r5) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r5);
                return;
            }
            isReady();
            Preconditions.checkState(!isReady(), ProtectedSandApp.s("ↀ"));
            Preconditions.checkState(!this.zal, ProtectedSandApp.s("ↁ"));
            zab(r5);
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@q0 ResultCallback<? super R> resultCallback) {
        synchronized (this.zae) {
            if (resultCallback == null) {
                this.zah = null;
                return;
            }
            boolean z5 = true;
            Preconditions.checkState(!this.zal, ProtectedSandApp.s("ↂ"));
            if (this.zap != null) {
                z5 = false;
            }
            Preconditions.checkState(z5, ProtectedSandApp.s("Ↄ"));
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.zaa(resultCallback, zaa());
            } else {
                this.zah = resultCallback;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @o0
    public final <S extends Result> TransformedResult<S> then(@o0 ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        Preconditions.checkState(!this.zal, ProtectedSandApp.s("ↆ"));
        synchronized (this.zae) {
            Preconditions.checkState(this.zap == null, ProtectedSandApp.s("ↇ"));
            Preconditions.checkState(this.zah == null, ProtectedSandApp.s("ↈ"));
            Preconditions.checkState(!this.zam, ProtectedSandApp.s("↉"));
            this.zaq = true;
            this.zap = new zada<>(this.zac);
            then = this.zap.then(resultTransform);
            if (isReady()) {
                this.zab.zaa(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return then;
    }

    public final void zak() {
        boolean z5 = true;
        if (!this.zaq && !zaa.get().booleanValue()) {
            z5 = false;
        }
        this.zaq = z5;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            if (this.zac.get() == null || !this.zaq) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zan(@q0 zadb zadbVar) {
        this.zai.set(zadbVar);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zaq {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@o0 Message message) {
            int i5 = message.what;
            if (i5 == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                    return;
                } catch (RuntimeException e6) {
                    BasePendingResult.zal(result);
                    throw e6;
                }
            }
            if (i5 == 2) {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                return;
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append(ProtectedSandApp.s("↝"));
            sb.append(i5);
            Log.wtf(ProtectedSandApp.s("↞"), sb.toString(), new Exception());
        }

        public final void zaa(@o0 ResultCallback<? super R> resultCallback, @o0 R r5) {
            int i5 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.checkNotNull(resultCallback), r5)));
        }

        public CallbackHandler(@o0 Looper looper) {
            super(looper);
        }
    }

    @KeepForSdk
    @Deprecated
    protected BasePendingResult(@o0 Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new CallbackHandler<>(looper);
        this.zac = new WeakReference<>(null);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @o0
    public final R await(long j5, @o0 TimeUnit timeUnit) {
        if (j5 > 0) {
            Preconditions.checkNotMainThread(ProtectedSandApp.s("ⅼ"));
        }
        Preconditions.checkState(!this.zal, ProtectedSandApp.s("ⅽ"));
        Preconditions.checkState(this.zap == null, ProtectedSandApp.s("ⅾ"));
        try {
            if (!this.zaf.await(j5, timeUnit)) {
                forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), ProtectedSandApp.s("ⅿ"));
        return zaa();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@o0 ResultCallback<? super R> resultCallback, long j5, @o0 TimeUnit timeUnit) {
        synchronized (this.zae) {
            if (resultCallback == null) {
                this.zah = null;
                return;
            }
            boolean z5 = true;
            Preconditions.checkState(!this.zal, ProtectedSandApp.s("ↄ"));
            if (this.zap != null) {
                z5 = false;
            }
            Preconditions.checkState(z5, ProtectedSandApp.s("ↅ"));
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.zaa(resultCallback, zaa());
            } else {
                this.zah = resultCallback;
                CallbackHandler<R> callbackHandler = this.zab;
                callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j5));
            }
        }
    }

    @KeepForSdk
    protected BasePendingResult(@q0 GoogleApiClient googleApiClient) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference<>(googleApiClient);
    }

    @VisibleForTesting
    @KeepForSdk
    protected BasePendingResult(@o0 CallbackHandler<R> callbackHandler) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, ProtectedSandApp.s("ⅳ"));
        this.zac = new WeakReference<>(null);
    }
}
