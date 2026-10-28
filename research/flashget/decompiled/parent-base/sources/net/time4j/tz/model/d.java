package net.time4j.tz.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.l0;
import net.time4j.m;
import net.time4j.m0;

/* compiled from: DaylightSavingRule.java */
/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    private final transient long f83607b;

    /* renamed from: c, reason: collision with root package name */
    private final transient m0 f83608c;

    /* renamed from: d, reason: collision with root package name */
    private final transient i f83609d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f83610e;

    protected d(int i4, i iVar, int i5) {
        if (iVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("餅\u0001"));
        }
        if (i5 != Integer.MAX_VALUE && (i5 < -64800 || i5 > 64800)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("餄\u0001"), i5));
        }
        if (i4 == 86400) {
            this.f83607b = 0L;
            this.f83608c = m0.X0();
        } else {
            m l12 = m0.Y0().l1(i4, net.time4j.j.SECONDS);
            this.f83607b = l12.a();
            this.f83608c = l12.b();
        }
        this.f83609d = iVar;
        this.f83610e = i5 == Integer.MAX_VALUE ? 0 : i5;
    }

    protected String a() {
        net.time4j.format.c cVar = (net.time4j.format.c) getClass().getAnnotation(net.time4j.format.c.class);
        if (cVar != null) {
            return cVar.value();
        }
        throw new IllegalStateException(ProtectedSandApp.s("餆\u0001") + getClass());
    }

    public abstract l0 b(int i4);

    protected final long c() {
        return this.f83607b;
    }

    public final i d() {
        return this.f83609d;
    }

    public final int e() {
        return this.f83610e;
    }

    public final m0 f() {
        return this.f83608c;
    }

    int g() {
        return 0;
    }

    protected abstract int h(long j4);

    protected abstract int i(net.time4j.base.a aVar);
}
