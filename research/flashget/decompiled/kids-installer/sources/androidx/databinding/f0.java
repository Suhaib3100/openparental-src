package androidx.databinding;

import android.view.RepeatOnLifecycleKt;
import android.view.t;
import androidx.annotation.c1;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;

/* compiled from: ViewDataBindingKtx.kt */
@c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0007R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/databinding/f0;", "", "Landroidx/databinding/ViewDataBinding;", "viewDataBinding", "", "localFieldId", "Lkotlinx/coroutines/flow/i;", "observable", "", "c", "Landroidx/databinding/j;", "b", "Landroidx/databinding/j;", "CREATE_STATE_FLOW_LISTENER", "<init>", "()V", "a", "databindingKtx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final f0 f6098a = new f0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final j CREATE_STATE_FLOW_LISTENER = new j() { // from class: androidx.databinding.e0
        @Override // androidx.databinding.j
        public final h0 a(ViewDataBinding viewDataBinding, int i5, ReferenceQueue referenceQueue) {
            h0 b6;
            b6 = f0.b(viewDataBinding, i5, referenceQueue);
            return b6;
        }
    };

    /* compiled from: ViewDataBindingKtx.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B'\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d¢\u0006\u0004\b\u001f\u0010 J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002J\u0016\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\tH\u0016J\u001a\u0010\f\u001a\u00020\u00072\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00072\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006!"}, d2 = {"Landroidx/databinding/f0$a;", "Landroidx/databinding/a0;", "Lkotlinx/coroutines/flow/i;", "", "Landroidx/lifecycle/a0;", "owner", "flow", "Lkotlin/m2;", "h", "Landroidx/databinding/h0;", "c", "target", "f", "g", "lifecycleOwner", "b", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "_lifecycleOwnerRef", "Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/n2;", "observerJob", "Landroidx/databinding/h0;", "listener", "Landroidx/databinding/ViewDataBinding;", "binder", "", "localFieldId", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "databindingKtx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements a0<kotlinx.coroutines.flow.i<? extends Object>> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private WeakReference<android.view.a0> _lifecycleOwnerRef;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private n2 observerJob;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final h0<kotlinx.coroutines.flow.i<Object>> listener;

        /* compiled from: ViewDataBindingKtx.kt */
        @DebugMetadata(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: androidx.databinding.f0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0067a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f6103s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ android.view.a0 f6104t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<Object> f6105u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ a f6106v;

            /* compiled from: ViewDataBindingKtx.kt */
            @DebugMetadata(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", f = "ViewDataBindingKtx.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* renamed from: androidx.databinding.f0$a$a$a, reason: collision with other inner class name */
            static final class C0068a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

                /* renamed from: s, reason: collision with root package name */
                int f6107s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.i<Object> f6108t;

                /* renamed from: u, reason: collision with root package name */
                final /* synthetic */ a f6109u;

                /* compiled from: Collect.kt */
                @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
                /* renamed from: androidx.databinding.f0$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0069a implements kotlinx.coroutines.flow.j<Object> {

                    /* renamed from: o, reason: collision with root package name */
                    final /* synthetic */ a f6110o;

                    public C0069a(a aVar) {
                        this.f6110o = aVar;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    @d5.e
                    public Object b(Object obj, @d5.d Continuation<? super m2> continuation) {
                        ViewDataBinding a6 = this.f6110o.listener.a();
                        if (a6 != null) {
                            a6.W(this.f6110o.listener.f6119b, this.f6110o.listener.b(), 0);
                        }
                        return m2.f23662a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0068a(kotlinx.coroutines.flow.i<? extends Object> iVar, a aVar, Continuation<? super C0068a> continuation) {
                    super(2, continuation);
                    this.f6108t = iVar;
                    this.f6109u = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.f6107s;
                    if (i5 == 0) {
                        a1.n(obj);
                        kotlinx.coroutines.flow.i<Object> iVar = this.f6108t;
                        C0069a c0069a = new C0069a(this.f6109u);
                        this.f6107s = 1;
                        if (iVar.a(c0069a, this) == coroutineSingletons) {
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
                @d5.e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
                    return ((C0068a) c(u0Var, continuation)).A(m2.f23662a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.d
                public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                    return new C0068a(this.f6108t, this.f6109u, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0067a(android.view.a0 a0Var, kotlinx.coroutines.flow.i<? extends Object> iVar, a aVar, Continuation<? super C0067a> continuation) {
                super(2, continuation);
                this.f6104t = a0Var;
                this.f6105u = iVar;
                this.f6106v = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f6103s;
                if (i5 == 0) {
                    a1.n(obj);
                    android.view.t lifecycle = this.f6104t.getLifecycle();
                    l0.o(lifecycle, "owner.lifecycle");
                    t.c cVar = t.c.STARTED;
                    C0068a c0068a = new C0068a(this.f6105u, this.f6106v, null);
                    this.f6103s = 1;
                    if (RepeatOnLifecycleKt.a(lifecycle, cVar, c0068a, this) == coroutineSingletons) {
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
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
                return ((C0067a) c(u0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                return new C0067a(this.f6104t, this.f6105u, this.f6106v, continuation);
            }
        }

        public a(@d5.e ViewDataBinding viewDataBinding, int i5, @d5.d ReferenceQueue<ViewDataBinding> referenceQueue) {
            l0.p(referenceQueue, "referenceQueue");
            this.listener = new h0<>(viewDataBinding, i5, this, referenceQueue);
        }

        private final void h(android.view.a0 a0Var, kotlinx.coroutines.flow.i<? extends Object> iVar) {
            n2 f6;
            n2 n2Var = this.observerJob;
            if (n2Var != null) {
                n2.a.b(n2Var, null, 1, null);
            }
            f6 = kotlinx.coroutines.l.f(android.view.b0.a(a0Var), null, null, new C0067a(a0Var, iVar, this, null), 3, null);
            this.observerJob = f6;
        }

        @Override // androidx.databinding.a0
        public void b(@d5.e android.view.a0 a0Var) {
            WeakReference<android.view.a0> weakReference = this._lifecycleOwnerRef;
            if ((weakReference != null ? weakReference.get() : null) == a0Var) {
                return;
            }
            n2 n2Var = this.observerJob;
            if (n2Var != null) {
                n2.a.b(n2Var, null, 1, null);
            }
            if (a0Var == null) {
                this._lifecycleOwnerRef = null;
                return;
            }
            this._lifecycleOwnerRef = new WeakReference<>(a0Var);
            kotlinx.coroutines.flow.i<? extends Object> iVar = (kotlinx.coroutines.flow.i) this.listener.b();
            if (iVar != null) {
                h(a0Var, iVar);
            }
        }

        @Override // androidx.databinding.a0
        @d5.d
        public h0<kotlinx.coroutines.flow.i<? extends Object>> c() {
            return this.listener;
        }

        @Override // androidx.databinding.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(@d5.e kotlinx.coroutines.flow.i<? extends Object> iVar) {
            android.view.a0 a0Var;
            WeakReference<android.view.a0> weakReference = this._lifecycleOwnerRef;
            if (weakReference == null || (a0Var = weakReference.get()) == null || iVar == null) {
                return;
            }
            h(a0Var, iVar);
        }

        @Override // androidx.databinding.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(@d5.e kotlinx.coroutines.flow.i<? extends Object> iVar) {
            n2 n2Var = this.observerJob;
            if (n2Var != null) {
                n2.a.b(n2Var, null, 1, null);
            }
            this.observerJob = null;
        }
    }

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(ViewDataBinding viewDataBinding, int i5, ReferenceQueue referenceQueue) {
        l0.o(referenceQueue, "referenceQueue");
        return new a(viewDataBinding, i5, referenceQueue).c();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @p3.n
    public static final boolean c(@d5.d ViewDataBinding viewDataBinding, int localFieldId, @d5.e kotlinx.coroutines.flow.i<?> observable) {
        l0.p(viewDataBinding, "viewDataBinding");
        viewDataBinding.E = true;
        try {
            return viewDataBinding.l1(localFieldId, observable, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.E = false;
        }
    }
}
