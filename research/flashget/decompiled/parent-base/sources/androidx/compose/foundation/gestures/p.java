package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.c2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: Scrollable.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/gestures/p;", "Landroidx/compose/foundation/gestures/e0;", "Landroidx/compose/animation/core/z;", "", "flingDecay", "Landroidx/compose/ui/s;", "motionDurationScale", "<init>", "(Landroidx/compose/animation/core/z;Landroidx/compose/ui/s;)V", "Landroidx/compose/foundation/gestures/q0;", "initialVelocity", "a", "(Landroidx/compose/foundation/gestures/q0;FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/z;", "b", "()Landroidx/compose/animation/core/z;", "d", "(Landroidx/compose/animation/core/z;)V", "Landroidx/compose/ui/s;", "", "c", "I", "()I", "e", "(I)V", "lastAnimationCycleCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p implements e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f4174d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.animation.core.z<Float> flingDecay;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.s motionDurationScale;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastAnimationCycleCount;

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {965}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "", "<anonymous>", "(Lkotlinx/coroutines/r0;)F"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super Float>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f4178b;

        /* renamed from: c, reason: collision with root package name */
        Object f4179c;

        /* renamed from: d, reason: collision with root package name */
        int f4180d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4181e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f4182f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q0 f4183g;

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.p$a$a, reason: collision with other inner class name */
        static final class C0072a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.e f4184b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ q0 f4185c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k1.e f4186d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ p f4187e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0072a(k1.e eVar, q0 q0Var, k1.e eVar2, p pVar) {
                super(1);
                this.f4184b = eVar;
                this.f4185c = q0Var;
                this.f4186d = eVar2;
                this.f4187e = pVar;
            }

            public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                float floatValue = jVar.g().floatValue() - this.f4184b.f75326b;
                float a5 = this.f4185c.a(floatValue);
                this.f4184b.f75326b = jVar.g().floatValue();
                this.f4186d.f75326b = jVar.h().floatValue();
                if (Math.abs(floatValue - a5) > 0.5f) {
                    jVar.a();
                }
                p pVar = this.f4187e;
                pVar.e(pVar.getLastAnimationCycleCount() + 1);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                a(jVar);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f4, p pVar, q0 q0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f4181e = f4;
            this.f4182f = pVar;
            this.f4183g = q0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f4181e, this.f4182f, this.f4183g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            float f4;
            k1.e eVar;
            androidx.compose.animation.core.m mVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4180d;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                if (Math.abs(this.f4181e) <= 1.0f) {
                    f4 = this.f4181e;
                    return new Float(f4);
                }
                k1.e eVar2 = new k1.e();
                eVar2.f75326b = this.f4181e;
                k1.e eVar3 = new k1.e();
                androidx.compose.animation.core.m c5 = androidx.compose.animation.core.n.c(0.0f, this.f4181e, 0L, 0L, false, 28, null);
                try {
                    androidx.compose.animation.core.z<Float> b5 = this.f4182f.b();
                    C0072a c0072a = new C0072a(eVar3, this.f4183g, eVar2, this.f4182f);
                    this.f4178b = eVar2;
                    this.f4179c = c5;
                    this.f4180d = 1;
                    if (c2.k(c5, b5, false, c0072a, this, 2, null) == aVar) {
                        return aVar;
                    }
                    eVar = eVar2;
                } catch (CancellationException unused) {
                    eVar = eVar2;
                    mVar = c5;
                    eVar.f75326b = ((Number) mVar.m()).floatValue();
                    f4 = eVar.f75326b;
                    return new Float(f4);
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (androidx.compose.animation.core.m) this.f4179c;
                eVar = (k1.e) this.f4178b;
                try {
                    kotlin.a1.n(obj);
                } catch (CancellationException unused2) {
                    eVar.f75326b = ((Number) mVar.m()).floatValue();
                    f4 = eVar.f75326b;
                    return new Float(f4);
                }
            }
            f4 = eVar.f75326b;
            return new Float(f4);
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super Float> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public p(@fg.l androidx.compose.animation.core.z<Float> zVar, @fg.l androidx.compose.ui.s sVar) {
        this.flingDecay = zVar;
        this.motionDurationScale = sVar;
    }

    @Override // androidx.compose.foundation.gestures.e0
    @fg.m
    public Object a(@fg.l q0 q0Var, float f4, @fg.l kotlin.coroutines.d<? super Float> dVar) {
        this.lastAnimationCycleCount = 0;
        return kotlinx.coroutines.i.h(this.motionDurationScale, new a(f4, this, q0Var, null), dVar);
    }

    @fg.l
    public final androidx.compose.animation.core.z<Float> b() {
        return this.flingDecay;
    }

    /* renamed from: c, reason: from getter */
    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void d(@fg.l androidx.compose.animation.core.z<Float> zVar) {
        this.flingDecay = zVar;
    }

    public final void e(int i4) {
        this.lastAnimationCycleCount = i4;
    }

    public /* synthetic */ p(androidx.compose.animation.core.z zVar, androidx.compose.ui.s sVar, int i4, kotlin.jvm.internal.w wVar) {
        this(zVar, (i4 & 2) != 0 ? t0.g() : sVar);
    }
}
