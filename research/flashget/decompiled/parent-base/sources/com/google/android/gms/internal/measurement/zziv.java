package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
class zziv extends zzis {
    protected final byte[] zzb;

    zziv(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzik) || zzb() != ((zzik) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zziv)) {
            return obj.equals(this);
        }
        zziv zzivVar = (zziv) obj;
        int zza = zza();
        int zza2 = zzivVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzivVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public byte zza(int i4) {
        return this.zzb[i4];
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    byte zzb(int i4) {
        return this.zzb[i4];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final zzik zza(int i4, int i5) {
        int zza = zzik.zza(0, i5, zzb());
        return zza == 0 ? zzik.zza : new zzio(this.zzb, zzc(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    protected final int zzb(int i4, int i5, int i6) {
        return zzjv.zza(i4, this.zzb, zzc(), i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    final void zza(zzil zzilVar) throws IOException {
        zzilVar.zza(this.zzb, zzc(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    final boolean zza(zzik zzikVar, int i4, int i5) {
        if (i5 <= zzikVar.zzb()) {
            if (i5 <= zzikVar.zzb()) {
                if (zzikVar instanceof zziv) {
                    zziv zzivVar = (zziv) zzikVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzivVar.zzb;
                    int zzc = zzc() + i5;
                    int zzc2 = zzc();
                    int zzc3 = zzivVar.zzc();
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzikVar.zza(0, i5).equals(zza(0, i5));
            }
            throw new IllegalArgumentException(q.a(ProtectedSandApp.s("풤"), i5, ProtectedSandApp.s("풥"), zzikVar.zzb()));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("풦") + i5 + zzb());
    }
}
