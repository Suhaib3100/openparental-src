package androidx.view;

import com.luck.picture.lib.config.PictureConfig;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0002\b\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R>\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0002\b\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/lifecycle/d;", "T", "", "Landroidx/lifecycle/j;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/k0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "Lkotlin/u;", "block", "", "timeoutInMs", "Lkotlinx/coroutines/r0;", "scope", "Lkotlin/Function0;", "onDone", "<init>", "(Landroidx/lifecycle/j;Lld/p;JLkotlinx/coroutines/r0;Lld/a;)V", "h", "()V", "g", "a", "Landroidx/lifecycle/j;", "b", "Lld/p;", "c", "J", "d", "Lkotlinx/coroutines/r0;", "e", "Lld/a;", "Lkotlinx/coroutines/k2;", "f", "Lkotlinx/coroutines/k2;", "runningJob", "cancellationJob", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1420d<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final C1432j<T> liveData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final p<InterfaceC1435k0<T>, d<? super k2>, Object> block;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timeoutInMs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final r0 scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.a<k2> onDone;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private kotlinx.coroutines.k2 runningJob;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private kotlinx.coroutines.k2 cancellationJob;

    /* compiled from: CoroutineLiveData.kt */
    @f(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {PictureConfig.CHOOSE_REQUEST}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.d$a */
    static final class a extends o implements p<r0, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30275b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1420d<T> f30276c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1420d<T> c1420d, d<? super a> dVar) {
            super(2, dVar);
            this.f30276c = c1420d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            return new a(this.f30276c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f30275b;
            if (i4 == 0) {
                a1.n(obj);
                long j4 = ((C1420d) this.f30276c).timeoutInMs;
                this.f30275b = 1;
                if (c1.b(j4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            if (!((C1420d) this.f30276c).liveData.h()) {
                kotlinx.coroutines.k2 k2Var = ((C1420d) this.f30276c).runningJob;
                if (k2Var != null) {
                    k2.a.b(k2Var, null, 1, null);
                }
                ((C1420d) this.f30276c).runningJob = null;
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @f(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.d$b */
    static final class b extends o implements p<r0, d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30277b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f30278c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1420d<T> f30279d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1420d<T> c1420d, d<? super b> dVar) {
            super(2, dVar);
            this.f30279d = c1420d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<kotlin.k2> create(@m Object obj, @l d<?> dVar) {
            b bVar = new b(this.f30279d, dVar);
            bVar.f30278c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f30277b;
            if (i4 == 0) {
                a1.n(obj);
                l0 l0Var = new l0(((C1420d) this.f30279d).liveData, ((r0) this.f30278c).getCoroutineContext());
                p pVar = ((C1420d) this.f30279d).block;
                this.f30277b = 1;
                if (pVar.invoke(l0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            ((C1420d) this.f30279d).onDone.invoke();
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1420d(@l C1432j<T> liveData, @l p<? super InterfaceC1435k0<T>, ? super d<? super kotlin.k2>, ? extends Object> block, long j4, @l r0 scope, @l ld.a<kotlin.k2> onDone) {
        l0.p(liveData, "liveData");
        l0.p(block, "block");
        l0.p(scope, "scope");
        l0.p(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j4;
        this.scope = scope;
        this.onDone = onDone;
    }

    @androidx.annotation.l0
    public final void g() {
        kotlinx.coroutines.k2 f4;
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        f4 = k.f(this.scope, j1.e().j1(), null, new a(this, null), 2, null);
        this.cancellationJob = f4;
    }

    @androidx.annotation.l0
    public final void h() {
        kotlinx.coroutines.k2 f4;
        kotlinx.coroutines.k2 k2Var = this.cancellationJob;
        if (k2Var != null) {
            k2.a.b(k2Var, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        f4 = k.f(this.scope, null, null, new b(this, null), 3, null);
        this.runningJob = f4;
    }
}
