package androidx.compose.foundation;

import androidx.compose.foundation.interaction.f;
import androidx.compose.ui.input.pointer.t;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006J*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/l1;", "Landroidx/compose/ui/node/u1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "<init>", "(Landroidx/compose/foundation/interaction/k;)V", "Lkotlin/k2;", "B7", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/unit/u;", "bounds", "g1", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "E4", "()V", "j7", "y7", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "z7", "A7", "p", "Landroidx/compose/foundation/interaction/k;", "Landroidx/compose/foundation/interaction/f$a;", "q", "Landroidx/compose/foundation/interaction/f$a;", "hoverInteraction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class l1 extends q.d implements androidx.compose.ui.node.u1 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f.a hoverInteraction;

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0, 0}, l = {108}, m = "emitEnter", n = {"this", "interaction"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4770b;

        /* renamed from: c, reason: collision with root package name */
        Object f4771c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4772d;

        /* renamed from: f, reason: collision with root package name */
        int f4774f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4772d = obj;
            this.f4774f |= Integer.MIN_VALUE;
            return l1.this.y7(this);
        }
    }

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {116}, m = "emitExit", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4775b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4776c;

        /* renamed from: e, reason: collision with root package name */
        int f4778e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4776c = obj;
            this.f4778e |= Integer.MIN_VALUE;
            return l1.this.z7(this);
        }
    }

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4779b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return l1.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4779b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                l1 l1Var = l1.this;
                this.f4779b = 1;
                if (l1Var.y7(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4781b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return l1.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4781b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                l1 l1Var = l1.this;
                this.f4781b = 1;
                if (l1Var.z7(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public l1(@fg.l androidx.compose.foundation.interaction.k kVar) {
        this.interactionSource = kVar;
    }

    public final void A7() {
        f.a aVar = this.hoverInteraction;
        if (aVar != null) {
            this.interactionSource.b(new f.b(aVar));
            this.hoverInteraction = null;
        }
    }

    public final void B7(@fg.l androidx.compose.foundation.interaction.k interactionSource) {
        if (kotlin.jvm.internal.l0.g(this.interactionSource, interactionSource)) {
            return;
        }
        A7();
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.node.u1
    public void E4() {
        A7();
    }

    @Override // androidx.compose.ui.node.u1
    public void g1(@fg.l androidx.compose.ui.input.pointer.p pointerEvent, @fg.l androidx.compose.ui.input.pointer.r pass, long bounds) {
        if (pass == androidx.compose.ui.input.pointer.r.Main) {
            int type = pointerEvent.getType();
            t.Companion companion = androidx.compose.ui.input.pointer.t.INSTANCE;
            companion.getClass();
            if (androidx.compose.ui.input.pointer.t.k(type, androidx.compose.ui.input.pointer.t.f18828g)) {
                kotlinx.coroutines.k.f(V6(), null, null, new c(null), 3, null);
                return;
            }
            companion.getClass();
            if (androidx.compose.ui.input.pointer.t.k(type, androidx.compose.ui.input.pointer.t.f18829h)) {
                kotlinx.coroutines.k.f(V6(), null, null, new d(null), 3, null);
            }
        }
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        A7();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y7(@fg.l kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.l1.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.l1$a r0 = (androidx.compose.foundation.l1.a) r0
            int r1 = r0.f4774f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4774f = r1
            goto L18
        L13:
            androidx.compose.foundation.l1$a r0 = new androidx.compose.foundation.l1$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4772d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4774f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.f4771c
            androidx.compose.foundation.interaction.f$a r1 = (androidx.compose.foundation.interaction.f.a) r1
            java.lang.Object r0 = r0.f4770b
            androidx.compose.foundation.l1 r0 = (androidx.compose.foundation.l1) r0
            kotlin.a1.n(r5)
            goto L54
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.a1.n(r5)
            androidx.compose.foundation.interaction.f$a r5 = r4.hoverInteraction
            if (r5 != 0) goto L56
            androidx.compose.foundation.interaction.f$a r5 = new androidx.compose.foundation.interaction.f$a
            r5.<init>()
            androidx.compose.foundation.interaction.k r2 = r4.interactionSource
            r0.f4770b = r4
            r0.f4771c = r5
            r0.f4774f = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r4
            r1 = r5
        L54:
            r0.hoverInteraction = r1
        L56:
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.l1.y7(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z7(@fg.l kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.l1.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.l1$b r0 = (androidx.compose.foundation.l1.b) r0
            int r1 = r0.f4778e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4778e = r1
            goto L18
        L13:
            androidx.compose.foundation.l1$b r0 = new androidx.compose.foundation.l1$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4776c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4778e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f4775b
            androidx.compose.foundation.l1 r0 = (androidx.compose.foundation.l1) r0
            kotlin.a1.n(r5)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.a1.n(r5)
            androidx.compose.foundation.interaction.f$a r5 = r4.hoverInteraction
            if (r5 == 0) goto L50
            androidx.compose.foundation.interaction.f$b r2 = new androidx.compose.foundation.interaction.f$b
            r2.<init>(r5)
            androidx.compose.foundation.interaction.k r5 = r4.interactionSource
            r0.f4775b = r4
            r0.f4778e = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
        L4d:
            r5 = 0
            r0.hoverInteraction = r5
        L50:
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.l1.z7(kotlin.coroutines.d):java.lang.Object");
    }
}
