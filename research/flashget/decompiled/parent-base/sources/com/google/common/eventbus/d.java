package com.google.common.eventbus;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Dispatcher.java */
@e
/* loaded from: classes6.dex */
abstract class d {

    /* compiled from: Dispatcher.java */
    private static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private static final b f56713a = new b();

        private b() {
        }

        @Override // com.google.common.eventbus.d
        void a(Object obj, Iterator<j> it) {
            obj.getClass();
            while (it.hasNext()) {
                it.next().d(obj);
            }
        }
    }

    /* compiled from: Dispatcher.java */
    private static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        private final ConcurrentLinkedQueue<a> f56714a;

        /* compiled from: Dispatcher.java */
        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f56715a;

            /* renamed from: b, reason: collision with root package name */
            private final j f56716b;

            private a(Object obj, j jVar) {
                this.f56715a = obj;
                this.f56716b = jVar;
            }
        }

        private c() {
            this.f56714a = new ConcurrentLinkedQueue<>();
        }

        @Override // com.google.common.eventbus.d
        void a(Object obj, Iterator<j> it) {
            obj.getClass();
            while (it.hasNext()) {
                this.f56714a.add(new a(obj, it.next()));
            }
            while (true) {
                a poll = this.f56714a.poll();
                if (poll == null) {
                    return;
                } else {
                    poll.f56716b.d(poll.f56715a);
                }
            }
        }
    }

    /* compiled from: Dispatcher.java */
    /* renamed from: com.google.common.eventbus.d$d, reason: collision with other inner class name */
    private static final class C0865d extends d {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadLocal<Queue<c>> f56717a;

        /* renamed from: b, reason: collision with root package name */
        private final ThreadLocal<Boolean> f56718b;

        /* compiled from: Dispatcher.java */
        /* renamed from: com.google.common.eventbus.d$d$a */
        class a extends ThreadLocal<Queue<c>> {
            a(C0865d c0865d) {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Queue<c> initialValue() {
                return new ArrayDeque();
            }
        }

        /* compiled from: Dispatcher.java */
        /* renamed from: com.google.common.eventbus.d$d$b */
        class b extends ThreadLocal<Boolean> {
            b(C0865d c0865d) {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* compiled from: Dispatcher.java */
        /* renamed from: com.google.common.eventbus.d$d$c */
        private static final class c {

            /* renamed from: a, reason: collision with root package name */
            private final Object f56719a;

            /* renamed from: b, reason: collision with root package name */
            private final Iterator<j> f56720b;

            private c(Object obj, Iterator<j> it) {
                this.f56719a = obj;
                this.f56720b = it;
            }
        }

        private C0865d() {
            this.f56717a = new a();
            this.f56718b = new b();
        }

        @Override // com.google.common.eventbus.d
        void a(Object obj, Iterator<j> it) {
            obj.getClass();
            it.getClass();
            Queue<c> queue = this.f56717a.get();
            queue.offer(new c(obj, it));
            if (this.f56718b.get().booleanValue()) {
                return;
            }
            this.f56718b.set(Boolean.TRUE);
            while (true) {
                try {
                    c poll = queue.poll();
                    if (poll == null) {
                        return;
                    }
                    while (poll.f56720b.hasNext()) {
                        ((j) poll.f56720b.next()).d(poll.f56719a);
                    }
                } finally {
                    this.f56718b.remove();
                    this.f56717a.remove();
                }
            }
        }
    }

    d() {
    }

    static d b() {
        return b.f56713a;
    }

    static d c() {
        return new c();
    }

    static d d() {
        return new C0865d();
    }

    abstract void a(Object obj, Iterator<j> it);
}
