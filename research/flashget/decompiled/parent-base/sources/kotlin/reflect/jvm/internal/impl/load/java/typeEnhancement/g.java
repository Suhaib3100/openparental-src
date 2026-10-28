package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes7.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.types.s implements m0 {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final p0 f76720c;

    public g(@fg.l p0 p0Var) {
        l0.p(p0Var, ProtectedSandApp.s("犩\u0001"));
        this.f76720c = p0Var;
    }

    private final p0 a1(p0 p0Var) {
        p0 V0 = p0Var.V0(false);
        return !kotlin.reflect.jvm.internal.impl.types.typeUtil.a.t(p0Var) ? V0 : new g(V0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    public boolean G0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s, kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public p0 V0(boolean z4) {
        return z4 ? this.f76720c.V0(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    protected p0 X0() {
        return this.f76720c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @fg.l
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public g U0(@fg.l d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("犪\u0001"));
        return new g(this.f76720c.U0(d1Var));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    @fg.l
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public g Z0(@fg.l p0 p0Var) {
        l0.p(p0Var, ProtectedSandApp.s("犩\u0001"));
        return new g(p0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o
    @fg.l
    public h0 l0(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("犫\u0001"));
        w1 R0 = h0Var.R0();
        if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.t(R0) && !t1.l(R0)) {
            return R0;
        }
        if (R0 instanceof p0) {
            return a1((p0) R0);
        }
        if (R0 instanceof b0) {
            b0 b0Var = (b0) R0;
            return v1.d(i0.d(a1(b0Var.W0()), a1(b0Var.X0())), v1.a(R0));
        }
        throw new IllegalStateException((ProtectedSandApp.s("犬\u0001") + R0).toString());
    }
}
