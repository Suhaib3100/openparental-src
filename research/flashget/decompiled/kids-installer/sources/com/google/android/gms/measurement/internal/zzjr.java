package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjr implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzd;
    final /* synthetic */ zzjz zze;

    zzjr(zzjz zzjzVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zze = zzjzVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd zzgdVar;
        zzej zzejVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjz zzjzVar = this.zze;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("ᅤ"), this.zza, this.zzb);
                    zzgdVar = this.zze.zzt;
                } else {
                    Preconditions.checkNotNull(this.zzc);
                    arrayList = zzlp.zzH(zzejVar.zzf(this.zza, this.zzb, this.zzc));
                    this.zze.zzQ();
                    zzgdVar = this.zze.zzt;
                }
            } catch (RemoteException e6) {
                this.zze.zzt.zzaA().zzd().zzd(ProtectedSandApp.s("ᅥ"), this.zza, this.zzb, e6);
                zzgdVar = this.zze.zzt;
            }
            zzgdVar.zzv().zzR(this.zzd, arrayList);
        } catch (Throwable th) {
            this.zze.zzt.zzv().zzR(this.zzd, arrayList);
            throw th;
        }
    }
}
