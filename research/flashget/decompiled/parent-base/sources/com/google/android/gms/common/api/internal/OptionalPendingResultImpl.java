package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {
    private final BasePendingResult zaa;

    public OptionalPendingResultImpl(@o0 PendingResult pendingResult) {
        this.zaa = (BasePendingResult) pendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@o0 PendingResult.StatusListener statusListener) {
        this.zaa.addStatusListener(statusListener);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @o0
    public final R await() {
        return (R) this.zaa.await();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        this.zaa.cancel();
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    @o0
    public final R get() {
        if (this.zaa.isReady()) {
            return (R) this.zaa.await(0L, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException(ProtectedSandApp.s("쨇"));
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        return this.zaa.isCanceled();
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    public final boolean isDone() {
        return this.zaa.isReady();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@o0 ResultCallback<? super R> resultCallback) {
        this.zaa.setResultCallback(resultCallback);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @o0
    public final <S extends Result> TransformedResult<S> then(@o0 ResultTransform<? super R, ? extends S> resultTransform) {
        return this.zaa.then(resultTransform);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @o0
    public final R await(long j4, @o0 TimeUnit timeUnit) {
        return (R) this.zaa.await(j4, timeUnit);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@o0 ResultCallback<? super R> resultCallback, long j4, @o0 TimeUnit timeUnit) {
        this.zaa.setResultCallback(resultCallback, j4, timeUnit);
    }
}
