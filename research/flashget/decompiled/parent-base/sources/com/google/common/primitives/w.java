package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.math.BigInteger;

/* compiled from: UnsignedInteger.java */
@f
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class w extends Number implements Comparable<w> {

    /* renamed from: c, reason: collision with root package name */
    public static final w f57546c = new w(0);

    /* renamed from: d, reason: collision with root package name */
    public static final w f57547d = new w(1);

    /* renamed from: e, reason: collision with root package name */
    public static final w f57548e = new w(-1);

    /* renamed from: b, reason: collision with root package name */
    private final int f57549b;

    private w(int i4) {
        this.f57549b = i4;
    }

    public static w d(int i4) {
        return new w(i4);
    }

    public static w j(long j4) {
        l0.p((4294967295L & j4) == j4, ProtectedSandApp.s("\uf8ee"), j4);
        return new w((int) j4);
    }

    public static w k(String str) {
        return l(str, 10);
    }

    public static w l(String str, int i4) {
        return new w(x.k(str, i4));
    }

    public static w m(BigInteger bigInteger) {
        bigInteger.getClass();
        l0.u(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, ProtectedSandApp.s("\uf8ee"), bigInteger);
        return new w(bigInteger.intValue());
    }

    public BigInteger a() {
        return BigInteger.valueOf(longValue());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(w wVar) {
        wVar.getClass();
        return x.b(this.f57549b, wVar.f57549b);
    }

    public w c(w wVar) {
        int i4 = this.f57549b;
        wVar.getClass();
        return new w(x.d(i4, wVar.f57549b));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public w e(w wVar) {
        int i4 = this.f57549b;
        wVar.getClass();
        return new w(i4 - wVar.f57549b);
    }

    public boolean equals(@zc.a Object obj) {
        return (obj instanceof w) && this.f57549b == ((w) obj).f57549b;
    }

    public w f(w wVar) {
        int i4 = this.f57549b;
        wVar.getClass();
        return new w(x.l(i4, wVar.f57549b));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public w g(w wVar) {
        int i4 = this.f57549b;
        wVar.getClass();
        return new w(i4 + wVar.f57549b);
    }

    @d9.c
    public w h(w wVar) {
        int i4 = this.f57549b;
        wVar.getClass();
        return new w(i4 * wVar.f57549b);
    }

    public int hashCode() {
        return this.f57549b;
    }

    public String i(int i4) {
        return x.t(this.f57549b, i4);
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f57549b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f57549b & 4294967295L;
    }

    public String toString() {
        return x.t(this.f57549b, 10);
    }
}
