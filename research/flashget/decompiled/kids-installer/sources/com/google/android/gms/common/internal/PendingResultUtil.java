package com.google.android.gms.common.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class PendingResultUtil {
    private static final zas zaa = new zao();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @q0
        @KeepForSdk
        T convert(@o0 R r5);
    }

    @o0
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(@o0 PendingResult<R> pendingResult, @o0 T t5) {
        return toTask(pendingResult, new zaq(t5));
    }

    @o0
    @KeepForSdk
    public static <R extends Result, T> Task<T> toTask(@o0 PendingResult<R> pendingResult, @o0 ResultConverter<R, T> resultConverter) {
        zas zasVar = zaa;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.addStatusListener(new zap(pendingResult, taskCompletionSource, resultConverter, zasVar));
        return taskCompletionSource.getTask();
    }

    @o0
    @KeepForSdk
    public static <R extends Result> Task<Void> toVoidTask(@o0 PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zar());
    }
}
