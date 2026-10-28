package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: ContinuationImpl.kt */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* renamed from: kotlin.coroutines.jvm.internal.d, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private final CoroutineContext f23312p;

    /* renamed from: q, reason: collision with root package name */
    @d5.e
    private transient Continuation<Object> f23313q;

    public ContinuationImpl(@d5.e Continuation<Object> continuation, @d5.e CoroutineContext coroutineContext) {
        super(continuation);
        this.f23312p = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected void C() {
        Continuation<?> continuation = this.f23313q;
        if (continuation != null && continuation != this) {
            CoroutineContext.b b6 = getContext().b(ContinuationInterceptor.f23289d);
            l0.m(b6);
            ((ContinuationInterceptor) b6).o(continuation);
        }
        this.f23313q = CompletedContinuation.f23311o;
    }

    @d5.d
    public final Continuation<Object> L() {
        Continuation<Object> continuation = this.f23313q;
        if (continuation == null) {
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) getContext().b(ContinuationInterceptor.f23289d);
            if (continuationInterceptor == null || (continuation = continuationInterceptor.w(this)) == null) {
                continuation = this;
            }
            this.f23313q = continuation;
        }
        return continuation;
    }

    @Override // kotlin.coroutines.Continuation
    @d5.d
    /* renamed from: l */
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f23312p;
        l0.m(coroutineContext);
        return coroutineContext;
    }

    public ContinuationImpl(@d5.e Continuation<Object> continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}
