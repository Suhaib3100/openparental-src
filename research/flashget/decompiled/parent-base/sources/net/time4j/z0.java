package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TimeOperator.java */
/* loaded from: classes7.dex */
final class z0 extends q<m0> {
    private final Object B;

    z0(net.time4j.engine.q<?> qVar, int i4) {
        this(qVar, i4, null);
    }

    private static <V, T extends net.time4j.engine.r<T>> net.time4j.engine.v<T> j(net.time4j.engine.q<V> qVar, boolean z4) {
        String name = qVar.name();
        return (name.equals(ProtectedSandApp.s("鸈\u0001")) || name.equals(ProtectedSandApp.s("鸉\u0001"))) ? new s('3', z4) : (name.equals(ProtectedSandApp.s("鸊\u0001")) || name.equals(ProtectedSandApp.s("鸋\u0001"))) ? new s('6', z4) : (name.equals(ProtectedSandApp.s("鸌\u0001")) || name.equals(ProtectedSandApp.s("鸍\u0001"))) ? new s('9', z4) : z4 ? net.time4j.engine.h0.c(qVar) : net.time4j.engine.h0.d(qVar);
    }

    private static <V> Object k(net.time4j.engine.q<V> qVar, Object obj) {
        return b1.b(net.time4j.engine.h0.o(qVar.getType().cast(obj), qVar), obj);
    }

    private static <V> Object l(net.time4j.engine.q<V> qVar, Object obj) {
        return b1.b(net.time4j.engine.h0.n(qVar.getType().cast(obj), qVar), obj);
    }

    @Override // net.time4j.q
    net.time4j.engine.v<n0> h() {
        return (net.time4j.engine.v) this.B;
    }

    @Override // net.time4j.engine.v
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public m0 apply(m0 m0Var) {
        return (m0) ((net.time4j.engine.v) this.B).apply(m0Var);
    }

    z0(net.time4j.engine.q<?> qVar, int i4, Object obj) {
        super(qVar, i4);
        switch (i4) {
            case -1:
                this.B = l(qVar, obj);
                return;
            case 0:
                this.B = net.time4j.engine.h0.l(qVar);
                return;
            case 1:
                this.B = net.time4j.engine.h0.j(qVar);
                return;
            case 2:
                this.B = net.time4j.engine.h0.f(qVar);
                return;
            case 3:
                this.B = net.time4j.engine.h0.h(qVar);
                return;
            case 4:
                this.B = j(qVar, false);
                return;
            case 5:
                this.B = j(qVar, true);
                return;
            case 6:
                this.B = k(qVar, obj);
                return;
            default:
                throw new AssertionError(ProtectedSandApp.s("鸇\u0001") + d());
        }
    }
}
