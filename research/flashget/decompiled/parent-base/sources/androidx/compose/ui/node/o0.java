package androidx.compose.ui.node;

import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.t0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LayoutTreeConsistencyChecker.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/o0;", "", "Landroidx/compose/ui/node/h0;", "root", "Landroidx/compose/ui/node/n;", "relayoutNodes", "", "Landroidx/compose/ui/node/t0$a;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/node/n;Ljava/util/List;)V", "node", "", "c", "(Landroidx/compose/ui/node/h0;)Z", "b", "", "f", "(Landroidx/compose/ui/node/h0;)Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lkotlin/k2;", "a", "()V", "Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/node/n;", "Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,143:1\n33#2,6:144\n116#2,2:150\n33#2,6:152\n118#2:158\n116#2,2:159\n33#2,6:161\n118#2:167\n33#2,6:168\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:144,6\n59#1:150,2\n59#1:152,6\n59#1:158\n84#1:159,2\n84#1:161,6\n84#1:167\n136#1:168,6\n*E\n"})
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19449d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n relayoutNodes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<t0.a> postponedMeasureRequests;

    public o0(@fg.l h0 h0Var, @fg.l n nVar, @fg.l List<t0.a> list) {
        this.root = h0Var;
        this.relayoutNodes = nVar;
        this.postponedMeasureRequests = list;
    }

    private final boolean b(h0 h0Var) {
        t0.a aVar;
        h0 B0 = h0Var.B0();
        t0.a aVar2 = null;
        h0.e l02 = B0 != null ? B0.l0() : null;
        if (h0Var.l() || (h0Var.C0() != Integer.MAX_VALUE && B0 != null && B0.l())) {
            if (h0Var.s0()) {
                List<t0.a> list = this.postponedMeasureRequests;
                int size = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        aVar = null;
                        break;
                    }
                    aVar = list.get(i4);
                    t0.a aVar3 = aVar;
                    if (kotlin.jvm.internal.l0.g(aVar3.getNode(), h0Var) && !aVar3.getIsLookahead()) {
                        break;
                    }
                    i4++;
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (h0Var.s0()) {
                return this.relayoutNodes.d(h0Var) || h0Var.l0() == h0.e.LookaheadMeasuring || (B0 != null && B0.s0()) || ((B0 != null && B0.n0()) || l02 == h0.e.Measuring);
            }
            if (h0Var.k0()) {
                return this.relayoutNodes.d(h0Var) || B0 == null || B0.s0() || B0.k0() || l02 == h0.e.Measuring || l02 == h0.e.LayingOut;
            }
        }
        if (kotlin.jvm.internal.l0.g(h0Var.Z0(), Boolean.TRUE)) {
            if (h0Var.n0()) {
                List<t0.a> list2 = this.postponedMeasureRequests;
                int size2 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        break;
                    }
                    t0.a aVar4 = list2.get(i5);
                    t0.a aVar5 = aVar4;
                    if (kotlin.jvm.internal.l0.g(aVar5.getNode(), h0Var) && aVar5.getIsLookahead()) {
                        aVar2 = aVar4;
                        break;
                    }
                    i5++;
                }
                if (aVar2 != null) {
                    return true;
                }
            }
            if (h0Var.n0()) {
                return this.relayoutNodes.e(h0Var, true) || (B0 != null && B0.n0()) || l02 == h0.e.LookaheadMeasuring || (B0 != null && B0.s0() && kotlin.jvm.internal.l0.g(h0Var.getLookaheadRoot(), h0Var));
            }
            if (h0Var.m0()) {
                return this.relayoutNodes.e(h0Var, true) || B0 == null || B0.n0() || B0.m0() || l02 == h0.e.LookaheadMeasuring || l02 == h0.e.LookaheadLayingOut || (B0.k0() && kotlin.jvm.internal.l0.g(h0Var.getLookaheadRoot(), h0Var));
            }
        }
        return true;
    }

    private final boolean c(h0 node) {
        if (!b(node)) {
            return false;
        }
        List<h0> Y = node.Y();
        int size = Y.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!c(Y.get(i4))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        e(this, sb, this.root, 0);
        return sb.toString();
    }

    private static final void e(o0 o0Var, StringBuilder sb, h0 h0Var, int i4) {
        String f4 = o0Var.f(h0Var);
        if (f4.length() > 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append("..");
            }
            sb.append(f4);
            kotlin.jvm.internal.l0.o(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, "append('\\n')");
            i4++;
        }
        List<h0> Y = h0Var.Y();
        int size = Y.size();
        for (int i6 = 0; i6 < size; i6++) {
            e(o0Var, sb, Y.get(i6), i4);
        }
    }

    private final String f(h0 node) {
        StringBuilder sb = new StringBuilder();
        sb.append(node);
        sb.append("[" + node.l0() + ']');
        if (!node.l()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + node.t0() + ']');
        if (!b(node)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void a() {
        if (c(this.root)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
