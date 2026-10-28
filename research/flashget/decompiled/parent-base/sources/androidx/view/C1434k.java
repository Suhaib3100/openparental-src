package androidx.view;

import androidx.annotation.x0;
import fg.m;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlin.v;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.r0;
import ld.l;
import ld.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a_\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a_\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018*`\b\u0000\u0010\u001a\u001a\u0004\b\u0000\u0010\u0000\")\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u00102)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "Landroidx/lifecycle/m0;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/o;", "a", "(Landroidx/lifecycle/m0;Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/k0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "b", "(Lkotlin/coroutines/g;JLld/p;)Landroidx/lifecycle/LiveData;", "Ljava/time/Duration;", "timeout", "c", "(Lkotlin/coroutines/g;Ljava/time/Duration;Lld/p;)Landroidx/lifecycle/LiveData;", "J", "DEFAULT_TIMEOUT", "Block", "lifecycle-livedata-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1434k {

    /* renamed from: a, reason: collision with root package name */
    public static final long f30360a = 5000;

    /* compiled from: CoroutineLiveData.kt */
    @f(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Landroidx/lifecycle/o;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/lifecycle/o;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.k$a */
    static final class a extends o implements p<r0, d<? super C1439o>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30361b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0<T> f30362c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f30363d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: CoroutineLiveData.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.k$a$a, reason: collision with other inner class name */
        static final class C0491a<T> extends n0 implements l<T, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0<T> f30364b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0491a(m0<T> m0Var) {
                super(1);
                this.f30364b = m0Var;
            }

            public final void a(T t4) {
                this.f30364b.r(t4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
                a(obj);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0<T> m0Var, LiveData<T> liveData, d<? super a> dVar) {
            super(2, dVar);
            this.f30362c = m0Var;
            this.f30363d = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final d<k2> create(@m Object obj, @fg.l d<?> dVar) {
            return new a(this.f30362c, this.f30363d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f30361b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            m0<T> m0Var = this.f30362c;
            m0Var.s(this.f30363d, new b(new C0491a(m0Var)));
            return new C1439o(this.f30363d, this.f30362c);
        }

        @Override // ld.p
        @m
        public final Object invoke(@fg.l r0 r0Var, @m d<? super C1439o> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.k$b */
    static final class b implements p0, d0 {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ l f30365b;

        b(l function) {
            l0.p(function, "function");
            this.f30365b = function;
        }

        @Override // kotlin.jvm.internal.d0
        @fg.l
        public final v<?> d() {
            return this.f30365b;
        }

        public final boolean equals(@m Object obj) {
            if ((obj instanceof p0) && (obj instanceof d0)) {
                return l0.g(this.f30365b, ((d0) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return this.f30365b.hashCode();
        }

        @Override // androidx.view.p0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30365b.invoke(obj);
        }
    }

    @m
    public static final <T> Object a(@fg.l m0<T> m0Var, @fg.l LiveData<T> liveData, @fg.l d<? super C1439o> dVar) {
        return i.h(j1.e().j1(), new a(m0Var, liveData, null), dVar);
    }

    @fg.l
    public static final <T> LiveData<T> b(@fg.l g context, long j4, @fg.l p<? super InterfaceC1435k0<T>, ? super d<? super k2>, ? extends Object> block) {
        l0.p(context, "context");
        l0.p(block, "block");
        return new C1432j(context, j4, block);
    }

    @fg.l
    @x0(26)
    public static final <T> LiveData<T> c(@fg.l g context, @fg.l Duration timeout, @fg.l p<? super InterfaceC1435k0<T>, ? super d<? super k2>, ? extends Object> block) {
        l0.p(context, "context");
        l0.p(timeout, "timeout");
        l0.p(block, "block");
        return new C1432j(context, C1417c.f30247a.a(timeout), block);
    }

    public static /* synthetic */ LiveData d(g gVar, long j4, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        if ((i4 & 2) != 0) {
            j4 = f30360a;
        }
        return b(gVar, j4, pVar);
    }

    public static /* synthetic */ LiveData e(g gVar, Duration duration, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        return c(gVar, duration, pVar);
    }
}
