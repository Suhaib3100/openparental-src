package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.o0;

/* compiled from: FirebaseSessionsRegistrar.kt */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u0006\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lcom/google/firebase/components/c;", "", "kotlin.jvm.PlatformType", "getComponents", "<init>", "()V", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @d5.d
    @Deprecated
    private static final String LIBRARY_NAME = ProtectedSandApp.s("⭎");

    @d5.d
    private static final a Companion = new a(null);

    @Deprecated
    private static final com.google.firebase.components.b0<com.google.firebase.g> firebaseApp = com.google.firebase.components.b0.b(com.google.firebase.g.class);

    @Deprecated
    private static final com.google.firebase.components.b0<com.google.firebase.installations.k> firebaseInstallationsApi = com.google.firebase.components.b0.b(com.google.firebase.installations.k.class);

    @Deprecated
    private static final com.google.firebase.components.b0<o0> backgroundDispatcher = new com.google.firebase.components.b0<>(b2.a.class, o0.class);

    @Deprecated
    private static final com.google.firebase.components.b0<o0> blockingDispatcher = new com.google.firebase.components.b0<>(b2.b.class, o0.class);

    @Deprecated
    private static final com.google.firebase.components.b0<com.google.android.datatransport.i> transportFactory = com.google.firebase.components.b0.b(com.google.android.datatransport.i.class);

    @Deprecated
    private static final com.google.firebase.components.b0<d0> sessionFirelogPublisher = com.google.firebase.components.b0.b(d0.class);

    @Deprecated
    private static final com.google.firebase.components.b0<f0> sessionGenerator = com.google.firebase.components.b0.b(f0.class);

    @Deprecated
    private static final com.google.firebase.components.b0<com.google.firebase.sessions.settings.f> sessionsSettings = com.google.firebase.components.b0.b(com.google.firebase.sessions.settings.f.class);

    /* compiled from: FirebaseSessionsRegistrar.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R8\u0010\b\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR8\u0010\n\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR8\u0010\f\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000b0\u000b \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR8\u0010\u000e\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\r0\r \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\r0\r\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR8\u0010\u0010\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\tR8\u0010\u0012\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00110\u0011 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\tR8\u0010\u0014\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00130\u0013 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\tR8\u0010\u0016\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00150\u0015 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;", "", "", "LIBRARY_NAME", "Ljava/lang/String;", "Lcom/google/firebase/components/b0;", "Lkotlinx/coroutines/o0;", "kotlin.jvm.PlatformType", "backgroundDispatcher", "Lcom/google/firebase/components/b0;", "blockingDispatcher", "Lcom/google/firebase/g;", "firebaseApp", "Lcom/google/firebase/installations/k;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/d0;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/f0;", "sessionGenerator", "Lcom/google/firebase/sessions/settings/f;", "sessionsSettings", "Lcom/google/android/datatransport/i;", "transportFactory", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final l m95getComponents$lambda0(com.google.firebase.components.d dVar) {
        Object h5 = dVar.h(firebaseApp);
        kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("⭏"));
        Object h6 = dVar.h(sessionsSettings);
        kotlin.jvm.internal.l0.o(h6, ProtectedSandApp.s("⭐"));
        Object h7 = dVar.h(backgroundDispatcher);
        kotlin.jvm.internal.l0.o(h7, ProtectedSandApp.s("⭑"));
        return new l((com.google.firebase.g) h5, (com.google.firebase.sessions.settings.f) h6, (CoroutineContext) h7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1, reason: not valid java name */
    public static final f0 m96getComponents$lambda1(com.google.firebase.components.d dVar) {
        return new f0(m0.f18661a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2, reason: not valid java name */
    public static final d0 m97getComponents$lambda2(com.google.firebase.components.d dVar) {
        Object h5 = dVar.h(firebaseApp);
        kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("⭒"));
        com.google.firebase.g gVar = (com.google.firebase.g) h5;
        Object h6 = dVar.h(firebaseInstallationsApi);
        kotlin.jvm.internal.l0.o(h6, ProtectedSandApp.s("⭓"));
        com.google.firebase.installations.k kVar = (com.google.firebase.installations.k) h6;
        Object h7 = dVar.h(sessionsSettings);
        kotlin.jvm.internal.l0.o(h7, ProtectedSandApp.s("⭔"));
        com.google.firebase.sessions.settings.f fVar = (com.google.firebase.sessions.settings.f) h7;
        o2.b b6 = dVar.b(transportFactory);
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("⭕"));
        h hVar = new h(b6);
        Object h8 = dVar.h(backgroundDispatcher);
        kotlin.jvm.internal.l0.o(h8, ProtectedSandApp.s("⭖"));
        return new e0(gVar, kVar, fVar, hVar, (CoroutineContext) h8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3, reason: not valid java name */
    public static final com.google.firebase.sessions.settings.f m98getComponents$lambda3(com.google.firebase.components.d dVar) {
        Object h5 = dVar.h(firebaseApp);
        kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("⭗"));
        Object h6 = dVar.h(blockingDispatcher);
        kotlin.jvm.internal.l0.o(h6, ProtectedSandApp.s("⭘"));
        Object h7 = dVar.h(backgroundDispatcher);
        kotlin.jvm.internal.l0.o(h7, ProtectedSandApp.s("⭙"));
        Object h8 = dVar.h(firebaseInstallationsApi);
        kotlin.jvm.internal.l0.o(h8, ProtectedSandApp.s("⭚"));
        return new com.google.firebase.sessions.settings.f((com.google.firebase.g) h5, (CoroutineContext) h6, (CoroutineContext) h7, (com.google.firebase.installations.k) h8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4, reason: not valid java name */
    public static final y m99getComponents$lambda4(com.google.firebase.components.d dVar) {
        Context n5 = ((com.google.firebase.g) dVar.h(firebaseApp)).n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("⭛"));
        Object h5 = dVar.h(backgroundDispatcher);
        kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("⭜"));
        return new z(n5, (CoroutineContext) h5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5, reason: not valid java name */
    public static final i0 m100getComponents$lambda5(com.google.firebase.components.d dVar) {
        Object h5 = dVar.h(firebaseApp);
        kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("⭝"));
        return new j0((com.google.firebase.g) h5);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @d5.d
    public List<com.google.firebase.components.c<? extends Object>> getComponents() {
        List<com.google.firebase.components.c<? extends Object>> O;
        c.b h5 = com.google.firebase.components.c.h(l.class);
        String s5 = ProtectedSandApp.s("⭞");
        c.b h6 = h5.h(s5);
        com.google.firebase.components.b0<com.google.firebase.g> b0Var = firebaseApp;
        c.b b6 = h6.b(com.google.firebase.components.r.l(b0Var));
        com.google.firebase.components.b0<com.google.firebase.sessions.settings.f> b0Var2 = sessionsSettings;
        c.b b7 = b6.b(com.google.firebase.components.r.l(b0Var2));
        com.google.firebase.components.b0<o0> b0Var3 = backgroundDispatcher;
        c.b b8 = com.google.firebase.components.c.h(d0.class).h(ProtectedSandApp.s("⭠")).b(com.google.firebase.components.r.l(b0Var));
        com.google.firebase.components.b0<com.google.firebase.installations.k> b0Var4 = firebaseInstallationsApi;
        O = kotlin.collections.a0.O(b7.b(com.google.firebase.components.r.l(b0Var3)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.n
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                l m95getComponents$lambda0;
                m95getComponents$lambda0 = FirebaseSessionsRegistrar.m95getComponents$lambda0(dVar);
                return m95getComponents$lambda0;
            }
        }).e().d(), com.google.firebase.components.c.h(f0.class).h(ProtectedSandApp.s("⭟")).f(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.o
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                f0 m96getComponents$lambda1;
                m96getComponents$lambda1 = FirebaseSessionsRegistrar.m96getComponents$lambda1(dVar);
                return m96getComponents$lambda1;
            }
        }).d(), b8.b(com.google.firebase.components.r.l(b0Var4)).b(com.google.firebase.components.r.l(b0Var2)).b(com.google.firebase.components.r.n(transportFactory)).b(com.google.firebase.components.r.l(b0Var3)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.p
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                d0 m97getComponents$lambda2;
                m97getComponents$lambda2 = FirebaseSessionsRegistrar.m97getComponents$lambda2(dVar);
                return m97getComponents$lambda2;
            }
        }).d(), com.google.firebase.components.c.h(com.google.firebase.sessions.settings.f.class).h(ProtectedSandApp.s("⭡")).b(com.google.firebase.components.r.l(b0Var)).b(com.google.firebase.components.r.l(blockingDispatcher)).b(com.google.firebase.components.r.l(b0Var3)).b(com.google.firebase.components.r.l(b0Var4)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.q
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                com.google.firebase.sessions.settings.f m98getComponents$lambda3;
                m98getComponents$lambda3 = FirebaseSessionsRegistrar.m98getComponents$lambda3(dVar);
                return m98getComponents$lambda3;
            }
        }).d(), com.google.firebase.components.c.h(y.class).h(ProtectedSandApp.s("⭢")).b(com.google.firebase.components.r.l(b0Var)).b(com.google.firebase.components.r.l(b0Var3)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.r
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                y m99getComponents$lambda4;
                m99getComponents$lambda4 = FirebaseSessionsRegistrar.m99getComponents$lambda4(dVar);
                return m99getComponents$lambda4;
            }
        }).d(), com.google.firebase.components.c.h(i0.class).h(ProtectedSandApp.s("⭣")).b(com.google.firebase.components.r.l(b0Var)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.sessions.s
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                i0 m100getComponents$lambda5;
                m100getComponents$lambda5 = FirebaseSessionsRegistrar.m100getComponents$lambda5(dVar);
                return m100getComponents$lambda5;
            }
        }).d(), com.google.firebase.platforminfo.h.b(s5, ProtectedSandApp.s("⭤")));
        return O;
    }
}
