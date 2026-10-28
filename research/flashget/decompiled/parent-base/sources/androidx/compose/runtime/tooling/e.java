package androidx.compose.runtime.tooling;

import androidx.compose.runtime.b0;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d1;
import androidx.compose.runtime.e3;
import androidx.compose.runtime.f3;
import androidx.compose.runtime.y;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CompositionObserver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/y;", "Landroidx/compose/runtime/tooling/c;", "observer", "Landroidx/compose/runtime/tooling/d;", "a", "(Landroidx/compose/runtime/y;Landroidx/compose/runtime/tooling/c;)Landroidx/compose/runtime/tooling/d;", "Landroidx/compose/runtime/e3;", "Landroidx/compose/runtime/tooling/g;", "b", "(Landroidx/compose/runtime/e3;Landroidx/compose/runtime/tooling/g;)Landroidx/compose/runtime/tooling/d;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    @d1
    @m
    public static final d a(@l y yVar, @l c cVar) {
        b0 b0Var = (b0) c0.j(yVar, c0.i());
        if (b0Var != null) {
            return b0Var.a0(cVar);
        }
        return null;
    }

    @d1
    @l
    public static final d b(@l e3 e3Var, @l g gVar) {
        l0.n(e3Var, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        return ((f3) e3Var).z(gVar);
    }
}
