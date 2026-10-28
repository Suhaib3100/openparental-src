package androidx.compose.ui.focus;

import androidx.compose.ui.focus.f;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;

/* compiled from: TwoDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\u001a4\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a:\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u001a!\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0016\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a2\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u001c\u001a\u0013\u0010!\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010\"\u001a\u0013\u0010$\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b$\u0010%\"\u001a\u0010+\u001a\u00020&8\u0002X\u0082T¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*\"\u001a\u0010-\u001a\u00020&8\u0002X\u0082T¢\u0006\f\n\u0004\b$\u0010(\u0012\u0004\b,\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "direction", "Lkotlin/Function1;", "", "onFound", "v", "(Landroidx/compose/ui/focus/FocusTargetNode;ILld/l;)Ljava/lang/Boolean;", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;ILld/l;)Z", "focusedItem", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILld/l;)Z", "t", "Landroidx/compose/ui/node/j;", "Landroidx/compose/runtime/collection/g;", "accessibleChildren", "Lkotlin/k2;", "i", "(Landroidx/compose/ui/node/j;Landroidx/compose/runtime/collection/g;)V", "Li0/i;", "focusRect", "j", "(Landroidx/compose/runtime/collection/g;Li0/i;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", "o", "(Li0/i;Li0/i;Li0/i;I)Z", "source", "rect1", "rect2", "c", "u", "(Li0/i;)Li0/i;", "h", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "", "a", "Ljava/lang/String;", "m", "()V", "InvalidFocusDirection", "n", "NoActiveChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,386:1\n1187#2,2:387\n1187#2,2:392\n1208#2:399\n1187#2,2:400\n1208#2:470\n1187#2,2:471\n359#3:389\n523#3:390\n48#3:409\n48#3:480\n460#3,11:536\n1#4:391\n1#4:397\n1#4:468\n90#5:394\n90#5:465\n276#6:395\n133#6:396\n134#6:398\n135#6,7:402\n142#6,9:410\n385#6,6:419\n395#6,2:426\n397#6,17:431\n414#6,8:451\n151#6,6:459\n276#6:466\n133#6:467\n134#6:469\n135#6,7:473\n142#6,9:481\n385#6,6:490\n395#6,2:497\n397#6,17:502\n414#6,8:522\n151#6,6:530\n261#7:425\n261#7:496\n234#8,3:428\n237#8,3:448\n234#8,3:499\n237#8,3:519\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n104#1:387,2\n160#1:392,2\n161#1:399\n161#1:400,2\n190#1:470\n190#1:471,2\n109#1:389\n109#1:390\n161#1:409\n190#1:480\n221#1:536,11\n161#1:397\n190#1:468\n161#1:394\n190#1:465\n161#1:395\n161#1:396\n161#1:398\n161#1:402,7\n161#1:410,9\n161#1:419,6\n161#1:426,2\n161#1:431,17\n161#1:451,8\n161#1:459,6\n190#1:466\n190#1:467\n190#1:469\n190#1:473,7\n190#1:481,9\n190#1:490,6\n190#1:497,2\n190#1:502,17\n190#1:522,8\n190#1:530,6\n161#1:425\n190#1:496\n161#1:428,3\n161#1:448,3\n190#1:499,3\n190#1:519,3\n*E\n"})
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f17580a = "This function should only be used for 2-D focus search";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f17581b = "ActiveParent must have a focusedChild";

    /* compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17582a;

        static {
            int[] iArr = new int[k0.values().length];
            try {
                iArr[k0.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17582a = iArr;
        }
    }

    /* compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/c$a;", "", "a", "(Landroidx/compose/ui/layout/c$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<c.a, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f17583b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f17584c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17585d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<FocusTargetNode, Boolean> f17586e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i4, ld.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f17583b = focusTargetNode;
            this.f17584c = focusTargetNode2;
            this.f17585d = i4;
            this.f17586e = lVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l c.a aVar) {
            boolean t4 = t0.t(this.f17583b, this.f17584c, this.f17585d, this.f17586e);
            Boolean valueOf = Boolean.valueOf(t4);
            if (t4 || !aVar.getHasMoreContent()) {
                return valueOf;
            }
            return null;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.I0() != k0.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode b5 = q0.b(focusTargetNode);
        if (b5 != null) {
            return b5;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(i0.i iVar, i0.i iVar2, i0.i iVar3, int i4) {
        if (d(iVar3, i4, iVar) || !d(iVar2, i4, iVar)) {
            return false;
        }
        if (e(iVar3, i4, iVar)) {
            f.Companion companion = f.INSTANCE;
            companion.getClass();
            if (!f.l(i4, f.f17528e)) {
                companion.getClass();
                if (!f.l(i4, f.f17529f) && f(iVar2, i4, iVar) >= g(iVar3, i4, iVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean d(i0.i iVar, int i4, i0.i iVar2) {
        boolean l4;
        boolean l5;
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (f.l(i4, f.f17528e)) {
            l4 = true;
        } else {
            companion.getClass();
            l4 = f.l(i4, f.f17529f);
        }
        if (!l4) {
            companion.getClass();
            if (f.l(i4, f.f17530g)) {
                l5 = true;
            } else {
                companion.getClass();
                l5 = f.l(i4, f.f17531h);
            }
            if (!l5) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (iVar.x() > iVar2.t() && iVar.t() < iVar2.x()) {
                return true;
            }
        } else if (iVar.j() > iVar2.getTop() && iVar.getTop() < iVar2.j()) {
            return true;
        }
        return false;
    }

    private static final boolean e(i0.i iVar, int i4, i0.i iVar2) {
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (!f.l(i4, f.f17528e)) {
            companion.getClass();
            if (!f.l(i4, f.f17529f)) {
                companion.getClass();
                if (!f.l(i4, f.f17530g)) {
                    companion.getClass();
                    if (!f.l(i4, f.f17531h)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    if (iVar2.j() > iVar.getTop()) {
                        return false;
                    }
                } else if (iVar2.getTop() < iVar.j()) {
                    return false;
                }
            } else if (iVar2.x() > iVar.t()) {
                return false;
            }
        } else if (iVar2.t() < iVar.x()) {
            return false;
        }
        return true;
    }

    private static final float f(i0.i iVar, int i4, i0.i iVar2) {
        float top2;
        float j4;
        float top3;
        float j5;
        float f4;
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (!f.l(i4, f.f17528e)) {
            companion.getClass();
            if (f.l(i4, f.f17529f)) {
                top2 = iVar.t();
                j4 = iVar2.x();
            } else {
                companion.getClass();
                if (f.l(i4, f.f17530g)) {
                    top3 = iVar2.getTop();
                    j5 = iVar.j();
                } else {
                    companion.getClass();
                    if (!f.l(i4, f.f17531h)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    top2 = iVar.getTop();
                    j4 = iVar2.j();
                }
            }
            f4 = top2 - j4;
            return Math.max(0.0f, f4);
        }
        top3 = iVar2.t();
        j5 = iVar.x();
        f4 = top3 - j5;
        return Math.max(0.0f, f4);
    }

    private static final float g(i0.i iVar, int i4, i0.i iVar2) {
        float j4;
        float j5;
        float top2;
        float top3;
        float f4;
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (!f.l(i4, f.f17528e)) {
            companion.getClass();
            if (f.l(i4, f.f17529f)) {
                j4 = iVar.x();
                j5 = iVar2.x();
            } else {
                companion.getClass();
                if (f.l(i4, f.f17530g)) {
                    top2 = iVar2.getTop();
                    top3 = iVar.getTop();
                } else {
                    companion.getClass();
                    if (!f.l(i4, f.f17531h)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    j4 = iVar.j();
                    j5 = iVar2.j();
                }
            }
            f4 = j4 - j5;
            return Math.max(1.0f, f4);
        }
        top2 = iVar2.t();
        top3 = iVar.t();
        f4 = top2 - top3;
        return Math.max(1.0f, f4);
    }

    private static final i0.i h(i0.i iVar) {
        return new i0.i(iVar.x(), iVar.j(), iVar.x(), iVar.j());
    }

    private static final void i(androidx.compose.ui.node.j jVar, androidx.compose.runtime.collection.g<FocusTargetNode> gVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = jVar.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.k.c(gVar2, jVar.getNode());
        } else {
            gVar2.b(child);
        }
        while (gVar2.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar2, 1);
            if ((dVar.getAggregateChildKindSet() & 1024) == 0) {
                androidx.compose.ui.node.k.c(gVar2, dVar);
            } else {
                while (true) {
                    if (dVar == null) {
                        break;
                    }
                    if ((dVar.getKindSet() & 1024) != 0) {
                        androidx.compose.runtime.collection.g gVar3 = null;
                        while (dVar != null) {
                            if (dVar instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) dVar;
                                if (focusTargetNode.getIsAttached()) {
                                    if (focusTargetNode.F7().getCanFocus()) {
                                        gVar.b(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, gVar);
                                    }
                                }
                            } else if ((dVar.getKindSet() & 1024) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                int i4 = 0;
                                for (q.d delegate = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            dVar = delegate;
                                        } else {
                                            if (gVar3 == null) {
                                                gVar3 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (dVar != null) {
                                                gVar3.b(dVar);
                                                dVar = null;
                                            }
                                            gVar3.b(delegate);
                                        }
                                    }
                                }
                                if (i4 == 1) {
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
    }

    private static final FocusTargetNode j(androidx.compose.runtime.collection.g<FocusTargetNode> gVar, i0.i iVar, int i4) {
        i0.i S;
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (f.l(i4, f.f17528e)) {
            S = iVar.S(iVar.G() + 1, 0.0f);
        } else {
            companion.getClass();
            if (f.l(i4, f.f17529f)) {
                S = iVar.S(-(iVar.G() + 1), 0.0f);
            } else {
                companion.getClass();
                if (f.l(i4, f.f17530g)) {
                    S = iVar.S(0.0f, iVar.r() + 1);
                } else {
                    companion.getClass();
                    if (!f.l(i4, f.f17531h)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    S = iVar.S(0.0f, -(iVar.r() + 1));
                }
            }
        }
        int size = gVar.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            FocusTargetNode[] L = gVar.L();
            int i5 = 0;
            do {
                FocusTargetNode focusTargetNode2 = L[i5];
                if (q0.g(focusTargetNode2)) {
                    i0.i d5 = q0.d(focusTargetNode2);
                    if (o(d5, S, iVar, i4)) {
                        focusTargetNode = focusTargetNode2;
                        S = d5;
                    }
                }
                i5++;
            } while (i5 < size);
        }
        return focusTargetNode;
    }

    public static final boolean k(@fg.l FocusTargetNode focusTargetNode, int i4, @fg.l ld.l<? super FocusTargetNode, Boolean> lVar) {
        boolean l4;
        i0.i h4;
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new FocusTargetNode[16], 0);
        i(focusTargetNode, gVar);
        boolean z4 = true;
        if (gVar.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (gVar.U() ? null : gVar.L()[0]);
            if (focusTargetNode2 != null) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (f.l(i4, f.f17532i)) {
            companion.getClass();
            i4 = f.f17529f;
        }
        companion.getClass();
        if (f.l(i4, f.f17529f)) {
            l4 = true;
        } else {
            companion.getClass();
            l4 = f.l(i4, f.f17531h);
        }
        if (l4) {
            h4 = u(q0.d(focusTargetNode));
        } else {
            companion.getClass();
            if (!f.l(i4, f.f17528e)) {
                companion.getClass();
                z4 = f.l(i4, f.f17530g);
            }
            if (!z4) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            h4 = h(q0.d(focusTargetNode));
        }
        FocusTargetNode j4 = j(gVar, h4, i4);
        if (j4 != null) {
            return lVar.invoke(j4).booleanValue();
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i4, ld.l<? super FocusTargetNode, Boolean> lVar) {
        if (t(focusTargetNode, focusTargetNode2, i4, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.b.a(focusTargetNode, i4, new b(focusTargetNode, focusTargetNode2, i4, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    private static final boolean o(i0.i iVar, i0.i iVar2, i0.i iVar3, int i4) {
        if (p(iVar, i4, iVar3)) {
            return !p(iVar2, i4, iVar3) || c(iVar3, iVar, iVar2, i4) || (!c(iVar3, iVar2, iVar, i4) && s(i4, iVar3, iVar) < s(i4, iVar3, iVar2));
        }
        return false;
    }

    private static final boolean p(i0.i iVar, int i4, i0.i iVar2) {
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (!f.l(i4, f.f17528e)) {
            companion.getClass();
            if (!f.l(i4, f.f17529f)) {
                companion.getClass();
                if (!f.l(i4, f.f17530g)) {
                    companion.getClass();
                    if (!f.l(i4, f.f17531h)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    if ((iVar2.getTop() >= iVar.getTop() && iVar2.j() > iVar.getTop()) || iVar2.j() >= iVar.j()) {
                        return false;
                    }
                } else if ((iVar2.j() <= iVar.j() && iVar2.getTop() < iVar.j()) || iVar2.getTop() <= iVar.getTop()) {
                    return false;
                }
            } else if ((iVar2.t() >= iVar.t() && iVar2.x() > iVar.t()) || iVar2.x() >= iVar.x()) {
                return false;
            }
        } else if ((iVar2.x() <= iVar.x() && iVar2.t() < iVar.x()) || iVar2.t() <= iVar.t()) {
            return false;
        }
        return true;
    }

    private static final float q(i0.i iVar, int i4, i0.i iVar2) {
        float top2;
        float j4;
        float top3;
        float j5;
        float f4;
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (!f.l(i4, f.f17528e)) {
            companion.getClass();
            if (f.l(i4, f.f17529f)) {
                top2 = iVar.t();
                j4 = iVar2.x();
            } else {
                companion.getClass();
                if (f.l(i4, f.f17530g)) {
                    top3 = iVar2.getTop();
                    j5 = iVar.j();
                } else {
                    companion.getClass();
                    if (!f.l(i4, f.f17531h)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    top2 = iVar.getTop();
                    j4 = iVar2.j();
                }
            }
            f4 = top2 - j4;
            return Math.max(0.0f, f4);
        }
        top3 = iVar2.t();
        j5 = iVar.x();
        f4 = top3 - j5;
        return Math.max(0.0f, f4);
    }

    private static final float r(i0.i iVar, int i4, i0.i iVar2) {
        boolean l4;
        float f4;
        float G;
        float t4;
        float G2;
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        boolean z4 = true;
        if (f.l(i4, f.f17528e)) {
            l4 = true;
        } else {
            companion.getClass();
            l4 = f.l(i4, f.f17529f);
        }
        if (l4) {
            f4 = 2;
            G = (iVar2.r() / f4) + iVar2.getTop();
            t4 = iVar.getTop();
            G2 = iVar.r();
        } else {
            companion.getClass();
            if (!f.l(i4, f.f17530g)) {
                companion.getClass();
                z4 = f.l(i4, f.f17531h);
            }
            if (!z4) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f4 = 2;
            G = (iVar2.G() / f4) + iVar2.t();
            t4 = iVar.t();
            G2 = iVar.G();
        }
        return G - ((G2 / f4) + t4);
    }

    private static final long s(int i4, i0.i iVar, i0.i iVar2) {
        long abs = (long) Math.abs(q(iVar2, i4, iVar));
        long abs2 = (long) Math.abs(r(iVar2, i4, iVar));
        return (abs2 * abs2) + (13 * abs * abs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i4, ld.l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode j4;
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new FocusTargetNode[16], 0);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = focusTargetNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.k.c(gVar2, focusTargetNode.getNode());
        } else {
            gVar2.b(child);
        }
        while (gVar2.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar2, 1);
            if ((dVar.getAggregateChildKindSet() & 1024) == 0) {
                androidx.compose.ui.node.k.c(gVar2, dVar);
            } else {
                while (true) {
                    if (dVar == null) {
                        break;
                    }
                    if ((dVar.getKindSet() & 1024) != 0) {
                        androidx.compose.runtime.collection.g gVar3 = null;
                        while (dVar != null) {
                            if (dVar instanceof FocusTargetNode) {
                                gVar.b((FocusTargetNode) dVar);
                            } else if ((dVar.getKindSet() & 1024) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                int i5 = 0;
                                for (q.d delegate = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            dVar = delegate;
                                        } else {
                                            if (gVar3 == null) {
                                                gVar3 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (dVar != null) {
                                                gVar3.b(dVar);
                                                dVar = null;
                                            }
                                            gVar3.b(delegate);
                                        }
                                    }
                                }
                                if (i5 == 1) {
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
        while (gVar.V() && (j4 = j(gVar, q0.d(focusTargetNode2), i4)) != null) {
            if (j4.F7().getCanFocus()) {
                return lVar.invoke(j4).booleanValue();
            }
            if (l(j4, focusTargetNode2, i4, lVar)) {
                return true;
            }
            gVar.j0(j4);
        }
        return false;
    }

    private static final i0.i u(i0.i iVar) {
        return new i0.i(iVar.t(), iVar.getTop(), iVar.t(), iVar.getTop());
    }

    @fg.m
    public static final Boolean v(@fg.l FocusTargetNode focusTargetNode, int i4, @fg.l ld.l<? super FocusTargetNode, Boolean> lVar) {
        k0 I0 = focusTargetNode.I0();
        int[] iArr = a.f17582a;
        int i5 = iArr[I0.ordinal()];
        if (i5 != 1) {
            if (i5 == 2 || i5 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i4, lVar));
            }
            if (i5 == 4) {
                return focusTargetNode.F7().getCanFocus() ? lVar.invoke(focusTargetNode) : Boolean.FALSE;
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode f4 = q0.f(focusTargetNode);
        if (f4 == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i6 = iArr[f4.I0().ordinal()];
        if (i6 == 1) {
            Boolean v4 = v(f4, i4, lVar);
            return !kotlin.jvm.internal.l0.g(v4, Boolean.FALSE) ? v4 : Boolean.valueOf(l(focusTargetNode, b(f4), i4, lVar));
        }
        if (i6 == 2 || i6 == 3) {
            return Boolean.valueOf(l(focusTargetNode, f4, i4, lVar));
        }
        if (i6 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
