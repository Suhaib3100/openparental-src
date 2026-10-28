package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0085\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\b%\u0010CR\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b7\u0010=R\u001a\u0010\u0015\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010<\u001a\u0004\b-\u0010=R\u001a\u0010\u0016\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b1\u0010=R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b'\u0010=R\u001a\u0010\u0018\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\b>\u0010=R\u001a\u0010H\u001a\u00020D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b!\u0010GR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\r0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010KR\u0014\u0010N\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010=R\u0014\u0010P\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010=R\u0011\u0010Q\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/y;", "Landroidx/compose/foundation/lazy/staggeredgrid/t;", "Landroidx/compose/ui/layout/n0;", "", "firstVisibleItemIndices", "firstVisibleItemScrollOffsets", "", "consumedScroll", "measureResult", "", "canScrollForward", "isVertical", "remeasureNeeded", "", "totalItemsCount", "", "Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "visibleItemsInfo", "Landroidx/compose/ui/unit/u;", "viewportSize", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "mainAxisItemSpacing", "<init>", "([I[IFLandroidx/compose/ui/layout/n0;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/w;)V", "Lkotlin/k2;", "q", "()V", "delta", "v", "(I)Z", "a", "[I", "m", "()[I", "b", "n", "c", "F", "l", "()F", "u", "(F)V", "d", "Landroidx/compose/ui/layout/n0;", "o", "()Landroidx/compose/ui/layout/n0;", "e", "Z", "k", "()Z", "t", "(Z)V", "f", "s", "g", "r", "h", "I", "()I", "i", "Ljava/util/List;", "j", "()Ljava/util/List;", "J", "()J", "Landroidx/compose/foundation/gestures/j0;", "p", "Landroidx/compose/foundation/gestures/j0;", "()Landroidx/compose/foundation/gestures/j0;", "orientation", "", "Landroidx/compose/ui/layout/a;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,249:1\n33#2,6:250\n33#2,6:256\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n181#1:250,6\n214#1:256,6\n*E\n"})
/* loaded from: classes.dex */
public final class y implements t, androidx.compose.ui.layout.n0 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f6504q = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] firstVisibleItemIndices;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] firstVisibleItemScrollOffsets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float consumedScroll;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.layout.n0 measureResult;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<a0> visibleItemsInfo;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long viewportSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.gestures.j0 orientation;

    public /* synthetic */ y(int[] iArr, int[] iArr2, float f4, androidx.compose.ui.layout.n0 n0Var, boolean z4, boolean z5, boolean z6, int i4, List list, long j4, int i5, int i6, int i7, int i10, int i11, kotlin.jvm.internal.w wVar) {
        this(iArr, iArr2, f4, n0Var, z4, z5, z6, i4, list, j4, i5, i6, i7, i10, i11);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.t
    @fg.l
    /* renamed from: a, reason: from getter */
    public androidx.compose.foundation.gestures.j0 getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.t
    /* renamed from: b, reason: from getter */
    public long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.t
    /* renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.t
    /* renamed from: d, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.t
    /* renamed from: e, reason: from getter */
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.t
    /* renamed from: f, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    public final boolean g() {
        return this.firstVisibleItemIndices[0] != 0 || this.firstVisibleItemScrollOffsets[0] > 0;
    }

    @Override // androidx.compose.ui.layout.n0
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.ui.layout.n0
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.t
    /* renamed from: h, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.t
    /* renamed from: i, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.t
    @fg.l
    public List<a0> j() {
        return this.visibleItemsInfo;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: l, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final androidx.compose.ui.layout.n0 getMeasureResult() {
        return this.measureResult;
    }

    @Override // androidx.compose.ui.layout.n0
    @fg.l
    public Map<androidx.compose.ui.layout.a, Integer> p() {
        return this.measureResult.p();
    }

    @Override // androidx.compose.ui.layout.n0
    public void q() {
        this.measureResult.q();
    }

    /* renamed from: r, reason: from getter */
    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void t(boolean z4) {
        this.canScrollForward = z4;
    }

    public final void u(float f4) {
        this.consumedScroll = f4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int r9) {
        /*
            r8 = this;
            boolean r0 = r8.remeasureNeeded
            r1 = 0
            if (r0 != 0) goto Lc5
            java.util.List<androidx.compose.foundation.lazy.staggeredgrid.a0> r0 = r8.visibleItemsInfo
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc5
            int[] r0 = r8.firstVisibleItemIndices
            int r0 = r0.length
            if (r0 != 0) goto L14
            goto Lc5
        L14:
            int[] r0 = r8.firstVisibleItemScrollOffsets
            int r0 = r0.length
            if (r0 != 0) goto L1b
            goto Lc5
        L1b:
            java.util.List<androidx.compose.foundation.lazy.staggeredgrid.a0> r0 = r8.visibleItemsInfo
            int r2 = r0.size()
            r3 = r1
        L22:
            r4 = 1
            if (r3 >= r2) goto L95
            java.lang.Object r5 = r0.get(r3)
            androidx.compose.foundation.lazy.staggeredgrid.a0 r5 = (androidx.compose.foundation.lazy.staggeredgrid.a0) r5
            boolean r6 = r5.getNonScrollableItem()
            if (r6 != 0) goto L94
            int r6 = r5.i()
            if (r6 > 0) goto L39
            r6 = r4
            goto L3a
        L39:
            r6 = r1
        L3a:
            int r7 = r5.i()
            int r7 = r7 + r9
            if (r7 > 0) goto L42
            goto L43
        L42:
            r4 = r1
        L43:
            if (r6 == r4) goto L46
            goto L94
        L46:
            int r4 = r5.i()
            int r6 = r8.viewportStartOffset
            if (r4 > r6) goto L69
            if (r9 >= 0) goto L60
            int r4 = r5.i()
            int r6 = r5.getSizeWithSpacings()
            int r6 = r6 + r4
            int r4 = r8.viewportStartOffset
            int r6 = r6 - r4
            int r4 = -r9
            if (r6 <= r4) goto L68
            goto L69
        L60:
            int r4 = r5.i()
            int r6 = r6 - r4
            if (r6 <= r9) goto L68
            goto L69
        L68:
            return r1
        L69:
            int r4 = r5.i()
            int r6 = r5.getSizeWithSpacings()
            int r6 = r6 + r4
            int r4 = r8.viewportEndOffset
            if (r6 < r4) goto L91
            if (r9 >= 0) goto L88
            int r4 = r5.i()
            int r5 = r5.getSizeWithSpacings()
            int r5 = r5 + r4
            int r4 = r8.viewportEndOffset
            int r5 = r5 - r4
            int r4 = -r9
            if (r5 <= r4) goto L90
            goto L91
        L88:
            int r5 = r5.i()
            int r4 = r4 - r5
            if (r4 <= r9) goto L90
            goto L91
        L90:
            return r1
        L91:
            int r3 = r3 + 1
            goto L22
        L94:
            return r1
        L95:
            int[] r0 = r8.firstVisibleItemScrollOffsets
            int r0 = r0.length
            r2 = r1
        L99:
            if (r2 >= r0) goto La5
            int[] r3 = r8.firstVisibleItemScrollOffsets
            r5 = r3[r2]
            int r5 = r5 - r9
            r3[r2] = r5
            int r2 = r2 + 1
            goto L99
        La5:
            java.util.List<androidx.compose.foundation.lazy.staggeredgrid.a0> r0 = r8.visibleItemsInfo
            int r2 = r0.size()
        Lab:
            if (r1 >= r2) goto Lb9
            java.lang.Object r3 = r0.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.a0 r3 = (androidx.compose.foundation.lazy.staggeredgrid.a0) r3
            r3.d(r9)
            int r1 = r1 + 1
            goto Lab
        Lb9:
            float r0 = (float) r9
            r8.consumedScroll = r0
            boolean r0 = r8.canScrollForward
            if (r0 != 0) goto Lc4
            if (r9 <= 0) goto Lc4
            r8.canScrollForward = r4
        Lc4:
            return r4
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.y.v(int):boolean");
    }

    private y(int[] iArr, int[] iArr2, float f4, androidx.compose.ui.layout.n0 n0Var, boolean z4, boolean z5, boolean z6, int i4, List<a0> list, long j4, int i5, int i6, int i7, int i10, int i11) {
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f4;
        this.measureResult = n0Var;
        this.canScrollForward = z4;
        this.isVertical = z5;
        this.remeasureNeeded = z6;
        this.totalItemsCount = i4;
        this.visibleItemsInfo = list;
        this.viewportSize = j4;
        this.viewportStartOffset = i5;
        this.viewportEndOffset = i6;
        this.beforeContentPadding = i7;
        this.afterContentPadding = i10;
        this.mainAxisItemSpacing = i11;
        this.orientation = z5 ? androidx.compose.foundation.gestures.j0.Vertical : androidx.compose.foundation.gestures.j0.Horizontal;
    }
}
