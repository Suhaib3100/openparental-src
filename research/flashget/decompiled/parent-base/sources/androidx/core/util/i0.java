package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SparseBooleanArray.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u0005\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a!\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0019\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aL\u0010 \u001a\u00020\u0007*\u00020\u000026\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001cH\u0086\b¢\u0006\u0004\b \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\u0000¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010&\u001a\u00020%*\u00020\u0000¢\u0006\u0004\b&\u0010'\"\u0016\u0010*\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroid/util/SparseBooleanArray;", "", "key", "", "a", "(Landroid/util/SparseBooleanArray;I)Z", "value", "Lkotlin/k2;", "n", "(Landroid/util/SparseBooleanArray;IZ)V", "other", "k", "(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)Landroid/util/SparseBooleanArray;", "b", "c", "(Landroid/util/SparseBooleanArray;Z)Z", "defaultValue", "e", "(Landroid/util/SparseBooleanArray;IZ)Z", "Lkotlin/Function0;", "f", "(Landroid/util/SparseBooleanArray;ILld/a;)Z", "h", "(Landroid/util/SparseBooleanArray;)Z", "i", "m", "l", "(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)V", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "d", "(Landroid/util/SparseBooleanArray;Lld/p;)V", "Lkotlin/collections/u0;", "j", "(Landroid/util/SparseBooleanArray;)Lkotlin/collections/u0;", "Lkotlin/collections/t;", "o", "(Landroid/util/SparseBooleanArray;)Lkotlin/collections/t;", "g", "(Landroid/util/SparseBooleanArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n78#1,4:104\n1#2:103\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n74#1:104,4\n*E\n"})
/* loaded from: classes3.dex */
public final class i0 {

    /* compiled from: SparseBooleanArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/i0$a", "Lkotlin/collections/u0;", "", "hasNext", "()Z", "", "c", "()I", "b", "I", "d", "e", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends u0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f26850c;

        a(SparseBooleanArray sparseBooleanArray) {
            this.f26850c = sparseBooleanArray;
        }

        @Override // kotlin.collections.u0
        public int c() {
            SparseBooleanArray sparseBooleanArray = this.f26850c;
            int i4 = this.index;
            this.index = i4 + 1;
            return sparseBooleanArray.keyAt(i4);
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
            return this.index < this.f26850c.size();
        }
    }

    /* compiled from: SparseBooleanArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/i0$b", "Lkotlin/collections/t;", "", "hasNext", "()Z", "c", "", "b", "I", "d", "()I", "e", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends kotlin.collections.t {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f26852c;

        b(SparseBooleanArray sparseBooleanArray) {
            this.f26852c = sparseBooleanArray;
        }

        @Override // kotlin.collections.t
        public boolean c() {
            SparseBooleanArray sparseBooleanArray = this.f26852c;
            int i4 = this.index;
            this.index = i4 + 1;
            return sparseBooleanArray.valueAt(i4);
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
            return this.index < this.f26852c.size();
        }
    }

    public static final boolean a(@fg.l SparseBooleanArray sparseBooleanArray, int i4) {
        return sparseBooleanArray.indexOfKey(i4) >= 0;
    }

    public static final boolean b(@fg.l SparseBooleanArray sparseBooleanArray, int i4) {
        return sparseBooleanArray.indexOfKey(i4) >= 0;
    }

    public static final boolean c(@fg.l SparseBooleanArray sparseBooleanArray, boolean z4) {
        return sparseBooleanArray.indexOfValue(z4) >= 0;
    }

    public static final void d(@fg.l SparseBooleanArray sparseBooleanArray, @fg.l ld.p<? super Integer, ? super Boolean, k2> pVar) {
        int size = sparseBooleanArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i4)), Boolean.valueOf(sparseBooleanArray.valueAt(i4)));
        }
    }

    public static final boolean e(@fg.l SparseBooleanArray sparseBooleanArray, int i4, boolean z4) {
        return sparseBooleanArray.get(i4, z4);
    }

    public static final boolean f(@fg.l SparseBooleanArray sparseBooleanArray, int i4, @fg.l ld.a<Boolean> aVar) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i4);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : aVar.invoke().booleanValue();
    }

    public static final int g(@fg.l SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean h(@fg.l SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean i(@fg.l SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    @fg.l
    public static final u0 j(@fg.l SparseBooleanArray sparseBooleanArray) {
        return new a(sparseBooleanArray);
    }

    @fg.l
    public static final SparseBooleanArray k(@fg.l SparseBooleanArray sparseBooleanArray, @fg.l SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray2.size() + sparseBooleanArray.size());
        l(sparseBooleanArray3, sparseBooleanArray);
        l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void l(@fg.l SparseBooleanArray sparseBooleanArray, @fg.l SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i4), sparseBooleanArray2.valueAt(i4));
        }
    }

    public static final boolean m(@fg.l SparseBooleanArray sparseBooleanArray, int i4, boolean z4) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i4);
        if (indexOfKey < 0 || z4 != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i4);
        return true;
    }

    public static final void n(@fg.l SparseBooleanArray sparseBooleanArray, int i4, boolean z4) {
        sparseBooleanArray.put(i4, z4);
    }

    @fg.l
    public static final kotlin.collections.t o(@fg.l SparseBooleanArray sparseBooleanArray) {
        return new b(sparseBooleanArray);
    }
}
