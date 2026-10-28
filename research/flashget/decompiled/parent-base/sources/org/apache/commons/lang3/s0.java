package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: Range.java */
/* loaded from: classes6.dex */
public final class s0<T> implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final long f86109g = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<T> f86110b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f86111c;

    /* renamed from: d, reason: collision with root package name */
    private final T f86112d;

    /* renamed from: e, reason: collision with root package name */
    private final T f86113e;

    /* renamed from: f, reason: collision with root package name */
    private transient String f86114f;

    /* compiled from: Range.java */
    private enum a implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    private s0(T t4, T t5, Comparator<T> comparator) {
        if (t4 == null || t5 == null) {
            throw new IllegalArgumentException("Elements in a range must not be null: element1=" + t4 + ", element2=" + t5);
        }
        if (comparator == null) {
            this.f86110b = a.INSTANCE;
        } else {
            this.f86110b = comparator;
        }
        if (this.f86110b.compare(t4, t5) < 1) {
            this.f86113e = t4;
            this.f86112d = t5;
        } else {
            this.f86113e = t5;
            this.f86112d = t4;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;TT;)Lorg/apache/commons/lang3/s0<TT;>; */
    public static s0 a(Comparable comparable, Comparable comparable2) {
        return new s0(comparable, comparable2, null);
    }

    public static <T> s0<T> b(T t4, T t5, Comparator<T> comparator) {
        return new s0<>(t4, t5, comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;)Lorg/apache/commons/lang3/s0<TT;>; */
    public static s0 k(Comparable comparable) {
        return new s0(comparable, comparable, null);
    }

    public static <T> s0<T> l(T t4, Comparator<T> comparator) {
        return new s0<>(t4, t4, comparator);
    }

    public boolean c(T t4) {
        return t4 != null && this.f86110b.compare(t4, this.f86113e) > -1 && this.f86110b.compare(t4, this.f86112d) < 1;
    }

    public boolean d(s0<T> s0Var) {
        return s0Var != null && c(s0Var.f86113e) && c(s0Var.f86112d);
    }

    public int e(T t4) {
        k1.b0(t4, "Element is null", new Object[0]);
        if (m(t4)) {
            return -1;
        }
        return o(t4) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != s0.class) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f86113e.equals(s0Var.f86113e) && this.f86112d.equals(s0Var.f86112d);
    }

    public T f(T t4) {
        k1.b0(t4, "element", new Object[0]);
        return m(t4) ? this.f86113e : o(t4) ? this.f86112d : t4;
    }

    public Comparator<T> g() {
        return this.f86110b;
    }

    public T h() {
        return this.f86112d;
    }

    public int hashCode() {
        int i4 = this.f86111c;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = this.f86112d.hashCode() + ((this.f86113e.hashCode() + ((s0.class.hashCode() + 629) * 37)) * 37);
        this.f86111c = hashCode;
        return hashCode;
    }

    public T i() {
        return this.f86113e;
    }

    public s0<T> j(s0<T> s0Var) {
        if (!s(s0Var)) {
            throw new IllegalArgumentException(String.format("Cannot calculate intersection with non-overlapping range %s", s0Var));
        }
        if (equals(s0Var)) {
            return this;
        }
        return new s0<>(this.f86110b.compare(this.f86113e, s0Var.f86113e) < 0 ? s0Var.f86113e : this.f86113e, this.f86110b.compare(this.f86112d, s0Var.f86112d) < 0 ? this.f86112d : s0Var.f86112d, this.f86110b);
    }

    public boolean m(T t4) {
        return t4 != null && this.f86110b.compare(t4, this.f86113e) < 0;
    }

    public boolean n(s0<T> s0Var) {
        if (s0Var == null) {
            return false;
        }
        return m(s0Var.f86112d);
    }

    public boolean o(T t4) {
        return t4 != null && this.f86110b.compare(t4, this.f86112d) > 0;
    }

    public boolean p(s0<T> s0Var) {
        if (s0Var == null) {
            return false;
        }
        return o(s0Var.f86113e);
    }

    public boolean q(T t4) {
        return t4 != null && this.f86110b.compare(t4, this.f86112d) == 0;
    }

    public boolean r() {
        return this.f86110b == a.INSTANCE;
    }

    public boolean s(s0<T> s0Var) {
        if (s0Var == null) {
            return false;
        }
        return s0Var.c(this.f86113e) || s0Var.c(this.f86112d) || c(s0Var.f86113e);
    }

    public boolean t(T t4) {
        return t4 != null && this.f86110b.compare(t4, this.f86113e) == 0;
    }

    public String toString() {
        if (this.f86114f == null) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f86113e);
            sb.append("..");
            this.f86114f = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(sb, this.f86112d, "]");
        }
        return this.f86114f;
    }

    public String u(String str) {
        return String.format(str, this.f86113e, this.f86112d, this.f86110b);
    }
}
