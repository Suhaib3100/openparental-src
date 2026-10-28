package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.m0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.v1;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes6.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.types.s implements m0 {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final p0 f24844p;

    public g(@d5.d p0 p0Var) {
        l0.p(p0Var, ProtectedSandApp.s("薘"));
        this.f24844p = p0Var;
    }

    private final p0 g1(p0 p0Var) {
        p0 b12 = p0Var.b1(false);
        return !kotlin.reflect.jvm.internal.impl.types.typeUtil.a.r(p0Var) ? b12 : new g(b12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    public boolean H0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    @d5.d
    public h0 S(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("薙"));
        w1 X0 = h0Var.X0();
        if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.r(X0) && !t1.l(X0)) {
            return X0;
        }
        if (X0 instanceof p0) {
            return g1((p0) X0);
        }
        if (X0 instanceof b0) {
            b0 b0Var = (b0) X0;
            return v1.d(i0.d(g1(b0Var.c1()), g1(b0Var.d1())), v1.a(X0));
        }
        throw new IllegalStateException((ProtectedSandApp.s("薚") + X0).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s, kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public p0 b1(boolean z5) {
        return z5 ? this.f24844p.b1(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    protected p0 d1() {
        return this.f24844p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @d5.d
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public g a1(@d5.d d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("薛"));
        return new g(this.f24844p.a1(d1Var));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @d5.d
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public g f1(@d5.d p0 p0Var) {
        l0.p(p0Var, ProtectedSandApp.s("薜"));
        return new g(p0Var);
    }
}
