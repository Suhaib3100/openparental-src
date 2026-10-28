package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.q1;
import kotlin.collections.t;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.w;
import p3.n;

/* compiled from: SmartSet.kt */
/* loaded from: classes5.dex */
public final class f<T> extends AbstractSet<T> {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    public static final b f26679q = new b(null);

    /* renamed from: o, reason: collision with root package name */
    @d5.e
    private Object f26680o;

    /* renamed from: p, reason: collision with root package name */
    private int f26681p;

    /* compiled from: SmartSet.kt */
    /* loaded from: classes6.dex */
    private static final class a<T> implements Iterator<T>, r3.d {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T> f26682o;

        public a(@d5.d T[] tArr) {
            l0.p(tArr, ProtectedSandApp.s("觧"));
            this.f26682o = i.a(tArr);
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26682o.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f26682o.next();
        }
    }

    /* compiled from: SmartSet.kt */
    public static final class b {
        private b() {
        }

        @d5.d
        @n
        public final <T> f<T> a() {
            return new f<>(null);
        }

        @d5.d
        @n
        public final <T> f<T> b(@d5.d Collection<? extends T> collection) {
            l0.p(collection, ProtectedSandApp.s("夫"));
            f<T> fVar = new f<>(null);
            fVar.addAll(collection);
            return fVar;
        }

        public b(w wVar) {
        }
    }

    /* compiled from: SmartSet.kt */
    /* loaded from: classes6.dex */
    private static final class c<T> implements Iterator<T>, r3.d {

        /* renamed from: o, reason: collision with root package name */
        private final T f26683o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f26684p = true;

        public c(T t5) {
            this.f26683o = t5;
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26684p;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f26684p) {
                throw new NoSuchElementException();
            }
            this.f26684p = false;
            return this.f26683o;
        }
    }

    private f() {
    }

    @d5.d
    @n
    public static final <T> f<T> b() {
        return f26679q.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t5) {
        Object[] objArr;
        ?? o5;
        int i5 = this.f26681p;
        if (i5 == 0) {
            this.f26680o = t5;
        } else if (i5 == 1) {
            if (l0.g(this.f26680o, t5)) {
                return false;
            }
            this.f26680o = new Object[]{this.f26680o, t5};
        } else if (i5 < 5) {
            Object obj = this.f26680o;
            l0.n(obj, ProtectedSandApp.s("夬"));
            Object[] objArr2 = (Object[]) obj;
            if (t.s8(objArr2, t5)) {
                return false;
            }
            int i6 = this.f26681p;
            if (i6 == 4) {
                o5 = q1.o(Arrays.copyOf(objArr2, objArr2.length));
                o5.add(t5);
                objArr = o5;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, i6 + 1);
                l0.o(copyOf, ProtectedSandApp.s("夭"));
                copyOf[copyOf.length - 1] = t5;
                objArr = copyOf;
            }
            this.f26680o = objArr;
        } else {
            Object obj2 = this.f26680o;
            l0.n(obj2, ProtectedSandApp.s("央"));
            if (!u1.o(obj2).add(t5)) {
                return false;
            }
        }
        this.f26681p++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f26680o = null;
        this.f26681p = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i5 = this.f26681p;
        if (i5 == 0) {
            return false;
        }
        if (i5 == 1) {
            return l0.g(this.f26680o, obj);
        }
        if (i5 < 5) {
            Object obj2 = this.f26680o;
            l0.n(obj2, ProtectedSandApp.s("夯"));
            return t.s8((Object[]) obj2, obj);
        }
        Object obj3 = this.f26680o;
        l0.n(obj3, ProtectedSandApp.s("夰"));
        return ((Set) obj3).contains(obj);
    }

    public int f() {
        return this.f26681p;
    }

    public void g(int i5) {
        this.f26681p = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @d5.d
    public Iterator<T> iterator() {
        int i5 = this.f26681p;
        if (i5 == 0) {
            return Collections.emptySet().iterator();
        }
        if (i5 == 1) {
            return new c(this.f26680o);
        }
        if (i5 < 5) {
            Object obj = this.f26680o;
            l0.n(obj, ProtectedSandApp.s("失"));
            return new a((Object[]) obj);
        }
        Object obj2 = this.f26680o;
        l0.n(obj2, ProtectedSandApp.s("夲"));
        return u1.o(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26681p;
    }

    public f(w wVar) {
    }
}
