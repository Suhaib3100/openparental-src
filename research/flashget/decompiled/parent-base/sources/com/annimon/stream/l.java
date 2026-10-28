package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.l;
import com.annimon.stream.function.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;

/* compiled from: OptionalDouble.java */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final l f41544c = new l();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41545a;

    /* renamed from: b, reason: collision with root package name */
    private final double f41546b;

    private l() {
        this.f41545a = false;
        this.f41546b = com.google.firebase.remoteconfig.p.f60679p;
    }

    public static l b() {
        return f41544c;
    }

    public static l p(double d5) {
        return new l(d5);
    }

    public static l q(Double d5) {
        return d5 == null ? f41544c : new l(d5.doubleValue());
    }

    public <R> R a(q<l, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public l c(Runnable runnable) {
        if (!this.f41545a) {
            runnable.run();
        }
        return this;
    }

    public l d(com.annimon.stream.function.j jVar) {
        h(jVar);
        return this;
    }

    public l e(com.annimon.stream.function.l lVar) {
        return !this.f41545a ? this : lVar.d(this.f41546b) ? this : f41544c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        boolean z4 = this.f41545a;
        if (z4 && lVar.f41545a) {
            if (Double.compare(this.f41546b, lVar.f41546b) == 0) {
                return true;
            }
        } else if (z4 == lVar.f41545a) {
            return true;
        }
        return false;
    }

    public l f(com.annimon.stream.function.l lVar) {
        return e(l.a.b(lVar));
    }

    public double g() {
        return u();
    }

    public void h(com.annimon.stream.function.j jVar) {
        if (this.f41545a) {
            jVar.c(this.f41546b);
        }
    }

    public int hashCode() {
        if (this.f41545a) {
            return i.g(Double.valueOf(this.f41546b));
        }
        return 0;
    }

    public void i(com.annimon.stream.function.j jVar, Runnable runnable) {
        if (this.f41545a) {
            jVar.c(this.f41546b);
        } else {
            runnable.run();
        }
    }

    public boolean j() {
        return !this.f41545a;
    }

    public boolean k() {
        return this.f41545a;
    }

    public l l(com.annimon.stream.function.p pVar) {
        if (!this.f41545a) {
            return f41544c;
        }
        pVar.getClass();
        return new l(pVar.applyAsDouble(this.f41546b));
    }

    public m m(com.annimon.stream.function.n nVar) {
        if (!this.f41545a) {
            return m.b();
        }
        nVar.getClass();
        return m.p(nVar.c(this.f41546b));
    }

    public n n(com.annimon.stream.function.o oVar) {
        if (!this.f41545a) {
            return n.b();
        }
        oVar.getClass();
        return n.o(oVar.c(this.f41546b));
    }

    public <U> j<U> o(com.annimon.stream.function.k<U> kVar) {
        if (!this.f41545a) {
            return j.b();
        }
        kVar.getClass();
        return j.s(kVar.c(this.f41546b));
    }

    public l r(a1<l> a1Var) {
        if (this.f41545a) {
            return this;
        }
        a1Var.getClass();
        l lVar = a1Var.get();
        lVar.getClass();
        return lVar;
    }

    public double s(double d5) {
        return this.f41545a ? this.f41546b : d5;
    }

    public double t(com.annimon.stream.function.m mVar) {
        return this.f41545a ? this.f41546b : mVar.a();
    }

    public String toString() {
        if (!this.f41545a) {
            return ProtectedSandApp.s("ߣ");
        }
        return String.format(ProtectedSandApp.s("ߢ"), Double.valueOf(this.f41546b));
    }

    public double u() {
        if (this.f41545a) {
            return this.f41546b;
        }
        throw new NoSuchElementException(ProtectedSandApp.s("ߤ"));
    }

    public <X extends Throwable> double v(a1<X> a1Var) throws Throwable {
        if (this.f41545a) {
            return this.f41546b;
        }
        throw a1Var.get();
    }

    public d w() {
        return !this.f41545a ? d.l() : d.S(this.f41546b);
    }

    private l(double d5) {
        this.f41545a = true;
        this.f41546b = d5;
    }
}
