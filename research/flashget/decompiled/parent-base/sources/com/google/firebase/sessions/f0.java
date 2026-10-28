package com.google.firebase.sessions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: SessionFirelogPublisher.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u001aB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/f0;", "Lcom/google/firebase/sessions/e0;", "Lcom/google/firebase/g;", "firebaseApp", "Lcom/google/firebase/installations/k;", "firebaseInstallations", "Lcom/google/firebase/sessions/settings/f;", "sessionSettings", "Lcom/google/firebase/sessions/i;", "eventGDTLogger", "Lkotlin/coroutines/g;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/g;Lcom/google/firebase/installations/k;Lcom/google/firebase/sessions/settings/f;Lcom/google/firebase/sessions/i;Lkotlin/coroutines/g;)V", "Lcom/google/firebase/sessions/c0;", "sessionEvent", "Lkotlin/k2;", "g", "(Lcom/google/firebase/sessions/c0;)V", "", "i", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "h", "()Z", "Lcom/google/firebase/sessions/b0;", "sessionDetails", "a", "(Lcom/google/firebase/sessions/b0;)V", "b", "Lcom/google/firebase/g;", "c", "Lcom/google/firebase/installations/k;", "d", "Lcom/google/firebase/sessions/settings/f;", "e", "Lcom/google/firebase/sessions/i;", "f", "Lkotlin/coroutines/g;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class f0 implements e0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.google.firebase.g firebaseApp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.google.firebase.installations.k firebaseInstallations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.google.firebase.sessions.settings.f sessionSettings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i eventGDTLogger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g backgroundDispatcher;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final String f60865h = ProtectedSandApp.s("Ӑ\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final double f60866i = Math.random();

    /* compiled from: SessionFirelogPublisher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", i = {2}, l = {63, 64, 70}, m = "invokeSuspend", n = {"installationId"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f60872b;

        /* renamed from: c, reason: collision with root package name */
        Object f60873c;

        /* renamed from: d, reason: collision with root package name */
        Object f60874d;

        /* renamed from: e, reason: collision with root package name */
        Object f60875e;

        /* renamed from: f, reason: collision with root package name */
        Object f60876f;

        /* renamed from: g, reason: collision with root package name */
        Object f60877g;

        /* renamed from: h, reason: collision with root package name */
        int f60878h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ b0 f60880j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0 b0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f60880j = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return f0.this.new b(this.f60880j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0097 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r10.f60878h
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L47
                if (r1 == r4) goto L43
                if (r1 == r3) goto L3f
                if (r1 != r2) goto L33
                java.lang.Object r0 = r10.f60877g
                com.google.firebase.sessions.settings.f r0 = (com.google.firebase.sessions.settings.f) r0
                java.lang.Object r1 = r10.f60876f
                com.google.firebase.sessions.b0 r1 = (com.google.firebase.sessions.b0) r1
                java.lang.Object r2 = r10.f60875e
                com.google.firebase.g r2 = (com.google.firebase.g) r2
                java.lang.Object r3 = r10.f60874d
                com.google.firebase.sessions.d0 r3 = (com.google.firebase.sessions.d0) r3
                java.lang.Object r4 = r10.f60873c
                com.google.firebase.sessions.f0 r4 = (com.google.firebase.sessions.f0) r4
                java.lang.Object r5 = r10.f60872b
                com.google.firebase.sessions.t r5 = (com.google.firebase.sessions.t) r5
                kotlin.a1.n(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L9f
            L33:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "ӏ\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r11.<init>(r0)
                throw r11
            L3f:
                kotlin.a1.n(r11)
                goto L6e
            L43:
                kotlin.a1.n(r11)
                goto L55
            L47:
                kotlin.a1.n(r11)
                com.google.firebase.sessions.f0 r11 = com.google.firebase.sessions.f0.this
                r10.f60878h = r4
                java.lang.Object r11 = com.google.firebase.sessions.f0.f(r11, r10)
                if (r11 != r0) goto L55
                return r0
            L55:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb2
                com.google.firebase.sessions.t$a r11 = com.google.firebase.sessions.t.INSTANCE
                com.google.firebase.sessions.f0 r1 = com.google.firebase.sessions.f0.this
                com.google.firebase.installations.k r1 = com.google.firebase.sessions.f0.d(r1)
                r10.f60878h = r3
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L6e
                return r0
            L6e:
                r5 = r11
                com.google.firebase.sessions.t r5 = (com.google.firebase.sessions.t) r5
                com.google.firebase.sessions.f0 r4 = com.google.firebase.sessions.f0.this
                com.google.firebase.sessions.d0 r3 = com.google.firebase.sessions.d0.f60857a
                com.google.firebase.g r11 = com.google.firebase.sessions.f0.c(r4)
                com.google.firebase.sessions.b0 r1 = r10.f60880j
                com.google.firebase.sessions.f0 r6 = com.google.firebase.sessions.f0.this
                com.google.firebase.sessions.settings.f r6 = com.google.firebase.sessions.f0.e(r6)
                com.google.firebase.sessions.api.a r7 = com.google.firebase.sessions.api.a.f60788a
                r10.f60872b = r5
                r10.f60873c = r4
                r10.f60874d = r3
                r10.f60875e = r11
                r10.f60876f = r1
                r10.f60877g = r6
                r10.f60878h = r2
                java.lang.Object r2 = r7.c(r10)
                if (r2 != r0) goto L98
                return r0
            L98:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L9f:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.getFid()
                java.lang.String r6 = r5.getAuthToken()
                r5 = r11
                com.google.firebase.sessions.c0 r11 = r0.a(r1, r2, r3, r4, r5, r6)
                com.google.firebase.sessions.f0.b(r7, r11)
            Lb2:
                kotlin.k2 r11 = kotlin.k2.f75408a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.f0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {0}, l = {94}, m = "shouldLogSession", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f60881b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60882c;

        /* renamed from: e, reason: collision with root package name */
        int f60884e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f60882c = obj;
            this.f60884e |= Integer.MIN_VALUE;
            return f0.this.i(this);
        }
    }

    public f0(@fg.l com.google.firebase.g gVar, @fg.l com.google.firebase.installations.k kVar, @fg.l com.google.firebase.sessions.settings.f fVar, @fg.l i iVar, @fg.l kotlin.coroutines.g gVar2) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("ӑ\u0001"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("Ӓ\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("ӓ\u0001"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("Ӕ\u0001"));
        kotlin.jvm.internal.l0.p(gVar2, ProtectedSandApp.s("ӕ\u0001"));
        this.firebaseApp = gVar;
        this.firebaseInstallations = kVar;
        this.sessionSettings = fVar;
        this.eventGDTLogger = iVar;
        this.backgroundDispatcher = gVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(c0 sessionEvent) {
        try {
            this.eventGDTLogger.a(sessionEvent);
            sessionEvent.h().o();
        } catch (RuntimeException unused) {
        }
    }

    private final boolean h() {
        return f60866i <= this.sessionSettings.b();
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
    public final java.lang.Object i(kotlin.coroutines.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.firebase.sessions.f0.c
            if (r0 == 0) goto L13
            r0 = r5
            com.google.firebase.sessions.f0$c r0 = (com.google.firebase.sessions.f0.c) r0
            int r1 = r0.f60884e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60884e = r1
            goto L18
        L13:
            com.google.firebase.sessions.f0$c r0 = new com.google.firebase.sessions.f0$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f60882c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f60884e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f60881b
            com.google.firebase.sessions.f0 r0 = (com.google.firebase.sessions.f0) r0
            kotlin.a1.n(r5)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Ӗ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.a1.n(r5)
            com.google.firebase.sessions.settings.f r5 = r4.sessionSettings
            r0.f60881b = r4
            r0.f60884e = r3
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
            boolean r5 = r0.h()
            if (r5 != 0) goto L5c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.f0.i(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.e0
    public void a(@fg.l b0 sessionDetails) {
        kotlin.jvm.internal.l0.p(sessionDetails, ProtectedSandApp.s("ӗ\u0001"));
        kotlinx.coroutines.k.f(s0.a(this.backgroundDispatcher), null, null, new b(sessionDetails, null), 3, null);
    }
}
