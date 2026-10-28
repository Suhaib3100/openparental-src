package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.c1;
import androidx.compose.animation.core.m0;
import androidx.compose.animation.core.o;
import androidx.compose.animation.core.z;
import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import androidx.compose.ui.platform.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.ranges.s;
import org.apache.http.HttpStatus;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ag\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0012*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0018\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u0015*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a*\u0010\u001a\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u0015*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082\u0002¢\u0006\u0004\b\u001a\u0010\u0019\u001am\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0012*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0082@¢\u0006\u0004\b \u0010!\u001au\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0012*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060#2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0082@¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010(\u001a\u00020\u0006*\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)\u001a*\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u001e\u00103\u001a\u00020\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0082\b¢\u0006\u0004\b3\u00104\"\u001a\u0010:\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0014\u0010<\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u00107\"\u0014\u0010>\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u00107\"\u0014\u0010B\u001a\u00020?8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/j;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/h;", "q", "(Landroidx/compose/foundation/gestures/snapping/j;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/gestures/snapping/h;", "Landroidx/compose/foundation/gestures/q0;", "", "initialTargetOffset", "initialVelocity", "Landroidx/compose/foundation/gestures/snapping/b;", "Landroidx/compose/animation/core/o;", "animation", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "delta", "Lkotlin/k2;", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/a;", "i", "(Landroidx/compose/foundation/gestures/q0;FFLandroidx/compose/foundation/gestures/snapping/b;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "T", "Lkotlin/ranges/f;", "m", "(Lkotlin/ranges/f;)Ljava/lang/Comparable;", "n", "targetOffset", "Landroidx/compose/animation/core/m;", "animationState", "Landroidx/compose/animation/core/z;", "decayAnimationSpec", "f", "(Landroidx/compose/foundation/gestures/q0;FLandroidx/compose/animation/core/m;Landroidx/compose/animation/core/z;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cancelOffset", "Landroidx/compose/animation/core/k;", "animationSpec", "h", "(Landroidx/compose/foundation/gestures/q0;FFLandroidx/compose/animation/core/m;Landroidx/compose/animation/core/k;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "target", "l", "(FF)F", "Landroidx/compose/foundation/gestures/snapping/c;", "snappingOffset", "lowerBound", "upperBound", "j", "(IFF)F", "Lkotlin/Function0;", "", "generateMsg", "o", "(Lld/a;)V", "Landroidx/compose/ui/unit/h;", "a", "F", "p", "()F", "MinFlingVelocityDp", "b", "NoDistance", "c", "NoVelocity", "", "d", "Z", "DEBUG", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,538:1\n534#1,4:550\n534#1,4:554\n534#1,4:558\n74#2:539\n67#3,3:540\n66#3:543\n1116#4,6:544\n154#5:562\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n381#1:550,4\n425#1:554,4\n508#1:558,4\n286#1:539\n288#1:540,3\n288#1:543\n288#1:544,6\n494#1:562\n*E\n"})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final float f4289a = androidx.compose.ui.unit.h.g(400);

    /* renamed from: b, reason: collision with root package name */
    public static final float f4290b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f4291c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f4292d = false;

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {364}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        float f4293b;

        /* renamed from: c, reason: collision with root package name */
        Object f4294c;

        /* renamed from: d, reason: collision with root package name */
        Object f4295d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4296e;

        /* renamed from: f, reason: collision with root package name */
        int f4297f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4296e = obj;
            this.f4297f |= Integer.MIN_VALUE;
            return i.f(null, 0.0f, null, null, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<androidx.compose.animation.core.j<Float, o>, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4298b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.e f4299c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0 f4300d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, k2> f4301e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(float f4, k1.e eVar, q0 q0Var, ld.l<? super Float, k2> lVar) {
            super(1);
            this.f4298b = f4;
            this.f4299c = eVar;
            this.f4300d = q0Var;
            this.f4301e = lVar;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Float, o> jVar) {
            if (Math.abs(jVar.g().floatValue()) < Math.abs(this.f4298b)) {
                i.g(jVar, this.f4300d, this.f4301e, jVar.g().floatValue() - this.f4299c.f75326b);
                this.f4299c.f75326b = jVar.g().floatValue();
                return;
            }
            float l4 = i.l(jVar.g().floatValue(), this.f4298b);
            i.g(jVar, this.f4300d, this.f4301e, l4 - this.f4299c.f75326b);
            jVar.a();
            this.f4299c.f75326b = l4;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.animation.core.j<Float, o> jVar) {
            a(jVar);
            return k2.f75408a;
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {HttpStatus.SC_CONFLICT}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        float f4302b;

        /* renamed from: c, reason: collision with root package name */
        float f4303c;

        /* renamed from: d, reason: collision with root package name */
        Object f4304d;

        /* renamed from: e, reason: collision with root package name */
        Object f4305e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4306f;

        /* renamed from: g, reason: collision with root package name */
        int f4307g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4306f = obj;
            this.f4307g |= Integer.MIN_VALUE;
            return i.h(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<androidx.compose.animation.core.j<Float, o>, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4308b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.e f4309c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0 f4310d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, k2> f4311e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(float f4, k1.e eVar, q0 q0Var, ld.l<? super Float, k2> lVar) {
            super(1);
            this.f4308b = f4;
            this.f4309c = eVar;
            this.f4310d = q0Var;
            this.f4311e = lVar;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Float, o> jVar) {
            float l4 = i.l(jVar.g().floatValue(), this.f4308b);
            float f4 = l4 - this.f4309c.f75326b;
            float a5 = this.f4310d.a(f4);
            this.f4311e.invoke(Float.valueOf(a5));
            if (Math.abs(f4 - a5) > 0.5f || l4 != jVar.g().floatValue()) {
                jVar.a();
            }
            this.f4309c.f75326b += a5;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.animation.core.j<Float, o> jVar) {
            a(jVar);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(androidx.compose.foundation.gestures.q0 r5, float r6, androidx.compose.animation.core.m<java.lang.Float, androidx.compose.animation.core.o> r7, androidx.compose.animation.core.z<java.lang.Float> r8, ld.l<? super java.lang.Float, kotlin.k2> r9, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<java.lang.Float, androidx.compose.animation.core.o>> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.i.a
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.i$a r0 = (androidx.compose.foundation.gestures.snapping.i.a) r0
            int r1 = r0.f4297f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4297f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.i$a r0 = new androidx.compose.foundation.gestures.snapping.i$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f4296e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4297f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            float r6 = r0.f4293b
            java.lang.Object r5 = r0.f4295d
            kotlin.jvm.internal.k1$e r5 = (kotlin.jvm.internal.k1.e) r5
            java.lang.Object r7 = r0.f4294c
            androidx.compose.animation.core.m r7 = (androidx.compose.animation.core.m) r7
            kotlin.a1.n(r10)
            goto L69
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.a1.n(r10)
            kotlin.jvm.internal.k1$e r10 = new kotlin.jvm.internal.k1$e
            r10.<init>()
            java.lang.Object r2 = r7.m()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L52
            r2 = r3
            goto L53
        L52:
            r2 = 0
        L53:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.i$b r4 = new androidx.compose.foundation.gestures.snapping.i$b
            r4.<init>(r6, r10, r5, r9)
            r0.f4294c = r7
            r0.f4295d = r10
            r0.f4293b = r6
            r0.f4297f = r3
            java.lang.Object r5 = androidx.compose.animation.core.c2.j(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L68
            return r1
        L68:
            r5 = r10
        L69:
            androidx.compose.foundation.gestures.snapping.a r8 = new androidx.compose.foundation.gestures.snapping.a
            float r5 = r5.f75326b
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.i.f(androidx.compose.foundation.gestures.q0, float, androidx.compose.animation.core.m, androidx.compose.animation.core.z, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(androidx.compose.animation.core.j<Float, o> jVar, q0 q0Var, ld.l<? super Float, k2> lVar, float f4) {
        float a5 = q0Var.a(f4);
        lVar.invoke(Float.valueOf(a5));
        if (Math.abs(f4 - a5) > 0.5f) {
            jVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(androidx.compose.foundation.gestures.q0 r13, float r14, float r15, androidx.compose.animation.core.m<java.lang.Float, androidx.compose.animation.core.o> r16, androidx.compose.animation.core.k<java.lang.Float> r17, ld.l<? super java.lang.Float, kotlin.k2> r18, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<java.lang.Float, androidx.compose.animation.core.o>> r19) {
        /*
            r0 = r14
            r1 = r19
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.snapping.i.c
            if (r2 == 0) goto L17
            r2 = r1
            androidx.compose.foundation.gestures.snapping.i$c r2 = (androidx.compose.foundation.gestures.snapping.i.c) r2
            int r3 = r2.f4307g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f4307g = r3
        L15:
            r8 = r2
            goto L1d
        L17:
            androidx.compose.foundation.gestures.snapping.i$c r2 = new androidx.compose.foundation.gestures.snapping.i$c
            r2.<init>(r1)
            goto L15
        L1d:
            java.lang.Object r1 = r8.f4306f
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r3 = r8.f4307g
            r4 = 1
            if (r3 == 0) goto L43
            if (r3 != r4) goto L3b
            float r0 = r8.f4303c
            float r2 = r8.f4302b
            java.lang.Object r3 = r8.f4305e
            kotlin.jvm.internal.k1$e r3 = (kotlin.jvm.internal.k1.e) r3
            java.lang.Object r4 = r8.f4304d
            androidx.compose.animation.core.m r4 = (androidx.compose.animation.core.m) r4
            kotlin.a1.n(r1)
            r9 = r0
            r0 = r2
            r1 = r4
            goto L91
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            kotlin.a1.n(r1)
            kotlin.jvm.internal.k1$e r1 = new kotlin.jvm.internal.k1$e
            r1.<init>()
            java.lang.Object r3 = r16.m()
            java.lang.Number r3 = (java.lang.Number) r3
            float r9 = r3.floatValue()
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r14)
            java.lang.Object r3 = r16.m()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L6b
            r3 = r4
            goto L6c
        L6b:
            r3 = 0
        L6c:
            r6 = r3 ^ 1
            androidx.compose.foundation.gestures.snapping.i$d r7 = new androidx.compose.foundation.gestures.snapping.i$d
            r3 = r13
            r10 = r15
            r11 = r18
            r7.<init>(r15, r1, r13, r11)
            r10 = r16
            r8.f4304d = r10
            r8.f4305e = r1
            r8.f4302b = r0
            r8.f4303c = r9
            r8.f4307g = r4
            r3 = r16
            r4 = r5
            r5 = r17
            java.lang.Object r3 = androidx.compose.animation.core.c2.l(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L8f
            return r2
        L8f:
            r3 = r1
            r1 = r10
        L91:
            java.lang.Object r2 = r1.m()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r4 = l(r2, r9)
            androidx.compose.foundation.gestures.snapping.a r11 = new androidx.compose.foundation.gestures.snapping.a
            float r2 = r3.f75326b
            float r0 = r0 - r2
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r0)
            r9 = 29
            r10 = 0
            r2 = 0
            r5 = 0
            r7 = 0
            r0 = 0
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r0
            androidx.compose.animation.core.m r0 = androidx.compose.animation.core.n.g(r1, r2, r3, r4, r6, r8, r9, r10)
            r11.<init>(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.i.h(androidx.compose.foundation.gestures.q0, float, float, androidx.compose.animation.core.m, androidx.compose.animation.core.k, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(q0 q0Var, float f4, float f5, androidx.compose.foundation.gestures.snapping.b<Float, o> bVar, ld.l<? super Float, k2> lVar, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, o>> dVar) {
        return bVar.a(q0Var, new Float(f4), new Float(f5), lVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (java.lang.Math.abs(r5) <= java.lang.Math.abs(r4)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float j(int r3, float r4, float r5) {
        /*
            androidx.compose.foundation.gestures.snapping.c$a r0 = androidx.compose.foundation.gestures.snapping.c.INSTANCE
            r0.getClass()
            int r1 = androidx.compose.foundation.gestures.snapping.c.a()
            boolean r1 = androidx.compose.foundation.gestures.snapping.c.g(r3, r1)
            r2 = 0
            if (r1 == 0) goto L1d
            float r3 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r4)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L3b
            goto L2a
        L1d:
            r0.getClass()
            int r1 = androidx.compose.foundation.gestures.snapping.c.b()
            boolean r1 = androidx.compose.foundation.gestures.snapping.c.g(r3, r1)
            if (r1 == 0) goto L2c
        L2a:
            r4 = r5
            goto L3b
        L2c:
            r0.getClass()
            int r5 = androidx.compose.foundation.gestures.snapping.c.c()
            boolean r3 = androidx.compose.foundation.gestures.snapping.c.g(r3, r5)
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            r4 = r2
        L3b:
            boolean r3 = k(r4)
            if (r3 == 0) goto L42
            r2 = r4
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.i.j(int, float, float):float");
    }

    private static final boolean k(float f4) {
        return (f4 == Float.POSITIVE_INFINITY || f4 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return f5 > 0.0f ? s.A(f4, f5) : s.t(f4, f5);
    }

    private static final <T extends Comparable<? super T>> T m(kotlin.ranges.f<T> fVar) {
        return fVar.c();
    }

    private static final <T extends Comparable<? super T>> T n(kotlin.ranges.f<T> fVar) {
        return fVar.h();
    }

    private static final void o(ld.a<String> aVar) {
    }

    public static final float p() {
        return f4289a;
    }

    @fg.l
    @z0
    @androidx.compose.runtime.i
    public static final h q(@fg.l j jVar, @fg.m t tVar, int i4) {
        tVar.P(-473984552);
        if (x.b0()) {
            x.r0(-473984552, i4, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:284)");
        }
        Object obj = (androidx.compose.ui.unit.d) tVar.x(h1.i());
        z b5 = c1.b(tVar, 0);
        tVar.P(1618982084);
        boolean q02 = tVar.q0(obj) | tVar.q0(jVar) | tVar.q0(b5);
        Object Q = tVar.Q();
        if (q02 || Q == t.INSTANCE.a()) {
            Q = new h(jVar, androidx.compose.animation.core.l.r(0, 0, m0.e(), 3, null), b5, androidx.compose.animation.core.l.p(0.0f, 400.0f, null, 5, null));
            tVar.E(Q);
        }
        tVar.p0();
        h hVar = (h) Q;
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return hVar;
    }
}
