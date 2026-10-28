package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: Converter.java */
@o
@d9.b
/* loaded from: classes6.dex */
public abstract class m<A, B> implements x<A, B> {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f54955b;

    /* renamed from: c, reason: collision with root package name */
    @g9.b
    @zc.a
    @ma.h
    private transient m<B, A> f54956c;

    /* compiled from: Converter.java */
    class a implements Iterable<B> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f54957b;

        /* compiled from: Converter.java */
        /* renamed from: com.google.common.base.m$a$a, reason: collision with other inner class name */
        class C0830a implements Iterator<B> {

            /* renamed from: b, reason: collision with root package name */
            private final Iterator<? extends A> f54959b;

            C0830a() {
                this.f54959b = a.this.f54957b.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f54959b.hasNext();
            }

            @Override // java.util.Iterator
            @zc.a
            public B next() {
                return (B) m.this.e(this.f54959b.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f54959b.remove();
            }
        }

        a(Iterable iterable) {
            this.f54957b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C0830a();
        }
    }

    /* compiled from: Converter.java */
    private static final class b<A, B, C> extends m<A, C> implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        private static final long f54961f = 0;

        /* renamed from: d, reason: collision with root package name */
        final m<A, B> f54962d;

        /* renamed from: e, reason: collision with root package name */
        final m<B, C> f54963e;

        b(m<A, B> mVar, m<B, C> mVar2) {
            this.f54962d = mVar;
            this.f54963e = mVar2;
        }

        @Override // com.google.common.base.m
        @zc.a
        A d(@zc.a C c5) {
            return (A) this.f54962d.d(this.f54963e.d(c5));
        }

        @Override // com.google.common.base.m
        @zc.a
        C e(@zc.a A a5) {
            return (C) this.f54963e.e(this.f54962d.e(a5));
        }

        @Override // com.google.common.base.m, com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f54962d.equals(bVar.f54962d) && this.f54963e.equals(bVar.f54963e);
        }

        @Override // com.google.common.base.m
        protected A h(C c5) {
            throw new AssertionError();
        }

        public int hashCode() {
            return this.f54963e.hashCode() + (this.f54962d.hashCode() * 31);
        }

        @Override // com.google.common.base.m
        protected C i(A a5) {
            throw new AssertionError();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f54962d);
            String valueOf2 = String.valueOf(this.f54963e);
            return com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 10, valueOf, ProtectedSandApp.s("\uf30b"), valueOf2, ProtectedSandApp.s("\uf30c"));
        }
    }

    /* compiled from: Converter.java */
    private static final class c<A, B> extends m<A, B> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private final x<? super A, ? extends B> f54964d;

        /* renamed from: e, reason: collision with root package name */
        private final x<? super B, ? extends A> f54965e;

        /* synthetic */ c(x xVar, x xVar2, a aVar) {
            this(xVar, xVar2);
        }

        @Override // com.google.common.base.m, com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f54964d.equals(cVar.f54964d) && this.f54965e.equals(cVar.f54965e);
        }

        @Override // com.google.common.base.m
        protected A h(B b5) {
            return this.f54965e.apply(b5);
        }

        public int hashCode() {
            return this.f54965e.hashCode() + (this.f54964d.hashCode() * 31);
        }

        @Override // com.google.common.base.m
        protected B i(A a5) {
            return this.f54964d.apply(a5);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f54964d);
            String valueOf2 = String.valueOf(this.f54965e);
            StringBuilder a5 = g.a(valueOf2.length() + valueOf.length() + 18, ProtectedSandApp.s("\uf30d"), valueOf, ProtectedSandApp.s("\uf30e"), valueOf2);
            a5.append(ProtectedSandApp.s("\uf30f"));
            return a5.toString();
        }

        private c(x<? super A, ? extends B> xVar, x<? super B, ? extends A> xVar2) {
            xVar.getClass();
            this.f54964d = xVar;
            xVar2.getClass();
            this.f54965e = xVar2;
        }
    }

    /* compiled from: Converter.java */
    private static final class d<T> extends m<T, T> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        static final d<?> f54966d = new d<>();

        /* renamed from: e, reason: collision with root package name */
        private static final long f54967e = 0;

        private d() {
        }

        private Object o() {
            return f54966d;
        }

        @Override // com.google.common.base.m
        <S> m<T, S> g(m<T, S> mVar) {
            return (m) l0.F(mVar, ProtectedSandApp.s("\uf310"));
        }

        @Override // com.google.common.base.m
        protected T h(T t4) {
            return t4;
        }

        @Override // com.google.common.base.m
        protected T i(T t4) {
            return t4;
        }

        @Override // com.google.common.base.m
        public m l() {
            return this;
        }

        public d<T> p() {
            return this;
        }

        public String toString() {
            return ProtectedSandApp.s("\uf311");
        }
    }

    /* compiled from: Converter.java */
    private static final class e<A, B> extends m<B, A> implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f54968e = 0;

        /* renamed from: d, reason: collision with root package name */
        final m<A, B> f54969d;

        e(m<A, B> mVar) {
            this.f54969d = mVar;
        }

        @Override // com.google.common.base.m
        @zc.a
        B d(@zc.a A a5) {
            return this.f54969d.e(a5);
        }

        @Override // com.google.common.base.m
        @zc.a
        A e(@zc.a B b5) {
            return this.f54969d.d(b5);
        }

        @Override // com.google.common.base.m, com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof e) {
                return this.f54969d.equals(((e) obj).f54969d);
            }
            return false;
        }

        @Override // com.google.common.base.m
        protected B h(A a5) {
            throw new AssertionError();
        }

        public int hashCode() {
            return ~this.f54969d.hashCode();
        }

        @Override // com.google.common.base.m
        protected A i(B b5) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.m
        public m<A, B> l() {
            return this.f54969d;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f54969d);
            return i.a(valueOf.length() + 10, valueOf, ProtectedSandApp.s("\uf312"));
        }
    }

    protected m() {
        this(true);
    }

    public static <A, B> m<A, B> j(x<? super A, ? extends B> xVar, x<? super B, ? extends A> xVar2) {
        return new c(xVar, xVar2, null);
    }

    public static <T> m<T, T> k() {
        return d.f54966d;
    }

    @zc.a
    private A m(@zc.a B b5) {
        return h(b5);
    }

    @zc.a
    private B n(@zc.a A a5) {
        return i(a5);
    }

    public final <C> m<A, C> a(m<B, C> mVar) {
        return g(mVar);
    }

    @Override // com.google.common.base.x
    @zc.a
    @f9.a
    @Deprecated
    @f9.l(replacement = "this.convert(a)")
    public final B apply(@zc.a A a5) {
        return e(a5);
    }

    @zc.a
    @f9.a
    public final B b(@zc.a A a5) {
        return e(a5);
    }

    @f9.a
    public Iterable<B> c(Iterable<? extends A> iterable) {
        l0.F(iterable, ProtectedSandApp.s("\uf2cb"));
        return new a(iterable);
    }

    @zc.a
    A d(@zc.a B b5) {
        if (!this.f54955b) {
            return h(b5);
        }
        if (b5 == null) {
            return null;
        }
        A h4 = h(b5);
        h4.getClass();
        return h4;
    }

    @zc.a
    B e(@zc.a A a5) {
        if (!this.f54955b) {
            return i(a5);
        }
        if (a5 == null) {
            return null;
        }
        B i4 = i(a5);
        i4.getClass();
        return i4;
    }

    @Override // com.google.common.base.x
    public boolean equals(@zc.a Object obj) {
        return super.equals(obj);
    }

    <C> m<A, C> g(m<B, C> mVar) {
        mVar.getClass();
        return new b(this, mVar);
    }

    @f9.g
    protected abstract A h(B b5);

    @f9.g
    protected abstract B i(A a5);

    @f9.b
    public m<B, A> l() {
        m<B, A> mVar = this.f54956c;
        if (mVar != null) {
            return mVar;
        }
        e eVar = new e(this);
        this.f54956c = eVar;
        return eVar;
    }

    m(boolean z4) {
        this.f54955b = z4;
    }
}
