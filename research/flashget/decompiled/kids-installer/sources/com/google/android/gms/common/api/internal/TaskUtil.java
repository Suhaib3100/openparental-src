package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(@o0 Status status, @o0 TaskCompletionSource<Void> taskCompletionSource) {
        setResultOrApiException(status, null, taskCompletionSource);
    }

    @o0
    @KeepForSdk
    @Deprecated
    public static Task<Void> toVoidTaskThatFailsOnFalse(@o0 Task<Boolean> task) {
        return task.continueWith(new zacx());
    }

    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@o0 Status status, @q0 ResultT resultt, @o0 TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.isSuccess() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(new ApiException(status));
    }

    @KeepForSdk
    public static <TResult> void setResultOrApiException(@o0 Status status, @q0 TResult tresult, @o0 TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(new ApiException(status));
        }
    }
}
