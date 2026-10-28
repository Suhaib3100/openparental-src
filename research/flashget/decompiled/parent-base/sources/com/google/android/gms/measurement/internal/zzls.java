package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzls extends zzh {
    private final zzmq zza;
    private zzgb zzb;
    private volatile Boolean zzc;
    private final zzav zzd;
    private final zznl zze;
    private final List<Runnable> zzf;
    private final zzav zzg;

    protected zzls(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzf = new ArrayList();
        this.zze = new zznl(zzhyVar.zzb());
        this.zza = new zzmq(this);
        this.zzd = new zzlt(this, zzhyVar);
        this.zzg = new zzmg(this, zzhyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzaq() {
        zzt();
        zzj().zzp().zza(ProtectedSandApp.s("\ue18c"), Integer.valueOf(this.zzf.size()));
        Iterator<Runnable> it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e4) {
                zzj().zzg().zza(ProtectedSandApp.s("\ue18d"), e4);
            }
        }
        this.zzf.clear();
        this.zzg.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzar() {
        zzt();
        this.zze.zzb();
        this.zzd.zza(zzbh.zzal.zza(null).longValue());
    }

    @n1
    protected final zzaj zzaa() {
        zzt();
        zzu();
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            zzae();
            zzj().zzc().zza(ProtectedSandApp.s("\ue195"));
            return null;
        }
        zzo zzc = zzc(false);
        Preconditions.checkNotNull(zzc);
        try {
            zzaj zza = zzgbVar.zza(zzc);
            zzar();
            return zza;
        } catch (RemoteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue196"), e4);
            return null;
        }
    }

    final Boolean zzab() {
        return this.zzc;
    }

    @n1
    protected final void zzac() {
        zzt();
        zzu();
        zza(new zzme(this, zzc(true)));
    }

    @n1
    protected final void zzad() {
        zzt();
        zzu();
        zzo zzc = zzc(true);
        zzh().zzab();
        zza(new zzmb(this, zzc));
    }

    @n1
    final void zzae() {
        zzt();
        zzu();
        if (zzal()) {
            return;
        }
        if (zzap()) {
            this.zza.zza();
            return;
        }
        if (zze().zzy()) {
            return;
        }
        PackageManager packageManager = zza().getPackageManager();
        Intent intent = new Intent();
        Context zza = zza();
        String s4 = ProtectedSandApp.s("\ue197");
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent.setClassName(zza, s4), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue199"));
            return;
        }
        Intent intent2 = new Intent(ProtectedSandApp.s("\ue198"));
        intent2.setComponent(new ComponentName(zza(), s4));
        this.zza.zza(intent2);
    }

    @n1
    public final void zzaf() {
        zzt();
        zzu();
        this.zza.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(zza(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    final /* synthetic */ void zzag() {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue19a"));
            return;
        }
        try {
            zzo zzc = zzc(false);
            Preconditions.checkNotNull(zzc);
            zzgbVar.zzg(zzc);
            zzar();
        } catch (RemoteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue19b"), e4);
        }
    }

    final /* synthetic */ void zzah() {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue19c"));
            return;
        }
        try {
            zzo zzc = zzc(false);
            Preconditions.checkNotNull(zzc);
            zzgbVar.zzi(zzc);
            zzar();
        } catch (RemoteException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue19d"), e4);
        }
    }

    @n1
    protected final void zzai() {
        zzt();
        zzu();
        zzo zzc = zzc(false);
        zzh().zzaa();
        zza(new zzma(this, zzc));
    }

    @n1
    protected final void zzaj() {
        zzt();
        zzu();
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlu
            @Override // java.lang.Runnable
            public final void run() {
                zzls.this.zzag();
            }
        });
    }

    @n1
    protected final void zzak() {
        zzt();
        zzu();
        zza(new zzmh(this, zzc(true)));
    }

    @n1
    public final boolean zzal() {
        zzt();
        zzu();
        return this.zzb != null;
    }

    @n1
    final boolean zzam() {
        zzt();
        zzu();
        return !zzap() || zzq().zzg() >= 200900;
    }

    @n1
    final boolean zzan() {
        zzt();
        zzu();
        return !zzap() || zzq().zzg() >= zzbh.zzbt.zza(null).intValue();
    }

    @n1
    final boolean zzao() {
        zzt();
        zzu();
        return !zzap() || zzq().zzg() >= 241200;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011a  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzap() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzls.zzap():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzh
    protected final boolean zzz() {
        return false;
    }

    static /* synthetic */ void zzd(zzls zzlsVar) {
        zzlsVar.zzt();
        if (zzlsVar.zzal()) {
            zzlsVar.zzj().zzp().zza(ProtectedSandApp.s("\ue18e"));
            zzlsVar.zzaf();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @n1
    private final zzo zzc(boolean z4) {
        return zzg().zza(z4 ? zzj().zzx() : null);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @n1
    protected final void zzb(boolean z4) {
        zzt();
        zzu();
        if ((!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcx)) && z4) {
            zzh().zzaa();
        }
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlr
            @Override // java.lang.Runnable
            public final void run() {
                zzls.this.zzah();
            }
        });
    }

    static /* synthetic */ void zza(zzls zzlsVar, ComponentName componentName) {
        zzlsVar.zzt();
        if (zzlsVar.zzb != null) {
            zzlsVar.zzb = null;
            zzlsVar.zzj().zzp().zza(ProtectedSandApp.s("\ue18a"), componentName);
            zzlsVar.zzt();
            zzlsVar.zzae();
        }
    }

    @n1
    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        zzt();
        zzu();
        zza(new zzmc(this, zzc(false), zzdoVar));
    }

    @n1
    public final void zza(AtomicReference<String> atomicReference) {
        zzt();
        zzu();
        zza(new zzlz(this, atomicReference, zzc(false)));
    }

    @n1
    protected final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, String str, String str2) {
        zzt();
        zzu();
        zza(new zzmo(this, str, str2, zzc(false), zzdoVar));
    }

    @n1
    protected final void zza(AtomicReference<List<zzae>> atomicReference, String str, String str2, String str3) {
        zzt();
        zzu();
        zza(new zzml(this, atomicReference, str, str2, str3, zzc(false)));
    }

    @n1
    protected final void zza(AtomicReference<List<zzno>> atomicReference, Bundle bundle) {
        zzt();
        zzu();
        zza(new zzly(this, atomicReference, zzc(false), bundle));
    }

    @n1
    protected final void zza(AtomicReference<List<zzon>> atomicReference, boolean z4) {
        zzt();
        zzu();
        zza(new zzlv(this, atomicReference, zzc(false), z4));
    }

    @n1
    protected final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, String str, String str2, boolean z4) {
        zzt();
        zzu();
        zza(new zzlw(this, str, str2, zzc(false), z4, zzdoVar));
    }

    @n1
    protected final void zza(AtomicReference<List<zzon>> atomicReference, String str, String str2, String str3, boolean z4) {
        zzt();
        zzu();
        zza(new zzmn(this, atomicReference, str, str2, str3, zzc(false), z4));
    }

    @n1
    protected final void zza(zzbf zzbfVar, String str) {
        Preconditions.checkNotNull(zzbfVar);
        zzt();
        zzu();
        zza(new zzmj(this, true, zzc(true), zzh().zza(zzbfVar), zzbfVar, str));
    }

    @n1
    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, zzbf zzbfVar, String str) {
        zzt();
        zzu();
        if (zzq().zza(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzj().zzu().zza(ProtectedSandApp.s("\ue18f"));
            zzq().zza(zzdoVar, new byte[0]);
        } else {
            zza(new zzmi(this, zzbfVar, str, zzdoVar));
        }
    }

    @n1
    private final void zza(Runnable runnable) throws IllegalStateException {
        zzt();
        if (zzal()) {
            runnable.run();
        } else {
            if (this.zzf.size() >= 1000) {
                zzj().zzg().zza(ProtectedSandApp.s("\ue18b"));
                return;
            }
            this.zzf.add(runnable);
            this.zzg.zza(60000L);
            zzae();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d A[ADDED_TO_REGION, SYNTHETIC] */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void zza(com.google.android.gms.measurement.internal.zzgb r37, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r38, com.google.android.gms.measurement.internal.zzo r39) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzls.zza(com.google.android.gms.measurement.internal.zzgb, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzo):void");
    }

    @n1
    protected final void zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzu();
        zza(new zzmm(this, true, zzc(true), zzh().zza(zzaeVar), new zzae(zzaeVar), zzaeVar));
    }

    @n1
    protected final void zza(boolean z4) {
        zzt();
        zzu();
        if ((!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcx)) && z4) {
            zzh().zzaa();
        }
        if (zzan()) {
            zza(new zzmk(this, zzc(false)));
        }
    }

    @n1
    protected final void zza(zzlk zzlkVar) {
        zzt();
        zzu();
        zza(new zzmd(this, zzlkVar));
    }

    @n1
    public final void zza(Bundle bundle) {
        zzt();
        zzu();
        zza(new zzmf(this, zzc(false), bundle));
    }

    @n1
    protected final void zza(zzgb zzgbVar) {
        zzt();
        Preconditions.checkNotNull(zzgbVar);
        this.zzb = zzgbVar;
        zzar();
        zzaq();
    }

    @n1
    protected final void zza(zzon zzonVar) {
        zzt();
        zzu();
        zza(new zzlx(this, zzc(true), zzh().zza(zzonVar), zzonVar));
    }
}
