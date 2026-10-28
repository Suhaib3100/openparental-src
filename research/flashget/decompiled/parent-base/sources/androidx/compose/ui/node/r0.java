package androidx.compose.ui.node;

import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.node.m0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LookaheadDelegate.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u0012J)\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010'J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010'J\u001d\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0000H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R(\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u000bR$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R(\u0010G\u001a\u0004\u0018\u00010 2\b\u0010B\u001a\u0004\u0018\u00010 8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bC\u0010D\"\u0004\bE\u0010FR&\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e088\u0004X\u0084\u0004¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\bI\u0010JR\u0016\u0010N\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020 8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010QR\u0014\u0010[\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0016\u0010b\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010MR\u0014\u0010f\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0016\u0010r\u001a\u0004\u0018\u00010o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006s"}, d2 = {"Landroidx/compose/ui/node/r0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/node/q0;", "Landroidx/compose/ui/node/e1;", "coordinator", "<init>", "(Landroidx/compose/ui/node/e1;)V", "Landroidx/compose/ui/unit/q;", "position", "Lkotlin/k2;", "L1", "(J)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "x1", "(Landroidx/compose/ui/layout/a;)I", "h1", "()V", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/u;", "layerBlock", "H0", "(JFLld/l;)V", "M1", "K1", "Landroidx/compose/ui/unit/b;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/n0;", "block", "Landroidx/compose/ui/layout/i1;", "I1", "(JLld/a;)Landroidx/compose/ui/layout/i1;", "height", "k0", "(I)I", "l0", "width", "Z", "t", "ancestor", "P1", "(Landroidx/compose/ui/node/r0;)J", "l", "Landroidx/compose/ui/node/e1;", "A1", "()Landroidx/compose/ui/node/e1;", "m", "J", "Z0", "()J", "V1", "", "n", "Ljava/util/Map;", "oldAlignmentLines", "Landroidx/compose/ui/layout/g0;", "o", "Landroidx/compose/ui/layout/g0;", "F1", "()Landroidx/compose/ui/layout/g0;", "lookaheadLayoutCoordinates", "result", "p", "Landroidx/compose/ui/layout/n0;", "W1", "(Landroidx/compose/ui/layout/n0;)V", "_measureResult", "q", "y1", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "N0", "()Landroidx/compose/ui/node/q0;", "child", "", "Q0", "()Z", "hasMeasureResult", "S0", "()Landroidx/compose/ui/layout/n0;", "measureResult", "E1", "isLookingAhead", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "b", "()F", "density", "U", "fontScale", "V0", "parent", "Landroidx/compose/ui/node/h0;", "Z5", "()Landroidx/compose/ui/node/h0;", "layoutNode", "Landroidx/compose/ui/layout/u;", "P0", "()Landroidx/compose/ui/layout/u;", "coordinates", "Landroidx/compose/ui/node/b;", "M0", "()Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "", "a", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,255:1\n1#2:256\n86#3:257\n86#3:258\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n210#1:257\n249#1:258\n*E\n"})
/* loaded from: classes.dex */
public abstract class r0 extends q0 implements androidx.compose.ui.layout.l0 {

    /* renamed from: r, reason: collision with root package name */
    public static final int f19467r = 0;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e1 coordinator;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long position;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Map<androidx.compose.ui.layout.a, Integer> oldAlignmentLines;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.layout.g0 lookaheadLayoutCoordinates;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.n0 _measureResult;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<androidx.compose.ui.layout.a, Integer> cachedAlignmentLinesMap;

    public r0(@fg.l e1 e1Var) {
        this.coordinator = e1Var;
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        this.position = androidx.compose.ui.unit.q.f21519c;
        this.lookaheadLayoutCoordinates = new androidx.compose.ui.layout.g0(this);
        this.cachedAlignmentLinesMap = new LinkedHashMap();
    }

    private final void L1(long position) {
        if (androidx.compose.ui.unit.q.j(getPosition(), position)) {
            return;
        }
        V1(position);
        m0.a lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.F1();
        }
        c1(this.coordinator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(androidx.compose.ui.layout.n0 n0Var) {
        k2 k2Var;
        Map<androidx.compose.ui.layout.a, Integer> map;
        if (n0Var != null) {
            I0(androidx.compose.ui.unit.v.a(n0Var.getWidth(), n0Var.getHeight()));
            k2Var = k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            androidx.compose.ui.unit.u.INSTANCE.getClass();
            I0(androidx.compose.ui.unit.u.f21529c);
        }
        if (!kotlin.jvm.internal.l0.g(this._measureResult, n0Var) && n0Var != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !n0Var.p().isEmpty()) && !kotlin.jvm.internal.l0.g(n0Var.p(), this.oldAlignmentLines))) {
            M0().getAlignmentLines().q();
            Map map2 = this.oldAlignmentLines;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.oldAlignmentLines = map2;
            }
            map2.clear();
            map2.putAll(n0Var.p());
        }
        this._measureResult = n0Var;
    }

    @fg.l
    /* renamed from: A1, reason: from getter */
    public final e1 getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.node.q0, androidx.compose.ui.layout.q
    public boolean E1() {
        return true;
    }

    @fg.l
    /* renamed from: F1, reason: from getter */
    public final androidx.compose.ui.layout.g0 getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i1
    public final void H0(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock) {
        L1(position);
        if (getIsShallowPlacing()) {
            return;
        }
        K1();
    }

    @fg.l
    public final androidx.compose.ui.layout.i1 I1(long constraints, @fg.l ld.a<? extends androidx.compose.ui.layout.n0> block) {
        J0(constraints);
        W1(block.invoke());
        return this;
    }

    protected void K1() {
        S0().q();
    }

    @Override // androidx.compose.ui.node.q0
    @fg.l
    public b M0() {
        b B = this.coordinator.getLayoutNode().getLayoutDelegate().B();
        kotlin.jvm.internal.l0.m(B);
        return B;
    }

    public final void M1(long position) {
        long apparentToRealOffset = getApparentToRealOffset();
        L1(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(position) + ((int) (apparentToRealOffset >> 32)), ((int) (position & 4294967295L)) + ((int) (apparentToRealOffset & 4294967295L))));
    }

    @Override // androidx.compose.ui.node.q0
    @fg.m
    public q0 N0() {
        e1 wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.q0
    @fg.l
    public androidx.compose.ui.layout.u P0() {
        return this.lookaheadLayoutCoordinates;
    }

    public final long P1(@fg.l r0 ancestor) {
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        long j4 = androidx.compose.ui.unit.q.f21519c;
        r0 r0Var = this;
        while (!kotlin.jvm.internal.l0.g(r0Var, ancestor)) {
            long position = r0Var.getPosition();
            j4 = androidx.compose.ui.unit.r.a(((int) (j4 >> 32)) + ((int) (position >> 32)), ((int) (j4 & 4294967295L)) + ((int) (position & 4294967295L)));
            e1 wrappedBy = r0Var.coordinator.getWrappedBy();
            kotlin.jvm.internal.l0.m(wrappedBy);
            r0Var = wrappedBy.getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(r0Var);
        }
        return j4;
    }

    @Override // androidx.compose.ui.node.q0
    public boolean Q0() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.node.q0
    @fg.l
    public androidx.compose.ui.layout.n0 S0() {
        androidx.compose.ui.layout.n0 n0Var = this._measureResult;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.q0
    @fg.m
    public q0 V0() {
        e1 wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    public void V1(long j4) {
        this.position = j4;
    }

    public int Z(int width) {
        e1 wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.l0.m(wrapped);
        r0 lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.l0.m(lookaheadDelegate);
        return lookaheadDelegate.Z(width);
    }

    @Override // androidx.compose.ui.node.q0
    /* renamed from: Z0, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.node.q0, androidx.compose.ui.node.v0
    @fg.l
    /* renamed from: Z5 */
    public h0 getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @Override // androidx.compose.ui.layout.p0, androidx.compose.ui.layout.p
    @fg.m
    /* renamed from: a */
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.layout.q
    @fg.l
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.q0
    public void h1() {
        H0(getPosition(), 0.0f, null);
    }

    public int k0(int height) {
        e1 wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.l0.m(wrapped);
        r0 lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.l0.m(lookaheadDelegate);
        return lookaheadDelegate.k0(height);
    }

    public int l0(int height) {
        e1 wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.l0.m(wrapped);
        r0 lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.l0.m(lookaheadDelegate);
        return lookaheadDelegate.l0(height);
    }

    public int t(int width) {
        e1 wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.l0.m(wrapped);
        r0 lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.l0.m(lookaheadDelegate);
        return lookaheadDelegate.t(width);
    }

    public final int x1(@fg.l androidx.compose.ui.layout.a alignmentLine) {
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @fg.l
    protected final Map<androidx.compose.ui.layout.a, Integer> y1() {
        return this.cachedAlignmentLinesMap;
    }
}
