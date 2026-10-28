package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.channels.e0;

/* compiled from: CancelableChannelFlow.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "Lkotlinx/coroutines/k2;", "controller", "Lkotlin/Function2;", "Landroidx/paging/n1;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/flow/i;", "a", "(Lkotlinx/coroutines/k2;Lld/p;)Lkotlinx/coroutines/flow/i;", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CancelableChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/paging/n1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/n1;)V"}, k = 3, mv = {1, 5, 1})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<n1<T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31681b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31682c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.k2 f31683d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<n1<T>, kotlin.coroutines.d<? super k2>, Object> f31684e;

        /* compiled from: CancelableChannelFlow.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.paging.f$a$a, reason: collision with other inner class name */
        static final class C0537a extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n1<T> f31685b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0537a(n1<T> n1Var) {
                super(1);
                this.f31685b = n1Var;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
                invoke2(th);
                return k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@fg.m Throwable th) {
                e0.a.a(this.f31685b, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.k2 k2Var, ld.p<? super n1<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f31683d = k2Var;
            this.f31684e = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l n1<T> n1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(n1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f31683d, this.f31684e, dVar);
            aVar.f31682c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31681b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                n1<T> n1Var = (n1) this.f31682c;
                this.f31683d.F(new C0537a(n1Var));
                ld.p<n1<T>, kotlin.coroutines.d<? super k2>, Object> pVar = this.f31684e;
                this.f31681b = 1;
                if (pVar.invoke(n1Var, this) == aVar) {
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

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> a(@fg.l kotlinx.coroutines.k2 controller, @fg.l ld.p<? super n1<T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> block) {
        kotlin.jvm.internal.l0.p(controller, "controller");
        kotlin.jvm.internal.l0.p(block, "block");
        return m1.a(new a(controller, block, null));
    }
}
