package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.l2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: UpdatableAnimationState.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JL\u0010\u000f\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/compose/foundation/gestures/h1;", "", "Landroidx/compose/animation/core/k;", "", "animationSpec", "<init>", "(Landroidx/compose/animation/core/k;)V", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "valueDelta", "Lkotlin/k2;", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "h", "(Lld/l;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/l2;", "Landroidx/compose/animation/core/o;", "a", "Landroidx/compose/animation/core/l2;", "vectorizedSpec", "", "b", "J", "lastFrameTime", "c", "Landroidx/compose/animation/core/o;", "lastVelocity", "", "d", "Z", "isRunning", "e", "F", "i", "()F", "j", "(F)V", "value", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f4064g = 8;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final float f4065h = 0.01f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2<androidx.compose.animation.core.o> vectorizedSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTime = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.animation.core.o lastVelocity = f4066i;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isRunning;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float value;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final a f4063f = new a();

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.o f4066i = new androidx.compose.animation.core.o(0.0f);

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/h1$a;", "", "<init>", "()V", "", "", "b", "(F)Z", "Landroidx/compose/animation/core/o;", "ZeroVector", "Landroidx/compose/animation/core/o;", "a", "()Landroidx/compose/animation/core/o;", "VisibilityThreshold", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        @fg.l
        public final androidx.compose.animation.core.o a() {
            return h1.f4066i;
        }

        public final boolean b(float f4) {
            return Math.abs(f4) < 0.01f;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: UpdatableAnimationState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {101, 147}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4072b;

        /* renamed from: c, reason: collision with root package name */
        Object f4073c;

        /* renamed from: d, reason: collision with root package name */
        Object f4074d;

        /* renamed from: e, reason: collision with root package name */
        float f4075e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4076f;

        /* renamed from: h, reason: collision with root package name */
        int f4078h;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4076f = obj;
            this.f4078h |= Integer.MIN_VALUE;
            return h1.this.h(null, null, this);
        }
    }

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Long, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4080c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, k2> f4081d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(float f4, ld.l<? super Float, k2> lVar) {
            super(1);
            this.f4080c = f4;
            this.f4081d = lVar;
        }

        public final void a(long j4) {
            long N0;
            if (h1.this.lastFrameTime == Long.MIN_VALUE) {
                h1.this.lastFrameTime = j4;
            }
            androidx.compose.animation.core.o oVar = new androidx.compose.animation.core.o(h1.this.getValue());
            if (this.f4080c == 0.0f) {
                l2 l2Var = h1.this.vectorizedSpec;
                androidx.compose.animation.core.o oVar2 = new androidx.compose.animation.core.o(h1.this.getValue());
                h1.f4063f.getClass();
                N0 = l2Var.b(oVar2, h1.f4066i, h1.this.lastVelocity);
            } else {
                N0 = kotlin.math.b.N0((j4 - h1.this.lastFrameTime) / this.f4080c);
            }
            long j5 = N0;
            l2 l2Var2 = h1.this.vectorizedSpec;
            h1.f4063f.getClass();
            float value = ((androidx.compose.animation.core.o) l2Var2.m(j5, oVar, h1.f4066i, h1.this.lastVelocity)).getValue();
            h1 h1Var = h1.this;
            l2 l2Var3 = h1Var.vectorizedSpec;
            h1.f4063f.getClass();
            h1Var.lastVelocity = (androidx.compose.animation.core.o) l2Var3.j(j5, oVar, h1.f4066i, h1.this.lastVelocity);
            h1.this.lastFrameTime = j4;
            float value2 = h1.this.getValue() - value;
            h1.this.j(value);
            this.f4081d.invoke(Float.valueOf(value2));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Long l4) {
            a(l4.longValue());
            return k2.f75408a;
        }
    }

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Long, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, k2> f4083c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.l<? super Float, k2> lVar) {
            super(1);
            this.f4083c = lVar;
        }

        public final void a(long j4) {
            float value = h1.this.getValue();
            h1.this.j(0.0f);
            this.f4083c.invoke(Float.valueOf(value));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Long l4) {
            a(l4.longValue());
            return k2.f75408a;
        }
    }

    public h1(@fg.l androidx.compose.animation.core.k<Float> kVar) {
        this.vectorizedSpec = kVar.a(androidx.compose.animation.core.k2.i(kotlin.jvm.internal.a0.f75283a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009d -> B:24:0x00a0). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@fg.l ld.l<? super java.lang.Float, kotlin.k2> r13, @fg.l ld.a<kotlin.k2> r14, @fg.l kotlin.coroutines.d<? super kotlin.k2> r15) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.h1.h(ld.l, ld.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: i, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final void j(float f4) {
        this.value = f4;
    }
}
