package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: SlidingWindow.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rJ\u001c\u0010\u000f\u001a\u00020\b*\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0014¢\u0006\u0004\b\u001b\u0010\u001dJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R$\u00100\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lkotlin/collections/k1;", "T", "Lkotlin/collections/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "", "buffer", "", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "n", "l", "(II)I", "index", "get", "(I)Ljava/lang/Object;", "", "c1", "()Z", "", "iterator", "()Ljava/util/Iterator;", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "maxCapacity", "j", "(I)Lkotlin/collections/k1;", "element", "Lkotlin/k2;", "i", "(Ljava/lang/Object;)V", "m", "d", "[Ljava/lang/Object;", "e", "I", "f", "startIndex", "<set-?>", "g", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
/* loaded from: classes7.dex */
final class k1<T> extends c<T> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] buffer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int startIndex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* compiled from: SlidingWindow.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"kotlin/collections/k1$a", "Lkotlin/collections/b;", "Lkotlin/k2;", "b", "()V", "", "d", "I", "count", "e", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
    public static final class a extends b<T> {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int count;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k1<T> f74938f;

        a(k1<T> k1Var) {
            this.f74938f = k1Var;
            this.count = k1Var.getSize();
            this.index = ((k1) k1Var).startIndex;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.b
        protected void b() {
            if (this.count == 0) {
                c();
                return;
            }
            d(((k1) this.f74938f).buffer[this.index]);
            this.index = (this.index + 1) % ((k1) this.f74938f).capacity;
            this.count--;
        }
    }

    public k1(@fg.l Object[] objArr, int i4) {
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("憏\u0001"));
        this.buffer = objArr;
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("憒\u0001"), i4).toString());
        }
        if (i4 <= objArr.length) {
            this.capacity = objArr.length;
            this.size = i4;
        } else {
            StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("憐\u0001"), i4, ProtectedSandApp.s("憑\u0001"));
            a5.append(objArr.length);
            throw new IllegalArgumentException(a5.toString().toString());
        }
    }

    private final int l(int i4, int i5) {
        return (i4 + i5) % this.capacity;
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public final boolean c1() {
        return getSize() == this.capacity;
    }

    @Override // kotlin.collections.c, java.util.List
    public T get(int index) {
        c.INSTANCE.b(index, getSize());
        return (T) this.buffer[(this.startIndex + index) % this.capacity];
    }

    public final void i(T element) {
        if (c1()) {
            throw new IllegalStateException(ProtectedSandApp.s("憓\u0001"));
        }
        this.buffer[(this.startIndex + getSize()) % this.capacity] = element;
        this.size = getSize() + 1;
    }

    @Override // kotlin.collections.c, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @fg.l
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final k1<T> j(int maxCapacity) {
        Object[] array;
        int i4 = this.capacity;
        int i5 = i4 + (i4 >> 1) + 1;
        if (i5 <= maxCapacity) {
            maxCapacity = i5;
        }
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, maxCapacity);
            kotlin.jvm.internal.l0.o(array, ProtectedSandApp.s("憔\u0001"));
        } else {
            array = toArray(new Object[maxCapacity]);
        }
        return new k1<>(array, getSize());
    }

    public final void m(int n4) {
        if (n4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("憗\u0001"), n4).toString());
        }
        if (n4 > getSize()) {
            StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("憕\u0001"), n4, ProtectedSandApp.s("憖\u0001"));
            a5.append(getSize());
            throw new IllegalArgumentException(a5.toString().toString());
        }
        if (n4 > 0) {
            int i4 = this.startIndex;
            int i5 = this.capacity;
            int i6 = (i4 + n4) % i5;
            if (i4 > i6) {
                o.M1(this.buffer, null, i4, i5);
                o.M1(this.buffer, null, 0, i6);
            } else {
                o.M1(this.buffer, null, i4, i6);
            }
            this.startIndex = i6;
            this.size = getSize() - n4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.a, java.util.Collection
    @fg.l
    public Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @Override // kotlin.collections.a, java.util.Collection
    @fg.l
    public <T> T[] toArray(@fg.l T[] array) {
        kotlin.jvm.internal.l0.p(array, ProtectedSandApp.s("憘\u0001"));
        int length = array.length;
        Object[] objArr = array;
        if (length < getSize()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, getSize());
            kotlin.jvm.internal.l0.o(objArr2, ProtectedSandApp.s("憔\u0001"));
            objArr = objArr2;
        }
        int size = getSize();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = this.startIndex; i5 < size && i6 < this.capacity; i6++) {
            objArr[i5] = this.buffer[i6];
            i5++;
        }
        while (i5 < size) {
            objArr[i5] = this.buffer[i4];
            i5++;
            i4++;
        }
        return (T[]) x.n(size, objArr);
    }

    public k1(int i4) {
        this(new Object[i4], 0);
    }
}
