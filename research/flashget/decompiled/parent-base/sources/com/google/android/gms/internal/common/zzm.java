package com.google.android.gms.internal.common;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzm extends zzl {
    private final char zza;

    zzm(char c5) {
        this.zza = c5;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i4 = this.zza;
        for (int i5 = 0; i5 < 4; i5++) {
            cArr[5 - i5] = ProtectedSandApp.s("쿞").charAt(i4 & 15);
            i4 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return k0.a(new StringBuilder(String.valueOf(copyValueOf).length() + 18), ProtectedSandApp.s("쿟"), copyValueOf, ProtectedSandApp.s("쿠"));
    }

    @Override // com.google.android.gms.internal.common.zzp
    public final boolean zza(char c5) {
        return c5 == this.zza;
    }
}
