package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.sidecar.b0;
import androidx.window.sidecar.q;
import androidx.window.sidecar.x;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.y1;
import ld.p;

/* compiled from: FoldingFeatureObserver.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006!"}, d2 = {"Landroidx/slidingpanelayout/widget/a;", "", "Landroidx/window/layout/x;", "windowInfoTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroidx/window/layout/x;Ljava/util/concurrent/Executor;)V", "Landroidx/window/layout/b0;", "windowLayoutInfo", "Landroidx/window/layout/q;", "d", "(Landroidx/window/layout/b0;)Landroidx/window/layout/q;", "Landroidx/slidingpanelayout/widget/a$a;", "onFoldingFeatureChangeListener", "Lkotlin/k2;", "f", "(Landroidx/slidingpanelayout/widget/a$a;)V", "Landroid/app/Activity;", "activity", "e", "(Landroid/app/Activity;)V", "g", "()V", "a", "Landroidx/window/layout/x;", "b", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/k2;", "c", "Lkotlinx/coroutines/k2;", "job", "Landroidx/slidingpanelayout/widget/a$a;", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final x windowInfoTracker;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Executor executor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private k2 job;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private InterfaceC0618a onFoldingFeatureChangeListener;

    /* compiled from: FoldingFeatureObserver.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/slidingpanelayout/widget/a$a;", "", "Landroidx/window/layout/q;", "foldingFeature", "Lkotlin/k2;", "a", "(Landroidx/window/layout/q;)V", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.slidingpanelayout.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0618a {
        void a(@l q foldingFeature);
    }

    /* compiled from: FoldingFeatureObserver.kt */
    @f(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 6, 0})
    static final class b extends o implements p<r0, d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f34065b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f34067d;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: androidx.slidingpanelayout.widget.a$b$a, reason: collision with other inner class name */
        public static final class C0619a implements j<q> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f34068b;

            public C0619a(a aVar) {
                this.f34068b = aVar;
            }

            @Override // kotlinx.coroutines.flow.j
            @m
            public Object emit(q qVar, @l d<? super kotlin.k2> dVar) {
                kotlin.k2 k2Var;
                q qVar2 = qVar;
                InterfaceC0618a interfaceC0618a = this.f34068b.onFoldingFeatureChangeListener;
                if (interfaceC0618a == null) {
                    k2Var = null;
                } else {
                    interfaceC0618a.a(qVar2);
                    k2Var = kotlin.k2.f75408a;
                }
                return k2Var == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? k2Var : kotlin.k2.f75408a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: androidx.slidingpanelayout.widget.a$b$b, reason: collision with other inner class name */
        public static final class C0620b implements i<q> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f34069b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f34070c;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$g$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
            /* renamed from: androidx.slidingpanelayout.widget.a$b$b$a, reason: collision with other inner class name */
            public static final class C0621a implements j<b0> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j f34071b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f34072c;

                @f(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: androidx.slidingpanelayout.widget.a$b$b$a$a, reason: collision with other inner class name */
                public static final class C0622a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f34073b;

                    /* renamed from: c, reason: collision with root package name */
                    int f34074c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f34075d;

                    public C0622a(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object obj) {
                        this.f34073b = obj;
                        this.f34074c |= Integer.MIN_VALUE;
                        return C0621a.this.emit(null, this);
                    }
                }

                public C0621a(j jVar, a aVar) {
                    this.f34071b = jVar;
                    this.f34072c = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(androidx.window.sidecar.b0 r5, @fg.l kotlin.coroutines.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.slidingpanelayout.widget.a.b.C0620b.C0621a.C0622a
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.slidingpanelayout.widget.a$b$b$a$a r0 = (androidx.slidingpanelayout.widget.a.b.C0620b.C0621a.C0622a) r0
                        int r1 = r0.f34074c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f34074c = r1
                        goto L18
                    L13:
                        androidx.slidingpanelayout.widget.a$b$b$a$a r0 = new androidx.slidingpanelayout.widget.a$b$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f34073b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f34074c
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r6)
                        goto L48
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.a1.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f34071b
                        androidx.window.layout.b0 r5 = (androidx.window.sidecar.b0) r5
                        androidx.slidingpanelayout.widget.a r2 = r4.f34072c
                        androidx.window.layout.q r5 = androidx.slidingpanelayout.widget.a.a(r2, r5)
                        if (r5 != 0) goto L3f
                        goto L48
                    L3f:
                        r0.f34074c = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.k2 r5 = kotlin.k2.f75408a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.a.b.C0620b.C0621a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            public C0620b(i iVar, a aVar) {
                this.f34069b = iVar;
                this.f34070c = aVar;
            }

            @Override // kotlinx.coroutines.flow.i
            @m
            public Object a(@l j<? super q> jVar, @l d dVar) {
                Object a5 = this.f34069b.a(new C0621a(jVar, this.f34070c), dVar);
                return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, d<? super b> dVar) {
            super(2, dVar);
            this.f34067d = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<kotlin.k2> create(@m Object obj, @l d<?> dVar) {
            return a.this.new b(this.f34067d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f34065b;
            if (i4 == 0) {
                a1.n(obj);
                i g02 = k.g0(new C0620b(a.this.windowInfoTracker.c(this.f34067d), a.this));
                C0619a c0619a = new C0619a(a.this);
                this.f34065b = 1;
                if (g02.a(c0619a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public a(@l x windowInfoTracker, @l Executor executor) {
        l0.p(windowInfoTracker, "windowInfoTracker");
        l0.p(executor, "executor");
        this.windowInfoTracker = windowInfoTracker;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q d(b0 windowLayoutInfo) {
        Object obj;
        Iterator<T> it = windowLayoutInfo.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((androidx.window.sidecar.l) obj) instanceof q) {
                break;
            }
        }
        if (obj instanceof q) {
            return (q) obj;
        }
        return null;
    }

    public final void e(@l Activity activity) {
        k2 f4;
        l0.p(activity, "activity");
        k2 k2Var = this.job;
        if (k2Var != null) {
            k2.a.b(k2Var, null, 1, null);
        }
        f4 = kotlinx.coroutines.k.f(s0.a(y1.c(this.executor)), null, null, new b(activity, null), 3, null);
        this.job = f4;
    }

    public final void f(@l InterfaceC0618a onFoldingFeatureChangeListener) {
        l0.p(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.onFoldingFeatureChangeListener = onFoldingFeatureChangeListener;
    }

    public final void g() {
        k2 k2Var = this.job;
        if (k2Var == null) {
            return;
        }
        k2.a.b(k2Var, null, 1, null);
    }
}
