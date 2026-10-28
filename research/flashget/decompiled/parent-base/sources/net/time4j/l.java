package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DateOperator.java */
/* loaded from: classes7.dex */
final class l extends q<l0> {
    private final Object B;

    l(net.time4j.engine.q<?> qVar, int i4) {
        this(qVar, i4, null);
    }

    private static <V> Object j(net.time4j.engine.q<V> qVar, Object obj) {
        return b1.b(net.time4j.engine.h0.o(qVar.getType().cast(obj), qVar), obj);
    }

    private static <V> Object k(net.time4j.engine.q<V> qVar, Object obj) {
        return b1.b(net.time4j.engine.h0.n(qVar.getType().cast(obj), qVar), obj);
    }

    @Override // net.time4j.q
    net.time4j.engine.v<n0> h() {
        return (net.time4j.engine.v) this.B;
    }

    @Override // net.time4j.engine.v
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public l0 apply(l0 l0Var) {
        return (l0) ((net.time4j.engine.v) this.B).apply(l0Var);
    }

    l(net.time4j.engine.q<?> qVar, int i4, Object obj) {
        super(qVar, i4);
        switch (i4) {
            case -1:
                this.B = k(qVar, obj);
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
                this.B = net.time4j.engine.h0.d(qVar);
                return;
            case 5:
                this.B = net.time4j.engine.h0.c(qVar);
                return;
            case 6:
                this.B = j(qVar, obj);
                return;
            default:
                throw new AssertionError(ProtectedSandApp.s("鞭\u0001") + d());
        }
    }
}
