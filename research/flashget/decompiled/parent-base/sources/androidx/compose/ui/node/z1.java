package androidx.compose.ui.node;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: SemanticsModifierNode.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/y1;", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/node/y1;)V", "Landroidx/compose/ui/q$d;", "", "useMinimumTouchTarget", "Li0/i;", "c", "(Landroidx/compose/ui/q$d;Z)Li0/i;", "Landroidx/compose/ui/semantics/l;", "a", "(Landroidx/compose/ui/semantics/l;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,107:1\n76#2:108\n76#2:109\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n102#1:108\n105#1:109\n*E\n"})
/* loaded from: classes.dex */
public final class z1 {
    public static final boolean a(@fg.l androidx.compose.ui.semantics.l lVar) {
        return androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.k.f20321a.j()) != null;
    }

    public static final void b(@fg.l y1 y1Var) {
        k.p(y1Var).U0();
    }

    @fg.l
    public static final i0.i c(@fg.l q.d dVar, boolean z4) {
        if (dVar.getNode().getIsAttached()) {
            return !z4 ? androidx.compose.ui.layout.v.b(k.m(dVar, 8)) : k.m(dVar, 8).g5();
        }
        i0.i.INSTANCE.getClass();
        return i0.i.f74153g;
    }
}
