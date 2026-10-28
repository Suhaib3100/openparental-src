package android.view;

import android.view.t;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.l;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.u0;
import q3.p;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/w;", "Lkotlin/m2;", "m", "Landroidx/lifecycle/a0;", "source", "Landroidx/lifecycle/t$b;", "event", "h", "Landroidx/lifecycle/t;", "o", "Landroidx/lifecycle/t;", "i", "()Landroidx/lifecycle/t;", "lifecycle", "Lkotlin/coroutines/g;", "p", "Lkotlin/coroutines/g;", "b0", "()Lkotlin/coroutines/g;", "coroutineContext", "<init>", "(Landroidx/lifecycle/t;Lkotlin/coroutines/g;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class LifecycleCoroutineScopeImpl extends u implements w {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d
    private final t lifecycle;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d
    private final CoroutineContext coroutineContext;

    /* compiled from: Lifecycle.kt */
    @DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8406s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f8407t;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f8406s != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            u0 u0Var = (u0) this.f8407t;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle().b().compareTo(t.c.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle().a(LifecycleCoroutineScopeImpl.this);
            } else {
                s2.i(u0Var.getCoroutineContext(), null, 1, null);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d u0 u0Var, @e Continuation<? super m2> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            a aVar = LifecycleCoroutineScopeImpl.this.new a(continuation);
            aVar.f8407t = obj;
            return aVar;
        }
    }

    public LifecycleCoroutineScopeImpl(@d t lifecycle, @d CoroutineContext coroutineContext) {
        l0.p(lifecycle, "lifecycle");
        l0.p(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (lifecycle.b() == t.c.DESTROYED) {
            s2.i(coroutineContext, null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.u0
    @d
    /* renamed from: b0, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // android.view.w
    public void h(@d a0 source, @d t.b event) {
        l0.p(source, "source");
        l0.p(event, "event");
        if (this.lifecycle.b().compareTo(t.c.DESTROYED) <= 0) {
            this.lifecycle.c(this);
            s2.i(this.coroutineContext, null, 1, null);
        }
    }

    @Override // android.view.u
    @d
    /* renamed from: i, reason: from getter */
    public t getLifecycle() {
        return this.lifecycle;
    }

    public final void m() {
        l.f(this, m1.e().J0(), null, new a(null), 2, null);
    }
}
