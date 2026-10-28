package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Emitters.kt */
@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\u001au\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001au\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001aU\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001al\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0017\u0010\u0018\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001as\u0010\u001a\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r0;", "name", "value", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "transform", "g", "(Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "h", "Lkotlin/Function2;", "action", "f", "(Lkotlinx/coroutines/flow/i;Lld/p;)Lkotlinx/coroutines/flow/i;", "", "cause", "d", "e", "b", "(Lkotlinx/coroutines/flow/j;)V", "c", "(Lkotlinx/coroutines/flow/j;Lld/q;Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,222:1\n107#2:223\n107#2:224\n107#2:225\n107#2:226\n75#3:227\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n50#1:223\n76#1:224\n146#1:225\n181#1:226\n218#1:227\n*E\n"})
/* loaded from: classes7.dex */
public final /* synthetic */ class t {

    /* compiled from: Emitters.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {216}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80389b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80390c;

        /* renamed from: d, reason: collision with root package name */
        int f80391d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80390c = obj;
            this.f80391d |= Integer.MIN_VALUE;
            return t.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,113:1\n147#2,13:114\n160#2,6:128\n329#3:127\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n159#1:127\n*E\n"})
    public static final class b<T> implements i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f80392b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q f80393c;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {115, 122, 129}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80394b;

            /* renamed from: c, reason: collision with root package name */
            int f80395c;

            /* renamed from: e, reason: collision with root package name */
            Object f80397e;

            /* renamed from: f, reason: collision with root package name */
            Object f80398f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80394b = obj;
                this.f80395c |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(i iVar, ld.q qVar) {
            this.f80392b = iVar;
            this.f80393c = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r9, @fg.l kotlin.coroutines.d<? super kotlin.k2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.t.b.a
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.t$b$a r0 = (kotlinx.coroutines.flow.t.b.a) r0
                int r1 = r0.f80395c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80395c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$b$a r0 = new kotlinx.coroutines.flow.t$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f80394b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80395c
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L56
                if (r2 == r5) goto L48
                if (r2 == r4) goto L40
                if (r2 != r3) goto L34
                java.lang.Object r9 = r0.f80397e
                kotlinx.coroutines.flow.internal.t r9 = (kotlinx.coroutines.flow.internal.t) r9
                kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L32
                goto L82
            L32:
                r10 = move-exception
                goto L8c
            L34:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "蝿\u0001"
                java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)
                r9.<init>(r10)
                throw r9
            L40:
                java.lang.Object r9 = r0.f80397e
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                kotlin.a1.n(r10)
                goto La6
            L48:
                java.lang.Object r9 = r0.f80398f
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                java.lang.Object r2 = r0.f80397e
                kotlinx.coroutines.flow.t$b r2 = (kotlinx.coroutines.flow.t.b) r2
                kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L54
                goto L69
            L54:
                r9 = move-exception
                goto L92
            L56:
                kotlin.a1.n(r10)
                kotlinx.coroutines.flow.i r10 = r8.f80392b     // Catch: java.lang.Throwable -> L90
                r0.f80397e = r8     // Catch: java.lang.Throwable -> L90
                r0.f80398f = r9     // Catch: java.lang.Throwable -> L90
                r0.f80395c = r5     // Catch: java.lang.Throwable -> L90
                java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L90
                if (r10 != r1) goto L68
                return r1
            L68:
                r2 = r8
            L69:
                kotlinx.coroutines.flow.internal.t r10 = new kotlinx.coroutines.flow.internal.t
                kotlin.coroutines.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                ld.q r9 = r2.f80393c     // Catch: java.lang.Throwable -> L88
                r0.f80397e = r10     // Catch: java.lang.Throwable -> L88
                r0.f80398f = r6     // Catch: java.lang.Throwable -> L88
                r0.f80395c = r3     // Catch: java.lang.Throwable -> L88
                java.lang.Object r9 = r9.R(r10, r6, r0)     // Catch: java.lang.Throwable -> L88
                if (r9 != r1) goto L81
                return r1
            L81:
                r9 = r10
            L82:
                r9.releaseIntercepted()
                kotlin.k2 r9 = kotlin.k2.f75408a
                return r9
            L88:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L8c:
                r9.releaseIntercepted()
                throw r10
            L90:
                r9 = move-exception
                r2 = r8
            L92:
                kotlinx.coroutines.flow.z0 r10 = new kotlinx.coroutines.flow.z0
                r10.<init>(r9)
                ld.q r2 = r2.f80393c
                r0.f80397e = r9
                r0.f80398f = r6
                r0.f80395c = r4
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
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,113:1\n182#2,7:114\n189#2,7:122\n329#3:121\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n188#1:121\n*E\n"})
    public static final class c<T> implements i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f80399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f80400c;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {115, 123}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80401b;

            /* renamed from: c, reason: collision with root package name */
            int f80402c;

            /* renamed from: e, reason: collision with root package name */
            Object f80404e;

            /* renamed from: f, reason: collision with root package name */
            Object f80405f;

            /* renamed from: g, reason: collision with root package name */
            Object f80406g;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80401b = obj;
                this.f80402c |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(i iVar, ld.p pVar) {
            this.f80399b = iVar;
            this.f80400c = pVar;
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
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.t.c.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.t$c$a r0 = (kotlinx.coroutines.flow.t.c.a) r0
                int r1 = r0.f80402c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80402c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$c$a r0 = new kotlinx.coroutines.flow.t$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f80401b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80402c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4c
                if (r2 == r4) goto L3c
                if (r2 != r3) goto L30
                java.lang.Object r7 = r0.f80404e
                kotlinx.coroutines.flow.internal.t r7 = (kotlinx.coroutines.flow.internal.t) r7
                kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L2e
                goto L8e
            L2e:
                r8 = move-exception
                goto L92
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "螀\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L3c:
                java.lang.Object r7 = r0.f80406g
                kotlin.jvm.internal.k1$a r7 = (kotlin.jvm.internal.k1.a) r7
                java.lang.Object r2 = r0.f80405f
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.f80404e
                kotlinx.coroutines.flow.t$c r4 = (kotlinx.coroutines.flow.t.c) r4
                kotlin.a1.n(r8)
                goto L6f
            L4c:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$a r8 = new kotlin.jvm.internal.k1$a
                r8.<init>()
                r8.f75322b = r4
                kotlinx.coroutines.flow.i r2 = r6.f80399b
                kotlinx.coroutines.flow.t$d r5 = new kotlinx.coroutines.flow.t$d
                r5.<init>(r8, r7)
                r0.f80404e = r6
                r0.f80405f = r7
                r0.f80406g = r8
                r0.f80402c = r4
                java.lang.Object r2 = r2.a(r5, r0)
                if (r2 != r1) goto L6c
                return r1
            L6c:
                r4 = r6
                r2 = r7
                r7 = r8
            L6f:
                boolean r7 = r7.f75322b
                if (r7 == 0) goto L96
                kotlinx.coroutines.flow.internal.t r7 = new kotlinx.coroutines.flow.internal.t
                kotlin.coroutines.g r8 = r0.getContext()
                r7.<init>(r2, r8)
                ld.p r8 = r4.f80400c     // Catch: java.lang.Throwable -> L2e
                r0.f80404e = r7     // Catch: java.lang.Throwable -> L2e
                r2 = 0
                r0.f80405f = r2     // Catch: java.lang.Throwable -> L2e
                r0.f80406g = r2     // Catch: java.lang.Throwable -> L2e
                r0.f80402c = r3     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L2e
                if (r8 != r1) goto L8e
                return r1
            L8e:
                r7.releaseIntercepted()
                goto L96
            L92:
                r7.releaseIntercepted()
                throw r8
            L96:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.c.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Emitters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d<T> implements j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f80407b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f80408c;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {185}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80409b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d<T> f80410c;

            /* renamed from: d, reason: collision with root package name */
            int f80411d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(dVar2);
                this.f80410c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80409b = obj;
                this.f80411d |= Integer.MIN_VALUE;
                return this.f80410c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(k1.a aVar, j<? super T> jVar) {
            this.f80407b = aVar;
            this.f80408c = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.t$d$a r0 = (kotlinx.coroutines.flow.t.d.a) r0
                int r1 = r0.f80411d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80411d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$d$a r0 = new kotlinx.coroutines.flow.t$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f80409b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80411d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r6)
                goto L46
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "螁\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.a1.n(r6)
                kotlin.jvm.internal.k1$a r6 = r4.f80407b
                r2 = 0
                r6.f75322b = r2
                kotlinx.coroutines.flow.j<T> r6 = r4.f80408c
                r0.f80411d = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.d.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,113:1\n77#2:114\n78#2,7:116\n329#3:115\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n77#1:115\n*E\n"})
    public static final class e<T> implements i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p f80412b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f80413c;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {117, 121}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80414b;

            /* renamed from: c, reason: collision with root package name */
            int f80415c;

            /* renamed from: e, reason: collision with root package name */
            Object f80417e;

            /* renamed from: f, reason: collision with root package name */
            Object f80418f;

            /* renamed from: g, reason: collision with root package name */
            Object f80419g;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80414b = obj;
                this.f80415c |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(ld.p pVar, i iVar) {
            this.f80412b = pVar;
            this.f80413c = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.t.e.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.t$e$a r0 = (kotlinx.coroutines.flow.t.e.a) r0
                int r1 = r0.f80415c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80415c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$e$a r0 = new kotlinx.coroutines.flow.t$e$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f80414b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80415c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L48
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r8)
                goto L7d
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "螂\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L36:
                java.lang.Object r7 = r0.f80419g
                kotlinx.coroutines.flow.internal.t r7 = (kotlinx.coroutines.flow.internal.t) r7
                java.lang.Object r2 = r0.f80418f
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.f80417e
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
                ld.p r2 = r6.f80412b     // Catch: java.lang.Throwable -> L80
                r0.f80417e = r6     // Catch: java.lang.Throwable -> L80
                r0.f80418f = r7     // Catch: java.lang.Throwable -> L80
                r0.f80419g = r8     // Catch: java.lang.Throwable -> L80
                r0.f80415c = r4     // Catch: java.lang.Throwable -> L80
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L80
                if (r2 != r1) goto L65
                return r1
            L65:
                r4 = r6
                r2 = r7
                r7 = r8
            L68:
                r7.releaseIntercepted()
                kotlinx.coroutines.flow.i r7 = r4.f80413c
                r8 = 0
                r0.f80417e = r8
                r0.f80418f = r8
                r0.f80419g = r8
                r0.f80415c = r3
                java.lang.Object r7 = r7.a(r2, r0)
                if (r7 != r1) goto L7d
                return r1
            L7d:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            L80:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L84:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.e.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Emitters.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
    public static final class f<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80420b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80421c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i<T> f80422d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<j<? super R>, T, kotlin.coroutines.d<? super k2>, Object> f80423e;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n*L\n1#1,222:1\n*E\n"})
        public static final class a<T> implements j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.q<j<? super R>, T, kotlin.coroutines.d<? super k2>, Object> f80424b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j<R> f80425c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {42}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.t$f$a$a, reason: collision with other inner class name */
            public static final class C1250a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f80426b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a<T> f80427c;

                /* renamed from: d, reason: collision with root package name */
                int f80428d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1250a(a<? super T> aVar, kotlin.coroutines.d<? super C1250a> dVar) {
                    super(dVar);
                    this.f80427c = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f80426b = obj;
                    this.f80428d |= Integer.MIN_VALUE;
                    return this.f80427c.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, j<? super R> jVar) {
                this.f80424b = qVar;
                this.f80425c = jVar;
            }

            @fg.m
            public final Object a(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                new C1250a(this, dVar);
                this.f80424b.R(this.f80425c, t4, dVar);
                return k2.f75408a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
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
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.f.a.C1250a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.t$f$a$a r0 = (kotlinx.coroutines.flow.t.f.a.C1250a) r0
                    int r1 = r0.f80428d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f80428d = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.t$f$a$a r0 = new kotlinx.coroutines.flow.t$f$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f80426b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f80428d
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "螃\u0001"
                    java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    ld.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r6 = r4.f80424b
                    kotlinx.coroutines.flow.j<R> r2 = r4.f80425c
                    r0.f80428d = r3
                    java.lang.Object r5 = r6.R(r2, r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.f.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(i<? extends T> iVar, ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f80422d = iVar;
            this.f80423e = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f80422d, this.f80423e, dVar);
            fVar.f80421c = obj;
            return fVar;
        }

        @fg.m
        public final Object d(@fg.l Object obj) {
            this.f80422d.a(new a(this.f80423e, (j) this.f80421c), this);
            return k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80420b;
            if (i4 == 0) {
                a1.n(obj);
                j jVar = (j) this.f80421c;
                i<T> iVar = this.f80422d;
                a aVar2 = new a(this.f80423e, jVar);
                this.f80420b = 1;
                if (iVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("螄\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class g<R> implements i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f80429b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q f80430c;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80431b;

            /* renamed from: c, reason: collision with root package name */
            int f80432c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80431b = obj;
                this.f80432c |= Integer.MIN_VALUE;
                return g.this.a(null, this);
            }
        }

        public g(i iVar, ld.q qVar) {
            this.f80429b = iVar;
            this.f80430c = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l j<? super R> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object a5 = this.f80429b.a(new h(this.f80430c, jVar), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l j jVar, @fg.l kotlin.coroutines.d dVar) {
            new a(dVar);
            this.f80429b.a(new h(this.f80430c, jVar), dVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Emitters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n*L\n1#1,222:1\n*E\n"})
    public static final class h<T> implements j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<j<? super R>, T, kotlin.coroutines.d<? super k2>, Object> f80434b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<R> f80435c;

        /* compiled from: Emitters.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {53}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80436b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h<T> f80437c;

            /* renamed from: d, reason: collision with root package name */
            int f80438d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(h<? super T> hVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f80437c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80436b = obj;
                this.f80438d |= Integer.MIN_VALUE;
                return this.f80437c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, j<? super R> jVar) {
            this.f80434b = qVar;
            this.f80435c = jVar;
        }

        @fg.m
        public final Object a(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            new a(this, dVar);
            this.f80434b.R(this.f80435c, t4, dVar);
            return k2.f75408a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.h.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.t$h$a r0 = (kotlinx.coroutines.flow.t.h.a) r0
                int r1 = r0.f80438d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80438d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$h$a r0 = new kotlinx.coroutines.flow.t$h$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f80436b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80438d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r6)
                goto L43
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "螅\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.a1.n(r6)
                ld.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r6 = r4.f80434b
                kotlinx.coroutines.flow.j<R> r2 = r4.f80435c
                r0.f80438d = r3
                java.lang.Object r5 = r6.R(r2, r5, r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.h.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public static final void b(@fg.l j<?> jVar) {
        if (jVar instanceof z0) {
            throw ((z0) jVar).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.j<? super T> r4, ld.q<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.t.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.t$a r0 = (kotlinx.coroutines.flow.t.a) r0
            int r1 = r0.f80391d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80391d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.t$a r0 = new kotlinx.coroutines.flow.t$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f80390c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80391d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f80389b
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L2c
            goto L48
        L2c:
            r4 = move-exception
            goto L4b
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螆\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.a1.n(r7)
            r0.f80389b = r6     // Catch: java.lang.Throwable -> L2c
            r0.f80391d = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r5.R(r4, r6, r0)     // Catch: java.lang.Throwable -> L2c
            if (r4 != r1) goto L48
            return r1
        L48:
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        L4b:
            if (r6 == 0) goto L52
            if (r6 == r4) goto L52
            kotlin.o.a(r4, r6)
        L52:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.c(kotlinx.coroutines.flow.j, ld.q, java.lang.Throwable, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    public static final <T> i<T> d(@fg.l i<? extends T> iVar, @fg.l ld.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return new b(iVar, qVar);
    }

    @fg.l
    public static final <T> i<T> e(@fg.l i<? extends T> iVar, @fg.l ld.p<? super j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new c(iVar, pVar);
    }

    @fg.l
    public static final <T> i<T> f(@fg.l i<? extends T> iVar, @fg.l ld.p<? super j<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new e(pVar, iVar);
    }

    @fg.l
    public static final <T, R> i<R> g(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return new h0(new f(iVar, qVar, null));
    }

    @fg.l
    @kotlin.w0
    public static final <T, R> i<R> h(@fg.l i<? extends T> iVar, @fg.l @InterfaceC1469b ld.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return new g(iVar, qVar);
    }
}
