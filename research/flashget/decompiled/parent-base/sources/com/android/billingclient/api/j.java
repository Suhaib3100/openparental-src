package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.f0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.play_billing.zzc;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public abstract class j {

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        @e6
        public static final int K = 0;

        @g6
        public static final int L = 1;

        @i6
        public static final int M = 3;

        @j6
        public static final int N = 4;

        @g5
        public static final int O = 5;
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        @Deprecated
        public static final int P = -3;
        public static final int Q = -2;
        public static final int R = -1;
        public static final int S = 0;
        public static final int T = 1;
        public static final int U = 2;
        public static final int V = 3;
        public static final int W = 4;
        public static final int X = 5;
        public static final int Y = 6;
        public static final int Z = 7;

        /* renamed from: a0, reason: collision with root package name */
        public static final int f40396a0 = 8;

        /* renamed from: b0, reason: collision with root package name */
        public static final int f40397b0 = 12;
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @androidx.annotation.d
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private volatile String f40398a;

        /* renamed from: b, reason: collision with root package name */
        private volatile s0 f40399b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f40400c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a1 f40401d;

        /* renamed from: e, reason: collision with root package name */
        private volatile a5 f40402e;

        /* renamed from: f, reason: collision with root package name */
        private volatile j4 f40403f;

        /* renamed from: g, reason: collision with root package name */
        private volatile f1 f40404g;

        /* renamed from: h, reason: collision with root package name */
        @androidx.annotation.q0
        private volatile e0 f40405h;

        /* renamed from: i, reason: collision with root package name */
        @androidx.annotation.q0
        private volatile ExecutorService f40406i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f40407j;

        /* renamed from: k, reason: collision with root package name */
        private volatile boolean f40408k;

        /* renamed from: l, reason: collision with root package name */
        private volatile boolean f40409l;

        /* renamed from: m, reason: collision with root package name */
        private volatile boolean f40410m;

        /* renamed from: n, reason: collision with root package name */
        private volatile boolean f40411n;

        /* renamed from: o, reason: collision with root package name */
        private volatile boolean f40412o;

        /* renamed from: p, reason: collision with root package name */
        private volatile boolean f40413p;

        /* renamed from: q, reason: collision with root package name */
        volatile boolean f40414q;

        /* renamed from: r, reason: collision with root package name */
        volatile com.google.android.gms.internal.play_billing.zzbq f40415r;

        /* synthetic */ c(Context context, i1 i1Var) {
            this.f40400c = context;
        }

        private final boolean j() {
            try {
                Context context = this.f40400c;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean(ProtectedSandApp.s("ҵ"), false);
            } catch (Exception e4) {
                zzc.zzo(ProtectedSandApp.s("Ҷ"), ProtectedSandApp.s("ҷ"), e4);
                return false;
            }
        }

        @androidx.annotation.o0
        public j a() {
            j g4Var;
            Context context = this.f40400c;
            if (context == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("һ"));
            }
            if (this.f40401d == null) {
                if (this.f40404g != null || this.f40413p) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ҹ"));
                }
                if (this.f40407j || this.f40408k || this.f40410m || this.f40411n || this.f40412o) {
                    return j() ? new g4(null, context, null, null, this) : new m(null, context, null, null, this);
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("Ҹ"));
            }
            if (this.f40399b == null || !this.f40399b.a()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("Һ"));
            }
            if (this.f40401d == null) {
                s0 s0Var = this.f40399b;
                g4Var = j() ? new g4((String) null, s0Var, context, (a5) null, (j4) null, (ExecutorService) null, this) : new m((String) null, s0Var, context, (a5) null, (j4) null, (ExecutorService) null, this);
            } else {
                if (this.f40404g != null || this.f40405h != null) {
                    s0 s0Var2 = this.f40399b;
                    a1 a1Var = this.f40401d;
                    f1 f1Var = this.f40404g;
                    e0 e0Var = this.f40405h;
                    return j() ? new g4(null, s0Var2, context, a1Var, f1Var, e0Var, null, null, this) : new m(null, s0Var2, context, a1Var, f1Var, e0Var, null, null, this);
                }
                s0 s0Var3 = this.f40399b;
                a1 a1Var2 = this.f40401d;
                g4Var = j() ? new g4((String) null, s0Var3, context, a1Var2, (j4) null, (ExecutorService) null, this) : new m((String) null, s0Var3, context, a1Var2, (j4) null, (ExecutorService) null, this);
            }
            return g4Var;
        }

        @e3
        @androidx.annotation.o0
        public c b() {
            this.f40407j = true;
            return this;
        }

        @f4
        @androidx.annotation.o0
        public c c() {
            this.f40414q = true;
            return this;
        }

        @androidx.annotation.o0
        @e6
        public c d(int i4) {
            f0.a aVar = new f0.a();
            aVar.b(i4);
            e(aVar.a());
            return this;
        }

        @androidx.annotation.o0
        @j6
        public c e(@androidx.annotation.o0 f0 f0Var) {
            if (f0Var.b() != null) {
                if (this.f40404g != null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ҽ"));
                }
                if (f0Var.a() != 4 && f0Var.a() != 5) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("Ҽ"));
                }
                this.f40405h = f0Var.b();
            }
            int a5 = f0Var.a();
            if (a5 == 1) {
                this.f40410m = true;
            } else if (a5 == 2) {
                this.f40411n = true;
            } else if (a5 == 3) {
                this.f40408k = true;
            } else if (a5 == 4) {
                this.f40412o = true;
            } else {
                if (a5 != 5) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("Ҿ"));
                }
                this.f40413p = true;
            }
            return this;
        }

        @h6
        @androidx.annotation.o0
        @Deprecated
        public c f() {
            this.f40408k = true;
            return this;
        }

        @s6
        @androidx.annotation.o0
        public c g(@androidx.annotation.o0 s0 s0Var) {
            this.f40399b = s0Var;
            return this;
        }

        @androidx.annotation.o0
        @u6
        public c h(@androidx.annotation.o0 f1 f1Var) {
            this.f40404g = f1Var;
            if (this.f40405h == null) {
                return this;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ҽ"));
        }

        @androidx.annotation.o0
        public c i(@androidx.annotation.o0 a1 a1Var) {
            this.f40401d = a1Var;
            return this;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {

        /* renamed from: c0, reason: collision with root package name */
        public static final int f40416c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public static final int f40417d0 = 1;

        /* renamed from: e0, reason: collision with root package name */
        public static final int f40418e0 = 2;

        /* renamed from: f0, reason: collision with root package name */
        public static final int f40419f0 = 3;
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {

        /* renamed from: o0, reason: collision with root package name */
        @androidx.annotation.o0
        public static final String f40428o0 = ProtectedSandApp.s("ҿ");

        /* renamed from: n0, reason: collision with root package name */
        @h6
        @androidx.annotation.o0
        public static final String f40427n0 = ProtectedSandApp.s("Ӏ");

        /* renamed from: m0, reason: collision with root package name */
        @e3
        @androidx.annotation.o0
        public static final String f40426m0 = ProtectedSandApp.s("Ӂ");

        /* renamed from: l0, reason: collision with root package name */
        @k6
        @androidx.annotation.o0
        public static final String f40425l0 = ProtectedSandApp.s("ӂ");

        /* renamed from: k0, reason: collision with root package name */
        @androidx.annotation.o0
        public static final String f40424k0 = ProtectedSandApp.s("Ӄ");

        /* renamed from: j0, reason: collision with root package name */
        @androidx.annotation.o0
        public static final String f40423j0 = ProtectedSandApp.s("ӄ");

        /* renamed from: i0, reason: collision with root package name */
        @androidx.annotation.o0
        public static final String f40422i0 = ProtectedSandApp.s("Ӆ");

        /* renamed from: h0, reason: collision with root package name */
        @androidx.annotation.o0
        public static final String f40421h0 = ProtectedSandApp.s("ӆ");

        /* renamed from: g0, reason: collision with root package name */
        @androidx.annotation.o0
        public static final String f40420g0 = ProtectedSandApp.s("Ӈ");
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @o6
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {

        /* renamed from: p0, reason: collision with root package name */
        public static final int f40429p0 = 0;

        /* renamed from: q0, reason: collision with root package name */
        public static final int f40430q0 = 1;

        /* renamed from: r0, reason: collision with root package name */
        public static final int f40431r0 = 2;
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {

        /* renamed from: t0, reason: collision with root package name */
        @androidx.annotation.o0
        public static final String f40433t0 = ProtectedSandApp.s("ӈ");

        /* renamed from: s0, reason: collision with root package name */
        @androidx.annotation.o0
        public static final String f40432s0 = ProtectedSandApp.s("Ӊ");
    }

    @androidx.annotation.d
    @androidx.annotation.o0
    public static c q(@androidx.annotation.o0 Context context) {
        return new c(context, null);
    }

    @androidx.annotation.d
    public abstract void a(@androidx.annotation.o0 com.android.billingclient.api.b bVar, @androidx.annotation.o0 com.android.billingclient.api.c cVar);

    @androidx.annotation.d
    public abstract void b(@androidx.annotation.o0 z zVar, @androidx.annotation.o0 a0 a0Var);

    @androidx.annotation.d
    @e3
    @KeepForSdk
    public abstract void c(@androidx.annotation.o0 com.android.billingclient.api.g gVar);

    @androidx.annotation.d
    @e6
    public abstract void d(@androidx.annotation.o0 x xVar, @androidx.annotation.o0 w wVar);

    @androidx.annotation.d
    @h6
    @Deprecated
    public abstract void e(@androidx.annotation.o0 j0 j0Var);

    @androidx.annotation.d
    public abstract void f();

    @androidx.annotation.d
    @g5
    public abstract void g(@androidx.annotation.o0 k0 k0Var, @androidx.annotation.o0 i iVar);

    @androidx.annotation.d
    @k6
    public abstract void h(@androidx.annotation.o0 l0 l0Var, @androidx.annotation.o0 p pVar);

    @androidx.annotation.d
    public abstract int i();

    @androidx.annotation.d
    @e3
    @KeepForSdk
    public abstract void j(@androidx.annotation.o0 com.android.billingclient.api.d dVar);

    @androidx.annotation.d
    @e6
    public abstract void k(int i4, @androidx.annotation.o0 s sVar);

    @androidx.annotation.d
    @h6
    @Deprecated
    public abstract void l(@androidx.annotation.o0 g0 g0Var);

    @androidx.annotation.d
    @androidx.annotation.o0
    public abstract y m(@androidx.annotation.o0 String str);

    @androidx.annotation.d
    public abstract boolean n();

    @androidx.annotation.l1
    @androidx.annotation.o0
    public abstract y o(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 q qVar);

    @androidx.annotation.l1
    @m6
    public abstract void p(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 q0 q0Var, @androidx.annotation.o0 r0 r0Var);

    @androidx.annotation.d
    public abstract void r(@androidx.annotation.o0 b1 b1Var, @androidx.annotation.o0 u0 u0Var);

    @androidx.annotation.d
    public abstract void s(@androidx.annotation.o0 d1 d1Var, @androidx.annotation.o0 z0 z0Var);

    @e3
    @androidx.annotation.l1
    @androidx.annotation.o0
    public abstract y t(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 com.android.billingclient.api.e eVar);

    @g5
    @androidx.annotation.l1
    public abstract void u(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 u uVar, @androidx.annotation.o0 t tVar);

    @h6
    @androidx.annotation.l1
    @Deprecated
    @androidx.annotation.o0
    public abstract y v(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 h0 h0Var);

    @androidx.annotation.l1
    @androidx.annotation.o0
    public abstract y w(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 m0 m0Var, @androidx.annotation.o0 n0 n0Var);

    @androidx.annotation.d
    public abstract void x(@androidx.annotation.o0 n nVar);
}
