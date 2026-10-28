package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzfj extends zzfm {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzfj(byte[] bArr, int i4, int i5) {
        super(null);
        zzfp.zzj(i4, i4 + i5, bArr.length);
        this.zzb = bArr;
        this.zzc = i4;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    final byte zza(int i4) {
        return this.zzb[this.zzc + i4];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    protected final int zzc(int i4, int i5, int i6) {
        return zzgv.zzb(i4, this.zzb, this.zzc, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final zzfp zze(int i4, int i5) {
        int zzj = zzfp.zzj(i4, i5, this.zzd);
        return zzj == 0 ? zzfp.zza : new zzfj(this.zzb, this.zzc + i4, zzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    protected final void zzf(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    final void zzg(zzfg zzfgVar) throws IOException {
        ((zzfu) zzfgVar).zzc(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    protected final boolean zzh(zzfp zzfpVar) {
        boolean z4 = zzfpVar instanceof zzfn;
        if (!z4 && !(zzfpVar instanceof zzfj)) {
            return zzfpVar.zzh(this);
        }
        int i4 = this.zzd;
        if (i4 > zzfpVar.zzd()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("힜") + i4 + i4);
        }
        if (i4 > zzfpVar.zzd()) {
            throw new IllegalArgumentException(q.a(ProtectedSandApp.s("힚"), i4, ProtectedSandApp.s("힛"), zzfpVar.zzd()));
        }
        if (z4) {
            return zzfp.zzl(this.zzb, this.zzc, ((zzfn) zzfpVar).zzb, 0, i4);
        }
        if (zzfpVar instanceof zzfj) {
            zzfj zzfjVar = (zzfj) zzfpVar;
            return zzfp.zzl(this.zzb, this.zzc, zzfjVar.zzb, zzfjVar.zzc, i4);
        }
        zzfp zze = zzfpVar.zze(0, i4);
        int i5 = this.zzc;
        return zze.equals(zze(i5, i4 + i5));
    }
}
