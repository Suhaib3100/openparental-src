package com.google.android.gms.common.api;

import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zacp;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public abstract class ResultTransform<R extends Result, S extends Result> {
    @o0
    public final PendingResult<S> createFailedResult(@o0 Status status) {
        return new zacp(status);
    }

    @o0
    public Status onFailure(@o0 Status status) {
        return status;
    }

    @n1
    @q0
    public abstract PendingResult<S> onSuccess(@o0 R r4);
}
