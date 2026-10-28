package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.h0;
import com.annimon.stream.function.i0;
import com.annimon.stream.function.j0;
import com.annimon.stream.function.k0;
import com.annimon.stream.function.l0;
import com.annimon.stream.function.m0;
import com.annimon.stream.function.n0;
import com.annimon.stream.function.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;

/* compiled from: OptionalInt.java */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private static final m f41547c = new m();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41548a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41549b;

    private m() {
        this.f41548a = false;
        this.f41549b = 0;
    }

    public static m b() {
        return f41547c;
    }

    public static m p(int i4) {
        return new m(i4);
    }

    public static m q(Integer num) {
        return num == null ? f41547c : new m(num.intValue());
    }

    public <R> R a(q<m, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public m c(Runnable runnable) {
        if (!this.f41548a) {
            runnable.run();
        }
        return this;
    }

    public m d(h0 h0Var) {
        h(h0Var);
        return this;
    }

    public m e(j0 j0Var) {
        return !this.f41548a ? this : j0Var.test(this.f41549b) ? this : f41547c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        boolean z4 = this.f41548a;
        if (z4 && mVar.f41548a) {
            if (this.f41549b == mVar.f41549b) {
                return true;
            }
        } else if (z4 == mVar.f41548a) {
            return true;
        }
        return false;
    }

    public m f(j0 j0Var) {
        return e(j0.a.b(j0Var));
    }

    public int g() {
        return u();
    }

    public void h(h0 h0Var) {
        if (this.f41548a) {
            h0Var.f(this.f41549b);
        }
    }

    public int hashCode() {
        if (this.f41548a) {
            return this.f41549b;
        }
        return 0;
    }

    public void i(h0 h0Var, Runnable runnable) {
        if (this.f41548a) {
            h0Var.f(this.f41549b);
        } else {
            runnable.run();
        }
    }

    public boolean j() {
        return !this.f41548a;
    }

    public boolean k() {
        return this.f41548a;
    }

    public m l(n0 n0Var) {
        return !this.f41548a ? f41547c : new m(n0Var.c(this.f41549b));
    }

    public l m(l0 l0Var) {
        return !this.f41548a ? l.b() : l.p(l0Var.c(this.f41549b));
    }

    public n n(m0 m0Var) {
        return !this.f41548a ? n.b() : n.o(m0Var.c(this.f41549b));
    }

    public <U> j<U> o(i0<U> i0Var) {
        return !this.f41548a ? j.b() : j.s(i0Var.c(this.f41549b));
    }

    public m r(a1<m> a1Var) {
        if (this.f41548a) {
            return this;
        }
        a1Var.getClass();
        m mVar = a1Var.get();
        mVar.getClass();
        return mVar;
    }

    public int s(int i4) {
        return this.f41548a ? this.f41549b : i4;
    }

    public int t(k0 k0Var) {
        return this.f41548a ? this.f41549b : k0Var.a();
    }

    public String toString() {
        if (!this.f41548a) {
            return ProtectedSandApp.s("ߦ");
        }
        return String.format(ProtectedSandApp.s("ߥ"), Integer.valueOf(this.f41549b));
    }

    public int u() {
        if (this.f41548a) {
            return this.f41549b;
        }
        throw new NoSuchElementException(ProtectedSandApp.s("ߧ"));
    }

    public <X extends Throwable> int v(a1<X> a1Var) throws Throwable {
        if (this.f41548a) {
            return this.f41549b;
        }
        throw a1Var.get();
    }

    public g w() {
        return !this.f41548a ? g.k() : g.Q(this.f41549b);
    }

    private m(int i4) {
        this.f41548a = true;
        this.f41549b = i4;
    }
}
