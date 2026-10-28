package org.threeten.bp.temporal;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* compiled from: ValueRange.java */
/* loaded from: classes9.dex */
public final class n implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final long f88375f = -7317881728594519368L;

    /* renamed from: b, reason: collision with root package name */
    private final long f88376b;

    /* renamed from: c, reason: collision with root package name */
    private final long f88377c;

    /* renamed from: d, reason: collision with root package name */
    private final long f88378d;

    /* renamed from: e, reason: collision with root package name */
    private final long f88379e;

    private n(long j4, long j5, long j6, long j7) {
        this.f88376b = j4;
        this.f88377c = j5;
        this.f88378d = j6;
        this.f88379e = j7;
    }

    public static n k(long j4, long j5) {
        if (j4 <= j5) {
            return new n(j4, j4, j5, j5);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static n l(long j4, long j5, long j6) {
        return m(j4, j4, j5, j6);
    }

    public static n m(long j4, long j5, long j6, long j7) {
        if (j4 > j5) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j6 > j7) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j5 <= j7) {
            return new n(j4, j5, j6, j7);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public int a(long j4, j jVar) {
        if (i(j4)) {
            return (int) j4;
        }
        throw new DateTimeException("Invalid int value for " + jVar + ": " + j4);
    }

    public long b(long j4, j jVar) {
        if (j(j4)) {
            return j4;
        }
        if (jVar == null) {
            throw new DateTimeException("Invalid value (valid values " + this + "): " + j4);
        }
        throw new DateTimeException("Invalid value for " + jVar + " (valid values " + this + "): " + j4);
    }

    public long c() {
        return this.f88377c;
    }

    public long d() {
        return this.f88379e;
    }

    public long e() {
        return this.f88376b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f88376b == nVar.f88376b && this.f88377c == nVar.f88377c && this.f88378d == nVar.f88378d && this.f88379e == nVar.f88379e;
    }

    public long f() {
        return this.f88378d;
    }

    public boolean g() {
        return this.f88376b == this.f88377c && this.f88378d == this.f88379e;
    }

    public boolean h() {
        return this.f88376b >= -2147483648L && this.f88379e <= 2147483647L;
    }

    public int hashCode() {
        long j4 = this.f88376b;
        long j5 = this.f88377c;
        long j6 = (j4 + j5) << ((int) (j5 + 16));
        long j7 = this.f88378d;
        long j10 = (j6 >> ((int) (j7 + 48))) << ((int) (j7 + 32));
        long j11 = this.f88379e;
        long j12 = ((j10 >> ((int) (32 + j11))) << ((int) (j11 + 48))) >> 16;
        return (int) (j12 ^ (j12 >>> 32));
    }

    public boolean i(long j4) {
        return h() && j(j4);
    }

    public boolean j(long j4) {
        return j4 >= this.f88376b && j4 <= this.f88379e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f88376b);
        if (this.f88376b != this.f88377c) {
            sb.append('/');
            sb.append(this.f88377c);
        }
        sb.append(" - ");
        sb.append(this.f88378d);
        if (this.f88378d != this.f88379e) {
            sb.append('/');
            sb.append(this.f88379e);
        }
        return sb.toString();
    }
}
