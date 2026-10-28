package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzjc {
    public static final /* synthetic */ int zza = 0;

    static {
        int i4 = zzfc.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return r12 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int zza(java.lang.String r10, byte[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzjc.zza(java.lang.String, byte[], int, int):int");
    }

    static boolean zzb(byte[] bArr, int i4, int i5) {
        while (i4 < i5 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i5) {
            return true;
        }
        while (i4 < i5) {
            int i6 = i4 + 1;
            byte b5 = bArr[i4];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (i6 < i5 && b5 >= -62) {
                        i4 += 2;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return false;
                }
                if (b5 < -16) {
                    if (i6 < i5 - 1) {
                        int i7 = i4 + 2;
                        byte b6 = bArr[i6];
                        if (b6 <= -65 && ((b5 != -32 || b6 >= -96) && (b5 != -19 || b6 < -96))) {
                            i4 += 3;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                    return false;
                }
                if (i6 < i5 - 2) {
                    int i10 = i4 + 2;
                    byte b7 = bArr[i6];
                    if (b7 <= -65) {
                        if ((((b7 + 112) + (b5 << com.google.common.base.c.F)) >> 30) == 0) {
                            int i11 = i4 + 3;
                            if (bArr[i10] <= -65) {
                                i4 += 4;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                    }
                }
                return false;
            }
            i4 = i6;
        }
        return true;
    }
}
