package androidx.compose.ui.focus;

import androidx.compose.ui.node.c1;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l1;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: FocusTargetNode.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00016B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0007J\u000f\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0018\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0007R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u00101\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b0\u0010\u0007\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0013\u00105\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/focus/l0;", "Landroidx/compose/ui/node/k1;", "Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/q$d;", "<init>", "()V", "Lkotlin/k2;", "d2", "k7", "Landroidx/compose/ui/focus/t;", "F7", "()Landroidx/compose/ui/focus/t;", "Landroidx/compose/ui/focus/f;", "focusDirection", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/a0;", "block", "D7", "(ILld/l;)V", "E7", "C7", "J7", "K7", "", "p", "Z", "isProcessingCustomExit", "q", "isProcessingCustomEnter", "Landroidx/compose/ui/focus/k0;", "r", "Landroidx/compose/ui/focus/k0;", "committedFocusState", "", "s", "I", "I7", "()I", "M7", "(I)V", "previouslyFocusedChildHash", "value", "H7", "()Landroidx/compose/ui/focus/k0;", "L7", "(Landroidx/compose/ui/focus/k0;)V", "S0", "focusState", "Landroidx/compose/ui/layout/c;", "G7", "()Landroidx/compose/ui/layout/c;", "beyondBoundsLayoutParent", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,231:1\n1#2:232\n1#2:240\n1#2:252\n1#2:376\n39#3,7:233\n46#3,4:243\n728#4,2:241\n92#5:247\n90#5:248\n94#5:320\n94#5:364\n90#5:365\n90#5:385\n94#5:387\n241#6,2:249\n58#6:251\n59#6,8:253\n243#6:261\n244#6,2:263\n385#6,12:265\n397#6,8:280\n405#6,9:291\n414#6,8:303\n247#6:311\n68#6,7:312\n248#6:319\n385#6,6:321\n395#6,2:328\n397#6,8:333\n405#6,9:344\n414#6,8:356\n50#6,9:367\n59#6,8:377\n385#6,6:388\n395#6,2:395\n397#6,8:400\n405#6,9:411\n414#6,8:423\n68#6,7:431\n261#7:262\n261#7:327\n261#7:386\n261#7:394\n234#8,3:277\n237#8,3:300\n234#8,3:330\n237#8,3:353\n234#8,3:397\n237#8,3:420\n1208#9:288\n1187#9,2:289\n1208#9:341\n1187#9,2:342\n1208#9:408\n1187#9,2:409\n47#10:366\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n86#1:240\n99#1:252\n196#1:376\n86#1:233,7\n86#1:243,4\n86#1:241,2\n99#1:247\n99#1:248\n189#1:320\n196#1:364\n196#1:365\n197#1:385\n200#1:387\n99#1:249,2\n99#1:251\n99#1:253,8\n99#1:261\n99#1:263,2\n99#1:265,12\n99#1:280,8\n99#1:291,9\n99#1:303,8\n99#1:311\n99#1:312,7\n99#1:319\n189#1:321,6\n189#1:328,2\n189#1:333,8\n189#1:344,9\n189#1:356,8\n196#1:367,9\n196#1:377,8\n200#1:388,6\n200#1:395,2\n200#1:400,8\n200#1:411,9\n200#1:423,8\n196#1:431,7\n99#1:262\n189#1:327\n197#1:386\n200#1:394\n99#1:277,3\n99#1:300,3\n189#1:330,3\n189#1:353,3\n200#1:397,3\n200#1:420,3\n99#1:288\n99#1:289,2\n189#1:341\n189#1:342,2\n200#1:408\n200#1:409,2\n196#1:366\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTargetNode extends q.d implements androidx.compose.ui.node.h, l0, k1, androidx.compose.ui.modifier.j {

    /* renamed from: t, reason: collision with root package name */
    public static final int f17503t = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomExit;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomEnter;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private k0 committedFocusState = k0.Inactive;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int previouslyFocusedChildHash;

    /* compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "n", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "Lkotlin/k2;", "o", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    public static final class FocusTargetElement extends y0<FocusTargetNode> {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final FocusTargetElement f17508d = new FocusTargetElement();

        /* renamed from: e, reason: collision with root package name */
        public static final int f17509e = 0;

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.y0
        public boolean equals(@fg.m Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.y0
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.y0
        public FocusTargetNode i() {
            return new FocusTargetNode();
        }

        @Override // androidx.compose.ui.node.y0
        public void k(@fg.l a2 a2Var) {
            a2Var.d("focusTarget");
        }

        @Override // androidx.compose.ui.node.y0
        public void m(FocusTargetNode focusTargetNode) {
        }

        @fg.l
        public FocusTargetNode n() {
            return new FocusTargetNode();
        }

        public void o(@fg.l FocusTargetNode node) {
        }
    }

    /* compiled from: FocusTargetNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17510a;

        static {
            int[] iArr = new int[k0.values().length];
            try {
                iArr[k0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17510a = iArr;
        }
    }

    /* compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<t> f17511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f17512c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.h<t> hVar, FocusTargetNode focusTargetNode) {
            super(0);
            this.f17511b = hVar;
            this.f17512c = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.t] */
        public final void a() {
            this.f17511b.f75329b = this.f17512c.F7();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    public static /* synthetic */ void S0() {
    }

    public final void C7() {
        k0 i4 = n0.d(this).i(this);
        if (i4 == null) {
            throw new IllegalStateException("committing a node that was not updated in the current transaction");
        }
        this.committedFocusState = i4;
    }

    public final void D7(int focusDirection, @fg.l ld.l<? super a0, k2> block) {
        if (this.isProcessingCustomEnter) {
            return;
        }
        this.isProcessingCustomEnter = true;
        try {
            a0 invoke = F7().n().invoke(f.i(focusDirection));
            a0.INSTANCE.getClass();
            if (invoke != a0.f17515d) {
                block.invoke(invoke);
            }
        } finally {
            this.isProcessingCustomEnter = false;
        }
    }

    public final void E7(int focusDirection, @fg.l ld.l<? super a0, k2> block) {
        if (this.isProcessingCustomExit) {
            return;
        }
        this.isProcessingCustomExit = true;
        try {
            a0 invoke = F7().h().invoke(f.i(focusDirection));
            a0.INSTANCE.getClass();
            if (invoke != a0.f17515d) {
                block.invoke(invoke);
            }
        } finally {
            this.isProcessingCustomExit = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @fg.l
    public final t F7() {
        c1 nodes;
        u uVar = new u();
        q.d node = getNode();
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d node2 = getNode();
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(this);
        loop0: while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 3072) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & 3072) != 0) {
                        if (node2 != node && (node2.getKindSet() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & 2048) != 0) {
                            androidx.compose.ui.node.l lVar = node2;
                            androidx.compose.runtime.collection.g gVar = null;
                            while (lVar != 0) {
                                if (lVar instanceof w) {
                                    ((w) lVar).V3(uVar);
                                } else if ((lVar.getKindSet() & 2048) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                                    q.d delegate = lVar.getDelegate();
                                    int i4 = 0;
                                    lVar = lVar;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & 2048) != 0) {
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
        return uVar;
    }

    @fg.m
    public final androidx.compose.ui.layout.c G7() {
        return (androidx.compose.ui.layout.c) v(androidx.compose.ui.layout.d.a());
    }

    @Override // androidx.compose.ui.focus.l0
    @fg.l
    /* renamed from: H7, reason: merged with bridge method [inline-methods] */
    public k0 I0() {
        o0 b5;
        k0 i4;
        b5 = n0.b(this);
        return (b5 == null || (i4 = b5.i(this)) == null) ? this.committedFocusState : i4;
    }

    /* renamed from: I7, reason: from getter */
    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    public final void J7() {
        t tVar;
        int i4 = a.f17510a[I0().ordinal()];
        if (i4 == 1 || i4 == 2) {
            k1.h hVar = new k1.h();
            l1.a(this, new b(hVar, this));
            T t4 = hVar.f75329b;
            if (t4 == 0) {
                kotlin.jvm.internal.l0.S("focusProperties");
                tVar = null;
            } else {
                tVar = (t) t4;
            }
            if (tVar.getCanFocus()) {
                return;
            }
            androidx.compose.ui.node.k.q(this).t().o(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.q$d] */
    public final void K7() {
        c1 nodes;
        androidx.compose.ui.node.l node = getNode();
        androidx.compose.runtime.collection.g gVar = null;
        while (node != 0) {
            if (node instanceof i) {
                j.b((i) node);
            } else if ((node.getKindSet() & 4096) != 0 && (node instanceof androidx.compose.ui.node.l)) {
                q.d delegate = node.getDelegate();
                int i4 = 0;
                node = node;
                while (delegate != null) {
                    if ((delegate.getKindSet() & 4096) != 0) {
                        i4++;
                        if (i4 == 1) {
                            node = delegate;
                        } else {
                            if (gVar == null) {
                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                            }
                            if (node != 0) {
                                gVar.b(node);
                                node = 0;
                            }
                            gVar.b(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    node = node;
                }
                if (i4 == 1) {
                }
            }
            node = androidx.compose.ui.node.k.l(gVar);
        }
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = getNode().getParent();
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(this);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 5120) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 5120) != 0 && (parent.getKindSet() & 1024) == 0 && parent.getIsAttached()) {
                        androidx.compose.ui.node.l lVar = parent;
                        androidx.compose.runtime.collection.g gVar2 = null;
                        while (lVar != 0) {
                            if (lVar instanceof i) {
                                j.b((i) lVar);
                            } else if ((lVar.getKindSet() & 4096) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                                q.d delegate2 = lVar.getDelegate();
                                int i5 = 0;
                                lVar = lVar;
                                while (delegate2 != null) {
                                    if ((delegate2.getKindSet() & 4096) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            lVar = delegate2;
                                        } else {
                                            if (gVar2 == null) {
                                                gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (lVar != 0) {
                                                gVar2.b(lVar);
                                                lVar = 0;
                                            }
                                            gVar2.b(delegate2);
                                        }
                                    }
                                    delegate2 = delegate2.getChild();
                                    lVar = lVar;
                                }
                                if (i5 == 1) {
                                }
                            }
                            lVar = androidx.compose.ui.node.k.l(gVar2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public void L7(@fg.l k0 k0Var) {
        n0.d(this).j(this, k0Var);
    }

    public final void M7(int i4) {
        this.previouslyFocusedChildHash = i4;
    }

    @Override // androidx.compose.ui.node.k1
    public void d2() {
        k0 I0 = I0();
        J7();
        if (I0 != I0()) {
            j.c(this);
        }
    }

    @Override // androidx.compose.ui.q.d
    public void k7() {
        boolean z4;
        int i4 = a.f17510a[I0().ordinal()];
        if (i4 == 1 || i4 == 2) {
            androidx.compose.ui.node.k.q(this).t().o(true);
            return;
        }
        if (i4 != 3) {
            if (i4 != 4) {
                return;
            }
            K7();
            return;
        }
        K7();
        o0 d5 = n0.d(this);
        try {
            z4 = d5.ongoingTransaction;
            if (z4) {
                d5.g();
            }
            o0.a(d5);
            L7(k0.Inactive);
            k2 k2Var = k2.f75408a;
            d5.h();
        } catch (Throwable th) {
            d5.h();
            throw th;
        }
    }
}
