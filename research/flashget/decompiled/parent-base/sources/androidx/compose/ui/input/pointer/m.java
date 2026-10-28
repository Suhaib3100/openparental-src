package androidx.compose.ui.input.pointer;

import androidx.collection.e1;
import androidx.compose.ui.node.u1;
import androidx.compose.ui.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: HitPathTracker.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u001b\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\u001f\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00108R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020=0<8\u0006¢\u0006\f\n\u0004\b)\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/ui/input/pointer/m;", "Landroidx/compose/ui/input/pointer/n;", "Landroidx/compose/ui/q$d;", "modifierNode", "<init>", "(Landroidx/compose/ui/q$d;)V", "Landroidx/compose/ui/input/pointer/p;", "oldEvent", "newEvent", "", "n", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/p;)Z", "Lkotlin/k2;", "i", "()V", "Lkotlin/Function0;", "block", "j", "(Lld/a;)Z", "Landroidx/collection/e1;", "Landroidx/compose/ui/input/pointer/b0;", "changes", "Landroidx/compose/ui/layout/u;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/h;", "internalPointerEvent", "isInBounds", "f", "(Landroidx/collection/e1;Landroidx/compose/ui/layout/u;Landroidx/compose/ui/input/pointer/h;Z)Z", "e", "(Landroidx/compose/ui/input/pointer/h;)Z", "a", "d", "o", "b", "(Landroidx/compose/ui/input/pointer/h;)V", "", "toString", "()Ljava/lang/String;", "c", "Landroidx/compose/ui/q$d;", "k", "()Landroidx/compose/ui/q$d;", "Lm0/b;", "Lm0/b;", "l", "()Lm0/b;", "pointerIds", "Landroidx/collection/e1;", "relevantChanges", "Landroidx/compose/ui/layout/u;", "coordinates", "g", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "h", "Z", "wasIn", "isIn", "hasExited", "Landroidx/compose/runtime/collection/g;", "", "Landroidx/compose/runtime/collection/g;", "m", "()Landroidx/compose/runtime/collection/g;", "vec", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n*L\n1#1,554:1\n500#1,5:558\n507#1:662\n500#1,5:663\n507#1:723\n1208#2:555\n1187#2,2:556\n1208#2:584\n1187#2,2:585\n1208#2:639\n1187#2,2:640\n1208#2:689\n1187#2,2:690\n1208#2:745\n1187#2,2:746\n1208#2:816\n1187#2,2:817\n78#3:563\n78#3:618\n78#3:668\n78#3:724\n78#3:795\n385#4,6:564\n395#4,2:571\n397#4,8:576\n405#4,9:587\n414#4,8:599\n385#4,6:619\n395#4,2:626\n397#4,8:631\n405#4,9:642\n414#4,8:654\n385#4,6:669\n395#4,2:676\n397#4,8:681\n405#4,9:692\n414#4,8:704\n385#4,6:725\n395#4,2:732\n397#4,8:737\n405#4,9:748\n414#4,8:760\n385#4,6:796\n395#4,2:803\n397#4,8:808\n405#4,9:819\n414#4,8:831\n261#5:570\n261#5:625\n261#5:675\n261#5:731\n261#5:802\n234#6,3:573\n237#6,3:596\n234#6,3:628\n237#6,3:651\n234#6,3:678\n237#6,3:701\n234#6,3:734\n237#6,3:757\n234#6,3:805\n237#6,3:828\n460#7,11:607\n460#7,11:712\n460#7,11:784\n33#8,6:768\n116#8,2:775\n33#8,6:777\n118#8:783\n33#8,6:839\n178#9:774\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:558,5\n292#1:662\n330#1:663,5\n330#1:723\n279#1:555\n279#1:556,2\n296#1:584\n296#1:585,2\n316#1:639\n316#1:640,2\n334#1:689\n334#1:690,2\n373#1:745\n373#1:746,2\n519#1:816\n519#1:817,2\n296#1:563\n316#1:618\n334#1:668\n373#1:724\n519#1:795\n296#1:564,6\n296#1:571,2\n296#1:576,8\n296#1:587,9\n296#1:599,8\n316#1:619,6\n316#1:626,2\n316#1:631,8\n316#1:642,9\n316#1:654,8\n334#1:669,6\n334#1:676,2\n334#1:681,8\n334#1:692,9\n334#1:704,8\n373#1:725,6\n373#1:732,2\n373#1:737,8\n373#1:748,9\n373#1:760,8\n519#1:796,6\n519#1:803,2\n519#1:808,8\n519#1:819,9\n519#1:831,8\n296#1:570\n316#1:625\n334#1:675\n373#1:731\n519#1:802\n296#1:573,3\n296#1:596,3\n316#1:628,3\n316#1:651,3\n334#1:678,3\n334#1:701,3\n373#1:734,3\n373#1:757,3\n519#1:805,3\n519#1:828,3\n302#1:607,11\n340#1:712,11\n518#1:784,11\n386#1:768,6\n429#1:775,2\n429#1:777,6\n429#1:783\n535#1:839,6\n417#1:774\n*E\n"})
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: l, reason: collision with root package name */
    public static final int f18773l = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q.d modifierNode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u coordinates;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p pointerEvent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean wasIn;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0.b pointerIds = new m0.b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e1<b0> relevantChanges = new e1<>(2);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isIn = true;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean hasExited = true;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<Long> vec = new androidx.compose.runtime.collection.g<>(new Long[16], 0);

    public m(@fg.l q.d dVar) {
        this.modifierNode = dVar;
    }

    private final void i() {
        this.relevantChanges.c();
        this.coordinates = null;
    }

    private final boolean j(ld.a<k2> block) {
        if (this.relevantChanges.n() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        block.invoke();
        return true;
    }

    private final boolean n(p oldEvent, p newEvent) {
        if (oldEvent == null || oldEvent.e().size() != newEvent.e().size()) {
            return true;
        }
        int size = newEvent.e().size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!i0.f.l(oldEvent.e().get(i4).getPosition(), newEvent.e().get(i4).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f0, code lost:
    
        if (androidx.compose.ui.input.pointer.t.k(r3, androidx.compose.ui.input.pointer.t.f18829h) != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bd  */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // androidx.compose.ui.input.pointer.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(@fg.l androidx.collection.e1<androidx.compose.ui.input.pointer.b0> r33, @fg.l androidx.compose.ui.layout.u r34, @fg.l androidx.compose.ui.input.pointer.h r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.m.a(androidx.collection.e1, androidx.compose.ui.layout.u, androidx.compose.ui.input.pointer.h, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.n
    public void b(@fg.l h internalPointerEvent) {
        super.b(internalPointerEvent);
        p pVar = this.pointerEvent;
        if (pVar == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<b0> e4 = pVar.e();
        int size = e4.size();
        for (int i4 = 0; i4 < size; i4++) {
            b0 b0Var = e4.get(i4);
            if (!b0Var.getPressed() && (!internalPointerEvent.e(b0Var.getId()) || !this.isIn)) {
                this.pointerIds.j(b0Var.getId());
            }
        }
        this.isIn = false;
        int type = pVar.getType();
        t.INSTANCE.getClass();
        this.hasExited = t.k(type, t.f18829h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.compose.ui.input.pointer.n
    public void d() {
        androidx.compose.runtime.collection.g<m> g4 = g();
        int size = g4.getSize();
        if (size > 0) {
            m[] L = g4.L();
            int i4 = 0;
            do {
                L[i4].d();
                i4++;
            } while (i4 < size);
        }
        androidx.compose.ui.node.l lVar = this.modifierNode;
        androidx.compose.runtime.collection.g gVar = null;
        while (lVar != 0) {
            if (lVar instanceof u1) {
                ((u1) lVar).E4();
            } else if ((lVar.getKindSet() & 16) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                q.d delegate = lVar.getDelegate();
                int i5 = 0;
                lVar = lVar;
                while (delegate != null) {
                    if ((delegate.getKindSet() & 16) != 0) {
                        i5++;
                        if (i5 == 1) {
                            lVar = delegate;
                        } else {
                            if (gVar == null) {
                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                            }
                            if (lVar != 0) {
                                gVar.b(lVar);
                                lVar = 0;
                            }
                            gVar.b(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    lVar = lVar;
                }
                if (i5 == 1) {
                }
            }
            lVar = androidx.compose.ui.node.k.l(gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.input.pointer.n
    public boolean e(@fg.l h internalPointerEvent) {
        androidx.compose.runtime.collection.g<m> g4;
        int size;
        boolean z4 = false;
        int i4 = 0;
        z4 = false;
        if (!this.relevantChanges.n() && this.modifierNode.getIsAttached()) {
            p pVar = this.pointerEvent;
            kotlin.jvm.internal.l0.m(pVar);
            androidx.compose.ui.layout.u uVar = this.coordinates;
            kotlin.jvm.internal.l0.m(uVar);
            long c5 = uVar.c();
            androidx.compose.ui.node.l lVar = this.modifierNode;
            androidx.compose.runtime.collection.g gVar = null;
            while (lVar != 0) {
                if (lVar instanceof u1) {
                    ((u1) lVar).g1(pVar, r.Final, c5);
                } else if ((lVar.getKindSet() & 16) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                    q.d delegate = lVar.getDelegate();
                    int i5 = 0;
                    lVar = lVar;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & 16) != 0) {
                            i5++;
                            if (i5 == 1) {
                                lVar = delegate;
                            } else {
                                if (gVar == null) {
                                    gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                }
                                if (lVar != 0) {
                                    gVar.b(lVar);
                                    lVar = 0;
                                }
                                gVar.b(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        lVar = lVar;
                    }
                    if (i5 == 1) {
                    }
                }
                lVar = androidx.compose.ui.node.k.l(gVar);
            }
            if (this.modifierNode.getIsAttached() && (size = (g4 = g()).getSize()) > 0) {
                m[] L = g4.L();
                do {
                    L[i4].e(internalPointerEvent);
                    i4++;
                } while (i4 < size);
            }
            z4 = true;
        }
        b(internalPointerEvent);
        i();
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    @Override // androidx.compose.ui.input.pointer.n
    public boolean f(@fg.l e1<b0> changes, @fg.l androidx.compose.ui.layout.u parentCoordinates, @fg.l h internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.g<m> g4;
        int size;
        if (this.relevantChanges.n() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        p pVar = this.pointerEvent;
        kotlin.jvm.internal.l0.m(pVar);
        androidx.compose.ui.layout.u uVar = this.coordinates;
        kotlin.jvm.internal.l0.m(uVar);
        long c5 = uVar.c();
        androidx.compose.ui.node.l lVar = this.modifierNode;
        androidx.compose.runtime.collection.g gVar = null;
        while (lVar != 0) {
            if (lVar instanceof u1) {
                ((u1) lVar).g1(pVar, r.Initial, c5);
            } else if ((lVar.getKindSet() & 16) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                q.d delegate = lVar.getDelegate();
                int i4 = 0;
                lVar = lVar;
                while (delegate != null) {
                    if ((delegate.getKindSet() & 16) != 0) {
                        i4++;
                        if (i4 == 1) {
                            lVar = delegate;
                        } else {
                            if (gVar == null) {
                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                            }
                            if (lVar != 0) {
                                gVar.b(lVar);
                                lVar = 0;
                            }
                            gVar.b(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    lVar = lVar;
                }
                if (i4 == 1) {
                }
            }
            lVar = androidx.compose.ui.node.k.l(gVar);
        }
        if (this.modifierNode.getIsAttached() && (size = (g4 = g()).getSize()) > 0) {
            m[] L = g4.L();
            int i5 = 0;
            do {
                m mVar = L[i5];
                e1<b0> e1Var = this.relevantChanges;
                androidx.compose.ui.layout.u uVar2 = this.coordinates;
                kotlin.jvm.internal.l0.m(uVar2);
                mVar.f(e1Var, uVar2, internalPointerEvent, isInBounds);
                i5++;
            } while (i5 < size);
        }
        if (this.modifierNode.getIsAttached()) {
            androidx.compose.ui.node.l lVar2 = this.modifierNode;
            androidx.compose.runtime.collection.g gVar2 = null;
            while (lVar2 != 0) {
                if (lVar2 instanceof u1) {
                    ((u1) lVar2).g1(pVar, r.Main, c5);
                } else if ((lVar2.getKindSet() & 16) != 0 && (lVar2 instanceof androidx.compose.ui.node.l)) {
                    q.d delegate2 = lVar2.getDelegate();
                    int i6 = 0;
                    lVar2 = lVar2;
                    while (delegate2 != null) {
                        if ((delegate2.getKindSet() & 16) != 0) {
                            i6++;
                            if (i6 == 1) {
                                lVar2 = delegate2;
                            } else {
                                if (gVar2 == null) {
                                    gVar2 = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                }
                                if (lVar2 != 0) {
                                    gVar2.b(lVar2);
                                    lVar2 = 0;
                                }
                                gVar2.b(delegate2);
                            }
                        }
                        delegate2 = delegate2.getChild();
                        lVar2 = lVar2;
                    }
                    if (i6 == 1) {
                    }
                }
                lVar2 = androidx.compose.ui.node.k.l(gVar2);
            }
        }
        return true;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final q.d getModifierNode() {
        return this.modifierNode;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final m0.b getPointerIds() {
        return this.pointerIds;
    }

    @fg.l
    public final androidx.compose.runtime.collection.g<Long> m() {
        return this.vec;
    }

    public final void o() {
        this.isIn = true;
    }

    @fg.l
    public String toString() {
        return "Node(pointerInputFilter=" + this.modifierNode + ", children=" + g() + ", pointerIds=" + this.pointerIds + ')';
    }
}
