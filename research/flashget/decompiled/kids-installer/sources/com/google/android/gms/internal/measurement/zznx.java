package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zznx extends zznw {
    zznx() {
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    final int zza(int i5, byte[] bArr, int i6, int i7) {
        while (i6 < i7 && bArr[i6] >= 0) {
            i6++;
        }
        if (i6 >= i7) {
            return 0;
        }
        while (i6 < i7) {
            int i8 = i6 + 1;
            byte b6 = bArr[i6];
            if (b6 < 0) {
                if (b6 < -32) {
                    if (i8 >= i7) {
                        return b6;
                    }
                    if (b6 >= -62) {
                        i6 = i8 + 1;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                }
                if (b6 < -16) {
                    if (i8 >= i7 - 1) {
                        return zznz.zza(bArr, i8, i7);
                    }
                    int i9 = i8 + 1;
                    byte b7 = bArr[i8];
                    if (b7 <= -65 && ((b6 != -32 || b7 >= -96) && (b6 != -19 || b7 < -96))) {
                        i6 = i9 + 1;
                        if (bArr[i9] > -65) {
                        }
                    }
                } else {
                    if (i8 >= i7 - 2) {
                        return zznz.zza(bArr, i8, i7);
                    }
                    int i10 = i8 + 1;
                    byte b8 = bArr[i8];
                    if (b8 <= -65) {
                        if ((((b8 + 112) + (b6 << 28)) >> 30) == 0) {
                            int i11 = i10 + 1;
                            if (bArr[i10] <= -65) {
                                i8 = i11 + 1;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            i6 = i8;
        }
        return 0;
    }
}
