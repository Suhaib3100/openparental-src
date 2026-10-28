package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.g1;
import com.annimon.stream.function.q;
import com.annimon.stream.function.q1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Exceptional.java */
/* loaded from: classes3.dex */
public class e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f41352a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f41353b;

    private e(T t4, Throwable th) {
        this.f41352a = t4;
        this.f41353b = th;
    }

    public static <T> e<T> o(q1<T, Throwable> q1Var) {
        try {
            return new e<>(q1Var.get(), null);
        } catch (Throwable th) {
            return p(th);
        }
    }

    public static <T> e<T> p(Throwable th) {
        return new e<>(null, th);
    }

    public <R> R a(q<e<T>, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public T b() {
        return this.f41352a;
    }

    public Throwable c() {
        return this.f41353b;
    }

    public j<T> d() {
        return j.s(this.f41352a);
    }

    public T e(a1<? extends T> a1Var) {
        return this.f41353b == null ? this.f41352a : a1Var.get();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i.e(this.f41352a, eVar.f41352a) && i.e(this.f41353b, eVar.f41353b);
    }

    public T f(T t4) {
        return this.f41353b == null ? this.f41352a : t4;
    }

    public T g() throws Throwable {
        Throwable th = this.f41353b;
        if (th == null) {
            return this.f41352a;
        }
        throw th;
    }

    public <E extends Throwable> T h(E e4) throws Throwable {
        Throwable th = this.f41353b;
        if (th == null) {
            return this.f41352a;
        }
        e4.initCause(th);
        throw e4;
    }

    public int hashCode() {
        return i.f(this.f41352a, this.f41353b);
    }

    public T i() throws RuntimeException {
        if (this.f41353b == null) {
            return this.f41352a;
        }
        throw new RuntimeException(this.f41353b);
    }

    public e<T> j(com.annimon.stream.function.h<Throwable> hVar) {
        Throwable th = this.f41353b;
        if (th != null) {
            hVar.accept(th);
        }
        return this;
    }

    public <E extends Throwable> e<T> k(Class<E> cls, com.annimon.stream.function.h<? super E> hVar) {
        Throwable th = this.f41353b;
        if (th != null && cls.isAssignableFrom(th.getClass())) {
            hVar.accept(this.f41353b);
        }
        return this;
    }

    public e<T> l(com.annimon.stream.function.h<? super T> hVar) {
        if (this.f41353b == null) {
            hVar.accept(this.f41352a);
        }
        return this;
    }

    public boolean m() {
        return this.f41353b == null;
    }

    public <U> e<U> n(g1<? super T, ? extends U, Throwable> g1Var) {
        Throwable th = this.f41353b;
        if (th != null) {
            return p(th);
        }
        g1Var.getClass();
        try {
            return new e<>(g1Var.apply(this.f41352a), null);
        } catch (Throwable th2) {
            return p(th2);
        }
    }

    public e<T> q(a1<e<T>> a1Var) {
        if (this.f41353b == null) {
            return this;
        }
        a1Var.getClass();
        e<T> eVar = a1Var.get();
        eVar.getClass();
        return eVar;
    }

    public e<T> r(g1<Throwable, ? extends T, Throwable> g1Var) {
        if (this.f41353b == null) {
            return this;
        }
        g1Var.getClass();
        try {
            return new e<>(g1Var.apply(this.f41353b), null);
        } catch (Throwable th) {
            return p(th);
        }
    }

    public e<T> s(q<Throwable, ? extends e<T>> qVar) {
        if (this.f41353b == null) {
            return this;
        }
        qVar.getClass();
        e<T> apply = qVar.apply(this.f41353b);
        apply.getClass();
        return apply;
    }

    public String toString() {
        Throwable th = this.f41353b;
        if (th != null) {
            return String.format(ProtectedSandApp.s("߄"), th);
        }
        return String.format(ProtectedSandApp.s("߃"), this.f41352a);
    }
}
