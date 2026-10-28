package com.google.firebase.components;

import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.compose.animation.core.k1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes6.dex */
public class o implements d, r9.a {

    /* renamed from: i, reason: collision with root package name */
    private static final y9.b<Set<Object>> f58453i = new k();

    /* renamed from: a, reason: collision with root package name */
    private final Map<c<?>, y9.b<?>> f58454a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<b0<?>, y9.b<?>> f58455b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<b0<?>, v<?>> f58456c;

    /* renamed from: d, reason: collision with root package name */
    private final List<y9.b<ComponentRegistrar>> f58457d;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f58458e;

    /* renamed from: f, reason: collision with root package name */
    private final t f58459f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f58460g;

    /* renamed from: h, reason: collision with root package name */
    private final i f58461h;

    /* compiled from: ComponentRuntime.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f58462a;

        /* renamed from: b, reason: collision with root package name */
        private final List<y9.b<ComponentRegistrar>> f58463b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<c<?>> f58464c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private i f58465d = i.f58445a;

        b(Executor executor) {
            this.f58462a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        private static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @f9.a
        public b b(c<?> cVar) {
            this.f58464c.add(cVar);
            return this;
        }

        @f9.a
        public b c(final ComponentRegistrar componentRegistrar) {
            this.f58463b.add(new y9.b() { // from class: com.google.firebase.components.p
                @Override // y9.b
                public final Object get() {
                    return ComponentRegistrar.this;
                }
            });
            return this;
        }

        @f9.a
        public b d(Collection<y9.b<ComponentRegistrar>> collection) {
            this.f58463b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f58462a, this.f58463b, this.f58464c, this.f58465d);
        }

        @f9.a
        public b g(i iVar) {
            this.f58465d = iVar;
            return this;
        }
    }

    private void A() {
        Boolean bool = this.f58460g.get();
        if (bool != null) {
            r(this.f58454a, bool.booleanValue());
        }
    }

    private void B() {
        for (c<?> cVar : this.f58454a.keySet()) {
            for (r rVar : cVar.j()) {
                if (rVar.h() && !this.f58456c.containsKey(rVar.d())) {
                    this.f58456c.put(rVar.d(), new v<>(Collections.emptySet()));
                } else if (this.f58455b.containsKey(rVar.d())) {
                    continue;
                } else {
                    if (rVar.g()) {
                        throw new MissingDependencyException(String.format(ProtectedSandApp.s("ﭾ"), cVar, rVar.d()));
                    }
                    if (!rVar.h()) {
                        this.f58455b.put(rVar.d(), z.e());
                    }
                }
            }
        }
    }

    private List<Runnable> C(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.v()) {
                final y9.b<?> bVar = this.f58454a.get(cVar);
                for (b0<? super Object> b0Var : cVar.m()) {
                    if (this.f58455b.containsKey(b0Var)) {
                        final z zVar = (z) this.f58455b.get(b0Var);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                z.this.j(bVar);
                            }
                        });
                    } else {
                        this.f58455b.put(b0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> D() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<c<?>, y9.b<?>> entry : this.f58454a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.v()) {
                y9.b<?> value = entry.getValue();
                for (b0<? super Object> b0Var : key.m()) {
                    if (!hashMap.containsKey(b0Var)) {
                        hashMap.put(b0Var, new HashSet());
                    }
                    ((Set) hashMap.get(b0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f58456c.containsKey(entry2.getKey())) {
                final v<?> vVar = this.f58456c.get(entry2.getKey());
                for (final y9.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.this.a(bVar);
                        }
                    });
                }
            } else {
                this.f58456c.put((b0) entry2.getKey(), v.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    private static Iterable<y9.b<ComponentRegistrar>> E(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new y9.b() { // from class: com.google.firebase.components.j
                @Override // y9.b
                public final Object get() {
                    return o.n(ComponentRegistrar.this);
                }
            });
        }
        return arrayList;
    }

    public static /* synthetic */ ComponentRegistrar n(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    public static b p(Executor executor) {
        return new b(executor);
    }

    private void q(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<y9.b<ComponentRegistrar>> it = this.f58457d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f58461h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it.remove();
                }
            }
            Iterator<c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().m().toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj = array[i4];
                        if (obj.toString().contains(ProtectedSandApp.s("ﭿ"))) {
                            if (this.f58458e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f58458e.add(obj.toString());
                        }
                        i4++;
                    }
                }
            }
            if (this.f58454a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f58454a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f58454a.put(cVar, new u(new y9.b() { // from class: com.google.firebase.components.l
                    @Override // y9.b
                    public final Object get() {
                        Object w4;
                        w4 = o.this.w(cVar);
                        return w4;
                    }
                }));
            }
            arrayList.addAll(C(list));
            arrayList.addAll(D());
            B();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        A();
    }

    private void r(Map<c<?>, y9.b<?>> map, boolean z4) {
        for (Map.Entry<c<?>, y9.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            y9.b<?> value = entry.getValue();
            if (key.s() || (key.t() && z4)) {
                value.get();
            }
        }
        this.f58459f.f();
    }

    private static <T> List<T> v(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object w(c cVar) {
        return cVar.k().a(new d0(cVar, this));
    }

    private static /* synthetic */ ComponentRegistrar z(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    @Override // com.google.firebase.components.d
    public synchronized <T> y9.b<T> b(b0<T> b0Var) {
        a0.c(b0Var, ProtectedSandApp.s("ﮀ"));
        return (y9.b) this.f58455b.get(b0Var);
    }

    @Override // r9.a
    public void c() {
        synchronized (this) {
            try {
                if (this.f58457d.isEmpty()) {
                    return;
                }
                q(new ArrayList());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.components.d
    public synchronized <T> y9.b<Set<T>> f(b0<T> b0Var) {
        v<?> vVar = this.f58456c.get(b0Var);
        if (vVar != null) {
            return vVar;
        }
        return (y9.b<Set<T>>) f58453i;
    }

    @Override // com.google.firebase.components.d
    public <T> y9.a<T> j(b0<T> b0Var) {
        y9.b<T> b5 = b(b0Var);
        return b5 == null ? z.e() : b5 instanceof z ? (z) b5 : z.i(b5);
    }

    @m1
    Collection<c<?>> s() {
        return this.f58454a.keySet();
    }

    @c1({c1.a.TESTS})
    @m1
    public void t() {
        Iterator<y9.b<?>> it = this.f58454a.values().iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    public void u(boolean z4) {
        HashMap hashMap;
        if (k1.a(this.f58460g, null, Boolean.valueOf(z4))) {
            synchronized (this) {
                hashMap = new HashMap(this.f58454a);
            }
            r(hashMap, z4);
        }
    }

    @Deprecated
    public o(Executor executor, Iterable<ComponentRegistrar> iterable, c<?>... cVarArr) {
        this(executor, E(iterable), Arrays.asList(cVarArr), i.f58445a);
    }

    private o(Executor executor, Iterable<y9.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, i iVar) {
        this.f58454a = new HashMap();
        this.f58455b = new HashMap();
        this.f58456c = new HashMap();
        this.f58458e = new HashSet();
        this.f58460g = new AtomicReference<>();
        t tVar = new t(executor);
        this.f58459f = tVar;
        this.f58461h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.D(tVar, t.class, v9.d.class, v9.c.class));
        arrayList.add(c.D(this, r9.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f58457d = v(iterable);
        q(arrayList);
    }
}
