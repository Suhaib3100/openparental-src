package com.google.android.libraries.places.internal;

import java.io.IOException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzkz extends zzlb {
    final char[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    zzkz(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.google.android.libraries.places.internal.zzky r4 = new com.google.android.libraries.places.internal.zzky
            java.lang.String r5 = "\uea34"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            char[] r5 = r5.toCharArray()
            java.lang.String r0 = "\uea35"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r4.<init>(r0, r5)
            r5 = 0
            r3.<init>(r4, r5)
            r5 = 512(0x200, float:7.17E-43)
            char[] r5 = new char[r5]
            r3.zza = r5
            char[] r5 = com.google.android.libraries.places.internal.zzky.zzc(r4)
            int r5 = r5.length
            r0 = 16
            r1 = 0
            if (r5 != r0) goto L2b
            r5 = 1
            goto L2c
        L2b:
            r5 = r1
        L2c:
            com.google.android.libraries.places.internal.zzha.zzd(r5)
        L2f:
            r5 = 256(0x100, float:3.59E-43)
            if (r1 >= r5) goto L4c
            char[] r5 = r3.zza
            int r0 = r1 >>> 4
            char r0 = r4.zza(r0)
            r5[r1] = r0
            char[] r5 = r3.zza
            r0 = r1 | 256(0x100, float:3.59E-43)
            r2 = r1 & 15
            char r2 = r4.zza(r2)
            r5[r0] = r2
            int r1 = r1 + 1
            goto L2f
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkz.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // com.google.android.libraries.places.internal.zzlb, com.google.android.libraries.places.internal.zzlc
    final void zza(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
        zzha.zzg(0, i5, bArr.length);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = bArr[i6] & 255;
            appendable.append(this.zza[i7]);
            appendable.append(this.zza[i7 | 256]);
        }
    }
}
