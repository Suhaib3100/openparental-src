package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zznw zzb;

    static {
        if (zznu.zzx() && zznu.zzy()) {
            int i5 = zzjm.zza;
        }
        zzb = new zznx();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i5, int i6) {
        int i7 = i6 - i5;
        byte b6 = bArr[i5 - 1];
        if (i7 != 0) {
            if (i7 == 1) {
                byte b7 = bArr[i5];
                if (b6 <= -12 && b7 <= -65) {
                    return b6 ^ (b7 << 8);
                }
            } else {
                if (i7 != 2) {
                    throw new AssertionError();
                }
                byte b8 = bArr[i5];
                byte b9 = bArr[i5 + 1];
                if (b6 <= -12 && b8 <= -65 && b9 <= -65) {
                    return ((b8 << 8) ^ b6) ^ (b9 << 16);
                }
            }
        } else if (b6 <= -12) {
            return b6;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0104, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznz.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i5 = 0;
        int i6 = 0;
        while (i6 < length && charSequence.charAt(i6) < 128) {
            i6++;
        }
        int i7 = length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i6);
            if (charAt < 2048) {
                i7 += (127 - charAt) >>> 31;
                i6++;
            } else {
                int length2 = charSequence.length();
                while (i6 < length2) {
                    char charAt2 = charSequence.charAt(i6);
                    if (charAt2 < 2048) {
                        i5 += (127 - charAt2) >>> 31;
                    } else {
                        i5 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i6) < 65536) {
                                throw new zzny(i6, length2);
                            }
                            i6++;
                        }
                    }
                    i6++;
                }
                i7 += i5;
            }
        }
        if (i7 >= length) {
            return i7;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\u0e5f") + (i7 + 4294967296L));
    }

    static boolean zzd(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    static boolean zze(byte[] bArr, int i5, int i6) {
        return zzb.zzb(bArr, i5, i6);
    }
}
