package android.view;

import android.view.t;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.k0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.u0;
import q3.p;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Landroidx/lifecycle/t;", "lifecycle", "Landroidx/lifecycle/t$c;", "minActiveState", "a", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a<T> extends SuspendLambda implements p<e0<? super T>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8602s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f8603t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ t f8604u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ t.c f8605v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ i<T> f8606w;

        /* compiled from: FlowExt.kt */
        @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.lifecycle.n$a$a, reason: collision with other inner class name */
        static final class C0097a extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f8607s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ i<T> f8608t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ e0<T> f8609u;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
            /* renamed from: androidx.lifecycle.n$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0098a implements j<T> {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ e0 f8610o;

                public C0098a(e0 e0Var) {
                    this.f8610o = e0Var;
                }

                @Override // kotlinx.coroutines.flow.j
                @e
                public Object b(T t5, @d Continuation<? super m2> continuation) {
                    Object a02 = this.f8610o.a0(t5, continuation);
                    return a02 == CoroutineSingletons.COROUTINE_SUSPENDED ? a02 : m2.f23662a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0097a(i<? extends T> iVar, e0<? super T> e0Var, Continuation<? super C0097a> continuation) {
                super(2, continuation);
                this.f8608t = iVar;
                this.f8609u = e0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object A(@d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f8607s;
                if (i5 == 0) {
                    a1.n(obj);
                    i<T> iVar = this.f8608t;
                    C0098a c0098a = new C0098a(this.f8609u);
                    this.f8607s = 1;
                    if (iVar.a(c0098a, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.p
            @e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d u0 u0Var, @e Continuation<? super m2> continuation) {
                return ((C0097a) c(u0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d
            public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
                return new C0097a(this.f8608t, this.f8609u, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(t tVar, t.c cVar, i<? extends T> iVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8604u = tVar;
            this.f8605v = cVar;
            this.f8606w = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            e0 e0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f8602s;
            if (i5 == 0) {
                a1.n(obj);
                e0 e0Var2 = (e0) this.f8603t;
                t tVar = this.f8604u;
                t.c cVar = this.f8605v;
                C0097a c0097a = new C0097a(this.f8606w, e0Var2, null);
                this.f8603t = e0Var2;
                this.f8602s = 1;
                if (RepeatOnLifecycleKt.a(tVar, cVar, c0097a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                e0Var = e0Var2;
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e0Var = (e0) this.f8603t;
                a1.n(obj);
            }
            k0.a.a(e0Var, null, 1, null);
            return m2.f23662a;
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d e0<? super T> e0Var, @e Continuation<? super m2> continuation) {
            return ((a) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            a aVar = new a(this.f8604u, this.f8605v, this.f8606w, continuation);
            aVar.f8603t = obj;
            return aVar;
        }
    }

    @d
    public static final <T> i<T> a(@d i<? extends T> iVar, @d t lifecycle, @d t.c minActiveState) {
        l0.p(iVar, "<this>");
        l0.p(lifecycle, "lifecycle");
        l0.p(minActiveState, "minActiveState");
        return k.s(new a(lifecycle, minActiveState, iVar, null));
    }

    public static /* synthetic */ i b(i iVar, t tVar, t.c cVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            cVar = t.c.STARTED;
        }
        return a(iVar, tVar, cVar);
    }
}
