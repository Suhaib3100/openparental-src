package android.view;

import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import q3.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0013\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/l;", "Lkotlinx/coroutines/p1;", "Lkotlin/m2;", "c", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "Landroidx/lifecycle/LiveData;", "o", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/h0;", "p", "Landroidx/lifecycle/h0;", "mediator", "", "q", "Z", "disposed", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/h0;)V", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class l implements p1 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d
    private final LiveData<?> source;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d
    private final h0<?> mediator;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8597s;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f8597s != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            l.this.c();
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
            return l.this.new a(continuation);
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class b extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8599s;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f8599s != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            l.this.c();
            return m2.f23662a;
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d u0 u0Var, @e Continuation<? super m2> continuation) {
            return ((b) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            return l.this.new b(continuation);
        }
    }

    public l(@d LiveData<?> source, @d h0<?> mediator) {
        l0.p(source, "source");
        l0.p(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public final void c() {
        if (this.disposed) {
            return;
        }
        this.mediator.s(this.source);
        this.disposed = true;
    }

    @e
    public final Object b(@d Continuation<? super m2> continuation) {
        Object h5 = j.h(m1.e().J0(), new b(null), continuation);
        return h5 == CoroutineSingletons.COROUTINE_SUSPENDED ? h5 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.p1
    public void g() {
        kotlinx.coroutines.l.f(v0.a(m1.e().J0()), null, null, new a(null), 3, null);
    }
}
