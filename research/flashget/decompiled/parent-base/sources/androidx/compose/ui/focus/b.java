package androidx.compose.ui.focus;

import androidx.compose.ui.focus.f;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.node.c1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\b\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/c$a;", "Lkotlin/u;", "block", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILld/l;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBeyondBoundsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,58:1\n90#2:59\n262#3:60\n230#3,5:61\n58#3:66\n59#3,8:68\n385#3,5:76\n263#3:81\n390#3:82\n395#3,2:84\n397#3,8:89\n405#3,9:100\n414#3,8:112\n68#3,7:120\n265#3:127\n1#4:67\n261#5:83\n234#6,3:86\n237#6,3:109\n1208#7:97\n1187#7,2:98\n*S KotlinDebug\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n*L\n39#1:59\n39#1:60\n39#1:61,5\n39#1:66\n39#1:68,8\n39#1:76,5\n39#1:81\n39#1:82\n39#1:84,2\n39#1:89,8\n39#1:100,9\n39#1:112,8\n39#1:120,7\n39#1:127\n39#1:67\n39#1:83\n39#1:86,3\n39#1:109,3\n39#1:97\n39#1:98,2\n*E\n"})
/* loaded from: classes.dex */
public final class b {
    @fg.m
    public static final <T> T a(@fg.l FocusTargetNode focusTargetNode, int i4, @fg.l ld.l<? super c.a, ? extends T> lVar) {
        q.d dVar;
        androidx.compose.ui.layout.c G7;
        int i5;
        c1 nodes;
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = focusTargetNode.getNode().getParent();
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(focusTargetNode);
        loop0: while (true) {
            if (p4 == null) {
                dVar = null;
                break;
            }
            if ((a.a(p4) & 1024) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 1024) != 0) {
                        dVar = parent;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (dVar != null) {
                            if (dVar instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((dVar.getKindSet() & 1024) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                int i6 = 0;
                                for (q.d delegate = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
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
                                if (i6 == 1) {
                                }
                            }
                            dVar = androidx.compose.ui.node.k.l(gVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVar;
        if ((focusTargetNode2 != null && kotlin.jvm.internal.l0.g(focusTargetNode2.G7(), focusTargetNode.G7())) || (G7 = focusTargetNode.G7()) == null) {
            return null;
        }
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (f.l(i4, f.f17530g)) {
            c.b.INSTANCE.getClass();
            i5 = c.b.f18925g;
        } else {
            companion.getClass();
            if (f.l(i4, f.f17531h)) {
                c.b.INSTANCE.getClass();
                i5 = c.b.f18926h;
            } else {
                companion.getClass();
                if (f.l(i4, f.f17528e)) {
                    c.b.INSTANCE.getClass();
                    i5 = c.b.f18923e;
                } else {
                    companion.getClass();
                    if (f.l(i4, f.f17529f)) {
                        c.b.INSTANCE.getClass();
                        i5 = c.b.f18924f;
                    } else {
                        companion.getClass();
                        if (f.l(i4, f.f17526c)) {
                            c.b.INSTANCE.getClass();
                            i5 = c.b.f18922d;
                        } else {
                            companion.getClass();
                            if (!f.l(i4, f.f17527d)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            c.b.INSTANCE.getClass();
                            i5 = c.b.f18921c;
                        }
                    }
                }
            }
        }
        return (T) G7.b(i5, lVar);
    }
}
