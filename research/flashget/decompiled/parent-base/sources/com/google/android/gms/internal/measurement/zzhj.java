package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.g0;
import com.google.common.base.l0;
import com.google.common.base.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import zc.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzhj<T> {
    private static final Object zza = new Object();

    @h
    private static volatile zzhu zzb;
    private static volatile boolean zzc;
    private static zzhy zzd;
    private static final AtomicInteger zze;
    private final zzhr zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static {
        new AtomicReference();
        zzd = new zzhy(new zzhx() { // from class: com.google.android.gms.internal.measurement.zzho
            @Override // com.google.android.gms.internal.measurement.zzhx
            public final boolean zza() {
                return zzhj.zzd();
            }
        });
        zze = new AtomicInteger();
    }

    static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Boolean bool, boolean z4) {
        return new zzhq(zzhrVar, str, bool, true);
    }

    @h
    private final T zzb(zzhu zzhuVar) {
        Object zza2;
        zzhb zza3 = this.zzf.zzb != null ? zzhi.zza(zzhuVar.zza(), this.zzf.zzb) ? this.zzf.zzg ? zzgu.zza(zzhuVar.zza().getContentResolver(), zzhk.zza(zzhk.zza(zzhuVar.zza(), this.zzf.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
            @Override // java.lang.Runnable
            public final void run() {
                zzhj.zzc();
            }
        }) : zzgu.zza(zzhuVar.zza().getContentResolver(), this.zzf.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
            @Override // java.lang.Runnable
            public final void run() {
                zzhj.zzc();
            }
        }) : null : zzhw.zza(zzhuVar.zza(), this.zzf.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
            @Override // java.lang.Runnable
            public final void run() {
                zzhj.zzc();
            }
        });
        if (zza3 == null || (zza2 = zza3.zza(zzb())) == null) {
            return null;
        }
        return zza(zza2);
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    static /* synthetic */ boolean zzd() {
        return true;
    }

    private final T zze() {
        return (T) this.zzh;
    }

    abstract T zza(Object obj);

    private zzhj(zzhr zzhrVar, String str, T t4, boolean z4) {
        this.zzi = -1;
        String str2 = zzhrVar.zza;
        if (str2 == null && zzhrVar.zzb == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("품"));
        }
        if (str2 != null && zzhrVar.zzb != null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("풉"));
        }
        this.zzf = zzhrVar;
        this.zzg = str;
        this.zzh = t4;
        this.zzk = z4;
        this.zzl = false;
    }

    static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Double d5, boolean z4) {
        return new zzhp(zzhrVar, str, d5, true);
    }

    static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Long l4, boolean z4) {
        return new zzhn(zzhrVar, str, l4, true);
    }

    static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, String str2, boolean z4) {
        return new zzhs(zzhrVar, str, str2, true);
    }

    public final T zza() {
        T zzb2;
        if (!this.zzk) {
            l0.h0(zzd.zza(this.zzg), ProtectedSandApp.s("풊"));
        }
        int i4 = zze.get();
        if (this.zzi < i4) {
            synchronized (this) {
                try {
                    if (this.zzi < i4) {
                        zzhu zzhuVar = zzb;
                        g0<zzhh> a5 = g0.a();
                        String str = null;
                        if (zzhuVar != null) {
                            a5 = zzhuVar.zzb().get();
                            if (a5.e()) {
                                zzhh d5 = a5.d();
                                zzhr zzhrVar = this.zzf;
                                str = d5.zza(zzhrVar.zzb, zzhrVar.zza, zzhrVar.zzd, this.zzg);
                            }
                        }
                        l0.h0(zzhuVar != null, ProtectedSandApp.s("풋"));
                        if (!this.zzf.zzf ? (zzb2 = zzb(zzhuVar)) == null && (zzb2 = zza(zzhuVar)) == null : (zzb2 = zza(zzhuVar)) == null && (zzb2 = zzb(zzhuVar)) == null) {
                            zzb2 = zze();
                        }
                        if (a5.e()) {
                            zzb2 = str == null ? zze() : zza((Object) str);
                        }
                        this.zzj = zzb2;
                        this.zzi = i4;
                    }
                } finally {
                }
            }
        }
        return this.zzj;
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzb(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzhu r0 = com.google.android.gms.internal.measurement.zzhj.zzb
            if (r0 != 0) goto L4e
            if (r3 != 0) goto L7
            goto L4e
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzhj.zza
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzhu r1 = com.google.android.gms.internal.measurement.zzhj.zzb     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.measurement.zzhu r1 = com.google.android.gms.internal.measurement.zzhj.zzb     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L44
            goto L24
        L22:
            r3 = move-exception
            goto L46
        L24:
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.zzgu.zzc()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzhw.zza()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzhc.zza()     // Catch: java.lang.Throwable -> L22
        L2f:
            com.google.android.gms.internal.measurement.zzhl r1 = new com.google.android.gms.internal.measurement.zzhl     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            com.google.common.base.u0 r1 = com.google.common.base.v0.b(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzgv r2 = new com.google.android.gms.internal.measurement.zzgv     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzhj.zzb = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.zzhj.zze     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L4a
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhj.zzb(android.content.Context):void");
    }

    @h
    private final T zza(zzhu zzhuVar) {
        x<Context, Boolean> xVar;
        zzhr zzhrVar = this.zzf;
        if (!zzhrVar.zze && ((xVar = zzhrVar.zzh) == null || xVar.apply(zzhuVar.zza()).booleanValue())) {
            zzhc zza2 = zzhc.zza(zzhuVar.zza());
            zzhr zzhrVar2 = this.zzf;
            Object zza3 = zza2.zza(zzhrVar2.zze ? null : zza(zzhrVar2.zzc));
            if (zza3 != null) {
                return zza(zza3);
            }
        }
        return null;
    }

    private final String zza(String str) {
        return (str == null || !str.isEmpty()) ? j.a(str, this.zzg) : this.zzg;
    }
}
