package androidx.compose.foundation.pager;

import kotlin.Metadata;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/pager/j;", "Landroidx/compose/foundation/gestures/k;", "Landroidx/compose/foundation/pager/c0;", "pagerState", "<init>", "(Landroidx/compose/foundation/pager/c0;)V", "", "offset", "size", "containerSize", "a", "(FFF)F", "b", "Landroidx/compose/foundation/pager/c0;", "c", "()Landroidx/compose/foundation/pager/c0;", "Landroidx/compose/animation/core/k;", "Landroidx/compose/animation/core/k;", "()Landroidx/compose/animation/core/k;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class j implements androidx.compose.foundation.gestures.k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 pagerState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.k<Float> scrollAnimationSpec = androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);

    public j(@fg.l c0 c0Var) {
        this.pagerState = c0Var;
    }

    @Override // androidx.compose.foundation.gestures.k
    public float a(float offset, float size, float containerSize) {
        if (offset >= containerSize || offset < 0.0f) {
            return offset;
        }
        if ((size > containerSize || size + offset <= containerSize) && Math.abs(this.pagerState.z()) == 0.0f) {
            return 0.0f;
        }
        return offset;
    }

    @Override // androidx.compose.foundation.gestures.k
    @fg.l
    public androidx.compose.animation.core.k<Float> b() {
        return this.scrollAnimationSpec;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final c0 getPagerState() {
        return this.pagerState;
    }
}
