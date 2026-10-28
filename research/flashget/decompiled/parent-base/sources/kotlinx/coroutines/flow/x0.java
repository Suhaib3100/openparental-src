package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.apache.http.HttpStatus;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R>\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/x0;", "T", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "action", "<init>", "(Lkotlinx/coroutines/flow/j;Lld/p;)V", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/j;", "c", "Lld/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,426:1\n329#2:427\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n417#1:427\n*E\n"})
/* loaded from: classes7.dex */
public final class x0<T> implements j<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j<T> collector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<j<? super T>, kotlin.coroutines.d<? super k2>, Object> action;

    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80594b;

        /* renamed from: c, reason: collision with root package name */
        Object f80595c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f80596d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x0<T> f80597e;

        /* renamed from: f, reason: collision with root package name */
        int f80598f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x0<T> x0Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f80597e = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80596d = obj;
            this.f80598f |= Integer.MIN_VALUE;
            return this.f80597e.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(@fg.l j<? super T> jVar, @fg.l ld.p<? super j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        this.collector = jVar;
        this.action = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.t] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.x0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.x0$a r0 = (kotlinx.coroutines.flow.x0.a) r0
            int r1 = r0.f80598f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80598f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.x0$a r0 = new kotlinx.coroutines.flow.x0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f80596d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80598f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2a
            kotlin.a1.n(r7)
            goto L7b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "螬\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r7.<init>(r0)
            throw r7
        L36:
            java.lang.Object r2 = r0.f80595c
            kotlinx.coroutines.flow.internal.t r2 = (kotlinx.coroutines.flow.internal.t) r2
            java.lang.Object r4 = r0.f80594b
            kotlinx.coroutines.flow.x0 r4 = (kotlinx.coroutines.flow.x0) r4
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L42
            goto L62
        L42:
            r7 = move-exception
            goto L81
        L44:
            kotlin.a1.n(r7)
            kotlinx.coroutines.flow.internal.t r2 = new kotlinx.coroutines.flow.internal.t
            kotlinx.coroutines.flow.j<T> r7 = r6.collector
            kotlin.coroutines.g r5 = r0.getF75054b()
            r2.<init>(r7, r5)
            ld.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r7 = r6.action     // Catch: java.lang.Throwable -> L42
            r0.f80594b = r6     // Catch: java.lang.Throwable -> L42
            r0.f80595c = r2     // Catch: java.lang.Throwable -> L42
            r0.f80598f = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L42
            if (r7 != r1) goto L61
            return r1
        L61:
            r4 = r6
        L62:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.j<T> r7 = r4.collector
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.x0
            if (r2 == 0) goto L7e
            kotlinx.coroutines.flow.x0 r7 = (kotlinx.coroutines.flow.x0) r7
            r2 = 0
            r0.f80594b = r2
            r0.f80595c = r2
            r0.f80598f = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        L7e:
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        L81:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x0.a(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.j
    @fg.m
    public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return this.collector.emit(t4, dVar);
    }
}
