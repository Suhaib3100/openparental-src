package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.e1;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.w0;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzag extends zzgw {
    private Boolean zza;
    private zzaf zzb;
    private Boolean zzc;

    zzag(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzb = new zzaf() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // com.google.android.gms.measurement.internal.zzaf
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzeg.zzD.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName(ProtectedSandApp.s("⑱")).getMethod(ProtectedSandApp.s("⑲"), String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e6) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⑶"), e6);
            return "";
        } catch (IllegalAccessException e7) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⑴"), e7);
            return "";
        } catch (NoSuchMethodException e8) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⑵"), e8);
            return "";
        } catch (InvocationTargetException e9) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⑳"), e9);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzeg.zzd.zza(null)).longValue();
    }

    @n1
    public final double zza(String str, zzef zzefVar) {
        if (str == null) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
        String zza = this.zzb.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzefVar.zza(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
    }

    final int zzb(@e1(min = 1) String str) {
        return zzf(str, zzeg.zzH, w0.f17634f, 2000);
    }

    public final int zzc() {
        return this.zzt.zzv().zzai(201500000, true) ? 100 : 25;
    }

    public final int zzd(@e1(min = 1) String str) {
        return zzf(str, zzeg.zzI, 25, 100);
    }

    @n1
    public final int zze(String str, zzef zzefVar) {
        if (str == null) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
        String zza = this.zzb.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzefVar.zza(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
    }

    @n1
    public final int zzf(String str, zzef zzefVar, int i5, int i6) {
        return Math.max(Math.min(zze(str, zzefVar), i6), i5);
    }

    public final long zzh() {
        this.zzt.zzay();
        return 79000L;
    }

    @n1
    public final long zzi(String str, zzef zzefVar) {
        if (str == null) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
        String zza = this.zzb.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzefVar.zza(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
    }

    @m1
    final Bundle zzj() {
        try {
            if (this.zzt.zzaw().getPackageManager() == null) {
                this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("⑷"));
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzt.zzaw()).getApplicationInfo(this.zzt.zzaw().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("⑸"));
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⑹"), e6);
            return null;
        }
    }

    @m1
    final Boolean zzk(@e1(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            a.a(this.zzt, ProtectedSandApp.s("⑺"));
            return null;
        }
        if (zzj.containsKey(str)) {
            return Boolean.valueOf(zzj.getBoolean(str));
        }
        return null;
    }

    public final String zzl() {
        return zzB(ProtectedSandApp.s("⑻"), "");
    }

    public final String zzm() {
        return zzB(ProtectedSandApp.s("⑼"), "");
    }

    final String zzn() {
        this.zzt.zzay();
        return ProtectedSandApp.s("⑽");
    }

    @n1
    public final String zzo(String str, zzef zzefVar) {
        return str == null ? (String) zzefVar.zza(null) : (String) zzefVar.zza(this.zzb.zza(str, zzefVar.zzb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List zzp(@androidx.annotation.e1(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "⑾"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzj()
            r1 = 0
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.zzgd r4 = r3.zzt
            java.lang.String r0 = "⑿"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            com.google.android.gms.measurement.internal.a.a(r4, r0)
            goto L22
        L1c:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
        L22:
            r4 = r1
            goto L2c
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L5c
            com.google.android.gms.measurement.internal.zzgd r0 = r3.zzt     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.zzaw()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzgd r0 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzd()
            java.lang.String r2 = "⒀"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r0.zzb(r2, r4)
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.zzp(java.lang.String):java.util.List");
    }

    final void zzq(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public final boolean zzr() {
        Boolean zzk = zzk(ProtectedSandApp.s("⒁"));
        return zzk == null || zzk.booleanValue();
    }

    @n1
    public final boolean zzs(String str, zzef zzefVar) {
        if (str == null) {
            return ((Boolean) zzefVar.zza(null)).booleanValue();
        }
        String zza = this.zzb.zza(str, zzefVar.zzb());
        return TextUtils.isEmpty(zza) ? ((Boolean) zzefVar.zza(null)).booleanValue() : ((Boolean) zzefVar.zza(Boolean.valueOf(ProtectedSandApp.s("⒂").equals(zza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return ProtectedSandApp.s("⒄").equals(this.zzb.zza(str, ProtectedSandApp.s("⒃")));
    }

    public final boolean zzu() {
        Boolean zzk = zzk(ProtectedSandApp.s("⒅"));
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzt.zzay();
        Boolean zzk = zzk(ProtectedSandApp.s("⒆"));
        return zzk != null && zzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return ProtectedSandApp.s("⒈").equals(this.zzb.zza(str, ProtectedSandApp.s("⒇")));
    }

    @n1
    final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk(ProtectedSandApp.s("⒉"));
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzt.zzN();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = this.zzt.zzaw().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z5 = false;
                        if (str != null && str.equals(myProcessName)) {
                            z5 = true;
                        }
                        this.zzc = Boolean.valueOf(z5);
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("⒊"));
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
