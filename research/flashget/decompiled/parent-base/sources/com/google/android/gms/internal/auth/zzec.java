package com.google.android.gms.internal.auth;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
class zzec extends zzeb {
    protected final byte[] zza;

    zzec(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzef) || zzd() != ((zzef) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzec)) {
            return obj.equals(this);
        }
        zzec zzecVar = (zzec) obj;
        int zzj = zzj();
        int zzj2 = zzecVar.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzecVar.zzd()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("켫") + zzd + zzd());
        }
        if (zzd > zzecVar.zzd()) {
            throw new IllegalArgumentException(q.a(ProtectedSandApp.s("켩"), zzd, ProtectedSandApp.s("켪"), zzecVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzecVar.zza;
        zzecVar.zzc();
        int i4 = 0;
        int i5 = 0;
        while (i4 < zzd) {
            if (bArr[i4] != bArr2[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte zza(int i4) {
        return this.zza[i4];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    byte zzb(int i4) {
        return this.zza[i4];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    protected final int zze(int i4, int i5, int i6) {
        return zzfa.zzb(i4, this.zza, 0, i6);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final zzef zzf(int i4, int i5) {
        int zzi = zzef.zzi(0, i5, zzd());
        return zzi == 0 ? zzef.zzb : new zzdz(this.zza, 0, zzi);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean zzh() {
        return zzhn.zzc(this.zza, 0, zzd());
    }
}
