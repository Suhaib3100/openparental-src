package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class PendingResults {
    private PendingResults() {
    }

    @o0
    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    @o0
    @KeepForSdk
    public static <R extends Result> PendingResult<R> immediateFailedResult(@o0 R r4, @o0 GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r4, ProtectedSandApp.s("짔"));
        Preconditions.checkArgument(!r4.getStatus().isSuccess(), ProtectedSandApp.s("짖"));
        zag zagVar = new zag(googleApiClient, r4);
        zagVar.setResult(r4);
        return zagVar;
    }

    @o0
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@o0 R r4) {
        Preconditions.checkNotNull(r4, ProtectedSandApp.s("짔"));
        zah zahVar = new zah(null);
        zahVar.setResult(r4);
        return new OptionalPendingResultImpl(zahVar);
    }

    @o0
    public static <R extends Result> PendingResult<R> canceledPendingResult(@o0 R r4) {
        Preconditions.checkNotNull(r4, ProtectedSandApp.s("짔"));
        Preconditions.checkArgument(r4.getStatus().getStatusCode() == 16, ProtectedSandApp.s("징"));
        zaf zafVar = new zaf(r4);
        zafVar.cancel();
        return zafVar;
    }

    @o0
    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@o0 R r4, @o0 GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r4, ProtectedSandApp.s("짔"));
        zah zahVar = new zah(googleApiClient);
        zahVar.setResult(r4);
        return new OptionalPendingResultImpl(zahVar);
    }

    @o0
    public static PendingResult<Status> immediatePendingResult(@o0 Status status) {
        Preconditions.checkNotNull(status, ProtectedSandApp.s("짔"));
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    @o0
    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(@o0 Status status, @o0 GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, ProtectedSandApp.s("짔"));
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
