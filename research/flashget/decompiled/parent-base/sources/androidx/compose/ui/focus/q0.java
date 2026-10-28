package androidx.compose.ui.focus;

import androidx.compose.ui.focus.f;
import androidx.compose.ui.node.c1;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;

/* compiled from: FocusTraversal.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a:\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011\"\u0018\u0010\u0015\u001a\u00020\t*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "focusDirection", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/focus/a0;", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/w;)Landroidx/compose/ui/focus/a0;", "Lkotlin/Function1;", "", "onFound", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/w;Lld/l;)Z", "Li0/i;", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)Li0/i;", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "c", "g", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "isEligibleForFocusSearch", "f", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,169:1\n1#2:170\n1#2:174\n1#2:245\n1#2:320\n90#3:171\n90#3:242\n90#3:313\n276#4:172\n133#4:173\n134#4:175\n135#4,7:179\n142#4,9:187\n385#4,6:196\n395#4,2:203\n397#4,17:208\n414#4,8:228\n151#4,6:236\n276#4:243\n133#4:244\n134#4:246\n135#4,7:250\n142#4,9:258\n385#4,6:267\n395#4,2:274\n397#4,17:279\n414#4,8:299\n151#4,6:307\n230#4,5:314\n58#4:319\n59#4,8:321\n385#4,6:329\n395#4,2:336\n397#4,8:341\n405#4,9:352\n414#4,8:364\n68#4,7:372\n1208#5:176\n1187#5,2:177\n1208#5:247\n1187#5,2:248\n1208#5:349\n1187#5,2:350\n48#6:186\n48#6:257\n261#7:202\n261#7:273\n261#7:335\n234#8,3:205\n237#8,3:225\n234#8,3:276\n237#8,3:296\n234#8,3:338\n237#8,3:361\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n139#1:174\n153#1:245\n164#1:320\n139#1:171\n153#1:242\n164#1:313\n139#1:172\n139#1:173\n139#1:175\n139#1:179,7\n139#1:187,9\n139#1:196,6\n139#1:203,2\n139#1:208,17\n139#1:228,8\n139#1:236,6\n153#1:243\n153#1:244\n153#1:246\n153#1:250,7\n153#1:258,9\n153#1:267,6\n153#1:274,2\n153#1:279,17\n153#1:299,8\n153#1:307,6\n164#1:314,5\n164#1:319\n164#1:321,8\n164#1:329,6\n164#1:336,2\n164#1:341,8\n164#1:352,9\n164#1:364,8\n164#1:372,7\n139#1:176\n139#1:177,2\n153#1:247\n153#1:248,2\n164#1:349\n164#1:350,2\n139#1:186\n153#1:257\n139#1:202\n153#1:273\n164#1:335\n139#1:205,3\n139#1:225,3\n153#1:276,3\n153#1:296,3\n164#1:338,3\n164#1:361,3\n*E\n"})
/* loaded from: classes.dex */
public final class q0 {

    /* compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17566a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f17567b;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17566a = iArr;
            int[] iArr2 = new int[k0.values().length];
            try {
                iArr2[k0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[k0.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f17567b = iArr2;
        }
    }

    @fg.l
    public static final a0 a(@fg.l FocusTargetNode focusTargetNode, int i4, @fg.l androidx.compose.ui.unit.w wVar) {
        a0 end;
        t F7 = focusTargetNode.F7();
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (f.l(i4, f.f17526c)) {
            return F7.getNext();
        }
        companion.getClass();
        if (f.l(i4, f.f17527d)) {
            return F7.getPrevious();
        }
        companion.getClass();
        if (f.l(i4, f.f17530g)) {
            return F7.getUp();
        }
        companion.getClass();
        if (f.l(i4, f.f17531h)) {
            return F7.getDown();
        }
        companion.getClass();
        if (f.l(i4, f.f17528e)) {
            int i5 = a.f17566a[wVar.ordinal()];
            if (i5 == 1) {
                end = F7.getStart();
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = F7.getEnd();
            }
            a0.INSTANCE.getClass();
            if (end == a0.f17515d) {
                end = null;
            }
            if (end == null) {
                return F7.getLeft();
            }
        } else {
            companion.getClass();
            if (!f.l(i4, f.f17529f)) {
                companion.getClass();
                if (f.l(i4, f.f17532i)) {
                    return F7.n().invoke(f.i(i4));
                }
                companion.getClass();
                if (f.l(i4, f.f17533j)) {
                    return F7.h().invoke(f.i(i4));
                }
                throw new IllegalStateException("invalid FocusDirection");
            }
            int i6 = a.f17566a[wVar.ordinal()];
            if (i6 == 1) {
                end = F7.getEnd();
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = F7.getStart();
            }
            a0.INSTANCE.getClass();
            if (end == a0.f17515d) {
                end = null;
            }
            if (end == null) {
                return F7.getRight();
            }
        }
        return end;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0049, code lost:
    
        continue;
     */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(@fg.l androidx.compose.ui.focus.FocusTargetNode r9) {
        /*
            androidx.compose.ui.focus.k0 r0 = r9.I0()
            int[] r1 = androidx.compose.ui.focus.q0.a.f17567b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto Lcc
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L20
            r1 = 3
            if (r0 == r1) goto Lcc
            r9 = 4
            if (r0 != r9) goto L1a
            return r3
        L1a:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L20:
            androidx.compose.ui.q$d r0 = r9.getNode()
            boolean r0 = r0.getIsAttached()
            if (r0 == 0) goto Lc4
            androidx.compose.runtime.collection.g r0 = new androidx.compose.runtime.collection.g
            r2 = 16
            androidx.compose.ui.q$d[] r4 = new androidx.compose.ui.q.d[r2]
            r5 = 0
            r0.<init>(r4, r5)
            androidx.compose.ui.q$d r4 = r9.getNode()
            androidx.compose.ui.q$d r4 = r4.getChild()
            if (r4 != 0) goto L46
            androidx.compose.ui.q$d r9 = r9.getNode()
            androidx.compose.ui.node.k.a(r0, r9)
            goto L49
        L46:
            r0.b(r4)
        L49:
            boolean r9 = r0.V()
            if (r9 == 0) goto Lc3
            java.lang.Object r9 = androidx.compose.foundation.gestures.i.a(r0, r1)
            androidx.compose.ui.q$d r9 = (androidx.compose.ui.q.d) r9
            int r4 = r9.getAggregateChildKindSet()
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L61
            androidx.compose.ui.node.k.a(r0, r9)
            goto L49
        L61:
            if (r9 == 0) goto L49
            int r4 = r9.getKindSet()
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Lbe
            r4 = r3
        L6c:
            if (r9 == 0) goto L49
            boolean r6 = r9 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r6 == 0) goto L7b
            androidx.compose.ui.focus.FocusTargetNode r9 = (androidx.compose.ui.focus.FocusTargetNode) r9
            androidx.compose.ui.focus.FocusTargetNode r9 = b(r9)
            if (r9 == 0) goto Lb9
            return r9
        L7b:
            int r6 = r9.getKindSet()
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb9
            boolean r6 = r9 instanceof androidx.compose.ui.node.l
            if (r6 == 0) goto Lb9
            r6 = r9
            androidx.compose.ui.node.l r6 = (androidx.compose.ui.node.l) r6
            androidx.compose.ui.q$d r6 = r6.getDelegate()
            r7 = r5
        L8f:
            if (r6 == 0) goto Lb6
            int r8 = r6.getKindSet()
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Lb1
            int r7 = r7 + 1
            if (r7 != r1) goto L9f
            r9 = r6
            goto Lb1
        L9f:
            if (r4 != 0) goto La8
            androidx.compose.runtime.collection.g r4 = new androidx.compose.runtime.collection.g
            androidx.compose.ui.q$d[] r8 = new androidx.compose.ui.q.d[r2]
            r4.<init>(r8, r5)
        La8:
            if (r9 == 0) goto Lae
            r4.b(r9)
            r9 = r3
        Lae:
            r4.b(r6)
        Lb1:
            androidx.compose.ui.q$d r6 = r6.getChild()
            goto L8f
        Lb6:
            if (r7 != r1) goto Lb9
            goto L6c
        Lb9:
            androidx.compose.ui.q$d r9 = androidx.compose.ui.node.k.b(r4)
            goto L6c
        Lbe:
            androidx.compose.ui.q$d r9 = r9.getChild()
            goto L61
        Lc3:
            return r3
        Lc4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r9.<init>(r0)
            throw r9
        Lcc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.q0.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        c1 nodes;
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = focusTargetNode.getNode().getParent();
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(focusTargetNode);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & 1024) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 1024) != 0) {
                        q.d dVar = parent;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (dVar != null) {
                            if (dVar instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVar;
                                if (focusTargetNode2.F7().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((dVar.getKindSet() & 1024) != 0 && (dVar instanceof androidx.compose.ui.node.l)) {
                                int i4 = 0;
                                for (q.d delegate = ((androidx.compose.ui.node.l) dVar).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & 1024) != 0) {
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
        return null;
    }

    @fg.l
    public static final i0.i d(@fg.l FocusTargetNode focusTargetNode) {
        i0.i j02;
        e1 coordinator = focusTargetNode.getCoordinator();
        if (coordinator != null && (j02 = androidx.compose.ui.layout.v.d(coordinator).j0(coordinator, false)) != null) {
            return j02;
        }
        i0.i.INSTANCE.getClass();
        return i0.i.f74153g;
    }

    public static final boolean e(@fg.l FocusTargetNode focusTargetNode, int i4, @fg.l androidx.compose.ui.unit.w wVar, @fg.l ld.l<? super FocusTargetNode, Boolean> lVar) {
        boolean l4;
        boolean l5;
        boolean l6;
        boolean l7;
        int i5;
        Boolean v4;
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (f.l(i4, f.f17526c)) {
            l4 = true;
        } else {
            companion.getClass();
            l4 = f.l(i4, f.f17527d);
        }
        if (l4) {
            return s0.j(focusTargetNode, i4, lVar);
        }
        companion.getClass();
        if (f.l(i4, f.f17528e)) {
            l5 = true;
        } else {
            companion.getClass();
            l5 = f.l(i4, f.f17529f);
        }
        if (l5) {
            l6 = true;
        } else {
            companion.getClass();
            l6 = f.l(i4, f.f17530g);
        }
        if (l6) {
            l7 = true;
        } else {
            companion.getClass();
            l7 = f.l(i4, f.f17531h);
        }
        if (l7) {
            Boolean v5 = t0.v(focusTargetNode, i4, lVar);
            if (v5 != null) {
                return v5.booleanValue();
            }
        } else {
            companion.getClass();
            if (f.l(i4, f.f17532i)) {
                int i6 = a.f17566a[wVar.ordinal()];
                if (i6 == 1) {
                    companion.getClass();
                    i5 = f.f17529f;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    companion.getClass();
                    i5 = f.f17528e;
                }
                FocusTargetNode b5 = b(focusTargetNode);
                if (b5 != null && (v4 = t0.v(b5, i5, lVar)) != null) {
                    return v4.booleanValue();
                }
            } else {
                companion.getClass();
                if (!f.l(i4, f.f17533j)) {
                    throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) f.n(i4))).toString());
                }
                FocusTargetNode b6 = b(focusTargetNode);
                FocusTargetNode c5 = b6 != null ? c(b6) : null;
                if (c5 != null && !kotlin.jvm.internal.l0.g(c5, focusTargetNode)) {
                    return lVar.invoke(c5).booleanValue();
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0035, code lost:
    
        continue;
     */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(@fg.l androidx.compose.ui.focus.FocusTargetNode r9) {
        /*
            androidx.compose.ui.q$d r0 = r9.getNode()
            boolean r0 = r0.getIsAttached()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            androidx.compose.ui.q$d r0 = r9.getNode()
            boolean r0 = r0.getIsAttached()
            if (r0 == 0) goto Lca
            androidx.compose.runtime.collection.g r0 = new androidx.compose.runtime.collection.g
            r2 = 16
            androidx.compose.ui.q$d[] r3 = new androidx.compose.ui.q.d[r2]
            r4 = 0
            r0.<init>(r3, r4)
            androidx.compose.ui.q$d r3 = r9.getNode()
            androidx.compose.ui.q$d r3 = r3.getChild()
            if (r3 != 0) goto L32
            androidx.compose.ui.q$d r9 = r9.getNode()
            androidx.compose.ui.node.k.a(r0, r9)
            goto L35
        L32:
            r0.b(r3)
        L35:
            boolean r9 = r0.V()
            if (r9 == 0) goto Lc9
            r9 = 1
            java.lang.Object r3 = androidx.compose.foundation.gestures.i.a(r0, r9)
            androidx.compose.ui.q$d r3 = (androidx.compose.ui.q.d) r3
            int r5 = r3.getAggregateChildKindSet()
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L4e
            androidx.compose.ui.node.k.a(r0, r3)
            goto L35
        L4e:
            if (r3 == 0) goto L35
            int r5 = r3.getKindSet()
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto Lc4
            r5 = r1
        L59:
            if (r3 == 0) goto L35
            boolean r6 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r6 == 0) goto L81
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            androidx.compose.ui.q$d r6 = r3.getNode()
            boolean r6 = r6.getIsAttached()
            if (r6 == 0) goto Lbf
            androidx.compose.ui.focus.k0 r6 = r3.I0()
            int[] r7 = androidx.compose.ui.focus.q0.a.f17567b
            int r6 = r6.ordinal()
            r6 = r7[r6]
            if (r6 == r9) goto L80
            r7 = 2
            if (r6 == r7) goto L80
            r7 = 3
            if (r6 == r7) goto L80
            goto Lbf
        L80:
            return r3
        L81:
            int r6 = r3.getKindSet()
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lbf
            boolean r6 = r3 instanceof androidx.compose.ui.node.l
            if (r6 == 0) goto Lbf
            r6 = r3
            androidx.compose.ui.node.l r6 = (androidx.compose.ui.node.l) r6
            androidx.compose.ui.q$d r6 = r6.getDelegate()
            r7 = r4
        L95:
            if (r6 == 0) goto Lbc
            int r8 = r6.getKindSet()
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Lb7
            int r7 = r7 + 1
            if (r7 != r9) goto La5
            r3 = r6
            goto Lb7
        La5:
            if (r5 != 0) goto Lae
            androidx.compose.runtime.collection.g r5 = new androidx.compose.runtime.collection.g
            androidx.compose.ui.q$d[] r8 = new androidx.compose.ui.q.d[r2]
            r5.<init>(r8, r4)
        Lae:
            if (r3 == 0) goto Lb4
            r5.b(r3)
            r3 = r1
        Lb4:
            r5.b(r6)
        Lb7:
            androidx.compose.ui.q$d r6 = r6.getChild()
            goto L95
        Lbc:
            if (r7 != r9) goto Lbf
            goto L59
        Lbf:
            androidx.compose.ui.q$d r3 = androidx.compose.ui.node.k.b(r5)
            goto L59
        Lc4:
            androidx.compose.ui.q$d r3 = r3.getChild()
            goto L4e
        Lc9:
            return r1
        Lca:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.q0.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(@fg.l FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.h0 layoutNode;
        e1 coordinator;
        androidx.compose.ui.node.h0 layoutNode2;
        e1 coordinator2 = focusTargetNode.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.l() || (coordinator = focusTargetNode.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.f()) ? false : true;
    }
}
