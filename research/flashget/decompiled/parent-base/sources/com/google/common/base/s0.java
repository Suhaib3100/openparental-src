package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;

/* compiled from: Stopwatch.java */
@o
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private final x0 f55036a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f55037b;

    /* renamed from: c, reason: collision with root package name */
    private long f55038c;

    /* renamed from: d, reason: collision with root package name */
    private long f55039d;

    /* compiled from: Stopwatch.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55040a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f55040a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55040a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55040a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55040a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55040a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55040a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55040a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    s0() {
        this.f55036a = x0.b();
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f55040a[timeUnit.ordinal()]) {
            case 1:
                return ProtectedSandApp.s("\uf381");
            case 2:
                return ProtectedSandApp.s("\uf380");
            case 3:
                return ProtectedSandApp.s("\uf37f");
            case 4:
                return ProtectedSandApp.s("\uf37e");
            case 5:
                return ProtectedSandApp.s("\uf37d");
            case 6:
                return ProtectedSandApp.s("\uf37c");
            case 7:
                return ProtectedSandApp.s("\uf37b");
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long j4) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j4, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j4, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j4, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j4, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j4, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j4, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static s0 c() {
        return new s0().k();
    }

    public static s0 d(x0 x0Var) {
        return new s0(x0Var).k();
    }

    public static s0 e() {
        return new s0();
    }

    public static s0 f(x0 x0Var) {
        return new s0(x0Var);
    }

    private long h() {
        return this.f55037b ? (this.f55036a.a() - this.f55039d) + this.f55038c : this.f55038c;
    }

    public long g(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public boolean i() {
        return this.f55037b;
    }

    @f9.a
    public s0 j() {
        this.f55038c = 0L;
        this.f55037b = false;
        return this;
    }

    @f9.a
    public s0 k() {
        l0.h0(!this.f55037b, ProtectedSandApp.s("\uf382"));
        this.f55037b = true;
        this.f55039d = this.f55036a.a();
        return this;
    }

    @f9.a
    public s0 l() {
        long a5 = this.f55036a.a();
        l0.h0(this.f55037b, ProtectedSandApp.s("\uf383"));
        this.f55037b = false;
        this.f55038c = (a5 - this.f55039d) + this.f55038c;
        return this;
    }

    public String toString() {
        long h4 = h();
        TimeUnit b5 = b(h4);
        String d5 = k0.d(h4 / TimeUnit.NANOSECONDS.convert(1L, b5));
        String a5 = a(b5);
        return h.a(com.google.android.gms.common.internal.b.a(a5, com.google.android.gms.common.internal.b.a(d5, 1)), d5, ProtectedSandApp.s("\uf384"), a5);
    }

    s0(x0 x0Var) {
        this.f55036a = (x0) l0.F(x0Var, ProtectedSandApp.s("\uf37a"));
    }
}
