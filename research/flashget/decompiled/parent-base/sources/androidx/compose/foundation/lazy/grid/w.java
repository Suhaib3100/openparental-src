package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.n0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyGridMeasureResult.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010%\u001a\u0004\b8\u0010'R\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b0\u0010'R\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010%\u001a\u0004\b=\u0010'R\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b<\u0010-R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b \u0010AR\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b*\u0010'R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b>\u0010'R \u0010F\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00050B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010'R\u0014\u0010J\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010'R\u0011\u0010K\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b?\u0010-R\u001a\u0010N\u001a\u00020L8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010MR\u0014\u0010O\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/foundation/lazy/grid/w;", "Landroidx/compose/foundation/lazy/grid/u;", "Landroidx/compose/ui/layout/n0;", "Landroidx/compose/foundation/lazy/grid/a0;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "remeasureNeeded", "", "Landroidx/compose/foundation/lazy/grid/x;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/j0;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/grid/a0;IZFLandroidx/compose/ui/layout/n0;ZLjava/util/List;IIIZLandroidx/compose/foundation/gestures/j0;II)V", "Lkotlin/k2;", "q", "()V", "delta", "v", "(I)Z", "a", "Landroidx/compose/foundation/lazy/grid/a0;", "n", "()Landroidx/compose/foundation/lazy/grid/a0;", "b", "I", "o", "()I", "u", "(I)V", "c", "Z", "l", "()Z", "s", "(Z)V", "d", "F", "m", "()F", "t", "(F)V", "e", "r", "f", "Ljava/util/List;", "j", "()Ljava/util/List;", "g", "h", "i", "k", "Landroidx/compose/foundation/gestures/j0;", "()Landroidx/compose/foundation/gestures/j0;", "", "Landroidx/compose/ui/layout/a;", "p", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "canScrollBackward", "Landroidx/compose/ui/unit/u;", "()J", "viewportSize", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,124:1\n33#2,6:125\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n*L\n110#1:125,6\n*E\n"})
/* loaded from: classes.dex */
public final class w implements u, n0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f5840o = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final a0 firstVisibleLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleLineScrollOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float consumedScroll;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<x> visibleItemsInfo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.gestures.j0 orientation;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* renamed from: n, reason: collision with root package name */
    private final /* synthetic */ n0 f5854n;

    public w(@fg.m a0 a0Var, int i4, boolean z4, float f4, @fg.l n0 n0Var, boolean z5, @fg.l List<x> list, int i5, int i6, int i7, boolean z6, @fg.l androidx.compose.foundation.gestures.j0 j0Var, int i10, int i11) {
        this.firstVisibleLine = a0Var;
        this.firstVisibleLineScrollOffset = i4;
        this.canScrollForward = z4;
        this.consumedScroll = f4;
        this.remeasureNeeded = z5;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i5;
        this.viewportEndOffset = i6;
        this.totalItemsCount = i7;
        this.reverseLayout = z6;
        this.orientation = j0Var;
        this.afterContentPadding = i10;
        this.mainAxisItemSpacing = i11;
        this.f5854n = n0Var;
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    @fg.l
    /* renamed from: a, reason: from getter */
    public androidx.compose.foundation.gestures.j0 getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    public long b() {
        return androidx.compose.ui.unit.v.a(this.f5854n.getF18967a(), this.f5854n.getF18968b());
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    /* renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    /* renamed from: d, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    public int e() {
        return -this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    /* renamed from: f, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    /* renamed from: g, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.n0
    /* renamed from: getHeight */
    public int getF18968b() {
        return this.f5854n.getF18968b();
    }

    @Override // androidx.compose.ui.layout.n0
    /* renamed from: getWidth */
    public int getF18967a() {
        return this.f5854n.getF18967a();
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    /* renamed from: h, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    /* renamed from: i, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.grid.u
    @fg.l
    public List<x> j() {
        return this.visibleItemsInfo;
    }

    public final boolean k() {
        a0 a0Var = this.firstVisibleLine;
        return ((a0Var != null ? a0Var.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: m, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @fg.m
    /* renamed from: n, reason: from getter */
    public final a0 getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    /* renamed from: o, reason: from getter */
    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    @Override // androidx.compose.ui.layout.n0
    @fg.l
    public Map<androidx.compose.ui.layout.a, Integer> p() {
        return this.f5854n.p();
    }

    @Override // androidx.compose.ui.layout.n0
    public void q() {
        this.f5854n.q();
    }

    /* renamed from: r, reason: from getter */
    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final void s(boolean z4) {
        this.canScrollForward = z4;
    }

    public final void t(float f4) {
        this.consumedScroll = f4;
    }

    public final void u(int i4) {
        this.firstVisibleLineScrollOffset = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (java.lang.Math.min((r0.getMainAxisSizeWithSpacings() + androidx.compose.foundation.gestures.snapping.e.d(r0, r5.orientation)) - r5.viewportStartOffset, (r2.getMainAxisSizeWithSpacings() + androidx.compose.foundation.gestures.snapping.e.d(r2, r5.orientation)) - r5.viewportEndOffset) > (-r6)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        r5.firstVisibleLineScrollOffset -= r6;
        r0 = r5.visibleItemsInfo;
        r2 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r1 >= r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r0.get(r1).e(r6);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        r5.consumedScroll = r6;
        r1 = true;
        r1 = true;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r5.canScrollForward != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r6 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        r5.canScrollForward = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (java.lang.Math.min(r5.viewportStartOffset - androidx.compose.foundation.gestures.snapping.e.d(r0, r5.orientation), r5.viewportEndOffset - androidx.compose.foundation.gestures.snapping.e.d(r2, r5.orientation)) > r6) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.remeasureNeeded
            r1 = 0
            if (r0 != 0) goto L9c
            java.util.List<androidx.compose.foundation.lazy.grid.x> r0 = r5.visibleItemsInfo
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9c
            androidx.compose.foundation.lazy.grid.a0 r0 = r5.firstVisibleLine
            if (r0 == 0) goto L9c
            int r0 = r0.getMainAxisSizeWithSpacings()
            int r2 = r5.firstVisibleLineScrollOffset
            int r2 = r2 - r6
            if (r2 < 0) goto L9c
            if (r2 >= r0) goto L9c
            java.util.List<androidx.compose.foundation.lazy.grid.x> r0 = r5.visibleItemsInfo
            java.lang.Object r0 = kotlin.collections.w.B2(r0)
            androidx.compose.foundation.lazy.grid.x r0 = (androidx.compose.foundation.lazy.grid.x) r0
            java.util.List<androidx.compose.foundation.lazy.grid.x> r2 = r5.visibleItemsInfo
            java.lang.Object r2 = kotlin.collections.w.p3(r2)
            androidx.compose.foundation.lazy.grid.x r2 = (androidx.compose.foundation.lazy.grid.x) r2
            boolean r3 = r0.getNonScrollableItem()
            if (r3 != 0) goto L9c
            boolean r3 = r2.getNonScrollableItem()
            if (r3 == 0) goto L39
            goto L9c
        L39:
            if (r6 >= 0) goto L5f
            androidx.compose.foundation.gestures.j0 r3 = r5.orientation
            int r3 = androidx.compose.foundation.gestures.snapping.e.d(r0, r3)
            int r0 = r0.getMainAxisSizeWithSpacings()
            int r0 = r0 + r3
            int r3 = r5.viewportStartOffset
            int r0 = r0 - r3
            androidx.compose.foundation.gestures.j0 r3 = r5.orientation
            int r3 = androidx.compose.foundation.gestures.snapping.e.d(r2, r3)
            int r2 = r2.getMainAxisSizeWithSpacings()
            int r2 = r2 + r3
            int r3 = r5.viewportEndOffset
            int r2 = r2 - r3
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = -r6
            if (r0 <= r2) goto L9c
            goto L77
        L5f:
            int r3 = r5.viewportStartOffset
            androidx.compose.foundation.gestures.j0 r4 = r5.orientation
            int r0 = androidx.compose.foundation.gestures.snapping.e.d(r0, r4)
            int r3 = r3 - r0
            int r0 = r5.viewportEndOffset
            androidx.compose.foundation.gestures.j0 r4 = r5.orientation
            int r2 = androidx.compose.foundation.gestures.snapping.e.d(r2, r4)
            int r0 = r0 - r2
            int r0 = java.lang.Math.min(r3, r0)
            if (r0 <= r6) goto L9c
        L77:
            int r0 = r5.firstVisibleLineScrollOffset
            int r0 = r0 - r6
            r5.firstVisibleLineScrollOffset = r0
            java.util.List<androidx.compose.foundation.lazy.grid.x> r0 = r5.visibleItemsInfo
            int r2 = r0.size()
        L82:
            if (r1 >= r2) goto L90
            java.lang.Object r3 = r0.get(r1)
            androidx.compose.foundation.lazy.grid.x r3 = (androidx.compose.foundation.lazy.grid.x) r3
            r3.e(r6)
            int r1 = r1 + 1
            goto L82
        L90:
            float r0 = (float) r6
            r5.consumedScroll = r0
            boolean r0 = r5.canScrollForward
            r1 = 1
            if (r0 != 0) goto L9c
            if (r6 <= 0) goto L9c
            r5.canScrollForward = r1
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.w.v(int):boolean");
    }
}
