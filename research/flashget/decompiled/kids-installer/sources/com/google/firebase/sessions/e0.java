package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;

/* compiled from: SessionFirelogPublisher.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u000fB/\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\b\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/e0;", "Lcom/google/firebase/sessions/d0;", "Lcom/google/firebase/sessions/b0;", "sessionEvent", "Lkotlin/m2;", "g", "", "j", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "kotlin.jvm.PlatformType", "h", "i", "Lcom/google/firebase/sessions/a0;", "sessionDetails", "a", "Lcom/google/firebase/g;", "b", "Lcom/google/firebase/g;", "firebaseApp", "Lcom/google/firebase/installations/k;", "c", "Lcom/google/firebase/installations/k;", "firebaseInstallations", "Lcom/google/firebase/sessions/settings/f;", "d", "Lcom/google/firebase/sessions/settings/f;", "sessionSettings", "Lcom/google/firebase/sessions/i;", "e", "Lcom/google/firebase/sessions/i;", "eventGDTLogger", "Lkotlin/coroutines/g;", "f", "Lkotlin/coroutines/g;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/g;Lcom/google/firebase/installations/k;Lcom/google/firebase/sessions/settings/f;Lcom/google/firebase/sessions/i;Lkotlin/coroutines/g;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class e0 implements d0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final com.google.firebase.g firebaseApp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final com.google.firebase.installations.k firebaseInstallations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final com.google.firebase.sessions.settings.f sessionSettings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final i eventGDTLogger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext backgroundDispatcher;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private static final String f18587h = ProtectedSandApp.s("⮁");

    /* renamed from: i, reason: collision with root package name */
    private static final double f18588i = Math.random();

    /* compiled from: SessionFirelogPublisher.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {}, l = {113}, m = "getFirebaseInstallationId", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f18594r;

        /* renamed from: t, reason: collision with root package name */
        int f18596t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f18594r = obj;
            this.f18596t |= Integer.MIN_VALUE;
            return e0.this.h(this);
        }
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", i = {}, l = {64, 72, 73}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class c extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {
        int A;
        final /* synthetic */ a0 C;

        /* renamed from: s, reason: collision with root package name */
        Object f18597s;

        /* renamed from: t, reason: collision with root package name */
        Object f18598t;

        /* renamed from: u, reason: collision with root package name */
        Object f18599u;

        /* renamed from: v, reason: collision with root package name */
        Object f18600v;

        /* renamed from: w, reason: collision with root package name */
        Object f18601w;

        /* renamed from: x, reason: collision with root package name */
        Object f18602x;

        /* renamed from: y, reason: collision with root package name */
        Object f18603y;

        /* renamed from: z, reason: collision with root package name */
        Object f18604z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a0 a0Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.C = a0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00fe A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.e0.c.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((c) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return e0.this.new c(this.C, continuation);
        }
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {0}, l = {95}, m = "shouldLogSession", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class d extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f18605r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f18606s;

        /* renamed from: u, reason: collision with root package name */
        int f18608u;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f18606s = obj;
            this.f18608u |= Integer.MIN_VALUE;
            return e0.this.j(this);
        }
    }

    public e0(@d5.d com.google.firebase.g gVar, @d5.d com.google.firebase.installations.k kVar, @d5.d com.google.firebase.sessions.settings.f fVar, @d5.d i iVar, @d5.d CoroutineContext coroutineContext) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("⮂"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("⮃"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("⮄"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("⮅"));
        kotlin.jvm.internal.l0.p(coroutineContext, ProtectedSandApp.s("⮆"));
        this.firebaseApp = gVar;
        this.firebaseInstallations = kVar;
        this.sessionSettings = fVar;
        this.eventGDTLogger = iVar;
        this.backgroundDispatcher = coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(b0 b0Var) {
        try {
            this.eventGDTLogger.a(b0Var);
            b0Var.h().m();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.Continuation<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.firebase.sessions.e0.b
            if (r0 == 0) goto L13
            r0 = r5
            com.google.firebase.sessions.e0$b r0 = (com.google.firebase.sessions.e0.b) r0
            int r1 = r0.f18596t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18596t = r1
            goto L18
        L13:
            com.google.firebase.sessions.e0$b r0 = new com.google.firebase.sessions.e0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18594r
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f18596t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L27
            kotlin.a1.n(r5)     // Catch: java.lang.Exception -> L51
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "⮇"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.a1.n(r5)
            com.google.firebase.installations.k r5 = r4.firebaseInstallations     // Catch: java.lang.Exception -> L51
            com.google.android.gms.tasks.Task r5 = r5.getId()     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = "⮈"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Exception -> L51
            kotlin.jvm.internal.l0.o(r5, r2)     // Catch: java.lang.Exception -> L51
            r0.f18596t = r3     // Catch: java.lang.Exception -> L51
            java.lang.Object r5 = kotlinx.coroutines.tasks.c.i(r5, r0)     // Catch: java.lang.Exception -> L51
            if (r5 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L51
            goto L53
        L51:
            java.lang.String r5 = ""
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.e0.h(kotlin.coroutines.d):java.lang.Object");
    }

    private final boolean i() {
        return f18588i <= this.sessionSettings.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.firebase.sessions.e0.d
            if (r0 == 0) goto L13
            r0 = r5
            com.google.firebase.sessions.e0$d r0 = (com.google.firebase.sessions.e0.d) r0
            int r1 = r0.f18608u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18608u = r1
            goto L18
        L13:
            com.google.firebase.sessions.e0$d r0 = new com.google.firebase.sessions.e0$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18606s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f18608u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f18605r
            com.google.firebase.sessions.e0 r0 = (com.google.firebase.sessions.e0) r0
            kotlin.a1.n(r5)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "⮉"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.a1.n(r5)
            com.google.firebase.sessions.settings.f r5 = r4.sessionSettings
            r0.f18605r = r4
            r0.f18608u = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            com.google.firebase.sessions.settings.f r5 = r0.sessionSettings
            boolean r5 = r5.d()
            if (r5 != 0) goto L53
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L53:
            boolean r5 = r0.i()
            if (r5 != 0) goto L5c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.e0.j(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.d0
    public void a(@d5.d a0 a0Var) {
        kotlin.jvm.internal.l0.p(a0Var, ProtectedSandApp.s("⮊"));
        kotlinx.coroutines.l.f(v0.a(this.backgroundDispatcher), null, null, new c(a0Var, null), 3, null);
    }
}
