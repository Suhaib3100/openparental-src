package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.j0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.z0;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R9\u0010&\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lkotlinx/coroutines/flow/internal/d;", "T", "Lkotlinx/coroutines/flow/internal/p;", "Lkotlinx/coroutines/flow/i;", "l", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "d", "i", "Lkotlinx/coroutines/channels/e0;", "scope", "Lkotlin/m2;", "h", "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/channels/g0;", "o", "Lkotlinx/coroutines/flow/j;", "collector", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "toString", "Lkotlin/coroutines/g;", "p", "I", "q", "Lkotlinx/coroutines/channels/m;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "m", "()Lq3/p;", "collectToFun", "n", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
/* loaded from: classes6.dex */
public abstract class d<T> implements p<T> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final CoroutineContext context;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final int capacity;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final kotlinx.coroutines.channels.m onBufferOverflow;

    /* compiled from: ChannelFlow.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    static final class a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27999s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28000t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f28001u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ d<T> f28002v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.j<? super T> jVar, d<T> dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28001u = jVar;
            this.f28002v = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27999s;
            if (i5 == 0) {
                a1.n(obj);
                u0 u0Var = (u0) this.f28000t;
                kotlinx.coroutines.flow.j<T> jVar = this.f28001u;
                g0<T> o5 = this.f28002v.o(u0Var);
                this.f27999s = 1;
                if (kotlinx.coroutines.flow.k.l0(jVar, o5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郳"));
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
            a aVar = new a(this.f28001u, this.f28002v, continuation);
            aVar.f28000t = obj;
            return aVar;
        }
    }

    /* compiled from: ChannelFlow.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/e0;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    static final class b extends SuspendLambda implements q3.p<e0<? super T>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28003s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28004t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ d<T> f28005u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d<T> dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f28005u = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28003s;
            if (i5 == 0) {
                a1.n(obj);
                e0<? super T> e0Var = (e0) this.f28004t;
                d<T> dVar = this.f28005u;
                this.f28003s = 1;
                if (dVar.h(e0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郴"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d e0<? super T> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((b) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            b bVar = new b(this.f28005u, continuation);
            bVar.f28004t = obj;
            return bVar;
        }
    }

    public d(@d5.d CoroutineContext coroutineContext, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        this.context = coroutineContext;
        this.capacity = i5;
        this.onBufferOverflow = mVar;
    }

    static Object f(d dVar, kotlinx.coroutines.flow.j jVar, Continuation continuation) {
        Object g5 = v0.g(new a(jVar, dVar, null), continuation);
        return g5 == CoroutineSingletons.COROUTINE_SUSPENDED ? g5 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.flow.i
    @d5.e
    public Object a(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
        return f(this, jVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @d5.d
    public kotlinx.coroutines.flow.i<T> d(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        CoroutineContext B = context.B(this.context);
        if (onBufferOverflow == kotlinx.coroutines.channels.m.SUSPEND) {
            int i5 = this.capacity;
            if (i5 != -3) {
                if (capacity != -3) {
                    if (i5 != -2) {
                        if (capacity != -2 && (i5 = i5 + capacity) < 0) {
                            capacity = Integer.MAX_VALUE;
                        }
                    }
                }
                capacity = i5;
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        return (l0.g(B, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : i(B, capacity, onBufferOverflow);
    }

    @d5.e
    protected String e() {
        return null;
    }

    @d5.e
    protected abstract Object h(@d5.d e0<? super T> e0Var, @d5.d Continuation<? super m2> continuation);

    @d5.d
    protected abstract d<T> i(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow);

    @d5.e
    public kotlinx.coroutines.flow.i<T> l() {
        return null;
    }

    @d5.d
    public final q3.p<e0<? super T>, Continuation<? super m2>, Object> m() {
        return new b(this, null);
    }

    public final int n() {
        int i5 = this.capacity;
        if (i5 == -3) {
            return -2;
        }
        return i5;
    }

    @d5.d
    public g0<T> o(@d5.d u0 scope) {
        return c0.g(scope, this.context, n(), this.onBufferOverflow, w0.ATOMIC, null, m(), 16, null);
    }

    @d5.d
    public String toString() {
        String m32;
        ArrayList arrayList = new ArrayList(4);
        String e6 = e();
        if (e6 != null) {
            arrayList.add(e6);
        }
        if (this.context != EmptyCoroutineContext.f23294o) {
            arrayList.add(ProtectedSandApp.s("郧") + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add(ProtectedSandApp.s("部") + this.capacity);
        }
        if (this.onBufferOverflow != kotlinx.coroutines.channels.m.SUSPEND) {
            arrayList.add(ProtectedSandApp.s("郩") + this.onBufferOverflow);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z0.a(this));
        sb.append('[');
        m32 = j0.m3(arrayList, ProtectedSandApp.s("郪"), null, null, 0, null, null, 62, null);
        return c1.c.a(sb, m32, ']');
    }
}
