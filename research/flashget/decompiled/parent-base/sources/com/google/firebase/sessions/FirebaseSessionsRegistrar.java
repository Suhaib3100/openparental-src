package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FirebaseSessionsRegistrar.kt */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lcom/google/firebase/components/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @fg.l
    private static final com.google.firebase.components.b0<kotlinx.coroutines.m0> backgroundDispatcher;

    @fg.l
    private static final com.google.firebase.components.b0<kotlinx.coroutines.m0> blockingDispatcher;

    @fg.l
    private static final com.google.firebase.components.b0<com.google.firebase.g> firebaseApp;

    @fg.l
    private static final com.google.firebase.components.b0<com.google.firebase.installations.k> firebaseInstallationsApi;

    @fg.l
    private static final com.google.firebase.components.b0<j0> sessionLifecycleServiceBinder;

    @fg.l
    private static final com.google.firebase.components.b0<com.google.firebase.sessions.settings.f> sessionsSettings;

    @fg.l
    private static final com.google.firebase.components.b0<com.google.android.datatransport.m> transportFactory;

    @fg.l
    private static final String LIBRARY_NAME = ProtectedSandApp.s("ж\u0001");

    @fg.l
    private static final a Companion = new a();

    /* compiled from: FirebaseSessionsRegistrar.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000f0\u000f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00110\u00110\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u00130\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00150\u00150\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;", "", "<init>", "()V", "", "LIBRARY_NAME", "Ljava/lang/String;", "Lcom/google/firebase/components/b0;", "Lkotlinx/coroutines/m0;", "kotlin.jvm.PlatformType", "backgroundDispatcher", "Lcom/google/firebase/components/b0;", "blockingDispatcher", "Lcom/google/firebase/g;", "firebaseApp", "Lcom/google/firebase/installations/k;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/j0;", "sessionLifecycleServiceBinder", "Lcom/google/firebase/sessions/settings/f;", "sessionsSettings", "Lcom/google/android/datatransport/m;", "transportFactory", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        com.google.firebase.components.b0<com.google.firebase.g> b5 = com.google.firebase.components.b0.b(com.google.firebase.g.class);
        kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("з\u0001"));
        firebaseApp = b5;
        com.google.firebase.components.b0<com.google.firebase.installations.k> b6 = com.google.firebase.components.b0.b(com.google.firebase.installations.k.class);
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("и\u0001"));
        firebaseInstallationsApi = b6;
        com.google.firebase.components.b0<kotlinx.coroutines.m0> b0Var = new com.google.firebase.components.b0<>(l9.a.class, kotlinx.coroutines.m0.class);
        kotlin.jvm.internal.l0.o(b0Var, ProtectedSandApp.s("й\u0001"));
        backgroundDispatcher = b0Var;
        com.google.firebase.components.b0<kotlinx.coroutines.m0> b0Var2 = new com.google.firebase.components.b0<>(l9.b.class, kotlinx.coroutines.m0.class);
        kotlin.jvm.internal.l0.o(b0Var2, ProtectedSandApp.s("к\u0001"));
        blockingDispatcher = b0Var2;
        com.google.firebase.components.b0<com.google.android.datatransport.m> b7 = com.google.firebase.components.b0.b(com.google.android.datatransport.m.class);
        kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("л\u0001"));
        transportFactory = b7;
        com.google.firebase.components.b0<com.google.firebase.sessions.settings.f> b10 = com.google.firebase.components.b0.b(com.google.firebase.sessions.settings.f.class);
        kotlin.jvm.internal.l0.o(b10, ProtectedSandApp.s("м\u0001"));
        sessionsSettings = b10;
        com.google.firebase.components.b0<j0> b11 = com.google.firebase.components.b0.b(j0.class);
        kotlin.jvm.internal.l0.o(b11, ProtectedSandApp.s("н\u0001"));
        sessionLifecycleServiceBinder = b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l getComponents$lambda$0(com.google.firebase.components.d dVar) {
        Object g4 = dVar.g(firebaseApp);
        kotlin.jvm.internal.l0.o(g4, ProtectedSandApp.s("о\u0001"));
        Object g5 = dVar.g(sessionsSettings);
        kotlin.jvm.internal.l0.o(g5, ProtectedSandApp.s("п\u0001"));
        Object g6 = dVar.g(backgroundDispatcher);
        kotlin.jvm.internal.l0.o(g6, ProtectedSandApp.s("р\u0001"));
        Object g7 = dVar.g(sessionLifecycleServiceBinder);
        kotlin.jvm.internal.l0.o(g7, ProtectedSandApp.s("с\u0001"));
        return new l((com.google.firebase.g) g4, (com.google.firebase.sessions.settings.f) g5, (kotlin.coroutines.g) g6, (j0) g7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g0 getComponents$lambda$1(com.google.firebase.components.d dVar) {
        return new g0(n0.f60934a, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 getComponents$lambda$2(com.google.firebase.components.d dVar) {
        Object g4 = dVar.g(firebaseApp);
        kotlin.jvm.internal.l0.o(g4, ProtectedSandApp.s("о\u0001"));
        com.google.firebase.g gVar = (com.google.firebase.g) g4;
        Object g5 = dVar.g(firebaseInstallationsApi);
        kotlin.jvm.internal.l0.o(g5, ProtectedSandApp.s("т\u0001"));
        com.google.firebase.installations.k kVar = (com.google.firebase.installations.k) g5;
        Object g6 = dVar.g(sessionsSettings);
        kotlin.jvm.internal.l0.o(g6, ProtectedSandApp.s("п\u0001"));
        com.google.firebase.sessions.settings.f fVar = (com.google.firebase.sessions.settings.f) g6;
        y9.b b5 = dVar.b(transportFactory);
        kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("у\u0001"));
        h hVar = new h(b5);
        Object g7 = dVar.g(backgroundDispatcher);
        kotlin.jvm.internal.l0.o(g7, ProtectedSandApp.s("р\u0001"));
        return new f0(gVar, kVar, fVar, hVar, (kotlin.coroutines.g) g7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.settings.f getComponents$lambda$3(com.google.firebase.components.d dVar) {
        Object g4 = dVar.g(firebaseApp);
        kotlin.jvm.internal.l0.o(g4, ProtectedSandApp.s("о\u0001"));
        Object g5 = dVar.g(blockingDispatcher);
        kotlin.jvm.internal.l0.o(g5, ProtectedSandApp.s("ф\u0001"));
        Object g6 = dVar.g(backgroundDispatcher);
        kotlin.jvm.internal.l0.o(g6, ProtectedSandApp.s("р\u0001"));
        Object g7 = dVar.g(firebaseInstallationsApi);
        kotlin.jvm.internal.l0.o(g7, ProtectedSandApp.s("т\u0001"));
        return new com.google.firebase.sessions.settings.f((com.google.firebase.g) g4, (kotlin.coroutines.g) g5, (kotlin.coroutines.g) g6, (com.google.firebase.installations.k) g7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z getComponents$lambda$4(com.google.firebase.components.d dVar) {
        Context n4 = ((com.google.firebase.g) dVar.g(firebaseApp)).n();
        kotlin.jvm.internal.l0.o(n4, ProtectedSandApp.s("х\u0001"));
        Object g4 = dVar.g(backgroundDispatcher);
        kotlin.jvm.internal.l0.o(g4, ProtectedSandApp.s("р\u0001"));
        return new a0(n4, (kotlin.coroutines.g) g4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 getComponents$lambda$5(com.google.firebase.components.d dVar) {
        Object g4 = dVar.g(firebaseApp);
        kotlin.jvm.internal.l0.o(g4, ProtectedSandApp.s("о\u0001"));
        return new k0((com.google.firebase.g) g4);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @fg.l
    public List<com.google.firebase.components.c<? extends Object>> getComponents() {
        c.b h4 = com.google.firebase.components.c.h(l.class);
        String s4 = ProtectedSandApp.s("ж\u0001");
        c.b h5 = h4.h(s4);
        com.google.firebase.components.b0<com.google.firebase.g> b0Var = firebaseApp;
        c.b b5 = h5.b(com.google.firebase.components.r.l(b0Var));
        com.google.firebase.components.b0<com.google.firebase.sessions.settings.f> b0Var2 = sessionsSettings;
        c.b b6 = b5.b(com.google.firebase.components.r.l(b0Var2));
        com.google.firebase.components.b0<kotlinx.coroutines.m0> b0Var3 = backgroundDispatcher;
        com.google.firebase.components.c d5 = b6.b(com.google.firebase.components.r.l(b0Var3)).b(com.google.firebase.components.r.l(sessionLifecycleServiceBinder)).f(new n()).e().d();
        com.google.firebase.components.c d6 = com.google.firebase.components.c.h(g0.class).h(ProtectedSandApp.s("ц\u0001")).f(new o()).d();
        c.b b7 = com.google.firebase.components.c.h(e0.class).h(ProtectedSandApp.s("ч\u0001")).b(com.google.firebase.components.r.l(b0Var));
        com.google.firebase.components.b0<com.google.firebase.installations.k> b0Var4 = firebaseInstallationsApi;
        return kotlin.collections.w.O(d5, d6, b7.b(com.google.firebase.components.r.l(b0Var4)).b(com.google.firebase.components.r.l(b0Var2)).b(com.google.firebase.components.r.n(transportFactory)).b(com.google.firebase.components.r.l(b0Var3)).f(new p()).d(), com.google.firebase.components.c.h(com.google.firebase.sessions.settings.f.class).h(ProtectedSandApp.s("ш\u0001")).b(com.google.firebase.components.r.l(b0Var)).b(com.google.firebase.components.r.l(blockingDispatcher)).b(com.google.firebase.components.r.l(b0Var3)).b(com.google.firebase.components.r.l(b0Var4)).f(new q()).d(), com.google.firebase.components.c.h(z.class).h(ProtectedSandApp.s("щ\u0001")).b(com.google.firebase.components.r.l(b0Var)).b(com.google.firebase.components.r.l(b0Var3)).f(new r()).d(), com.google.firebase.components.c.h(j0.class).h(ProtectedSandApp.s("ъ\u0001")).b(com.google.firebase.components.r.l(b0Var)).f(new s()).d(), com.google.firebase.platforminfo.h.b(s4, ProtectedSandApp.s("ы\u0001")));
    }
}
