package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.collections.v0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SparseLongArray.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0005\u001a\u001c\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a$\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a*\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a!\u0010\u001a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001c\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aL\u0010\"\u001a\u00020\b*\u00020\u000026\u0010!\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u001eH\u0086\b¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010%\u001a\u00020$*\u00020\u0000¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010(\u001a\u00020'*\u00020\u0000¢\u0006\u0004\b(\u0010)\"\u0016\u0010,\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroid/util/SparseLongArray;", "", "key", "", "a", "(Landroid/util/SparseLongArray;I)Z", "", "value", "Lkotlin/k2;", "n", "(Landroid/util/SparseLongArray;IJ)V", "other", "k", "(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)Landroid/util/SparseLongArray;", "b", "c", "(Landroid/util/SparseLongArray;J)Z", "defaultValue", "e", "(Landroid/util/SparseLongArray;IJ)J", "Lkotlin/Function0;", "f", "(Landroid/util/SparseLongArray;ILld/a;)J", "h", "(Landroid/util/SparseLongArray;)Z", "i", "m", "(Landroid/util/SparseLongArray;IJ)Z", "l", "(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)V", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "(Landroid/util/SparseLongArray;Lld/p;)V", "Lkotlin/collections/u0;", "j", "(Landroid/util/SparseLongArray;)Lkotlin/collections/u0;", "Lkotlin/collections/v0;", "o", "(Landroid/util/SparseLongArray;)Lkotlin/collections/v0;", "g", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n76#1,4:102\n1#2:101\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n72#1:102,4\n*E\n"})
/* loaded from: classes3.dex */
public final class k0 {

    /* compiled from: SparseLongArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/k0$a", "Lkotlin/collections/u0;", "", "hasNext", "()Z", "", "c", "()I", "b", "I", "d", "e", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends u0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f26858c;

        a(SparseLongArray sparseLongArray) {
            this.f26858c = sparseLongArray;
        }

        @Override // kotlin.collections.u0
        public int c() {
            SparseLongArray sparseLongArray = this.f26858c;
            int i4 = this.index;
            this.index = i4 + 1;
            return sparseLongArray.keyAt(i4);
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
            return this.index < this.f26858c.size();
        }
    }

    /* compiled from: SparseLongArray.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/core/util/k0$b", "Lkotlin/collections/v0;", "", "hasNext", "()Z", "", "c", "()J", "", "b", "I", "d", "()I", "e", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends v0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f26860c;

        b(SparseLongArray sparseLongArray) {
            this.f26860c = sparseLongArray;
        }

        @Override // kotlin.collections.v0
        public long c() {
            SparseLongArray sparseLongArray = this.f26860c;
            int i4 = this.index;
            this.index = i4 + 1;
            return sparseLongArray.valueAt(i4);
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
            return this.index < this.f26860c.size();
        }
    }

    public static final boolean a(@fg.l SparseLongArray sparseLongArray, int i4) {
        return sparseLongArray.indexOfKey(i4) >= 0;
    }

    public static final boolean b(@fg.l SparseLongArray sparseLongArray, int i4) {
        return sparseLongArray.indexOfKey(i4) >= 0;
    }

    public static final boolean c(@fg.l SparseLongArray sparseLongArray, long j4) {
        return sparseLongArray.indexOfValue(j4) >= 0;
    }

    public static final void d(@fg.l SparseLongArray sparseLongArray, @fg.l ld.p<? super Integer, ? super Long, k2> pVar) {
        int size = sparseLongArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i4)), Long.valueOf(sparseLongArray.valueAt(i4)));
        }
    }

    public static final long e(@fg.l SparseLongArray sparseLongArray, int i4, long j4) {
        return sparseLongArray.get(i4, j4);
    }

    public static final long f(@fg.l SparseLongArray sparseLongArray, int i4, @fg.l ld.a<Long> aVar) {
        int indexOfKey = sparseLongArray.indexOfKey(i4);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : aVar.invoke().longValue();
    }

    public static final int g(@fg.l SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean h(@fg.l SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean i(@fg.l SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    @fg.l
    public static final u0 j(@fg.l SparseLongArray sparseLongArray) {
        return new a(sparseLongArray);
    }

    @fg.l
    public static final SparseLongArray k(@fg.l SparseLongArray sparseLongArray, @fg.l SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray2.size() + sparseLongArray.size());
        l(sparseLongArray3, sparseLongArray);
        l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void l(@fg.l SparseLongArray sparseLongArray, @fg.l SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i4), sparseLongArray2.valueAt(i4));
        }
    }

    public static final boolean m(@fg.l SparseLongArray sparseLongArray, int i4, long j4) {
        int indexOfKey = sparseLongArray.indexOfKey(i4);
        if (indexOfKey < 0 || j4 != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    public static final void n(@fg.l SparseLongArray sparseLongArray, int i4, long j4) {
        sparseLongArray.put(i4, j4);
    }

    @fg.l
    public static final v0 o(@fg.l SparseLongArray sparseLongArray) {
        return new b(sparseLongArray);
    }
}
