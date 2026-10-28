package com.google.android.gms.internal.measurement;

import okio.r0;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zznv {
    static /* bridge */ /* synthetic */ void zza(byte b6, byte b7, byte b8, byte b9, char[] cArr, int i5) {
        if (!zze(b7)) {
            if ((((b7 + 112) + (b6 << 28)) >> 30) == 0 && !zze(b8) && !zze(b9)) {
                int i6 = ((b6 & 7) << 18) | ((b7 & r0.f31710a) << 12) | ((b8 & r0.f31710a) << 6) | (b9 & r0.f31710a);
                cArr[i5] = (char) ((i6 >>> 10) + r0.f31713d);
                cArr[i5 + 1] = (char) ((i6 & 1023) + r0.f31714e);
                return;
            }
        }
        throw zzll.zzc();
    }

    static /* bridge */ /* synthetic */ void zzb(byte b6, byte b7, byte b8, char[] cArr, int i5) {
        if (!zze(b7)) {
            if (b6 == -32) {
                if (b7 >= -96) {
                    b6 = -32;
                }
            }
            if (b6 == -19) {
                if (b7 < -96) {
                    b6 = -19;
                }
            }
            if (!zze(b8)) {
                cArr[i5] = (char) (((b6 & 15) << 12) | ((b7 & r0.f31710a) << 6) | (b8 & r0.f31710a));
                return;
            }
        }
        throw zzll.zzc();
    }

    static /* bridge */ /* synthetic */ void zzc(byte b6, byte b7, char[] cArr, int i5) {
        if (b6 < -62 || zze(b7)) {
            throw zzll.zzc();
        }
        cArr[i5] = (char) (((b6 & 31) << 6) | (b7 & r0.f31710a));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b6) {
        return b6 >= 0;
    }

    private static boolean zze(byte b6) {
        return b6 > -65;
    }
}
