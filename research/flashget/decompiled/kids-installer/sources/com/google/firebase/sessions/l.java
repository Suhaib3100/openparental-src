package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;

/* compiled from: FirebaseSessions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/l;", "", "Lcom/google/firebase/g;", "a", "Lcom/google/firebase/g;", "firebaseApp", "Lcom/google/firebase/sessions/settings/f;", "b", "Lcom/google/firebase/sessions/settings/f;", "settings", "Lkotlin/coroutines/g;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/g;Lcom/google/firebase/sessions/settings/f;Lkotlin/coroutines/g;)V", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final com.google.firebase.g firebaseApp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final com.google.firebase.sessions.settings.f settings;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final String f18654d = ProtectedSandApp.s("᫄");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: FirebaseSessions.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", i = {}, l = {44, 48}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18657s;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f18659u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CoroutineContext coroutineContext, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f18659u = coroutineContext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j0(String str, com.google.firebase.p pVar) {
            k0.f18650o.e(null);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.f18657s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L10
                kotlin.a1.n(r5)
                goto L68
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "㍘"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r5.<init>(r0)
                throw r5
            L1c:
                kotlin.a1.n(r5)
                goto L2e
            L20:
                kotlin.a1.n(r5)
                com.google.firebase.sessions.api.a r5 = com.google.firebase.sessions.api.a.f18518a
                r4.f18657s = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r5 = (java.util.Map) r5
                java.util.Collection r5 = r5.values()
                boolean r1 = r5 instanceof java.util.Collection
                if (r1 == 0) goto L3f
                boolean r1 = r5.isEmpty()
                if (r1 == 0) goto L3f
                goto L56
            L3f:
                java.util.Iterator r5 = r5.iterator()
            L43:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r5.next()
                com.google.firebase.sessions.api.b r1 = (com.google.firebase.sessions.api.b) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L43
                r3 = 0
            L56:
                if (r3 == 0) goto L59
                goto L92
            L59:
                com.google.firebase.sessions.l r5 = com.google.firebase.sessions.l.this
                com.google.firebase.sessions.settings.f r5 = com.google.firebase.sessions.l.b(r5)
                r4.f18657s = r2
                java.lang.Object r5 = r5.g(r4)
                if (r5 != r0) goto L68
                return r0
            L68:
                com.google.firebase.sessions.l r5 = com.google.firebase.sessions.l.this
                com.google.firebase.sessions.settings.f r5 = com.google.firebase.sessions.l.b(r5)
                boolean r5 = r5.d()
                if (r5 != 0) goto L75
                goto L92
            L75:
                com.google.firebase.sessions.h0 r5 = new com.google.firebase.sessions.h0
                kotlin.coroutines.g r0 = r4.f18659u
                r5.<init>(r0)
                r5.i()
                com.google.firebase.sessions.k0 r0 = com.google.firebase.sessions.k0.f18650o
                r0.e(r5)
                com.google.firebase.sessions.l r5 = com.google.firebase.sessions.l.this
                com.google.firebase.g r5 = com.google.firebase.sessions.l.a(r5)
                com.google.firebase.sessions.k r0 = new com.google.firebase.sessions.k
                r0.<init>()
                r5.h(r0)
            L92:
                kotlin.m2 r5 = kotlin.m2.f23662a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.l.a.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return l.this.new a(this.f18659u, continuation);
        }
    }

    /* compiled from: FirebaseSessions.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/l$b;", "", "Lcom/google/firebase/sessions/l;", "a", "()Lcom/google/firebase/sessions/l;", "instance", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.google.firebase.sessions.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final l a() {
            Object l5 = com.google.firebase.o.c(com.google.firebase.d.f16581a).l(l.class);
            kotlin.jvm.internal.l0.o(l5, ProtectedSandApp.s("᫃"));
            return (l) l5;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public l(@d5.d com.google.firebase.g gVar, @d5.d com.google.firebase.sessions.settings.f fVar, @d5.d CoroutineContext coroutineContext) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("᫅"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("᫆"));
        kotlin.jvm.internal.l0.p(coroutineContext, ProtectedSandApp.s("᫇"));
        this.firebaseApp = gVar;
        this.settings = fVar;
        Context applicationContext = gVar.n().getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
        } else {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(k0.f18650o);
            kotlinx.coroutines.l.f(v0.a(coroutineContext), null, null, new a(coroutineContext, null), 3, null);
        }
    }
}
