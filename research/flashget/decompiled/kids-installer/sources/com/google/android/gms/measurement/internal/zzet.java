package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpe;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzet extends zzgx {
    private char zza;
    private long zzb;

    @b0("this")
    private String zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final zzer zzj;
    private final zzer zzk;
    private final zzer zzl;

    zzet(zzgd zzgdVar) {
        super(zzgdVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzer(this, 6, false, false);
        this.zze = new zzer(this, 6, true, false);
        this.zzf = new zzer(this, 6, false, true);
        this.zzg = new zzer(this, 5, false, false);
        this.zzh = new zzer(this, 5, true, false);
        this.zzi = new zzer(this, 5, false, true);
        this.zzj = new zzer(this, 4, false, false);
        this.zzk = new zzer(this, 3, false, false);
        this.zzl = new zzer(this, 2, false, false);
    }

    protected static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzes(str);
    }

    static String zzo(boolean z5, String str, Object obj, Object obj2, Object obj3) {
        String zzp = zzp(z5, obj);
        String zzp2 = zzp(z5, obj2);
        String zzp3 = zzp(z5, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ProtectedSandApp.s("ゔ");
        }
        boolean isEmpty = TextUtils.isEmpty(zzp);
        String s5 = ProtectedSandApp.s("ゕ");
        if (!isEmpty) {
            sb.append(str2);
            sb.append(zzp);
            str2 = s5;
        }
        if (TextUtils.isEmpty(zzp2)) {
            s5 = str2;
        } else {
            sb.append(str2);
            sb.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb.append(s5);
            sb.append(zzp3);
        }
        return sb.toString();
    }

    @m1
    static String zzp(boolean z5, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        boolean z6 = obj instanceof Long;
        String s5 = ProtectedSandApp.s("ゖ");
        int i5 = 0;
        if (z6) {
            if (!z5) {
                return obj.toString();
            }
            Long l5 = (Long) obj;
            if (Math.abs(l5.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l5.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            String str2 = charAt == '-' ? s5 : "";
            sb.append(str2);
            sb.append(round);
            sb.append(ProtectedSandApp.s("\u3097"));
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof zzes)) {
                return z5 ? s5 : obj.toString();
            }
            str = ((zzes) obj).zza;
            return str;
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z5 ? th.getClass().getName() : th.toString());
        String zzq = zzq(zzgd.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i5];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(zzq)) {
                sb2.append(ProtectedSandApp.s("\u3098"));
                sb2.append(stackTraceElement);
                break;
            }
            i5++;
        }
        return sb2.toString();
    }

    @m1
    static String zzq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        zzpe.zzc();
        return ((Boolean) zzeg.zzay.zza(null)).booleanValue() ? "" : str;
    }

    public final zzer zzc() {
        return this.zzk;
    }

    public final zzer zzd() {
        return this.zzd;
    }

    public final zzer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final boolean zzf() {
        return false;
    }

    public final zzer zzh() {
        return this.zze;
    }

    public final zzer zzi() {
        return this.zzj;
    }

    public final zzer zzj() {
        return this.zzl;
    }

    public final zzer zzk() {
        return this.zzg;
    }

    public final zzer zzl() {
        return this.zzi;
    }

    public final zzer zzm() {
        return this.zzh;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @m1
    protected final String zzr() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzt.zzy() != null) {
                    this.zzc = this.zzt.zzy();
                } else {
                    this.zzc = this.zzt.zzf().zzn();
                }
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    protected final void zzu(int i5, boolean z5, boolean z6, String str, Object obj, Object obj2, Object obj3) {
        if (!z5 && Log.isLoggable(zzr(), i5)) {
            Log.println(i5, zzr(), zzo(false, str, obj, obj2, obj3));
        }
        if (z6 || i5 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzga zzo = this.zzt.zzo();
        if (zzo == null) {
            Log.println(6, zzr(), ProtectedSandApp.s("゙"));
        } else {
            if (!zzo.zzy()) {
                Log.println(6, zzr(), ProtectedSandApp.s("゚"));
                return;
            }
            if (i5 >= 9) {
                i5 = 8;
            }
            zzo.zzp(new zzeq(this, i5, str, obj, obj2, obj3));
        }
    }
}
