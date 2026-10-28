package com.google.android.gms.tasks;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes5.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @q0 Throwable th) {
        super(str, th);
    }

    @o0
    public static IllegalStateException of(@o0 Task<?> task) {
        if (!task.isComplete()) {
            return new IllegalStateException(ProtectedSandApp.s("\ue50f"));
        }
        Exception exception = task.getException();
        return new DuplicateTaskCompletionException(ProtectedSandApp.s("\ue514").concat(exception != null ? ProtectedSandApp.s("\ue510") : task.isSuccessful() ? ProtectedSandApp.s("\ue511").concat(String.valueOf(task.getResult())) : task.isCanceled() ? ProtectedSandApp.s("\ue512") : ProtectedSandApp.s("\ue513")), exception);
    }
}
