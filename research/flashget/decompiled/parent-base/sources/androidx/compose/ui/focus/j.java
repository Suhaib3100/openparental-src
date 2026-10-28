package androidx.compose.ui.focus;

import androidx.compose.ui.node.c1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: FocusEventModifierNode.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/focus/i;", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/focus/i;)V", "Landroidx/compose/ui/focus/j0;", "a", "(Landroidx/compose/ui/focus/i;)Landroidx/compose/ui/focus/j0;", "Landroidx/compose/ui/focus/FocusTargetNode;", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,71:1\n90#2:72\n94#2:182\n90#2:183\n282#3:73\n385#3,6:74\n395#3,2:81\n397#3,8:86\n405#3,9:97\n414#3,8:109\n283#3:117\n133#3:118\n134#3,8:120\n142#3,9:129\n385#3,37:138\n151#3,6:175\n284#3:181\n241#3,2:184\n58#3:186\n59#3,8:188\n243#3:196\n244#3,2:198\n385#3,12:200\n397#3,8:215\n405#3,9:226\n414#3,8:238\n247#3:246\n68#3,7:247\n248#3:254\n261#4:80\n261#4:197\n234#5,3:83\n237#5,3:106\n234#5,3:212\n237#5,3:235\n1208#6:94\n1187#6,2:95\n1208#6:223\n1187#6,2:224\n1#7:119\n1#7:187\n48#8:128\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n47#1:72\n66#1:182\n66#1:183\n47#1:73\n47#1:74,6\n47#1:81,2\n47#1:86,8\n47#1:97,9\n47#1:109,8\n47#1:117\n47#1:118\n47#1:120,8\n47#1:129,9\n47#1:138,37\n47#1:175,6\n47#1:181\n66#1:184,2\n66#1:186\n66#1:188,8\n66#1:196\n66#1:198,2\n66#1:200,12\n66#1:215,8\n66#1:226,9\n66#1:238,8\n66#1:246\n66#1:247,7\n66#1:254\n47#1:80\n66#1:197\n47#1:83,3\n47#1:106,3\n66#1:212,3\n66#1:235,3\n47#1:94\n47#1:95,2\n66#1:223\n66#1:224,2\n47#1:119\n66#1:187\n47#1:128\n*E\n"})
/* loaded from: classes.dex */
public final class j {

    /* compiled from: FocusEventModifierNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17545a;

        static {
            int[] iArr = new int[k0.values().length];
            try {
                iArr[k0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17545a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0091, code lost:
    
        continue;
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.j0 a(@fg.l androidx.compose.ui.focus.i r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.j.a(androidx.compose.ui.focus.i):androidx.compose.ui.focus.j0");
    }

    public static final void b(@fg.l i iVar) {
        androidx.compose.ui.node.k.q(iVar).getFocusOwner().b(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void c(@fg.l FocusTargetNode focusTargetNode) {
        c1 nodes;
        q.d node = focusTargetNode.getNode();
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d node2 = focusTargetNode.getNode();
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(focusTargetNode);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & 5120) != 0) {
                        if (node2 != node && (node2.getKindSet() & 1024) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & 4096) != 0) {
                            androidx.compose.ui.node.l lVar = node2;
                            androidx.compose.runtime.collection.g gVar = null;
                            while (lVar != 0) {
                                if (lVar instanceof i) {
                                    i iVar = (i) lVar;
                                    iVar.e0(a(iVar));
                                } else if ((lVar.getKindSet() & 4096) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                                    q.d delegate = lVar.getDelegate();
                                    int i4 = 0;
                                    lVar = lVar;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & 4096) != 0) {
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
                                lVar = androidx.compose.ui.node.k.l(gVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            p4 = p4.B0();
            node2 = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
    }
}
