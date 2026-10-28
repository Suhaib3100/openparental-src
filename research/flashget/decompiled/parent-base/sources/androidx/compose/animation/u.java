package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: AnimationModifier.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a]\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/u;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "initialValue", "targetValue", "Lkotlin/k2;", "finishedListener", "a", "(Landroidx/compose/ui/q;Landroidx/compose/animation/core/p0;Lld/p;)Landroidx/compose/ui/q;", "J", "c", "()J", "InvalidSize", "", "d", "(J)Z", "isValid", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final long f3365a = androidx.compose.ui.unit.v.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var, @fg.m ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, k2> pVar) {
        return androidx.compose.ui.draw.h.b(qVar).w3(new SizeAnimationModifierElement(p0Var, pVar));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, androidx.compose.animation.core.p0 p0Var, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null);
        }
        if ((i4 & 2) != 0) {
            pVar = null;
        }
        return a(qVar, p0Var, pVar);
    }

    public static final long c() {
        return f3365a;
    }

    public static final boolean d(long j4) {
        return !androidx.compose.ui.unit.u.h(j4, f3365a);
    }
}
