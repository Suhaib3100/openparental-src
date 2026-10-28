package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.billingclient.api.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzba;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdf;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class g4 extends m {
    private final Context O;
    private volatile int P;

    @androidx.annotation.q0
    private volatile zzba Q;
    private volatile d4 R;

    @androidx.annotation.q0
    private volatile ScheduledExecutorService S;

    @androidx.annotation.d
    g4(@androidx.annotation.q0 String str, Context context, @androidx.annotation.q0 j4 j4Var, @androidx.annotation.q0 ExecutorService executorService, j.c cVar) {
        super(null, context, null, null, cVar);
        this.P = 0;
        this.O = context;
    }

    private final synchronized void A2() {
        if (s2()) {
            zzc.zzm(ProtectedSandApp.s("҂"), ProtectedSandApp.s("҃"));
            F2(26);
            return;
        }
        if (this.P == 1) {
            zzc.zzn(ProtectedSandApp.s("҂"), ProtectedSandApp.s("҄"));
            return;
        }
        if (this.P == 3) {
            zzc.zzn(ProtectedSandApp.s("҂"), ProtectedSandApp.s("҅"));
            E2(zzjs.zzL, 26, n4.a(-1, ProtectedSandApp.s("҆")));
            return;
        }
        this.P = 1;
        zzc.zzm(ProtectedSandApp.s("҂"), ProtectedSandApp.s("҇"));
        this.R = new d4(this, null);
        Intent intent = new Intent(ProtectedSandApp.s("҈"));
        intent.setPackage(ProtectedSandApp.s("҉"));
        Context context = this.O;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        zzjs zzjsVar = zzjs.zza;
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            zzjsVar = zzjs.zzO;
        } else {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, ProtectedSandApp.s("҉")) || str2 == null) {
                    String s4 = ProtectedSandApp.s("҂");
                    String s5 = ProtectedSandApp.s("Ҍ");
                    zzjsVar = zzjs.zzM;
                    zzc.zzn(s4, s5);
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.R, 1)) {
                        zzc.zzm(ProtectedSandApp.s("҂"), ProtectedSandApp.s("Ҋ"));
                        return;
                    }
                    String s6 = ProtectedSandApp.s("҂");
                    String s7 = ProtectedSandApp.s("ҋ");
                    zzjsVar = zzjs.zzM;
                    zzc.zzn(s6, s7);
                }
            }
        }
        this.P = 0;
        zzc.zzm(ProtectedSandApp.s("҂"), ProtectedSandApp.s("ҍ"));
        E2(zzjsVar, 26, n4.a(2, ProtectedSandApp.s("ҍ")));
    }

    private static final boolean B2(int i4) {
        return i4 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y C2(int i4, int i5) {
        y a5 = n4.a(i5, ProtectedSandApp.s("Ҏ"));
        E2(zzjs.zzaO, i4, a5);
        return a5;
    }

    private final zzdk D2(final int i4) {
        if (s2()) {
            return zzu.zza(new zzr() { // from class: com.android.billingclient.api.w3
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    return g4.u2(g4.this, i4, zzpVar);
                }
            });
        }
        zzc.zzn(ProtectedSandApp.s("҂"), ProtectedSandApp.s("ҏ"));
        E2(zzjs.zzaP, 28, n4.a(-1, ProtectedSandApp.s("҆")));
        return zzdf.zza(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2(zzjs zzjsVar, int i4, y yVar) {
        int i5 = i4.f40395a;
        zzjl b5 = i4.b(zzjsVar, i4, yVar, null, zzjz.zza);
        Objects.requireNonNull(b5, ProtectedSandApp.s("Ґ"));
        V1().m(b5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2(int i4) {
        int i5 = i4.f40395a;
        zzjp c5 = i4.c(i4, zzjz.zza);
        Objects.requireNonNull(c5, ProtectedSandApp.s("ґ"));
        V1().h(c5);
    }

    private final void G2(int i4, androidx.core.util.e eVar, Runnable runnable) {
        zzdf.zzc(zzdf.zzb(D2(i4), 28500L, TimeUnit.MILLISECONDS, y2()), new b4(this, i4, eVar, runnable), O());
    }

    static boolean r2(g4 g4Var, int i4) {
        return i4 > 0;
    }

    public static /* synthetic */ Object u2(g4 g4Var, int i4, zzp zzpVar) {
        try {
        } catch (Exception e4) {
            g4Var.E2(zzjs.zzaQ, 28, n4.F);
            zzc.zzo(ProtectedSandApp.s("҂"), ProtectedSandApp.s("Ҙ"), e4);
            zzpVar.zzb(0);
        }
        if (g4Var.Q == null) {
            throw null;
        }
        g4Var.Q.zza(g4Var.O.getPackageName(), i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? i4 != 6 ? ProtectedSandApp.s("Ғ") : ProtectedSandApp.s("ғ") : ProtectedSandApp.s("Ҕ") : ProtectedSandApp.s("ҕ") : ProtectedSandApp.s("Җ") : ProtectedSandApp.s("җ"), new c4(zzpVar));
        return ProtectedSandApp.s("ҙ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int x2(zzdk zzdkVar) {
        String s4 = ProtectedSandApp.s("҂");
        try {
            return ((Integer) zzdkVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e4) {
            E2(zzjs.zzaX, 28, n4.F);
            zzc.zzo(s4, ProtectedSandApp.s("Қ"), e4);
            return 0;
        } catch (Exception e5) {
            if (e5 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            E2(zzjs.zzaQ, 28, n4.F);
            zzc.zzo(s4, ProtectedSandApp.s("Ҙ"), e5);
            return 0;
        }
    }

    private final synchronized ScheduledExecutorService y2() {
        try {
            if (this.S == null) {
                this.S = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.S;
    }

    private final synchronized void z2() {
        F2(27);
        try {
            try {
                e4 e4Var = null;
                if (this.R != null && this.Q != null) {
                    zzc.zzm(ProtectedSandApp.s("҂"), ProtectedSandApp.s("қ"));
                    this.O.unbindService(this.R);
                    this.R = new d4(this, e4Var);
                }
                this.Q = null;
                if (this.S != null) {
                    this.S.shutdownNow();
                    this.S = null;
                }
            } catch (RuntimeException e4) {
                zzc.zzo(ProtectedSandApp.s("҂"), ProtectedSandApp.s("Ҝ"), e4);
            }
            this.P = 3;
        } catch (Throwable th) {
            this.P = 3;
            throw th;
        }
    }

    @Override // com.android.billingclient.api.m, com.android.billingclient.api.j
    public final void a(final b bVar, final c cVar) {
        Objects.requireNonNull(cVar);
        G2(3, new androidx.core.util.e() { // from class: com.android.billingclient.api.x3
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                c.this.a((y) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.y3
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.m*/.a(bVar, cVar);
            }
        });
    }

    @Override // com.android.billingclient.api.m, com.android.billingclient.api.j
    public final void b(final z zVar, final a0 a0Var) {
        G2(4, new androidx.core.util.e() { // from class: com.android.billingclient.api.u3
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                a0.this.a((y) obj, zVar.a());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.v3
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.m*/.b(zVar, a0Var);
            }
        });
    }

    @Override // com.android.billingclient.api.m, com.android.billingclient.api.j
    public final void f() {
        z2();
        super.f();
    }

    @Override // com.android.billingclient.api.m, com.android.billingclient.api.j
    public final y o(final Activity activity, final q qVar) {
        androidx.core.util.e eVar = new androidx.core.util.e() { // from class: com.android.billingclient.api.z3
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                g4.this.Y1((y) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.a4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y o4;
                o4 = super/*com.android.billingclient.api.m*/.o(activity, qVar);
                return o4;
            }
        };
        int x22 = x2(D2(2));
        if (x22 > 0) {
            y C2 = C2(2, x22);
            eVar.accept(C2);
            return C2;
        }
        try {
            return (y) callable.call();
        } catch (Exception e4) {
            zzjs zzjsVar = zzjs.zzaY;
            y yVar = n4.f40520h;
            E2(zzjsVar, 2, yVar);
            zzc.zzo(ProtectedSandApp.s("҂"), ProtectedSandApp.s("ҝ"), e4);
            return yVar;
        }
    }

    @Override // com.android.billingclient.api.m, com.android.billingclient.api.j
    public final void r(final b1 b1Var, final u0 u0Var) {
        G2(7, new androidx.core.util.e() { // from class: com.android.billingclient.api.s3
            @Override // androidx.core.util.e
            public final void accept(Object obj) {
                c1 c1Var = new c1(new ArrayList(), new ArrayList());
                u0.this.a((y) obj, c1Var);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.t3
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.m*/.r(b1Var, u0Var);
            }
        });
    }

    public final synchronized boolean s2() {
        if (this.P == 2 && this.Q != null) {
            if (this.R != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.android.billingclient.api.m, com.android.billingclient.api.j
    public final void x(n nVar) {
        A2();
        super.x(nVar);
    }

    @androidx.annotation.d
    g4(@androidx.annotation.q0 String str, s0 s0Var, Context context, a5 a5Var, @androidx.annotation.q0 j4 j4Var, @androidx.annotation.q0 ExecutorService executorService, j.c cVar) {
        super((String) null, s0Var, context, (a5) null, (j4) null, (ExecutorService) null, cVar);
        this.P = 0;
        this.O = context;
    }

    @androidx.annotation.d
    g4(@androidx.annotation.q0 String str, s0 s0Var, Context context, a1 a1Var, @androidx.annotation.q0 j4 j4Var, @androidx.annotation.q0 ExecutorService executorService, j.c cVar) {
        super((String) null, s0Var, context, a1Var, (j4) null, (ExecutorService) null, cVar);
        this.P = 0;
        this.O = context;
    }

    @androidx.annotation.d
    g4(@androidx.annotation.q0 String str, s0 s0Var, Context context, a1 a1Var, @androidx.annotation.q0 f1 f1Var, @androidx.annotation.q0 e0 e0Var, @androidx.annotation.q0 j4 j4Var, @androidx.annotation.q0 ExecutorService executorService, j.c cVar) {
        super(null, s0Var, context, a1Var, f1Var, e0Var, null, null, cVar);
        this.P = 0;
        this.O = context;
    }
}
