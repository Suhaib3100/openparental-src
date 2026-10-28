package com.google.android.gms.internal.auth;

import com.google.common.base.c;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzhm extends zzhl {
    zzhm() {
    }

    @Override // com.google.android.gms.internal.auth.zzhl
    final int zza(int i4, byte[] bArr, int i5, int i6) {
        while (i5 < i6 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 >= i6) {
            return 0;
        }
        while (i5 < i6) {
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (i7 >= i6) {
                        return b5;
                    }
                    if (b5 >= -62) {
                        i5 += 2;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
                if (b5 < -16) {
                    if (i7 >= i6 - 1) {
                        return zzhn.zza(bArr, i7, i6);
                    }
                    int i10 = i5 + 2;
                    byte b6 = bArr[i7];
                    if (b6 <= -65 && ((b5 != -32 || b6 >= -96) && (b5 != -19 || b6 < -96))) {
                        i5 += 3;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (i7 >= i6 - 2) {
                    return zzhn.zza(bArr, i7, i6);
                }
                int i11 = i5 + 2;
                byte b7 = bArr[i7];
                if (b7 <= -65) {
                    if ((((b7 + 112) + (b5 << c.F)) >> 30) == 0) {
                        int i12 = i5 + 3;
                        if (bArr[i11] <= -65) {
                            i5 += 4;
                            if (bArr[i12] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i5 = i7;
        }
        return 0;
    }
}
