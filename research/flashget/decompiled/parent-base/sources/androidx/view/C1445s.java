package androidx.view;

import androidx.annotation.x0;
import androidx.arch.core.executor.c;
import androidx.room.j2;
import fg.l;
import fg.m;
import java.time.Duration;
import kd.i;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.channels.z;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.v2;
import ld.p;

/* compiled from: FlowLiveData.kt */
@i(name = "FlowLiveDataConversions")
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "d", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;J)Landroidx/lifecycle/LiveData;", "a", "(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/i;", "Ljava/time/Duration;", "timeout", "e", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;Ljava/time/Duration;)Landroidx/lifecycle/LiveData;", "lifecycle-livedata-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1445s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowLiveData.kt */
    @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0}, l = {110, 114}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.s$a */
    static final class a<T> extends o implements p<b0<? super T>, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f30421b;

        /* renamed from: c, reason: collision with root package name */
        int f30422c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f30423d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f30424e;

        /* compiled from: FlowLiveData.kt */
        @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.s$a$a, reason: collision with other inner class name */
        static final class C0499a extends o implements p<r0, d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f30425b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LiveData<T> f30426c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p0<T> f30427d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0499a(LiveData<T> liveData, p0<T> p0Var, d<? super C0499a> dVar) {
                super(2, dVar);
                this.f30426c = liveData;
                this.f30427d = p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<k2> create(@m Object obj, @l d<?> dVar) {
                return new C0499a(this.f30426c, this.f30427d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f30425b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
                this.f30426c.l(this.f30427d);
                return k2.f75408a;
            }

            @Override // ld.p
            @m
            public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
                return ((C0499a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: FlowLiveData.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.s$a$b */
        static final class b extends n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LiveData<T> f30428b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ p0<T> f30429c;

            /* compiled from: FlowLiveData.kt */
            @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.s$a$b$a, reason: collision with other inner class name */
            static final class C0500a extends o implements p<r0, d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f30430b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LiveData<T> f30431c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ p0<T> f30432d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0500a(LiveData<T> liveData, p0<T> p0Var, d<? super C0500a> dVar) {
                    super(2, dVar);
                    this.f30431c = liveData;
                    this.f30432d = p0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final d<k2> create(@m Object obj, @l d<?> dVar) {
                    return new C0500a(this.f30431c, this.f30432d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    if (this.f30430b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                    this.f30431c.p(this.f30432d);
                    return k2.f75408a;
                }

                @Override // ld.p
                @m
                public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
                    return ((C0500a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(LiveData<T> liveData, p0<T> p0Var) {
                super(0);
                this.f30428b = liveData;
                this.f30429c = p0Var;
            }

            public final void a() {
                k.f(b2.f79269b, j1.e().j1(), null, new C0500a(this.f30428b, this.f30429c, null), 2, null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LiveData<T> liveData, d<? super a> dVar) {
            super(2, dVar);
            this.f30424e = liveData;
        }

        public static void a(b0 b0Var, Object obj) {
            b0Var.M(obj);
        }

        private static final void m(b0 b0Var, Object obj) {
            b0Var.M(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            a aVar = new a(this.f30424e, dVar);
            aVar.f30423d = obj;
            return aVar;
        }

        @Override // ld.p
        @m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l b0<? super T> b0Var, @m d<? super k2> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            p0 p0Var;
            b0 b0Var;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f30422c;
            if (i4 == 0) {
                a1.n(obj);
                final b0 b0Var2 = (b0) this.f30423d;
                p0Var = new p0() { // from class: androidx.lifecycle.r
                    @Override // androidx.view.p0
                    public final void onChanged(Object obj2) {
                        b0.this.M(obj2);
                    }
                };
                v2 j12 = j1.e().j1();
                C0499a c0499a = new C0499a(this.f30424e, p0Var, null);
                this.f30423d = b0Var2;
                this.f30421b = p0Var;
                this.f30422c = 1;
                if (kotlinx.coroutines.i.h(j12, c0499a, this) == aVar) {
                    return aVar;
                }
                b0Var = b0Var2;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                    return k2.f75408a;
                }
                p0Var = (p0) this.f30421b;
                b0Var = (b0) this.f30423d;
                a1.n(obj);
            }
            b bVar = new b(this.f30424e, p0Var);
            this.f30423d = null;
            this.f30421b = null;
            this.f30422c = 2;
            if (z.a(b0Var, bVar, this) == aVar) {
                return aVar;
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowLiveData.kt */
    @f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/lifecycle/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/lifecycle/k0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.s$b */
    static final class b<T> extends o implements p<InterfaceC1435k0<T>, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30433b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f30434c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f30435d;

        /* compiled from: FlowLiveData.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.s$b$a */
        static final class a<T> implements j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1435k0<T> f30436b;

            a(InterfaceC1435k0<T> interfaceC1435k0) {
                this.f30436b = interfaceC1435k0;
            }

            @Override // kotlinx.coroutines.flow.j
            @m
            public final Object emit(T t4, @l d<? super k2> dVar) {
                Object emit = this.f30436b.emit(t4, dVar);
                return emit == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? emit : k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.flow.i<? extends T> iVar, d<? super b> dVar) {
            super(2, dVar);
            this.f30435d = iVar;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l InterfaceC1435k0<T> interfaceC1435k0, @m d<? super k2> dVar) {
            return ((b) create(interfaceC1435k0, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            b bVar = new b(this.f30435d, dVar);
            bVar.f30434c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f30433b;
            if (i4 == 0) {
                a1.n(obj);
                InterfaceC1435k0 interfaceC1435k0 = (InterfaceC1435k0) this.f30434c;
                kotlinx.coroutines.flow.i<T> iVar = this.f30435d;
                a aVar2 = new a(interfaceC1435k0);
                this.f30433b = 1;
                if (iVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    @l
    public static final <T> kotlinx.coroutines.flow.i<T> a(@l LiveData<T> liveData) {
        l0.p(liveData, "<this>");
        return kotlinx.coroutines.flow.k.W(kotlinx.coroutines.flow.k.s(new a(liveData, null)));
    }

    @l
    @kd.j
    public static final <T> LiveData<T> b(@l kotlinx.coroutines.flow.i<? extends T> iVar) {
        l0.p(iVar, "<this>");
        return f(iVar, null, 0L, 3, null);
    }

    @l
    @kd.j
    public static final <T> LiveData<T> c(@l kotlinx.coroutines.flow.i<? extends T> iVar, @l g context) {
        l0.p(iVar, "<this>");
        l0.p(context, "context");
        return f(iVar, context, 0L, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    @kd.j
    public static final <T> LiveData<T> d(@l kotlinx.coroutines.flow.i<? extends T> iVar, @l g context, long j4) {
        l0.p(iVar, "<this>");
        l0.p(context, "context");
        j2 j2Var = (LiveData<T>) C1434k.b(context, j4, new b(iVar, null));
        if (iVar instanceof t0) {
            if (c.h().c()) {
                j2Var.r(((t0) iVar).getValue());
            } else {
                j2Var.o(((t0) iVar).getValue());
            }
        }
        return j2Var;
    }

    @l
    @x0(26)
    public static final <T> LiveData<T> e(@l kotlinx.coroutines.flow.i<? extends T> iVar, @l g context, @l Duration timeout) {
        l0.p(iVar, "<this>");
        l0.p(context, "context");
        l0.p(timeout, "timeout");
        return d(iVar, context, C1417c.f30247a.a(timeout));
    }

    public static /* synthetic */ LiveData f(kotlinx.coroutines.flow.i iVar, g gVar, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        if ((i4 & 2) != 0) {
            j4 = C1434k.f30360a;
        }
        return d(iVar, gVar, j4);
    }

    public static /* synthetic */ LiveData g(kotlinx.coroutines.flow.i iVar, g gVar, Duration duration, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        return e(iVar, gVar, duration);
    }
}
