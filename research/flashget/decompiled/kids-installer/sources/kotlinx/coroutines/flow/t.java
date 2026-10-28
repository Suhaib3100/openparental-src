package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.k1;
import kotlin.m2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Emitters.kt */
@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u001au\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001au\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001aU\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001al\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0010\u0010\u0018\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0004H\u0000\u001as\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r0;", "name", "value", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "Lkotlin/u;", "transform", "g", "(Lkotlinx/coroutines/flow/i;Lq3/q;)Lkotlinx/coroutines/flow/i;", "h", "Lkotlin/Function2;", "action", "f", "(Lkotlinx/coroutines/flow/i;Lq3/p;)Lkotlinx/coroutines/flow/i;", "", "cause", "d", "e", "b", "c", "(Lkotlinx/coroutines/flow/j;Lq3/q;Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class t {

    /* compiled from: Emitters.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {216}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28344r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28345s;

        /* renamed from: t, reason: collision with root package name */
        int f28346t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28345s = obj;
            this.f28346t |= Integer.MIN_VALUE;
            return t.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ i f28347o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q f28348p;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {114, 121, 128}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28349r;

            /* renamed from: s, reason: collision with root package name */
            int f28350s;

            /* renamed from: u, reason: collision with root package name */
            Object f28352u;

            /* renamed from: v, reason: collision with root package name */
            Object f28353v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28349r = obj;
                this.f28350s |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(i iVar, q3.q qVar) {
            this.f28347o = iVar;
            this.f28348p = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r9, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.t.b.a
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.t$b$a r0 = (kotlinx.coroutines.flow.t.b.a) r0
                int r1 = r0.f28350s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28350s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$b$a r0 = new kotlinx.coroutines.flow.t$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f28349r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28350s
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L56
                if (r2 == r5) goto L48
                if (r2 == r4) goto L40
                if (r2 != r3) goto L34
                java.lang.Object r9 = r0.f28352u
                kotlinx.coroutines.flow.internal.t r9 = (kotlinx.coroutines.flow.internal.t) r9
                kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L32
                goto L82
            L32:
                r10 = move-exception
                goto L8c
            L34:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "嶍"
                java.lang.String r10 = com.flashget.kidsdownloader.ProtectedSandApp.s(r10)
                r9.<init>(r10)
                throw r9
            L40:
                java.lang.Object r9 = r0.f28352u
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                kotlin.a1.n(r10)
                goto La6
            L48:
                java.lang.Object r9 = r0.f28353v
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                java.lang.Object r2 = r0.f28352u
                kotlinx.coroutines.flow.t$b r2 = (kotlinx.coroutines.flow.t.b) r2
                kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L54
                goto L69
            L54:
                r9 = move-exception
                goto L92
            L56:
                kotlin.a1.n(r10)
                kotlinx.coroutines.flow.i r10 = r8.f28347o     // Catch: java.lang.Throwable -> L90
                r0.f28352u = r8     // Catch: java.lang.Throwable -> L90
                r0.f28353v = r9     // Catch: java.lang.Throwable -> L90
                r0.f28350s = r5     // Catch: java.lang.Throwable -> L90
                java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L90
                if (r10 != r1) goto L68
                return r1
            L68:
                r2 = r8
            L69:
                kotlinx.coroutines.flow.internal.t r10 = new kotlinx.coroutines.flow.internal.t
                kotlin.coroutines.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                q3.q r9 = r2.f28348p     // Catch: java.lang.Throwable -> L88
                r0.f28352u = r10     // Catch: java.lang.Throwable -> L88
                r0.f28353v = r6     // Catch: java.lang.Throwable -> L88
                r0.f28350s = r3     // Catch: java.lang.Throwable -> L88
                java.lang.Object r9 = r9.G(r10, r6, r0)     // Catch: java.lang.Throwable -> L88
                if (r9 != r1) goto L81
                return r1
            L81:
                r9 = r10
            L82:
                r9.C()
                kotlin.m2 r9 = kotlin.m2.f23662a
                return r9
            L88:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L8c:
                r9.C()
                throw r10
            L90:
                r9 = move-exception
                r2 = r8
            L92:
                kotlinx.coroutines.flow.z0 r10 = new kotlinx.coroutines.flow.z0
                r10.<init>(r9)
                q3.q r2 = r2.f28348p
                r0.f28352u = r9
                r0.f28353v = r6
                r0.f28350s = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.t.a(r10, r2, r9, r0)
                if (r10 != r1) goto La6
                return r1
            La6:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.b.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c<T> implements i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ i f28354o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f28355p;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {114, 122}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28356r;

            /* renamed from: s, reason: collision with root package name */
            int f28357s;

            /* renamed from: u, reason: collision with root package name */
            Object f28359u;

            /* renamed from: v, reason: collision with root package name */
            Object f28360v;

            /* renamed from: w, reason: collision with root package name */
            Object f28361w;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28356r = obj;
                this.f28357s |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(i iVar, q3.p pVar) {
            this.f28354o = iVar;
            this.f28355p = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.j<? super T>] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.internal.t] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.flow.internal.t] */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.t.c.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.t$c$a r0 = (kotlinx.coroutines.flow.t.c.a) r0
                int r1 = r0.f28357s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28357s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$c$a r0 = new kotlinx.coroutines.flow.t$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f28356r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28357s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4c
                if (r2 == r4) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r7 = r0.f28359u
                kotlinx.coroutines.flow.internal.t r7 = (kotlinx.coroutines.flow.internal.t) r7
                kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L2e
                goto L8e
            L2e:
                r8 = move-exception
                goto L92
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "嶎"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L3c:
                java.lang.Object r7 = r0.f28361w
                kotlin.jvm.internal.k1$a r7 = (kotlin.jvm.internal.k1.a) r7
                java.lang.Object r2 = r0.f28360v
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.f28359u
                kotlinx.coroutines.flow.t$c r4 = (kotlinx.coroutines.flow.t.c) r4
                kotlin.a1.n(r8)
                goto L6f
            L4c:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$a r8 = new kotlin.jvm.internal.k1$a
                r8.<init>()
                r8.f23565o = r4
                kotlinx.coroutines.flow.i r2 = r6.f28354o
                kotlinx.coroutines.flow.t$d r5 = new kotlinx.coroutines.flow.t$d
                r5.<init>(r8, r7)
                r0.f28359u = r6
                r0.f28360v = r7
                r0.f28361w = r8
                r0.f28357s = r4
                java.lang.Object r2 = r2.a(r5, r0)
                if (r2 != r1) goto L6c
                return r1
            L6c:
                r4 = r6
                r2 = r7
                r7 = r8
            L6f:
                boolean r7 = r7.f23565o
                if (r7 == 0) goto L96
                kotlinx.coroutines.flow.internal.t r7 = new kotlinx.coroutines.flow.internal.t
                kotlin.coroutines.g r8 = r0.getContext()
                r7.<init>(r2, r8)
                q3.p r8 = r4.f28355p     // Catch: java.lang.Throwable -> L2e
                r0.f28359u = r7     // Catch: java.lang.Throwable -> L2e
                r2 = 0
                r0.f28360v = r2     // Catch: java.lang.Throwable -> L2e
                r0.f28361w = r2     // Catch: java.lang.Throwable -> L2e
                r0.f28357s = r3     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r8 = r8.g0(r7, r0)     // Catch: java.lang.Throwable -> L2e
                if (r8 != r1) goto L8e
                return r1
            L8e:
                r7.C()
                goto L96
            L92:
                r7.C()
                throw r8
            L96:
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.c.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Emitters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class d<T> implements j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.a f28362o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ j<T> f28363p;

        /* compiled from: Emitters.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {185}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28364r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ d<T> f28365s;

            /* renamed from: t, reason: collision with root package name */
            int f28366t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28365s = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28364r = obj;
                this.f28366t |= Integer.MIN_VALUE;
                return this.f28365s.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(k1.a aVar, j<? super T> jVar) {
            this.f28362o = aVar;
            this.f28363p = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.t$d$a r0 = (kotlinx.coroutines.flow.t.d.a) r0
                int r1 = r0.f28366t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28366t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$d$a r0 = new kotlinx.coroutines.flow.t$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f28364r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28366t
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r6)
                goto L46
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "嶏"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.a1.n(r6)
                kotlin.jvm.internal.k1$a r6 = r4.f28362o
                r2 = 0
                r6.f23565o = r2
                kotlinx.coroutines.flow.j<T> r6 = r4.f28363p
                r0.f28366t = r3
                java.lang.Object r5 = r6.b(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                kotlin.m2 r5 = kotlin.m2.f23662a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.d.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e<T> implements i<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.p f28367o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ i f28368p;

        /* compiled from: SafeCollector.common.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {116, 120}, m = "collect", n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28369r;

            /* renamed from: s, reason: collision with root package name */
            int f28370s;

            /* renamed from: u, reason: collision with root package name */
            Object f28372u;

            /* renamed from: v, reason: collision with root package name */
            Object f28373v;

            /* renamed from: w, reason: collision with root package name */
            Object f28374w;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28369r = obj;
                this.f28370s |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(q3.p pVar, i iVar) {
            this.f28367o = pVar;
            this.f28368p = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.i
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r7, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.t.e.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.t$e$a r0 = (kotlinx.coroutines.flow.t.e.a) r0
                int r1 = r0.f28370s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28370s = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$e$a r0 = new kotlinx.coroutines.flow.t$e$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f28369r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28370s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L48
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r8)
                goto L7d
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "嶐"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L36:
                java.lang.Object r7 = r0.f28374w
                kotlinx.coroutines.flow.internal.t r7 = (kotlinx.coroutines.flow.internal.t) r7
                java.lang.Object r2 = r0.f28373v
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.f28372u
                kotlinx.coroutines.flow.t$e r4 = (kotlinx.coroutines.flow.t.e) r4
                kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L46
                goto L68
            L46:
                r8 = move-exception
                goto L84
            L48:
                kotlin.a1.n(r8)
                kotlinx.coroutines.flow.internal.t r8 = new kotlinx.coroutines.flow.internal.t
                kotlin.coroutines.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                q3.p r2 = r6.f28367o     // Catch: java.lang.Throwable -> L80
                r0.f28372u = r6     // Catch: java.lang.Throwable -> L80
                r0.f28373v = r7     // Catch: java.lang.Throwable -> L80
                r0.f28374w = r8     // Catch: java.lang.Throwable -> L80
                r0.f28370s = r4     // Catch: java.lang.Throwable -> L80
                java.lang.Object r2 = r2.g0(r8, r0)     // Catch: java.lang.Throwable -> L80
                if (r2 != r1) goto L65
                return r1
            L65:
                r4 = r6
                r2 = r7
                r7 = r8
            L68:
                r7.C()
                kotlinx.coroutines.flow.i r7 = r4.f28368p
                r8 = 0
                r0.f28372u = r8
                r0.f28373v = r8
                r0.f28374w = r8
                r0.f28370s = r3
                java.lang.Object r7 = r7.a(r2, r0)
                if (r7 != r1) goto L7d
                return r1
            L7d:
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            L80:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L84:
                r7.C()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.e.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Emitters.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class f<R> extends SuspendLambda implements q3.p<j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28375s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28376t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ i<T> f28377u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.q<j<? super R>, T, Continuation<? super m2>, Object> f28378v;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes5.dex */
        public static final class a<T> implements j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ q3.q<j<? super R>, T, Continuation<? super m2>, Object> f28379o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ j<R> f28380p;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {42}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
            /* renamed from: kotlinx.coroutines.flow.t$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0443a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f28381r;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ a<T> f28382s;

                /* renamed from: t, reason: collision with root package name */
                int f28383t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0443a(a<? super T> aVar, Continuation<? super C0443a> continuation) {
                    super(continuation);
                    this.f28382s = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f28381r = obj;
                    this.f28383t |= Integer.MIN_VALUE;
                    return this.f28382s.b(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(q3.q<? super j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar, j<? super R> jVar) {
                this.f28379o = qVar;
                this.f28380p = jVar;
            }

            @d5.e
            public final Object a(T t5, @d5.d Continuation<? super m2> continuation) {
                new C0443a(this, continuation);
                this.f28379o.G(this.f28380p, t5, continuation);
                return m2.f23662a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
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
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.f.a.C0443a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.t$f$a$a r0 = (kotlinx.coroutines.flow.t.f.a.C0443a) r0
                    int r1 = r0.f28383t
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28383t = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.t$f$a$a r0 = new kotlinx.coroutines.flow.t$f$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f28381r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f28383t
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "嶑"
                    java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    q3.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.m2>, java.lang.Object> r6 = r4.f28379o
                    kotlinx.coroutines.flow.j<R> r2 = r4.f28380p
                    r0.f28383t = r3
                    java.lang.Object r5 = r6.G(r2, r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.m2 r5 = kotlin.m2.f23662a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.f.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(i<? extends T> iVar, q3.q<? super j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f28377u = iVar;
            this.f28378v = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28375s;
            if (i5 == 0) {
                a1.n(obj);
                j jVar = (j) this.f28376t;
                i<T> iVar = this.f28377u;
                a aVar = new a(this.f28378v, jVar);
                this.f28375s = 1;
                if (iVar.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("鄞"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((f) c(jVar, continuation)).A(m2.f23662a);
        }

        @d5.e
        public final Object Z(@d5.d Object obj) {
            this.f28377u.a(new a(this.f28378v, (j) this.f28376t), this);
            return m2.f23662a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            f fVar = new f(this.f28377u, this.f28378v, continuation);
            fVar.f28376t = obj;
            return fVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class g<R> implements i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ i f28384o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.q f28385p;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28386r;

            /* renamed from: s, reason: collision with root package name */
            int f28387s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28386r = obj;
                this.f28387s |= Integer.MIN_VALUE;
                return g.this.a(null, this);
            }
        }

        public g(i iVar, q3.q qVar) {
            this.f28384o = iVar;
            this.f28385p = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d j<? super R> jVar, @d5.d Continuation<? super m2> continuation) {
            Object a6 = this.f28384o.a(new h(this.f28385p, jVar), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d j jVar, @d5.d Continuation continuation) {
            new a(continuation);
            this.f28384o.a(new h(this.f28385p, jVar), continuation);
            return m2.f23662a;
        }
    }

    /* compiled from: Emitters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class h<T> implements j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.q<j<? super R>, T, Continuation<? super m2>, Object> f28389o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ j<R> f28390p;

        /* compiled from: Emitters.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {53}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f28391r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ h<T> f28392s;

            /* renamed from: t, reason: collision with root package name */
            int f28393t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(h<? super T> hVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f28392s = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28391r = obj;
                this.f28393t |= Integer.MIN_VALUE;
                return this.f28392s.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(q3.q<? super j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar, j<? super R> jVar) {
            this.f28389o = qVar;
            this.f28390p = jVar;
        }

        @d5.e
        public final Object a(T t5, @d5.d Continuation<? super m2> continuation) {
            new a(this, continuation);
            this.f28389o.G(this.f28390p, t5, continuation);
            return m2.f23662a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.h.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.t$h$a r0 = (kotlinx.coroutines.flow.t.h.a) r0
                int r1 = r0.f28393t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28393t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$h$a r0 = new kotlinx.coroutines.flow.t$h$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f28391r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28393t
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r6)
                goto L43
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "嶒"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.a1.n(r6)
                q3.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.m2>, java.lang.Object> r6 = r4.f28389o
                kotlinx.coroutines.flow.j<R> r2 = r4.f28390p
                r0.f28393t = r3
                java.lang.Object r5 = r6.G(r2, r5, r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                kotlin.m2 r5 = kotlin.m2.f23662a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.h.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public static final void b(@d5.d j<?> jVar) {
        if (jVar instanceof z0) {
            throw ((z0) jVar).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.j<? super T> r4, q3.q<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.m2>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.t.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.t$a r0 = (kotlinx.coroutines.flow.t.a) r0
            int r1 = r0.f28346t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28346t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.t$a r0 = new kotlinx.coroutines.flow.t$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28345s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28346t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.f28344r
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L49
            goto L46
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嶓"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.a1.n(r7)
            r0.f28344r = r6     // Catch: java.lang.Throwable -> L49
            r0.f28346t = r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r5.G(r4, r6, r0)     // Catch: java.lang.Throwable -> L49
            if (r4 != r1) goto L46
            return r1
        L46:
            kotlin.m2 r4 = kotlin.m2.f23662a
            return r4
        L49:
            r4 = move-exception
            if (r6 == 0) goto L51
            if (r6 == r4) goto L51
            kotlin.o.a(r4, r6)
        L51:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.c(kotlinx.coroutines.flow.j, q3.q, java.lang.Throwable, kotlin.coroutines.d):java.lang.Object");
    }

    @d5.d
    public static final <T> i<T> d(@d5.d i<? extends T> iVar, @d5.d q3.q<? super j<? super T>, ? super Throwable, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return new b(iVar, qVar);
    }

    @d5.d
    public static final <T> i<T> e(@d5.d i<? extends T> iVar, @d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new c(iVar, pVar);
    }

    @d5.d
    public static final <T> i<T> f(@d5.d i<? extends T> iVar, @d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        return new e(pVar, iVar);
    }

    @d5.d
    public static final <T, R> i<R> g(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.q<? super j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return new h0(new f(iVar, qVar, null));
    }

    @PublishedApi
    @d5.d
    public static final <T, R> i<R> h(@d5.d i<? extends T> iVar, @BuilderInference @d5.d q3.q<? super j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar) {
        return new g(iVar, qVar);
    }
}
