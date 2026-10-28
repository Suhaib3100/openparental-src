package com.google.common.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.base.l0;
import com.google.common.math.g;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: PairedStats.java */
@e
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class j implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final int f57228e = 88;

    /* renamed from: f, reason: collision with root package name */
    private static final long f57229f = 0;

    /* renamed from: b, reason: collision with root package name */
    private final n f57230b;

    /* renamed from: c, reason: collision with root package name */
    private final n f57231c;

    /* renamed from: d, reason: collision with root package name */
    private final double f57232d;

    j(n nVar, n nVar2, double d5) {
        this.f57230b = nVar;
        this.f57231c = nVar2;
        this.f57232d = d5;
    }

    private static double b(double d5) {
        if (d5 >= 1.0d) {
            return 1.0d;
        }
        if (d5 <= -1.0d) {
            return -1.0d;
        }
        return d5;
    }

    private static double c(double d5) {
        if (d5 > com.google.firebase.remoteconfig.p.f60679p) {
            return d5;
        }
        return Double.MIN_VALUE;
    }

    public static j d(byte[] bArr) {
        bArr.getClass();
        l0.m(bArr.length == 88, ProtectedSandApp.s("\uf718"), 88, bArr.length);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new j(n.r(order), n.r(order), order.getDouble());
    }

    public long a() {
        return this.f57230b.a();
    }

    public g e() {
        l0.g0(this.f57230b.a() > 1);
        if (Double.isNaN(this.f57232d)) {
            return g.c.f57210a;
        }
        double v4 = this.f57230b.v();
        if (v4 > com.google.firebase.remoteconfig.p.f60679p) {
            return this.f57231c.v() > com.google.firebase.remoteconfig.p.f60679p ? g.f(this.f57230b.d(), this.f57231c.d()).b(this.f57232d / v4) : g.b(this.f57231c.d());
        }
        l0.g0(this.f57231c.v() > com.google.firebase.remoteconfig.p.f60679p);
        return g.i(this.f57230b.d());
    }

    public boolean equals(@zc.a Object obj) {
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f57230b.equals(jVar.f57230b) && this.f57231c.equals(jVar.f57231c) && Double.doubleToLongBits(this.f57232d) == Double.doubleToLongBits(jVar.f57232d);
    }

    public double f() {
        l0.g0(this.f57230b.a() > 1);
        if (Double.isNaN(this.f57232d)) {
            return Double.NaN;
        }
        double v4 = this.f57230b.v();
        double v5 = this.f57231c.v();
        l0.g0(v4 > com.google.firebase.remoteconfig.p.f60679p);
        l0.g0(v5 > com.google.firebase.remoteconfig.p.f60679p);
        return b(this.f57232d / Math.sqrt(c(v4 * v5)));
    }

    public double g() {
        l0.g0(this.f57230b.a() != 0);
        return this.f57232d / this.f57230b.a();
    }

    public double h() {
        l0.g0(this.f57230b.a() > 1);
        return this.f57232d / (this.f57230b.a() - 1);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57230b, this.f57231c, Double.valueOf(this.f57232d)});
    }

    double i() {
        return this.f57232d;
    }

    public byte[] j() {
        ByteBuffer order = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.f57230b.x(order);
        this.f57231c.x(order);
        order.putDouble(this.f57232d);
        return order.array();
    }

    public n k() {
        return this.f57230b;
    }

    public n l() {
        return this.f57231c;
    }

    public String toString() {
        long a5 = this.f57230b.a();
        String s4 = ProtectedSandApp.s("\uf719");
        String s5 = ProtectedSandApp.s("\uf71a");
        return a5 > 0 ? d0.c(this).f(s5, this.f57230b).f(s4, this.f57231c).b(ProtectedSandApp.s("\uf71b"), g()).toString() : d0.c(this).f(s5, this.f57230b).f(s4, this.f57231c).toString();
    }
}
