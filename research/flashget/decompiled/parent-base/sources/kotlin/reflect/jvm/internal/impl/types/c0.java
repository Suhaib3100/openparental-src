package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: flexibleTypes.kt */
@kotlin.jvm.internal.r1({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
/* loaded from: classes7.dex */
public final class c0 extends b0 implements o {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final a f78344f = new a();

    /* renamed from: g, reason: collision with root package name */
    @kd.f
    public static boolean f78345g;

    /* renamed from: e, reason: collision with root package name */
    private boolean f78346e;

    /* compiled from: flexibleTypes.kt */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@fg.l p0 p0Var, @fg.l p0 p0Var2) {
        super(p0Var, p0Var2);
        kotlin.jvm.internal.l0.p(p0Var, ProtectedSandApp.s("紻\u0001"));
        kotlin.jvm.internal.l0.p(p0Var2, ProtectedSandApp.s("紼\u0001"));
    }

    private final void a1() {
        if (!f78345g || this.f78346e) {
            return;
        }
        this.f78346e = true;
        e0.b(W0());
        e0.b(X0());
        kotlin.jvm.internal.l0.g(W0(), X0());
        kotlin.reflect.jvm.internal.impl.types.checker.e.f78349a.d(W0(), X0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    public boolean G0() {
        return (W0().O0().c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) && kotlin.jvm.internal.l0.g(W0().O0(), X0().O0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: S0 */
    public w1 V0(boolean z4) {
        return i0.d(W0().V0(z4), X0().V0(z4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public w1 U0(@fg.l d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("紽\u0001"));
        return i0.d(W0().U0(d1Var), X0().U0(d1Var));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @fg.l
    public p0 V0() {
        a1();
        return W0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @fg.l
    public String Y0(@fg.l kotlin.reflect.jvm.internal.impl.renderer.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("紾\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("紿\u0001"));
        if (!fVar.j()) {
            return cVar.v(cVar.y(W0()), cVar.y(X0()), kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(this));
        }
        return ProtectedSandApp.s("絀\u0001") + cVar.y(W0()) + ProtectedSandApp.s("絁\u0001") + cVar.y(X0()) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public b0 Y0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("終\u0001"));
        h0 a5 = gVar.a(W0());
        String s4 = ProtectedSandApp.s("絃\u0001");
        kotlin.jvm.internal.l0.n(a5, s4);
        h0 a6 = gVar.a(X0());
        kotlin.jvm.internal.l0.n(a6, s4);
        return new c0((p0) a5, (p0) a6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    @fg.l
    public h0 l0(@fg.l h0 h0Var) {
        w1 d5;
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("組\u0001"));
        w1 R0 = h0Var.R0();
        if (R0 instanceof b0) {
            d5 = R0;
        } else {
            if (!(R0 instanceof p0)) {
                throw new NoWhenBranchMatchedException();
            }
            p0 p0Var = (p0) R0;
            d5 = i0.d(p0Var, p0Var.V0(true));
        }
        return v1.b(d5, R0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("絀\u0001") + W0() + ProtectedSandApp.s("絁\u0001") + X0() + ')';
    }
}
