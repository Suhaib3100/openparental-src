package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.c2;
import androidx.compose.runtime.o4;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0015\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a(\u0010\u0018\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b\u0018\u0010\u0019\u001a2\u0010\u001c\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0087@¢\u0006\u0004\b\u001c\u0010\u001d\u001aH\u0010$\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"\u0012\u0006\u0012\u0004\u0018\u00010\u00000!H\u0082@¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"", "T", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/a0;", "Lkotlin/k2;", "Lkotlin/u;", "builder", "Landroidx/compose/foundation/gestures/z;", "a", "(Lld/l;)Landroidx/compose/foundation/gestures/z;", "Landroidx/compose/ui/q;", "Landroidx/compose/foundation/gestures/f;", "state", "Landroidx/compose/foundation/gestures/j0;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "startDragImmediately", "d", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/gestures/f;Landroidx/compose/foundation/gestures/j0;ZZLandroidx/compose/foundation/interaction/k;Z)Landroidx/compose/ui/q;", "targetValue", "j", "(Landroidx/compose/foundation/gestures/f;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "velocity", "f", "(Landroidx/compose/foundation/gestures/f;Ljava/lang/Object;FLkotlin/coroutines/d;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "i", "(Lld/a;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/g0;", "h", "()Landroidx/compose/foundation/gestures/g0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "", "velocity", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;F)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3886b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3887c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ float f3888d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f<T> f3889e;

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {SyslogAppender.LOG_LOCAL6}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.e$a$a, reason: collision with other inner class name */
        static final class C0058a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f3890b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f<T> f3891c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f3892d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0058a(f<T> fVar, float f4, kotlin.coroutines.d<? super C0058a> dVar) {
                super(2, dVar);
                this.f3891c = fVar;
                this.f3892d = f4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0058a(this.f3891c, this.f3892d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f3890b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    f<T> fVar = this.f3891c;
                    float f4 = this.f3892d;
                    this.f3890b = 1;
                    if (fVar.J(f4, this) == aVar) {
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
                return ((C0058a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f3889e = fVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, Float f4, kotlin.coroutines.d<? super k2> dVar) {
            return a(r0Var, f4.floatValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, float f4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            a aVar = new a(this.f3889e, dVar);
            aVar.f3887c = r0Var;
            aVar.f3888d = f4;
            return aVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f3886b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            kotlinx.coroutines.k.f((kotlinx.coroutines.r0) this.f3887c, null, null, new C0058a(this.f3889e, this.f3888d, null), 3, null);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {687}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/d;", "Landroidx/compose/foundation/gestures/z;", "anchors", "latestTarget", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements ld.r<androidx.compose.foundation.gestures.d, z<T>, T, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3893b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3894c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f3895d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3896e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f<T> f3897f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f3898g;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "Lkotlin/k2;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<Float, Float, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.d f3899b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.e f3900c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.gestures.d dVar, k1.e eVar) {
                super(2);
                this.f3899b = dVar;
                this.f3900c = eVar;
            }

            public final void a(float f4, float f5) {
                this.f3899b.a(f4, f5);
                this.f3900c.f75326b = f4;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(Float f4, Float f5) {
                a(f4.floatValue(), f5.floatValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f<T> fVar, float f4, kotlin.coroutines.d<? super b> dVar) {
            super(4, dVar);
            this.f3897f = fVar;
            this.f3898g = f4;
        }

        @Override // ld.r
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object i(@fg.l androidx.compose.foundation.gestures.d dVar, @fg.l z<T> zVar, T t4, @fg.m kotlin.coroutines.d<? super k2> dVar2) {
            b bVar = new b(this.f3897f, this.f3898g, dVar2);
            bVar.f3894c = dVar;
            bVar.f3895d = zVar;
            bVar.f3896e = t4;
            return bVar.invokeSuspend(k2.f75408a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3893b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.gestures.d dVar = (androidx.compose.foundation.gestures.d) this.f3894c;
                float e4 = ((z) this.f3895d).e(this.f3896e);
                if (!Float.isNaN(e4)) {
                    k1.e eVar = new k1.e();
                    float w4 = Float.isNaN(this.f3897f.w()) ? 0.0f : this.f3897f.w();
                    eVar.f75326b = w4;
                    float f4 = this.f3898g;
                    androidx.compose.animation.core.k<Float> p4 = this.f3897f.p();
                    a aVar2 = new a(dVar, eVar);
                    this.f3894c = null;
                    this.f3895d = null;
                    this.f3893b = 1;
                    if (c2.c(w4, e4, f4, p4, aVar2, this) == aVar) {
                        return aVar;
                    }
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

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {708}, m = "restartable", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c<I> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f3901b;

        /* renamed from: c, reason: collision with root package name */
        int f3902c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3901b = obj;
            this.f3902c |= Integer.MIN_VALUE;
            return e.i(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {711}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3903b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3904c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<I> f3905d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<I, kotlin.coroutines.d<? super k2>, Object> f3906e;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.h<kotlinx.coroutines.k2> f3907b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f3908c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<I, kotlin.coroutines.d<? super k2>, Object> f3909d;

            /* compiled from: AnchoredDraggable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {717}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.e$d$a$a, reason: collision with other inner class name */
            static final class C0059a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f3910b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ld.p<I, kotlin.coroutines.d<? super k2>, Object> f3911c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ I f3912d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f3913e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0059a(ld.p<? super I, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, I i4, kotlinx.coroutines.r0 r0Var, kotlin.coroutines.d<? super C0059a> dVar) {
                    super(2, dVar);
                    this.f3911c = pVar;
                    this.f3912d = i4;
                    this.f3913e = r0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0059a(this.f3911c, this.f3912d, this.f3913e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f3910b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        ld.p<I, kotlin.coroutines.d<? super k2>, Object> pVar = this.f3911c;
                        I i5 = this.f3912d;
                        this.f3910b = 1;
                        if (pVar.invoke(i5, this) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    kotlinx.coroutines.s0.d(this.f3913e, new androidx.compose.foundation.gestures.c());
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0059a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: AnchoredDraggable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0, 0}, l = {714}, m = "emit", n = {"this", "latestInputs"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                Object f3914b;

                /* renamed from: c, reason: collision with root package name */
                Object f3915c;

                /* renamed from: d, reason: collision with root package name */
                Object f3916d;

                /* renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f3917e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ a<T> f3918f;

                /* renamed from: g, reason: collision with root package name */
                int f3919g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.f3918f = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f3917e = obj;
                    this.f3919g |= Integer.MIN_VALUE;
                    return this.f3918f.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(k1.h<kotlinx.coroutines.k2> hVar, kotlinx.coroutines.r0 r0Var, ld.p<? super I, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
                this.f3907b = hVar;
                this.f3908c = r0Var;
                this.f3909d = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.foundation.gestures.e.d.a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.foundation.gestures.e$d$a$b r0 = (androidx.compose.foundation.gestures.e.d.a.b) r0
                    int r1 = r0.f3919g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f3919g = r1
                    goto L18
                L13:
                    androidx.compose.foundation.gestures.e$d$a$b r0 = new androidx.compose.foundation.gestures.e$d$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f3917e
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f3919g
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r8 = r0.f3916d
                    kotlinx.coroutines.k2 r8 = (kotlinx.coroutines.k2) r8
                    java.lang.Object r8 = r0.f3915c
                    java.lang.Object r0 = r0.f3914b
                    androidx.compose.foundation.gestures.e$d$a r0 = (androidx.compose.foundation.gestures.e.d.a) r0
                    kotlin.a1.n(r9)
                    goto L5c
                L31:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L39:
                    kotlin.a1.n(r9)
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.k2> r9 = r7.f3907b
                    T r9 = r9.f75329b
                    kotlinx.coroutines.k2 r9 = (kotlinx.coroutines.k2) r9
                    if (r9 == 0) goto L5b
                    androidx.compose.foundation.gestures.c r2 = new androidx.compose.foundation.gestures.c
                    r2.<init>()
                    r9.b(r2)
                    r0.f3914b = r7
                    r0.f3915c = r8
                    r0.f3916d = r9
                    r0.f3919g = r3
                    java.lang.Object r9 = r9.j0(r0)
                    if (r9 != r1) goto L5b
                    return r1
                L5b:
                    r0 = r7
                L5c:
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.k2> r9 = r0.f3907b
                    kotlinx.coroutines.r0 r1 = r0.f3908c
                    kotlinx.coroutines.t0 r3 = kotlinx.coroutines.t0.UNDISPATCHED
                    androidx.compose.foundation.gestures.e$d$a$a r4 = new androidx.compose.foundation.gestures.e$d$a$a
                    ld.p<I, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r0 = r0.f3909d
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    kotlinx.coroutines.k2 r8 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                    r9.f75329b = r8
                    kotlin.k2 r8 = kotlin.k2.f75408a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.d.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.a<? extends I> aVar, ld.p<? super I, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f3905d = aVar;
            this.f3906e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f3905d, this.f3906e, dVar);
            dVar2.f3904c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3903b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f3904c;
                k1.h hVar = new k1.h();
                kotlinx.coroutines.flow.i w4 = o4.w(this.f3905d);
                a aVar2 = new a(hVar, r0Var, this.f3906e);
                this.f3903b = 1;
                if (w4.a(aVar2, this) == aVar) {
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
            return ((d) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/d;", "Landroidx/compose/foundation/gestures/z;", "anchors", "latestTarget", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.e$e, reason: collision with other inner class name */
    static final class C0060e<T> extends kotlin.coroutines.jvm.internal.o implements ld.r<androidx.compose.foundation.gestures.d, z<T>, T, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3920b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3921c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f3922d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3923e;

        C0060e(kotlin.coroutines.d<? super C0060e> dVar) {
            super(4, dVar);
        }

        @Override // ld.r
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object i(@fg.l androidx.compose.foundation.gestures.d dVar, @fg.l z<T> zVar, T t4, @fg.m kotlin.coroutines.d<? super k2> dVar2) {
            C0060e c0060e = new C0060e(4, dVar2);
            c0060e.f3921c = dVar;
            c0060e.f3922d = zVar;
            c0060e.f3923e = t4;
            return c0060e.invokeSuspend(k2.f75408a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f3920b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            androidx.compose.foundation.gestures.d dVar = (androidx.compose.foundation.gestures.d) this.f3921c;
            float e4 = ((z) this.f3922d).e(this.f3923e);
            if (!Float.isNaN(e4)) {
                androidx.compose.foundation.gestures.d.b(dVar, e4, 0.0f, 2, null);
            }
            return k2.f75408a;
        }
    }

    @fg.l
    @androidx.compose.foundation.z0
    public static final <T> z<T> a(@fg.l ld.l<? super a0<T>, k2> lVar) {
        a0 a0Var = new a0();
        lVar.invoke(a0Var);
        return new g0(a0Var.b());
    }

    @fg.l
    @androidx.compose.foundation.z0
    public static final <T> androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l f<T> fVar, @fg.l j0 j0Var, boolean z4, boolean z5, @fg.m androidx.compose.foundation.interaction.k kVar, boolean z6) {
        return b0.k(qVar, fVar.getDraggableState(), j0Var, z4, kVar, z6, null, new a(fVar, null), z5, 32, null);
    }

    public static /* synthetic */ androidx.compose.ui.q e(androidx.compose.ui.q qVar, f fVar, j0 j0Var, boolean z4, boolean z5, androidx.compose.foundation.interaction.k kVar, boolean z6, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        boolean z7 = z4;
        if ((i4 & 8) != 0) {
            z5 = false;
        }
        boolean z10 = z5;
        if ((i4 & 16) != 0) {
            kVar = null;
        }
        androidx.compose.foundation.interaction.k kVar2 = kVar;
        if ((i4 & 32) != 0) {
            z6 = fVar.B();
        }
        return d(qVar, fVar, j0Var, z7, z10, kVar2, z6);
    }

    @androidx.compose.foundation.z0
    @fg.m
    public static final <T> Object f(@fg.l f<T> fVar, T t4, float f4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object k4 = f.k(fVar, t4, null, new b(fVar, f4, null), dVar, 2, null);
        return k4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? k4 : k2.f75408a;
    }

    public static /* synthetic */ Object g(f fVar, Object obj, float f4, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            f4 = fVar.v();
        }
        return f(fVar, obj, f4, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> g0<T> h() {
        return new g0<>(kotlin.collections.z0.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object i(ld.a<? extends I> r4, ld.p<? super I, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r5, kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.e.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.e$c r0 = (androidx.compose.foundation.gestures.e.c) r0
            int r1 = r0.f3902c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3902c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$c r0 = new androidx.compose.foundation.gestures.e$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3901b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f3902c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.a1.n(r6)     // Catch: androidx.compose.foundation.gestures.c -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.a1.n(r6)
            androidx.compose.foundation.gestures.e$d r6 = new androidx.compose.foundation.gestures.e$d     // Catch: androidx.compose.foundation.gestures.c -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.c -> L41
            r0.f3902c = r3     // Catch: androidx.compose.foundation.gestures.c -> L41
            java.lang.Object r4 = kotlinx.coroutines.s0.g(r6, r0)     // Catch: androidx.compose.foundation.gestures.c -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.i(ld.a, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    @androidx.compose.foundation.z0
    @fg.m
    public static final <T> Object j(@fg.l f<T> fVar, T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object k4 = f.k(fVar, t4, null, new C0060e(4, null), dVar, 2, null);
        return k4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? k4 : k2.f75408a;
    }
}
