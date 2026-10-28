package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.u0;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/internal/j;", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "i", "Lkotlinx/coroutines/u0;", "scope", "Lkotlinx/coroutines/channels/g0;", "o", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "h", "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/flow/i;", "r", "Ljava/lang/Iterable;", "flows", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class j<T> extends d<T> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Iterable<kotlinx.coroutines.flow.i<T>> flows;

    /* compiled from: Merge.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    static final class a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28045s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f28046t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ w<T> f28047u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.i<? extends T> iVar, w<T> wVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28046t = iVar;
            this.f28047u = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28045s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.i<T> iVar = this.f28046t;
                w<T> wVar = this.f28047u;
                this.f28045s = 1;
                if (iVar.a(wVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郻"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return new a(this.f28046t, this.f28047u, continuation);
        }
    }

    public /* synthetic */ j(Iterable iterable, CoroutineContext coroutineContext, int i5, kotlinx.coroutines.channels.m mVar, int i6, kotlin.jvm.internal.w wVar) {
        this(iterable, (i6 & 2) != 0 ? EmptyCoroutineContext.f23294o : coroutineContext, (i6 & 4) != 0 ? -2 : i5, (i6 & 8) != 0 ? kotlinx.coroutines.channels.m.SUSPEND : mVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.e
    protected Object h(@d5.d e0<? super T> e0Var, @d5.d Continuation<? super m2> continuation) {
        w wVar = new w(e0Var);
        Iterator<kotlinx.coroutines.flow.i<T>> it = this.flows.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.l.f(e0Var, null, null, new a(it.next(), wVar, null), 3, null);
        }
        return m2.f23662a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    protected d<T> i(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        return new j(this.flows, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    public g0<T> o(@d5.d u0 scope) {
        return c0.e(scope, this.context, this.capacity, m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@d5.d Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @d5.d CoroutineContext coroutineContext, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        super(coroutineContext, i5, mVar);
        this.flows = iterable;
    }
}
