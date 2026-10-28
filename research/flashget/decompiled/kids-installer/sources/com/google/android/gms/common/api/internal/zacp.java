package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public final class zacp<R extends Result> extends PendingResult<R> {
    private final Status zaa;

    public zacp(Status status) {
        Preconditions.checkNotNull(status, ProtectedSandApp.s("∃"));
        Preconditions.checkArgument(!status.isSuccess(), ProtectedSandApp.s("∄"));
        this.zaa = status;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@o0 PendingResult.StatusListener statusListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("∅"));
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @o0
    public final R await() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("∆"));
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("∈"));
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("∉"));
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@o0 ResultCallback<? super R> resultCallback) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("∊"));
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @ShowFirstParty
    @o0
    public final <S extends Result> TransformedResult<S> then(@o0 ResultTransform<? super R, ? extends S> resultTransform) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("∌"));
    }

    @o0
    final Status zaa() {
        return this.zaa;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @o0
    public final R await(long j5, @o0 TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("∇"));
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@o0 ResultCallback<? super R> resultCallback, long j5, @o0 TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("∋"));
    }
}
