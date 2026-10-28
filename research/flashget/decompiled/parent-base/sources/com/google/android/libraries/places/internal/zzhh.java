package com.google.android.libraries.places.internal;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzhh {
    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue9d0").concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String obj3 = obj.toString();
        throw new NullPointerException(k0.a(new StringBuilder(obj3.length() + 26), ProtectedSandApp.s("\ue9ce"), obj3, ProtectedSandApp.s("\ue9cf")));
    }
}
