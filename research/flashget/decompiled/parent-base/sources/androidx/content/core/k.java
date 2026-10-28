package androidx.content.core;

import fg.l;
import fg.m;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: SimpleActor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bh\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R3\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/datastore/core/k;", "T", "", "Lkotlinx/coroutines/r0;", "scope", "Lkotlin/Function1;", "", "Lkotlin/k2;", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/d;", "consumeMessage", "<init>", "(Lkotlinx/coroutines/r0;Lld/l;Lld/p;Lld/p;)V", "msg", "e", "(Ljava/lang/Object;)V", "a", "Lkotlinx/coroutines/r0;", "b", "Lld/p;", "Lkotlinx/coroutines/channels/l;", "c", "Lkotlinx/coroutines/channels/l;", "messageQueue", "Ljava/util/concurrent/atomic/AtomicInteger;", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "remainingMessages", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class k<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final r0 scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final p<T, d<? super k2>, Object> consumeMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final kotlinx.coroutines.channels.l<T> messageQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final AtomicInteger remainingMessages;

    /* compiled from: SimpleActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "ex", "Lkotlin/k2;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class a extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Throwable, k2> f28418b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k<T> f28419c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, k2> f28420d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super Throwable, k2> lVar, k<T> kVar, p<? super T, ? super Throwable, k2> pVar) {
            super(1);
            this.f28418b = lVar;
            this.f28419c = kVar;
            this.f28420d = pVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            k2 k2Var;
            this.f28418b.invoke(th);
            ((k) this.f28419c).messageQueue.b0(th);
            do {
                Object h4 = kotlinx.coroutines.channels.p.h(((k) this.f28419c).messageQueue.T());
                if (h4 == null) {
                    k2Var = null;
                } else {
                    this.f28420d.invoke(h4, th);
                    k2Var = k2.f75408a;
                }
            } while (k2Var != null);
        }
    }

    /* compiled from: SimpleActor.kt */
    @f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {122, 122}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends o implements p<r0, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f28421b;

        /* renamed from: c, reason: collision with root package name */
        int f28422c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k<T> f28423d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k<T> kVar, d<? super b> dVar) {
            super(2, dVar);
            this.f28423d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            return new b(this.f28423d, dVar);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0053 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:6:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r5.f28422c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.a1.n(r6)
                goto L60
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.f28421b
                ld.p r1 = (ld.p) r1
                kotlin.a1.n(r6)
                goto L54
            L20:
                kotlin.a1.n(r6)
                androidx.datastore.core.k<T> r6 = r5.f28423d
                java.util.concurrent.atomic.AtomicInteger r6 = androidx.content.core.k.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L31
                r6 = r3
                goto L32
            L31:
                r6 = 0
            L32:
                if (r6 == 0) goto L6f
            L34:
                androidx.datastore.core.k<T> r6 = r5.f28423d
                kotlinx.coroutines.r0 r6 = androidx.content.core.k.d(r6)
                kotlinx.coroutines.s0.j(r6)
                androidx.datastore.core.k<T> r6 = r5.f28423d
                ld.p r1 = androidx.content.core.k.a(r6)
                androidx.datastore.core.k<T> r6 = r5.f28423d
                kotlinx.coroutines.channels.l r6 = androidx.content.core.k.b(r6)
                r5.f28421b = r1
                r5.f28422c = r3
                java.lang.Object r6 = r6.a0(r5)
                if (r6 != r0) goto L54
                return r0
            L54:
                r4 = 0
                r5.f28421b = r4
                r5.f28422c = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L60
                return r0
            L60:
                androidx.datastore.core.k<T> r6 = r5.f28423d
                java.util.concurrent.atomic.AtomicInteger r6 = androidx.content.core.k.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L34
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            L6f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@l r0 scope, @l ld.l<? super Throwable, k2> onComplete, @l p<? super T, ? super Throwable, k2> onUndeliveredElement, @l p<? super T, ? super d<? super k2>, ? extends Object> consumeMessage) {
        l0.p(scope, "scope");
        l0.p(onComplete, "onComplete");
        l0.p(onUndeliveredElement, "onUndeliveredElement");
        l0.p(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = kotlinx.coroutines.channels.o.d(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInteger(0);
        kotlinx.coroutines.k2 k2Var = (kotlinx.coroutines.k2) scope.getCoroutineContext().c(kotlinx.coroutines.k2.INSTANCE);
        if (k2Var == null) {
            return;
        }
        k2Var.F(new a(onComplete, this, onUndeliveredElement));
    }

    public final void e(T msg) {
        Object M = this.messageQueue.M(msg);
        if (M instanceof p.a) {
            Throwable f4 = kotlinx.coroutines.channels.p.f(M);
            if (f4 != null) {
                throw f4;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!kotlinx.coroutines.channels.p.m(M)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            kotlinx.coroutines.k.f(this.scope, null, null, new b(this, null), 3, null);
        }
    }
}
