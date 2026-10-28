package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Enum;
import net.time4j.engine.ChronoException;

/* compiled from: NavigationOperator.java */
/* loaded from: classes7.dex */
final class h0<V extends Enum<V>> extends q<l0> {
    private final V B;
    private final int C;
    private final net.time4j.engine.v<n0> D;

    /* compiled from: NavigationOperator.java */
    class a implements net.time4j.engine.v<n0> {
        a() {
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 apply(n0 n0Var) {
            return (n0) h0.this.l(n0Var);
        }
    }

    h0(net.time4j.engine.q<V> qVar, int i4, V v4) {
        super(qVar, i4);
        if (v4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("阗\u0001"));
        }
        this.B = v4;
        this.C = qVar.getType().getEnumConstants().length;
        this.D = new a();
    }

    private int k(int i4) {
        int i5;
        int i6;
        int ordinal = this.B.ordinal();
        switch (d()) {
            case 9:
                if (ordinal > i4) {
                    return ordinal;
                }
                i5 = this.C;
                return ordinal + i5;
            case 10:
                if (ordinal < i4) {
                    return ordinal;
                }
                i6 = this.C;
                return ordinal - i6;
            case 11:
                if (ordinal >= i4) {
                    return ordinal;
                }
                i5 = this.C;
                return ordinal + i5;
            case 12:
                if (ordinal <= i4) {
                    return ordinal;
                }
                i6 = this.C;
                return ordinal - i6;
            default:
                throw new AssertionError(ProtectedSandApp.s("阘\u0001") + d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends net.time4j.engine.r<T>> T l(T t4) {
        String s4;
        net.time4j.engine.q<l0> qVar = l0.f83325p;
        if (t4.w(qVar)) {
            l0 l0Var = (l0) t4.r(qVar);
            int ordinal = ((Enum) Enum.class.cast(l0Var.r(c()))).ordinal();
            return k(ordinal) == ordinal ? t4 : (T) t4.M(qVar, l0Var.W(r3 - ordinal, l0Var.y().t0(c())));
        }
        switch (d()) {
            case 9:
                s4 = ProtectedSandApp.s("阜\u0001");
                break;
            case 10:
                s4 = ProtectedSandApp.s("阛\u0001");
                break;
            case 11:
                s4 = ProtectedSandApp.s("阚\u0001");
                break;
            case 12:
                s4 = ProtectedSandApp.s("阙\u0001");
                break;
            default:
                throw new AssertionError(ProtectedSandApp.s("阘\u0001") + d());
        }
        throw new ChronoException(g0.a(c(), androidx.constraintlayout.core.e.a(s4, ProtectedSandApp.s("阝\u0001"))));
    }

    @Override // net.time4j.engine.v
    public Object apply(Object obj) {
        return (l0) l((l0) obj);
    }

    @Override // net.time4j.q
    net.time4j.engine.v<n0> h() {
        return this.D;
    }

    public l0 j(l0 l0Var) {
        return (l0) l(l0Var);
    }
}
