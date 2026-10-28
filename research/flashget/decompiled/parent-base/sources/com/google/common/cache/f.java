package com.google.common.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.base.l0;
import java.util.Arrays;

/* compiled from: CacheStats.java */
@g
@d9.b
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final long f55153a;

    /* renamed from: b, reason: collision with root package name */
    private final long f55154b;

    /* renamed from: c, reason: collision with root package name */
    private final long f55155c;

    /* renamed from: d, reason: collision with root package name */
    private final long f55156d;

    /* renamed from: e, reason: collision with root package name */
    private final long f55157e;

    /* renamed from: f, reason: collision with root package name */
    private final long f55158f;

    public f(long j4, long j5, long j6, long j7, long j10, long j11) {
        l0.d(j4 >= 0);
        l0.d(j5 >= 0);
        l0.d(j6 >= 0);
        l0.d(j7 >= 0);
        l0.d(j10 >= 0);
        l0.d(j11 >= 0);
        this.f55153a = j4;
        this.f55154b = j5;
        this.f55155c = j6;
        this.f55156d = j7;
        this.f55157e = j10;
        this.f55158f = j11;
    }

    public double a() {
        long x4 = com.google.common.math.h.x(this.f55155c, this.f55156d);
        return x4 == 0 ? com.google.firebase.remoteconfig.p.f60679p : this.f55157e / x4;
    }

    public long b() {
        return this.f55158f;
    }

    public long c() {
        return this.f55153a;
    }

    public double d() {
        long m4 = m();
        if (m4 == 0) {
            return 1.0d;
        }
        return this.f55153a / m4;
    }

    public long e() {
        return com.google.common.math.h.x(this.f55155c, this.f55156d);
    }

    public boolean equals(@zc.a Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f55153a == fVar.f55153a && this.f55154b == fVar.f55154b && this.f55155c == fVar.f55155c && this.f55156d == fVar.f55156d && this.f55157e == fVar.f55157e && this.f55158f == fVar.f55158f;
    }

    public long f() {
        return this.f55156d;
    }

    public double g() {
        long x4 = com.google.common.math.h.x(this.f55155c, this.f55156d);
        return x4 == 0 ? com.google.firebase.remoteconfig.p.f60679p : this.f55156d / x4;
    }

    public long h() {
        return this.f55155c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f55153a), Long.valueOf(this.f55154b), Long.valueOf(this.f55155c), Long.valueOf(this.f55156d), Long.valueOf(this.f55157e), Long.valueOf(this.f55158f)});
    }

    public f i(f fVar) {
        return new f(Math.max(0L, com.google.common.math.h.A(this.f55153a, fVar.f55153a)), Math.max(0L, com.google.common.math.h.A(this.f55154b, fVar.f55154b)), Math.max(0L, com.google.common.math.h.A(this.f55155c, fVar.f55155c)), Math.max(0L, com.google.common.math.h.A(this.f55156d, fVar.f55156d)), Math.max(0L, com.google.common.math.h.A(this.f55157e, fVar.f55157e)), Math.max(0L, com.google.common.math.h.A(this.f55158f, fVar.f55158f)));
    }

    public long j() {
        return this.f55154b;
    }

    public double k() {
        long m4 = m();
        return m4 == 0 ? com.google.firebase.remoteconfig.p.f60679p : this.f55154b / m4;
    }

    public f l(f fVar) {
        return new f(com.google.common.math.h.x(this.f55153a, fVar.f55153a), com.google.common.math.h.x(this.f55154b, fVar.f55154b), com.google.common.math.h.x(this.f55155c, fVar.f55155c), com.google.common.math.h.x(this.f55156d, fVar.f55156d), com.google.common.math.h.x(this.f55157e, fVar.f55157e), com.google.common.math.h.x(this.f55158f, fVar.f55158f));
    }

    public long m() {
        return com.google.common.math.h.x(this.f55153a, this.f55154b);
    }

    public long n() {
        return this.f55157e;
    }

    public String toString() {
        return d0.c(this).e(ProtectedSandApp.s("\uf41a"), this.f55153a).e(ProtectedSandApp.s("\uf41b"), this.f55154b).e(ProtectedSandApp.s("\uf41c"), this.f55155c).e(ProtectedSandApp.s("\uf41d"), this.f55156d).e(ProtectedSandApp.s("\uf41e"), this.f55157e).e(ProtectedSandApp.s("\uf41f"), this.f55158f).toString();
    }
}
