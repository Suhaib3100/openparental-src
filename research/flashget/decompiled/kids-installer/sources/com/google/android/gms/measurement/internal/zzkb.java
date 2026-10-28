package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzkb extends zzku {
    public final zzfe zza;
    public final zzfe zzb;
    public final zzfe zzc;
    public final zzfe zzd;
    public final zzfe zze;
    private final Map zzg;

    zzkb(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzg = new HashMap();
        zzfi zzm = this.zzt.zzm();
        zzm.getClass();
        this.zza = new zzfe(zzm, ProtectedSandApp.s("ㆱ"), 0L);
        zzfi zzm2 = this.zzt.zzm();
        zzm2.getClass();
        this.zzb = new zzfe(zzm2, ProtectedSandApp.s("ㆲ"), 0L);
        zzfi zzm3 = this.zzt.zzm();
        zzm3.getClass();
        this.zzc = new zzfe(zzm3, ProtectedSandApp.s("ㆳ"), 0L);
        zzfi zzm4 = this.zzt.zzm();
        zzm4.getClass();
        this.zzd = new zzfe(zzm4, ProtectedSandApp.s("ㆴ"), 0L);
        zzfi zzm5 = this.zzt.zzm();
        zzm5.getClass();
        this.zze = new zzfe(zzm5, ProtectedSandApp.s("ㆵ"), 0L);
    }

    @n1
    @Deprecated
    final Pair zza(String str) {
        zzka zzkaVar;
        AdvertisingIdClient.Info info;
        zzg();
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        zzka zzkaVar2 = (zzka) this.zzg.get(str);
        if (zzkaVar2 != null && elapsedRealtime < zzkaVar2.zzc) {
            return new Pair(zzkaVar2.zza, Boolean.valueOf(zzkaVar2.zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long zzi = this.zzt.zzf().zzi(str, zzeg.zza) + elapsedRealtime;
        try {
            long zzi2 = this.zzt.zzf().zzi(str, zzeg.zzb);
            if (zzi2 > 0) {
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (zzkaVar2 != null && elapsedRealtime < zzkaVar2.zzc + zzi2) {
                        return new Pair(zzkaVar2.zza, Boolean.valueOf(zzkaVar2.zzb));
                    }
                    info = null;
                }
            } else {
                info = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
            }
        } catch (Exception e6) {
            this.zzt.zzaA().zzc().zzb(ProtectedSandApp.s("ㆷ"), e6);
            zzkaVar = new zzka("", false, zzi);
        }
        if (info == null) {
            return new Pair(ProtectedSandApp.s("ㆶ"), Boolean.FALSE);
        }
        String id = info.getId();
        zzkaVar = id != null ? new zzka(id, info.isLimitAdTrackingEnabled(), zzi) : new zzka("", info.isLimitAdTrackingEnabled(), zzi);
        this.zzg.put(str, zzkaVar);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(zzkaVar.zza, Boolean.valueOf(zzkaVar.zzb));
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    protected final boolean zzb() {
        return false;
    }

    @n1
    final Pair zzd(String str, zzhb zzhbVar) {
        return zzhbVar.zzj(zzha.zza) ? zza(str) : new Pair("", Boolean.FALSE);
    }

    @n1
    @Deprecated
    final String zzf(String str, boolean z5) {
        zzg();
        String s5 = z5 ? (String) zza(str).first : ProtectedSandApp.s("ㆸ");
        MessageDigest zzF = zzlp.zzF();
        if (zzF == null) {
            return null;
        }
        return String.format(Locale.US, ProtectedSandApp.s("ㆹ"), new BigInteger(1, zzF.digest(s5.getBytes())));
    }
}
