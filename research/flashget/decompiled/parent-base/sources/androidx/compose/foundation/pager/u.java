package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.j0;
import androidx.compose.ui.layout.n0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PagerMeasureResult.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b)\u0010(R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b/\u0010(R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b+\u0010(R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b0\u00103R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b6\u00109R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010;\u001a\u0004\b:\u0010<\"\u0004\b=\u0010>R\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010&\u001a\u0004\b?\u0010(\"\u0004\b@\u0010AR\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00102\u001a\u0004\b4\u00103\"\u0004\bC\u0010DR\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bB\u00103R \u0010I\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00060E8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010(R\u0014\u0010M\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010(R\u001a\u0010P\u001a\u00020N8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b%\u0010OR\u0014\u0010Q\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0011\u0010R\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b1\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/foundation/pager/u;", "Landroidx/compose/foundation/pager/n;", "Landroidx/compose/ui/layout/n0;", "", "Landroidx/compose/foundation/pager/d;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Landroidx/compose/foundation/gestures/j0;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondBoundsPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "measureResult", "remeasureNeeded", "<init>", "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/j0;IIZILandroidx/compose/foundation/pager/d;Landroidx/compose/foundation/pager/d;FIZLandroidx/compose/ui/layout/n0;Z)V", "Lkotlin/k2;", "q", "()V", "delta", "t", "(I)Z", "a", "Ljava/util/List;", "y", "()Ljava/util/List;", "b", "I", "v", "()I", "c", "z", "d", "e", "Landroidx/compose/foundation/gestures/j0;", "()Landroidx/compose/foundation/gestures/j0;", "f", "g", "h", "Z", "()Z", "i", "x", "j", "Landroidx/compose/foundation/pager/d;", "l", "()Landroidx/compose/foundation/pager/d;", "k", "F", "()F", "r", "(F)V", "m", "s", "(I)V", "n", "o", "(Z)V", "", "Landroidx/compose/ui/layout/a;", "p", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "Landroidx/compose/ui/unit/u;", "()J", "viewportSize", "beforeContentPadding", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPagerMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,120:1\n33#2,6:121\n*S KotlinDebug\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n*L\n107#1:121,6\n*E\n"})
/* loaded from: classes.dex */
public final class u implements n, n0 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f6921q = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<d> visiblePagesInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int pageSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pageSpacing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 orientation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int beyondBoundsPageCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final d firstVisiblePage;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final d currentPage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float currentPageOffsetFraction;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePageScrollOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* renamed from: p, reason: collision with root package name */
    private final /* synthetic */ n0 f6937p;

    public u(@fg.l List<d> list, int i4, int i5, int i6, @fg.l j0 j0Var, int i7, int i10, boolean z4, int i11, @fg.m d dVar, @fg.m d dVar2, float f4, int i12, boolean z5, @fg.l n0 n0Var, boolean z6) {
        this.visiblePagesInfo = list;
        this.pageSize = i4;
        this.pageSpacing = i5;
        this.afterContentPadding = i6;
        this.orientation = j0Var;
        this.viewportStartOffset = i7;
        this.viewportEndOffset = i10;
        this.reverseLayout = z4;
        this.beyondBoundsPageCount = i11;
        this.firstVisiblePage = dVar;
        this.currentPage = dVar2;
        this.currentPageOffsetFraction = f4;
        this.firstVisiblePageScrollOffset = i12;
        this.canScrollForward = z5;
        this.remeasureNeeded = z6;
        this.f6937p = n0Var;
    }

    @Override // androidx.compose.foundation.pager.n
    @fg.l
    /* renamed from: a, reason: from getter */
    public j0 getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.n
    public long b() {
        return androidx.compose.ui.unit.v.a(this.f6937p.getWidth(), this.f6937p.getHeight());
    }

    @Override // androidx.compose.foundation.pager.n
    /* renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.pager.n
    /* renamed from: d, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.n
    public int e() {
        return -this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.n
    /* renamed from: f, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.n
    /* renamed from: g, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.n0
    public int getHeight() {
        return this.f6937p.getHeight();
    }

    @Override // androidx.compose.ui.layout.n0
    public int getWidth() {
        return this.f6937p.getWidth();
    }

    public final boolean h() {
        d dVar = this.firstVisiblePage;
        return ((dVar != null ? dVar.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @fg.m
    /* renamed from: j, reason: from getter */
    public final d getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: k, reason: from getter */
    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    @fg.m
    /* renamed from: l, reason: from getter */
    public final d getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* renamed from: m, reason: from getter */
    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final void o(boolean z4) {
        this.canScrollForward = z4;
    }

    @Override // androidx.compose.ui.layout.n0
    @fg.l
    public Map<androidx.compose.ui.layout.a, Integer> p() {
        return this.f6937p.p();
    }

    @Override // androidx.compose.ui.layout.n0
    public void q() {
        this.f6937p.q();
    }

    public final void r(float f4) {
        this.currentPageOffsetFraction = f4;
    }

    public final void s(int i4) {
        this.firstVisiblePageScrollOffset = i4;
    }

    public final boolean t(int delta) {
        int i4;
        int i5 = this.pageSize + this.pageSpacing;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (!this.remeasureNeeded && !this.visiblePagesInfo.isEmpty() && this.firstVisiblePage != null && (i4 = this.firstVisiblePageScrollOffset - delta) >= 0 && i4 < i5) {
            float f4 = i5 != 0 ? delta / i5 : 0.0f;
            float f5 = this.currentPageOffsetFraction - f4;
            if (this.currentPage != null && f5 < 0.5f && f5 > -0.5f) {
                d dVar = (d) kotlin.collections.w.B2(this.visiblePagesInfo);
                d dVar2 = (d) kotlin.collections.w.p3(this.visiblePagesInfo);
                if (delta >= 0 ? Math.min(this.viewportStartOffset - dVar.getOffset(), this.viewportEndOffset - dVar2.getOffset()) > delta : Math.min((dVar.getOffset() + i5) - this.viewportStartOffset, (dVar2.getOffset() + i5) - this.viewportEndOffset) > (-delta)) {
                    this.currentPageOffsetFraction -= f4;
                    this.firstVisiblePageScrollOffset -= delta;
                    List<d> list = this.visiblePagesInfo;
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        list.get(i6).a(delta);
                    }
                    z4 = true;
                    z4 = true;
                    z4 = true;
                    if (!this.canScrollForward && delta > 0) {
                        this.canScrollForward = true;
                    }
                }
            }
        }
        return z4;
    }

    @Override // androidx.compose.foundation.pager.n
    /* renamed from: v, reason: from getter */
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.n
    /* renamed from: x, reason: from getter */
    public int getBeyondBoundsPageCount() {
        return this.beyondBoundsPageCount;
    }

    @Override // androidx.compose.foundation.pager.n
    @fg.l
    public List<d> y() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.foundation.pager.n
    /* renamed from: z, reason: from getter */
    public int getPageSpacing() {
        return this.pageSpacing;
    }
}
