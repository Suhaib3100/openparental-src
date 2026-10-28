package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes5.dex */
public abstract class Task<TResult> {
    @o0
    public Task<TResult> addOnCanceledListener(@o0 Activity activity, @o0 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue515"));
    }

    @o0
    public Task<TResult> addOnCompleteListener(@o0 Activity activity, @o0 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue517"));
    }

    @o0
    public abstract Task<TResult> addOnFailureListener(@o0 Activity activity, @o0 OnFailureListener onFailureListener);

    @o0
    public abstract Task<TResult> addOnFailureListener(@o0 OnFailureListener onFailureListener);

    @o0
    public abstract Task<TResult> addOnFailureListener(@o0 Executor executor, @o0 OnFailureListener onFailureListener);

    @o0
    public abstract Task<TResult> addOnSuccessListener(@o0 Activity activity, @o0 OnSuccessListener<? super TResult> onSuccessListener);

    @o0
    public abstract Task<TResult> addOnSuccessListener(@o0 OnSuccessListener<? super TResult> onSuccessListener);

    @o0
    public abstract Task<TResult> addOnSuccessListener(@o0 Executor executor, @o0 OnSuccessListener<? super TResult> onSuccessListener);

    @o0
    public <TContinuationResult> Task<TContinuationResult> continueWith(@o0 Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue518"));
    }

    @o0
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@o0 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue519"));
    }

    @q0
    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract <X extends Throwable> TResult getResult(@o0 Class<X> cls) throws Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    @o0
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(@o0 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue51a"));
    }

    @o0
    public Task<TResult> addOnCanceledListener(@o0 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue515"));
    }

    @o0
    public Task<TResult> addOnCompleteListener(@o0 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue517"));
    }

    @o0
    public <TContinuationResult> Task<TContinuationResult> continueWith(@o0 Executor executor, @o0 Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue518"));
    }

    @o0
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@o0 Executor executor, @o0 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue519"));
    }

    @o0
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(@o0 Executor executor, @o0 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue51a"));
    }

    @o0
    public Task<TResult> addOnCanceledListener(@o0 Executor executor, @o0 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue516"));
    }

    @o0
    public Task<TResult> addOnCompleteListener(@o0 Executor executor, @o0 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\ue517"));
    }
}
