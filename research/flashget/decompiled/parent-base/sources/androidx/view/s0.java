package androidx.view;

import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.k;
import kotlin.k2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: PausingDispatcher.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u001aF\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001aF\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u001aF\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\f\u001aN\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"T", "Landroidx/lifecycle/e0;", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "b", "(Landroidx/lifecycle/e0;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/w;", "a", "(Landroidx/lifecycle/w;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "e", "d", "c", "Landroidx/lifecycle/w$b;", "minState", "g", "(Landroidx/lifecycle/w;Landroidx/lifecycle/w$b;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PausingDispatcher.kt */
    @f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a<T> extends o implements p<r0, d<? super T>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30437b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f30438c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f30439d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w.b f30440e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<r0, d<? super T>, Object> f30441f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC1450w abstractC1450w, AbstractC1450w.b bVar, p<? super r0, ? super d<? super T>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f30439d = abstractC1450w;
            this.f30440e = bVar;
            this.f30441f = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            a aVar = new a(this.f30439d, this.f30440e, this.f30441f, dVar);
            aVar.f30438c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            C1452y c1452y;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f30437b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.k2 k2Var = (kotlinx.coroutines.k2) ((r0) this.f30438c).getCoroutineContext().c(kotlinx.coroutines.k2.INSTANCE);
                if (k2Var == null) {
                    throw new IllegalStateException("when[State] methods should have a parent job");
                }
                r0 r0Var = new r0();
                C1452y c1452y2 = new C1452y(this.f30439d, this.f30440e, r0Var.dispatchQueue, k2Var);
                try {
                    p<r0, d<? super T>, Object> pVar = this.f30441f;
                    this.f30438c = c1452y2;
                    this.f30437b = 1;
                    obj = i.h(r0Var, pVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c1452y = c1452y2;
                } catch (Throwable th) {
                    th = th;
                    c1452y = c1452y2;
                    c1452y.b();
                    throw th;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1452y = (C1452y) this.f30438c;
                try {
                    a1.n(obj);
                } catch (Throwable th2) {
                    th = th2;
                    c1452y.b();
                    throw th;
                }
            }
            c1452y.b();
            return obj;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super T> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @m
    @k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object a(@l AbstractC1450w abstractC1450w, @l p<? super r0, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
        return g(abstractC1450w, AbstractC1450w.b.CREATED, pVar, dVar);
    }

    @m
    @k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object b(@l InterfaceC1423e0 interfaceC1423e0, @l p<? super r0, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
        return g(interfaceC1423e0.getLifecycle(), AbstractC1450w.b.CREATED, pVar, dVar);
    }

    @m
    @k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object c(@l AbstractC1450w abstractC1450w, @l p<? super r0, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
        return g(abstractC1450w, AbstractC1450w.b.RESUMED, pVar, dVar);
    }

    @m
    @k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object d(@l InterfaceC1423e0 interfaceC1423e0, @l p<? super r0, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
        return g(interfaceC1423e0.getLifecycle(), AbstractC1450w.b.RESUMED, pVar, dVar);
    }

    @m
    @k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object e(@l AbstractC1450w abstractC1450w, @l p<? super r0, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
        return g(abstractC1450w, AbstractC1450w.b.STARTED, pVar, dVar);
    }

    @m
    @k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object f(@l InterfaceC1423e0 interfaceC1423e0, @l p<? super r0, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
        return g(interfaceC1423e0.getLifecycle(), AbstractC1450w.b.STARTED, pVar, dVar);
    }

    @m
    @k(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object g(@l AbstractC1450w abstractC1450w, @l AbstractC1450w.b bVar, @l p<? super r0, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
        return i.h(j1.e().j1(), new a(abstractC1450w, bVar, pVar, null), dVar);
    }
}
