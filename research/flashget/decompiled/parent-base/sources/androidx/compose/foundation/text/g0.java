package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.k2;

/* compiled from: LongPressTextDragObserver.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Landroidx/compose/foundation/text/o0;", "observer", "Lkotlin/k2;", "d", "(Landroidx/compose/ui/input/pointer/k0;Landroidx/compose/foundation/text/o0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "f", "e", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 {

    /* compiled from: LongPressTextDragObserver.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/k2;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f7380b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f7381c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.k0 f7382d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o0 f7383e;

        /* compiled from: LongPressTextDragObserver.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.g0$a$a, reason: collision with other inner class name */
        static final class C0136a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f7384b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f7385c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ o0 f7386d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0136a(androidx.compose.ui.input.pointer.k0 k0Var, o0 o0Var, kotlin.coroutines.d<? super C0136a> dVar) {
                super(2, dVar);
                this.f7385c = k0Var;
                this.f7386d = o0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0136a(this.f7385c, this.f7386d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f7384b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f7385c;
                    o0 o0Var = this.f7386d;
                    this.f7384b = 1;
                    if (g0.f(k0Var, o0Var, this) == aVar) {
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
                return ((C0136a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: LongPressTextDragObserver.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f7387b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f7388c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ o0 f7389d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.input.pointer.k0 k0Var, o0 o0Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f7388c = k0Var;
                this.f7389d = o0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f7388c, this.f7389d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f7387b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f7388c;
                    o0 o0Var = this.f7389d;
                    this.f7387b = 1;
                    if (g0.e(k0Var, o0Var, this) == aVar) {
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
                return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.input.pointer.k0 k0Var, o0 o0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f7382d = k0Var;
            this.f7383e = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f7382d, this.f7383e, dVar);
            aVar.f7381c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f7380b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f7381c;
            kotlinx.coroutines.t0 t0Var = kotlinx.coroutines.t0.UNDISPATCHED;
            kotlinx.coroutines.k.f(r0Var, null, t0Var, new C0136a(this.f7382d, this.f7383e, null), 1, null);
            f4 = kotlinx.coroutines.k.f(r0Var, null, t0Var, new b(this.f7382d, this.f7383e, null), 1, null);
            return f4;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f7390b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var) {
            super(1);
            this.f7390b = o0Var;
        }

        public final void a(long j4) {
            this.f7390b.b(j4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f7391b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0 o0Var) {
            super(0);
            this.f7391b = o0Var;
        }

        public final void a() {
            this.f7391b.onStop();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f7392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o0 o0Var) {
            super(0);
            this.f7392b = o0Var;
        }

        public final void a() {
            this.f7392b.onCancel();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "<anonymous parameter 0>", "Li0/f;", "offset", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;J)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.input.pointer.b0, i0.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f7393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o0 o0Var) {
            super(2);
            this.f7393b = o0Var;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, long j4) {
            this.f7393b.d(j4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, i0.f fVar) {
            a(b0Var, fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f7394b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(o0 o0Var) {
            super(1);
            this.f7394b = o0Var;
        }

        public final void a(long j4) {
            this.f7394b.b(j4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f7395b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(o0 o0Var) {
            super(0);
            this.f7395b = o0Var;
        }

        public final void a() {
            this.f7395b.onStop();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f7396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(o0 o0Var) {
            super(0);
            this.f7396b = o0Var;
        }

        public final void a() {
            this.f7396b.onCancel();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "<anonymous parameter 0>", "Li0/f;", "offset", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;J)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.input.pointer.b0, i0.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f7397b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(o0 o0Var) {
            super(2);
            this.f7397b = o0Var;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, long j4) {
            this.f7397b.d(j4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, i0.f fVar) {
            a(b0Var, fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {99, 103}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLongPressTextDragObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,126:1\n101#2,2:127\n33#2,6:129\n103#2:135\n*S KotlinDebug\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n*L\n104#1:127,2\n104#1:129,6\n104#1:135\n*E\n"})
    static final class j extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f7398c;

        /* renamed from: d, reason: collision with root package name */
        int f7399d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f7400e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ o0 f7401f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(o0 o0Var, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f7401f = o0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((j) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f7401f, dVar);
            jVar.f7400e = obj;
            return jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:6:0x005c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r12.f7399d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r12.f7398c
                androidx.compose.ui.input.pointer.b0 r1 = (androidx.compose.ui.input.pointer.b0) r1
                java.lang.Object r4 = r12.f7400e
                androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                kotlin.a1.n(r13)
                goto L5c
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                java.lang.Object r1 = r12.f7400e
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r13)
                goto L41
            L28:
                kotlin.a1.n(r13)
                java.lang.Object r13 = r12.f7400e
                r1 = r13
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r12.f7400e = r1
                r12.f7399d = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.z0.f(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L41
                return r0
            L41:
                androidx.compose.ui.input.pointer.b0 r13 = (androidx.compose.ui.input.pointer.b0) r13
                androidx.compose.foundation.text.o0 r4 = r12.f7401f
                long r5 = r13.getPosition()
                r4.a(r5)
                r4 = r1
                r1 = r13
            L4e:
                r12.f7400e = r4
                r12.f7398c = r1
                r12.f7399d = r2
                r13 = 0
                java.lang.Object r13 = androidx.compose.ui.input.pointer.c.a1(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L5c
                return r0
            L5c:
                androidx.compose.ui.input.pointer.p r13 = (androidx.compose.ui.input.pointer.p) r13
                java.util.List r13 = r13.e()
                int r5 = r13.size()
                r6 = 0
            L67:
                if (r6 >= r5) goto L87
                java.lang.Object r7 = r13.get(r6)
                androidx.compose.ui.input.pointer.b0 r7 = (androidx.compose.ui.input.pointer.b0) r7
                long r8 = r7.getId()
                long r10 = r1.getId()
                boolean r8 = androidx.compose.ui.input.pointer.a0.d(r8, r10)
                if (r8 == 0) goto L84
                boolean r7 = r7.getPressed()
                if (r7 == 0) goto L84
                goto L4e
            L84:
                int r6 = r6 + 1
                goto L67
            L87:
                androidx.compose.foundation.text.o0 r13 = r12.f7401f
                r13.c()
                kotlin.k2 r13 = kotlin.k2.f75408a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.g0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @fg.m
    public static final Object c(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l o0 o0Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = kotlinx.coroutines.s0.g(new a(k0Var, o0Var, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }

    @fg.m
    public static final Object d(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l o0 o0Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object p4 = androidx.compose.foundation.gestures.u.p(k0Var, new b(o0Var), new c(o0Var), new d(o0Var), new e(o0Var), dVar);
        return p4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? p4 : kotlin.k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(androidx.compose.ui.input.pointer.k0 k0Var, o0 o0Var, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object n4 = androidx.compose.foundation.gestures.u.n(k0Var, new f(o0Var), new g(o0Var), new h(o0Var), new i(o0Var), dVar);
        return n4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? n4 : kotlin.k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(androidx.compose.ui.input.pointer.k0 k0Var, o0 o0Var, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = androidx.compose.foundation.gestures.f0.d(k0Var, new j(o0Var, null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }
}
