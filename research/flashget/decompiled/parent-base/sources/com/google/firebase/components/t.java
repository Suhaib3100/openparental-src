package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes6.dex */
class t implements v9.d, v9.c {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Map<Class<?>, ConcurrentHashMap<v9.b<Object>, Executor>> f58477a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private Queue<v9.a<?>> f58478b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f58479c;

    t(Executor executor) {
        this.f58479c = executor;
    }

    private synchronized Set<Map.Entry<v9.b<Object>, Executor>> g(v9.a<?> aVar) {
        ConcurrentHashMap<v9.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f58477a.get(aVar.b());
        } catch (Throwable th) {
            throw th;
        }
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map.Entry entry, v9.a aVar) {
        ((v9.b) entry.getKey()).a(aVar);
    }

    @Override // v9.d
    public <T> void a(Class<T> cls, v9.b<? super T> bVar) {
        d(cls, this.f58479c, bVar);
    }

    @Override // v9.c
    public void b(final v9.a<?> aVar) {
        aVar.getClass();
        synchronized (this) {
            try {
                Queue<v9.a<?>> queue = this.f58478b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<v9.b<Object>, Executor> entry : g(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            t.h(entry, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v9.d
    public synchronized <T> void c(Class<T> cls, v9.b<? super T> bVar) {
        cls.getClass();
        bVar.getClass();
        if (this.f58477a.containsKey(cls)) {
            ConcurrentHashMap<v9.b<Object>, Executor> concurrentHashMap = this.f58477a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f58477a.remove(cls);
            }
        }
    }

    @Override // v9.d
    public synchronized <T> void d(Class<T> cls, Executor executor, v9.b<? super T> bVar) {
        try {
            cls.getClass();
            bVar.getClass();
            executor.getClass();
            if (!this.f58477a.containsKey(cls)) {
                this.f58477a.put(cls, new ConcurrentHashMap<>());
            }
            this.f58477a.get(cls).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    void f() {
        Queue<v9.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f58478b;
                if (queue != null) {
                    this.f58478b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator<v9.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
    }
}
