package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzky {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;

    zzky(String str, char[] cArr) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzaax.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int min = Math.min(8, Integer.lowestOneBit(zzb));
            try {
                this.zzc = 8 / min;
                this.zzd = zzb / min;
                this.zza = length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                while (true) {
                    boolean z4 = true;
                    if (i4 >= cArr.length) {
                        break;
                    }
                    char c5 = cArr[i4];
                    zzha.zzf(c5 < 128, ProtectedSandApp.s("\uea21"), c5);
                    if (bArr[c5] != -1) {
                        z4 = false;
                    }
                    zzha.zzf(z4, ProtectedSandApp.s("\uea22"), c5);
                    bArr[c5] = (byte) i4;
                    i4++;
                }
                this.zzg = bArr;
                boolean[] zArr = new boolean[this.zzc];
                for (int i5 = 0; i5 < this.zzd; i5++) {
                    zArr[zzaax.zza(i5 * 8, this.zzb, RoundingMode.CEILING)] = true;
                }
            } catch (ArithmeticException e4) {
                String str2 = new String(cArr);
                int length2 = str2.length();
                String s4 = ProtectedSandApp.s("\uea23");
                throw new IllegalArgumentException(length2 != 0 ? s4.concat(str2) : new String(s4), e4);
            }
        } catch (ArithmeticException e5) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(35, ProtectedSandApp.s("\uea24"), cArr.length), e5);
        }
    }

    public final boolean equals(@zc.a Object obj) {
        if (obj instanceof zzky) {
            return Arrays.equals(this.zzf, ((zzky) obj).zzf);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf);
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i4) {
        return this.zzf[i4];
    }

    public final boolean zzb(char c5) {
        return c5 < 128 && this.zzg[c5] != -1;
    }
}
