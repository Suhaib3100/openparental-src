package androidx.compose.ui.node;

import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.p1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.k2;

/* compiled from: MeasureAndLayoutDelegate.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001e\u0010\u0011\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010\u001fJ\u001f\u0010$\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\t¢\u0006\u0004\b$\u0010\u001fJ\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\t¢\u0006\u0004\b%\u0010\u001fJ\u001f\u0010&\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\t¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010'\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u0005J\u001f\u0010)\u001a\u00020\t2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010\u0014J \u0010,\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b2\u0010\u001aJ\u0017\u00104\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b6\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020.0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR$\u0010I\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010CR\u001e\u0010M\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010LR\u0016\u0010Q\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010T\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0018\u0010U\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010SR\u0018\u0010W\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010SR\u0018\u0010Y\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010SR\u0011\u0010\\\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010^\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b]\u0010[\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Landroidx/compose/ui/node/t0;", "", "Landroidx/compose/ui/node/h0;", "root", "<init>", "(Landroidx/compose/ui/node/h0;)V", "layoutNode", "Landroidx/compose/ui/unit/b;", "constraints", "", "e", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/unit/b;)Z", "f", "Lkotlin/k2;", "A", "Lkotlin/Function0;", "block", "w", "(Lld/a;)V", "b", "()V", "affectsLookahead", "relayoutNeeded", "y", "(Landroidx/compose/ui/node/h0;ZZ)Z", "B", "(Landroidx/compose/ui/node/h0;Z)V", "node", "v", "h", "t", "(Landroidx/compose/ui/node/h0;Z)Z", "L", "(J)V", "forced", "E", "J", "C", "H", "G", "onLayout", "p", "(Lld/a;)Z", "s", "r", "(Landroidx/compose/ui/node/h0;J)V", "Landroidx/compose/ui/node/p1$b;", "listener", "x", "(Landroidx/compose/ui/node/p1$b;)V", "g", "forceDispatch", "c", "(Z)V", "u", "a", "Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/n;", "relayoutNodes", "Z", "duringMeasureLayout", "Landroidx/compose/ui/node/n1;", "d", "Landroidx/compose/ui/node/n1;", "onPositionedDispatcher", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/runtime/collection/g;", "onLayoutCompletedListeners", "", "<set-?>", "o", "()J", "measureIteration", "Landroidx/compose/ui/node/t0$a;", "postponedMeasureRequests", "Landroidx/compose/ui/unit/b;", "rootConstraints", "Landroidx/compose/ui/node/o0;", "i", "Landroidx/compose/ui/node/o0;", "consistencyChecker", "m", "(Landroidx/compose/ui/node/h0;)Z", "measureAffectsParent", "canAffectParent", "j", "canAffectParentInLookahead", "n", "measureAffectsParentLookahead", "k", "()Z", "hasPendingMeasureOrLayout", "l", "hasPendingOnPositionedCallbacks", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 5 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,683:1\n454#1:691\n455#1,7:693\n463#1,5:707\n454#1:712\n455#1,13:714\n454#1:739\n455#1,13:741\n1208#2:684\n1187#2,2:685\n1208#2:687\n1187#2,2:688\n1#3:690\n1#3:692\n1#3:713\n1#3:740\n171#4,2:700\n173#4,4:703\n96#5:702\n197#6:727\n197#6:778\n460#7,11:728\n728#7,2:754\n460#7,11:756\n460#7,11:767\n460#7,11:779\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n374#1:691\n374#1:693,7\n374#1:707,5\n395#1:712\n395#1:714,13\n434#1:739\n434#1:741,13\n68#1:684\n68#1:685,2\n89#1:687\n89#1:688,2\n374#1:692\n395#1:713\n434#1:740\n376#1:700,2\n376#1:703,4\n376#1:702\n413#1:727\n603#1:778\n413#1:728,11\n470#1:754,2\n474#1:756,11\n538#1:767,11\n603#1:779,11\n*E\n"})
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f19505j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n relayoutNodes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean duringMeasureLayout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n1 onPositionedDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<p1.b> onLayoutCompletedListeners;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long measureIteration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<a> postponedMeasureRequests;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.b rootConstraints;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final o0 consistencyChecker;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/t0$a;", "", "Landroidx/compose/ui/node/h0;", "node", "", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/h0;ZZ)V", "a", "Landroidx/compose/ui/node/h0;", "()Landroidx/compose/ui/node/h0;", "b", "Z", "c", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final int f19515d = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final h0 node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isLookahead;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isForced;

        public a(@fg.l h0 h0Var, boolean z4, boolean z5) {
            this.node = h0Var;
            this.isLookahead = z4;
            this.isForced = z5;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final h0 getNode() {
            return this.node;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19519a;

        static {
            int[] iArr = new int[h0.e.values().length];
            try {
                iArr[h0.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h0.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19519a = iArr;
        }
    }

    public t0(@fg.l h0 h0Var) {
        this.root = h0Var;
        p1.Companion companion = p1.INSTANCE;
        n nVar = new n(companion.a());
        this.relayoutNodes = nVar;
        this.onPositionedDispatcher = new n1();
        this.onLayoutCompletedListeners = new androidx.compose.runtime.collection.g<>(new p1.b[16], 0);
        this.measureIteration = 1L;
        androidx.compose.runtime.collection.g<a> gVar = new androidx.compose.runtime.collection.g<>(new a[16], 0);
        this.postponedMeasureRequests = gVar;
        this.consistencyChecker = companion.a() ? new o0(h0Var, nVar, gVar.l()) : null;
    }

    private final void A(h0 layoutNode) {
        androidx.compose.runtime.collection.g<h0> H0 = layoutNode.H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i4 = 0;
            do {
                h0 h0Var = L[i4];
                if (m(h0Var)) {
                    if (n0.a(h0Var)) {
                        B(h0Var, true);
                    } else {
                        A(h0Var);
                    }
                }
                i4++;
            } while (i4 < size);
        }
    }

    private final void B(h0 layoutNode, boolean affectsLookahead) {
        androidx.compose.ui.unit.b bVar;
        if (layoutNode == this.root) {
            bVar = this.rootConstraints;
            kotlin.jvm.internal.l0.m(bVar);
        } else {
            bVar = null;
        }
        if (affectsLookahead) {
            e(layoutNode, bVar);
        } else {
            f(layoutNode, bVar);
        }
    }

    public static /* synthetic */ boolean D(t0 t0Var, h0 h0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return t0Var.C(h0Var, z4);
    }

    public static /* synthetic */ boolean F(t0 t0Var, h0 h0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return t0Var.E(h0Var, z4);
    }

    public static /* synthetic */ boolean I(t0 t0Var, h0 h0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return t0Var.H(h0Var, z4);
    }

    public static /* synthetic */ boolean K(t0 t0Var, h0 h0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return t0Var.J(h0Var, z4);
    }

    private final void b() {
        androidx.compose.runtime.collection.g<p1.b> gVar = this.onLayoutCompletedListeners;
        int size = gVar.getSize();
        if (size > 0) {
            p1.b[] L = gVar.L();
            int i4 = 0;
            do {
                L[i4].s();
                i4++;
            } while (i4 < size);
        }
        this.onLayoutCompletedListeners.m();
    }

    public static /* synthetic */ void d(t0 t0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        t0Var.c(z4);
    }

    private final boolean e(h0 layoutNode, androidx.compose.ui.unit.b constraints) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        boolean b12 = constraints != null ? layoutNode.b1(constraints) : h0.c1(layoutNode, null, 1, null);
        h0 B0 = layoutNode.B0();
        if (b12 && B0 != null) {
            if (B0.getLookaheadRoot() == null) {
                K(this, B0, false, 2, null);
            } else if (layoutNode.u0() == h0.g.InMeasureBlock) {
                F(this, B0, false, 2, null);
            } else if (layoutNode.u0() == h0.g.InLayoutBlock) {
                D(this, B0, false, 2, null);
            }
        }
        return b12;
    }

    private final boolean f(h0 layoutNode, androidx.compose.ui.unit.b constraints) {
        boolean o12 = constraints != null ? layoutNode.o1(constraints) : h0.p1(layoutNode, null, 1, null);
        h0 B0 = layoutNode.B0();
        if (o12 && B0 != null) {
            if (layoutNode.t0() == h0.g.InMeasureBlock) {
                K(this, B0, false, 2, null);
            } else if (layoutNode.t0() == h0.g.InLayoutBlock) {
                I(this, B0, false, 2, null);
            }
        }
        return o12;
    }

    private final void h(h0 layoutNode, boolean affectsLookahead) {
        androidx.compose.runtime.collection.g<h0> H0 = layoutNode.H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i4 = 0;
            do {
                h0 h0Var = L[i4];
                if ((!affectsLookahead && m(h0Var)) || (affectsLookahead && n(h0Var))) {
                    if (n0.a(h0Var) && !affectsLookahead) {
                        if (h0Var.n0() && this.relayoutNodes.e(h0Var, true)) {
                            y(h0Var, true, false);
                        } else {
                            g(h0Var, true);
                        }
                    }
                    v(h0Var, affectsLookahead);
                    if (!t(h0Var, affectsLookahead)) {
                        h(h0Var, affectsLookahead);
                    }
                }
                i4++;
            } while (i4 < size);
        }
        v(layoutNode, affectsLookahead);
    }

    private final boolean i(h0 h0Var) {
        return h0Var.s0() && m(h0Var);
    }

    private final boolean j(h0 h0Var) {
        return h0Var.n0() && n(h0Var);
    }

    private final boolean m(h0 h0Var) {
        return h0Var.t0() == h0.g.InMeasureBlock || h0Var.getLayoutDelegate().r().getAlignmentLines().l();
    }

    private final boolean n(h0 h0Var) {
        androidx.compose.ui.node.a alignmentLines;
        if (h0Var.u0() == h0.g.InMeasureBlock) {
            return true;
        }
        androidx.compose.ui.node.b B = h0Var.getLayoutDelegate().B();
        return (B == null || (alignmentLines = B.getAlignmentLines()) == null || !alignmentLines.l()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean q(t0 t0Var, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        return t0Var.p(aVar);
    }

    private final boolean t(h0 h0Var, boolean z4) {
        return z4 ? h0Var.n0() : h0Var.s0();
    }

    private final void v(h0 node, boolean affectsLookahead) {
        if (t(node, affectsLookahead) && this.relayoutNodes.e(node, affectsLookahead)) {
            y(node, affectsLookahead, false);
        }
    }

    private final void w(ld.a<k2> block) {
        if (!this.root.f()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.l()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                block.invoke();
                this.duringMeasureLayout = false;
                o0 o0Var = this.consistencyChecker;
                if (o0Var != null) {
                    o0Var.a();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
    }

    private final boolean y(h0 layoutNode, boolean affectsLookahead, boolean relayoutNeeded) {
        androidx.compose.ui.unit.b bVar;
        boolean e4;
        boolean f4;
        h0 B0;
        int i4 = 0;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (!layoutNode.l() && !layoutNode.Y0() && !i(layoutNode) && !kotlin.jvm.internal.l0.g(layoutNode.Z0(), Boolean.TRUE) && !j(layoutNode) && !layoutNode.T()) {
            return false;
        }
        if (layoutNode.n0() || layoutNode.s0()) {
            if (layoutNode == this.root) {
                bVar = this.rootConstraints;
                kotlin.jvm.internal.l0.m(bVar);
            } else {
                bVar = null;
            }
            e4 = (layoutNode.n0() && affectsLookahead) ? e(layoutNode, bVar) : false;
            f4 = f(layoutNode, bVar);
        } else {
            f4 = false;
            e4 = false;
        }
        if (relayoutNeeded) {
            if ((e4 || layoutNode.m0()) && kotlin.jvm.internal.l0.g(layoutNode.Z0(), Boolean.TRUE) && affectsLookahead) {
                layoutNode.d1();
            }
            if (layoutNode.k0() && (layoutNode == this.root || ((B0 = layoutNode.B0()) != null && B0.l() && layoutNode.Y0()))) {
                if (layoutNode == this.root) {
                    layoutNode.m1(0, 0);
                } else {
                    layoutNode.s1();
                }
                this.onPositionedDispatcher.d(layoutNode);
                o0 o0Var = this.consistencyChecker;
                if (o0Var != null) {
                    o0Var.a();
                }
            }
        }
        if (this.postponedMeasureRequests.V()) {
            androidx.compose.runtime.collection.g<a> gVar = this.postponedMeasureRequests;
            int size = gVar.getSize();
            if (size > 0) {
                a[] L = gVar.L();
                do {
                    a aVar = L[i4];
                    if (aVar.getNode().f()) {
                        if (aVar.getIsLookahead()) {
                            E(aVar.getNode(), aVar.getIsForced());
                        } else {
                            J(aVar.getNode(), aVar.getIsForced());
                        }
                    }
                    i4++;
                } while (i4 < size);
            }
            this.postponedMeasureRequests.m();
        }
        return f4;
    }

    static /* synthetic */ boolean z(t0 t0Var, h0 h0Var, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        if ((i4 & 4) != 0) {
            z5 = true;
        }
        return t0Var.y(h0Var, z4, z5);
    }

    public final boolean C(@fg.l h0 layoutNode, boolean forced) {
        int i4 = b.f19519a[layoutNode.l0().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4 && i4 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.n0() || layoutNode.m0()) && !forced) {
                o0 o0Var = this.consistencyChecker;
                if (o0Var == null) {
                    return false;
                }
                o0Var.a();
                return false;
            }
            layoutNode.f1();
            layoutNode.e1();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            h0 B0 = layoutNode.B0();
            if (kotlin.jvm.internal.l0.g(layoutNode.Z0(), Boolean.TRUE) && ((B0 == null || !B0.n0()) && (B0 == null || !B0.m0()))) {
                this.relayoutNodes.c(layoutNode, true);
            } else if (layoutNode.l() && ((B0 == null || !B0.k0()) && (B0 == null || !B0.s0()))) {
                this.relayoutNodes.c(layoutNode, false);
            }
            return !this.duringMeasureLayout;
        }
        o0 o0Var2 = this.consistencyChecker;
        if (o0Var2 == null) {
            return false;
        }
        o0Var2.a();
        return false;
    }

    public final boolean E(@fg.l h0 layoutNode, boolean forced) {
        h0 B0;
        h0 B02;
        if (layoutNode.getLookaheadRoot() == null) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i4 = b.f19519a[layoutNode.l0().ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 == 2 || i4 == 3 || i4 == 4) {
            this.postponedMeasureRequests.b(new a(layoutNode, true, forced));
            o0 o0Var = this.consistencyChecker;
            if (o0Var == null) {
                return false;
            }
            o0Var.a();
            return false;
        }
        if (i4 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (layoutNode.n0() && !forced) {
            return false;
        }
        layoutNode.g1();
        layoutNode.h1();
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if ((kotlin.jvm.internal.l0.g(layoutNode.Z0(), Boolean.TRUE) || j(layoutNode)) && ((B0 = layoutNode.B0()) == null || !B0.n0())) {
            this.relayoutNodes.c(layoutNode, true);
        } else if ((layoutNode.l() || i(layoutNode)) && ((B02 = layoutNode.B0()) == null || !B02.s0())) {
            this.relayoutNodes.c(layoutNode, false);
        }
        return !this.duringMeasureLayout;
    }

    public final void G(@fg.l h0 layoutNode) {
        this.onPositionedDispatcher.d(layoutNode);
    }

    public final boolean H(@fg.l h0 layoutNode, boolean forced) {
        h0 B0;
        int i4 = b.f19519a[layoutNode.l0().ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
            o0 o0Var = this.consistencyChecker;
            if (o0Var != null) {
                o0Var.a();
            }
        } else {
            if (i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (!forced && layoutNode.l() == layoutNode.Y0() && (layoutNode.s0() || layoutNode.k0())) {
                o0 o0Var2 = this.consistencyChecker;
                if (o0Var2 != null) {
                    o0Var2.a();
                }
            } else {
                layoutNode.e1();
                if (!layoutNode.getIsDeactivated()) {
                    if (layoutNode.Y0() && (((B0 = layoutNode.B0()) == null || !B0.k0()) && (B0 == null || !B0.s0()))) {
                        this.relayoutNodes.c(layoutNode, false);
                    }
                    if (!this.duringMeasureLayout) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean J(@fg.l h0 layoutNode, boolean forced) {
        h0 B0;
        int i4 = b.f19519a[layoutNode.l0().ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3 || i4 == 4) {
                this.postponedMeasureRequests.b(new a(layoutNode, false, forced));
                o0 o0Var = this.consistencyChecker;
                if (o0Var != null) {
                    o0Var.a();
                }
            } else {
                if (i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.s0() || forced) {
                    layoutNode.h1();
                    if (!layoutNode.getIsDeactivated()) {
                        if ((layoutNode.l() || i(layoutNode)) && ((B0 = layoutNode.B0()) == null || !B0.s0())) {
                            this.relayoutNodes.c(layoutNode, false);
                        }
                        if (!this.duringMeasureLayout) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void L(long constraints) {
        androidx.compose.ui.unit.b bVar = this.rootConstraints;
        if (bVar == null ? false : androidx.compose.ui.unit.b.g(bVar.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.rootConstraints = androidx.compose.ui.unit.b.b(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.g1();
        }
        this.root.h1();
        n nVar = this.relayoutNodes;
        h0 h0Var = this.root;
        nVar.c(h0Var, h0Var.getLookaheadRoot() != null);
    }

    public final void c(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.e(this.root);
        }
        this.onPositionedDispatcher.a();
    }

    public final void g(@fg.l h0 layoutNode, boolean affectsLookahead) {
        if (this.relayoutNodes.g(affectsLookahead)) {
            return;
        }
        if (!this.duringMeasureLayout) {
            throw new IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (t(layoutNode, affectsLookahead)) {
            throw new IllegalArgumentException("node not yet measured");
        }
        h(layoutNode, affectsLookahead);
    }

    public final boolean k() {
        return this.relayoutNodes.h();
    }

    public final boolean l() {
        return this.onPositionedDispatcher.c();
    }

    public final long o() {
        if (this.duringMeasureLayout) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    }

    public final boolean p(@fg.m ld.a<k2> onLayout) {
        boolean z4;
        m mVar;
        if (!this.root.f()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.l()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z5 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                if (this.relayoutNodes.h()) {
                    n nVar = this.relayoutNodes;
                    z4 = false;
                    while (nVar.h()) {
                        mVar = nVar.lookaheadSet;
                        boolean d5 = mVar.d();
                        boolean z6 = !d5;
                        h0 f4 = (!d5 ? nVar.lookaheadSet : nVar.set).f();
                        boolean z7 = z(this, f4, z6, false, 4, null);
                        if (f4 == this.root && z7) {
                            z4 = true;
                        }
                    }
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    z4 = false;
                }
                this.duringMeasureLayout = false;
                o0 o0Var = this.consistencyChecker;
                if (o0Var != null) {
                    o0Var.a();
                }
                z5 = z4;
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
        b();
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(@fg.l androidx.compose.ui.node.h0 r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3.getIsDeactivated()
            if (r0 == 0) goto L7
            return
        L7:
            androidx.compose.ui.node.h0 r0 = r2.root
            boolean r0 = kotlin.jvm.internal.l0.g(r3, r0)
            if (r0 != 0) goto L96
            androidx.compose.ui.node.h0 r0 = r2.root
            boolean r0 = r0.f()
            if (r0 == 0) goto L8e
            androidx.compose.ui.node.h0 r0 = r2.root
            boolean r0 = r0.l()
            if (r0 == 0) goto L86
            boolean r0 = r2.duringMeasureLayout
            if (r0 != 0) goto L7e
            androidx.compose.ui.unit.b r0 = r2.rootConstraints
            if (r0 == 0) goto L7a
            r0 = 1
            r2.duringMeasureLayout = r0
            r0 = 0
            androidx.compose.ui.node.n r1 = r2.relayoutNodes     // Catch: java.lang.Throwable -> L48
            r1.k(r3)     // Catch: java.lang.Throwable -> L48
            androidx.compose.ui.unit.b r1 = androidx.compose.ui.unit.b.b(r4)     // Catch: java.lang.Throwable -> L48
            boolean r1 = r2.e(r3, r1)     // Catch: java.lang.Throwable -> L48
            androidx.compose.ui.unit.b r4 = androidx.compose.ui.unit.b.b(r4)     // Catch: java.lang.Throwable -> L48
            r2.f(r3, r4)     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            boolean r4 = r3.m0()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L59
            goto L4a
        L48:
            r3 = move-exception
            goto L77
        L4a:
            java.lang.Boolean r4 = r3.Z0()     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L48
            boolean r4 = kotlin.jvm.internal.l0.g(r4, r5)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L59
            r3.d1()     // Catch: java.lang.Throwable -> L48
        L59:
            boolean r4 = r3.k0()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L6d
            boolean r4 = r3.l()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L6d
            r3.s1()     // Catch: java.lang.Throwable -> L48
            androidx.compose.ui.node.n1 r4 = r2.onPositionedDispatcher     // Catch: java.lang.Throwable -> L48
            r4.d(r3)     // Catch: java.lang.Throwable -> L48
        L6d:
            r2.duringMeasureLayout = r0
            androidx.compose.ui.node.o0 r3 = r2.consistencyChecker
            if (r3 == 0) goto L7a
            r3.a()
            goto L7a
        L77:
            r2.duringMeasureLayout = r0
            throw r3
        L7a:
            r2.b()
            return
        L7e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "performMeasureAndLayout called during measure layout"
            r3.<init>(r4)
            throw r3
        L86:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "performMeasureAndLayout called with unplaced root"
            r3.<init>(r4)
            throw r3
        L8e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "performMeasureAndLayout called with unattached root"
            r3.<init>(r4)
            throw r3
        L96:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "measureAndLayout called on root"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.t0.r(androidx.compose.ui.node.h0, long):void");
    }

    public final void s() {
        if (this.relayoutNodes.h()) {
            if (!this.root.f()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.l()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                try {
                    if (!this.relayoutNodes.g(true)) {
                        if (this.root.getLookaheadRoot() != null) {
                            B(this.root, true);
                        } else {
                            A(this.root);
                        }
                    }
                    B(this.root, false);
                    this.duringMeasureLayout = false;
                    o0 o0Var = this.consistencyChecker;
                    if (o0Var != null) {
                        o0Var.a();
                    }
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    throw th;
                }
            }
        }
    }

    public final void u(@fg.l h0 node) {
        this.relayoutNodes.k(node);
    }

    public final void x(@fg.l p1.b listener) {
        this.onLayoutCompletedListeners.b(listener);
    }
}
