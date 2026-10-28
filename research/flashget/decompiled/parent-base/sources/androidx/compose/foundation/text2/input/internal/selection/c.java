package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.gestures.f0;
import androidx.compose.foundation.gestures.z0;
import androidx.compose.ui.input.pointer.b0;
import androidx.compose.ui.input.pointer.k0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import ld.p;

/* compiled from: TapAndDoubleTapGesture.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0004*\u00020\u0007H\u0082@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Landroidx/compose/foundation/text2/input/internal/selection/d;", "onTap", "onDoubleTap", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/input/pointer/k0;Landroidx/compose/foundation/text2/input/internal/selection/d;Landroidx/compose/foundation/text2/input/internal/selection/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/b0;", "firstUp", "c", "(Landroidx/compose/ui/input/pointer/c;Landroidx/compose/ui/input/pointer/b0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "(Landroidx/compose/ui/input/pointer/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTapAndDoubleTapGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapAndDoubleTapGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,116:1\n33#2,6:117\n101#2,2:123\n33#2,6:125\n103#2:131\n*S KotlinDebug\n*F\n+ 1 TapAndDoubleTapGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt\n*L\n109#1:117,6\n110#1:123,2\n110#1:125,6\n110#1:131\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* compiled from: TapAndDoubleTapGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$awaitSecondDown$2", f = "TapAndDoubleTapGesture.kt", i = {0, 0}, l = {97}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/b0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)Landroidx/compose/ui/input/pointer/b0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.k implements p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super b0>, Object> {

        /* renamed from: c, reason: collision with root package name */
        long f8728c;

        /* renamed from: d, reason: collision with root package name */
        int f8729d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f8730e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b0 f8731f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f8731f = b0Var;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l androidx.compose.ui.input.pointer.c cVar, @m kotlin.coroutines.d<? super b0> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f8731f, dVar);
            aVar.f8730e = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0045 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0043 -> B:5:0x0046). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r13.f8729d
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                long r3 = r13.f8728c
                java.lang.Object r1 = r13.f8730e
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r14)
                goto L46
            L13:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1b:
                kotlin.a1.n(r14)
                java.lang.Object r14 = r13.f8730e
                androidx.compose.ui.input.pointer.c r14 = (androidx.compose.ui.input.pointer.c) r14
                androidx.compose.ui.input.pointer.b0 r1 = r13.f8731f
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.s5 r1 = r14.d()
                long r5 = r1.b()
                long r5 = r5 + r3
                r1 = r14
                r3 = r5
            L33:
                r13.f8730e = r1
                r13.f8728c = r3
                r13.f8729d = r2
                r8 = 0
                r9 = 0
                r11 = 3
                r12 = 0
                r7 = r1
                r10 = r13
                java.lang.Object r14 = androidx.compose.foundation.gestures.z0.f(r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L46
                return r0
            L46:
                androidx.compose.ui.input.pointer.b0 r14 = (androidx.compose.ui.input.pointer.b0) r14
                long r5 = r14.getUptimeMillis()
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 < 0) goto L33
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TapAndDoubleTapGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt", f = "TapAndDoubleTapGesture.kt", i = {0}, l = {108}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f8732b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f8733c;

        /* renamed from: d, reason: collision with root package name */
        int f8734d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f8733c = obj;
            this.f8734d |= Integer.MIN_VALUE;
            return c.d(null, this);
        }
    }

    /* compiled from: TapAndDoubleTapGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2", f = "TapAndDoubleTapGesture.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.c$c, reason: collision with other inner class name */
    static final class C0183c extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8735b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f8736c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f8737d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f8738e;

        /* compiled from: TapAndDoubleTapGesture.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1", f = "TapAndDoubleTapGesture.kt", i = {0, 1, 1, 2, 2, 3, 3, 4}, l = {44, 50, 54, 64, 69, 77}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "longPressTimeout", "$this$awaitEachGesture", "longPressTimeout", "$this$awaitEachGesture", "longPressTimeout", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.c$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.k implements p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            long f8739c;

            /* renamed from: d, reason: collision with root package name */
            int f8740d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f8741e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f8742f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ d f8743g;

            /* compiled from: TapAndDoubleTapGesture.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$1", f = "TapAndDoubleTapGesture.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/b0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)Landroidx/compose/ui/input/pointer/b0;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.c$c$a$a, reason: collision with other inner class name */
            static final class C0184a extends kotlin.coroutines.jvm.internal.k implements p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super b0>, Object> {

                /* renamed from: c, reason: collision with root package name */
                int f8744c;

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f8745d;

                C0184a(kotlin.coroutines.d<? super C0184a> dVar) {
                    super(2, dVar);
                }

                @Override // ld.p
                @m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@l androidx.compose.ui.input.pointer.c cVar, @m kotlin.coroutines.d<? super b0> dVar) {
                    return ((C0184a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                    C0184a c0184a = new C0184a(2, dVar);
                    c0184a.f8745d = obj;
                    return c0184a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f8744c;
                    if (i4 == 0) {
                        a1.n(obj);
                        androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f8745d;
                        this.f8744c = 1;
                        obj = z0.p(cVar, null, this, 1, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a1.n(obj);
                    }
                    return obj;
                }
            }

            /* compiled from: TapAndDoubleTapGesture.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$2", f = "TapAndDoubleTapGesture.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.c$c$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.k implements p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                int f8746c;

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f8747d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ d f8748e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(d dVar, kotlin.coroutines.d<? super b> dVar2) {
                    super(2, dVar2);
                    this.f8748e = dVar;
                }

                @Override // ld.p
                @m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@l androidx.compose.ui.input.pointer.c cVar, @m kotlin.coroutines.d<? super k2> dVar) {
                    return ((b) create(cVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                    b bVar = new b(this.f8748e, dVar);
                    bVar.f8747d = obj;
                    return bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f8746c;
                    if (i4 == 0) {
                        a1.n(obj);
                        androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f8747d;
                        this.f8746c = 1;
                        obj = z0.p(cVar, null, this, 1, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a1.n(obj);
                    }
                    b0 b0Var = (b0) obj;
                    if (b0Var != null) {
                        b0Var.a();
                        this.f8748e.a(b0Var.getPosition());
                    }
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, d dVar2, kotlin.coroutines.d<? super a> dVar3) {
                super(2, dVar3);
                this.f8742f = dVar;
                this.f8743g = dVar2;
            }

            @Override // ld.p
            @m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@l androidx.compose.ui.input.pointer.c cVar, @m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f8742f, this.f8743g, dVar);
                aVar.f8741e = obj;
                return aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00b9 A[Catch: PointerEventTimeoutCancellationException -> 0x00cc, TRY_ENTER, TRY_LEAVE, TryCatch #1 {PointerEventTimeoutCancellationException -> 0x00cc, blocks: (B:11:0x0019, B:17:0x00b9), top: B:2:0x0005 }] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[RETURN] */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.input.pointer.c] */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.c, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v22 */
            /* JADX WARN: Type inference failed for: r1v23 */
            /* JADX WARN: Type inference failed for: r1v30 */
            /* JADX WARN: Type inference failed for: r1v31 */
            /* JADX WARN: Type inference failed for: r1v6 */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r11) {
                /*
                    Method dump skipped, instructions count: 238
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.c.C0183c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0183c(k0 k0Var, d dVar, d dVar2, kotlin.coroutines.d<? super C0183c> dVar3) {
            super(2, dVar3);
            this.f8736c = k0Var;
            this.f8737d = dVar;
            this.f8738e = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new C0183c(this.f8736c, this.f8737d, this.f8738e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8735b;
            if (i4 == 0) {
                a1.n(obj);
                k0 k0Var = this.f8736c;
                a aVar2 = new a(this.f8737d, this.f8738e, null);
                this.f8735b = 1;
                if (f0.d(k0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((C0183c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(androidx.compose.ui.input.pointer.c cVar, b0 b0Var, kotlin.coroutines.d<? super b0> dVar) {
        return cVar.P6(cVar.d().a(), new a(b0Var, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[LOOP:0: B:11:0x004e->B:12:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003f -> B:10:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.c r8, kotlin.coroutines.d<? super kotlin.k2> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.text2.input.internal.selection.c.b
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text2.input.internal.selection.c$b r0 = (androidx.compose.foundation.text2.input.internal.selection.c.b) r0
            int r1 = r0.f8734d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8734d = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.internal.selection.c$b r0 = new androidx.compose.foundation.text2.input.internal.selection.c$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8733c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f8734d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.f8732b
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.c) r8
            kotlin.a1.n(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.a1.n(r9)
        L36:
            r0.f8732b = r8
            r0.f8734d = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.c.a1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            return r1
        L42:
            androidx.compose.ui.input.pointer.p r9 = (androidx.compose.ui.input.pointer.p) r9
            java.util.List r2 = r9.e()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4e:
            if (r6 >= r4) goto L5c
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.b0 r7 = (androidx.compose.ui.input.pointer.b0) r7
            r7.a()
            int r6 = r6 + 1
            goto L4e
        L5c:
            java.util.List r9 = r9.e()
            int r2 = r9.size()
        L64:
            if (r5 >= r2) goto L76
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.b0 r4 = (androidx.compose.ui.input.pointer.b0) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L73
            goto L36
        L73:
            int r5 = r5 + 1
            goto L64
        L76:
            kotlin.k2 r8 = kotlin.k2.f75408a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.c.d(androidx.compose.ui.input.pointer.c, kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public static final Object e(@l k0 k0Var, @m d dVar, @m d dVar2, @l kotlin.coroutines.d<? super k2> dVar3) {
        Object g4 = s0.g(new C0183c(k0Var, dVar, dVar2, null), dVar3);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    public static /* synthetic */ Object f(k0 k0Var, d dVar, d dVar2, kotlin.coroutines.d dVar3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            dVar = null;
        }
        if ((i4 & 2) != 0) {
            dVar2 = null;
        }
        return e(k0Var, dVar, dVar2, dVar3);
    }
}
