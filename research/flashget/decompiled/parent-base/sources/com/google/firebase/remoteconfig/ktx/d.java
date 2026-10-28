package com.google.firebase.remoteconfig.ktx;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.ktx.d;
import com.google.firebase.remoteconfig.r;
import com.google.firebase.remoteconfig.s;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k;
import kotlin.k2;
import kotlin.x0;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.channels.z;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.s0;
import ld.p;

/* compiled from: RemoteConfig.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\t\u0010\n\u001a&\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0015\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lea/b;", "Lcom/google/firebase/g;", "app", "Lcom/google/firebase/remoteconfig/p;", "e", "(Lea/b;Lcom/google/firebase/g;)Lcom/google/firebase/remoteconfig/p;", "", "key", "Lcom/google/firebase/remoteconfig/s;", "a", "(Lcom/google/firebase/remoteconfig/p;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/s;", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/r$b;", "Lkotlin/k2;", "Lkotlin/u;", "init", "Lcom/google/firebase/remoteconfig/r;", "f", "(Lld/l;)Lcom/google/firebase/remoteconfig/r;", "d", "(Lea/b;)Lcom/google/firebase/remoteconfig/p;", "remoteConfig", "Lkotlinx/coroutines/flow/i;", "Lcom/google/firebase/remoteconfig/c;", "b", "(Lcom/google/firebase/remoteconfig/p;)Lkotlinx/coroutines/flow/i;", "c", "(Lcom/google/firebase/remoteconfig/p;)V", "configUpdates", "com.google.firebase-firebase-config"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d {

    /* compiled from: RemoteConfig.kt */
    @f(c = "com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/firebase/remoteconfig/c;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends o implements p<b0<? super com.google.firebase.remoteconfig.c>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60666b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f60667c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.remoteconfig.p f60668d;

        /* compiled from: RemoteConfig.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.google.firebase.remoteconfig.ktx.d$a$a, reason: collision with other inner class name */
        static final class C0933a extends n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.google.firebase.remoteconfig.e f60669b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0933a(com.google.firebase.remoteconfig.e eVar) {
                super(0);
                this.f60669b = eVar;
            }

            public final void a() {
                this.f60669b.remove();
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* compiled from: RemoteConfig.kt */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/google/firebase/remoteconfig/ktx/d$a$b", "Lcom/google/firebase/remoteconfig/d;", "Lcom/google/firebase/remoteconfig/c;", "configUpdate", "Lkotlin/k2;", "a", "(Lcom/google/firebase/remoteconfig/c;)V", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "error", "b", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;)V", "com.google.firebase-firebase-config"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements com.google.firebase.remoteconfig.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.google.firebase.remoteconfig.p f60670a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0<com.google.firebase.remoteconfig.c> f60671b;

            /* JADX WARN: Multi-variable type inference failed */
            b(com.google.firebase.remoteconfig.p pVar, b0<? super com.google.firebase.remoteconfig.c> b0Var) {
                this.f60670a = pVar;
                this.f60671b = b0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(b0 b0Var, com.google.firebase.remoteconfig.c cVar) {
                l0.p(b0Var, ProtectedSandApp.s("ϴ\u0001"));
                l0.p(cVar, ProtectedSandApp.s("ϵ\u0001"));
                r.m0(b0Var, cVar);
            }

            @Override // com.google.firebase.remoteconfig.d
            public void a(@l final com.google.firebase.remoteconfig.c configUpdate) {
                l0.p(configUpdate, ProtectedSandApp.s("϶\u0001"));
                com.google.firebase.remoteconfig.p pVar = this.f60670a;
                final b0<com.google.firebase.remoteconfig.c> b0Var = this.f60671b;
                pVar.L(new Runnable() { // from class: com.google.firebase.remoteconfig.ktx.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.b.d(b0.this, configUpdate);
                    }
                });
            }

            @Override // com.google.firebase.remoteconfig.d
            public void b(@l FirebaseRemoteConfigException error) {
                l0.p(error, ProtectedSandApp.s("Ϸ\u0001"));
                s0.c(this.f60671b, ProtectedSandApp.s("ϸ\u0001"), error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.google.firebase.remoteconfig.p pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f60668d = pVar;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l b0<? super com.google.firebase.remoteconfig.c> b0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f60668d, dVar);
            aVar.f60667c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f60666b;
            if (i4 == 0) {
                a1.n(obj);
                b0 b0Var = (b0) this.f60667c;
                com.google.firebase.remoteconfig.p pVar = this.f60668d;
                com.google.firebase.remoteconfig.e k4 = pVar.k(new b(pVar, b0Var));
                l0.o(k4, ProtectedSandApp.s("Ϻ\u0001"));
                C0933a c0933a = new C0933a(k4);
                this.f60666b = 1;
                if (z.a(b0Var, c0933a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("Ϲ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    @l
    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @x0(expression = "", imports = {}))
    public static final s a(@l com.google.firebase.remoteconfig.p pVar, @l String str) {
        l0.p(pVar, ProtectedSandApp.s("ϻ\u0001"));
        l0.p(str, ProtectedSandApp.s("ϼ\u0001"));
        s z4 = pVar.z(str);
        l0.o(z4, ProtectedSandApp.s("Ͻ\u0001"));
        return z4;
    }

    @l
    public static final i<com.google.firebase.remoteconfig.c> b(@l com.google.firebase.remoteconfig.p pVar) {
        l0.p(pVar, ProtectedSandApp.s("ϻ\u0001"));
        return kotlinx.coroutines.flow.k.s(new a(pVar, null));
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @x0(expression = "", imports = {}))
    public static /* synthetic */ void c(com.google.firebase.remoteconfig.p pVar) {
    }

    @l
    public static final com.google.firebase.remoteconfig.p d(@l ea.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("ϻ\u0001"));
        com.google.firebase.remoteconfig.p t4 = com.google.firebase.remoteconfig.p.t();
        l0.o(t4, ProtectedSandApp.s("Ͼ\u0001"));
        return t4;
    }

    @l
    public static final com.google.firebase.remoteconfig.p e(@l ea.b bVar, @l g gVar) {
        l0.p(bVar, ProtectedSandApp.s("ϻ\u0001"));
        l0.p(gVar, ProtectedSandApp.s("Ͽ\u0001"));
        com.google.firebase.remoteconfig.p u4 = com.google.firebase.remoteconfig.p.u(gVar);
        l0.o(u4, ProtectedSandApp.s("Ѐ\u0001"));
        return u4;
    }

    @l
    public static final com.google.firebase.remoteconfig.r f(@l ld.l<? super r.b, k2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("Ё\u0001"));
        r.b bVar = new r.b();
        lVar.invoke(bVar);
        com.google.firebase.remoteconfig.r c5 = bVar.c();
        l0.o(c5, ProtectedSandApp.s("Ђ\u0001"));
        return c5;
    }
}
