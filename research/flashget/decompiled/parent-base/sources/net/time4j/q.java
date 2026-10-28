package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.d0;

/* compiled from: ElementOperator.java */
/* loaded from: classes7.dex */
public abstract class q<T> implements net.time4j.engine.v<T> {
    static final int A = 22;

    /* renamed from: d, reason: collision with root package name */
    static final int f83483d = -1;

    /* renamed from: e, reason: collision with root package name */
    static final int f83484e = 0;

    /* renamed from: f, reason: collision with root package name */
    static final int f83485f = 1;

    /* renamed from: g, reason: collision with root package name */
    static final int f83486g = 2;

    /* renamed from: h, reason: collision with root package name */
    static final int f83487h = 3;

    /* renamed from: i, reason: collision with root package name */
    static final int f83488i = 4;

    /* renamed from: j, reason: collision with root package name */
    static final int f83489j = 5;

    /* renamed from: k, reason: collision with root package name */
    static final int f83490k = 6;

    /* renamed from: l, reason: collision with root package name */
    static final int f83491l = 7;

    /* renamed from: m, reason: collision with root package name */
    static final int f83492m = 8;

    /* renamed from: n, reason: collision with root package name */
    static final int f83493n = 9;

    /* renamed from: o, reason: collision with root package name */
    static final int f83494o = 10;

    /* renamed from: p, reason: collision with root package name */
    static final int f83495p = 11;

    /* renamed from: q, reason: collision with root package name */
    static final int f83496q = 12;

    /* renamed from: r, reason: collision with root package name */
    static final int f83497r = 13;

    /* renamed from: s, reason: collision with root package name */
    static final int f83498s = 14;

    /* renamed from: t, reason: collision with root package name */
    static final int f83499t = 15;

    /* renamed from: u, reason: collision with root package name */
    static final int f83500u = 16;

    /* renamed from: v, reason: collision with root package name */
    static final int f83501v = 17;

    /* renamed from: w, reason: collision with root package name */
    static final int f83502w = 18;

    /* renamed from: x, reason: collision with root package name */
    static final int f83503x = 19;

    /* renamed from: y, reason: collision with root package name */
    static final int f83504y = 20;

    /* renamed from: z, reason: collision with root package name */
    static final int f83505z = 21;

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.q<?> f83506b;

    /* renamed from: c, reason: collision with root package name */
    private final int f83507c;

    q(net.time4j.engine.q<?> qVar, int i4) {
        this.f83506b = qVar;
        this.f83507c = i4;
    }

    public final net.time4j.engine.v<d0> a(net.time4j.tz.p pVar) {
        return new d0.g(h(), this.f83506b, this.f83507c, net.time4j.tz.l.c0(pVar));
    }

    public final net.time4j.engine.v<d0> b() {
        return a(net.time4j.tz.p.f83649l);
    }

    net.time4j.engine.q<?> c() {
        return this.f83506b;
    }

    int d() {
        return this.f83507c;
    }

    public final net.time4j.engine.v<d0> e(net.time4j.tz.l lVar) {
        if (lVar != null) {
            return new d0.g(h(), this.f83506b, this.f83507c, lVar);
        }
        throw new NullPointerException(ProtectedSandApp.s("鋇\u0001"));
    }

    public net.time4j.engine.v<d0> f() {
        return new d0.g(h(), this.f83506b, this.f83507c);
    }

    public final net.time4j.engine.v<d0> g(net.time4j.tz.k kVar) {
        return new d0.g(h(), this.f83506b, this.f83507c, net.time4j.tz.l.c0(kVar));
    }

    abstract net.time4j.engine.v<n0> h();
}
