package com.google.android.gms.common.util;

import android.content.Context;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class CrashUtils {
    private static final String[] zza = {ProtectedSandApp.s("ీ"), ProtectedSandApp.s("ు"), ProtectedSandApp.s("ూ"), ProtectedSandApp.s("ా"), ProtectedSandApp.s("ి")};

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
