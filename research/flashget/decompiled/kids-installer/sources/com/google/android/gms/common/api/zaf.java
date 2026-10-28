package com.google.android.gms.common.api;

import android.os.Looper;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zaf<R extends Result> extends BasePendingResult<R> {
    private final R zae;

    public zaf(R r5) {
        super(Looper.getMainLooper());
        this.zae = r5;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R createFailedResult(Status status) {
        if (status.getStatusCode() == this.zae.getStatus().getStatusCode()) {
            return this.zae;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("∪"));
    }
}
