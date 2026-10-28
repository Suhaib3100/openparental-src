package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
class zzacm extends zzacl {
    protected final byte[] zza;

    zzacm(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzacp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacp) || zzd() != ((zzacp) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzacm)) {
            return obj.equals(this);
        }
        zzacm zzacmVar = (zzacm) obj;
        int zzk = zzk();
        int zzk2 = zzacmVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzacmVar.zzd()) {
            int zzd2 = zzd();
            StringBuilder sb = new StringBuilder(40);
            sb.append(ProtectedSandApp.s("\ue740"));
            sb.append(zzd);
            sb.append(zzd2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (zzd > zzacmVar.zzd()) {
            int zzd3 = zzacmVar.zzd();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append(ProtectedSandApp.s("\ue73e"));
            sb2.append(zzd);
            sb2.append(ProtectedSandApp.s("\ue73f"));
            sb2.append(zzd3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzacmVar.zza;
        zzacmVar.zzc();
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

    @Override // com.google.android.libraries.places.internal.zzacp
    public byte zza(int i4) {
        return this.zza[i4];
    }

    @Override // com.google.android.libraries.places.internal.zzacp
    byte zzb(int i4) {
        return this.zza[i4];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzacp
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.libraries.places.internal.zzacp
    protected final int zze(int i4, int i5, int i6) {
        return zzads.zzd(i4, this.zza, 0, i6);
    }

    @Override // com.google.android.libraries.places.internal.zzacp
    public final zzacp zzf(int i4, int i5) {
        zzacp.zzj(0, i5, zzd());
        return i5 == 0 ? zzacp.zzb : new zzacj(this.zza, 0, i5);
    }

    @Override // com.google.android.libraries.places.internal.zzacp
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.libraries.places.internal.zzacp
    final void zzh(zzacf zzacfVar) throws IOException {
        ((zzacu) zzacfVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.libraries.places.internal.zzacp
    public final boolean zzi() {
        return zzagh.zze(this.zza, 0, zzd());
    }
}
