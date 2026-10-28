package androidx.view;

import androidx.view.AbstractC1450w;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.w0;
import kotlin.z0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.q;
import kotlinx.coroutines.v2;
import ld.a;
import ld.l;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: WithLifecycleState.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a-\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a5\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a-\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a5\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081Hø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0007\u001aC\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"R", "Landroidx/lifecycle/w;", "Landroidx/lifecycle/w$b;", "state", "Lkotlin/Function0;", "block", "n", "(Landroidx/lifecycle/w;Landroidx/lifecycle/w$b;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "(Landroidx/lifecycle/w;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "f", "Landroidx/lifecycle/e0;", "o", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$b;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "(Landroidx/lifecycle/e0;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "g", "r", "", "dispatchNeeded", "Lkotlinx/coroutines/m0;", "lifecycleDispatcher", "a", "(Landroidx/lifecycle/w;Landroidx/lifecycle/w$b;ZLkotlinx/coroutines/m0;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
/* loaded from: classes3.dex */
public final class WithLifecycleStateKt {

    /* compiled from: WithLifecycleState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/k2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f30221b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f30222c;

        a(AbstractC1450w abstractC1450w, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            this.f30221b = abstractC1450w;
            this.f30222c = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f30221b.a(this.f30222c);
        }
    }

    /* compiled from: WithLifecycleState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f30223b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f30224c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f30225d;

        /* compiled from: WithLifecycleState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/k2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC1450w f30226b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f30227c;

            a(AbstractC1450w abstractC1450w, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
                this.f30226b = abstractC1450w;
                this.f30227c = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f30226b.d(this.f30227c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var, AbstractC1450w abstractC1450w, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            super(1);
            this.f30223b = m0Var;
            this.f30224c = abstractC1450w;
            this.f30225d = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            m0 m0Var = this.f30223b;
            i iVar = i.f75057b;
            if (m0Var.c1(iVar)) {
                this.f30223b.S0(iVar, new a(this.f30224c, this.f30225d));
            } else {
                this.f30224c.d(this.f30225d);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: WithLifecycleState.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,206:1\n*E\n"})
    public static final class c<R> extends n0 implements ld.a<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<R> f30228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ld.a<? extends R> aVar) {
            super(0);
            this.f30228b = aVar;
        }

        @Override // ld.a
        public final R invoke() {
            return this.f30228b.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.d0] */
    @m
    @w0
    public static final <R> Object a(@fg.l final AbstractC1450w abstractC1450w, @fg.l final AbstractC1450w.b bVar, boolean z4, @fg.l m0 m0Var, @fg.l final ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        final q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        ?? r12 = new InterfaceC1416b0() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.view.InterfaceC1416b0
            public void f(@fg.l InterfaceC1423e0 source, @fg.l AbstractC1450w.a event) {
                Object a5;
                l0.p(source, "source");
                l0.p(event, "event");
                if (event != AbstractC1450w.a.INSTANCE.d(AbstractC1450w.b.this)) {
                    if (event == AbstractC1450w.a.ON_DESTROY) {
                        abstractC1450w.d(this);
                        d dVar2 = qVar;
                        z0.Companion companion = z0.INSTANCE;
                        dVar2.resumeWith(a1.a(new LifecycleDestroyedException()));
                        return;
                    }
                    return;
                }
                abstractC1450w.d(this);
                d dVar3 = qVar;
                a<R> aVar2 = aVar;
                try {
                    z0.Companion companion2 = z0.INSTANCE;
                    a5 = aVar2.invoke();
                } catch (Throwable th) {
                    z0.Companion companion3 = z0.INSTANCE;
                    a5 = a1.a(th);
                }
                dVar3.resumeWith(a5);
            }
        };
        if (z4) {
            m0Var.S0(i.f75057b, new a(abstractC1450w, r12));
        } else {
            abstractC1450w.a(r12);
        }
        qVar.k0(new b(m0Var, abstractC1450w, r12));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            h.c(dVar);
        }
        return y4;
    }

    @m
    public static final <R> Object b(@fg.l AbstractC1450w abstractC1450w, @fg.l ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        AbstractC1450w.b bVar = AbstractC1450w.b.CREATED;
        v2 j12 = j1.e().j1();
        boolean c12 = j12.c1(dVar.getF75269b());
        if (!c12) {
            if (abstractC1450w.getState() == AbstractC1450w.b.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (abstractC1450w.getState().compareTo(bVar) >= 0) {
                return aVar.invoke();
            }
        }
        return a(abstractC1450w, bVar, c12, j12, new c(aVar), dVar);
    }

    @m
    public static final <R> Object c(@fg.l InterfaceC1423e0 interfaceC1423e0, @fg.l ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        AbstractC1450w lifecycle = interfaceC1423e0.getLifecycle();
        AbstractC1450w.b bVar = AbstractC1450w.b.CREATED;
        v2 j12 = j1.e().j1();
        boolean c12 = j12.c1(dVar.getF75269b());
        if (!c12) {
            if (lifecycle.getState() == AbstractC1450w.b.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(bVar) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, bVar, c12, j12, new c(aVar), dVar);
    }

    private static final <R> Object d(AbstractC1450w abstractC1450w, ld.a<? extends R> aVar, d<? super R> dVar) {
        AbstractC1450w.b bVar = AbstractC1450w.b.CREATED;
        j1.e().j1();
        throw null;
    }

    private static final <R> Object e(InterfaceC1423e0 interfaceC1423e0, ld.a<? extends R> aVar, d<? super R> dVar) {
        interfaceC1423e0.getLifecycle();
        AbstractC1450w.b bVar = AbstractC1450w.b.CREATED;
        j1.e().j1();
        throw null;
    }

    @m
    public static final <R> Object f(@fg.l AbstractC1450w abstractC1450w, @fg.l ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        AbstractC1450w.b bVar = AbstractC1450w.b.RESUMED;
        v2 j12 = j1.e().j1();
        boolean c12 = j12.c1(dVar.getF75269b());
        if (!c12) {
            if (abstractC1450w.getState() == AbstractC1450w.b.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (abstractC1450w.getState().compareTo(bVar) >= 0) {
                return aVar.invoke();
            }
        }
        return a(abstractC1450w, bVar, c12, j12, new c(aVar), dVar);
    }

    @m
    public static final <R> Object g(@fg.l InterfaceC1423e0 interfaceC1423e0, @fg.l ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        AbstractC1450w lifecycle = interfaceC1423e0.getLifecycle();
        AbstractC1450w.b bVar = AbstractC1450w.b.RESUMED;
        v2 j12 = j1.e().j1();
        boolean c12 = j12.c1(dVar.getF75269b());
        if (!c12) {
            if (lifecycle.getState() == AbstractC1450w.b.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(bVar) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, bVar, c12, j12, new c(aVar), dVar);
    }

    private static final <R> Object h(AbstractC1450w abstractC1450w, ld.a<? extends R> aVar, d<? super R> dVar) {
        AbstractC1450w.b bVar = AbstractC1450w.b.RESUMED;
        j1.e().j1();
        throw null;
    }

    private static final <R> Object i(InterfaceC1423e0 interfaceC1423e0, ld.a<? extends R> aVar, d<? super R> dVar) {
        interfaceC1423e0.getLifecycle();
        AbstractC1450w.b bVar = AbstractC1450w.b.RESUMED;
        j1.e().j1();
        throw null;
    }

    @m
    public static final <R> Object j(@fg.l AbstractC1450w abstractC1450w, @fg.l ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        AbstractC1450w.b bVar = AbstractC1450w.b.STARTED;
        v2 j12 = j1.e().j1();
        boolean c12 = j12.c1(dVar.getF75269b());
        if (!c12) {
            if (abstractC1450w.getState() == AbstractC1450w.b.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (abstractC1450w.getState().compareTo(bVar) >= 0) {
                return aVar.invoke();
            }
        }
        return a(abstractC1450w, bVar, c12, j12, new c(aVar), dVar);
    }

    @m
    public static final <R> Object k(@fg.l InterfaceC1423e0 interfaceC1423e0, @fg.l ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        AbstractC1450w lifecycle = interfaceC1423e0.getLifecycle();
        AbstractC1450w.b bVar = AbstractC1450w.b.STARTED;
        v2 j12 = j1.e().j1();
        boolean c12 = j12.c1(dVar.getF75269b());
        if (!c12) {
            if (lifecycle.getState() == AbstractC1450w.b.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(bVar) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, bVar, c12, j12, new c(aVar), dVar);
    }

    private static final <R> Object l(AbstractC1450w abstractC1450w, ld.a<? extends R> aVar, d<? super R> dVar) {
        AbstractC1450w.b bVar = AbstractC1450w.b.STARTED;
        j1.e().j1();
        throw null;
    }

    private static final <R> Object m(InterfaceC1423e0 interfaceC1423e0, ld.a<? extends R> aVar, d<? super R> dVar) {
        interfaceC1423e0.getLifecycle();
        AbstractC1450w.b bVar = AbstractC1450w.b.STARTED;
        j1.e().j1();
        throw null;
    }

    @m
    public static final <R> Object n(@fg.l AbstractC1450w abstractC1450w, @fg.l AbstractC1450w.b bVar, @fg.l ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        if (bVar.compareTo(AbstractC1450w.b.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
        }
        v2 j12 = j1.e().j1();
        boolean c12 = j12.c1(dVar.getF75269b());
        if (!c12) {
            if (abstractC1450w.getState() == AbstractC1450w.b.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (abstractC1450w.getState().compareTo(bVar) >= 0) {
                return aVar.invoke();
            }
        }
        return a(abstractC1450w, bVar, c12, j12, new c(aVar), dVar);
    }

    @m
    public static final <R> Object o(@fg.l InterfaceC1423e0 interfaceC1423e0, @fg.l AbstractC1450w.b bVar, @fg.l ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        AbstractC1450w lifecycle = interfaceC1423e0.getLifecycle();
        if (bVar.compareTo(AbstractC1450w.b.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
        }
        v2 j12 = j1.e().j1();
        boolean c12 = j12.c1(dVar.getF75269b());
        if (!c12) {
            if (lifecycle.getState() == AbstractC1450w.b.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getState().compareTo(bVar) >= 0) {
                return aVar.invoke();
            }
        }
        return a(lifecycle, bVar, c12, j12, new c(aVar), dVar);
    }

    private static final <R> Object p(AbstractC1450w abstractC1450w, AbstractC1450w.b bVar, ld.a<? extends R> aVar, d<? super R> dVar) {
        if (bVar.compareTo(AbstractC1450w.b.CREATED) >= 0) {
            j1.e().j1();
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
    }

    private static final <R> Object q(InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.b bVar, ld.a<? extends R> aVar, d<? super R> dVar) {
        interfaceC1423e0.getLifecycle();
        if (bVar.compareTo(AbstractC1450w.b.CREATED) >= 0) {
            j1.e().j1();
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
    }

    @m
    @w0
    public static final <R> Object r(@fg.l AbstractC1450w abstractC1450w, @fg.l AbstractC1450w.b bVar, @fg.l ld.a<? extends R> aVar, @fg.l d<? super R> dVar) {
        v2 j12 = j1.e().j1();
        boolean c12 = j12.c1(dVar.getF75269b());
        if (!c12) {
            if (abstractC1450w.getState() == AbstractC1450w.b.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (abstractC1450w.getState().compareTo(bVar) >= 0) {
                return aVar.invoke();
            }
        }
        return a(abstractC1450w, bVar, c12, j12, new c(aVar), dVar);
    }

    @w0
    private static final <R> Object s(AbstractC1450w abstractC1450w, AbstractC1450w.b bVar, ld.a<? extends R> aVar, d<? super R> dVar) {
        j1.e().j1();
        throw null;
    }
}
