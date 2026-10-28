package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;

/* compiled from: SystemClock.java */
/* loaded from: classes7.dex */
public final class w0 implements net.time4j.base.e<d0> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f83706c = 1000000;

    /* renamed from: d, reason: collision with root package name */
    private static final int f83707d = 1000000000;

    /* renamed from: e, reason: collision with root package name */
    private static final net.time4j.scale.e f83708e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f83709f;

    /* renamed from: g, reason: collision with root package name */
    public static final w0 f83710g;

    /* renamed from: h, reason: collision with root package name */
    public static final w0 f83711h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f83712a;

    /* renamed from: b, reason: collision with root package name */
    private final long f83713b;

    /* compiled from: SystemClock.java */
    private static class b implements net.time4j.scale.e {
        private b() {
        }

        @Override // net.time4j.scale.e
        public String a() {
            return "";
        }

        @Override // net.time4j.scale.e
        public long k() {
            return System.nanoTime();
        }

        b(a aVar) {
        }
    }

    static {
        net.time4j.scale.e eVar;
        String property = System.getProperty(ProtectedSandApp.s("鸃\u0001"));
        Iterator it = net.time4j.base.d.c().g(net.time4j.scale.e.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar = null;
                break;
            } else {
                eVar = (net.time4j.scale.e) it.next();
                if (property.equals(eVar.a())) {
                    break;
                }
            }
        }
        if (eVar == null) {
            eVar = new b();
        }
        f83708e = eVar;
        f83709f = Boolean.getBoolean(ProtectedSandApp.s("鸄\u0001"));
        f83710g = new w0(false, a());
        f83711h = new w0(true, a());
    }

    private w0(boolean z4, long j4) {
        this.f83712a = z4;
        this.f83713b = j4;
    }

    private static long a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = 0;
        int i4 = 0;
        while (i4 < 10) {
            j4 = f83709f ? System.nanoTime() : f83708e.k();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis == currentTimeMillis2) {
                break;
            }
            i4++;
            currentTimeMillis = currentTimeMillis2;
        }
        return net.time4j.base.c.m(net.time4j.base.c.i(net.time4j.scale.d.u0().I(net.time4j.base.c.b(currentTimeMillis, 1000)), 1000000000L) + (net.time4j.base.c.d(currentTimeMillis, 1000) * 1000000), j4);
    }

    public static d0 b() {
        return f83710g.c();
    }

    public static k1 g() {
        return k1.g();
    }

    public static k1 h() {
        return new k1(f83710g, net.time4j.tz.l.d0());
    }

    public static k1 i(String str) {
        return new k1(f83710g, str);
    }

    public static k1 j(net.time4j.tz.k kVar) {
        return new k1(f83710g, kVar);
    }

    private long n() {
        return net.time4j.base.c.f(f83709f ? System.nanoTime() : f83708e.k(), this.f83713b);
    }

    @Override // net.time4j.base.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d0 c() {
        if ((this.f83712a || f83709f) && net.time4j.scale.d.u0().z0()) {
            long n4 = n();
            return d0.V0(net.time4j.base.c.b(n4, 1000000000), net.time4j.base.c.d(n4, 1000000000), net.time4j.scale.f.UTC);
        }
        long currentTimeMillis = System.currentTimeMillis();
        return d0.V0(net.time4j.base.c.b(currentTimeMillis, 1000), net.time4j.base.c.d(currentTimeMillis, 1000) * 1000000, net.time4j.scale.f.POSIX);
    }

    public long e() {
        if (!this.f83712a && !f83709f) {
            return net.time4j.base.c.i(System.currentTimeMillis(), 1000L);
        }
        return net.time4j.base.c.i(net.time4j.scale.d.u0().J0(net.time4j.base.c.b(n(), 1000000000)), 1000000L) + net.time4j.base.c.d(r0, 1000);
    }

    public long f() {
        if (!this.f83712a && !f83709f) {
            return System.currentTimeMillis();
        }
        return net.time4j.base.c.i(net.time4j.scale.d.u0().J0(net.time4j.base.c.b(n(), 1000000000)), 1000L) + net.time4j.base.c.d(r0, 1000000);
    }

    public long k() {
        if (this.f83712a || f83709f) {
            return net.time4j.base.c.b(n(), 1000);
        }
        return net.time4j.base.c.i(net.time4j.scale.d.u0().I(net.time4j.base.c.b(System.currentTimeMillis(), 1000)), 1000000L) + (net.time4j.base.c.d(r2, 1000) * 1000);
    }

    public w0 l() {
        return new w0(this.f83712a, a());
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [net.time4j.base.f] */
    public w0 m(net.time4j.base.e<?> eVar) {
        d0 y02 = d0.y0(eVar.c());
        return new w0(this.f83712a, net.time4j.base.c.m(net.time4j.base.c.i(y02.c(net.time4j.scale.f.UTC), 1000000000L) + y02.p(r2), f83709f ? System.nanoTime() : f83708e.k()));
    }
}
