package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public class Strings {
    private static final Pattern zza = Pattern.compile(ProtectedSandApp.s("౺"));

    private Strings() {
    }

    @q0
    @KeepForSdk
    public static String emptyToNull(@q0 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    @KeepForSdk
    public static boolean isEmptyOrWhitespace(@q0 String str) {
        return str == null || str.trim().isEmpty();
    }
}
