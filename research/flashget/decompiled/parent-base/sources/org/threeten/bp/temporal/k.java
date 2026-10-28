package org.threeten.bp.temporal;

import org.threeten.bp.r;
import org.threeten.bp.s;

/* compiled from: TemporalQueries.java */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    static final l<r> f88368a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final l<org.threeten.bp.chrono.j> f88369b = new b();

    /* renamed from: c, reason: collision with root package name */
    static final l<m> f88370c = new c();

    /* renamed from: d, reason: collision with root package name */
    static final l<r> f88371d = new d();

    /* renamed from: e, reason: collision with root package name */
    static final l<s> f88372e = new e();

    /* renamed from: f, reason: collision with root package name */
    static final l<org.threeten.bp.g> f88373f = new f();

    /* renamed from: g, reason: collision with root package name */
    static final l<org.threeten.bp.i> f88374g = new g();

    /* compiled from: TemporalQueries.java */
    class a implements l<r> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(org.threeten.bp.temporal.f fVar) {
            return (r) fVar.query(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    class b implements l<org.threeten.bp.chrono.j> {
        b() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.chrono.j a(org.threeten.bp.temporal.f fVar) {
            return (org.threeten.bp.chrono.j) fVar.query(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    class c implements l<m> {
        c() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(org.threeten.bp.temporal.f fVar) {
            return (m) fVar.query(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    class d implements l<r> {
        d() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(org.threeten.bp.temporal.f fVar) {
            r rVar = (r) fVar.query(k.f88368a);
            return rVar != null ? rVar : (r) fVar.query(k.f88372e);
        }
    }

    /* compiled from: TemporalQueries.java */
    class e implements l<s> {
        e() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(org.threeten.bp.temporal.f fVar) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.OFFSET_SECONDS;
            if (fVar.isSupported(aVar)) {
                return s.A(fVar.get(aVar));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    class f implements l<org.threeten.bp.g> {
        f() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.g a(org.threeten.bp.temporal.f fVar) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.EPOCH_DAY;
            if (fVar.isSupported(aVar)) {
                return org.threeten.bp.g.z0(fVar.getLong(aVar));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    class g implements l<org.threeten.bp.i> {
        g() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.threeten.bp.i a(org.threeten.bp.temporal.f fVar) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.NANO_OF_DAY;
            if (fVar.isSupported(aVar)) {
                return org.threeten.bp.i.S(fVar.getLong(aVar));
            }
            return null;
        }
    }

    private k() {
    }

    public static final l<org.threeten.bp.chrono.j> a() {
        return f88369b;
    }

    public static final l<org.threeten.bp.g> b() {
        return f88373f;
    }

    public static final l<org.threeten.bp.i> c() {
        return f88374g;
    }

    public static final l<s> d() {
        return f88372e;
    }

    public static final l<m> e() {
        return f88370c;
    }

    public static final l<r> f() {
        return f88371d;
    }

    public static final l<r> g() {
        return f88368a;
    }
}
