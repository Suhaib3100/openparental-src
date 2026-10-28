package androidx.compose.material.ripple;

import androidx.compose.material.ripple.q;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x;
import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: RippleTheme.kt */
@m1
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/d;", "Landroidx/compose/material/ripple/q;", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/runtime/t;I)J", "Landroidx/compose/material/ripple/h;", "b", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material/ripple/h;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class d implements q {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final d f9302b = new d();

    private d() {
    }

    @Override // androidx.compose.material.ripple.q
    @androidx.compose.runtime.i
    public long a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(2042140174);
        if (x.b0()) {
            x.r0(2042140174, i4, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:214)");
        }
        q.Companion companion = q.INSTANCE;
        d2.INSTANCE.getClass();
        long b5 = companion.b(d2.f17766c, true);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return b5;
    }

    @Override // androidx.compose.material.ripple.q
    @fg.l
    @androidx.compose.runtime.i
    public h b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1629816343);
        if (x.b0()) {
            x.r0(-1629816343, i4, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:217)");
        }
        q.Companion companion = q.INSTANCE;
        d2.INSTANCE.getClass();
        h a5 = companion.a(d2.f17766c, true);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return a5;
    }
}
