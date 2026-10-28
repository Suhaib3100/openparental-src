package androidx.compose.ui.node;

import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DelegatingNode.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0013H\u0004¢\u0006\u0004\b\u001c\u0010\u001aJ$\u0010\u001f\u001a\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u001dH\u0080\b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0007H\u0010¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0007H\u0010¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0007H\u0010¢\u0006\u0004\b%\u0010\u0003R \u0010+\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/q$d;", "<init>", "()V", "", "delegateKindSet", "delegateNode", "Lkotlin/k2;", "I7", "(ILandroidx/compose/ui/q$d;)V", "newKindSet", "", "recalculateOwner", "H7", "(IZ)V", "Landroidx/compose/ui/node/e1;", "coordinator", "x7", "(Landroidx/compose/ui/node/e1;)V", "Landroidx/compose/ui/node/j;", "T", "delegatableNode", "z7", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/node/j;", "instance", "G7", "(Landroidx/compose/ui/node/j;)V", "y7", "F7", "Lkotlin/Function1;", "block", "A7", "(Lld/l;)V", "g7", "m7", "n7", "h7", "l7", "p", "I", "C7", "()I", "D7", "selfKindSet", "q", "Landroidx/compose/ui/q$d;", "B7", "()Landroidx/compose/ui/q$d;", "E7", "(Landroidx/compose/ui/q$d;)V", "delegate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,277:1\n234#1,6:278\n234#1,6:290\n234#1,6:296\n234#1,6:302\n234#1,6:308\n234#1,6:314\n72#2:284\n72#2:286\n72#2:288\n55#3:285\n55#3:287\n55#3:289\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n45#1:278,6\n243#1:290,6\n254#1:296,6\n262#1:302,6\n268#1:308,6\n274#1:314,6\n106#1:284\n162#1:286\n176#1:288\n106#1:285\n162#1:287\n176#1:289\n*E\n"})
/* loaded from: classes.dex */
public abstract class l extends q.d {

    /* renamed from: r, reason: collision with root package name */
    public static final int f19344r = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int selfKindSet = h1.g(this);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private q.d delegate;

    public static /* synthetic */ void D7() {
    }

    private final void H7(int newKindSet, boolean recalculateOwner) {
        q.d child;
        int kindSet = getKindSet();
        s7(newKindSet);
        if (kindSet != newKindSet) {
            if (k.i(this)) {
                o7(newKindSet);
            }
            if (getIsAttached()) {
                q.d node = getNode();
                q.d dVar = this;
                while (dVar != null) {
                    newKindSet |= dVar.getKindSet();
                    dVar.s7(newKindSet);
                    if (dVar == node) {
                        break;
                    } else {
                        dVar = dVar.getParent();
                    }
                }
                if (recalculateOwner && dVar == node) {
                    newKindSet = h1.h(node);
                    node.s7(newKindSet);
                }
                int aggregateChildKindSet = newKindSet | ((dVar == null || (child = dVar.getChild()) == null) ? 0 : child.getAggregateChildKindSet());
                while (dVar != null) {
                    aggregateChildKindSet |= dVar.getKindSet();
                    dVar.o7(aggregateChildKindSet);
                    dVar = dVar.getParent();
                }
            }
        }
    }

    private final void I7(int delegateKindSet, q.d delegateNode) {
        int kindSet = getKindSet();
        if ((delegateKindSet & 2) == 0 || (kindSet & 2) == 0 || (this instanceof c0)) {
            return;
        }
        throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + delegateNode).toString());
    }

    public final void A7(@fg.l ld.l<? super q.d, k2> block) {
        for (q.d dVar = this.delegate; dVar != null; dVar = dVar.getChild()) {
            block.invoke(dVar);
        }
    }

    @fg.m
    /* renamed from: B7, reason: from getter */
    public final q.d getDelegate() {
        return this.delegate;
    }

    /* renamed from: C7, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }

    public final void E7(@fg.m q.d dVar) {
        this.delegate = dVar;
    }

    protected final void F7(@fg.l j instance) {
        q.d dVar = null;
        for (q.d dVar2 = this.delegate; dVar2 != null; dVar2 = dVar2.getChild()) {
            if (dVar2 == instance) {
                if (dVar2.getIsAttached()) {
                    h1.d(dVar2);
                    dVar2.n7();
                    dVar2.h7();
                }
                dVar2.p7(dVar2);
                dVar2.o7(0);
                if (dVar == null) {
                    this.delegate = dVar2.getChild();
                } else {
                    dVar.q7(dVar2.getChild());
                }
                dVar2.q7(null);
                dVar2.u7(null);
                int kindSet = getKindSet();
                int h4 = h1.h(this);
                H7(h4, true);
                if (getIsAttached() && (kindSet & 2) != 0 && (h4 & 2) == 0) {
                    c1 nodes = k.p(this).getNodes();
                    getNode().x7(null);
                    nodes.M();
                    return;
                }
                return;
            }
            dVar = dVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }

    @fg.p
    public final void G7(@fg.l j instance) {
        F7(instance);
    }

    @Override // androidx.compose.ui.q.d
    public void g7() {
        super.g7();
        for (q.d dVar = this.delegate; dVar != null; dVar = dVar.getChild()) {
            dVar.x7(getCoordinator());
            if (!dVar.getIsAttached()) {
                dVar.g7();
            }
        }
    }

    @Override // androidx.compose.ui.q.d
    public void h7() {
        for (q.d dVar = this.delegate; dVar != null; dVar = dVar.getChild()) {
            dVar.h7();
        }
        super.h7();
    }

    @Override // androidx.compose.ui.q.d
    public void l7() {
        super.l7();
        for (q.d dVar = this.delegate; dVar != null; dVar = dVar.getChild()) {
            dVar.l7();
        }
    }

    @Override // androidx.compose.ui.q.d
    public void m7() {
        for (q.d dVar = this.delegate; dVar != null; dVar = dVar.getChild()) {
            dVar.m7();
        }
        super.m7();
    }

    @Override // androidx.compose.ui.q.d
    public void n7() {
        super.n7();
        for (q.d dVar = this.delegate; dVar != null; dVar = dVar.getChild()) {
            dVar.n7();
        }
    }

    @Override // androidx.compose.ui.q.d
    public void x7(@fg.m e1 coordinator) {
        super.x7(coordinator);
        for (q.d dVar = this.delegate; dVar != null; dVar = dVar.getChild()) {
            dVar.x7(coordinator);
        }
    }

    @fg.l
    protected final <T extends j> T y7(@fg.l T delegatableNode) {
        q.d node = delegatableNode.getNode();
        if (node != delegatableNode) {
            q.d dVar = delegatableNode instanceof q.d ? (q.d) delegatableNode : null;
            q.d parent = dVar != null ? dVar.getParent() : null;
            if (node == getNode() && kotlin.jvm.internal.l0.g(parent, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.getIsAttached()) {
            throw new IllegalStateException("Cannot delegate to an already attached node");
        }
        node.p7(getNode());
        int kindSet = getKindSet();
        int h4 = h1.h(node);
        node.s7(h4);
        I7(h4, node);
        node.q7(this.delegate);
        this.delegate = node;
        node.u7(this);
        H7(getKindSet() | h4, false);
        if (getIsAttached()) {
            if ((h4 & 2) == 0 || (kindSet & 2) != 0) {
                x7(getCoordinator());
            } else {
                c1 nodes = k.p(this).getNodes();
                getNode().x7(null);
                nodes.M();
            }
            node.g7();
            node.m7();
            h1.a(node);
        }
        return delegatableNode;
    }

    @fg.l
    @fg.p
    public final <T extends j> T z7(@fg.l T delegatableNode) {
        return (T) y7(delegatableNode);
    }
}
