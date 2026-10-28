package com.google.android.gms.internal.measurement;

import android.content.preferences.protobuf.v;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
class zzjx extends zzjw {
    protected final byte[] zza;

    zzjx(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzka) || zzd() != ((zzka) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzjx)) {
            return obj.equals(this);
        }
        zzjx zzjxVar = (zzjx) obj;
        int zzk = zzk();
        int zzk2 = zzjxVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzjxVar.zzd()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⍽") + zzd + zzd());
        }
        if (zzd > zzjxVar.zzd()) {
            throw new IllegalArgumentException(v.a(ProtectedSandApp.s("⍻"), zzd, ProtectedSandApp.s("⍼"), zzjxVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzjxVar.zza;
        zzjxVar.zzc();
        int i5 = 0;
        int i6 = 0;
        while (i5 < zzd) {
            if (bArr[i5] != bArr2[i6]) {
                return false;
            }
            i5++;
            i6++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zza(int i5) {
        return this.zza[i5];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    byte zzb(int i5) {
        return this.zza[i5];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    protected final int zze(int i5, int i6, int i7) {
        return zzlj.zzb(i5, this.zza, 0, i7);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final zzka zzf(int i5, int i6) {
        int zzj = zzka.zzj(0, i6, zzd());
        return zzj == 0 ? zzka.zzb : new zzju(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    final void zzh(zzjq zzjqVar) throws IOException {
        ((zzkf) zzjqVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean zzi() {
        return zznz.zze(this.zza, 0, zzd());
    }
}
