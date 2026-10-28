package com.google.android.libraries.places.internal;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzgn extends zzgm {
    zzgn(char c5) {
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i4 = 46;
        for (int i5 = 0; i5 < 4; i5++) {
            cArr[5 - i5] = ProtectedSandApp.s("\ue9b0").charAt(i4 & 15);
            i4 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return k0.a(new StringBuilder(String.valueOf(copyValueOf).length() + 18), ProtectedSandApp.s("\ue9b1"), copyValueOf, ProtectedSandApp.s("\ue9b2"));
    }
}
