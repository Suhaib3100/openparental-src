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
import kotlinx.coroutines.j;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;
import q3.p;

/* compiled from: PausingDispatcher.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u001aF\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001aF\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u001aF\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\f\u001aN\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"T", "Landroidx/lifecycle/a0;", "Lkotlin/Function2;", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "b", "(Landroidx/lifecycle/a0;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/t;", "a", "(Landroidx/lifecycle/t;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "e", "d", "c", "Landroidx/lifecycle/t$c;", "minState", "g", "(Landroidx/lifecycle/t;Landroidx/lifecycle/t$c;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PausingDispatcher.kt */
    @DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {162}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a<T> extends SuspendLambda implements p<u0, Continuation<? super T>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8611s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f8612t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ t f8613u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ t.c f8614v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ p<u0, Continuation<? super T>, Object> f8615w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(t tVar, t.c cVar, p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8613u = tVar;
            this.f8614v = cVar;
            this.f8615w = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            LifecycleController lifecycleController;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f8611s;
            if (i5 == 0) {
                a1.n(obj);
                n2 n2Var = (n2) ((u0) this.f8612t).getCoroutineContext().b(n2.INSTANCE);
                if (n2Var == null) {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
                m0 m0Var = new m0();
                LifecycleController lifecycleController2 = new LifecycleController(this.f8613u, this.f8614v, m0Var.dispatchQueue, n2Var);
                try {
                    p<u0, Continuation<? super T>, Object> pVar = this.f8615w;
                    this.f8612t = lifecycleController2;
                    this.f8611s = 1;
                    obj = j.h(m0Var, pVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lifecycleController = lifecycleController2;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController = lifecycleController2;
                    lifecycleController.c();
                    throw th;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.f8612t;
                try {
                    a1.n(obj);
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController.c();
                    throw th;
                }
            }
            lifecycleController.c();
            return obj;
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d u0 u0Var, @e Continuation<? super T> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            a aVar = new a(this.f8613u, this.f8614v, this.f8615w, continuation);
            aVar.f8612t = obj;
            return aVar;
        }
    }

    @e
    public static final <T> Object a(@d t tVar, @d p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d Continuation<? super T> continuation) {
        return g(tVar, t.c.CREATED, pVar, continuation);
    }

    @e
    public static final <T> Object b(@d a0 a0Var, @d p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d Continuation<? super T> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        return a(lifecycle, pVar, continuation);
    }

    @e
    public static final <T> Object c(@d t tVar, @d p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d Continuation<? super T> continuation) {
        return g(tVar, t.c.RESUMED, pVar, continuation);
    }

    @e
    public static final <T> Object d(@d a0 a0Var, @d p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d Continuation<? super T> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        return c(lifecycle, pVar, continuation);
    }

    @e
    public static final <T> Object e(@d t tVar, @d p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d Continuation<? super T> continuation) {
        return g(tVar, t.c.STARTED, pVar, continuation);
    }

    @e
    public static final <T> Object f(@d a0 a0Var, @d p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d Continuation<? super T> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        return e(lifecycle, pVar, continuation);
    }

    @e
    public static final <T> Object g(@d t tVar, @d t.c cVar, @d p<? super u0, ? super Continuation<? super T>, ? extends Object> pVar, @d Continuation<? super T> continuation) {
        return j.h(m1.e().J0(), new a(tVar, cVar, pVar, null), continuation);
    }
}
