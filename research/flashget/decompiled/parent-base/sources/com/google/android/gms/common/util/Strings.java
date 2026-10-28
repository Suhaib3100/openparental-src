package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class Strings {
    private static final Pattern zza = Pattern.compile(ProtectedSandApp.s("찖"));

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

    @KeepForSdk
    public static boolean isEmptyOrWhitespace(@q0 String str) {
        return str == null || str.trim().isEmpty();
    }
}
