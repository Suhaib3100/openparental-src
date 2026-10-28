package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.layout.i1;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Placeable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"%\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/q0;", "lookaheadCapablePlaceable", "Landroidx/compose/ui/layout/i1$a;", "a", "(Landroidx/compose/ui/node/q0;)Landroidx/compose/ui/layout/i1$a;", "Landroidx/compose/ui/node/p1;", "owner", "b", "(Landroidx/compose/ui/node/p1;)Landroidx/compose/ui/layout/i1$a;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "Lkotlin/u;", "Lld/l;", "DefaultLayerBlock", "Landroidx/compose/ui/unit/b;", "J", "DefaultConstraints", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ld.l<q4, k2> f19021a = a.f19023b;

    /* renamed from: b, reason: collision with root package name */
    private static final long f19022b = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

    /* compiled from: Placeable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<q4, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19023b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l q4 q4Var) {
        }

        @Override // ld.l
        public k2 invoke(q4 q4Var) {
            return k2.f75408a;
        }
    }

    @fg.l
    public static final i1.a a(@fg.l androidx.compose.ui.node.q0 q0Var) {
        return new f0(q0Var);
    }

    @fg.l
    public static final i1.a b(@fg.l androidx.compose.ui.node.p1 p1Var) {
        return new e1(p1Var);
    }
}
