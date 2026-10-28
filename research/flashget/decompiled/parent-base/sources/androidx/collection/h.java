package androidx.collection;

import kotlin.Metadata;

/* compiled from: CircularIntArray.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\r¨\u0006%"}, d2 = {"Landroidx/collection/h;", "", "", "minCapacity", "<init>", "(I)V", "Lkotlin/k2;", "d", "()V", "element", "a", "b", "i", "()I", "j", "c", "count", "l", "k", "index", "e", "(I)I", "m", "", "h", "()Z", "", "[I", "elements", "I", "head", "tail", "capacityBitmask", "f", "first", "g", "last", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,213:1\n1#2:214\n26#3:215\n26#3:216\n26#3:217\n26#3:218\n26#3:219\n26#3:220\n26#3:221\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n100#1:215\n113#1:216\n139#1:217\n156#1:218\n169#1:219\n181#1:220\n193#1:221\n*E\n"})
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] elements;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int tail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int capacityBitmask;

    @kd.j
    public h() {
        this(0, 1, null);
    }

    private final void d() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i4 = this.head;
        int i5 = length - i4;
        int i6 = length << 1;
        if (i6 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i6];
        kotlin.collections.l.z0(iArr, iArr2, 0, i4, length);
        kotlin.collections.l.z0(this.elements, iArr2, i5, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i6 - 1;
    }

    public final void a(int element) {
        int i4 = (this.head - 1) & this.capacityBitmask;
        this.head = i4;
        this.elements[i4] = element;
        if (i4 == this.tail) {
            d();
        }
    }

    public final void b(int element) {
        int[] iArr = this.elements;
        int i4 = this.tail;
        iArr[i4] = element;
        int i5 = this.capacityBitmask & (i4 + 1);
        this.tail = i5;
        if (i5 == this.head) {
            d();
        }
    }

    public final void c() {
        this.tail = this.head;
    }

    public final int e(int index) {
        if (index < 0 || index >= m()) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.elements[this.capacityBitmask & (this.head + index)];
    }

    public final int f() {
        int i4 = this.head;
        if (i4 != this.tail) {
            return this.elements[i4];
        }
        i iVar = i.f2253a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int g() {
        int i4 = this.head;
        int i5 = this.tail;
        if (i4 != i5) {
            return this.elements[(i5 - 1) & this.capacityBitmask];
        }
        i iVar = i.f2253a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean h() {
        return this.head == this.tail;
    }

    public final int i() {
        int i4 = this.head;
        if (i4 == this.tail) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i5 = this.elements[i4];
        this.head = (i4 + 1) & this.capacityBitmask;
        return i5;
    }

    public final int j() {
        int i4 = this.head;
        int i5 = this.tail;
        if (i4 == i5) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.capacityBitmask & (i5 - 1);
        int i7 = this.elements[i6];
        this.tail = i6;
        return i7;
    }

    public final void k(int count) {
        if (count <= 0) {
            return;
        }
        if (count > m()) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.tail = this.capacityBitmask & (this.tail - count);
    }

    public final void l(int count) {
        if (count <= 0) {
            return;
        }
        if (count > m()) {
            i iVar = i.f2253a;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.head = this.capacityBitmask & (this.head + count);
    }

    public final int m() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    @kd.j
    public h(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i4 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i4 = Integer.bitCount(i4) != 1 ? Integer.highestOneBit(i4 - 1) << 1 : i4;
        this.capacityBitmask = i4 - 1;
        this.elements = new int[i4];
    }

    public /* synthetic */ h(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 8 : i4);
    }
}
