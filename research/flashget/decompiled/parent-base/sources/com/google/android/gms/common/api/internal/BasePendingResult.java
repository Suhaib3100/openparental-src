package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.a;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
@KeepName
/* loaded from: classes5.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal zaa = new zaq();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private zas resultGuardian;

    @o0
    protected final CallbackHandler zab;

    @o0
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;

    @q0
    private ResultCallback zah;
    private final AtomicReference zai;

    @q0
    private Result zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;

    @q0
    private ICancelToken zao;
    private volatile zada zap;
    private boolean zaq;

    @Deprecated
    BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new CallbackHandler(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    private final Result zaa() {
        Result result;
        synchronized (this.zae) {
            Preconditions.checkState(!this.zal, ProtectedSandApp.s("졠"));
            Preconditions.checkState(isReady(), ProtectedSandApp.s("졡"));
            result = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        zadb zadbVar = (zadb) this.zai.getAndSet(null);
        if (zadbVar != null) {
            zadbVar.zaa.zab.remove(this);
        }
        return (Result) Preconditions.checkNotNull(result);
    }

    private final void zab(Result result) {
        this.zaj = result;
        this.zak = result.getStatus();
        zar zarVar = null;
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            ResultCallback resultCallback = this.zah;
            if (resultCallback != null) {
                this.zab.removeMessages(2);
                this.zab.zaa(resultCallback, zaa());
            } else if (this.zaj instanceof Releasable) {
                this.resultGuardian = new zas(this, zarVar);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((PendingResult.StatusListener) arrayList.get(i4)).onComplete(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(@q0 Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
                ProtectedSandApp.s("졢").concat(String.valueOf(result));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@o0 PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, ProtectedSandApp.s("졣"));
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    statusListener.onComplete(this.zak);
                } else {
                    this.zag.add(statusListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @ResultIgnorabilityUnspecified
    @o0
    public final R await() {
        Preconditions.checkNotMainThread(ProtectedSandApp.s("졤"));
        Preconditions.checkState(!this.zal, ProtectedSandApp.s("졥"));
        Preconditions.checkState(this.zap == null, ProtectedSandApp.s("졦"));
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), ProtectedSandApp.s("졡"));
        return (R) zaa();
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
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        boolean z4;
        synchronized (this.zae) {
            z4 = this.zam;
        }
        return z4;
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
    public final void setResult(@o0 R r4) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r4);
                    return;
                }
                isReady();
                Preconditions.checkState(!isReady(), ProtectedSandApp.s("졨"));
                Preconditions.checkState(!this.zal, ProtectedSandApp.s("졥"));
                zab(r4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@q0 ResultCallback<? super R> resultCallback) {
        synchronized (this.zae) {
            try {
                if (resultCallback == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                Preconditions.checkState(!this.zal, ProtectedSandApp.s("졠"));
                if (this.zap != null) {
                    z4 = false;
                }
                Preconditions.checkState(z4, ProtectedSandApp.s("졩"));
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.zaa(resultCallback, zaa());
                } else {
                    this.zah = resultCallback;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @o0
    public final <S extends Result> TransformedResult<S> then(@o0 ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        Preconditions.checkState(!this.zal, ProtectedSandApp.s("졠"));
        synchronized (this.zae) {
            try {
                Preconditions.checkState(this.zap == null, ProtectedSandApp.s("졪"));
                Preconditions.checkState(this.zah == null, ProtectedSandApp.s("졫"));
                Preconditions.checkState(!this.zam, ProtectedSandApp.s("졬"));
                this.zaq = true;
                this.zap = new zada(this.zac);
                then = this.zap.then(resultTransform);
                if (isReady()) {
                    this.zab.zaa(this.zap, zaa());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return then;
    }

    public final void zak() {
        boolean z4 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z4 = false;
        }
        this.zaq = z4;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((GoogleApiClient) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zan(@q0 zadb zadbVar) {
        this.zai.set(zadbVar);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @m1
    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zau {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@o0 Message message) {
            int i4 = message.what;
            if (i4 != 1) {
                if (i4 == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                    return;
                }
                Log.wtf(ProtectedSandApp.s("짞"), a.a(ProtectedSandApp.s("짝"), i4), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.onResult(result);
            } catch (RuntimeException e4) {
                BasePendingResult.zal(result);
                throw e4;
            }
        }

        public final void zaa(@o0 ResultCallback resultCallback, @o0 Result result) {
            int i4 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.checkNotNull(resultCallback), result)));
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
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new CallbackHandler(looper);
        this.zac = new WeakReference(null);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @ResultIgnorabilityUnspecified
    @o0
    public final R await(long j4, @o0 TimeUnit timeUnit) {
        if (j4 > 0) {
            Preconditions.checkNotMainThread(ProtectedSandApp.s("졧"));
        }
        Preconditions.checkState(!this.zal, ProtectedSandApp.s("졠"));
        Preconditions.checkState(this.zap == null, ProtectedSandApp.s("졦"));
        try {
            if (!this.zaf.await(j4, timeUnit)) {
                forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), ProtectedSandApp.s("졡"));
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@o0 ResultCallback<? super R> resultCallback, long j4, @o0 TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (resultCallback == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                Preconditions.checkState(!this.zal, ProtectedSandApp.s("졠"));
                if (this.zap != null) {
                    z4 = false;
                }
                Preconditions.checkState(z4, ProtectedSandApp.s("졩"));
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.zaa(resultCallback, zaa());
                } else {
                    this.zah = resultCallback;
                    CallbackHandler callbackHandler = this.zab;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    protected BasePendingResult(@q0 GoogleApiClient googleApiClient) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new CallbackHandler(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference(googleApiClient);
    }

    @KeepForSdk
    @m1
    protected BasePendingResult(@o0 CallbackHandler<R> callbackHandler) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, ProtectedSandApp.s("졟"));
        this.zac = new WeakReference(null);
    }
}
