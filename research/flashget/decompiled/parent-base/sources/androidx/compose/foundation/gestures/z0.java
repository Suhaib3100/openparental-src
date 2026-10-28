package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u008d\u0001\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0016\u001a\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u001a\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0087@¢\u0006\u0004\b\u001a\u0010\u001b\u001a(\u0010\u001e\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0016\u0010 \u001a\u0004\u0018\u00010\u0012*\u00020\u000fH\u0087@¢\u0006\u0004\b \u0010\u0011\u001a \u0010!\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b!\u0010\"\";\u0010%\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/Function1;", "Li0/f;", "Lkotlin/k2;", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/l0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "onPress", "onTap", "l", "(Landroidx/compose/ui/input/pointer/k0;Lld/l;Lld/l;Lld/q;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/c;", "i", "(Landroidx/compose/ui/input/pointer/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/b0;", "firstUp", "h", "(Landroidx/compose/ui/input/pointer/c;Landroidx/compose/ui/input/pointer/b0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "(Landroidx/compose/ui/input/pointer/k0;Lld/q;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "requireUnconsumed", "e", "(Landroidx/compose/ui/input/pointer/c;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/r;", "pass", "d", "(Landroidx/compose/ui/input/pointer/c;ZLandroidx/compose/ui/input/pointer/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "n", "(Landroidx/compose/ui/input/pointer/c;Landroidx/compose/ui/input/pointer/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Lld/q;", "NoPressGesture", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n101#2,2:383\n33#2,6:385\n103#2:391\n86#2,2:392\n33#2,6:394\n88#2:400\n86#2,2:401\n33#2,6:403\n88#2:409\n101#2,2:410\n33#2,6:412\n103#2:418\n101#2,2:419\n33#2,6:421\n103#2:427\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n196#1:377,6\n197#1:383,2\n197#1:385,6\n197#1:391\n281#1:392,2\n281#1:394,6\n281#1:400\n306#1:401,2\n306#1:403,6\n306#1:409\n311#1:410,2\n311#1:412,6\n311#1:418\n321#1:419,2\n321#1:421,6\n321#1:427\n*E\n"})
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> f4566a = new a(3, null);

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/l0;", "Li0/f;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/l0;Li0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4567b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(l0 l0Var, i0.f fVar, kotlin.coroutines.d<? super k2> dVar) {
            return a(l0Var, fVar.getPackedValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l l0 l0Var, long j4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return new a(3, dVar).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4567b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {279}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4568b;

        /* renamed from: c, reason: collision with root package name */
        Object f4569c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4570d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4571e;

        /* renamed from: f, reason: collision with root package name */
        int f4572f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4571e = obj;
            this.f4572f |= Integer.MIN_VALUE;
            return z0.d(null, false, null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {212}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/b0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)Landroidx/compose/ui/input/pointer/b0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0>, Object> {

        /* renamed from: c, reason: collision with root package name */
        long f4573c;

        /* renamed from: d, reason: collision with root package name */
        int f4574d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f4575e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.b0 f4576f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.input.pointer.b0 b0Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f4576f = b0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f4576f, dVar);
            cVar.f4575e = obj;
            return cVar;
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
                int r1 = r13.f4574d
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                long r3 = r13.f4573c
                java.lang.Object r1 = r13.f4575e
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
                java.lang.Object r14 = r13.f4575e
                androidx.compose.ui.input.pointer.c r14 = (androidx.compose.ui.input.pointer.c) r14
                androidx.compose.ui.input.pointer.b0 r1 = r13.f4576f
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.s5 r1 = r14.d()
                long r5 = r1.b()
                long r5 = r5 + r3
                r1 = r14
                r3 = r5
            L33:
                r13.f4575e = r1
                r13.f4573c = r3
                r13.f4574d = r2
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.z0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {195}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4577b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4578c;

        /* renamed from: d, reason: collision with root package name */
        int f4579d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4578c = obj;
            this.f4579d |= Integer.MIN_VALUE;
            return z0.i(null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4580b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4581c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.k0 f4582d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> f4583e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f4584f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ m0 f4585g;

        /* compiled from: TapGestureDetector.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0}, l = {237, 245}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            int f4586c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f4587d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f4588e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> f4589f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ld.l<i0.f, k2> f4590g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ m0 f4591h;

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.z0$e$a$a, reason: collision with other inner class name */
            static final class C0078a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4592b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ m0 f4593c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0078a(m0 m0Var, kotlin.coroutines.d<? super C0078a> dVar) {
                    super(2, dVar);
                    this.f4593c = m0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0078a(this.f4593c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f4592b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        m0 m0Var = this.f4593c;
                        this.f4592b = 1;
                        if (m0Var.l(this) == aVar) {
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
                    return ((C0078a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4594b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> f4595c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ m0 f4596d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.b0 f4597e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(ld.q<? super l0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, m0 m0Var, androidx.compose.ui.input.pointer.b0 b0Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f4595c = qVar;
                    this.f4596d = m0Var;
                    this.f4597e = b0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new b(this.f4595c, this.f4596d, this.f4597e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f4594b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> qVar = this.f4595c;
                        m0 m0Var = this.f4596d;
                        i0.f d5 = i0.f.d(this.f4597e.getPosition());
                        this.f4594b = 1;
                        if (qVar.R(m0Var, d5, this) == aVar) {
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
                    return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4598b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ m0 f4599c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(m0 m0Var, kotlin.coroutines.d<? super c> dVar) {
                    super(2, dVar);
                    this.f4599c = m0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new c(this.f4599c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    if (this.f4598b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    this.f4599c.a();
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4600b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ m0 f4601c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(m0 m0Var, kotlin.coroutines.d<? super d> dVar) {
                    super(2, dVar);
                    this.f4601c = m0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new d(this.f4601c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    if (this.f4600b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    this.f4601c.f();
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((d) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.r0 r0Var, ld.q<? super l0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, ld.l<? super i0.f, k2> lVar, m0 m0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f4588e = r0Var;
                this.f4589f = qVar;
                this.f4590g = lVar;
                this.f4591h = m0Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f4588e, this.f4589f, this.f4590g, this.f4591h, dVar);
                aVar.f4587d = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x007f  */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r24) {
                /*
                    r23 = this;
                    r6 = r23
                    kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r0 = r6.f4586c
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    if (r0 == 0) goto L28
                    if (r0 == r9) goto L1d
                    if (r0 != r8) goto L15
                    kotlin.a1.n(r24)
                    r0 = r24
                    goto L7b
                L15:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1d:
                    java.lang.Object r0 = r6.f4587d
                    androidx.compose.ui.input.pointer.c r0 = (androidx.compose.ui.input.pointer.c) r0
                    kotlin.a1.n(r24)
                    r11 = r0
                    r0 = r24
                    goto L4f
                L28:
                    kotlin.a1.n(r24)
                    java.lang.Object r0 = r6.f4587d
                    r11 = r0
                    androidx.compose.ui.input.pointer.c r11 = (androidx.compose.ui.input.pointer.c) r11
                    kotlinx.coroutines.r0 r0 = r6.f4588e
                    androidx.compose.foundation.gestures.z0$e$a$a r3 = new androidx.compose.foundation.gestures.z0$e$a$a
                    androidx.compose.foundation.gestures.m0 r1 = r6.f4591h
                    r3.<init>(r1, r10)
                    r4 = 3
                    r5 = 0
                    r1 = 0
                    r2 = 0
                    kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
                    r6.f4587d = r11
                    r6.f4586c = r9
                    r1 = 0
                    r0 = r11
                    r3 = r23
                    java.lang.Object r0 = androidx.compose.foundation.gestures.z0.f(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L4f
                    return r7
                L4f:
                    androidx.compose.ui.input.pointer.b0 r0 = (androidx.compose.ui.input.pointer.b0) r0
                    r0.a()
                    ld.q<androidx.compose.foundation.gestures.l0, i0.f, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r1 = r6.f4589f
                    ld.q r2 = androidx.compose.foundation.gestures.z0.c()
                    if (r1 == r2) goto L70
                    kotlinx.coroutines.r0 r12 = r6.f4588e
                    androidx.compose.foundation.gestures.z0$e$a$b r15 = new androidx.compose.foundation.gestures.z0$e$a$b
                    ld.q<androidx.compose.foundation.gestures.l0, i0.f, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r1 = r6.f4589f
                    androidx.compose.foundation.gestures.m0 r2 = r6.f4591h
                    r15.<init>(r1, r2, r0, r10)
                    r16 = 3
                    r17 = 0
                    r13 = 0
                    r14 = 0
                    kotlinx.coroutines.i.e(r12, r13, r14, r15, r16, r17)
                L70:
                    r6.f4587d = r10
                    r6.f4586c = r8
                    java.lang.Object r0 = androidx.compose.foundation.gestures.z0.p(r11, r10, r6, r9, r10)
                    if (r0 != r7) goto L7b
                    return r7
                L7b:
                    androidx.compose.ui.input.pointer.b0 r0 = (androidx.compose.ui.input.pointer.b0) r0
                    if (r0 != 0) goto L91
                    kotlinx.coroutines.r0 r11 = r6.f4588e
                    androidx.compose.foundation.gestures.z0$e$a$c r14 = new androidx.compose.foundation.gestures.z0$e$a$c
                    androidx.compose.foundation.gestures.m0 r0 = r6.f4591h
                    r14.<init>(r0, r10)
                    r15 = 3
                    r16 = 0
                    r12 = 0
                    r13 = 0
                    kotlinx.coroutines.i.e(r11, r12, r13, r14, r15, r16)
                    goto Lbb
                L91:
                    r0.a()
                    kotlinx.coroutines.r0 r1 = r6.f4588e
                    androidx.compose.foundation.gestures.z0$e$a$d r2 = new androidx.compose.foundation.gestures.z0$e$a$d
                    androidx.compose.foundation.gestures.m0 r3 = r6.f4591h
                    r2.<init>(r3, r10)
                    r21 = 3
                    r22 = 0
                    r18 = 0
                    r19 = 0
                    r17 = r1
                    r20 = r2
                    kotlinx.coroutines.i.e(r17, r18, r19, r20, r21, r22)
                    ld.l<i0.f, kotlin.k2> r1 = r6.f4590g
                    if (r1 == 0) goto Lbb
                    long r2 = r0.getPosition()
                    i0.f r0 = i0.f.d(r2)
                    r1.invoke(r0)
                Lbb:
                    kotlin.k2 r0 = kotlin.k2.f75408a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.z0.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.input.pointer.k0 k0Var, ld.q<? super l0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, ld.l<? super i0.f, k2> lVar, m0 m0Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f4582d = k0Var;
            this.f4583e = qVar;
            this.f4584f = lVar;
            this.f4585g = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f4582d, this.f4583e, this.f4584f, this.f4585g, dVar);
            eVar.f4581c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4580b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f4581c;
                androidx.compose.ui.input.pointer.k0 k0Var = this.f4582d;
                a aVar2 = new a(r0Var, this.f4583e, this.f4584f, this.f4585g, null);
                this.f4580b = 1;
                if (f0.d(k0Var, aVar2, this) == aVar) {
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
            return ((e) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4602b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4603c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.k0 f4604d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> f4605e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f4606f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f4607g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f4608h;

        /* compiled from: TapGestureDetector.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            Object f4609c;

            /* renamed from: d, reason: collision with root package name */
            Object f4610d;

            /* renamed from: e, reason: collision with root package name */
            Object f4611e;

            /* renamed from: f, reason: collision with root package name */
            long f4612f;

            /* renamed from: g, reason: collision with root package name */
            int f4613g;

            /* renamed from: h, reason: collision with root package name */
            private /* synthetic */ Object f4614h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f4615i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> f4616j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ld.l<i0.f, k2> f4617k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ld.l<i0.f, k2> f4618l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ ld.l<i0.f, k2> f4619m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ m0 f4620n;

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.z0$f$a$a, reason: collision with other inner class name */
            static final class C0079a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4621b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ m0 f4622c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0079a(m0 m0Var, kotlin.coroutines.d<? super C0079a> dVar) {
                    super(2, dVar);
                    this.f4622c = m0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0079a(this.f4622c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    if (this.f4621b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    this.f4622c.f();
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0079a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4623b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ m0 f4624c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(m0 m0Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f4624c = m0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new b(this.f4624c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f4623b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        m0 m0Var = this.f4624c;
                        this.f4623b = 1;
                        if (m0Var.l(this) == aVar) {
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
                    return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4625b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> f4626c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ m0 f4627d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.b0 f4628e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(ld.q<? super l0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, m0 m0Var, androidx.compose.ui.input.pointer.b0 b0Var, kotlin.coroutines.d<? super c> dVar) {
                    super(2, dVar);
                    this.f4626c = qVar;
                    this.f4627d = m0Var;
                    this.f4628e = b0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new c(this.f4626c, this.f4627d, this.f4628e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f4625b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> qVar = this.f4626c;
                        m0 m0Var = this.f4627d;
                        i0.f d5 = i0.f.d(this.f4628e.getPosition());
                        this.f4625b = 1;
                        if (qVar.R(m0Var, d5, this) == aVar) {
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
                    return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/b0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)Landroidx/compose/ui/input/pointer/b0;"}, k = 3, mv = {1, 8, 0})
            static final class d extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0>, Object> {

                /* renamed from: c, reason: collision with root package name */
                int f4629c;

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f4630d;

                d(kotlin.coroutines.d<? super d> dVar) {
                    super(2, dVar);
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> dVar) {
                    return ((d) create(cVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    d dVar2 = new d(2, dVar);
                    dVar2.f4630d = obj;
                    return dVar2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f4629c;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f4630d;
                        this.f4629c = 1;
                        obj = z0.p(cVar, null, this, 1, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return obj;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4631b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ m0 f4632c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(m0 m0Var, kotlin.coroutines.d<? super e> dVar) {
                    super(2, dVar);
                    this.f4632c = m0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new e(this.f4632c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    if (this.f4631b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    this.f4632c.a();
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((e) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.z0$f$a$f, reason: collision with other inner class name */
            static final class C0080f extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4633b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ m0 f4634c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0080f(m0 m0Var, kotlin.coroutines.d<? super C0080f> dVar) {
                    super(2, dVar);
                    this.f4634c = m0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0080f(this.f4634c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    if (this.f4633b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    this.f4634c.f();
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0080f) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4635b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ m0 f4636c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(m0 m0Var, kotlin.coroutines.d<? super g> dVar) {
                    super(2, dVar);
                    this.f4636c = m0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new g(this.f4636c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    if (this.f4635b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    this.f4636c.f();
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((g) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4637b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ m0 f4638c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(m0 m0Var, kotlin.coroutines.d<? super h> dVar) {
                    super(2, dVar);
                    this.f4638c = m0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new h(this.f4638c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f4637b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        m0 m0Var = this.f4638c;
                        this.f4637b = 1;
                        if (m0Var.l(this) == aVar) {
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
                    return ((h) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class i extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f4639b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> f4640c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ m0 f4641d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.b0 f4642e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                i(ld.q<? super l0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, m0 m0Var, androidx.compose.ui.input.pointer.b0 b0Var, kotlin.coroutines.d<? super i> dVar) {
                    super(2, dVar);
                    this.f4640c = qVar;
                    this.f4641d = m0Var;
                    this.f4642e = b0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new i(this.f4640c, this.f4641d, this.f4642e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f4639b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        ld.q<l0, i0.f, kotlin.coroutines.d<? super k2>, Object> qVar = this.f4640c;
                        m0 m0Var = this.f4641d;
                        i0.f d5 = i0.f.d(this.f4642e.getPosition());
                        this.f4639b = 1;
                        if (qVar.R(m0Var, d5, this) == aVar) {
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
                    return ((i) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            static final class j extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                int f4643c;

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f4644d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f4645e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ ld.l<i0.f, k2> f4646f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ ld.l<i0.f, k2> f4647g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ k1.h<androidx.compose.ui.input.pointer.b0> f4648h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ m0 f4649i;

                /* compiled from: TapGestureDetector.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.gestures.z0$f$a$j$a, reason: collision with other inner class name */
                static final class C0081a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f4650b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ m0 f4651c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0081a(m0 m0Var, kotlin.coroutines.d<? super C0081a> dVar) {
                        super(2, dVar);
                        this.f4651c = m0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0081a(this.f4651c, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        if (this.f4650b != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                        this.f4651c.f();
                        return k2.f75408a;
                    }

                    @Override // ld.p
                    @fg.m
                    public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                        return ((C0081a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                    }
                }

                /* compiled from: TapGestureDetector.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f4652b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ m0 f4653c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(m0 m0Var, kotlin.coroutines.d<? super b> dVar) {
                        super(2, dVar);
                        this.f4653c = m0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new b(this.f4653c, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        if (this.f4652b != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                        this.f4653c.a();
                        return k2.f75408a;
                    }

                    @Override // ld.p
                    @fg.m
                    public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                        return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                j(kotlinx.coroutines.r0 r0Var, ld.l<? super i0.f, k2> lVar, ld.l<? super i0.f, k2> lVar2, k1.h<androidx.compose.ui.input.pointer.b0> hVar, m0 m0Var, kotlin.coroutines.d<? super j> dVar) {
                    super(2, dVar);
                    this.f4645e = r0Var;
                    this.f4646f = lVar;
                    this.f4647g = lVar2;
                    this.f4648h = hVar;
                    this.f4649i = m0Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((j) create(cVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    j jVar = new j(this.f4645e, this.f4646f, this.f4647g, this.f4648h, this.f4649i, dVar);
                    jVar.f4644d = obj;
                    return jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f4643c;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f4644d;
                        this.f4643c = 1;
                        obj = z0.p(cVar, null, this, 1, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    androidx.compose.ui.input.pointer.b0 b0Var = (androidx.compose.ui.input.pointer.b0) obj;
                    if (b0Var != null) {
                        b0Var.a();
                        kotlinx.coroutines.k.f(this.f4645e, null, null, new C0081a(this.f4649i, null), 3, null);
                        this.f4646f.invoke(i0.f.d(b0Var.getPosition()));
                        return k2.f75408a;
                    }
                    kotlinx.coroutines.k.f(this.f4645e, null, null, new b(this.f4649i, null), 3, null);
                    ld.l<i0.f, k2> lVar = this.f4647g;
                    if (lVar == null) {
                        return null;
                    }
                    lVar.invoke(i0.f.d(this.f4648h.f75329b.getPosition()));
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.r0 r0Var, ld.q<? super l0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, ld.l<? super i0.f, k2> lVar, ld.l<? super i0.f, k2> lVar2, ld.l<? super i0.f, k2> lVar3, m0 m0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f4615i = r0Var;
                this.f4616j = qVar;
                this.f4617k = lVar;
                this.f4618l = lVar2;
                this.f4619m = lVar3;
                this.f4620n = m0Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f4615i, this.f4616j, this.f4617k, this.f4618l, this.f4619m, this.f4620n, dVar);
                aVar.f4614h = obj;
                return aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x01f5  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0208  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0222 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x018f  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x01a4  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x015d  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00f9 A[Catch: PointerEventTimeoutCancellationException -> 0x010a, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x010a, blocks: (B:57:0x00f3, B:59:0x00f9, B:62:0x010e), top: B:56:0x00f3 }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x010e A[Catch: PointerEventTimeoutCancellationException -> 0x010a, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x010a, blocks: (B:57:0x00f3, B:59:0x00f9, B:62:0x010e), top: B:56:0x00f3 }] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0146 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x00c4  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x00ef A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x00cd  */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 584
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.z0.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.input.pointer.k0 k0Var, ld.q<? super l0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, ld.l<? super i0.f, k2> lVar, ld.l<? super i0.f, k2> lVar2, ld.l<? super i0.f, k2> lVar3, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f4604d = k0Var;
            this.f4605e = qVar;
            this.f4606f = lVar;
            this.f4607g = lVar2;
            this.f4608h = lVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f4604d, this.f4605e, this.f4606f, this.f4607g, this.f4608h, dVar);
            fVar.f4603c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4602b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f4603c;
                m0 m0Var = new m0(this.f4604d);
                androidx.compose.ui.input.pointer.k0 k0Var = this.f4604d;
                a aVar2 = new a(r0Var, this.f4605e, this.f4606f, this.f4607g, this.f4608h, m0Var, null);
                this.f4602b = 1;
                if (f0.d(k0Var, aVar2, this) == aVar) {
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
            return ((f) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 1, 1}, l = {305, 320}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4654b;

        /* renamed from: c, reason: collision with root package name */
        Object f4655c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4656d;

        /* renamed from: e, reason: collision with root package name */
        int f4657e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4656d = obj;
            this.f4657e |= Integer.MIN_VALUE;
            return z0.n(null, null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:10:0x004f). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@fg.l androidx.compose.ui.input.pointer.c r9, boolean r10, @fg.l androidx.compose.ui.input.pointer.r r11, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.z0.b
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.z0$b r0 = (androidx.compose.foundation.gestures.z0.b) r0
            int r1 = r0.f4572f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4572f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.z0$b r0 = new androidx.compose.foundation.gestures.z0$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f4571e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4572f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r9 = r0.f4570d
            java.lang.Object r10 = r0.f4569c
            androidx.compose.ui.input.pointer.r r10 = (androidx.compose.ui.input.pointer.r) r10
            java.lang.Object r11 = r0.f4568b
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.ui.input.pointer.c) r11
            kotlin.a1.n(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4f
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            kotlin.a1.n(r12)
        L40:
            r0.f4568b = r9
            r0.f4569c = r11
            r0.f4570d = r10
            r0.f4572f = r3
            java.lang.Object r12 = r9.u3(r11, r0)
            if (r12 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.ui.input.pointer.p) r12
            java.util.List r2 = r12.e()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5b:
            if (r6 >= r4) goto L75
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.b0 r7 = (androidx.compose.ui.input.pointer.b0) r7
            if (r10 == 0) goto L6a
            boolean r7 = androidx.compose.ui.input.pointer.q.b(r7)
            goto L6e
        L6a:
            boolean r7 = androidx.compose.ui.input.pointer.q.c(r7)
        L6e:
            if (r7 != 0) goto L72
            r2 = r5
            goto L76
        L72:
            int r6 = r6 + 1
            goto L5b
        L75:
            r2 = r3
        L76:
            if (r2 == 0) goto L40
            java.util.List r9 = r12.e()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.z0.d(androidx.compose.ui.input.pointer.c, boolean, androidx.compose.ui.input.pointer.r, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object f(androidx.compose.ui.input.pointer.c cVar, boolean z4, androidx.compose.ui.input.pointer.r rVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if ((i4 & 2) != 0) {
            rVar = androidx.compose.ui.input.pointer.r.Main;
        }
        return d(cVar, z4, rVar, dVar);
    }

    public static /* synthetic */ Object g(androidx.compose.ui.input.pointer.c cVar, boolean z4, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return d(cVar, z4, androidx.compose.ui.input.pointer.r.Main, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(androidx.compose.ui.input.pointer.c cVar, androidx.compose.ui.input.pointer.b0 b0Var, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> dVar) {
        return cVar.P6(cVar.d().a(), new c(b0Var, null), dVar);
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
    public static final java.lang.Object i(androidx.compose.ui.input.pointer.c r8, kotlin.coroutines.d<? super kotlin.k2> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.z0.d
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.z0$d r0 = (androidx.compose.foundation.gestures.z0.d) r0
            int r1 = r0.f4579d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4579d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.z0$d r0 = new androidx.compose.foundation.gestures.z0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4578c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4579d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.f4577b
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
            r0.f4577b = r8
            r0.f4579d = r3
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.z0.i(androidx.compose.ui.input.pointer.c, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public static final Object j(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l ld.q<? super l0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.m ld.l<? super i0.f, k2> lVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object g4 = kotlinx.coroutines.s0.g(new e(k0Var, qVar, lVar, new m0(k0Var), null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    public static /* synthetic */ Object k(androidx.compose.ui.input.pointer.k0 k0Var, ld.q qVar, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            qVar = f4566a;
        }
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        return j(k0Var, qVar, lVar, dVar);
    }

    @fg.m
    public static final Object l(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m ld.l<? super i0.f, k2> lVar, @fg.m ld.l<? super i0.f, k2> lVar2, @fg.l ld.q<? super l0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.m ld.l<? super i0.f, k2> lVar3, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object g4 = kotlinx.coroutines.s0.g(new f(k0Var, qVar, lVar2, lVar, lVar3, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    public static /* synthetic */ Object m(androidx.compose.ui.input.pointer.k0 k0Var, ld.l lVar, ld.l lVar2, ld.q qVar, ld.l lVar3, kotlin.coroutines.d dVar, int i4, Object obj) {
        ld.l lVar4 = (i4 & 1) != 0 ? null : lVar;
        ld.l lVar5 = (i4 & 2) != 0 ? null : lVar2;
        if ((i4 & 4) != 0) {
            qVar = f4566a;
        }
        return l(k0Var, lVar4, lVar5, qVar, (i4 & 8) != 0 ? null : lVar3, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00be -> B:11:0x0035). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(@fg.l androidx.compose.ui.input.pointer.c r18, @fg.l androidx.compose.ui.input.pointer.r r19, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.z0.n(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.r, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object p(androidx.compose.ui.input.pointer.c cVar, androidx.compose.ui.input.pointer.r rVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            rVar = androidx.compose.ui.input.pointer.r.Main;
        }
        return n(cVar, rVar, dVar);
    }
}
