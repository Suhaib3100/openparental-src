package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.b0;
import androidx.annotation.l0;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
public final class zziz extends zzf {

    @m1
    protected zzir zza;
    private volatile zzir zzb;
    private volatile zzir zzc;
    private final Map zzd;

    @b0("activityLock")
    private Activity zze;

    @b0("activityLock")
    private volatile boolean zzf;
    private volatile zzir zzg;
    private zzir zzh;

    @b0("activityLock")
    private boolean zzi;
    private final Object zzj;

    public zziz(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzA(zzir zzirVar, zzir zzirVar2, long j5, boolean z5, Bundle bundle) {
        long j6;
        long j7;
        zzg();
        boolean z6 = false;
        boolean z7 = (zzirVar2 != null && zzirVar2.zzc == zzirVar.zzc && zzis.zza(zzirVar2.zzb, zzirVar.zzb) && zzis.zza(zzirVar2.zza, zzirVar.zza)) ? false : true;
        if (z5 && this.zza != null) {
            z6 = true;
        }
        if (z7) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlp.zzK(zzirVar, bundle2, true);
            if (zzirVar2 != null) {
                String str = zzirVar2.zza;
                if (str != null) {
                    bundle2.putString(ProtectedSandApp.s("ㅰ"), str);
                }
                String str2 = zzirVar2.zzb;
                if (str2 != null) {
                    bundle2.putString(ProtectedSandApp.s("ㅱ"), str2);
                }
                bundle2.putLong(ProtectedSandApp.s("ㅲ"), zzirVar2.zzc);
            }
            if (z6) {
                zzkn zzknVar = this.zzt.zzu().zzb;
                long j8 = j5 - zzknVar.zzb;
                zzknVar.zzb = j5;
                if (j8 > 0) {
                    this.zzt.zzv().zzI(bundle2, j8);
                }
            }
            if (!this.zzt.zzf().zzu()) {
                bundle2.putLong(ProtectedSandApp.s("ㅳ"), 1L);
            }
            String s5 = true != zzirVar.zze ? ProtectedSandApp.s("ㅴ") : ProtectedSandApp.s("ㅵ");
            long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
            if (zzirVar.zze) {
                j6 = currentTimeMillis;
                long j9 = zzirVar.zzf;
                if (j9 != 0) {
                    j7 = j9;
                    this.zzt.zzq().zzH(s5, ProtectedSandApp.s("ㅶ"), j7, bundle2);
                }
            } else {
                j6 = currentTimeMillis;
            }
            j7 = j6;
            this.zzt.zzq().zzH(s5, ProtectedSandApp.s("ㅶ"), j7, bundle2);
        }
        if (z6) {
            zzB(this.zza, true, j5);
        }
        this.zza = zzirVar;
        if (zzirVar.zze) {
            this.zzh = zzirVar;
        }
        this.zzt.zzt().zzG(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzB(zzir zzirVar, boolean z5, long j5) {
        this.zzt.zzd().zzf(this.zzt.zzax().elapsedRealtime());
        if (!this.zzt.zzu().zzb.zzd(zzirVar != null && zzirVar.zzd, z5, j5) || zzirVar == null) {
            return;
        }
        zzirVar.zzd = false;
    }

    static /* bridge */ /* synthetic */ void zzp(zziz zzizVar, Bundle bundle, zzir zzirVar, zzir zzirVar2, long j5) {
        bundle.remove(ProtectedSandApp.s("ㅷ"));
        bundle.remove(ProtectedSandApp.s("ㅸ"));
        zzizVar.zzA(zzirVar, zzirVar2, j5, true, zzizVar.zzt.zzv().zzu(null, ProtectedSandApp.s("ㅹ"), bundle, null, false));
    }

    @l0
    private final zzir zzy(@o0 Activity activity) {
        Preconditions.checkNotNull(activity);
        zzir zzirVar = (zzir) this.zzd.get(activity);
        if (zzirVar == null) {
            zzir zzirVar2 = new zzir(null, zzl(activity.getClass(), ProtectedSandApp.s("ㅺ")), this.zzt.zzv().zzq());
            this.zzd.put(activity, zzirVar2);
            zzirVar = zzirVar2;
        }
        return this.zzg != null ? this.zzg : zzirVar;
    }

    @l0
    private final void zzz(Activity activity, zzir zzirVar, boolean z5) {
        zzir zzirVar2;
        zzir zzirVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzirVar.zzb == null) {
            zzirVar2 = new zzir(zzirVar.zza, activity != null ? zzl(activity.getClass(), ProtectedSandApp.s("ㅻ")) : null, zzirVar.zzc, zzirVar.zze, zzirVar.zzf);
        } else {
            zzirVar2 = zzirVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzirVar2;
        this.zzt.zzaB().zzp(new zziu(this, zzirVar2, zzirVar3, this.zzt.zzax().elapsedRealtime(), z5));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final zzir zzi() {
        return this.zzb;
    }

    @n1
    public final zzir zzj(boolean z5) {
        zza();
        zzg();
        if (!z5) {
            return this.zza;
        }
        zzir zzirVar = this.zza;
        return zzirVar != null ? zzirVar : this.zzh;
    }

    @m1
    final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return ProtectedSandApp.s("ㅼ");
        }
        String[] split = canonicalName.split(ProtectedSandApp.s("ㅽ"));
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.zzt.zzf();
        if (length2 <= 100) {
            return str2;
        }
        this.zzt.zzf();
        return str2.substring(0, 100);
    }

    @l0
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzt.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle(ProtectedSandApp.s("ㅾ"))) == null) {
            return;
        }
        this.zzd.put(activity, new zzir(bundle2.getString(ProtectedSandApp.s("ㅿ")), bundle2.getString(ProtectedSandApp.s("ㆀ")), bundle2.getLong(ProtectedSandApp.s("ㆁ"))));
    }

    @l0
    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (this.zzt.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    @l0
    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        if (!this.zzt.zzf().zzu()) {
            this.zzb = null;
            this.zzt.zzaB().zzp(new zziw(this, elapsedRealtime));
        } else {
            zzir zzy = zzy(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            this.zzt.zzaB().zzp(new zzix(this, zzy, elapsedRealtime));
        }
    }

    @l0
    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzt.zzf().zzu()) {
                    this.zzg = null;
                    this.zzt.zzaB().zzp(new zziy(this));
                }
            }
        }
        if (!this.zzt.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzt.zzaB().zzp(new zziv(this));
        } else {
            zzz(activity, zzy(activity), false);
            zzd zzd = this.zzt.zzd();
            zzd.zzt.zzaB().zzp(new zzc(zzd, zzd.zzt.zzax().elapsedRealtime()));
        }
    }

    @l0
    public final void zzv(Activity activity, Bundle bundle) {
        zzir zzirVar;
        if (!this.zzt.zzf().zzu() || bundle == null || (zzirVar = (zzir) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(ProtectedSandApp.s("ㆂ"), zzirVar.zzc);
        bundle2.putString(ProtectedSandApp.s("ㆃ"), zzirVar.zza);
        bundle2.putString(ProtectedSandApp.s("ㆄ"), zzirVar.zzb);
        bundle.putBundle(ProtectedSandApp.s("ㆅ"), bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r1 <= 100) goto L39;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzw(@androidx.annotation.o0 android.app.Activity r4, @androidx.annotation.e1(max = 36, min = 1) java.lang.String r5, @androidx.annotation.e1(max = 36, min = 1) java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r2 > 100) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r4 > 100) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzx(android.os.Bundle, long):void");
    }
}
