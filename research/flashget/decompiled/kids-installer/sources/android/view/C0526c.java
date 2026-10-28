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
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;
import org.apache.log4j.net.SyslogAppender;
import q3.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012-\u0010\u0010\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0002\b\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR>\u0010\u0010\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0002\b\r8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/lifecycle/c;", "T", "", "Lkotlin/m2;", "h", "g", "Landroidx/lifecycle/g;", "a", "Landroidx/lifecycle/g;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/f0;", "Lkotlin/coroutines/d;", "Lkotlin/u;", "b", "Lq3/p;", "block", "", "c", "J", "timeoutInMs", "Lkotlinx/coroutines/u0;", "d", "Lkotlinx/coroutines/u0;", "scope", "Lkotlin/Function0;", "e", "Lq3/a;", "onDone", "Lkotlinx/coroutines/n2;", "f", "Lkotlinx/coroutines/n2;", "runningJob", "cancellationJob", "<init>", "(Landroidx/lifecycle/g;Lq3/p;JLkotlinx/coroutines/u0;Lq3/a;)V", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526c<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final C0530g<T> liveData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final p<f0<T>, Continuation<? super m2>, Object> block;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timeoutInMs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final u0 scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d
    private final q3.a<m2> onDone;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @e
    private n2 runningJob;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @e
    private n2 cancellationJob;

    /* compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.lifecycle.c$a */
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8496s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ C0526c<T> f8497t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C0526c<T> c0526c, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8497t = c0526c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f8496s;
            if (i5 == 0) {
                a1.n(obj);
                long j5 = ((C0526c) this.f8497t).timeoutInMs;
                this.f8496s = 1;
                if (f1.b(j5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            if (!((C0526c) this.f8497t).liveData.h()) {
                n2 n2Var = ((C0526c) this.f8497t).runningJob;
                if (n2Var != null) {
                    n2.a.b(n2Var, null, 1, null);
                }
                ((C0526c) this.f8497t).runningJob = null;
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
            return new a(this.f8497t, continuation);
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {SyslogAppender.LOG_LOCAL6}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.lifecycle.c$b */
    /* loaded from: classes4.dex */
    static final class b extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8498s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f8499t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ C0526c<T> f8500u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0526c<T> c0526c, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f8500u = c0526c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f8498s;
            if (i5 == 0) {
                a1.n(obj);
                g0 g0Var = new g0(((C0526c) this.f8500u).liveData, ((u0) this.f8499t).getCoroutineContext());
                p pVar = ((C0526c) this.f8500u).block;
                this.f8498s = 1;
                if (pVar.g0(g0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            ((C0526c) this.f8500u).onDone.n();
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
            b bVar = new b(this.f8500u, continuation);
            bVar.f8499t = obj;
            return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0526c(@d C0530g<T> liveData, @d p<? super f0<T>, ? super Continuation<? super m2>, ? extends Object> block, long j5, @d u0 scope, @d q3.a<m2> onDone) {
        l0.p(liveData, "liveData");
        l0.p(block, "block");
        l0.p(scope, "scope");
        l0.p(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j5;
        this.scope = scope;
        this.onDone = onDone;
    }

    @androidx.annotation.l0
    public final void g() {
        n2 f6;
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
        }
        f6 = l.f(this.scope, m1.e().J0(), null, new a(this, null), 2, null);
        this.cancellationJob = f6;
    }

    @androidx.annotation.l0
    public final void h() {
        n2 f6;
        n2 n2Var = this.cancellationJob;
        if (n2Var != null) {
            n2.a.b(n2Var, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        f6 = l.f(this.scope, null, null, new b(this, null), 3, null);
        this.runningJob = f6;
    }
}
