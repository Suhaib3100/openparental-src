package androidx.view;

import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import ld.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/o;", "Lkotlinx/coroutines/m1;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/m0;", "mediator", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/m0;)V", "Lkotlin/k2;", "d", "()V", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "dispose", "b", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/m0;", "", "Z", "disposed", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1439o implements m1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final LiveData<?> source;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final m0<?> mediator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* compiled from: CoroutineLiveData.kt */
    @f(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.o$a */
    static final class a extends o implements p<r0, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30404b;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            return C1439o.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f30404b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            C1439o.this.d();
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @f(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.o$b */
    static final class b extends o implements p<r0, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30406b;

        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            return C1439o.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f30406b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            C1439o.this.d();
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public C1439o(@l LiveData<?> source, @l m0<?> mediator) {
        l0.p(source, "source");
        l0.p(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public final void d() {
        if (this.disposed) {
            return;
        }
        this.mediator.t(this.source);
        this.disposed = true;
    }

    @m
    public final Object c(@l d<? super k2> dVar) {
        Object h4 = i.h(j1.e().j1(), new b(null), dVar);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : k2.f75408a;
    }

    @Override // kotlinx.coroutines.m1
    public void dispose() {
        k.f(s0.a(j1.e().j1()), null, null, new a(null), 3, null);
    }
}
