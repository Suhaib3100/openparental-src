package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: LocationRequestCompat.java */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final long f4902h = Long.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public static final int f4903i = 100;

    /* renamed from: j, reason: collision with root package name */
    public static final int f4904j = 102;

    /* renamed from: k, reason: collision with root package name */
    public static final int f4905k = 104;

    /* renamed from: l, reason: collision with root package name */
    private static final long f4906l = -1;

    /* renamed from: a, reason: collision with root package name */
    final int f4907a;

    /* renamed from: b, reason: collision with root package name */
    final long f4908b;

    /* renamed from: c, reason: collision with root package name */
    final long f4909c;

    /* renamed from: d, reason: collision with root package name */
    final long f4910d;

    /* renamed from: e, reason: collision with root package name */
    final int f4911e;

    /* renamed from: f, reason: collision with root package name */
    final float f4912f;

    /* renamed from: g, reason: collision with root package name */
    final long f4913g;

    /* compiled from: LocationRequestCompat.java */
    @androidx.annotation.x0(19)
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f4914a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f4915b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f4916c;

        /* renamed from: d, reason: collision with root package name */
        private static Method f4917d;

        /* renamed from: e, reason: collision with root package name */
        private static Method f4918e;

        /* renamed from: f, reason: collision with root package name */
        private static Method f4919f;

        private a() {
        }

        public static Object a(v0 v0Var, String str) {
            try {
                if (f4914a == null) {
                    f4914a = Class.forName("android.location.LocationRequest");
                }
                if (f4915b == null) {
                    Method declaredMethod = f4914a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f4915b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f4915b.invoke(null, str, Long.valueOf(v0Var.f4908b), Float.valueOf(v0Var.f4912f), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (f4916c == null) {
                    Method declaredMethod2 = f4914a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f4916c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f4916c.invoke(invoke, Integer.valueOf(v0Var.f4907a));
                if (f4917d == null) {
                    Method declaredMethod3 = f4914a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f4917d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f4917d.invoke(invoke, Long.valueOf(v0Var.f()));
                if (v0Var.f4911e < Integer.MAX_VALUE) {
                    if (f4918e == null) {
                        Method declaredMethod4 = f4914a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f4918e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f4918e.invoke(invoke, Integer.valueOf(v0Var.f4911e));
                }
                if (v0Var.f4910d < Long.MAX_VALUE) {
                    if (f4919f == null) {
                        Method declaredMethod5 = f4914a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f4919f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f4919f.invoke(invoke, Long.valueOf(v0Var.f4910d));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocationRequestCompat.java */
    @androidx.annotation.x0(31)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        public static LocationRequest a(v0 v0Var) {
            return new LocationRequest.Builder(v0Var.f4908b).setQuality(v0Var.f4907a).setMinUpdateIntervalMillis(v0Var.f()).setDurationMillis(v0Var.f4910d).setMaxUpdates(v0Var.f4911e).setMinUpdateDistanceMeters(v0Var.f4912f).setMaxUpdateDelayMillis(v0Var.f4913g).build();
        }
    }

    /* compiled from: LocationRequestCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    v0(long j5, int i5, long j6, int i6, long j7, float f6, long j8) {
        this.f4908b = j5;
        this.f4907a = i5;
        this.f4909c = j7;
        this.f4910d = j6;
        this.f4911e = i6;
        this.f4912f = f6;
        this.f4913g = j8;
    }

    @androidx.annotation.g0(from = 1)
    public long a() {
        return this.f4910d;
    }

    @androidx.annotation.g0(from = 0)
    public long b() {
        return this.f4908b;
    }

    @androidx.annotation.g0(from = 0)
    public long c() {
        return this.f4913g;
    }

    @androidx.annotation.g0(from = 1, to = 2147483647L)
    public int d() {
        return this.f4911e;
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o, to = 3.4028234663852886E38d)
    public float e() {
        return this.f4912f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f4907a == v0Var.f4907a && this.f4908b == v0Var.f4908b && this.f4909c == v0Var.f4909c && this.f4910d == v0Var.f4910d && this.f4911e == v0Var.f4911e && Float.compare(v0Var.f4912f, this.f4912f) == 0 && this.f4913g == v0Var.f4913g;
    }

    @androidx.annotation.g0(from = 0)
    public long f() {
        long j5 = this.f4909c;
        return j5 == -1 ? this.f4908b : j5;
    }

    public int g() {
        return this.f4907a;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(31)
    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        int i5 = this.f4907a * 31;
        long j5 = this.f4908b;
        int i6 = (i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f4909c;
        return i6 + ((int) (j6 ^ (j6 >>> 32)));
    }

    @androidx.annotation.q0
    @SuppressLint({"NewApi"})
    @androidx.annotation.x0(19)
    public LocationRequest i(@androidx.annotation.o0 String str) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(this) : (LocationRequest) a.a(this, str);
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder a6 = androidx.constraintlayout.motion.widget.r.a("Request[");
        if (this.f4908b != Long.MAX_VALUE) {
            a6.append("@");
            androidx.core.util.a0.e(this.f4908b, a6);
            int i5 = this.f4907a;
            if (i5 == 100) {
                a6.append(" HIGH_ACCURACY");
            } else if (i5 == 102) {
                a6.append(" BALANCED");
            } else if (i5 == 104) {
                a6.append(" LOW_POWER");
            }
        } else {
            a6.append("PASSIVE");
        }
        if (this.f4910d != Long.MAX_VALUE) {
            a6.append(", duration=");
            androidx.core.util.a0.e(this.f4910d, a6);
        }
        if (this.f4911e != Integer.MAX_VALUE) {
            a6.append(", maxUpdates=");
            a6.append(this.f4911e);
        }
        long j5 = this.f4909c;
        if (j5 != -1 && j5 < this.f4908b) {
            a6.append(", minUpdateInterval=");
            androidx.core.util.a0.e(this.f4909c, a6);
        }
        if (this.f4912f > com.google.firebase.remoteconfig.p.f18289o) {
            a6.append(", minUpdateDistance=");
            a6.append(this.f4912f);
        }
        if (this.f4913g / 2 > this.f4908b) {
            a6.append(", maxUpdateDelay=");
            androidx.core.util.a0.e(this.f4913g, a6);
        }
        a6.append(']');
        return a6.toString();
    }

    /* compiled from: LocationRequestCompat.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private long f4920a;

        /* renamed from: b, reason: collision with root package name */
        private int f4921b;

        /* renamed from: c, reason: collision with root package name */
        private long f4922c;

        /* renamed from: d, reason: collision with root package name */
        private int f4923d;

        /* renamed from: e, reason: collision with root package name */
        private long f4924e;

        /* renamed from: f, reason: collision with root package name */
        private float f4925f;

        /* renamed from: g, reason: collision with root package name */
        private long f4926g;

        public c(long j5) {
            d(j5);
            this.f4921b = 102;
            this.f4922c = Long.MAX_VALUE;
            this.f4923d = Integer.MAX_VALUE;
            this.f4924e = -1L;
            this.f4925f = 0.0f;
            this.f4926g = 0L;
        }

        @androidx.annotation.o0
        public v0 a() {
            androidx.core.util.q.o((this.f4920a == Long.MAX_VALUE && this.f4924e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j5 = this.f4920a;
            return new v0(j5, this.f4921b, this.f4922c, this.f4923d, Math.min(this.f4924e, j5), this.f4925f, this.f4926g);
        }

        @androidx.annotation.o0
        public c b() {
            this.f4924e = -1L;
            return this;
        }

        @androidx.annotation.o0
        public c c(@androidx.annotation.g0(from = 1) long j5) {
            this.f4922c = androidx.core.util.q.h(j5, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @androidx.annotation.o0
        public c d(@androidx.annotation.g0(from = 0) long j5) {
            this.f4920a = androidx.core.util.q.h(j5, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @androidx.annotation.o0
        public c e(@androidx.annotation.g0(from = 0) long j5) {
            this.f4926g = j5;
            this.f4926g = androidx.core.util.q.h(j5, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @androidx.annotation.o0
        public c f(@androidx.annotation.g0(from = 1, to = 2147483647L) int i5) {
            this.f4923d = androidx.core.util.q.g(i5, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @androidx.annotation.o0
        public c g(@androidx.annotation.x(from = 0.0d, to = 3.4028234663852886E38d) float f6) {
            this.f4925f = f6;
            this.f4925f = androidx.core.util.q.f(f6, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @androidx.annotation.o0
        public c h(@androidx.annotation.g0(from = 0) long j5) {
            this.f4924e = androidx.core.util.q.h(j5, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @androidx.annotation.o0
        public c i(int i5) {
            androidx.core.util.q.c(i5 == 104 || i5 == 102 || i5 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i5));
            this.f4921b = i5;
            return this;
        }

        public c(@androidx.annotation.o0 v0 v0Var) {
            this.f4920a = v0Var.f4908b;
            this.f4921b = v0Var.f4907a;
            this.f4922c = v0Var.f4910d;
            this.f4923d = v0Var.f4911e;
            this.f4924e = v0Var.f4909c;
            this.f4925f = v0Var.f4912f;
            this.f4926g = v0Var.f4913g;
        }
    }
}
