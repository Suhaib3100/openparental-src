package androidx.compose.foundation.gestures;

import androidx.compose.foundation.i2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u0010*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0019\u001a\u00020\u0010*\u00020\u0018ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017J\u0014\u0010\u001a\u001a\u00020\u0018*\u00020\u0018ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u001c\u0010\u001c\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0010ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u0010*\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00020\u0011*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b \u0010\u0015J$\u0010%\u001a\u00020\u0011*\u00020!2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0015J\u001b\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0018H\u0086@ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0018H\u0086@ø\u0001\u0001¢\u0006\u0004\b.\u0010,J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020*2\u0006\u00101\u001a\u00020\b¢\u0006\u0004\b2\u00103J?\u00104\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b4\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010=R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010>R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010?R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\b0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010CR\u0014\u0010E\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u00100\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Landroidx/compose/foundation/gestures/y0;", "", "Landroidx/compose/foundation/gestures/w0;", "scrollableState", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/foundation/i2;", "overscrollEffect", "", "reverseDirection", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "Landroidx/compose/ui/input/nestedscroll/b;", "nestedScrollDispatcher", "<init>", "(Landroidx/compose/foundation/gestures/w0;Landroidx/compose/foundation/gestures/j0;Landroidx/compose/foundation/i2;ZLandroidx/compose/foundation/gestures/e0;Landroidx/compose/ui/input/nestedscroll/b;)V", "", "Li0/f;", "r", "(F)J", "n", "(J)J", "q", "(J)F", "Landroidx/compose/ui/unit/c0;", "p", "o", "newValue", "t", "(JF)J", "j", "(F)F", "k", "Landroidx/compose/foundation/gestures/q0;", "initialAvailableDelta", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "c", "(Landroidx/compose/foundation/gestures/q0;JI)J", "scroll", "h", "initialVelocity", "Lkotlin/k2;", "g", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "available", "d", "m", "()Z", "isFlinging", "i", "(Z)V", "s", "a", "Landroidx/compose/foundation/gestures/w0;", "e", "()Landroidx/compose/foundation/gestures/w0;", "l", "(Landroidx/compose/foundation/gestures/w0;)V", "b", "Landroidx/compose/foundation/gestures/j0;", "Landroidx/compose/foundation/i2;", "Z", "Landroidx/compose/foundation/gestures/e0;", "f", "Landroidx/compose/ui/input/nestedscroll/b;", "Landroidx/compose/runtime/k2;", "Landroidx/compose/runtime/k2;", "isNestedFlinging", "shouldDispatchOverscroll", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class y0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private w0 scrollableState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private j0 orientation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i2 overscrollEffect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e0 flingBehavior;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.input.nestedscroll.b nestedScrollDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<Boolean> isNestedFlinging;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li0/f;", "delta", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, i0.f> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4540c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0 f4541d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, q0 q0Var) {
            super(1);
            this.f4540c = i4;
            this.f4541d = q0Var;
        }

        public final long a(long j4) {
            long d5 = y0.this.nestedScrollDispatcher.d(j4, this.f4540c);
            long u4 = i0.f.u(j4, d5);
            y0 y0Var = y0.this;
            float q4 = y0Var.q(y0Var.k(y0Var.n(u4)));
            y0 y0Var2 = y0.this;
            long k4 = y0Var2.k(y0Var2.r(this.f4541d.a(q4)));
            return i0.f.v(i0.f.v(d5, k4), y0.this.nestedScrollDispatcher.b(k4, i0.f.u(u4, k4), this.f4540c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ i0.f invoke(i0.f fVar) {
            return i0.f.d(a(fVar.getPackedValue()));
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0}, l = {831}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4542b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4543c;

        /* renamed from: e, reason: collision with root package name */
        int f4545e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4543c = obj;
            this.f4545e |= Integer.MIN_VALUE;
            return y0.this.d(0L, this);
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {844}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f4546b;

        /* renamed from: c, reason: collision with root package name */
        Object f4547c;

        /* renamed from: d, reason: collision with root package name */
        long f4548d;

        /* renamed from: e, reason: collision with root package name */
        int f4549e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f4550f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ k1.g f4552h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f4553i;

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li0/f;", "delta", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, i0.f> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y0 f4554b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ q0 f4555c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var, q0 q0Var) {
                super(1);
                this.f4554b = y0Var;
                this.f4555c = q0Var;
            }

            public final long a(long j4) {
                y0 y0Var = this.f4554b;
                q0 q0Var = this.f4555c;
                long k4 = y0Var.k(j4);
                androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
                return y0Var.k(y0Var.c(q0Var, k4, androidx.compose.ui.input.nestedscroll.f.f18688d));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ i0.f invoke(i0.f fVar) {
                return i0.f.d(a(fVar.getPackedValue()));
            }
        }

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/y0$c$b", "Landroidx/compose/foundation/gestures/q0;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements q0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y0 f4556a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<i0.f, i0.f> f4557b;

            /* JADX WARN: Multi-variable type inference failed */
            b(y0 y0Var, ld.l<? super i0.f, i0.f> lVar) {
                this.f4556a = y0Var;
                this.f4557b = lVar;
            }

            @Override // androidx.compose.foundation.gestures.q0
            public float a(float pixels) {
                y0 y0Var = this.f4556a;
                return y0Var.q(this.f4557b.invoke(i0.f.d(y0Var.r(pixels))).getPackedValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.g gVar, long j4, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f4552h = gVar;
            this.f4553i = j4;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = y0.this.new c(this.f4552h, this.f4553i, dVar);
            cVar.f4550f = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            y0 y0Var;
            k1.g gVar;
            y0 y0Var2;
            long j4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4549e;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                b bVar = new b(y0.this, new a(y0.this, (q0) this.f4550f));
                y0Var = y0.this;
                k1.g gVar2 = this.f4552h;
                long j5 = this.f4553i;
                e0 e0Var = y0Var.flingBehavior;
                long j6 = gVar2.f75328b;
                float j7 = y0Var.j(y0Var.p(j5));
                this.f4550f = y0Var;
                this.f4546b = y0Var;
                this.f4547c = gVar2;
                this.f4548d = j6;
                this.f4549e = 1;
                obj = e0Var.a(bVar, j7, this);
                if (obj == aVar) {
                    return aVar;
                }
                gVar = gVar2;
                y0Var2 = y0Var;
                j4 = j6;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j4 = this.f4548d;
                gVar = (k1.g) this.f4547c;
                y0Var = (y0) this.f4546b;
                y0Var2 = (y0) this.f4550f;
                kotlin.a1.n(obj);
            }
            gVar.f75328b = y0Var.t(j4, y0Var2.j(((Number) obj).floatValue()));
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0, 1}, l = {820, 822}, m = "onDragStopped-sF-c-tU", n = {"this", "this"}, s = {"L$0", "L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4558b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4559c;

        /* renamed from: e, reason: collision with root package name */
        int f4561e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4559c = obj;
            this.f4561e |= Integer.MIN_VALUE;
            return y0.this.g(0L, this);
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {804, 807, 810}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/c0;", "velocity", "<anonymous>", "(Landroidx/compose/ui/unit/c0;)Landroidx/compose/ui/unit/c0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, Object> {

        /* renamed from: b, reason: collision with root package name */
        long f4562b;

        /* renamed from: c, reason: collision with root package name */
        int f4563c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ long f4564d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @fg.m
        public final Object a(long j4, @fg.m kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            return ((e) create(androidx.compose.ui.unit.c0.b(j4), dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = y0.this.new e(dVar);
            eVar.f4564d = ((androidx.compose.ui.unit.c0) obj).getPackedValue();
            return eVar;
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.ui.unit.c0 c0Var, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            return a(c0Var.getPackedValue(), dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r0 = r13.f4563c
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L33
                if (r0 == r3) goto L2c
                if (r0 == r2) goto L22
                if (r0 != r1) goto L1a
                long r0 = r13.f4562b
                long r2 = r13.f4564d
                kotlin.a1.n(r14)
                r9 = r0
                r0 = r14
                goto L87
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                long r2 = r13.f4562b
                long r4 = r13.f4564d
                kotlin.a1.n(r14)
                r0 = r14
                r7 = r4
                goto L66
            L2c:
                long r3 = r13.f4564d
                kotlin.a1.n(r14)
                r0 = r14
                goto L4a
            L33:
                kotlin.a1.n(r14)
                long r4 = r13.f4564d
                androidx.compose.foundation.gestures.y0 r0 = androidx.compose.foundation.gestures.y0.this
                androidx.compose.ui.input.nestedscroll.b r0 = androidx.compose.foundation.gestures.y0.b(r0)
                r13.f4564d = r4
                r13.f4563c = r3
                java.lang.Object r0 = r0.c(r4, r13)
                if (r0 != r6) goto L49
                return r6
            L49:
                r3 = r4
            L4a:
                androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
                long r7 = r0.getPackedValue()
                long r7 = androidx.compose.ui.unit.c0.p(r3, r7)
                androidx.compose.foundation.gestures.y0 r0 = androidx.compose.foundation.gestures.y0.this
                r13.f4564d = r3
                r13.f4562b = r7
                r13.f4563c = r2
                java.lang.Object r0 = r0.d(r7, r13)
                if (r0 != r6) goto L63
                return r6
            L63:
                r11 = r3
                r2 = r7
                r7 = r11
            L66:
                androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
                long r9 = r0.getPackedValue()
                androidx.compose.foundation.gestures.y0 r0 = androidx.compose.foundation.gestures.y0.this
                androidx.compose.ui.input.nestedscroll.b r0 = androidx.compose.foundation.gestures.y0.b(r0)
                long r2 = androidx.compose.ui.unit.c0.p(r2, r9)
                r13.f4564d = r7
                r13.f4562b = r9
                r13.f4563c = r1
                r1 = r2
                r3 = r9
                r5 = r13
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L86
                return r6
            L86:
                r2 = r7
            L87:
                androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
                long r0 = r0.getPackedValue()
                long r0 = androidx.compose.ui.unit.c0.p(r9, r0)
                long r0 = androidx.compose.ui.unit.c0.p(r2, r0)
                androidx.compose.ui.unit.c0 r0 = androidx.compose.ui.unit.c0.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.y0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public y0(@fg.l w0 w0Var, @fg.l j0 j0Var, @fg.m i2 i2Var, boolean z4, @fg.l e0 e0Var, @fg.l androidx.compose.ui.input.nestedscroll.b bVar) {
        k2<Boolean> g4;
        this.scrollableState = w0Var;
        this.orientation = j0Var;
        this.overscrollEffect = i2Var;
        this.reverseDirection = z4;
        this.flingBehavior = e0Var;
        this.nestedScrollDispatcher = bVar;
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        this.isNestedFlinging = g4;
    }

    private final boolean f() {
        return this.scrollableState.a() || this.scrollableState.e();
    }

    public final long c(@fg.l q0 q0Var, long j4, int i4) {
        a aVar = new a(i4, q0Var);
        i2 i2Var = this.overscrollEffect;
        androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
        return androidx.compose.ui.input.nestedscroll.f.h(i4, androidx.compose.ui.input.nestedscroll.f.f18690f) ? aVar.invoke(i0.f.d(j4)).getPackedValue() : (i2Var == null || !f()) ? aVar.invoke(i0.f.d(j4)).getPackedValue() : i2Var.c(j4, i4, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r12, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.y0.b
            if (r0 == 0) goto L14
            r0 = r14
            androidx.compose.foundation.gestures.y0$b r0 = (androidx.compose.foundation.gestures.y0.b) r0
            int r1 = r0.f4545e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4545e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.y0$b r0 = new androidx.compose.foundation.gestures.y0$b
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r4.f4543c
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r4.f4545e
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r12 = r4.f4542b
            kotlin.jvm.internal.k1$g r12 = (kotlin.jvm.internal.k1.g) r12
            kotlin.a1.n(r14)
            goto L5a
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlin.a1.n(r14)
            kotlin.jvm.internal.k1$g r14 = new kotlin.jvm.internal.k1$g
            r14.<init>()
            r14.f75328b = r12
            androidx.compose.foundation.gestures.w0 r1 = r11.scrollableState
            androidx.compose.foundation.gestures.y0$c r3 = new androidx.compose.foundation.gestures.y0$c
            r10 = 0
            r5 = r3
            r6 = r11
            r7 = r14
            r8 = r12
            r5.<init>(r7, r8, r10)
            r4.f4542b = r14
            r4.f4545e = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = androidx.compose.foundation.gestures.w0.h(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L59
            return r0
        L59:
            r12 = r14
        L5a:
            long r12 = r12.f75328b
            androidx.compose.ui.unit.c0 r12 = androidx.compose.ui.unit.c0.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.y0.d(long, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final w0 getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.y0.d
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.y0$d r0 = (androidx.compose.foundation.gestures.y0.d) r0
            int r1 = r0.f4561e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4561e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.y0$d r0 = new androidx.compose.foundation.gestures.y0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4559c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4561e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            java.lang.Object r7 = r0.f4558b
            androidx.compose.foundation.gestures.y0 r7 = (androidx.compose.foundation.gestures.y0) r7
            kotlin.a1.n(r9)
            goto L6d
        L37:
            kotlin.a1.n(r9)
            r6.i(r4)
            long r7 = r6.o(r7)
            androidx.compose.foundation.gestures.y0$e r9 = new androidx.compose.foundation.gestures.y0$e
            r2 = 0
            r9.<init>(r2)
            androidx.compose.foundation.i2 r2 = r6.overscrollEffect
            if (r2 == 0) goto L5e
            boolean r5 = r6.f()
            if (r5 == 0) goto L5e
            r0.f4558b = r6
            r0.f4561e = r4
            java.lang.Object r7 = r2.d(r7, r9, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r7 = r6
            goto L6d
        L5e:
            androidx.compose.ui.unit.c0 r7 = androidx.compose.ui.unit.c0.b(r7)
            r0.f4558b = r6
            r0.f4561e = r3
            java.lang.Object r7 = r9.invoke(r7, r0)
            if (r7 != r1) goto L5c
            return r1
        L6d:
            r8 = 0
            r7.i(r8)
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.y0.g(long, kotlin.coroutines.d):java.lang.Object");
    }

    public final long h(long scroll) {
        if (!this.scrollableState.d()) {
            return r(j(this.scrollableState.b(j(q(scroll)))));
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    public final void i(boolean isFlinging) {
        this.isNestedFlinging.setValue(Boolean.valueOf(isFlinging));
    }

    public final float j(float f4) {
        return this.reverseDirection ? f4 * (-1) : f4;
    }

    public final long k(long j4) {
        return this.reverseDirection ? i0.f.x(j4, -1.0f) : j4;
    }

    public final void l(@fg.l w0 w0Var) {
        this.scrollableState = w0Var;
    }

    public final boolean m() {
        if (!this.scrollableState.d() && !this.isNestedFlinging.getValue().booleanValue()) {
            i2 i2Var = this.overscrollEffect;
            if (!(i2Var != null ? i2Var.a() : false)) {
                return false;
            }
        }
        return true;
    }

    public final long n(long j4) {
        return this.orientation == j0.Horizontal ? i0.f.i(j4, 0.0f, 0.0f, 1, null) : i0.f.i(j4, 0.0f, 0.0f, 2, null);
    }

    public final long o(long j4) {
        return this.orientation == j0.Horizontal ? androidx.compose.ui.unit.c0.g(j4, 0.0f, 0.0f, 1, null) : androidx.compose.ui.unit.c0.g(j4, 0.0f, 0.0f, 2, null);
    }

    public final float p(long j4) {
        return this.orientation == j0.Horizontal ? androidx.compose.ui.unit.c0.l(j4) : androidx.compose.ui.unit.c0.n(j4);
    }

    public final float q(long j4) {
        return this.orientation == j0.Horizontal ? i0.f.p(j4) : i0.f.r(j4);
    }

    public final long r(float f4) {
        if (f4 != 0.0f) {
            return this.orientation == j0.Horizontal ? i0.g.a(f4, 0.0f) : i0.g.a(0.0f, f4);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    public final void s(@fg.l w0 scrollableState, @fg.l j0 orientation, @fg.m i2 overscrollEffect, boolean reverseDirection, @fg.l e0 flingBehavior, @fg.l androidx.compose.ui.input.nestedscroll.b nestedScrollDispatcher) {
        this.scrollableState = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.reverseDirection = reverseDirection;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
    }

    public final long t(long j4, float f4) {
        return this.orientation == j0.Horizontal ? androidx.compose.ui.unit.c0.g(j4, f4, 0.0f, 2, null) : androidx.compose.ui.unit.c0.g(j4, 0.0f, f4, 1, null);
    }
}
