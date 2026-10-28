package com.google.android.gms.common.util;

import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class CrashUtils {
    private static final String[] zza = {ProtectedSandApp.s("쯖"), ProtectedSandApp.s("쯗"), ProtectedSandApp.s("쯘"), ProtectedSandApp.s("쯔"), ProtectedSandApp.s("쯕")};

    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(@o0 Context context, @o0 Throwable th) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
