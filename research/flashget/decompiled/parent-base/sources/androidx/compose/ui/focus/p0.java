package androidx.compose.ui.focus;

import androidx.compose.ui.focus.a0;
import androidx.compose.ui.node.c1;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.node.l1;
import androidx.compose.ui.node.p1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: FocusTransactions.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a%\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\u0003\u001a'\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0003\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001e\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001e\u0010\u0019\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001e\u0010\u001a\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "m", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "l", "a", "f", "forced", "refreshFocusEvents", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", "g", "b", "childNode", "n", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z", "o", "p", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "focusDirection", "Landroidx/compose/ui/focus/c;", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/c;", "h", "i", "j", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,308:1\n39#2,7:309\n46#2,4:319\n39#2,7:392\n46#2,4:402\n39#2,7:406\n46#2,4:416\n1#3:316\n1#3:331\n1#3:399\n1#3:413\n1#3:428\n1#3:497\n1#3:558\n1#3:567\n1#3:628\n728#4,2:317\n728#4,2:400\n728#4,2:414\n90#5:323\n90#5:420\n90#5:489\n90#5:559\n262#6:324\n230#6,5:325\n58#6:330\n59#6,8:332\n385#6,5:340\n263#6:345\n390#6:346\n395#6,2:348\n397#6,8:353\n405#6,9:364\n414#6,8:376\n68#6,7:384\n265#6:391\n262#6:421\n230#6,5:422\n58#6:427\n59#6,8:429\n385#6,5:437\n263#6:442\n390#6:443\n395#6,2:445\n397#6,8:450\n405#6,9:461\n414#6,8:473\n68#6,7:481\n265#6:488\n262#6:490\n230#6,5:491\n58#6:496\n59#6,8:498\n385#6,5:506\n263#6:511\n390#6:512\n395#6,2:514\n397#6,8:519\n405#6,9:530\n414#6,8:542\n68#6,7:550\n265#6:557\n262#6:560\n230#6,5:561\n58#6:566\n59#6,8:568\n385#6,5:576\n263#6:581\n390#6:582\n395#6,2:584\n397#6,8:589\n405#6,9:600\n414#6,8:612\n68#6,7:620\n265#6:627\n261#7:347\n261#7:444\n261#7:513\n261#7:583\n234#8,3:350\n237#8,3:373\n234#8,3:447\n237#8,3:470\n234#8,3:516\n237#8,3:539\n234#8,3:586\n237#8,3:609\n1208#9:361\n1187#9,2:362\n1208#9:458\n1187#9,2:459\n1208#9:527\n1187#9,2:528\n1208#9:597\n1187#9,2:598\n119#10,12:629\n146#10,12:641\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n43#1:309,7\n43#1:319,4\n89#1:392,7\n89#1:402,4\n108#1:406,7\n108#1:416,4\n43#1:316\n64#1:331\n89#1:399\n108#1:413\n199#1:428\n217#1:497\n264#1:567\n43#1:317,2\n89#1:400,2\n108#1:414,2\n64#1:323\n199#1:420\n217#1:489\n264#1:559\n64#1:324\n64#1:325,5\n64#1:330\n64#1:332,8\n64#1:340,5\n64#1:345\n64#1:346\n64#1:348,2\n64#1:353,8\n64#1:364,9\n64#1:376,8\n64#1:384,7\n64#1:391\n199#1:421\n199#1:422,5\n199#1:427\n199#1:429,8\n199#1:437,5\n199#1:442\n199#1:443\n199#1:445,2\n199#1:450,8\n199#1:461,9\n199#1:473,8\n199#1:481,7\n199#1:488\n217#1:490\n217#1:491,5\n217#1:496\n217#1:498,8\n217#1:506,5\n217#1:511\n217#1:512\n217#1:514,2\n217#1:519,8\n217#1:530,9\n217#1:542,8\n217#1:550,7\n217#1:557\n264#1:560\n264#1:561,5\n264#1:566\n264#1:568,8\n264#1:576,5\n264#1:581\n264#1:582\n264#1:584,2\n264#1:589,8\n264#1:600,9\n264#1:612,8\n264#1:620,7\n264#1:627\n64#1:347\n199#1:444\n217#1:513\n264#1:583\n64#1:350,3\n64#1:373,3\n199#1:447,3\n199#1:470,3\n217#1:516,3\n217#1:539,3\n264#1:586,3\n264#1:609,3\n64#1:361\n64#1:362,2\n199#1:458\n199#1:459,2\n217#1:527\n217#1:528,2\n264#1:597\n264#1:598,2\n291#1:629,12\n302#1:641,12\n*E\n"})
/* loaded from: classes.dex */
public final class p0 {

    /* compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17561a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f17562b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17561a = iArr;
            int[] iArr2 = new int[k0.values().length];
            try {
                iArr2[k0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k0.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[k0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[k0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f17562b = iArr2;
        }
    }

    /* compiled from: FocusTransactions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f17563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f17563b = focusTargetNode;
        }

        public final void a() {
            this.f17563b.F7();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    public static final boolean a(@fg.l FocusTargetNode focusTargetNode) {
        boolean z4;
        o0 d5 = n0.d(focusTargetNode);
        try {
            z4 = d5.ongoingTransaction;
            if (z4) {
                d5.g();
            }
            o0.a(d5);
            int i4 = a.f17562b[focusTargetNode.I0().ordinal()];
            boolean z5 = true;
            if (i4 == 1) {
                focusTargetNode.L7(k0.Captured);
                j.c(focusTargetNode);
            } else if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z5 = false;
            }
            return z5;
        } finally {
            d5.h();
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, boolean z4, boolean z5) {
        FocusTargetNode f4 = q0.f(focusTargetNode);
        if (f4 != null) {
            return d(f4, z4, z5);
        }
        return true;
    }

    static /* synthetic */ boolean c(FocusTargetNode focusTargetNode, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        return b(focusTargetNode, z4, z5);
    }

    public static final boolean d(@fg.l FocusTargetNode focusTargetNode, boolean z4, boolean z5) {
        int i4 = a.f17562b[focusTargetNode.I0().ordinal()];
        if (i4 == 1) {
            focusTargetNode.L7(k0.Inactive);
            if (z5) {
                j.c(focusTargetNode);
            }
        } else {
            if (i4 == 2) {
                if (!z4) {
                    return z4;
                }
                focusTargetNode.L7(k0.Inactive);
                if (!z5) {
                    return z4;
                }
                j.c(focusTargetNode);
                return z4;
            }
            if (i4 != 3) {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!b(focusTargetNode, z4, z5)) {
                    return false;
                }
                focusTargetNode.L7(k0.Inactive);
                if (z5) {
                    j.c(focusTargetNode);
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean e(FocusTargetNode focusTargetNode, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return d(focusTargetNode, z4, z5);
    }

    public static final boolean f(@fg.l FocusTargetNode focusTargetNode) {
        boolean z4;
        o0 d5 = n0.d(focusTargetNode);
        try {
            z4 = d5.ongoingTransaction;
            if (z4) {
                d5.g();
            }
            o0.a(d5);
            int i4 = a.f17562b[focusTargetNode.I0().ordinal()];
            boolean z5 = true;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3 && i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z5 = false;
                } else {
                    focusTargetNode.L7(k0.Active);
                    j.c(focusTargetNode);
                }
            }
            return z5;
        } finally {
            d5.h();
        }
    }

    private static final boolean g(FocusTargetNode focusTargetNode) {
        l1.a(focusTargetNode, new b(focusTargetNode));
        int i4 = a.f17562b[focusTargetNode.I0().ordinal()];
        if (i4 != 3 && i4 != 4) {
            return true;
        }
        focusTargetNode.L7(k0.Active);
        return true;
    }

    @fg.l
    public static final c h(@fg.l FocusTargetNode focusTargetNode, int i4) {
        int i5 = a.f17562b[focusTargetNode.I0().ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return c.Cancelled;
            }
            if (i5 == 3) {
                c h4 = h(p(focusTargetNode), i4);
                if (h4 == c.None) {
                    h4 = null;
                }
                return h4 == null ? j(focusTargetNode, i4) : h4;
            }
            if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return c.None;
    }

    private static final c i(FocusTargetNode focusTargetNode, int i4) {
        boolean z4;
        z4 = focusTargetNode.isProcessingCustomEnter;
        if (!z4) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                a0 invoke = focusTargetNode.F7().n().invoke(f.i(i4));
                a0.Companion companion = a0.INSTANCE;
                companion.getClass();
                if (invoke != a0.f17515d) {
                    companion.getClass();
                    if (invoke == a0.f17516e) {
                        return c.Cancelled;
                    }
                    return invoke.e() ? c.Redirected : c.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return c.None;
    }

    private static final c j(FocusTargetNode focusTargetNode, int i4) {
        boolean z4;
        z4 = focusTargetNode.isProcessingCustomExit;
        if (!z4) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                a0 invoke = focusTargetNode.F7().h().invoke(f.i(i4));
                a0.Companion companion = a0.INSTANCE;
                companion.getClass();
                if (invoke != a0.f17515d) {
                    companion.getClass();
                    if (invoke == a0.f17516e) {
                        return c.Cancelled;
                    }
                    return invoke.e() ? c.Redirected : c.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return c.None;
    }

    @fg.l
    public static final c k(@fg.l FocusTargetNode focusTargetNode, int i4) {
        q.d dVar;
        c1 nodes;
        int i5 = a.f17562b[focusTargetNode.I0().ordinal()];
        if (i5 == 1 || i5 == 2) {
            return c.None;
        }
        if (i5 == 3) {
            return h(p(focusTargetNode), i4);
        }
        if (i5 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = focusTargetNode.getNode().getParent();
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(focusTargetNode);
        loop0: while (true) {
            if (p4 == null) {
                dVar = null;
                break;
            }
            if ((androidx.compose.ui.focus.a.a(p4) & 1024) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 1024) != 0) {
                        dVar = parent;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (dVar != null) {
                            if (dVar instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((dVar.getKindSet() & 1024) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                int i6 = 0;
                                for (q.d delegate = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
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
                                if (i6 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVar;
        if (focusTargetNode2 == null) {
            return c.None;
        }
        int i7 = a.f17562b[focusTargetNode2.I0().ordinal()];
        if (i7 == 1) {
            return i(focusTargetNode2, i4);
        }
        if (i7 == 2) {
            return c.Cancelled;
        }
        if (i7 == 3) {
            return k(focusTargetNode2, i4);
        }
        if (i7 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        c k4 = k(focusTargetNode2, i4);
        c cVar = k4 != c.None ? k4 : null;
        return cVar == null ? i(focusTargetNode2, i4) : cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
    
        if (g(r10) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00eb, code lost:
    
        if (g(r10) != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean l(@fg.l androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.p0.l(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean m(@fg.l FocusTargetNode focusTargetNode) {
        boolean z4;
        o0 d5 = n0.d(focusTargetNode);
        try {
            z4 = d5.ongoingTransaction;
            if (z4) {
                d5.g();
            }
            o0.a(d5);
            f.INSTANCE.getClass();
            int i4 = a.f17561a[k(focusTargetNode, f.f17532i).ordinal()];
            boolean z5 = true;
            if (i4 == 1) {
                z5 = l(focusTargetNode);
            } else if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z5 = false;
            }
            return z5;
        } finally {
            d5.h();
        }
    }

    private static final boolean n(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        q.d dVar;
        q.d dVar2;
        c1 nodes;
        c1 nodes2;
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = focusTargetNode2.getNode().getParent();
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(focusTargetNode2);
        loop0: while (true) {
            dVar = null;
            if (p4 == null) {
                dVar2 = null;
                break;
            }
            if ((androidx.compose.ui.focus.a.a(p4) & 1024) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 1024) != 0) {
                        dVar2 = parent;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (dVar2 != null) {
                            if (dVar2 instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((dVar2.getKindSet() & 1024) != 0 && (dVar2 instanceof androidx.compose.ui.node.l)) {
                                int i4 = 0;
                                for (q.d delegate = ((androidx.compose.ui.node.l) dVar2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            dVar2 = delegate;
                                        } else {
                                            if (gVar == null) {
                                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (dVar2 != null) {
                                                gVar.b(dVar2);
                                                dVar2 = null;
                                            }
                                            gVar.b(delegate);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            dVar2 = androidx.compose.ui.node.k.l(gVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes2 = p4.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!kotlin.jvm.internal.l0.g(dVar2, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i5 = a.f17562b[focusTargetNode.I0().ordinal()];
        if (i5 == 1) {
            boolean g4 = g(focusTargetNode2);
            if (!g4) {
                return g4;
            }
            focusTargetNode.L7(k0.ActiveParent);
            return g4;
        }
        if (i5 != 2) {
            if (i5 == 3) {
                p(focusTargetNode);
                if (c(focusTargetNode, false, false, 3, null) && g(focusTargetNode2)) {
                    return true;
                }
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                q.d parent2 = focusTargetNode.getNode().getParent();
                androidx.compose.ui.node.h0 p5 = androidx.compose.ui.node.k.p(focusTargetNode);
                loop4: while (true) {
                    if (p5 == null) {
                        break;
                    }
                    if ((androidx.compose.ui.focus.a.a(p5) & 1024) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & 1024) != 0) {
                                q.d dVar3 = parent2;
                                androidx.compose.runtime.collection.g gVar2 = null;
                                while (dVar3 != null) {
                                    if (dVar3 instanceof FocusTargetNode) {
                                        dVar = dVar3;
                                        break loop4;
                                    }
                                    if ((dVar3.getKindSet() & 1024) != 0 && (dVar3 instanceof androidx.compose.ui.node.l)) {
                                        int i6 = 0;
                                        for (q.d delegate2 = ((androidx.compose.ui.node.l) dVar3).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & 1024) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    dVar3 = delegate2;
                                                } else {
                                                    if (gVar2 == null) {
                                                        gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                    }
                                                    if (dVar3 != null) {
                                                        gVar2.b(dVar3);
                                                        dVar3 = null;
                                                    }
                                                    gVar2.b(delegate2);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    dVar3 = androidx.compose.ui.node.k.l(gVar2);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    p5 = p5.B0();
                    parent2 = (p5 == null || (nodes = p5.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) dVar;
                if (focusTargetNode3 == null && o(focusTargetNode)) {
                    focusTargetNode.L7(k0.Active);
                    return n(focusTargetNode, focusTargetNode2);
                }
                if (focusTargetNode3 != null && n(focusTargetNode3, focusTargetNode)) {
                    boolean n4 = n(focusTargetNode, focusTargetNode2);
                    if (focusTargetNode.I0() != k0.ActiveParent) {
                        throw new IllegalStateException("Deactivated node is focused");
                    }
                    if (!n4) {
                        return n4;
                    }
                    j.c(focusTargetNode3);
                    return n4;
                }
            }
        }
        return false;
    }

    private static final boolean o(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.h0 layoutNode;
        p1 owner;
        e1 coordinator = focusTargetNode.getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null) {
            throw new IllegalStateException("Owner not initialized.");
        }
        return owner.requestFocus();
    }

    private static final FocusTargetNode p(FocusTargetNode focusTargetNode) {
        FocusTargetNode f4 = q0.f(focusTargetNode);
        if (f4 != null) {
            return f4;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
