package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes6.dex */
public final class q extends s implements o, h4.e {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    public static final a f26515r = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final p0 f26516p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f26517q;

    /* compiled from: SpecialTypes.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        private final boolean a(w1 w1Var) {
            return (w1Var.U0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.n) || (w1Var.U0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) || (w1Var instanceof kotlin.reflect.jvm.internal.impl.types.checker.i) || (w1Var instanceof x0);
        }

        private final boolean c(w1 w1Var, boolean z5) {
            boolean z6 = false;
            if (!a(w1Var)) {
                return false;
            }
            if (w1Var instanceof x0) {
                return t1.l(w1Var);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h b6 = w1Var.U0().b();
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 k0Var = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 ? (kotlin.reflect.jvm.internal.impl.descriptors.impl.k0) b6 : null;
            if (k0Var != null && !k0Var.a1()) {
                z6 = true;
            }
            if (z6) {
                return true;
            }
            return (z5 && (w1Var.U0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1)) ? t1.l(w1Var) : !kotlin.reflect.jvm.internal.impl.types.checker.o.f26367a.a(w1Var);
        }

        @d5.e
        public final q b(@d5.d w1 w1Var, boolean z5) {
            kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("垑"));
            if (w1Var instanceof q) {
                return (q) w1Var;
            }
            kotlin.jvm.internal.w wVar = null;
            if (!c(w1Var, z5)) {
                return null;
            }
            if (w1Var instanceof b0) {
                b0 b0Var = (b0) w1Var;
                kotlin.jvm.internal.l0.g(b0Var.c1().U0(), b0Var.d1().U0());
            }
            return new q(e0.c(w1Var).b1(false), z5, wVar);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ q(p0 p0Var, boolean z5, kotlin.jvm.internal.w wVar) {
        this(p0Var, z5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    public boolean H0() {
        return (this.f26516p.U0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.n) || (this.f26516p.U0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    @d5.d
    public h0 S(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("覃"));
        return t0.e(h0Var.X0(), this.f26517q);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s, kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public p0 b1(boolean z5) {
        return z5 ? this.f26516p.b1(z5) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: c1 */
    public p0 a1(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("覄"));
        return new q(this.f26516p.a1(d1Var), this.f26517q);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    protected p0 d1() {
        return this.f26516p;
    }

    @d5.d
    public final p0 g1() {
        return this.f26516p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public q f1(@d5.d p0 p0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("覅"));
        return new q(p0Var, this.f26517q);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @d5.d
    public String toString() {
        return this.f26516p + ProtectedSandApp.s("覆");
    }

    private q(p0 p0Var, boolean z5) {
        this.f26516p = p0Var;
        this.f26517q = z5;
    }
}
