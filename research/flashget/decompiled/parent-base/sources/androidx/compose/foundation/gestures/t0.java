package androidx.compose.foundation.gestures;

import androidx.compose.foundation.i2;
import androidx.compose.runtime.x4;
import androidx.constraintlayout.core.motion.utils.w;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.k2;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001A\u001aO\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\" \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"J\u0010)\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0012\u0004\u0018\u00010%0\u001d¢\u0006\u0002\b&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\" \u00103\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u001a\u00108\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0014\u0010;\u001a\u0002098\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010:\"\u001a\u0010@\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?\"\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010B¨\u0006D"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/gestures/w0;", "state", "Landroidx/compose/foundation/gestures/j0;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "k", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/gestures/w0;Landroidx/compose/foundation/gestures/j0;ZZLandroidx/compose/foundation/gestures/e0;Landroidx/compose/foundation/interaction/k;)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/i2;", "overscrollEffect", "Landroidx/compose/foundation/gestures/k;", "bringIntoViewSpec", "j", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/gestures/w0;Landroidx/compose/foundation/gestures/j0;Landroidx/compose/foundation/i2;ZZLandroidx/compose/foundation/gestures/e0;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/gestures/k;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/p;", "f", "(Landroidx/compose/ui/input/pointer/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/b0;", "a", "Lld/l;", "CanDragCalculation", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Li0/f;", "Lkotlin/r0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "b", "Lld/q;", "NoOpOnDragStarted", "Landroidx/compose/foundation/gestures/q0;", "c", "Landroidx/compose/foundation/gestures/q0;", "NoOpScrollScope", "Landroidx/compose/ui/modifier/p;", "d", "Landroidx/compose/ui/modifier/p;", "h", "()Landroidx/compose/ui/modifier/p;", "ModifierLocalScrollableContainer", "e", "Landroidx/compose/foundation/gestures/e0;", "i", "()Landroidx/compose/foundation/gestures/e0;", "NoOpFlingBehavior", "", "F", "DefaultScrollMotionDurationScaleFactor", "Landroidx/compose/ui/s;", "g", "Landroidx/compose/ui/s;", "()Landroidx/compose/ui/s;", "DefaultScrollMotionDurationScale", "androidx/compose/foundation/gestures/t0$g", "Landroidx/compose/foundation/gestures/t0$g;", "UnityDensity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: f, reason: collision with root package name */
    private static final float f4329f = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ld.l<androidx.compose.ui.input.pointer.b0, Boolean> f4324a = a.f4332b;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final ld.q<kotlinx.coroutines.r0, i0.f, kotlin.coroutines.d<? super k2>, Object> f4325b = new e(3, null);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final q0 f4326c = new f();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.modifier.p<Boolean> f4327d = androidx.compose.ui.modifier.g.a(c.f4333b);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final e0 f4328e = new d();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.s f4330g = new b();

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final g f4331h = new g();

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "down", "", "a", "(Landroidx/compose/ui/input/pointer/b0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f4332b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
            int type = b0Var.getType();
            androidx.compose.ui.input.pointer.q0.INSTANCE.getClass();
            return Boolean.valueOf(!androidx.compose.ui.input.pointer.q0.i(type, androidx.compose.ui.input.pointer.q0.f18818e));
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/t0$b", "Landroidx/compose/ui/s;", "", "B", "()F", "scaleFactor", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.compose.ui.s {
        b() {
        }

        @Override // androidx.compose.ui.s
        public float B() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.g
        @fg.l
        public kotlin.coroutines.g O(@fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(this, gVar);
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        @fg.m
        public <E extends g.b> E c(@fg.l g.c<E> cVar) {
            return (E) g.b.a.b(this, cVar);
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        @fg.l
        public kotlin.coroutines.g d(@fg.l g.c<?> cVar) {
            return g.b.a.c(this, cVar);
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        public <R> R g(R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(this, r4, pVar);
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f4333b = new c(0);

        c() {
            super(0);
        }

        @fg.l
        public final Boolean a() {
            return Boolean.FALSE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/gestures/t0$d", "Landroidx/compose/foundation/gestures/e0;", "Landroidx/compose/foundation/gestures/q0;", "", "initialVelocity", "a", "(Landroidx/compose/foundation/gestures/q0;FLkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements e0 {
        d() {
        }

        @Override // androidx.compose.foundation.gestures.e0
        @fg.m
        public Object a(@fg.l q0 q0Var, float f4, @fg.l kotlin.coroutines.d<? super Float> dVar) {
            return new Float(0.0f);
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$NoOpOnDragStarted$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Li0/f;", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Li0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, i0.f, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4334b;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, i0.f fVar, kotlin.coroutines.d<? super k2> dVar) {
            return a(r0Var, fVar.getPackedValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, long j4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return new e(3, dVar).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4334b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/t0$f", "Landroidx/compose/foundation/gestures/q0;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements q0 {
        f() {
        }

        @Override // androidx.compose.foundation.gestures.q0
        public float a(float pixels) {
            return pixels;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/foundation/gestures/t0$g", "Landroidx/compose/ui/unit/d;", "", "b", "()F", "density", "U", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements androidx.compose.ui.unit.d {
        g() {
        }

        @Override // androidx.compose.ui.unit.n
        /* renamed from: U */
        public float getFontScale() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: b */
        public float getDensity() {
            return 1.0f;
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0}, l = {w.h.f22555k}, m = "awaitScrollEvent", n = {"$this$awaitScrollEvent"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4335b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4336c;

        /* renamed from: d, reason: collision with root package name */
        int f4337d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4336c = obj;
            this.f4337d |= Integer.MIN_VALUE;
            return t0.f(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003f -> B:10:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(androidx.compose.ui.input.pointer.c r5, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.p> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.t0.h
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.t0$h r0 = (androidx.compose.foundation.gestures.t0.h) r0
            int r1 = r0.f4337d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4337d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.t0$h r0 = new androidx.compose.foundation.gestures.t0$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4336c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4337d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f4335b
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.c) r5
            kotlin.a1.n(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.a1.n(r6)
        L36:
            r0.f4335b = r5
            r0.f4337d = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.ui.input.pointer.c.a1(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L42
            return r1
        L42:
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.ui.input.pointer.p) r6
            int r2 = r6.getType()
            androidx.compose.ui.input.pointer.t$a r4 = androidx.compose.ui.input.pointer.t.INSTANCE
            r4.getClass()
            int r4 = androidx.compose.ui.input.pointer.t.f()
            boolean r2 = androidx.compose.ui.input.pointer.t.k(r2, r4)
            if (r2 == 0) goto L36
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.t0.f(androidx.compose.ui.input.pointer.c, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    public static final androidx.compose.ui.s g() {
        return f4330g;
    }

    @fg.l
    public static final androidx.compose.ui.modifier.p<Boolean> h() {
        return f4327d;
    }

    @fg.l
    public static final e0 i() {
        return f4328e;
    }

    @x4
    @fg.l
    @androidx.compose.foundation.z0
    public static final androidx.compose.ui.q j(@fg.l androidx.compose.ui.q qVar, @fg.l w0 w0Var, @fg.l j0 j0Var, @fg.m i2 i2Var, boolean z4, boolean z5, @fg.m e0 e0Var, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l k kVar2) {
        return qVar.w3(new ScrollableElement(w0Var, j0Var, i2Var, z4, z5, e0Var, kVar, kVar2));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q k(@fg.l androidx.compose.ui.q qVar, @fg.l w0 w0Var, @fg.l j0 j0Var, boolean z4, boolean z5, @fg.m e0 e0Var, @fg.m androidx.compose.foundation.interaction.k kVar) {
        return l(qVar, w0Var, j0Var, null, z4, z5, e0Var, kVar, null, 128, null);
    }

    public static androidx.compose.ui.q l(androidx.compose.ui.q qVar, w0 w0Var, j0 j0Var, i2 i2Var, boolean z4, boolean z5, e0 e0Var, androidx.compose.foundation.interaction.k kVar, k kVar2, int i4, Object obj) {
        k kVar3;
        boolean z6 = (i4 & 8) != 0 ? true : z4;
        boolean z7 = (i4 & 16) != 0 ? false : z5;
        e0 e0Var2 = (i4 & 32) != 0 ? null : e0Var;
        androidx.compose.foundation.interaction.k kVar4 = (i4 & 64) != 0 ? null : kVar;
        if ((i4 & 128) != 0) {
            r0.f4232a.getClass();
            kVar3 = k.INSTANCE.a();
        } else {
            kVar3 = kVar2;
        }
        return j(qVar, w0Var, j0Var, i2Var, z6, z7, e0Var2, kVar4, kVar3);
    }

    public static /* synthetic */ androidx.compose.ui.q m(androidx.compose.ui.q qVar, w0 w0Var, j0 j0Var, boolean z4, boolean z5, e0 e0Var, androidx.compose.foundation.interaction.k kVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        boolean z6 = z4;
        if ((i4 & 8) != 0) {
            z5 = false;
        }
        return k(qVar, w0Var, j0Var, z6, z5, (i4 & 16) != 0 ? null : e0Var, (i4 & 32) != 0 ? null : kVar);
    }
}
