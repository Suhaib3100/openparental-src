package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlidingWindow.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0006J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010#J'\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0082\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "filledSize", "([Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "<set-?>", "size", "getSize", "()I", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "expanded", "maxCapacity", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
/* renamed from: kotlin.collections.n1, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final Object[] f23174q;

    /* renamed from: r, reason: collision with root package name */
    private final int f23175r;

    /* renamed from: s, reason: collision with root package name */
    private int f23176s;

    /* renamed from: t, reason: collision with root package name */
    private int f23177t;

    /* compiled from: SlidingWindow.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"kotlin/collections/RingBuffer$iterator$1", "Lkotlin/collections/AbstractIterator;", "count", "", "index", "computeNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
    /* renamed from: kotlin.collections.n1$a */
    public static final class a extends AbstractIterator<T> {

        /* renamed from: q, reason: collision with root package name */
        private int f23178q;

        /* renamed from: r, reason: collision with root package name */
        private int f23179r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ RingBuffer<T> f23180s;

        a(RingBuffer<T> ringBuffer) {
            this.f23180s = ringBuffer;
            this.f23178q = ringBuffer.getF23177t();
            this.f23179r = ((RingBuffer) ringBuffer).f23176s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractIterator
        protected void a() {
            if (this.f23178q == 0) {
                d();
                return;
            }
            f(((RingBuffer) this.f23180s).f23174q[this.f23179r]);
            this.f23179r = (this.f23179r + 1) % ((RingBuffer) this.f23180s).f23175r;
            this.f23178q--;
        }
    }

    public RingBuffer(@d5.d Object[] objArr, int i5) {
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("綂"));
        this.f23174q = objArr;
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("綅"), i5).toString());
        }
        if (i5 <= objArr.length) {
            this.f23175r = objArr.length;
            this.f23177t = i5;
        } else {
            StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("綃"), i5, ProtectedSandApp.s("綄"));
            a6.append(objArr.length);
            throw new IllegalArgumentException(a6.toString().toString());
        }
    }

    private final int r(int i5, int i6) {
        return (i5 + i6) % this.f23175r;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: b, reason: from getter */
    public int getF23177t() {
        return this.f23177t;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int index) {
        AbstractList.f23126o.b(index, getF23177t());
        return (T) this.f23174q[(this.f23176s + index) % this.f23175r];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    @d5.d
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void p(T t5) {
        if (s()) {
            throw new IllegalStateException(ProtectedSandApp.s("綆"));
        }
        this.f23174q[(this.f23176s + getF23177t()) % this.f23175r] = t5;
        this.f23177t = getF23177t() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public final RingBuffer<T> q(int i5) {
        Object[] array;
        int i6 = this.f23175r;
        int i7 = i6 + (i6 >> 1) + 1;
        if (i7 <= i5) {
            i5 = i7;
        }
        if (this.f23176s == 0) {
            array = Arrays.copyOf(this.f23174q, i5);
            kotlin.jvm.internal.l0.o(array, ProtectedSandApp.s("綇"));
        } else {
            array = toArray(new Object[i5]);
        }
        return new RingBuffer<>(array, getF23177t());
    }

    public final boolean s() {
        return getF23177t() == this.f23175r;
    }

    public final void t(int i5) {
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("綊"), i5).toString());
        }
        if (!(i5 <= getF23177t())) {
            StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("綈"), i5, ProtectedSandApp.s("綉"));
            a6.append(getF23177t());
            throw new IllegalArgumentException(a6.toString().toString());
        }
        if (i5 > 0) {
            int i6 = this.f23176s;
            int i7 = this.f23175r;
            int i8 = (i6 + i5) % i7;
            if (i6 > i8) {
                p.M1(this.f23174q, null, i6, i7);
                p.M1(this.f23174q, null, 0, i8);
            } else {
                p.M1(this.f23174q, null, i6, i8);
            }
            this.f23176s = i8;
            this.f23177t = getF23177t() - i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @d5.d
    public Object[] toArray() {
        return toArray(new Object[getF23177t()]);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @d5.d
    public <T> T[] toArray(@d5.d T[] array) {
        kotlin.jvm.internal.l0.p(array, ProtectedSandApp.s("綋"));
        int length = array.length;
        Object[] objArr = array;
        if (length < getF23177t()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, getF23177t());
            kotlin.jvm.internal.l0.o(objArr2, ProtectedSandApp.s("綌"));
            objArr = objArr2;
        }
        int f23177t = getF23177t();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = this.f23176s; i6 < f23177t && i7 < this.f23175r; i7++) {
            objArr[i6] = this.f23174q[i7];
            i6++;
        }
        while (i6 < f23177t) {
            objArr[i6] = this.f23174q[i5];
            i6++;
            i5++;
        }
        return (T[]) z.n(f23177t, objArr);
    }

    public RingBuffer(int i5) {
        this(new Object[i5], 0);
    }
}
