package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;

/* compiled from: SnapshotStateList.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010+\n\u0002\b\u0018\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u0010J\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u0010J\u001d\u0010*\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010+\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0017J\u001d\u0010,\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b,\u0010\u0014J \u0010-\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u00100R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0014\u00106\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R$\u0010<\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b4\u0010;¨\u0006="}, d2 = {"Landroidx/compose/runtime/snapshots/s0;", "T", "", "Landroidx/compose/runtime/snapshots/b0;", "parentList", "", "fromIndex", "toIndex", "<init>", "(Landroidx/compose/runtime/snapshots/b0;II)V", "Lkotlin/k2;", "h", "()V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "b", "Landroidx/compose/runtime/snapshots/b0;", "()Landroidx/compose/runtime/snapshots/b0;", "c", "I", "offset", "d", "structure", "<set-?>", "e", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,484:1\n1726#2,3:485\n1855#2,2:488\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n336#1:485,3\n345#1:488,2\n*E\n"})
/* loaded from: classes.dex */
final class s0<T> implements List<T>, md.e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b0<T> parentList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int structure;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"androidx/compose/runtime/snapshots/s0$a", "", "", "hasPrevious", "()Z", "", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", "b", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "c", "()Ljava/lang/Void;", "d", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements ListIterator<T>, md.f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.f f17142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s0<T> f17143c;

        a(k1.f fVar, s0<T> s0Var) {
            this.f17142b = fVar;
            this.f17143c = s0Var;
        }

        @Override // java.util.ListIterator
        @fg.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void add(T element) {
            c0.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @fg.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            c0.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        @fg.l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void set(T element) {
            c0.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f17142b.f75327b < this.f17143c.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f17142b.f75327b >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i4 = this.f17142b.f75327b + 1;
            c0.g(i4, this.f17143c.size());
            this.f17142b.f75327b = i4;
            return this.f17143c.get(i4);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f17142b.f75327b + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i4 = this.f17142b.f75327b;
            c0.g(i4, this.f17143c.size());
            this.f17142b.f75327b = i4 - 1;
            return this.f17143c.get(i4);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f17142b.f75327b;
        }
    }

    public s0(@fg.l b0<T> b0Var, int i4, int i5) {
        this.parentList = b0Var;
        this.offset = i4;
        this.structure = b0Var.m();
        this.size = i5 - i4;
    }

    private final void h() {
        if (this.parentList.m() != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        h();
        this.parentList.add(this.offset + this.size, element);
        this.size++;
        this.structure = this.parentList.m();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@fg.l Collection<? extends T> elements) {
        return addAll(this.size, elements);
    }

    @fg.l
    public final b0<T> b() {
        return this.parentList;
    }

    /* renamed from: c, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (this.size > 0) {
            h();
            b0<T> b0Var = this.parentList;
            int i4 = this.offset;
            b0Var.s(i4, this.size + i4);
            this.size = 0;
            this.structure = this.parentList.m();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public T f(int index) {
        h();
        T r4 = this.parentList.r(this.offset + index);
        this.size--;
        this.structure = this.parentList.m();
        return r4;
    }

    @Override // java.util.List
    public T get(int index) {
        h();
        c0.g(index, this.size);
        return this.parentList.get(this.offset + index);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        h();
        int i4 = this.offset;
        Iterator<Integer> it = kotlin.ranges.s.W1(i4, this.size + i4).iterator();
        while (it.hasNext()) {
            int c5 = ((kotlin.collections.u0) it).c();
            if (kotlin.jvm.internal.l0.g(element, this.parentList.get(c5))) {
                return c5 - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @fg.l
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        h();
        int i4 = this.offset + this.size;
        do {
            i4--;
            if (i4 < this.offset) {
                return -1;
            }
        } while (!kotlin.jvm.internal.l0.g(element, this.parentList.get(i4)));
        return i4 - this.offset;
    }

    @Override // java.util.List
    @fg.l
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i4) {
        return f(i4);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@fg.l Collection<? extends Object> elements) {
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@fg.l Collection<? extends Object> elements) {
        h();
        b0<T> b0Var = this.parentList;
        int i4 = this.offset;
        int v4 = b0Var.v(elements, i4, this.size + i4);
        if (v4 > 0) {
            this.structure = this.parentList.m();
            this.size -= v4;
        }
        return v4 > 0;
    }

    @Override // java.util.List
    public T set(int index, T element) {
        c0.g(index, this.size);
        h();
        T t4 = this.parentList.set(index + this.offset, element);
        this.structure = this.parentList.m();
        return t4;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.size;
    }

    @Override // java.util.List
    @fg.l
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > this.size) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        h();
        b0<T> b0Var = this.parentList;
        int i4 = this.offset;
        return new s0(b0Var, fromIndex + i4, toIndex + i4);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @Override // java.util.List
    @fg.l
    public ListIterator<T> listIterator(int index) {
        h();
        k1.f fVar = new k1.f();
        fVar.f75327b = index - 1;
        return new a(fVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        f(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }

    @Override // java.util.List
    public boolean addAll(int index, @fg.l Collection<? extends T> elements) {
        h();
        boolean addAll = this.parentList.addAll(index + this.offset, elements);
        if (addAll) {
            this.size = elements.size() + this.size;
            this.structure = this.parentList.m();
        }
        return addAll;
    }

    @Override // java.util.List
    public void add(int index, T element) {
        h();
        this.parentList.add(this.offset + index, element);
        this.size++;
        this.structure = this.parentList.m();
    }
}
