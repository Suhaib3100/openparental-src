package androidx.compose.ui;

import androidx.compose.runtime.g0;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: ComposedModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/j;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/runtime/g0;", "map", "<init>", "(Landroidx/compose/runtime/g0;)V", "Lkotlin/k2;", "i7", "()V", "value", "p", "Landroidx/compose/runtime/g0;", "y7", "()Landroidx/compose/runtime/g0;", "z7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j extends q.d {

    /* renamed from: q, reason: collision with root package name */
    public static final int f18893q = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g0 map;

    public j(@fg.l g0 g0Var) {
        this.map = g0Var;
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        androidx.compose.ui.node.k.p(this).z(this.map);
    }

    @fg.l
    /* renamed from: y7, reason: from getter */
    public final g0 getMap() {
        return this.map;
    }

    public final void z7(@fg.l g0 g0Var) {
        this.map = g0Var;
        androidx.compose.ui.node.k.p(this).z(g0Var);
    }
}
