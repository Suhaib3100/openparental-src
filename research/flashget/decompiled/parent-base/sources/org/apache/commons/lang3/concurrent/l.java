package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.k1;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.concurrent.a;

/* compiled from: EventCountCircuitBreaker.java */
/* loaded from: classes6.dex */
public class l extends org.apache.commons.lang3.concurrent.a<Integer> {

    /* renamed from: i, reason: collision with root package name */
    private static final Map<a.b, c> f85900i = h();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<b> f85901d;

    /* renamed from: e, reason: collision with root package name */
    private final int f85902e;

    /* renamed from: f, reason: collision with root package name */
    private final long f85903f;

    /* renamed from: g, reason: collision with root package name */
    private final int f85904g;

    /* renamed from: h, reason: collision with root package name */
    private final long f85905h;

    /* compiled from: EventCountCircuitBreaker.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f85906a;

        /* renamed from: b, reason: collision with root package name */
        private final long f85907b;

        b(int i4, long j4) {
            this.f85906a = i4;
            this.f85907b = j4;
        }

        public long a() {
            return this.f85907b;
        }

        public int b() {
            return this.f85906a;
        }

        public b c(int i4) {
            return i4 == 0 ? this : new b(b() + i4, a());
        }
    }

    /* compiled from: EventCountCircuitBreaker.java */
    private static abstract class c {
        private c() {
        }

        protected abstract long a(l lVar);

        public boolean b(l lVar, b bVar, long j4) {
            return j4 - bVar.a() > a(lVar);
        }

        public abstract boolean c(l lVar, b bVar, b bVar2);
    }

    /* compiled from: EventCountCircuitBreaker.java */
    private static class d extends c {
        private d() {
            super();
        }

        @Override // org.apache.commons.lang3.concurrent.l.c
        protected long a(l lVar) {
            return lVar.k();
        }

        @Override // org.apache.commons.lang3.concurrent.l.c
        public boolean c(l lVar, b bVar, b bVar2) {
            return bVar2.b() > lVar.l();
        }

        d(a aVar) {
            super();
        }
    }

    /* compiled from: EventCountCircuitBreaker.java */
    private static class e extends c {
        private e() {
            super();
        }

        @Override // org.apache.commons.lang3.concurrent.l.c
        protected long a(l lVar) {
            return lVar.i();
        }

        @Override // org.apache.commons.lang3.concurrent.l.c
        public boolean c(l lVar, b bVar, b bVar2) {
            return bVar2.a() != bVar.a() && bVar.b() < lVar.j();
        }

        e(a aVar) {
            super();
        }
    }

    public l(int i4, long j4, TimeUnit timeUnit, int i5, long j5, TimeUnit timeUnit2) {
        this.f85901d = new AtomicReference<>(new b(0, 0L));
        this.f85902e = i4;
        this.f85903f = timeUnit.toNanos(j4);
        this.f85904g = i5;
        this.f85905h = timeUnit2.toNanos(j5);
    }

    private void g(a.b bVar) {
        d(bVar);
        this.f85901d.set(new b(0, p()));
    }

    private static Map<a.b, c> h() {
        EnumMap enumMap = new EnumMap(a.b.class);
        enumMap.put((EnumMap) a.b.CLOSED, (a.b) new d(r3));
        enumMap.put((EnumMap) a.b.OPEN, (a.b) new e(r3));
        return enumMap;
    }

    private b o(int i4, b bVar, a.b bVar2, long j4) {
        return r(bVar2).b(this, bVar, j4) ? new b(i4, j4) : bVar.c(i4);
    }

    private boolean q(int i4) {
        a.b bVar;
        b bVar2;
        b o4;
        do {
            long p4 = p();
            bVar = this.f85875a.get();
            bVar2 = this.f85901d.get();
            o4 = o(i4, bVar2, bVar, p4);
        } while (!s(bVar2, o4));
        if (r(bVar).c(this, bVar2, o4)) {
            bVar = bVar.oppositeState();
            g(bVar);
        }
        return !org.apache.commons.lang3.concurrent.a.e(bVar);
    }

    private static c r(a.b bVar) {
        return f85900i.get(bVar);
    }

    private boolean s(b bVar, b bVar2) {
        return bVar == bVar2 || k1.a(this.f85901d, bVar, bVar2);
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public boolean a() {
        return q(0);
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public void close() {
        super.close();
        this.f85901d.set(new b(0, p()));
    }

    public long i() {
        return this.f85905h;
    }

    public int j() {
        return this.f85904g;
    }

    public long k() {
        return this.f85903f;
    }

    public int l() {
        return this.f85902e;
    }

    public boolean m() {
        return b(1);
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return q(num.intValue());
    }

    @Override // org.apache.commons.lang3.concurrent.a, org.apache.commons.lang3.concurrent.g
    public void open() {
        super.open();
        this.f85901d.set(new b(0, p()));
    }

    long p() {
        return System.nanoTime();
    }

    public l(int i4, long j4, TimeUnit timeUnit) {
        this(i4, j4, timeUnit, i4, j4, timeUnit);
    }

    public l(int i4, long j4, TimeUnit timeUnit, int i5) {
        this(i4, j4, timeUnit, i5, j4, timeUnit);
    }
}
