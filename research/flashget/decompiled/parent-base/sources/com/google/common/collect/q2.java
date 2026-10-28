package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: GeneralRange.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class q2<T> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<? super T> f56192b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f56193c;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private final T f56194d;

    /* renamed from: e, reason: collision with root package name */
    private final x f56195e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f56196f;

    /* renamed from: g, reason: collision with root package name */
    @zc.a
    private final T f56197g;

    /* renamed from: h, reason: collision with root package name */
    private final x f56198h;

    /* renamed from: i, reason: collision with root package name */
    @zc.a
    private transient q2<T> f56199i;

    /* JADX WARN: Multi-variable type inference failed */
    private q2(Comparator<? super T> comparator, boolean z4, @zc.a T t4, x xVar, boolean z5, @zc.a T t5, x xVar2) {
        comparator.getClass();
        this.f56192b = comparator;
        this.f56193c = z4;
        this.f56196f = z5;
        this.f56194d = t4;
        xVar.getClass();
        this.f56195e = xVar;
        this.f56197g = t5;
        xVar2.getClass();
        this.f56198h = xVar2;
        if (z4) {
            comparator.compare(t4, t4);
        }
        if (z5) {
            comparator.compare(t5, t5);
        }
        if (z4 && z5) {
            int compare = comparator.compare(t4, t5);
            com.google.common.base.l0.y(compare <= 0, ProtectedSandApp.s("\uf530"), t4, t5);
            if (compare == 0) {
                x xVar3 = x.OPEN;
                com.google.common.base.l0.d((xVar == xVar3 && xVar2 == xVar3) ? false : true);
            }
        }
    }

    static <T> q2<T> a(Comparator<? super T> comparator) {
        x xVar = x.OPEN;
        return new q2<>(comparator, false, null, xVar, false, null, xVar);
    }

    static <T> q2<T> d(Comparator<? super T> comparator, @f5 T t4, x xVar) {
        return new q2<>(comparator, true, t4, xVar, false, null, x.OPEN);
    }

    static <T extends Comparable> q2<T> e(j5<T> j5Var) {
        return new q2<>(x4.f56632f, j5Var.q(), j5Var.q() ? j5Var.f55872b.i() : null, j5Var.q() ? j5Var.f55872b.m() : x.OPEN, j5Var.r(), j5Var.r() ? j5Var.f55873c.i() : null, j5Var.r() ? j5Var.f55873c.n() : x.OPEN);
    }

    static <T> q2<T> n(Comparator<? super T> comparator, @f5 T t4, x xVar, @f5 T t5, x xVar2) {
        return new q2<>(comparator, true, t4, xVar, true, t5, xVar2);
    }

    static <T> q2<T> r(Comparator<? super T> comparator, @f5 T t4, x xVar) {
        return new q2<>(comparator, false, null, x.OPEN, true, t4, xVar);
    }

    Comparator<? super T> b() {
        return this.f56192b;
    }

    boolean c(@f5 T t4) {
        return (q(t4) || p(t4)) ? false : true;
    }

    public boolean equals(@zc.a Object obj) {
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f56192b.equals(q2Var.f56192b) && this.f56193c == q2Var.f56193c && this.f56196f == q2Var.f56196f && this.f56195e.equals(q2Var.f56195e) && this.f56198h.equals(q2Var.f56198h) && com.google.common.base.f0.a(this.f56194d, q2Var.f56194d) && com.google.common.base.f0.a(this.f56197g, q2Var.f56197g);
    }

    x f() {
        return this.f56195e;
    }

    @zc.a
    T g() {
        return this.f56194d;
    }

    x h() {
        return this.f56198h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56192b, this.f56194d, this.f56195e, this.f56197g, this.f56198h});
    }

    @zc.a
    T i() {
        return this.f56197g;
    }

    boolean j() {
        return this.f56193c;
    }

    boolean k() {
        return this.f56196f;
    }

    q2<T> l(q2<T> q2Var) {
        int compare;
        int compare2;
        T t4;
        x xVar;
        x xVar2;
        int compare3;
        x xVar3;
        q2Var.getClass();
        com.google.common.base.l0.d(this.f56192b.equals(q2Var.f56192b));
        boolean z4 = this.f56193c;
        T t5 = this.f56194d;
        x xVar4 = this.f56195e;
        if (!z4) {
            z4 = q2Var.f56193c;
            t5 = q2Var.f56194d;
            xVar4 = q2Var.f56195e;
        } else if (q2Var.f56193c && ((compare = this.f56192b.compare(t5, q2Var.f56194d)) < 0 || (compare == 0 && q2Var.f56195e == x.OPEN))) {
            t5 = q2Var.f56194d;
            xVar4 = q2Var.f56195e;
        }
        boolean z5 = z4;
        boolean z6 = this.f56196f;
        T t6 = this.f56197g;
        x xVar5 = this.f56198h;
        if (!z6) {
            z6 = q2Var.f56196f;
            t6 = q2Var.f56197g;
            xVar5 = q2Var.f56198h;
        } else if (q2Var.f56196f && ((compare2 = this.f56192b.compare(t6, q2Var.f56197g)) > 0 || (compare2 == 0 && q2Var.f56198h == x.OPEN))) {
            t6 = q2Var.f56197g;
            xVar5 = q2Var.f56198h;
        }
        boolean z7 = z6;
        T t7 = t6;
        if (z5 && z7 && ((compare3 = this.f56192b.compare(t5, t7)) > 0 || (compare3 == 0 && xVar4 == (xVar3 = x.OPEN) && xVar5 == xVar3))) {
            xVar = x.OPEN;
            xVar2 = x.CLOSED;
            t4 = t7;
        } else {
            t4 = t5;
            xVar = xVar4;
            xVar2 = xVar5;
        }
        return new q2<>(this.f56192b, z5, t4, xVar, z7, t7, xVar2);
    }

    boolean m() {
        return (this.f56196f && q(this.f56197g)) || (this.f56193c && p(this.f56194d));
    }

    q2<T> o() {
        q2<T> q2Var = this.f56199i;
        if (q2Var != null) {
            return q2Var;
        }
        q2<T> q2Var2 = new q2<>(e5.u(this.f56192b).v0(), this.f56196f, this.f56197g, this.f56198h, this.f56193c, this.f56194d, this.f56195e);
        q2Var2.f56199i = this;
        this.f56199i = q2Var2;
        return q2Var2;
    }

    boolean p(@f5 T t4) {
        if (!this.f56196f) {
            return false;
        }
        int compare = this.f56192b.compare(t4, this.f56197g);
        return ((compare == 0) & (this.f56198h == x.OPEN)) | (compare > 0);
    }

    boolean q(@f5 T t4) {
        if (!this.f56193c) {
            return false;
        }
        int compare = this.f56192b.compare(t4, this.f56194d);
        return ((compare == 0) & (this.f56195e == x.OPEN)) | (compare < 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f56192b);
        x xVar = this.f56195e;
        x xVar2 = x.CLOSED;
        char c5 = xVar == xVar2 ? '[' : '(';
        String valueOf2 = String.valueOf(this.f56193c ? this.f56194d : ProtectedSandApp.s("\uf531"));
        String valueOf3 = String.valueOf(this.f56196f ? this.f56197g : ProtectedSandApp.s("\uf532"));
        char c6 = this.f56198h == xVar2 ? ']' : ')';
        StringBuilder sb = new StringBuilder(valueOf3.length() + valueOf2.length() + valueOf.length() + 4);
        sb.append(valueOf);
        sb.append(ProtectedSandApp.s("\uf533"));
        sb.append(c5);
        sb.append(valueOf2);
        sb.append(',');
        sb.append(valueOf3);
        sb.append(c6);
        return sb.toString();
    }
}
