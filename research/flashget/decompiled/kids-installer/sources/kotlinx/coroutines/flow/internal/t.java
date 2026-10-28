package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.q2;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b1\u00102J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0018\u0010'\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lkotlinx/coroutines/flow/internal/t;", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "uCont", "value", "", "Z", "(Lkotlin/coroutines/d;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "currentContext", "previousContext", "R", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/l;", "exception", "j0", "Ljava/lang/StackTraceElement;", "I", "Lkotlin/z0;", "result", "A", "(Ljava/lang/Object;)Ljava/lang/Object;", "C", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "r", "Lkotlinx/coroutines/flow/j;", "collector", "s", "Lkotlin/coroutines/g;", "collectContext", "", "t", "collectContextSize", "u", "lastEmissionContext", "v", "Lkotlin/coroutines/d;", "completion", "i", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "l", "()Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class t<T> extends ContinuationImpl implements kotlinx.coroutines.flow.j<T>, CoroutineStackFrame {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final kotlinx.coroutines.flow.j<T> collector;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final CoroutineContext collectContext;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final int collectContextSize;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private CoroutineContext lastEmissionContext;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private Continuation<? super m2> completion;

    /* compiled from: SafeCollector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "count", "Lkotlin/coroutines/g$b;", "<anonymous parameter 1>", "a", "(ILkotlin/coroutines/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements q3.p<Integer, CoroutineContext.b, Integer> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f28123p = new a();

        a() {
            super(2);
        }

        @d5.d
        public final Integer a(int i5, @d5.d CoroutineContext.b bVar) {
            return Integer.valueOf(i5 + 1);
        }

        @Override // q3.p
        public /* bridge */ /* synthetic */ Integer g0(Integer num, CoroutineContext.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d CoroutineContext coroutineContext) {
        super(q.f28112o, EmptyCoroutineContext.f23294o);
        this.collector = jVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.n(0, a.f28123p)).intValue();
    }

    private final void R(CoroutineContext currentContext, CoroutineContext previousContext, T value) {
        if (previousContext instanceof l) {
            j0((l) previousContext, value);
        }
        v.a(this, currentContext);
    }

    private final Object Z(Continuation<? super m2> uCont, T value) {
        q3.q qVar;
        CoroutineContext context = uCont.getContext();
        q2.z(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            R(context, coroutineContext, value);
            this.lastEmissionContext = context;
        }
        this.completion = uCont;
        qVar = u.f28124a;
        Object G = qVar.G(this.collector, value, this);
        if (!l0.g(G, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion = null;
        }
        return G;
    }

    private final void j0(l lVar, Object obj) {
        String p5;
        p5 = kotlin.text.x.p(ProtectedSandApp.s("鄃") + lVar.e + ProtectedSandApp.s("鄄") + obj + ProtectedSandApp.s("鄅"));
        throw new IllegalStateException(p5.toString());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @d5.d
    public Object A(@d5.d Object result) {
        Throwable e6 = Result.e(result);
        if (e6 != null) {
            this.lastEmissionContext = new l(e6, getContext());
        }
        Continuation<? super m2> continuation = this.completion;
        if (continuation != null) {
            continuation.s(result);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void C() {
        super.C();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: I */
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.j
    @d5.e
    public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
        try {
            Object Z = Z(continuation, t5);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (Z == coroutineSingletons) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return Z == coroutineSingletons ? Z : m2.f23662a;
        } catch (Throwable th) {
            this.lastEmissionContext = new l(th, continuation.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: i */
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super m2> continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    @d5.d
    /* renamed from: l */
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.f23294o : coroutineContext;
    }
}
