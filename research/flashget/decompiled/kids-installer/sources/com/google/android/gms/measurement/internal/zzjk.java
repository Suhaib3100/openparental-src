package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjk implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjz zzd;

    zzjk(zzjz zzjzVar, zzau zzauVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjzVar;
        this.zza = zzauVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd zzgdVar;
        zzej zzejVar;
        byte[] bArr = null;
        try {
            try {
                zzjz zzjzVar = this.zzd;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zza(ProtectedSandApp.s("ᅚ"));
                    zzgdVar = this.zzd.zzt;
                } else {
                    bArr = zzejVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzgdVar = this.zzd.zzt;
                }
            } catch (RemoteException e6) {
                this.zzd.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ᅛ"), e6);
                zzgdVar = this.zzd.zzt;
            }
            zzgdVar.zzv().zzT(this.zzc, bArr);
        } catch (Throwable th) {
            this.zzd.zzt.zzv().zzT(this.zzc, bArr);
            throw th;
        }
    }
}
