package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.e1;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import mf.d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzag extends zzja {
    private Boolean zza;
    private String zzb;
    private zzai zzc;
    private Boolean zzd;

    zzag(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzc = new zzai() { // from class: com.google.android.gms.measurement.internal.zzaf
            @Override // com.google.android.gms.measurement.internal.zzai
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    @m1
    private final Bundle zzaa() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().zzg().zza(ProtectedSandApp.s("\udb75"));
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(zza().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzj().zzg().zza(ProtectedSandApp.s("\udb76"));
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udb77"), e4);
            return null;
        }
    }

    public static long zzg() {
        return zzbh.zzd.zza(null).longValue();
    }

    public static long zzh() {
        return zzbh.zzk.zza(null).intValue();
    }

    public static long zzm() {
        return zzbh.zzae.zza(null).longValue();
    }

    public static long zzn() {
        return zzbh.zzz.zza(null).longValue();
    }

    @n1
    public final double zza(String str, zzfz<Double> zzfzVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfzVar.zza(null).doubleValue();
        }
        String zza = this.zzc.zza(str, zzfzVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfzVar.zza(null).doubleValue();
        }
        try {
            return zzfzVar.zza(Double.valueOf(Double.parseDouble(zza))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzfzVar.zza(null).doubleValue();
        }
    }

    final int zzb(String str, boolean z4) {
        return Math.max(zza(str, z4), 256);
    }

    public final int zzc() {
        return zzq().zza(201500000, true) ? 100 : 25;
    }

    @n1
    final long zzd(String str) {
        return zzc(str, zzbh.zza);
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

    public final String zzo() {
        return zza(ProtectedSandApp.s("\udb7f"), "");
    }

    public final String zzp() {
        return zza(ProtectedSandApp.s("\udb80"), "");
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

    public final String zzu() {
        return this.zzb;
    }

    public final boolean zzv() {
        Boolean zze = zze(ProtectedSandApp.s("\udb81"));
        return zze == null || zze.booleanValue();
    }

    public final boolean zzw() {
        Boolean zze = zze(ProtectedSandApp.s("\udb82"));
        return zze == null || zze.booleanValue();
    }

    public final boolean zzx() {
        Boolean zze = zze(ProtectedSandApp.s("\udb83"));
        return zze != null && zze.booleanValue();
    }

    @n1
    final boolean zzy() {
        if (this.zza == null) {
            Boolean zze = zze(ProtectedSandApp.s("\udb84"));
            this.zza = zze;
            if (zze == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzag();
    }

    @d({"this.isMainProcess"})
    public final boolean zzz() {
        if (this.zzd == null) {
            synchronized (this) {
                try {
                    if (this.zzd == null) {
                        ApplicationInfo applicationInfo = zza().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.zzd = Boolean.valueOf(str != null && str.equals(myProcessName));
                        }
                        if (this.zzd == null) {
                            this.zzd = Boolean.TRUE;
                            zzj().zzg().zza(ProtectedSandApp.s("\udb85"));
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzd.booleanValue();
    }

    public final int zzb(@e1(min = 1) String str) {
        return zza(str, zzbh.zzak, 25, 100);
    }

    @n1
    public final int zzc(@e1(min = 1) String str) {
        return zzb(str, zzbh.zzo);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @m1
    final Boolean zze(@e1(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzaa = zzaa();
        if (zzaa == null) {
            zzj().zzg().zza(ProtectedSandApp.s("\udb78"));
            return null;
        }
        if (zzaa.containsKey(str)) {
            return Boolean.valueOf(zzaa.getBoolean(str));
        }
        return null;
    }

    @n1
    final String zzf(String str) {
        return zzd(str, zzbh.zzan);
    }

    @n1
    final boolean zzi(String str) {
        return zzf(str, zzbh.zzam);
    }

    public final boolean zzj(String str) {
        return ProtectedSandApp.s("\udb7b").equals(this.zzc.zza(str, ProtectedSandApp.s("\udb7d")));
    }

    public final boolean zzk(String str) {
        return ProtectedSandApp.s("\udb7b").equals(this.zzc.zza(str, ProtectedSandApp.s("\udb7e")));
    }

    @n1
    public final int zzb(String str, zzfz<Integer> zzfzVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfzVar.zza(null).intValue();
        }
        String zza = this.zzc.zza(str, zzfzVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfzVar.zza(null).intValue();
        }
        try {
            return zzfzVar.zza(Integer.valueOf(Integer.parseInt(zza))).intValue();
        } catch (NumberFormatException unused) {
            return zzfzVar.zza(null).intValue();
        }
    }

    @n1
    public final long zzc(String str, zzfz<Long> zzfzVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfzVar.zza(null).longValue();
        }
        String zza = this.zzc.zza(str, zzfzVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfzVar.zza(null).longValue();
        }
        try {
            return zzfzVar.zza(Long.valueOf(Long.parseLong(zza))).longValue();
        } catch (NumberFormatException unused) {
            return zzfzVar.zza(null).longValue();
        }
    }

    @n1
    public final String zzd(String str, zzfz<String> zzfzVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfzVar.zza(null);
        }
        return zzfzVar.zza(this.zzc.zza(str, zzfzVar.zza()));
    }

    @n1
    public final boolean zzf(String str, zzfz<Boolean> zzfzVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfzVar.zza(null).booleanValue();
        }
        String zza = this.zzc.zza(str, zzfzVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfzVar.zza(null).booleanValue();
        }
        return zzfzVar.zza(Boolean.valueOf(ProtectedSandApp.s("\udb7b").equals(zza))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List<java.lang.String> zzg(@androidx.annotation.e1(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzaa()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzgo r4 = r3.zzj()
            com.google.android.gms.measurement.internal.zzgq r4 = r4.zzg()
            java.lang.String r0 = "\udb78"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r4.zza(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 != 0) goto L2f
            return r1
        L2f:
            android.content.Context r0 = r3.zza()     // Catch: android.content.res.Resources.NotFoundException -> L47
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L47
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L47
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L47
            if (r4 != 0) goto L42
            return r1
        L42:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L47
            return r4
        L47:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzgo r0 = r3.zzj()
            com.google.android.gms.measurement.internal.zzgq r0 = r0.zzg()
            java.lang.String r2 = "\udb7c"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r0.zza(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.zzg(java.lang.String):java.util.List");
    }

    public final void zzh(String str) {
        this.zzb = str;
    }

    public final boolean zze(String str, zzfz<Boolean> zzfzVar) {
        return zzf(str, zzfzVar);
    }

    final int zza(@e1(min = 1) String str) {
        return zza(str, zzbh.zzaj, 500, 2000);
    }

    final int zza(String str, boolean z4) {
        if (z4) {
            return zza(str, zzbh.zzat, 100, 500);
        }
        return 500;
    }

    @n1
    public final int zza(String str, zzfz<Integer> zzfzVar, int i4, int i5) {
        return Math.max(Math.min(zzb(str, zzfzVar), i5), i4);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final zzjh zzc(String str, boolean z4) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        Bundle zzaa = zzaa();
        if (zzaa == null) {
            zzj().zzg().zza(ProtectedSandApp.s("\udb78"));
            obj = null;
        } else {
            obj = zzaa.get(str);
        }
        if (obj == null) {
            return zzjh.zza;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzjh.zzd;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzjh.zzc;
        }
        if (z4 && ProtectedSandApp.s("\udb79").equals(obj)) {
            return zzjh.zzb;
        }
        zzj().zzu().zza(ProtectedSandApp.s("\udb7a"), str);
        return zzjh.zza;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    private final String zza(String str, String str2) {
        try {
            String str3 = (String) Class.forName(ProtectedSandApp.s("\udb6f")).getMethod(ProtectedSandApp.s("\udb70"), String.class, String.class).invoke(null, str, str2);
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e4) {
            zzj().zzg().zza(ProtectedSandApp.s("\udb74"), e4);
            return str2;
        } catch (IllegalAccessException e5) {
            zzj().zzg().zza(ProtectedSandApp.s("\udb72"), e5);
            return str2;
        } catch (NoSuchMethodException e6) {
            zzj().zzg().zza(ProtectedSandApp.s("\udb73"), e6);
            return str2;
        } catch (InvocationTargetException e7) {
            zzj().zzg().zza(ProtectedSandApp.s("\udb71"), e7);
            return str2;
        }
    }

    final void zza(zzai zzaiVar) {
        this.zzc = zzaiVar;
    }

    public final boolean zza(zzfz<Boolean> zzfzVar) {
        return zzf(null, zzfzVar);
    }
}
