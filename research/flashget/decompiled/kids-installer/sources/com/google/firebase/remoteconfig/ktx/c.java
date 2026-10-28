package com.google.firebase.remoteconfig.ktx;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.e;
import com.google.firebase.remoteconfig.ktx.c;
import com.google.firebase.remoteconfig.r;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.v0;
import q3.l;
import q3.p;

/* compiled from: RemoteConfig.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\"\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0010\"\u0015\u0010\u0014\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lu2/b;", "Lcom/google/firebase/g;", "app", "Lcom/google/firebase/remoteconfig/p;", "d", "", "key", "Lcom/google/firebase/remoteconfig/s;", "a", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/r$b;", "Lkotlin/m2;", "Lkotlin/u;", "init", "Lcom/google/firebase/remoteconfig/r;", "e", "Ljava/lang/String;", "LIBRARY_NAME", "c", "(Lu2/b;)Lcom/google/firebase/remoteconfig/p;", "remoteConfig", "Lkotlinx/coroutines/flow/i;", "Lcom/google/firebase/remoteconfig/c;", "b", "(Lcom/google/firebase/remoteconfig/p;)Lkotlinx/coroutines/flow/i;", "configUpdates", "com.google.firebase-firebase-config-ktx"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final String f18271a = ProtectedSandApp.s("᧿");

    /* compiled from: RemoteConfig.kt */
    @DebugMetadata(c = "com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/e0;", "Lcom/google/firebase/remoteconfig/c;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements p<e0<? super com.google.firebase.remoteconfig.c>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18272s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f18273t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.remoteconfig.p f18274u;

        /* compiled from: RemoteConfig.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/m2;", "a", "()V"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.google.firebase.remoteconfig.ktx.c$a$a, reason: collision with other inner class name */
        static final class C0229a extends Lambda implements q3.a<m2> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ e f18275p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0229a(e eVar) {
                super(0);
                this.f18275p = eVar;
            }

            public final void a() {
                this.f18275p.remove();
            }

            @Override // q3.a
            public /* bridge */ /* synthetic */ m2 n() {
                a();
                return m2.f23662a;
            }
        }

        /* compiled from: RemoteConfig.kt */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/google/firebase/remoteconfig/ktx/c$a$b", "Lcom/google/firebase/remoteconfig/d;", "Lcom/google/firebase/remoteconfig/c;", "configUpdate", "Lkotlin/m2;", "b", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "error", "a", "com.google.firebase-firebase-config-ktx"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes3.dex */
        public static final class b implements com.google.firebase.remoteconfig.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.google.firebase.remoteconfig.p f18276a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0<com.google.firebase.remoteconfig.c> f18277b;

            /* JADX WARN: Multi-variable type inference failed */
            b(com.google.firebase.remoteconfig.p pVar, e0<? super com.google.firebase.remoteconfig.c> e0Var) {
                this.f18276a = pVar;
                this.f18277b = e0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(e0 e0Var, com.google.firebase.remoteconfig.c cVar) {
                l0.p(e0Var, ProtectedSandApp.s("⭉"));
                l0.p(cVar, ProtectedSandApp.s("⭊"));
                s.m0(e0Var, cVar);
            }

            @Override // com.google.firebase.remoteconfig.d
            public void a(@d5.d FirebaseRemoteConfigException firebaseRemoteConfigException) {
                l0.p(firebaseRemoteConfigException, ProtectedSandApp.s("⭋"));
                v0.c(this.f18277b, ProtectedSandApp.s("⭌"), firebaseRemoteConfigException);
            }

            @Override // com.google.firebase.remoteconfig.d
            public void b(@d5.d final com.google.firebase.remoteconfig.c cVar) {
                l0.p(cVar, ProtectedSandApp.s("⭍"));
                com.google.firebase.remoteconfig.p pVar = this.f18276a;
                final e0<com.google.firebase.remoteconfig.c> e0Var = this.f18277b;
                pVar.K(new Runnable() { // from class: com.google.firebase.remoteconfig.ktx.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a.b.d(e0.this, cVar);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.google.firebase.remoteconfig.p pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f18274u = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f18272s;
            if (i5 == 0) {
                a1.n(obj);
                e0 e0Var = (e0) this.f18273t;
                com.google.firebase.remoteconfig.p pVar = this.f18274u;
                e k5 = pVar.k(new b(pVar, e0Var));
                l0.o(k5, ProtectedSandApp.s("㍐"));
                C0229a c0229a = new C0229a(k5);
                this.f18272s = 1;
                if (c0.a(e0Var, c0229a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("㍏"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d e0<? super com.google.firebase.remoteconfig.c> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = new a(this.f18274u, continuation);
            aVar.f18273t = obj;
            return aVar;
        }
    }

    @d5.d
    public static final com.google.firebase.remoteconfig.s a(@d5.d com.google.firebase.remoteconfig.p pVar, @d5.d String str) {
        l0.p(pVar, ProtectedSandApp.s("᧴"));
        l0.p(str, ProtectedSandApp.s("᧵"));
        com.google.firebase.remoteconfig.s y5 = pVar.y(str);
        l0.o(y5, ProtectedSandApp.s("᧶"));
        return y5;
    }

    @d5.d
    public static final i<com.google.firebase.remoteconfig.c> b(@d5.d com.google.firebase.remoteconfig.p pVar) {
        l0.p(pVar, ProtectedSandApp.s("᧷"));
        return k.s(new a(pVar, null));
    }

    @d5.d
    public static final com.google.firebase.remoteconfig.p c(@d5.d u2.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("᧸"));
        com.google.firebase.remoteconfig.p t5 = com.google.firebase.remoteconfig.p.t();
        l0.o(t5, ProtectedSandApp.s("᧹"));
        return t5;
    }

    @d5.d
    public static final com.google.firebase.remoteconfig.p d(@d5.d u2.b bVar, @d5.d g gVar) {
        l0.p(bVar, ProtectedSandApp.s("᧺"));
        l0.p(gVar, ProtectedSandApp.s("᧻"));
        com.google.firebase.remoteconfig.p u5 = com.google.firebase.remoteconfig.p.u(gVar);
        l0.o(u5, ProtectedSandApp.s("᧼"));
        return u5;
    }

    @d5.d
    public static final r e(@d5.d l<? super r.b, m2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("᧽"));
        r.b bVar = new r.b();
        lVar.N(bVar);
        r c6 = bVar.c();
        l0.o(c6, ProtectedSandApp.s("᧾"));
        return c6;
    }
}
