package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d4;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

/* compiled from: Iterators.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class d4 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    class a<T> extends e7<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Enumeration f55539b;

        a(Enumeration enumeration) {
            this.f55539b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55539b.hasMoreElements();
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            return (T) this.f55539b.nextElement();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    class b<T> implements Enumeration<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f55540a;

        b(Iterator it) {
            this.f55540a = it;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f55540a.hasNext();
        }

        @Override // java.util.Enumeration
        @f5
        public T nextElement() {
            return (T) this.f55540a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    class c<T> extends e7<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f55541b;

        c(Iterator it) {
            this.f55541b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55541b.hasNext();
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            return (T) this.f55541b.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    class d<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        Iterator<T> f55542b = n.INSTANCE;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterable f55543c;

        d(Iterable iterable) {
            this.f55543c = iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55542b.hasNext() || this.f55543c.iterator().hasNext();
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            if (!this.f55542b.hasNext()) {
                Iterator<T> it = this.f55543c.iterator();
                this.f55542b = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f55542b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f55542b.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: Iterators.java */
    class e<I> extends e7<I> {

        /* renamed from: b, reason: collision with root package name */
        int f55544b = 0;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator[] f55545c;

        e(Iterator[] itArr) {
            this.f55545c = itArr;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TI; */
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterator next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f55545c[this.f55544b];
            Objects.requireNonNull(it);
            Iterator it2 = it;
            Iterator[] itArr = this.f55545c;
            int i4 = this.f55544b;
            itArr[i4] = null;
            this.f55544b = i4 + 1;
            return it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55544b < this.f55545c.length;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    class f<T> extends e7<List<T>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f55546b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f55547c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f55548d;

        f(Iterator it, int i4, boolean z4) {
            this.f55546b = it;
            this.f55547c = i4;
            this.f55548d = z4;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.f55547c];
            int i4 = 0;
            while (i4 < this.f55547c && this.f55546b.hasNext()) {
                objArr[i4] = this.f55546b.next();
                i4++;
            }
            for (int i5 = i4; i5 < this.f55547c; i5++) {
                objArr[i5] = null;
            }
            List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.f55548d || i4 == this.f55547c) ? unmodifiableList : unmodifiableList.subList(0, i4);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55546b.hasNext();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    class g<T> extends com.google.common.collect.c<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f55549d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.m0 f55550e;

        g(Iterator it, com.google.common.base.m0 m0Var) {
            this.f55549d = it;
            this.f55550e = m0Var;
        }

        @Override // com.google.common.collect.c
        @zc.a
        protected T a() {
            while (this.f55549d.hasNext()) {
                T t4 = (T) this.f55549d.next();
                if (this.f55550e.apply(t4)) {
                    return t4;
                }
            }
            return b();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* compiled from: Iterators.java */
    class h<F, T> extends v6<F, T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.x f55551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Iterator it, com.google.common.base.x xVar) {
            super(it);
            this.f55551c = xVar;
        }

        @Override // com.google.common.collect.v6
        @f5
        T a(@f5 F f4) {
            return (T) this.f55551c.apply(f4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    class i<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        private int f55552b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f55553c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f55554d;

        i(int i4, Iterator it) {
            this.f55553c = i4;
            this.f55554d = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55552b < this.f55553c && this.f55554d.hasNext();
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f55552b++;
            return (T) this.f55554d.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f55554d.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    class j<T> extends e7<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f55555b;

        j(Iterator it) {
            this.f55555b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55555b.hasNext();
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            T t4 = (T) this.f55555b.next();
            this.f55555b.remove();
            return t4;
        }

        public String toString() {
            return ProtectedSandApp.s("\uf488");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    class k<T> extends e7<T> {

        /* renamed from: b, reason: collision with root package name */
        boolean f55556b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f55557c;

        k(Object obj) {
            this.f55557c = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f55556b;
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            if (this.f55556b) {
                throw new NoSuchElementException();
            }
            this.f55556b = true;
            return (T) this.f55557c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Iterators.java */
    static final class l<T> extends com.google.common.collect.b<T> {

        /* renamed from: f, reason: collision with root package name */
        static final f7<Object> f55558f = new l(new Object[0], 0, 0, 0);

        /* renamed from: d, reason: collision with root package name */
        private final T[] f55559d;

        /* renamed from: e, reason: collision with root package name */
        private final int f55560e;

        l(T[] tArr, int i4, int i5, int i6) {
            super(i5, i6);
            this.f55559d = tArr;
            this.f55560e = i4;
        }

        @Override // com.google.common.collect.b
        @f5
        protected T a(int i4) {
            return this.f55559d[this.f55560e + i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Iterators.java */
    static class m<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        private Iterator<? extends T> f55561b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<? extends T> f55562c = l.f55558f;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        private Iterator<? extends Iterator<? extends T>> f55563d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        private Deque<Iterator<? extends Iterator<? extends T>>> f55564e;

        m(Iterator<? extends Iterator<? extends T>> it) {
            it.getClass();
            this.f55563d = it;
        }

        @zc.a
        private Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f55563d;
                if (it != null && it.hasNext()) {
                    return this.f55563d;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f55564e;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f55563d = this.f55564e.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                Iterator<? extends T> it = this.f55562c;
                it.getClass();
                if (it.hasNext()) {
                    return true;
                }
                Iterator<? extends Iterator<? extends T>> a5 = a();
                this.f55563d = a5;
                if (a5 == null) {
                    return false;
                }
                Iterator<? extends T> next = a5.next();
                this.f55562c = next;
                if (next instanceof m) {
                    m mVar = (m) next;
                    this.f55562c = mVar.f55562c;
                    if (this.f55564e == null) {
                        this.f55564e = new ArrayDeque();
                    }
                    this.f55564e.addFirst(this.f55563d);
                    if (mVar.f55564e != null) {
                        while (!mVar.f55564e.isEmpty()) {
                            this.f55564e.addFirst(mVar.f55564e.removeLast());
                        }
                    }
                    this.f55563d = mVar.f55563d;
                }
            }
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f55562c;
            this.f55561b = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f55561b;
            if (it == null) {
                throw new IllegalStateException(ProtectedSandApp.s("\uf489"));
            }
            it.remove();
            this.f55561b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Iterators.java */
    enum n implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            b0.e(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Iterators.java */
    static class o<T> extends e7<T> {

        /* renamed from: b, reason: collision with root package name */
        final Queue<g5<T>> f55565b;

        public o(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.f55565b = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.e4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b5;
                    b5 = d4.o.b(comparator, (g5) obj, (g5) obj2);
                    return b5;
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.f55565b.add(d4.T(it));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ int b(Comparator comparator, g5 g5Var, g5 g5Var2) {
            return comparator.compare(g5Var.peek(), g5Var2.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f55565b.isEmpty();
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            g5<T> remove = this.f55565b.remove();
            T next = remove.next();
            if (remove.hasNext()) {
                this.f55565b.add(remove);
            }
            return next;
        }
    }

    /* compiled from: Iterators.java */
    private static class p<E> implements g5<E> {

        /* renamed from: b, reason: collision with root package name */
        private final Iterator<? extends E> f55566b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f55567c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        private E f55568d;

        public p(Iterator<? extends E> it) {
            it.getClass();
            this.f55566b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55567c || this.f55566b.hasNext();
        }

        @Override // com.google.common.collect.g5, java.util.Iterator
        @f5
        public E next() {
            if (!this.f55567c) {
                return this.f55566b.next();
            }
            E e4 = this.f55568d;
            this.f55567c = false;
            this.f55568d = null;
            return e4;
        }

        @Override // com.google.common.collect.g5
        @f5
        public E peek() {
            if (!this.f55567c) {
                this.f55568d = this.f55566b.next();
                this.f55567c = true;
            }
            return this.f55568d;
        }

        @Override // com.google.common.collect.g5, java.util.Iterator
        public void remove() {
            com.google.common.base.l0.h0(!this.f55567c, ProtectedSandApp.s("\uf48b"));
            this.f55566b.remove();
        }
    }

    private d4() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @zc.a
    public static <T> T A(Iterator<? extends T> it, com.google.common.base.m0<? super T> m0Var, @zc.a T t4) {
        it.getClass();
        m0Var.getClass();
        while (it.hasNext()) {
            T next = it.next();
            if (m0Var.apply(next)) {
                return next;
            }
        }
        return t4;
    }

    @SafeVarargs
    public static <T> e7<T> B(T... tArr) {
        return C(tArr, 0, tArr.length, 0);
    }

    static <T> f7<T> C(T[] tArr, int i4, int i5, int i6) {
        com.google.common.base.l0.d(i5 >= 0);
        com.google.common.base.l0.f0(i4, i4 + i5, tArr.length);
        com.google.common.base.l0.d0(i6, i5);
        return i5 == 0 ? (f7<T>) l.f55558f : new l(tArr, i4, i5, i6);
    }

    public static <T> e7<T> D(Enumeration<T> enumeration) {
        enumeration.getClass();
        return new a(enumeration);
    }

    public static int E(Iterator<?> it, @zc.a Object obj) {
        int i4 = 0;
        while (q(it, obj)) {
            i4++;
        }
        return i4;
    }

    @f5
    public static <T> T F(Iterator<T> it, int i4) {
        g(i4);
        int b5 = b(it, i4);
        if (it.hasNext()) {
            return it.next();
        }
        StringBuilder sb = new StringBuilder(91);
        sb.append(ProtectedSandApp.s("\uf48c"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uf48d"));
        sb.append(b5);
        sb.append(ProtectedSandApp.s("\uf48e"));
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @f5
    public static <T> T G(Iterator<? extends T> it, int i4, @f5 T t4) {
        g(i4);
        b(it, i4);
        return (T) J(it, t4);
    }

    @f5
    public static <T> T H(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @f5
    public static <T> T I(Iterator<? extends T> it, @f5 T t4) {
        return it.hasNext() ? (T) H(it) : t4;
    }

    @f5
    public static <T> T J(Iterator<? extends T> it, @f5 T t4) {
        return it.hasNext() ? it.next() : t4;
    }

    @f5
    public static <T> T K(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uf48f"));
        sb.append(next);
        for (int i4 = 0; i4 < 4 && it.hasNext(); i4++) {
            sb.append(ProtectedSandApp.s("\uf490"));
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(ProtectedSandApp.s("\uf491"));
        }
        sb.append(kotlin.text.m0.greater);
        throw new IllegalArgumentException(sb.toString());
    }

    @f5
    public static <T> T L(Iterator<? extends T> it, @f5 T t4) {
        return it.hasNext() ? (T) K(it) : t4;
    }

    public static <T> int M(Iterator<T> it, com.google.common.base.m0<? super T> m0Var) {
        com.google.common.base.l0.F(m0Var, ProtectedSandApp.s("\uf492"));
        int i4 = 0;
        while (it.hasNext()) {
            if (m0Var.apply(it.next())) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static <T> Iterator<T> N(Iterator<T> it, int i4) {
        it.getClass();
        com.google.common.base.l0.e(i4 >= 0, ProtectedSandApp.s("\uf493"));
        return new i(i4, it);
    }

    @d9.a
    public static <T> e7<T> O(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        com.google.common.base.l0.F(iterable, ProtectedSandApp.s("\uf494"));
        com.google.common.base.l0.F(comparator, ProtectedSandApp.s("\uf495"));
        return new o(iterable, comparator);
    }

    public static <T> e7<List<T>> P(Iterator<T> it, int i4) {
        return R(it, i4, true);
    }

    public static <T> e7<List<T>> Q(Iterator<T> it, int i4) {
        return R(it, i4, false);
    }

    private static <T> e7<List<T>> R(Iterator<T> it, int i4, boolean z4) {
        it.getClass();
        com.google.common.base.l0.d(i4 > 0);
        return new f(it, i4, z4);
    }

    @Deprecated
    public static <T> g5<T> S(g5<T> g5Var) {
        g5Var.getClass();
        return g5Var;
    }

    public static <T> g5<T> T(Iterator<? extends T> it) {
        return it instanceof p ? (p) it : new p(it);
    }

    @zc.a
    static <T> T U(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @f9.a
    public static boolean V(Iterator<?> it, Collection<?> collection) {
        collection.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @f9.a
    public static <T> boolean W(Iterator<T> it, com.google.common.base.m0<? super T> m0Var) {
        m0Var.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            if (m0Var.apply(it.next())) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @f9.a
    public static boolean X(Iterator<?> it, Collection<?> collection) {
        collection.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    public static <T> e7<T> Y(@f5 T t4) {
        return new k(t4);
    }

    public static int Z(Iterator<?> it) {
        long j4 = 0;
        while (it.hasNext()) {
            it.next();
            j4++;
        }
        return com.google.common.primitives.l.x(j4);
    }

    @f9.a
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        collection.getClass();
        it.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= collection.add(it.next());
        }
        return z4;
    }

    @d9.c
    public static <T> T[] a0(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) c4.Q(l4.s(it), cls);
    }

    @f9.a
    public static int b(Iterator<?> it, int i4) {
        it.getClass();
        int i5 = 0;
        com.google.common.base.l0.e(i4 >= 0, ProtectedSandApp.s("\uf496"));
        while (i5 < i4 && it.hasNext()) {
            it.next();
            i5++;
        }
        return i5;
    }

    public static String b0(Iterator<?> it) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uf497"));
        boolean z4 = true;
        while (it.hasNext()) {
            if (!z4) {
                sb.append(ProtectedSandApp.s("\uf490"));
            }
            sb.append(it.next());
            z4 = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static <T> boolean c(Iterator<T> it, com.google.common.base.m0<? super T> m0Var) {
        m0Var.getClass();
        while (it.hasNext()) {
            if (!m0Var.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <F, T> Iterator<T> c0(Iterator<F> it, com.google.common.base.x<? super F, ? extends T> xVar) {
        xVar.getClass();
        return new h(it, xVar);
    }

    public static <T> boolean d(Iterator<T> it, com.google.common.base.m0<? super T> m0Var) {
        return M(it, m0Var) != -1;
    }

    public static <T> com.google.common.base.g0<T> d0(Iterator<T> it, com.google.common.base.m0<? super T> m0Var) {
        it.getClass();
        m0Var.getClass();
        while (it.hasNext()) {
            T next = it.next();
            if (m0Var.apply(next)) {
                return com.google.common.base.g0.f(next);
            }
        }
        return com.google.common.base.g0.a();
    }

    public static <T> Enumeration<T> e(Iterator<T> it) {
        it.getClass();
        return new b(it);
    }

    @Deprecated
    public static <T> e7<T> e0(e7<T> e7Var) {
        e7Var.getClass();
        return e7Var;
    }

    static <T> ListIterator<T> f(Iterator<T> it) {
        return (ListIterator) it;
    }

    public static <T> e7<T> f0(Iterator<? extends T> it) {
        it.getClass();
        return it instanceof e7 ? (e7) it : new c(it);
    }

    static void g(int i4) {
        if (i4 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append(ProtectedSandApp.s("\uf48c"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uf498"));
        throw new IndexOutOfBoundsException(sb.toString());
    }

    static void h(Iterator<?> it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> i(Iterator<? extends Iterator<? extends T>> it) {
        return new m(it);
    }

    public static <T> Iterator<T> j(Iterator<? extends T> it, Iterator<? extends T> it2) {
        it.getClass();
        it2.getClass();
        return new m(new e(new Iterator[]{it, it2}));
    }

    public static <T> Iterator<T> k(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        it.getClass();
        it2.getClass();
        it3.getClass();
        return new m(new e(new Iterator[]{it, it2, it3}));
    }

    public static <T> Iterator<T> l(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        it.getClass();
        it2.getClass();
        it3.getClass();
        it4.getClass();
        return new m(new e(new Iterator[]{it, it2, it3, it4}));
    }

    public static <T> Iterator<T> m(Iterator<? extends T>... itArr) {
        return n((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    static <T> Iterator<T> n(Iterator<? extends T>... itArr) {
        itArr.getClass();
        for (Iterator<? extends T> it : itArr) {
            it.getClass();
        }
        return new m(new e(itArr));
    }

    private static <I extends Iterator<?>> Iterator<I> o(I... iArr) {
        return new e(iArr);
    }

    public static <T> Iterator<T> p(Iterator<T> it) {
        it.getClass();
        return new j(it);
    }

    public static boolean q(Iterator<?> it, @zc.a Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> r(Iterable<T> iterable) {
        iterable.getClass();
        return new d(iterable);
    }

    @SafeVarargs
    public static <T> Iterator<T> s(T... tArr) {
        return r(l4.t(tArr));
    }

    public static boolean t(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.google.common.base.f0.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static <T> e7<T> u() {
        return l.f55558f;
    }

    static <T> f7<T> v() {
        return (f7<T>) l.f55558f;
    }

    static <T> Iterator<T> w() {
        return n.INSTANCE;
    }

    public static <T> e7<T> x(Iterator<T> it, com.google.common.base.m0<? super T> m0Var) {
        it.getClass();
        m0Var.getClass();
        return new g(it, m0Var);
    }

    @d9.c
    public static <T> e7<T> y(Iterator<?> it, Class<T> cls) {
        return x(it, com.google.common.base.n0.o(cls));
    }

    @f5
    public static <T> T z(Iterator<T> it, com.google.common.base.m0<? super T> m0Var) {
        it.getClass();
        m0Var.getClass();
        while (it.hasNext()) {
            T next = it.next();
            if (m0Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }
}
