package com.google.common.collect;

import com.google.common.collect.d4;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: TreeTraverser.java */
@w0
@d9.b
@Deprecated
@d9.a
/* loaded from: classes6.dex */
public abstract class d7<T> {

    /* compiled from: TreeTraverser.java */
    class a extends d7<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.x f55614a;

        a(com.google.common.base.x xVar) {
            this.f55614a = xVar;
        }

        @Override // com.google.common.collect.d7
        public Iterable<T> b(T t4) {
            return (Iterable) this.f55614a.apply(t4);
        }
    }

    /* compiled from: TreeTraverser.java */
    class b extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f55615c;

        b(Object obj) {
            this.f55615c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public e7<T> iterator() {
            return d7.this.e(this.f55615c);
        }
    }

    /* compiled from: TreeTraverser.java */
    class c extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f55617c;

        c(Object obj) {
            this.f55617c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public e7<T> iterator() {
            return d7.this.c(this.f55617c);
        }
    }

    /* compiled from: TreeTraverser.java */
    class d extends o1<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f55619c;

        d(Object obj) {
            this.f55619c = obj;
        }

        @Override // java.lang.Iterable
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public e7<T> iterator() {
            return new e(this.f55619c);
        }
    }

    /* compiled from: TreeTraverser.java */
    private final class e extends e7<T> implements g5<T> {

        /* renamed from: b, reason: collision with root package name */
        private final Queue<T> f55621b;

        e(T t4) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f55621b = arrayDeque;
            arrayDeque.add(t4);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f55621b.isEmpty();
        }

        @Override // java.util.Iterator, com.google.common.collect.g5
        public T next() {
            T remove = this.f55621b.remove();
            c4.a(this.f55621b, d7.this.b(remove));
            return remove;
        }

        @Override // com.google.common.collect.g5
        public T peek() {
            return this.f55621b.element();
        }
    }

    /* compiled from: TreeTraverser.java */
    private final class f extends com.google.common.collect.c<T> {

        /* renamed from: d, reason: collision with root package name */
        private final ArrayDeque<g<T>> f55623d;

        f(T t4) {
            ArrayDeque<g<T>> arrayDeque = new ArrayDeque<>();
            this.f55623d = arrayDeque;
            arrayDeque.addLast(d(t4));
        }

        private g<T> d(T t4) {
            return new g<>(t4, d7.this.b(t4).iterator());
        }

        @Override // com.google.common.collect.c
        @zc.a
        protected T a() {
            while (!this.f55623d.isEmpty()) {
                g<T> last = this.f55623d.getLast();
                if (!last.f55626b.hasNext()) {
                    this.f55623d.removeLast();
                    return last.f55625a;
                }
                this.f55623d.addLast(d(last.f55626b.next()));
            }
            return b();
        }
    }

    /* compiled from: TreeTraverser.java */
    private static final class g<T> {

        /* renamed from: a, reason: collision with root package name */
        final T f55625a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<T> f55626b;

        g(T t4, Iterator<T> it) {
            t4.getClass();
            this.f55625a = t4;
            it.getClass();
            this.f55626b = it;
        }
    }

    /* compiled from: TreeTraverser.java */
    private final class h extends e7<T> {

        /* renamed from: b, reason: collision with root package name */
        private final Deque<Iterator<T>> f55627b;

        h(T t4) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f55627b = arrayDeque;
            t4.getClass();
            arrayDeque.addLast(new d4.k(t4));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f55627b.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.f55627b.getLast();
            T next = last.next();
            next.getClass();
            if (!last.hasNext()) {
                this.f55627b.removeLast();
            }
            Iterator<T> it = d7.this.b(next).iterator();
            if (it.hasNext()) {
                this.f55627b.addLast(it);
            }
            return next;
        }
    }

    @Deprecated
    public static <T> d7<T> g(com.google.common.base.x<T, ? extends Iterable<T>> xVar) {
        xVar.getClass();
        return new a(xVar);
    }

    @Deprecated
    public final o1<T> a(T t4) {
        t4.getClass();
        return new d(t4);
    }

    public abstract Iterable<T> b(T t4);

    e7<T> c(T t4) {
        return new f(t4);
    }

    @Deprecated
    public final o1<T> d(T t4) {
        t4.getClass();
        return new c(t4);
    }

    e7<T> e(T t4) {
        return new h(t4);
    }

    @Deprecated
    public final o1<T> f(T t4) {
        t4.getClass();
        return new b(t4);
    }
}
