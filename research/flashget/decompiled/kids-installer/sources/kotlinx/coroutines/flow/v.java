package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.k1;
import kotlin.m2;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.apache.log4j.net.SyslogAppender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Limit.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000b\u001ar\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\u0001\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "count", "d", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "e", "(Lkotlinx/coroutines/flow/i;Lq3/p;)Lkotlinx/coroutines/flow/i;", "g", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "f", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "h", "R", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "Lkotlin/u;", "transform", "i", "(Lkotlinx/coroutines/flow/i;Lq3/q;)Lkotlinx/coroutines/flow/i;", "b", "(Lkotlinx/coroutines/flow/i;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class v {

    /* compiled from: Limit.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {SyslogAppender.LOG_LOCAL1}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
    /* loaded from: classes6.dex */
    static final class a<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28435r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28436s;

        /* renamed from: t, reason: collision with root package name */
        int f28437t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28436s = obj;
            this.f28437t |= Integer.MIN_VALUE;
            return v.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.p<T, Continuation<? super Boolean>, Object> f28438o;

        /* compiled from: Limit.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {130}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28439r;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f28440s;

            /* renamed from: u, reason: collision with root package name */
            int f28442u;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28440s = obj;
                this.f28442u |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
            this.f28438o = pVar;
        }

        @d5.e
        public Object a(T t5, @d5.d Continuation<? super m2> continuation) {
            new a(continuation);
            if (((Boolean) this.f28438o.g0(t5, continuation)).booleanValue()) {
                return m2.f23662a;
            }
            throw new AbortFlowException(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.v$b$a r0 = (kotlinx.coroutines.flow.v.b.a) r0
                int r1 = r0.f28442u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28442u = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$b$a r0 = new kotlinx.coroutines.flow.v$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f28440s
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28442u
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r5 = r0.f28439r
                kotlinx.coroutines.flow.v$b r5 = (kotlinx.coroutines.flow.v.b) r5
                kotlin.a1.n(r6)
                goto L48
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "嶙"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.a1.n(r6)
                q3.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f28438o
                r0.f28439r = r4
                r0.f28442u = r3
                java.lang.Object r6 = r6.g0(r5, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                r5 = r4
            L48:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L53
                kotlin.m2 r5 = kotlin.m2.f23662a
                return r5
            L53:
                kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.b.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f28443o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f28444p;

        public c(kotlinx.coroutines.flow.i iVar, int i5) {
            this.f28443o = iVar;
            this.f28444p = i5;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
            Object a6 = this.f28443o.a(new d(new k1.f(), this.f28444p, jVar), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class d<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.f f28445o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f28446p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f28447q;

        /* compiled from: Limit.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28448r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ d<T> f28449s;

            /* renamed from: t, reason: collision with root package name */
            int f28450t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28449s = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28448r = obj;
                this.f28450t |= Integer.MIN_VALUE;
                return this.f28449s.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(k1.f fVar, int i5, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f28445o = fVar;
            this.f28446p = i5;
            this.f28447q = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.d.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$d$a r0 = (kotlinx.coroutines.flow.v.d.a) r0
                int r1 = r0.f28450t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28450t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$d$a r0 = new kotlinx.coroutines.flow.v$d$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f28448r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28450t
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r7)
                goto L49
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "嶚"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L33:
                kotlin.a1.n(r7)
                kotlin.jvm.internal.k1$f r7 = r5.f28445o
                int r2 = r7.f23570o
                int r4 = r5.f28446p
                if (r2 < r4) goto L4c
                kotlinx.coroutines.flow.j<T> r7 = r5.f28447q
                r0.f28450t = r3
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L49
                return r1
            L49:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            L4c:
                int r2 = r2 + r3
                r7.f23570o = r2
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.d.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f28451o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f28452p;

        public e(kotlinx.coroutines.flow.i iVar, q3.p pVar) {
            this.f28451o = iVar;
            this.f28452p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
            Object a6 = this.f28451o.a(new f(new k1.a(), jVar, this.f28452p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class f<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.a f28453o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f28454p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ q3.p<T, Continuation<? super Boolean>, Object> f28455q;

        /* compiled from: Limit.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28456r;

            /* renamed from: s, reason: collision with root package name */
            Object f28457s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f28458t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ f<T> f28459u;

            /* renamed from: v, reason: collision with root package name */
            int f28460v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f<? super T> fVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28459u = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28458t = obj;
                this.f28460v |= Integer.MIN_VALUE;
                return this.f28459u.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        f(k1.a aVar, kotlinx.coroutines.flow.j<? super T> jVar, q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
            this.f28453o = aVar;
            this.f28454p = jVar;
            this.f28455q = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.v.f.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.v$f$a r0 = (kotlinx.coroutines.flow.v.f.a) r0
                int r1 = r0.f28460v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28460v = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$f$a r0 = new kotlinx.coroutines.flow.v$f$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f28458t
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28460v
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L47
                if (r2 == r5) goto L43
                if (r2 == r4) goto L39
                if (r2 != r3) goto L2d
                kotlin.a1.n(r8)
                goto L8a
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "嶛"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L39:
                java.lang.Object r7 = r0.f28457s
                java.lang.Object r2 = r0.f28456r
                kotlinx.coroutines.flow.v$f r2 = (kotlinx.coroutines.flow.v.f) r2
                kotlin.a1.n(r8)
                goto L6e
            L43:
                kotlin.a1.n(r8)
                goto L5b
            L47:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$a r8 = r6.f28453o
                boolean r8 = r8.f23565o
                if (r8 == 0) goto L5e
                kotlinx.coroutines.flow.j<T> r8 = r6.f28454p
                r0.f28460v = r5
                java.lang.Object r7 = r8.b(r7, r0)
                if (r7 != r1) goto L5b
                return r1
            L5b:
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            L5e:
                q3.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f28455q
                r0.f28456r = r6
                r0.f28457s = r7
                r0.f28460v = r4
                java.lang.Object r8 = r8.g0(r7, r0)
                if (r8 != r1) goto L6d
                return r1
            L6d:
                r2 = r6
            L6e:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8d
                kotlin.jvm.internal.k1$a r8 = r2.f28453o
                r8.f23565o = r5
                kotlinx.coroutines.flow.j<T> r8 = r2.f28454p
                r2 = 0
                r0.f28456r = r2
                r0.f28457s = r2
                r0.f28460v = r3
                java.lang.Object r7 = r8.b(r7, r0)
                if (r7 != r1) goto L8a
                return r1
            L8a:
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            L8d:
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.f.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Limit.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class g<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28461r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28462s;

        /* renamed from: t, reason: collision with root package name */
        int f28463t;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28462s = obj;
            this.f28463t |= Integer.MIN_VALUE;
            return v.f(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class h<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f28464o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f28465p;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"$this$take_u24lambda_u2d4"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28466r;

            /* renamed from: s, reason: collision with root package name */
            int f28467s;

            /* renamed from: u, reason: collision with root package name */
            Object f28469u;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28466r = obj;
                this.f28467s |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(kotlinx.coroutines.flow.i iVar, int i5) {
            this.f28464o = iVar;
            this.f28465p = i5;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            kotlinx.coroutines.flow.internal.o.b(r8, r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.v.h.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.v$h$a r0 = (kotlinx.coroutines.flow.v.h.a) r0
                int r1 = r0.f28467s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28467s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$h$a r0 = new kotlinx.coroutines.flow.v$h$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f28466r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28467s
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r7 = r0.f28469u
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                kotlin.a1.n(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
                goto L57
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "嶜"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L37:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$f r8 = new kotlin.jvm.internal.k1$f
                r8.<init>()
                kotlinx.coroutines.flow.i r2 = r6.f28464o     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
                kotlinx.coroutines.flow.v$i r4 = new kotlinx.coroutines.flow.v$i     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
                int r5 = r6.f28465p     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
                r0.f28469u = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
                r0.f28467s = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
                java.lang.Object r7 = r2.a(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L53
                if (r7 != r1) goto L57
                return r1
            L53:
                r8 = move-exception
                kotlinx.coroutines.flow.internal.o.b(r8, r7)
            L57:
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.h.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class i<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.f f28470o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f28471p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f28472q;

        /* compiled from: Limit.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28473r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ i<T> f28474s;

            /* renamed from: t, reason: collision with root package name */
            int f28475t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(i<? super T> iVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28474s = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28473r = obj;
                this.f28475t |= Integer.MIN_VALUE;
                return this.f28474s.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(k1.f fVar, int i5, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f28470o = fVar;
            this.f28471p = i5;
            this.f28472q = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.i.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$i$a r0 = (kotlinx.coroutines.flow.v.i.a) r0
                int r1 = r0.f28475t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28475t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$i$a r0 = new kotlinx.coroutines.flow.v$i$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f28473r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28475t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r7)
                goto L61
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "嶝"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L36:
                kotlin.a1.n(r7)
                goto L53
            L3a:
                kotlin.a1.n(r7)
                kotlin.jvm.internal.k1$f r7 = r5.f28470o
                int r2 = r7.f23570o
                int r2 = r2 + r4
                r7.f23570o = r2
                int r7 = r5.f28471p
                if (r2 >= r7) goto L56
                kotlinx.coroutines.flow.j<T> r7 = r5.f28472q
                r0.f28475t = r4
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L53
                return r1
            L53:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            L56:
                kotlinx.coroutines.flow.j<T> r7 = r5.f28472q
                r0.f28475t = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.v.a(r7, r6, r0)
                if (r6 != r1) goto L61
                return r1
            L61:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.i.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class j<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f28476o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f28477p;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {124}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28478r;

            /* renamed from: s, reason: collision with root package name */
            int f28479s;

            /* renamed from: u, reason: collision with root package name */
            Object f28481u;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28478r = obj;
                this.f28479s |= Integer.MIN_VALUE;
                return j.this.a(null, this);
            }
        }

        public j(kotlinx.coroutines.flow.i iVar, q3.p pVar) {
            this.f28476o = iVar;
            this.f28477p = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.j.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$j$a r0 = (kotlinx.coroutines.flow.v.j.a) r0
                int r1 = r0.f28479s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28479s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$j$a r0 = new kotlinx.coroutines.flow.v$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28478r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28479s
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                java.lang.Object r6 = r0.f28481u
                kotlinx.coroutines.flow.v$k r6 = (kotlinx.coroutines.flow.v.k) r6
                kotlin.a1.n(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                goto L55
            L2b:
                r7 = move-exception
                goto L52
            L2d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "嶞"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L39:
                kotlin.a1.n(r7)
                kotlinx.coroutines.flow.i r7 = r5.f28476o
                kotlinx.coroutines.flow.v$k r2 = new kotlinx.coroutines.flow.v$k
                q3.p r4 = r5.f28477p
                r2.<init>(r4, r6)
                r0.f28481u = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L50
                r0.f28479s = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L50
                java.lang.Object r6 = r7.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L50
                if (r6 != r1) goto L55
                return r1
            L50:
                r7 = move-exception
                r6 = r2
            L52:
                kotlinx.coroutines.flow.internal.o.b(r7, r6)
            L55:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.j.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class k<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.p f28482o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j f28483p;

        /* compiled from: Limit.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28484r;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f28485s;

            /* renamed from: t, reason: collision with root package name */
            int f28486t;

            /* renamed from: v, reason: collision with root package name */
            Object f28488v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28485s = obj;
                this.f28486t |= Integer.MIN_VALUE;
                return k.this.b(null, this);
            }
        }

        public k(q3.p pVar, kotlinx.coroutines.flow.j jVar) {
            this.f28482o = pVar;
            this.f28483p = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(T r8, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.v.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.v$k$a r0 = (kotlinx.coroutines.flow.v.k.a) r0
                int r1 = r0.f28486t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28486t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$k$a r0 = new kotlinx.coroutines.flow.v$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28485s
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28486t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L48
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L2e
                java.lang.Object r8 = r0.f28484r
                kotlinx.coroutines.flow.v$k r8 = (kotlinx.coroutines.flow.v.k) r8
                kotlin.a1.n(r9)
                goto L76
            L2e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "嶟"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L3a:
                java.lang.Object r8 = r0.f28488v
                java.lang.Object r2 = r0.f28484r
                kotlinx.coroutines.flow.v$k r2 = (kotlinx.coroutines.flow.v.k) r2
                kotlin.a1.n(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L5d
            L48:
                kotlin.a1.n(r9)
                q3.p r9 = r7.f28482o
                r0.f28484r = r7
                r0.f28488v = r8
                r0.f28486t = r4
                java.lang.Object r9 = r9.g0(r8, r0)
                if (r9 != r1) goto L5a
                return r1
            L5a:
                r2 = r9
                r9 = r8
                r8 = r7
            L5d:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L75
                kotlinx.coroutines.flow.j r2 = r8.f28483p
                r0.f28484r = r8
                r5 = 0
                r0.f28488v = r5
                r0.f28486t = r3
                java.lang.Object r9 = r2.b(r9, r0)
                if (r9 != r1) goto L76
                return r1
            L75:
                r4 = 0
            L76:
                if (r4 == 0) goto L7b
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            L7b:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.k.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Limit.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {SyslogAppender.LOG_LOCAL3}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class l<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28489s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28490t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f28491u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.q<kotlinx.coroutines.flow.j<? super R>, T, Continuation<? super Boolean>, Object> f28492v;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Limit.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes5.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ q3.q f28493o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f28494p;

            /* compiled from: Limit.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {142}, m = "emit", n = {"this"}, s = {"L$0"})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.v$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0445a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                Object f28495r;

                /* renamed from: s, reason: collision with root package name */
                /* synthetic */ Object f28496s;

                /* renamed from: t, reason: collision with root package name */
                int f28497t;

                public C0445a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f28496s = obj;
                    this.f28497t |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(q3.q qVar, kotlinx.coroutines.flow.j jVar) {
                this.f28493o = qVar;
                this.f28494p = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
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
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.l.a.C0445a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.v$l$a$a r0 = (kotlinx.coroutines.flow.v.l.a.C0445a) r0
                    int r1 = r0.f28497t
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28497t = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.v$l$a$a r0 = new kotlinx.coroutines.flow.v$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f28496s
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f28497t
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2b
                    java.lang.Object r5 = r0.f28495r
                    kotlinx.coroutines.flow.v$l$a r5 = (kotlinx.coroutines.flow.v.l.a) r5
                    kotlin.a1.n(r6)
                    goto L4a
                L2b:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "嶠"
                    java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L37:
                    kotlin.a1.n(r6)
                    q3.q r6 = r4.f28493o
                    kotlinx.coroutines.flow.j r2 = r4.f28494p
                    r0.f28495r = r4
                    r0.f28497t = r3
                    java.lang.Object r6 = r6.G(r2, r5, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    r5 = r4
                L4a:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L55
                    kotlin.m2 r5 = kotlin.m2.f23662a
                    return r5
                L55:
                    kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.l.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(kotlinx.coroutines.flow.i<? extends T> iVar, q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> qVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f28491u = iVar;
            this.f28492v = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28489s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f28490t;
                kotlinx.coroutines.flow.i<T> iVar = this.f28491u;
                a aVar2 = new a(this.f28492v, jVar);
                try {
                    this.f28490t = aVar2;
                    this.f28489s = 1;
                    if (iVar.a(aVar2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (AbortFlowException e6) {
                    e = e6;
                    aVar = aVar2;
                    kotlinx.coroutines.flow.internal.o.b(e, aVar);
                    return m2.f23662a;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("鄣"));
                }
                aVar = (a) this.f28490t;
                try {
                    a1.n(obj);
                } catch (AbortFlowException e7) {
                    e = e7;
                    kotlinx.coroutines.flow.internal.o.b(e, aVar);
                    return m2.f23662a;
                }
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((l) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            l lVar = new l(this.f28491u, this.f28492v, continuation);
            lVar.f28490t = obj;
            return lVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d q3.p<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.v$a r0 = (kotlinx.coroutines.flow.v.a) r0
            int r1 = r0.f28437t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28437t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v$a r0 = new kotlinx.coroutines.flow.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28436s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28437t
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f28435r
            kotlinx.coroutines.flow.v$b r4 = (kotlinx.coroutines.flow.v.b) r4
            kotlin.a1.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L51
        L2b:
            r5 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶣"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.a1.n(r6)
            kotlinx.coroutines.flow.v$b r6 = new kotlinx.coroutines.flow.v$b
            r6.<init>(r5)
            r0.f28435r = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            r0.f28437t = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            if (r4 != r1) goto L51
            return r1
        L4c:
            r5 = move-exception
            r4 = r6
        L4e:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L51:
            kotlin.m2 r4 = kotlin.m2.f23662a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.b(kotlinx.coroutines.flow.i, q3.p, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object c(kotlinx.coroutines.flow.i<? extends T> iVar, q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super m2> continuation) {
        b bVar = new b(pVar);
        try {
            iVar.a(bVar, continuation);
        } catch (AbortFlowException e6) {
            kotlinx.coroutines.flow.internal.o.b(e6, bVar);
        }
        return m2.f23662a;
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> d(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, int i5) {
        if (i5 >= 0) {
            return new c(iVar, i5);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("嶤"), i5).toString());
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> e(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new e(iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object f(kotlinx.coroutines.flow.j<? super T> r4, T r5, kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.g
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.v$g r0 = (kotlinx.coroutines.flow.v.g) r0
            int r1 = r0.f28463t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28463t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v$g r0 = new kotlinx.coroutines.flow.v$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28462s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28463t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶥"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L2f:
            java.lang.Object r4 = r0.f28461r
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            kotlin.a1.n(r6)
            goto L45
        L37:
            kotlin.a1.n(r6)
            r0.f28461r = r4
            r0.f28463t = r3
            java.lang.Object r5 = r4.b(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.f(kotlinx.coroutines.flow.j, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> g(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, int i5) {
        if (i5 > 0) {
            return new h(iVar, i5);
        }
        throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("嶦"), i5, ProtectedSandApp.s("嶧")).toString());
    }

    @d5.d
    public static final <T> kotlinx.coroutines.flow.i<T> h(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @d5.d q3.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new j(iVar, pVar);
    }

    @d5.d
    public static final <T, R> kotlinx.coroutines.flow.i<R> i(@d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @BuilderInference @d5.d q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> qVar) {
        return new h0(new l(iVar, qVar, null));
    }
}
