package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzgc extends zzge {
    final char[] zza;

    private zzgc(zzgb zzgbVar) {
        super(zzgbVar, null);
        char[] cArr;
        this.zza = new char[512];
        cArr = zzgbVar.zzf;
        zzbm.zzc(cArr.length == 16);
        for (int i4 = 0; i4 < 256; i4++) {
            this.zza[i4] = zzgbVar.zza(i4 >>> 4);
            this.zza[i4 | 256] = zzgbVar.zza(i4 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    final zzgf zza(zzgb zzgbVar, @a Character ch) {
        return new zzgc(zzgbVar);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    final void zzb(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
        zzbm.zze(0, i5, bArr.length);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = bArr[i6] & 255;
            appendable.append(this.zza[i7]);
            appendable.append(this.zza[i7 | 256]);
        }
    }

    zzgc(String str, String str2) {
        this(new zzgb(ProtectedSandApp.s("킋"), ProtectedSandApp.s("킌").toCharArray()));
    }
}
