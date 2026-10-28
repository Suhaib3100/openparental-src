package androidx.compose.foundation.pager;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.i2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PagerScrollPosition.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u000eJ\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010!R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001cR\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u00106\u001a\u0002038\u0006¢\u0006\f\n\u0004\b#\u00104\u001a\u0004\b0\u00105¨\u00067"}, d2 = {"Landroidx/compose/foundation/pager/x;", "", "", "currentPage", "", "currentPageOffsetFraction", "Landroidx/compose/foundation/pager/c0;", "state", "<init>", "(IFLandroidx/compose/foundation/pager/c0;)V", "page", "pageOffsetFraction", "Lkotlin/k2;", "k", "(IF)V", "Landroidx/compose/foundation/pager/u;", "measureResult", "m", "(Landroidx/compose/foundation/pager/u;)V", "index", "scrollOffsetFraction", "h", "Landroidx/compose/foundation/pager/r;", "itemProvider", "g", "(Landroidx/compose/foundation/pager/r;I)I", "offsetFraction", "l", "(F)V", "b", "()I", "delta", "a", "(I)V", "Landroidx/compose/foundation/pager/c0;", "f", "()Landroidx/compose/foundation/pager/c0;", "<set-?>", "Landroidx/compose/runtime/i2;", "c", "i", "Landroidx/compose/runtime/h2;", "d", "()F", "j", "", "Z", "hadFirstNotEmptyLayout", "e", "Ljava/lang/Object;", "lastKnownCurrentPageKey", "Landroidx/compose/foundation/lazy/layout/z;", "Landroidx/compose/foundation/lazy/layout/z;", "()Landroidx/compose/foundation/lazy/layout/z;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPositionKt\n*L\n1#1,151:1\n75#2:152\n108#2,2:153\n76#3:155\n109#3,2:156\n147#4,4:158\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n40#1:152\n40#1:153,2\n43#1:155\n43#1:156,2\n124#1:158,4\n*E\n"})
/* loaded from: classes.dex */
public final class x {

    /* renamed from: g, reason: collision with root package name */
    public static final int f6940g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 currentPage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h2 currentPageOffsetFraction;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object lastKnownCurrentPageKey;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.z nearestRangeState;

    public x(int i4, float f4, @fg.l c0 c0Var) {
        this.state = c0Var;
        this.currentPage = androidx.compose.runtime.b.c(i4);
        this.currentPageOffsetFraction = androidx.compose.runtime.b.b(f4);
        this.nearestRangeState = new androidx.compose.foundation.lazy.layout.z(i4, 30, 100);
    }

    private final void i(int i4) {
        this.currentPage.k(i4);
    }

    private final void j(float f4) {
        this.currentPageOffsetFraction.E(f4);
    }

    private final void k(int page, float pageOffsetFraction) {
        i(page);
        this.nearestRangeState.l(page);
        if (Math.abs(pageOffsetFraction) == 0.0f) {
            pageOffsetFraction = 0.0f;
        }
        j(pageOffsetFraction);
    }

    public final void a(int delta) {
        j(this.currentPageOffsetFraction.b() + (this.state.M() == 0 ? 0.0f : delta / this.state.M()));
    }

    public final int b() {
        return kotlin.math.b.L0((this.currentPageOffsetFraction.b() + this.currentPage.f()) * this.state.M());
    }

    public final int c() {
        return this.currentPage.f();
    }

    public final float d() {
        return this.currentPageOffsetFraction.b();
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.z getNearestRangeState() {
        return this.nearestRangeState;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final c0 getState() {
        return this.state;
    }

    public final int g(@fg.l r itemProvider, int index) {
        int a5 = androidx.compose.foundation.lazy.layout.t.a(itemProvider, this.lastKnownCurrentPageKey, index);
        if (index != a5) {
            i(a5);
            this.nearestRangeState.l(index);
        }
        return a5;
    }

    public final void h(int index, float scrollOffsetFraction) {
        k(index, scrollOffsetFraction);
        this.lastKnownCurrentPageKey = null;
    }

    public final void l(float offsetFraction) {
        j(offsetFraction);
    }

    public final void m(@fg.l u measureResult) {
        d currentPage = measureResult.getCurrentPage();
        this.lastKnownCurrentPageKey = currentPage != null ? currentPage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || !measureResult.y().isEmpty()) {
            this.hadFirstNotEmptyLayout = true;
            d currentPage2 = measureResult.getCurrentPage();
            k(currentPage2 != null ? currentPage2.getIndex() : 0, measureResult.getCurrentPageOffsetFraction());
        }
    }

    public /* synthetic */ x(int i4, float f4, c0 c0Var, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 0 : i4, (i5 & 2) != 0 ? 0.0f : f4, c0Var);
    }
}
