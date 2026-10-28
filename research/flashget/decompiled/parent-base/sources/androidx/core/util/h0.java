package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SparseArray.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0006\u001a(\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aX\u0010\"\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010!\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u001eH\u0086\b¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b%\u0010&\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b(\u0010)\"\"\u0010,\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"T", "Landroid/util/SparseArray;", "", "key", "", "a", "(Landroid/util/SparseArray;I)Z", "value", "Lkotlin/k2;", "n", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "other", "k", "(Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/util/SparseArray;", "b", "c", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/SparseArray;ILld/a;)Ljava/lang/Object;", "h", "(Landroid/util/SparseArray;)Z", "i", "m", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "l", "(Landroid/util/SparseArray;Landroid/util/SparseArray;)V", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "(Landroid/util/SparseArray;Lld/p;)V", "Lkotlin/collections/u0;", "j", "(Landroid/util/SparseArray;)Lkotlin/collections/u0;", "", "o", "(Landroid/util/SparseArray;)Ljava/util/Iterator;", "g", "(Landroid/util/SparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,101:1\n77#1,4:102\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n73#1:102,4\n*E\n"})
/* loaded from: classes3.dex */
public final class h0 {

    /* compiled from: SparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/h0$a", "Lkotlin/collections/u0;", "", "hasNext", "()Z", "", "c", "()I", "b", "I", "d", "e", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends u0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f26846c;

        a(SparseArray<T> sparseArray) {
            this.f26846c = sparseArray;
        }

        @Override // kotlin.collections.u0
        public int c() {
            SparseArray<T> sparseArray = this.f26846c;
            int i4 = this.index;
            this.index = i4 + 1;
            return sparseArray.keyAt(i4);
        }

        /* renamed from: d, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void e(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f26846c.size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/core/util/h0$b", "", "", "hasNext", "()Z", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "b", "I", "()I", "c", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f26848c;

        b(SparseArray<T> sparseArray) {
            this.f26848c = sparseArray;
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void c(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f26848c.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f26848c;
            int i4 = this.index;
            this.index = i4 + 1;
            return sparseArray.valueAt(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@fg.l SparseArray<T> sparseArray, int i4) {
        return sparseArray.indexOfKey(i4) >= 0;
    }

    public static final <T> boolean b(@fg.l SparseArray<T> sparseArray, int i4) {
        return sparseArray.indexOfKey(i4) >= 0;
    }

    public static final <T> boolean c(@fg.l SparseArray<T> sparseArray, T t4) {
        return sparseArray.indexOfValue(t4) >= 0;
    }

    public static final <T> void d(@fg.l SparseArray<T> sparseArray, @fg.l ld.p<? super Integer, ? super T, k2> pVar) {
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.invoke(Integer.valueOf(sparseArray.keyAt(i4)), sparseArray.valueAt(i4));
        }
    }

    public static final <T> T e(@fg.l SparseArray<T> sparseArray, int i4, T t4) {
        T t5 = sparseArray.get(i4);
        return t5 == null ? t4 : t5;
    }

    public static final <T> T f(@fg.l SparseArray<T> sparseArray, int i4, @fg.l ld.a<? extends T> aVar) {
        T t4 = sparseArray.get(i4);
        return t4 == null ? aVar.invoke() : t4;
    }

    public static final <T> int g(@fg.l SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean h(@fg.l SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean i(@fg.l SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    @fg.l
    public static final <T> u0 j(@fg.l SparseArray<T> sparseArray) {
        return new a(sparseArray);
    }

    @fg.l
    public static final <T> SparseArray<T> k(@fg.l SparseArray<T> sparseArray, @fg.l SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray2.size() + sparseArray.size());
        l(sparseArray3, sparseArray);
        l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void l(@fg.l SparseArray<T> sparseArray, @fg.l SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseArray.put(sparseArray2.keyAt(i4), sparseArray2.valueAt(i4));
        }
    }

    public static final <T> boolean m(@fg.l SparseArray<T> sparseArray, int i4, T t4) {
        int indexOfKey = sparseArray.indexOfKey(i4);
        if (indexOfKey < 0 || !kotlin.jvm.internal.l0.g(t4, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void n(@fg.l SparseArray<T> sparseArray, int i4, T t4) {
        sparseArray.put(i4, t4);
    }

    @fg.l
    public static final <T> Iterator<T> o(@fg.l SparseArray<T> sparseArray) {
        return new b(sparseArray);
    }
}
