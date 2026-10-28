package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: SparseArray.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a-\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aT\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\u0086\bø\u0001\u0000\u001a\u0016\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\"\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"T", "Landroid/util/SparseArray;", "", "key", "", "a", "value", "Lkotlin/m2;", "n", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "other", "k", "b", "c", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/SparseArray;ILq3/a;)Ljava/lang/Object;", "h", "i", "m", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "l", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "Lkotlin/collections/x0;", "j", "", "o", "g", "(Landroid/util/SparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class v {

    /* compiled from: SparseArray.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/core/util/v$a", "Lkotlin/collections/x0;", "", "hasNext", "", "nextInt", "o", "I", "a", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends IntIterator {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f5286p;

        a(SparseArray<T> sparseArray) {
            this.f5286p = sparseArray;
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
            return this.index < this.f5286p.size();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseArray<T> sparseArray = this.f5286p;
            int i5 = this.index;
            this.index = i5 + 1;
            return sparseArray.keyAt(i5);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/core/util/v$b", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "o", "I", "a", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b<T> implements Iterator<T>, r3.a {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f5288p;

        b(SparseArray<T> sparseArray) {
            this.f5288p = sparseArray;
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
            return this.index < this.f5288p.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f5288p;
            int i5 = this.index;
            this.index = i5 + 1;
            return sparseArray.valueAt(i5);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@d5.d SparseArray<T> sparseArray, int i5) {
        l0.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i5) >= 0;
    }

    public static final <T> boolean b(@d5.d SparseArray<T> sparseArray, int i5) {
        l0.p(sparseArray, "<this>");
        return sparseArray.indexOfKey(i5) >= 0;
    }

    public static final <T> boolean c(@d5.d SparseArray<T> sparseArray, T t5) {
        l0.p(sparseArray, "<this>");
        return sparseArray.indexOfValue(t5) >= 0;
    }

    public static final <T> void d(@d5.d SparseArray<T> sparseArray, @d5.d q3.p<? super Integer, ? super T, m2> action) {
        l0.p(sparseArray, "<this>");
        l0.p(action, "action");
        int size = sparseArray.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            action.g0(Integer.valueOf(sparseArray.keyAt(i5)), sparseArray.valueAt(i5));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    public static final <T> T e(@d5.d SparseArray<T> sparseArray, int i5, T t5) {
        l0.p(sparseArray, "<this>");
        T t6 = sparseArray.get(i5);
        return t6 == null ? t5 : t6;
    }

    public static final <T> T f(@d5.d SparseArray<T> sparseArray, int i5, @d5.d q3.a<? extends T> defaultValue) {
        l0.p(sparseArray, "<this>");
        l0.p(defaultValue, "defaultValue");
        T t5 = sparseArray.get(i5);
        return t5 == null ? defaultValue.n() : t5;
    }

    public static final <T> int g(@d5.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean h(@d5.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean i(@d5.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    @d5.d
    public static final <T> IntIterator j(@d5.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return new a(sparseArray);
    }

    @d5.d
    public static final <T> SparseArray<T> k(@d5.d SparseArray<T> sparseArray, @d5.d SparseArray<T> other) {
        l0.p(sparseArray, "<this>");
        l0.p(other, "other");
        SparseArray<T> sparseArray2 = new SparseArray<>(other.size() + sparseArray.size());
        l(sparseArray2, sparseArray);
        l(sparseArray2, other);
        return sparseArray2;
    }

    public static final <T> void l(@d5.d SparseArray<T> sparseArray, @d5.d SparseArray<T> other) {
        l0.p(sparseArray, "<this>");
        l0.p(other, "other");
        int size = other.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            sparseArray.put(other.keyAt(i5), other.valueAt(i5));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    public static final <T> boolean m(@d5.d SparseArray<T> sparseArray, int i5, T t5) {
        l0.p(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i5);
        if (indexOfKey < 0 || !l0.g(t5, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void n(@d5.d SparseArray<T> sparseArray, int i5, T t5) {
        l0.p(sparseArray, "<this>");
        sparseArray.put(i5, t5);
    }

    @d5.d
    public static final <T> Iterator<T> o(@d5.d SparseArray<T> sparseArray) {
        l0.p(sparseArray, "<this>");
        return new b(sparseArray);
    }
}
