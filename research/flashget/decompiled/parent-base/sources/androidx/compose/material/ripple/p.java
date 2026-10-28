package androidx.compose.material.ripple;

import androidx.compose.animation.core.h2;
import androidx.compose.animation.core.m0;
import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.f;
import androidx.compose.foundation.n1;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.x;
import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000e\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/foundation/n1;", "e", "(ZFJLandroidx/compose/runtime/t;II)Landroidx/compose/foundation/n1;", "Landroidx/compose/foundation/interaction/h;", "interaction", "Landroidx/compose/animation/core/k;", "", "c", "(Landroidx/compose/foundation/interaction/h;)Landroidx/compose/animation/core/k;", "d", "Landroidx/compose/animation/core/h2;", "a", "Landroidx/compose/animation/core/h2;", "DefaultTweenSpec", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n50#2:365\n49#2:366\n1116#3,6:367\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n83#1:365\n83#1:366\n83#1:367,6\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final h2<Float> f9376a = new h2<>(15, 0, m0.e(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.k<Float> c(androidx.compose.foundation.interaction.h hVar) {
        return hVar instanceof f.a ? f9376a : hVar instanceof d.a ? new h2(45, 0, m0.e(), 2, null) : hVar instanceof a.b ? new h2(45, 0, m0.e(), 2, null) : f9376a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.k<Float> d(androidx.compose.foundation.interaction.h hVar) {
        return hVar instanceof f.a ? f9376a : hVar instanceof d.a ? f9376a : hVar instanceof a.b ? new h2(150, 0, m0.e(), 2, null) : f9376a;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final n1 e(boolean z4, float f4, long j4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1635163520);
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        if ((i5 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i5 & 4) != 0) {
            d2.INSTANCE.getClass();
            j4 = d2.f17778o;
        }
        if (x.b0()) {
            x.r0(1635163520, i4, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:80)");
        }
        b5 u4 = o4.u(d2.n(j4), tVar, (i4 >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z4);
        androidx.compose.ui.unit.h d5 = androidx.compose.ui.unit.h.d(f4);
        tVar.P(511388516);
        boolean q02 = tVar.q0(valueOf) | tVar.q0(d5);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new e(z4, f4, u4, null);
            tVar.E(Q);
        }
        tVar.p0();
        e eVar = (e) Q;
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return eVar;
    }
}
