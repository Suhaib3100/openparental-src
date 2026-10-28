package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.k2;

/* compiled from: SingleRunner.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0003\u000f\f\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/paging/p1;", "", "", "cancelPreviousInEqualPriority", "<init>", "(Z)V", "", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "block", "b", "(ILld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/p1$c;", "a", "Landroidx/paging/p1$c;", "holder", "c", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class p1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f32191c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c holder;

    /* compiled from: SingleRunner.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/paging/p1$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Landroidx/paging/p1;", "runner", "<init>", "(Landroidx/paging/p1;)V", "b", "Landroidx/paging/p1;", "a", "()Landroidx/paging/p1;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class a extends CancellationException {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final p1 runner;

        public a(@fg.l p1 runner) {
            kotlin.jvm.internal.l0.p(runner, "runner");
            this.runner = runner;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final p1 getRunner() {
            return this.runner;
        }
    }

    /* compiled from: SingleRunner.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/paging/p1$c;", "", "Landroidx/paging/p1;", "singleRunner", "", "cancelPreviousInEqualPriority", "<init>", "(Landroidx/paging/p1;Z)V", "", "priority", "Lkotlinx/coroutines/k2;", "job", "b", "(ILkotlinx/coroutines/k2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/k2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/p1;", "Z", "Lkotlinx/coroutines/sync/a;", "c", "Lkotlinx/coroutines/sync/a;", "mutex", "d", "Lkotlinx/coroutines/k2;", "previous", "e", "I", "previousPriority", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final p1 singleRunner;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean cancelPreviousInEqualPriority;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.sync.a mutex;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private k2 previous;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int previousPriority;

        /* compiled from: SingleRunner.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0}, l = {129}, m = "onFinish", n = {"this", "job", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f32199b;

            /* renamed from: c, reason: collision with root package name */
            Object f32200c;

            /* renamed from: d, reason: collision with root package name */
            Object f32201d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f32202e;

            /* renamed from: g, reason: collision with root package name */
            int f32204g;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f32202e = obj;
                this.f32204g |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        /* compiled from: SingleRunner.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {129, 100}, m = "tryEnqueue", n = {"this", "job", "$this$withLock_u24default$iv", "priority", "this", "job", "$this$withLock_u24default$iv", "priority"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f32205b;

            /* renamed from: c, reason: collision with root package name */
            Object f32206c;

            /* renamed from: d, reason: collision with root package name */
            Object f32207d;

            /* renamed from: e, reason: collision with root package name */
            int f32208e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f32209f;

            /* renamed from: h, reason: collision with root package name */
            int f32211h;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f32209f = obj;
                this.f32211h |= Integer.MIN_VALUE;
                return c.this.b(0, null, this);
            }
        }

        public c(@fg.l p1 singleRunner, boolean z4) {
            kotlin.jvm.internal.l0.p(singleRunner, "singleRunner");
            this.singleRunner = singleRunner;
            this.cancelPreviousInEqualPriority = z4;
            this.mutex = kotlinx.coroutines.sync.c.b(false, 1, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:11:0x0053, B:13:0x0057, B:14:0x005c), top: B:10:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(@fg.l kotlinx.coroutines.k2 r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.p1.c.a
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.p1$c$a r0 = (androidx.paging.p1.c.a) r0
                int r1 = r0.f32204g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32204g = r1
                goto L18
            L13:
                androidx.paging.p1$c$a r0 = new androidx.paging.p1$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f32202e
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f32204g
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r6 = r0.f32201d
                kotlinx.coroutines.sync.a r6 = (kotlinx.coroutines.sync.a) r6
                java.lang.Object r1 = r0.f32200c
                kotlinx.coroutines.k2 r1 = (kotlinx.coroutines.k2) r1
                java.lang.Object r0 = r0.f32199b
                androidx.paging.p1$c r0 = (androidx.paging.p1.c) r0
                kotlin.a1.n(r7)
                r7 = r6
                r6 = r1
                goto L53
            L36:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3e:
                kotlin.a1.n(r7)
                kotlinx.coroutines.sync.a r7 = r5.mutex
                r0.f32199b = r5
                r0.f32200c = r6
                r0.f32201d = r7
                r0.f32204g = r3
                java.lang.Object r0 = r7.f(r4, r0)
                if (r0 != r1) goto L52
                return r1
            L52:
                r0 = r5
            L53:
                kotlinx.coroutines.k2 r1 = r0.previous     // Catch: java.lang.Throwable -> L5a
                if (r6 != r1) goto L5c
                r0.previous = r4     // Catch: java.lang.Throwable -> L5a
                goto L5c
            L5a:
                r6 = move-exception
                goto L62
            L5c:
                kotlin.k2 r6 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L5a
                r7.g(r4)
                return r6
            L62:
                r7.g(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.p1.c.a(kotlinx.coroutines.k2, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0035, B:14:0x00ac, B:15:0x00b0, B:23:0x0070, B:25:0x0074, B:27:0x007a, B:30:0x0080, B:38:0x0097, B:42:0x008a), top: B:7:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlinx.coroutines.k2] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.a] */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.a] */
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(int r10, @fg.l kotlinx.coroutines.k2 r11, @fg.l kotlin.coroutines.d<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof androidx.paging.p1.c.b
                if (r0 == 0) goto L13
                r0 = r12
                androidx.paging.p1$c$b r0 = (androidx.paging.p1.c.b) r0
                int r1 = r0.f32211h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32211h = r1
                goto L18
            L13:
                androidx.paging.p1$c$b r0 = new androidx.paging.p1$c$b
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f32209f
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f32211h
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L57
                if (r2 == r4) goto L45
                if (r2 != r3) goto L3d
                int r10 = r0.f32208e
                java.lang.Object r11 = r0.f32207d
                kotlinx.coroutines.sync.a r11 = (kotlinx.coroutines.sync.a) r11
                java.lang.Object r1 = r0.f32206c
                kotlinx.coroutines.k2 r1 = (kotlinx.coroutines.k2) r1
                java.lang.Object r0 = r0.f32205b
                androidx.paging.p1$c r0 = (androidx.paging.p1.c) r0
                kotlin.a1.n(r12)     // Catch: java.lang.Throwable -> L3a
                goto Laa
            L3a:
                r10 = move-exception
                goto Lb8
            L3d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L45:
                int r10 = r0.f32208e
                java.lang.Object r11 = r0.f32207d
                kotlinx.coroutines.sync.a r11 = (kotlinx.coroutines.sync.a) r11
                java.lang.Object r2 = r0.f32206c
                kotlinx.coroutines.k2 r2 = (kotlinx.coroutines.k2) r2
                java.lang.Object r6 = r0.f32205b
                androidx.paging.p1$c r6 = (androidx.paging.p1.c) r6
                kotlin.a1.n(r12)
                goto L70
            L57:
                kotlin.a1.n(r12)
                kotlinx.coroutines.sync.a r12 = r9.mutex
                r0.f32205b = r9
                r0.f32206c = r11
                r0.f32207d = r12
                r0.f32208e = r10
                r0.f32211h = r4
                java.lang.Object r2 = r12.f(r5, r0)
                if (r2 != r1) goto L6d
                return r1
            L6d:
                r6 = r9
                r2 = r11
                r11 = r12
            L70:
                kotlinx.coroutines.k2 r12 = r6.previous     // Catch: java.lang.Throwable -> L3a
                if (r12 == 0) goto L87
                boolean r7 = r12.isActive()     // Catch: java.lang.Throwable -> L3a
                if (r7 == 0) goto L87
                int r7 = r6.previousPriority     // Catch: java.lang.Throwable -> L3a
                if (r7 < r10) goto L87
                if (r7 != r10) goto L85
                boolean r7 = r6.cancelPreviousInEqualPriority     // Catch: java.lang.Throwable -> L3a
                if (r7 == 0) goto L85
                goto L87
            L85:
                r4 = 0
                goto Lb0
            L87:
                if (r12 != 0) goto L8a
                goto L94
            L8a:
                androidx.paging.p1$a r7 = new androidx.paging.p1$a     // Catch: java.lang.Throwable -> L3a
                androidx.paging.p1 r8 = r6.singleRunner     // Catch: java.lang.Throwable -> L3a
                r7.<init>(r8)     // Catch: java.lang.Throwable -> L3a
                r12.b(r7)     // Catch: java.lang.Throwable -> L3a
            L94:
                if (r12 != 0) goto L97
                goto Lac
            L97:
                r0.f32205b = r6     // Catch: java.lang.Throwable -> L3a
                r0.f32206c = r2     // Catch: java.lang.Throwable -> L3a
                r0.f32207d = r11     // Catch: java.lang.Throwable -> L3a
                r0.f32208e = r10     // Catch: java.lang.Throwable -> L3a
                r0.f32211h = r3     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r12 = r12.j0(r0)     // Catch: java.lang.Throwable -> L3a
                if (r12 != r1) goto La8
                return r1
            La8:
                r1 = r2
                r0 = r6
            Laa:
                r6 = r0
                r2 = r1
            Lac:
                r6.previous = r2     // Catch: java.lang.Throwable -> L3a
                r6.previousPriority = r10     // Catch: java.lang.Throwable -> L3a
            Lb0:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L3a
                r11.g(r5)
                return r10
            Lb8:
                r11.g(r5)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.p1.c.b(int, kotlinx.coroutines.k2, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: SingleRunner.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", i = {0}, l = {49}, m = "runInIsolation", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32212b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32213c;

        /* renamed from: e, reason: collision with root package name */
        int f32215e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32213c = obj;
            this.f32215e |= Integer.MIN_VALUE;
            return p1.this.b(0, null, this);
        }
    }

    /* compiled from: SingleRunner.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", i = {0, 1}, l = {53, 59, 61, 61}, m = "invokeSuspend", n = {"myJob", "myJob"}, s = {"L$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32216b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f32217c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f32219e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> f32220f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(int i4, ld.l<? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> lVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f32219e = i4;
            this.f32220f = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = p1.this.new e(this.f32219e, this.f32220f, dVar);
            eVar.f32217c = obj;
            return eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.k2] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.k2] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.p1$c] */
        /* JADX WARN: Type inference failed for: r9v15, types: [androidx.paging.p1$c] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r8.f32216b
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3a
                if (r1 == r5) goto L32
                if (r1 == r4) goto L28
                if (r1 == r3) goto L23
                if (r1 == r2) goto L1a
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r0 = r8.f32217c
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.a1.n(r9)
                goto L9e
            L23:
                kotlin.a1.n(r9)
                goto L9f
            L28:
                java.lang.Object r1 = r8.f32217c
                kotlinx.coroutines.k2 r1 = (kotlinx.coroutines.k2) r1
                kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L30
                goto L7a
            L30:
                r9 = move-exception
                goto L8c
            L32:
                java.lang.Object r1 = r8.f32217c
                kotlinx.coroutines.k2 r1 = (kotlinx.coroutines.k2) r1
                kotlin.a1.n(r9)
                goto L65
            L3a:
                kotlin.a1.n(r9)
                java.lang.Object r9 = r8.f32217c
                kotlinx.coroutines.r0 r9 = (kotlinx.coroutines.r0) r9
                kotlin.coroutines.g r9 = r9.getCoroutineContext()
                kotlinx.coroutines.k2$b r1 = kotlinx.coroutines.k2.INSTANCE
                kotlin.coroutines.g$b r9 = r9.c(r1)
                if (r9 == 0) goto La2
                kotlinx.coroutines.k2 r9 = (kotlinx.coroutines.k2) r9
                androidx.paging.p1 r1 = androidx.paging.p1.this
                androidx.paging.p1$c r1 = androidx.paging.p1.a(r1)
                int r6 = r8.f32219e
                r8.f32217c = r9
                r8.f32216b = r5
                java.lang.Object r1 = r1.b(r6, r9, r8)
                if (r1 != r0) goto L62
                return r0
            L62:
                r7 = r1
                r1 = r9
                r9 = r7
            L65:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9f
                ld.l<kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r9 = r8.f32220f     // Catch: java.lang.Throwable -> L30
                r8.f32217c = r1     // Catch: java.lang.Throwable -> L30
                r8.f32216b = r4     // Catch: java.lang.Throwable -> L30
                java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L30
                if (r9 != r0) goto L7a
                return r0
            L7a:
                androidx.paging.p1 r9 = androidx.paging.p1.this
                androidx.paging.p1$c r9 = androidx.paging.p1.a(r9)
                r2 = 0
                r8.f32217c = r2
                r8.f32216b = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L9f
                return r0
            L8c:
                androidx.paging.p1 r3 = androidx.paging.p1.this
                androidx.paging.p1$c r3 = androidx.paging.p1.a(r3)
                r8.f32217c = r9
                r8.f32216b = r2
                java.lang.Object r1 = r3.a(r1, r8)
                if (r1 != r0) goto L9d
                return r0
            L9d:
                r0 = r9
            L9e:
                throw r0
            L9f:
                kotlin.k2 r9 = kotlin.k2.f75408a
                return r9
            La2:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.p1.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public p1() {
        this(false, 1, null);
    }

    public static /* synthetic */ Object c(p1 p1Var, int i4, ld.l lVar, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return p1Var.b(i4, lVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, @fg.l ld.l<? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.p1.d
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.p1$d r0 = (androidx.paging.p1.d) r0
            int r1 = r0.f32215e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32215e = r1
            goto L18
        L13:
            androidx.paging.p1$d r0 = new androidx.paging.p1$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32213c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f32215e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f32212b
            androidx.paging.p1 r5 = (androidx.paging.p1) r5
            kotlin.a1.n(r7)     // Catch: androidx.paging.p1.a -> L2b
            goto L51
        L2b:
            r6 = move-exception
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.a1.n(r7)
            androidx.paging.p1$e r7 = new androidx.paging.p1$e     // Catch: androidx.paging.p1.a -> L49
            r2 = 0
            r7.<init>(r5, r6, r2)     // Catch: androidx.paging.p1.a -> L49
            r0.f32212b = r4     // Catch: androidx.paging.p1.a -> L49
            r0.f32215e = r3     // Catch: androidx.paging.p1.a -> L49
            java.lang.Object r5 = kotlinx.coroutines.s0.g(r7, r0)     // Catch: androidx.paging.p1.a -> L49
            if (r5 != r1) goto L51
            return r1
        L49:
            r6 = move-exception
            r5 = r4
        L4b:
            androidx.paging.p1 r7 = r6.getRunner()
            if (r7 != r5) goto L54
        L51:
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        L54:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.p1.b(int, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    public p1(boolean z4) {
        this.holder = new c(this, z4);
    }

    public /* synthetic */ p1(boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? true : z4);
    }
}
