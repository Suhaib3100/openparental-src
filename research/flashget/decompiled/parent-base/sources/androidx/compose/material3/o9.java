package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.z0;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0013\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R/\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/o9;", "", "<init>", "()V", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/m9;", "duration", "Landroidx/compose/material3/q9;", "e", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/m9;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/material3/r9;", "visuals", "d", "(Landroidx/compose/material3/r9;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/a;", "a", "Lkotlinx/coroutines/sync/a;", "mutex", "Landroidx/compose/material3/k9;", "<set-?>", "b", "Landroidx/compose/runtime/k2;", "()Landroidx/compose/material3/k9;", "c", "(Landroidx/compose/material3/k9;)V", "currentSnackbarData", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@kotlin.jvm.internal.r1({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,464:1\n81#2:465\n107#2,2:466\n120#3,8:468\n129#3:487\n314#4,11:476\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n*L\n73#1:465\n73#1:466,2\n129#1:468,8\n129#1:487\n131#1:476,11\n*E\n"})
/* loaded from: classes.dex */
public final class o9 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f12945c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.sync.a mutex = kotlinx.coroutines.sync.c.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 currentSnackbarData;

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/o9$a;", "Landroidx/compose/material3/k9;", "Landroidx/compose/material3/r9;", "visuals", "Lkotlinx/coroutines/p;", "Landroidx/compose/material3/q9;", "continuation", "<init>", "(Landroidx/compose/material3/r9;Lkotlinx/coroutines/p;)V", "Lkotlin/k2;", "b", "()V", "dismiss", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/material3/r9;", "()Landroidx/compose/material3/r9;", "Lkotlinx/coroutines/p;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements k9 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final r9 visuals;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.p<q9> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l r9 r9Var, @fg.l kotlinx.coroutines.p<? super q9> pVar) {
            this.visuals = r9Var;
            this.continuation = pVar;
        }

        @Override // androidx.compose.material3.k9
        @fg.l
        /* renamed from: a, reason: from getter */
        public r9 getVisuals() {
            return this.visuals;
        }

        @Override // androidx.compose.material3.k9
        public void b() {
            if (this.continuation.isActive()) {
                kotlinx.coroutines.p<q9> pVar = this.continuation;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(q9.ActionPerformed);
            }
        }

        @Override // androidx.compose.material3.k9
        public void dismiss() {
            if (this.continuation.isActive()) {
                kotlinx.coroutines.p<q9> pVar = this.continuation;
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(q9.Dismissed);
            }
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || a.class != other.getClass()) {
                return false;
            }
            a aVar = (a) other;
            return kotlin.jvm.internal.l0.g(this.visuals, aVar.visuals) && kotlin.jvm.internal.l0.g(this.continuation, aVar.continuation);
        }

        public int hashCode() {
            return this.continuation.hashCode() + (this.visuals.hashCode() * 31);
        }
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/o9$b;", "Landroidx/compose/material3/r9;", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/m9;", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/m9;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "Landroidx/compose/material3/m9;", "getDuration", "()Landroidx/compose/material3/m9;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements r9 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final String actionLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean withDismissAction;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final m9 duration;

        public b(@fg.l String str, @fg.m String str2, boolean z4, @fg.l m9 m9Var) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z4;
            this.duration = m9Var;
        }

        @Override // androidx.compose.material3.r9
        @fg.m
        /* renamed from: a, reason: from getter */
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.r9
        /* renamed from: b, reason: from getter */
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || b.class != other.getClass()) {
                return false;
            }
            b bVar = (b) other;
            return kotlin.jvm.internal.l0.g(this.message, bVar.message) && kotlin.jvm.internal.l0.g(this.actionLabel, bVar.actionLabel) && this.withDismissAction == bVar.withDismissAction && this.duration == bVar.duration;
        }

        @Override // androidx.compose.material3.r9
        @fg.l
        public m9 getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.r9
        @fg.l
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.actionLabel;
            return this.duration.hashCode() + androidx.compose.animation.d1.a(this.withDismissAction, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        }
    }

    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {470, 473}, m = "showSnackbar", n = {"this", "visuals", "$this$withLock_u24default$iv", "this", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f12954b;

        /* renamed from: c, reason: collision with root package name */
        Object f12955c;

        /* renamed from: d, reason: collision with root package name */
        Object f12956d;

        /* renamed from: e, reason: collision with root package name */
        Object f12957e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f12958f;

        /* renamed from: h, reason: collision with root package name */
        int f12960h;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f12958f = obj;
            this.f12960h |= Integer.MIN_VALUE;
            return o9.this.d(null, this);
        }
    }

    public o9() {
        androidx.compose.runtime.k2 g4;
        g4 = androidx.compose.runtime.t4.g(null, null, 2, null);
        this.currentSnackbarData = g4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(k9 k9Var) {
        this.currentSnackbarData.setValue(k9Var);
    }

    public static /* synthetic */ Object f(o9 o9Var, String str, String str2, boolean z4, m9 m9Var, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        boolean z5 = z4;
        if ((i4 & 8) != 0) {
            m9Var = str3 == null ? m9.Short : m9.Indefinite;
        }
        return o9Var.e(str, str3, z5, m9Var, dVar);
    }

    @fg.m
    public final k9 b() {
        return (k9) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #0 {all -> 0x0096, blocks: (B:26:0x006e, B:28:0x0092), top: B:25:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@fg.l androidx.compose.material3.r9 r9, @fg.l kotlin.coroutines.d<? super androidx.compose.material3.q9> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.o9.c
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.o9$c r0 = (androidx.compose.material3.o9.c) r0
            int r1 = r0.f12960h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12960h = r1
            goto L18
        L13:
            androidx.compose.material3.o9$c r0 = new androidx.compose.material3.o9$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f12958f
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f12960h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L59
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r9 = r0.f12957e
            androidx.compose.material3.o9$c r9 = (androidx.compose.material3.o9.c) r9
            java.lang.Object r9 = r0.f12956d
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.a) r9
            java.lang.Object r1 = r0.f12955c
            androidx.compose.material3.r9 r1 = (androidx.compose.material3.r9) r1
            java.lang.Object r0 = r0.f12954b
            androidx.compose.material3.o9 r0 = (androidx.compose.material3.o9) r0
            kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L3c
            goto La3
        L3c:
            r10 = move-exception
            goto Lac
        L3f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L47:
            java.lang.Object r9 = r0.f12956d
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.a) r9
            java.lang.Object r2 = r0.f12955c
            androidx.compose.material3.r9 r2 = (androidx.compose.material3.r9) r2
            java.lang.Object r6 = r0.f12954b
            androidx.compose.material3.o9 r6 = (androidx.compose.material3.o9) r6
            kotlin.a1.n(r10)
            r10 = r9
            r9 = r2
            goto L6e
        L59:
            kotlin.a1.n(r10)
            kotlinx.coroutines.sync.a r10 = r8.mutex
            r0.f12954b = r8
            r0.f12955c = r9
            r0.f12956d = r10
            r0.f12960h = r4
            java.lang.Object r2 = r10.f(r5, r0)
            if (r2 != r1) goto L6d
            return r1
        L6d:
            r6 = r8
        L6e:
            r0.f12954b = r6     // Catch: java.lang.Throwable -> L96
            r0.f12955c = r9     // Catch: java.lang.Throwable -> L96
            r0.f12956d = r10     // Catch: java.lang.Throwable -> L96
            r0.f12957e = r0     // Catch: java.lang.Throwable -> L96
            r0.f12960h = r3     // Catch: java.lang.Throwable -> L96
            kotlinx.coroutines.q r2 = new kotlinx.coroutines.q     // Catch: java.lang.Throwable -> L96
            kotlin.coroutines.d r3 = kotlin.coroutines.intrinsics.b.e(r0)     // Catch: java.lang.Throwable -> L96
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L96
            r2.e0()     // Catch: java.lang.Throwable -> L96
            androidx.compose.material3.o9$a r3 = new androidx.compose.material3.o9$a     // Catch: java.lang.Throwable -> L96
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> L96
            r6.c(r3)     // Catch: java.lang.Throwable -> L96
            java.lang.Object r9 = r2.y()     // Catch: java.lang.Throwable -> L96
            if (r9 != r1) goto L9c
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L96
            goto L9c
        L96:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
            goto Lac
        L9c:
            if (r9 != r1) goto L9f
            return r1
        L9f:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        La3:
            r0.c(r5)     // Catch: java.lang.Throwable -> Laa
            r9.g(r5)
            return r10
        Laa:
            r10 = move-exception
            goto Lb0
        Lac:
            r0.c(r5)     // Catch: java.lang.Throwable -> Laa
            throw r10     // Catch: java.lang.Throwable -> Laa
        Lb0:
            r9.g(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.o9.d(androidx.compose.material3.r9, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public final Object e(@fg.l String str, @fg.m String str2, boolean z4, @fg.l m9 m9Var, @fg.l kotlin.coroutines.d<? super q9> dVar) {
        return d(new b(str, str2, z4, m9Var), dVar);
    }
}
