package kotlinx.coroutines.channels;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.w0;

/* compiled from: Produce.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aª\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/e0;", "Lkotlin/Function0;", "Lkotlin/m2;", "block", "a", "(Lkotlinx/coroutines/channels/e0;Lq3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "E", "Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "Lkotlinx/coroutines/channels/g0;", "e", "(Lkotlinx/coroutines/u0;Lkotlin/coroutines/g;ILq3/p;)Lkotlinx/coroutines/channels/g0;", "Lkotlinx/coroutines/w0;", "start", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lkotlinx/coroutines/u0;Lkotlin/coroutines/g;ILkotlinx/coroutines/w0;Lq3/l;Lq3/p;)Lkotlinx/coroutines/channels/g0;", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "d", "(Lkotlinx/coroutines/u0;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;Lkotlinx/coroutines/w0;Lq3/l;Lq3/p;)Lkotlinx/coroutines/channels/g0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class c0 {

    /* compiled from: Produce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27320r;

        /* renamed from: s, reason: collision with root package name */
        Object f27321s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27322t;

        /* renamed from: u, reason: collision with root package name */
        int f27323u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27322t = obj;
            this.f27323u |= Integer.MIN_VALUE;
            return c0.a(null, null, this);
        }
    }

    /* compiled from: Produce.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/m2;", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f27324p = new b();

        b() {
            super(0);
        }

        public final void a() {
        }

        @Override // q3.a
        public m2 n() {
            return m2.f23662a;
        }
    }

    /* compiled from: Produce.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.q<m2> f27325p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.q<? super m2> qVar) {
            super(1);
            this.f27325p = qVar;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.e Throwable th) {
            kotlinx.coroutines.q<m2> qVar = this.f27325p;
            Result.a aVar = Result.f27242p;
            qVar.s(m2.f23662a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@d5.d kotlinx.coroutines.channels.e0<?> r4, @d5.d q3.a<kotlin.m2> r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.c0.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.c0$a r0 = (kotlinx.coroutines.channels.c0.a) r0
            int r1 = r0.f27323u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27323u = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.c0$a r0 = new kotlinx.coroutines.channels.c0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27322t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27323u
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f27321s
            r5 = r4
            q3.a r5 = (q3.a) r5
            java.lang.Object r4 = r0.f27320r
            kotlinx.coroutines.channels.e0 r4 = (kotlinx.coroutines.channels.e0) r4
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L30
            goto L78
        L30:
            r4 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "岩"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3e:
            kotlin.a1.n(r6)
            kotlin.coroutines.g r6 = r0.getContext()
            kotlinx.coroutines.n2$b r2 = kotlinx.coroutines.n2.INSTANCE
            kotlin.coroutines.g$b r6 = r6.b(r2)
            if (r6 != r4) goto L4f
            r6 = r3
            goto L50
        L4f:
            r6 = 0
        L50:
            if (r6 == 0) goto L82
            r0.f27320r = r4     // Catch: java.lang.Throwable -> L30
            r0.f27321s = r5     // Catch: java.lang.Throwable -> L30
            r0.f27323u = r3     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.s r6 = new kotlinx.coroutines.s     // Catch: java.lang.Throwable -> L30
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L30
            r6.X()     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.channels.c0$c r2 = new kotlinx.coroutines.channels.c0$c     // Catch: java.lang.Throwable -> L30
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L30
            r4.v(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r6.A()     // Catch: java.lang.Throwable -> L30
            if (r4 != r1) goto L75
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L30
        L75:
            if (r4 != r1) goto L78
            return r1
        L78:
            r5.n()
            kotlin.m2 r4 = kotlin.m2.f23662a
            return r4
        L7e:
            r5.n()
            throw r4
        L82:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "岪"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.c0.a(kotlinx.coroutines.channels.e0, q3.a, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(e0 e0Var, q3.a aVar, Continuation continuation, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = b.f27324p;
        }
        return a(e0Var, aVar, continuation);
    }

    @d5.d
    @i2
    public static final <E> g0<E> c(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext, int i5, @d5.d w0 w0Var, @d5.e q3.l<? super Throwable, m2> lVar, @BuilderInference @d5.d q3.p<? super e0<? super E>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return d(u0Var, coroutineContext, i5, m.SUSPEND, w0Var, lVar, pVar);
    }

    @d5.d
    public static final <E> g0<E> d(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext, int i5, @d5.d m mVar, @d5.d w0 w0Var, @d5.e q3.l<? super Throwable, m2> lVar, @BuilderInference @d5.d q3.p<? super e0<? super E>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        d0 d0Var = new d0(kotlinx.coroutines.n0.e(u0Var, coroutineContext), q.d(i5, mVar, null, 4, null));
        if (lVar != null) {
            d0Var.m0(lVar);
        }
        w0Var.invoke(pVar, d0Var, d0Var);
        return d0Var;
    }

    @c2
    @d5.d
    public static final <E> g0<E> e(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext, int i5, @BuilderInference @d5.d q3.p<? super e0<? super E>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return d(u0Var, coroutineContext, i5, m.SUSPEND, w0.DEFAULT, null, pVar);
    }

    public static /* synthetic */ g0 f(u0 u0Var, CoroutineContext coroutineContext, int i5, w0 w0Var, q3.l lVar, q3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            w0Var = w0.DEFAULT;
        }
        w0 w0Var2 = w0Var;
        if ((i6 & 8) != 0) {
            lVar = null;
        }
        return c(u0Var, coroutineContext2, i7, w0Var2, lVar, pVar);
    }

    public static /* synthetic */ g0 g(u0 u0Var, CoroutineContext coroutineContext, int i5, m mVar, w0 w0Var, q3.l lVar, q3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            mVar = m.SUSPEND;
        }
        m mVar2 = mVar;
        if ((i6 & 8) != 0) {
            w0Var = w0.DEFAULT;
        }
        w0 w0Var2 = w0Var;
        if ((i6 & 16) != 0) {
            lVar = null;
        }
        return d(u0Var, coroutineContext2, i7, mVar2, w0Var2, lVar, pVar);
    }

    public static /* synthetic */ g0 h(u0 u0Var, CoroutineContext coroutineContext, int i5, q3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return e(u0Var, coroutineContext, i5, pVar);
    }
}
