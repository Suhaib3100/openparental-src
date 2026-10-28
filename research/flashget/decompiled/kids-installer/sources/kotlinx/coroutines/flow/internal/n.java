package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.u0;

/* compiled from: FlowCoroutine.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002)\b\u0001\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aU\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000025\b\u0001\u0010\u0006\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0002\b\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"R", "Lkotlin/Function2;", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "a", "(Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "Lkotlinx/coroutines/flow/i;", "b", "(Lq3/q;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.q f28107o;

        public a(q3.q qVar) {
            this.f28107o = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Continuation<? super m2> continuation) {
            Object a6 = n.a(new b(this.f28107o, jVar, null), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* compiled from: FlowCoroutine.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28108s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28109t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ q3.q<u0, kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> f28110u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f28111v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q3.q<? super u0, ? super kotlinx.coroutines.flow.j<? super R>, ? super Continuation<? super m2>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f28110u = qVar;
            this.f28111v = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28108s;
            if (i5 == 0) {
                a1.n(obj);
                u0 u0Var = (u0) this.f28109t;
                q3.q<u0, kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> qVar = this.f28110u;
                Object obj3 = this.f28111v;
                this.f28108s = 1;
                if (qVar.G(u0Var, obj3, this) == obj2) {
                    return obj2;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("鄂"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((b) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            b bVar = new b(this.f28110u, this.f28111v, continuation);
            bVar.f28109t = obj;
            return bVar;
        }
    }

    @d5.e
    public static final <R> Object a(@BuilderInference @d5.d q3.p<? super u0, ? super Continuation<? super R>, ? extends Object> pVar, @d5.d Continuation<? super R> continuation) {
        m mVar = new m(continuation.getContext(), continuation);
        Object f6 = q4.b.f(mVar, mVar, pVar);
        if (f6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return f6;
    }

    @d5.d
    public static final <R> kotlinx.coroutines.flow.i<R> b(@BuilderInference @d5.d q3.q<? super u0, ? super kotlinx.coroutines.flow.j<? super R>, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
