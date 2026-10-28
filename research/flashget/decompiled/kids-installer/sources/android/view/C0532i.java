package android.view;

import androidx.annotation.x0;
import d5.d;
import d5.e;
import java.time.Duration;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.u0;
import q3.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aa\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2/\b\u0001\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aa\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142/\b\u0001\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018*`\b\u0000\u0010\u001a\u001a\u0004\b\u0000\u0010\u0000\")\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u00102)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "Landroidx/lifecycle/h0;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/l;", "a", "(Landroidx/lifecycle/h0;Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/f0;", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "Lkotlin/u;", "block", "b", "(Lkotlin/coroutines/g;JLq3/p;)Landroidx/lifecycle/LiveData;", "Ljava/time/Duration;", "timeout", "c", "(Lkotlin/coroutines/g;Ljava/time/Duration;Lq3/p;)Landroidx/lifecycle/LiveData;", "J", "DEFAULT_TIMEOUT", "Block", "lifecycle-livedata-ktx_release"}, k = 2, mv = {1, 5, 1})
/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532i {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8582a = 5000;

    /* compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Landroidx/lifecycle/l;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.lifecycle.i$a */
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements p<u0, Continuation<? super l>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8583s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ h0<T> f8584t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f8585u;

        /* compiled from: CoroutineLiveData.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.lifecycle.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0096a<T> implements k0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0<T> f8586a;

            C0096a(h0<T> h0Var) {
                this.f8586a = h0Var;
            }

            @Override // android.view.k0
            public final void a(T t5) {
                this.f8586a.q(t5);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0<T> h0Var, LiveData<T> liveData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8584t = h0Var;
            this.f8585u = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f8583s != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            h0<T> h0Var = this.f8584t;
            h0Var.r(this.f8585u, new C0096a(h0Var));
            return new l(this.f8585u, this.f8584t);
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d u0 u0Var, @e Continuation<? super l> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            return new a(this.f8584t, this.f8585u, continuation);
        }
    }

    @e
    public static final <T> Object a(@d h0<T> h0Var, @d LiveData<T> liveData, @d Continuation<? super l> continuation) {
        return j.h(m1.e().J0(), new a(h0Var, liveData, null), continuation);
    }

    @d
    public static final <T> LiveData<T> b(@d CoroutineContext context, long j5, @BuilderInference @d p<? super f0<T>, ? super Continuation<? super m2>, ? extends Object> block) {
        l0.p(context, "context");
        l0.p(block, "block");
        return new C0530g(context, j5, block);
    }

    @x0(26)
    @d
    public static final <T> LiveData<T> c(@d CoroutineContext context, @d Duration timeout, @BuilderInference @d p<? super f0<T>, ? super Continuation<? super m2>, ? extends Object> block) {
        long millis;
        l0.p(context, "context");
        l0.p(timeout, "timeout");
        l0.p(block, "block");
        millis = timeout.toMillis();
        return new C0530g(context, millis, block);
    }

    public static /* synthetic */ LiveData d(CoroutineContext coroutineContext, long j5, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        if ((i5 & 2) != 0) {
            j5 = f8582a;
        }
        return b(coroutineContext, j5, pVar);
    }

    public static /* synthetic */ LiveData e(CoroutineContext coroutineContext, Duration duration, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        return c(coroutineContext, duration, pVar);
    }
}
