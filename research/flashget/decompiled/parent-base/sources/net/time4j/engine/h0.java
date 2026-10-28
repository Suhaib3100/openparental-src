package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.r;

/* compiled from: StdOperator.java */
/* loaded from: classes7.dex */
public final class h0<T extends r<T>> implements v<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final int f82725e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f82726f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f82727g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f82728h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static final int f82729i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f82730j = 5;

    /* renamed from: k, reason: collision with root package name */
    private static final int f82731k = 6;

    /* renamed from: l, reason: collision with root package name */
    private static final int f82732l = 7;

    /* renamed from: b, reason: collision with root package name */
    private final int f82733b;

    /* renamed from: c, reason: collision with root package name */
    private final q<?> f82734c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f82735d;

    private h0(int i4, q<?> qVar) {
        this(i4, qVar, null);
    }

    private static <U, T extends m0<U, T>> T a(m0<U, T> m0Var, q<?> qVar, boolean z4) {
        U t02 = m0Var.y().t0(qVar);
        return z4 ? m0Var.W(1L, t02) : m0Var.U(1L, t02);
    }

    public static <T extends r<T>> v<T> c(q<?> qVar) {
        return new h0(4, qVar, null);
    }

    public static <T extends r<T>> v<T> d(q<?> qVar) {
        return new h0(3, qVar, null);
    }

    private <V> T e(r<T> rVar, q<V> qVar) {
        T z4 = rVar.z();
        while (true) {
            qVar = (q<V>) z4.y().I(qVar).getChildAtCeiling(z4);
            if (qVar == null) {
                return z4;
            }
            z4 = q(z4, qVar);
        }
    }

    public static <T extends r<T>> v<T> f(q<?> qVar) {
        return new h0(6, qVar, null);
    }

    private <V> T g(r<T> rVar, q<V> qVar) {
        T z4 = rVar.z();
        while (true) {
            qVar = (q<V>) z4.y().I(qVar).getChildAtFloor(z4);
            if (qVar == null) {
                return z4;
            }
            z4 = r(z4, qVar);
        }
    }

    public static <T extends r<T>> v<T> h(q<?> qVar) {
        return new h0(7, qVar, null);
    }

    private <V> T i(r<T> rVar, q<V> qVar) {
        return rVar.M(qVar, rVar.g(qVar));
    }

    public static <T extends r<T>> v<T> j(q<?> qVar) {
        return new h0(2, qVar, null);
    }

    private <V> T k(r<T> rVar, q<V> qVar) {
        return rVar.M(qVar, rVar.i(qVar));
    }

    public static <T extends r<T>> v<T> l(q<?> qVar) {
        return new h0(1, qVar, null);
    }

    private T m(T t4, boolean z4) {
        if (t4 instanceof m0) {
            return t4.y().C().cast(a((m0) m0.class.cast(t4), this.f82734c, z4));
        }
        throw new ChronoException(ProtectedSandApp.s("錈\u0001") + t4.y().C());
    }

    public static <T extends r<T>, V> v<T> n(V v4, q<V> qVar) {
        return new h0(0, qVar, v4);
    }

    public static <T extends r<T>, V> v<T> o(V v4, q<V> qVar) {
        return new h0(5, qVar, v4);
    }

    private <V> T p(r<T> rVar, q<V> qVar, Object obj, boolean z4) {
        T z5 = rVar.z();
        return z5.y().I(qVar).withValue(z5, qVar.getType().cast(obj), z4);
    }

    private <V> T q(T t4, q<V> qVar) {
        a0<T, V> I = t4.y().I(qVar);
        return I.withValue(t4, I.getMaximum(t4), qVar.isLenient());
    }

    private <V> T r(T t4, q<V> qVar) {
        a0<T, V> I = t4.y().I(qVar);
        return I.withValue(t4, I.getMinimum(t4), qVar.isLenient());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T apply(T t4) {
        switch (this.f82733b) {
            case 0:
                return p(t4, this.f82734c, this.f82735d, false);
            case 1:
                return k(t4, this.f82734c);
            case 2:
                return i(t4, this.f82734c);
            case 3:
                return g(t4, this.f82734c);
            case 4:
                return e(t4, this.f82734c);
            case 5:
                return p(t4, this.f82734c, this.f82735d, true);
            case 6:
                return m(t4, false);
            case 7:
                return m(t4, true);
            default:
                throw new UnsupportedOperationException(ProtectedSandApp.s("錉\u0001") + this.f82733b);
        }
    }

    private h0(int i4, q<?> qVar, Object obj) {
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("錇\u0001"));
        }
        this.f82733b = i4;
        this.f82734c = qVar;
        this.f82735d = obj;
    }
}
