package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.collection.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridLaneInfo.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0011\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0003J\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0016\u0010&\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/s;", "", "<init>", "()V", "", "capacity", "newOffset", "Lkotlin/k2;", "b", "(II)V", "itemIndex", "lane", "l", "h", "(I)I", "targetLane", "", "a", "(II)Z", "m", "()I", "i", "j", "f", "(II)I", "e", "requestedIndex", "d", "(I)V", "", "gaps", "k", "(I[I)V", "g", "(I)[I", "I", "anchor", "[I", "lanes", "Lkotlin/collections/k;", "Landroidx/compose/foundation/lazy/staggeredgrid/s$b;", "c", "Lkotlin/collections/k;", "spannedItems", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,208:1\n1#2:209\n388#3,7:210\n388#3,7:217\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n167#1:210,7\n187#1:217,7\n*E\n"})
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6455e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static final int f6456f = 131072;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6457g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6458h = -2;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int anchor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] lanes = new int[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.collections.k<b> spannedItems = new kotlin.collections.k<>();

    /* compiled from: LazyStaggeredGridLaneInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/s$b;", "", "", "index", "", "gaps", "<init>", "(I[I)V", "a", "I", "b", "()I", "[I", "()[I", "c", "([I)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private int[] gaps;

        public b(int i4, @fg.l int[] iArr) {
            this.index = i4;
            this.gaps = iArr;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final int[] getGaps() {
            return this.gaps;
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void c(@fg.l int[] iArr) {
            this.gaps = iArr;
        }
    }

    /* compiled from: Collections.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "K", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;", "kotlin/collections/y$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n+ 2 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n1#1,471:1\n187#2:472\n*E\n"})
    public static final class c extends kotlin.jvm.internal.n0 implements ld.l<b, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparable f6464b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Comparable comparable) {
            super(1);
            this.f6464b = comparable;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(b bVar) {
            return Integer.valueOf(kotlin.comparisons.a.l(Integer.valueOf(bVar.getIndex()), this.f6464b));
        }
    }

    /* compiled from: Collections.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "K", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;", "kotlin/collections/y$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n+ 2 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n1#1,471:1\n167#2:472\n*E\n"})
    public static final class d extends kotlin.jvm.internal.n0 implements ld.l<b, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparable f6465b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Comparable comparable) {
            super(1);
            this.f6465b = comparable;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(b bVar) {
            return Integer.valueOf(kotlin.comparisons.a.l(Integer.valueOf(bVar.getIndex()), this.f6465b));
        }
    }

    private final void b(int capacity, int newOffset) {
        if (capacity > 131072) {
            throw new IllegalArgumentException(r2.a("Requested item capacity ", capacity, " is larger than max supported: 131072!").toString());
        }
        int[] iArr = this.lanes;
        if (iArr.length < capacity) {
            int length = iArr.length;
            while (length < capacity) {
                length *= 2;
            }
            this.lanes = kotlin.collections.l.I0(this.lanes, new int[length], newOffset, 0, 0, 12, null);
        }
    }

    static /* synthetic */ void c(s sVar, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        sVar.b(i4, i5);
    }

    public final boolean a(int itemIndex, int targetLane) {
        int h4 = h(itemIndex);
        return h4 == targetLane || h4 == -1 || h4 == -2;
    }

    public final void d(int requestedIndex) {
        int i4 = this.anchor;
        int i5 = requestedIndex - i4;
        if (i5 < 0 || i5 >= 131072) {
            int max = Math.max(requestedIndex - (this.lanes.length / 2), 0);
            this.anchor = max;
            int i6 = max - i4;
            if (i6 >= 0) {
                int[] iArr = this.lanes;
                if (i6 < iArr.length) {
                    kotlin.collections.l.z0(iArr, iArr, 0, i6, iArr.length);
                }
                int[] iArr2 = this.lanes;
                kotlin.collections.l.K1(iArr2, 0, Math.max(0, iArr2.length - i6), this.lanes.length);
            } else {
                int i7 = -i6;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i7 < 131072) {
                    b(iArr3.length + i7 + 1, i7);
                } else {
                    if (i7 < iArr3.length) {
                        kotlin.collections.l.z0(iArr3, iArr3, i7, 0, iArr3.length - i7);
                    }
                    int[] iArr4 = this.lanes;
                    kotlin.collections.l.K1(iArr4, 0, 0, Math.min(iArr4.length, i7));
                }
            }
        } else {
            c(this, i5 + 1, 0, 2, null);
        }
        while (!this.spannedItems.isEmpty() && this.spannedItems.first().getIndex() < this.anchor) {
            this.spannedItems.removeFirst();
        }
        while (!this.spannedItems.isEmpty() && this.spannedItems.last().getIndex() > m()) {
            this.spannedItems.removeLast();
        }
    }

    public final int e(int itemIndex, int targetLane) {
        int m4 = m();
        for (int i4 = itemIndex + 1; i4 < m4; i4++) {
            if (a(i4, targetLane)) {
                return i4;
            }
        }
        return m();
    }

    public final int f(int itemIndex, int targetLane) {
        do {
            itemIndex--;
            if (-1 >= itemIndex) {
                return -1;
            }
        } while (!a(itemIndex, targetLane));
        return itemIndex;
    }

    @fg.m
    public final int[] g(int itemIndex) {
        kotlin.collections.k<b> kVar = this.spannedItems;
        b bVar = (b) kotlin.collections.w.W2(this.spannedItems, kotlin.collections.w.u(kVar, 0, kVar.size(), new c(Integer.valueOf(itemIndex))));
        if (bVar != null) {
            return bVar.getGaps();
        }
        return null;
    }

    public final int h(int itemIndex) {
        if (itemIndex < this.anchor || itemIndex >= m()) {
            return -1;
        }
        return this.lanes[itemIndex - this.anchor] - 1;
    }

    /* renamed from: i, reason: from getter */
    public final int getAnchor() {
        return this.anchor;
    }

    public final void j() {
        kotlin.collections.l.T1(this.lanes, 0, 0, 0, 6, null);
        this.spannedItems.clear();
    }

    public final void k(int itemIndex, @fg.m int[] gaps) {
        kotlin.collections.k<b> kVar = this.spannedItems;
        int u4 = kotlin.collections.w.u(kVar, 0, kVar.size(), new d(Integer.valueOf(itemIndex)));
        if (u4 < 0) {
            if (gaps == null) {
                return;
            }
            this.spannedItems.add(-(u4 + 1), new b(itemIndex, gaps));
            return;
        }
        if (gaps == null) {
            this.spannedItems.c(u4);
        } else {
            this.spannedItems.get(u4).c(gaps);
        }
    }

    public final void l(int itemIndex, int lane) {
        if (itemIndex < 0) {
            throw new IllegalArgumentException("Negative lanes are not supported");
        }
        d(itemIndex);
        this.lanes[itemIndex - this.anchor] = lane + 1;
    }

    public final int m() {
        return this.anchor + this.lanes.length;
    }
}
