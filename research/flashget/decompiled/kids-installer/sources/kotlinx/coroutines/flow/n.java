package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.n2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Collect.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001am\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002H\b\u0004\u0010\u0011\u001aB\b\u0001\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aV\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000023\b\u0004\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/u0;", "scope", "Lkotlinx/coroutines/n2;", "h", "Lkotlin/Function3;", "", "Lkotlin/r0;", "name", "index", "value", "Lkotlin/coroutines/d;", "", "action", "d", "(Lkotlinx/coroutines/flow/i;Lq3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "f", "(Lkotlinx/coroutines/flow/i;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/j;", "flow", "g", "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collect.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements j<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.p<T, Continuation<? super m2>, Object> f28239o;

        /* compiled from: Collect.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* renamed from: kotlinx.coroutines.flow.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0437a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28240r;

            /* renamed from: t, reason: collision with root package name */
            int f28242t;

            public C0437a(Continuation<? super C0437a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28240r = obj;
                this.f28242t |= Integer.MIN_VALUE;
                return a.this.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar) {
            this.f28239o = pVar;
        }

        @d5.e
        public Object a(T t5, @d5.d Continuation<? super m2> continuation) {
            new C0437a(continuation);
            this.f28239o.g0(t5, continuation);
            return m2.f23662a;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            Object g02 = this.f28239o.g0(t5, continuation);
            return g02 == CoroutineSingletons.COROUTINE_SUSPENDED ? g02 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Collect.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"kotlinx/coroutines/flow/n$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "o", "I", "index", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements j<T> {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q<Integer, T, Continuation<? super m2>, Object> f28244p;

        /* compiled from: Collect.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28245r;

            /* renamed from: t, reason: collision with root package name */
            int f28247t;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28245r = obj;
                this.f28247t |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(q3.q<? super Integer, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar) {
            this.f28244p = qVar;
        }

        @d5.e
        public Object a(T t5, @d5.d Continuation<? super m2> continuation) {
            new a(continuation);
            q3.q<Integer, T, Continuation<? super m2>, Object> qVar = this.f28244p;
            int i5 = this.index;
            this.index = i5 + 1;
            if (i5 < 0) {
                throw new ArithmeticException(ProtectedSandApp.s("嵳"));
            }
            qVar.G(Integer.valueOf(i5), t5, continuation);
            return m2.f23662a;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            q3.q<Integer, T, Continuation<? super m2>, Object> qVar = this.f28244p;
            int i5 = this.index;
            this.index = i5 + 1;
            if (i5 < 0) {
                throw new ArithmeticException(ProtectedSandApp.s("嵴"));
            }
            Object G = qVar.G(new Integer(i5), t5, continuation);
            return G == CoroutineSingletons.COROUTINE_SUSPENDED ? G : m2.f23662a;
        }
    }

    /* compiled from: Collect.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c extends SuspendLambda implements q3.p<kotlinx.coroutines.u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28248s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ i<T> f28249t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i<? extends T> iVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f28249t = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28248s;
            if (i5 == 0) {
                a1.n(obj);
                i<T> iVar = this.f28249t;
                this.f28248s = 1;
                if (n.a(iVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("鄐"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((c) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return new c(this.f28249t, continuation);
        }
    }

    @d5.e
    public static final Object a(@d5.d i<?> iVar, @d5.d Continuation<? super m2> continuation) {
        Object a6 = iVar.a(kotlinx.coroutines.flow.internal.r.f28114o, continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final <T> Object b(i<? extends T> iVar, q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar, Continuation<? super m2> continuation) {
        Object a6 = iVar.a(new a(pVar), continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final <T> Object c(i<? extends T> iVar, q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar, Continuation<? super m2> continuation) {
        iVar.a(new a(pVar), continuation);
        return m2.f23662a;
    }

    @d5.e
    public static final <T> Object d(@d5.d i<? extends T> iVar, @d5.d q3.q<? super Integer, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar, @d5.d Continuation<? super m2> continuation) {
        Object a6 = iVar.a(new b(qVar), continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }

    private static final <T> Object e(i<? extends T> iVar, q3.q<? super Integer, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar, Continuation<? super m2> continuation) {
        iVar.a(new b(qVar), continuation);
        return m2.f23662a;
    }

    @d5.e
    public static final <T> Object f(@d5.d i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super m2>, ? extends Object> pVar, @d5.d Continuation<? super m2> continuation) {
        Object a6 = a(p.d(w.k(iVar, pVar), 0, null, 2, null), continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }

    @d5.e
    public static final <T> Object g(@d5.d j<? super T> jVar, @d5.d i<? extends T> iVar, @d5.d Continuation<? super m2> continuation) {
        t.b(jVar);
        Object a6 = iVar.a(jVar, continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }

    @d5.d
    public static final <T> n2 h(@d5.d i<? extends T> iVar, @d5.d kotlinx.coroutines.u0 u0Var) {
        n2 f6;
        f6 = kotlinx.coroutines.l.f(u0Var, null, null, new c(iVar, null), 3, null);
        return f6;
    }
}
