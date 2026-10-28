package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.f;
import com.annimon.stream.function.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;

/* compiled from: OptionalBoolean.java */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    private static final k f41539c = new k();

    /* renamed from: d, reason: collision with root package name */
    private static final k f41540d = new k(true);

    /* renamed from: e, reason: collision with root package name */
    private static final k f41541e = new k(false);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41542a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f41543b;

    private k() {
        this.f41542a = false;
        this.f41543b = false;
    }

    public static k b() {
        return f41539c;
    }

    public static k n(boolean z4) {
        return z4 ? f41540d : f41541e;
    }

    public static k o(Boolean bool) {
        return bool == null ? f41539c : n(bool.booleanValue());
    }

    public <R> R a(q<k, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public k c(Runnable runnable) {
        if (!this.f41542a) {
            runnable.run();
        }
        return this;
    }

    public k d(com.annimon.stream.function.d dVar) {
        h(dVar);
        return this;
    }

    public k e(com.annimon.stream.function.f fVar) {
        return !this.f41542a ? this : fVar.a(this.f41543b) ? this : f41539c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        boolean z4 = this.f41542a;
        if (z4 && kVar.f41542a) {
            if (this.f41543b == kVar.f41543b) {
                return true;
            }
        } else if (z4 == kVar.f41542a) {
            return true;
        }
        return false;
    }

    public k f(com.annimon.stream.function.f fVar) {
        return e(f.a.c(fVar));
    }

    public boolean g() {
        return s();
    }

    public void h(com.annimon.stream.function.d dVar) {
        if (this.f41542a) {
            dVar.a(this.f41543b);
        }
    }

    public int hashCode() {
        if (this.f41542a) {
            return this.f41543b ? 1231 : 1237;
        }
        return 0;
    }

    public void i(com.annimon.stream.function.d dVar, Runnable runnable) {
        if (this.f41542a) {
            dVar.a(this.f41543b);
        } else {
            runnable.run();
        }
    }

    public boolean j() {
        return !this.f41542a;
    }

    public boolean k() {
        return this.f41542a;
    }

    public k l(com.annimon.stream.function.f fVar) {
        if (!this.f41542a) {
            return f41539c;
        }
        fVar.getClass();
        return n(fVar.a(this.f41543b));
    }

    public <U> j<U> m(com.annimon.stream.function.e<U> eVar) {
        if (!this.f41542a) {
            return j.b();
        }
        eVar.getClass();
        return j.s(eVar.a(this.f41543b));
    }

    public k p(a1<k> a1Var) {
        if (this.f41542a) {
            return this;
        }
        a1Var.getClass();
        k kVar = a1Var.get();
        kVar.getClass();
        return kVar;
    }

    public boolean q(boolean z4) {
        return this.f41542a ? this.f41543b : z4;
    }

    public boolean r(com.annimon.stream.function.g gVar) {
        return this.f41542a ? this.f41543b : gVar.getAsBoolean();
    }

    public boolean s() {
        if (this.f41542a) {
            return this.f41543b;
        }
        throw new NoSuchElementException(ProtectedSandApp.s("ߞ"));
    }

    public <X extends Throwable> boolean t(a1<X> a1Var) throws Throwable {
        if (this.f41542a) {
            return this.f41543b;
        }
        throw a1Var.get();
    }

    public String toString() {
        return this.f41542a ? this.f41543b ? ProtectedSandApp.s("ߟ") : ProtectedSandApp.s("ߠ") : ProtectedSandApp.s("ߡ");
    }

    private k(boolean z4) {
        this.f41542a = true;
        this.f41543b = z4;
    }
}
