package androidx.compose.ui.node;

import androidx.collection.q2;
import androidx.compose.ui.layout.i1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LookaheadDelegate.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH ¢\u0006\u0004\b\f\u0010\u0004J\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\rH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00122\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u0017\u0010+\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0004\u001a\u0004\b,\u0010\u001fR\u001a\u00102\u001a\u00020/8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00105\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00104R\u0014\u00109\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001fR\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020\u00188 X \u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, d2 = {"Landroidx/compose/ui/node/q0;", "Landroidx/compose/ui/layout/i1;", "Landroidx/compose/ui/node/v0;", "<init>", "()V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "q", "(Landroidx/compose/ui/layout/a;)I", "K0", "Lkotlin/k2;", "h1", "Landroidx/compose/ui/node/e1;", "c1", "(Landroidx/compose/ui/node/e1;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/n0;", "U3", "(IILjava/util/Map;Lld/l;)Landroidx/compose/ui/layout/n0;", "", "h", "Z", "g1", "()Z", "m1", "(Z)V", "isShallowPlacing", "i", "f1", "k1", "isPlacingForAlignment", "j", "Landroidx/compose/ui/layout/i1$a;", "Y0", "()Landroidx/compose/ui/layout/i1$a;", "placementScope", "E1", "e1", "isLookingAhead", "Landroidx/compose/ui/unit/q;", "Z0", "()J", "position", "N0", "()Landroidx/compose/ui/node/q0;", "child", "V0", "parent", "Q0", "hasMeasureResult", "Landroidx/compose/ui/node/h0;", "Z5", "()Landroidx/compose/ui/node/h0;", "layoutNode", "Landroidx/compose/ui/layout/u;", "P0", "()Landroidx/compose/ui/layout/u;", "coordinates", "S0", "()Landroidx/compose/ui/layout/n0;", "measureResult", "Landroidx/compose/ui/node/b;", "M0", "()Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,255:1\n120#2,5:256\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n*L\n97#1:256,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class q0 extends androidx.compose.ui.layout.i1 implements v0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f19458k = 0;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isShallowPlacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacingForAlignment;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i1.a placementScope = androidx.compose.ui.layout.j1.a(this);

    /* compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/compose/ui/node/q0$a", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "p", "()Ljava/util/Map;", "alignmentLines", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.ui.layout.n0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19462a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f19463b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<androidx.compose.ui.layout.a, Integer> f19464c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<i1.a, k2> f19465d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q0 f19466e;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i4, int i5, Map<androidx.compose.ui.layout.a, Integer> map, ld.l<? super i1.a, k2> lVar, q0 q0Var) {
            this.f19462a = i4;
            this.f19463b = i5;
            this.f19464c = map;
            this.f19465d = lVar;
            this.f19466e = q0Var;
        }

        @Override // androidx.compose.ui.layout.n0
        public int getHeight() {
            return this.f19463b;
        }

        @Override // androidx.compose.ui.layout.n0
        public int getWidth() {
            return this.f19462a;
        }

        @Override // androidx.compose.ui.layout.n0
        @fg.l
        public Map<androidx.compose.ui.layout.a, Integer> p() {
            return this.f19464c;
        }

        @Override // androidx.compose.ui.layout.n0
        public void q() {
            this.f19465d.invoke(this.f19466e.getPlacementScope());
        }
    }

    public static /* synthetic */ void e1() {
    }

    @Override // androidx.compose.ui.layout.q
    public boolean E1() {
        return false;
    }

    public abstract int K0(@fg.l androidx.compose.ui.layout.a alignmentLine);

    @fg.l
    public abstract b M0();

    @fg.m
    public abstract q0 N0();

    @fg.l
    public abstract androidx.compose.ui.layout.u P0();

    public abstract boolean Q0();

    @fg.l
    public abstract androidx.compose.ui.layout.n0 S0();

    @Override // androidx.compose.ui.layout.o0
    @fg.l
    public androidx.compose.ui.layout.n0 U3(int width, int height, @fg.l Map<androidx.compose.ui.layout.a, Integer> alignmentLines, @fg.l ld.l<? super i1.a, k2> placementBlock) {
        if ((width & androidx.core.view.x1.f27484y) == 0 && ((-16777216) & height) == 0) {
            return new a(width, height, alignmentLines, placementBlock, this);
        }
        throw new IllegalStateException(q2.a("Size(", width, " x ", height, ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @fg.m
    public abstract q0 V0();

    @fg.l
    /* renamed from: Y0, reason: from getter */
    public final i1.a getPlacementScope() {
        return this.placementScope;
    }

    /* renamed from: Z0 */
    public abstract long getPosition();

    @fg.l
    /* renamed from: Z5 */
    public abstract h0 getLayoutNode();

    protected final void c1(@fg.l e1 e1Var) {
        androidx.compose.ui.node.a p4;
        e1 wrapped = e1Var.getWrapped();
        if (!kotlin.jvm.internal.l0.g(wrapped != null ? wrapped.getLayoutNode() : null, e1Var.getLayoutNode())) {
            e1Var.M0().p().q();
            return;
        }
        b I = e1Var.M0().I();
        if (I == null || (p4 = I.p()) == null) {
            return;
        }
        p4.q();
    }

    /* renamed from: f1, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    /* renamed from: g1, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public abstract void h1();

    public final void k1(boolean z4) {
        this.isPlacingForAlignment = z4;
    }

    public final void m1(boolean z4) {
        this.isShallowPlacing = z4;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int q(@fg.l androidx.compose.ui.layout.a alignmentLine) {
        int K0;
        if (Q0() && (K0 = K0(alignmentLine)) != Integer.MIN_VALUE) {
            return K0 + (alignmentLine instanceof androidx.compose.ui.layout.w1 ? androidx.compose.ui.unit.q.m(getApparentToRealOffset()) : androidx.compose.ui.unit.q.o(getApparentToRealOffset()));
        }
        return Integer.MIN_VALUE;
    }
}
