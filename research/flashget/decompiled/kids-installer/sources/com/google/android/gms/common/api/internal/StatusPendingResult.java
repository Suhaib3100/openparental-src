package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes3.dex */
public class StatusPendingResult extends BasePendingResult<Status> {
    @Deprecated
    public StatusPendingResult(@o0 Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @o0
    protected final /* bridge */ /* synthetic */ Status createFailedResult(@o0 Status status) {
        return status;
    }

    @KeepForSdk
    public StatusPendingResult(@o0 GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }
}
