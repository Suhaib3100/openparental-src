package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import okio.r0;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zziy {
    static /* bridge */ /* synthetic */ void zza(byte b5, byte b6, byte b7, byte b10, char[] cArr, int i4) {
        if (!zze(b6)) {
            if ((((b6 + 112) + (b5 << com.google.common.base.c.F)) >> 30) == 0 && !zze(b7) && !zze(b10)) {
                int i5 = ((b5 & 7) << 18) | ((b6 & r0.f85265a) << 12) | ((b7 & r0.f85265a) << 6) | (b10 & r0.f85265a);
                cArr[i4] = (char) ((i5 >>> 10) + r0.f85268d);
                cArr[i4 + 1] = (char) ((i5 & 1023) + r0.f85269e);
                return;
            }
        }
        throw new zzhb(ProtectedSandApp.s("\ud847"));
    }

    static /* bridge */ /* synthetic */ void zzb(byte b5, byte b6, byte b7, char[] cArr, int i4) {
        if (!zze(b6)) {
            if (b5 == -32) {
                if (b6 >= -96) {
                    b5 = -32;
                }
            }
            if (b5 == -19) {
                if (b6 < -96) {
                    b5 = -19;
                }
            }
            if (!zze(b7)) {
                cArr[i4] = (char) (((b5 & com.google.common.base.c.f54871q) << 12) | ((b6 & r0.f85265a) << 6) | (b7 & r0.f85265a));
                return;
            }
        }
        throw new zzhb(ProtectedSandApp.s("\ud847"));
    }

    static /* bridge */ /* synthetic */ void zzc(byte b5, byte b6, char[] cArr, int i4) {
        if (b5 < -62 || zze(b6)) {
            throw new zzhb(ProtectedSandApp.s("\ud847"));
        }
        cArr[i4] = (char) (((b5 & com.google.common.base.c.I) << 6) | (b6 & r0.f85265a));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b5) {
        return b5 >= 0;
    }

    private static boolean zze(byte b5) {
        return b5 > -65;
    }
}
