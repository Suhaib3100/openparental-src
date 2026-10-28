package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
class zzlb extends zzlc {
    final zzky zzb;

    @zc.a
    final Character zzc;

    zzlb(zzky zzkyVar, @zc.a Character ch) {
        this.zzb = zzkyVar;
        if (ch == null || !zzkyVar.zzb(ch.charValue())) {
            this.zzc = ch;
        } else {
            throw new IllegalArgumentException(zzhf.zza(ProtectedSandApp.s("\uea2f"), ch));
        }
    }

    public final boolean equals(@zc.a Object obj) {
        if (obj instanceof zzlb) {
            zzlb zzlbVar = (zzlb) obj;
            if (this.zzb.equals(zzlbVar.zzb) && zzgw.zza(this.zzc, zzlbVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ Arrays.hashCode(new Object[]{this.zzc});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uea30"));
        sb.append(this.zzb.toString());
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(ProtectedSandApp.s("\uea31"));
            } else {
                sb.append(ProtectedSandApp.s("\uea32"));
                sb.append(this.zzc);
                sb.append(ProtectedSandApp.s("\uea33"));
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzlc
    void zza(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        zzha.zzg(0, i5, bArr.length);
        while (i6 < i5) {
            zzc(appendable, bArr, i6, Math.min(this.zzb.zzd, i5 - i6));
            i6 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzlc
    final int zzb(int i4) {
        zzky zzkyVar = this.zzb;
        return zzaax.zza(i4, zzkyVar.zzd, RoundingMode.CEILING) * zzkyVar.zzc;
    }

    final void zzc(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
        zzha.zzg(i4, i4 + i5, bArr.length);
        int i6 = 0;
        zzha.zzd(i5 <= this.zzb.zzd);
        long j4 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            j4 = (j4 | (bArr[i4 + i7] & 255)) << 8;
        }
        int i10 = ((i5 + 1) * 8) - this.zzb.zzb;
        while (i6 < i5 * 8) {
            zzky zzkyVar = this.zzb;
            appendable.append(zzkyVar.zza(((int) (j4 >>> (i10 - i6))) & zzkyVar.zza));
            i6 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i6 < this.zzb.zzd * 8) {
                appendable.append(this.zzc.charValue());
                i6 += this.zzb.zzb;
            }
        }
    }

    zzlb(String str, String str2, @zc.a Character ch) {
        this(new zzky(str, str2.toCharArray()), ch);
    }
}
