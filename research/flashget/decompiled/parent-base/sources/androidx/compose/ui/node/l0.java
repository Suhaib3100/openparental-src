package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: LayoutNode.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/node/p1;", "d", "(Landroidx/compose/ui/node/h0;)Landroidx/compose/ui/node/p1;", "child", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/node/h0;)V", "", "a", "Z", "c", "()V", "DebugChanges", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/d;", "DefaultDensity", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f19347a = false;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.unit.d f19348b = androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null);

    public static final void b(@fg.l h0 h0Var, @fg.l h0 h0Var2) {
        h0Var.N0(h0Var.Y().size(), h0Var2);
    }

    private static /* synthetic */ void c() {
    }

    @fg.l
    public static final p1 d(@fg.l h0 h0Var) {
        p1 owner = h0Var.getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
