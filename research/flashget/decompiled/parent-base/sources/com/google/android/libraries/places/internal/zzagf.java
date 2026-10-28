package com.google.android.libraries.places.internal;

import com.google.common.base.c;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzagf extends zzage {
    zzagf() {
    }

    @Override // com.google.android.libraries.places.internal.zzage
    final int zza(int i4, byte[] bArr, int i5, int i6) {
        int i7 = 0;
        while (i7 < i6 && bArr[i7] >= 0) {
            i7++;
        }
        if (i7 >= i6) {
            return 0;
        }
        while (i7 < i6) {
            int i10 = i7 + 1;
            byte b5 = bArr[i7];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (i10 >= i6) {
                        return b5;
                    }
                    if (b5 >= -62) {
                        i7 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b5 < -16) {
                    if (i10 >= i6 - 1) {
                        return zzagh.zza(bArr, i10, i6);
                    }
                    int i11 = i7 + 2;
                    byte b6 = bArr[i10];
                    if (b6 <= -65 && ((b5 != -32 || b6 >= -96) && (b5 != -19 || b6 < -96))) {
                        i7 += 3;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (i10 >= i6 - 2) {
                    return zzagh.zza(bArr, i10, i6);
                }
                int i12 = i7 + 2;
                byte b7 = bArr[i10];
                if (b7 <= -65) {
                    if ((((b7 + 112) + (b5 << c.F)) >> 30) == 0) {
                        int i13 = i7 + 3;
                        if (bArr[i12] <= -65) {
                            i7 += 4;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i7 = i10;
        }
        return 0;
    }
}
