package androidx.compose.ui.focus;

import androidx.compose.ui.focus.f;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.node.c1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: OneDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u001a2\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a:\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a'\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\t\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\t\u001a\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aG\u0010\u0018\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aG\u0010\u001a\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001a\u0010\u0019\"\u001a\u0010 \u001a\u00020\u001b8\u0002X\u0082T¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\f\n\u0004\b\n\u0010\u001d\u0012\u0004\b!\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "direction", "Lkotlin/Function1;", "", "onFound", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;ILld/l;)Z", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;Lld/l;)Z", "b", "focusedItem", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILld/l;)Z", "m", "l", "k", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "T", "Landroidx/compose/runtime/collection/g;", "item", "Lkotlin/k2;", "action", "c", "(Landroidx/compose/runtime/collection/g;Ljava/lang/Object;Lld/l;)V", "d", "", "a", "Ljava/lang/String;", "g", "()V", "InvalidFocusDirection", "h", "NoActiveChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,266:1\n181#1,3:340\n184#1,2:344\n187#1,5:347\n196#1,3:352\n199#1,2:356\n202#1,5:359\n1187#2,2:267\n1208#2:274\n1187#2,2:275\n1187#2,2:364\n1208#2:371\n1187#2,2:372\n1187#2,2:448\n1208#2:455\n1187#2,2:456\n1208#2:570\n1187#2,2:571\n90#3:269\n90#3:366\n90#3:450\n90#3:532\n276#4:270\n133#4:271\n134#4:273\n135#4,7:277\n142#4,9:285\n385#4,6:294\n395#4,2:301\n397#4,17:306\n414#4,8:326\n151#4,6:334\n276#4:367\n133#4:368\n134#4:370\n135#4,7:374\n142#4,9:382\n385#4,6:391\n395#4,2:398\n397#4,17:403\n414#4,8:423\n151#4,6:431\n276#4:451\n133#4:452\n134#4:454\n135#4,7:458\n142#4,9:466\n385#4,6:475\n395#4,2:482\n397#4,17:487\n414#4,8:507\n151#4,6:515\n262#4:533\n230#4,5:534\n58#4:539\n59#4,8:541\n385#4,5:549\n263#4:554\n390#4:555\n395#4,2:557\n397#4,8:562\n405#4,9:573\n414#4,8:585\n68#4,7:593\n265#4:600\n1#5:272\n1#5:369\n1#5:453\n1#5:540\n48#6:284\n53#6:343\n523#6:346\n53#6:355\n523#6:358\n48#6:381\n204#6,11:437\n48#6:465\n492#6,11:521\n53#6:601\n523#6:602\n523#6:603\n53#6:604\n523#6:605\n523#6:606\n261#7:300\n261#7:397\n261#7:481\n261#7:556\n234#8,3:303\n237#8,3:323\n234#8,3:400\n237#8,3:420\n234#8,3:484\n237#8,3:504\n234#8,3:559\n237#8,3:582\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n133#1:340,3\n133#1:344,2\n133#1:347,5\n136#1:352,3\n136#1:356,2\n136#1:359,5\n128#1:267,2\n129#1:274\n129#1:275,2\n154#1:364,2\n155#1:371\n155#1:372,2\n164#1:448,2\n165#1:455\n165#1:456,2\n176#1:570\n176#1:571,2\n129#1:269\n155#1:366\n165#1:450\n176#1:532\n129#1:270\n129#1:271\n129#1:273\n129#1:277,7\n129#1:285,9\n129#1:294,6\n129#1:301,2\n129#1:306,17\n129#1:326,8\n129#1:334,6\n155#1:367\n155#1:368\n155#1:370\n155#1:374,7\n155#1:382,9\n155#1:391,6\n155#1:398,2\n155#1:403,17\n155#1:423,8\n155#1:431,6\n165#1:451\n165#1:452\n165#1:454\n165#1:458,7\n165#1:466,9\n165#1:475,6\n165#1:482,2\n165#1:487,17\n165#1:507,8\n165#1:515,6\n176#1:533\n176#1:534,5\n176#1:539\n176#1:541,8\n176#1:549,5\n176#1:554\n176#1:555\n176#1:557,2\n176#1:562,8\n176#1:573,9\n176#1:585,8\n176#1:593,7\n176#1:600\n129#1:272\n155#1:369\n165#1:453\n176#1:540\n129#1:284\n133#1:343\n133#1:346\n136#1:355\n136#1:358\n155#1:381\n158#1:437,11\n165#1:465\n168#1:521,11\n183#1:601\n185#1:602\n187#1:603\n198#1:604\n200#1:605\n202#1:606\n129#1:300\n155#1:397\n165#1:481\n176#1:556\n129#1:303,3\n129#1:323,3\n155#1:400,3\n155#1:420,3\n165#1:484,3\n165#1:504,3\n176#1:559,3\n176#1:582,3\n*E\n"})
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f17571a = "This function should only be used for 1-D focus search";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f17572b = "ActiveParent must have a focusedChild";

    /* compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17573a;

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
            f17573a = iArr;
        }
    }

    /* compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/c$a;", "", "a", "(Landroidx/compose/ui/layout/c$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<c.a, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f17574b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f17575c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17576d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<FocusTargetNode, Boolean> f17577e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i4, ld.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f17574b = focusTargetNode;
            this.f17575c = focusTargetNode2;
            this.f17576d = i4;
            this.f17577e = lVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l c.a aVar) {
            boolean m4 = s0.m(this.f17574b, this.f17575c, this.f17576d, this.f17577e);
            Boolean valueOf = Boolean.valueOf(m4);
            if (m4 || !aVar.getHasMoreContent()) {
                return valueOf;
            }
            return null;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, ld.l<? super FocusTargetNode, Boolean> lVar) {
        k0 I0 = focusTargetNode.I0();
        int[] iArr = a.f17573a;
        int i4 = iArr[I0.ordinal()];
        if (i4 == 1) {
            FocusTargetNode f4 = q0.f(focusTargetNode);
            if (f4 == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            int i5 = iArr[f4.I0().ordinal()];
            if (i5 != 1) {
                if (i5 == 2 || i5 == 3) {
                    f.INSTANCE.getClass();
                    return f(focusTargetNode, f4, f.f17527d, lVar);
                }
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (!b(f4, lVar)) {
                f.INSTANCE.getClass();
                if (!f(focusTargetNode, f4, f.f17527d, lVar) && (!f4.F7().getCanFocus() || !lVar.invoke(f4).booleanValue())) {
                    return false;
                }
            }
        } else {
            if (i4 == 2 || i4 == 3) {
                return k(focusTargetNode, lVar);
            }
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!k(focusTargetNode, lVar)) {
                if (!(focusTargetNode.F7().getCanFocus() ? lVar.invoke(focusTargetNode).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final <T> void c(androidx.compose.runtime.collection.g<T> gVar, T t4, ld.l<? super T, k2> lVar) {
        boolean z4 = false;
        kotlin.ranges.l lVar2 = new kotlin.ranges.l(0, gVar.getSize() - 1, 1);
        int first = lVar2.getFirst();
        int last = lVar2.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            if (z4) {
                lVar.invoke(gVar.L()[first]);
            }
            if (kotlin.jvm.internal.l0.g(gVar.L()[first], t4)) {
                z4 = true;
            }
            if (first == last) {
                return;
            } else {
                first++;
            }
        }
    }

    private static final <T> void d(androidx.compose.runtime.collection.g<T> gVar, T t4, ld.l<? super T, k2> lVar) {
        boolean z4 = false;
        kotlin.ranges.l lVar2 = new kotlin.ranges.l(0, gVar.getSize() - 1, 1);
        int first = lVar2.getFirst();
        int last = lVar2.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            if (z4) {
                lVar.invoke(gVar.L()[last]);
            }
            if (kotlin.jvm.internal.l0.g(gVar.L()[last], t4)) {
                z4 = true;
            }
            if (last == first) {
                return;
            } else {
                last--;
            }
        }
    }

    private static final boolean e(FocusTargetNode focusTargetNode, ld.l<? super FocusTargetNode, Boolean> lVar) {
        int i4 = a.f17573a[focusTargetNode.I0().ordinal()];
        if (i4 != 1) {
            if (i4 == 2 || i4 == 3) {
                return l(focusTargetNode, lVar);
            }
            if (i4 == 4) {
                return focusTargetNode.F7().getCanFocus() ? lVar.invoke(focusTargetNode).booleanValue() : l(focusTargetNode, lVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode f4 = q0.f(focusTargetNode);
        if (f4 == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (e(f4, lVar)) {
            return true;
        }
        f.INSTANCE.getClass();
        return f(focusTargetNode, f4, f.f17526c, lVar);
    }

    private static final boolean f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i4, ld.l<? super FocusTargetNode, Boolean> lVar) {
        if (m(focusTargetNode, focusTargetNode2, i4, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.b.a(focusTargetNode, i4, new b(focusTargetNode, focusTargetNode2, i4, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static /* synthetic */ void g() {
    }

    private static /* synthetic */ void h() {
    }

    private static final boolean i(FocusTargetNode focusTargetNode) {
        q.d dVar;
        c1 nodes;
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = focusTargetNode.getNode().getParent();
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(focusTargetNode);
        loop0: while (true) {
            dVar = null;
            if (p4 == null) {
                break;
            }
            if ((androidx.compose.ui.focus.a.a(p4) & 1024) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 1024) != 0) {
                        q.d dVar2 = parent;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (dVar2 != null) {
                            if (dVar2 instanceof FocusTargetNode) {
                                dVar = dVar2;
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
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
        return dVar == null;
    }

    public static final boolean j(@fg.l FocusTargetNode focusTargetNode, int i4, @fg.l ld.l<? super FocusTargetNode, Boolean> lVar) {
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (f.l(i4, f.f17526c)) {
            return e(focusTargetNode, lVar);
        }
        companion.getClass();
        if (f.l(i4, f.f17527d)) {
            return b(focusTargetNode, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean k(FocusTargetNode focusTargetNode, ld.l<? super FocusTargetNode, Boolean> lVar) {
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
        gVar.v0(r0.f17570b);
        int size = gVar.getSize();
        if (size > 0) {
            int i5 = size - 1;
            Object[] L = gVar.L();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) L[i5];
                if (q0.g(focusTargetNode2) && b(focusTargetNode2, lVar)) {
                    return true;
                }
                i5--;
            } while (i5 >= 0);
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, ld.l<? super FocusTargetNode, Boolean> lVar) {
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
        gVar.v0(r0.f17570b);
        int size = gVar.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] L = gVar.L();
        int i5 = 0;
        do {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) L[i5];
            if (q0.g(focusTargetNode2) && e(focusTargetNode2, lVar)) {
                return true;
            }
            i5++;
        } while (i5 < size);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i4, ld.l<? super FocusTargetNode, Boolean> lVar) {
        if (focusTargetNode.I0() != k0.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
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
        gVar.v0(r0.f17570b);
        f.Companion companion = f.INSTANCE;
        companion.getClass();
        if (f.l(i4, f.f17526c)) {
            kotlin.ranges.l lVar2 = new kotlin.ranges.l(0, gVar.getSize() - 1, 1);
            int first = lVar2.getFirst();
            int last = lVar2.getLast();
            if (first <= last) {
                boolean z4 = false;
                while (true) {
                    if (z4) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) gVar.L()[first];
                        if (q0.g(focusTargetNode3) && e(focusTargetNode3, lVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.l0.g(gVar.L()[first], focusTargetNode2)) {
                        z4 = true;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
        } else {
            companion.getClass();
            if (!f.l(i4, f.f17527d)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            kotlin.ranges.l lVar3 = new kotlin.ranges.l(0, gVar.getSize() - 1, 1);
            int first2 = lVar3.getFirst();
            int last2 = lVar3.getLast();
            if (first2 <= last2) {
                boolean z5 = false;
                while (true) {
                    if (z5) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) gVar.L()[last2];
                        if (q0.g(focusTargetNode4) && b(focusTargetNode4, lVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.l0.g(gVar.L()[last2], focusTargetNode2)) {
                        z5 = true;
                    }
                    if (last2 == first2) {
                        break;
                    }
                    last2--;
                }
            }
        }
        f.INSTANCE.getClass();
        if (f.l(i4, f.f17526c) || !focusTargetNode.F7().getCanFocus() || i(focusTargetNode)) {
            return false;
        }
        return lVar.invoke(focusTargetNode).booleanValue();
    }
}
