package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/u3;", "Landroidx/compose/runtime/a2;", "<init>", "()V", "R", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "frameTimeNanos", "onFrame", "u", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "J", "DefaultFrameDelay", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class u3 implements a2 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final u3 f17205b = new u3();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long DefaultFrameDelay = 16;

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ActualAndroid.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f17207b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, R> f17208c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super Long, ? extends R> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f17208c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f17208c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f17207b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                this.f17207b = 1;
                if (kotlinx.coroutines.c1.b(16L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return this.f17208c.invoke(new Long(System.nanoTime()));
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super R> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    private u3() {
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

    @Override // androidx.compose.runtime.a2
    @fg.m
    public <R> Object u(@fg.l ld.l<? super Long, ? extends R> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.i.h(kotlinx.coroutines.j1.e(), new a(lVar, null), dVar);
    }
}
