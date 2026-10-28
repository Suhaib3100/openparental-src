package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: flexibleTypes.kt */
/* loaded from: classes6.dex */
public final class c0 extends b0 implements o {

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    public static final a f26336s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    @p3.f
    public static boolean f26337t;

    /* renamed from: r, reason: collision with root package name */
    private boolean f26338r;

    /* compiled from: flexibleTypes.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@d5.d p0 p0Var, @d5.d p0 p0Var2) {
        super(p0Var, p0Var2);
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("衽"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("衾"));
    }

    private final void g1() {
        if (!f26337t || this.f26338r) {
            return;
        }
        this.f26338r = true;
        e0.b(c1());
        e0.b(d1());
        kotlin.jvm.internal.l0.g(c1(), d1());
        kotlin.reflect.jvm.internal.impl.types.checker.e.f26341a.d(c1(), d1());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    public boolean H0() {
        return (c1().U0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) && kotlin.jvm.internal.l0.g(c1().U0(), d1().U0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    @d5.d
    public h0 S(@d5.d h0 h0Var) {
        w1 d6;
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("衿"));
        w1 X0 = h0Var.X0();
        if (X0 instanceof b0) {
            d6 = X0;
        } else {
            if (!(X0 instanceof p0)) {
                throw new NoWhenBranchMatchedException();
            }
            p0 p0Var = (p0) X0;
            d6 = i0.d(p0Var, p0Var.b1(true));
        }
        return v1.b(d6, X0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: Y0 */
    public w1 b1(boolean z5) {
        return i0.d(c1().b1(z5), d1().b1(z5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public w1 a1(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("袀"));
        return i0.d(c1().a1(d1Var), d1().a1(d1Var));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @d5.d
    public p0 b1() {
        g1();
        return c1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @d5.d
    public String e1(@d5.d kotlin.reflect.jvm.internal.impl.renderer.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("袁"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("袂"));
        if (!fVar.p()) {
            return cVar.v(cVar.y(c1()), cVar.y(d1()), kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(this));
        }
        return ProtectedSandApp.s("袃") + cVar.y(c1()) + ProtectedSandApp.s("袄") + cVar.y(d1()) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public b0 e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("袅"));
        h0 a6 = gVar.a(c1());
        String s5 = ProtectedSandApp.s("袆");
        kotlin.jvm.internal.l0.n(a6, s5);
        h0 a7 = gVar.a(d1());
        kotlin.jvm.internal.l0.n(a7, s5);
        return new c0((p0) a6, (p0) a7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("袇") + c1() + ProtectedSandApp.s("袈") + d1() + ')';
    }
}
