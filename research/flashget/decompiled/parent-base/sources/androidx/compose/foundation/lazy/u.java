package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.j0;
import androidx.compose.ui.layout.n0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyListMeasureResult.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010.R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b9\u0010(R\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010&\u001a\u0004\b1\u0010(R\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b?\u0010(R\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\b;\u0010.R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b!\u0010DR\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010&\u001a\u0004\b+\u0010(R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010&\u001a\u0004\b@\u0010(R \u0010K\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00050G8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010(R\u0014\u0010O\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010(R\u0011\u0010Q\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bP\u0010.R\u001a\u0010T\u001a\u00020R8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b%\u0010SR\u0014\u0010U\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/foundation/lazy/u;", "Landroidx/compose/foundation/lazy/s;", "Landroidx/compose/ui/layout/n0;", "Landroidx/compose/foundation/lazy/v;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/j0;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/v;IZFLandroidx/compose/ui/layout/n0;FZLjava/util/List;IIIZLandroidx/compose/foundation/gestures/j0;II)V", "Lkotlin/k2;", "q", "()V", "delta", "updateAnimations", "C", "(IZ)Z", "a", "Landroidx/compose/foundation/lazy/v;", "v", "()Landroidx/compose/foundation/lazy/v;", "b", "I", "w", "()I", "B", "(I)V", "c", "Z", "t", "()Z", "z", "(Z)V", "d", "F", "u", "()F", "A", "(F)V", "e", "y", "f", "x", "g", "Ljava/util/List;", "j", "()Ljava/util/List;", "h", "i", "k", "l", "Landroidx/compose/foundation/gestures/j0;", "()Landroidx/compose/foundation/gestures/j0;", "m", "n", "", "Landroidx/compose/ui/layout/a;", "p", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "s", "canScrollBackward", "Landroidx/compose/ui/unit/u;", "()J", "viewportSize", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,124:1\n33#2,6:125\n*S KotlinDebug\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n*L\n110#1:125,6\n*E\n"})
/* loaded from: classes.dex */
public final class u implements s, n0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f6531p = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final v firstVisibleItem;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleItemScrollOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float consumedScroll;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float scrollBackAmount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<v> visibleItemsInfo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 orientation;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ n0 f6546o;

    public u(@fg.m v vVar, int i4, boolean z4, float f4, @fg.l n0 n0Var, float f5, boolean z5, @fg.l List<v> list, int i5, int i6, int i7, boolean z6, @fg.l j0 j0Var, int i10, int i11) {
        this.firstVisibleItem = vVar;
        this.firstVisibleItemScrollOffset = i4;
        this.canScrollForward = z4;
        this.consumedScroll = f4;
        this.scrollBackAmount = f5;
        this.remeasureNeeded = z5;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i5;
        this.viewportEndOffset = i6;
        this.totalItemsCount = i7;
        this.reverseLayout = z6;
        this.orientation = j0Var;
        this.afterContentPadding = i10;
        this.mainAxisItemSpacing = i11;
        this.f6546o = n0Var;
    }

    public final void A(float f4) {
        this.consumedScroll = f4;
    }

    public final void B(int i4) {
        this.firstVisibleItemScrollOffset = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (java.lang.Math.min((r0.getSizeWithSpacings() + r0.getOffset()) - r4.viewportStartOffset, (r2.getSizeWithSpacings() + r2.getOffset()) - r4.viewportEndOffset) > (-r5)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r4.firstVisibleItemScrollOffset -= r5;
        r0 = r4.visibleItemsInfo;
        r2 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r1 >= r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        r0.get(r1).a(r5, r6);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r4.consumedScroll = r5;
        r1 = true;
        r1 = true;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r4.canScrollForward != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r5 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        r4.canScrollForward = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (java.lang.Math.min(r4.viewportStartOffset - r0.getOffset(), r4.viewportEndOffset - r2.getOffset()) > r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(int r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.remeasureNeeded
            r1 = 0
            if (r0 != 0) goto L94
            java.util.List<androidx.compose.foundation.lazy.v> r0 = r4.visibleItemsInfo
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L94
            androidx.compose.foundation.lazy.v r0 = r4.firstVisibleItem
            if (r0 == 0) goto L94
            int r0 = r0.getSizeWithSpacings()
            int r2 = r4.firstVisibleItemScrollOffset
            int r2 = r2 - r5
            if (r2 < 0) goto L94
            if (r2 >= r0) goto L94
            java.util.List<androidx.compose.foundation.lazy.v> r0 = r4.visibleItemsInfo
            java.lang.Object r0 = kotlin.collections.w.B2(r0)
            androidx.compose.foundation.lazy.v r0 = (androidx.compose.foundation.lazy.v) r0
            java.util.List<androidx.compose.foundation.lazy.v> r2 = r4.visibleItemsInfo
            java.lang.Object r2 = kotlin.collections.w.p3(r2)
            androidx.compose.foundation.lazy.v r2 = (androidx.compose.foundation.lazy.v) r2
            boolean r3 = r0.getNonScrollableItem()
            if (r3 != 0) goto L94
            boolean r3 = r2.getNonScrollableItem()
            if (r3 == 0) goto L39
            goto L94
        L39:
            if (r5 >= 0) goto L5b
            int r3 = r0.getOffset()
            int r0 = r0.getSizeWithSpacings()
            int r0 = r0 + r3
            int r3 = r4.viewportStartOffset
            int r0 = r0 - r3
            int r3 = r2.getOffset()
            int r2 = r2.getSizeWithSpacings()
            int r2 = r2 + r3
            int r3 = r4.viewportEndOffset
            int r2 = r2 - r3
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = -r5
            if (r0 <= r2) goto L94
            goto L6f
        L5b:
            int r3 = r4.viewportStartOffset
            int r0 = r0.getOffset()
            int r3 = r3 - r0
            int r0 = r4.viewportEndOffset
            int r2 = r2.getOffset()
            int r0 = r0 - r2
            int r0 = java.lang.Math.min(r3, r0)
            if (r0 <= r5) goto L94
        L6f:
            int r0 = r4.firstVisibleItemScrollOffset
            int r0 = r0 - r5
            r4.firstVisibleItemScrollOffset = r0
            java.util.List<androidx.compose.foundation.lazy.v> r0 = r4.visibleItemsInfo
            int r2 = r0.size()
        L7a:
            if (r1 >= r2) goto L88
            java.lang.Object r3 = r0.get(r1)
            androidx.compose.foundation.lazy.v r3 = (androidx.compose.foundation.lazy.v) r3
            r3.a(r5, r6)
            int r1 = r1 + 1
            goto L7a
        L88:
            float r6 = (float) r5
            r4.consumedScroll = r6
            boolean r6 = r4.canScrollForward
            r1 = 1
            if (r6 != 0) goto L94
            if (r5 <= 0) goto L94
            r4.canScrollForward = r1
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.u.C(int, boolean):boolean");
    }

    @Override // androidx.compose.foundation.lazy.s
    @fg.l
    /* renamed from: a, reason: from getter */
    public j0 getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.s
    public long b() {
        return androidx.compose.ui.unit.v.a(this.f6546o.getWidth(), this.f6546o.getHeight());
    }

    @Override // androidx.compose.foundation.lazy.s
    /* renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.s
    /* renamed from: d, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.s
    public int e() {
        return -this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.s
    /* renamed from: f, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.s
    /* renamed from: g, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.n0
    public int getHeight() {
        return this.f6546o.getHeight();
    }

    @Override // androidx.compose.ui.layout.n0
    public int getWidth() {
        return this.f6546o.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.s
    /* renamed from: h, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.s
    /* renamed from: i, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.s
    @fg.l
    public List<v> j() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.n0
    @fg.l
    public Map<androidx.compose.ui.layout.a, Integer> p() {
        return this.f6546o.p();
    }

    @Override // androidx.compose.ui.layout.n0
    public void q() {
        this.f6546o.q();
    }

    public final boolean s() {
        v vVar = this.firstVisibleItem;
        return ((vVar != null ? vVar.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: u, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @fg.m
    /* renamed from: v, reason: from getter */
    public final v getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    /* renamed from: w, reason: from getter */
    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    /* renamed from: y, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final void z(boolean z4) {
        this.canScrollForward = z4;
    }
}
