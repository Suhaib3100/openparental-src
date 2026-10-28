package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes7.dex */
public final class q extends s implements o, ce.e {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final a f78524e = new a();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final p0 f78525c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f78526d;

    /* compiled from: SpecialTypes.kt */
    public static final class a {
        private a() {
        }

        private final boolean a(w1 w1Var) {
            return (w1Var.O0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.n) || (w1Var.O0().c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) || (w1Var instanceof kotlin.reflect.jvm.internal.impl.types.checker.i) || (w1Var instanceof x0);
        }

        public static /* synthetic */ q c(a aVar, w1 w1Var, boolean z4, boolean z5, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            if ((i4 & 4) != 0) {
                z5 = false;
            }
            return aVar.b(w1Var, z4, z5);
        }

        private final boolean d(w1 w1Var, boolean z4) {
            if (!a(w1Var)) {
                return false;
            }
            if (w1Var instanceof x0) {
                return t1.l(w1Var);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = w1Var.O0().c();
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 k0Var = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 ? (kotlin.reflect.jvm.internal.impl.descriptors.impl.k0) c5 : null;
            if (k0Var == null || k0Var.U0()) {
                return (z4 && (w1Var.O0().c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1)) ? t1.l(w1Var) : !kotlin.reflect.jvm.internal.impl.types.checker.o.f78375a.a(w1Var);
            }
            return true;
        }

        @fg.m
        @kd.j
        public final q b(@fg.l w1 w1Var, boolean z4, boolean z5) {
            kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("翃\u0001"));
            if (w1Var instanceof q) {
                return (q) w1Var;
            }
            kotlin.jvm.internal.w wVar = null;
            if (!z5 && !d(w1Var, z4)) {
                return null;
            }
            if (w1Var instanceof b0) {
                b0 b0Var = (b0) w1Var;
                kotlin.jvm.internal.l0.g(b0Var.W0().O0(), b0Var.X0().O0());
            }
            return new q(e0.c(w1Var).V0(false), z4, wVar);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ q(p0 p0Var, boolean z4, kotlin.jvm.internal.w wVar) {
        this(p0Var, z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    public boolean G0() {
        return (this.f78525c.O0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.n) || (this.f78525c.O0().c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s, kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public p0 V0(boolean z4) {
        return z4 ? this.f78525c.V0(z4) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: W0 */
    public p0 U0(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("翸\u0001"));
        return new q(this.f78525c.U0(d1Var), this.f78526d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    protected p0 X0() {
        return this.f78525c;
    }

    @fg.l
    public final p0 a1() {
        return this.f78525c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public q Z0(@fg.l p0 p0Var) {
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("翹\u0001"));
        return new q(p0Var, this.f78526d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    @fg.l
    public h0 l0(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("翺\u0001"));
        return t0.e(h0Var.R0(), this.f78526d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @fg.l
    public String toString() {
        return this.f78525c + ProtectedSandApp.s("翻\u0001");
    }

    private q(p0 p0Var, boolean z4) {
        this.f78525c = p0Var;
        this.f78526d = z4;
    }
}
