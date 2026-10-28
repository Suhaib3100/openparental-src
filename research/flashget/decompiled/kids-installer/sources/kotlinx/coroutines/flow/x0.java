package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/x0;", "T", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "p", "Lq3/p;", "action", "<init>", "(Lkotlinx/coroutines/flow/j;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class x0<T> implements j<T> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final j<T> collector;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.p<j<? super T>, Continuation<? super m2>, Object> action;

    /* compiled from: Share.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28548r;

        /* renamed from: s, reason: collision with root package name */
        Object f28549s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28550t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ x0<T> f28551u;

        /* renamed from: v, reason: collision with root package name */
        int f28552v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x0<T> x0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f28551u = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28550t = obj;
            this.f28552v |= Integer.MIN_VALUE;
            return this.f28551u.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(@d5.d j<? super T> jVar, @d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        this.collector = jVar;
        this.action = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.t] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.x0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.x0$a r0 = (kotlinx.coroutines.flow.x0.a) r0
            int r1 = r0.f28552v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28552v = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.x0$a r0 = new kotlinx.coroutines.flow.x0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f28550t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28552v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2a
            kotlin.a1.n(r7)
            goto L79
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "嶮"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r7.<init>(r0)
            throw r7
        L36:
            java.lang.Object r2 = r0.f28549s
            kotlinx.coroutines.flow.internal.t r2 = (kotlinx.coroutines.flow.internal.t) r2
            java.lang.Object r4 = r0.f28548r
            kotlinx.coroutines.flow.x0 r4 = (kotlinx.coroutines.flow.x0) r4
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L7f
            goto L60
        L42:
            kotlin.a1.n(r7)
            kotlinx.coroutines.flow.internal.t r2 = new kotlinx.coroutines.flow.internal.t
            kotlinx.coroutines.flow.j<T> r7 = r6.collector
            kotlin.coroutines.g r5 = r0.getF23291o()
            r2.<init>(r7, r5)
            q3.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.m2>, java.lang.Object> r7 = r6.action     // Catch: java.lang.Throwable -> L7f
            r0.f28548r = r6     // Catch: java.lang.Throwable -> L7f
            r0.f28549s = r2     // Catch: java.lang.Throwable -> L7f
            r0.f28552v = r4     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r7 = r7.g0(r2, r0)     // Catch: java.lang.Throwable -> L7f
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
        L60:
            r2.C()
            kotlinx.coroutines.flow.j<T> r7 = r4.collector
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.x0
            if (r2 == 0) goto L7c
            kotlinx.coroutines.flow.x0 r7 = (kotlinx.coroutines.flow.x0) r7
            r2 = 0
            r0.f28548r = r2
            r0.f28549s = r2
            r0.f28552v = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            kotlin.m2 r7 = kotlin.m2.f23662a
            return r7
        L7c:
            kotlin.m2 r7 = kotlin.m2.f23662a
            return r7
        L7f:
            r7 = move-exception
            r2.C()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x0.a(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.j
    @d5.e
    public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
        return this.collector.b(t5, continuation);
    }
}
