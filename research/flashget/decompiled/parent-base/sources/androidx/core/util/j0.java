package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SparseIntArray.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u0005\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0005\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a*\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0016\u001a!\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aL\u0010 \u001a\u00020\u0007*\u00020\u000026\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001cH\u0086\b¢\u0006\u0004\b \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\u0000¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010%\u001a\u00020\"*\u00020\u0000¢\u0006\u0004\b%\u0010$\"\u0016\u0010(\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroid/util/SparseIntArray;", "", "key", "", "a", "(Landroid/util/SparseIntArray;I)Z", "value", "Lkotlin/k2;", "n", "(Landroid/util/SparseIntArray;II)V", "other", "k", "(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)Landroid/util/SparseIntArray;", "b", "c", "defaultValue", "e", "(Landroid/util/SparseIntArray;II)I", "Lkotlin/Function0;", "f", "(Landroid/util/SparseIntArray;ILld/a;)I", "h", "(Landroid/util/SparseIntArray;)Z", "i", "m", "(Landroid/util/SparseIntArray;II)Z", "l", "(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)V", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "(Landroid/util/SparseIntArray;Lld/p;)V", "Lkotlin/collections/u0;", "j", "(Landroid/util/SparseIntArray;)Lkotlin/collections/u0;", "o", "g", "(Landroid/util/SparseIntArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n76#1,4:102\n1#2:101\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n72#1:102,4\n*E\n"})
/* loaded from: classes3.dex */
public final class j0 {

    /* compiled from: SparseIntArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/j0$a", "Lkotlin/collections/u0;", "", "hasNext", "()Z", "", "c", "()I", "b", "I", "d", "e", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends u0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f26854c;

        a(SparseIntArray sparseIntArray) {
            this.f26854c = sparseIntArray;
        }

        @Override // kotlin.collections.u0
        public int c() {
            SparseIntArray sparseIntArray = this.f26854c;
            int i4 = this.index;
            this.index = i4 + 1;
            return sparseIntArray.keyAt(i4);
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
            return this.index < this.f26854c.size();
        }
    }

    /* compiled from: SparseIntArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/j0$b", "Lkotlin/collections/u0;", "", "hasNext", "()Z", "", "c", "()I", "b", "I", "d", "e", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends u0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f26856c;

        b(SparseIntArray sparseIntArray) {
            this.f26856c = sparseIntArray;
        }

        @Override // kotlin.collections.u0
        public int c() {
            SparseIntArray sparseIntArray = this.f26856c;
            int i4 = this.index;
            this.index = i4 + 1;
            return sparseIntArray.valueAt(i4);
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
            return this.index < this.f26856c.size();
        }
    }

    public static final boolean a(@fg.l SparseIntArray sparseIntArray, int i4) {
        return sparseIntArray.indexOfKey(i4) >= 0;
    }

    public static final boolean b(@fg.l SparseIntArray sparseIntArray, int i4) {
        return sparseIntArray.indexOfKey(i4) >= 0;
    }

    public static final boolean c(@fg.l SparseIntArray sparseIntArray, int i4) {
        return sparseIntArray.indexOfValue(i4) >= 0;
    }

    public static final void d(@fg.l SparseIntArray sparseIntArray, @fg.l ld.p<? super Integer, ? super Integer, k2> pVar) {
        int size = sparseIntArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i4)), Integer.valueOf(sparseIntArray.valueAt(i4)));
        }
    }

    public static final int e(@fg.l SparseIntArray sparseIntArray, int i4, int i5) {
        return sparseIntArray.get(i4, i5);
    }

    public static final int f(@fg.l SparseIntArray sparseIntArray, int i4, @fg.l ld.a<Integer> aVar) {
        int indexOfKey = sparseIntArray.indexOfKey(i4);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : aVar.invoke().intValue();
    }

    public static final int g(@fg.l SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean h(@fg.l SparseIntArray sparseIntArray) {
        return sparseIntArray.size() == 0;
    }

    public static final boolean i(@fg.l SparseIntArray sparseIntArray) {
        return sparseIntArray.size() != 0;
    }

    @fg.l
    public static final u0 j(@fg.l SparseIntArray sparseIntArray) {
        return new a(sparseIntArray);
    }

    @fg.l
    public static final SparseIntArray k(@fg.l SparseIntArray sparseIntArray, @fg.l SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray2.size() + sparseIntArray.size());
        l(sparseIntArray3, sparseIntArray);
        l(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void l(@fg.l SparseIntArray sparseIntArray, @fg.l SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i4), sparseIntArray2.valueAt(i4));
        }
    }

    public static final boolean m(@fg.l SparseIntArray sparseIntArray, int i4, int i5) {
        int indexOfKey = sparseIntArray.indexOfKey(i4);
        if (indexOfKey < 0 || i5 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void n(@fg.l SparseIntArray sparseIntArray, int i4, int i5) {
        sparseIntArray.put(i4, i5);
    }

    @fg.l
    public static final u0 o(@fg.l SparseIntArray sparseIntArray) {
        return new b(sparseIntArray);
    }
}
