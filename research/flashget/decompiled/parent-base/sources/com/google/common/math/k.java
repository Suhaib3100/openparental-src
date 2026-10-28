package com.google.common.math;

import com.google.common.base.l0;
import com.google.common.math.g;

/* compiled from: PairedStatsAccumulator.java */
@e
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final o f57233a = new o();

    /* renamed from: b, reason: collision with root package name */
    private final o f57234b = new o();

    /* renamed from: c, reason: collision with root package name */
    private double f57235c = com.google.firebase.remoteconfig.p.f60679p;

    private static double d(double d5) {
        return com.google.common.primitives.d.f(d5, -1.0d, 1.0d);
    }

    private double e(double d5) {
        if (d5 > com.google.firebase.remoteconfig.p.f60679p) {
            return d5;
        }
        return Double.MIN_VALUE;
    }

    public void a(double d5, double d6) {
        this.f57233a.a(d5);
        if (!com.google.common.primitives.d.n(d5) || !com.google.common.primitives.d.n(d6)) {
            this.f57235c = Double.NaN;
        } else if (this.f57233a.j() > 1) {
            this.f57235c = ((d6 - this.f57234b.l()) * (d5 - this.f57233a.l())) + this.f57235c;
        }
        this.f57234b.a(d6);
    }

    public void b(j jVar) {
        if (jVar.a() == 0) {
            return;
        }
        this.f57233a.b(jVar.k());
        if (this.f57234b.j() == 0) {
            this.f57235c = jVar.i();
        } else {
            this.f57235c = ((jVar.l().d() - this.f57234b.l()) * (jVar.k().d() - this.f57233a.l()) * jVar.a()) + jVar.i() + this.f57235c;
        }
        this.f57234b.b(jVar.l());
    }

    public long c() {
        return this.f57233a.j();
    }

    public final g f() {
        l0.g0(this.f57233a.j() > 1);
        if (Double.isNaN(this.f57235c)) {
            return g.c.f57210a;
        }
        double u4 = this.f57233a.u();
        if (u4 > com.google.firebase.remoteconfig.p.f60679p) {
            return this.f57234b.u() > com.google.firebase.remoteconfig.p.f60679p ? g.f(this.f57233a.l(), this.f57234b.l()).b(this.f57235c / u4) : g.b(this.f57234b.l());
        }
        l0.g0(this.f57234b.u() > com.google.firebase.remoteconfig.p.f60679p);
        return g.i(this.f57233a.l());
    }

    public final double g() {
        l0.g0(this.f57233a.j() > 1);
        if (Double.isNaN(this.f57235c)) {
            return Double.NaN;
        }
        double u4 = this.f57233a.u();
        double u5 = this.f57234b.u();
        l0.g0(u4 > com.google.firebase.remoteconfig.p.f60679p);
        l0.g0(u5 > com.google.firebase.remoteconfig.p.f60679p);
        return d(this.f57235c / Math.sqrt(e(u4 * u5)));
    }

    public double h() {
        l0.g0(this.f57233a.j() != 0);
        return this.f57235c / this.f57233a.j();
    }

    public final double i() {
        l0.g0(this.f57233a.j() > 1);
        return this.f57235c / (this.f57233a.j() - 1);
    }

    public j j() {
        return new j(this.f57233a.s(), this.f57234b.s(), this.f57235c);
    }

    public n k() {
        return this.f57233a.s();
    }

    public n l() {
        return this.f57234b.s();
    }
}
