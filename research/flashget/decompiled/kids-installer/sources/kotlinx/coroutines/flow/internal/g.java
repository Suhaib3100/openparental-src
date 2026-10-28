package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.channels.e0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/internal/g;", "S", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/coroutines/g;", "newContext", "Lkotlin/m2;", "s", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "u", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/e0;", "scope", "h", "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "", "toString", "Lkotlinx/coroutines/flow/i;", "r", "Lkotlinx/coroutines/flow/i;", "flow", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class g<S, T> extends d<T> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    protected final kotlinx.coroutines.flow.i<S> flow;

    /* compiled from: ChannelFlow.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {SyslogAppender.LOG_LOCAL3}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    static final class a extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super T>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28022s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28023t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ g<S, T> f28024u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<S, T> gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28024u = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28022s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j<? super T> jVar = (kotlinx.coroutines.flow.j) this.f28023t;
                g<S, T> gVar = this.f28024u;
                this.f28022s = 1;
                if (gVar.u(jVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郷"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = new a(this.f28024u, continuation);
            aVar.f28023t = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@d5.d kotlinx.coroutines.flow.i<? extends S> iVar, @d5.d CoroutineContext coroutineContext, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        super(coroutineContext, i5, mVar);
        this.flow = iVar;
    }

    static Object q(g gVar, kotlinx.coroutines.flow.j jVar, Continuation continuation) {
        if (gVar.capacity == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext B = context.B(gVar.context);
            if (l0.g(B, context)) {
                Object u5 = gVar.u(jVar, continuation);
                return u5 == CoroutineSingletons.COROUTINE_SUSPENDED ? u5 : m2.f23662a;
            }
            ContinuationInterceptor.b bVar = ContinuationInterceptor.f23289d;
            if (l0.g(B.b(bVar), context.b(bVar))) {
                Object s5 = gVar.s(jVar, B, continuation);
                return s5 == CoroutineSingletons.COROUTINE_SUSPENDED ? s5 : m2.f23662a;
            }
        }
        Object f6 = d.f(gVar, jVar, continuation);
        return f6 == CoroutineSingletons.COROUTINE_SUSPENDED ? f6 : m2.f23662a;
    }

    static Object r(g gVar, e0 e0Var, Continuation continuation) {
        Object u5 = gVar.u(new w(e0Var), continuation);
        return u5 == CoroutineSingletons.COROUTINE_SUSPENDED ? u5 : m2.f23662a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(kotlinx.coroutines.flow.j<? super T> jVar, CoroutineContext coroutineContext, Continuation<? super m2> continuation) {
        kotlinx.coroutines.flow.j e6;
        e6 = e.e(jVar, continuation.getContext());
        Object d6 = e.d(coroutineContext, e6, null, new a(this, null), continuation, 4, null);
        return d6 == CoroutineSingletons.COROUTINE_SUSPENDED ? d6 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.i
    @d5.e
    public Object a(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
        return q(this, jVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.e
    protected Object h(@d5.d e0<? super T> e0Var, @d5.d Continuation<? super m2> continuation) {
        return r(this, e0Var, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    public String toString() {
        return this.flow + ProtectedSandApp.s("郸") + super.toString();
    }

    @d5.e
    protected abstract Object u(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation);
}
