package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: Chronology.java */
/* loaded from: classes9.dex */
public abstract class j implements Comparable<j> {

    /* renamed from: b, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<j> f87976b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<String, j> f87977c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap<String, j> f87978d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static final Method f87979e;

    /* compiled from: Chronology.java */
    class a implements org.threeten.bp.temporal.l<j> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(org.threeten.bp.temporal.f fVar) {
            return j.p(fVar);
        }
    }

    /* compiled from: Chronology.java */
    class b extends ng.c {
        b() {
        }

        @Override // org.threeten.bp.temporal.f
        public long getLong(org.threeten.bp.temporal.j jVar) {
            throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }

        @Override // org.threeten.bp.temporal.f
        public boolean isSupported(org.threeten.bp.temporal.j jVar) {
            return false;
        }

        @Override // ng.c, org.threeten.bp.temporal.f
        public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
            return lVar == org.threeten.bp.temporal.k.a() ? (R) j.this : (R) super.query(lVar);
        }
    }

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
            method = null;
        }
        f87979e = method;
    }

    protected j() {
    }

    static j C(DataInput dataInput) throws IOException {
        return x(dataInput.readUTF());
    }

    private static void E(j jVar) {
        f87977c.putIfAbsent(jVar.t(), jVar);
        String r4 = jVar.r();
        if (r4 != null) {
            f87978d.putIfAbsent(r4, jVar);
        }
    }

    public static j p(org.threeten.bp.temporal.f fVar) {
        ng.d.j(fVar, "temporal");
        j jVar = (j) fVar.query(org.threeten.bp.temporal.k.a());
        return jVar != null ? jVar : o.f88011f;
    }

    public static Set<j> q() {
        u();
        return new HashSet(f87977c.values());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static void u() {
        ConcurrentHashMap<String, j> concurrentHashMap = f87977c;
        if (concurrentHashMap.isEmpty()) {
            E(o.f88011f);
            E(x.f88061f);
            E(t.f88040f);
            E(q.f88014g);
            l lVar = l.f87981f;
            E(lVar);
            concurrentHashMap.putIfAbsent("Hijrah", lVar);
            f87978d.putIfAbsent("islamic", lVar);
            Iterator it = ServiceLoader.load(j.class, j.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                f87977c.putIfAbsent(jVar.t(), jVar);
                String r4 = jVar.r();
                if (r4 != null) {
                    f87978d.putIfAbsent(r4, jVar);
                }
            }
        }
    }

    private Object writeReplace() {
        return new w((byte) 11, this);
    }

    public static j x(String str) {
        u();
        j jVar = f87977c.get(str);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = f87978d.get(str);
        if (jVar2 != null) {
            return jVar2;
        }
        throw new DateTimeException(androidx.constraintlayout.core.motion.key.c.a("Unknown chronology: ", str));
    }

    public static j y(Locale locale) {
        String str;
        u();
        ng.d.j(locale, "locale");
        Method method = f87979e;
        if (method != null) {
            try {
                str = (String) method.invoke(locale, "ca");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        } else {
            if (locale.equals(q.f88013f)) {
                str = "japanese";
            }
            str = "iso";
        }
        if (str == null || "iso".equals(str) || "iso8601".equals(str)) {
            return o.f88011f;
        }
        j jVar = f87978d.get(str);
        if (jVar != null) {
            return jVar;
        }
        throw new DateTimeException("Unknown calendar system: ".concat(str));
    }

    public abstract int A(k kVar, int i4);

    public abstract org.threeten.bp.temporal.n B(org.threeten.bp.temporal.a aVar);

    public abstract c G(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.j jVar);

    void J(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.temporal.a aVar, long j4) {
        Long l4 = map.get(aVar);
        if (l4 == null || l4.longValue() == j4) {
            map.put(aVar, Long.valueOf(j4));
            return;
        }
        throw new DateTimeException("Invalid state, field: " + aVar + " " + l4 + " conflicts with " + aVar + " " + j4);
    }

    void K(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(t());
    }

    public h<?> L(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return i.U(this, fVar, rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [org.threeten.bp.chrono.h, org.threeten.bp.chrono.h<?>] */
    public h<?> M(org.threeten.bp.temporal.f fVar) {
        try {
            org.threeten.bp.r a5 = org.threeten.bp.r.a(fVar);
            try {
                fVar = L(org.threeten.bp.f.p(fVar), a5);
                return fVar;
            } catch (DateTimeException unused) {
                return i.T(l(w(fVar)), a5, null);
            }
        } catch (DateTimeException e4) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + fVar.getClass(), e4);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        return t().compareTo(jVar.t());
    }

    public abstract c b(int i4, int i5, int i6);

    public c c(k kVar, int i4, int i5, int i6) {
        return b(A(kVar, i4), i5, i6);
    }

    public abstract c d(org.threeten.bp.temporal.f fVar);

    public abstract c e(long j4);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && compareTo((j) obj) == 0;
    }

    public c f() {
        return g(org.threeten.bp.a.g());
    }

    public c g(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        return d(org.threeten.bp.g.v0(aVar));
    }

    public c h(org.threeten.bp.r rVar) {
        return g(org.threeten.bp.a.f(rVar));
    }

    public int hashCode() {
        return getClass().hashCode() ^ t().hashCode();
    }

    public abstract c i(int i4, int i5);

    public c j(k kVar, int i4, int i5) {
        return i(A(kVar, i4), i5);
    }

    <D extends c> D k(org.threeten.bp.temporal.e eVar) {
        D d5 = (D) eVar;
        if (equals(d5.p())) {
            return d5;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + t() + ", actual: " + d5.p().t());
    }

    <D extends c> e<D> l(org.threeten.bp.temporal.e eVar) {
        e<D> eVar2 = (e) eVar;
        if (equals(eVar2.B().p())) {
            return eVar2;
        }
        throw new ClassCastException("Chrono mismatch, required: " + t() + ", supplied: " + eVar2.B().p().t());
    }

    <D extends c> i<D> m(org.threeten.bp.temporal.e eVar) {
        i<D> iVar = (i) eVar;
        if (equals(iVar.C().p())) {
            return iVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + t() + ", supplied: " + iVar.C().p().t());
    }

    public abstract k n(int i4);

    public abstract List<k> o();

    public abstract String r();

    public String s(org.threeten.bp.format.n nVar, Locale locale) {
        return new org.threeten.bp.format.d().c(nVar).Q(locale).d(new b());
    }

    public abstract String t();

    public String toString() {
        return t();
    }

    public abstract boolean v(long j4);

    public d<?> w(org.threeten.bp.temporal.f fVar) {
        try {
            return d(fVar).l(org.threeten.bp.i.q(fVar));
        } catch (DateTimeException e4) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + fVar.getClass(), e4);
        }
    }

    public f z(int i4, int i5, int i6) {
        return new g(this, i4, i5, i6);
    }
}
