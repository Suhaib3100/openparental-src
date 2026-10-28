package androidx.collection;

import kotlin.Metadata;

/* compiled from: CircularArray.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0006J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u0011\u0010%\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010\u000fR\u0011\u0010'\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010\u000f¨\u0006("}, d2 = {"Landroidx/collection/g;", "E", "", "", "minCapacity", "<init>", "(I)V", "Lkotlin/k2;", "d", "()V", "element", "a", "(Ljava/lang/Object;)V", "b", "i", "()Ljava/lang/Object;", "j", "c", "count", "l", "k", "index", "e", "(I)Ljava/lang/Object;", "m", "()I", "", "h", "()Z", "", "[Ljava/lang/Object;", "elements", "I", "head", "tail", "capacityBitmask", "f", "first", "g", "last", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
/* loaded from: classes.dex */
public final class g<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private E[] elements;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int tail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int capacityBitmask;

    @kd.j
    public g() {
        this(0, 1, null);
    }

    private final void d() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i4 = this.head;
        int i5 = length - i4;
        int i6 = length << 1;
        if (i6 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i6];
        kotlin.collections.l.B0(eArr, eArr2, 0, i4, length);
        kotlin.collections.l.B0(this.elements, eArr2, i5, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i6 - 1;
    }

    public final void a(E element) {
        int i4 = (this.head - 1) & this.capacityBitmask;
        this.head = i4;
        this.elements[i4] = element;
        if (i4 == this.tail) {
            d();
        }
    }

    public final void b(E element) {
        E[] eArr = this.elements;
        int i4 = this.tail;
        eArr[i4] = element;
        int i5 = this.capacityBitmask & (i4 + 1);
        this.tail = i5;
        if (i5 == this.head) {
            d();
        }
    }

    public final void c() {
        l(m());
    }

    public final E e(int index) {
        if (index < 0 || index >= m()) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e4 = this.elements[this.capacityBitmask & (this.head + index)];
        kotlin.jvm.internal.l0.m(e4);
        return e4;
    }

    public final E f() {
        int i4 = this.head;
        if (i4 == this.tail) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e4 = this.elements[i4];
        kotlin.jvm.internal.l0.m(e4);
        return e4;
    }

    public final E g() {
        int i4 = this.head;
        int i5 = this.tail;
        if (i4 == i5) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e4 = this.elements[(i5 - 1) & this.capacityBitmask];
        kotlin.jvm.internal.l0.m(e4);
        return e4;
    }

    public final boolean h() {
        return this.head == this.tail;
    }

    public final E i() {
        int i4 = this.head;
        if (i4 == this.tail) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e4 = eArr[i4];
        eArr[i4] = null;
        this.head = (i4 + 1) & this.capacityBitmask;
        return e4;
    }

    public final E j() {
        int i4 = this.head;
        int i5 = this.tail;
        if (i4 == i5) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.capacityBitmask & (i5 - 1);
        E[] eArr = this.elements;
        E e4 = eArr[i6];
        eArr[i6] = null;
        this.tail = i6;
        return e4;
    }

    public final void k(int count) {
        if (count <= 0) {
            return;
        }
        if (count > m()) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = this.tail;
        int i5 = count < i4 ? i4 - count : 0;
        for (int i6 = i5; i6 < i4; i6++) {
            this.elements[i6] = null;
        }
        int i7 = this.tail;
        int i10 = i7 - i5;
        int i11 = count - i10;
        this.tail = i7 - i10;
        if (i11 > 0) {
            int length = this.elements.length;
            this.tail = length;
            int i12 = length - i11;
            for (int i13 = i12; i13 < length; i13++) {
                this.elements[i13] = null;
            }
            this.tail = i12;
        }
    }

    public final void l(int count) {
        if (count <= 0) {
            return;
        }
        if (count > m()) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.elements.length;
        int i4 = this.head;
        if (count < length - i4) {
            length = i4 + count;
        }
        while (i4 < length) {
            this.elements[i4] = null;
            i4++;
        }
        int i5 = this.head;
        int i6 = length - i5;
        int i7 = count - i6;
        this.head = this.capacityBitmask & (i5 + i6);
        if (i7 > 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                this.elements[i10] = null;
            }
            this.head = i7;
        }
    }

    public final int m() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    @kd.j
    public g(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i4 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i4 = Integer.bitCount(i4) != 1 ? Integer.highestOneBit(i4 - 1) << 1 : i4;
        this.capacityBitmask = i4 - 1;
        this.elements = (E[]) new Object[i4];
    }

    public /* synthetic */ g(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 8 : i4);
    }
}
