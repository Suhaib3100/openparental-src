package com.google.firebase;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@o0 String str) {
        super(str);
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("ኻ"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@o0 String str, @o0 Throwable th) {
        super(str, th);
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("ኼ"));
    }
}
