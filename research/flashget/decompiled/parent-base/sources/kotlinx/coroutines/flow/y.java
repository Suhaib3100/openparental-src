package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Reduce.kt */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001au\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a{\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u00012H\b\u0004\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a#\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u001aG\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001aI\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a#\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013\u001a%\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "accumulator", "value", "Lkotlin/coroutines/d;", "", "operation", "i", "(Lkotlinx/coroutines/flow/i;Lld/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "R", "initial", "acc", "e", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lld/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "a", "Lkotlin/Function2;", "", "predicate", "b", "(Lkotlinx/coroutines/flow/i;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "d", "g", "h", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,172:1\n126#2,15:173\n126#2,15:188\n126#2,15:203\n126#2,15:218\n126#2,15:233\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n72#1:173,15\n92#1:188,15\n106#1:203,15\n124#1:218,15\n137#1:233,15\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n93#2,2:142\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h f80599b;

        public a(k1.h hVar) {
            this.f80599b = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            this.f80599b.f75329b = t4;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n107#2,5:142\n*E\n"})
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p f80600b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.h f80601c;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80602b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80603c;

            /* renamed from: d, reason: collision with root package name */
            int f80604d;

            /* renamed from: f, reason: collision with root package name */
            Object f80606f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80603c = obj;
                this.f80604d |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(ld.p pVar, k1.h hVar) {
            this.f80600b = pVar;
            this.f80601c = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.y$b$a r0 = (kotlinx.coroutines.flow.y.b.a) r0
                int r1 = r0.f80604d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80604d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$b$a r0 = new kotlinx.coroutines.flow.y$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f80603c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80604d
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f80606f
                java.lang.Object r0 = r0.f80602b
                kotlinx.coroutines.flow.y$b r0 = (kotlinx.coroutines.flow.y.b) r0
                kotlin.a1.n(r6)
                goto L4c
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "螮\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L39:
                kotlin.a1.n(r6)
                ld.p r6 = r4.f80600b
                r0.f80602b = r4
                r0.f80606f = r5
                r0.f80604d = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L4b
                return r1
            L4b:
                r0 = r4
            L4c:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L57
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            L57:
                kotlin.jvm.internal.k1$h r6 = r0.f80601c
                r6.f75329b = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80607b;

        /* renamed from: c, reason: collision with root package name */
        Object f80608c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f80609d;

        /* renamed from: e, reason: collision with root package name */
        int f80610e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80609d = obj;
            this.f80610e |= Integer.MIN_VALUE;
            return y.a(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {183}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80611b;

        /* renamed from: c, reason: collision with root package name */
        Object f80612c;

        /* renamed from: d, reason: collision with root package name */
        Object f80613d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f80614e;

        /* renamed from: f, reason: collision with root package name */
        int f80615f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80614e = obj;
            this.f80615f |= Integer.MIN_VALUE;
            return y.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n125#2,2:142\n*E\n"})
    public static final class e<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h f80616b;

        public e(k1.h hVar) {
            this.f80616b = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            this.f80616b.f75329b = t4;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n138#2,5:142\n*E\n"})
    public static final class f<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p f80617b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.h f80618c;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80619b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80620c;

            /* renamed from: d, reason: collision with root package name */
            int f80621d;

            /* renamed from: f, reason: collision with root package name */
            Object f80623f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80620c = obj;
                this.f80621d |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(ld.p pVar, k1.h hVar) {
            this.f80617b = pVar;
            this.f80618c = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.f.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.y$f$a r0 = (kotlinx.coroutines.flow.y.f.a) r0
                int r1 = r0.f80621d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80621d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$f$a r0 = new kotlinx.coroutines.flow.y$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f80620c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80621d
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f80623f
                java.lang.Object r0 = r0.f80619b
                kotlinx.coroutines.flow.y$f r0 = (kotlinx.coroutines.flow.y.f) r0
                kotlin.a1.n(r6)
                goto L4c
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "螯\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L39:
                kotlin.a1.n(r6)
                ld.p r6 = r4.f80617b
                r0.f80619b = r4
                r0.f80623f = r5
                r0.f80621d = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L4b
                return r1
            L4b:
                r0 = r4
            L4c:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L57
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            L57:
                kotlin.jvm.internal.k1$h r6 = r0.f80618c
                r6.f75329b = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.f.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80624b;

        /* renamed from: c, reason: collision with root package name */
        Object f80625c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f80626d;

        /* renamed from: e, reason: collision with root package name */
        int f80627e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80626d = obj;
            this.f80627e |= Integer.MIN_VALUE;
            return y.c(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80628b;

        /* renamed from: c, reason: collision with root package name */
        Object f80629c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f80630d;

        /* renamed from: e, reason: collision with root package name */
        int f80631e;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80630d = obj;
            this.f80631e |= Integer.MIN_VALUE;
            return y.d(null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$1\n*L\n1#1,172:1\n*E\n"})
    static final class i<T, R> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80632b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80633c;

        /* renamed from: d, reason: collision with root package name */
        int f80634d;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80633c = obj;
            this.f80634d |= Integer.MIN_VALUE;
            return y.e(null, null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2\n*L\n1#1,172:1\n*E\n"})
    public static final class j<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<R> f80635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<R, T, kotlin.coroutines.d<? super R>, Object> f80636c;

        /* compiled from: Reduce.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {45}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2$emit$1\n*L\n1#1,172:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80637b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80638c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ j<T> f80639d;

            /* renamed from: e, reason: collision with root package name */
            int f80640e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f80639d = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80638c = obj;
                this.f80640e |= Integer.MIN_VALUE;
                return this.f80639d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public j(k1.h<R> hVar, ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
            this.f80635b = hVar;
            this.f80636c = qVar;
        }

        @fg.m
        public final Object a(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            new a(this, dVar);
            k1.h<R> hVar = this.f80635b;
            hVar.f75329b = (T) this.f80636c.R(hVar.f75329b, t4, dVar);
            return k2.f75408a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.y.j.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.y$j$a r0 = (kotlinx.coroutines.flow.y.j.a) r0
                int r1 = r0.f80640e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80640e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$j$a r0 = new kotlinx.coroutines.flow.y$j$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f80638c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80640e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r7 = r0.f80637b
                kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
                kotlin.a1.n(r8)
                goto L4e
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "螰\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L37:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$h<R> r8 = r6.f80635b
                ld.q<R, T, kotlin.coroutines.d<? super R>, java.lang.Object> r2 = r6.f80636c
                T r4 = r8.f75329b
                r0.f80637b = r8
                r0.f80640e = r3
                java.lang.Object r7 = r2.R(r4, r7, r0)
                if (r7 != r1) goto L4b
                return r1
            L4b:
                r5 = r8
                r8 = r7
                r7 = r5
            L4e:
                r7.f75329b = r8
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.j.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80641b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80642c;

        /* renamed from: d, reason: collision with root package name */
        int f80643d;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80642c = obj;
            this.f80643d |= Integer.MIN_VALUE;
            return y.g(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class l<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f80644b;

        l(k1.h<Object> hVar) {
            this.f80644b = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public final Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            this.f80644b.f75329b = t4;
            return k2.f75408a;
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {167}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80645b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80646c;

        /* renamed from: d, reason: collision with root package name */
        int f80647d;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80646c = obj;
            this.f80647d |= Integer.MIN_VALUE;
            return y.h(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class n<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<T> f80648b;

        n(k1.h<T> hVar) {
            this.f80648b = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public final Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            this.f80648b.f75329b = t4;
            return k2.f75408a;
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o<S, T extends S> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80649b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80650c;

        /* renamed from: d, reason: collision with root package name */
        int f80651d;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80650c = obj;
            this.f80651d |= Integer.MIN_VALUE;
            return y.i(null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class p<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f80652b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<S, T, kotlin.coroutines.d<? super S>, Object> f80653c;

        /* compiled from: Reduce.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80654b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80655c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ p<T> f80656d;

            /* renamed from: e, reason: collision with root package name */
            int f80657e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super T> pVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f80656d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80655c = obj;
                this.f80657e |= Integer.MIN_VALUE;
                return this.f80656d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        p(k1.h<Object> hVar, ld.q<? super S, ? super T, ? super kotlin.coroutines.d<? super S>, ? extends Object> qVar) {
            this.f80652b = hVar;
            this.f80653c = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.y.p.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.y$p$a r0 = (kotlinx.coroutines.flow.y.p.a) r0
                int r1 = r0.f80657e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80657e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$p$a r0 = new kotlinx.coroutines.flow.y$p$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f80655c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80657e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r7 = r0.f80654b
                kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
                kotlin.a1.n(r8)
                goto L52
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "螱\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L37:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$h<java.lang.Object> r8 = r6.f80652b
                T r2 = r8.f75329b
                kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.flow.internal.s.f80148a
                if (r2 == r4) goto L55
                ld.q<S, T, kotlin.coroutines.d<? super S>, java.lang.Object> r4 = r6.f80653c
                r0.f80654b = r8
                r0.f80657e = r3
                java.lang.Object r7 = r4.R(r2, r7, r0)
                if (r7 != r1) goto L4f
                return r1
            L4f:
                r5 = r8
                r8 = r7
                r7 = r5
            L52:
                r5 = r8
                r8 = r7
                r7 = r5
            L55:
                r8.f75329b = r7
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.p.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = "single", n = {"result"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class q<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80658b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80659c;

        /* renamed from: d, reason: collision with root package name */
        int f80660d;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80659c = obj;
            this.f80660d |= Integer.MIN_VALUE;
            return y.j(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$single$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    static final class r<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f80661b;

        r(k1.h<Object> hVar) {
            this.f80661b = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public final Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            k1.h<Object> hVar = this.f80661b;
            if (hVar.f75329b != kotlinx.coroutines.flow.internal.s.f80148a) {
                throw new IllegalArgumentException(ProtectedSandApp.s("螲\u0001"));
            }
            hVar.f75329b = t4;
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n74#2,7:142\n*E\n"})
    public static final class s<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h f80662b;

        public s(k1.h hVar) {
            this.f80662b = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            k1.h hVar = this.f80662b;
            T t5 = hVar.f75329b;
            T t6 = (T) kotlinx.coroutines.flow.internal.s.f80148a;
            if (t5 == t6) {
                hVar.f75329b = t4;
                return k2.f75408a;
            }
            hVar.f75329b = t6;
            throw new AbortFlowException(this);
        }
    }

    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class t<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80663b;

        /* renamed from: c, reason: collision with root package name */
        Object f80664c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f80665d;

        /* renamed from: e, reason: collision with root package name */
        int f80666e;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80665d = obj;
            this.f80666e |= Integer.MIN_VALUE;
            return y.k(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.c
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$c r0 = (kotlinx.coroutines.flow.y.c) r0
            int r1 = r0.f80610e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80610e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$c r0 = new kotlinx.coroutines.flow.y$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f80609d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80610e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f80608c
            kotlinx.coroutines.flow.y$a r4 = (kotlinx.coroutines.flow.y.a) r4
            java.lang.Object r0 = r0.f80607b
            kotlin.jvm.internal.k1$h r0 = (kotlin.jvm.internal.k1.h) r0
            kotlin.a1.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L60
        L2f:
            r5 = move-exception
            goto L5d
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.jvm.internal.k1$h r5 = androidx.compose.foundation.text.g.a(r5)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.internal.s.f80148a
            r5.f75329b = r2
            kotlinx.coroutines.flow.y$a r2 = new kotlinx.coroutines.flow.y$a
            r2.<init>(r5)
            r0.f80607b = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f80608c = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f80610e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            if (r4 != r1) goto L57
            return r1
        L57:
            r0 = r5
            goto L60
        L59:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5d:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L60:
            T r4 = r0.f75329b
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
            if (r4 == r5) goto L67
            return r4
        L67:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "螵\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.a(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.d
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$d r0 = (kotlinx.coroutines.flow.y.d) r0
            int r1 = r0.f80615f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80615f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$d r0 = new kotlinx.coroutines.flow.y$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f80614e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80615f
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.f80613d
            kotlinx.coroutines.flow.y$b r4 = (kotlinx.coroutines.flow.y.b) r4
            java.lang.Object r5 = r0.f80612c
            kotlin.jvm.internal.k1$h r5 = (kotlin.jvm.internal.k1.h) r5
            java.lang.Object r0 = r0.f80611b
            ld.p r0 = (ld.p) r0
            kotlin.a1.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L33
            goto L68
        L33:
            r6 = move-exception
            goto L65
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L41:
            kotlin.jvm.internal.k1$h r6 = androidx.compose.foundation.text.g.a(r6)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.internal.s.f80148a
            r6.f75329b = r2
            kotlinx.coroutines.flow.y$b r2 = new kotlinx.coroutines.flow.y$b
            r2.<init>(r5, r6)
            r0.f80611b = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r0.f80612c = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r0.f80613d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r0.f80615f = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            if (r4 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r5 = r6
            goto L68
        L60:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L65:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
        L68:
            T r4 = r5.f75329b
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
            if (r4 == r5) goto L6f
            return r4
        L6f:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "螶\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.b(kotlinx.coroutines.flow.i, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.g
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$g r0 = (kotlinx.coroutines.flow.y.g) r0
            int r1 = r0.f80627e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80627e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$g r0 = new kotlinx.coroutines.flow.y$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f80626d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80627e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f80625c
            kotlinx.coroutines.flow.y$e r4 = (kotlinx.coroutines.flow.y.e) r4
            java.lang.Object r0 = r0.f80624b
            kotlin.jvm.internal.k1$h r0 = (kotlin.jvm.internal.k1.h) r0
            kotlin.a1.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L5c
        L2f:
            r5 = move-exception
            goto L59
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.jvm.internal.k1$h r5 = androidx.compose.foundation.text.g.a(r5)
            kotlinx.coroutines.flow.y$e r2 = new kotlinx.coroutines.flow.y$e
            r2.<init>(r5)
            r0.f80624b = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f80625c = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f80627e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            if (r4 != r1) goto L53
            return r1
        L53:
            r0 = r5
            goto L5c
        L55:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L59:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L5c:
            T r4 = r0.f75329b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.c(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.h
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$h r0 = (kotlinx.coroutines.flow.y.h) r0
            int r1 = r0.f80631e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80631e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$h r0 = new kotlinx.coroutines.flow.y$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f80630d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80631e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f80629c
            kotlinx.coroutines.flow.y$f r4 = (kotlinx.coroutines.flow.y.f) r4
            java.lang.Object r5 = r0.f80628b
            kotlin.jvm.internal.k1$h r5 = (kotlin.jvm.internal.k1.h) r5
            kotlin.a1.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L5c
        L2f:
            r6 = move-exception
            goto L59
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.jvm.internal.k1$h r6 = androidx.compose.foundation.text.g.a(r6)
            kotlinx.coroutines.flow.y$f r2 = new kotlinx.coroutines.flow.y$f
            r2.<init>(r5, r6)
            r0.f80628b = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f80629c = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f80631e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            if (r4 != r1) goto L53
            return r1
        L53:
            r5 = r6
            goto L5c
        L55:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L59:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
        L5c:
            T r4 = r5.f75329b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.d(kotlinx.coroutines.flow.i, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, R> java.lang.Object e(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, R r5, @fg.l ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends java.lang.Object> r6, @fg.l kotlin.coroutines.d<? super R> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.y.i
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.y$i r0 = (kotlinx.coroutines.flow.y.i) r0
            int r1 = r0.f80634d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80634d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$i r0 = new kotlinx.coroutines.flow.y$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f80633c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80634d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f80632b
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r7)
            goto L4e
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.jvm.internal.k1$h r7 = androidx.compose.foundation.text.g.a(r7)
            r7.f75329b = r5
            kotlinx.coroutines.flow.y$j r5 = new kotlinx.coroutines.flow.y$j
            r5.<init>(r7, r6)
            r0.f80632b = r7
            r0.f80634d = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r7
        L4e:
            T r4 = r4.f75329b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.e(kotlinx.coroutines.flow.i, java.lang.Object, ld.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object f(kotlinx.coroutines.flow.i<? extends T> iVar, R r4, ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super R> dVar) {
        k1.h hVar = new k1.h();
        hVar.f75329b = r4;
        iVar.a(new j(hVar, qVar), dVar);
        return hVar.f75329b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object g(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.k
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$k r0 = (kotlinx.coroutines.flow.y.k) r0
            int r1 = r0.f80643d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80643d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$k r0 = new kotlinx.coroutines.flow.y$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f80642c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80643d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f80641b
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r5)
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.jvm.internal.k1$h r5 = androidx.compose.foundation.text.g.a(r5)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.internal.s.f80148a
            r5.f75329b = r2
            kotlinx.coroutines.flow.y$l r2 = new kotlinx.coroutines.flow.y$l
            r2.<init>(r5)
            r0.f80641b = r5
            r0.f80643d = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r5
        L50:
            T r4 = r4.f75329b
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
            if (r4 == r5) goto L57
            return r4
        L57:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "螵\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.g(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object h(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.m
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$m r0 = (kotlinx.coroutines.flow.y.m) r0
            int r1 = r0.f80647d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80647d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$m r0 = new kotlinx.coroutines.flow.y$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f80646c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80647d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f80645b
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r5)
            goto L4c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.jvm.internal.k1$h r5 = androidx.compose.foundation.text.g.a(r5)
            kotlinx.coroutines.flow.y$n r2 = new kotlinx.coroutines.flow.y$n
            r2.<init>(r5)
            r0.f80645b = r5
            r0.f80647d = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = r5
        L4c:
            T r4 = r4.f75329b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.h(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.s0] */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T extends S> java.lang.Object i(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l ld.q<? super S, ? super T, ? super kotlin.coroutines.d<? super S>, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<? super S> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.o
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$o r0 = (kotlinx.coroutines.flow.y.o) r0
            int r1 = r0.f80651d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80651d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$o r0 = new kotlinx.coroutines.flow.y$o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f80650c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80651d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f80649b
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.jvm.internal.k1$h r6 = androidx.compose.foundation.text.g.a(r6)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.internal.s.f80148a
            r6.f75329b = r2
            kotlinx.coroutines.flow.y$p r2 = new kotlinx.coroutines.flow.y$p
            r2.<init>(r6, r5)
            r0.f80649b = r6
            r0.f80651d = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r6
        L50:
            T r4 = r4.f75329b
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
            if (r4 == r5) goto L57
            return r4
        L57:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "螷\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.i(kotlinx.coroutines.flow.i, ld.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object j(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.q
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$q r0 = (kotlinx.coroutines.flow.y.q) r0
            int r1 = r0.f80660d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80660d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$q r0 = new kotlinx.coroutines.flow.y$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f80659c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80660d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f80658b
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r5)
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.jvm.internal.k1$h r5 = androidx.compose.foundation.text.g.a(r5)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.internal.s.f80148a
            r5.f75329b = r2
            kotlinx.coroutines.flow.y$r r2 = new kotlinx.coroutines.flow.y$r
            r2.<init>(r5)
            r0.f80658b = r5
            r0.f80660d = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r5
        L50:
            T r4 = r4.f75329b
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
            if (r4 == r5) goto L57
            return r4
        L57:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "螸\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.j(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object k(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.t
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$t r0 = (kotlinx.coroutines.flow.y.t) r0
            int r1 = r0.f80666e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80666e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$t r0 = new kotlinx.coroutines.flow.y$t
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f80665d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80666e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f80664c
            kotlinx.coroutines.flow.y$s r4 = (kotlinx.coroutines.flow.y.s) r4
            java.lang.Object r0 = r0.f80663b
            kotlin.jvm.internal.k1$h r0 = (kotlin.jvm.internal.k1.h) r0
            kotlin.a1.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L60
        L2f:
            r5 = move-exception
            goto L5d
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螴\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.jvm.internal.k1$h r5 = androidx.compose.foundation.text.g.a(r5)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.internal.s.f80148a
            r5.f75329b = r2
            kotlinx.coroutines.flow.y$s r2 = new kotlinx.coroutines.flow.y$s
            r2.<init>(r5)
            r0.f80663b = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f80664c = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f80666e = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            if (r4 != r1) goto L57
            return r1
        L57:
            r0 = r5
            goto L60
        L59:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5d:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L60:
            T r4 = r0.f75329b
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
            if (r4 != r5) goto L67
            r4 = 0
        L67:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.k(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }
}
