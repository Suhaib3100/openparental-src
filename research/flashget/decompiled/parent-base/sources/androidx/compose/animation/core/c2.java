package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: SuspendAnimation.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a`\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0098\u0001\u0010\u0017\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001ay\u0010\u001f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0086@¢\u0006\u0004\b\u001f\u0010 \u001ao\u0010\"\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000!2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0086@¢\u0006\u0004\b\"\u0010#\u001au\u0010(\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\b\b\u0002\u0010'\u001a\u00020&2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0080@¢\u0006\u0004\b(\u0010)\u001aY\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010*\"\u0004\b\u0001\u0010\u0012\"\b\b\u0002\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(+\u0012\u0004\u0012\u00028\u00000\u001cH\u0082@¢\u0006\u0004\b-\u0010.\u001aC\u00100\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0000¢\u0006\u0004\b0\u00101\u001a\u008c\u0001\u00104\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0006\u0010+\u001a\u00020&2\u0006\u00102\u001a\u00020\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0002¢\u0006\u0004\b4\u00105\u001a\u008c\u0001\u00107\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0006\u0010+\u001a\u00020&2\u0006\u00106\u001a\u00020&2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0002¢\u0006\u0004\b7\u00108\"\u0018\u00102\u001a\u00020\u0000*\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/k;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "value", "velocity", "Lkotlin/k2;", "block", "c", "(FFFLandroidx/compose/animation/core/k;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/r0;", "i", "(FFLandroidx/compose/animation/core/r0;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "typeConverter", "e", "(Landroidx/compose/animation/core/i2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/k;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/m;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/j;", "Lkotlin/u;", "l", "(Landroidx/compose/animation/core/m;Ljava/lang/Object;Landroidx/compose/animation/core/k;ZLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/z;", "j", "(Landroidx/compose/animation/core/m;Landroidx/compose/animation/core/z;ZLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/e;", "animation", "", "startTimeNanos", "d", "(Landroidx/compose/animation/core/m;Landroidx/compose/animation/core/e;JLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "R", "frameTimeNanos", "onFrame", "n", "(Landroidx/compose/animation/core/e;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "state", "r", "(Landroidx/compose/animation/core/j;Landroidx/compose/animation/core/m;)V", "durationScale", "anim", "p", "(Landroidx/compose/animation/core/j;JFLandroidx/compose/animation/core/e;Landroidx/compose/animation/core/m;Lld/l;)V", "playTimeNanos", "o", "(Landroidx/compose/animation/core/j;JJLandroidx/compose/animation/core/e;Landroidx/compose/animation/core/m;Lld/l;)V", "Lkotlin/coroutines/g;", "q", "(Lkotlin/coroutines/g;)F", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
/* loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/j;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class a<T, V> extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<T, V>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<T, T, kotlin.k2> f2578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i2<T, V> f2579c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super T, ? super T, kotlin.k2> pVar, i2<T, V> i2Var) {
            super(1);
            this.f2578b = pVar;
            this.f2579c = i2Var;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<T, V> jVar) {
            this.f2578b.invoke(jVar.g(), this.f2579c.b().invoke(jVar.i()));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Object obj) {
            a((androidx.compose.animation.core.j) obj);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SuspendAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {239, 278}, m = "animate", n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b<T, V extends s> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f2580b;

        /* renamed from: c, reason: collision with root package name */
        Object f2581c;

        /* renamed from: d, reason: collision with root package name */
        Object f2582d;

        /* renamed from: e, reason: collision with root package name */
        Object f2583e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2584f;

        /* renamed from: g, reason: collision with root package name */
        int f2585g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f2584f = obj;
            this.f2585g |= Integer.MIN_VALUE;
            return c2.d(null, null, 0L, null, this);
        }
    }

    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/j;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Object, Object>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f2586b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Object, Object> jVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.animation.core.j<Object, Object> jVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Incorrect field signature: TV; */
    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<androidx.compose.animation.core.j<T, V>> f2587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f2588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.e<T, V> f2589d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s f2590e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m<T, V> f2591f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f2592g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.animation.core.j<T, V>, kotlin.k2> f2593h;

        /* compiled from: SuspendAnimation.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m<T, V> f2594b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m<T, V> mVar) {
                super(0);
                this.f2594b = mVar;
            }

            public final void a() {
                this.f2594b.D(false);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/k1$h<Landroidx/compose/animation/core/j<TT;TV;>;>;TT;Landroidx/compose/animation/core/e<TT;TV;>;TV;Landroidx/compose/animation/core/m<TT;TV;>;FLld/l<-Landroidx/compose/animation/core/j<TT;TV;>;Lkotlin/k2;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        d(k1.h hVar, Object obj, androidx.compose.animation.core.e eVar, s sVar, m mVar, float f4, ld.l lVar) {
            super(1);
            this.f2587b = hVar;
            this.f2588c = obj;
            this.f2589d = eVar;
            this.f2590e = sVar;
            this.f2591f = mVar;
            this.f2592g = f4;
            this.f2593h = lVar;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.j] */
        public final void a(long j4) {
            k1.h<androidx.compose.animation.core.j<T, V>> hVar = this.f2587b;
            ?? jVar = new androidx.compose.animation.core.j(this.f2588c, this.f2589d.e(), this.f2590e, j4, this.f2589d.g(), j4, true, new a(this.f2591f));
            c2.p(jVar, j4, this.f2592g, this.f2589d, this.f2591f, this.f2593h);
            hVar.f75329b = jVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
            a(l4.longValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<T, V> f2595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m<T, V> mVar) {
            super(0);
            this.f2595b = mVar;
        }

        public final void a() {
            this.f2595b.D(false);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<androidx.compose.animation.core.j<T, V>> f2596b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f2597c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.e<T, V> f2598d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<T, V> f2599e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.animation.core.j<T, V>, kotlin.k2> f2600f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(k1.h<androidx.compose.animation.core.j<T, V>> hVar, float f4, androidx.compose.animation.core.e<T, V> eVar, m<T, V> mVar, ld.l<? super androidx.compose.animation.core.j<T, V>, kotlin.k2> lVar) {
            super(1);
            this.f2596b = hVar;
            this.f2597c = f4;
            this.f2598d = eVar;
            this.f2599e = mVar;
            this.f2600f = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(long j4) {
            T t4 = this.f2596b.f75329b;
            kotlin.jvm.internal.l0.m(t4);
            c2.p((androidx.compose.animation.core.j) t4, j4, this.f2597c, this.f2598d, this.f2599e, this.f2600f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
            a(l4.longValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Float, o>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Float, Float, kotlin.k2> f2601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.p<? super Float, ? super Float, kotlin.k2> pVar) {
            super(1);
            this.f2601b = pVar;
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Float, o> jVar) {
            this.f2601b.invoke(jVar.g(), Float.valueOf(jVar.i().getValue()));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.j<Float, o> jVar) {
            a(jVar);
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/j;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    public static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Object, Object>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f2602b = new h(1);

        h() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Object, Object> jVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.animation.core.j<Object, Object> jVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/j;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
    public static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.j<Object, Object>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f2603b = new i(1);

        i() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.animation.core.j<Object, Object> jVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.animation.core.j<Object, Object> jVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Landroidx/compose/animation/core/s;", "V", "", "it", "a", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class j<R> extends kotlin.jvm.internal.n0 implements ld.l<Long, R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, R> f2604b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(ld.l<? super Long, ? extends R> lVar) {
            super(1);
            this.f2604b = lVar;
        }

        public final R a(long j4) {
            return this.f2604b.invoke(Long.valueOf(j4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Long l4) {
            return a(l4.longValue());
        }
    }

    @fg.m
    public static final Object c(float f4, float f5, float f6, @fg.l k<Float> kVar, @fg.l ld.p<? super Float, ? super Float, kotlin.k2> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object e4 = e(k2.i(kotlin.jvm.internal.a0.f75283a), new Float(f4), new Float(f5), new Float(f6), kVar, pVar, dVar);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : kotlin.k2.f75408a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1 A[Catch: CancellationException -> 0x0043, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0043, blocks: (B:13:0x003f, B:16:0x00e4, B:18:0x00f1), top: B:12:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, androidx.compose.animation.core.j] */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends androidx.compose.animation.core.s> java.lang.Object d(@fg.l androidx.compose.animation.core.m<T, V> r25, @fg.l androidx.compose.animation.core.e<T, V> r26, long r27, @fg.l ld.l<? super androidx.compose.animation.core.j<T, V>, kotlin.k2> r29, @fg.l kotlin.coroutines.d<? super kotlin.k2> r30) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.c2.d(androidx.compose.animation.core.m, androidx.compose.animation.core.e, long, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public static final <T, V extends s> Object e(@fg.l i2<T, V> i2Var, T t4, T t5, @fg.m T t6, @fg.l k<T> kVar, @fg.l ld.p<? super T, ? super T, kotlin.k2> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        V g4;
        if (t6 == null || (g4 = i2Var.a().invoke(t6)) == null) {
            g4 = t.g(i2Var.a().invoke(t4));
        }
        Object g5 = g(new m(i2Var, t4, g4, 0L, 0L, false, 56, null), new d2(kVar, i2Var, t4, t5, g4), 0L, new a(pVar, i2Var), dVar, 2, null);
        return g5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g5 : kotlin.k2.f75408a;
    }

    public static /* synthetic */ Object f(float f4, float f5, float f6, k kVar, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        float f7 = (i4 & 4) != 0 ? 0.0f : f6;
        if ((i4 & 8) != 0) {
            kVar = l.p(0.0f, 0.0f, null, 7, null);
        }
        return c(f4, f5, f7, kVar, pVar, dVar);
    }

    public static /* synthetic */ Object g(m mVar, androidx.compose.animation.core.e eVar, long j4, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = Long.MIN_VALUE;
        }
        long j5 = j4;
        if ((i4 & 4) != 0) {
            lVar = c.f2586b;
        }
        return d(mVar, eVar, j5, lVar, dVar);
    }

    @fg.m
    public static final Object i(float f4, float f5, @fg.l r0 r0Var, @fg.l ld.p<? super Float, ? super Float, kotlin.k2> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = g(n.c(f4, f5, 0L, 0L, false, 28, null), androidx.compose.animation.core.h.a(r0Var, f4, f5), 0L, new g(pVar), dVar, 2, null);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }

    @fg.m
    public static final <T, V extends s> Object j(@fg.l m<T, V> mVar, @fg.l z<T> zVar, boolean z4, @fg.l ld.l<? super androidx.compose.animation.core.j<T, V>, kotlin.k2> lVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = d(mVar, new y((z) zVar, (i2) mVar.l(), (Object) mVar.getValue(), (s) mVar.q()), z4 ? mVar.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }

    public static /* synthetic */ Object k(m mVar, z zVar, boolean z4, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            lVar = h.f2602b;
        }
        return j(mVar, zVar, z4, lVar, dVar);
    }

    @fg.m
    public static final <T, V extends s> Object l(@fg.l m<T, V> mVar, T t4, @fg.l k<T> kVar, boolean z4, @fg.l ld.l<? super androidx.compose.animation.core.j<T, V>, kotlin.k2> lVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = d(mVar, new d2(kVar, mVar.l(), mVar.getValue(), t4, mVar.q()), z4 ? mVar.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }

    public static /* synthetic */ Object m(m mVar, Object obj, k kVar, boolean z4, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            kVar = l.p(0.0f, 0.0f, null, 7, null);
        }
        k kVar2 = kVar;
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        boolean z5 = z4;
        if ((i4 & 8) != 0) {
            lVar = i.f2603b;
        }
        return l(mVar, obj, kVar2, z5, lVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends s> Object n(androidx.compose.animation.core.e<T, V> eVar, ld.l<? super Long, ? extends R> lVar, kotlin.coroutines.d<? super R> dVar) {
        return eVar.getIsInfinite() ? w0.c(lVar, dVar) : androidx.compose.runtime.b2.f(new j(lVar), dVar);
    }

    private static final <T, V extends s> void o(androidx.compose.animation.core.j<T, V> jVar, long j4, long j5, androidx.compose.animation.core.e<T, V> eVar, m<T, V> mVar, ld.l<? super androidx.compose.animation.core.j<T, V>, kotlin.k2> lVar) {
        jVar.l(j4);
        jVar.n(eVar.f(j5));
        jVar.o(eVar.b(j5));
        if (eVar.c(j5)) {
            jVar.k(jVar.getLastFrameTimeNanos());
            jVar.m(false);
        }
        r(jVar, mVar);
        lVar.invoke(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends s> void p(androidx.compose.animation.core.j<T, V> jVar, long j4, float f4, androidx.compose.animation.core.e<T, V> eVar, m<T, V> mVar, ld.l<? super androidx.compose.animation.core.j<T, V>, kotlin.k2> lVar) {
        o(jVar, j4, f4 == 0.0f ? eVar.getDurationNanos() : (long) ((j4 - jVar.getStartTimeNanos()) / f4), eVar, mVar, lVar);
    }

    public static final float q(@fg.l kotlin.coroutines.g gVar) {
        androidx.compose.ui.s sVar = (androidx.compose.ui.s) gVar.c(androidx.compose.ui.s.INSTANCE);
        float B = sVar != null ? sVar.B() : 1.0f;
        if (B >= 0.0f) {
            return B;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static final <T, V extends s> void r(@fg.l androidx.compose.animation.core.j<T, V> jVar, @fg.l m<T, V> mVar) {
        mVar.F(jVar.g());
        t.f(mVar.q(), jVar.i());
        mVar.y(jVar.getFinishedTimeNanos());
        mVar.A(jVar.getLastFrameTimeNanos());
        mVar.D(jVar.j());
    }
}
