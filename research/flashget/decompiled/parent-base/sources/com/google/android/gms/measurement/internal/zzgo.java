package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import mf.d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzgo extends zzjd {
    private char zza;
    private long zzb;

    @b0("this")
    private String zzc;
    private final zzgq zzd;
    private final zzgq zze;
    private final zzgq zzf;
    private final zzgq zzg;
    private final zzgq zzh;
    private final zzgq zzi;
    private final zzgq zzj;
    private final zzgq zzk;
    private final zzgq zzl;

    zzgo(zzhy zzhyVar) {
        super(zzhyVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgq(this, 6, false, false);
        this.zze = new zzgq(this, 6, true, false);
        this.zzf = new zzgq(this, 6, false, true);
        this.zzg = new zzgq(this, 5, false, false);
        this.zzh = new zzgq(this, 5, true, false);
        this.zzi = new zzgq(this, 5, false, true);
        this.zzj = new zzgq(this, 4, false, false);
        this.zzk = new zzgq(this, 3, false, false);
        this.zzl = new zzgq(this, 2, false, false);
    }

    @d({"logTagDoNotUseDirectly"})
    @m1
    private final String zzy() {
        String str;
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzu.zzw() != null ? this.zzu.zzw() : ProtectedSandApp.s("\ude79");
                }
                Preconditions.checkNotNull(this.zzc);
                str = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final zzgq zzc() {
        return this.zzk;
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

    public final zzgq zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return false;
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

    public final zzgq zzm() {
        return this.zzf;
    }

    public final zzgq zzn() {
        return this.zze;
    }

    public final zzgq zzo() {
        return this.zzj;
    }

    public final zzgq zzp() {
        return this.zzl;
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

    public final zzgq zzu() {
        return this.zzg;
    }

    public final zzgq zzv() {
        return this.zzi;
    }

    public final zzgq zzw() {
        return this.zzh;
    }

    public final String zzx() {
        Pair<String, Long> zza;
        if (zzk().zzb == null || (zza = zzk().zzb.zza()) == null || zza == zzha.zza) {
            return null;
        }
        return z3.a(String.valueOf(zza.second), ProtectedSandApp.s("\ude7c"), (String) zza.first);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @m1
    private static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return (com.google.android.gms.internal.measurement.zzok.zza() && zzbh.zzcg.zza(null).booleanValue()) ? "" : str;
        }
        return str.substring(0, lastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    protected static Object zza(String str) {
        if (str == null) {
            return null;
        }
        return new zzgp(str);
    }

    static String zza(boolean z4, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zza = zza(z4, obj);
        String zza2 = zza(z4, obj2);
        String zza3 = zza(z4, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ProtectedSandApp.s("\ude77");
        }
        boolean isEmpty = TextUtils.isEmpty(zza);
        String s4 = ProtectedSandApp.s("\ude78");
        if (!isEmpty) {
            sb.append(str2);
            sb.append(zza);
            str2 = s4;
        }
        if (TextUtils.isEmpty(zza2)) {
            s4 = str2;
        } else {
            sb.append(str2);
            sb.append(zza2);
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(s4);
            sb.append(zza3);
        }
        return sb.toString();
    }

    @m1
    private static String zza(boolean z4, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        boolean z5 = obj instanceof Long;
        String s4 = ProtectedSandApp.s("\ude75");
        int i4 = 0;
        if (z5) {
            if (!z4) {
                return String.valueOf(obj);
            }
            Long l4 = (Long) obj;
            if (Math.abs(l4.longValue()) >= 100) {
                String str2 = String.valueOf(obj).charAt(0) == '-' ? s4 : "";
                String valueOf = String.valueOf(Math.abs(l4.longValue()));
                return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + ProtectedSandApp.s("\ude76") + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            }
            return String.valueOf(obj);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z4 ? th.getClass().getName() : th.toString());
            String zzb = zzb(zzhy.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i4];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzb(className).equals(zzb)) {
                    sb.append(ProtectedSandApp.s("\ude77"));
                    sb.append(stackTraceElement);
                    break;
                }
                i4++;
            }
            return sb.toString();
        }
        if (!(obj instanceof zzgp)) {
            return z4 ? s4 : String.valueOf(obj);
        }
        str = ((zzgp) obj).zza;
        return str;
    }

    protected final void zza(int i4, boolean z4, boolean z5, String str, Object obj, Object obj2, Object obj3) {
        if (!z4 && zza(i4)) {
            zza(i4, zza(false, str, obj, obj2, obj3));
        }
        if (z5 || i4 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhv zzo = this.zzu.zzo();
        if (zzo == null) {
            zza(6, ProtectedSandApp.s("\ude7a"));
            return;
        }
        if (!zzo.zzaf()) {
            zza(6, ProtectedSandApp.s("\ude7b"));
            return;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 >= 9) {
            i4 = 8;
        }
        zzo.zzb(new zzgn(this, i4, str, obj, obj2, obj3));
    }

    @m1
    protected final void zza(int i4, String str) {
        Log.println(i4, zzy(), str);
    }

    @m1
    protected final boolean zza(int i4) {
        return Log.isLoggable(zzy(), i4);
    }
}
