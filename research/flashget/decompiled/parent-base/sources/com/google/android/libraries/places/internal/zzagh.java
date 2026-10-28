package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzagh {
    private static final zzage zza;

    static {
        if (zzagd.zzx() && zzagd.zzy()) {
            int i4 = zzace.zza;
        }
        zza = new zzagf();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i4, int i5) {
        byte b5 = bArr[i4 - 1];
        int i6 = i5 - i4;
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0108, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzagh.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = charSequence.length();
                while (i5 < length2) {
                    char charAt2 = charSequence.charAt(i5);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i5) < 65536) {
                                throw new zzagg(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i4;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        StringBuilder a5 = androidx.fragment.app.a.a(54, ProtectedSandApp.s("\ue7ee"));
        a5.append(i6 + 4294967296L);
        throw new IllegalArgumentException(a5.toString());
    }

    static boolean zzd(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    static boolean zze(byte[] bArr, int i4, int i5) {
        return zza.zzb(bArr, 0, i5);
    }
}
