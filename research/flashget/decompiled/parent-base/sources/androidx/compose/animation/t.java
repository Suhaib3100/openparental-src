package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import kotlin.Metadata;

/* compiled from: AnimatedVisibility.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@j0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/t;", "Landroidx/compose/animation/s;", "Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/b0;", "transition", "<init>", "(Landroidx/compose/animation/core/e2;)V", "a", "Landroidx/compose/animation/core/e2;", "b", "()Landroidx/compose/animation/core/e2;", "f", "Landroidx/compose/runtime/k2;", "Landroidx/compose/ui/unit/u;", "Landroidx/compose/runtime/k2;", "()Landroidx/compose/runtime/k2;", "targetSize", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t implements s {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3358c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e2<b0> transition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<androidx.compose.ui.unit.u> targetSize;

    public t(@fg.l e2<b0> e2Var) {
        k2<androidx.compose.ui.unit.u> g4;
        this.transition = e2Var;
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        g4 = t4.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f21529c), null, 2, null);
        this.targetSize = g4;
    }

    @fg.l
    public final k2<androidx.compose.ui.unit.u> a() {
        return this.targetSize;
    }

    @Override // androidx.compose.animation.s
    @fg.l
    public e2<b0> b() {
        return this.transition;
    }

    public void f(@fg.l e2<b0> e2Var) {
        this.transition = e2Var;
    }
}
