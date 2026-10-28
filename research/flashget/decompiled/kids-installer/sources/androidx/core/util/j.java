package androidx.core.util;

import android.util.LongSparseArray;
import androidx.annotation.x0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.LongIterator;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: LongSparseArray.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b\u001a/\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a&\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001aT\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\u0087\bø\u0001\u0000\u001a\u0018\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\"\"\u0010&\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"T", "Landroid/util/LongSparseArray;", "", "key", "", "a", "value", "Lkotlin/m2;", "n", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "k", "b", "c", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/LongSparseArray;JLq3/a;)Ljava/lang/Object;", "h", "i", "m", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "l", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "Lkotlin/collections/y0;", "j", "", "o", "", "g", "(Landroid/util/LongSparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class j {

    /* compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/j$a", "Lkotlin/collections/y0;", "", "hasNext", "", "nextLong", "", "o", "I", "a", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends LongIterator {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f5241p;

        a(LongSparseArray<T> longSparseArray) {
            this.f5241p = longSparseArray;
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
            return this.index < this.f5241p.size();
        }

        @Override // kotlin.collections.LongIterator
        public long nextLong() {
            LongSparseArray<T> longSparseArray = this.f5241p;
            int i5 = this.index;
            this.index = i5 + 1;
            return longSparseArray.keyAt(i5);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/core/util/j$b", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "o", "I", "a", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b<T> implements Iterator<T>, r3.a {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f5243p;

        b(LongSparseArray<T> longSparseArray) {
            this.f5243p = longSparseArray;
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
            return this.index < this.f5243p.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.f5243p;
            int i5 = this.index;
            this.index = i5 + 1;
            return longSparseArray.valueAt(i5);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @x0(16)
    public static final <T> boolean a(@d5.d LongSparseArray<T> longSparseArray, long j5) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j5) >= 0;
    }

    @x0(16)
    public static final <T> boolean b(@d5.d LongSparseArray<T> longSparseArray, long j5) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j5) >= 0;
    }

    @x0(16)
    public static final <T> boolean c(@d5.d LongSparseArray<T> longSparseArray, T t5) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(t5) >= 0;
    }

    @x0(16)
    public static final <T> void d(@d5.d LongSparseArray<T> longSparseArray, @d5.d q3.p<? super Long, ? super T, m2> action) {
        l0.p(longSparseArray, "<this>");
        l0.p(action, "action");
        int size = longSparseArray.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            action.g0(Long.valueOf(longSparseArray.keyAt(i5)), longSparseArray.valueAt(i5));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    @x0(16)
    public static final <T> T e(@d5.d LongSparseArray<T> longSparseArray, long j5, T t5) {
        l0.p(longSparseArray, "<this>");
        T t6 = longSparseArray.get(j5);
        return t6 == null ? t5 : t6;
    }

    @x0(16)
    public static final <T> T f(@d5.d LongSparseArray<T> longSparseArray, long j5, @d5.d q3.a<? extends T> defaultValue) {
        l0.p(longSparseArray, "<this>");
        l0.p(defaultValue, "defaultValue");
        T t5 = longSparseArray.get(j5);
        return t5 == null ? defaultValue.n() : t5;
    }

    @x0(16)
    public static final <T> int g(@d5.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @x0(16)
    public static final <T> boolean h(@d5.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    @x0(16)
    public static final <T> boolean i(@d5.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }

    @x0(16)
    @d5.d
    public static final <T> LongIterator j(@d5.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return new a(longSparseArray);
    }

    @x0(16)
    @d5.d
    public static final <T> LongSparseArray<T> k(@d5.d LongSparseArray<T> longSparseArray, @d5.d LongSparseArray<T> other) {
        l0.p(longSparseArray, "<this>");
        l0.p(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(other.size() + longSparseArray.size());
        l(longSparseArray2, longSparseArray);
        l(longSparseArray2, other);
        return longSparseArray2;
    }

    @x0(16)
    public static final <T> void l(@d5.d LongSparseArray<T> longSparseArray, @d5.d LongSparseArray<T> other) {
        l0.p(longSparseArray, "<this>");
        l0.p(other, "other");
        int size = other.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            longSparseArray.put(other.keyAt(i5), other.valueAt(i5));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    @x0(16)
    public static final <T> boolean m(@d5.d LongSparseArray<T> longSparseArray, long j5, T t5) {
        l0.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j5);
        if (indexOfKey < 0 || !l0.g(t5, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    @x0(16)
    public static final <T> void n(@d5.d LongSparseArray<T> longSparseArray, long j5, T t5) {
        l0.p(longSparseArray, "<this>");
        longSparseArray.put(j5, t5);
    }

    @x0(16)
    @d5.d
    public static final <T> Iterator<T> o(@d5.d LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return new b(longSparseArray);
    }
}
