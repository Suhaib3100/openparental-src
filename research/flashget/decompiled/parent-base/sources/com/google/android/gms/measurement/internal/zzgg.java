package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.measurement.internal.zzje;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzgg extends zzh {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private long zzf;
    private List<String> zzg;
    private String zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private long zzm;
    private String zzn;

    zzgg(zzhy zzhyVar, long j4) {
        super(zzhyVar);
        this.zzm = 0L;
        this.zzn = null;
        this.zzf = j4;
    }

    @n1
    @m1
    private final String zzah() {
        if (zzpz.zza() && zze().zza(zzbh.zzbr)) {
            zzj().zzp().zza(ProtectedSandApp.s("\ude31"));
            return null;
        }
        try {
            Class<?> loadClass = zza().getClassLoader().loadClass(ProtectedSandApp.s("\ude32"));
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod(ProtectedSandApp.s("\ude33"), Context.class).invoke(null, zza());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod(ProtectedSandApp.s("\ude34"), null).invoke(invoke, null);
                } catch (Exception unused) {
                    zzj().zzv().zza(ProtectedSandApp.s("\ude35"));
                    return null;
                }
            } catch (Exception unused2) {
                zzj().zzw().zza(ProtectedSandApp.s("\ude36"));
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @n1
    final int zzaa() {
        zzu();
        return this.zzi;
    }

    @n1
    final int zzab() {
        zzu();
        return this.zzc;
    }

    @n1
    final String zzac() {
        zzu();
        return this.zzk;
    }

    @n1
    final String zzad() {
        zzu();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @n1
    final String zzae() {
        zzt();
        zzu();
        Preconditions.checkNotNull(this.zzj);
        return this.zzj;
    }

    @n1
    final List<String> zzaf() {
        return this.zzg;
    }

    @n1
    final void zzag() {
        String format;
        zzt();
        if (zzk().zzo().zza(zzje.zza.zzb)) {
            byte[] bArr = new byte[16];
            zzq().zzv().nextBytes(bArr);
            format = String.format(Locale.US, ProtectedSandApp.s("\ude3b"), new BigInteger(1, bArr));
        } else {
            zzj().zzc().zza(ProtectedSandApp.s("\ude3a"));
            format = null;
        }
        zzj().zzc().zza(String.format(ProtectedSandApp.s("\ude3e"), format == null ? ProtectedSandApp.s("\ude3c") : ProtectedSandApp.s("\ude3d")));
        this.zzl = format;
        this.zzm = zzb().currentTimeMillis();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
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

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
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

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:3)(6:65|66|(1:68)(2:83|(1:85))|69|70|(4:72|(1:74)(1:81)|76|77))|4|(2:6|(16:8|9|10|(1:13)|14|(1:16)|17|18|(1:20)(1:51)|21|(1:23)|(3:25|(1:27)(1:30)|28)|31|(3:33|(1:35)(3:42|(3:45|(1:47)(1:48)|43)|49)|(2:37|38)(2:40|41))|50|(0)(0)))|64|9|10|(0)|14|(0)|17|18|(0)(0)|21|(0)|(0)|31|(0)|50|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01fc, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0221, code lost:
    
        zzj().zzg().zza(com.flashget.parentalcontrol.ProtectedSandApp.s("\ude55"), com.google.android.gms.measurement.internal.zzgo.zza(r0), r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e0 A[Catch: IllegalStateException -> 0x01fc, TryCatch #3 {IllegalStateException -> 0x01fc, blocks: (B:18:0x01b7, B:21:0x01d8, B:23:0x01e0, B:25:0x0200, B:27:0x0218, B:28:0x021d, B:30:0x021b), top: B:17:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0200 A[Catch: IllegalStateException -> 0x01fc, TryCatch #3 {IllegalStateException -> 0x01fc, blocks: (B:18:0x01b7, B:21:0x01d8, B:23:0x01e0, B:25:0x0200, B:27:0x0218, B:28:0x021d, B:30:0x021b), top: B:17:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00c1  */
    @Override // com.google.android.gms.measurement.internal.zzh
    @androidx.annotation.n1
    @mf.d({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzx() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgg.zzx():void");
    }

    @Override // com.google.android.gms.measurement.internal.zzh
    protected final boolean zzz() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0175  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.measurement.internal.zzo zza(java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgg.zza(java.lang.String):com.google.android.gms.measurement.internal.zzo");
    }

    final boolean zzb(String str) {
        String str2 = this.zzn;
        boolean z4 = (str2 == null || str2.equals(str)) ? false : true;
        this.zzn = str;
        return z4;
    }
}
