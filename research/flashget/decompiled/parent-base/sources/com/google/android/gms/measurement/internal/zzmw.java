package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzmw extends zznr {
    public final zzhb zza;
    public final zzhb zzb;
    public final zzhb zzc;
    public final zzhb zzd;
    public final zzhb zze;
    public final zzhb zzf;
    private final Map<String, zzmv> zzh;

    zzmw(zznv zznvVar) {
        super(zznvVar);
        this.zzh = new HashMap();
        zzha zzk = zzk();
        Objects.requireNonNull(zzk);
        this.zza = new zzhb(zzk, ProtectedSandApp.s("\ue1e1"), 0L);
        zzha zzk2 = zzk();
        Objects.requireNonNull(zzk2);
        this.zzb = new zzhb(zzk2, ProtectedSandApp.s("\ue1e2"), 0L);
        zzha zzk3 = zzk();
        Objects.requireNonNull(zzk3);
        this.zzc = new zzhb(zzk3, ProtectedSandApp.s("\ue1e3"), 0L);
        zzha zzk4 = zzk();
        Objects.requireNonNull(zzk4);
        this.zzd = new zzhb(zzk4, ProtectedSandApp.s("\ue1e4"), 0L);
        zzha zzk5 = zzk();
        Objects.requireNonNull(zzk5);
        this.zze = new zzhb(zzk5, ProtectedSandApp.s("\ue1e5"), 0L);
        zzha zzk6 = zzk();
        Objects.requireNonNull(zzk6);
        this.zzf = new zzhb(zzk6, ProtectedSandApp.s("\ue1e6"), 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzoo g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzal zzh() {
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

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzhl zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzmw zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zznu zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @n1
    @Deprecated
    private final Pair<String, Boolean> zza(String str) {
        zzmv zzmvVar;
        AdvertisingIdClient.Info info;
        zzt();
        long elapsedRealtime = zzb().elapsedRealtime();
        zzmv zzmvVar2 = this.zzh.get(str);
        if (zzmvVar2 != null && elapsedRealtime < zzmvVar2.zzc) {
            return new Pair<>(zzmvVar2.zza, Boolean.valueOf(zzmvVar2.zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long zzd = zze().zzd(str) + elapsedRealtime;
        try {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            } catch (PackageManager.NameNotFoundException unused) {
                if (zzmvVar2 != null && elapsedRealtime < zzmvVar2.zzc + zze().zzc(str, zzbh.zzb)) {
                    return new Pair<>(zzmvVar2.zza, Boolean.valueOf(zzmvVar2.zzb));
                }
                info = null;
            }
        } catch (Exception e4) {
            zzj().zzc().zza(ProtectedSandApp.s("\ue1e8"), e4);
            zzmvVar = new zzmv("", false, zzd);
        }
        if (info == null) {
            return new Pair<>(ProtectedSandApp.s("\ue1e7"), Boolean.FALSE);
        }
        String id2 = info.getId();
        zzmvVar = id2 != null ? new zzmv(id2, info.isLimitAdTrackingEnabled(), zzd) : new zzmv("", info.isLimitAdTrackingEnabled(), zzd);
        this.zzh.put(str, zzmvVar);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(zzmvVar.zza, Boolean.valueOf(zzmvVar.zzb));
    }

    @n1
    final Pair<String, Boolean> zza(String str, zzje zzjeVar) {
        if (zzjeVar.zzg()) {
            return zza(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    @n1
    @Deprecated
    final String zza(String str, boolean z4) {
        String s4;
        zzt();
        if (z4) {
            s4 = (String) zza(str).first;
        } else {
            s4 = ProtectedSandApp.s("\ue1e7");
        }
        MessageDigest zzu = zzos.zzu();
        if (zzu == null) {
            return null;
        }
        return String.format(Locale.US, ProtectedSandApp.s("\ue1e9"), new BigInteger(1, zzu.digest(s4.getBytes())));
    }
}
