package com.google.common.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.base.l0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: Stats.java */
@e
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class n implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    static final int f57241g = 40;

    /* renamed from: h, reason: collision with root package name */
    private static final long f57242h = 0;

    /* renamed from: b, reason: collision with root package name */
    private final long f57243b;

    /* renamed from: c, reason: collision with root package name */
    private final double f57244c;

    /* renamed from: d, reason: collision with root package name */
    private final double f57245d;

    /* renamed from: e, reason: collision with root package name */
    private final double f57246e;

    /* renamed from: f, reason: collision with root package name */
    private final double f57247f;

    n(long j4, double d5, double d6, double d7, double d10) {
        this.f57243b = j4;
        this.f57244c = d5;
        this.f57245d = d6;
        this.f57246e = d7;
        this.f57247f = d10;
    }

    public static n b(byte[] bArr) {
        bArr.getClass();
        l0.m(bArr.length == 40, ProtectedSandApp.s("\uf721"), 40, bArr.length);
        return r(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double e(Iterable<? extends Number> iterable) {
        return f(iterable.iterator());
    }

    public static double f(Iterator<? extends Number> it) {
        l0.d(it.hasNext());
        double doubleValue = it.next().doubleValue();
        long j4 = 1;
        while (it.hasNext()) {
            double doubleValue2 = it.next().doubleValue();
            j4++;
            doubleValue = (com.google.common.primitives.d.n(doubleValue2) && com.google.common.primitives.d.n(doubleValue)) ? ((doubleValue2 - doubleValue) / j4) + doubleValue : o.i(doubleValue, doubleValue2);
        }
        return doubleValue;
    }

    public static double g(double... dArr) {
        l0.d(dArr.length > 0);
        double d5 = dArr[0];
        for (int i4 = 1; i4 < dArr.length; i4++) {
            double d6 = dArr[i4];
            d5 = (com.google.common.primitives.d.n(d6) && com.google.common.primitives.d.n(d5)) ? ((d6 - d5) / (i4 + 1)) + d5 : o.i(d5, d6);
        }
        return d5;
    }

    public static double h(int... iArr) {
        l0.d(iArr.length > 0);
        double d5 = iArr[0];
        for (int i4 = 1; i4 < iArr.length; i4++) {
            double d6 = iArr[i4];
            d5 = (com.google.common.primitives.d.n(d6) && com.google.common.primitives.d.n(d5)) ? ((d6 - d5) / (i4 + 1)) + d5 : o.i(d5, d6);
        }
        return d5;
    }

    public static double i(long... jArr) {
        l0.d(jArr.length > 0);
        double d5 = jArr[0];
        for (int i4 = 1; i4 < jArr.length; i4++) {
            double d6 = jArr[i4];
            d5 = (com.google.common.primitives.d.n(d6) && com.google.common.primitives.d.n(d5)) ? ((d6 - d5) / (i4 + 1)) + d5 : o.i(d5, d6);
        }
        return d5;
    }

    public static n k(Iterable<? extends Number> iterable) {
        o oVar = new o();
        oVar.d(iterable);
        return oVar.s();
    }

    public static n l(Iterator<? extends Number> it) {
        o oVar = new o();
        oVar.e(it);
        return oVar.s();
    }

    public static n m(double... dArr) {
        o oVar = new o();
        oVar.f(dArr);
        return oVar.s();
    }

    public static n n(int... iArr) {
        o oVar = new o();
        oVar.g(iArr);
        return oVar.s();
    }

    public static n o(long... jArr) {
        o oVar = new o();
        oVar.h(jArr);
        return oVar.s();
    }

    static n r(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        l0.m(byteBuffer.remaining() >= 40, ProtectedSandApp.s("\uf722"), 40, byteBuffer.remaining());
        return new n(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public long a() {
        return this.f57243b;
    }

    public double c() {
        l0.g0(this.f57243b != 0);
        return this.f57247f;
    }

    public double d() {
        l0.g0(this.f57243b != 0);
        return this.f57244c;
    }

    public boolean equals(@zc.a Object obj) {
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f57243b == nVar.f57243b && Double.doubleToLongBits(this.f57244c) == Double.doubleToLongBits(nVar.f57244c) && Double.doubleToLongBits(this.f57245d) == Double.doubleToLongBits(nVar.f57245d) && Double.doubleToLongBits(this.f57246e) == Double.doubleToLongBits(nVar.f57246e) && Double.doubleToLongBits(this.f57247f) == Double.doubleToLongBits(nVar.f57247f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f57243b), Double.valueOf(this.f57244c), Double.valueOf(this.f57245d), Double.valueOf(this.f57246e), Double.valueOf(this.f57247f)});
    }

    public double j() {
        l0.g0(this.f57243b != 0);
        return this.f57246e;
    }

    public double p() {
        return Math.sqrt(q());
    }

    public double q() {
        l0.g0(this.f57243b > 0);
        if (Double.isNaN(this.f57245d)) {
            return Double.NaN;
        }
        return this.f57243b == 1 ? com.google.firebase.remoteconfig.p.f60679p : d.b(this.f57245d) / this.f57243b;
    }

    public double s() {
        return Math.sqrt(t());
    }

    public double t() {
        l0.g0(this.f57243b > 1);
        if (Double.isNaN(this.f57245d)) {
            return Double.NaN;
        }
        return d.b(this.f57245d) / (this.f57243b - 1);
    }

    public String toString() {
        long j4 = this.f57243b;
        String s4 = ProtectedSandApp.s("\uf723");
        return j4 > 0 ? d0.c(this).e(s4, this.f57243b).b(ProtectedSandApp.s("\uf724"), this.f57244c).b(ProtectedSandApp.s("\uf725"), p()).b(ProtectedSandApp.s("\uf726"), this.f57246e).b(ProtectedSandApp.s("\uf727"), this.f57247f).toString() : d0.c(this).e(s4, this.f57243b).toString();
    }

    public double u() {
        return this.f57244c * this.f57243b;
    }

    double v() {
        return this.f57245d;
    }

    public byte[] w() {
        ByteBuffer order = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        x(order);
        return order.array();
    }

    void x(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        l0.m(byteBuffer.remaining() >= 40, ProtectedSandApp.s("\uf722"), 40, byteBuffer.remaining());
        byteBuffer.putLong(this.f57243b).putDouble(this.f57244c).putDouble(this.f57245d).putDouble(this.f57246e).putDouble(this.f57247f);
    }
}
