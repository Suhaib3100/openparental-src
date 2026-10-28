package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.k1;
import kotlin.m2;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Reduce.kt */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001au\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a{\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u00012H\b\u0004\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a#\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u001aG\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001aI\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a#\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013\u001a%\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "accumulator", "value", "Lkotlin/coroutines/d;", "", "operation", "i", "(Lkotlinx/coroutines/flow/i;Lq3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "R", "initial", "acc", "e", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lq3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "a", "Lkotlin/Function2;", "", "predicate", "b", "(Lkotlinx/coroutines/flow/i;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "d", "g", "h", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h f28553o;

        public a(k1.h hVar) {
            this.f28553o = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            this.f28553o.f23572o = t5;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.p f28554o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ k1.h f28555p;

        /* compiled from: Limit.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28556r;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f28557s;

            /* renamed from: t, reason: collision with root package name */
            int f28558t;

            /* renamed from: v, reason: collision with root package name */
            Object f28560v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28557s = obj;
                this.f28558t |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        public b(q3.p pVar, k1.h hVar) {
            this.f28554o = pVar;
            this.f28555p = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(T r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.y$b$a r0 = (kotlinx.coroutines.flow.y.b.a) r0
                int r1 = r0.f28558t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28558t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$b$a r0 = new kotlinx.coroutines.flow.y$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f28557s
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28558t
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f28560v
                java.lang.Object r0 = r0.f28556r
                kotlinx.coroutines.flow.y$b r0 = (kotlinx.coroutines.flow.y.b) r0
                kotlin.a1.n(r6)
                goto L4c
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "嶰"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L39:
                kotlin.a1.n(r6)
                q3.p r6 = r4.f28554o
                r0.f28556r = r4
                r0.f28560v = r5
                r0.f28558t = r3
                java.lang.Object r6 = r6.g0(r5, r0)
                if (r6 != r1) goto L4b
                return r1
            L4b:
                r0 = r4
            L4c:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L59
                kotlin.jvm.internal.k1$h r6 = r0.f28555p
                r6.f23572o = r5
                r3 = 0
            L59:
                if (r3 == 0) goto L5e
                kotlin.m2 r5 = kotlin.m2.f23662a
                return r5
            L5e:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.b.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class c<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28561r;

        /* renamed from: s, reason: collision with root package name */
        Object f28562s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28563t;

        /* renamed from: u, reason: collision with root package name */
        int f28564u;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28563t = obj;
            this.f28564u |= Integer.MIN_VALUE;
            return y.a(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {183}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class d<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28565r;

        /* renamed from: s, reason: collision with root package name */
        Object f28566s;

        /* renamed from: t, reason: collision with root package name */
        Object f28567t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f28568u;

        /* renamed from: v, reason: collision with root package name */
        int f28569v;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28568u = obj;
            this.f28569v |= Integer.MIN_VALUE;
            return y.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h f28570o;

        public e(k1.h hVar) {
            this.f28570o = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            this.f28570o.f23572o = t5;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.p f28571o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ k1.h f28572p;

        /* compiled from: Limit.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28573r;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f28574s;

            /* renamed from: t, reason: collision with root package name */
            int f28575t;

            /* renamed from: v, reason: collision with root package name */
            Object f28577v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28574s = obj;
                this.f28575t |= Integer.MIN_VALUE;
                return f.this.b(null, this);
            }
        }

        public f(q3.p pVar, k1.h hVar) {
            this.f28571o = pVar;
            this.f28572p = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(T r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.f.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.y$f$a r0 = (kotlinx.coroutines.flow.y.f.a) r0
                int r1 = r0.f28575t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28575t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$f$a r0 = new kotlinx.coroutines.flow.y$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f28574s
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28575t
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f28577v
                java.lang.Object r0 = r0.f28573r
                kotlinx.coroutines.flow.y$f r0 = (kotlinx.coroutines.flow.y.f) r0
                kotlin.a1.n(r6)
                goto L4c
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "嶱"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L39:
                kotlin.a1.n(r6)
                q3.p r6 = r4.f28571o
                r0.f28573r = r4
                r0.f28577v = r5
                r0.f28575t = r3
                java.lang.Object r6 = r6.g0(r5, r0)
                if (r6 != r1) goto L4b
                return r1
            L4b:
                r0 = r4
            L4c:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L59
                kotlin.jvm.internal.k1$h r6 = r0.f28572p
                r6.f23572o = r5
                r3 = 0
            L59:
                if (r3 == 0) goto L5e
                kotlin.m2 r5 = kotlin.m2.f23662a
                return r5
            L5e:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.f.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class g<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28578r;

        /* renamed from: s, reason: collision with root package name */
        Object f28579s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28580t;

        /* renamed from: u, reason: collision with root package name */
        int f28581u;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28580t = obj;
            this.f28581u |= Integer.MIN_VALUE;
            return y.c(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class h<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28582r;

        /* renamed from: s, reason: collision with root package name */
        Object f28583s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28584t;

        /* renamed from: u, reason: collision with root package name */
        int f28585u;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28584t = obj;
            this.f28585u |= Integer.MIN_VALUE;
            return y.d(null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
    /* loaded from: classes6.dex */
    static final class i<T, R> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28586r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28587s;

        /* renamed from: t, reason: collision with root package name */
        int f28588t;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28587s = obj;
            this.f28588t |= Integer.MIN_VALUE;
            return y.e(null, null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class j<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h<R> f28589o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q<R, T, Continuation<? super R>, Object> f28590p;

        /* compiled from: Reduce.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {45}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28591r;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f28592s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ j<T> f28593t;

            /* renamed from: u, reason: collision with root package name */
            int f28594u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28593t = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28592s = obj;
                this.f28594u |= Integer.MIN_VALUE;
                return this.f28593t.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public j(k1.h<R> hVar, q3.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
            this.f28589o = hVar;
            this.f28590p = qVar;
        }

        @d5.e
        public final Object a(T t5, @d5.d Continuation<? super m2> continuation) {
            new a(this, continuation);
            k1.h<R> hVar = this.f28589o;
            hVar.f23572o = (T) this.f28590p.G(hVar.f23572o, t5, continuation);
            return m2.f23662a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.y.j.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.y$j$a r0 = (kotlinx.coroutines.flow.y.j.a) r0
                int r1 = r0.f28594u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28594u = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$j$a r0 = new kotlinx.coroutines.flow.y$j$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f28592s
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28594u
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r7 = r0.f28591r
                kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
                kotlin.a1.n(r8)
                goto L4e
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "嶲"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L37:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$h<R> r8 = r6.f28589o
                q3.q<R, T, kotlin.coroutines.d<? super R>, java.lang.Object> r2 = r6.f28590p
                T r4 = r8.f23572o
                r0.f28591r = r8
                r0.f28594u = r3
                java.lang.Object r7 = r2.G(r4, r7, r0)
                if (r7 != r1) goto L4b
                return r1
            L4b:
                r5 = r8
                r8 = r7
                r7 = r5
            L4e:
                r7.f23572o = r8
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.j.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class k<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28595r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28596s;

        /* renamed from: t, reason: collision with root package name */
        int f28597t;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28596s = obj;
            this.f28597t |= Integer.MIN_VALUE;
            return y.g(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class l<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f28598o;

        l(k1.h<Object> hVar) {
            this.f28598o = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public final Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            this.f28598o.f23572o = t5;
            return m2.f23662a;
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {167}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class m<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28599r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28600s;

        /* renamed from: t, reason: collision with root package name */
        int f28601t;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28600s = obj;
            this.f28601t |= Integer.MIN_VALUE;
            return y.h(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class n<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h<T> f28602o;

        n(k1.h<T> hVar) {
            this.f28602o = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public final Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            this.f28602o.f23572o = t5;
            return m2.f23662a;
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class o<S, T extends S> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28603r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28604s;

        /* renamed from: t, reason: collision with root package name */
        int f28605t;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28604s = obj;
            this.f28605t |= Integer.MIN_VALUE;
            return y.i(null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class p<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f28606o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q<S, T, Continuation<? super S>, Object> f28607p;

        /* compiled from: Reduce.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28608r;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f28609s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ p<T> f28610t;

            /* renamed from: u, reason: collision with root package name */
            int f28611u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super T> pVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28610t = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28609s = obj;
                this.f28611u |= Integer.MIN_VALUE;
                return this.f28610t.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        p(k1.h<Object> hVar, q3.q<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> qVar) {
            this.f28606o = hVar;
            this.f28607p = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.y.p.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.y$p$a r0 = (kotlinx.coroutines.flow.y.p.a) r0
                int r1 = r0.f28611u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28611u = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$p$a r0 = new kotlinx.coroutines.flow.y$p$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f28609s
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28611u
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r7 = r0.f28608r
                kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
                kotlin.a1.n(r8)
                goto L52
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "嶳"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L37:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$h<java.lang.Object> r8 = r6.f28606o
                T r2 = r8.f23572o
                kotlinx.coroutines.internal.r0 r4 = kotlinx.coroutines.flow.internal.s.f28115a
                if (r2 == r4) goto L55
                q3.q<S, T, kotlin.coroutines.d<? super S>, java.lang.Object> r4 = r6.f28607p
                r0.f28608r = r8
                r0.f28611u = r3
                java.lang.Object r7 = r4.G(r2, r7, r0)
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
                r8.f23572o = r7
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.p.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = "single", n = {"result"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class q<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28612r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28613s;

        /* renamed from: t, reason: collision with root package name */
        int f28614t;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28613s = obj;
            this.f28614t |= Integer.MIN_VALUE;
            return y.j(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class r<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f28615o;

        r(k1.h<Object> hVar) {
            this.f28615o = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public final Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            k1.h<Object> hVar = this.f28615o;
            if (!(hVar.f23572o == kotlinx.coroutines.flow.internal.s.f28115a)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("嶴").toString());
            }
            hVar.f23572o = t5;
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class s<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h f28616o;

        public s(k1.h hVar) {
            this.f28616o = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            boolean z5;
            k1.h hVar = this.f28616o;
            T t6 = hVar.f23572o;
            T t7 = (T) kotlinx.coroutines.flow.internal.s.f28115a;
            if (t6 == t7) {
                hVar.f23572o = t5;
                z5 = true;
            } else {
                hVar.f23572o = t7;
                z5 = false;
            }
            if (z5) {
                return m2.f23662a;
            }
            throw new AbortFlowException(this);
        }
    }

    /* compiled from: Reduce.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class t<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28617r;

        /* renamed from: s, reason: collision with root package name */
        Object f28618s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28619t;

        /* renamed from: u, reason: collision with root package name */
        int f28620u;

        t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28619t = obj;
            this.f28620u |= Integer.MIN_VALUE;
            return y.k(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.c
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$c r0 = (kotlinx.coroutines.flow.y.c) r0
            int r1 = r0.f28564u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28564u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$c r0 = new kotlinx.coroutines.flow.y$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28563t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28564u
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f28562s
            kotlinx.coroutines.flow.y$a r4 = (kotlinx.coroutines.flow.y.a) r4
            java.lang.Object r0 = r0.f28561r
            kotlin.jvm.internal.k1$h r0 = (kotlin.jvm.internal.k1.h) r0
            kotlin.a1.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L64
        L2f:
            r5 = move-exception
            goto L61
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶵"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.a1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.r0 r2 = kotlinx.coroutines.flow.internal.s.f28115a
            r5.f23572o = r2
            kotlinx.coroutines.flow.y$a r2 = new kotlinx.coroutines.flow.y$a
            r2.<init>(r5)
            r0.f28561r = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r0.f28562s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r0.f28564u = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            if (r4 != r1) goto L5b
            return r1
        L5b:
            r0 = r5
            goto L64
        L5d:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L61:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L64:
            T r4 = r0.f23572o
            kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
            if (r4 == r5) goto L6b
            return r4
        L6b:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "嶶"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.a(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d q3.p<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @d5.d kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.d
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$d r0 = (kotlinx.coroutines.flow.y.d) r0
            int r1 = r0.f28569v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28569v = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$d r0 = new kotlinx.coroutines.flow.y$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28568u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28569v
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.f28567t
            kotlinx.coroutines.flow.y$b r4 = (kotlinx.coroutines.flow.y.b) r4
            java.lang.Object r5 = r0.f28566s
            kotlin.jvm.internal.k1$h r5 = (kotlin.jvm.internal.k1.h) r5
            java.lang.Object r0 = r0.f28565r
            q3.p r0 = (q3.p) r0
            kotlin.a1.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L33
            goto L6c
        L33:
            r6 = move-exception
            goto L69
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶷"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L41:
            kotlin.a1.n(r6)
            kotlin.jvm.internal.k1$h r6 = new kotlin.jvm.internal.k1$h
            r6.<init>()
            kotlinx.coroutines.internal.r0 r2 = kotlinx.coroutines.flow.internal.s.f28115a
            r6.f23572o = r2
            kotlinx.coroutines.flow.y$b r2 = new kotlinx.coroutines.flow.y$b
            r2.<init>(r5, r6)
            r0.f28565r = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            r0.f28566s = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            r0.f28567t = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            r0.f28569v = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L64
            if (r4 != r1) goto L61
            return r1
        L61:
            r0 = r5
            r5 = r6
            goto L6c
        L64:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L69:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
        L6c:
            T r4 = r5.f23572o
            kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
            if (r4 == r5) goto L73
            return r4
        L73:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "嶸"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.b(kotlinx.coroutines.flow.i, q3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.g
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$g r0 = (kotlinx.coroutines.flow.y.g) r0
            int r1 = r0.f28581u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28581u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$g r0 = new kotlinx.coroutines.flow.y$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28580t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28581u
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f28579s
            kotlinx.coroutines.flow.y$e r4 = (kotlinx.coroutines.flow.y.e) r4
            java.lang.Object r0 = r0.f28578r
            kotlin.jvm.internal.k1$h r0 = (kotlin.jvm.internal.k1.h) r0
            kotlin.a1.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L60
        L2f:
            r5 = move-exception
            goto L5d
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶹"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.a1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.flow.y$e r2 = new kotlinx.coroutines.flow.y$e
            r2.<init>(r5)
            r0.f28578r = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f28579s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f28581u = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
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
            T r4 = r0.f23572o
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.c(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d q3.p<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @d5.d kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.h
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$h r0 = (kotlinx.coroutines.flow.y.h) r0
            int r1 = r0.f28585u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28585u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$h r0 = new kotlinx.coroutines.flow.y$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28584t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28585u
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f28583s
            kotlinx.coroutines.flow.y$f r4 = (kotlinx.coroutines.flow.y.f) r4
            java.lang.Object r5 = r0.f28582r
            kotlin.jvm.internal.k1$h r5 = (kotlin.jvm.internal.k1.h) r5
            kotlin.a1.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L60
        L2f:
            r6 = move-exception
            goto L5d
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶺"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.a1.n(r6)
            kotlin.jvm.internal.k1$h r6 = new kotlin.jvm.internal.k1$h
            r6.<init>()
            kotlinx.coroutines.flow.y$f r2 = new kotlinx.coroutines.flow.y$f
            r2.<init>(r5, r6)
            r0.f28582r = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f28583s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f28585u = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            if (r4 != r1) goto L57
            return r1
        L57:
            r5 = r6
            goto L60
        L59:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5d:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
        L60:
            T r4 = r5.f23572o
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.d(kotlinx.coroutines.flow.i, q3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, R> java.lang.Object e(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, R r5, @d5.d q3.q<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6, @d5.d kotlin.coroutines.Continuation<? super R> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.y.i
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.y$i r0 = (kotlinx.coroutines.flow.y.i) r0
            int r1 = r0.f28588t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28588t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$i r0 = new kotlinx.coroutines.flow.y$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28587s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28588t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f28586r
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r7)
            goto L52
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶻"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r7)
            kotlin.jvm.internal.k1$h r7 = new kotlin.jvm.internal.k1$h
            r7.<init>()
            r7.f23572o = r5
            kotlinx.coroutines.flow.y$j r5 = new kotlinx.coroutines.flow.y$j
            r5.<init>(r7, r6)
            r0.f28586r = r7
            r0.f28588t = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r7
        L52:
            T r4 = r4.f23572o
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.e(kotlinx.coroutines.flow.i, java.lang.Object, q3.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object f(kotlinx.coroutines.flow.i<? extends T> iVar, R r5, q3.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super R> continuation) {
        k1.h hVar = new k1.h();
        hVar.f23572o = r5;
        iVar.a(new j(hVar, qVar), continuation);
        return hVar.f23572o;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object g(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.k
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$k r0 = (kotlinx.coroutines.flow.y.k) r0
            int r1 = r0.f28597t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28597t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$k r0 = new kotlinx.coroutines.flow.y$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28596s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28597t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f28595r
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r5)
            goto L54
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶼"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.r0 r2 = kotlinx.coroutines.flow.internal.s.f28115a
            r5.f23572o = r2
            kotlinx.coroutines.flow.y$l r2 = new kotlinx.coroutines.flow.y$l
            r2.<init>(r5)
            r0.f28595r = r5
            r0.f28597t = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            r4 = r5
        L54:
            T r4 = r4.f23572o
            kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
            if (r4 == r5) goto L5b
            return r4
        L5b:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "嶽"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.g(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object h(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.m
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$m r0 = (kotlinx.coroutines.flow.y.m) r0
            int r1 = r0.f28601t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28601t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$m r0 = new kotlinx.coroutines.flow.y$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28600s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28601t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f28599r
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r5)
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶾"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.flow.y$n r2 = new kotlinx.coroutines.flow.y$n
            r2.<init>(r5)
            r0.f28599r = r5
            r0.f28601t = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r5
        L50:
            T r4 = r4.f23572o
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.h(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.r0] */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T extends S> java.lang.Object i(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d q3.q<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> r5, @d5.d kotlin.coroutines.Continuation<? super S> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.o
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$o r0 = (kotlinx.coroutines.flow.y.o) r0
            int r1 = r0.f28605t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28605t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$o r0 = new kotlinx.coroutines.flow.y$o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28604s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28605t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f28603r
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r6)
            goto L54
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶿"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r6)
            kotlin.jvm.internal.k1$h r6 = new kotlin.jvm.internal.k1$h
            r6.<init>()
            kotlinx.coroutines.internal.r0 r2 = kotlinx.coroutines.flow.internal.s.f28115a
            r6.f23572o = r2
            kotlinx.coroutines.flow.y$p r2 = new kotlinx.coroutines.flow.y$p
            r2.<init>(r6, r5)
            r0.f28603r = r6
            r0.f28605t = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            r4 = r6
        L54:
            T r4 = r4.f23572o
            kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
            if (r4 == r5) goto L5b
            return r4
        L5b:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "巀"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.i(kotlinx.coroutines.flow.i, q3.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object j(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.q
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$q r0 = (kotlinx.coroutines.flow.y.q) r0
            int r1 = r0.f28614t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28614t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$q r0 = new kotlinx.coroutines.flow.y$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28613s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28614t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f28612r
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r5)
            goto L54
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "巁"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.r0 r2 = kotlinx.coroutines.flow.internal.s.f28115a
            r5.f23572o = r2
            kotlinx.coroutines.flow.y$r r2 = new kotlinx.coroutines.flow.y$r
            r2.<init>(r5)
            r0.f28612r = r5
            r0.f28614t = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            r4 = r5
        L54:
            T r4 = r4.f23572o
            kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
            if (r4 == r5) goto L5b
            return r4
        L5b:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "巂"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.j(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object k(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.t
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$t r0 = (kotlinx.coroutines.flow.y.t) r0
            int r1 = r0.f28620u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28620u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$t r0 = new kotlinx.coroutines.flow.y$t
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28619t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28620u
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f28618s
            kotlinx.coroutines.flow.y$s r4 = (kotlinx.coroutines.flow.y.s) r4
            java.lang.Object r0 = r0.f28617r
            kotlin.jvm.internal.k1$h r0 = (kotlin.jvm.internal.k1.h) r0
            kotlin.a1.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L64
        L2f:
            r5 = move-exception
            goto L61
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "巃"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.a1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.r0 r2 = kotlinx.coroutines.flow.internal.s.f28115a
            r5.f23572o = r2
            kotlinx.coroutines.flow.y$s r2 = new kotlinx.coroutines.flow.y$s
            r2.<init>(r5)
            r0.f28617r = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r0.f28618s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            r0.f28620u = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5d
            if (r4 != r1) goto L5b
            return r1
        L5b:
            r0 = r5
            goto L64
        L5d:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L61:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L64:
            T r4 = r0.f23572o
            kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
            if (r4 != r5) goto L6b
            r4 = 0
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.k(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }
}
