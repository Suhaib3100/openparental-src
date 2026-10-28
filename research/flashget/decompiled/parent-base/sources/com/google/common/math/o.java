package com.google.common.math;

import com.google.common.base.l0;
import java.util.Iterator;

/* compiled from: StatsAccumulator.java */
@e
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private long f57248a = 0;

    /* renamed from: b, reason: collision with root package name */
    private double f57249b = com.google.firebase.remoteconfig.p.f60679p;

    /* renamed from: c, reason: collision with root package name */
    private double f57250c = com.google.firebase.remoteconfig.p.f60679p;

    /* renamed from: d, reason: collision with root package name */
    private double f57251d = Double.NaN;

    /* renamed from: e, reason: collision with root package name */
    private double f57252e = Double.NaN;

    static double i(double d5, double d6) {
        if (com.google.common.primitives.d.n(d5)) {
            return d6;
        }
        if (com.google.common.primitives.d.n(d6) || d5 == d6) {
            return d5;
        }
        return Double.NaN;
    }

    private void m(long j4, double d5, double d6, double d7, double d10) {
        long j5 = this.f57248a;
        if (j5 == 0) {
            this.f57248a = j4;
            this.f57249b = d5;
            this.f57250c = d6;
            this.f57251d = d7;
            this.f57252e = d10;
            return;
        }
        this.f57248a = j5 + j4;
        if (com.google.common.primitives.d.n(this.f57249b) && com.google.common.primitives.d.n(d5)) {
            double d11 = this.f57249b;
            double d12 = d5 - d11;
            double d13 = j4;
            double d14 = ((d12 * d13) / this.f57248a) + d11;
            this.f57249b = d14;
            this.f57250c = ((d5 - d14) * d12 * d13) + d6 + this.f57250c;
        } else {
            this.f57249b = i(this.f57249b, d5);
            this.f57250c = Double.NaN;
        }
        this.f57251d = Math.min(this.f57251d, d7);
        this.f57252e = Math.max(this.f57252e, d10);
    }

    public void a(double d5) {
        long j4 = this.f57248a;
        if (j4 == 0) {
            this.f57248a = 1L;
            this.f57249b = d5;
            this.f57251d = d5;
            this.f57252e = d5;
            if (com.google.common.primitives.d.n(d5)) {
                return;
            }
            this.f57250c = Double.NaN;
            return;
        }
        this.f57248a = j4 + 1;
        if (com.google.common.primitives.d.n(d5) && com.google.common.primitives.d.n(this.f57249b)) {
            double d6 = this.f57249b;
            double d7 = d5 - d6;
            double d10 = (d7 / this.f57248a) + d6;
            this.f57249b = d10;
            this.f57250c = androidx.constraintlayout.core.motion.utils.a.a(d5, d10, d7, this.f57250c);
        } else {
            this.f57249b = i(this.f57249b, d5);
            this.f57250c = Double.NaN;
        }
        this.f57251d = Math.min(this.f57251d, d5);
        this.f57252e = Math.max(this.f57252e, d5);
    }

    public void b(n nVar) {
        if (nVar.a() == 0) {
            return;
        }
        m(nVar.a(), nVar.d(), nVar.v(), nVar.j(), nVar.c());
    }

    public void c(o oVar) {
        long j4 = oVar.f57248a;
        if (j4 == 0) {
            return;
        }
        m(j4, oVar.l(), oVar.f57250c, oVar.n(), oVar.k());
    }

    public void d(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next().doubleValue());
        }
    }

    public void e(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            a(it.next().doubleValue());
        }
    }

    public void f(double... dArr) {
        for (double d5 : dArr) {
            a(d5);
        }
    }

    public void g(int... iArr) {
        for (int i4 : iArr) {
            a(i4);
        }
    }

    public void h(long... jArr) {
        for (long j4 : jArr) {
            a(j4);
        }
    }

    public long j() {
        return this.f57248a;
    }

    public double k() {
        l0.g0(this.f57248a != 0);
        return this.f57252e;
    }

    public double l() {
        l0.g0(this.f57248a != 0);
        return this.f57249b;
    }

    public double n() {
        l0.g0(this.f57248a != 0);
        return this.f57251d;
    }

    public final double o() {
        return Math.sqrt(p());
    }

    public final double p() {
        l0.g0(this.f57248a != 0);
        if (Double.isNaN(this.f57250c)) {
            return Double.NaN;
        }
        return this.f57248a == 1 ? com.google.firebase.remoteconfig.p.f60679p : d.b(this.f57250c) / this.f57248a;
    }

    public final double q() {
        return Math.sqrt(r());
    }

    public final double r() {
        l0.g0(this.f57248a > 1);
        if (Double.isNaN(this.f57250c)) {
            return Double.NaN;
        }
        return d.b(this.f57250c) / (this.f57248a - 1);
    }

    public n s() {
        return new n(this.f57248a, this.f57249b, this.f57250c, this.f57251d, this.f57252e);
    }

    public final double t() {
        return this.f57249b * this.f57248a;
    }

    double u() {
        return this.f57250c;
    }
}
