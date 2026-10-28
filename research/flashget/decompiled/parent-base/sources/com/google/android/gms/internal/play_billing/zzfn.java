package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzfn extends zzfm {
    private final byte[] zzb;

    zzfn(byte[] bArr) {
        super(null);
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    final byte zza(int i4) {
        return this.zzb[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    protected final int zzc(int i4, int i5, int i6) {
        return zzgv.zzb(i4, this.zzb, 0, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final int zzd() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final zzfp zze(int i4, int i5) {
        byte[] bArr = this.zzb;
        int zzj = zzfp.zzj(0, i5, bArr.length);
        return zzj == 0 ? zzfp.zza : new zzfj(bArr, 0, zzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    protected final void zzf(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.zzb, 0, bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    final void zzg(zzfg zzfgVar) throws IOException {
        byte[] bArr = this.zzb;
        ((zzfu) zzfgVar).zzc(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    protected final boolean zzh(zzfp zzfpVar) {
        byte[] bArr;
        int i4;
        boolean z4 = zzfpVar instanceof zzfn;
        if (z4) {
            return Arrays.equals(this.zzb, ((zzfn) zzfpVar).zzb);
        }
        boolean z5 = zzfpVar instanceof zzfj;
        if (!z5) {
            return zzfpVar.zzh(this);
        }
        byte[] bArr2 = this.zzb;
        int zzd = zzfpVar.zzd();
        int length = bArr2.length;
        if (length > zzd) {
            throw new IllegalArgumentException(ProtectedSandApp.s("힟") + length + length);
        }
        if (length > zzfpVar.zzd()) {
            throw new IllegalArgumentException(q.a(ProtectedSandApp.s("힝"), length, ProtectedSandApp.s("힞"), zzfpVar.zzd()));
        }
        if (z4) {
            return zzfp.zzl(bArr2, 0, ((zzfn) zzfpVar).zzb, 0, length);
        }
        if (!z5) {
            return zzfpVar.zze(0, length).equals(zze(0, length));
        }
        zzfj zzfjVar = (zzfj) zzfpVar;
        bArr = zzfjVar.zzb;
        i4 = zzfjVar.zzc;
        return zzfp.zzl(bArr2, 0, bArr, i4, length);
    }
}
