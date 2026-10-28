package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzaq;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzle;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzll;
import com.google.android.gms.internal.play_billing.zzln;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class d3 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    private final n f40344b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.zzbn f40345c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.zzbn f40346d;

    /* renamed from: e, reason: collision with root package name */
    private final int f40347e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f40348f;

    /* synthetic */ d3(m mVar, n nVar, int i4, r3 r3Var) {
        com.google.android.gms.internal.play_billing.zzbq zzbqVar;
        com.google.android.gms.internal.play_billing.zzbq zzbqVar2;
        Objects.requireNonNull(mVar);
        this.f40348f = mVar;
        zzbqVar = mVar.N;
        this.f40345c = com.google.android.gms.internal.play_billing.zzbn.zzc(zzbqVar);
        zzbqVar2 = mVar.N;
        this.f40346d = com.google.android.gms.internal.play_billing.zzbn.zzc(zzbqVar2);
        this.f40344b = nVar;
        this.f40347e = i4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:36|37|38|(4:39|40|(3:88|89|(1:91))|42)|(4:(3:74|75|(11:77|78|79|45|46|47|48|49|50|51|53))|50|51|53)|44|45|46|47|48|49) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015c, code lost:
    
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0160, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        r1 = 25;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(com.android.billingclient.api.d3 r27) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.d3.a(com.android.billingclient.api.d3):java.lang.Object");
    }

    public static /* synthetic */ void b(d3 d3Var) {
        m mVar = d3Var.f40348f;
        mVar.E1(0);
        zzjs zzjsVar = zzjs.zzx;
        y yVar = n4.f40523k;
        mVar.D1(zzjsVar, yVar, d3Var.f40347e);
        d3Var.k(yVar);
    }

    @androidx.annotation.q0
    private final Long h(boolean z4) {
        Object obj;
        Object obj2;
        try {
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Ρ"), th);
        }
        if (z4) {
            obj2 = this.f40348f.f40465a;
            synchronized (obj2) {
                try {
                    com.google.android.gms.internal.play_billing.zzbn zzbnVar = this.f40345c;
                    if (!zzbnVar.zzg()) {
                        return null;
                    }
                    zzbnVar.zzf();
                    return Long.valueOf(zzbnVar.zza(TimeUnit.MILLISECONDS));
                } finally {
                }
            }
        }
        obj = this.f40348f.f40465a;
        synchronized (obj) {
            try {
                com.google.android.gms.internal.play_billing.zzbn zzbnVar2 = this.f40346d;
                if (!zzbnVar2.zzg()) {
                    return null;
                }
                zzbnVar2.zzf();
                return Long.valueOf(zzbnVar2.zza(TimeUnit.MILLISECONDS));
            } finally {
            }
        }
        zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Ρ"), th);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(y yVar, zzjs zzjsVar, @androidx.annotation.q0 String str, boolean z4, int i4) {
        j4 j4Var;
        try {
            zzjq zza = zzju.zza();
            zza.zzp(yVar.c());
            zza.zzb(yVar.a());
            zza.zze(zzjsVar);
            zza.zzc(i4);
            if (str != null) {
                zza.zza(str);
            }
            Long h4 = h(z4);
            if (!z4) {
                zzle zza2 = zzlg.zza();
                zza2.zza(zza);
                if (h4 != null) {
                    zza2.zzb(h4.longValue());
                }
                j4Var = this.f40348f.f40472h;
                j4Var.a((zzlg) zza2.zzi());
                return;
            }
            zzll zza3 = zzln.zza();
            int i5 = this.f40347e;
            zza3.zza(i5 > 0);
            zza3.zzb(i5);
            zza3.zzd(i4);
            if (h4 != null) {
                zza3.zzc(h4.longValue());
            }
            m mVar = this.f40348f;
            zzjj zza4 = zzjl.zza();
            zza4.zzb(zza);
            zza4.zzp(6);
            zza4.zze(zza3);
            mVar.A1((zzjl) zza4.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("\u03a2"), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(boolean z4, int i4) {
        j4 j4Var;
        try {
            Long h4 = h(z4);
            if (!z4) {
                zzle zza = zzlg.zza();
                zzjq zza2 = zzju.zza();
                zza2.zzp(0);
                zza2.zzc(i4);
                zza.zza(zza2);
                if (h4 != null) {
                    zza.zzb(h4.longValue());
                }
                j4Var = this.f40348f.f40472h;
                j4Var.a((zzlg) zza.zzi());
                return;
            }
            zzjn zza3 = zzjp.zza();
            zza3.zze(6);
            zzll zza4 = zzln.zza();
            int i5 = this.f40347e;
            zza4.zza(i5 > 0);
            zza4.zzb(i5);
            zza4.zzd(i4);
            if (h4 != null) {
                zza4.zzc(h4.longValue());
            }
            m mVar = this.f40348f;
            zza3.zzd(zza4);
            mVar.C1((zzjp) zza3.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("\u03a2"), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(y yVar) {
        Object obj;
        int i4;
        m mVar = this.f40348f;
        obj = mVar.f40465a;
        synchronized (obj) {
            try {
                i4 = mVar.f40466b;
                if (i4 == 3) {
                    return;
                }
                try {
                    this.f40344b.b(yVar);
                } catch (Throwable th) {
                    zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Σ"), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void l(Exception exc, boolean z4, int i4) {
        zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Τ"), exc);
        zzjs zzjsVar = exc instanceof DeadObjectException ? zzjs.zzbB : exc instanceof RemoteException ? zzjs.zzbD : exc instanceof SecurityException ? zzjs.zzbC : zzjs.zzbA;
        String a5 = i4.a(exc);
        this.f40348f.E1(0);
        i(m.X1(exc), zzjsVar, a5, z4, i4);
        k(m.X1(exc));
    }

    private final void m(Exception exc, boolean z4) {
        zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Υ"), exc);
        zzjs zzjsVar = exc instanceof DeadObjectException ? zzjs.zzaM : exc instanceof RemoteException ? zzjs.zzaL : exc instanceof SecurityException ? zzjs.zzaN : zzjs.zzP;
        String a5 = zzjsVar.equals(zzjs.zzP) ? i4.a(exc) : null;
        this.f40348f.E1(0);
        i(m.X1(exc), zzjsVar, a5, z4, 0);
        k(m.X1(exc));
    }

    public final void f() {
        Object obj;
        obj = this.f40348f.f40465a;
        synchronized (obj) {
            com.google.android.gms.internal.play_billing.zzbn zzbnVar = this.f40345c;
            zzbnVar.zzd();
            zzbnVar.zze();
        }
    }

    final boolean g() {
        return this.f40347e > 0;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Object obj;
        int i4;
        int i5;
        j4 j4Var;
        j4 j4Var2;
        zzc.zzn(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Φ"));
        try {
            m mVar = this.f40348f;
            if (m.a1(mVar)) {
                j4Var2 = mVar.f40472h;
                zzjj zza = zzjl.zza();
                zza.zzp(6);
                zzjq zza2 = zzju.zza();
                zza2.zze(zzjs.zzbf);
                zza.zzb(zza2);
                zzll zza3 = zzln.zza();
                int i6 = this.f40347e;
                zza3.zza(i6 > 0);
                zza3.zzb(i6);
                zza.zze(zza3);
                j4Var2.m((zzjl) zza.zzi());
            } else {
                j4Var = mVar.f40472h;
                j4Var.b(zzjx.zzb());
            }
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("\u03a2"), th);
        }
        m mVar2 = this.f40348f;
        obj = mVar2.f40465a;
        synchronized (obj) {
            i4 = mVar2.f40466b;
            if (i4 != 3) {
                i5 = mVar2.f40466b;
                if (i5 != 0) {
                    mVar2.E1(0);
                    mVar2.H1();
                    try {
                        this.f40344b.d();
                    } catch (Throwable th2) {
                        zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Χ"), th2);
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        int i4;
        Handler f02;
        y i02;
        zzc.zzm(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Ψ"));
        m mVar = this.f40348f;
        obj = mVar.f40465a;
        synchronized (obj) {
            try {
                i4 = mVar.f40466b;
                if (i4 == 3) {
                    return;
                }
                mVar.f40473i = zzaq.zzu(iBinder);
                Callable callable = new Callable() { // from class: com.android.billingclient.api.b3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        d3.a(d3.this);
                        return null;
                    }
                };
                Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.c3
                    @Override // java.lang.Runnable
                    public final void run() {
                        d3.b(d3.this);
                    }
                };
                f02 = mVar.f0();
                if (m.P(callable, androidx.work.i0.f35989d, runnable, f02, mVar.O()) == null) {
                    int i5 = this.f40347e;
                    i02 = mVar.i0();
                    mVar.D1(zzjs.zzy, i02, i5);
                    k(i02);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        int i4;
        int i5;
        int i6;
        j4 j4Var;
        j4 j4Var2;
        zzc.zzn(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Ω"));
        try {
            m mVar = this.f40348f;
            if (m.a1(mVar)) {
                j4Var2 = mVar.f40472h;
                zzjj zza = zzjl.zza();
                zza.zzp(6);
                zzjq zza2 = zzju.zza();
                zza2.zze(zzjs.zzbe);
                zza.zzb(zza2);
                zzll zza3 = zzln.zza();
                int i7 = this.f40347e;
                zza3.zza(i7 > 0);
                zza3.zzb(i7);
                zza.zze(zza3);
                j4Var2.m((zzjl) zza.zzi());
            } else {
                j4Var = mVar.f40472h;
                j4Var.d(zzlk.zzb());
            }
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("\u03a2"), th);
        }
        m mVar2 = this.f40348f;
        obj = mVar2.f40465a;
        synchronized (obj) {
            try {
                if (w4.i()) {
                    i5 = mVar2.f40466b;
                    if (i5 != 3) {
                        i6 = mVar2.f40466b;
                        if (i6 != 0) {
                            com.google.android.gms.internal.play_billing.zzbn zzbnVar = this.f40346d;
                            zzbnVar.zzd();
                            zzbnVar.zze();
                        }
                    }
                    return;
                }
                com.google.android.gms.internal.play_billing.zzbn zzbnVar2 = this.f40346d;
                zzbnVar2.zzd();
                zzbnVar2.zze();
                i4 = mVar2.f40466b;
                if (i4 == 3) {
                    return;
                }
                mVar2.E1(0);
                try {
                    this.f40344b.d();
                } catch (Throwable th2) {
                    zzc.zzo(ProtectedSandApp.s("Ι"), ProtectedSandApp.s("Χ"), th2);
                }
            } finally {
            }
        }
    }
}
