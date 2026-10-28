package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.c2;
import androidx.compose.animation.core.y1;
import androidx.compose.foundation.a2;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TransformableState.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\u000b\u001a\u00020\n2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\\\u0010\r\u001a\u00020\n2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a,\u0010\u0012\u001a\u00020\b*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a,\u0010\u0015\u001a\u00020\b*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u0013\u001a/\u0010\u0017\u001a\u00020\b*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\b*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\b*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00020\b*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010 \u001a\u00020\b*\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lkotlin/Function3;", "", "Lkotlin/r0;", "name", "zoomChange", "Li0/f;", "panChange", "rotationChange", "Lkotlin/k2;", "onTransformation", "Landroidx/compose/foundation/gestures/f1;", "a", "(Lld/q;)Landroidx/compose/foundation/gestures/f1;", "i", "(Lld/q;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/gestures/f1;", "zoomFactor", "Landroidx/compose/animation/core/k;", "animationSpec", "f", "(Landroidx/compose/foundation/gestures/f1;FLandroidx/compose/animation/core/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "degrees", "d", "offset", "b", "(Landroidx/compose/foundation/gestures/f1;JLandroidx/compose/animation/core/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "m", "(Landroidx/compose/foundation/gestures/f1;FLkotlin/coroutines/d;)Ljava/lang/Object;", "j", "h", "(Landroidx/compose/foundation/gestures/f1;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/a2;", "terminationPriority", "k", "(Landroidx/compose/foundation/gestures/f1;Landroidx/compose/foundation/a2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,262:1\n25#2:263\n1116#3,6:264\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n119#1:263\n119#1:264,6\n*E\n"})
/* loaded from: classes.dex */
public final class g1 {

    /* compiled from: TransformableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/c1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/c1;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<c1, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4029b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4030c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.g f4031d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f4032e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<i0.f> f4033f;

        /* compiled from: TransformableState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "Li0/f;", "Landroidx/compose/animation/core/p;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.g1$a$a, reason: collision with other inner class name */
        static final class C0066a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<i0.f, androidx.compose.animation.core.p>, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.g f4034b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c1 f4035c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0066a(k1.g gVar, c1 c1Var) {
                super(1);
                this.f4034b = gVar;
                this.f4035c = c1Var;
            }

            public final void a(@fg.l androidx.compose.animation.core.j<i0.f, androidx.compose.animation.core.p> jVar) {
                c1.b(this.f4035c, 0.0f, i0.f.u(jVar.g().getPackedValue(), this.f4034b.f75328b), 0.0f, 5, null);
                this.f4034b.f75328b = jVar.g().getPackedValue();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.animation.core.j<i0.f, androidx.compose.animation.core.p> jVar) {
                a(jVar);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.g gVar, long j4, androidx.compose.animation.core.k<i0.f> kVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f4031d = gVar;
            this.f4032e = j4;
            this.f4033f = kVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l c1 c1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(c1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f4031d, this.f4032e, this.f4033f, dVar);
            aVar.f4030c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4029b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                c1 c1Var = (c1) this.f4030c;
                androidx.compose.animation.core.m mVar = new androidx.compose.animation.core.m(androidx.compose.animation.core.k2.f(i0.f.INSTANCE), i0.f.d(this.f4031d.f75328b), null, 0L, 0L, false, 60, null);
                i0.f d5 = i0.f.d(this.f4032e);
                androidx.compose.animation.core.k<i0.f> kVar = this.f4033f;
                C0066a c0066a = new C0066a(this.f4031d, c1Var);
                this.f4029b = 1;
                if (c2.m(mVar, d5, kVar, false, c0066a, this, 4, null) == aVar) {
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
    }

    /* compiled from: TransformableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/c1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/c1;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<c1, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4036b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4037c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.e f4038d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4039e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<Float> f4040f;

        /* compiled from: TransformableState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.e f4041b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c1 f4042c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.e eVar, c1 c1Var) {
                super(1);
                this.f4041b = eVar;
                this.f4042c = c1Var;
            }

            public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                c1.b(this.f4042c, 0.0f, 0L, jVar.g().floatValue() - this.f4041b.f75326b, 3, null);
                this.f4041b.f75326b = jVar.g().floatValue();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                a(jVar);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.e eVar, float f4, androidx.compose.animation.core.k<Float> kVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f4038d = eVar;
            this.f4039e = f4;
            this.f4040f = kVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l c1 c1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(c1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f4038d, this.f4039e, this.f4040f, dVar);
            bVar.f4037c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4036b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                c1 c1Var = (c1) this.f4037c;
                androidx.compose.animation.core.m c5 = androidx.compose.animation.core.n.c(this.f4038d.f75326b, 0.0f, 0L, 0L, false, 30, null);
                Float f4 = new Float(this.f4039e);
                androidx.compose.animation.core.k<Float> kVar = this.f4040f;
                a aVar2 = new a(this.f4038d, c1Var);
                this.f4036b = 1;
                if (c2.m(c5, f4, kVar, false, aVar2, this, 4, null) == aVar) {
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
    }

    /* compiled from: TransformableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/c1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/c1;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<c1, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4043b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4044c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.e f4045d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4046e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<Float> f4047f;

        /* compiled from: TransformableState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o>, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.e f4048b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c1 f4049c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.e eVar, c1 c1Var) {
                super(1);
                this.f4048b = eVar;
                this.f4049c = c1Var;
            }

            public final void a(@fg.l androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                c1.b(this.f4049c, this.f4048b.f75326b == 0.0f ? 1.0f : jVar.g().floatValue() / this.f4048b.f75326b, 0L, 0.0f, 6, null);
                this.f4048b.f75326b = jVar.g().floatValue();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.animation.core.j<Float, androidx.compose.animation.core.o> jVar) {
                a(jVar);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.e eVar, float f4, androidx.compose.animation.core.k<Float> kVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f4045d = eVar;
            this.f4046e = f4;
            this.f4047f = kVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l c1 c1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(c1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f4045d, this.f4046e, this.f4047f, dVar);
            cVar.f4044c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4043b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                c1 c1Var = (c1) this.f4044c;
                androidx.compose.animation.core.m c5 = androidx.compose.animation.core.n.c(this.f4045d.f75326b, 0.0f, 0L, 0L, false, 30, null);
                Float f4 = new Float(this.f4046e);
                androidx.compose.animation.core.k<Float> kVar = this.f4047f;
                a aVar2 = new a(this.f4045d, c1Var);
                this.f4043b = 1;
                if (c2.m(c5, f4, kVar, false, aVar2, this, 4, null) == aVar) {
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
    }

    /* compiled from: TransformableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$panBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/c1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/c1;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<c1, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4050b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4051c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4052d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j4, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f4052d = j4;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l c1 c1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(c1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f4052d, dVar);
            dVar2.f4051c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4050b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            ((c1) this.f4051c).a(1.0f, this.f4052d, 0.0f);
            return k2.f75408a;
        }
    }

    /* compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "z", "Li0/f;", "p", "r", "Lkotlin/k2;", "a", "(FJF)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<Float, i0.f, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<ld.q<Float, i0.f, Float, k2>> f4053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(b5<? extends ld.q<? super Float, ? super i0.f, ? super Float, k2>> b5Var) {
            super(3);
            this.f4053b = b5Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(Float f4, i0.f fVar, Float f5) {
            a(f4.floatValue(), fVar.getPackedValue(), f5.floatValue());
            return k2.f75408a;
        }

        public final void a(float f4, long j4, float f5) {
            this.f4053b.getValue().R(Float.valueOf(f4), i0.f.d(j4), Float.valueOf(f5));
        }
    }

    /* compiled from: TransformableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/c1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/c1;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<c1, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4054b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4055c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4056d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f4, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f4056d = f4;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l c1 c1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(c1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f4056d, dVar);
            fVar.f4055c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4054b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            c1 c1Var = (c1) this.f4055c;
            i0.f.INSTANCE.getClass();
            c1Var.a(1.0f, i0.f.f74147c, this.f4056d);
            return k2.f75408a;
        }
    }

    /* compiled from: TransformableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/c1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/c1;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<c1, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4057b;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l c1 c1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((g) create(c1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new g(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4057b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: TransformableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/c1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/c1;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<c1, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4058b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4059c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f4, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f4060d = f4;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l c1 c1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((h) create(c1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f4060d, dVar);
            hVar.f4059c = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4058b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            c1 c1Var = (c1) this.f4059c;
            float f4 = this.f4060d;
            i0.f.INSTANCE.getClass();
            c1Var.a(f4, i0.f.f74147c, 0.0f);
            return k2.f75408a;
        }
    }

    @fg.l
    public static final f1 a(@fg.l ld.q<? super Float, ? super i0.f, ? super Float, k2> qVar) {
        return new r(qVar);
    }

    @fg.m
    public static final Object b(@fg.l f1 f1Var, long j4, @fg.l androidx.compose.animation.core.k<i0.f> kVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        k1.g gVar = new k1.g();
        i0.f.INSTANCE.getClass();
        gVar.f75328b = i0.f.f74147c;
        Object c5 = f1.c(f1Var, null, new a(gVar, j4, kVar, null), dVar, 1, null);
        return c5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? c5 : k2.f75408a;
    }

    public static /* synthetic */ Object c(f1 f1Var, long j4, androidx.compose.animation.core.k kVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            kVar = new y1(0.0f, 200.0f, null, 5, null);
        }
        return b(f1Var, j4, kVar, dVar);
    }

    @fg.m
    public static final Object d(@fg.l f1 f1Var, float f4, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object c5 = f1.c(f1Var, null, new b(new k1.e(), f4, kVar, null), dVar, 1, null);
        return c5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? c5 : k2.f75408a;
    }

    public static /* synthetic */ Object e(f1 f1Var, float f4, androidx.compose.animation.core.k kVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            kVar = new y1(0.0f, 200.0f, null, 5, null);
        }
        return d(f1Var, f4, kVar, dVar);
    }

    @fg.m
    public static final Object f(@fg.l f1 f1Var, float f4, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("zoom value should be greater than 0");
        }
        k1.e eVar = new k1.e();
        eVar.f75326b = 1.0f;
        Object c5 = f1.c(f1Var, null, new c(eVar, f4, kVar, null), dVar, 1, null);
        return c5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? c5 : k2.f75408a;
    }

    public static /* synthetic */ Object g(f1 f1Var, float f4, androidx.compose.animation.core.k kVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            kVar = new y1(0.0f, 200.0f, null, 5, null);
        }
        return f(f1Var, f4, kVar, dVar);
    }

    @fg.m
    public static final Object h(@fg.l f1 f1Var, long j4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object c5 = f1.c(f1Var, null, new d(j4, null), dVar, 1, null);
        return c5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? c5 : k2.f75408a;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final f1 i(@fg.l ld.q<? super Float, ? super i0.f, ? super Float, k2> qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1681419281);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1681419281, i4, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:116)");
        }
        b5 u4 = o4.u(qVar, tVar, i4 & 14);
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            r rVar = new r(new e(u4));
            tVar.E(rVar);
            Q = rVar;
        }
        tVar.p0();
        f1 f1Var = (f1) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return f1Var;
    }

    @fg.m
    public static final Object j(@fg.l f1 f1Var, float f4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object c5 = f1.c(f1Var, null, new f(f4, null), dVar, 1, null);
        return c5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? c5 : k2.f75408a;
    }

    @fg.m
    public static final Object k(@fg.l f1 f1Var, @fg.l a2 a2Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object a5 = f1Var.a(a2Var, new g(2, null), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    public static /* synthetic */ Object l(f1 f1Var, a2 a2Var, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            a2Var = a2.Default;
        }
        return k(f1Var, a2Var, dVar);
    }

    @fg.m
    public static final Object m(@fg.l f1 f1Var, float f4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object c5 = f1.c(f1Var, null, new h(f4, null), dVar, 1, null);
        return c5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? c5 : k2.f75408a;
    }
}
