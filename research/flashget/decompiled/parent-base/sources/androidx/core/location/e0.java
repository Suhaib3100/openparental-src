package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.compose.material3.j4;
import androidx.core.util.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: LocationRequestCompat.java */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final long f26376h = Long.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public static final int f26377i = 100;

    /* renamed from: j, reason: collision with root package name */
    public static final int f26378j = 102;

    /* renamed from: k, reason: collision with root package name */
    public static final int f26379k = 104;

    /* renamed from: l, reason: collision with root package name */
    private static final long f26380l = -1;

    /* renamed from: a, reason: collision with root package name */
    final int f26381a;

    /* renamed from: b, reason: collision with root package name */
    final long f26382b;

    /* renamed from: c, reason: collision with root package name */
    final long f26383c;

    /* renamed from: d, reason: collision with root package name */
    final long f26384d;

    /* renamed from: e, reason: collision with root package name */
    final int f26385e;

    /* renamed from: f, reason: collision with root package name */
    final float f26386f;

    /* renamed from: g, reason: collision with root package name */
    final long f26387g;

    /* compiled from: LocationRequestCompat.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f26388a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f26389b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f26390c;

        /* renamed from: d, reason: collision with root package name */
        private static Method f26391d;

        /* renamed from: e, reason: collision with root package name */
        private static Method f26392e;

        /* renamed from: f, reason: collision with root package name */
        private static Method f26393f;

        private a() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static Object a(e0 e0Var, String str) {
            try {
                if (f26388a == null) {
                    f26388a = Class.forName("android.location.LocationRequest");
                }
                if (f26389b == null) {
                    Method declaredMethod = f26388a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f26389b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f26389b.invoke(null, str, Long.valueOf(e0Var.f26382b), Float.valueOf(e0Var.f26386f), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (f26390c == null) {
                    Method declaredMethod2 = f26388a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f26390c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f26390c.invoke(invoke, Integer.valueOf(e0Var.f26381a));
                if (f26391d == null) {
                    Method declaredMethod3 = f26388a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f26391d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f26391d.invoke(invoke, Long.valueOf(e0Var.f()));
                if (e0Var.f26385e < Integer.MAX_VALUE) {
                    if (f26392e == null) {
                        Method declaredMethod4 = f26388a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f26392e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f26392e.invoke(invoke, Integer.valueOf(e0Var.f26385e));
                }
                if (e0Var.f26384d < Long.MAX_VALUE) {
                    if (f26393f == null) {
                        Method declaredMethod5 = f26388a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f26393f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f26393f.invoke(invoke, Long.valueOf(e0Var.f26384d));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationRequestCompat.java */
    @x0(31)
    static class b {
        private b() {
        }

        public static LocationRequest a(e0 e0Var) {
            return new LocationRequest.Builder(e0Var.f26382b).setQuality(e0Var.f26381a).setMinUpdateIntervalMillis(e0Var.f()).setDurationMillis(e0Var.f26384d).setMaxUpdates(e0Var.f26385e).setMinUpdateDistanceMeters(e0Var.f26386f).setMaxUpdateDelayMillis(e0Var.f26387g).build();
        }
    }

    /* compiled from: LocationRequestCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    e0(long j4, int i4, long j5, int i5, long j6, float f4, long j7) {
        this.f26382b = j4;
        this.f26381a = i4;
        this.f26383c = j6;
        this.f26384d = j5;
        this.f26385e = i5;
        this.f26386f = f4;
        this.f26387g = j7;
    }

    @g0(from = 1)
    public long a() {
        return this.f26384d;
    }

    @g0(from = 0)
    public long b() {
        return this.f26382b;
    }

    @g0(from = 0)
    public long c() {
        return this.f26387g;
    }

    @g0(from = 1, to = 2147483647L)
    public int d() {
        return this.f26385e;
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 3.4028234663852886E38d)
    public float e() {
        return this.f26386f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f26381a == e0Var.f26381a && this.f26382b == e0Var.f26382b && this.f26383c == e0Var.f26383c && this.f26384d == e0Var.f26384d && this.f26385e == e0Var.f26385e && Float.compare(e0Var.f26386f, this.f26386f) == 0 && this.f26387g == e0Var.f26387g;
    }

    @g0(from = 0)
    public long f() {
        long j4 = this.f26383c;
        return j4 == -1 ? this.f26382b : j4;
    }

    public int g() {
        return this.f26381a;
    }

    @o0
    @x0(31)
    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        int i4 = this.f26381a * 31;
        long j4 = this.f26382b;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f26383c;
        return i5 + ((int) (j5 ^ (j5 >>> 32)));
    }

    @q0
    @SuppressLint({"NewApi"})
    public LocationRequest i(@o0 String str) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(this) : d0.a(a.a(this, str));
    }

    @o0
    public String toString() {
        StringBuilder a5 = j4.a("Request[");
        if (this.f26382b != Long.MAX_VALUE) {
            a5.append("@");
            m0.e(this.f26382b, a5);
            int i4 = this.f26381a;
            if (i4 == 100) {
                a5.append(" HIGH_ACCURACY");
            } else if (i4 == 102) {
                a5.append(" BALANCED");
            } else if (i4 == 104) {
                a5.append(" LOW_POWER");
            }
        } else {
            a5.append("PASSIVE");
        }
        if (this.f26384d != Long.MAX_VALUE) {
            a5.append(", duration=");
            m0.e(this.f26384d, a5);
        }
        if (this.f26385e != Integer.MAX_VALUE) {
            a5.append(", maxUpdates=");
            a5.append(this.f26385e);
        }
        long j4 = this.f26383c;
        if (j4 != -1 && j4 < this.f26382b) {
            a5.append(", minUpdateInterval=");
            m0.e(this.f26383c, a5);
        }
        if (this.f26386f > com.google.firebase.remoteconfig.p.f60679p) {
            a5.append(", minUpdateDistance=");
            a5.append(this.f26386f);
        }
        if (this.f26387g / 2 > this.f26382b) {
            a5.append(", maxUpdateDelay=");
            m0.e(this.f26387g, a5);
        }
        a5.append(']');
        return a5.toString();
    }

    /* compiled from: LocationRequestCompat.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private long f26394a;

        /* renamed from: b, reason: collision with root package name */
        private int f26395b;

        /* renamed from: c, reason: collision with root package name */
        private long f26396c;

        /* renamed from: d, reason: collision with root package name */
        private int f26397d;

        /* renamed from: e, reason: collision with root package name */
        private long f26398e;

        /* renamed from: f, reason: collision with root package name */
        private float f26399f;

        /* renamed from: g, reason: collision with root package name */
        private long f26400g;

        public c(long j4) {
            d(j4);
            this.f26395b = 102;
            this.f26396c = Long.MAX_VALUE;
            this.f26397d = Integer.MAX_VALUE;
            this.f26398e = -1L;
            this.f26399f = 0.0f;
            this.f26400g = 0L;
        }

        @o0
        public e0 a() {
            androidx.core.util.w.o((this.f26394a == Long.MAX_VALUE && this.f26398e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j4 = this.f26394a;
            return new e0(j4, this.f26395b, this.f26396c, this.f26397d, Math.min(this.f26398e, j4), this.f26399f, this.f26400g);
        }

        @o0
        public c b() {
            this.f26398e = -1L;
            return this;
        }

        @o0
        public c c(@g0(from = 1) long j4) {
            this.f26396c = androidx.core.util.w.h(j4, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @o0
        public c d(@g0(from = 0) long j4) {
            this.f26394a = androidx.core.util.w.h(j4, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @o0
        public c e(@g0(from = 0) long j4) {
            this.f26400g = j4;
            this.f26400g = androidx.core.util.w.h(j4, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @o0
        public c f(@g0(from = 1, to = 2147483647L) int i4) {
            this.f26397d = androidx.core.util.w.g(i4, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @o0
        public c g(@androidx.annotation.x(from = 0.0d, to = 3.4028234663852886E38d) float f4) {
            this.f26399f = f4;
            this.f26399f = androidx.core.util.w.f(f4, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @o0
        public c h(@g0(from = 0) long j4) {
            this.f26398e = androidx.core.util.w.h(j4, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @o0
        public c i(int i4) {
            androidx.core.util.w.c(i4 == 104 || i4 == 102 || i4 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i4));
            this.f26395b = i4;
            return this;
        }

        public c(@o0 e0 e0Var) {
            this.f26394a = e0Var.f26382b;
            this.f26395b = e0Var.f26381a;
            this.f26396c = e0Var.f26384d;
            this.f26397d = e0Var.f26385e;
            this.f26398e = e0Var.f26383c;
            this.f26399f = e0Var.f26386f;
            this.f26400g = e0Var.f26387g;
        }
    }
}
