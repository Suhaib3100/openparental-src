package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.RoundingMode;
import java.util.Arrays;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzgb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    zzgb(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L33
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "큵"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            com.google.android.gms.internal.fido.zzbm.zzd(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L23
            goto L24
        L23:
            r6 = r3
        L24:
            java.lang.String r7 = "큶"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            com.google.android.gms.internal.fido.zzbm.zzd(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L33:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzgb.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzgb) {
            zzgb zzgbVar = (zzgb) obj;
            if (this.zzh == zzgbVar.zzh && Arrays.equals(this.zzf, zzgbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i4) {
        return this.zzf[i4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    final zzgb zzb() {
        int i4;
        boolean z4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i6 >= cArr.length) {
                return this;
            }
            if (zzba.zza(cArr[i6])) {
                int i7 = 0;
                while (true) {
                    if (i7 >= cArr.length) {
                        z4 = false;
                        break;
                    }
                    char c5 = cArr[i7];
                    if (c5 >= 'A' && c5 <= 'Z') {
                        z4 = true;
                        break;
                    }
                    i7++;
                }
                zzbm.zzf(!z4, ProtectedSandApp.s("큸"));
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i5 >= cArr3.length) {
                        break;
                    }
                    char c6 = cArr3[i5];
                    if (zzba.zza(c6)) {
                        c6 ^= 32;
                    }
                    cArr2[i5] = (char) c6;
                    i5++;
                }
                zzgb zzgbVar = new zzgb(this.zze.concat(ProtectedSandApp.s("큹")), cArr2);
                if (!this.zzh || zzgbVar.zzh) {
                    return zzgbVar;
                }
                byte[] bArr = zzgbVar.zzg;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (i4 = 65; i4 <= 90; i4++) {
                    int i10 = i4 | 32;
                    byte[] bArr2 = zzgbVar.zzg;
                    byte b5 = bArr2[i4];
                    byte b6 = bArr2[i10];
                    if (b5 == -1) {
                        copyOf[i4] = b6;
                    } else {
                        char c7 = (char) i4;
                        char c10 = (char) i10;
                        if (b6 != -1) {
                            throw new IllegalStateException(zzbo.zza(ProtectedSandApp.s("큺"), Character.valueOf(c7), Character.valueOf(c10)));
                        }
                        copyOf[i10] = b5;
                    }
                }
                return new zzgb(zzgbVar.zze.concat(ProtectedSandApp.s("큻")), zzgbVar.zzf, copyOf, true);
            }
            i6++;
        }
    }

    public final boolean zzc(char c5) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgb(String str, char[] cArr, byte[] bArr, boolean z4) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzgh.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i4 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i4;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i4];
            for (int i5 = 0; i5 < this.zzd; i5++) {
                zArr[zzgh.zza(i5 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z4;
        } catch (ArithmeticException e4) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("큷"), cArr.length), e4);
        }
    }
}
