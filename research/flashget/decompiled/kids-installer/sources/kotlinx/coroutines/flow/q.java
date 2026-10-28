package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.k1;
import kotlin.m2;

/* compiled from: Count.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "a", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "b", "(Lkotlinx/coroutines/flow/i;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class q {

    /* compiled from: Count.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {18}, m = "count", n = {"i"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28262r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28263s;

        /* renamed from: t, reason: collision with root package name */
        int f28264t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28263s = obj;
            this.f28264t |= Integer.MIN_VALUE;
            return q.a(null, this);
        }
    }

    /* compiled from: Count.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class b<T> implements j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.f f28265o;

        b(k1.f fVar) {
            this.f28265o = fVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public final Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            this.f28265o.f23570o++;
            return m2.f23662a;
        }
    }

    /* compiled from: Count.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {30}, m = "count", n = {"i"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class c<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28266r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28267s;

        /* renamed from: t, reason: collision with root package name */
        int f28268t;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28267s = obj;
            this.f28268t |= Integer.MIN_VALUE;
            return q.b(null, null, this);
        }
    }

    /* compiled from: Count.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class d<T> implements j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.p<T, Continuation<? super Boolean>, Object> f28269o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ k1.f f28270p;

        /* compiled from: Count.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {31}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28271r;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f28272s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ d<T> f28273t;

            /* renamed from: u, reason: collision with root package name */
            int f28274u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28273t = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28272s = obj;
                this.f28274u |= Integer.MIN_VALUE;
                return this.f28273t.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, k1.f fVar) {
            this.f28269o = pVar;
            this.f28270p = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.q.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.q$d$a r0 = (kotlinx.coroutines.flow.q.d.a) r0
                int r1 = r0.f28274u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28274u = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.q$d$a r0 = new kotlinx.coroutines.flow.q$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f28272s
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28274u
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r5 = r0.f28271r
                kotlinx.coroutines.flow.q$d r5 = (kotlinx.coroutines.flow.q.d) r5
                kotlin.a1.n(r6)
                goto L48
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "嵹"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.a1.n(r6)
                q3.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f28269o
                r0.f28271r = r4
                r0.f28274u = r3
                java.lang.Object r6 = r6.g0(r5, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                r5 = r4
            L48:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L57
                kotlin.jvm.internal.k1$f r5 = r5.f28270p
                int r6 = r5.f23570o
                int r6 = r6 + r3
                r5.f23570o = r6
            L57:
                kotlin.m2 r5 = kotlin.m2.f23662a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.d.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d kotlin.coroutines.Continuation<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.q.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.q$a r0 = (kotlinx.coroutines.flow.q.a) r0
            int r1 = r0.f28264t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28264t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q$a r0 = new kotlinx.coroutines.flow.q$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28263s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28264t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f28262r
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            kotlin.a1.n(r5)
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嵻"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
            kotlin.jvm.internal.k1$f r5 = new kotlin.jvm.internal.k1$f
            r5.<init>()
            kotlinx.coroutines.flow.q$b r2 = new kotlinx.coroutines.flow.q$b
            r2.<init>(r5)
            r0.f28262r = r5
            r0.f28264t = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r5
        L50:
            int r4 = r4.f23570o
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.a(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d q3.p<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @d5.d kotlin.coroutines.Continuation<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.q.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.q$c r0 = (kotlinx.coroutines.flow.q.c) r0
            int r1 = r0.f28268t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28268t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q$c r0 = new kotlinx.coroutines.flow.q$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28267s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28268t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f28266r
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            kotlin.a1.n(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嵼"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r6)
            kotlin.jvm.internal.k1$f r6 = new kotlin.jvm.internal.k1$f
            r6.<init>()
            kotlinx.coroutines.flow.q$d r2 = new kotlinx.coroutines.flow.q$d
            r2.<init>(r5, r6)
            r0.f28266r = r6
            r0.f28268t = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r6
        L50:
            int r4 = r4.f23570o
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.b(kotlinx.coroutines.flow.i, q3.p, kotlin.coroutines.d):java.lang.Object");
    }
}
