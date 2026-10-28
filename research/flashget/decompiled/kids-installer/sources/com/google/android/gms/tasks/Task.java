package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
public abstract class Task<TResult> {
    @o0
    public Task<TResult> addOnCanceledListener(@o0 Activity activity, @o0 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇠ"));
    }

    @o0
    public Task<TResult> addOnCompleteListener(@o0 Activity activity, @o0 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇣ"));
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
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇦ"));
    }

    @o0
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@o0 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇨ"));
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
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇪ"));
    }

    @o0
    public Task<TResult> addOnCanceledListener(@o0 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇡ"));
    }

    @o0
    public Task<TResult> addOnCompleteListener(@o0 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇤ"));
    }

    @o0
    public <TContinuationResult> Task<TContinuationResult> continueWith(@o0 Executor executor, @o0 Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇧ"));
    }

    @o0
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@o0 Executor executor, @o0 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇩ"));
    }

    @o0
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(@o0 Executor executor, @o0 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇫ"));
    }

    @o0
    public Task<TResult> addOnCanceledListener(@o0 Executor executor, @o0 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇢ"));
    }

    @o0
    public Task<TResult> addOnCompleteListener(@o0 Executor executor, @o0 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᇥ"));
    }
}
