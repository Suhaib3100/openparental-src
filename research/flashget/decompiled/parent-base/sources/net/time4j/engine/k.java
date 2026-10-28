package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import net.time4j.engine.m;
import net.time4j.engine.x;

/* compiled from: CalendarFamily.java */
/* loaded from: classes7.dex */
public final class k<T extends m<T>> extends x<T> {

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, ? extends l<T>> f82763i;

    /* compiled from: CalendarFamily.java */
    public static final class b<T extends m<T>> extends x.a<T> {

        /* renamed from: f, reason: collision with root package name */
        private final Map<String, ? extends l<T>> f82764f;

        private b(Class<T> cls, u<T> uVar, Map<String, ? extends l<T>> map) {
            super(cls, uVar);
            if (map.isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("錢\u0001"));
            }
            this.f82764f = map;
        }

        public static <T extends m<T>> b<T> i(Class<T> cls, u<T> uVar, Map<String, ? extends l<T>> map) {
            return new b<>(cls, uVar, map);
        }

        @Override // net.time4j.engine.x.a
        public x.a a(q qVar, a0 a0Var) {
            super.a(qVar, a0Var);
            return this;
        }

        @Override // net.time4j.engine.x.a
        public x.a b(s sVar) {
            super.b(sVar);
            return this;
        }

        public <V> b<T> f(q<V> qVar, a0<T, V> a0Var) {
            super.a(qVar, a0Var);
            return this;
        }

        public b<T> g(s sVar) {
            super.b(sVar);
            return this;
        }

        @Override // net.time4j.engine.x.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public k<T> c() {
            k<T> kVar = new k<>(this.f82773a, this.f82775c, this.f82776d, this.f82777e, this.f82764f);
            x.S(kVar);
            return kVar;
        }
    }

    /* compiled from: CalendarFamily.java */
    private static class c<D extends m<D>> implements k0<D>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final transient l<D> f82765b;
        private final Class<D> chronoType;
        private final String variant;

        private Object readResolve() throws ObjectStreamException {
            return new c(x.N(this.chronoType), this.variant);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(D d5, D d6) {
            long b5 = d5.b();
            long b6 = d6.b();
            if (b5 < b6) {
                return -1;
            }
            return b5 > b6 ? 1 : 0;
        }

        @Override // net.time4j.engine.k0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public D p0(D d5) {
            if (d5.b() == this.f82765b.g()) {
                return null;
            }
            return (D) d5.V(i.f82737c);
        }

        @Override // net.time4j.engine.k0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public D A(D d5) {
            if (d5.b() == this.f82765b.d()) {
                return null;
            }
            return (D) d5.W(i.f82737c);
        }

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.chronoType == cVar.chronoType && this.variant.equals(cVar.variant);
        }

        public int hashCode() {
            return (this.variant.hashCode() * 31) + this.chronoType.hashCode();
        }

        @Override // net.time4j.engine.k0
        public boolean isCalendrical() {
            return true;
        }

        private c(x<D> xVar, String str) {
            this.f82765b = xVar.z(str);
            this.chronoType = xVar.C();
            this.variant = str;
        }
    }

    @Override // net.time4j.engine.x
    public boolean J() {
        return true;
    }

    @Override // net.time4j.engine.x
    public boolean M(q<?> qVar) {
        return super.M(qVar) || (qVar instanceof b0);
    }

    public k0<T> Y(String str) {
        return new c(this, str);
    }

    public k0<T> c0(q0 q0Var) {
        return Y(q0Var.getVariant());
    }

    @Override // net.time4j.engine.x
    public l<T> y() {
        throw new ChronoException(ProtectedSandApp.s("錣\u0001"));
    }

    @Override // net.time4j.engine.x
    public l<T> z(String str) {
        if (str.isEmpty()) {
            return y();
        }
        l<T> lVar = this.f82763i.get(str);
        return lVar == null ? super.z(str) : lVar;
    }

    private k(Class<T> cls, u<T> uVar, Map<q<?>, a0<T, ?>> map, List<s> list, Map<String, ? extends l<T>> map2) {
        super(cls, uVar, map, list);
        this.f82763i = map2;
    }
}
