package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzeq implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzet zzf;

    zzeq(zzet zzetVar, int i5, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzetVar;
        this.zza = i5;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c6;
        long j5;
        char c7;
        long j6;
        zzfi zzm = this.zzf.zzt.zzm();
        if (!zzm.zzy()) {
            Log.println(6, this.zzf.zzr(), ProtectedSandApp.s("ཱུ"));
            return;
        }
        zzet zzetVar = this.zzf;
        c6 = zzetVar.zza;
        if (c6 == 0) {
            if (zzetVar.zzt.zzf().zzy()) {
                zzet zzetVar2 = this.zzf;
                zzetVar2.zzt.zzay();
                zzetVar2.zza = 'C';
            } else {
                zzet zzetVar3 = this.zzf;
                zzetVar3.zzt.zzay();
                zzetVar3.zza = 'c';
            }
        }
        zzet zzetVar4 = this.zzf;
        j5 = zzetVar4.zzb;
        if (j5 < 0) {
            zzetVar4.zzt.zzf().zzh();
            zzetVar4.zzb = 79000L;
        }
        char charAt = ProtectedSandApp.s("ི").charAt(this.zza);
        zzet zzetVar5 = this.zzf;
        c7 = zzetVar5.zza;
        j6 = zzetVar5.zzb;
        String zzo = zzet.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ཱི"));
        sb.append(charAt);
        sb.append(c7);
        sb.append(j6);
        String a6 = androidx.concurrent.futures.a.a(sb, ProtectedSandApp.s("ུ"), zzo);
        if (a6.length() > 1024) {
            a6 = this.zzb.substring(0, 1024);
        }
        zzfg zzfgVar = zzm.zzb;
        if (zzfgVar != null) {
            zzfgVar.zzb(a6, 1L);
        }
    }
}
