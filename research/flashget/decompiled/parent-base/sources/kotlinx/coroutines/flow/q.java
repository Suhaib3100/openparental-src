package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: Count.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "a", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "b", "(Lkotlinx/coroutines/flow/i;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes7.dex */
final /* synthetic */ class q {

    /* compiled from: Count.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {17}, m = "count", n = {"i"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80296b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80297c;

        /* renamed from: d, reason: collision with root package name */
        int f80298d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80297c = obj;
            this.f80298d |= Integer.MIN_VALUE;
            return q.a(null, this);
        }
    }

    /* compiled from: Count.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b<T> implements j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.f f80299b;

        b(k1.f fVar) {
            this.f80299b = fVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public final Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            this.f80299b.f75327b++;
            return k2.f75408a;
        }
    }

    /* compiled from: Count.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {29}, m = "count", n = {"i"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80300b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80301c;

        /* renamed from: d, reason: collision with root package name */
        int f80302d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80301c = obj;
            this.f80302d |= Integer.MIN_VALUE;
            return q.b(null, null, this);
        }
    }

    /* compiled from: Count.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d<T> implements j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super Boolean>, Object> f80303b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.f f80304c;

        /* compiled from: Count.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {30}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80305b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80306c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d<T> f80307d;

            /* renamed from: e, reason: collision with root package name */
            int f80308e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(dVar2);
                this.f80307d = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80306c = obj;
                this.f80308e |= Integer.MIN_VALUE;
                return this.f80307d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, k1.f fVar) {
            this.f80303b = pVar;
            this.f80304c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.q.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.q$d$a r0 = (kotlinx.coroutines.flow.q.d.a) r0
                int r1 = r0.f80308e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80308e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.q$d$a r0 = new kotlinx.coroutines.flow.q$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f80306c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80308e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r5 = r0.f80305b
                kotlinx.coroutines.flow.q$d r5 = (kotlinx.coroutines.flow.q.d) r5
                kotlin.a1.n(r6)
                goto L48
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "蝙\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.a1.n(r6)
                ld.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f80303b
                r0.f80305b = r4
                r0.f80308e = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                r5 = r4
            L48:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L57
                kotlin.jvm.internal.k1$f r5 = r5.f80304c
                int r6 = r5.f75327b
                int r6 = r6 + r3
                r5.f75327b = r6
            L57:
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.d.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l kotlin.coroutines.d<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.q.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.q$a r0 = (kotlinx.coroutines.flow.q.a) r0
            int r1 = r0.f80298d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80298d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q$a r0 = new kotlinx.coroutines.flow.q$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f80297c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80298d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f80296b
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            kotlin.a1.n(r5)
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "蝛\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
            kotlin.jvm.internal.k1$f r5 = new kotlin.jvm.internal.k1$f
            r5.<init>()
            kotlinx.coroutines.flow.q$b r2 = new kotlinx.coroutines.flow.q$b
            r2.<init>(r5)
            r0.f80296b = r5
            r0.f80298d = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r5
        L50:
            int r4 = r4.f75327b
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.a(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.q.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.q$c r0 = (kotlinx.coroutines.flow.q.c) r0
            int r1 = r0.f80302d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80302d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q$c r0 = new kotlinx.coroutines.flow.q$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f80301c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80302d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f80300b
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            kotlin.a1.n(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "蝛\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r6)
            kotlin.jvm.internal.k1$f r6 = new kotlin.jvm.internal.k1$f
            r6.<init>()
            kotlinx.coroutines.flow.q$d r2 = new kotlinx.coroutines.flow.q$d
            r2.<init>(r5, r6)
            r0.f80300b = r6
            r0.f80302d = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r6
        L50:
            int r4 = r4.f75327b
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.b(kotlinx.coroutines.flow.i, ld.p, kotlin.coroutines.d):java.lang.Object");
    }
}
