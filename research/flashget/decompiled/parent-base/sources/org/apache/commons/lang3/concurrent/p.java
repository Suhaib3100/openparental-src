package org.apache.commons.lang3.concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.k1;

/* compiled from: MultiBackgroundInitializer.java */
/* loaded from: classes6.dex */
public class p extends d<b> {

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, d<?>> f85923d;

    /* compiled from: MultiBackgroundInitializer.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, d<?>> f85924a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, Object> f85925b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, ConcurrentException> f85926c;

        private d<?> a(String str) {
            d<?> dVar = this.f85924a.get(str);
            if (dVar != null) {
                return dVar;
            }
            throw new NoSuchElementException(androidx.constraintlayout.core.motion.key.c.a("No child initializer with name ", str));
        }

        public ConcurrentException b(String str) {
            a(str);
            return this.f85926c.get(str);
        }

        public d<?> c(String str) {
            return a(str);
        }

        public Object d(String str) {
            a(str);
            return this.f85925b.get(str);
        }

        public Set<String> e() {
            return Collections.unmodifiableSet(this.f85924a.keySet());
        }

        public boolean f(String str) {
            a(str);
            return this.f85926c.containsKey(str);
        }

        public boolean g() {
            return this.f85926c.isEmpty();
        }

        private b(Map<String, d<?>> map, Map<String, Object> map2, Map<String, ConcurrentException> map3) {
            this.f85924a = map;
            this.f85925b = map2;
            this.f85926c = map3;
        }
    }

    public p() {
        this.f85923d = new HashMap();
    }

    @Override // org.apache.commons.lang3.concurrent.d
    protected int f() {
        Iterator<d<?>> it = this.f85923d.values().iterator();
        int i4 = 1;
        while (it.hasNext()) {
            i4 += it.next().f();
        }
        return i4;
    }

    public void k(String str, d<?> dVar) {
        k1.b0(str, "Name of child initializer must not be null!", new Object[0]);
        k1.b0(dVar, "Child initializer must not be null!", new Object[0]);
        synchronized (this) {
            try {
                if (h()) {
                    throw new IllegalStateException("addInitializer() must not be called after start()!");
                }
                this.f85923d.put(str, dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.lang3.concurrent.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b g() throws Exception {
        HashMap hashMap;
        synchronized (this) {
            hashMap = new HashMap(this.f85923d);
        }
        ExecutorService c5 = c();
        for (d dVar : hashMap.values()) {
            if (dVar.d() == null) {
                dVar.i(c5);
            }
            dVar.j();
        }
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                hashMap2.put(entry.getKey(), ((d) entry.getValue()).get());
            } catch (ConcurrentException e4) {
                hashMap3.put(entry.getKey(), e4);
            }
        }
        return new b(hashMap, hashMap2, hashMap3);
    }

    public p(ExecutorService executorService) {
        super(executorService);
        this.f85923d = new HashMap();
    }
}
