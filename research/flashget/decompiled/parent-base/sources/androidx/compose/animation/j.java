package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import kotlin.Metadata;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8WX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/j;", "Landroidx/compose/animation/i;", "Landroidx/compose/animation/s;", "animatedVisibilityScope", "<init>", "(Landroidx/compose/animation/s;)V", "Landroidx/compose/ui/q;", "Landroidx/compose/animation/f0;", "enter", "Landroidx/compose/animation/h0;", "exit", "", "label", "d", "(Landroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;)Landroidx/compose/ui/q;", "Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/b0;", "b", "()Landroidx/compose/animation/core/e2;", "transition", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class j implements i, s {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ s f3183a;

    public j(@fg.l s sVar) {
        this.f3183a = sVar;
    }

    @Override // androidx.compose.animation.s
    @fg.l
    @j0
    public e2<b0> b() {
        return this.f3183a.b();
    }

    @Override // androidx.compose.animation.s
    @fg.l
    @j0
    public androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l f0 f0Var, @fg.l h0 h0Var, @fg.l String str) {
        return this.f3183a.d(qVar, f0Var, h0Var, str);
    }
}
