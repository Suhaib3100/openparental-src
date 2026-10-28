package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.k1;
import kotlin.m2;
import kotlinx.coroutines.n2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "Lkotlin/u;", "action", "a", "(Lkotlinx/coroutines/flow/i;Lq3/q;)Lkotlinx/coroutines/flow/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "e", "(Lkotlinx/coroutines/flow/i;JLq3/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function4;", "attempt", "g", "(Lkotlinx/coroutines/flow/i;Lq3/r;)Lkotlinx/coroutines/flow/i;", "collector", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/g;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ i f28394o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q f28395p;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {113, 114}, m = "collect", n = {"this", "$this$catch_u24lambda_u2d0"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0444a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28396r;

            /* renamed from: s, reason: collision with root package name */
            int f28397s;

            /* renamed from: u, reason: collision with root package name */
            Object f28399u;

            /* renamed from: v, reason: collision with root package name */
            Object f28400v;

            public C0444a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28396r = obj;
                this.f28397s |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(i iVar, q3.q qVar) {
            this.f28394o = iVar;
            this.f28395p = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.u.a.C0444a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.u$a$a r0 = (kotlinx.coroutines.flow.u.a.C0444a) r0
                int r1 = r0.f28397s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28397s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$a$a r0 = new kotlinx.coroutines.flow.u$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f28396r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28397s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r7)
                goto L69
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "嶔"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L36:
                java.lang.Object r6 = r0.f28400v
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                java.lang.Object r2 = r0.f28399u
                kotlinx.coroutines.flow.u$a r2 = (kotlinx.coroutines.flow.u.a) r2
                kotlin.a1.n(r7)
                goto L55
            L42:
                kotlin.a1.n(r7)
                kotlinx.coroutines.flow.i r7 = r5.f28394o
                r0.f28399u = r5
                r0.f28400v = r6
                r0.f28397s = r4
                java.lang.Object r7 = kotlinx.coroutines.flow.u.b(r7, r6, r0)
                if (r7 != r1) goto L54
                return r1
            L54:
                r2 = r5
            L55:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L69
                q3.q r2 = r2.f28395p
                r4 = 0
                r0.f28399u = r4
                r0.f28400v = r4
                r0.f28397s = r3
                java.lang.Object r6 = r2.G(r6, r7, r0)
                if (r6 != r1) goto L69
                return r1
            L69:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.a.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Errors.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class b<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28401r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28402s;

        /* renamed from: t, reason: collision with root package name */
        int f28403t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28402s = obj;
            this.f28403t |= Integer.MIN_VALUE;
            return u.b(null, null, this);
        }
    }

    /* compiled from: Errors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class c<T> implements j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ j<T> f28404o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ k1.h<Throwable> f28405p;

        /* compiled from: Errors.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28406r;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f28407s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ c<T> f28408t;

            /* renamed from: u, reason: collision with root package name */
            int f28409u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28408t = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28407s = obj;
                this.f28409u |= Integer.MIN_VALUE;
                return this.f28408t.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(j<? super T> jVar, k1.h<Throwable> hVar) {
            this.f28404o = jVar;
            this.f28405p = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.u.c.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.u$c$a r0 = (kotlinx.coroutines.flow.u.c.a) r0
                int r1 = r0.f28409u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28409u = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$c$a r0 = new kotlinx.coroutines.flow.u$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f28407s
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28409u
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f28406r
                kotlinx.coroutines.flow.u$c r5 = (kotlinx.coroutines.flow.u.c) r5
                kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2b
                goto L49
            L2b:
                r6 = move-exception
                goto L4e
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "嶕"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L39:
                kotlin.a1.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f28404o     // Catch: java.lang.Throwable -> L4c
                r0.f28406r = r4     // Catch: java.lang.Throwable -> L4c
                r0.f28409u = r3     // Catch: java.lang.Throwable -> L4c
                java.lang.Object r5 = r6.b(r5, r0)     // Catch: java.lang.Throwable -> L4c
                if (r5 != r1) goto L49
                return r1
            L49:
                kotlin.m2 r5 = kotlin.m2.f23662a
                return r5
            L4c:
                r6 = move-exception
                r5 = r4
            L4e:
                kotlin.jvm.internal.k1$h<java.lang.Throwable> r5 = r5.f28405p
                r5.f23572o = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.c.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Errors.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class d extends SuspendLambda implements q3.p<Throwable, Continuation<? super Boolean>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28410s;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f28410s != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("鄟"));
            }
            a1.n(obj);
            return Boolean.TRUE;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d Throwable th, @d5.e Continuation<? super Boolean> continuation) {
            return new d(continuation).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return new d(continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Errors.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "", "cause", "", "attempt", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class e<T> extends SuspendLambda implements q3.r<j<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28411s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f28412t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ long f28413u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f28414v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ q3.p<Throwable, Continuation<? super Boolean>, Object> f28415w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j5, q3.p<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super e> continuation) {
            super(4, continuation);
            this.f28414v = j5;
            this.f28415w = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
        
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;
         */
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
                int r1 = r7.f28411s
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto Ld
                kotlin.a1.n(r8)
                goto L33
            Ld:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "鄠"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r8.<init>(r0)
                throw r8
            L19:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f28412t
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.f28413u
                long r5 = r7.f28414v
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L3c
                q3.p<java.lang.Throwable, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r1 = r7.f28415w
                r7.f28411s = r2
                java.lang.Object r8 = r1.g0(r8, r7)
                if (r8 != r0) goto L33
                return r0
            L33:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L3c
                goto L3d
            L3c:
                r2 = 0
            L3d:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.e.A(java.lang.Object):java.lang.Object");
        }

        @d5.e
        public final Object R(@d5.d j<? super T> jVar, @d5.d Throwable th, long j5, @d5.e Continuation<? super Boolean> continuation) {
            e eVar = new e(this.f28414v, this.f28415w, continuation);
            eVar.f28412t = th;
            eVar.f28413u = j5;
            return eVar.A(m2.f23662a);
        }

        @Override // q3.r
        public /* bridge */ /* synthetic */ Object S(Object obj, Throwable th, Long l5, Continuation<? super Boolean> continuation) {
            return R((j) obj, th, l5.longValue(), continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f<T> implements i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ i f28416o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.r f28417p;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {117, 119}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28418r;

            /* renamed from: s, reason: collision with root package name */
            int f28419s;

            /* renamed from: u, reason: collision with root package name */
            Object f28421u;

            /* renamed from: v, reason: collision with root package name */
            Object f28422v;

            /* renamed from: w, reason: collision with root package name */
            Object f28423w;

            /* renamed from: x, reason: collision with root package name */
            long f28424x;

            /* renamed from: y, reason: collision with root package name */
            int f28425y;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28418r = obj;
                this.f28419s |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(i iVar, q3.r rVar) {
            this.f28416o = iVar;
            this.f28417p = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:14:0x00a3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0092 -> B:11:0x0095). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r11, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof kotlinx.coroutines.flow.u.f.a
                if (r0 == 0) goto L13
                r0 = r12
                kotlinx.coroutines.flow.u$f$a r0 = (kotlinx.coroutines.flow.u.f.a) r0
                int r1 = r0.f28419s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28419s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$f$a r0 = new kotlinx.coroutines.flow.u$f$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f28418r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28419s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L54
                if (r2 == r4) goto L44
                if (r2 != r3) goto L38
                long r5 = r0.f28424x
                java.lang.Object r11 = r0.f28423w
                java.lang.Throwable r11 = (java.lang.Throwable) r11
                java.lang.Object r2 = r0.f28422v
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r7 = r0.f28421u
                kotlinx.coroutines.flow.u$f r7 = (kotlinx.coroutines.flow.u.f) r7
                kotlin.a1.n(r12)
                goto L95
            L38:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "嶖"
                java.lang.String r12 = com.flashget.kidsdownloader.ProtectedSandApp.s(r12)
                r11.<init>(r12)
                throw r11
            L44:
                int r11 = r0.f28425y
                long r5 = r0.f28424x
                java.lang.Object r2 = r0.f28422v
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r7 = r0.f28421u
                kotlinx.coroutines.flow.u$f r7 = (kotlinx.coroutines.flow.u.f) r7
                kotlin.a1.n(r12)
                goto L76
            L54:
                kotlin.a1.n(r12)
                r5 = 0
                r12 = r10
            L5a:
                kotlinx.coroutines.flow.i r2 = r12.f28416o
                r0.f28421u = r12
                r0.f28422v = r11
                r7 = 0
                r0.f28423w = r7
                r0.f28424x = r5
                r7 = 0
                r0.f28425y = r7
                r0.f28419s = r4
                java.lang.Object r2 = kotlinx.coroutines.flow.u.b(r2, r11, r0)
                if (r2 != r1) goto L71
                return r1
            L71:
                r9 = r2
                r2 = r11
                r11 = r7
                r7 = r12
                r12 = r9
            L76:
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                if (r12 == 0) goto La3
                q3.r r11 = r7.f28417p
                java.lang.Long r8 = new java.lang.Long
                r8.<init>(r5)
                r0.f28421u = r7
                r0.f28422v = r2
                r0.f28423w = r12
                r0.f28424x = r5
                r0.f28419s = r3
                java.lang.Object r11 = r11.S(r2, r12, r8, r0)
                if (r11 != r1) goto L92
                return r1
            L92:
                r9 = r12
                r12 = r11
                r11 = r9
            L95:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto La2
                r11 = 1
                long r5 = r5 + r11
                r11 = r4
                goto La3
            La2:
                throw r11
            La3:
                r12 = r7
                if (r11 != 0) goto La9
                kotlin.m2 r11 = kotlin.m2.f23662a
                return r11
            La9:
                r11 = r2
                goto L5a
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.f.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @d5.d
    public static final <T> i<T> a(@d5.d i<? extends T> iVar, @d5.d q3.q<? super j<? super T>, ? super Throwable, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return new a(iVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d kotlinx.coroutines.flow.j<? super T> r5, @d5.d kotlin.coroutines.Continuation<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.u.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.u$b r0 = (kotlinx.coroutines.flow.u.b) r0
            int r1 = r0.f28403t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28403t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.u$b r0 = new kotlinx.coroutines.flow.u$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28402s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28403t
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f28401r
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2b
            goto L51
        L2b:
            r5 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶗"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.a1.n(r6)
            kotlin.jvm.internal.k1$h r6 = new kotlin.jvm.internal.k1$h
            r6.<init>()
            kotlinx.coroutines.flow.u$c r2 = new kotlinx.coroutines.flow.u$c     // Catch: java.lang.Throwable -> L53
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L53
            r0.f28401r = r6     // Catch: java.lang.Throwable -> L53
            r0.f28403t = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L53
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = 0
            return r4
        L53:
            r5 = move-exception
            r4 = r6
        L55:
            T r4 = r4.f23572o
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L78
            kotlin.coroutines.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L78
            if (r4 != 0) goto L6c
            return r5
        L6c:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L74
            kotlin.o.a(r4, r5)
            throw r4
        L74:
            kotlin.o.a(r5, r4)
            throw r5
        L78:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.b(kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.b(n2.INSTANCE);
        if (n2Var == null || !n2Var.isCancelled()) {
            return false;
        }
        return d(th, n2Var.O());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && kotlin.jvm.internal.l0.g(th2, th);
    }

    @d5.d
    public static final <T> i<T> e(@d5.d i<? extends T> iVar, long j5, @d5.d q3.p<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        if (j5 > 0) {
            return new f(iVar, new e(j5, pVar, null));
        }
        throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("嶘"), j5).toString());
    }

    public static i f(i iVar, long j5, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = Long.MAX_VALUE;
        }
        if ((i5 & 2) != 0) {
            pVar = new d(null);
        }
        return e(iVar, j5, pVar);
    }

    @d5.d
    public static final <T> i<T> g(@d5.d i<? extends T> iVar, @d5.d q3.r<? super j<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> rVar) {
        return new f(iVar, rVar);
    }
}
