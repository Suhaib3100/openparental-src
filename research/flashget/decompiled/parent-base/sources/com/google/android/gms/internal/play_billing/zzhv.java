package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzhv implements zzib {
    private final zzhr zza;
    private final zziq zzb;
    private final boolean zzc;
    private final zzgd zzd;

    private zzhv(zziq zziqVar, zzgd zzgdVar, zzhr zzhrVar) {
        this.zzb = zziqVar;
        this.zzc = zzhrVar instanceof zzgm;
        this.zzd = zzgdVar;
        this.zza = zzhrVar;
    }

    static zzhv zzc(zziq zziqVar, zzgd zzgdVar, zzhr zzhrVar) {
        return new zzhv(zziqVar, zzgdVar, zzhrVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final int zza(Object obj) {
        int zzb = ((zzgp) obj).zzc.zzb();
        return this.zzc ? zzb + ((zzgm) obj).zzb.zzd() : zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final int zzb(Object obj) {
        int hashCode = ((zzgp) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzgm) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final Object zze() {
        zzhr zzhrVar = this.zza;
        return zzhrVar instanceof zzgp ? ((zzgp) zzhrVar).zzs() : zzhrVar.zzw().zzk();
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzf(Object obj) {
        ((zzgp) obj).zzc.zzh();
        ((zzgm) obj).zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzg(Object obj, Object obj2) {
        zzic.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzic.zzo(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzh(Object obj, byte[] bArr, int i4, int i5, zzfd zzfdVar) throws IOException {
        zzgp zzgpVar = (zzgp) obj;
        if (zzgpVar.zzc == zzir.zzc()) {
            zzgpVar.zzc = zzir.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzi(Object obj, zzji zzjiVar) throws IOException {
        Iterator zzf = ((zzgm) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzgg zzggVar = (zzgg) entry.getKey();
            if (zzggVar.zzc() != zzjh.zzi || zzggVar.zze() || zzggVar.zzd()) {
                throw new IllegalStateException(ProtectedSandApp.s("\ud81a"));
            }
            if (entry instanceof zzgw) {
                zzjiVar.zzx(zzggVar.zza(), ((zzgw) entry).zza().zzb());
            } else {
                zzjiVar.zzx(zzggVar.zza(), entry.getValue());
            }
        }
        ((zzgp) obj).zzc.zzk(zzjiVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzgp) obj).zzc.equals(((zzgp) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzgm) obj).zzb.equals(((zzgm) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final boolean zzk(Object obj) {
        return ((zzgm) obj).zzb.zzj();
    }
}
