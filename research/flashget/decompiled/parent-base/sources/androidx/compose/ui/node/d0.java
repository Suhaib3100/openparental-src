package androidx.compose.ui.node;

import androidx.compose.ui.graphics.d5;
import androidx.compose.ui.graphics.f5;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LayoutModifierNodeCoordinator.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 D2\u00020\u0001:\u0002EFB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J=\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0019\u0010\u001f\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0014ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R*\u00101\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00104\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00103R.\u0010<\u001a\u0004\u0018\u0001052\b\u0010*\u001a\u0004\u0018\u0001058\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010C\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/ui/node/d0;", "Landroidx/compose/ui/node/e1;", "Landroidx/compose/ui/node/h0;", "layoutNode", "Landroidx/compose/ui/node/c0;", "measureNode", "<init>", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/node/c0;)V", "Lkotlin/k2;", "s2", "()V", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/i1;", "m0", "(J)Landroidx/compose/ui/layout/i1;", "", "height", "k0", "(I)I", "l0", "width", "Z", "t", "Landroidx/compose/ui/unit/q;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/u;", "layerBlock", "H0", "(JFLld/l;)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "K0", "(Landroidx/compose/ui/layout/a;)I", "Landroidx/compose/ui/graphics/v1;", "canvas", "x4", "(Landroidx/compose/ui/graphics/v1;)V", "<set-?>", "P", "Landroidx/compose/ui/node/c0;", "Q5", "()Landroidx/compose/ui/node/c0;", "V5", "(Landroidx/compose/ui/node/c0;)V", "layoutModifierNode", "Q", "Landroidx/compose/ui/unit/b;", "lookaheadConstraints", "Landroidx/compose/ui/node/r0;", "R", "Landroidx/compose/ui/node/r0;", "W2", "()Landroidx/compose/ui/node/r0;", "J4", "(Landroidx/compose/ui/node/r0;)V", "lookaheadDelegate", "Landroidx/compose/ui/q$d;", "g3", "()Landroidx/compose/ui/q$d;", "tail", "T5", "()Landroidx/compose/ui/node/e1;", "wrappedNonNull", "X", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@kotlin.jvm.internal.r1({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n286#2,2:218\n1#3:220\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n106#1:218,2\n*E\n"})
/* loaded from: classes.dex */
public final class d0 extends e1 {

    /* renamed from: X, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();
    public static final int Y = 0;

    @fg.l
    private static final d5 Z;

    /* renamed from: P, reason: from kotlin metadata */
    @fg.l
    private c0 layoutModifierNode;

    /* renamed from: Q, reason: from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.b lookaheadConstraints;

    /* renamed from: R, reason: from kotlin metadata */
    @fg.m
    private r0 lookaheadDelegate;

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/d0$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d5;", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/d5;", "a", "()Landroidx/compose/ui/graphics/d5;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.d0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final d5 a() {
            return d0.Z;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/d0$b;", "Landroidx/compose/ui/node/r0;", "<init>", "(Landroidx/compose/ui/node/d0;)V", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/i1;", "m0", "(J)Landroidx/compose/ui/layout/i1;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "K0", "(Landroidx/compose/ui/layout/a;)I", "height", "k0", "(I)I", "l0", "width", "Z", "t", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,217:1\n221#2,3:218\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n61#1:218,3\n*E\n"})
    private final class b extends r0 {
        public b() {
            super(d0.this);
        }

        @Override // androidx.compose.ui.node.q0
        public int K0(@fg.l androidx.compose.ui.layout.a alignmentLine) {
            int b5;
            b5 = e0.b(this, alignmentLine);
            y1().put(alignmentLine, Integer.valueOf(b5));
            return b5;
        }

        @Override // androidx.compose.ui.node.r0, androidx.compose.ui.layout.p
        public int Z(int width) {
            c0 layoutModifierNode = d0.this.getLayoutModifierNode();
            r0 lookaheadDelegate = d0.this.T5().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return layoutModifierNode.G(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.r0, androidx.compose.ui.layout.p
        public int k0(int height) {
            c0 layoutModifierNode = d0.this.getLayoutModifierNode();
            r0 lookaheadDelegate = d0.this.T5().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return layoutModifierNode.P(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.node.r0, androidx.compose.ui.layout.p
        public int l0(int height) {
            c0 layoutModifierNode = d0.this.getLayoutModifierNode();
            r0 lookaheadDelegate = d0.this.T5().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return layoutModifierNode.V(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.layout.l0
        @fg.l
        public androidx.compose.ui.layout.i1 m0(long constraints) {
            d0 d0Var = d0.this;
            J0(constraints);
            d0Var.lookaheadConstraints = androidx.compose.ui.unit.b.b(constraints);
            c0 layoutModifierNode = d0Var.getLayoutModifierNode();
            r0 lookaheadDelegate = d0Var.T5().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            W1(layoutModifierNode.f(this, lookaheadDelegate, constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.r0, androidx.compose.ui.layout.p
        public int t(int width) {
            c0 layoutModifierNode = d0.this.getLayoutModifierNode();
            r0 lookaheadDelegate = d0.this.T5().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return layoutModifierNode.p(this, lookaheadDelegate, width);
        }
    }

    static {
        androidx.compose.ui.graphics.t0 t0Var = new androidx.compose.ui.graphics.t0();
        androidx.compose.ui.graphics.d2.INSTANCE.getClass();
        t0Var.m(androidx.compose.ui.graphics.d2.f17773j);
        t0Var.z(1.0f);
        f5.INSTANCE.getClass();
        t0Var.y(f5.f17817d);
        Z = t0Var;
    }

    public d0(@fg.l h0 h0Var, @fg.l c0 c0Var) {
        super(h0Var);
        this.layoutModifierNode = c0Var;
        this.lookaheadDelegate = h0Var.getLookaheadRoot() != null ? new b() : null;
    }

    @Override // androidx.compose.ui.node.e1, androidx.compose.ui.layout.i1
    protected void H0(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock) {
        super.H0(position, zIndex, layerBlock);
        if (getIsShallowPlacing()) {
            return;
        }
        p4();
        S0().q();
    }

    @Override // androidx.compose.ui.node.e1
    protected void J4(@fg.m r0 r0Var) {
        this.lookaheadDelegate = r0Var;
    }

    @Override // androidx.compose.ui.node.q0
    public int K0(@fg.l androidx.compose.ui.layout.a alignmentLine) {
        int b5;
        r0 r0Var = this.lookaheadDelegate;
        if (r0Var != null) {
            return r0Var.x1(alignmentLine);
        }
        b5 = e0.b(this, alignmentLine);
        return b5;
    }

    @fg.l
    /* renamed from: Q5, reason: from getter */
    public final c0 getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    @fg.l
    public final e1 T5() {
        e1 wrapped = getWrapped();
        kotlin.jvm.internal.l0.m(wrapped);
        return wrapped;
    }

    public final void V5(@fg.l c0 c0Var) {
        this.layoutModifierNode = c0Var;
    }

    @Override // androidx.compose.ui.node.e1
    @fg.m
    /* renamed from: W2, reason: from getter */
    public r0 getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.p
    public int Z(int width) {
        c0 c0Var = this.layoutModifierNode;
        androidx.compose.ui.layout.n nVar = c0Var instanceof androidx.compose.ui.layout.n ? (androidx.compose.ui.layout.n) c0Var : null;
        return nVar != null ? nVar.G7(this, T5(), width) : c0Var.G(this, T5(), width);
    }

    @Override // androidx.compose.ui.node.e1
    @fg.l
    public q.d g3() {
        return this.layoutModifierNode.getNode();
    }

    @Override // androidx.compose.ui.layout.p
    public int k0(int height) {
        c0 c0Var = this.layoutModifierNode;
        androidx.compose.ui.layout.n nVar = c0Var instanceof androidx.compose.ui.layout.n ? (androidx.compose.ui.layout.n) c0Var : null;
        return nVar != null ? nVar.H7(this, T5(), height) : c0Var.P(this, T5(), height);
    }

    @Override // androidx.compose.ui.layout.p
    public int l0(int height) {
        c0 c0Var = this.layoutModifierNode;
        androidx.compose.ui.layout.n nVar = c0Var instanceof androidx.compose.ui.layout.n ? (androidx.compose.ui.layout.n) c0Var : null;
        return nVar != null ? nVar.F7(this, T5(), height) : c0Var.V(this, T5(), height);
    }

    @Override // androidx.compose.ui.layout.l0
    @fg.l
    public androidx.compose.ui.layout.i1 m0(long constraints) {
        androidx.compose.ui.layout.n0 f4;
        J0(constraints);
        c0 c0Var = this.layoutModifierNode;
        if (c0Var instanceof androidx.compose.ui.layout.n) {
            androidx.compose.ui.layout.n nVar = (androidx.compose.ui.layout.n) c0Var;
            e1 T5 = T5();
            r0 r0Var = this.lookaheadDelegate;
            kotlin.jvm.internal.l0.m(r0Var);
            androidx.compose.ui.layout.n0 S0 = r0Var.S0();
            long a5 = androidx.compose.ui.unit.v.a(S0.getWidth(), S0.getHeight());
            androidx.compose.ui.unit.b bVar = this.lookaheadConstraints;
            kotlin.jvm.internal.l0.m(bVar);
            f4 = nVar.C7(this, T5, constraints, a5, bVar.getValue());
        } else {
            f4 = c0Var.f(this, T5(), constraints);
        }
        M4(f4);
        m4();
        return this;
    }

    @Override // androidx.compose.ui.node.e1
    public void s2() {
        if (this.lookaheadDelegate == null) {
            this.lookaheadDelegate = new b();
        }
    }

    @Override // androidx.compose.ui.layout.p
    public int t(int width) {
        c0 c0Var = this.layoutModifierNode;
        androidx.compose.ui.layout.n nVar = c0Var instanceof androidx.compose.ui.layout.n ? (androidx.compose.ui.layout.n) c0Var : null;
        return nVar != null ? nVar.E7(this, T5(), width) : c0Var.p(this, T5(), width);
    }

    @Override // androidx.compose.ui.node.e1
    public void x4(@fg.l androidx.compose.ui.graphics.v1 canvas) {
        T5().h2(canvas);
        if (l0.d(getLayoutNode()).getShowLayoutBounds()) {
            m2(canvas, Z);
        }
    }
}
