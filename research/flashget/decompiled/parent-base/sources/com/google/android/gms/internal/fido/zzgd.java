package com.google.android.gms.internal.fido;

import java.io.IOException;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzgd extends zzge {
    private zzgd(zzgb zzgbVar, @a Character ch) {
        super(zzgbVar, ch);
        char[] cArr;
        cArr = zzgbVar.zzf;
        zzbm.zzc(cArr.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzge
    final zzgf zza(zzgb zzgbVar, @a Character ch) {
        return new zzgd(zzgbVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    final void zzb(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        zzbm.zze(0, i5, bArr.length);
        for (int i7 = i5; i7 >= 3; i7 -= 3) {
            int i10 = bArr[i6] & 255;
            int i11 = ((bArr[i6 + 1] & 255) << 8) | (i10 << 16) | (bArr[i6 + 2] & 255);
            appendable.append(this.zzb.zza(i11 >>> 18));
            appendable.append(this.zzb.zza((i11 >>> 12) & 63));
            appendable.append(this.zzb.zza((i11 >>> 6) & 63));
            appendable.append(this.zzb.zza(i11 & 63));
            i6 += 3;
        }
        if (i6 < i5) {
            zze(appendable, bArr, i6, i5 - i6);
        }
    }

    zzgd(String str, String str2, @a Character ch) {
        this(new zzgb(str, str2.toCharArray()), ch);
    }
}
