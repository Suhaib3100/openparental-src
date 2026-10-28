package com.google.firebase.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes2.dex */
class q {

    /* compiled from: CycleDetector.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.firebase.components.c<?> f15390a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b> f15391b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<b> f15392c = new HashSet();

        b(com.google.firebase.components.c<?> cVar) {
            this.f15390a = cVar;
        }

        void a(b bVar) {
            this.f15391b.add(bVar);
        }

        void b(b bVar) {
            this.f15392c.add(bVar);
        }

        com.google.firebase.components.c<?> c() {
            return this.f15390a;
        }

        Set<b> d() {
            return this.f15391b;
        }

        boolean e() {
            return this.f15391b.isEmpty();
        }

        boolean f() {
            return this.f15392c.isEmpty();
        }

        void g(b bVar) {
            this.f15392c.remove(bVar);
        }
    }

    /* compiled from: CycleDetector.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final b0<?> f15393a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f15394b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f15393a.equals(this.f15393a) && cVar.f15394b == this.f15394b;
        }

        public int hashCode() {
            return ((this.f15393a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f15394b).hashCode();
        }

        private c(b0<?> b0Var, boolean z5) {
            this.f15393a = b0Var;
            this.f15394b = z5;
        }
    }

    q() {
    }

    static void a(List<com.google.firebase.components.c<?>> list) {
        Set<b> c6 = c(list);
        Set<b> b6 = b(c6);
        int i5 = 0;
        while (!b6.isEmpty()) {
            b next = b6.iterator().next();
            b6.remove(next);
            i5++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b6.add(bVar);
                }
            }
        }
        if (i5 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c6) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<com.google.firebase.components.c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<com.google.firebase.components.c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().j()) {
                            if (rVar.f() && (set = (Set) hashMap.get(new c(rVar.d(), rVar.h()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            com.google.firebase.components.c<?> next = it.next();
            b bVar3 = new b(next);
            for (b0<? super Object> b0Var : next.m()) {
                c cVar = new c(b0Var, !next.v());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f15394b) {
                    throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\u139e"), b0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}
