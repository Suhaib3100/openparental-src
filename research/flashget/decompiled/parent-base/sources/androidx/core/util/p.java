package androidx.core.util;

import android.util.LongSparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.v0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LongSparseArray.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0006\u001a(\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aX\u0010\"\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010!\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u001eH\u0086\b¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b%\u0010&\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b(\u0010)\"\"\u0010-\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"T", "Landroid/util/LongSparseArray;", "", "key", "", "a", "(Landroid/util/LongSparseArray;J)Z", "value", "Lkotlin/k2;", "n", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "k", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)Landroid/util/LongSparseArray;", "b", "c", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/LongSparseArray;JLld/a;)Ljava/lang/Object;", "h", "(Landroid/util/LongSparseArray;)Z", "i", "m", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "l", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)V", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "(Landroid/util/LongSparseArray;Lld/p;)V", "Lkotlin/collections/v0;", "j", "(Landroid/util/LongSparseArray;)Lkotlin/collections/v0;", "", "o", "(Landroid/util/LongSparseArray;)Ljava/util/Iterator;", "", "g", "(Landroid/util/LongSparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,101:1\n77#1,4:102\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n73#1:102,4\n*E\n"})
/* loaded from: classes3.dex */
public final class p {

    /* compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/core/util/p$a", "Lkotlin/collections/v0;", "", "hasNext", "()Z", "", "c", "()J", "", "b", "I", "d", "()I", "e", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends v0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f26872c;

        a(LongSparseArray<T> longSparseArray) {
            this.f26872c = longSparseArray;
        }

        @Override // kotlin.collections.v0
        public long c() {
            LongSparseArray<T> longSparseArray = this.f26872c;
            int i4 = this.index;
            this.index = i4 + 1;
            return longSparseArray.keyAt(i4);
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
            return this.index < this.f26872c.size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/core/util/p$b", "", "", "hasNext", "()Z", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "b", "I", "()I", "c", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f26874c;

        b(LongSparseArray<T> longSparseArray) {
            this.f26874c = longSparseArray;
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
            return this.index < this.f26874c.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.f26874c;
            int i4 = this.index;
            this.index = i4 + 1;
            return longSparseArray.valueAt(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@fg.l LongSparseArray<T> longSparseArray, long j4) {
        return longSparseArray.indexOfKey(j4) >= 0;
    }

    public static final <T> boolean b(@fg.l LongSparseArray<T> longSparseArray, long j4) {
        return longSparseArray.indexOfKey(j4) >= 0;
    }

    public static final <T> boolean c(@fg.l LongSparseArray<T> longSparseArray, T t4) {
        return longSparseArray.indexOfValue(t4) >= 0;
    }

    public static final <T> void d(@fg.l LongSparseArray<T> longSparseArray, @fg.l ld.p<? super Long, ? super T, k2> pVar) {
        int size = longSparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i4)), longSparseArray.valueAt(i4));
        }
    }

    public static final <T> T e(@fg.l LongSparseArray<T> longSparseArray, long j4, T t4) {
        T t5 = longSparseArray.get(j4);
        return t5 == null ? t4 : t5;
    }

    public static final <T> T f(@fg.l LongSparseArray<T> longSparseArray, long j4, @fg.l ld.a<? extends T> aVar) {
        T t4 = longSparseArray.get(j4);
        return t4 == null ? aVar.invoke() : t4;
    }

    public static final <T> int g(@fg.l LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean h(@fg.l LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean i(@fg.l LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    @fg.l
    public static final <T> v0 j(@fg.l LongSparseArray<T> longSparseArray) {
        return new a(longSparseArray);
    }

    @fg.l
    public static final <T> LongSparseArray<T> k(@fg.l LongSparseArray<T> longSparseArray, @fg.l LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray2.size() + longSparseArray.size());
        l(longSparseArray3, longSparseArray);
        l(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void l(@fg.l LongSparseArray<T> longSparseArray, @fg.l LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            longSparseArray.put(longSparseArray2.keyAt(i4), longSparseArray2.valueAt(i4));
        }
    }

    public static final <T> boolean m(@fg.l LongSparseArray<T> longSparseArray, long j4, T t4) {
        int indexOfKey = longSparseArray.indexOfKey(j4);
        if (indexOfKey < 0 || !kotlin.jvm.internal.l0.g(t4, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void n(@fg.l LongSparseArray<T> longSparseArray, long j4, T t4) {
        longSparseArray.put(j4, t4);
    }

    @fg.l
    public static final <T> Iterator<T> o(@fg.l LongSparseArray<T> longSparseArray) {
        return new b(longSparseArray);
    }
}
