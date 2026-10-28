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
/* loaded from: classes3.dex */
class t implements l2.d, l2.c {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Map<Class<?>, ConcurrentHashMap<l2.b<Object>, Executor>> f15400a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private Queue<l2.a<?>> f15401b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f15402c;

    t(Executor executor) {
        this.f15402c = executor;
    }

    private synchronized Set<Map.Entry<l2.b<Object>, Executor>> g(l2.a<?> aVar) {
        ConcurrentHashMap<l2.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f15400a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map.Entry entry, l2.a aVar) {
        ((l2.b) entry.getKey()).a(aVar);
    }

    @Override // l2.d
    public <T> void a(Class<T> cls, l2.b<? super T> bVar) {
        b(cls, this.f15402c, bVar);
    }

    @Override // l2.d
    public synchronized <T> void b(Class<T> cls, Executor executor, l2.b<? super T> bVar) {
        cls.getClass();
        bVar.getClass();
        executor.getClass();
        if (!this.f15400a.containsKey(cls)) {
            this.f15400a.put(cls, new ConcurrentHashMap<>());
        }
        this.f15400a.get(cls).put(bVar, executor);
    }

    @Override // l2.c
    public void c(final l2.a<?> aVar) {
        aVar.getClass();
        synchronized (this) {
            Queue<l2.a<?>> queue = this.f15401b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<l2.b<Object>, Executor> entry : g(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.h(entry, aVar);
                    }
                });
            }
        }
    }

    @Override // l2.d
    public synchronized <T> void d(Class<T> cls, l2.b<? super T> bVar) {
        cls.getClass();
        bVar.getClass();
        if (this.f15400a.containsKey(cls)) {
            ConcurrentHashMap<l2.b<Object>, Executor> concurrentHashMap = this.f15400a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f15400a.remove(cls);
            }
        }
    }

    void f() {
        Queue<l2.a<?>> queue;
        synchronized (this) {
            queue = this.f15401b;
            if (queue != null) {
                this.f15401b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<l2.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }
    }
}
