package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmq extends zzmr {
    zzmq() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.zzmr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zza(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmq.zza(java.lang.String, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
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
                        return zzmp.zza(bArr, i7, i6);
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
                    return zzmp.zza(bArr, i7, i6);
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

    @Override // com.google.android.gms.internal.measurement.zzmr
    final String zza(byte[] bArr, int i4, int i5) throws zzkb {
        if ((i4 | i5 | ((bArr.length - i4) - i5)) >= 0) {
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte b5 = bArr[i4];
                if (b5 < 0) {
                    break;
                }
                i4++;
                zzmo.zza(b5, cArr, i7);
                i7++;
            }
            int i10 = i7;
            while (i4 < i6) {
                int i11 = i4 + 1;
                byte b6 = bArr[i4];
                if (b6 >= 0) {
                    int i12 = i10 + 1;
                    zzmo.zza(b6, cArr, i10);
                    while (i11 < i6) {
                        byte b7 = bArr[i11];
                        if (b7 < 0) {
                            break;
                        }
                        i11++;
                        zzmo.zza(b7, cArr, i12);
                        i12++;
                    }
                    i10 = i12;
                    i4 = i11;
                } else if (b6 < -32) {
                    if (i11 < i6) {
                        i4 += 2;
                        zzmo.zza(b6, bArr[i11], cArr, i10);
                        i10++;
                    } else {
                        throw zzkb.zzd();
                    }
                } else if (b6 < -16) {
                    if (i11 < i6 - 1) {
                        int i13 = i4 + 2;
                        i4 += 3;
                        zzmo.zza(b6, bArr[i11], bArr[i13], cArr, i10);
                        i10++;
                    } else {
                        throw zzkb.zzd();
                    }
                } else if (i11 < i6 - 2) {
                    byte b10 = bArr[i11];
                    int i14 = i4 + 3;
                    byte b11 = bArr[i4 + 2];
                    i4 += 4;
                    zzmo.zza(b6, b10, b11, bArr[i14], cArr, i10);
                    i10 += 2;
                } else {
                    throw zzkb.zzd();
                }
            }
            return new String(cArr, 0, i10);
        }
        throw new ArrayIndexOutOfBoundsException(String.format(ProtectedSandApp.s("핬"), Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
    }
}
