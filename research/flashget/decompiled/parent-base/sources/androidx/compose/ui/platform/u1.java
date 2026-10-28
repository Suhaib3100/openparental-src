package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: InfiniteAnimationPolicy.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"R", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "frameTimeNanos", "onFrame", "a", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: InfiniteAnimationPolicy.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a<R> extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f20183b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, R> f20184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super Long, ? extends R> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f20184c = lVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super R> dVar) {
            return ((a) create(dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f20184c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f20183b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                ld.l<Long, R> lVar = this.f20184c;
                this.f20183b = 1;
                obj = androidx.compose.runtime.b2.f(lVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return obj;
        }
    }

    @fg.m
    public static final <R> Object a(@fg.l ld.l<? super Long, ? extends R> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        t1 t1Var = (t1) dVar.getF75054b().c(t1.INSTANCE);
        return t1Var == null ? androidx.compose.runtime.b2.f(lVar, dVar) : t1Var.t(new a(lVar, null), dVar);
    }
}
