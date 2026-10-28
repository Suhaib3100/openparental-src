package androidx.compose.ui.layout;

import i0.f;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: LookaheadLayoutCoordinates.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001a\u0010%\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020*8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b+\u0010$R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u0014\u00108\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/ui/layout/g0;", "Landroidx/compose/ui/layout/u;", "Landroidx/compose/ui/node/r0;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/r0;)V", "Li0/f;", "relativeToWindow", "P", "(J)J", "relativeToLocal", "e0", "r0", "sourceCoordinates", "relativeToSource", "E", "(Landroidx/compose/ui/layout/u;J)J", "", "clipBounds", "Li0/i;", "j0", "(Landroidx/compose/ui/layout/u;Z)Li0/i;", "Landroidx/compose/ui/graphics/y4;", "matrix", "Lkotlin/k2;", "T", "(Landroidx/compose/ui/layout/u;[F)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "q", "(Landroidx/compose/ui/layout/a;)I", "b", "Landroidx/compose/ui/node/r0;", "()Landroidx/compose/ui/node/r0;", "d", "()J", "lookaheadOffset", "Landroidx/compose/ui/node/e1;", "a", "()Landroidx/compose/ui/node/e1;", "coordinator", "Landroidx/compose/ui/unit/u;", "c", "size", "", "p0", "()Ljava/util/Set;", "providedAlignmentLines", "n0", "()Landroidx/compose/ui/layout/u;", "parentLayoutCoordinates", "G", "parentCoordinates", "f", "()Z", "isAttached", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,134:1\n1#2:135\n179#3:136\n157#3:139\n179#3:141\n157#3:144\n86#4:137\n79#4:138\n86#4:140\n86#4:142\n79#4:143\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n*L\n83#1:136\n84#1:139\n89#1:141\n95#1:144\n83#1:137\n83#1:138\n88#1:140\n91#1:142\n88#1:143\n*E\n"})
/* loaded from: classes.dex */
public final class g0 implements u {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19001c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.r0 lookaheadDelegate;

    public g0(@fg.l androidx.compose.ui.node.r0 r0Var) {
        this.lookaheadDelegate = r0Var;
    }

    private final long d() {
        androidx.compose.ui.node.r0 a5 = h0.a(this.lookaheadDelegate);
        u P0 = a5.P0();
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        long E = E(P0, i0.f.f74147c);
        androidx.compose.ui.node.e1 coordinator = this.lookaheadDelegate.getCoordinator();
        androidx.compose.ui.node.e1 coordinator2 = a5.getCoordinator();
        companion.getClass();
        return i0.f.u(E, coordinator.E(coordinator2, i0.f.f74147c));
    }

    @Override // androidx.compose.ui.layout.u
    public long E(@fg.l u sourceCoordinates, long relativeToSource) {
        if (!(sourceCoordinates instanceof g0)) {
            androidx.compose.ui.node.r0 a5 = h0.a(this.lookaheadDelegate);
            long E = E(a5.getLookaheadLayoutCoordinates(), relativeToSource);
            u P0 = a5.getCoordinator().P0();
            i0.f.INSTANCE.getClass();
            return i0.f.v(E, P0.E(sourceCoordinates, i0.f.f74147c));
        }
        androidx.compose.ui.node.r0 r0Var = ((g0) sourceCoordinates).lookaheadDelegate;
        r0Var.getCoordinator().c4();
        androidx.compose.ui.node.r0 lookaheadDelegate = this.lookaheadDelegate.getCoordinator().v2(r0Var.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            long P1 = r0Var.P1(lookaheadDelegate);
            long a6 = androidx.compose.ui.unit.r.a(kotlin.math.b.L0(i0.f.p(relativeToSource)), kotlin.math.b.L0(i0.f.r(relativeToSource)));
            long a7 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(P1) + ((int) (a6 >> 32)), ((int) (P1 & 4294967295L)) + ((int) (a6 & 4294967295L)));
            long P12 = this.lookaheadDelegate.P1(lookaheadDelegate);
            long a8 = androidx.compose.ui.unit.r.a(((int) (a7 >> 32)) - ((int) (P12 >> 32)), ((int) (a7 & 4294967295L)) - ((int) (P12 & 4294967295L)));
            return i0.g.a((int) (a8 >> 32), (int) (a8 & 4294967295L));
        }
        androidx.compose.ui.node.r0 a10 = h0.a(r0Var);
        long P13 = r0Var.P1(a10);
        long position = a10.getPosition();
        long a11 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(P13) + ((int) (position >> 32)), ((int) (P13 & 4294967295L)) + ((int) (position & 4294967295L)));
        long a12 = androidx.compose.ui.unit.r.a(kotlin.math.b.L0(i0.f.p(relativeToSource)), kotlin.math.b.L0(i0.f.r(relativeToSource)));
        long a13 = androidx.compose.ui.unit.r.a(((int) (a11 >> 32)) + ((int) (a12 >> 32)), ((int) (a11 & 4294967295L)) + ((int) (a12 & 4294967295L)));
        androidx.compose.ui.node.r0 r0Var2 = this.lookaheadDelegate;
        long P14 = r0Var2.P1(h0.a(r0Var2));
        long position2 = h0.a(r0Var2).getPosition();
        long a14 = androidx.compose.ui.unit.r.a(((int) (P14 >> 32)) + ((int) (position2 >> 32)), ((int) (P14 & 4294967295L)) + ((int) (position2 & 4294967295L)));
        long a15 = androidx.compose.ui.unit.r.a(((int) (a13 >> 32)) - ((int) (a14 >> 32)), ((int) (a13 & 4294967295L)) - ((int) (a14 & 4294967295L)));
        androidx.compose.ui.node.e1 wrappedBy = h0.a(this.lookaheadDelegate).getCoordinator().getWrappedBy();
        kotlin.jvm.internal.l0.m(wrappedBy);
        androidx.compose.ui.node.e1 wrappedBy2 = a10.getCoordinator().getWrappedBy();
        kotlin.jvm.internal.l0.m(wrappedBy2);
        return wrappedBy.E(wrappedBy2, i0.g.a((int) (a15 >> 32), (int) (a15 & 4294967295L)));
    }

    @Override // androidx.compose.ui.layout.u
    @fg.m
    public u G() {
        androidx.compose.ui.node.r0 lookaheadDelegate;
        if (!f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        androidx.compose.ui.node.e1 wrappedBy = this.lookaheadDelegate.getCoordinator().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.P0();
    }

    @Override // androidx.compose.ui.layout.u
    public long P(long relativeToWindow) {
        return i0.f.v(this.lookaheadDelegate.getCoordinator().P(relativeToWindow), d());
    }

    @Override // androidx.compose.ui.layout.u
    public void T(@fg.l u sourceCoordinates, @fg.l float[] matrix) {
        this.lookaheadDelegate.getCoordinator().T(sourceCoordinates, matrix);
    }

    @fg.l
    public final androidx.compose.ui.node.e1 a() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.node.r0 getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.u
    public long c() {
        androidx.compose.ui.node.r0 r0Var = this.lookaheadDelegate;
        return androidx.compose.ui.unit.v.a(r0Var.getWidth(), r0Var.getHeight());
    }

    @Override // androidx.compose.ui.layout.u
    public long e0(long relativeToLocal) {
        return this.lookaheadDelegate.getCoordinator().e0(i0.f.v(relativeToLocal, d()));
    }

    @Override // androidx.compose.ui.layout.u
    public boolean f() {
        return this.lookaheadDelegate.getCoordinator().f();
    }

    @Override // androidx.compose.ui.layout.u
    @fg.l
    public i0.i j0(@fg.l u sourceCoordinates, boolean clipBounds) {
        return this.lookaheadDelegate.getCoordinator().j0(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.ui.layout.u
    @fg.m
    public u n0() {
        androidx.compose.ui.node.r0 lookaheadDelegate;
        if (!f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        androidx.compose.ui.node.e1 wrappedBy = this.lookaheadDelegate.getCoordinator().getLayoutNode().z0().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.P0();
    }

    @Override // androidx.compose.ui.layout.u
    @fg.l
    public Set<a> p0() {
        return this.lookaheadDelegate.getCoordinator().p0();
    }

    @Override // androidx.compose.ui.layout.u
    public int q(@fg.l a alignmentLine) {
        return this.lookaheadDelegate.q(alignmentLine);
    }

    @Override // androidx.compose.ui.layout.u
    public long r0(long relativeToLocal) {
        return this.lookaheadDelegate.getCoordinator().r0(i0.f.v(relativeToLocal, d()));
    }
}
