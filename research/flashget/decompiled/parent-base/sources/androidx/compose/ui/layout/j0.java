package androidx.compose.ui.layout;

import androidx.compose.ui.layout.i1;
import kotlin.Metadata;

/* compiled from: LookaheadScope.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\t\u0010\u0006R\u0018\u0010\u0010\u001a\u00020\u0003*\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/i0;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/u;", "scopeCoordinates", "<init>", "(Lld/a;)V", "l", "(Landroidx/compose/ui/layout/u;)Landroidx/compose/ui/layout/u;", "b", "Lld/a;", "a", "()Lld/a;", "Landroidx/compose/ui/layout/i1$a;", "p", "(Landroidx/compose/ui/layout/i1$a;)Landroidx/compose/ui/layout/u;", "lookaheadScopeCoordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j0 implements i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19019c = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<? extends u> scopeCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public j0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @fg.m
    public final ld.a<u> a() {
        return this.scopeCoordinates;
    }

    public final void b(@fg.m ld.a<? extends u> aVar) {
        this.scopeCoordinates = aVar;
    }

    @Override // androidx.compose.ui.layout.i0
    @fg.l
    public u l(@fg.l u uVar) {
        g0 lookaheadLayoutCoordinates;
        g0 g0Var = uVar instanceof g0 ? (g0) uVar : null;
        if (g0Var != null) {
            return g0Var;
        }
        kotlin.jvm.internal.l0.n(uVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        androidx.compose.ui.node.e1 e1Var = (androidx.compose.ui.node.e1) uVar;
        androidx.compose.ui.node.r0 lookaheadDelegate = e1Var.getLookaheadDelegate();
        return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? e1Var : lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.i0
    @fg.l
    public u p(@fg.l i1.a aVar) {
        ld.a<? extends u> aVar2 = this.scopeCoordinates;
        kotlin.jvm.internal.l0.m(aVar2);
        return aVar2.invoke();
    }

    public j0(@fg.m ld.a<? extends u> aVar) {
        this.scopeCoordinates = aVar;
    }

    public /* synthetic */ j0(ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : aVar);
    }
}
