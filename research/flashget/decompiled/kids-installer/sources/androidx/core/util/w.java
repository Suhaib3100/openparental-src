package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: SparseBooleanArray.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0003H\u0086\b\u001a&\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0086\bø\u0001\u0000\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aH\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\bø\u0001\u0000\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u0000\"\u0016\u0010\u001f\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"Landroid/util/SparseBooleanArray;", "", "key", "", "a", "value", "Lkotlin/m2;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "Lkotlin/collections/x0;", "j", "Lkotlin/collections/v;", "o", "g", "(Landroid/util/SparseBooleanArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class w {

    /* compiled from: SparseBooleanArray.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/core/util/w$a", "Lkotlin/collections/x0;", "", "hasNext", "", "nextInt", "o", "I", "a", "()I", "d", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends IntIterator {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f5290p;

        a(SparseBooleanArray sparseBooleanArray) {
            this.f5290p = sparseBooleanArray;
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
            return this.index < this.f5290p.size();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseBooleanArray sparseBooleanArray = this.f5290p;
            int i5 = this.index;
            this.index = i5 + 1;
            return sparseBooleanArray.keyAt(i5);
        }
    }

    /* compiled from: SparseBooleanArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/core/util/w$b", "Lkotlin/collections/v;", "", "hasNext", "d", "", "o", "I", "f", "()I", "g", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends BooleanIterator {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f5292p;

        b(SparseBooleanArray sparseBooleanArray) {
            this.f5292p = sparseBooleanArray;
        }

        @Override // kotlin.collections.BooleanIterator
        public boolean d() {
            SparseBooleanArray sparseBooleanArray = this.f5292p;
            int i5 = this.index;
            this.index = i5 + 1;
            return sparseBooleanArray.valueAt(i5);
        }

        /* renamed from: f, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void g(int i5) {
            this.index = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f5292p.size();
        }
    }

    public static final boolean a(@d5.d SparseBooleanArray sparseBooleanArray, int i5) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i5) >= 0;
    }

    public static final boolean b(@d5.d SparseBooleanArray sparseBooleanArray, int i5) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i5) >= 0;
    }

    public static final boolean c(@d5.d SparseBooleanArray sparseBooleanArray, boolean z5) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfValue(z5) >= 0;
    }

    public static final void d(@d5.d SparseBooleanArray sparseBooleanArray, @d5.d q3.p<? super Integer, ? super Boolean, m2> action) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(action, "action");
        int size = sparseBooleanArray.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            action.g0(Integer.valueOf(sparseBooleanArray.keyAt(i5)), Boolean.valueOf(sparseBooleanArray.valueAt(i5)));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    public static final boolean e(@d5.d SparseBooleanArray sparseBooleanArray, int i5, boolean z5) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i5, z5);
    }

    public static final boolean f(@d5.d SparseBooleanArray sparseBooleanArray, int i5, @d5.d q3.a<Boolean> defaultValue) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(defaultValue, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i5);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : defaultValue.n().booleanValue();
    }

    public static final int g(@d5.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean h(@d5.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean i(@d5.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() != 0;
    }

    @d5.d
    public static final IntIterator j(@d5.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return new a(sparseBooleanArray);
    }

    @d5.d
    public static final SparseBooleanArray k(@d5.d SparseBooleanArray sparseBooleanArray, @d5.d SparseBooleanArray other) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(other, "other");
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(other.size() + sparseBooleanArray.size());
        l(sparseBooleanArray2, sparseBooleanArray);
        l(sparseBooleanArray2, other);
        return sparseBooleanArray2;
    }

    public static final void l(@d5.d SparseBooleanArray sparseBooleanArray, @d5.d SparseBooleanArray other) {
        l0.p(sparseBooleanArray, "<this>");
        l0.p(other, "other");
        int size = other.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            sparseBooleanArray.put(other.keyAt(i5), other.valueAt(i5));
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    public static final boolean m(@d5.d SparseBooleanArray sparseBooleanArray, int i5, boolean z5) {
        l0.p(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i5);
        if (indexOfKey < 0 || z5 != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i5);
        return true;
    }

    public static final void n(@d5.d SparseBooleanArray sparseBooleanArray, int i5, boolean z5) {
        l0.p(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i5, z5);
    }

    @d5.d
    public static final BooleanIterator o(@d5.d SparseBooleanArray sparseBooleanArray) {
        l0.p(sparseBooleanArray, "<this>");
        return new b(sparseBooleanArray);
    }
}
