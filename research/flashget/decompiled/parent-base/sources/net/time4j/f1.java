package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: Weekcycle.java */
/* loaded from: classes7.dex */
public final class f1 extends net.time4j.engine.f implements x, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f82779b = new f1();
    private static final long serialVersionUID = -4981215347844372171L;

    private f1() {
    }

    private Object readResolve() throws ObjectStreamException {
        return f82779b;
    }

    @Override // net.time4j.engine.f
    protected <T extends net.time4j.engine.r<T>> net.time4j.engine.o0<T> b(net.time4j.engine.x<T> xVar) {
        if (xVar.K(l0.f83325p)) {
            return j1.O();
        }
        return null;
    }

    public long c(l0 l0Var, l0 l0Var2) {
        return a(l0Var).a(l0Var, l0Var2);
    }

    @Override // net.time4j.engine.w
    public double getLength() {
        return h.YEARS.getLength();
    }

    @Override // net.time4j.z
    public char getSymbol() {
        return 'Y';
    }

    @Override // net.time4j.engine.f, net.time4j.engine.w
    public boolean isCalendrical() {
        return true;
    }

    public String toString() {
        return ProtectedSandApp.s("錩\u0001");
    }
}
