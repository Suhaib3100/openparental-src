package androidx.compose.runtime.collection;

import androidx.collection.s;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.k2;

/* compiled from: IdentityArraySet.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0005J/\u0010\u001c\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u001aH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u001aH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0013¢\u0006\u0004\b&\u0010%J\u0015\u0010'\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b'\u0010\u0015J$\u0010)\u001a\u00020\u000f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u001aH\u0086\b¢\u0006\u0004\b)\u0010\u001dJ\u001d\u0010+\u001a\u00020\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b+\u0010,J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R$\u00108\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00078\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R4\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001092\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001098\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Landroidx/compose/runtime/collection/d;", "", "T", "", "<init>", "()V", "value", "", "j", "(Ljava/lang/Object;)I", "midIndex", "valueHash", "l", "(ILjava/lang/Object;I)I", "index", "Lkotlin/k2;", "f", "(I)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "get", "(I)Ljava/lang/Object;", "add", "clear", "Lkotlin/Function1;", "block", "i", "(Lld/l;)V", "h", "(Lld/l;)Z", "", "collection", "c", "(Ljava/util/Collection;)V", "isEmpty", "()Z", "q", "remove", "predicate", "r", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "<set-?>", "b", "I", "m", "()I", "size", "", "[Ljava/lang/Object;", "p", "()[Ljava/lang/Object;", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nIdentityArraySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,402:1\n1726#2,3:403\n*S KotlinDebug\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n378#1:403,3\n*E\n"})
/* loaded from: classes.dex */
public final class d<T> implements Set<T>, md.a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16124d = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private Object[] values = new Object[16];

    /* compiled from: IdentityArraySet.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/compose/runtime/collection/d$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "b", "I", "()I", "c", "(I)V", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d<T> f16128c;

        a(d<T> dVar) {
            this.f16128c = dVar;
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void c(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f16128c.size();
        }

        @Override // java.util.Iterator
        @l
        public T next() {
            Object[] values = this.f16128c.getValues();
            int i4 = this.index;
            this.index = i4 + 1;
            T t4 = (T) values[i4];
            l0.n(t4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t4;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: IdentityArraySet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<T, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f16129b = new b(1);

        b() {
            super(1);
        }

        @l
        public final CharSequence a(@l T t4) {
            return t4.toString();
        }

        @Override // ld.l
        public CharSequence invoke(Object obj) {
            return obj.toString();
        }
    }

    private final void f(int index) {
        if (index < 0 || index >= this.size) {
            StringBuilder a5 = s.a("Index ", index, ", size ");
            a5.append(this.size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
    }

    private final int j(Object value) {
        int i4 = this.size - 1;
        int identityHashCode = System.identityHashCode(value);
        Object[] objArr = this.values;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            Object obj = objArr[i6];
            int identityHashCode2 = System.identityHashCode(obj);
            if (identityHashCode2 < identityHashCode) {
                i5 = i6 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    return obj == value ? i6 : l(i6, value, identityHashCode);
                }
                i4 = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    private final int l(int midIndex, Object value, int valueHash) {
        Object obj;
        Object[] objArr = this.values;
        int i4 = this.size;
        for (int i5 = midIndex - 1; -1 < i5; i5--) {
            Object obj2 = objArr[i5];
            if (obj2 == value) {
                return i5;
            }
            if (System.identityHashCode(obj2) != valueHash) {
                break;
            }
        }
        do {
            midIndex++;
            if (midIndex >= i4) {
                return -(i4 + 1);
            }
            obj = objArr[midIndex];
            if (obj == value) {
                return midIndex;
            }
        } while (System.identityHashCode(obj) == valueHash);
        return -(midIndex + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(@l T value) {
        int i4;
        int i5 = this.size;
        Object[] objArr = this.values;
        if (i5 > 0) {
            i4 = j(value);
            if (i4 >= 0) {
                return false;
            }
        } else {
            i4 = -1;
        }
        int i6 = -(i4 + 1);
        if (i5 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            kotlin.collections.l.B0(objArr, objArr2, i6 + 1, i6, i5);
            kotlin.collections.l.K0(objArr, objArr2, 0, 0, i6, 6, null);
            this.values = objArr2;
        } else {
            kotlin.collections.l.B0(objArr, objArr, i6 + 1, i6, i5);
        }
        this.values[i6] = value;
        this.size++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c(@l Collection<? extends T> collection) {
        Object[] objArr;
        int i4;
        Object obj;
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof d)) {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return;
        }
        Object[] objArr2 = this.values;
        d dVar = (d) collection;
        Object[] objArr3 = dVar.values;
        int i5 = this.size;
        int i6 = dVar.size;
        int i7 = i5 + i6;
        boolean z4 = objArr2.length < i7;
        boolean z5 = i5 == 0 || System.identityHashCode(objArr2[i5 + (-1)]) < System.identityHashCode(objArr3[0]);
        if (!z4 && z5) {
            kotlin.collections.l.B0(objArr3, objArr2, i5, 0, i6);
            this.size += i6;
            return;
        }
        if (z4) {
            objArr = new Object[i5 > i6 ? i5 * 2 : i6 * 2];
        } else {
            objArr = objArr2;
        }
        int i10 = i5 - 1;
        int i11 = i6 - 1;
        int i12 = i7 - 1;
        while (true) {
            if (i10 < 0 && i11 < 0) {
                break;
            }
            if (i10 < 0) {
                i4 = i11 - 1;
                obj = objArr3[i11];
            } else if (i11 < 0) {
                i4 = i11;
                obj = objArr2[i10];
                i10--;
            } else {
                Object obj2 = objArr2[i10];
                Object obj3 = objArr3[i11];
                int identityHashCode = System.identityHashCode(obj2);
                int identityHashCode2 = System.identityHashCode(obj3);
                if (identityHashCode > identityHashCode2) {
                    i10--;
                } else {
                    if (identityHashCode >= identityHashCode2) {
                        if (obj2 != obj3) {
                            int i13 = i10 - 1;
                            while (i13 >= 0) {
                                int i14 = i13 - 1;
                                Object obj4 = objArr2[i13];
                                if (System.identityHashCode(obj4) != identityHashCode2) {
                                    break;
                                }
                                if (obj3 == obj4) {
                                    i11--;
                                    break;
                                }
                                i13 = i14;
                            }
                        } else {
                            i10--;
                            i11--;
                        }
                    }
                    i4 = i11 - 1;
                    obj = obj3;
                }
                i4 = i11;
                obj = obj2;
            }
            objArr[i12] = obj;
            i11 = i4;
            i12--;
        }
        if (i12 >= 0) {
            kotlin.collections.l.B0(objArr, objArr, 0, i12 + 1, i7);
        }
        int i15 = i7 - (i12 + 1);
        kotlin.collections.l.M1(objArr, null, i15, i7);
        this.values = objArr;
        this.size = i15;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        kotlin.collections.l.V1(this.values, null, 0, 0, 6, null);
        this.size = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@m Object element) {
        return element != null && j(element) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> elements) {
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

    @l
    public final T get(int index) {
        f(index);
        T t4 = (T) this.values[index];
        l0.n(t4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t4;
    }

    public final boolean h(@l ld.l<? super T, Boolean> block) {
        int i4 = this.size;
        if (i4 == 0) {
            return false;
        }
        Object[] objArr = this.values;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = objArr[i5];
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (block.invoke(obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void i(@l ld.l<? super T, k2> block) {
        Object[] objArr = this.values;
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = objArr[i5];
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            block.invoke(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* renamed from: m, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @l
    /* renamed from: p, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean q() {
        return this.size > 0;
    }

    public final void r(@l ld.l<? super T, Boolean> predicate) {
        Object[] objArr = this.values;
        int i4 = this.size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (!predicate.invoke(obj).booleanValue()) {
                if (i5 != i6) {
                    objArr[i5] = obj;
                }
                i5++;
            }
        }
        for (int i7 = i5; i7 < i4; i7++) {
            objArr[i7] = null;
        }
        this.size = i5;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(@m T value) {
        if (value == null) {
            return false;
        }
        int j4 = j(value);
        Object[] objArr = this.values;
        int i4 = this.size;
        if (j4 < 0) {
            return false;
        }
        int i5 = i4 - 1;
        if (j4 < i5) {
            kotlin.collections.l.B0(objArr, objArr, j4, j4 + 1, i4);
        }
        objArr[i5] = null;
        this.size--;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.size;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @l
    public String toString() {
        return w.m3(this, null, "[", "]", 0, null, b.f16129b, 25, null);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }
}
