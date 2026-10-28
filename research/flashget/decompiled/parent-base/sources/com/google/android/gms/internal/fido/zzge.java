package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
class zzge extends zzgf {

    @a
    private volatile zzgf zza;
    final zzgb zzb;

    @a
    final Character zzc;

    zzge(zzgb zzgbVar, @a Character ch) {
        this.zzb = zzgbVar;
        if (ch == null || !zzgbVar.zzc('=')) {
            this.zzc = ch;
        } else {
            throw new IllegalArgumentException(zzbo.zza(ProtectedSandApp.s("킆"), ch));
        }
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzge) {
            zzge zzgeVar = (zzge) obj;
            if (this.zzb.equals(zzgeVar.zzb) && Objects.equals(this.zzc, zzgeVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("킇"));
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(ProtectedSandApp.s("킈"));
            } else {
                sb.append(ProtectedSandApp.s("킉"));
                sb.append(this.zzc);
                sb.append(ProtectedSandApp.s("킊"));
            }
        }
        return sb.toString();
    }

    zzgf zza(zzgb zzgbVar, @a Character ch) {
        return new zzge(zzgbVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    void zzb(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        zzbm.zze(0, i5, bArr.length);
        while (i6 < i5) {
            zze(appendable, bArr, i6, Math.min(this.zzb.zzd, i5 - i6));
            i6 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    final int zzc(int i4) {
        zzgb zzgbVar = this.zzb;
        return zzgbVar.zzc * zzgh.zza(i4, zzgbVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final zzgf zzd() {
        zzgf zzgfVar = this.zza;
        if (zzgfVar == null) {
            zzgb zzgbVar = this.zzb;
            zzgb zzb = zzgbVar.zzb();
            zzgfVar = zzb == zzgbVar ? this : zza(zzb, this.zzc);
            this.zza = zzgfVar;
        }
        return zzgfVar;
    }

    final void zze(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
        zzbm.zze(i4, i4 + i5, bArr.length);
        int i6 = 0;
        zzbm.zzc(i5 <= this.zzb.zzd);
        long j4 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            j4 = (j4 | (bArr[i4 + i7] & 255)) << 8;
        }
        int i10 = (i5 + 1) * 8;
        zzgb zzgbVar = this.zzb;
        while (i6 < i5 * 8) {
            long j5 = j4 >>> ((i10 - zzgbVar.zzb) - i6);
            zzgb zzgbVar2 = this.zzb;
            appendable.append(zzgbVar2.zza(((int) j5) & zzgbVar2.zza));
            i6 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i6 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i6 += this.zzb.zzb;
            }
        }
    }

    zzge(String str, String str2, @a Character ch) {
        this(new zzgb(str, str2.toCharArray()), ch);
    }
}
