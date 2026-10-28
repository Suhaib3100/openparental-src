package com.google.firebase.components;

import androidx.annotation.c1;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes3.dex */
public class o implements d, h2.a {

    /* renamed from: i, reason: collision with root package name */
    private static final o2.b<Set<Object>> f15376i = new o2.b() { // from class: com.google.firebase.components.n
        @Override // o2.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map<c<?>, o2.b<?>> f15377a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<b0<?>, o2.b<?>> f15378b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<b0<?>, v<?>> f15379c;

    /* renamed from: d, reason: collision with root package name */
    private final List<o2.b<ComponentRegistrar>> f15380d;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f15381e;

    /* renamed from: f, reason: collision with root package name */
    private final t f15382f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f15383g;

    /* renamed from: h, reason: collision with root package name */
    private final i f15384h;

    /* compiled from: ComponentRuntime.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f15385a;

        /* renamed from: b, reason: collision with root package name */
        private final List<o2.b<ComponentRegistrar>> f15386b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<c<?>> f15387c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private i f15388d = i.f15368a;

        b(Executor executor) {
            this.f15385a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        private static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @x1.a
        public b b(c<?> cVar) {
            this.f15387c.add(cVar);
            return this;
        }

        @x1.a
        public b c(final ComponentRegistrar componentRegistrar) {
            this.f15386b.add(new o2.b() { // from class: com.google.firebase.components.p
                @Override // o2.b
                public final Object get() {
                    return ComponentRegistrar.this;
                }
            });
            return this;
        }

        @x1.a
        public b d(Collection<o2.b<ComponentRegistrar>> collection) {
            this.f15386b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f15385a, this.f15386b, this.f15387c, this.f15388d);
        }

        @x1.a
        public b g(i iVar) {
            this.f15388d = iVar;
            return this;
        }
    }

    private void A() {
        Boolean bool = this.f15383g.get();
        if (bool != null) {
            r(this.f15377a, bool.booleanValue());
        }
    }

    private void B() {
        for (c<?> cVar : this.f15377a.keySet()) {
            for (r rVar : cVar.j()) {
                if (rVar.h() && !this.f15379c.containsKey(rVar.d())) {
                    this.f15379c.put(rVar.d(), v.b(Collections.emptySet()));
                } else if (this.f15378b.containsKey(rVar.d())) {
                    continue;
                } else {
                    if (rVar.g()) {
                        throw new MissingDependencyException(String.format(ProtectedSandApp.s("⟔"), cVar, rVar.d()));
                    }
                    if (!rVar.h()) {
                        this.f15378b.put(rVar.d(), z.e());
                    }
                }
            }
        }
    }

    private List<Runnable> C(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.v()) {
                final o2.b<?> bVar = this.f15377a.get(cVar);
                for (b0<? super Object> b0Var : cVar.m()) {
                    if (this.f15378b.containsKey(b0Var)) {
                        final z zVar = (z) this.f15378b.get(b0Var);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                z.this.j(bVar);
                            }
                        });
                    } else {
                        this.f15378b.put(b0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> D() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<c<?>, o2.b<?>> entry : this.f15377a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.v()) {
                o2.b<?> value = entry.getValue();
                for (b0<? super Object> b0Var : key.m()) {
                    if (!hashMap.containsKey(b0Var)) {
                        hashMap.put(b0Var, new HashSet());
                    }
                    ((Set) hashMap.get(b0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f15379c.containsKey(entry2.getKey())) {
                final v<?> vVar = this.f15379c.get(entry2.getKey());
                for (final o2.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.this.a(bVar);
                        }
                    });
                }
            } else {
                this.f15379c.put((b0) entry2.getKey(), v.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    private static Iterable<o2.b<ComponentRegistrar>> E(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new o2.b() { // from class: com.google.firebase.components.m
                @Override // o2.b
                public final Object get() {
                    return o.m(ComponentRegistrar.this);
                }
            });
        }
        return arrayList;
    }

    public static /* synthetic */ ComponentRegistrar m(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    public static b p(Executor executor) {
        return new b(executor);
    }

    private void q(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<o2.b<ComponentRegistrar>> it = this.f15380d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f15384h.a(componentRegistrar));
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
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        Object obj = array[i5];
                        if (obj.toString().contains(ProtectedSandApp.s("⟕"))) {
                            if (this.f15381e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f15381e.add(obj.toString());
                        }
                        i5++;
                    }
                }
            }
            if (this.f15377a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f15377a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f15377a.put(cVar, new u(new o2.b() { // from class: com.google.firebase.components.k
                    @Override // o2.b
                    public final Object get() {
                        Object w5;
                        w5 = o.this.w(cVar);
                        return w5;
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

    private void r(Map<c<?>, o2.b<?>> map, boolean z5) {
        for (Map.Entry<c<?>, o2.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            o2.b<?> value = entry.getValue();
            if (key.s() || (key.t() && z5)) {
                value.get();
            }
        }
        this.f15382f.f();
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
    public synchronized <T> o2.b<T> b(b0<T> b0Var) {
        a0.c(b0Var, ProtectedSandApp.s("⟖"));
        return (o2.b) this.f15378b.get(b0Var);
    }

    @Override // h2.a
    public void d() {
        synchronized (this) {
            if (this.f15380d.isEmpty()) {
                return;
            }
            q(new ArrayList());
        }
    }

    @Override // com.google.firebase.components.d
    public synchronized <T> o2.b<Set<T>> g(b0<T> b0Var) {
        v<?> vVar = this.f15379c.get(b0Var);
        if (vVar != null) {
            return vVar;
        }
        return (o2.b<Set<T>>) f15376i;
    }

    @Override // com.google.firebase.components.d
    public <T> o2.a<T> j(b0<T> b0Var) {
        o2.b<T> b6 = b(b0Var);
        return b6 == null ? z.e() : b6 instanceof z ? (z) b6 : z.i(b6);
    }

    @m1
    Collection<c<?>> s() {
        return this.f15377a.keySet();
    }

    @c1({c1.a.TESTS})
    @m1
    public void t() {
        Iterator<o2.b<?>> it = this.f15377a.values().iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    public void u(boolean z5) {
        HashMap hashMap;
        if (android.view.x.a(this.f15383g, null, Boolean.valueOf(z5))) {
            synchronized (this) {
                hashMap = new HashMap(this.f15377a);
            }
            r(hashMap, z5);
        }
    }

    @Deprecated
    public o(Executor executor, Iterable<ComponentRegistrar> iterable, c<?>... cVarArr) {
        this(executor, E(iterable), Arrays.asList(cVarArr), i.f15368a);
    }

    private o(Executor executor, Iterable<o2.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, i iVar) {
        this.f15377a = new HashMap();
        this.f15378b = new HashMap();
        this.f15379c = new HashMap();
        this.f15381e = new HashSet();
        this.f15383g = new AtomicReference<>();
        t tVar = new t(executor);
        this.f15382f = tVar;
        this.f15384h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.D(tVar, t.class, l2.d.class, l2.c.class));
        arrayList.add(c.D(this, h2.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f15380d = v(iterable);
        q(arrayList);
    }
}
