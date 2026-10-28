package androidx.compose.material3;

import com.android.internal.telephony.SmsConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.k1;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n*\u0001E\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0014\u0010\u0012J(\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0015\u0010\u0012J0\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001c\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u001e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 JJ\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010!\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\"2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@¢\u0006\u0004\b$\u0010%JR\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0082@¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\u0005*\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u001c\u00102\u001a\u00020\u0005*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b2\u0010\u0012J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010;R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\bI\u0010CR\u001a\u0010M\u001a\u00020K8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bL\u0010CR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020.0N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0018\u0010W\u001a\u000208*\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/material3/s9;", "Landroidx/compose/foundation/gestures/e0;", "Landroidx/compose/foundation/lazy/c0;", "lazyListState", "Landroidx/compose/animation/core/z;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/k;", "snapAnimationSpec", "Landroidx/compose/ui/unit/d;", "density", "<init>", "(Landroidx/compose/foundation/lazy/c0;Landroidx/compose/animation/core/z;Landroidx/compose/animation/core/k;Landroidx/compose/ui/unit/d;)V", "Landroidx/compose/foundation/gestures/q0;", "initialVelocity", "Landroidx/compose/material3/o;", "Landroidx/compose/animation/core/o;", "v", "(Landroidx/compose/foundation/gestures/q0;FLkotlin/coroutines/d;)Ljava/lang/Object;", "velocity", "B", "z", "initialTargetOffset", "A", "(Landroidx/compose/foundation/gestures/q0;FFLkotlin/coroutines/d;)Ljava/lang/Object;", "", "T", "Lkotlin/ranges/f;", "q", "(Lkotlin/ranges/f;)Ljava/lang/Comparable;", "r", "s", "(FLandroidx/compose/foundation/lazy/c0;)F", "targetOffset", "Landroidx/compose/animation/core/m;", "animationState", "l", "(Landroidx/compose/foundation/gestures/q0;FLandroidx/compose/animation/core/m;Landroidx/compose/animation/core/z;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cancelOffset", "n", "(Landroidx/compose/foundation/gestures/q0;FFLandroidx/compose/animation/core/m;Landroidx/compose/animation/core/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "target", "p", "(FF)F", "Landroidx/compose/foundation/lazy/s;", "layoutInfo", "Landroidx/compose/foundation/lazy/n;", "item", "o", "(Landroidx/compose/foundation/lazy/s;Landroidx/compose/foundation/lazy/n;)F", "a", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/lazy/c0;", "b", "Landroidx/compose/animation/core/z;", "c", "Landroidx/compose/animation/core/k;", "d", "Landroidx/compose/ui/unit/d;", "e", "F", "velocityThreshold", "androidx/compose/material3/s9$h", "f", "Landroidx/compose/material3/s9$h;", "motionScaleDuration", "g", "DefaultScrollMotionDurationScaleFactor", "Landroidx/compose/ui/unit/h;", "h", "MinFlingVelocityDp", "", "y", "()Ljava/util/List;", "visibleItemsInfo", "w", "()F", "itemSize", "x", "(Landroidx/compose/foundation/lazy/s;)I", "singleAxisViewportSize", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@kotlin.jvm.internal.r1({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,356:1\n1#2:357\n154#3:358\n132#4,3:359\n33#4,4:362\n135#4,2:366\n38#4:368\n137#4:369\n33#4,6:370\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n*L\n346#1:358\n71#1:359,3\n71#1:362,4\n71#1:366,2\n71#1:368\n71#1:369\n199#1:370,6\n*E\n"})
/* loaded from: classes.dex */
public final class s9 implements androidx.compose.foundation.gestures.e0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f14352i = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.c0 lazyListState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.z<Float> decayAnimationSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.k<Float> snapAnimationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float velocityThreshold;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private h motionScaleDuration = new h();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float DefaultScrollMotionDurationScaleFactor = 1.0f;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float MinFlingVelocityDp = androidx.compose.ui.unit.h.g(400);

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {261}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        float f14361b;

        /* renamed from: c, reason: collision with root package name */
        Object f14362c;

        /* renamed from: d, reason: collision with root package name */
        Object f14363d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f14364e;

        /* renamed from: g, reason: collision with root package name */
        int f14366g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f14364e = obj;
            this.f14366g |= Integer.MIN_VALUE;
            return s9.this.l(null, 0.0f, null, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s9 f14368c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.e f14369d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.q0 f14370e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f4, s9 s9Var, k1.e eVar, androidx.compose.foundation.gestures.q0 q0Var) {
            super(1);
            this.f14367b = f4;
            this.f14368c = s9Var;
            this.f14369d = eVar;
            this.f14370e = q0Var;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            if (Math.abs(jVar.g().floatValue()) >= Math.abs(this.f14367b)) {
                s9.m(jVar, this.f14370e, this.f14368c.p(jVar.g().floatValue(), this.f14367b) - this.f14369d.f75326b);
                jVar.a();
            } else {
                s9.m(jVar, this.f14370e, jVar.g().floatValue() - this.f14369d.f75326b);
                this.f14369d.f75326b = jVar.g().floatValue();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            a(jVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0, 0}, l = {299}, m = "animateSnap", n = {"this", "animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f14371b;

        /* renamed from: c, reason: collision with root package name */
        Object f14372c;

        /* renamed from: d, reason: collision with root package name */
        Object f14373d;

        /* renamed from: e, reason: collision with root package name */
        float f14374e;

        /* renamed from: f, reason: collision with root package name */
        float f14375f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f14376g;

        /* renamed from: i, reason: collision with root package name */
        int f14378i;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f14376g = obj;
            this.f14378i |= Integer.MIN_VALUE;
            return s9.this.n(null, 0.0f, 0.0f, null, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14380c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.e f14381d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.q0 f14382e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f4, k1.e eVar, androidx.compose.foundation.gestures.q0 q0Var) {
            super(1);
            this.f14380c = f4;
            this.f14381d = eVar;
            this.f14382e = q0Var;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            float p4 = s9.this.p(jVar.g().floatValue(), this.f14380c);
            float f4 = p4 - this.f14381d.f75326b;
            float a5 = this.f14382e.a(f4);
            if (Math.abs(f4 - a5) > 0.5f || p4 != jVar.g().floatValue()) {
                jVar.a();
            }
            this.f14381d.f75326b += a5;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
            a(jVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {95}, m = "fling", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14383b;

        /* renamed from: d, reason: collision with root package name */
        int f14385d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f14383b = obj;
            this.f14385d |= Integer.MIN_VALUE;
            return s9.this.v(null, 0.0f, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {}, l = {97, 99}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/compose/material3/o;", "", "Landroidx/compose/animation/core/o;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/compose/material3/o;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super o<Float, androidx.compose.animation.core.o>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f14386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14387c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s9 f14388d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.q0 f14389e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f4, s9 s9Var, androidx.compose.foundation.gestures.q0 q0Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f14387c = f4;
            this.f14388d = s9Var;
            this.f14389e = q0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new f(this.f14387c, this.f14388d, this.f14389e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f14386b;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.a1.n(obj);
                    return (o) obj;
                }
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return (o) obj;
            }
            kotlin.a1.n(obj);
            if (Math.abs(this.f14387c) <= Math.abs(this.f14388d.velocityThreshold)) {
                s9 s9Var = this.f14388d;
                androidx.compose.foundation.gestures.q0 q0Var = this.f14389e;
                float f4 = this.f14387c;
                this.f14386b = 1;
                obj = s9Var.B(q0Var, f4, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (o) obj;
            }
            s9 s9Var2 = this.f14388d;
            androidx.compose.foundation.gestures.q0 q0Var2 = this.f14389e;
            float f5 = this.f14387c;
            this.f14386b = 2;
            obj = s9Var2.z(q0Var2, f5, this);
            if (obj == aVar) {
                return aVar;
            }
            return (o) obj;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super o<Float, androidx.compose.animation.core.o>> dVar) {
            return ((f) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0}, l = {135, SmsConstants.MAX_USER_DATA_BYTES}, m = "longSnap", n = {"this", "$this$longSnap"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f14390b;

        /* renamed from: c, reason: collision with root package name */
        Object f14391c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14392d;

        /* renamed from: f, reason: collision with root package name */
        int f14394f;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f14392d = obj;
            this.f14394f |= Integer.MIN_VALUE;
            return s9.this.z(null, 0.0f, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/material3/s9$h", "Landroidx/compose/ui/s;", "", "B", "()F", "scaleFactor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements androidx.compose.ui.s {
        h() {
        }

        @Override // androidx.compose.ui.s
        public float B() {
            return s9.this.DefaultScrollMotionDurationScaleFactor;
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

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {83}, m = "performFling", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14396b;

        /* renamed from: d, reason: collision with root package name */
        int f14398d;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f14396b = obj;
            this.f14398d |= Integer.MIN_VALUE;
            return s9.this.a(null, 0.0f, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {154}, m = "runApproach", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f14399b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14400c;

        /* renamed from: e, reason: collision with root package name */
        int f14402e;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f14400c = obj;
            this.f14402e |= Integer.MIN_VALUE;
            return s9.this.A(null, 0.0f, 0.0f, this);
        }
    }

    public s9(@fg.l androidx.compose.foundation.lazy.c0 c0Var, @fg.l androidx.compose.animation.core.z<Float> zVar, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l androidx.compose.ui.unit.d dVar) {
        this.lazyListState = c0Var;
        this.decayAnimationSpec = zVar;
        this.snapAnimationSpec = kVar;
        this.density = dVar;
        this.velocityThreshold = dVar.v5(this.MinFlingVelocityDp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(androidx.compose.foundation.gestures.q0 r18, float r19, float r20, kotlin.coroutines.d<? super androidx.compose.material3.o<java.lang.Float, androidx.compose.animation.core.o>> r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r21
            boolean r1 = r0 instanceof androidx.compose.material3.s9.j
            if (r1 == 0) goto L18
            r1 = r0
            androidx.compose.material3.s9$j r1 = (androidx.compose.material3.s9.j) r1
            int r2 = r1.f14402e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f14402e = r2
        L16:
            r5 = r1
            goto L1e
        L18:
            androidx.compose.material3.s9$j r1 = new androidx.compose.material3.s9$j
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r5.f14400c
            kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r5.f14402e
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r1 = r5.f14399b
            androidx.compose.material3.s9 r1 = (androidx.compose.material3.s9) r1
            kotlin.a1.n(r0)
            goto L60
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.a1.n(r0)
            r15 = 28
            r16 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r9 = r20
            androidx.compose.animation.core.m r3 = androidx.compose.animation.core.n.c(r8, r9, r10, r12, r14, r15, r16)
            androidx.compose.animation.core.z<java.lang.Float> r4 = r6.decayAnimationSpec
            r5.f14399b = r6
            r5.f14402e = r2
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r0 = r0.l(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L5f
            return r7
        L5f:
            r1 = r6
        L60:
            androidx.compose.material3.o r0 = (androidx.compose.material3.o) r0
            androidx.compose.animation.core.m r0 = r0.b()
            java.lang.Object r2 = r0.m()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.foundation.lazy.c0 r3 = r1.lazyListState
            float r1 = r1.s(r2, r3)
            androidx.compose.material3.o r2 = new androidx.compose.material3.o
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r1)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.s9.A(androidx.compose.foundation.gestures.q0, float, float, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(androidx.compose.foundation.gestures.q0 q0Var, float f4, kotlin.coroutines.d<? super o<Float, androidx.compose.animation.core.o>> dVar) {
        float s4 = s(0.0f, this.lazyListState);
        return n(q0Var, s4, s4, androidx.compose.animation.core.n.c(0.0f, f4, 0L, 0L, false, 28, null), this.snapAnimationSpec, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(androidx.compose.foundation.gestures.q0 r6, float r7, androidx.compose.animation.core.m<java.lang.Float, androidx.compose.animation.core.o> r8, androidx.compose.animation.core.z<java.lang.Float> r9, kotlin.coroutines.d<? super androidx.compose.material3.o<java.lang.Float, androidx.compose.animation.core.o>> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.s9.a
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.s9$a r0 = (androidx.compose.material3.s9.a) r0
            int r1 = r0.f14366g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14366g = r1
            goto L18
        L13:
            androidx.compose.material3.s9$a r0 = new androidx.compose.material3.s9$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f14364e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f14366g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            float r7 = r0.f14361b
            java.lang.Object r6 = r0.f14363d
            kotlin.jvm.internal.k1$e r6 = (kotlin.jvm.internal.k1.e) r6
            java.lang.Object r8 = r0.f14362c
            androidx.compose.animation.core.m r8 = (androidx.compose.animation.core.m) r8
            kotlin.a1.n(r10)
            goto L69
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.a1.n(r10)
            kotlin.jvm.internal.k1$e r10 = new kotlin.jvm.internal.k1$e
            r10.<init>()
            java.lang.Object r2 = r8.m()
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
            androidx.compose.material3.s9$b r4 = new androidx.compose.material3.s9$b
            r4.<init>(r7, r5, r10, r6)
            r0.f14362c = r8
            r0.f14363d = r10
            r0.f14361b = r7
            r0.f14366g = r3
            java.lang.Object r6 = androidx.compose.animation.core.c2.j(r8, r9, r2, r4, r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            r6 = r10
        L69:
            androidx.compose.material3.o r9 = new androidx.compose.material3.o
            float r6 = r6.f75326b
            float r7 = r7 - r6
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            r9.<init>(r6, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.s9.l(androidx.compose.foundation.gestures.q0, float, androidx.compose.animation.core.m, androidx.compose.animation.core.z, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar, androidx.compose.foundation.gestures.q0 q0Var, float f4) {
        if (Math.abs(f4 - q0Var.a(f4)) > 0.5f) {
            jVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(androidx.compose.foundation.gestures.q0 r15, float r16, float r17, androidx.compose.animation.core.m<java.lang.Float, androidx.compose.animation.core.o> r18, androidx.compose.animation.core.k<java.lang.Float> r19, kotlin.coroutines.d<? super androidx.compose.material3.o<java.lang.Float, androidx.compose.animation.core.o>> r20) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.s9.n(androidx.compose.foundation.gestures.q0, float, float, androidx.compose.animation.core.m, androidx.compose.animation.core.k, kotlin.coroutines.d):java.lang.Object");
    }

    private final float o(androidx.compose.foundation.lazy.s layoutInfo, androidx.compose.foundation.lazy.n item) {
        float f4 = 2;
        return item.getOffset() - ((((x(layoutInfo) - layoutInfo.e()) - layoutInfo.getAfterContentPadding()) / f4) - (item.getSize() / f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float p(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return f5 > 0.0f ? kotlin.ranges.s.A(f4, f5) : kotlin.ranges.s.t(f4, f5);
    }

    private final <T extends Comparable<? super T>> T q(kotlin.ranges.f<T> fVar) {
        return fVar.c();
    }

    private final <T extends Comparable<? super T>> T r(kotlin.ranges.f<T> fVar) {
        return fVar.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (java.lang.Math.abs(r5) <= java.lang.Math.abs(r0)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float s(float r4, androidx.compose.foundation.lazy.c0 r5) {
        /*
            r3 = this;
            kotlin.ranges.f r5 = t(r5, r3)
            java.lang.Comparable r0 = r5.c()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r5 = r5.h()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r4 = java.lang.Math.signum(r4)
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 != 0) goto L2e
            float r4 = java.lang.Math.abs(r5)
            float r2 = java.lang.Math.abs(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L3e
            goto L34
        L2e:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L36
        L34:
            r0 = r5
            goto L3e
        L36:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L3d
            goto L3e
        L3d:
            r0 = r1
        L3e:
            boolean r4 = u(r0)
            if (r4 == 0) goto L45
            r1 = r0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.s9.s(float, androidx.compose.foundation.lazy.c0):float");
    }

    private static final kotlin.ranges.f<Float> t(androidx.compose.foundation.lazy.c0 c0Var, s9 s9Var) {
        androidx.compose.foundation.lazy.s A = c0Var.A();
        List<androidx.compose.foundation.lazy.n> j4 = A.j();
        int size = j4.size();
        float f4 = Float.NEGATIVE_INFINITY;
        float f5 = Float.POSITIVE_INFINITY;
        for (int i4 = 0; i4 < size; i4++) {
            float o4 = s9Var.o(A, j4.get(i4));
            if (o4 <= 0.0f && o4 > f4) {
                f4 = o4;
            }
            if (o4 >= 0.0f && o4 < f5) {
                f5 = o4;
            }
        }
        return kotlin.ranges.s.e(f4, f5);
    }

    private static final boolean u(float f4) {
        return (f4 == Float.POSITIVE_INFINITY || f4 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(androidx.compose.foundation.gestures.q0 r6, float r7, kotlin.coroutines.d<? super androidx.compose.material3.o<java.lang.Float, androidx.compose.animation.core.o>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.s9.e
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material3.s9$e r0 = (androidx.compose.material3.s9.e) r0
            int r1 = r0.f14385d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14385d = r1
            goto L18
        L13:
            androidx.compose.material3.s9$e r0 = new androidx.compose.material3.s9$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14383b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f14385d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.a1.n(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.a1.n(r8)
            androidx.compose.material3.s9$h r8 = r5.motionScaleDuration
            androidx.compose.material3.s9$f r2 = new androidx.compose.material3.s9$f
            r4 = 0
            r2.<init>(r7, r5, r6, r4)
            r0.f14385d = r3
            java.lang.Object r8 = kotlinx.coroutines.i.h(r8, r2, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            androidx.compose.material3.o r8 = (androidx.compose.material3.o) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.s9.v(androidx.compose.foundation.gestures.q0, float, kotlin.coroutines.d):java.lang.Object");
    }

    private final float w() {
        if (y().isEmpty()) {
            return 0.0f;
        }
        List<androidx.compose.foundation.lazy.n> y4 = y();
        int size = y4.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += y4.get(i5).getSize();
        }
        return i4 / y().size();
    }

    private final int x(androidx.compose.foundation.lazy.s sVar) {
        return sVar.getOrientation() == androidx.compose.foundation.gestures.j0.Vertical ? androidx.compose.ui.unit.u.j(sVar.b()) : androidx.compose.ui.unit.u.m(sVar.b());
    }

    private final List<androidx.compose.foundation.lazy.n> y() {
        return this.lazyListState.A().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab A[PHI: r3
      0x00ab: PHI (r3v13 java.lang.Object) = (r3v12 java.lang.Object), (r3v1 java.lang.Object) binds: [B:18:0x00a8, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(androidx.compose.foundation.gestures.q0 r23, float r24, kotlin.coroutines.d<? super androidx.compose.material3.o<java.lang.Float, androidx.compose.animation.core.o>> r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            boolean r4 = r3 instanceof androidx.compose.material3.s9.g
            if (r4 == 0) goto L1c
            r4 = r3
            androidx.compose.material3.s9$g r4 = (androidx.compose.material3.s9.g) r4
            int r5 = r4.f14394f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1c
            int r5 = r5 - r6
            r4.f14394f = r5
        L1a:
            r11 = r4
            goto L22
        L1c:
            androidx.compose.material3.s9$g r4 = new androidx.compose.material3.s9$g
            r4.<init>(r3)
            goto L1a
        L22:
            java.lang.Object r3 = r11.f14392d
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r5 = r11.f14394f
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4a
            if (r5 == r7) goto L3d
            if (r5 != r6) goto L35
            kotlin.a1.n(r3)
            goto Lab
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            java.lang.Object r1 = r11.f14391c
            androidx.compose.foundation.gestures.q0 r1 = (androidx.compose.foundation.gestures.q0) r1
            java.lang.Object r2 = r11.f14390b
            androidx.compose.material3.s9 r2 = (androidx.compose.material3.s9) r2
            kotlin.a1.n(r3)
            r5 = r2
            goto L79
        L4a:
            kotlin.a1.n(r3)
            androidx.compose.animation.core.z<java.lang.Float> r3 = r0.decayAnimationSpec
            r5 = 0
            float r3 = androidx.compose.animation.core.b0.a(r3, r5, r2)
            float r3 = java.lang.Math.abs(r3)
            float r8 = r22.w()
            float r3 = r3 - r8
            float r3 = kotlin.ranges.s.t(r3, r5)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L66
            goto L6b
        L66:
            float r5 = java.lang.Math.signum(r24)
            float r3 = r3 * r5
        L6b:
            r11.f14390b = r0
            r11.f14391c = r1
            r11.f14394f = r7
            java.lang.Object r3 = r0.A(r1, r3, r2, r11)
            if (r3 != r4) goto L78
            return r4
        L78:
            r5 = r0
        L79:
            androidx.compose.material3.o r3 = (androidx.compose.material3.o) r3
            java.lang.Object r2 = r3.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            androidx.compose.animation.core.m r12 = r3.b()
            r20 = 30
            r21 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            androidx.compose.animation.core.m r9 = androidx.compose.animation.core.n.g(r12, r13, r14, r15, r17, r19, r20, r21)
            androidx.compose.animation.core.k<java.lang.Float> r10 = r5.snapAnimationSpec
            r2 = 0
            r11.f14390b = r2
            r11.f14391c = r2
            r11.f14394f = r6
            r6 = r1
            r7 = r8
            java.lang.Object r3 = r5.n(r6, r7, r8, r9, r10, r11)
            if (r3 != r4) goto Lab
            return r4
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.s9.z(androidx.compose.foundation.gestures.q0, float, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.foundation.gestures.e0
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@fg.l androidx.compose.foundation.gestures.q0 r5, float r6, @fg.l kotlin.coroutines.d<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.s9.i
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.s9$i r0 = (androidx.compose.material3.s9.i) r0
            int r1 = r0.f14398d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14398d = r1
            goto L18
        L13:
            androidx.compose.material3.s9$i r0 = new androidx.compose.material3.s9$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14396b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f14398d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.a1.n(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.a1.n(r7)
            r0.f14398d = r3
            java.lang.Object r7 = r4.v(r5, r6, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            androidx.compose.material3.o r7 = (androidx.compose.material3.o) r7
            java.lang.Object r5 = r7.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.m r6 = r7.b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L51
            goto L5b
        L51:
            java.lang.Object r5 = r6.m()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5b:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.s9.a(androidx.compose.foundation.gestures.q0, float, kotlin.coroutines.d):java.lang.Object");
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) other;
        return kotlin.jvm.internal.l0.g(s9Var.snapAnimationSpec, this.snapAnimationSpec) && kotlin.jvm.internal.l0.g(s9Var.decayAnimationSpec, this.decayAnimationSpec) && kotlin.jvm.internal.l0.g(s9Var.lazyListState, this.lazyListState) && kotlin.jvm.internal.l0.g(s9Var.density, this.density);
    }

    public int hashCode() {
        return this.density.hashCode() + ((this.lazyListState.hashCode() + ((this.decayAnimationSpec.hashCode() + (this.snapAnimationSpec.hashCode() * 31)) * 31)) * 31);
    }
}
