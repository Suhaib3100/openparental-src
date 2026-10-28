package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzrd;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzkw extends zzkt {
    zzkw(zzlh zzlhVar) {
        super(zzlhVar);
    }

    private final String zzd(String str) {
        String zzi = this.zzf.zzm().zzi(str);
        if (TextUtils.isEmpty(zzi)) {
            return (String) zzeg.zzq.zza(null);
        }
        Uri parse = Uri.parse((String) zzeg.zzq.zza(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(zzi + ProtectedSandApp.s("㇊") + parse.getAuthority());
        return buildUpon.build().toString();
    }

    public final zzkv zza(String str) {
        zzrd.zzc();
        zzkv zzkvVar = null;
        if (this.zzt.zzf().zzs(null, zzeg.zzaq)) {
            c.a(this.zzt, ProtectedSandApp.s("㇋"));
            zzh zzj = this.zzf.zzh().zzj(str);
            if (zzj == null) {
                return new zzkv(zzd(str));
            }
            if (zzj.zzap()) {
                c.a(this.zzt, ProtectedSandApp.s("㇌"));
                com.google.android.gms.internal.measurement.zzff zze = this.zzf.zzm().zze(zzj.zzv());
                if (zze != null) {
                    String zzj2 = zze.zzj();
                    if (!TextUtils.isEmpty(zzj2)) {
                        String zzi = zze.zzi();
                        this.zzt.zzaA().zzj().zzc(ProtectedSandApp.s("㇏"), zzj2, true != TextUtils.isEmpty(zzi) ? ProtectedSandApp.s("㇍") : ProtectedSandApp.s("㇎"));
                        if (TextUtils.isEmpty(zzi)) {
                            this.zzt.zzay();
                            zzkvVar = new zzkv(zzj2);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put(ProtectedSandApp.s("㇐"), zzi);
                            zzkvVar = new zzkv(zzj2, hashMap);
                        }
                    }
                }
            }
            if (zzkvVar != null) {
                return zzkvVar;
            }
        }
        return new zzkv(zzd(str));
    }
}
