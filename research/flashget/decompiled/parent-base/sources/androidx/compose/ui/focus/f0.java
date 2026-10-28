package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: FocusRequesterModifierNode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"Landroidx/compose/ui/focus/e0;", "", "c", "(Landroidx/compose/ui/focus/e0;)Z", "a", "b", "e", "d", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusRequesterModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,131:1\n90#2:132\n90#2:242\n90#2:352\n90#2:462\n90#2:572\n282#3:133\n385#3,6:134\n395#3,2:141\n397#3,8:146\n405#3,9:157\n414#3,8:169\n283#3:177\n133#3:178\n134#3,8:180\n142#3,9:189\n385#3,37:198\n151#3,6:235\n284#3:241\n282#3:243\n385#3,6:244\n395#3,2:251\n397#3,8:256\n405#3,9:267\n414#3,8:279\n283#3:287\n133#3:288\n134#3,8:290\n142#3,9:299\n385#3,37:308\n151#3,6:345\n284#3:351\n282#3:353\n385#3,6:354\n395#3,2:361\n397#3,8:366\n405#3,9:377\n414#3,8:389\n283#3:397\n133#3:398\n134#3,8:400\n142#3,9:409\n385#3,37:418\n151#3,6:455\n284#3:461\n282#3:463\n385#3,6:464\n395#3,2:471\n397#3,8:476\n405#3,9:487\n414#3,8:499\n283#3:507\n133#3:508\n134#3,8:510\n142#3,9:519\n385#3,37:528\n151#3,6:565\n284#3:571\n282#3:573\n385#3,6:574\n395#3,2:581\n397#3,8:586\n405#3,9:597\n414#3,8:609\n283#3:617\n133#3:618\n134#3,8:620\n142#3,9:629\n385#3,37:638\n151#3,6:675\n284#3:681\n261#4:140\n261#4:250\n261#4:360\n261#4:470\n261#4:580\n234#5,3:143\n237#5,3:166\n234#5,3:253\n237#5,3:276\n234#5,3:363\n237#5,3:386\n234#5,3:473\n237#5,3:496\n234#5,3:583\n237#5,3:606\n1208#6:154\n1187#6,2:155\n1208#6:264\n1187#6,2:265\n1208#6:374\n1187#6,2:375\n1208#6:484\n1187#6,2:485\n1208#6:594\n1187#6,2:595\n1#7:179\n1#7:289\n1#7:399\n1#7:509\n1#7:619\n48#8:188\n48#8:298\n48#8:408\n48#8:518\n48#8:628\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n*L\n40#1:132\n69#1:242\n92#1:352\n108#1:462\n126#1:572\n40#1:133\n40#1:134,6\n40#1:141,2\n40#1:146,8\n40#1:157,9\n40#1:169,8\n40#1:177\n40#1:178\n40#1:180,8\n40#1:189,9\n40#1:198,37\n40#1:235,6\n40#1:241\n69#1:243\n69#1:244,6\n69#1:251,2\n69#1:256,8\n69#1:267,9\n69#1:279,8\n69#1:287\n69#1:288\n69#1:290,8\n69#1:299,9\n69#1:308,37\n69#1:345,6\n69#1:351\n92#1:353\n92#1:354,6\n92#1:361,2\n92#1:366,8\n92#1:377,9\n92#1:389,8\n92#1:397\n92#1:398\n92#1:400,8\n92#1:409,9\n92#1:418,37\n92#1:455,6\n92#1:461\n108#1:463\n108#1:464,6\n108#1:471,2\n108#1:476,8\n108#1:487,9\n108#1:499,8\n108#1:507\n108#1:508\n108#1:510,8\n108#1:519,9\n108#1:528,37\n108#1:565,6\n108#1:571\n126#1:573\n126#1:574,6\n126#1:581,2\n126#1:586,8\n126#1:597,9\n126#1:609,8\n126#1:617\n126#1:618\n126#1:620,8\n126#1:629,9\n126#1:638,37\n126#1:675,6\n126#1:681\n40#1:140\n69#1:250\n92#1:360\n108#1:470\n126#1:580\n40#1:143,3\n40#1:166,3\n69#1:253,3\n69#1:276,3\n92#1:363,3\n92#1:386,3\n108#1:473,3\n108#1:496,3\n126#1:583,3\n126#1:606,3\n40#1:154\n40#1:155,2\n69#1:264\n69#1:265,2\n92#1:374\n92#1:375,2\n108#1:484\n108#1:485,2\n126#1:594\n126#1:595,2\n40#1:179\n69#1:289\n92#1:399\n108#1:509\n126#1:619\n40#1:188\n69#1:298\n92#1:408\n108#1:518\n126#1:628\n*E\n"})
/* loaded from: classes.dex */
public final class f0 {

    /* compiled from: FocusRequesterModifierNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<FocusTargetNode, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17535b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(p0.m(focusTargetNode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0082, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(@fg.l androidx.compose.ui.focus.e0 r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.f0.a(androidx.compose.ui.focus.e0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0082, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(@fg.l androidx.compose.ui.focus.e0 r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.f0.b(androidx.compose.ui.focus.e0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x009a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(@fg.l androidx.compose.ui.focus.e0 r9) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.f0.c(androidx.compose.ui.focus.e0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0082, code lost:
    
        continue;
     */
    @androidx.compose.ui.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(@fg.l androidx.compose.ui.focus.e0 r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.f0.d(androidx.compose.ui.focus.e0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0082, code lost:
    
        continue;
     */
    @androidx.compose.ui.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(@fg.l androidx.compose.ui.focus.e0 r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.f0.e(androidx.compose.ui.focus.e0):boolean");
    }
}
