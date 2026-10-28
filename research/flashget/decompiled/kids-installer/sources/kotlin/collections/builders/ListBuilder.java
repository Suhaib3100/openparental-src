package kotlin.collections.builders;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.p;
import kotlin.collections.z;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 X*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0002XYB\u0007\b\u0016¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bBM\b\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J&\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010&\u001a\u00020\nH\u0002J\u001d\u0010'\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010 J\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u001eH\u0016J\u0014\u0010-\u001a\u00020\u00112\n\u0010.\u001a\u0006\u0012\u0002\b\u00030)H\u0002J\u0010\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\nH\u0002J\u0010\u00101\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\nH\u0002J\u0013\u00102\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u000103H\u0096\u0002J\u0016\u00104\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0096\u0002¢\u0006\u0002\u00105J\b\u00106\u001a\u00020\nH\u0016J\u0015\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00108J\u0018\u00109\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\b\u0010:\u001a\u00020\u0011H\u0016J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0096\u0002J\u0015\u0010=\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00108J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010@\u001a\u00020\u001eH\u0002J\u0015\u0010A\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u0016\u0010B\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0015\u0010C\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0002\u00105J\u0015\u0010D\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0002\u00105J\u0018\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0002J\u0016\u0010H\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J.\u0010I\u001a\u00020\n2\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010J\u001a\u00020\u0011H\u0002J\u001e\u0010K\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010LJ\u001e\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010N\u001a\u00020\n2\u0006\u0010O\u001a\u00020\nH\u0016J\u0015\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\rH\u0016¢\u0006\u0002\u0010QJ'\u0010P\u001a\b\u0012\u0004\u0012\u0002HR0\r\"\u0004\b\u0001\u0010R2\f\u0010S\u001a\b\u0012\u0004\u0012\u0002HR0\rH\u0016¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020VH\u0016J\b\u0010W\u001a\u000203H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006Z"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "array", "", "offset", "length", "isReadOnly", "", "backing", "root", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "isEffectivelyReadOnly", "()Z", "size", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "addAllInternal", "i", "n", "addAtInternal", "build", "", "checkForComodification", "checkIsMutable", "clear", "contentEquals", "other", "ensureCapacityInternal", "minCapacity", "ensureExtraCapacity", "equals", "", "get", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "insertAtInternal", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "registerModification", "remove", "removeAll", "removeAt", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainAll", "retainOrRemoveAllInternal", "retain", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toArray", "()[Ljava/lang/Object;", "T", "destination", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "writeReplace", "Companion", "Itr", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
/* renamed from: kotlin.collections.builders.b, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, r3.e {

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private static final a f23081u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    private static final ListBuilder f23082v;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private E[] f23083o;

    /* renamed from: p, reason: collision with root package name */
    private int f23084p;

    /* renamed from: q, reason: collision with root package name */
    private int f23085q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23086r;

    /* renamed from: s, reason: collision with root package name */
    @d5.e
    private final ListBuilder<E> f23087s;

    /* renamed from: t, reason: collision with root package name */
    @d5.e
    private final ListBuilder<E> f23088t;

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "()V", "Empty", "Lkotlin/collections/builders/ListBuilder;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.b$a */
    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0002J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0012\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\r\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "list", "Lkotlin/collections/builders/ListBuilder;", "index", "", "(Lkotlin/collections/builders/ListBuilder;I)V", "expectedModCount", "lastIndex", "add", "", "element", "(Ljava/lang/Object;)V", "checkForComodification", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
    /* renamed from: kotlin.collections.builders.b$b */
    private static final class b<E> implements ListIterator<E>, r3.f {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final ListBuilder<E> f23089o;

        /* renamed from: p, reason: collision with root package name */
        private int f23090p;

        /* renamed from: q, reason: collision with root package name */
        private int f23091q;

        /* renamed from: r, reason: collision with root package name */
        private int f23092r;

        public b(@d5.d ListBuilder<E> listBuilder, int i5) {
            l0.p(listBuilder, ProtectedSandApp.s("殑"));
            this.f23089o = listBuilder;
            this.f23090p = i5;
            this.f23091q = -1;
            this.f23092r = ((AbstractList) listBuilder).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f23089o).modCount != this.f23092r) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            a();
            ListBuilder<E> listBuilder = this.f23089o;
            int i5 = this.f23090p;
            this.f23090p = i5 + 1;
            listBuilder.add(i5, element);
            this.f23091q = -1;
            this.f23092r = ((AbstractList) this.f23089o).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23090p < ((ListBuilder) this.f23089o).f23085q;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23090p > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            if (this.f23090p >= ((ListBuilder) this.f23089o).f23085q) {
                throw new NoSuchElementException();
            }
            int i5 = this.f23090p;
            this.f23090p = i5 + 1;
            this.f23091q = i5;
            return (E) ((ListBuilder) this.f23089o).f23083o[((ListBuilder) this.f23089o).f23084p + this.f23091q];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23090p;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i5 = this.f23090p;
            if (i5 <= 0) {
                throw new NoSuchElementException();
            }
            int i6 = i5 - 1;
            this.f23090p = i6;
            this.f23091q = i6;
            return (E) ((ListBuilder) this.f23089o).f23083o[((ListBuilder) this.f23089o).f23084p + this.f23091q];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f23090p - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i5 = this.f23091q;
            if (!(i5 != -1)) {
                throw new IllegalStateException(ProtectedSandApp.s("殒").toString());
            }
            this.f23089o.f(i5);
            this.f23090p = this.f23091q;
            this.f23091q = -1;
            this.f23092r = ((AbstractList) this.f23089o).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            a();
            int i5 = this.f23091q;
            if (!(i5 != -1)) {
                throw new IllegalStateException(ProtectedSandApp.s("殓").toString());
            }
            this.f23089o.set(i5, element);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f23086r = true;
        f23082v = listBuilder;
    }

    private ListBuilder(E[] eArr, int i5, int i6, boolean z5, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.f23083o = eArr;
        this.f23084p = i5;
        this.f23085q = i6;
        this.f23086r = z5;
        this.f23087s = listBuilder;
        this.f23088t = listBuilder2;
        if (listBuilder != null) {
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }
    }

    private final void A(int i5, int i6) {
        z(i6);
        E[] eArr = this.f23083o;
        p.B0(eArr, eArr, i5 + i6, i5, this.f23084p + this.f23085q);
        this.f23085q += i6;
    }

    private final boolean B() {
        ListBuilder<E> listBuilder;
        return this.f23086r || ((listBuilder = this.f23088t) != null && listBuilder.f23086r);
    }

    private final void C() {
        ((AbstractList) this).modCount++;
    }

    private final E E(int i5) {
        C();
        ListBuilder<E> listBuilder = this.f23087s;
        if (listBuilder != null) {
            this.f23085q--;
            return listBuilder.E(i5);
        }
        E[] eArr = this.f23083o;
        E e6 = eArr[i5];
        p.B0(eArr, eArr, i5, i5 + 1, this.f23084p + this.f23085q);
        c.f(this.f23083o, (this.f23084p + this.f23085q) - 1);
        this.f23085q--;
        return e6;
    }

    private final void H(int i5, int i6) {
        if (i6 > 0) {
            C();
        }
        ListBuilder<E> listBuilder = this.f23087s;
        if (listBuilder != null) {
            listBuilder.H(i5, i6);
        } else {
            E[] eArr = this.f23083o;
            p.B0(eArr, eArr, i5, i5 + i6, this.f23085q);
            E[] eArr2 = this.f23083o;
            int i7 = this.f23085q;
            c.g(eArr2, i7 - i6, i7);
        }
        this.f23085q -= i6;
    }

    private final int I(int i5, int i6, Collection<? extends E> collection, boolean z5) {
        int i7;
        ListBuilder<E> listBuilder = this.f23087s;
        if (listBuilder != null) {
            i7 = listBuilder.I(i5, i6, collection, z5);
        } else {
            int i8 = 0;
            int i9 = 0;
            while (i8 < i6) {
                int i10 = i5 + i8;
                if (collection.contains(this.f23083o[i10]) == z5) {
                    E[] eArr = this.f23083o;
                    i8++;
                    eArr[i9 + i5] = eArr[i10];
                    i9++;
                } else {
                    i8++;
                }
            }
            int i11 = i6 - i9;
            E[] eArr2 = this.f23083o;
            p.B0(eArr2, eArr2, i5 + i9, i6 + i5, this.f23085q);
            E[] eArr3 = this.f23083o;
            int i12 = this.f23085q;
            c.g(eArr3, i12 - i11, i12);
            i7 = i11;
        }
        if (i7 > 0) {
            C();
        }
        this.f23085q -= i7;
        return i7;
    }

    private final Object J() {
        if (B()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException(ProtectedSandApp.s("殔"));
    }

    private final void r(int i5, Collection<? extends E> collection, int i6) {
        C();
        ListBuilder<E> listBuilder = this.f23087s;
        if (listBuilder != null) {
            listBuilder.r(i5, collection, i6);
            this.f23083o = this.f23087s.f23083o;
            this.f23085q += i6;
        } else {
            A(i5, i6);
            Iterator<? extends E> it = collection.iterator();
            for (int i7 = 0; i7 < i6; i7++) {
                this.f23083o[i5 + i7] = it.next();
            }
        }
    }

    private final void s(int i5, E e6) {
        C();
        ListBuilder<E> listBuilder = this.f23087s;
        if (listBuilder == null) {
            A(i5, 1);
            this.f23083o[i5] = e6;
        } else {
            listBuilder.s(i5, e6);
            this.f23083o = this.f23087s.f23083o;
            this.f23085q++;
        }
    }

    private final void u() {
        ListBuilder<E> listBuilder = this.f23088t;
        if (listBuilder != null && ((AbstractList) listBuilder).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void v() {
        if (B()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean x(List<?> list) {
        boolean h5;
        h5 = c.h(this.f23083o, this.f23084p, this.f23085q, list);
        return h5;
    }

    private final void y(int i5) {
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f23083o;
        if (i5 > eArr.length) {
            this.f23083o = (E[]) c.e(this.f23083o, kotlin.collections.AbstractList.f23126o.e(eArr.length, i5));
        }
    }

    private final void z(int i5) {
        y(this.f23085q + i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        v();
        u();
        s(this.f23084p + this.f23085q, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@d5.d Collection<? extends E> elements) {
        l0.p(elements, ProtectedSandApp.s("殖"));
        v();
        u();
        int size = elements.size();
        r(this.f23084p + this.f23085q, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b */
    public int getF23160q() {
        u();
        return this.f23085q;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        v();
        u();
        H(this.f23084p, this.f23085q);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@d5.e Object other) {
        u();
        return other == this || ((other instanceof List) && x((List) other));
    }

    @Override // kotlin.collections.AbstractMutableList
    public E f(int i5) {
        v();
        u();
        kotlin.collections.AbstractList.f23126o.b(i5, this.f23085q);
        return E(this.f23084p + i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        u();
        kotlin.collections.AbstractList.f23126o.b(index, this.f23085q);
        return this.f23083o[this.f23084p + index];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i5;
        u();
        i5 = c.i(this.f23083o, this.f23084p, this.f23085q);
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        u();
        for (int i5 = 0; i5 < this.f23085q; i5++) {
            if (l0.g(this.f23083o[this.f23084p + i5], element)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        u();
        return this.f23085q == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @d5.d
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        u();
        for (int i5 = this.f23085q - 1; i5 >= 0; i5--) {
            if (l0.g(this.f23083o[this.f23084p + i5], element)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @d5.d
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        v();
        u();
        int indexOf = indexOf(element);
        if (indexOf >= 0) {
            f(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@d5.d Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("殗"));
        v();
        u();
        return I(this.f23084p, this.f23085q, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@d5.d Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("殘"));
        v();
        u();
        return I(this.f23084p, this.f23085q, elements, true) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        v();
        u();
        kotlin.collections.AbstractList.f23126o.b(index, this.f23085q);
        E[] eArr = this.f23083o;
        int i5 = this.f23084p;
        E e6 = eArr[i5 + index];
        eArr[i5 + index] = element;
        return e6;
    }

    @Override // java.util.AbstractList, java.util.List
    @d5.d
    public List<E> subList(int fromIndex, int toIndex) {
        kotlin.collections.AbstractList.f23126o.d(fromIndex, toIndex, this.f23085q);
        E[] eArr = this.f23083o;
        int i5 = this.f23084p + fromIndex;
        int i6 = toIndex - fromIndex;
        boolean z5 = this.f23086r;
        ListBuilder<E> listBuilder = this.f23088t;
        return new ListBuilder(eArr, i5, i6, z5, this, listBuilder == null ? this : listBuilder);
    }

    @d5.d
    public final List<E> t() {
        if (this.f23087s != null) {
            throw new IllegalStateException();
        }
        v();
        this.f23086r = true;
        return this.f23085q > 0 ? this : f23082v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @d5.d
    public <T> T[] toArray(@d5.d T[] destination) {
        Object[] n5;
        l0.p(destination, ProtectedSandApp.s("殙"));
        u();
        int length = destination.length;
        int i5 = this.f23085q;
        if (length < i5) {
            E[] eArr = this.f23083o;
            int i6 = this.f23084p;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i6, i5 + i6, destination.getClass());
            l0.o(tArr, ProtectedSandApp.s("殚"));
            return tArr;
        }
        E[] eArr2 = this.f23083o;
        int i7 = this.f23084p;
        p.B0(eArr2, destination, 0, i7, i5 + i7);
        n5 = z.n(this.f23085q, destination);
        return (T[]) n5;
    }

    @Override // java.util.AbstractCollection
    @d5.d
    public String toString() {
        String j5;
        u();
        j5 = c.j(this.f23083o, this.f23084p, this.f23085q, this);
        return j5;
    }

    @Override // java.util.AbstractList, java.util.List
    @d5.d
    public ListIterator<E> listIterator(int index) {
        u();
        kotlin.collections.AbstractList.f23126o.c(index, this.f23085q);
        return new b(this, index);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        v();
        u();
        kotlin.collections.AbstractList.f23126o.c(index, this.f23085q);
        s(this.f23084p + index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @d5.d Collection<? extends E> elements) {
        l0.p(elements, ProtectedSandApp.s("殕"));
        v();
        u();
        kotlin.collections.AbstractList.f23126o.c(index, this.f23085q);
        int size = elements.size();
        r(this.f23084p + index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @d5.d
    public Object[] toArray() {
        Object[] l12;
        u();
        E[] eArr = this.f23083o;
        int i5 = this.f23084p;
        l12 = p.l1(eArr, i5, this.f23085q + i5);
        return l12;
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i5) {
        this(c.d(i5), 0, 0, false, null, null);
    }
}
