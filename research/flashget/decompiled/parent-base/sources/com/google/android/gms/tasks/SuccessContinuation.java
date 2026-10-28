package com.google.android.gms.tasks;

import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes5.dex */
public interface SuccessContinuation<TResult, TContinuationResult> {
    @o0
    Task<TContinuationResult> then(TResult tresult) throws Exception;
}
