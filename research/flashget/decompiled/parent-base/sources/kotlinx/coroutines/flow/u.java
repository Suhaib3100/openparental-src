package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "action", "a", "(Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "e", "(Lkotlinx/coroutines/flow/i;JLld/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function4;", "attempt", "g", "(Lkotlinx/coroutines/flow/i;Lld/r;)Lkotlinx/coroutines/flow/i;", "collector", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/g;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,224:1\n107#2:225\n107#2:227\n1#3:226\n163#4:228\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n58#1:225\n132#1:227\n221#1:228\n*E\n"})
/* loaded from: classes7.dex */
public final /* synthetic */ class u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,113:1\n59#2,3:114\n*E\n"})
    public static final class a<T> implements i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f80439b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q f80440c;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$catch_u24lambda_u240"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.u$a$a, reason: collision with other inner class name */
        public static final class C1251a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80441b;

            /* renamed from: c, reason: collision with root package name */
            int f80442c;

            /* renamed from: e, reason: collision with root package name */
            Object f80444e;

            /* renamed from: f, reason: collision with root package name */
            Object f80445f;

            public C1251a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80441b = obj;
                this.f80442c |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(i iVar, ld.q qVar) {
            this.f80439b = iVar;
            this.f80440c = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.u.a.C1251a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.u$a$a r0 = (kotlinx.coroutines.flow.u.a.C1251a) r0
                int r1 = r0.f80442c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80442c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$a$a r0 = new kotlinx.coroutines.flow.u$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f80441b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80442c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r7)
                goto L69
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "螇\u0001"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L36:
                java.lang.Object r6 = r0.f80445f
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                java.lang.Object r2 = r0.f80444e
                kotlinx.coroutines.flow.u$a r2 = (kotlinx.coroutines.flow.u.a) r2
                kotlin.a1.n(r7)
                goto L55
            L42:
                kotlin.a1.n(r7)
                kotlinx.coroutines.flow.i r7 = r5.f80439b
                r0.f80444e = r5
                r0.f80445f = r6
                r0.f80442c = r4
                java.lang.Object r7 = kotlinx.coroutines.flow.u.b(r7, r6, r0)
                if (r7 != r1) goto L54
                return r1
            L54:
                r2 = r5
            L55:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L69
                ld.q r2 = r2.f80440c
                r4 = 0
                r0.f80444e = r4
                r0.f80445f = r4
                r0.f80442c = r3
                java.lang.Object r6 = r2.R(r6, r7, r0)
                if (r6 != r1) goto L69
                return r1
            L69:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.a.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Errors.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80446b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80447c;

        /* renamed from: d, reason: collision with root package name */
        int f80448d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80447c = obj;
            this.f80448d |= Integer.MIN_VALUE;
            return u.b(null, null, this);
        }
    }

    /* compiled from: Errors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c<T> implements j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<T> f80449b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.h<Throwable> f80450c;

        /* compiled from: Errors.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80451b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80452c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c<T> f80453d;

            /* renamed from: e, reason: collision with root package name */
            int f80454e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f80453d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80452c = obj;
                this.f80454e |= Integer.MIN_VALUE;
                return this.f80453d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(j<? super T> jVar, k1.h<Throwable> hVar) {
            this.f80449b = jVar;
            this.f80450c = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.u.c.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.u$c$a r0 = (kotlinx.coroutines.flow.u.c.a) r0
                int r1 = r0.f80454e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80454e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$c$a r0 = new kotlinx.coroutines.flow.u$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f80452c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80454e
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f80451b
                kotlinx.coroutines.flow.u$c r5 = (kotlinx.coroutines.flow.u.c) r5
                kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2b
                goto L49
            L2b:
                r6 = move-exception
                goto L4e
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "螈\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L39:
                kotlin.a1.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f80449b     // Catch: java.lang.Throwable -> L4c
                r0.f80451b = r4     // Catch: java.lang.Throwable -> L4c
                r0.f80454e = r3     // Catch: java.lang.Throwable -> L4c
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4c
                if (r5 != r1) goto L49
                return r1
            L49:
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            L4c:
                r6 = move-exception
                r5 = r4
            L4e:
                kotlin.jvm.internal.k1$h<java.lang.Throwable> r5 = r5.f80450c
                r5.f75329b = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.c.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Errors.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<Throwable, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80455b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l Throwable th, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((d) create(th, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new d(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f80455b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("螉\u0001"));
            }
            a1.n(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Errors.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "", "cause", "", "attempt", "", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {1, 8, 0})
    static final class e<T> extends kotlin.coroutines.jvm.internal.o implements ld.r<j<? super T>, Throwable, Long, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80456b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80457c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ long f80458d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f80459e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<Throwable, kotlin.coroutines.d<? super Boolean>, Object> f80460f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j4, ld.p<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super e> dVar) {
            super(4, dVar);
            this.f80459e = j4;
            this.f80460f = pVar;
        }

        @fg.m
        public final Object a(@fg.l j<? super T> jVar, @fg.l Throwable th, long j4, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
            e eVar = new e(this.f80459e, this.f80460f, dVar);
            eVar.f80457c = th;
            eVar.f80458d = j4;
            return eVar.invokeSuspend(k2.f75408a);
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ Object i(Object obj, Throwable th, Long l4, kotlin.coroutines.d<? super Boolean> dVar) {
            return a((j) obj, th, l4.longValue(), dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
        
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r7.f80456b
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto Ld
                kotlin.a1.n(r8)
                goto L33
            Ld:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "螊\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r8.<init>(r0)
                throw r8
            L19:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f80457c
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.f80458d
                long r5 = r7.f80459e
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L3c
                ld.p<java.lang.Throwable, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r1 = r7.f80460f
                r7.f80456b = r2
                java.lang.Object r8 = r1.invoke(r8, r7)
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
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,113:1\n133#2,15:114\n*E\n"})
    public static final class f<T> implements i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f80461b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.r f80462c;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {118, 120}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80463b;

            /* renamed from: c, reason: collision with root package name */
            int f80464c;

            /* renamed from: e, reason: collision with root package name */
            Object f80466e;

            /* renamed from: f, reason: collision with root package name */
            Object f80467f;

            /* renamed from: g, reason: collision with root package name */
            Object f80468g;

            /* renamed from: h, reason: collision with root package name */
            long f80469h;

            /* renamed from: i, reason: collision with root package name */
            int f80470i;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80463b = obj;
                this.f80464c |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(i iVar, ld.r rVar) {
            this.f80461b = iVar;
            this.f80462c = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:14:0x00a1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0092 -> B:11:0x0095). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r11, @fg.l kotlin.coroutines.d<? super kotlin.k2> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof kotlinx.coroutines.flow.u.f.a
                if (r0 == 0) goto L13
                r0 = r12
                kotlinx.coroutines.flow.u$f$a r0 = (kotlinx.coroutines.flow.u.f.a) r0
                int r1 = r0.f80464c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80464c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$f$a r0 = new kotlinx.coroutines.flow.u$f$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f80463b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80464c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L54
                if (r2 == r4) goto L44
                if (r2 != r3) goto L38
                long r5 = r0.f80469h
                java.lang.Object r11 = r0.f80468g
                java.lang.Throwable r11 = (java.lang.Throwable) r11
                java.lang.Object r2 = r0.f80467f
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r7 = r0.f80466e
                kotlinx.coroutines.flow.u$f r7 = (kotlinx.coroutines.flow.u.f) r7
                kotlin.a1.n(r12)
                goto L95
            L38:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "螋\u0001"
                java.lang.String r12 = com.flashget.parentalcontrol.ProtectedSandApp.s(r12)
                r11.<init>(r12)
                throw r11
            L44:
                int r11 = r0.f80470i
                long r5 = r0.f80469h
                java.lang.Object r2 = r0.f80467f
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r7 = r0.f80466e
                kotlinx.coroutines.flow.u$f r7 = (kotlinx.coroutines.flow.u.f) r7
                kotlin.a1.n(r12)
                goto L76
            L54:
                kotlin.a1.n(r12)
                r5 = 0
                r12 = r10
            L5a:
                kotlinx.coroutines.flow.i r2 = r12.f80461b
                r0.f80466e = r12
                r0.f80467f = r11
                r7 = 0
                r0.f80468g = r7
                r0.f80469h = r5
                r7 = 0
                r0.f80470i = r7
                r0.f80464c = r4
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
                if (r12 == 0) goto La1
                ld.r r11 = r7.f80462c
                java.lang.Long r8 = new java.lang.Long
                r8.<init>(r5)
                r0.f80466e = r7
                r0.f80467f = r2
                r0.f80468g = r12
                r0.f80469h = r5
                r0.f80464c = r3
                java.lang.Object r11 = r11.i(r2, r12, r8, r0)
                if (r11 != r1) goto L92
                return r1
            L92:
                r9 = r12
                r12 = r11
                r11 = r9
            L95:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto La3
                r11 = 1
                long r5 = r5 + r11
                r11 = r4
            La1:
                r12 = r7
                goto La4
            La3:
                throw r11
            La4:
                if (r11 != 0) goto La9
                kotlin.k2 r11 = kotlin.k2.f75408a
                return r11
            La9:
                r11 = r2
                goto L5a
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.f.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @fg.l
    public static final <T> i<T> a(@fg.l i<? extends T> iVar, @fg.l ld.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        return new a(iVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l kotlinx.coroutines.flow.j<? super T> r5, @fg.l kotlin.coroutines.d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.u.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.u$b r0 = (kotlinx.coroutines.flow.u.b) r0
            int r1 = r0.f80448d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80448d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.u$b r0 = new kotlinx.coroutines.flow.u$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f80447c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80448d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f80446b
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r5 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螏\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.jvm.internal.k1$h r6 = androidx.compose.foundation.text.g.a(r6)
            kotlinx.coroutines.flow.u$c r2 = new kotlinx.coroutines.flow.u$c     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4f
            r0.f80446b = r6     // Catch: java.lang.Throwable -> L4f
            r0.f80448d = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = 0
            return r4
        L4f:
            r5 = move-exception
            r4 = r6
        L51:
            T r4 = r4.f75329b
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L74
            kotlin.coroutines.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L74
            if (r4 != 0) goto L68
            return r5
        L68:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L70
            kotlin.o.a(r4, r5)
            throw r4
        L70:
            kotlin.o.a(r5, r4)
            throw r5
        L74:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.b(kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, kotlin.coroutines.g gVar) {
        kotlinx.coroutines.k2 k2Var = (kotlinx.coroutines.k2) gVar.c(kotlinx.coroutines.k2.INSTANCE);
        if (k2Var == null || !k2Var.isCancelled()) {
            return false;
        }
        return d(th, k2Var.x());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && kotlin.jvm.internal.l0.g(th2, th);
    }

    @fg.l
    public static final <T> i<T> e(@fg.l i<? extends T> iVar, long j4, @fg.l ld.p<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        if (j4 > 0) {
            return new f(iVar, new e(j4, pVar, null));
        }
        throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("螐\u0001"), j4).toString());
    }

    public static i f(i iVar, long j4, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = Long.MAX_VALUE;
        }
        if ((i4 & 2) != 0) {
            pVar = new d(2, null);
        }
        return e(iVar, j4, pVar);
    }

    @fg.l
    public static final <T> i<T> g(@fg.l i<? extends T> iVar, @fg.l ld.r<? super j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> rVar) {
        return new f(iVar, rVar);
    }
}
