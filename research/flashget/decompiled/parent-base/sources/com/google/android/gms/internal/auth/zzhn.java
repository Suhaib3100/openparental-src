package com.google.android.gms.internal.auth;

import com.google.common.base.c;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhl zzb;

    static {
        if (zzhj.zzu() && zzhj.zzv()) {
            int i4 = zzds.zza;
        }
        zzb = new zzhm();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i4, int i5) {
        int i6 = i5 - i4;
        byte b5 = bArr[i4 - 1];
        if (i6 != 0) {
            if (i6 == 1) {
                byte b6 = bArr[i4];
                if (b5 <= -12 && b6 <= -65) {
                    return b5 ^ (b6 << 8);
                }
            } else {
                if (i6 != 2) {
                    throw new AssertionError();
                }
                byte b7 = bArr[i4];
                byte b10 = bArr[i4 + 1];
                if (b5 <= -12 && b7 <= -65 && b10 <= -65) {
                    return ((b7 << 8) ^ b5) ^ (b10 << c.f54872r);
                }
            }
        } else if (b5 <= -12) {
            return b5;
        }
        return -1;
    }

    static boolean zzb(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    static boolean zzc(byte[] bArr, int i4, int i5) {
        return zzb.zzb(bArr, i4, i5);
    }
}
