package androidx.compose.ui.focus;

import androidx.compose.ui.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: FocusInvalidationManager.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/ui/focus/l;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/k2;", "onRequestApplyChangesListener", "<init>", "(Lld/l;)V", "T", "", "node", "g", "(Ljava/util/Set;Ljava/lang/Object;)V", "Landroidx/compose/ui/focus/FocusTargetNode;", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/i;", "d", "(Landroidx/compose/ui/focus/i;)V", "Landroidx/compose/ui/focus/w;", "e", "(Landroidx/compose/ui/focus/w;)V", "a", "Lld/l;", "b", "Ljava/util/Set;", "focusTargetNodes", "c", "focusEventNodes", "focusPropertiesNodes", "Lld/a;", "invalidateNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final int f17548f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<ld.a<k2>, k2> onRequestApplyChangesListener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Set<FocusTargetNode> focusTargetNodes = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Set<i> focusEventNodes = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Set<w> focusPropertiesNodes = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<k2> invalidateNodes = new a();

    /* compiled from: FocusInvalidationManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,140:1\n1855#2:141\n1856#2:252\n1855#2:253\n1856#2:364\n1855#2,2:365\n90#3:142\n90#3:254\n282#4:143\n385#4,6:144\n395#4,2:151\n397#4,8:156\n405#4,9:167\n414#4,8:179\n283#4:187\n133#4:188\n134#4,8:190\n142#4,9:199\n385#4,37:208\n151#4,6:245\n284#4:251\n282#4:255\n385#4,6:256\n395#4,2:263\n397#4,8:268\n405#4,9:279\n414#4,8:291\n283#4:299\n133#4:300\n134#4,8:302\n142#4,9:311\n385#4,37:320\n151#4,6:357\n284#4:363\n261#5:150\n261#5:262\n234#6,3:153\n237#6,3:176\n234#6,3:265\n237#6,3:288\n1208#7:164\n1187#7,2:165\n1208#7:276\n1187#7,2:277\n1#8:189\n1#8:301\n1#8:367\n48#9:198\n48#9:310\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n*L\n59#1:141\n59#1:252\n72#1:253\n72#1:364\n120#1:365,2\n64#1:142\n86#1:254\n64#1:143\n64#1:144,6\n64#1:151,2\n64#1:156,8\n64#1:167,9\n64#1:179,8\n64#1:187\n64#1:188\n64#1:190,8\n64#1:199,9\n64#1:208,37\n64#1:245,6\n64#1:251\n86#1:255\n86#1:256,6\n86#1:263,2\n86#1:268,8\n86#1:279,9\n86#1:291,8\n86#1:299\n86#1:300\n86#1:302,8\n86#1:311,9\n86#1:320,37\n86#1:357,6\n86#1:363\n64#1:150\n86#1:262\n64#1:153,3\n64#1:176,3\n86#1:265,3\n86#1:288,3\n64#1:164\n64#1:165,2\n86#1:276\n86#1:277,2\n64#1:189\n86#1:301\n64#1:198\n86#1:310\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        a() {
            super(0);
        }

        public final void a() {
            int i4;
            j0 j0Var;
            Set set = l.this.focusPropertiesNodes;
            l lVar = l.this;
            Iterator it = set.iterator();
            while (true) {
                int i5 = 16;
                int i6 = 0;
                int i7 = 1;
                if (!it.hasNext()) {
                    l.this.focusPropertiesNodes.clear();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Set<i> set2 = l.this.focusEventNodes;
                    l lVar2 = l.this;
                    for (i iVar : set2) {
                        if (iVar.getNode().getIsAttached()) {
                            q.d node = iVar.getNode();
                            int i10 = i6;
                            int i11 = i7;
                            FocusTargetNode focusTargetNode = null;
                            androidx.compose.runtime.collection.g gVar = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                    if (focusTargetNode != null) {
                                        i10 = i7;
                                    }
                                    if (lVar2.focusTargetNodes.contains(focusTargetNode2)) {
                                        linkedHashSet.add(focusTargetNode2);
                                        i11 = i6;
                                    }
                                    focusTargetNode = focusTargetNode2;
                                } else if ((node.getKindSet() & 1024) != 0 && (node instanceof androidx.compose.ui.node.l)) {
                                    q.d delegate = ((androidx.compose.ui.node.l) node).getDelegate();
                                    int i12 = i6;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & 1024) != 0) {
                                            i12++;
                                            if (i12 == i7) {
                                                node = delegate;
                                            } else {
                                                if (gVar == null) {
                                                    gVar = new androidx.compose.runtime.collection.g(new q.d[i5], 0);
                                                }
                                                if (node != null) {
                                                    gVar.b(node);
                                                    node = null;
                                                }
                                                gVar.b(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        i5 = 16;
                                    }
                                    if (i12 == i7) {
                                        i5 = 16;
                                        i6 = 0;
                                    }
                                }
                                node = androidx.compose.ui.node.k.l(gVar);
                                i5 = 16;
                                i6 = 0;
                            }
                            if (!iVar.getNode().getIsAttached()) {
                                throw new IllegalStateException("visitChildren called on an unattached node");
                            }
                            androidx.compose.runtime.collection.g gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                            q.d child = iVar.getNode().getChild();
                            if (child == null) {
                                androidx.compose.ui.node.k.c(gVar2, iVar.getNode());
                            } else {
                                gVar2.b(child);
                            }
                            while (gVar2.V()) {
                                q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar2, i7);
                                if ((dVar.getAggregateChildKindSet() & 1024) == 0) {
                                    androidx.compose.ui.node.k.c(gVar2, dVar);
                                } else {
                                    while (dVar != null) {
                                        if ((dVar.getKindSet() & 1024) != 0) {
                                            androidx.compose.runtime.collection.g gVar3 = null;
                                            while (dVar != null) {
                                                if (dVar instanceof FocusTargetNode) {
                                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) dVar;
                                                    if (focusTargetNode != null) {
                                                        i10 = i7;
                                                    }
                                                    if (lVar2.focusTargetNodes.contains(focusTargetNode3)) {
                                                        linkedHashSet.add(focusTargetNode3);
                                                        i11 = 0;
                                                    }
                                                    focusTargetNode = focusTargetNode3;
                                                } else if ((dVar.getKindSet() & 1024) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                                    q.d delegate2 = ((androidx.compose.ui.node.l) dVar).getDelegate();
                                                    androidx.compose.runtime.collection.g gVar4 = gVar3;
                                                    q.d dVar2 = dVar;
                                                    int i13 = 0;
                                                    while (delegate2 != null) {
                                                        if ((delegate2.getKindSet() & 1024) != 0) {
                                                            i13++;
                                                            if (i13 == i7) {
                                                                dVar2 = delegate2;
                                                            } else {
                                                                if (gVar4 == null) {
                                                                    gVar4 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                                }
                                                                if (dVar2 != null) {
                                                                    gVar4.b(dVar2);
                                                                    dVar2 = null;
                                                                }
                                                                gVar4.b(delegate2);
                                                                delegate2 = delegate2.getChild();
                                                                i7 = 1;
                                                            }
                                                        }
                                                        delegate2 = delegate2.getChild();
                                                        i7 = 1;
                                                    }
                                                    if (i13 == i7) {
                                                        dVar = dVar2;
                                                        gVar3 = gVar4;
                                                    } else {
                                                        gVar3 = gVar4;
                                                        dVar = androidx.compose.ui.node.k.l(gVar3);
                                                    }
                                                }
                                                dVar = androidx.compose.ui.node.k.l(gVar3);
                                            }
                                        } else {
                                            dVar = dVar.getChild();
                                        }
                                    }
                                }
                            }
                            i4 = 0;
                            if (i11 != 0) {
                                if (i10 != 0) {
                                    j0Var = j.a(iVar);
                                } else if (focusTargetNode == null || (j0Var = focusTargetNode.I0()) == null) {
                                    j0Var = k0.Inactive;
                                }
                                iVar.e0(j0Var);
                            }
                        } else {
                            iVar.e0(k0.Inactive);
                            i4 = i6;
                        }
                        i6 = i4;
                        i5 = 16;
                    }
                    l.this.focusEventNodes.clear();
                    for (FocusTargetNode focusTargetNode4 : l.this.focusTargetNodes) {
                        if (focusTargetNode4.getIsAttached()) {
                            k0 I0 = focusTargetNode4.I0();
                            focusTargetNode4.J7();
                            if (I0 != focusTargetNode4.I0() || linkedHashSet.contains(focusTargetNode4)) {
                                j.c(focusTargetNode4);
                            }
                        }
                    }
                    l.this.focusTargetNodes.clear();
                    linkedHashSet.clear();
                    if (!l.this.focusPropertiesNodes.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusProperties nodes");
                    }
                    if (!l.this.focusEventNodes.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusEvent nodes");
                    }
                    if (!l.this.focusTargetNodes.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusTarget nodes");
                    }
                    return;
                }
                w wVar = (w) it.next();
                if (wVar.getNode().getIsAttached()) {
                    q.d node2 = wVar.getNode();
                    androidx.compose.runtime.collection.g gVar5 = null;
                    while (node2 != null) {
                        if (node2 instanceof FocusTargetNode) {
                            lVar.focusTargetNodes.add((FocusTargetNode) node2);
                        } else if ((node2.getKindSet() & 1024) != 0 && (node2 instanceof androidx.compose.ui.node.l)) {
                            int i14 = 0;
                            for (q.d delegate3 = ((androidx.compose.ui.node.l) node2).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                if ((delegate3.getKindSet() & 1024) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        node2 = delegate3;
                                    } else {
                                        if (gVar5 == null) {
                                            gVar5 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                        }
                                        if (node2 != null) {
                                            gVar5.b(node2);
                                            node2 = null;
                                        }
                                        gVar5.b(delegate3);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        node2 = androidx.compose.ui.node.k.l(gVar5);
                    }
                    if (!wVar.getNode().getIsAttached()) {
                        throw new IllegalStateException("visitChildren called on an unattached node");
                    }
                    androidx.compose.runtime.collection.g gVar6 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                    q.d child2 = wVar.getNode().getChild();
                    if (child2 == null) {
                        androidx.compose.ui.node.k.c(gVar6, wVar.getNode());
                    } else {
                        gVar6.b(child2);
                    }
                    while (gVar6.V()) {
                        q.d dVar3 = (q.d) androidx.compose.foundation.gestures.i.a(gVar6, 1);
                        if ((dVar3.getAggregateChildKindSet() & 1024) == 0) {
                            androidx.compose.ui.node.k.c(gVar6, dVar3);
                        } else {
                            while (true) {
                                if (dVar3 == null) {
                                    break;
                                }
                                if ((dVar3.getKindSet() & 1024) != 0) {
                                    androidx.compose.runtime.collection.g gVar7 = null;
                                    while (dVar3 != null) {
                                        if (dVar3 instanceof FocusTargetNode) {
                                            lVar.focusTargetNodes.add((FocusTargetNode) dVar3);
                                        } else if ((dVar3.getKindSet() & 1024) != 0 && (dVar3 instanceof androidx.compose.ui.node.l)) {
                                            int i15 = 0;
                                            for (q.d delegate4 = ((androidx.compose.ui.node.l) dVar3).getDelegate(); delegate4 != null; delegate4 = delegate4.getChild()) {
                                                if ((delegate4.getKindSet() & 1024) != 0) {
                                                    i15++;
                                                    if (i15 == 1) {
                                                        dVar3 = delegate4;
                                                    } else {
                                                        if (gVar7 == null) {
                                                            gVar7 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                        }
                                                        if (dVar3 != null) {
                                                            gVar7.b(dVar3);
                                                            dVar3 = null;
                                                        }
                                                        gVar7.b(delegate4);
                                                    }
                                                }
                                            }
                                            if (i15 == 1) {
                                            }
                                        }
                                        dVar3 = androidx.compose.ui.node.k.l(gVar7);
                                    }
                                } else {
                                    dVar3 = dVar3.getChild();
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@fg.l ld.l<? super ld.a<k2>, k2> lVar) {
        this.onRequestApplyChangesListener = lVar;
    }

    private final <T> void g(Set<T> set, T t4) {
        if (set.add(t4)) {
            if (this.focusPropertiesNodes.size() + this.focusEventNodes.size() + this.focusTargetNodes.size() == 1) {
                this.onRequestApplyChangesListener.invoke(this.invalidateNodes);
            }
        }
    }

    public final void d(@fg.l i node) {
        g(this.focusEventNodes, node);
    }

    public final void e(@fg.l w node) {
        g(this.focusPropertiesNodes, node);
    }

    public final void f(@fg.l FocusTargetNode node) {
        g(this.focusTargetNodes, node);
    }
}
