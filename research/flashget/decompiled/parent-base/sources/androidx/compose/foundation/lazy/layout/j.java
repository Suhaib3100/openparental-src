package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.p0;
import androidx.compose.ui.node.s1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: LazyLayoutAnimation.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u000b*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/layout/j;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/s1;", "Landroidx/compose/animation/core/p0;", "", "appearanceSpec", "Landroidx/compose/ui/unit/q;", "placementSpec", "<init>", "(Landroidx/compose/animation/core/p0;Landroidx/compose/animation/core/p0;)V", "Landroidx/compose/ui/unit/d;", "", "parentData", "T", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Ljava/lang/Object;", "p", "Landroidx/compose/animation/core/p0;", "y7", "()Landroidx/compose/animation/core/p0;", "A7", "(Landroidx/compose/animation/core/p0;)V", "q", "z7", "B7", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j extends q.d implements s1 {

    /* renamed from: r, reason: collision with root package name */
    public static final int f6071r = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p0<Float> appearanceSpec;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p0<androidx.compose.ui.unit.q> placementSpec;

    public j(@fg.m p0<Float> p0Var, @fg.m p0<androidx.compose.ui.unit.q> p0Var2) {
        this.appearanceSpec = p0Var;
        this.placementSpec = p0Var2;
    }

    public final void A7(@fg.m p0<Float> p0Var) {
        this.appearanceSpec = p0Var;
    }

    public final void B7(@fg.m p0<androidx.compose.ui.unit.q> p0Var) {
        this.placementSpec = p0Var;
    }

    @Override // androidx.compose.ui.node.s1
    @fg.l
    public Object T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj) {
        return this;
    }

    @fg.m
    public final p0<Float> y7() {
        return this.appearanceSpec;
    }

    @fg.m
    public final p0<androidx.compose.ui.unit.q> z7() {
        return this.placementSpec;
    }
}
