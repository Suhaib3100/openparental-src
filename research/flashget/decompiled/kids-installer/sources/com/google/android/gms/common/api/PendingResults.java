package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class PendingResults {
    @KeepForSdk
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
    public static <R extends Result> PendingResult<R> immediateFailedResult(@o0 R r5, @o0 GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r5, ProtectedSandApp.s("્"));
        Preconditions.checkArgument(!r5.getStatus().isSuccess(), ProtectedSandApp.s("\u0ace"));
        zag zagVar = new zag(googleApiClient, r5);
        zagVar.setResult(r5);
        return zagVar;
    }

    @o0
    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@o0 R r5) {
        Preconditions.checkNotNull(r5, ProtectedSandApp.s("\u0acf"));
        zah zahVar = new zah(null);
        zahVar.setResult(r5);
        return new OptionalPendingResultImpl(zahVar);
    }

    @o0
    public static <R extends Result> PendingResult<R> canceledPendingResult(@o0 R r5) {
        Preconditions.checkNotNull(r5, ProtectedSandApp.s("ો"));
        Preconditions.checkArgument(r5.getStatus().getStatusCode() == 16, ProtectedSandApp.s("ૌ"));
        zaf zafVar = new zaf(r5);
        zafVar.cancel();
        return zafVar;
    }

    @o0
    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@o0 R r5, @o0 GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r5, ProtectedSandApp.s("ૐ"));
        zah zahVar = new zah(googleApiClient);
        zahVar.setResult(r5);
        return new OptionalPendingResultImpl(zahVar);
    }

    @o0
    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(@o0 Status status) {
        Preconditions.checkNotNull(status, ProtectedSandApp.s("\u0ad1"));
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    @o0
    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(@o0 Status status, @o0 GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, ProtectedSandApp.s("\u0ad2"));
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
