package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: FirebaseSessions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/sessions/l;", "", "Lcom/google/firebase/g;", "firebaseApp", "Lcom/google/firebase/sessions/settings/f;", "settings", "Lkotlin/coroutines/g;", "backgroundDispatcher", "Lcom/google/firebase/sessions/j0;", "lifecycleServiceBinder", "<init>", "(Lcom/google/firebase/g;Lcom/google/firebase/sessions/settings/f;Lkotlin/coroutines/g;Lcom/google/firebase/sessions/j0;)V", "a", "Lcom/google/firebase/g;", "b", "Lcom/google/firebase/sessions/settings/f;", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.google.firebase.g firebaseApp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.google.firebase.sessions.settings.f settings;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f60923d = ProtectedSandApp.s("ԏ\u0001");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: FirebaseSessions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", i = {}, l = {45, 49}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebaseSessions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n2624#2,3:83\n*S KotlinDebug\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n*L\n46#1:83,3\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60926b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.g f60928d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j0 f60929e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.coroutines.g gVar, j0 j0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f60928d = gVar;
            this.f60929e = j0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(String str, com.google.firebase.p pVar) {
            l0.f60930b.e(null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return l.this.new a(this.f60928d, this.f60929e, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r4.f60926b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L10
                kotlin.a1.n(r5)
                goto L69
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "ԋ\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r5.<init>(r0)
                throw r5
            L1c:
                kotlin.a1.n(r5)
                goto L2e
            L20:
                kotlin.a1.n(r5)
                com.google.firebase.sessions.api.a r5 = com.google.firebase.sessions.api.a.f60788a
                r4.f60926b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r5 = (java.util.Map) r5
                java.util.Collection r5 = r5.values()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                boolean r1 = r5 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r5
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L95
            L44:
                java.util.Iterator r5 = r5.iterator()
            L48:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L95
                java.lang.Object r1 = r5.next()
                com.google.firebase.sessions.api.b r1 = (com.google.firebase.sessions.api.b) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L48
                com.google.firebase.sessions.l r5 = com.google.firebase.sessions.l.this
                com.google.firebase.sessions.settings.f r5 = com.google.firebase.sessions.l.b(r5)
                r4.f60926b = r2
                java.lang.Object r5 = r5.g(r4)
                if (r5 != r0) goto L69
                return r0
            L69:
                com.google.firebase.sessions.l r5 = com.google.firebase.sessions.l.this
                com.google.firebase.sessions.settings.f r5 = com.google.firebase.sessions.l.b(r5)
                boolean r5 = r5.d()
                if (r5 != 0) goto L76
                goto L95
            L76:
                com.google.firebase.sessions.i0 r5 = new com.google.firebase.sessions.i0
                kotlin.coroutines.g r0 = r4.f60928d
                r5.<init>(r0)
                com.google.firebase.sessions.j0 r0 = r4.f60929e
                r5.i(r0)
                com.google.firebase.sessions.l0 r0 = com.google.firebase.sessions.l0.f60930b
                r0.e(r5)
                com.google.firebase.sessions.l r5 = com.google.firebase.sessions.l.this
                com.google.firebase.g r5 = com.google.firebase.sessions.l.a(r5)
                com.google.firebase.sessions.k r0 = new com.google.firebase.sessions.k
                r0.<init>()
                r5.h(r0)
            L95:
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: FirebaseSessions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/l$b;", "", "<init>", "()V", "Lcom/google/firebase/sessions/l;", "a", "()Lcom/google/firebase/sessions/l;", "instance", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final l a() {
            Object l4 = com.google.firebase.o.c(com.google.firebase.d.f59602a).l(l.class);
            kotlin.jvm.internal.l0.o(l4, ProtectedSandApp.s("Ԍ\u0001"));
            return (l) l4;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public l(@fg.l com.google.firebase.g gVar, @fg.l com.google.firebase.sessions.settings.f fVar, @fg.l kotlin.coroutines.g gVar2, @fg.l j0 j0Var) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("Ԑ\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("ԑ\u0001"));
        kotlin.jvm.internal.l0.p(gVar2, ProtectedSandApp.s("Ԓ\u0001"));
        kotlin.jvm.internal.l0.p(j0Var, ProtectedSandApp.s("ԓ\u0001"));
        this.firebaseApp = gVar;
        this.settings = fVar;
        Context applicationContext = gVar.n().getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
        } else {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(l0.f60930b);
            kotlinx.coroutines.k.f(s0.a(gVar2), null, null, new a(gVar2, j0Var, null), 3, null);
        }
    }
}
