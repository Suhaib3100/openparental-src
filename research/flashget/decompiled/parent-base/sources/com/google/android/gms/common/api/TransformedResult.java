package com.google.android.gms.common.api;

import androidx.annotation.o0;
import com.google.android.gms.common.api.Result;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public abstract class TransformedResult<R extends Result> {
    public abstract void andFinally(@o0 ResultCallbacks<? super R> resultCallbacks);

    @ResultIgnorabilityUnspecified
    @o0
    public abstract <S extends Result> TransformedResult<S> then(@o0 ResultTransform<? super R, ? extends S> resultTransform);
}
