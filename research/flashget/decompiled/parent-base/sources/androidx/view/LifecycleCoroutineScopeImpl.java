package androidx.view;

import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/z;", "Landroidx/lifecycle/b0;", "Landroidx/lifecycle/w;", "lifecycle", "Lkotlin/coroutines/g;", "coroutineContext", "<init>", "(Landroidx/lifecycle/w;Lkotlin/coroutines/g;)V", "Lkotlin/k2;", "h", "()V", "Landroidx/lifecycle/e0;", "source", "Landroidx/lifecycle/w$a;", "event", "f", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$a;)V", "b", "Landroidx/lifecycle/w;", "()Landroidx/lifecycle/w;", "c", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC1453z implements InterfaceC1416b0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final AbstractC1450w lifecycle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final g coroutineContext;

    /* compiled from: Lifecycle.kt */
    @f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends o implements p<r0, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30159b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f30160c;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            a aVar = LifecycleCoroutineScopeImpl.this.new a(dVar);
            aVar.f30160c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f30159b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            r0 r0Var = (r0) this.f30160c;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle().getState().compareTo(AbstractC1450w.b.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle().a(LifecycleCoroutineScopeImpl.this);
            } else {
                p2.i(r0Var.getCoroutineContext(), null, 1, null);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public LifecycleCoroutineScopeImpl(@l AbstractC1450w lifecycle, @l g coroutineContext) {
        l0.p(lifecycle, "lifecycle");
        l0.p(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (lifecycle.getState() == AbstractC1450w.b.DESTROYED) {
            p2.i(coroutineContext, null, 1, null);
        }
    }

    @Override // androidx.view.AbstractC1453z
    @l
    /* renamed from: b, reason: from getter */
    public AbstractC1450w getLifecycle() {
        return this.lifecycle;
    }

    @Override // androidx.view.InterfaceC1416b0
    public void f(@l InterfaceC1423e0 source, @l AbstractC1450w.a event) {
        l0.p(source, "source");
        l0.p(event, "event");
        if (this.lifecycle.getState().compareTo(AbstractC1450w.b.DESTROYED) <= 0) {
            this.lifecycle.d(this);
            p2.i(this.coroutineContext, null, 1, null);
        }
    }

    public final void h() {
        k.f(this, j1.e().j1(), null, new a(null), 2, null);
    }

    @Override // kotlinx.coroutines.r0
    @l
    /* renamed from: q, reason: from getter */
    public g getCoroutineContext() {
        return this.coroutineContext;
    }
}
