package androidx.work;

import android.net.Uri;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: Constraints.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d f35948i = new d(new a());

    /* renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "required_network_type")
    private t f35949a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "requires_charging")
    private boolean f35950b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.room.i(name = "requires_device_idle")
    private boolean f35951c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.room.i(name = "requires_battery_not_low")
    private boolean f35952d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.room.i(name = "requires_storage_not_low")
    private boolean f35953e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.room.i(name = "trigger_content_update_delay")
    private long f35954f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.room.i(name = "trigger_max_content_delay")
    private long f35955g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.room.i(name = "content_uri_triggers")
    private e f35956h;

    @c1({c1.a.LIBRARY_GROUP})
    public d() {
        this.f35949a = t.NOT_REQUIRED;
        this.f35954f = -1L;
        this.f35955g = -1L;
        this.f35956h = new e();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    @x0(24)
    public e a() {
        return this.f35956h;
    }

    @o0
    public t b() {
        return this.f35949a;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public long c() {
        return this.f35954f;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public long d() {
        return this.f35955g;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(24)
    public boolean e() {
        return this.f35956h.c() > 0;
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (o4 == null || d.class != o4.getClass()) {
            return false;
        }
        d dVar = (d) o4;
        if (this.f35950b == dVar.f35950b && this.f35951c == dVar.f35951c && this.f35952d == dVar.f35952d && this.f35953e == dVar.f35953e && this.f35954f == dVar.f35954f && this.f35955g == dVar.f35955g && this.f35949a == dVar.f35949a) {
            return this.f35956h.equals(dVar.f35956h);
        }
        return false;
    }

    public boolean f() {
        return this.f35952d;
    }

    public boolean g() {
        return this.f35950b;
    }

    @x0(23)
    public boolean h() {
        return this.f35951c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f35949a.hashCode() * 31) + (this.f35950b ? 1 : 0)) * 31) + (this.f35951c ? 1 : 0)) * 31) + (this.f35952d ? 1 : 0)) * 31) + (this.f35953e ? 1 : 0)) * 31;
        long j4 = this.f35954f;
        int i4 = (hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f35955g;
        return this.f35956h.hashCode() + ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }

    public boolean i() {
        return this.f35953e;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(24)
    public void j(@q0 e mContentUriTriggers) {
        this.f35956h = mContentUriTriggers;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void k(@o0 t requiredNetworkType) {
        this.f35949a = requiredNetworkType;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void l(boolean requiresBatteryNotLow) {
        this.f35952d = requiresBatteryNotLow;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void m(boolean requiresCharging) {
        this.f35950b = requiresCharging;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public void n(boolean requiresDeviceIdle) {
        this.f35951c = requiresDeviceIdle;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void o(boolean requiresStorageNotLow) {
        this.f35953e = requiresStorageNotLow;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void p(long triggerContentUpdateDelay) {
        this.f35954f = triggerContentUpdateDelay;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void q(long triggerMaxContentDelay) {
        this.f35955g = triggerMaxContentDelay;
    }

    d(a builder) {
        this.f35949a = t.NOT_REQUIRED;
        this.f35954f = -1L;
        this.f35955g = -1L;
        this.f35956h = new e();
        this.f35950b = builder.f35957a;
        this.f35951c = builder.f35958b;
        this.f35949a = builder.f35959c;
        this.f35952d = builder.f35960d;
        this.f35953e = builder.f35961e;
        this.f35956h = builder.f35964h;
        this.f35954f = builder.f35962f;
        this.f35955g = builder.f35963g;
    }

    /* compiled from: Constraints.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f35957a;

        /* renamed from: b, reason: collision with root package name */
        boolean f35958b;

        /* renamed from: c, reason: collision with root package name */
        t f35959c;

        /* renamed from: d, reason: collision with root package name */
        boolean f35960d;

        /* renamed from: e, reason: collision with root package name */
        boolean f35961e;

        /* renamed from: f, reason: collision with root package name */
        long f35962f;

        /* renamed from: g, reason: collision with root package name */
        long f35963g;

        /* renamed from: h, reason: collision with root package name */
        e f35964h;

        public a() {
            this.f35957a = false;
            this.f35958b = false;
            this.f35959c = t.NOT_REQUIRED;
            this.f35960d = false;
            this.f35961e = false;
            this.f35962f = -1L;
            this.f35963g = -1L;
            this.f35964h = new e();
        }

        @o0
        @x0(24)
        public a a(@o0 Uri uri, boolean triggerForDescendants) {
            this.f35964h.a(uri, triggerForDescendants);
            return this;
        }

        @o0
        public d b() {
            return new d(this);
        }

        @o0
        public a c(@o0 t networkType) {
            this.f35959c = networkType;
            return this;
        }

        @o0
        public a d(boolean requiresBatteryNotLow) {
            this.f35960d = requiresBatteryNotLow;
            return this;
        }

        @o0
        public a e(boolean requiresCharging) {
            this.f35957a = requiresCharging;
            return this;
        }

        @o0
        @x0(23)
        public a f(boolean requiresDeviceIdle) {
            this.f35958b = requiresDeviceIdle;
            return this;
        }

        @o0
        public a g(boolean requiresStorageNotLow) {
            this.f35961e = requiresStorageNotLow;
            return this;
        }

        @o0
        @x0(24)
        public a h(long duration, @o0 TimeUnit timeUnit) {
            this.f35963g = timeUnit.toMillis(duration);
            return this;
        }

        @o0
        @x0(26)
        public a i(Duration duration) {
            long millis;
            millis = duration.toMillis();
            this.f35963g = millis;
            return this;
        }

        @o0
        @x0(24)
        public a j(long duration, @o0 TimeUnit timeUnit) {
            this.f35962f = timeUnit.toMillis(duration);
            return this;
        }

        @o0
        @x0(26)
        public a k(Duration duration) {
            long millis;
            millis = duration.toMillis();
            this.f35962f = millis;
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP})
        public a(@o0 d constraints) {
            this.f35957a = false;
            this.f35958b = false;
            this.f35959c = t.NOT_REQUIRED;
            this.f35960d = false;
            this.f35961e = false;
            this.f35962f = -1L;
            this.f35963g = -1L;
            this.f35964h = new e();
            this.f35957a = constraints.g();
            this.f35958b = constraints.h();
            this.f35959c = constraints.b();
            this.f35960d = constraints.f();
            this.f35961e = constraints.i();
            this.f35962f = constraints.c();
            this.f35963g = constraints.d();
            this.f35964h = constraints.a();
        }
    }

    public d(@o0 d other) {
        this.f35949a = t.NOT_REQUIRED;
        this.f35954f = -1L;
        this.f35955g = -1L;
        this.f35956h = new e();
        this.f35950b = other.f35950b;
        this.f35951c = other.f35951c;
        this.f35949a = other.f35949a;
        this.f35952d = other.f35952d;
        this.f35953e = other.f35953e;
        this.f35956h = other.f35956h;
    }
}
