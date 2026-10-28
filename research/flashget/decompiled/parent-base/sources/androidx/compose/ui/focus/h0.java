package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: FocusRestorer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a%\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\f\n\u0004\b\t\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "d", "Landroidx/compose/ui/q;", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/a0;", "onRestoreFailed", "a", "(Landroidx/compose/ui/q;Lld/a;)Landroidx/compose/ui/q;", "", "Ljava/lang/String;", "c", "()V", "PrevFocusedChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusRestorer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,122:1\n90#2:123\n90#2:194\n276#3:124\n133#3:125\n134#3:127\n135#3,7:131\n142#3,9:139\n385#3,6:148\n395#3,2:155\n397#3,17:160\n414#3,8:180\n151#3,6:188\n276#3:195\n133#3:196\n134#3:198\n135#3,7:202\n142#3,9:210\n385#3,6:219\n395#3,2:226\n397#3,17:231\n414#3,8:251\n151#3,6:259\n1#4:126\n1#4:197\n1208#5:128\n1187#5,2:129\n1208#5:199\n1187#5,2:200\n48#6:138\n48#6:209\n261#7:154\n261#7:225\n234#8,3:157\n237#8,3:177\n234#8,3:228\n237#8,3:248\n*S KotlinDebug\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n*L\n35#1:123\n55#1:194\n35#1:124\n35#1:125\n35#1:127\n35#1:131,7\n35#1:139,9\n35#1:148,6\n35#1:155,2\n35#1:160,17\n35#1:180,8\n35#1:188,6\n55#1:195\n55#1:196\n55#1:198\n55#1:202,7\n55#1:210,9\n55#1:219,6\n55#1:226,2\n55#1:231,17\n55#1:251,8\n55#1:259,6\n35#1:126\n55#1:197\n35#1:128\n35#1:129,2\n55#1:199\n55#1:200,2\n35#1:138\n55#1:209\n35#1:154\n55#1:225\n35#1:157,3\n35#1:177,3\n55#1:228,3\n55#1:248,3\n*E\n"})
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f17537a = "previouslyFocusedChildHash";

    /* compiled from: FocusRestorer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f17538b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FocusTargetNode focusTargetNode) {
            super(0);
            this.f17538b = focusTargetNode;
        }

        @Override // ld.a
        @fg.m
        public final Object invoke() {
            return Integer.valueOf(this.f17538b.getPreviouslyFocusedChildHash());
        }
    }

    @fg.l
    @androidx.compose.ui.k
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m ld.a<a0> aVar) {
        return qVar.w3(new FocusRestorerElement(aVar));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        return a(qVar, aVar);
    }

    private static /* synthetic */ void c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0053, code lost:
    
        continue;
     */
    @androidx.compose.ui.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(@fg.l androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            int r0 = r10.getPreviouslyFocusedChildHash()
            if (r0 != 0) goto L23
            androidx.compose.runtime.a3 r0 = androidx.compose.runtime.saveable.k.b()
            java.lang.Object r0 = androidx.compose.ui.node.i.a(r10, r0)
            androidx.compose.runtime.saveable.i r0 = (androidx.compose.runtime.saveable.i) r0
            if (r0 == 0) goto L23
            java.lang.String r1 = "previouslyFocusedChildHash"
            java.lang.Object r0 = r0.f(r1)
            if (r0 == 0) goto L23
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r10.M7(r0)
        L23:
            int r0 = r10.getPreviouslyFocusedChildHash()
            r1 = 0
            if (r0 != 0) goto L2b
            return r1
        L2b:
            androidx.compose.ui.q$d r0 = r10.getNode()
            boolean r0 = r0.getIsAttached()
            if (r0 == 0) goto Le5
            androidx.compose.runtime.collection.g r0 = new androidx.compose.runtime.collection.g
            r2 = 16
            androidx.compose.ui.q$d[] r3 = new androidx.compose.ui.q.d[r2]
            r0.<init>(r3, r1)
            androidx.compose.ui.q$d r3 = r10.getNode()
            androidx.compose.ui.q$d r3 = r3.getChild()
            if (r3 != 0) goto L50
            androidx.compose.ui.q$d r3 = r10.getNode()
            androidx.compose.ui.node.k.a(r0, r3)
            goto L53
        L50:
            r0.b(r3)
        L53:
            boolean r3 = r0.V()
            if (r3 == 0) goto Le4
            r3 = 1
            java.lang.Object r4 = androidx.compose.foundation.gestures.i.a(r0, r3)
            androidx.compose.ui.q$d r4 = (androidx.compose.ui.q.d) r4
            int r5 = r4.getAggregateChildKindSet()
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L6c
            androidx.compose.ui.node.k.a(r0, r4)
            goto L53
        L6c:
            if (r4 == 0) goto L53
            int r5 = r4.getKindSet()
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto Ldf
            r5 = 0
            r6 = r5
        L78:
            if (r4 == 0) goto L53
            boolean r7 = r4 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L9c
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.ui.focus.FocusTargetNode) r4
            androidx.compose.ui.node.h0 r7 = androidx.compose.ui.node.k.p(r4)
            int r7 = r7.getCompositeKeyHash()
            int r8 = r10.getPreviouslyFocusedChildHash()
            if (r7 != r8) goto Lda
            boolean r10 = d(r4)
            if (r10 != 0) goto L9a
            boolean r10 = androidx.compose.ui.focus.p0.m(r4)
            if (r10 == 0) goto L9b
        L9a:
            r1 = r3
        L9b:
            return r1
        L9c:
            int r7 = r4.getKindSet()
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto Lda
            boolean r7 = r4 instanceof androidx.compose.ui.node.l
            if (r7 == 0) goto Lda
            r7 = r4
            androidx.compose.ui.node.l r7 = (androidx.compose.ui.node.l) r7
            androidx.compose.ui.q$d r7 = r7.getDelegate()
            r8 = r1
        Lb0:
            if (r7 == 0) goto Ld7
            int r9 = r7.getKindSet()
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto Ld2
            int r8 = r8 + 1
            if (r8 != r3) goto Lc0
            r4 = r7
            goto Ld2
        Lc0:
            if (r6 != 0) goto Lc9
            androidx.compose.runtime.collection.g r6 = new androidx.compose.runtime.collection.g
            androidx.compose.ui.q$d[] r9 = new androidx.compose.ui.q.d[r2]
            r6.<init>(r9, r1)
        Lc9:
            if (r4 == 0) goto Lcf
            r6.b(r4)
            r4 = r5
        Lcf:
            r6.b(r7)
        Ld2:
            androidx.compose.ui.q$d r7 = r7.getChild()
            goto Lb0
        Ld7:
            if (r8 != r3) goto Lda
            goto L78
        Lda:
            androidx.compose.ui.q$d r4 = androidx.compose.ui.node.k.b(r6)
            goto L78
        Ldf:
            androidx.compose.ui.q$d r4 = r4.getChild()
            goto L6c
        Le4:
            return r1
        Le5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.h0.d(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0034, code lost:
    
        continue;
     */
    @androidx.compose.ui.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(@fg.l androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.focus.k0 r0 = r10.I0()
            boolean r0 = r0.getHasFocus()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            androidx.compose.ui.q$d r0 = r10.getNode()
            boolean r0 = r0.getIsAttached()
            if (r0 == 0) goto Ld7
            androidx.compose.runtime.collection.g r0 = new androidx.compose.runtime.collection.g
            r2 = 16
            androidx.compose.ui.q$d[] r3 = new androidx.compose.ui.q.d[r2]
            r0.<init>(r3, r1)
            androidx.compose.ui.q$d r3 = r10.getNode()
            androidx.compose.ui.q$d r3 = r3.getChild()
            if (r3 != 0) goto L31
            androidx.compose.ui.q$d r3 = r10.getNode()
            androidx.compose.ui.node.k.a(r0, r3)
            goto L34
        L31:
            r0.b(r3)
        L34:
            boolean r3 = r0.V()
            if (r3 == 0) goto Ld6
            r3 = 1
            java.lang.Object r4 = androidx.compose.foundation.gestures.i.a(r0, r3)
            androidx.compose.ui.q$d r4 = (androidx.compose.ui.q.d) r4
            int r5 = r4.getAggregateChildKindSet()
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L4d
            androidx.compose.ui.node.k.a(r0, r4)
            goto L34
        L4d:
            if (r4 == 0) goto L34
            int r5 = r4.getKindSet()
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto Ld0
            r5 = 0
            r6 = r5
        L59:
            if (r4 == 0) goto L34
            boolean r7 = r4 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L8d
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.ui.focus.FocusTargetNode) r4
            androidx.compose.ui.focus.k0 r7 = r4.I0()
            boolean r7 = r7.getHasFocus()
            if (r7 == 0) goto Lcb
            androidx.compose.ui.node.h0 r0 = androidx.compose.ui.node.k.p(r4)
            int r0 = r0.getCompositeKeyHash()
            r10.M7(r0)
            androidx.compose.runtime.a3 r0 = androidx.compose.runtime.saveable.k.b()
            java.lang.Object r0 = androidx.compose.ui.node.i.a(r10, r0)
            androidx.compose.runtime.saveable.i r0 = (androidx.compose.runtime.saveable.i) r0
            if (r0 == 0) goto L8c
            androidx.compose.ui.focus.h0$a r1 = new androidx.compose.ui.focus.h0$a
            r1.<init>(r10)
            java.lang.String r10 = "previouslyFocusedChildHash"
            r0.c(r10, r1)
        L8c:
            return r3
        L8d:
            int r7 = r4.getKindSet()
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto Lcb
            boolean r7 = r4 instanceof androidx.compose.ui.node.l
            if (r7 == 0) goto Lcb
            r7 = r4
            androidx.compose.ui.node.l r7 = (androidx.compose.ui.node.l) r7
            androidx.compose.ui.q$d r7 = r7.getDelegate()
            r8 = r1
        La1:
            if (r7 == 0) goto Lc8
            int r9 = r7.getKindSet()
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto Lc3
            int r8 = r8 + 1
            if (r8 != r3) goto Lb1
            r4 = r7
            goto Lc3
        Lb1:
            if (r6 != 0) goto Lba
            androidx.compose.runtime.collection.g r6 = new androidx.compose.runtime.collection.g
            androidx.compose.ui.q$d[] r9 = new androidx.compose.ui.q.d[r2]
            r6.<init>(r9, r1)
        Lba:
            if (r4 == 0) goto Lc0
            r6.b(r4)
            r4 = r5
        Lc0:
            r6.b(r7)
        Lc3:
            androidx.compose.ui.q$d r7 = r7.getChild()
            goto La1
        Lc8:
            if (r8 != r3) goto Lcb
            goto L59
        Lcb:
            androidx.compose.ui.q$d r4 = androidx.compose.ui.node.k.b(r6)
            goto L59
        Ld0:
            androidx.compose.ui.q$d r4 = r4.getChild()
            goto L4d
        Ld6:
            return r1
        Ld7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.h0.e(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }
}
