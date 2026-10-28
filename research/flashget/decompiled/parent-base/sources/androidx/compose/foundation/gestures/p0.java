package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.c2;
import androidx.compose.foundation.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: ScrollExtensions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/gestures/w0;", "", "value", "Landroidx/compose/animation/core/k;", "animationSpec", "a", "(Landroidx/compose/foundation/gestures/w0;FLandroidx/compose/animation/core/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "(Landroidx/compose/foundation/gestures/w0;FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/a2;", "scrollPriority", "Lkotlin/k2;", "d", "(Landroidx/compose/foundation/gestures/w0;Landroidx/compose/foundation/a2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 {

    /* compiled from: ScrollExtensions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {40}, m = "animateScrollBy", n = {"previousValue"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4188b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4189c;

        /* renamed from: d, reason: collision with root package name */
        int f4190d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4189c = obj;
            this.f4190d |= Integer.MIN_VALUE;
            return p0.a(null, 0.0f, null, this);
        }
    }

    /* compiled from: ScrollExtensions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4191b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4192c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4193d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<Float> f4194e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k1.e f4195f;

        /* compiled from: ScrollExtensions.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Lkotlin/k2;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<Float, Float, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.e f4196b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ q0 f4197c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.e eVar, q0 q0Var) {
                super(2);
                this.f4196b = eVar;
                this.f4197c = q0Var;
            }

            public final void a(float f4, float f5) {
                k1.e eVar = this.f4196b;
                float f6 = eVar.f75326b;
                eVar.f75326b = this.f4197c.a(f4 - f6) + f6;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(Float f4, Float f5) {
                a(f4.floatValue(), f5.floatValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f4, androidx.compose.animation.core.k<Float> kVar, k1.e eVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f4193d = f4;
            this.f4194e = kVar;
            this.f4195f = eVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f4193d, this.f4194e, this.f4195f, dVar);
            bVar.f4192c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4191b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                q0 q0Var = (q0) this.f4192c;
                float f4 = this.f4193d;
                androidx.compose.animation.core.k<Float> kVar = this.f4194e;
                a aVar2 = new a(this.f4195f, q0Var);
                this.f4191b = 1;
                if (c2.f(0.0f, f4, 0.0f, kVar, aVar2, this, 4, null) == aVar) {
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

    /* compiled from: ScrollExtensions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {61}, m = "scrollBy", n = {"consumed"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4198b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4199c;

        /* renamed from: d, reason: collision with root package name */
        int f4200d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4199c = obj;
            this.f4200d |= Integer.MIN_VALUE;
            return p0.c(null, 0.0f, this);
        }
    }

    /* compiled from: ScrollExtensions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4201b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4202c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.e f4203d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4204e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k1.e eVar, float f4, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f4203d = eVar;
            this.f4204e = f4;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f4203d, this.f4204e, dVar);
            dVar2.f4202c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4201b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            q0 q0Var = (q0) this.f4202c;
            this.f4203d.f75326b = q0Var.a(this.f4204e);
            return k2.f75408a;
        }
    }

    /* compiled from: ScrollExtensions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4205b;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new e(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4205b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@fg.l androidx.compose.foundation.gestures.w0 r7, float r8, @fg.l androidx.compose.animation.core.k<java.lang.Float> r9, @fg.l kotlin.coroutines.d<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.p0.a
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.foundation.gestures.p0$a r0 = (androidx.compose.foundation.gestures.p0.a) r0
            int r1 = r0.f4190d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4190d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.p0$a r0 = new androidx.compose.foundation.gestures.p0$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f4189c
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r4.f4190d
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r7 = r4.f4188b
            kotlin.jvm.internal.k1$e r7 = (kotlin.jvm.internal.k1.e) r7
            kotlin.a1.n(r10)
            goto L53
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.a1.n(r10)
            kotlin.jvm.internal.k1$e r10 = new kotlin.jvm.internal.k1$e
            r10.<init>()
            androidx.compose.foundation.gestures.p0$b r3 = new androidx.compose.foundation.gestures.p0$b
            r1 = 0
            r3.<init>(r8, r9, r10, r1)
            r4.f4188b = r10
            r4.f4190d = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = androidx.compose.foundation.gestures.w0.h(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            r7 = r10
        L53:
            float r7 = r7.f75326b
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.p0.a(androidx.compose.foundation.gestures.w0, float, androidx.compose.animation.core.k, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(w0 w0Var, float f4, androidx.compose.animation.core.k kVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            kVar = androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);
        }
        return a(w0Var, f4, kVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@fg.l androidx.compose.foundation.gestures.w0 r7, float r8, @fg.l kotlin.coroutines.d<? super java.lang.Float> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.p0.c
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.p0$c r0 = (androidx.compose.foundation.gestures.p0.c) r0
            int r1 = r0.f4200d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4200d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.p0$c r0 = new androidx.compose.foundation.gestures.p0$c
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f4199c
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r4.f4200d
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r7 = r4.f4198b
            kotlin.jvm.internal.k1$e r7 = (kotlin.jvm.internal.k1.e) r7
            kotlin.a1.n(r9)
            goto L53
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.a1.n(r9)
            kotlin.jvm.internal.k1$e r9 = new kotlin.jvm.internal.k1$e
            r9.<init>()
            androidx.compose.foundation.gestures.p0$d r3 = new androidx.compose.foundation.gestures.p0$d
            r1 = 0
            r3.<init>(r9, r8, r1)
            r4.f4198b = r9
            r4.f4200d = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = androidx.compose.foundation.gestures.w0.h(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            r7 = r9
        L53:
            float r7 = r7.f75326b
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.p0.c(androidx.compose.foundation.gestures.w0, float, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public static final Object d(@fg.l w0 w0Var, @fg.l a2 a2Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object f4 = w0Var.f(a2Var, new e(2, null), dVar);
        return f4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f4 : k2.f75408a;
    }

    public static /* synthetic */ Object e(w0 w0Var, a2 a2Var, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            a2Var = a2.Default;
        }
        return d(w0Var, a2Var, dVar);
    }
}
