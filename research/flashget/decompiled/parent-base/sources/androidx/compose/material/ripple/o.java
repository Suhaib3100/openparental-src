package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.m;
import androidx.compose.foundation.o1;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.internal.u;
import kotlin.Metadata;
import kotlinx.coroutines.r0;

/* compiled from: Ripple.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u001a\u001a\u00020\r*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/ripple/o;", "Landroidx/compose/foundation/o1;", "", "bounded", "Landroidx/compose/runtime/b5;", "Landroidx/compose/material/ripple/h;", "rippleAlpha", "<init>", "(ZLandroidx/compose/runtime/b5;)V", "Landroidx/compose/foundation/interaction/m$b;", "interaction", "Lkotlinx/coroutines/r0;", "scope", "Lkotlin/k2;", "e", "(Landroidx/compose/foundation/interaction/m$b;Lkotlinx/coroutines/r0;)V", "g", "(Landroidx/compose/foundation/interaction/m$b;)V", "Landroidx/compose/foundation/interaction/h;", "h", "(Landroidx/compose/foundation/interaction/h;Lkotlinx/coroutines/r0;)V", "Landroidx/compose/ui/graphics/drawscope/f;", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/ui/graphics/d2;", "color", "f", "(Landroidx/compose/ui/graphics/drawscope/f;FJ)V", "Landroidx/compose/material/ripple/s;", "b", "Landroidx/compose/material/ripple/s;", "stateLayer", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class o implements o1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f9374c = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s stateLayer;

    public o(boolean z4, @fg.l b5<h> b5Var) {
        this.stateLayer = new s(z4, b5Var);
    }

    public abstract void e(@fg.l m.b interaction, @fg.l r0 scope);

    public final void f(@fg.l androidx.compose.ui.graphics.drawscope.f fVar, float f4, long j4) {
        this.stateLayer.b(fVar, f4, j4);
    }

    public abstract void g(@fg.l m.b interaction);

    public final void h(@fg.l androidx.compose.foundation.interaction.h interaction, @fg.l r0 scope) {
        this.stateLayer.c(interaction, scope);
    }
}
