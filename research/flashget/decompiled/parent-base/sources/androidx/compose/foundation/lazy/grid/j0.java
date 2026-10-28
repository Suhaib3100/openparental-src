package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: LazyGridSpanLayoutProvider.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0019\n\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R*\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b#\u0010-\"\u0004\b*\u0010.R\u0014\u00100\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010-R\u0011\u00101\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010-¨\u00062"}, d2 = {"Landroidx/compose/foundation/lazy/grid/j0;", "", "Landroidx/compose/foundation/lazy/grid/j;", "gridContent", "<init>", "(Landroidx/compose/foundation/lazy/grid/j;)V", "", "currentSlotsPerLine", "", "Landroidx/compose/foundation/lazy/grid/b;", "b", "(I)Ljava/util/List;", "Lkotlin/k2;", "g", "()V", "lineIndex", "Landroidx/compose/foundation/lazy/grid/j0$c;", "c", "(I)Landroidx/compose/foundation/lazy/grid/j0$c;", "itemIndex", "d", "(I)I", "maxSpan", "i", "(II)I", "a", "Landroidx/compose/foundation/lazy/grid/j;", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/lazy/grid/j0$a;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "buckets", "I", "lastLineIndex", "lastLineStartItemIndex", "e", "lastLineStartKnownSpan", "f", "cachedBucketIndex", "", "Ljava/util/List;", "cachedBucket", "h", "previousDefaultSpans", "value", "()I", "(I)V", "slotsPerLine", "bucketSize", "totalSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f5698j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j gridContent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ArrayList<a> buckets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastLineIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartItemIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartKnownSpan;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int cachedBucketIndex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Integer> cachedBucket;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<androidx.compose.foundation.lazy.grid.b> previousDefaultSpans;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int slotsPerLine;

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/grid/j0$b;", "Landroidx/compose/foundation/lazy/grid/s;", "<init>", "()V", "", "b", "I", "a", "()I", "c", "(I)V", "maxCurrentLineSpan", "d", "maxLineSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements s {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f5710a = new b();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static int maxCurrentLineSpan;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static int maxLineSpan;

        private b() {
        }

        @Override // androidx.compose.foundation.lazy.grid.s
        public int a() {
            return maxCurrentLineSpan;
        }

        @Override // androidx.compose.foundation.lazy.grid.s
        public int b() {
            return maxLineSpan;
        }

        public void c(int i4) {
            maxCurrentLineSpan = i4;
        }

        public void d(int i4) {
            maxLineSpan = i4;
        }
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/j0$c;", "", "", "firstItemIndex", "", "Landroidx/compose/foundation/lazy/grid/b;", "spans", "<init>", "(ILjava/util/List;)V", "a", "I", "()I", "b", "Ljava/util/List;", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final int f5713c = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<androidx.compose.foundation.lazy.grid.b> spans;

        public c(int i4, @fg.l List<androidx.compose.foundation.lazy.grid.b> list) {
            this.firstItemIndex = i4;
            this.spans = list;
        }

        /* renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        @fg.l
        public final List<androidx.compose.foundation.lazy.grid.b> b() {
            return this.spans;
        }
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/j0$a;", "it", "", "a", "(Landroidx/compose/foundation/lazy/grid/j0$a;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<a, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i4) {
            super(1);
            this.f5716b = i4;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l a aVar) {
            return Integer.valueOf(aVar.getFirstItemIndex() - this.f5716b);
        }
    }

    public j0(@fg.l j jVar) {
        this.gridContent = jVar;
        ArrayList<a> arrayList = new ArrayList<>();
        int i4 = 0;
        arrayList.add(new a(i4, i4, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = kotlin.collections.j0.f74919b;
    }

    private final int a() {
        return ((int) Math.sqrt((f() * 1.0d) / this.slotsPerLine)) + 1;
    }

    private final List<androidx.compose.foundation.lazy.grid.b> b(int currentSlotsPerLine) {
        if (currentSlotsPerLine == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(currentSlotsPerLine);
        for (int i4 = 0; i4 < currentSlotsPerLine; i4++) {
            arrayList.add(androidx.compose.foundation.lazy.grid.b.a(i0.a(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void g() {
        this.buckets.clear();
        int i4 = 0;
        this.buckets.add(new a(i4, i4, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        if (r7 < r6) goto L28;
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.grid.j0.c c(int r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.j0.c(int):androidx.compose.foundation.lazy.grid.j0$c");
    }

    public final int d(int itemIndex) {
        int i4 = 0;
        if (f() <= 0) {
            return 0;
        }
        if (itemIndex >= f()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if (!this.gridContent.getHasCustomSpans()) {
            return itemIndex / this.slotsPerLine;
        }
        int x4 = kotlin.collections.w.x(this.buckets, 0, 0, new d(itemIndex), 3, null);
        int i5 = 2;
        if (x4 < 0) {
            x4 = (-x4) - 2;
        }
        int a5 = a() * x4;
        int firstItemIndex = this.buckets.get(x4).getFirstItemIndex();
        if (firstItemIndex > itemIndex) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i6 = 0;
        while (firstItemIndex < itemIndex) {
            int i7 = firstItemIndex + 1;
            int i10 = i(firstItemIndex, this.slotsPerLine - i6);
            i6 += i10;
            int i11 = this.slotsPerLine;
            if (i6 >= i11) {
                if (i6 == i11) {
                    a5++;
                    i6 = 0;
                } else {
                    a5++;
                    i6 = i10;
                }
            }
            if (a5 % a() == 0 && a5 / a() >= this.buckets.size()) {
                this.buckets.add(new a(i7 - (i6 > 0 ? 1 : 0), i4, i5, null));
            }
            firstItemIndex = i7;
        }
        return i(itemIndex, this.slotsPerLine - i6) + i6 > this.slotsPerLine ? a5 + 1 : a5;
    }

    /* renamed from: e, reason: from getter */
    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int f() {
        return this.gridContent.D().getSize();
    }

    public final void h(int i4) {
        if (i4 != this.slotsPerLine) {
            this.slotsPerLine = i4;
            g();
        }
    }

    public final int i(int itemIndex, int maxSpan) {
        b bVar = b.f5710a;
        bVar.c(maxSpan);
        bVar.d(this.slotsPerLine);
        c.a<i> aVar = this.gridContent.D().get(itemIndex);
        return (int) aVar.c().b().invoke(bVar, Integer.valueOf(itemIndex - aVar.getStartIndex())).getPackedValue();
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/j0$a;", "", "", "firstItemIndex", "firstItemKnownSpan", "<init>", "(II)V", "a", "I", "()I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int firstItemKnownSpan;

        public a(int i4, int i5) {
            this.firstItemIndex = i4;
            this.firstItemKnownSpan = i5;
        }

        /* renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        /* renamed from: b, reason: from getter */
        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ a(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
            this(i4, (i6 & 2) != 0 ? 0 : i5);
        }
    }
}
