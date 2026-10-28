package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.t4;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: Animatable.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\rJ_\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0010\u001a\u00028\u00002%\u0010\u0014\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\b\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001f\u0010 Jg\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010!\u001a\u00028\u00002\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\b\b\u0002\u0010\u0010\u001a\u00028\u00002'\b\u0002\u0010\u0014\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\b\u0013H\u0086@¢\u0006\u0004\b$\u0010%J[\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000&2'\b\u0002\u0010\u0014\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\b\u0013H\u0086@¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00122\u0006\u0010!\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\b.\u0010/R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R&\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R+\u0010H\u001a\u00020@2\u0006\u0010A\u001a\u00020@8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR+\u0010!\u001a\u00028\u00002\u0006\u0010A\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010C\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010\u001d\u001a\u0004\u0018\u00018\u00002\b\u0010A\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u00105\u001a\u0004\bN\u0010JR(\u0010\u001e\u001a\u0004\u0018\u00018\u00002\b\u0010A\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\bO\u0010JR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010[\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010Y\u0012\u0004\bZ\u0010\u001cR\u001a\u0010]\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001b\u0010Y\u0012\u0004\b\\\u0010\u001cR\u0016\u0010^\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010YR\u0016\u0010_\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010YR\u0011\u0010\u0018\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b`\u0010JR\u0011\u0010c\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010e\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bd\u0010J¨\u0006f"}, d2 = {"Landroidx/compose/animation/core/b;", "T", "Landroidx/compose/animation/core/s;", "V", "", "initialValue", "Landroidx/compose/animation/core/i2;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/i2;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/i2;Ljava/lang/Object;)V", "Landroidx/compose/animation/core/e;", "animation", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "block", "Landroidx/compose/animation/core/i;", "z", "(Landroidx/compose/animation/core/e;Ljava/lang/Object;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "l", "()V", "lowerBound", "upperBound", "E", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/k;", "animationSpec", "h", "(Ljava/lang/Object;Landroidx/compose/animation/core/k;Ljava/lang/Object;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/z;", "f", "(Ljava/lang/Object;Landroidx/compose/animation/core/z;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "C", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "D", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/runtime/b5;", "j", "()Landroidx/compose/runtime/b5;", "a", "Landroidx/compose/animation/core/i2;", "t", "()Landroidx/compose/animation/core/i2;", "b", "Ljava/lang/Object;", "c", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "Landroidx/compose/animation/core/m;", "d", "Landroidx/compose/animation/core/m;", "n", "()Landroidx/compose/animation/core/m;", "internalState", "", "<set-?>", "e", "Landroidx/compose/runtime/k2;", "y", "()Z", "A", "(Z)V", "isRunning", "s", "()Ljava/lang/Object;", "B", "(Ljava/lang/Object;)V", "g", "p", "u", "Landroidx/compose/animation/core/l1;", "i", "Landroidx/compose/animation/core/l1;", "mutatorMutex", "Landroidx/compose/animation/core/y1;", "Landroidx/compose/animation/core/y1;", "m", "()Landroidx/compose/animation/core/y1;", "defaultSpringSpec", "Landroidx/compose/animation/core/s;", "q", "negativeInfinityBounds", "r", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "v", "x", "()Landroidx/compose/animation/core/s;", "velocityVector", "w", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n81#2:508\n107#2,2:509\n81#2:511\n107#2,2:512\n1#3:514\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n98#1:508\n98#1:509,2\n105#1:511\n105#1:512,2\n*E\n"})
/* loaded from: classes.dex */
public final class b<T, V extends s> {

    /* renamed from: o, reason: collision with root package name */
    public static final int f2527o = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2<T, V> typeConverter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final T visibilityThreshold;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<T, V> internalState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isRunning;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 targetValue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private T lowerBound;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private T upperBound;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 mutatorMutex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y1<T> defaultSpringSpec;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final V negativeInfinityBounds;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final V positiveInfinityBounds;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private V lowerBoundVector;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private V upperBoundVector;

    /* compiled from: Animatable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {312}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i;", "<anonymous>", "()Landroidx/compose/animation/core/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super i<T, V>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f2542b;

        /* renamed from: c, reason: collision with root package name */
        Object f2543c;

        /* renamed from: d, reason: collision with root package name */
        int f2544d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b<T, V> f2545e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f2546f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e<T, V> f2547g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f2548h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<b<T, V>, kotlin.k2> f2549i;

        /* compiled from: Animatable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/j;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/j;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.core.b$a$a, reason: collision with other inner class name */
        static final class C0039a extends kotlin.jvm.internal.n0 implements ld.l<j<T, V>, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b<T, V> f2550b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m<T, V> f2551c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l<b<T, V>, kotlin.k2> f2552d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ k1.a f2553e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0039a(b<T, V> bVar, m<T, V> mVar, ld.l<? super b<T, V>, kotlin.k2> lVar, k1.a aVar) {
                super(1);
                this.f2550b = bVar;
                this.f2551c = mVar;
                this.f2552d = lVar;
                this.f2553e = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(@fg.l j<T, V> jVar) {
                c2.r(jVar, this.f2550b.n());
                Object k4 = this.f2550b.k(jVar.g());
                if (kotlin.jvm.internal.l0.g(k4, jVar.g())) {
                    ld.l<b<T, V>, kotlin.k2> lVar = this.f2552d;
                    if (lVar != null) {
                        lVar.invoke(this.f2550b);
                        return;
                    }
                    return;
                }
                this.f2550b.n().F(k4);
                this.f2551c.F(k4);
                ld.l<b<T, V>, kotlin.k2> lVar2 = this.f2552d;
                if (lVar2 != null) {
                    lVar2.invoke(this.f2550b);
                }
                jVar.a();
                this.f2553e.f75322b = true;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Object obj) {
                a((j) obj);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b<T, V> bVar, T t4, e<T, V> eVar, long j4, ld.l<? super b<T, V>, kotlin.k2> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f2545e = bVar;
            this.f2546f = t4;
            this.f2547g = eVar;
            this.f2548h = j4;
            this.f2549i = lVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super i<T, V>> dVar) {
            return ((a) create(dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f2545e, this.f2546f, this.f2547g, this.f2548h, this.f2549i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            m mVar;
            k1.a aVar;
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f2544d;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    this.f2545e.n().G(this.f2545e.t().a().invoke(this.f2546f));
                    this.f2545e.B(this.f2547g.g());
                    this.f2545e.A(true);
                    m h4 = n.h(this.f2545e.n(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    k1.a aVar3 = new k1.a();
                    e<T, V> eVar = this.f2547g;
                    long j4 = this.f2548h;
                    C0039a c0039a = new C0039a(this.f2545e, h4, this.f2549i, aVar3);
                    this.f2542b = h4;
                    this.f2543c = aVar3;
                    this.f2544d = 1;
                    if (c2.d(h4, eVar, j4, c0039a, this) == aVar2) {
                        return aVar2;
                    }
                    mVar = h4;
                    aVar = aVar3;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (k1.a) this.f2543c;
                    mVar = (m) this.f2542b;
                    kotlin.a1.n(obj);
                }
                g gVar = aVar.f75322b ? g.BoundReached : g.Finished;
                this.f2545e.l();
                return new i(mVar, gVar);
            } catch (CancellationException e4) {
                this.f2545e.l();
                throw e4;
            }
        }
    }

    /* compiled from: Animatable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.core.b$b, reason: collision with other inner class name */
    static final class C0040b extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f2554b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T, V> f2555c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f2556d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0040b(b<T, V> bVar, T t4, kotlin.coroutines.d<? super C0040b> dVar) {
            super(1, dVar);
            this.f2555c = bVar;
            this.f2556d = t4;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((C0040b) create(dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return new C0040b(this.f2555c, this.f2556d, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f2554b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            this.f2555c.l();
            Object k4 = this.f2555c.k(this.f2556d);
            this.f2555c.n().F(k4);
            this.f2555c.B(k4);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Animatable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f2557b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T, V> f2558c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b<T, V> bVar, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f2558c = bVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return new c(this.f2558c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f2557b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            this.f2558c.l();
            return kotlin.k2.f75408a;
        }
    }

    public b(T t4, @fg.l i2<T, V> i2Var, @fg.m T t5, @fg.l String str) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        this.typeConverter = i2Var;
        this.visibilityThreshold = t5;
        this.label = str;
        m<T, V> mVar = new m<>(i2Var, t4, null, 0L, 0L, false, 60, null);
        this.internalState = mVar;
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        this.isRunning = g4;
        g5 = t4.g(t4, null, 2, null);
        this.targetValue = g5;
        this.mutatorMutex = new l1();
        this.defaultSpringSpec = new y1<>(0.0f, 0.0f, t5, 3, null);
        V q4 = mVar.q();
        V v4 = q4 instanceof o ? androidx.compose.animation.core.c.f2570e : q4 instanceof p ? androidx.compose.animation.core.c.f2571f : q4 instanceof q ? androidx.compose.animation.core.c.f2572g : androidx.compose.animation.core.c.f2573h;
        kotlin.jvm.internal.l0.n(v4, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v4;
        V q5 = mVar.q();
        V v5 = q5 instanceof o ? androidx.compose.animation.core.c.f2566a : q5 instanceof p ? androidx.compose.animation.core.c.f2567b : q5 instanceof q ? androidx.compose.animation.core.c.f2568c : androidx.compose.animation.core.c.f2569d;
        kotlin.jvm.internal.l0.n(v5, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v5;
        this.lowerBoundVector = v4;
        this.upperBoundVector = v5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z4) {
        this.isRunning.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(T t4) {
        this.targetValue.setValue(t4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void F(b bVar, Object obj, Object obj2, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = bVar.lowerBound;
        }
        if ((i4 & 2) != 0) {
            obj2 = bVar.upperBound;
        }
        bVar.E(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object g(b bVar, Object obj, z zVar, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        return bVar.f(obj, zVar, lVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object i(b bVar, Object obj, k kVar, Object obj2, ld.l lVar, kotlin.coroutines.d dVar, int i4, Object obj3) {
        if ((i4 & 2) != 0) {
            kVar = bVar.defaultSpringSpec;
        }
        k kVar2 = kVar;
        T t4 = obj2;
        if ((i4 & 4) != 0) {
            t4 = bVar.w();
        }
        T t5 = t4;
        if ((i4 & 8) != 0) {
            lVar = null;
        }
        return bVar.h(obj, kVar2, t5, lVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T k(T value) {
        if (kotlin.jvm.internal.l0.g(this.lowerBoundVector, this.negativeInfinityBounds) && kotlin.jvm.internal.l0.g(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V invoke = this.typeConverter.a().invoke(value);
        int size = invoke.getSize();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            if (invoke.a(i4) < this.lowerBoundVector.a(i4) || invoke.a(i4) > this.upperBoundVector.a(i4)) {
                invoke.e(i4, kotlin.ranges.s.H(invoke.a(i4), this.lowerBoundVector.a(i4), this.upperBoundVector.a(i4)));
                z4 = true;
            }
        }
        return z4 ? this.typeConverter.b().invoke(invoke) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        m<T, V> mVar = this.internalState;
        mVar.q().d();
        mVar.A(Long.MIN_VALUE);
        A(false);
    }

    private static /* synthetic */ void q() {
    }

    private static /* synthetic */ void r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(e<T, V> eVar, T t4, ld.l<? super b<T, V>, kotlin.k2> lVar, kotlin.coroutines.d<? super i<T, V>> dVar) {
        return l1.e(this.mutatorMutex, null, new a(this, t4, eVar, this.internalState.getLastFrameTimeNanos(), lVar, null), dVar, 1, null);
    }

    @fg.m
    public final Object C(T t4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object e4 = l1.e(this.mutatorMutex, null, new C0040b(this, t4, null), dVar, 1, null);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : kotlin.k2.f75408a;
    }

    @fg.m
    public final Object D(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object e4 = l1.e(this.mutatorMutex, null, new c(this, null), dVar, 1, null);
        return e4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? e4 : kotlin.k2.f75408a;
    }

    public final void E(@fg.m T lowerBound, @fg.m T upperBound) {
        V v4;
        V v5;
        if (lowerBound == null || (v4 = this.typeConverter.a().invoke(lowerBound)) == null) {
            v4 = this.negativeInfinityBounds;
        }
        if (upperBound == null || (v5 = this.typeConverter.a().invoke(upperBound)) == null) {
            v5 = this.positiveInfinityBounds;
        }
        int size = v4.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            if (v4.a(i4) > v5.a(i4)) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v4 + " is greater than upper bound " + v5 + " on index " + i4).toString());
            }
        }
        this.lowerBoundVector = v4;
        this.upperBoundVector = v5;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (y()) {
            return;
        }
        T k4 = k(this.internalState.getValue());
        if (kotlin.jvm.internal.l0.g(k4, this.internalState.getValue())) {
            return;
        }
        ((m<T, V>) this.internalState).F(k4);
    }

    @fg.m
    public final Object f(T t4, @fg.l z<T> zVar, @fg.m ld.l<? super b<T, V>, kotlin.k2> lVar, @fg.l kotlin.coroutines.d<? super i<T, V>> dVar) {
        return z(new y((z) zVar, (i2) this.typeConverter, (Object) this.internalState.getValue(), (s) this.typeConverter.a().invoke(t4)), t4, lVar, dVar);
    }

    @fg.m
    public final Object h(T t4, @fg.l k<T> kVar, T t5, @fg.m ld.l<? super b<T, V>, kotlin.k2> lVar, @fg.l kotlin.coroutines.d<? super i<T, V>> dVar) {
        return z(h.c(kVar, this.typeConverter, this.internalState.getValue(), t4, t5), t5, lVar, dVar);
    }

    @fg.l
    public final b5<T> j() {
        return this.internalState;
    }

    @fg.l
    public final y1<T> m() {
        return this.defaultSpringSpec;
    }

    @fg.l
    public final m<T, V> n() {
        return this.internalState;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @fg.m
    public final T p() {
        return this.lowerBound;
    }

    public final T s() {
        return this.targetValue.getValue();
    }

    @fg.l
    public final i2<T, V> t() {
        return this.typeConverter;
    }

    @fg.m
    public final T u() {
        return this.upperBound;
    }

    public final T v() {
        return this.internalState.getValue();
    }

    public final T w() {
        return (T) this.typeConverter.b().invoke(this.internalState.q());
    }

    @fg.l
    public final V x() {
        return this.internalState.q();
    }

    public final boolean y() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public /* synthetic */ b(Object obj, i2 i2Var, Object obj2, String str, int i4, kotlin.jvm.internal.w wVar) {
        this(obj, i2Var, (i4 & 4) != 0 ? null : obj2, (i4 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ b(Object obj, i2 i2Var, Object obj2, int i4, kotlin.jvm.internal.w wVar) {
        this(obj, i2Var, (i4 & 4) != 0 ? null : obj2);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @kotlin.x0(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ b(Object obj, i2 i2Var, Object obj2) {
        this(obj, i2Var, obj2, "Animatable");
    }
}
