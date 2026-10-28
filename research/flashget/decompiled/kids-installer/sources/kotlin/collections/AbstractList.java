package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AbstractList.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.1")
@SourceDebugExtension({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n350#2,7:171\n378#2,7:178\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:171,7\n29#1:178,7\n*E\n"})
/* renamed from: kotlin.collections.c, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final a f23126o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    private static final int f23127p = 2147483639;

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0017J%\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001dJ\u0019\u0010\u001e\u001a\u00020\u00042\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "()V", "maxArraySize", "", "checkBoundsIndexes", "", "startIndex", "endIndex", "size", "checkBoundsIndexes$kotlin_stdlib", "checkElementIndex", "index", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(int i5, int i6, int i7) {
            String s5 = ProtectedSandApp.s("㞌");
            if (i5 >= 0 && i6 <= i7) {
                if (i5 > i6) {
                    throw new IllegalArgumentException(android.content.preferences.protobuf.v.a(s5, i5, ProtectedSandApp.s("㞍"), i6));
                }
                return;
            }
            throw new IndexOutOfBoundsException(s5 + i5 + ProtectedSandApp.s("㞎") + i6 + ProtectedSandApp.s("㞏") + i7);
        }

        public final void b(int i5, int i6) {
            if (i5 < 0 || i5 >= i6) {
                throw new IndexOutOfBoundsException(android.content.preferences.protobuf.v.a(ProtectedSandApp.s("㞐"), i5, ProtectedSandApp.s("㞑"), i6));
            }
        }

        public final void c(int i5, int i6) {
            if (i5 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException(android.content.preferences.protobuf.v.a(ProtectedSandApp.s("㞒"), i5, ProtectedSandApp.s("㞓"), i6));
            }
        }

        public final void d(int i5, int i6, int i7) {
            String s5 = ProtectedSandApp.s("㞔");
            if (i5 >= 0 && i6 <= i7) {
                if (i5 > i6) {
                    throw new IllegalArgumentException(android.content.preferences.protobuf.v.a(s5, i5, ProtectedSandApp.s("㞕"), i6));
                }
                return;
            }
            throw new IndexOutOfBoundsException(s5 + i5 + ProtectedSandApp.s("㞖") + i6 + ProtectedSandApp.s("㞗") + i7);
        }

        public final int e(int i5, int i6) {
            int i7 = i5 + (i5 >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - AbstractList.f23127p <= 0) {
                return i7;
            }
            if (i6 > AbstractList.f23127p) {
                return Integer.MAX_VALUE;
            }
            return AbstractList.f23127p;
        }

        public final boolean f(@d5.d Collection<?> collection, @d5.d Collection<?> collection2) {
            kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("㞘"));
            kotlin.jvm.internal.l0.p(collection2, ProtectedSandApp.s("㞙"));
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.l0.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(@d5.d Collection<?> collection) {
            kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("㞚"));
            Iterator<?> it = collection.iterator();
            int i5 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i5 = (i5 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i5;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$b */
    /* loaded from: classes5.dex */
    private class b implements Iterator<E>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        private int f23128o;

        public b() {
        }

        /* renamed from: a, reason: from getter */
        protected final int getF23128o() {
            return this.f23128o;
        }

        protected final void d(int i5) {
            this.f23128o = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23128o < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            int i5 = this.f23128o;
            this.f23128o = i5 + 1;
            return abstractList.get(i5);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㞛"));
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$c */
    private class c extends AbstractList<E>.b implements ListIterator<E>, r3.a {
        public c(int i5) {
            super();
            AbstractList.f23126o.c(i5, AbstractList.this.size());
            d(i5);
        }

        @Override // java.util.ListIterator
        public void add(E e6) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("毂"));
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return getF23128o() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return getF23128o();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            d(getF23128o() - 1);
            return abstractList.get(getF23128o());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return getF23128o() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e6) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("毃"));
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$d */
    private static final class d<E> extends AbstractList<E> implements RandomAccess {

        /* renamed from: q, reason: collision with root package name */
        @d5.d
        private final AbstractList<E> f23131q;

        /* renamed from: r, reason: collision with root package name */
        private final int f23132r;

        /* renamed from: s, reason: collision with root package name */
        private int f23133s;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@d5.d AbstractList<? extends E> abstractList, int i5, int i6) {
            kotlin.jvm.internal.l0.p(abstractList, ProtectedSandApp.s("毈"));
            this.f23131q = abstractList;
            this.f23132r = i5;
            AbstractList.f23126o.d(i5, i6, abstractList.size());
            this.f23133s = i6 - i5;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* renamed from: b, reason: from getter */
        public int getF23133s() {
            return this.f23133s;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int index) {
            AbstractList.f23126o.b(index, this.f23133s);
            return this.f23131q.get(this.f23132r + index);
        }
    }

    protected AbstractList() {
    }

    @Override // java.util.List
    public void add(int i5, E e6) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("毄"));
    }

    @Override // java.util.List
    public boolean addAll(int i5, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("毅"));
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public abstract int getF23133s();

    @Override // java.util.Collection, java.util.List
    public boolean equals(@d5.e Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof List) {
            return f23126o.f(this, (Collection) other);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int index);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f23126o.g(this);
    }

    @Override // java.util.List
    public int indexOf(E element) {
        Iterator<E> it = iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l0.g(it.next(), element)) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    @d5.d
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(E element) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.l0.g(listIterator.previous(), element)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @d5.d
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("毆"));
    }

    @Override // java.util.List
    public E set(int i5, E e6) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("毇"));
    }

    @Override // java.util.List
    @d5.d
    public List<E> subList(int fromIndex, int toIndex) {
        return new d(this, fromIndex, toIndex);
    }

    @Override // java.util.List
    @d5.d
    public ListIterator<E> listIterator(int index) {
        return new c(index);
    }
}
