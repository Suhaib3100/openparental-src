package com.google.android.gms.internal.measurement;

import com.google.common.base.c;
import okio.r0;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmo {
    private static boolean zza(byte b5) {
        return b5 > -65;
    }

    static /* synthetic */ void zza(byte b5, byte b6, byte b7, byte b10, char[] cArr, int i4) {
        if (!zza(b6)) {
            if ((((b6 + 112) + (b5 << c.F)) >> 30) == 0 && !zza(b7) && !zza(b10)) {
                int i5 = ((b5 & 7) << 18) | ((b6 & r0.f85265a) << 12) | ((b7 & r0.f85265a) << 6) | (b10 & r0.f85265a);
                cArr[i4] = (char) ((i5 >>> 10) + r0.f85268d);
                cArr[i4 + 1] = (char) ((i5 & 1023) + r0.f85269e);
                return;
            }
        }
        throw zzkb.zzd();
    }

    static /* synthetic */ void zza(byte b5, char[] cArr, int i4) {
        cArr[i4] = (char) b5;
    }

    static /* synthetic */ void zza(byte b5, byte b6, byte b7, char[] cArr, int i4) {
        if (!zza(b6) && ((b5 != -32 || b6 >= -96) && ((b5 != -19 || b6 < -96) && !zza(b7)))) {
            cArr[i4] = (char) (((b5 & c.f54871q) << 12) | ((b6 & r0.f85265a) << 6) | (b7 & r0.f85265a));
            return;
        }
        throw zzkb.zzd();
    }

    static /* synthetic */ void zza(byte b5, byte b6, char[] cArr, int i4) {
        if (b5 >= -62 && !zza(b6)) {
            cArr[i4] = (char) (((b5 & c.I) << 6) | (b6 & r0.f85265a));
            return;
        }
        throw zzkb.zzd();
    }
}
