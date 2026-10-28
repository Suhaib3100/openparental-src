package com.google.android.gms.common.api;

import androidx.annotation.o0;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R> {
    @o0
    public abstract R get();

    public abstract boolean isDone();
}
