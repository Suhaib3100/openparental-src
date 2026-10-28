package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.p0;
import com.annimon.stream.function.q;
import com.annimon.stream.function.q0;
import com.annimon.stream.function.r0;
import com.annimon.stream.function.s0;
import com.annimon.stream.function.u0;
import com.annimon.stream.function.v0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;

/* compiled from: OptionalLong.java */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    private static final n f41550c = new n();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41551a;

    /* renamed from: b, reason: collision with root package name */
    private final long f41552b;

    private n() {
        this.f41551a = false;
        this.f41552b = 0L;
    }

    public static n b() {
        return f41550c;
    }

    public static n o(long j4) {
        return new n(j4);
    }

    public static n p(Long l4) {
        return l4 == null ? f41550c : new n(l4.longValue());
    }

    public <R> R a(q<n, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public n c(Runnable runnable) {
        if (!this.f41551a) {
            runnable.run();
        }
        return this;
    }

    public n d(p0 p0Var) {
        h(p0Var);
        return this;
    }

    public n e(r0 r0Var) {
        return !this.f41551a ? this : r0Var.d(this.f41552b) ? this : f41550c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        boolean z4 = this.f41551a;
        if (z4 && nVar.f41551a) {
            if (this.f41552b == nVar.f41552b) {
                return true;
            }
        } else if (z4 == nVar.f41551a) {
            return true;
        }
        return false;
    }

    public n f(r0 r0Var) {
        return e(r0.a.b(r0Var));
    }

    public long g() {
        return t();
    }

    public void h(p0 p0Var) {
        if (this.f41551a) {
            p0Var.h(this.f41552b);
        }
    }

    public int hashCode() {
        if (this.f41551a) {
            return i.g(Long.valueOf(this.f41552b));
        }
        return 0;
    }

    public void i(p0 p0Var, Runnable runnable) {
        if (this.f41551a) {
            p0Var.h(this.f41552b);
        } else {
            runnable.run();
        }
    }

    public boolean j() {
        return !this.f41551a;
    }

    public boolean k() {
        return this.f41551a;
    }

    public n l(v0 v0Var) {
        if (!this.f41551a) {
            return f41550c;
        }
        v0Var.getClass();
        return new n(v0Var.c(this.f41552b));
    }

    public m m(u0 u0Var) {
        if (!this.f41551a) {
            return m.b();
        }
        u0Var.getClass();
        return m.p(u0Var.c(this.f41552b));
    }

    public <U> j<U> n(q0<U> q0Var) {
        if (!this.f41551a) {
            return j.b();
        }
        q0Var.getClass();
        return j.s(q0Var.c(this.f41552b));
    }

    public n q(a1<n> a1Var) {
        if (this.f41551a) {
            return this;
        }
        a1Var.getClass();
        n nVar = a1Var.get();
        nVar.getClass();
        return nVar;
    }

    public long r(long j4) {
        return this.f41551a ? this.f41552b : j4;
    }

    public long s(s0 s0Var) {
        return this.f41551a ? this.f41552b : s0Var.a();
    }

    public long t() {
        if (this.f41551a) {
            return this.f41552b;
        }
        throw new NoSuchElementException(ProtectedSandApp.s("ߨ"));
    }

    public String toString() {
        if (!this.f41551a) {
            return ProtectedSandApp.s("ߪ");
        }
        return String.format(ProtectedSandApp.s("ߩ"), Long.valueOf(this.f41552b));
    }

    public <X extends Throwable> long u(a1<X> a1Var) throws Throwable {
        if (this.f41551a) {
            return this.f41552b;
        }
        throw a1Var.get();
    }

    public h v() {
        return !this.f41551a ? h.k() : h.Q(this.f41552b);
    }

    private n(long j4) {
        this.f41551a = true;
        this.f41552b = j4;
    }
}
