package androidx.core.util;

import android.util.SparseLongArray;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: SparseLongArray.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0087\b\u001a&\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\bø\u0001\u0000\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0003*\u00020\u0000H\u0087\b\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007\u001aH\u0010\u0019\u001a\u00020\u0007*\u00020\u000026\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\u0087\bø\u0001\u0000\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0007\u001a\f\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0007\"\u0016\u0010 \u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"Landroid/util/SparseLongArray;", "", "key", "", "a", "", "value", "Lkotlin/m2;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "Lkotlin/collections/x0;", "j", "Lkotlin/collections/y0;", "o", "g", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class y {

    /* compiled from: SparseLongArray.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/core/util/y$a", "Lkotlin/collections/x0;", "", "hasNext", "", "nextInt", "o", "I", "a", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends IntIterator {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f5298p;

        a(SparseLongArray sparseLongArray) {
            this.f5298p = sparseLongArray;
        }

        /* renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void d(int i5) {
            this.index = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f5298p.size();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseLongArray sparseLongArray = this.f5298p;
            int i5 = this.index;
            this.index = i5 + 1;
            return sparseLongArray.keyAt(i5);
        }
    }

    /* compiled from: SparseLongArray.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/y$b", "Lkotlin/collections/y0;", "", "hasNext", "", "nextLong", "", "o", "I", "a", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends LongIterator {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f5300p;

        b(SparseLongArray sparseLongArray) {
            this.f5300p = sparseLongArray;
        }

        /* renamed from: a, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void d(int i5) {
            this.index = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f5300p.size();
        }

        @Override // kotlin.collections.LongIterator
        public long nextLong() {
            SparseLongArray sparseLongArray = this.f5300p;
            int i5 = this.index;
            this.index = i5 + 1;
            return sparseLongArray.valueAt(i5);
        }
    }

    @x0(18)
    public static final boolean a(@d5.d SparseLongArray sparseLongArray, int i5) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i5) >= 0;
    }

    @x0(18)
    public static final boolean b(@d5.d SparseLongArray sparseLongArray, int i5) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i5) >= 0;
    }

    @x0(18)
    public static final boolean c(@d5.d SparseLongArray sparseLongArray, long j5) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j5) >= 0;
    }

    @x0(18)
    public static final void d(@d5.d SparseLongArray sparseLongArray, @d5.d q3.p<? super Integer, ? super Long, m2> action) {
        l0.p(sparseLongArray, "<this>");
        l0.p(action, "action");
        int size = sparseLongArray.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            action.g0(Integer.valueOf(sparseLongArray.keyAt(i5)), Long.valueOf(sparseLongArray.valueAt(i5)));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    @x0(18)
    public static final long e(@d5.d SparseLongArray sparseLongArray, int i5, long j5) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.get(i5, j5);
    }

    @x0(18)
    public static final long f(@d5.d SparseLongArray sparseLongArray, int i5, @d5.d q3.a<Long> defaultValue) {
        l0.p(sparseLongArray, "<this>");
        l0.p(defaultValue, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i5);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : defaultValue.n().longValue();
    }

    @x0(18)
    public static final int g(@d5.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @x0(18)
    public static final boolean h(@d5.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    @x0(18)
    public static final boolean i(@d5.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    @x0(18)
    @d5.d
    public static final IntIterator j(@d5.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return new a(sparseLongArray);
    }

    @x0(18)
    @d5.d
    public static final SparseLongArray k(@d5.d SparseLongArray sparseLongArray, @d5.d SparseLongArray other) {
        l0.p(sparseLongArray, "<this>");
        l0.p(other, "other");
        SparseLongArray sparseLongArray2 = new SparseLongArray(other.size() + sparseLongArray.size());
        l(sparseLongArray2, sparseLongArray);
        l(sparseLongArray2, other);
        return sparseLongArray2;
    }

    @x0(18)
    public static final void l(@d5.d SparseLongArray sparseLongArray, @d5.d SparseLongArray other) {
        l0.p(sparseLongArray, "<this>");
        l0.p(other, "other");
        int size = other.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            sparseLongArray.put(other.keyAt(i5), other.valueAt(i5));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    @x0(18)
    public static final boolean m(@d5.d SparseLongArray sparseLongArray, int i5, long j5) {
        l0.p(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i5);
        if (indexOfKey < 0 || j5 != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @x0(18)
    public static final void n(@d5.d SparseLongArray sparseLongArray, int i5, long j5) {
        l0.p(sparseLongArray, "<this>");
        sparseLongArray.put(i5, j5);
    }

    @x0(18)
    @d5.d
    public static final LongIterator o(@d5.d SparseLongArray sparseLongArray) {
        l0.p(sparseLongArray, "<this>");
        return new b(sparseLongArray);
    }
}
