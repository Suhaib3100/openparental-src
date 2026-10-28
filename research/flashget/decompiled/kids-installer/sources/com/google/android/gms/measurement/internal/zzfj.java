package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzra;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfj implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzfk zzc;

    zzfj(zzfk zzfkVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzfkVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        zzfk zzfkVar = this.zzc;
        zzfl zzflVar = zzfkVar.zza;
        str = zzfkVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzflVar.zza.zzaB().zzg();
        Bundle bundle2 = new Bundle();
        bundle2.putString(ProtectedSandApp.s("ྜ"), str);
        try {
            bundle = zzbrVar.zzd(bundle2);
        } catch (Exception e6) {
            zzflVar.zza.zzaA().zzd().zzb(ProtectedSandApp.s("ྞ"), e6.getMessage());
        }
        if (bundle == null) {
            zzflVar.zza.zzaA().zzd().zza(ProtectedSandApp.s("ྜྷ"));
            bundle = null;
        }
        zzflVar.zza.zzaB().zzg();
        zzgd.zzO();
        if (bundle != null) {
            long j5 = bundle.getLong(ProtectedSandApp.s("ྟ"), 0L) * 1000;
            if (j5 == 0) {
                b.a(zzflVar.zza, ProtectedSandApp.s("ྠ"));
            } else {
                String string = bundle.getString(ProtectedSandApp.s("ྡ"));
                if (string == null || string.isEmpty()) {
                    a.a(zzflVar.zza, ProtectedSandApp.s("ྱ"));
                } else {
                    zzflVar.zza.zzaA().zzj().zzb(ProtectedSandApp.s("ྡྷ"), string);
                    zzlp zzv = zzflVar.zza.zzv();
                    Uri parse = Uri.parse(ProtectedSandApp.s("ྣ").concat(string));
                    zzra.zzc();
                    Bundle zzs = zzv.zzs(parse, zzflVar.zza.zzf().zzs(null, zzeg.zzaw));
                    if (zzs == null) {
                        a.a(zzflVar.zza, ProtectedSandApp.s("ྤ"));
                    } else {
                        String string2 = zzs.getString(ProtectedSandApp.s("ྥ"));
                        if (string2 != null && !ProtectedSandApp.s("ྦ").equalsIgnoreCase(string2) && !ProtectedSandApp.s("ྦྷ").equalsIgnoreCase(string2)) {
                            long j6 = bundle.getLong(ProtectedSandApp.s("ྨ"), 0L) * 1000;
                            if (j6 == 0) {
                                a.a(zzflVar.zza, ProtectedSandApp.s("ྩ"));
                            } else {
                                zzs.putLong(ProtectedSandApp.s("ྪ"), j6);
                            }
                        }
                        if (j5 == zzflVar.zza.zzm().zzd.zza()) {
                            c.a(zzflVar.zza, ProtectedSandApp.s("ྫ"));
                        }
                        if (zzflVar.zza.zzJ()) {
                            zzflVar.zza.zzm().zzd.zzb(j5);
                            zzer zzj = zzflVar.zza.zzaA().zzj();
                            String s5 = ProtectedSandApp.s("ྫྷ");
                            String s6 = ProtectedSandApp.s("ྭ");
                            zzj.zzb(s5, s6);
                            zzs.putString(ProtectedSandApp.s("ྮ"), s6);
                            zzflVar.zza.zzq().zzF(ProtectedSandApp.s("ྯ"), ProtectedSandApp.s("ྰ"), zzs, str);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzflVar.zza.zzaw(), serviceConnection);
    }
}
