package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: SparseIntArray.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a\u001d\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0086\b\u001a&\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0086\bø\u0001\u0000\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aH\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\bø\u0001\u0000\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001b\u001a\u00020\u0019*\u00020\u0000\"\u0016\u0010\u001e\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Landroid/util/SparseIntArray;", "", "key", "", "a", "value", "Lkotlin/m2;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "Lkotlin/collections/x0;", "j", "o", "g", "(Landroid/util/SparseIntArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class x {

    /* compiled from: SparseIntArray.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/core/util/x$a", "Lkotlin/collections/x0;", "", "hasNext", "", "nextInt", "o", "I", "a", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends IntIterator {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f5294p;

        a(SparseIntArray sparseIntArray) {
            this.f5294p = sparseIntArray;
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
            return this.index < this.f5294p.size();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f5294p;
            int i5 = this.index;
            this.index = i5 + 1;
            return sparseIntArray.keyAt(i5);
        }
    }

    /* compiled from: SparseIntArray.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/core/util/x$b", "Lkotlin/collections/x0;", "", "hasNext", "", "nextInt", "o", "I", "a", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends IntIterator {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f5296p;

        b(SparseIntArray sparseIntArray) {
            this.f5296p = sparseIntArray;
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
            return this.index < this.f5296p.size();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f5296p;
            int i5 = this.index;
            this.index = i5 + 1;
            return sparseIntArray.valueAt(i5);
        }
    }

    public static final boolean a(@d5.d SparseIntArray sparseIntArray, int i5) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i5) >= 0;
    }

    public static final boolean b(@d5.d SparseIntArray sparseIntArray, int i5) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i5) >= 0;
    }

    public static final boolean c(@d5.d SparseIntArray sparseIntArray, int i5) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.indexOfValue(i5) >= 0;
    }

    public static final void d(@d5.d SparseIntArray sparseIntArray, @d5.d q3.p<? super Integer, ? super Integer, m2> action) {
        l0.p(sparseIntArray, "<this>");
        l0.p(action, "action");
        int size = sparseIntArray.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            action.g0(Integer.valueOf(sparseIntArray.keyAt(i5)), Integer.valueOf(sparseIntArray.valueAt(i5)));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    public static final int e(@d5.d SparseIntArray sparseIntArray, int i5, int i6) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.get(i5, i6);
    }

    public static final int f(@d5.d SparseIntArray sparseIntArray, int i5, @d5.d q3.a<Integer> defaultValue) {
        l0.p(sparseIntArray, "<this>");
        l0.p(defaultValue, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i5);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : defaultValue.n().intValue();
    }

    public static final int g(@d5.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean h(@d5.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.size() == 0;
    }

    public static final boolean i(@d5.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return sparseIntArray.size() != 0;
    }

    @d5.d
    public static final IntIterator j(@d5.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return new a(sparseIntArray);
    }

    @d5.d
    public static final SparseIntArray k(@d5.d SparseIntArray sparseIntArray, @d5.d SparseIntArray other) {
        l0.p(sparseIntArray, "<this>");
        l0.p(other, "other");
        SparseIntArray sparseIntArray2 = new SparseIntArray(other.size() + sparseIntArray.size());
        l(sparseIntArray2, sparseIntArray);
        l(sparseIntArray2, other);
        return sparseIntArray2;
    }

    public static final void l(@d5.d SparseIntArray sparseIntArray, @d5.d SparseIntArray other) {
        l0.p(sparseIntArray, "<this>");
        l0.p(other, "other");
        int size = other.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            sparseIntArray.put(other.keyAt(i5), other.valueAt(i5));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    public static final boolean m(@d5.d SparseIntArray sparseIntArray, int i5, int i6) {
        l0.p(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i5);
        if (indexOfKey < 0 || i6 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void n(@d5.d SparseIntArray sparseIntArray, int i5, int i6) {
        l0.p(sparseIntArray, "<this>");
        sparseIntArray.put(i5, i6);
    }

    @d5.d
    public static final IntIterator o(@d5.d SparseIntArray sparseIntArray) {
        l0.p(sparseIntArray, "<this>");
        return new b(sparseIntArray);
    }
}
