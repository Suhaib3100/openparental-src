package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.n2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: SafeCollector.common.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b2/\b\u0005\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/internal/t;", "Lkotlin/coroutines/g;", "currentContext", "Lkotlin/m2;", "a", "Lkotlinx/coroutines/n2;", "collectJob", "b", "T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/flow/i;", "c", "(Lq3/p;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class v {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lkotlin/coroutines/g$b;", "element", "a", "(ILkotlin/coroutines/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.p<Integer, CoroutineContext.b, Integer> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ t<?> f28126p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t<?> tVar) {
            super(2);
            this.f28126p = tVar;
        }

        @d5.d
        public final Integer a(int i5, @d5.d CoroutineContext.b bVar) {
            CoroutineContext.c<?> key = bVar.getKey();
            CoroutineContext.b b6 = this.f28126p.collectContext.b(key);
            if (key != n2.INSTANCE) {
                return Integer.valueOf(bVar != b6 ? Integer.MIN_VALUE : i5 + 1);
            }
            n2 n2Var = (n2) b6;
            n2 b7 = v.b((n2) bVar, n2Var);
            if (b7 == n2Var) {
                if (n2Var != null) {
                    i5++;
                }
                return Integer.valueOf(i5);
            }
            throw new IllegalStateException((ProtectedSandApp.s("鄈") + b7 + ProtectedSandApp.s("鄉") + n2Var + ProtectedSandApp.s("鄊")).toString());
        }

        @Override // q3.p
        public /* bridge */ /* synthetic */ Integer g0(Integer num, CoroutineContext.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.p<kotlinx.coroutines.flow.j<? super T>, Continuation<? super m2>, Object> f28127o;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28128r;

            /* renamed from: t, reason: collision with root package name */
            int f28130t;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28128r = obj;
                this.f28130t |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(q3.p<? super kotlinx.coroutines.flow.j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
            this.f28127o = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
            Object g02 = this.f28127o.g0(jVar, continuation);
            return g02 == CoroutineSingletons.COROUTINE_SUSPENDED ? g02 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
            new a(continuation);
            this.f28127o.g0(jVar, continuation);
            return m2.f23662a;
        }
    }

    @p3.i(name = "checkContext")
    public static final void a(@d5.d t<?> tVar, @d5.d CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.n(0, new a(tVar))).intValue() == tVar.collectContextSize) {
            return;
        }
        throw new IllegalStateException((ProtectedSandApp.s("嵝") + tVar.collectContext + ProtectedSandApp.s("嵞") + coroutineContext + ProtectedSandApp.s("嵟")).toString());
    }

    @d5.e
    public static final n2 b(@d5.e n2 n2Var, @d5.e n2 n2Var2) {
        while (n2Var != null) {
            if (n2Var == n2Var2) {
                return n2Var;
            }
            if (!(n2Var instanceof n0)) {
                return n2Var;
            }
            n2Var = ((n0) n2Var).K1();
        }
        return null;
    }

    @PublishedApi
    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> c(@BuilderInference @d5.d q3.p<? super kotlinx.coroutines.flow.j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new b(pVar);
    }
}
