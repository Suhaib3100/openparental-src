package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.r0;

/* compiled from: LazyStaggeredGridMeasure.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\r*\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020 *\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b+\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\b/\u00105R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\b'\u0010@R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\b#\u0010@R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\bC\u00108R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bB\u0010@R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b)\u0010E\u001a\u0004\b3\u0010FR\u0017\u0010J\u001a\u00020G8\u0006¢\u0006\f\n\u0004\b1\u0010H\u001a\u0004\bD\u0010IR\u0017\u0010N\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bC\u0010L\u001a\u0004\b=\u0010MR\u0017\u0010O\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010>\u001a\u0004\b9\u0010@R\u0016\u0010R\u001a\u00020\r*\u00020 8Æ\u0002¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010N\u001a\u00020\u0005*\u00020 8Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u0010S\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006T"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/u;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/m;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "resolvedSlots", "Landroidx/compose/ui/unit/b;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/x;", "measureScope", "mainAxisAvailableSize", "Landroidx/compose/ui/unit/q;", "contentOffset", "beforeContentPadding", "afterContentPadding", "reverseLayout", "mainAxisSpacing", "Lkotlinx/coroutines/r0;", "coroutineScope", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/j0;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/m;Landroidx/compose/foundation/lazy/staggeredgrid/h0;JZLandroidx/compose/foundation/lazy/layout/x;IJIIZILkotlinx/coroutines/r0;Lkotlin/jvm/internal/w;)V", "itemIndex", "s", "(Landroidx/compose/foundation/lazy/staggeredgrid/m;I)Z", "lane", "Landroidx/compose/foundation/lazy/staggeredgrid/l0;", "q", "(Landroidx/compose/foundation/lazy/staggeredgrid/m;II)J", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "r", "()Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "b", "Ljava/util/List;", "n", "()Ljava/util/List;", "c", "Landroidx/compose/foundation/lazy/staggeredgrid/m;", "f", "()Landroidx/compose/foundation/lazy/staggeredgrid/m;", "d", "Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "o", "()Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "e", "J", "()J", "Z", "u", "()Z", "g", "Landroidx/compose/foundation/lazy/layout/x;", "l", "()Landroidx/compose/foundation/lazy/layout/x;", "h", "I", "j", "()I", "i", "k", "p", "m", "Lkotlinx/coroutines/r0;", "()Lkotlinx/coroutines/r0;", "Landroidx/compose/foundation/lazy/staggeredgrid/x;", "Landroidx/compose/foundation/lazy/staggeredgrid/x;", "()Landroidx/compose/foundation/lazy/staggeredgrid/x;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/s;", "Landroidx/compose/foundation/lazy/staggeredgrid/s;", "()Landroidx/compose/foundation/lazy/staggeredgrid/s;", "laneInfo", "laneCount", "t", "(J)Z", "isFullSpan", "(J)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1225:1\n236#1:1231\n953#2:1226\n952#2:1227\n951#2:1229\n953#2:1232\n952#2:1233\n951#2:1235\n62#3:1228\n55#3:1230\n62#3:1234\n55#3:1236\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n239#1:1231\n236#1:1226\n236#1:1227\n236#1:1229\n239#1:1232\n239#1:1233\n239#1:1235\n236#1:1228\n236#1:1230\n239#1:1234\n239#1:1236\n*E\n"})
/* loaded from: classes.dex */
public final class u {

    /* renamed from: r, reason: collision with root package name */
    public static final int f6466r = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Integer> pinnedItems;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m itemProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 resolvedSlots;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.x measureScope;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisAvailableSize;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long contentOffset;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r0 coroutineScope;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x measuredItemProvider;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s laneInfo;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int laneCount;

    /* compiled from: LazyStaggeredGridMeasure.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JG\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/u$a", "Landroidx/compose/foundation/lazy/staggeredgrid/x;", "", "index", "lane", "span", "", "key", "contentType", "", "Landroidx/compose/ui/layout/i1;", "placeables", "Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "b", "(IIILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends x {
        a(boolean z4, m mVar, androidx.compose.foundation.lazy.layout.x xVar, h0 h0Var) {
            super(z4, mVar, xVar, h0Var);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.x
        @fg.l
        public a0 b(int index, int lane, int span, @fg.l Object key, @fg.m Object contentType, @fg.l List<? extends i1> placeables) {
            return new a0(index, key, placeables, u.this.getIsVertical(), u.this.getMainAxisSpacing(), lane, span, u.this.getBeforeContentPadding(), u.this.getAfterContentPadding(), contentType, u.this.getState().getPlacementAnimator());
        }
    }

    public /* synthetic */ u(j0 j0Var, List list, m mVar, h0 h0Var, long j4, boolean z4, androidx.compose.foundation.lazy.layout.x xVar, int i4, long j5, int i5, int i6, boolean z5, int i7, r0 r0Var, kotlin.jvm.internal.w wVar) {
        this(j0Var, list, mVar, h0Var, j4, z4, xVar, i4, j5, i5, i6, z5, i7, r0Var);
    }

    /* renamed from: a, reason: from getter */
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    /* renamed from: b, reason: from getter */
    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* renamed from: c, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* renamed from: d, reason: from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final m getItemProvider() {
        return this.itemProvider;
    }

    /* renamed from: g, reason: from getter */
    public final int getLaneCount() {
        return this.laneCount;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final s getLaneInfo() {
        return this.laneInfo;
    }

    public final int i(long j4) {
        int i4 = (int) (4294967295L & j4);
        int i5 = (int) (j4 >> 32);
        if (i4 - i5 != 1) {
            return -2;
        }
        return i5;
    }

    /* renamed from: j, reason: from getter */
    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    /* renamed from: k, reason: from getter */
    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.x getMeasureScope() {
        return this.measureScope;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final x getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    @fg.l
    public final List<Integer> n() {
        return this.pinnedItems;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final h0 getResolvedSlots() {
        return this.resolvedSlots;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    public final long q(@fg.l m mVar, int i4, int i5) {
        boolean b5 = mVar.g().b(i4);
        int i6 = b5 ? this.laneCount : 1;
        if (b5) {
            i5 = 0;
        }
        return l0.b(i5, i6);
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final j0 getState() {
        return this.state;
    }

    public final boolean s(@fg.l m mVar, int i4) {
        return mVar.g().b(i4);
    }

    public final boolean t(long j4) {
        return ((int) (4294967295L & j4)) - ((int) (j4 >> 32)) != 1;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    private u(j0 j0Var, List<Integer> list, m mVar, h0 h0Var, long j4, boolean z4, androidx.compose.foundation.lazy.layout.x xVar, int i4, long j5, int i5, int i6, boolean z5, int i7, r0 r0Var) {
        this.state = j0Var;
        this.pinnedItems = list;
        this.itemProvider = mVar;
        this.resolvedSlots = h0Var;
        this.constraints = j4;
        this.isVertical = z4;
        this.measureScope = xVar;
        this.mainAxisAvailableSize = i4;
        this.contentOffset = j5;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.reverseLayout = z5;
        this.mainAxisSpacing = i7;
        this.coroutineScope = r0Var;
        this.measuredItemProvider = new a(z4, mVar, xVar, h0Var);
        this.laneInfo = j0Var.getLaneInfo();
        this.laneCount = h0Var.getSizes().length;
    }
}
