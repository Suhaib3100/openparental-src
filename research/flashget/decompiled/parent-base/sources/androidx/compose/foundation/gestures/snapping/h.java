package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.b0;
import androidx.compose.animation.core.n;
import androidx.compose.animation.core.z;
import androidx.compose.foundation.gestures.e0;
import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.gestures.t0;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.s;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: SnapFlingBehavior.kt */
@z0
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bBC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\rJ<\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016JD\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u001a*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJS\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\"\u0010\u001cJ\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b&\u0010'J0\u0010)\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@¢\u0006\u0004\b)\u0010\u0016J\u001a\u0010,\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010*H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00101R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\"\u0010>\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/h;", "Landroidx/compose/foundation/gestures/e0;", "Landroidx/compose/foundation/gestures/snapping/j;", "snapLayoutInfoProvider", "Landroidx/compose/animation/core/k;", "", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/z;", "highVelocityAnimationSpec", "snapAnimationSpec", "<init>", "(Landroidx/compose/foundation/gestures/snapping/j;Landroidx/compose/animation/core/k;Landroidx/compose/animation/core/z;Landroidx/compose/animation/core/k;)V", "shortSnapVelocityThreshold", "(Landroidx/compose/foundation/gestures/snapping/j;Landroidx/compose/animation/core/k;Landroidx/compose/animation/core/z;Landroidx/compose/animation/core/k;F)V", "Landroidx/compose/foundation/gestures/q0;", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/k2;", "onRemainingScrollOffsetUpdate", "Landroidx/compose/foundation/gestures/snapping/a;", "Landroidx/compose/animation/core/o;", "g", "(Landroidx/compose/foundation/gestures/q0;FLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "offset", "velocity", "updateRemainingScrollOffset", "Landroidx/compose/animation/core/m;", "m", "(Landroidx/compose/foundation/gestures/q0;FFLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "initialTargetOffset", "Lkotlin/r0;", "name", "delta", "onAnimationStep", "k", "", "i", "(FF)Z", "a", "(Landroidx/compose/foundation/gestures/q0;FLkotlin/coroutines/d;)Ljava/lang/Object;", "onSettlingDistanceUpdated", "j", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/gestures/snapping/j;", "b", "Landroidx/compose/animation/core/k;", "c", "Landroidx/compose/animation/core/z;", "d", "Landroidx/compose/ui/s;", "e", "Landroidx/compose/ui/s;", "h", "()Landroidx/compose/ui/s;", "l", "(Landroidx/compose/ui/s;)V", "motionScaleDuration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 1)
@r1({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,538:1\n534#2,4:539\n534#2,4:543\n534#2,4:547\n534#2,4:551\n1#3:555\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n153#1:539,4\n229#1:543,4\n232#1:547,4\n252#1:551,4\n*E\n"})
/* loaded from: classes.dex */
public final class h implements e0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f4262f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j snapLayoutInfoProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.k<Float> lowVelocityAnimationSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z<Float> highVelocityAnimationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.k<Float> snapAnimationSpec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private s motionScaleDuration;

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {165}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4268b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4269c;

        /* renamed from: e, reason: collision with root package name */
        int f4271e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4269c = obj;
            this.f4271e |= Integer.MIN_VALUE;
            return h.this.g(null, 0.0f, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {174, 187}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/compose/foundation/gestures/snapping/a;", "", "Landroidx/compose/animation/core/o;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/compose/foundation/gestures/snapping/a;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,538:1\n534#2,4:539\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n*L\n185#1:539,4\n*E\n"})
    static final class b extends o implements p<r0, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, androidx.compose.animation.core.o>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f4272b;

        /* renamed from: c, reason: collision with root package name */
        int f4273c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4275e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, k2> f4276f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q0 f4277g;

        /* compiled from: SnapFlingBehavior.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<Float, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.e f4278b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.l<Float, k2> f4279c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(k1.e eVar, ld.l<? super Float, k2> lVar) {
                super(1);
                this.f4278b = eVar;
                this.f4279c = lVar;
            }

            public final void a(float f4) {
                k1.e eVar = this.f4278b;
                float f5 = eVar.f75326b - f4;
                eVar.f75326b = f5;
                this.f4279c.invoke(Float.valueOf(f5));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Float f4) {
                a(f4.floatValue());
                return k2.f75408a;
            }
        }

        /* compiled from: SnapFlingBehavior.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.snapping.h$b$b, reason: collision with other inner class name */
        static final class C0076b extends n0 implements ld.l<Float, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.e f4280b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.l<Float, k2> f4281c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0076b(k1.e eVar, ld.l<? super Float, k2> lVar) {
                super(1);
                this.f4280b = eVar;
                this.f4281c = lVar;
            }

            public final void a(float f4) {
                k1.e eVar = this.f4280b;
                float f5 = eVar.f75326b - f4;
                eVar.f75326b = f5;
                this.f4281c.invoke(Float.valueOf(f5));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Float f4) {
                a(f4.floatValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(float f4, ld.l<? super Float, k2> lVar, q0 q0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f4275e = f4;
            this.f4276f = lVar;
            this.f4277g = q0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return h.this.new b(this.f4275e, this.f4276f, this.f4277g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            k1.e eVar;
            Object m4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4273c;
            if (i4 == 0) {
                a1.n(obj);
                float b5 = h.this.snapLayoutInfoProvider.b(this.f4275e);
                float signum = Math.signum(this.f4275e) * Math.abs(b5);
                eVar = new k1.e();
                eVar.f75326b = signum;
                this.f4276f.invoke(new Float(signum));
                h hVar = h.this;
                q0 q0Var = this.f4277g;
                float f4 = eVar.f75326b;
                float f5 = this.f4275e;
                C0076b c0076b = new C0076b(eVar, this.f4276f);
                this.f4272b = eVar;
                this.f4273c = 1;
                m4 = hVar.m(q0Var, f4, f5, c0076b, this);
                if (m4 == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                    return obj;
                }
                k1.e eVar2 = (k1.e) this.f4272b;
                a1.n(obj);
                eVar = eVar2;
                m4 = obj;
            }
            androidx.compose.animation.core.m mVar = (androidx.compose.animation.core.m) m4;
            float a5 = h.this.snapLayoutInfoProvider.a(((Number) mVar.m()).floatValue());
            eVar.f75326b = a5;
            q0 q0Var2 = this.f4277g;
            androidx.compose.animation.core.m g4 = n.g(mVar, 0.0f, 0.0f, 0L, 0L, false, 30, null);
            androidx.compose.animation.core.k kVar = h.this.snapAnimationSpec;
            a aVar2 = new a(eVar, this.f4276f);
            this.f4272b = null;
            this.f4273c = 2;
            Object h4 = i.h(q0Var2, a5, a5, g4, kVar, aVar2, this);
            return h4 == aVar ? aVar : h4;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, androidx.compose.animation.core.o>> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f4282b = new c(1);

        c() {
            super(1);
        }

        public final void a(float f4) {
        }

        @Override // ld.l
        public k2 invoke(Float f4) {
            f4.floatValue();
            return k2.f75408a;
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {151}, m = "performFling", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f4283b;

        /* renamed from: d, reason: collision with root package name */
        int f4285d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4283b = obj;
            this.f4285d |= Integer.MIN_VALUE;
            return h.this.j(null, 0.0f, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {213}, m = "tryApproach", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f4286b;

        /* renamed from: d, reason: collision with root package name */
        int f4288d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4286b = obj;
            this.f4288d |= Integer.MIN_VALUE;
            return h.this.m(null, 0.0f, 0.0f, null, this);
        }
    }

    public h(@fg.l j jVar, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l z<Float> zVar, @fg.l androidx.compose.animation.core.k<Float> kVar2) {
        this.snapLayoutInfoProvider = jVar;
        this.lowVelocityAnimationSpec = kVar;
        this.highVelocityAnimationSpec = zVar;
        this.snapAnimationSpec = kVar2;
        this.motionScaleDuration = t0.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(androidx.compose.foundation.gestures.q0 r11, float r12, ld.l<? super java.lang.Float, kotlin.k2> r13, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<java.lang.Float, androidx.compose.animation.core.o>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.h.a
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.h$a r0 = (androidx.compose.foundation.gestures.snapping.h.a) r0
            int r1 = r0.f4271e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4271e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.h$a r0 = new androidx.compose.foundation.gestures.snapping.h$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f4269c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4271e
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r11 = r0.f4268b
            r13 = r11
            ld.l r13 = (ld.l) r13
            kotlin.a1.n(r14)
            goto L4f
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.a1.n(r14)
            androidx.compose.ui.s r14 = r10.motionScaleDuration
            androidx.compose.foundation.gestures.snapping.h$b r2 = new androidx.compose.foundation.gestures.snapping.h$b
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r6, r7, r8, r9)
            r0.f4268b = r13
            r0.f4271e = r3
            java.lang.Object r14 = kotlinx.coroutines.i.h(r14, r2, r0)
            if (r14 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.foundation.gestures.snapping.a r14 = (androidx.compose.foundation.gestures.snapping.a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.h.g(androidx.compose.foundation.gestures.q0, float, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    private final boolean i(float offset, float velocity) {
        return Math.abs(b0.a(this.highVelocityAnimationSpec, 0.0f, velocity)) >= Math.abs(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(q0 q0Var, float f4, float f5, ld.l<? super Float, k2> lVar, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.a<Float, androidx.compose.animation.core.o>> dVar) {
        Object i4;
        i4 = i.i(q0Var, f4, f5, i(f4, f5) ? new androidx.compose.foundation.gestures.snapping.d(this.highVelocityAnimationSpec) : new g(this.lowVelocityAnimationSpec), lVar, dVar);
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(androidx.compose.foundation.gestures.q0 r19, float r20, float r21, ld.l<? super java.lang.Float, kotlin.k2> r22, kotlin.coroutines.d<? super androidx.compose.animation.core.m<java.lang.Float, androidx.compose.animation.core.o>> r23) {
        /*
            r18 = this;
            r0 = r23
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.h.e
            if (r1 == 0) goto L18
            r1 = r0
            androidx.compose.foundation.gestures.snapping.h$e r1 = (androidx.compose.foundation.gestures.snapping.h.e) r1
            int r2 = r1.f4288d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f4288d = r2
            r8 = r18
        L16:
            r7 = r1
            goto L20
        L18:
            androidx.compose.foundation.gestures.snapping.h$e r1 = new androidx.compose.foundation.gestures.snapping.h$e
            r8 = r18
            r1.<init>(r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.f4286b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r7.f4288d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.a1.n(r0)
            goto L71
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            kotlin.a1.n(r0)
            float r0 = java.lang.Math.abs(r20)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L44
            goto L4c
        L44:
            float r0 = java.lang.Math.abs(r21)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5e
        L4c:
            r16 = 28
            r17 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r9 = r20
            r10 = r21
            androidx.compose.animation.core.m r0 = androidx.compose.animation.core.n.c(r9, r10, r11, r13, r15, r16, r17)
            goto L77
        L5e:
            r7.f4288d = r3
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            java.lang.Object r0 = r2.k(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L71
            return r1
        L71:
            androidx.compose.foundation.gestures.snapping.a r0 = (androidx.compose.foundation.gestures.snapping.a) r0
            androidx.compose.animation.core.m r0 = r0.c()
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.h.m(androidx.compose.foundation.gestures.q0, float, float, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.e0
    @fg.m
    public Object a(@fg.l q0 q0Var, float f4, @fg.l kotlin.coroutines.d<? super Float> dVar) {
        return j(q0Var, f4, c.f4282b, dVar);
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return l0.g(hVar.snapAnimationSpec, this.snapAnimationSpec) && l0.g(hVar.highVelocityAnimationSpec, this.highVelocityAnimationSpec) && l0.g(hVar.lowVelocityAnimationSpec, this.lowVelocityAnimationSpec) && l0.g(hVar.snapLayoutInfoProvider, this.snapLayoutInfoProvider);
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final s getMotionScaleDuration() {
        return this.motionScaleDuration;
    }

    public int hashCode() {
        return this.snapLayoutInfoProvider.hashCode() + ((this.lowVelocityAnimationSpec.hashCode() + ((this.highVelocityAnimationSpec.hashCode() + (this.snapAnimationSpec.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@fg.l androidx.compose.foundation.gestures.q0 r5, float r6, @fg.l ld.l<? super java.lang.Float, kotlin.k2> r7, @fg.l kotlin.coroutines.d<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.h.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.h$d r0 = (androidx.compose.foundation.gestures.snapping.h.d) r0
            int r1 = r0.f4285d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4285d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.h$d r0 = new androidx.compose.foundation.gestures.snapping.h$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4283b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f4285d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.a1.n(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.a1.n(r8)
            r0.f4285d = r3
            java.lang.Object r8 = r4.g(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            androidx.compose.foundation.gestures.snapping.a r8 = (androidx.compose.foundation.gestures.snapping.a) r8
            java.lang.Object r5 = r8.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.m r6 = r8.b()
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.h.j(androidx.compose.foundation.gestures.q0, float, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    public final void l(@fg.l s sVar) {
        this.motionScaleDuration = sVar;
    }

    @kotlin.k(message = "Please use the constructor without the shortSnapVelocityThreshold. The functionality provided by shortSnapVelocityThreshold can be implemented by SnapLayoutInfoProvider.")
    public h(@fg.l j jVar, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l z<Float> zVar, @fg.l androidx.compose.animation.core.k<Float> kVar2, float f4) {
        this(jVar, kVar, zVar, kVar2);
    }
}
