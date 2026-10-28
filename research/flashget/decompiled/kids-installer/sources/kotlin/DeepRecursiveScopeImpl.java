package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DeepRecursive.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004BH\u00129\u0010\u0005\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\b\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0016\u0010\u0015\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0016J`\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000429\u0010\u0018\u001a5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0002¢\u0006\u0002\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0002\u0010\u001cJ\u000b\u0010\u001d\u001a\u00028\u0001¢\u0006\u0002\u0010\u001eJ2\u0010\u0015\u001a\u0002H\u001f\"\u0004\b\u0002\u0010 \"\u0004\b\u0003\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H\u001f0!2\u0006\u0010\t\u001a\u0002H H\u0096@¢\u0006\u0002\u0010\"R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fRC\u0010\u0010\u001a5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u001b\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0013X\u0082\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006#"}, d2 = {"Lkotlin/DeepRecursiveScopeImpl;", "T", "R", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function3;", "", "Lkotlin/ExtensionFunctionType;", "value", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)V", "cont", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "function", "Lkotlin/jvm/functions/Function3;", "result", "Lkotlin/Result;", "Ljava/lang/Object;", "callRecursive", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crossFunctionCompletion", "currentFunction", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "resumeWith", "", "(Ljava/lang/Object;)V", "runCallLoop", "()Ljava/lang/Object;", "S", "U", "Lkotlin/DeepRecursiveFunction;", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.j, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class DeepRecursiveScopeImpl<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private q3.q<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> f23504o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private Object f23505p;

    /* renamed from: q, reason: collision with root package name */
    @d5.e
    private Continuation<Object> f23506q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private Object f23507r;

    /* compiled from: Continuation.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b¸\u0006\u0000"}, d2 = {"kotlin/coroutines/ContinuationKt$Continuation$1", "Lkotlin/coroutines/Continuation;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,161:1\n182#2,6:162\n*E\n"})
    /* renamed from: kotlin.j$a */
    public static final class a implements Continuation<Object> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f23508o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ DeepRecursiveScopeImpl f23509p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ q3.q f23510q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Continuation f23511r;

        public a(CoroutineContext coroutineContext, DeepRecursiveScopeImpl deepRecursiveScopeImpl, q3.q qVar, Continuation continuation) {
            this.f23508o = coroutineContext;
            this.f23509p = deepRecursiveScopeImpl;
            this.f23510q = qVar;
            this.f23511r = continuation;
        }

        @Override // kotlin.coroutines.Continuation
        @d5.d
        /* renamed from: l, reason: from getter */
        public CoroutineContext getF23508o() {
            return this.f23508o;
        }

        @Override // kotlin.coroutines.Continuation
        public void s(@d5.d Object obj) {
            this.f23509p.f23504o = this.f23510q;
            this.f23509p.f23506q = this.f23511r;
            this.f23509p.f23507r = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeepRecursiveScopeImpl(@d5.d q3.q<? super DeepRecursiveScope<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> qVar, T t5) {
        super(null);
        Object obj;
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("䅊"));
        this.f23504o = qVar;
        this.f23505p = t5;
        kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("䅋"));
        this.f23506q = this;
        obj = h.f23337a;
        this.f23507r = obj;
    }

    private final Continuation<Object> i(q3.q<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> qVar, Continuation<Object> continuation) {
        return new a(EmptyCoroutineContext.f23294o, this, qVar, continuation);
    }

    @Override // kotlin.DeepRecursiveScope
    @d5.e
    public Object b(T t5, @d5.d Continuation<? super R> continuation) {
        kotlin.jvm.internal.l0.n(continuation, ProtectedSandApp.s("䅌"));
        this.f23506q = continuation;
        this.f23505p = t5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.coroutines.jvm.internal.h.c(continuation);
        return coroutineSingletons;
    }

    @Override // kotlin.DeepRecursiveScope
    @d5.e
    public <U, S> Object c(@d5.d DeepRecursiveFunction<U, S> deepRecursiveFunction, U u5, @d5.d Continuation<? super S> continuation) {
        q3.q<DeepRecursiveScope<U, S>, U, Continuation<? super S>, Object> a6 = deepRecursiveFunction.a();
        kotlin.jvm.internal.l0.n(a6, ProtectedSandApp.s("䅍"));
        q3.q<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> qVar = this.f23504o;
        String s5 = ProtectedSandApp.s("䅎");
        if (a6 != qVar) {
            this.f23504o = a6;
            kotlin.jvm.internal.l0.n(continuation, s5);
            this.f23506q = i(qVar, continuation);
        } else {
            kotlin.jvm.internal.l0.n(continuation, s5);
            this.f23506q = continuation;
        }
        this.f23505p = u5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.coroutines.jvm.internal.h.c(continuation);
        return coroutineSingletons;
    }

    public final R j() {
        Object obj;
        Object obj2;
        while (true) {
            R r5 = (R) this.f23507r;
            Continuation<Object> continuation = this.f23506q;
            if (continuation == null) {
                a1.n(r5);
                return r5;
            }
            obj = h.f23337a;
            if (Result.d(obj, r5)) {
                try {
                    q3.q<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> qVar = this.f23504o;
                    Object obj3 = this.f23505p;
                    Object k5 = !(qVar instanceof BaseContinuationImpl) ? kotlin.coroutines.intrinsics.c.k(qVar, this, obj3, continuation) : ((q3.q) kotlin.jvm.internal.u1.q(qVar, 3)).G(this, obj3, continuation);
                    if (k5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        Result.a aVar = Result.f27242p;
                        continuation.s(k5);
                    }
                } catch (Throwable th) {
                    Result.a aVar2 = Result.f27242p;
                    continuation.s(a1.a(th));
                }
            } else {
                obj2 = h.f23337a;
                this.f23507r = obj2;
                continuation.s(r5);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    @d5.d
    /* renamed from: l */
    public CoroutineContext getF23508o() {
        return EmptyCoroutineContext.f23294o;
    }

    @Override // kotlin.coroutines.Continuation
    public void s(@d5.d Object obj) {
        this.f23506q = null;
        this.f23507r = obj;
    }
}
