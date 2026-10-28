package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.o2;

/* compiled from: ArrayDeque.kt */
@o2(markerClass = {kotlin.r.class})
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 Z*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001[B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0083\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0083\b¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J%\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001f\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082\b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00028\u0000¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b'\u0010$J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00028\u0000¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00028\u0000¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00028\u0000¢\u0006\u0004\b,\u0010$J\u000f\u0010-\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b-\u0010$J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010$J\u000f\u0010/\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b/\u0010$J\u0017\u00100\u001a\u00020\u001d2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00102J\u001d\u00103\u001a\u00020\u001d2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b3\u00104J%\u00103\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b3\u00105J\u0018\u00106\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b6\u0010\u0012J \u00107\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010(\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u001d2\u0006\u0010(\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b9\u00101J\u0017\u0010:\u001a\u00020\u00032\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00032\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\u001d2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\b=\u00101J\u0017\u0010>\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b>\u0010\u0012J\u001d\u0010?\u001a\u00020\u001d2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b?\u00104J\u001d\u0010@\u001a\u00020\u001d2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b@\u00104J\u000f\u0010A\u001a\u00020\fH\u0016¢\u0006\u0004\bA\u0010\u0007J)\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010C\"\u0004\b\u0001\u0010B2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0CH\u0016¢\u0006\u0004\bE\u0010HJ)\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010C\"\u0004\b\u0001\u0010B2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010CH\u0000¢\u0006\u0004\bI\u0010FJ\u0017\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0CH\u0000¢\u0006\u0004\bJ\u0010HJO\u0010P\u001a\u00020\f2>\u0010O\u001a:\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010G0C¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0KH\u0000¢\u0006\u0004\bP\u0010QR\u0016\u0010N\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001e\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010TR$\u0010Y\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bR\u0010X¨\u0006\\"}, d2 = {"Lkotlin/collections/k;", "E", "Lkotlin/collections/f;", "", "initialCapacity", "<init>", "(I)V", "()V", "", "elements", "(Ljava/util/Collection;)V", "minCapacity", "Lkotlin/k2;", "j", "newCapacity", "h", "internalIndex", "q", "(I)Ljava/lang/Object;", "index", "x", "(I)I", "w", "r", "p", "i", "f", "(ILjava/util/Collection;)V", "Lkotlin/Function1;", "", "predicate", "l", "(Lld/l;)Z", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "m", "last", "v", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "A", "removeLast", "D", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "c", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "G", "F", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "head", "structure", "s", "(Lld/p;)V", "b", "I", "[Ljava/lang/Object;", "elementData", "<set-?>", "d", "()I", "size", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.c1(version = "1.4")
@kotlin.jvm.internal.r1({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,569:1\n467#1,51:572\n467#1,51:623\n37#2,2:570\n26#3:674\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:572,51\n464#1:623,51\n47#1:570,2\n559#1:674\n*E\n"})
/* loaded from: classes7.dex */
public final class k<E> extends f<E> {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final Object[] f74925f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    private static final int f74926g = 10;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] elementData;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    public k(int i4) {
        Object[] objArr;
        if (i4 == 0) {
            objArr = f74925f;
        } else {
            if (i4 <= 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("憙\u0001"), i4));
            }
            objArr = new Object[i4];
        }
        this.elementData = objArr;
    }

    private final void f(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i4 = this.head;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.elementData[i5] = it.next();
        }
        this.size = elements.size() + getSize();
    }

    private final void h(int newCapacity) {
        Object[] objArr = new Object[newCapacity];
        Object[] objArr2 = this.elementData;
        o.B0(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i4 = this.head;
        o.B0(objArr3, objArr, length - i4, 0, i4);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int i(int index) {
        return index == 0 ? r.we(this.elementData) : index - 1;
    }

    private final void j(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException(ProtectedSandApp.s("憛\u0001"));
        }
        Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr != f74925f) {
            h(c.INSTANCE.e(objArr.length, minCapacity));
            return;
        }
        if (minCapacity < 10) {
            minCapacity = 10;
        }
        this.elementData = new Object[minCapacity];
    }

    private final boolean l(ld.l<? super E, Boolean> predicate) {
        int x4;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int x5 = x(getSize() + this.head);
            int i4 = this.head;
            if (i4 < x5) {
                x4 = i4;
                while (i4 < x5) {
                    Object obj = this.elementData[i4];
                    if (predicate.invoke(obj).booleanValue()) {
                        this.elementData[x4] = obj;
                        x4++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                o.M1(this.elementData, null, x4, x5);
            } else {
                int length = this.elementData.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (predicate.invoke(obj2).booleanValue()) {
                        this.elementData[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                x4 = x(i5);
                for (int i6 = 0; i6 < x5; i6++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (predicate.invoke(obj3).booleanValue()) {
                        this.elementData[x4] = obj3;
                        x4 = p(x4);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                this.size = w(x4 - this.head);
            }
        }
        return z4;
    }

    private final int p(int index) {
        if (index == r.we(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    @kotlin.internal.f
    private final E q(int internalIndex) {
        return (E) this.elementData[internalIndex];
    }

    @kotlin.internal.f
    private final int r(int index) {
        return x(this.head + index);
    }

    private final int w(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    private final int x(int index) {
        Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    @fg.m
    public final E A() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @fg.m
    public final E D() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @fg.l
    public final Object[] F() {
        return toArray();
    }

    @fg.l
    public final <T> T[] G(@fg.l T[] array) {
        kotlin.jvm.internal.l0.p(array, ProtectedSandApp.s("憜\u0001"));
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@fg.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("憚\u0001"));
        if (elements.isEmpty()) {
            return false;
        }
        j(elements.size() + getSize());
        f(x(getSize() + this.head), elements);
        return true;
    }

    public final void addFirst(E element) {
        j(getSize() + 1);
        int i4 = i(this.head);
        this.head = i4;
        this.elementData[i4] = element;
        this.size = getSize() + 1;
    }

    public final void addLast(E element) {
        j(getSize() + 1);
        this.elementData[x(getSize() + this.head)] = element;
        this.size = getSize() + 1;
    }

    @Override // kotlin.collections.f
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.f
    public E c(int index) {
        c.INSTANCE.b(index, getSize());
        if (index == y.J(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        int x4 = x(this.head + index);
        E e4 = (E) this.elementData[x4];
        if (index < (getSize() >> 1)) {
            int i4 = this.head;
            if (x4 >= i4) {
                Object[] objArr = this.elementData;
                o.B0(objArr, objArr, i4 + 1, i4, x4);
            } else {
                Object[] objArr2 = this.elementData;
                o.B0(objArr2, objArr2, 1, 0, x4);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i5 = this.head;
                o.B0(objArr3, objArr3, i5 + 1, i5, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i6 = this.head;
            objArr4[i6] = null;
            this.head = p(i6);
        } else {
            int x5 = x(this.head + y.J(this));
            if (x4 <= x5) {
                Object[] objArr5 = this.elementData;
                o.B0(objArr5, objArr5, x4, x4 + 1, x5 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                o.B0(objArr6, objArr6, x4, x4 + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                o.B0(objArr7, objArr7, 0, 1, x5 + 1);
            }
            this.elementData[x5] = null;
        }
        this.size = getSize() - 1;
        return e4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int x4 = x(getSize() + this.head);
        int i4 = this.head;
        if (i4 < x4) {
            o.M1(this.elementData, null, i4, x4);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            o.M1(objArr, null, this.head, objArr.length);
            o.M1(this.elementData, null, 0, x4);
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("憝\u0001"));
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        c.INSTANCE.b(index, getSize());
        return (E) this.elementData[x(this.head + index)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i4;
        int x4 = x(getSize() + this.head);
        int i5 = this.head;
        if (i5 < x4) {
            while (i5 < x4) {
                if (kotlin.jvm.internal.l0.g(element, this.elementData[i5])) {
                    i4 = this.head;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < x4) {
            return -1;
        }
        int length = this.elementData.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < x4; i6++) {
                    if (kotlin.jvm.internal.l0.g(element, this.elementData[i6])) {
                        i5 = i6 + this.elementData.length;
                        i4 = this.head;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.l0.g(element, this.elementData[i5])) {
                i4 = this.head;
                break;
            }
            i5++;
        }
        return i5 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return getSize() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("憝\u0001"));
        }
        return (E) this.elementData[x(this.head + y.J(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int we2;
        int i4;
        int x4 = x(getSize() + this.head);
        int i5 = this.head;
        if (i5 < x4) {
            we2 = x4 - 1;
            if (i5 <= we2) {
                while (!kotlin.jvm.internal.l0.g(element, this.elementData[we2])) {
                    if (we2 != i5) {
                        we2--;
                    }
                }
                i4 = this.head;
                return we2 - i4;
            }
            return -1;
        }
        if (i5 > x4) {
            int i6 = x4 - 1;
            while (true) {
                if (-1 >= i6) {
                    we2 = r.we(this.elementData);
                    int i7 = this.head;
                    if (i7 <= we2) {
                        while (!kotlin.jvm.internal.l0.g(element, this.elementData[we2])) {
                            if (we2 != i7) {
                                we2--;
                            }
                        }
                        i4 = this.head;
                    }
                } else {
                    if (kotlin.jvm.internal.l0.g(element, this.elementData[i6])) {
                        we2 = i6 + this.elementData.length;
                        i4 = this.head;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    @fg.m
    public final E m() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int indexOf = indexOf(element);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@fg.l Collection<? extends Object> elements) {
        int x4;
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("憚\u0001"));
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int x5 = x(getSize() + this.head);
            int i4 = this.head;
            if (i4 < x5) {
                x4 = i4;
                while (i4 < x5) {
                    Object obj = this.elementData[i4];
                    if (elements.contains(obj)) {
                        z4 = true;
                    } else {
                        this.elementData[x4] = obj;
                        x4++;
                    }
                    i4++;
                }
                o.M1(this.elementData, null, x4, x5);
            } else {
                int length = this.elementData.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (elements.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.elementData[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                x4 = x(i5);
                for (int i6 = 0; i6 < x5; i6++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.elementData[x4] = obj3;
                        x4 = p(x4);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                this.size = w(x4 - this.head);
            }
        }
        return z4;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("憝\u0001"));
        }
        Object[] objArr = this.elementData;
        int i4 = this.head;
        E e4 = (E) objArr[i4];
        objArr[i4] = null;
        this.head = p(i4);
        this.size = getSize() - 1;
        return e4;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("憝\u0001"));
        }
        int x4 = x(this.head + y.J(this));
        Object[] objArr = this.elementData;
        E e4 = (E) objArr[x4];
        objArr[x4] = null;
        this.size = getSize() - 1;
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@fg.l Collection<? extends Object> elements) {
        int x4;
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("憚\u0001"));
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int x5 = x(getSize() + this.head);
            int i4 = this.head;
            if (i4 < x5) {
                x4 = i4;
                while (i4 < x5) {
                    Object obj = this.elementData[i4];
                    if (elements.contains(obj)) {
                        this.elementData[x4] = obj;
                        x4++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                o.M1(this.elementData, null, x4, x5);
            } else {
                int length = this.elementData.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                x4 = x(i5);
                for (int i6 = 0; i6 < x5; i6++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[x4] = obj3;
                        x4 = p(x4);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                this.size = w(x4 - this.head);
            }
        }
        return z4;
    }

    public final void s(@fg.l ld.p<? super Integer, ? super Object[], k2> structure) {
        int i4;
        kotlin.jvm.internal.l0.p(structure, ProtectedSandApp.s("憞\u0001"));
        structure.invoke(Integer.valueOf((isEmpty() || (i4 = this.head) < x(getSize() + this.head)) ? this.head : i4 - this.elementData.length), toArray());
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        c.INSTANCE.b(index, getSize());
        int x4 = x(this.head + index);
        Object[] objArr = this.elementData;
        E e4 = (E) objArr[x4];
        objArr[x4] = element;
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @fg.l
    public Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @fg.m
    public final E v() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[x(this.head + y.J(this))];
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        c.INSTANCE.c(index, getSize());
        if (index == getSize()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        j(getSize() + 1);
        int x4 = x(this.head + index);
        if (index < ((getSize() + 1) >> 1)) {
            int i4 = i(x4);
            int i5 = i(this.head);
            int i6 = this.head;
            if (i4 >= i6) {
                Object[] objArr = this.elementData;
                objArr[i5] = objArr[i6];
                o.B0(objArr, objArr, i6, i6 + 1, i4 + 1);
            } else {
                Object[] objArr2 = this.elementData;
                o.B0(objArr2, objArr2, i6 - 1, i6, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                o.B0(objArr3, objArr3, 0, 1, i4 + 1);
            }
            this.elementData[i4] = element;
            this.head = i5;
        } else {
            int x5 = x(getSize() + this.head);
            if (x4 < x5) {
                Object[] objArr4 = this.elementData;
                o.B0(objArr4, objArr4, x4 + 1, x4, x5);
            } else {
                Object[] objArr5 = this.elementData;
                o.B0(objArr5, objArr5, 1, 0, x5);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                o.B0(objArr6, objArr6, x4 + 1, x4, objArr6.length - 1);
            }
            this.elementData[x4] = element;
        }
        this.size = getSize() + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @fg.l
    public <T> T[] toArray(@fg.l T[] array) {
        kotlin.jvm.internal.l0.p(array, ProtectedSandApp.s("憜\u0001"));
        if (array.length < getSize()) {
            array = (T[]) m.a(array, getSize());
        }
        int x4 = x(getSize() + this.head);
        int i4 = this.head;
        if (i4 < x4) {
            o.K0(this.elementData, array, 0, i4, x4, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            o.B0(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            o.B0(objArr2, array, objArr2.length - this.head, 0, x4);
        }
        return (T[]) x.n(getSize(), array);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @fg.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, ProtectedSandApp.s("憚\u0001"));
        c.INSTANCE.c(index, getSize());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == getSize()) {
            return addAll(elements);
        }
        j(elements.size() + getSize());
        int x4 = x(getSize() + this.head);
        int x5 = x(this.head + index);
        int size = elements.size();
        if (index < ((getSize() + 1) >> 1)) {
            int i4 = this.head;
            int i5 = i4 - size;
            if (x5 < i4) {
                Object[] objArr = this.elementData;
                o.B0(objArr, objArr, i5, i4, objArr.length);
                if (size >= x5) {
                    Object[] objArr2 = this.elementData;
                    o.B0(objArr2, objArr2, objArr2.length - size, 0, x5);
                } else {
                    Object[] objArr3 = this.elementData;
                    o.B0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    o.B0(objArr4, objArr4, 0, size, x5);
                }
            } else if (i5 >= 0) {
                Object[] objArr5 = this.elementData;
                o.B0(objArr5, objArr5, i5, i4, x5);
            } else {
                Object[] objArr6 = this.elementData;
                i5 += objArr6.length;
                int i6 = x5 - i4;
                int length = objArr6.length - i5;
                if (length >= i6) {
                    o.B0(objArr6, objArr6, i5, i4, x5);
                } else {
                    o.B0(objArr6, objArr6, i5, i4, i4 + length);
                    Object[] objArr7 = this.elementData;
                    o.B0(objArr7, objArr7, 0, this.head + length, x5);
                }
            }
            this.head = i5;
            f(w(x5 - size), elements);
        } else {
            int i7 = x5 + size;
            if (x5 < x4) {
                int i10 = size + x4;
                Object[] objArr8 = this.elementData;
                if (i10 <= objArr8.length) {
                    o.B0(objArr8, objArr8, i7, x5, x4);
                } else if (i7 >= objArr8.length) {
                    o.B0(objArr8, objArr8, i7 - objArr8.length, x5, x4);
                } else {
                    int length2 = x4 - (i10 - objArr8.length);
                    o.B0(objArr8, objArr8, 0, length2, x4);
                    Object[] objArr9 = this.elementData;
                    o.B0(objArr9, objArr9, i7, x5, length2);
                }
            } else {
                Object[] objArr10 = this.elementData;
                o.B0(objArr10, objArr10, size, 0, x4);
                Object[] objArr11 = this.elementData;
                if (i7 >= objArr11.length) {
                    o.B0(objArr11, objArr11, i7 - objArr11.length, x5, objArr11.length);
                } else {
                    o.B0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    o.B0(objArr12, objArr12, i7, x5, objArr12.length - size);
                }
            }
            f(x5, elements);
        }
        return true;
    }

    public k() {
        this.elementData = f74925f;
    }

    public k(@fg.l Collection<? extends E> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("憚\u0001"));
        Object[] array = collection.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = f74925f;
        }
    }
}
