package androidx.compose.ui.layout;

import androidx.collection.q2;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.i1;
import androidx.compose.ui.q;
import androidx.core.view.x1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: IntermediateLayoutModifierNode.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002DEBJ\u0012A\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0014\u001a\u00020\u000b*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0019\u001a\u00020\u000b*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\"\u0010 J#\u0010#\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b#\u0010 J#\u0010$\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001dH\u0000¢\u0006\u0004\b$\u0010 R]\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u000fR\u0018\u0010-\u001a\u00060*R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010C\u001a\b\u0018\u00010@R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/o;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/r0;", "name", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "measureBlock", "<init>", "(Lld/q;)V", "Lkotlin/k2;", "i7", "()V", "Landroidx/compose/ui/layout/o0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/unit/u;", "lookaheadSize", "lookaheadConstraints", "C7", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;JJJ)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "H7", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "width", "G7", "F7", "E7", "p", "Lld/q;", "B7", "()Lld/q;", "J7", "Landroidx/compose/ui/layout/n$b;", "q", "Landroidx/compose/ui/layout/n$b;", "intermediateMeasureScope", "Landroidx/compose/ui/layout/j0;", "r", "Landroidx/compose/ui/layout/j0;", "localLookaheadScope", "Landroidx/compose/ui/layout/i0;", "s", "Landroidx/compose/ui/layout/i0;", "closestLookaheadScope", "", "t", "Z", "D7", "()Z", "I7", "(Z)V", "isIntermediateChangeActive", "u", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n$a;", "v", "Landroidx/compose/ui/layout/n$a;", "intermediateMeasurable", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nIntermediateLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,317:1\n1#2:318\n1#2:326\n88#3:319\n230#4,5:320\n58#4:325\n59#4,8:327\n385#4,6:335\n395#4,2:342\n397#4,8:347\n405#4,9:358\n414#4,8:370\n68#4,7:378\n261#5:341\n234#6,3:344\n237#6,3:367\n1208#7:355\n1187#7,2:356\n*S KotlinDebug\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n*L\n99#1:326\n99#1:319\n99#1:320,5\n99#1:325\n99#1:327,8\n99#1:335,6\n99#1:342,2\n99#1:347,8\n99#1:358,9\n99#1:370,8\n99#1:378,7\n99#1:341\n99#1:344,3\n99#1:367,3\n99#1:355\n99#1:356,2\n*E\n"})
/* loaded from: classes.dex */
public final class n extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: w, reason: collision with root package name */
    public static final int f19036w = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.q<? super o, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> measureBlock;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b intermediateMeasureScope = new b();

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 localLookaheadScope;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private i0 closestLookaheadScope;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isIntermediateChangeActive;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.b lookaheadConstraints;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private a intermediateMeasurable;

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0002\b\u0011H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u001cR\"\u0010\u0003\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/layout/n$a;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/i1;", "wrappedMeasurable", "<init>", "(Landroidx/compose/ui/layout/n;Landroidx/compose/ui/layout/l0;)V", "Landroidx/compose/ui/unit/b;", "constraints", "m0", "(J)Landroidx/compose/ui/layout/i1;", "Landroidx/compose/ui/unit/q;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "Lkotlin/u;", "layerBlock", "H0", "(JFLld/l;)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "q", "(Landroidx/compose/ui/layout/a;)I", "height", "k0", "(I)I", "l0", "width", "Z", "t", "h", "Landroidx/compose/ui/layout/l0;", "K0", "()Landroidx/compose/ui/layout/l0;", "N0", "(Landroidx/compose/ui/layout/l0;)V", "i", "Landroidx/compose/ui/layout/i1;", "M0", "()Landroidx/compose/ui/layout/i1;", "P0", "(Landroidx/compose/ui/layout/i1;)V", "wrappedPlaceable", "", "a", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a extends i1 implements l0 {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private l0 wrappedMeasurable;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private i1 wrappedPlaceable;

        public a(@fg.l l0 l0Var) {
            this.wrappedMeasurable = l0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.i1
        public void H0(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock) {
            k2 k2Var;
            if (!n.this.getIsIntermediateChangeActive()) {
                androidx.compose.ui.unit.q.INSTANCE.getClass();
                position = androidx.compose.ui.unit.q.f21519c;
            }
            androidx.compose.ui.node.e1 coordinator = n.this.getNode().getCoordinator();
            kotlin.jvm.internal.l0.m(coordinator);
            i1.a placementScope = coordinator.getPlacementScope();
            if (layerBlock != null) {
                i1 i1Var = this.wrappedPlaceable;
                if (i1Var != null) {
                    placementScope.v(i1Var, position, zIndex, layerBlock);
                    k2Var = k2.f75408a;
                } else {
                    k2Var = null;
                }
                if (k2Var != null) {
                    return;
                }
            }
            i1 i1Var2 = this.wrappedPlaceable;
            if (i1Var2 != null) {
                placementScope.h(i1Var2, position, zIndex);
                k2 k2Var2 = k2.f75408a;
            }
        }

        @fg.l
        /* renamed from: K0, reason: from getter */
        public final l0 getWrappedMeasurable() {
            return this.wrappedMeasurable;
        }

        @fg.m
        /* renamed from: M0, reason: from getter */
        public final i1 getWrappedPlaceable() {
            return this.wrappedPlaceable;
        }

        public final void N0(@fg.l l0 l0Var) {
            this.wrappedMeasurable = l0Var;
        }

        public final void P0(@fg.m i1 i1Var) {
            this.wrappedPlaceable = i1Var;
        }

        @Override // androidx.compose.ui.layout.p
        public int Z(int width) {
            return this.wrappedMeasurable.Z(width);
        }

        @Override // androidx.compose.ui.layout.p0, androidx.compose.ui.layout.p
        @fg.m
        /* renamed from: a */
        public Object getParentData() {
            return this.wrappedMeasurable.getParentData();
        }

        @Override // androidx.compose.ui.layout.p
        public int k0(int height) {
            return this.wrappedMeasurable.k0(height);
        }

        @Override // androidx.compose.ui.layout.p
        public int l0(int height) {
            return this.wrappedMeasurable.l0(height);
        }

        @Override // androidx.compose.ui.layout.l0
        @fg.l
        public i1 m0(long constraints) {
            i1 m02;
            if (n.this.getIsIntermediateChangeActive()) {
                m02 = this.wrappedMeasurable.m0(constraints);
                J0(constraints);
                I0(androidx.compose.ui.unit.v.a(m02.getWidth(), m02.getHeight()));
            } else {
                l0 l0Var = this.wrappedMeasurable;
                androidx.compose.ui.unit.b bVar = n.this.lookaheadConstraints;
                kotlin.jvm.internal.l0.m(bVar);
                m02 = l0Var.m0(bVar.getValue());
                n nVar = n.this;
                androidx.compose.ui.unit.b bVar2 = nVar.lookaheadConstraints;
                kotlin.jvm.internal.l0.m(bVar2);
                J0(bVar2.getValue());
                I0(nVar.getIsIntermediateChangeActive() ? androidx.compose.ui.unit.v.a(m02.getWidth(), m02.getHeight()) : nVar.intermediateMeasureScope.getLookaheadSize());
            }
            this.wrappedPlaceable = m02;
            return this;
        }

        @Override // androidx.compose.ui.layout.p0
        public int q(@fg.l androidx.compose.ui.layout.a alignmentLine) {
            i1 i1Var = this.wrappedPlaceable;
            kotlin.jvm.internal.l0.m(i1Var);
            return i1Var.q(alignmentLine);
        }

        @Override // androidx.compose.ui.layout.p
        public int t(int width) {
            return this.wrappedMeasurable.t(width);
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007JL\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u00020\u00168\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u00020\u0005*\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/ui/layout/n$b;", "Landroidx/compose/ui/layout/o;", "Lkotlinx/coroutines/r0;", "<init>", "(Landroidx/compose/ui/layout/n;)V", "Landroidx/compose/ui/layout/u;", "l", "(Landroidx/compose/ui/layout/u;)Landroidx/compose/ui/layout/u;", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/n0;", "U3", "(IILjava/util/Map;Lld/l;)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/unit/u;", "b", "J", "j3", "()J", "v", "(J)V", "lookaheadSize", "p", "(Landroidx/compose/ui/layout/i1$a;)Landroidx/compose/ui/layout/u;", "lookaheadScopeCoordinates", "", "E1", "()Z", "isLookingAhead", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "", "()F", "density", "U", "fontScale", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "coroutineContext", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.ui.k
    @kotlin.jvm.internal.r1({"SMAP\nIntermediateLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,317:1\n1#2:318\n120#3,5:319\n*S KotlinDebug\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl\n*L\n292#1:319,5\n*E\n"})
    private final class b implements o, kotlinx.coroutines.r0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long lookaheadSize;

        /* compiled from: IntermediateLayoutModifierNode.kt */
        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/ui/layout/n$b$a", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "c", "Ljava/util/Map;", "p", "()Ljava/util/Map;", "alignmentLines", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements n0 {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int width;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final int height;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final Map<androidx.compose.ui.layout.a, Integer> alignmentLines;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l<i1.a, k2> f19052d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ n f19053e;

            /* JADX WARN: Multi-variable type inference failed */
            a(int i4, int i5, Map<androidx.compose.ui.layout.a, Integer> map, ld.l<? super i1.a, k2> lVar, n nVar) {
                this.f19052d = lVar;
                this.f19053e = nVar;
                this.width = i4;
                this.height = i5;
                this.alignmentLines = map;
            }

            @Override // androidx.compose.ui.layout.n0
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.n0
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.n0
            @fg.l
            public Map<androidx.compose.ui.layout.a, Integer> p() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.n0
            public void q() {
                ld.l<i1.a, k2> lVar = this.f19052d;
                androidx.compose.ui.node.e1 coordinator = this.f19053e.getCoordinator();
                kotlin.jvm.internal.l0.m(coordinator);
                lVar.invoke(coordinator.getPlacementScope());
            }
        }

        public b() {
            androidx.compose.ui.unit.u.INSTANCE.getClass();
            this.lookaheadSize = androidx.compose.ui.unit.u.f21529c;
        }

        @Override // androidx.compose.ui.layout.q
        public boolean E1() {
            return false;
        }

        @Override // androidx.compose.ui.unit.n
        /* renamed from: U */
        public float getFontScale() {
            androidx.compose.ui.node.e1 coordinator = n.this.getCoordinator();
            kotlin.jvm.internal.l0.m(coordinator);
            return coordinator.getFontScale();
        }

        @Override // androidx.compose.ui.layout.o0
        @fg.l
        public n0 U3(int width, int height, @fg.l Map<androidx.compose.ui.layout.a, Integer> alignmentLines, @fg.l ld.l<? super i1.a, k2> placementBlock) {
            if ((width & x1.f27484y) == 0 && ((-16777216) & height) == 0) {
                return new a(width, height, alignmentLines, placementBlock, n.this);
            }
            throw new IllegalStateException(q2.a("Size(", width, " x ", height, ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: b */
        public float getDensity() {
            androidx.compose.ui.node.e1 coordinator = n.this.getCoordinator();
            kotlin.jvm.internal.l0.m(coordinator);
            return coordinator.getDensity();
        }

        @Override // androidx.compose.ui.layout.q
        @fg.l
        public androidx.compose.ui.unit.w getLayoutDirection() {
            androidx.compose.ui.node.e1 coordinator = n.this.getCoordinator();
            kotlin.jvm.internal.l0.m(coordinator);
            return coordinator.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.o
        /* renamed from: j3, reason: from getter */
        public long getLookaheadSize() {
            return this.lookaheadSize;
        }

        @Override // androidx.compose.ui.layout.i0
        @fg.l
        public u l(@fg.l u uVar) {
            return n.this.closestLookaheadScope.l(uVar);
        }

        @Override // androidx.compose.ui.layout.i0
        @fg.l
        public u p(@fg.l i1.a aVar) {
            return n.this.closestLookaheadScope.p(aVar);
        }

        @Override // kotlinx.coroutines.r0
        @fg.l
        /* renamed from: q */
        public kotlin.coroutines.g getCoroutineContext() {
            return n.this.V6().getCoroutineContext();
        }

        public void v(long j4) {
            this.lookaheadSize = j4;
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/layout/u;", "a", "()Landroidx/compose/ui/layout/u;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<u> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            androidx.compose.ui.node.e1 coordinator = n.this.getCoordinator();
            kotlin.jvm.internal.l0.m(coordinator);
            return coordinator;
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "intrinsicMeasurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class d implements i1.e {
        d() {
        }

        @Override // androidx.compose.ui.node.i1.e
        @fg.l
        public final n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
            return n.this.B7().R(n.this.intermediateMeasureScope, l0Var, androidx.compose.ui.unit.b.b(j4));
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "intrinsicMeasurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class e implements i1.e {
        e() {
        }

        @Override // androidx.compose.ui.node.i1.e
        @fg.l
        public final n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
            return n.this.B7().R(n.this.intermediateMeasureScope, l0Var, androidx.compose.ui.unit.b.b(j4));
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f19057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i1 i1Var) {
            super(1);
            this.f19057b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f19057b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "intrinsicMeasurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class g implements i1.e {
        g() {
        }

        @Override // androidx.compose.ui.node.i1.e
        @fg.l
        public final n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
            return n.this.B7().R(n.this.intermediateMeasureScope, l0Var, androidx.compose.ui.unit.b.b(j4));
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "intrinsicMeasurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class h implements i1.e {
        h() {
        }

        @Override // androidx.compose.ui.node.i1.e
        @fg.l
        public final n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
            return n.this.B7().R(n.this.intermediateMeasureScope, l0Var, androidx.compose.ui.unit.b.b(j4));
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/layout/u;", "a", "()Landroidx/compose/ui/layout/u;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<u> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.h0 f19060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.node.h0 h0Var) {
            super(0);
            this.f19060b = h0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            androidx.compose.ui.node.h0 B0 = this.f19060b.B0();
            kotlin.jvm.internal.l0.m(B0);
            return B0.d0().P0();
        }
    }

    public n(@fg.l ld.q<? super o, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> qVar) {
        this.measureBlock = qVar;
        j0 j0Var = new j0(new c());
        this.localLookaheadScope = j0Var;
        this.closestLookaheadScope = j0Var;
        this.isIntermediateChangeActive = true;
    }

    @fg.l
    public final ld.q<o, l0, androidx.compose.ui.unit.b, n0> B7() {
        return this.measureBlock;
    }

    @fg.l
    public final n0 C7(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4, long j5, long j6) {
        this.intermediateMeasureScope.v(j5);
        this.lookaheadConstraints = androidx.compose.ui.unit.b.b(j6);
        a aVar = this.intermediateMeasurable;
        if (aVar == null) {
            aVar = new a(l0Var);
        }
        this.intermediateMeasurable = aVar;
        aVar.N0(l0Var);
        return this.measureBlock.R(this.intermediateMeasureScope, aVar, androidx.compose.ui.unit.b.b(j4));
    }

    /* renamed from: D7, reason: from getter */
    public final boolean getIsIntermediateChangeActive() {
        return this.isIntermediateChangeActive;
    }

    public final int E7(@fg.l q qVar, @fg.l p pVar, int i4) {
        return androidx.compose.ui.node.i1.f19334a.a(new d(), qVar, pVar, i4);
    }

    public final int F7(@fg.l q qVar, @fg.l p pVar, int i4) {
        return androidx.compose.ui.node.i1.f19334a.b(new e(), qVar, pVar, i4);
    }

    public final int G7(@fg.l q qVar, @fg.l p pVar, int i4) {
        return androidx.compose.ui.node.i1.f19334a.c(new g(), qVar, pVar, i4);
    }

    public final int H7(@fg.l q qVar, @fg.l p pVar, int i4) {
        return androidx.compose.ui.node.i1.f19334a.d(new h(), qVar, pVar, i4);
    }

    public final void I7(boolean z4) {
        this.isIntermediateChangeActive = z4;
    }

    public final void J7(@fg.l ld.q<? super o, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> qVar) {
        this.measureBlock = qVar;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
        i1 m02 = l0Var.m0(j4);
        return o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new f(m02), 4, null);
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        j0 j0Var;
        j0 j0Var2;
        androidx.compose.ui.node.c1 nodes;
        androidx.compose.ui.node.r0 lookaheadDelegate;
        androidx.compose.ui.node.e1 coordinator = getCoordinator();
        if (((coordinator == null || (lookaheadDelegate = coordinator.getLookaheadDelegate()) == null) ? null : lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) {
            throw new IllegalStateException("could not fetch lookahead coordinates");
        }
        androidx.compose.ui.node.h0 lookaheadRoot = androidx.compose.ui.node.k.p(this).getLookaheadRoot();
        if (lookaheadRoot != null && lookaheadRoot.getIsVirtualLookaheadRoot()) {
            j0Var2 = new j0(new i(lookaheadRoot));
        } else {
            if (!getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            q.d parent = getNode().getParent();
            androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(this);
            n nVar = null;
            while (p4 != null) {
                if ((androidx.compose.ui.focus.a.a(p4) & 512) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 512) != 0) {
                            q.d dVar = parent;
                            androidx.compose.runtime.collection.g gVar = null;
                            while (dVar != null) {
                                if (dVar instanceof n) {
                                    nVar = (n) dVar;
                                } else if ((dVar.getKindSet() & 512) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                    int i4 = 0;
                                    for (q.d delegate = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & 512) != 0) {
                                            i4++;
                                            if (i4 == 1) {
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
                                    if (i4 == 1) {
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
            if (nVar == null || (j0Var = nVar.localLookaheadScope) == null) {
                j0Var = this.localLookaheadScope;
            }
            j0Var2 = j0Var;
        }
        this.closestLookaheadScope = j0Var2;
    }
}
