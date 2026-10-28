package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Chronology.java */
/* loaded from: classes7.dex */
public class x<T> implements u<T> {

    /* renamed from: g, reason: collision with root package name */
    private static final List<b> f82766g = new CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    private static final ReferenceQueue<x<?>> f82767h = new ReferenceQueue<>();

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f82768b;

    /* renamed from: c, reason: collision with root package name */
    private final u<T> f82769c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<q<?>, a0<T, ?>> f82770d;

    /* renamed from: e, reason: collision with root package name */
    private final List<s> f82771e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<q<?>, e0<T>> f82772f;

    /* compiled from: Chronology.java */
    public static class a<T extends r<T>> {

        /* renamed from: a, reason: collision with root package name */
        final Class<T> f82773a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f82774b;

        /* renamed from: c, reason: collision with root package name */
        final u<T> f82775c;

        /* renamed from: d, reason: collision with root package name */
        final Map<q<?>, a0<T, ?>> f82776d;

        /* renamed from: e, reason: collision with root package name */
        final List<s> f82777e;

        a(Class<T> cls, u<T> uVar) {
            if (uVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("錋\u0001"));
            }
            this.f82773a = cls;
            this.f82774b = cls.getName().startsWith(ProtectedSandApp.s("錊\u0001"));
            this.f82775c = uVar;
            this.f82776d = new HashMap();
            this.f82777e = new ArrayList();
        }

        private void d(q<?> qVar) {
            if (this.f82774b) {
                return;
            }
            if (qVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("錍\u0001"));
            }
            String name = qVar.name();
            for (q<?> qVar2 : this.f82776d.keySet()) {
                if (qVar2.equals(qVar) || qVar2.name().equals(name)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("錌\u0001"), name));
                }
            }
        }

        public static <T extends r<T>> a<T> e(Class<T> cls, u<T> uVar) {
            if (m0.class.isAssignableFrom(cls)) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("錎\u0001"));
            }
            return new a<>(cls, uVar);
        }

        public <V> a<T> a(q<V> qVar, a0<T, V> a0Var) {
            d(qVar);
            this.f82776d.put(qVar, a0Var);
            return this;
        }

        public a<T> b(s sVar) {
            if (sVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("錏\u0001"));
            }
            if (!this.f82777e.contains(sVar)) {
                this.f82777e.add(sVar);
            }
            return this;
        }

        public x<T> c() {
            x<T> xVar = new x<>(this.f82773a, this.f82775c, this.f82776d, this.f82777e);
            x.S(xVar);
            return xVar;
        }
    }

    /* compiled from: Chronology.java */
    private static class b extends WeakReference<x<?>> {

        /* renamed from: a, reason: collision with root package name */
        private final String f82778a;

        b(x<?> xVar, ReferenceQueue<x<?>> referenceQueue) {
            super(xVar, referenceQueue);
            this.f82778a = ((x) xVar).f82768b.getName();
        }
    }

    x(Class<T> cls) {
        if (cls == null) {
            throw new NullPointerException(ProtectedSandApp.s("鋿\u0001"));
        }
        this.f82768b = cls;
        this.f82769c = null;
        this.f82770d = Collections.emptyMap();
        this.f82771e = Collections.emptyList();
        this.f82772f = Collections.emptyMap();
    }

    private a0<T, ?> D(q<?> qVar, boolean z4) {
        if (!(qVar instanceof e) || !r.class.isAssignableFrom(C())) {
            return null;
        }
        e eVar = (e) e.class.cast(qVar);
        String o4 = z4 ? eVar.o(this) : null;
        if (o4 == null) {
            return eVar.g(this);
        }
        throw new RuleNotFoundException(o4);
    }

    public static <T> x<T> N(Class<T> cls) {
        x<T> xVar;
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            Iterator<b> it = f82766g.iterator();
            boolean z4 = false;
            while (true) {
                if (!it.hasNext()) {
                    xVar = null;
                    break;
                }
                xVar = (x) it.next().get();
                if (xVar == null) {
                    z4 = true;
                } else if (xVar.C() == cls) {
                    break;
                }
            }
            if (z4) {
                O();
            }
            return xVar;
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException(e4);
        }
    }

    private static void O() {
        while (true) {
            b bVar = (b) f82767h.poll();
            if (bVar == null) {
                return;
            }
            Iterator<b> it = f82766g.iterator();
            while (true) {
                if (it.hasNext()) {
                    b next = it.next();
                    if (next.f82778a.equals(bVar.f82778a)) {
                        f82766g.remove(next);
                        break;
                    }
                }
            }
        }
    }

    static void S(x<?> xVar) {
        f82766g.add(new b(xVar, f82767h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T u(Object obj) {
        return obj;
    }

    public final l<T> B(q0 q0Var) {
        return z(q0Var.getVariant());
    }

    public Class<T> C() {
        return this.f82768b;
    }

    public List<s> E() {
        return this.f82771e;
    }

    e0<T> F(q<Integer> qVar) {
        return this.f82772f.get(qVar);
    }

    public Set<q<?>> H() {
        return this.f82770d.keySet();
    }

    <V> a0<T, V> I(q<V> qVar) {
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("錁\u0001"));
        }
        a0<T, ?> a0Var = (a0<T, V>) this.f82770d.get(qVar);
        if (a0Var == null && (a0Var = D(qVar, true)) == null) {
            throw new RuleNotFoundException((x<?>) this, (q<?>) qVar);
        }
        return a0Var;
    }

    public boolean J() {
        return false;
    }

    public boolean K(q<?> qVar) {
        return qVar != null && this.f82770d.containsKey(qVar);
    }

    public boolean M(q<?> qVar) {
        if (qVar == null) {
            return false;
        }
        return K(qVar) || D(qVar, false) != null;
    }

    @Override // net.time4j.engine.u
    public g0 a() {
        return this.f82769c.a();
    }

    @Override // net.time4j.engine.u
    public x<?> d() {
        return this.f82769c.d();
    }

    @Override // net.time4j.engine.u
    public T e(r<?> rVar, d dVar, boolean z4, boolean z5) {
        return this.f82769c.e(rVar, dVar, z4, z5);
    }

    @Override // net.time4j.engine.u
    public int g() {
        return this.f82769c.g();
    }

    @Override // net.time4j.engine.u
    public p k(T t4, d dVar) {
        return this.f82769c.k(t4, dVar);
    }

    @Override // net.time4j.engine.u
    public String n(z zVar, Locale locale) {
        return this.f82769c.n(zVar, locale);
    }

    @Override // net.time4j.engine.u
    public T o(net.time4j.base.e<?> eVar, d dVar) {
        if (dVar != null) {
            return this.f82769c.o(eVar, dVar);
        }
        throw new NullPointerException(ProtectedSandApp.s("錂\u0001"));
    }

    public l<T> y() {
        throw new ChronoException(ProtectedSandApp.s("錃\u0001"));
    }

    public l<T> z(String str) {
        throw new ChronoException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("錄\u0001"), str));
    }

    x(Class<T> cls, u<T> uVar, Map<q<?>, a0<T, ?>> map, List<s> list) {
        if (cls == null) {
            throw new NullPointerException(ProtectedSandApp.s("鋿\u0001"));
        }
        if (uVar != null) {
            this.f82768b = cls;
            this.f82769c = uVar;
            Map<q<?>, a0<T, ?>> unmodifiableMap = Collections.unmodifiableMap(map);
            this.f82770d = unmodifiableMap;
            this.f82771e = Collections.unmodifiableList(list);
            HashMap hashMap = new HashMap();
            for (q<?> qVar : unmodifiableMap.keySet()) {
                if (qVar.getType() == Integer.class) {
                    a0<T, ?> a0Var = this.f82770d.get(qVar);
                    if (a0Var instanceof e0) {
                        hashMap.put(qVar, (e0) a0Var);
                    }
                }
            }
            this.f82772f = Collections.unmodifiableMap(hashMap);
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("錀\u0001"));
    }
}
