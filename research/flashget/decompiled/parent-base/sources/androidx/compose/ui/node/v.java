package androidx.compose.ui.node;

import androidx.compose.ui.graphics.d5;
import androidx.compose.ui.graphics.f5;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.m0;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: InnerNodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 C2\u00020\u0001:\u0002DEB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J=\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0019\u0010\u001d\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a¢\u0006\u0002\b\u001cH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J:\u00101\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102R \u00109\u001a\u0002038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010\b\u001a\u0004\b6\u00107R.\u0010B\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Landroidx/compose/ui/node/v;", "Landroidx/compose/ui/node/e1;", "Landroidx/compose/ui/node/h0;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/h0;)V", "Lkotlin/k2;", "s2", "()V", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/i1;", "m0", "(J)Landroidx/compose/ui/layout/i1;", "", "height", "k0", "(I)I", "width", "Z", "l0", "t", "Landroidx/compose/ui/unit/q;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/u;", "layerBlock", "H0", "(JFLld/l;)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "K0", "(Landroidx/compose/ui/layout/a;)I", "Landroidx/compose/ui/graphics/v1;", "canvas", "x4", "(Landroidx/compose/ui/graphics/v1;)V", "Landroidx/compose/ui/node/e1$f;", "hitTestSource", "Li0/f;", "pointerPosition", "Landroidx/compose/ui/node/t;", "hitTestResult", "", "isTouchEvent", "isInLayer", "J3", "(Landroidx/compose/ui/node/e1$f;JLandroidx/compose/ui/node/t;ZZ)V", "Landroidx/compose/ui/node/b2;", "P", "Landroidx/compose/ui/node/b2;", "O5", "()Landroidx/compose/ui/node/b2;", "P5", "tail", "Landroidx/compose/ui/node/r0;", "<set-?>", "Q", "Landroidx/compose/ui/node/r0;", "W2", "()Landroidx/compose/ui/node/r0;", "J4", "(Landroidx/compose/ui/node/r0;)V", "lookaheadDelegate", "R", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@kotlin.jvm.internal.r1({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,246:1\n286#2,2:247\n197#3:249\n460#4,11:250\n460#4,11:261\n222#4,11:274\n179#5,2:272\n181#5,2:285\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n119#1:247,2\n121#1:249\n121#1:250,11\n172#1:261,11\n208#1:274,11\n205#1:272,2\n205#1:285,2\n*E\n"})
/* loaded from: classes.dex */
public final class v extends e1 {

    /* renamed from: R, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();
    public static final int X = 0;

    @fg.l
    private static final d5 Y;

    /* renamed from: P, reason: from kotlin metadata */
    @fg.l
    private final b2 tail;

    /* renamed from: Q, reason: from kotlin metadata */
    @fg.m
    private r0 lookaheadDelegate;

    /* compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/v$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d5;", "innerBoundsPaint", "Landroidx/compose/ui/graphics/d5;", "a", "()Landroidx/compose/ui/graphics/d5;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.v$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final d5 a() {
            return v.Y;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/v$b;", "Landroidx/compose/ui/node/r0;", "<init>", "(Landroidx/compose/ui/node/v;)V", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/i1;", "m0", "(J)Landroidx/compose/ui/layout/i1;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "K0", "(Landroidx/compose/ui/layout/a;)I", "Lkotlin/k2;", "K1", "()V", "height", "k0", "(I)I", "width", "Z", "l0", "t", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,246:1\n221#2,2:247\n223#2:261\n197#3:249\n460#4,11:250\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n74#1:247,2\n74#1:261\n76#1:249\n76#1:250,11\n*E\n"})
    private final class b extends r0 {
        public b() {
            super(v.this);
        }

        @Override // androidx.compose.ui.node.q0
        public int K0(@fg.l androidx.compose.ui.layout.a alignmentLine) {
            Integer num = M0().y().get(alignmentLine);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            y1().put(alignmentLine, Integer.valueOf(intValue));
            return intValue;
        }

        @Override // androidx.compose.ui.node.r0
        protected void K1() {
            m0.a o02 = getLayoutNode().o0();
            kotlin.jvm.internal.l0.m(o02);
            o02.M1();
        }

        @Override // androidx.compose.ui.node.r0, androidx.compose.ui.layout.p
        public int Z(int width) {
            return getLayoutNode().getIntrinsicsPolicy().j(width);
        }

        @Override // androidx.compose.ui.node.r0, androidx.compose.ui.layout.p
        public int k0(int height) {
            return getLayoutNode().getIntrinsicsPolicy().k(height);
        }

        @Override // androidx.compose.ui.node.r0, androidx.compose.ui.layout.p
        public int l0(int height) {
            return getLayoutNode().getIntrinsicsPolicy().f(height);
        }

        @Override // androidx.compose.ui.layout.l0
        @fg.l
        public androidx.compose.ui.layout.i1 m0(long constraints) {
            J0(constraints);
            androidx.compose.runtime.collection.g<h0> H0 = getLayoutNode().H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    m0.a o02 = L[i4].o0();
                    kotlin.jvm.internal.l0.m(o02);
                    o02.Z1(h0.g.NotUsed);
                    i4++;
                } while (i4 < size);
            }
            W1(getLayoutNode().getMeasurePolicy().a(this, getLayoutNode().W(), constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.r0, androidx.compose.ui.layout.p
        public int t(int width) {
            return getLayoutNode().getIntrinsicsPolicy().e(width);
        }
    }

    static {
        androidx.compose.ui.graphics.t0 t0Var = new androidx.compose.ui.graphics.t0();
        androidx.compose.ui.graphics.d2.INSTANCE.getClass();
        t0Var.m(androidx.compose.ui.graphics.d2.f17771h);
        t0Var.z(1.0f);
        f5.INSTANCE.getClass();
        t0Var.y(f5.f17817d);
        Y = t0Var;
    }

    public v(@fg.l h0 h0Var) {
        super(h0Var);
        b2 b2Var = new b2();
        this.tail = b2Var;
        b2Var.x7(this);
        this.lookaheadDelegate = h0Var.getLookaheadRoot() != null ? new b() : null;
    }

    public static /* synthetic */ void P5() {
    }

    @Override // androidx.compose.ui.node.e1, androidx.compose.ui.layout.i1
    protected void H0(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock) {
        super.H0(position, zIndex, layerBlock);
        if (getIsShallowPlacing()) {
            return;
        }
        p4();
        getLayoutNode().r0().W1();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // androidx.compose.ui.node.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J3(@fg.l androidx.compose.ui.node.e1.f r17, long r18, @fg.l androidx.compose.ui.node.t r20, boolean r21, boolean r22) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            androidx.compose.ui.node.h0 r1 = r16.getLayoutNode()
            r10 = r17
            boolean r1 = r10.d(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            boolean r1 = r0.M5(r8)
            if (r1 == 0) goto L1c
            r11 = r22
        L1a:
            r3 = r2
            goto L36
        L1c:
            if (r21 == 0) goto L34
            long r4 = r16.X2()
            float r1 = r0.f2(r8, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L34
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L34
            r11 = r3
            goto L1a
        L34:
            r11 = r22
        L36:
            if (r3 == 0) goto L88
            int r12 = androidx.compose.ui.node.t.c(r20)
            androidx.compose.ui.node.h0 r1 = r16.getLayoutNode()
            androidx.compose.runtime.collection.g r1 = r1.F0()
            int r3 = r1.getSize()
            if (r3 <= 0) goto L7d
            int r3 = r3 - r2
            java.lang.Object[] r13 = r1.L()
            r14 = r3
        L50:
            r1 = r13[r14]
            r15 = r1
            androidx.compose.ui.node.h0 r15 = (androidx.compose.ui.node.h0) r15
            boolean r1 = r15.l()
            if (r1 == 0) goto L80
            r1 = r17
            r2 = r15
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r11
            r1.c(r2, r3, r5, r6, r7)
            boolean r1 = r20.s()
            if (r1 != 0) goto L6f
            goto L80
        L6f:
            androidx.compose.ui.node.e1 r1 = r15.z0()
            boolean r1 = r1.V4()
            if (r1 == 0) goto L7d
            r20.b()
            goto L80
        L7d:
            r1 = r20
            goto L85
        L80:
            int r14 = r14 + (-1)
            if (r14 >= 0) goto L50
            goto L7d
        L85:
            androidx.compose.ui.node.t.h(r1, r12)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.v.J3(androidx.compose.ui.node.e1$f, long, androidx.compose.ui.node.t, boolean, boolean):void");
    }

    @Override // androidx.compose.ui.node.e1
    protected void J4(@fg.m r0 r0Var) {
        this.lookaheadDelegate = r0Var;
    }

    @Override // androidx.compose.ui.node.q0
    public int K0(@fg.l androidx.compose.ui.layout.a alignmentLine) {
        r0 r0Var = this.lookaheadDelegate;
        if (r0Var != null) {
            return r0Var.K0(alignmentLine);
        }
        Integer num = M0().y().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @fg.l
    /* renamed from: O5, reason: from getter */
    public b2 getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.e1
    @fg.m
    /* renamed from: W2, reason: from getter */
    public r0 getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.p
    public int Z(int width) {
        return getLayoutNode().getIntrinsicsPolicy().h(width);
    }

    @Override // androidx.compose.ui.node.e1
    public q.d g3() {
        return this.tail;
    }

    @Override // androidx.compose.ui.layout.p
    public int k0(int height) {
        return getLayoutNode().getIntrinsicsPolicy().i(height);
    }

    @Override // androidx.compose.ui.layout.p
    public int l0(int height) {
        return getLayoutNode().getIntrinsicsPolicy().d(height);
    }

    @Override // androidx.compose.ui.layout.l0
    @fg.l
    public androidx.compose.ui.layout.i1 m0(long constraints) {
        J0(constraints);
        androidx.compose.runtime.collection.g<h0> H0 = getLayoutNode().H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i4 = 0;
            do {
                L[i4].r0().m2(h0.g.NotUsed);
                i4++;
            } while (i4 < size);
        }
        M4(getLayoutNode().getMeasurePolicy().a(this, getLayoutNode().X(), constraints));
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
        return getLayoutNode().getIntrinsicsPolicy().c(width);
    }

    @Override // androidx.compose.ui.node.e1
    public void x4(@fg.l androidx.compose.ui.graphics.v1 canvas) {
        p1 d5 = l0.d(getLayoutNode());
        androidx.compose.runtime.collection.g<h0> F0 = getLayoutNode().F0();
        int size = F0.getSize();
        if (size > 0) {
            h0[] L = F0.L();
            int i4 = 0;
            do {
                h0 h0Var = L[i4];
                if (h0Var.l()) {
                    h0Var.O(canvas);
                }
                i4++;
            } while (i4 < size);
        }
        if (d5.getShowLayoutBounds()) {
            m2(canvas, Y);
        }
    }
}
