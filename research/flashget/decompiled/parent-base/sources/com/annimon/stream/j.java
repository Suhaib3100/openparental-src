package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.q;
import com.annimon.stream.function.r1;
import com.annimon.stream.function.s1;
import com.annimon.stream.function.t1;
import com.annimon.stream.function.u1;
import com.annimon.stream.function.z0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;

/* compiled from: Optional.java */
/* loaded from: classes3.dex */
public class j<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final j<?> f41537b = new j<>();

    /* renamed from: a, reason: collision with root package name */
    private final T f41538a;

    private j() {
        this.f41538a = null;
    }

    public static <T> j<T> b() {
        return (j<T>) f41537b;
    }

    public static <T> j<T> r(T t4) {
        return new j<>(t4);
    }

    public static <T> j<T> s(T t4) {
        return t4 == null ? (j<T>) f41537b : new j<>(t4);
    }

    public <R> R a(q<j<T>, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public j<T> c(Runnable runnable) {
        if (this.f41538a == null) {
            runnable.run();
        }
        return this;
    }

    public j<T> d(com.annimon.stream.function.h<? super T> hVar) {
        i(hVar);
        return this;
    }

    public j<T> e(z0<? super T> z0Var) {
        return !l() ? this : z0Var.test(this.f41538a) ? this : (j<T>) f41537b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return i.e(this.f41538a, ((j) obj).f41538a);
        }
        return false;
    }

    public j<T> f(z0<? super T> z0Var) {
        return e(z0.a.c(z0Var));
    }

    public <U> j<U> g(q<? super T, j<U>> qVar) {
        if (!l()) {
            return (j<U>) f41537b;
        }
        j<U> apply = qVar.apply(this.f41538a);
        apply.getClass();
        return apply;
    }

    public T h() {
        return w();
    }

    public int hashCode() {
        return i.g(this.f41538a);
    }

    public void i(com.annimon.stream.function.h<? super T> hVar) {
        T t4 = this.f41538a;
        if (t4 != null) {
            hVar.accept(t4);
        }
    }

    public void j(com.annimon.stream.function.h<? super T> hVar, Runnable runnable) {
        T t4 = this.f41538a;
        if (t4 != null) {
            hVar.accept(t4);
        } else {
            runnable.run();
        }
    }

    public boolean k() {
        return this.f41538a == null;
    }

    public boolean l() {
        return this.f41538a != null;
    }

    public <U> j<U> m(q<? super T, ? extends U> qVar) {
        return !l() ? (j<U>) f41537b : s(qVar.apply(this.f41538a));
    }

    public k n(r1<? super T> r1Var) {
        return !l() ? k.b() : k.n(r1Var.a(this.f41538a));
    }

    public l o(s1<? super T> s1Var) {
        return !l() ? l.b() : l.p(s1Var.c(this.f41538a));
    }

    public m p(t1<? super T> t1Var) {
        return !l() ? m.b() : m.p(t1Var.c(this.f41538a));
    }

    public n q(u1<? super T> u1Var) {
        return !l() ? n.b() : n.o(u1Var.applyAsLong(this.f41538a));
    }

    public j<T> t(a1<j<T>> a1Var) {
        if (l()) {
            return this;
        }
        a1Var.getClass();
        j<T> jVar = a1Var.get();
        jVar.getClass();
        return jVar;
    }

    public String toString() {
        T t4 = this.f41538a;
        return t4 != null ? String.format(ProtectedSandApp.s("ߛ"), t4) : ProtectedSandApp.s("ߜ");
    }

    public T u(T t4) {
        T t5 = this.f41538a;
        return t5 != null ? t5 : t4;
    }

    public T v(a1<? extends T> a1Var) {
        T t4 = this.f41538a;
        return t4 != null ? t4 : a1Var.get();
    }

    public T w() {
        T t4 = this.f41538a;
        if (t4 != null) {
            return t4;
        }
        throw new NoSuchElementException(ProtectedSandApp.s("ߝ"));
    }

    public <X extends Throwable> T x(a1<? extends X> a1Var) throws Throwable {
        T t4 = this.f41538a;
        if (t4 != null) {
            return t4;
        }
        throw a1Var.get();
    }

    public <R> j<R> y(Class<R> cls) {
        cls.getClass();
        if (l()) {
            return s(cls.isInstance(this.f41538a) ? this.f41538a : null);
        }
        return (j<R>) f41537b;
    }

    public p<T> z() {
        return !l() ? p.q() : p.U0(this.f41538a);
    }

    private j(T t4) {
        t4.getClass();
        this.f41538a = t4;
    }
}
