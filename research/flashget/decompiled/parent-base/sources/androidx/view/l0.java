package androidx.view;

import android.annotation.SuppressLint;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.k2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/l0;", "T", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/j;", "target", "Lkotlin/coroutines/g;", "context", "<init>", "(Landroidx/lifecycle/j;Lkotlin/coroutines/g;)V", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/m1;", "a", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/j;", "c", "()Landroidx/lifecycle/j;", "d", "(Landroidx/lifecycle/j;)V", "b", "Lkotlin/coroutines/g;", "coroutineContext", "()Ljava/lang/Object;", "latestValue", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l0<T> implements InterfaceC1435k0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private C1432j<T> target;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final g coroutineContext;

    /* compiled from: CoroutineLiveData.kt */
    @f(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends o implements p<r0, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30383b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0<T> f30384c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f30385d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0<T> l0Var, T t4, d<? super a> dVar) {
            super(2, dVar);
            this.f30384c = l0Var;
            this.f30385d = t4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            return new a(this.f30384c, this.f30385d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f30383b;
            if (i4 == 0) {
                a1.n(obj);
                C1432j<T> c5 = this.f30384c.c();
                this.f30383b = 1;
                if (c5.v(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            this.f30384c.c().r(this.f30385d);
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @f(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/m1;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/m1;"}, k = 3, mv = {1, 8, 0})
    static final class b extends o implements p<r0, d<? super m1>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0<T> f30387c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f30388d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l0<T> l0Var, LiveData<T> liveData, d<? super b> dVar) {
            super(2, dVar);
            this.f30387c = l0Var;
            this.f30388d = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            return new b(this.f30387c, this.f30388d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f30386b;
            if (i4 == 0) {
                a1.n(obj);
                C1432j<T> c5 = this.f30387c.c();
                LiveData<T> liveData = this.f30388d;
                this.f30386b = 1;
                obj = c5.w(liveData, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return obj;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super m1> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public l0(@l C1432j<T> target, @l g context) {
        kotlin.jvm.internal.l0.p(target, "target");
        kotlin.jvm.internal.l0.p(context, "context");
        this.target = target;
        this.coroutineContext = context.O(j1.e().j1());
    }

    @Override // androidx.view.InterfaceC1435k0
    @m
    public Object a(@l LiveData<T> liveData, @l d<? super m1> dVar) {
        return i.h(this.coroutineContext, new b(this, liveData, null), dVar);
    }

    @Override // androidx.view.InterfaceC1435k0
    @m
    public T b() {
        return this.target.f();
    }

    @l
    public final C1432j<T> c() {
        return this.target;
    }

    public final void d(@l C1432j<T> c1432j) {
        kotlin.jvm.internal.l0.p(c1432j, "<set-?>");
        this.target = c1432j;
    }

    @Override // androidx.view.InterfaceC1435k0
    @m
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t4, @l d<? super k2> dVar) {
        Object h4 = i.h(this.coroutineContext, new a(this, t4, null), dVar);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : k2.f75408a;
    }
}
