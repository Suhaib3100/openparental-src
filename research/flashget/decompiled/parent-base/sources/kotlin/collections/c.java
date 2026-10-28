package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: AbstractList.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\" #$B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H¦\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001f¨\u0006%"}, d2 = {"Lkotlin/collections/c;", "E", "Lkotlin/collections/a;", "", "<init>", "()V", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "size", "a", "c", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.c1(version = "1.1")
@kotlin.jvm.internal.r1({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n350#2,7:171\n378#2,7:178\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:171,7\n29#1:178,7\n*E\n"})
/* loaded from: classes7.dex */
public abstract class c<E> extends a<E> implements List<E>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f74887c = 2147483639;

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00042\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u001a2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00162\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/collections/c$a;", "", "<init>", "()V", "", "index", "size", "Lkotlin/k2;", "b", "(II)V", "c", "fromIndex", "toIndex", "d", "(III)V", "startIndex", "endIndex", "a", "oldCapacity", "minCapacity", "e", "(II)I", "", "g", "(Ljava/util/Collection;)I", "other", "", "f", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final void a(int startIndex, int endIndex, int size) {
            String s4 = ProtectedSandApp.s("愇\u0001");
            if (startIndex < 0 || endIndex > size) {
                StringBuilder a5 = androidx.collection.n1.a(s4, startIndex, ProtectedSandApp.s("愉\u0001"), endIndex, ProtectedSandApp.s("愊\u0001"));
                a5.append(size);
                throw new IndexOutOfBoundsException(a5.toString());
            }
            if (startIndex > endIndex) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(s4, startIndex, ProtectedSandApp.s("愈\u0001"), endIndex));
            }
        }

        public final void b(int index, int size) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("愋\u0001"), index, ProtectedSandApp.s("愊\u0001"), size));
            }
        }

        public final void c(int index, int size) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("愋\u0001"), index, ProtectedSandApp.s("愊\u0001"), size));
            }
        }

        public final void d(int fromIndex, int toIndex, int size) {
            String s4 = ProtectedSandApp.s("愌\u0001");
            if (fromIndex < 0 || toIndex > size) {
                StringBuilder a5 = androidx.collection.n1.a(s4, fromIndex, ProtectedSandApp.s("愎\u0001"), toIndex, ProtectedSandApp.s("愊\u0001"));
                a5.append(size);
                throw new IndexOutOfBoundsException(a5.toString());
            }
            if (fromIndex > toIndex) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(s4, fromIndex, ProtectedSandApp.s("愍\u0001"), toIndex));
            }
        }

        public final int e(int oldCapacity, int minCapacity) {
            int i4 = oldCapacity + (oldCapacity >> 1);
            if (i4 - minCapacity < 0) {
                i4 = minCapacity;
            }
            if (i4 - c.f74887c <= 0) {
                return i4;
            }
            if (minCapacity > c.f74887c) {
                return Integer.MAX_VALUE;
            }
            return c.f74887c;
        }

        public final boolean f(@fg.l Collection<?> c5, @fg.l Collection<?> other) {
            kotlin.jvm.internal.l0.p(c5, ProtectedSandApp.s("意\u0001"));
            kotlin.jvm.internal.l0.p(other, ProtectedSandApp.s("愐\u0001"));
            if (c5.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c5.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.l0.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(@fg.l Collection<?> c5) {
            kotlin.jvm.internal.l0.p(c5, ProtectedSandApp.s("意\u0001"));
            Iterator<?> it = c5.iterator();
            int i4 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i4 = (i4 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i4;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/collections/c$b;", "", "<init>", "(Lkotlin/collections/c;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "b", "I", "()I", "c", "(I)V", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private class b implements Iterator<E>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        public b() {
        }

        /* renamed from: b, reason: from getter */
        protected final int getIndex() {
            return this.index;
        }

        protected final void c(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < c.this.get_size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            c<E> cVar = c.this;
            int i4 = this.index;
            this.index = i4 + 1;
            return cVar.get(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("愑\u0001"));
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/collections/c$c;", "Lkotlin/collections/c$b;", "Lkotlin/collections/c;", "", "", "index", "<init>", "(Lkotlin/collections/c;I)V", "", "hasPrevious", "()Z", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$c, reason: collision with other inner class name */
    private class C1049c extends c<E>.b implements ListIterator<E>, md.a {
        public C1049c(int i4) {
            super();
            c.INSTANCE.c(i4, c.this.get_size());
            c(i4);
        }

        @Override // java.util.ListIterator
        public void add(E e4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("愒\u0001"));
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return getIndex() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return getIndex();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            c<E> cVar = c.this;
            c(getIndex() - 1);
            return cVar.get(getIndex());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return getIndex() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("愒\u0001"));
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlin/collections/c$d;", "E", "Lkotlin/collections/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "fromIndex", "toIndex", "<init>", "(Lkotlin/collections/c;II)V", "index", "get", "(I)Ljava/lang/Object;", "d", "Lkotlin/collections/c;", "e", "I", "f", "_size", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final c<E> list;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int fromIndex;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int _size;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@fg.l c<? extends E> cVar, int i4, int i5) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("愔\u0001"));
            this.list = cVar;
            this.fromIndex = i4;
            c.INSTANCE.d(i4, i5, cVar.get_size());
            this._size = i5 - i4;
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        /* renamed from: b, reason: from getter */
        public int get_size() {
            return this._size;
        }

        @Override // kotlin.collections.c, java.util.List
        public E get(int index) {
            c.INSTANCE.b(index, this._size);
            return this.list.get(this.fromIndex + index);
        }
    }

    protected c() {
    }

    @Override // java.util.List
    public void add(int i4, E e4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("愓\u0001"));
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("愓\u0001"));
    }

    @Override // kotlin.collections.a
    /* renamed from: b */
    public abstract int get_size();

    @Override // java.util.Collection, java.util.List
    public boolean equals(@fg.m Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof List) {
            return INSTANCE.f(this, (Collection) other);
        }
        return false;
    }

    public abstract E get(int index);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return INSTANCE.g(this);
    }

    public int indexOf(E element) {
        Iterator<E> it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l0.g(it.next(), element)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @fg.l
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E element) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.l0.g(listIterator.previous(), element)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @fg.l
    public ListIterator<E> listIterator() {
        return new C1049c(0);
    }

    @Override // java.util.List
    public E remove(int i4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("愓\u0001"));
    }

    public E set(int i4, E e4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("愓\u0001"));
    }

    @fg.l
    public List<E> subList(int fromIndex, int toIndex) {
        return new d(this, fromIndex, toIndex);
    }

    @fg.l
    public ListIterator<E> listIterator(int index) {
        return new C1049c(index);
    }
}
