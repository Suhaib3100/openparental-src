package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: NodeKind.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a#\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\fø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\nø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u001a'\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0006*\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b!\u0010\u0010\"\u001a\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b\u0014\u0010\"\u0012\u0004\b#\u0010$\"\u001a\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b\u0018\u0010\"\u0012\u0004\b&\u0010$\"\u001a\u0010)\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b\u001b\u0010\"\u0012\u0004\b(\u0010$\"\u001c\u0010,\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"", "Landroidx/compose/ui/node/g1;", "other", "n", "(II)I", "value", "", "i", "(II)Z", "Landroidx/compose/ui/q$c;", "element", "f", "(Landroidx/compose/ui/q$c;)I", "Landroidx/compose/ui/q$d;", "node", "g", "(Landroidx/compose/ui/q$d;)I", "Lkotlin/k2;", "d", "(Landroidx/compose/ui/q$d;)V", "a", "e", "remainingSet", "phase", "b", "(Landroidx/compose/ui/q$d;II)V", "selfKindSet", "c", "Landroidx/compose/ui/focus/w;", "o", "(Landroidx/compose/ui/focus/w;)V", "p", "(Landroidx/compose/ui/focus/w;)Z", "h", "I", "m", "()V", "Updated", "k", "Inserted", "l", "Removed", "j", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,342:1\n52#1:346\n52#1:348\n52#1:350\n52#1:352\n52#1:354\n52#1:356\n52#1:358\n52#1:360\n52#1:362\n52#1:364\n52#1:367\n52#1:369\n52#1:371\n52#1:373\n52#1:375\n52#1:377\n52#1:379\n52#1:381\n52#1:383\n52#1:385\n52#1:387\n52#1:389\n52#1:391\n52#1:393\n52#1:395\n52#1:397\n52#1:399\n55#1:408\n55#1:411\n55#1:413\n55#1:415\n55#1:417\n55#1:419\n55#1:421\n55#1:423\n84#2:343\n70#2:344\n72#2:345\n74#2:347\n76#2:349\n78#2:351\n80#2:353\n94#2:355\n92#2:357\n86#2:359\n82#2:361\n84#2:363\n70#2:365\n72#2:366\n74#2:368\n76#2:370\n78#2:372\n80#2:374\n82#2:376\n84#2:378\n86#2:380\n88#2:382\n90#2:384\n92#2:386\n94#2:388\n96#2:390\n98#2:392\n101#2:394\n104#2:396\n106#2:398\n72#2:407\n72#2:409\n86#2:410\n74#2:412\n76#2:414\n82#2:416\n90#2:418\n92#2:420\n94#2:422\n90#2:424\n1#3:400\n1#3:427\n234#4,6:401\n234#4,3:458\n237#4,3:478\n234#4,6:495\n276#5:425\n133#5:426\n134#5:428\n135#5,7:432\n142#5,9:440\n385#5,6:449\n395#5,2:456\n397#5,17:461\n414#5,8:481\n151#5,6:489\n1208#6:429\n1187#6,2:430\n48#7:439\n261#8:455\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n113#1:346\n116#1:348\n119#1:350\n122#1:352\n128#1:354\n132#1:356\n136#1:358\n139#1:360\n142#1:362\n148#1:364\n161#1:367\n164#1:369\n167#1:371\n170#1:373\n173#1:375\n176#1:377\n179#1:379\n182#1:381\n185#1:383\n188#1:385\n191#1:387\n194#1:389\n197#1:391\n200#1:393\n203#1:395\n206#1:397\n209#1:399\n257#1:408\n264#1:411\n267#1:413\n270#1:415\n273#1:417\n276#1:419\n285#1:421\n294#1:423\n62#1:343\n111#1:344\n113#1:345\n116#1:347\n119#1:349\n122#1:351\n128#1:353\n132#1:355\n136#1:357\n139#1:359\n142#1:361\n148#1:363\n159#1:365\n161#1:366\n164#1:368\n167#1:370\n170#1:372\n173#1:374\n176#1:376\n179#1:378\n182#1:380\n185#1:382\n188#1:384\n191#1:386\n194#1:388\n197#1:390\n200#1:392\n203#1:394\n206#1:396\n209#1:398\n257#1:407\n260#1:409\n264#1:410\n267#1:412\n270#1:414\n273#1:416\n276#1:418\n285#1:420\n294#1:422\n300#1:424\n300#1:427\n244#1:401,6\n300#1:458,3\n300#1:478,3\n334#1:495,6\n300#1:425\n300#1:426\n300#1:428\n300#1:432,7\n300#1:440,9\n300#1:449,6\n300#1:456,2\n300#1:461,17\n300#1:481,8\n300#1:489,6\n300#1:429\n300#1:430,2\n300#1:439\n300#1:455\n*E\n"})
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f19329a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f19330b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f19331c = 2;

    public static final void a(@fg.l q.d dVar) {
        if (!dVar.getIsAttached()) {
            throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        b(dVar, -1, 1);
    }

    public static final void b(@fg.l q.d dVar, int i4, int i5) {
        if (!(dVar instanceof l)) {
            c(dVar, i4 & dVar.getKindSet(), i5);
            return;
        }
        l lVar = (l) dVar;
        c(dVar, lVar.getSelfKindSet() & i4, i5);
        int i6 = (~lVar.getSelfKindSet()) & i4;
        for (q.d delegate = lVar.getDelegate(); delegate != null; delegate = delegate.getChild()) {
            b(delegate, i6, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(q.d dVar, int i4, int i5) {
        if (i5 != 0 || dVar.b7()) {
            if ((i4 & 2) != 0 && (dVar instanceof c0)) {
                f0.b((c0) dVar);
                if (i5 == 2) {
                    k.m(dVar, 2).r4();
                }
            }
            if ((i4 & 256) != 0 && (dVar instanceof s)) {
                k.p(dVar).S0();
            }
            if ((i4 & 4) != 0 && (dVar instanceof q)) {
                r.a((q) dVar);
            }
            if ((i4 & 8) != 0 && (dVar instanceof y1)) {
                z1.b((y1) dVar);
            }
            if ((i4 & 64) != 0 && (dVar instanceof s1)) {
                t1.a((s1) dVar);
            }
            if ((i4 & 1024) != 0 && (dVar instanceof FocusTargetNode)) {
                if (i5 == 2) {
                    dVar.k7();
                } else {
                    k.q(dVar).getFocusOwner().i((FocusTargetNode) dVar);
                }
            }
            if ((i4 & 2048) != 0 && (dVar instanceof androidx.compose.ui.focus.w)) {
                androidx.compose.ui.focus.w wVar = (androidx.compose.ui.focus.w) dVar;
                if (p(wVar)) {
                    if (i5 == 2) {
                        o(wVar);
                    } else {
                        androidx.compose.ui.focus.x.a(wVar);
                    }
                }
            }
            if ((i4 & 4096) == 0 || !(dVar instanceof androidx.compose.ui.focus.i)) {
                return;
            }
            androidx.compose.ui.focus.j.b((androidx.compose.ui.focus.i) dVar);
        }
    }

    public static final void d(@fg.l q.d dVar) {
        if (!dVar.getIsAttached()) {
            throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        b(dVar, -1, 2);
    }

    public static final void e(@fg.l q.d dVar) {
        if (!dVar.getIsAttached()) {
            throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        b(dVar, -1, 0);
    }

    public static final int f(@fg.l q.c cVar) {
        int i4 = cVar instanceof androidx.compose.ui.layout.b0 ? 3 : 1;
        if (cVar instanceof androidx.compose.ui.draw.k) {
            i4 |= 4;
        }
        if (cVar instanceof androidx.compose.ui.semantics.n) {
            i4 |= 8;
        }
        if (cVar instanceof androidx.compose.ui.input.pointer.i0) {
            i4 |= 16;
        }
        if ((cVar instanceof androidx.compose.ui.modifier.d) || (cVar instanceof androidx.compose.ui.modifier.l)) {
            i4 |= 32;
        }
        if (cVar instanceof androidx.compose.ui.focus.g) {
            i4 |= 4096;
        }
        if (cVar instanceof androidx.compose.ui.focus.p) {
            i4 |= 2048;
        }
        if (cVar instanceof androidx.compose.ui.layout.v0) {
            i4 |= 256;
        }
        if (cVar instanceof androidx.compose.ui.layout.f1) {
            i4 |= 64;
        }
        return ((cVar instanceof androidx.compose.ui.layout.y0) || (cVar instanceof androidx.compose.ui.layout.b1)) ? i4 | 128 : i4;
    }

    public static final int g(@fg.l q.d dVar) {
        if (dVar.getKindSet() != 0) {
            return dVar.getKindSet();
        }
        int i4 = dVar instanceof c0 ? 3 : 1;
        if (dVar instanceof q) {
            i4 |= 4;
        }
        if (dVar instanceof y1) {
            i4 |= 8;
        }
        if (dVar instanceof u1) {
            i4 |= 16;
        }
        if (dVar instanceof androidx.compose.ui.modifier.j) {
            i4 |= 32;
        }
        if (dVar instanceof s1) {
            i4 |= 64;
        }
        if (dVar instanceof b0) {
            i4 |= 128;
        }
        if (dVar instanceof s) {
            i4 |= 256;
        }
        if (dVar instanceof androidx.compose.ui.layout.n) {
            i4 |= 512;
        }
        if (dVar instanceof FocusTargetNode) {
            i4 |= 1024;
        }
        if (dVar instanceof androidx.compose.ui.focus.w) {
            i4 |= 2048;
        }
        if (dVar instanceof androidx.compose.ui.focus.i) {
            i4 |= 4096;
        }
        if (dVar instanceof androidx.compose.ui.input.key.g) {
            i4 |= 8192;
        }
        if (dVar instanceof androidx.compose.ui.input.rotary.b) {
            i4 |= 16384;
        }
        if (dVar instanceof h) {
            i4 |= 32768;
        }
        if (dVar instanceof androidx.compose.ui.input.key.j) {
            i4 |= 131072;
        }
        return dVar instanceof c2 ? i4 | 262144 : i4;
    }

    public static final int h(@fg.l q.d dVar) {
        if (!(dVar instanceof l)) {
            return g(dVar);
        }
        l lVar = (l) dVar;
        int selfKindSet = lVar.getSelfKindSet();
        for (q.d delegate = lVar.getDelegate(); delegate != null; delegate = delegate.getChild()) {
            selfKindSet |= h(delegate);
        }
        return selfKindSet;
    }

    public static final boolean i(int i4, int i5) {
        return (i4 & i5) != 0;
    }

    public static final boolean j(int i4) {
        return (i4 & 128) != 0;
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    public static final int n(int i4, int i5) {
        return i4 | i5;
    }

    private static final void o(androidx.compose.ui.focus.w wVar) {
        if (!wVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = wVar.getNode().getChild();
        if (child == null) {
            k.c(gVar, wVar.getNode());
        } else {
            gVar.b(child);
        }
        while (gVar.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
            if ((dVar.getAggregateChildKindSet() & 1024) == 0) {
                k.c(gVar, dVar);
            } else {
                while (true) {
                    if (dVar == null) {
                        break;
                    }
                    if ((dVar.getKindSet() & 1024) != 0) {
                        androidx.compose.runtime.collection.g gVar2 = null;
                        while (dVar != null) {
                            if (dVar instanceof FocusTargetNode) {
                                androidx.compose.ui.focus.n0.c((FocusTargetNode) dVar);
                            } else if ((dVar.getKindSet() & 1024) != 0 && (dVar instanceof l)) {
                                int i4 = 0;
                                for (q.d delegate = ((l) dVar).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            dVar = delegate;
                                        } else {
                                            if (gVar2 == null) {
                                                gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (dVar != null) {
                                                gVar2.b(dVar);
                                                dVar = null;
                                            }
                                            gVar2.b(delegate);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            dVar = k.l(gVar2);
                        }
                    } else {
                        dVar = dVar.getChild();
                    }
                }
            }
        }
    }

    private static final boolean p(androidx.compose.ui.focus.w wVar) {
        e eVar = e.f19227a;
        eVar.b();
        wVar.V3(eVar);
        return eVar.a();
    }
}
