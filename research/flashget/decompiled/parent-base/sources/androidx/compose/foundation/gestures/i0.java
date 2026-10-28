package androidx.compose.foundation.gestures;

import androidx.compose.foundation.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/gestures/i0;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/foundation/gestures/y0;", "scrollingLogic", "<init>", "(Landroidx/compose/foundation/gestures/y0;)V", "Lkotlin/k2;", "i7", "()V", "s", "Landroidx/compose/foundation/gestures/y0;", "Landroidx/compose/foundation/gestures/n0;", "t", "Landroidx/compose/foundation/gestures/n0;", "K7", "()Landroidx/compose/foundation/gestures/n0;", "L7", "(Landroidx/compose/foundation/gestures/n0;)V", "scrollConfig", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i0 extends androidx.compose.ui.node.l implements androidx.compose.ui.node.h {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y0 scrollingLogic;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private n0 scrollConfig;

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1", f = "Scrollable.kt", i = {}, l = {669}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4086b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4087c;

        /* compiled from: Scrollable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1", f = "Scrollable.kt", i = {0}, l = {671}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1021:1\n86#2,2:1022\n33#2,6:1024\n88#2:1030\n33#2,6:1031\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1\n*L\n672#1:1022,2\n672#1:1024,6\n672#1:1030\n688#1:1031,6\n*E\n"})
        /* renamed from: androidx.compose.foundation.gestures.i0$a$a, reason: collision with other inner class name */
        static final class C0067a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            int f4089c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f4090d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ i0 f4091e;

            /* compiled from: Scrollable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1", f = "Scrollable.kt", i = {}, l = {684}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.i0$a$a$a, reason: collision with other inner class name */
            static final class C0068a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4092b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ y0 f4093c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f4094d;

                /* compiled from: Scrollable.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.gestures.i0$a$a$a$a, reason: collision with other inner class name */
                static final class C0069a extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f4095b;

                    /* renamed from: c, reason: collision with root package name */
                    private /* synthetic */ Object f4096c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ y0 f4097d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ long f4098e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0069a(y0 y0Var, long j4, kotlin.coroutines.d<? super C0069a> dVar) {
                        super(2, dVar);
                        this.f4097d = y0Var;
                        this.f4098e = j4;
                    }

                    @Override // ld.p
                    @fg.m
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                        return ((C0069a) create(q0Var, dVar)).invokeSuspend(k2.f75408a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        C0069a c0069a = new C0069a(this.f4097d, this.f4098e, dVar);
                        c0069a.f4096c = obj;
                        return c0069a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        if (this.f4095b != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                        q0 q0Var = (q0) this.f4096c;
                        y0 y0Var = this.f4097d;
                        long j4 = this.f4098e;
                        androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
                        y0Var.c(q0Var, j4, androidx.compose.ui.input.nestedscroll.f.f18690f);
                        return k2.f75408a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0068a(y0 y0Var, long j4, kotlin.coroutines.d<? super C0068a> dVar) {
                    super(2, dVar);
                    this.f4093c = y0Var;
                    this.f4094d = j4;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0068a(this.f4093c, this.f4094d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f4092b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        w0 scrollableState = this.f4093c.getScrollableState();
                        a2 a2Var = a2.UserInput;
                        C0069a c0069a = new C0069a(this.f4093c, this.f4094d, null);
                        this.f4092b = 1;
                        if (scrollableState.f(a2Var, c0069a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0068a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0067a(i0 i0Var, kotlin.coroutines.d<? super C0067a> dVar) {
                super(2, dVar);
                this.f4091e = i0Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0067a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0067a c0067a = new C0067a(this.f4091e, dVar);
                c0067a.f4090d = obj;
                return c0067a;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[EDGE_INSN: B:15:0x004a->B:16:0x004a BREAK  A[LOOP:0: B:6:0x0038->B:9:0x0047], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0029 -> B:5:0x002c). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r15) {
                /*
                    r14 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r14.f4089c
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r1 = r14.f4090d
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.a1.n(r15)
                    goto L2c
                L11:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L19:
                    kotlin.a1.n(r15)
                    java.lang.Object r15 = r14.f4090d
                    androidx.compose.ui.input.pointer.c r15 = (androidx.compose.ui.input.pointer.c) r15
                    r1 = r15
                L21:
                    r14.f4090d = r1
                    r14.f4089c = r2
                    java.lang.Object r15 = androidx.compose.foundation.gestures.t0.a(r1, r14)
                    if (r15 != r0) goto L2c
                    return r0
                L2c:
                    androidx.compose.ui.input.pointer.p r15 = (androidx.compose.ui.input.pointer.p) r15
                    java.util.List r3 = r15.e()
                    int r4 = r3.size()
                    r5 = 0
                    r6 = r5
                L38:
                    if (r6 >= r4) goto L4a
                    java.lang.Object r7 = r3.get(r6)
                    androidx.compose.ui.input.pointer.b0 r7 = (androidx.compose.ui.input.pointer.b0) r7
                    boolean r7 = r7.D()
                    if (r7 == 0) goto L47
                    goto L21
                L47:
                    int r6 = r6 + 1
                    goto L38
                L4a:
                    androidx.compose.foundation.gestures.i0 r3 = r14.f4091e
                    androidx.compose.foundation.gestures.n0 r3 = r3.getScrollConfig()
                    kotlin.jvm.internal.l0.m(r3)
                    androidx.compose.foundation.gestures.i0 r4 = r14.f4091e
                    long r6 = r1.c()
                    long r6 = r3.a(r1, r15, r6)
                    androidx.compose.foundation.gestures.y0 r3 = androidx.compose.foundation.gestures.i0.J7(r4)
                    kotlinx.coroutines.r0 r8 = r4.V6()
                    androidx.compose.foundation.gestures.i0$a$a$a r11 = new androidx.compose.foundation.gestures.i0$a$a$a
                    r4 = 0
                    r11.<init>(r3, r6, r4)
                    r12 = 3
                    r13 = 0
                    r9 = 0
                    r10 = 0
                    kotlinx.coroutines.i.e(r8, r9, r10, r11, r12, r13)
                    java.util.List r15 = r15.e()
                    int r3 = r15.size()
                L7a:
                    if (r5 >= r3) goto L21
                    java.lang.Object r4 = r15.get(r5)
                    androidx.compose.ui.input.pointer.b0 r4 = (androidx.compose.ui.input.pointer.b0) r4
                    r4.a()
                    int r5 = r5 + 1
                    goto L7a
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.i0.a.C0067a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = i0.this.new a(dVar);
            aVar.f4087c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4086b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f4087c;
                C0067a c0067a = new C0067a(i0.this, null);
                this.f4086b = 1;
                if (k0Var.o3(c0067a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    public i0(@fg.l y0 y0Var) {
        this.scrollingLogic = y0Var;
        y7(androidx.compose.ui.input.pointer.u0.a(new a(null)));
    }

    @fg.m
    /* renamed from: K7, reason: from getter */
    public final n0 getScrollConfig() {
        return this.scrollConfig;
    }

    public final void L7(@fg.m n0 n0Var) {
        this.scrollConfig = n0Var;
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        this.scrollConfig = g.f4027a;
    }
}
