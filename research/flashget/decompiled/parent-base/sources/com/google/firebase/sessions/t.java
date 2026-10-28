package com.google.firebase.sessions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: InstallationId.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/t;", "", "", "fid", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String fid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String authToken;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f61019d = ProtectedSandApp.s("թ\u0001");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: InstallationId.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/t$a;", "", "<init>", "()V", "Lcom/google/firebase/installations/k;", "firebaseInstallations", "Lcom/google/firebase/sessions/t;", "a", "(Lcom/google/firebase/installations/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.t$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: InstallationId.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", i = {0, 1}, l = {32, 40}, m = "create", n = {"firebaseInstallations", "authToken"}, s = {"L$0", "L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.google.firebase.sessions.t$a$a, reason: collision with other inner class name */
        static final class C0942a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f61022b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f61023c;

            /* renamed from: e, reason: collision with root package name */
            int f61025e;

            C0942a(kotlin.coroutines.d<? super C0942a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f61023c = obj;
                this.f61025e |= Integer.MIN_VALUE;
                return Companion.this.a(null, this);
            }
        }

        private Companion() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(3:29|30|(1:32))|23|24|25|(1:27)|13|14|15|16))|35|6|7|(0)(0)|23|24|25|(0)|13|14|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
        
            r9 = r8;
            r8 = "";
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.installations.k, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(@fg.l com.google.firebase.installations.k r8, @fg.l kotlin.coroutines.d<? super com.google.firebase.sessions.t> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.google.firebase.sessions.t.Companion.C0942a
                if (r0 == 0) goto L13
                r0 = r9
                com.google.firebase.sessions.t$a$a r0 = (com.google.firebase.sessions.t.Companion.C0942a) r0
                int r1 = r0.f61025e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f61025e = r1
                goto L18
            L13:
                com.google.firebase.sessions.t$a$a r0 = new com.google.firebase.sessions.t$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f61023c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f61025e
                java.lang.String r3 = ""
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L44
                if (r2 == r5) goto L3c
                if (r2 != r4) goto L30
                java.lang.Object r8 = r0.f61022b
                java.lang.String r8 = (java.lang.String) r8
                kotlin.a1.n(r9)     // Catch: java.lang.Exception -> L99
                goto L8d
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "դ\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L3c:
                java.lang.Object r8 = r0.f61022b
                com.google.firebase.installations.k r8 = (com.google.firebase.installations.k) r8
                kotlin.a1.n(r9)     // Catch: java.lang.Exception -> L73
                goto L60
            L44:
                kotlin.a1.n(r9)
                r9 = 0
                com.google.android.gms.tasks.Task r9 = r8.c(r9)     // Catch: java.lang.Exception -> L73
                java.lang.String r2 = "ե\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Exception -> L73
                kotlin.jvm.internal.l0.o(r9, r2)     // Catch: java.lang.Exception -> L73
                r0.f61022b = r8     // Catch: java.lang.Exception -> L73
                r0.f61025e = r5     // Catch: java.lang.Exception -> L73
                java.lang.Object r9 = kotlinx.coroutines.tasks.c.i(r9, r0)     // Catch: java.lang.Exception -> L73
                if (r9 != r1) goto L60
                return r1
            L60:
                com.google.firebase.installations.o r9 = (com.google.firebase.installations.o) r9     // Catch: java.lang.Exception -> L73
                java.lang.String r9 = r9.b()     // Catch: java.lang.Exception -> L73
                java.lang.String r2 = "զ\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Exception -> L73
                kotlin.jvm.internal.l0.o(r9, r2)     // Catch: java.lang.Exception -> L73
                r6 = r9
                r9 = r8
                r8 = r6
                goto L75
            L73:
                r9 = r8
                r8 = r3
            L75:
                com.google.android.gms.tasks.Task r9 = r9.a()     // Catch: java.lang.Exception -> L99
                java.lang.String r2 = "է\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Exception -> L99
                kotlin.jvm.internal.l0.o(r9, r2)     // Catch: java.lang.Exception -> L99
                r0.f61022b = r8     // Catch: java.lang.Exception -> L99
                r0.f61025e = r4     // Catch: java.lang.Exception -> L99
                java.lang.Object r9 = kotlinx.coroutines.tasks.c.i(r9, r0)     // Catch: java.lang.Exception -> L99
                if (r9 != r1) goto L8d
                return r1
            L8d:
                java.lang.String r0 = "ը\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Exception -> L99
                kotlin.jvm.internal.l0.o(r9, r0)     // Catch: java.lang.Exception -> L99
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L99
                r3 = r9
            L99:
                com.google.firebase.sessions.t r9 = new com.google.firebase.sessions.t
                r0 = 0
                r9.<init>(r3, r8, r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.t.Companion.a(com.google.firebase.installations.k, kotlin.coroutines.d):java.lang.Object");
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ t(String str, String str2, kotlin.jvm.internal.w wVar) {
        this(str, str2);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final String getFid() {
        return this.fid;
    }

    private t(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }
}
