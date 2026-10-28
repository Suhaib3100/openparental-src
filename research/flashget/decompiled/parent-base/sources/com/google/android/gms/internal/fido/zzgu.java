package com.google.android.gms.internal.fido;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
class zzgu extends zzgt {
    protected final byte[] zza;

    zzgu(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgx) || zzd() != ((zzgx) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgu)) {
            return obj.equals(this);
        }
        zzgu zzguVar = (zzgu) obj;
        int zzk = zzk();
        int zzk2 = zzguVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzguVar.zzd()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("킝") + zzd + zzd());
        }
        if (zzd > zzguVar.zzd()) {
            throw new IllegalArgumentException(q.a(ProtectedSandApp.s("킛"), zzd, ProtectedSandApp.s("킜"), zzguVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzguVar.zza;
        int zzc = zzc() + zzd;
        int zzc2 = zzc();
        int zzc3 = zzguVar.zzc();
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte zza(int i4) {
        return this.zza[i4];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    byte zzb(int i4) {
        return this.zza[i4];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    protected void zze(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.zza, 0, bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    protected final int zzf(int i4, int i5, int i6) {
        int zzc = zzc();
        byte[] bArr = zzhc.zzd;
        for (int i7 = zzc; i7 < zzc + i6; i7++) {
            i4 = (i4 * 31) + this.zza[i7];
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final zzgx zzg(int i4, int i5) {
        int zzj = zzgx.zzj(i4, i5, zzd());
        return zzj == 0 ? zzgx.zzb : new zzgr(this.zza, zzc() + i4, zzj);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final InputStream zzh() {
        return new ByteArrayInputStream(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final ByteBuffer zzi() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }
}
