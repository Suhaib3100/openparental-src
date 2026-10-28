package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;

/* compiled from: ArrayDeque.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001PB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\u0082\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0083\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010C\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010E\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010F\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010G\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010HJ\u0017\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bJ\u0010KJ)\u0010I\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0000¢\u0006\u0004\bJ\u0010NJ\u0015\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010KJ'\u0010O\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0016¢\u0006\u0002\u0010NR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006Q"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "elementData", "", "", "[Ljava/lang/Object;", "head", "<set-?>", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "isEmpty", "last", "lastIndexOf", "lastOrNull", "negativeMod", "positiveMod", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
@SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,569:1\n467#1,51:572\n467#1,51:623\n37#2,2:570\n26#3:674\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:572,51\n464#1:623,51\n47#1:570,2\n559#1:674\n*E\n"})
/* renamed from: kotlin.collections.k, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    public static final a f23155r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private static final Object[] f23156s = new Object[0];

    /* renamed from: t, reason: collision with root package name */
    private static final int f23157t = 10;

    /* renamed from: o, reason: collision with root package name */
    private int f23158o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private Object[] f23159p;

    /* renamed from: q, reason: collision with root package name */
    private int f23160q;

    /* compiled from: ArrayDeque.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "()V", "defaultMinCapacity", "", "emptyElementData", "", "[Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public ArrayDeque(int i5) {
        Object[] objArr;
        if (i5 == 0) {
            objArr = f23156s;
        } else {
            if (i5 <= 0) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("滴"), i5));
            }
            objArr = new Object[i5];
        }
        this.f23159p = objArr;
    }

    private final int A(int i5) {
        Object[] objArr = this.f23159p;
        return i5 >= objArr.length ? i5 - objArr.length : i5;
    }

    private final void g(int i5, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f23159p.length;
        while (i5 < length && it.hasNext()) {
            this.f23159p[i5] = it.next();
            i5++;
        }
        int i6 = this.f23158o;
        for (int i7 = 0; i7 < i6 && it.hasNext(); i7++) {
            this.f23159p[i7] = it.next();
        }
        this.f23160q = collection.size() + getF23160q();
    }

    private final void h(int i5) {
        Object[] objArr = new Object[i5];
        Object[] objArr2 = this.f23159p;
        p.B0(objArr2, objArr, 0, this.f23158o, objArr2.length);
        Object[] objArr3 = this.f23159p;
        int length = objArr3.length;
        int i6 = this.f23158o;
        p.B0(objArr3, objArr, length - i6, 0, i6);
        this.f23158o = 0;
        this.f23159p = objArr;
    }

    private final int p(int i5) {
        return i5 == 0 ? t.we(this.f23159p) : i5 - 1;
    }

    private final void q(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException(ProtectedSandApp.s("滶"));
        }
        Object[] objArr = this.f23159p;
        if (i5 <= objArr.length) {
            return;
        }
        if (objArr != f23156s) {
            h(AbstractList.f23126o.e(objArr.length, i5));
            return;
        }
        if (i5 < 10) {
            i5 = 10;
        }
        this.f23159p = new Object[i5];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean r(q3.l<? super E, Boolean> lVar) {
        int A;
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty()) {
            if ((this.f23159p.length == 0) == false) {
                int A2 = A(getF23160q() + this.f23158o);
                int i5 = this.f23158o;
                if (i5 < A2) {
                    A = i5;
                    while (i5 < A2) {
                        Object obj = this.f23159p[i5];
                        if (lVar.N(obj).booleanValue()) {
                            this.f23159p[A] = obj;
                            A++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    p.M1(this.f23159p, null, A, A2);
                } else {
                    int length = this.f23159p.length;
                    boolean z6 = false;
                    int i6 = i5;
                    while (i5 < length) {
                        Object[] objArr = this.f23159p;
                        Object obj2 = objArr[i5];
                        objArr[i5] = null;
                        if (lVar.N(obj2).booleanValue()) {
                            this.f23159p[i6] = obj2;
                            i6++;
                        } else {
                            z6 = true;
                        }
                        i5++;
                    }
                    A = A(i6);
                    for (int i7 = 0; i7 < A2; i7++) {
                        Object[] objArr2 = this.f23159p;
                        Object obj3 = objArr2[i7];
                        objArr2[i7] = null;
                        if (lVar.N(obj3).booleanValue()) {
                            this.f23159p[A] = obj3;
                            A = t(A);
                        } else {
                            z6 = true;
                        }
                    }
                    z5 = z6;
                }
                if (z5) {
                    this.f23160q = z(A - this.f23158o);
                }
            }
        }
        return z5;
    }

    private final int t(int i5) {
        if (i5 == t.we(this.f23159p)) {
            return 0;
        }
        return i5 + 1;
    }

    @InlineOnly
    private final E u(int i5) {
        return (E) this.f23159p[i5];
    }

    @InlineOnly
    private final int v(int i5) {
        return A(this.f23158o + i5);
    }

    private final int z(int i5) {
        return i5 < 0 ? i5 + this.f23159p.length : i5;
    }

    @d5.e
    public final E B() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @d5.e
    public final E C() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @d5.d
    public final Object[] E() {
        return toArray();
    }

    @d5.d
    public final <T> T[] H(@d5.d T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("滷"));
        return (T[]) toArray(tArr);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@d5.d Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("滹"));
        if (elements.isEmpty()) {
            return false;
        }
        q(elements.size() + getF23160q());
        g(A(getF23160q() + this.f23158o), elements);
        return true;
    }

    public final void addFirst(E element) {
        q(getF23160q() + 1);
        int p5 = p(this.f23158o);
        this.f23158o = p5;
        this.f23159p[p5] = element;
        this.f23160q = getF23160q() + 1;
    }

    public final void addLast(E element) {
        q(getF23160q() + 1);
        this.f23159p[A(getF23160q() + this.f23158o)] = element;
        this.f23160q = getF23160q() + 1;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b, reason: from getter */
    public int getF23160q() {
        return this.f23160q;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int A = A(getF23160q() + this.f23158o);
        int i5 = this.f23158o;
        if (i5 < A) {
            p.M1(this.f23159p, null, i5, A);
        } else if (!isEmpty()) {
            Object[] objArr = this.f23159p;
            p.M1(objArr, null, this.f23158o, objArr.length);
            p.M1(this.f23159p, null, 0, A);
        }
        this.f23158o = 0;
        this.f23160q = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E f(int i5) {
        AbstractList.f23126o.b(i5, getF23160q());
        if (i5 == a0.J(this)) {
            return removeLast();
        }
        if (i5 == 0) {
            return removeFirst();
        }
        int A = A(this.f23158o + i5);
        E e6 = (E) this.f23159p[A];
        if (i5 < (getF23160q() >> 1)) {
            int i6 = this.f23158o;
            if (A >= i6) {
                Object[] objArr = this.f23159p;
                p.B0(objArr, objArr, i6 + 1, i6, A);
            } else {
                Object[] objArr2 = this.f23159p;
                p.B0(objArr2, objArr2, 1, 0, A);
                Object[] objArr3 = this.f23159p;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i7 = this.f23158o;
                p.B0(objArr3, objArr3, i7 + 1, i7, objArr3.length - 1);
            }
            Object[] objArr4 = this.f23159p;
            int i8 = this.f23158o;
            objArr4[i8] = null;
            this.f23158o = t(i8);
        } else {
            int A2 = A(this.f23158o + a0.J(this));
            if (A <= A2) {
                Object[] objArr5 = this.f23159p;
                p.B0(objArr5, objArr5, A, A + 1, A2 + 1);
            } else {
                Object[] objArr6 = this.f23159p;
                p.B0(objArr6, objArr6, A, A + 1, objArr6.length);
                Object[] objArr7 = this.f23159p;
                objArr7[objArr7.length - 1] = objArr7[0];
                p.B0(objArr7, objArr7, 0, 1, A2 + 1);
            }
            this.f23159p[A2] = null;
        }
        this.f23160q = getF23160q() - 1;
        return e6;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("滺"));
        }
        return (E) this.f23159p[this.f23158o];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.f23126o.b(index, getF23160q());
        return (E) this.f23159p[A(this.f23158o + index)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i5;
        int A = A(getF23160q() + this.f23158o);
        int i6 = this.f23158o;
        if (i6 < A) {
            while (i6 < A) {
                if (kotlin.jvm.internal.l0.g(element, this.f23159p[i6])) {
                    i5 = this.f23158o;
                } else {
                    i6++;
                }
            }
            return -1;
        }
        if (i6 < A) {
            return -1;
        }
        int length = this.f23159p.length;
        while (true) {
            if (i6 >= length) {
                for (int i7 = 0; i7 < A; i7++) {
                    if (kotlin.jvm.internal.l0.g(element, this.f23159p[i7])) {
                        i6 = i7 + this.f23159p.length;
                        i5 = this.f23158o;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.l0.g(element, this.f23159p[i6])) {
                i5 = this.f23158o;
                break;
            }
            i6++;
        }
        return i6 - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return getF23160q() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("滻"));
        }
        return (E) this.f23159p[A(this.f23158o + a0.J(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int we;
        int i5;
        int A = A(getF23160q() + this.f23158o);
        int i6 = this.f23158o;
        if (i6 < A) {
            we = A - 1;
            if (i6 <= we) {
                while (!kotlin.jvm.internal.l0.g(element, this.f23159p[we])) {
                    if (we != i6) {
                        we--;
                    }
                }
                i5 = this.f23158o;
                return we - i5;
            }
            return -1;
        }
        if (i6 > A) {
            int i7 = A - 1;
            while (true) {
                if (-1 >= i7) {
                    we = t.we(this.f23159p);
                    int i8 = this.f23158o;
                    if (i8 <= we) {
                        while (!kotlin.jvm.internal.l0.g(element, this.f23159p[we])) {
                            if (we != i8) {
                                we--;
                            }
                        }
                        i5 = this.f23158o;
                    }
                } else {
                    if (kotlin.jvm.internal.l0.g(element, this.f23159p[i7])) {
                        we = i7 + this.f23159p.length;
                        i5 = this.f23158o;
                        break;
                    }
                    i7--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int indexOf = indexOf(element);
        if (indexOf == -1) {
            return false;
        }
        f(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@d5.d Collection<? extends Object> elements) {
        int A;
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("滼"));
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty()) {
            if ((this.f23159p.length == 0) == false) {
                int A2 = A(getF23160q() + this.f23158o);
                int i5 = this.f23158o;
                if (i5 < A2) {
                    A = i5;
                    while (i5 < A2) {
                        Object obj = this.f23159p[i5];
                        if (!elements.contains(obj)) {
                            this.f23159p[A] = obj;
                            A++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    p.M1(this.f23159p, null, A, A2);
                } else {
                    int length = this.f23159p.length;
                    boolean z6 = false;
                    int i6 = i5;
                    while (i5 < length) {
                        Object[] objArr = this.f23159p;
                        Object obj2 = objArr[i5];
                        objArr[i5] = null;
                        if (!elements.contains(obj2)) {
                            this.f23159p[i6] = obj2;
                            i6++;
                        } else {
                            z6 = true;
                        }
                        i5++;
                    }
                    A = A(i6);
                    for (int i7 = 0; i7 < A2; i7++) {
                        Object[] objArr2 = this.f23159p;
                        Object obj3 = objArr2[i7];
                        objArr2[i7] = null;
                        if (!elements.contains(obj3)) {
                            this.f23159p[A] = obj3;
                            A = t(A);
                        } else {
                            z6 = true;
                        }
                    }
                    z5 = z6;
                }
                if (z5) {
                    this.f23160q = z(A - this.f23158o);
                }
            }
        }
        return z5;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("滽"));
        }
        Object[] objArr = this.f23159p;
        int i5 = this.f23158o;
        E e6 = (E) objArr[i5];
        objArr[i5] = null;
        this.f23158o = t(i5);
        this.f23160q = getF23160q() - 1;
        return e6;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("滾"));
        }
        int A = A(this.f23158o + a0.J(this));
        Object[] objArr = this.f23159p;
        E e6 = (E) objArr[A];
        objArr[A] = null;
        this.f23160q = getF23160q() - 1;
        return e6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@d5.d Collection<? extends Object> elements) {
        int A;
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("滿"));
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty()) {
            if ((this.f23159p.length == 0) == false) {
                int A2 = A(getF23160q() + this.f23158o);
                int i5 = this.f23158o;
                if (i5 < A2) {
                    A = i5;
                    while (i5 < A2) {
                        Object obj = this.f23159p[i5];
                        if (elements.contains(obj)) {
                            this.f23159p[A] = obj;
                            A++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    p.M1(this.f23159p, null, A, A2);
                } else {
                    int length = this.f23159p.length;
                    boolean z6 = false;
                    int i6 = i5;
                    while (i5 < length) {
                        Object[] objArr = this.f23159p;
                        Object obj2 = objArr[i5];
                        objArr[i5] = null;
                        if (elements.contains(obj2)) {
                            this.f23159p[i6] = obj2;
                            i6++;
                        } else {
                            z6 = true;
                        }
                        i5++;
                    }
                    A = A(i6);
                    for (int i7 = 0; i7 < A2; i7++) {
                        Object[] objArr2 = this.f23159p;
                        Object obj3 = objArr2[i7];
                        objArr2[i7] = null;
                        if (elements.contains(obj3)) {
                            this.f23159p[A] = obj3;
                            A = t(A);
                        } else {
                            z6 = true;
                        }
                    }
                    z5 = z6;
                }
                if (z5) {
                    this.f23160q = z(A - this.f23158o);
                }
            }
        }
        return z5;
    }

    @d5.e
    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f23159p[this.f23158o];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        AbstractList.f23126o.b(index, getF23160q());
        int A = A(this.f23158o + index);
        Object[] objArr = this.f23159p;
        E e6 = (E) objArr[A];
        objArr[A] = element;
        return e6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @d5.d
    public Object[] toArray() {
        return toArray(new Object[getF23160q()]);
    }

    public final void x(@d5.d q3.p<? super Integer, ? super Object[], m2> pVar) {
        int i5;
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("漁"));
        pVar.g0(Integer.valueOf((isEmpty() || (i5 = this.f23158o) < A(getF23160q() + this.f23158o)) ? this.f23158o : i5 - this.f23159p.length), toArray());
    }

    @d5.e
    public final E y() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f23159p[A(this.f23158o + a0.J(this))];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        AbstractList.f23126o.c(index, getF23160q());
        if (index == getF23160q()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        q(getF23160q() + 1);
        int A = A(this.f23158o + index);
        if (index < ((getF23160q() + 1) >> 1)) {
            int p5 = p(A);
            int p6 = p(this.f23158o);
            int i5 = this.f23158o;
            if (p5 >= i5) {
                Object[] objArr = this.f23159p;
                objArr[p6] = objArr[i5];
                p.B0(objArr, objArr, i5, i5 + 1, p5 + 1);
            } else {
                Object[] objArr2 = this.f23159p;
                p.B0(objArr2, objArr2, i5 - 1, i5, objArr2.length);
                Object[] objArr3 = this.f23159p;
                objArr3[objArr3.length - 1] = objArr3[0];
                p.B0(objArr3, objArr3, 0, 1, p5 + 1);
            }
            this.f23159p[p5] = element;
            this.f23158o = p6;
        } else {
            int A2 = A(getF23160q() + this.f23158o);
            if (A < A2) {
                Object[] objArr4 = this.f23159p;
                p.B0(objArr4, objArr4, A + 1, A, A2);
            } else {
                Object[] objArr5 = this.f23159p;
                p.B0(objArr5, objArr5, 1, 0, A2);
                Object[] objArr6 = this.f23159p;
                objArr6[0] = objArr6[objArr6.length - 1];
                p.B0(objArr6, objArr6, A + 1, A, objArr6.length - 1);
            }
            this.f23159p[A] = element;
        }
        this.f23160q = getF23160q() + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @d5.d
    public <T> T[] toArray(@d5.d T[] array) {
        kotlin.jvm.internal.l0.p(array, ProtectedSandApp.s("漀"));
        if (array.length < getF23160q()) {
            array = (T[]) m.a(array, getF23160q());
        }
        int A = A(getF23160q() + this.f23158o);
        int i5 = this.f23158o;
        if (i5 < A) {
            p.K0(this.f23159p, array, 0, i5, A, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f23159p;
            p.B0(objArr, array, 0, this.f23158o, objArr.length);
            Object[] objArr2 = this.f23159p;
            p.B0(objArr2, array, objArr2.length - this.f23158o, 0, A);
        }
        return (T[]) z.n(getF23160q(), array);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @d5.d Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("滸"));
        AbstractList.f23126o.c(index, getF23160q());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == getF23160q()) {
            return addAll(elements);
        }
        q(elements.size() + getF23160q());
        int A = A(getF23160q() + this.f23158o);
        int A2 = A(this.f23158o + index);
        int size = elements.size();
        if (index < ((getF23160q() + 1) >> 1)) {
            int i5 = this.f23158o;
            int i6 = i5 - size;
            if (A2 < i5) {
                Object[] objArr = this.f23159p;
                p.B0(objArr, objArr, i6, i5, objArr.length);
                if (size >= A2) {
                    Object[] objArr2 = this.f23159p;
                    p.B0(objArr2, objArr2, objArr2.length - size, 0, A2);
                } else {
                    Object[] objArr3 = this.f23159p;
                    p.B0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f23159p;
                    p.B0(objArr4, objArr4, 0, size, A2);
                }
            } else if (i6 >= 0) {
                Object[] objArr5 = this.f23159p;
                p.B0(objArr5, objArr5, i6, i5, A2);
            } else {
                Object[] objArr6 = this.f23159p;
                i6 += objArr6.length;
                int i7 = A2 - i5;
                int length = objArr6.length - i6;
                if (length >= i7) {
                    p.B0(objArr6, objArr6, i6, i5, A2);
                } else {
                    p.B0(objArr6, objArr6, i6, i5, i5 + length);
                    Object[] objArr7 = this.f23159p;
                    p.B0(objArr7, objArr7, 0, this.f23158o + length, A2);
                }
            }
            this.f23158o = i6;
            g(z(A2 - size), elements);
        } else {
            int i8 = A2 + size;
            if (A2 < A) {
                int i9 = size + A;
                Object[] objArr8 = this.f23159p;
                if (i9 <= objArr8.length) {
                    p.B0(objArr8, objArr8, i8, A2, A);
                } else if (i8 >= objArr8.length) {
                    p.B0(objArr8, objArr8, i8 - objArr8.length, A2, A);
                } else {
                    int length2 = A - (i9 - objArr8.length);
                    p.B0(objArr8, objArr8, 0, length2, A);
                    Object[] objArr9 = this.f23159p;
                    p.B0(objArr9, objArr9, i8, A2, length2);
                }
            } else {
                Object[] objArr10 = this.f23159p;
                p.B0(objArr10, objArr10, size, 0, A);
                Object[] objArr11 = this.f23159p;
                if (i8 >= objArr11.length) {
                    p.B0(objArr11, objArr11, i8 - objArr11.length, A2, objArr11.length);
                } else {
                    p.B0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f23159p;
                    p.B0(objArr12, objArr12, i8, A2, objArr12.length - size);
                }
            }
            g(A2, elements);
        }
        return true;
    }

    public ArrayDeque() {
        this.f23159p = f23156s;
    }

    public ArrayDeque(@d5.d Collection<? extends E> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("滵"));
        Object[] array = collection.toArray(new Object[0]);
        this.f23159p = array;
        this.f23160q = array.length;
        if (array.length == 0) {
            this.f23159p = f23156s;
        }
    }
}
