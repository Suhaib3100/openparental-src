package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.log4j.helpers.FileWatchdog;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
@m1
/* loaded from: classes4.dex */
public final class zzjz extends zzf {
    private final zzjy zza;
    private zzej zzb;
    private volatile Boolean zzc;
    private final zzan zzd;
    private final zzkq zze;
    private final List zzf;
    private final zzan zzg;

    protected zzjz(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzf = new ArrayList();
        this.zze = new zzkq(zzgdVar.zzax());
        this.zza = new zzjy(this);
        this.zzd = new zzjj(this, zzgdVar);
        this.zzg = new zzjl(this, zzgdVar);
    }

    @n1
    private final zzq zzO(boolean z5) {
        Pair zza;
        this.zzt.zzay();
        zzek zzh = this.zzt.zzh();
        String str = null;
        if (z5) {
            zzet zzaA = this.zzt.zzaA();
            if (zzaA.zzt.zzm().zzb != null && (zza = zzaA.zzt.zzm().zzb.zza()) != null && zza != zzfi.zza) {
                str = String.valueOf(zza.second) + ProtectedSandApp.s("㆚") + ((String) zza.first);
            }
        }
        return zzh.zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzP() {
        zzg();
        this.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("㆛"), Integer.valueOf(this.zzf.size()));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e6) {
                this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("㆜"), e6);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzan zzanVar = this.zzd;
        this.zzt.zzf();
        zzanVar.zzd(((Long) zzeg.zzJ.zza(null)).longValue());
    }

    @n1
    private final void zzR(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        long size = this.zzf.size();
        this.zzt.zzf();
        if (size >= 1000) {
            a.a(this.zzt, ProtectedSandApp.s("㆝"));
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(FileWatchdog.DEFAULT_DELAY);
        zzr();
    }

    private final boolean zzS() {
        this.zzt.zzay();
        return true;
    }

    static /* bridge */ /* synthetic */ void zzo(zzjz zzjzVar, ComponentName componentName) {
        zzjzVar.zzg();
        if (zzjzVar.zzb != null) {
            zzjzVar.zzb = null;
            zzjzVar.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("㆞"), componentName);
            zzjzVar.zzg();
            zzjzVar.zzr();
        }
    }

    @n1
    protected final void zzA(zzau zzauVar, String str) {
        Preconditions.checkNotNull(zzauVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjo(this, true, zzO(true), this.zzt.zzi().zzo(zzauVar), zzauVar, str));
    }

    @n1
    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzau zzauVar, String str) {
        zzg();
        zza();
        if (this.zzt.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0) {
            zzR(new zzjk(this, zzauVar, str, zzcfVar));
        } else {
            b.a(this.zzt, ProtectedSandApp.s("㆟"));
            this.zzt.zzv().zzT(zzcfVar, new byte[0]);
        }
    }

    @n1
    protected final void zzC() {
        zzg();
        zza();
        zzq zzO = zzO(false);
        zzS();
        this.zzt.zzi().zzj();
        zzR(new zzjd(this, zzO));
    }

    @n1
    @m1
    final void zzD(zzej zzejVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i5;
        zzg();
        zza();
        zzS();
        this.zzt.zzf();
        int i6 = 0;
        int i7 = 100;
        while (i6 < 1001 && i7 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzt.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i5 = zzi.size();
            } else {
                i5 = 0;
            }
            if (abstractSafeParcelable != null && i5 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i8);
                if (abstractSafeParcelable2 instanceof zzau) {
                    try {
                        zzejVar.zzk((zzau) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e6) {
                        this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ㆠ"), e6);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlk) {
                    try {
                        zzejVar.zzt((zzlk) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e7) {
                        this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ㆡ"), e7);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzejVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e8) {
                        this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ㆢ"), e8);
                    }
                } else {
                    a.a(this.zzt, ProtectedSandApp.s("ㆣ"));
                }
            }
            i6++;
            i7 = i5;
        }
    }

    @n1
    protected final void zzE(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        this.zzt.zzay();
        zzR(new zzjp(this, true, zzO(true), this.zzt.zzi().zzn(zzacVar), new zzac(zzacVar), zzacVar));
    }

    @n1
    protected final void zzF(boolean z5) {
        zzg();
        zza();
        if (z5) {
            zzS();
            this.zzt.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzjn(this, zzO(false)));
        }
    }

    @n1
    protected final void zzG(zzir zzirVar) {
        zzg();
        zza();
        zzR(new zzjh(this, zzirVar));
    }

    @n1
    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzji(this, zzO(false), bundle));
    }

    @n1
    protected final void zzI() {
        zzg();
        zza();
        zzR(new zzjm(this, zzO(true)));
    }

    @n1
    @m1
    protected final void zzJ(zzej zzejVar) {
        zzg();
        Preconditions.checkNotNull(zzejVar);
        this.zzb = zzejVar;
        zzQ();
        zzP();
    }

    @n1
    protected final void zzK(zzlk zzlkVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzjc(this, zzO(true), this.zzt.zzi().zzp(zzlkVar), zzlkVar));
    }

    @n1
    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    @n1
    final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzt.zzv().zzm() >= ((Integer) zzeg.zzah.zza(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzN() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjz.zzN():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    final Boolean zzj() {
        return this.zzc;
    }

    @n1
    protected final void zzq() {
        zzg();
        zza();
        zzq zzO = zzO(true);
        this.zzt.zzi().zzk();
        zzR(new zzjg(this, zzO));
    }

    @n1
    final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (zzN()) {
            this.zza.zzc();
            return;
        }
        if (this.zzt.zzf().zzx()) {
            return;
        }
        this.zzt.zzay();
        PackageManager packageManager = this.zzt.zzaw().getPackageManager();
        Intent intent = new Intent();
        Context zzaw = this.zzt.zzaw();
        String s5 = ProtectedSandApp.s("ㆮ");
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent.setClassName(zzaw, s5), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            a.a(this.zzt, ProtectedSandApp.s("ㆰ"));
            return;
        }
        Intent intent2 = new Intent(ProtectedSandApp.s("ㆯ"));
        Context zzaw2 = this.zzt.zzaw();
        this.zzt.zzay();
        intent2.setComponent(new ComponentName(zzaw2, s5));
        this.zza.zzb(intent2);
    }

    @n1
    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzt.zzaw(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    @n1
    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zzjf(this, zzO(false), zzcfVar));
    }

    @n1
    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzje(this, atomicReference, zzO(false)));
    }

    @n1
    protected final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjr(this, str, str2, zzO(false), zzcfVar));
    }

    @n1
    protected final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjq(this, atomicReference, null, str2, str3, zzO(false)));
    }

    @n1
    protected final void zzx(AtomicReference atomicReference, boolean z5) {
        zzg();
        zza();
        zzR(new zzjb(this, atomicReference, zzO(false), z5));
    }

    @n1
    protected final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z5) {
        zzg();
        zza();
        zzR(new zzja(this, str, str2, zzO(false), z5, zzcfVar));
    }

    @n1
    protected final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z5) {
        zzg();
        zza();
        zzR(new zzjs(this, atomicReference, null, str2, str3, zzO(false), z5));
    }
}
