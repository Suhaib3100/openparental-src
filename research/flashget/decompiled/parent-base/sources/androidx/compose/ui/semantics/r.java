package androidx.compose.ui.semantics;

import androidx.compose.ui.node.c1;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: SemanticsOwner.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/semantics/r;", "", "Landroidx/compose/ui/node/h0;", "rootNode", "<init>", "(Landroidx/compose/ui/node/h0;)V", "a", "Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/semantics/p;", "()Landroidx/compose/ui/semantics/p;", "rootSemanticsNode", "b", "unmergedRootSemanticsNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,100:1\n76#2:101\n771#3:102\n702#3,8:103\n725#3,3:111\n710#3,2:114\n703#3:116\n772#3:122\n704#3,11:161\n728#3,3:172\n715#3:175\n705#3:176\n774#3:177\n385#4,5:117\n390#4:123\n395#4,2:125\n397#4,8:130\n405#4,9:141\n414#4,8:153\n261#5:124\n234#6,3:127\n237#6,3:150\n1208#7:138\n1187#7,2:139\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwner\n*L\n42#1:101\n42#1:102\n42#1:103,8\n42#1:111,3\n42#1:114,2\n42#1:116\n42#1:122\n42#1:161,11\n42#1:172,3\n42#1:175\n42#1:176\n42#1:177\n42#1:117,5\n42#1:123\n42#1:125,2\n42#1:130,8\n42#1:141,9\n42#1:153,8\n42#1:124\n42#1:127,3\n42#1:150,3\n42#1:138\n42#1:139,2\n*E\n"})
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final int f20367b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 rootNode;

    public r(@fg.l h0 h0Var) {
        this.rootNode = h0Var;
    }

    @fg.l
    public final p a() {
        return q.a(this.rootNode, true);
    }

    @fg.l
    public final p b() {
        c1 nodes = this.rootNode.getNodes();
        Object obj = null;
        if ((c1.c(nodes) & 8) != 0) {
            q.d head = nodes.getHead();
            loop0: while (true) {
                if (head == null) {
                    break;
                }
                if ((head.getKindSet() & 8) != 0) {
                    q.d dVar = head;
                    androidx.compose.runtime.collection.g gVar = null;
                    while (dVar != null) {
                        if (dVar instanceof y1) {
                            obj = dVar;
                            break loop0;
                        }
                        if ((dVar.getKindSet() & 8) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                            int i4 = 0;
                            for (q.d delegate = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & 8) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        dVar = delegate;
                                    } else {
                                        if (gVar == null) {
                                            gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                        }
                                        if (dVar != null) {
                                            gVar.b(dVar);
                                            dVar = null;
                                        }
                                        gVar.b(delegate);
                                    }
                                }
                            }
                            if (i4 == 1) {
                            }
                        }
                        dVar = androidx.compose.ui.node.k.l(gVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & 8) == 0) {
                    break;
                }
                head = head.getChild();
            }
        }
        l0.m(obj);
        return new p(((y1) obj).getNode(), false, this.rootNode, new l());
    }
}
