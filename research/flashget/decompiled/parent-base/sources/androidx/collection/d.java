package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ArraySet.jvm.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001LB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tB\u0019\b\u0016\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bB\u001b\b\u0016\u0012\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0007J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0017J\u001d\u0010\"\u001a\u00020\u000f2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000¢\u0006\u0004\b\"\u0010\tJ\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u0017J\u0015\u0010$\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001eJ\u001d\u0010%\u001a\u00020\u00152\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f¢\u0006\u0004\b'\u0010(J'\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0001\u0010)2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b'\u0010*J\u001a\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b,\u0010\u0017J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0096\u0002¢\u0006\u0004\b3\u00104J\u001d\u00106\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b8\u00107J\u001d\u00109\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b9\u00107J\u001d\u0010:\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b:\u00107R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010(\"\u0004\bD\u0010\u000eR\"\u0010I\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010.\"\u0004\bH\u0010\u0007R\u0014\u0010K\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010.¨\u0006M"}, d2 = {"Landroidx/collection/d;", "E", "", "", "", "capacity", "<init>", "(I)V", "set", "(Landroidx/collection/d;)V", "", "(Ljava/util/Collection;)V", "", "array", "([Ljava/lang/Object;)V", "Lkotlin/k2;", "clear", "()V", "minimumCapacity", "c", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", "indexOf", "(Ljava/lang/Object;)I", "index", "s", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "b", "remove", "m", "l", "(Landroidx/collection/d;)Z", "toArray", "()[Ljava/lang/Object;", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", "[I", "h", "()[I", "q", "([I)V", "hashes", "[Ljava/lang/Object;", "f", "p", "d", "I", "j", "r", "_size", "i", "size", "a", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E>, md.b, md.h {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] hashes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] array;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int _size;

    /* compiled from: ArraySet.jvm.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/collection/d$a;", "Landroidx/collection/b0;", "<init>", "(Landroidx/collection/d;)V", "", "index", "b", "(I)Ljava/lang/Object;", "Lkotlin/k2;", "c", "(I)V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a extends b0<E> {
        public a() {
            super(d.this.j());
        }

        @Override // androidx.collection.b0
        protected E b(int index) {
            return d.this.s(index);
        }

        @Override // androidx.collection.b0
        protected void c(int index) {
            d.this.m(index);
        }
    }

    @kd.j
    public d() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i4;
        int n4;
        int i5 = this._size;
        if (element == null) {
            n4 = f.p(this);
            i4 = 0;
        } else {
            int hashCode = element.hashCode();
            i4 = hashCode;
            n4 = f.n(this, element, hashCode);
        }
        if (n4 >= 0) {
            return false;
        }
        int i6 = ~n4;
        int[] iArr = this.hashes;
        if (i5 >= iArr.length) {
            int i7 = 8;
            if (i5 >= 8) {
                i7 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.array;
            f.d(this, i7);
            if (i5 != this._size) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.hashes;
            if (!(iArr2.length == 0)) {
                kotlin.collections.l.I0(iArr, iArr2, 0, 0, iArr.length, 6, null);
                kotlin.collections.l.K0(objArr, this.array, 0, 0, objArr.length, 6, null);
            }
        }
        if (i6 < i5) {
            int[] iArr3 = this.hashes;
            int i10 = i6 + 1;
            kotlin.collections.l.z0(iArr3, iArr3, i10, i6, i5);
            Object[] objArr2 = this.array;
            kotlin.collections.l.B0(objArr2, objArr2, i10, i6, i5);
        }
        int i11 = this._size;
        if (i5 == i11) {
            int[] iArr4 = this.hashes;
            if (i6 < iArr4.length) {
                iArr4[i6] = i4;
                this.array[i6] = element;
                this._size = i11 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@fg.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        c(elements.size() + this._size);
        Iterator<? extends E> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@fg.l d<? extends E> array) {
        kotlin.jvm.internal.l0.p(array, "array");
        int i4 = array._size;
        c(this._size + i4);
        if (this._size != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                add(array.array[i5]);
            }
            return;
        }
        if (i4 > 0) {
            kotlin.collections.l.I0(array.hashes, this.hashes, 0, 0, i4, 6, null);
            kotlin.collections.l.K0(array.array, this.array, 0, 0, i4, 6, null);
            if (this._size != 0) {
                throw new ConcurrentModificationException();
            }
            this._size = i4;
        }
    }

    public final void c(int minimumCapacity) {
        int i4 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            Object[] objArr = this.array;
            f.d(this, minimumCapacity);
            int i5 = this._size;
            if (i5 > 0) {
                kotlin.collections.l.I0(iArr, this.hashes, 0, 0, i5, 6, null);
                kotlin.collections.l.K0(objArr, this.array, 0, 0, this._size, 6, null);
            }
        }
        if (this._size != i4) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (this._size != 0) {
            q(m.a.f81460a);
            p(m.a.f81462c);
            this._size = 0;
        }
        if (this._size != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof Set) && this._size == ((Set) other).size()) {
            try {
                int i4 = this._size;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (((Set) other).contains(this.array[i5])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.hashes;
        int i4 = this._size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    /* renamed from: i, reason: from getter */
    public int get_size() {
        return this._size;
    }

    public final int indexOf(@fg.m Object key) {
        return key == null ? f.p(this) : f.n(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this._size <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @fg.l
    public Iterator<E> iterator() {
        return new a();
    }

    public final int j() {
        return this._size;
    }

    public final boolean l(@fg.l d<? extends E> array) {
        kotlin.jvm.internal.l0.p(array, "array");
        int i4 = array._size;
        int i5 = this._size;
        for (int i6 = 0; i6 < i4; i6++) {
            remove(array.array[i6]);
        }
        return i5 != this._size;
    }

    public final E m(int index) {
        int i4 = this._size;
        Object[] objArr = this.array;
        E e4 = (E) objArr[index];
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.hashes;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (index < i5) {
                    int i6 = index + 1;
                    kotlin.collections.l.z0(iArr, iArr, index, i6, i4);
                    Object[] objArr2 = this.array;
                    kotlin.collections.l.B0(objArr2, objArr2, index, i6, i4);
                }
                this.array[i5] = null;
            } else {
                f.d(this, i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (index > 0) {
                    kotlin.collections.l.I0(iArr, this.hashes, 0, 0, index, 6, null);
                    kotlin.collections.l.K0(objArr, this.array, 0, 0, index, 6, null);
                }
                if (index < i5) {
                    int i7 = index + 1;
                    kotlin.collections.l.z0(iArr, this.hashes, index, i7, i4);
                    kotlin.collections.l.B0(objArr, this.array, index, i7, i4);
                }
            }
            if (i4 != this._size) {
                throw new ConcurrentModificationException();
            }
            this._size = i5;
        }
        return e4;
    }

    public final void p(@fg.l Object[] objArr) {
        kotlin.jvm.internal.l0.p(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void q(@fg.l int[] iArr) {
        kotlin.jvm.internal.l0.p(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void r(int i4) {
        this._size = i4;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        m(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@fg.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@fg.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        boolean z4 = false;
        for (int i4 = this._size - 1; -1 < i4; i4--) {
            if (!kotlin.collections.w.W1(elements, this.array[i4])) {
                m(i4);
                z4 = true;
            }
        }
        return z4;
    }

    public final E s(int index) {
        return (E) this.array[index];
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    @fg.l
    public final Object[] toArray() {
        return kotlin.collections.l.l1(this.array, 0, this._size);
    }

    @fg.l
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this._size * 14);
        sb.append('{');
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.array[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        return c.a(sb, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    @kd.j
    public d(int i4) {
        this.hashes = m.a.f81460a;
        this.array = m.a.f81462c;
        if (i4 > 0) {
            f.d(this, i4);
        }
    }

    @Override // java.util.Collection, java.util.Set
    @fg.l
    public final <T> T[] toArray(@fg.l T[] array) {
        kotlin.jvm.internal.l0.p(array, "array");
        T[] result = (T[]) e.a(array, this._size);
        kotlin.collections.l.B0(this.array, result, 0, 0, this._size);
        kotlin.jvm.internal.l0.o(result, "result");
        return result;
    }

    public /* synthetic */ d(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 0 : i4);
    }

    public d(@fg.m d<? extends E> dVar) {
        this(0);
        if (dVar != null) {
            b(dVar);
        }
    }

    public d(@fg.m Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@fg.m E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator a5 = kotlin.jvm.internal.i.a(eArr);
            while (a5.hasNext()) {
                add(a5.next());
            }
        }
    }
}
