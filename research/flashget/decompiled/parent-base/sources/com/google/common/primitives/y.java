package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: UnsignedLong.java */
@f
@d9.b(serializable = true)
/* loaded from: classes6.dex */
public final class y extends Number implements Comparable<y>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f57551c = Long.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public static final y f57552d = new y(0);

    /* renamed from: e, reason: collision with root package name */
    public static final y f57553e = new y(1);

    /* renamed from: f, reason: collision with root package name */
    public static final y f57554f = new y(-1);

    /* renamed from: b, reason: collision with root package name */
    private final long f57555b;

    private y(long j4) {
        this.f57555b = j4;
    }

    public static y d(long j4) {
        return new y(j4);
    }

    @f9.a
    public static y j(long j4) {
        l0.p(j4 >= 0, ProtectedSandApp.s("\uf8f6"), j4);
        return new y(j4);
    }

    @f9.a
    public static y k(String str) {
        return l(str, 10);
    }

    @f9.a
    public static y l(String str, int i4) {
        return new y(z.j(str, i4));
    }

    @f9.a
    public static y m(BigInteger bigInteger) {
        bigInteger.getClass();
        l0.u(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, ProtectedSandApp.s("\uf8f6"), bigInteger);
        return new y(bigInteger.longValue());
    }

    public BigInteger a() {
        BigInteger valueOf = BigInteger.valueOf(this.f57555b & Long.MAX_VALUE);
        return this.f57555b < 0 ? valueOf.setBit(63) : valueOf;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(y yVar) {
        yVar.getClass();
        return z.a(this.f57555b, yVar.f57555b);
    }

    public y c(y yVar) {
        long j4 = this.f57555b;
        yVar.getClass();
        return new y(z.c(j4, yVar.f57555b));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j4 = this.f57555b;
        if (j4 >= 0) {
            return j4;
        }
        return ((j4 & 1) | (j4 >>> 1)) * 2.0d;
    }

    public y e(y yVar) {
        long j4 = this.f57555b;
        yVar.getClass();
        return new y(j4 - yVar.f57555b);
    }

    public boolean equals(@zc.a Object obj) {
        return (obj instanceof y) && this.f57555b == ((y) obj).f57555b;
    }

    public y f(y yVar) {
        long j4 = this.f57555b;
        yVar.getClass();
        return new y(z.k(j4, yVar.f57555b));
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j4 = this.f57555b;
        if (j4 >= 0) {
            return j4;
        }
        return ((j4 & 1) | (j4 >>> 1)) * 2.0f;
    }

    public y g(y yVar) {
        long j4 = this.f57555b;
        yVar.getClass();
        return new y(j4 + yVar.f57555b);
    }

    public y h(y yVar) {
        long j4 = this.f57555b;
        yVar.getClass();
        return new y(j4 * yVar.f57555b);
    }

    public int hashCode() {
        return n.k(this.f57555b);
    }

    public String i(int i4) {
        return z.q(this.f57555b, i4);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f57555b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f57555b;
    }

    public String toString() {
        return z.q(this.f57555b, 10);
    }
}
