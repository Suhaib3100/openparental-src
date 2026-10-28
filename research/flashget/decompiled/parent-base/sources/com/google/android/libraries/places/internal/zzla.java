package com.google.android.libraries.places.internal;

import java.io.IOException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzla extends zzlb {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    zzla(java.lang.String r2, java.lang.String r3, @zc.a java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.libraries.places.internal.zzky r0 = new com.google.android.libraries.places.internal.zzky
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = com.google.android.libraries.places.internal.zzky.zzc(r0)
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.libraries.places.internal.zzha.zzd(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzla.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    @Override // com.google.android.libraries.places.internal.zzlb, com.google.android.libraries.places.internal.zzlc
    final void zza(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        zzha.zzg(0, i5, bArr.length);
        int i7 = i5;
        while (i7 >= 3) {
            int i10 = i6 + 3;
            int i11 = ((bArr[i6] & 255) << 16) | ((bArr[i6 + 1] & 255) << 8) | (bArr[i6 + 2] & 255);
            appendable.append(this.zzb.zza(i11 >>> 18));
            appendable.append(this.zzb.zza((i11 >>> 12) & 63));
            appendable.append(this.zzb.zza((i11 >>> 6) & 63));
            appendable.append(this.zzb.zza(i11 & 63));
            i7 -= 3;
            i6 = i10;
        }
        if (i6 < i5) {
            zzc(appendable, bArr, i6, i5 - i6);
        }
    }
}
