package android.content.core;

import d5.d;
import d5.e;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;
import q3.l;
import q3.p;

/* compiled from: SimpleActor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bh\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00040\u0018\u0012\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00040\u000b\u0012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR3\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/datastore/core/k;", "T", "", "msg", "Lkotlin/m2;", "e", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/u0;", "a", "Lkotlinx/coroutines/u0;", "scope", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "b", "Lq3/p;", "consumeMessage", "Lkotlinx/coroutines/channels/n;", "c", "Lkotlinx/coroutines/channels/n;", "messageQueue", "Ljava/util/concurrent/atomic/AtomicInteger;", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "remainingMessages", "Lkotlin/Function1;", "", "onComplete", "onUndeliveredElement", "<init>", "(Lkotlinx/coroutines/u0;Lq3/l;Lq3/p;Lq3/p;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class k<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final u0 scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final p<T, Continuation<? super m2>, Object> consumeMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final n<T> messageQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final AtomicInteger remainingMessages;

    /* compiled from: SimpleActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"T", "", "ex", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    static final class a extends Lambda implements l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<Throwable, m2> f6964p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ k<T> f6965q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, m2> f6966r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super Throwable, m2> lVar, k<T> kVar, p<? super T, ? super Throwable, m2> pVar) {
            super(1);
            this.f6964p = lVar;
            this.f6965q = kVar;
            this.f6966r = pVar;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@e Throwable th) {
            m2 m2Var;
            this.f6964p.N(th);
            ((k) this.f6965q).messageQueue.a(th);
            do {
                Object h5 = r.h(((k) this.f6965q).messageQueue.A());
                if (h5 == null) {
                    m2Var = null;
                } else {
                    this.f6966r.g0(h5, th);
                    m2Var = m2.f23662a;
                }
            } while (m2Var != null);
        }
    }

    /* compiled from: SimpleActor.kt */
    @DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {122, 122}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class b extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f6967s;

        /* renamed from: t, reason: collision with root package name */
        int f6968t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ k<T> f6969u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k<T> kVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f6969u = kVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:6:0x006c). Please report as a decompilation issue!!! */
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
                int r1 = r7.f6968t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                kotlin.a1.n(r8)
                r8 = r7
                goto L6c
            L11:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L19:
                java.lang.Object r1 = r7.f6967s
                q3.p r1 = (q3.p) r1
                kotlin.a1.n(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L5e
            L24:
                kotlin.a1.n(r8)
                androidx.datastore.core.k<T> r8 = r7.f6969u
                java.util.concurrent.atomic.AtomicInteger r8 = android.content.core.k.c(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L35
                r8 = r3
                goto L36
            L35:
                r8 = 0
            L36:
                if (r8 == 0) goto L7b
                r8 = r7
            L39:
                androidx.datastore.core.k<T> r1 = r8.f6969u
                kotlinx.coroutines.u0 r1 = android.content.core.k.d(r1)
                kotlinx.coroutines.v0.j(r1)
                androidx.datastore.core.k<T> r1 = r8.f6969u
                q3.p r1 = android.content.core.k.a(r1)
                androidx.datastore.core.k<T> r4 = r8.f6969u
                kotlinx.coroutines.channels.n r4 = android.content.core.k.b(r4)
                r8.f6967s = r1
                r8.f6968t = r3
                java.lang.Object r4 = r4.N(r8)
                if (r4 != r0) goto L59
                return r0
            L59:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L5e:
                r5 = 0
                r0.f6967s = r5
                r0.f6968t = r2
                java.lang.Object r8 = r4.g0(r8, r0)
                if (r8 != r1) goto L6a
                return r1
            L6a:
                r8 = r0
                r0 = r1
            L6c:
                androidx.datastore.core.k<T> r1 = r8.f6969u
                java.util.concurrent.atomic.AtomicInteger r1 = android.content.core.k.c(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L39
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            L7b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.k.b.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d u0 u0Var, @e Continuation<? super m2> continuation) {
            return ((b) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            return new b(this.f6969u, continuation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@d u0 scope, @d l<? super Throwable, m2> onComplete, @d p<? super T, ? super Throwable, m2> onUndeliveredElement, @d p<? super T, ? super Continuation<? super m2>, ? extends Object> consumeMessage) {
        l0.p(scope, "scope");
        l0.p(onComplete, "onComplete");
        l0.p(onUndeliveredElement, "onUndeliveredElement");
        l0.p(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = q.d(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInteger(0);
        n2 n2Var = (n2) scope.getCoroutineContext().b(n2.INSTANCE);
        if (n2Var == null) {
            return;
        }
        n2Var.m0(new a(onComplete, this, onUndeliveredElement));
    }

    public final void e(T msg) {
        Object Y = this.messageQueue.Y(msg);
        if (Y instanceof r.a) {
            Throwable f6 = r.f(Y);
            if (f6 != null) {
                throw f6;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!r.m(Y)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            kotlinx.coroutines.l.f(this.scope, null, null, new b(this, null), 3, null);
        }
    }
}
