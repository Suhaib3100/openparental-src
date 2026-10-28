package com.google.android.gms.tasks;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @q0 Throwable th) {
        super(str, th);
    }

    @o0
    public static IllegalStateException of(@o0 Task<?> task) {
        if (!task.isComplete()) {
            return new IllegalStateException(ProtectedSandApp.s("ᇚ"));
        }
        Exception exception = task.getException();
        return new DuplicateTaskCompletionException(ProtectedSandApp.s("ᇟ").concat(exception != null ? ProtectedSandApp.s("ᇛ") : task.isSuccessful() ? ProtectedSandApp.s("ᇜ").concat(String.valueOf(task.getResult())) : task.isCanceled() ? ProtectedSandApp.s("ᇝ") : ProtectedSandApp.s("ᇞ")), exception);
    }
}
