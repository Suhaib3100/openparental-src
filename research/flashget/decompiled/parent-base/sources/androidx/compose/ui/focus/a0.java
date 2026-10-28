package androidx.compose.ui.focus;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: FocusRequester.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0083\b¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\rR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/focus/a0;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "", "onFound", "d", "(Lld/l;)Z", "Lkotlin/k2;", "h", "e", "()Z", "c", "f", "j", "i", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/ui/focus/e0;", "a", "Landroidx/compose/runtime/collection/g;", "g", "()Landroidx/compose/runtime/collection/g;", "focusRequesterNodes", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,252:1\n237#1:256\n238#1,4:258\n242#1:269\n243#1,5:299\n248#1:345\n249#1:350\n1208#2:253\n1187#2,2:254\n1208#2:274\n1187#2,2:275\n1208#2:408\n1187#2,2:409\n1#3:257\n1#3:351\n1#3:406\n460#4,7:262\n48#4:284\n467#4,4:346\n460#4,11:352\n460#4,11:363\n460#4,11:374\n460#4,11:385\n460#4,7:396\n48#4:418\n467#4,4:474\n90#5:270\n90#5:403\n276#6:271\n133#6,2:272\n135#6,7:277\n142#6,9:285\n385#6,5:294\n390#6:304\n395#6,2:306\n397#6,17:311\n414#6,8:331\n151#6,6:339\n276#6:404\n133#6:405\n134#6:407\n135#6,7:411\n142#6,9:419\n385#6,6:428\n395#6,2:435\n397#6,17:440\n414#6,8:460\n151#6,6:468\n261#7:305\n261#7:434\n234#8,3:308\n237#8,3:328\n234#8,3:437\n237#8,3:457\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n71#1:256\n71#1:258,4\n71#1:269\n71#1:299,5\n71#1:345\n71#1:350\n55#1:253\n55#1:254,2\n71#1:274\n71#1:275,2\n242#1:408\n242#1:409,2\n71#1:257\n242#1:406\n71#1:262,7\n71#1:284\n71#1:346,4\n100#1:352,11\n124#1:363,11\n145#1:374,11\n165#1:385,11\n241#1:396,7\n242#1:418\n241#1:474,4\n71#1:270\n242#1:403\n71#1:271\n71#1:272,2\n71#1:277,7\n71#1:285,9\n71#1:294,5\n71#1:304\n71#1:306,2\n71#1:311,17\n71#1:331,8\n71#1:339,6\n242#1:404\n242#1:405\n242#1:407\n242#1:411,7\n242#1:419,9\n242#1:428,6\n242#1:435,2\n242#1:440,17\n242#1:460,8\n242#1:468,6\n71#1:305\n242#1:434\n71#1:308,3\n71#1:328,3\n242#1:437,3\n242#1:457,3\n*E\n"})
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f17514c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<e0> focusRequesterNodes = new androidx.compose.runtime.collection.g<>(new e0[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final a0 f17515d = new a0();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final a0 f17516e = new a0();

    /* compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078GX\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/a0$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/a0$a$a;", "a", "()Landroidx/compose/ui/focus/a0$a$a;", "Landroidx/compose/ui/focus/a0;", "Cancel", "Landroidx/compose/ui/focus/a0;", "b", "()Landroidx/compose/ui/focus/a0;", "c", "Default", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.a0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: FocusRequester.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/a0$a$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/a0;", "a", "()Landroidx/compose/ui/focus/a0;", "i", "j", "k", "l", "m", "n", "o", "p", "b", "c", "d", "e", "f", "g", "h", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @androidx.compose.runtime.internal.u(parameters = 1)
        @androidx.compose.ui.k
        /* renamed from: androidx.compose.ui.focus.a0$a$a, reason: collision with other inner class name */
        public static final class C0328a {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final C0328a f17518a = new C0328a();

            /* renamed from: b, reason: collision with root package name */
            public static final int f17519b = 0;

            private C0328a() {
            }

            @fg.l
            public final a0 a() {
                return new a0();
            }

            @fg.l
            public final a0 b() {
                return new a0();
            }

            @fg.l
            public final a0 c() {
                return new a0();
            }

            @fg.l
            public final a0 d() {
                return new a0();
            }

            @fg.l
            public final a0 e() {
                return new a0();
            }

            @fg.l
            public final a0 f() {
                return new a0();
            }

            @fg.l
            public final a0 g() {
                return new a0();
            }

            @fg.l
            public final a0 h() {
                return new a0();
            }

            @fg.l
            public final a0 i() {
                return new a0();
            }

            @fg.l
            public final a0 j() {
                return new a0();
            }

            @fg.l
            public final a0 k() {
                return new a0();
            }

            @fg.l
            public final a0 l() {
                return new a0();
            }

            @fg.l
            public final a0 m() {
                return new a0();
            }

            @fg.l
            public final a0 n() {
                return new a0();
            }

            @fg.l
            public final a0 o() {
                return new a0();
            }

            @fg.l
            public final a0 p() {
                return new a0();
            }
        }

        private Companion() {
        }

        @androidx.compose.ui.k
        public static /* synthetic */ void c() {
        }

        @fg.l
        @androidx.compose.ui.k
        public final C0328a a() {
            return C0328a.f17518a;
        }

        @fg.l
        @androidx.compose.ui.k
        public final a0 b() {
            return a0.f17516e;
        }

        @fg.l
        public final a0 d() {
            return a0.f17515d;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<FocusTargetNode, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f17520b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(p0.m(focusTargetNode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0059, code lost:
    
        continue;
     */
    @androidx.compose.ui.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean d(ld.l<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a0.d(ld.l):boolean");
    }

    public final boolean c() {
        if (!this.focusRequesterNodes.V()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        androidx.compose.runtime.collection.g<e0> gVar = this.focusRequesterNodes;
        int size = gVar.getSize();
        if (size > 0) {
            e0[] L = gVar.L();
            int i4 = 0;
            while (!f0.a(L[i4])) {
                i4++;
                if (i4 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0059, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a0.e():boolean");
    }

    public final boolean f() {
        if (!this.focusRequesterNodes.V()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        androidx.compose.runtime.collection.g<e0> gVar = this.focusRequesterNodes;
        int size = gVar.getSize();
        if (size > 0) {
            e0[] L = gVar.L();
            int i4 = 0;
            while (!f0.b(L[i4])) {
                i4++;
                if (i4 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    @fg.l
    public final androidx.compose.runtime.collection.g<e0> g() {
        return this.focusRequesterNodes;
    }

    public final void h() {
        e();
    }

    @androidx.compose.ui.k
    public final boolean i() {
        if (!this.focusRequesterNodes.V()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        androidx.compose.runtime.collection.g<e0> gVar = this.focusRequesterNodes;
        int size = gVar.getSize();
        if (size <= 0) {
            return false;
        }
        e0[] L = gVar.L();
        int i4 = 0;
        boolean z4 = false;
        do {
            z4 = f0.d(L[i4]) || z4;
            i4++;
        } while (i4 < size);
        return z4;
    }

    @androidx.compose.ui.k
    public final boolean j() {
        if (!this.focusRequesterNodes.V()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        androidx.compose.runtime.collection.g<e0> gVar = this.focusRequesterNodes;
        int size = gVar.getSize();
        if (size > 0) {
            e0[] L = gVar.L();
            int i4 = 0;
            while (!f0.e(L[i4])) {
                i4++;
                if (i4 >= size) {
                }
            }
            return true;
        }
        return false;
    }
}
