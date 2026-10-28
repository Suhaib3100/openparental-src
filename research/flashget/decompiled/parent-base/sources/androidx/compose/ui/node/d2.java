package androidx.compose.ui.node;

import androidx.compose.ui.node.c2;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: TraversableNode.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\r\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0011\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0011\u0010\u000e\u001a/\u0010\u0012\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0012\u0010\u0010\u001a/\u0010\u0014\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\t¢\u0006\u0004\b\u0014\u0010\u000e\u001a/\u0010\u0015\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\t¢\u0006\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/j;", "", "key", "Landroidx/compose/ui/node/c2;", "a", "(Landroidx/compose/ui/node/j;Ljava/lang/Object;)Landroidx/compose/ui/node/c2;", "T", "b", "(Landroidx/compose/ui/node/c2;)Landroidx/compose/ui/node/c2;", "Lkotlin/Function1;", "", "block", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/node/j;Ljava/lang/Object;Lld/l;)V", "d", "(Landroidx/compose/ui/node/c2;Lld/l;)V", "e", "f", "Landroidx/compose/ui/node/c2$a$a;", "g", "h", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTraversableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,230:1\n106#2:231\n106#2:297\n106#2:363\n106#2:429\n106#2:495\n106#2:566\n106#2:637\n106#2:710\n230#3,5:232\n58#3:237\n59#3,8:239\n385#3,6:247\n395#3,2:254\n397#3,8:259\n405#3,9:270\n414#3,8:282\n68#3,7:290\n230#3,5:298\n58#3:303\n59#3,8:305\n385#3,6:313\n395#3,2:320\n397#3,8:325\n405#3,9:336\n414#3,8:348\n68#3,7:356\n230#3,5:364\n58#3:369\n59#3,8:371\n385#3,6:379\n395#3,2:386\n397#3,8:391\n405#3,9:402\n414#3,8:414\n68#3,7:422\n230#3,5:430\n58#3:435\n59#3,8:437\n385#3,6:445\n395#3,2:452\n397#3,8:457\n405#3,9:468\n414#3,8:480\n68#3,7:488\n276#3:496\n133#3:497\n134#3:499\n135#3,7:503\n142#3,9:511\n385#3,6:520\n395#3,2:527\n397#3,17:532\n414#3,8:552\n151#3,6:560\n276#3:567\n133#3:568\n134#3:570\n135#3,7:574\n142#3,9:582\n385#3,6:591\n395#3,2:598\n397#3,17:603\n414#3,8:623\n151#3,6:631\n289#3:638\n163#3:639\n164#3:641\n165#3,12:645\n290#3:657\n385#3,5:658\n291#3,2:663\n390#3:665\n395#3,2:667\n397#3,17:672\n414#3,8:692\n293#3:700\n177#3,8:701\n294#3:709\n289#3:711\n163#3:712\n164#3:714\n165#3,12:718\n290#3:730\n385#3,5:731\n291#3,2:736\n390#3:738\n395#3,2:740\n397#3,17:745\n414#3,8:765\n293#3:773\n177#3,8:774\n294#3:782\n1#4:238\n1#4:304\n1#4:370\n1#4:436\n1#4:498\n1#4:569\n1#4:640\n1#4:713\n261#5:253\n261#5:319\n261#5:385\n261#5:451\n261#5:526\n261#5:597\n261#5:666\n261#5:739\n234#6,3:256\n237#6,3:279\n234#6,3:322\n237#6,3:345\n234#6,3:388\n237#6,3:411\n234#6,3:454\n237#6,3:477\n234#6,3:529\n237#6,3:549\n234#6,3:600\n237#6,3:620\n234#6,3:669\n237#6,3:689\n234#6,3:742\n237#6,3:762\n1208#7:267\n1187#7,2:268\n1208#7:333\n1187#7,2:334\n1208#7:399\n1187#7,2:400\n1208#7:465\n1187#7,2:466\n1208#7:500\n1187#7,2:501\n1208#7:571\n1187#7,2:572\n1208#7:642\n1187#7,2:643\n1208#7:715\n1187#7,2:716\n48#8:510\n48#8:581\n*S KotlinDebug\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n*L\n58#1:231\n70#1:297\n92#1:363\n111#1:429\n138#1:495\n159#1:566\n187#1:637\n214#1:710\n58#1:232,5\n58#1:237\n58#1:239,8\n58#1:247,6\n58#1:254,2\n58#1:259,8\n58#1:270,9\n58#1:282,8\n58#1:290,7\n70#1:298,5\n70#1:303\n70#1:305,8\n70#1:313,6\n70#1:320,2\n70#1:325,8\n70#1:336,9\n70#1:348,8\n70#1:356,7\n92#1:364,5\n92#1:369\n92#1:371,8\n92#1:379,6\n92#1:386,2\n92#1:391,8\n92#1:402,9\n92#1:414,8\n92#1:422,7\n111#1:430,5\n111#1:435\n111#1:437,8\n111#1:445,6\n111#1:452,2\n111#1:457,8\n111#1:468,9\n111#1:480,8\n111#1:488,7\n138#1:496\n138#1:497\n138#1:499\n138#1:503,7\n138#1:511,9\n138#1:520,6\n138#1:527,2\n138#1:532,17\n138#1:552,8\n138#1:560,6\n159#1:567\n159#1:568\n159#1:570\n159#1:574,7\n159#1:582,9\n159#1:591,6\n159#1:598,2\n159#1:603,17\n159#1:623,8\n159#1:631,6\n187#1:638\n187#1:639\n187#1:641\n187#1:645,12\n187#1:657\n187#1:658,5\n187#1:663,2\n187#1:665\n187#1:667,2\n187#1:672,17\n187#1:692,8\n187#1:700\n187#1:701,8\n187#1:709\n214#1:711\n214#1:712\n214#1:714\n214#1:718,12\n214#1:730\n214#1:731,5\n214#1:736,2\n214#1:738\n214#1:740,2\n214#1:745,17\n214#1:765,8\n214#1:773\n214#1:774,8\n214#1:782\n58#1:238\n70#1:304\n92#1:370\n111#1:436\n138#1:498\n159#1:569\n187#1:640\n214#1:713\n58#1:253\n70#1:319\n92#1:385\n111#1:451\n138#1:526\n159#1:597\n187#1:666\n214#1:739\n58#1:256,3\n58#1:279,3\n70#1:322,3\n70#1:345,3\n92#1:388,3\n92#1:411,3\n111#1:454,3\n111#1:477,3\n138#1:529,3\n138#1:549,3\n159#1:600,3\n159#1:620,3\n187#1:669,3\n187#1:689,3\n214#1:742,3\n214#1:762,3\n58#1:267\n58#1:268,2\n70#1:333\n70#1:334,2\n92#1:399\n92#1:400,2\n111#1:465\n111#1:466,2\n138#1:500\n138#1:501,2\n159#1:571\n159#1:572,2\n187#1:642\n187#1:643,2\n214#1:715\n214#1:716,2\n138#1:510\n159#1:581\n*E\n"})
/* loaded from: classes.dex */
public final class d2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @fg.m
    public static final c2 a(@fg.l j jVar, @fg.m Object obj) {
        c1 nodes;
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = jVar.getNode().getParent();
        h0 p4 = k.p(jVar);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 262144) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 262144) != 0) {
                        l lVar = parent;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (lVar != 0) {
                            if (lVar instanceof c2) {
                                c2 c2Var = (c2) lVar;
                                if (kotlin.jvm.internal.l0.g(obj, c2Var.getTraverseKey())) {
                                    return c2Var;
                                }
                            } else if ((lVar.getKindSet() & 262144) != 0 && (lVar instanceof l)) {
                                q.d delegate = lVar.getDelegate();
                                int i4 = 0;
                                lVar = lVar;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & 262144) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVar = delegate;
                                        } else {
                                            if (gVar == null) {
                                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (lVar != 0) {
                                                gVar.b(lVar);
                                                lVar = 0;
                                            }
                                            gVar.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    lVar = lVar;
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVar = k.l(gVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    @fg.m
    public static final <T extends c2> T b(@fg.l T t4) {
        c1 nodes;
        if (!t4.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = t4.getNode().getParent();
        h0 p4 = k.p(t4);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 262144) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 262144) != 0) {
                        l lVar = parent;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (lVar != 0) {
                            if (lVar instanceof c2) {
                                T t5 = (T) lVar;
                                if (kotlin.jvm.internal.l0.g(t4.getTraverseKey(), t5.getTraverseKey()) && androidx.compose.ui.b.a(t4, t5)) {
                                    return t5;
                                }
                            } else if ((lVar.getKindSet() & 262144) != 0 && (lVar instanceof l)) {
                                q.d delegate = lVar.getDelegate();
                                int i4 = 0;
                                lVar = lVar;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & 262144) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVar = delegate;
                                        } else {
                                            if (gVar == null) {
                                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (lVar != 0) {
                                                gVar.b(lVar);
                                                lVar = 0;
                                            }
                                            gVar.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    lVar = lVar;
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVar = k.l(gVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void c(@fg.l j jVar, @fg.m Object obj, @fg.l ld.l<? super c2, Boolean> lVar) {
        c1 nodes;
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = jVar.getNode().getParent();
        h0 p4 = k.p(jVar);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 262144) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 262144) != 0) {
                        l lVar2 = parent;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (lVar2 != 0) {
                            if (lVar2 instanceof c2) {
                                c2 c2Var = (c2) lVar2;
                                if (!(kotlin.jvm.internal.l0.g(obj, c2Var.getTraverseKey()) ? lVar.invoke(c2Var).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((lVar2.getKindSet() & 262144) != 0) && (lVar2 instanceof l)) {
                                    q.d delegate = lVar2.getDelegate();
                                    int i4 = 0;
                                    lVar2 = lVar2;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & 262144) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                lVar2 = delegate;
                                            } else {
                                                if (gVar == null) {
                                                    gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (lVar2 != 0) {
                                                    gVar.b(lVar2);
                                                    lVar2 = 0;
                                                }
                                                gVar.b(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        lVar2 = lVar2;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                            }
                            lVar2 = k.l(gVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final <T extends c2> void d(@fg.l T t4, @fg.l ld.l<? super T, Boolean> lVar) {
        c1 nodes;
        if (!t4.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = t4.getNode().getParent();
        h0 p4 = k.p(t4);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 262144) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 262144) != 0) {
                        l lVar2 = parent;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (lVar2 != 0) {
                            boolean z4 = true;
                            if (lVar2 instanceof c2) {
                                c2 c2Var = (c2) lVar2;
                                if (kotlin.jvm.internal.l0.g(t4.getTraverseKey(), c2Var.getTraverseKey()) && androidx.compose.ui.b.a(t4, c2Var)) {
                                    z4 = lVar.invoke(c2Var).booleanValue();
                                }
                                if (!z4) {
                                    return;
                                }
                            } else {
                                if (((lVar2.getKindSet() & 262144) != 0) && (lVar2 instanceof l)) {
                                    q.d delegate = lVar2.getDelegate();
                                    int i4 = 0;
                                    lVar2 = lVar2;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & 262144) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                lVar2 = delegate;
                                            } else {
                                                if (gVar == null) {
                                                    gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (lVar2 != 0) {
                                                    gVar.b(lVar2);
                                                    lVar2 = 0;
                                                }
                                                gVar.b(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        lVar2 = lVar2;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                            }
                            lVar2 = k.l(gVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0029, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.q$d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@fg.l androidx.compose.ui.node.j r10, @fg.m java.lang.Object r11, @fg.l ld.l<? super androidx.compose.ui.node.c2, java.lang.Boolean> r12) {
        /*
            androidx.compose.ui.q$d r0 = r10.getNode()
            boolean r0 = r0.getIsAttached()
            if (r0 == 0) goto Lc0
            androidx.compose.runtime.collection.g r0 = new androidx.compose.runtime.collection.g
            r1 = 16
            androidx.compose.ui.q$d[] r2 = new androidx.compose.ui.q.d[r1]
            r3 = 0
            r0.<init>(r2, r3)
            androidx.compose.ui.q$d r2 = r10.getNode()
            androidx.compose.ui.q$d r2 = r2.getChild()
            if (r2 != 0) goto L26
            androidx.compose.ui.q$d r10 = r10.getNode()
            androidx.compose.ui.node.k.a(r0, r10)
            goto L29
        L26:
            r0.b(r2)
        L29:
            boolean r10 = r0.V()
            if (r10 == 0) goto Lbf
            r10 = 1
            java.lang.Object r2 = androidx.compose.foundation.gestures.i.a(r0, r10)
            androidx.compose.ui.q$d r2 = (androidx.compose.ui.q.d) r2
            int r4 = r2.getAggregateChildKindSet()
            r5 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r5
            if (r4 != 0) goto L43
            androidx.compose.ui.node.k.a(r0, r2)
            goto L29
        L43:
            if (r2 == 0) goto L29
            int r4 = r2.getKindSet()
            r4 = r4 & r5
            if (r4 == 0) goto Lba
            r4 = 0
            r6 = r4
        L4e:
            if (r2 == 0) goto L29
            boolean r7 = r2 instanceof androidx.compose.ui.node.c2
            if (r7 == 0) goto L6f
            androidx.compose.ui.node.c2 r2 = (androidx.compose.ui.node.c2) r2
            java.lang.Object r7 = r2.getTraverseKey()
            boolean r7 = kotlin.jvm.internal.l0.g(r11, r7)
            if (r7 == 0) goto L6b
            java.lang.Object r2 = r12.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L6c
        L6b:
            r2 = r10
        L6c:
            if (r2 != 0) goto Lb5
            return
        L6f:
            int r7 = r2.getKindSet()
            r7 = r7 & r5
            if (r7 == 0) goto L78
            r7 = r10
            goto L79
        L78:
            r7 = r3
        L79:
            if (r7 == 0) goto Lb5
            boolean r7 = r2 instanceof androidx.compose.ui.node.l
            if (r7 == 0) goto Lb5
            r7 = r2
            androidx.compose.ui.node.l r7 = (androidx.compose.ui.node.l) r7
            androidx.compose.ui.q$d r7 = r7.getDelegate()
            r8 = r3
        L87:
            if (r7 == 0) goto Lb2
            int r9 = r7.getKindSet()
            r9 = r9 & r5
            if (r9 == 0) goto L92
            r9 = r10
            goto L93
        L92:
            r9 = r3
        L93:
            if (r9 == 0) goto Lad
            int r8 = r8 + 1
            if (r8 != r10) goto L9b
            r2 = r7
            goto Lad
        L9b:
            if (r6 != 0) goto La4
            androidx.compose.runtime.collection.g r6 = new androidx.compose.runtime.collection.g
            androidx.compose.ui.q$d[] r9 = new androidx.compose.ui.q.d[r1]
            r6.<init>(r9, r3)
        La4:
            if (r2 == 0) goto Laa
            r6.b(r2)
            r2 = r4
        Laa:
            r6.b(r7)
        Lad:
            androidx.compose.ui.q$d r7 = r7.getChild()
            goto L87
        Lb2:
            if (r8 != r10) goto Lb5
            goto L4e
        Lb5:
            androidx.compose.ui.q$d r2 = androidx.compose.ui.node.k.b(r6)
            goto L4e
        Lba:
            androidx.compose.ui.q$d r2 = r2.getChild()
            goto L43
        Lbf:
            return
        Lc0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "visitChildren called on an unattached node"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.d2.e(androidx.compose.ui.node.j, java.lang.Object, ld.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0029, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.q$d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.ui.node.c2> void f(@fg.l T r11, @fg.l ld.l<? super T, java.lang.Boolean> r12) {
        /*
            androidx.compose.ui.q$d r0 = r11.getNode()
            boolean r0 = r0.getIsAttached()
            if (r0 == 0) goto Lcb
            androidx.compose.runtime.collection.g r0 = new androidx.compose.runtime.collection.g
            r1 = 16
            androidx.compose.ui.q$d[] r2 = new androidx.compose.ui.q.d[r1]
            r3 = 0
            r0.<init>(r2, r3)
            androidx.compose.ui.q$d r2 = r11.getNode()
            androidx.compose.ui.q$d r2 = r2.getChild()
            if (r2 != 0) goto L26
            androidx.compose.ui.q$d r2 = r11.getNode()
            androidx.compose.ui.node.k.a(r0, r2)
            goto L29
        L26:
            r0.b(r2)
        L29:
            boolean r2 = r0.V()
            if (r2 == 0) goto Lca
            r2 = 1
            java.lang.Object r4 = androidx.compose.foundation.gestures.i.a(r0, r2)
            androidx.compose.ui.q$d r4 = (androidx.compose.ui.q.d) r4
            int r5 = r4.getAggregateChildKindSet()
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L43
            androidx.compose.ui.node.k.a(r0, r4)
            goto L29
        L43:
            if (r4 == 0) goto L29
            int r5 = r4.getKindSet()
            r5 = r5 & r6
            if (r5 == 0) goto Lc4
            r5 = 0
            r7 = r5
        L4e:
            if (r4 == 0) goto L29
            boolean r8 = r4 instanceof androidx.compose.ui.node.c2
            if (r8 == 0) goto L79
            androidx.compose.ui.node.c2 r4 = (androidx.compose.ui.node.c2) r4
            java.lang.Object r8 = r11.getTraverseKey()
            java.lang.Object r9 = r4.getTraverseKey()
            boolean r8 = kotlin.jvm.internal.l0.g(r8, r9)
            if (r8 == 0) goto L75
            boolean r8 = androidx.compose.ui.b.a(r11, r4)
            if (r8 == 0) goto L75
            java.lang.Object r4 = r12.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L76
        L75:
            r4 = r2
        L76:
            if (r4 != 0) goto Lbf
            return
        L79:
            int r8 = r4.getKindSet()
            r8 = r8 & r6
            if (r8 == 0) goto L82
            r8 = r2
            goto L83
        L82:
            r8 = r3
        L83:
            if (r8 == 0) goto Lbf
            boolean r8 = r4 instanceof androidx.compose.ui.node.l
            if (r8 == 0) goto Lbf
            r8 = r4
            androidx.compose.ui.node.l r8 = (androidx.compose.ui.node.l) r8
            androidx.compose.ui.q$d r8 = r8.getDelegate()
            r9 = r3
        L91:
            if (r8 == 0) goto Lbc
            int r10 = r8.getKindSet()
            r10 = r10 & r6
            if (r10 == 0) goto L9c
            r10 = r2
            goto L9d
        L9c:
            r10 = r3
        L9d:
            if (r10 == 0) goto Lb7
            int r9 = r9 + 1
            if (r9 != r2) goto La5
            r4 = r8
            goto Lb7
        La5:
            if (r7 != 0) goto Lae
            androidx.compose.runtime.collection.g r7 = new androidx.compose.runtime.collection.g
            androidx.compose.ui.q$d[] r10 = new androidx.compose.ui.q.d[r1]
            r7.<init>(r10, r3)
        Lae:
            if (r4 == 0) goto Lb4
            r7.b(r4)
            r4 = r5
        Lb4:
            r7.b(r8)
        Lb7:
            androidx.compose.ui.q$d r8 = r8.getChild()
            goto L91
        Lbc:
            if (r9 != r2) goto Lbf
            goto L4e
        Lbf:
            androidx.compose.ui.q$d r4 = androidx.compose.ui.node.k.b(r7)
            goto L4e
        Lc4:
            androidx.compose.ui.q$d r4 = r4.getChild()
            goto L43
        Lca:
            return
        Lcb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "visitChildren called on an unattached node"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.d2.f(androidx.compose.ui.node.c2, ld.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    public static final void g(@fg.l j jVar, @fg.m Object obj, @fg.l ld.l<? super c2, ? extends c2.Companion.EnumC0346a> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = jVar.getNode().getChild();
        if (child == null) {
            k.c(gVar, jVar.getNode());
        } else {
            gVar.b(child);
        }
        while (gVar.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
            if ((dVar.getAggregateChildKindSet() & 262144) != 0) {
                for (q.d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.getChild()) {
                    if ((dVar2.getKindSet() & 262144) != 0) {
                        l lVar2 = dVar2;
                        androidx.compose.runtime.collection.g gVar2 = null;
                        while (lVar2 != 0) {
                            if (lVar2 instanceof c2) {
                                c2 c2Var = (c2) lVar2;
                                c2.Companion.EnumC0346a invoke = kotlin.jvm.internal.l0.g(obj, c2Var.getTraverseKey()) ? lVar.invoke(c2Var) : c2.Companion.EnumC0346a.ContinueTraversal;
                                if (invoke == c2.Companion.EnumC0346a.CancelTraversal) {
                                    return;
                                }
                                if (invoke == c2.Companion.EnumC0346a.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((lVar2.getKindSet() & 262144) != 0 && (lVar2 instanceof l)) {
                                q.d delegate = lVar2.getDelegate();
                                int i4 = 0;
                                lVar2 = lVar2;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & 262144) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVar2 = delegate;
                                        } else {
                                            if (gVar2 == null) {
                                                gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (lVar2 != 0) {
                                                gVar2.b(lVar2);
                                                lVar2 = 0;
                                            }
                                            gVar2.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    lVar2 = lVar2;
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVar2 = k.l(gVar2);
                        }
                    }
                }
            }
            k.c(gVar, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public static final <T extends c2> void h(@fg.l T t4, @fg.l ld.l<? super T, ? extends c2.Companion.EnumC0346a> lVar) {
        if (!t4.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = t4.getNode().getChild();
        if (child == null) {
            k.c(gVar, t4.getNode());
        } else {
            gVar.b(child);
        }
        while (gVar.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
            if ((dVar.getAggregateChildKindSet() & 262144) != 0) {
                for (q.d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.getChild()) {
                    if ((dVar2.getKindSet() & 262144) != 0) {
                        l lVar2 = dVar2;
                        androidx.compose.runtime.collection.g gVar2 = null;
                        while (lVar2 != 0) {
                            if (lVar2 instanceof c2) {
                                c2 c2Var = (c2) lVar2;
                                c2.Companion.EnumC0346a invoke = (kotlin.jvm.internal.l0.g(t4.getTraverseKey(), c2Var.getTraverseKey()) && androidx.compose.ui.b.a(t4, c2Var)) ? lVar.invoke(c2Var) : c2.Companion.EnumC0346a.ContinueTraversal;
                                if (invoke == c2.Companion.EnumC0346a.CancelTraversal) {
                                    return;
                                }
                                if (invoke == c2.Companion.EnumC0346a.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((lVar2.getKindSet() & 262144) != 0 && (lVar2 instanceof l)) {
                                q.d delegate = lVar2.getDelegate();
                                int i4 = 0;
                                lVar2 = lVar2;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & 262144) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVar2 = delegate;
                                        } else {
                                            if (gVar2 == null) {
                                                gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (lVar2 != 0) {
                                                gVar2.b(lVar2);
                                                lVar2 = 0;
                                            }
                                            gVar2.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    lVar2 = lVar2;
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVar2 = k.l(gVar2);
                        }
                    }
                }
            }
            k.c(gVar, dVar);
        }
    }
}
