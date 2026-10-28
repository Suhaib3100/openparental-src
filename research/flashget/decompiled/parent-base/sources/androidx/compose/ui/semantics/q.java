package androidx.compose.ui.semantics;

import androidx.compose.ui.node.c1;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: SemanticsNode.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\r\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0011\"\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0007*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/h0;", "layoutNode", "", "mergingEnabled", "Landroidx/compose/ui/semantics/p;", "a", "(Landroidx/compose/ui/node/h0;Z)Landroidx/compose/ui/semantics/p;", "Landroidx/compose/ui/node/y1;", "outerSemanticsNode", "b", "(Landroidx/compose/ui/node/y1;ZLandroidx/compose/ui/node/h0;)Landroidx/compose/ui/semantics/p;", "Lkotlin/Function1;", "selector", "h", "(Landroidx/compose/ui/node/h0;Lld/l;)Landroidx/compose/ui/node/h0;", "", "g", "(Landroidx/compose/ui/semantics/p;)I", "k", "i", "(Landroidx/compose/ui/node/h0;)Landroidx/compose/ui/node/y1;", "outerMergingSemantics", "Landroidx/compose/ui/semantics/i;", "j", "(Landroidx/compose/ui/semantics/p;)Landroidx/compose/ui/semantics/i;", "role", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,475:1\n76#2:476\n76#2:553\n771#3:477\n702#3,8:478\n725#3,3:486\n710#3,2:489\n703#3:491\n772#3:497\n704#3,11:536\n728#3,3:547\n715#3:550\n705#3:551\n774#3:552\n695#3,15:554\n725#3,3:569\n710#3,2:572\n703#3:574\n696#3,2:580\n704#3,11:620\n728#3,3:631\n715#3:634\n705#3:635\n698#3:636\n385#4,5:492\n390#4:498\n395#4,2:500\n397#4,8:505\n405#4,9:516\n414#4,8:528\n385#4,5:575\n390#4:582\n395#4,2:584\n397#4,8:589\n405#4,9:600\n414#4,8:612\n261#5:499\n261#5:583\n234#6,3:502\n237#6,3:525\n234#6,3:586\n237#6,3:609\n1208#7:513\n1187#7,2:514\n1208#7:597\n1187#7,2:598\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n45#1:476\n450#1:553\n45#1:477\n45#1:478,8\n45#1:486,3\n45#1:489,2\n45#1:491\n45#1:497\n45#1:536,11\n45#1:547,3\n45#1:550\n45#1:551\n45#1:552\n450#1:554,15\n450#1:569,3\n450#1:572,2\n450#1:574\n450#1:580,2\n450#1:620,11\n450#1:631,3\n450#1:634\n450#1:635\n450#1:636\n45#1:492,5\n45#1:498\n45#1:500,2\n45#1:505,8\n45#1:516,9\n45#1:528,8\n450#1:575,5\n450#1:582\n450#1:584,2\n450#1:589,8\n450#1:600,9\n450#1:612,8\n45#1:499\n450#1:583\n45#1:502,3\n45#1:525,3\n450#1:586,3\n450#1:609,3\n45#1:513\n45#1:514,2\n450#1:597\n450#1:598,2\n*E\n"})
/* loaded from: classes.dex */
public final class q {
    @fg.l
    public static final p a(@fg.l h0 h0Var, boolean z4) {
        c1 nodes = h0Var.getNodes();
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
        q.d node = ((y1) obj).getNode();
        l Z = h0Var.Z();
        l0.m(Z);
        return new p(node, z4, h0Var, Z);
    }

    @fg.l
    public static final p b(@fg.l y1 y1Var, boolean z4, @fg.l h0 h0Var) {
        q.d node = y1Var.getNode();
        l Z = h0Var.Z();
        if (Z == null) {
            Z = new l();
        }
        return new p(node, z4, h0Var, Z);
    }

    public static /* synthetic */ p c(y1 y1Var, boolean z4, h0 h0Var, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            h0Var = androidx.compose.ui.node.k.p(y1Var);
        }
        return b(y1Var, z4, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(p pVar) {
        return pVar.getId() + 2000000000;
    }

    @fg.m
    public static final h0 h(@fg.l h0 h0Var, @fg.l ld.l<? super h0, Boolean> lVar) {
        for (h0 B0 = h0Var.B0(); B0 != null; B0 = B0.B0()) {
            if (lVar.invoke(B0).booleanValue()) {
                return B0;
            }
        }
        return null;
    }

    @fg.m
    public static final y1 i(@fg.l h0 h0Var) {
        c1 nodes = h0Var.getNodes();
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
                            if (((y1) dVar).getMergeDescendants()) {
                                obj = dVar;
                                break loop0;
                            }
                        } else if ((dVar.getKindSet() & 8) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
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
        return (y1) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i j(p pVar) {
        return (i) pVar.getUnmergedConfig().m(t.f20369a.x(), m.a.f20351b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(p pVar) {
        return pVar.getId() + 1000000000;
    }
}
