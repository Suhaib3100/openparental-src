package kotlinx.coroutines.channels;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.u2;
import kotlinx.coroutines.v0;
import kotlinx.coroutines.w0;

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a \u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\b\u0002\u0010\u0012\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"E", "Lkotlinx/coroutines/channels/g0;", "", "capacity", "Lkotlinx/coroutines/w0;", "start", "Lkotlinx/coroutines/channels/i;", "b", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/m2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "a", "(Lkotlinx/coroutines/u0;Lkotlin/coroutines/g;ILkotlinx/coroutines/w0;Lq3/l;Lq3/p;)Lkotlinx/coroutines/channels/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class l {

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/r0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/p0;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/m2;", "n0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class a extends AbstractCoroutineContextElement implements p0 {
        public a(p0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.p0
        public void n0(@d5.d CoroutineContext coroutineContext, @d5.d Throwable th) {
        }
    }

    /* compiled from: Broadcast.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ g0<E> f27345p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(g0<? extends E> g0Var) {
            super(1);
            this.f27345p = g0Var;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.e Throwable th) {
            u.a(this.f27345p, th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Broadcast.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {53, 54}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c<E> extends SuspendLambda implements q3.p<e0<? super E>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27346s;

        /* renamed from: t, reason: collision with root package name */
        int f27347t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f27348u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ g0<E> f27349v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(g0<? extends E> g0Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f27349v = g0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006a -> B:7:0x0040). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.f27347t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 == r3) goto L25
                if (r1 != r2) goto L19
                java.lang.Object r1 = r7.f27346s
                kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
                java.lang.Object r4 = r7.f27348u
                kotlinx.coroutines.channels.e0 r4 = (kotlinx.coroutines.channels.e0) r4
                kotlin.a1.n(r8)
                r8 = r4
                goto L3f
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "邙"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r8.<init>(r0)
                throw r8
            L25:
                java.lang.Object r1 = r7.f27346s
                kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
                java.lang.Object r4 = r7.f27348u
                kotlinx.coroutines.channels.e0 r4 = (kotlinx.coroutines.channels.e0) r4
                kotlin.a1.n(r8)
                r5 = r7
                goto L51
            L32:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f27348u
                kotlinx.coroutines.channels.e0 r8 = (kotlinx.coroutines.channels.e0) r8
                kotlinx.coroutines.channels.g0<E> r1 = r7.f27349v
                kotlinx.coroutines.channels.p r1 = r1.iterator()
            L3f:
                r4 = r7
            L40:
                r4.f27348u = r8
                r4.f27346s = r1
                r4.f27347t = r3
                java.lang.Object r5 = r1.a(r4)
                if (r5 != r0) goto L4d
                return r0
            L4d:
                r6 = r4
                r4 = r8
                r8 = r5
                r5 = r6
            L51:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L6d
                java.lang.Object r8 = r1.next()
                r5.f27348u = r4
                r5.f27346s = r1
                r5.f27347t = r2
                java.lang.Object r8 = r4.a0(r8, r5)
                if (r8 != r0) goto L6a
                return r0
            L6a:
                r8 = r4
                r4 = r5
                goto L40
            L6d:
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.l.c.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d e0<? super E> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((c) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            c cVar = new c(this.f27349v, continuation);
            cVar.f27348u = obj;
            return cVar;
        }
    }

    @d3
    @d5.d
    public static final <E> i<E> a(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext, int i5, @d5.d w0 w0Var, @d5.e q3.l<? super Throwable, m2> lVar, @BuilderInference @d5.d q3.p<? super e0<? super E>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        CoroutineContext e6 = kotlinx.coroutines.n0.e(u0Var, coroutineContext);
        i a6 = j.a(i5);
        k a0Var = w0Var.isLazy() ? new a0(e6, a6, pVar) : new k(e6, a6, true);
        if (lVar != null) {
            ((u2) a0Var).m0(lVar);
        }
        ((kotlinx.coroutines.a) a0Var).J1(w0Var, a0Var, pVar);
        return (i<E>) a0Var;
    }

    @d3
    @d5.d
    public static final <E> i<E> b(@d5.d g0<? extends E> g0Var, int i5, @d5.d w0 w0Var) {
        return c(v0.m(v0.m(e2.f27717o, m1.g()), new a(p0.INSTANCE)), null, i5, w0Var, new b(g0Var), new c(g0Var, null), 1, null);
    }

    public static /* synthetic */ i c(u0 u0Var, CoroutineContext coroutineContext, int i5, w0 w0Var, q3.l lVar, q3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            w0Var = w0.LAZY;
        }
        w0 w0Var2 = w0Var;
        if ((i6 & 8) != 0) {
            lVar = null;
        }
        return a(u0Var, coroutineContext2, i7, w0Var2, lVar, pVar);
    }

    public static /* synthetic */ i d(g0 g0Var, int i5, w0 w0Var, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 1;
        }
        if ((i6 & 2) != 0) {
            w0Var = w0.LAZY;
        }
        return b(g0Var, i5, w0Var);
    }
}
