package androidx.compose.ui.node;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: LayoutNodeAlignmentLines.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0010*\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/node/a;", "Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/b;)V", "Landroidx/compose/ui/node/e1;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "i", "(Landroidx/compose/ui/node/e1;Landroidx/compose/ui/layout/a;)I", "Li0/f;", "position", "d", "(Landroidx/compose/ui/node/e1;J)J", "", "e", "(Landroidx/compose/ui/node/e1;)Ljava/util/Map;", "alignmentLinesMap", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,247:1\n157#2:248\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n245#1:248\n*E\n"})
/* loaded from: classes.dex */
public final class p0 extends a {

    /* renamed from: k, reason: collision with root package name */
    public static final int f19454k = 0;

    public p0(@fg.l b bVar) {
        super(bVar, null);
    }

    @Override // androidx.compose.ui.node.a
    protected long d(@fg.l e1 e1Var, long j4) {
        r0 lookaheadDelegate = e1Var.getLookaheadDelegate();
        kotlin.jvm.internal.l0.m(lookaheadDelegate);
        long position = lookaheadDelegate.getPosition();
        return i0.f.v(i0.g.a(androidx.compose.ui.unit.q.m(position), (int) (position & 4294967295L)), j4);
    }

    @Override // androidx.compose.ui.node.a
    @fg.l
    protected Map<androidx.compose.ui.layout.a, Integer> e(@fg.l e1 e1Var) {
        r0 lookaheadDelegate = e1Var.getLookaheadDelegate();
        kotlin.jvm.internal.l0.m(lookaheadDelegate);
        return lookaheadDelegate.S0().p();
    }

    @Override // androidx.compose.ui.node.a
    protected int i(@fg.l e1 e1Var, @fg.l androidx.compose.ui.layout.a aVar) {
        r0 lookaheadDelegate = e1Var.getLookaheadDelegate();
        kotlin.jvm.internal.l0.m(lookaheadDelegate);
        return lookaheadDelegate.q(aVar);
    }
}
