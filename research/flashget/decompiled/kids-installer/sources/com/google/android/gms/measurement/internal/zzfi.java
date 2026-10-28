package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzov;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
final class zzfi extends zzgx {
    static final Pair zza = new Pair("", 0L);
    public zzfg zzb;
    public final zzfe zzc;
    public final zzfe zzd;
    public final zzfh zze;
    public final zzfe zzf;
    public final zzfc zzg;
    public final zzfh zzh;
    public final zzfc zzi;
    public final zzfe zzj;
    public final zzfe zzk;
    public boolean zzl;
    public final zzfc zzm;
    public final zzfc zzn;
    public final zzfe zzo;
    public final zzfh zzp;
    public final zzfh zzq;
    public final zzfe zzr;
    public final zzfd zzs;
    private SharedPreferences zzu;
    private String zzv;
    private boolean zzw;
    private long zzx;

    zzfi(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzf = new zzfe(this, ProtectedSandApp.s("゜"), 1800000L);
        this.zzg = new zzfc(this, ProtectedSandApp.s("ゝ"), true);
        this.zzj = new zzfe(this, ProtectedSandApp.s("ゞ"), 0L);
        this.zzk = new zzfe(this, ProtectedSandApp.s("ゟ"), 0L);
        this.zzh = new zzfh(this, ProtectedSandApp.s("゠"), null);
        this.zzi = new zzfc(this, ProtectedSandApp.s("ァ"), false);
        this.zzc = new zzfe(this, ProtectedSandApp.s("ア"), 0L);
        this.zzd = new zzfe(this, ProtectedSandApp.s("ィ"), 0L);
        this.zze = new zzfh(this, ProtectedSandApp.s("イ"), null);
        this.zzm = new zzfc(this, ProtectedSandApp.s("ゥ"), false);
        this.zzn = new zzfc(this, ProtectedSandApp.s("ウ"), false);
        this.zzo = new zzfe(this, ProtectedSandApp.s("ェ"), 0L);
        this.zzp = new zzfh(this, ProtectedSandApp.s("エ"), null);
        this.zzq = new zzfh(this, ProtectedSandApp.s("ォ"), null);
        this.zzr = new zzfe(this, ProtectedSandApp.s("オ"), 0L);
        this.zzs = new zzfd(this, ProtectedSandApp.s("カ"), null);
    }

    @n1
    protected final SharedPreferences zza() {
        zzg();
        zzv();
        Preconditions.checkNotNull(this.zzu);
        return this.zzu;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    @n1
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    protected final void zzaC() {
        SharedPreferences sharedPreferences = this.zzt.zzaw().getSharedPreferences(ProtectedSandApp.s("ガ"), 0);
        this.zzu = sharedPreferences;
        String s5 = ProtectedSandApp.s("キ");
        boolean z5 = sharedPreferences.getBoolean(s5, false);
        this.zzl = z5;
        if (!z5) {
            SharedPreferences.Editor edit = this.zzu.edit();
            edit.putBoolean(s5, true);
            edit.apply();
        }
        this.zzt.zzf();
        this.zzb = new zzfg(this, ProtectedSandApp.s("ギ"), Math.max(0L, ((Long) zzeg.zzc.zza(null)).longValue()), null);
    }

    @n1
    final Pair zzb(String str) {
        zzg();
        zzov.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzaI) && !zzc().zzj(zzha.zza)) {
            return new Pair("", Boolean.FALSE);
        }
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        String str2 = this.zzv;
        if (str2 != null && elapsedRealtime < this.zzx) {
            return new Pair(str2, Boolean.valueOf(this.zzw));
        }
        this.zzx = this.zzt.zzf().zzi(str, zzeg.zza) + elapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
            this.zzv = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzv = id;
            }
            this.zzw = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e6) {
            this.zzt.zzaA().zzc().zzb(ProtectedSandApp.s("ク"), e6);
            this.zzv = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzv, Boolean.valueOf(this.zzw));
    }

    @n1
    final zzhb zzc() {
        zzg();
        return zzhb.zzc(zza().getString(ProtectedSandApp.s("グ"), ProtectedSandApp.s("ケ")), zza().getInt(ProtectedSandApp.s("ゲ"), 100));
    }

    @n1
    final Boolean zzd() {
        zzg();
        SharedPreferences zza2 = zza();
        String s5 = ProtectedSandApp.s("コ");
        if (zza2.contains(s5)) {
            return Boolean.valueOf(zza().getBoolean(s5, true));
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final boolean zzf() {
        return true;
    }

    @n1
    final void zzh(Boolean bool) {
        zzg();
        SharedPreferences.Editor edit = zza().edit();
        String s5 = ProtectedSandApp.s("ゴ");
        if (bool != null) {
            edit.putBoolean(s5, bool.booleanValue());
        } else {
            edit.remove(s5);
        }
        edit.apply();
    }

    @n1
    final void zzi(boolean z5) {
        zzg();
        this.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("サ"), Boolean.valueOf(z5));
        SharedPreferences.Editor edit = zza().edit();
        edit.putBoolean(ProtectedSandApp.s("ザ"), z5);
        edit.apply();
    }

    @n1
    final boolean zzj() {
        SharedPreferences sharedPreferences = this.zzu;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains(ProtectedSandApp.s("シ"));
    }

    final boolean zzk(long j5) {
        return j5 - this.zzf.zza() > this.zzj.zza();
    }

    @n1
    final boolean zzl(int i5) {
        return zzhb.zzk(i5, zza().getInt(ProtectedSandApp.s("ジ"), 100));
    }
}
