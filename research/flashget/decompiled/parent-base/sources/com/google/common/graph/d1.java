package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.e7;
import com.google.common.collect.q3;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: Traverser.java */
@d9.a
@f9.f("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
@t
/* loaded from: classes6.dex */
public abstract class d1<N> {

    /* renamed from: a, reason: collision with root package name */
    private final c1<N> f56780a;

    /* compiled from: Traverser.java */
    class a extends d1<N> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f56781b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c1 c1Var, c1 c1Var2) {
            super(c1Var, null);
            this.f56781b = c1Var2;
        }

        @Override // com.google.common.graph.d1
        g<N> i() {
            return g.b(this.f56781b);
        }
    }

    /* compiled from: Traverser.java */
    class b extends d1<N> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f56782b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c1 c1Var, c1 c1Var2) {
            super(c1Var, null);
            this.f56782b = c1Var2;
        }

        @Override // com.google.common.graph.d1
        g<N> i() {
            return new g.b(this.f56782b);
        }
    }

    /* compiled from: Traverser.java */
    class c implements Iterable<N> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f56783b;

        c(q3 q3Var) {
            this.f56783b = q3Var;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return d1.this.i().a(this.f56783b.iterator());
        }
    }

    /* compiled from: Traverser.java */
    class d implements Iterable<N> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f56785b;

        d(q3 q3Var) {
            this.f56785b = q3Var;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return d1.this.i().e(this.f56785b.iterator());
        }
    }

    /* compiled from: Traverser.java */
    class e implements Iterable<N> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f56787b;

        e(q3 q3Var) {
            this.f56787b = q3Var;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return d1.this.i().d(this.f56787b.iterator());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Traverser.java */
    private static abstract class f {
        public static final f FRONT = new a(ProtectedSandApp.s("\uf5cc"), 0);
        public static final f BACK = new b(ProtectedSandApp.s("\uf5cd"), 1);
        private static final /* synthetic */ f[] $VALUES = $values();

        /* compiled from: Traverser.java */
        enum a extends f {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.graph.d1.f
            <T> void insertInto(Deque<T> deque, T t4) {
                deque.addFirst(t4);
            }
        }

        /* compiled from: Traverser.java */
        enum b extends f {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.graph.d1.f
            <T> void insertInto(Deque<T> deque, T t4) {
                deque.addLast(t4);
            }
        }

        private static /* synthetic */ f[] $values() {
            return new f[]{FRONT, BACK};
        }

        private f(String str, int i4) {
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }

        abstract <T> void insertInto(Deque<T> deque, T t4);

        /* synthetic */ f(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    /* compiled from: Traverser.java */
    private static abstract class g<N> {

        /* renamed from: a, reason: collision with root package name */
        final c1<N> f56789a;

        /* compiled from: Traverser.java */
        class a extends g<N> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Set f56790b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c1 c1Var, Set set) {
                super(c1Var);
                this.f56790b = set;
            }

            @Override // com.google.common.graph.d1.g
            @zc.a
            N g(Deque<Iterator<? extends N>> deque) {
                Iterator<? extends N> first = deque.getFirst();
                while (first.hasNext()) {
                    N next = first.next();
                    Objects.requireNonNull(next);
                    if (this.f56790b.add(next)) {
                        return next;
                    }
                }
                deque.removeFirst();
                return null;
            }
        }

        /* compiled from: Traverser.java */
        class b extends g<N> {
            b(c1 c1Var) {
                super(c1Var);
            }

            @Override // com.google.common.graph.d1.g
            @zc.a
            N g(Deque<Iterator<? extends N>> deque) {
                Iterator<? extends N> first = deque.getFirst();
                if (!first.hasNext()) {
                    deque.removeFirst();
                    return null;
                }
                N next = first.next();
                next.getClass();
                return next;
            }
        }

        /* compiled from: Traverser.java */
        class c extends com.google.common.collect.c<N> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Deque f56791d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f56792e;

            c(Deque deque, f fVar) {
                this.f56791d = deque;
                this.f56792e = fVar;
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected N a() {
                do {
                    N n4 = (N) g.this.g(this.f56791d);
                    if (n4 != null) {
                        Iterator<? extends N> it = g.this.f56789a.b(n4).iterator();
                        if (it.hasNext()) {
                            this.f56792e.insertInto(this.f56791d, it);
                        }
                        return n4;
                    }
                } while (!this.f56791d.isEmpty());
                return b();
            }
        }

        /* compiled from: Traverser.java */
        class d extends com.google.common.collect.c<N> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Deque f56794d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Deque f56795e;

            d(Deque deque, Deque deque2) {
                this.f56794d = deque;
                this.f56795e = deque2;
            }

            @Override // com.google.common.collect.c
            @zc.a
            protected N a() {
                while (true) {
                    N n4 = (N) g.this.g(this.f56794d);
                    if (n4 == null) {
                        return !this.f56795e.isEmpty() ? (N) this.f56795e.pop() : b();
                    }
                    Iterator<? extends N> it = g.this.f56789a.b(n4).iterator();
                    if (!it.hasNext()) {
                        return n4;
                    }
                    this.f56794d.addFirst(it);
                    this.f56795e.push(n4);
                }
            }
        }

        g(c1<N> c1Var) {
            this.f56789a = c1Var;
        }

        static <N> g<N> b(c1<N> c1Var) {
            return new a(c1Var, new HashSet());
        }

        static <N> g<N> c(c1<N> c1Var) {
            return new b(c1Var);
        }

        private Iterator<N> f(Iterator<? extends N> it, f fVar) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new c(arrayDeque, fVar);
        }

        final Iterator<N> a(Iterator<? extends N> it) {
            return f(it, f.BACK);
        }

        final Iterator<N> d(Iterator<? extends N> it) {
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new d(arrayDeque2, arrayDeque);
        }

        final Iterator<N> e(Iterator<? extends N> it) {
            return f(it, f.FRONT);
        }

        @zc.a
        abstract N g(Deque<Iterator<? extends N>> deque);
    }

    /* synthetic */ d1(c1 c1Var, a aVar) {
        this(c1Var);
    }

    public static <N> d1<N> g(c1<N> c1Var) {
        return new a(c1Var, c1Var);
    }

    public static <N> d1<N> h(c1<N> c1Var) {
        if (c1Var instanceof k) {
            com.google.common.base.l0.e(((k) c1Var).e(), ProtectedSandApp.s("\uf5ca"));
        }
        if (c1Var instanceof s0) {
            com.google.common.base.l0.e(((s0) c1Var).e(), ProtectedSandApp.s("\uf5cb"));
        }
        return new b(c1Var, c1Var);
    }

    private q3<N> j(Iterable<? extends N> iterable) {
        q3<N> x4 = q3.x(iterable);
        e7<N> it = x4.iterator();
        while (it.hasNext()) {
            this.f56780a.b(it.next());
        }
        return x4;
    }

    public final Iterable<N> a(Iterable<? extends N> iterable) {
        return new c(j(iterable));
    }

    public final Iterable<N> b(N n4) {
        return a(q3.K(n4));
    }

    public final Iterable<N> c(Iterable<? extends N> iterable) {
        return new e(j(iterable));
    }

    public final Iterable<N> d(N n4) {
        return c(q3.K(n4));
    }

    public final Iterable<N> e(Iterable<? extends N> iterable) {
        return new d(j(iterable));
    }

    public final Iterable<N> f(N n4) {
        return e(q3.K(n4));
    }

    abstract g<N> i();

    private d1(c1<N> c1Var) {
        c1Var.getClass();
        this.f56780a = c1Var;
    }
}
