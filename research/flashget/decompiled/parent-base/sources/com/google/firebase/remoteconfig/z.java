package com.google.firebase.remoteconfig;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.r;
import com.google.firebase.remoteconfig.z;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlinx.coroutines.s0;

/* compiled from: RemoteConfig.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n\u001a&\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0015\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/d;", "Lcom/google/firebase/g;", "app", "Lcom/google/firebase/remoteconfig/p;", "d", "(Lcom/google/firebase/d;Lcom/google/firebase/g;)Lcom/google/firebase/remoteconfig/p;", "", "key", "Lcom/google/firebase/remoteconfig/s;", "a", "(Lcom/google/firebase/remoteconfig/p;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/s;", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/r$b;", "Lkotlin/k2;", "Lkotlin/u;", "init", "Lcom/google/firebase/remoteconfig/r;", "e", "(Lld/l;)Lcom/google/firebase/remoteconfig/r;", "c", "(Lcom/google/firebase/d;)Lcom/google/firebase/remoteconfig/p;", "remoteConfig", "Lkotlinx/coroutines/flow/i;", "Lcom/google/firebase/remoteconfig/c;", "b", "(Lcom/google/firebase/remoteconfig/p;)Lkotlinx/coroutines/flow/i;", "configUpdates", "com.google.firebase-firebase-config"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class z {

    /* compiled from: RemoteConfig.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lcom/google/firebase/remoteconfig/c;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super c>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60731b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f60732c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f60733d;

        /* compiled from: RemoteConfig.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.google.firebase.remoteconfig.z$a$a, reason: collision with other inner class name */
        static final class C0934a extends n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f60734b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0934a(e eVar) {
                super(0);
                this.f60734b = eVar;
            }

            public final void a() {
                this.f60734b.remove();
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* compiled from: RemoteConfig.kt */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/google/firebase/remoteconfig/z$a$b", "Lcom/google/firebase/remoteconfig/d;", "Lcom/google/firebase/remoteconfig/c;", "configUpdate", "Lkotlin/k2;", "a", "(Lcom/google/firebase/remoteconfig/c;)V", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "error", "b", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;)V", "com.google.firebase-firebase-config"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f60735a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.b0<c> f60736b;

            /* JADX WARN: Multi-variable type inference failed */
            b(p pVar, kotlinx.coroutines.channels.b0<? super c> b0Var) {
                this.f60735a = pVar;
                this.f60736b = b0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(kotlinx.coroutines.channels.b0 b0Var, c cVar) {
                l0.p(b0Var, ProtectedSandApp.s("Ч\u0001"));
                l0.p(cVar, ProtectedSandApp.s("Ш\u0001"));
                kotlinx.coroutines.channels.r.m0(b0Var, cVar);
            }

            @Override // com.google.firebase.remoteconfig.d
            public void a(@fg.l final c configUpdate) {
                l0.p(configUpdate, ProtectedSandApp.s("Щ\u0001"));
                p pVar = this.f60735a;
                final kotlinx.coroutines.channels.b0<c> b0Var = this.f60736b;
                pVar.L(new Runnable() { // from class: com.google.firebase.remoteconfig.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.a.b.d(kotlinx.coroutines.channels.b0.this, configUpdate);
                    }
                });
            }

            @Override // com.google.firebase.remoteconfig.d
            public void b(@fg.l FirebaseRemoteConfigException error) {
                l0.p(error, ProtectedSandApp.s("Ъ\u0001"));
                s0.c(this.f60736b, ProtectedSandApp.s("Ы\u0001"), error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f60733d = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super c> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f60733d, dVar);
            aVar.f60732c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f60731b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f60732c;
                p pVar = this.f60733d;
                e k4 = pVar.k(new b(pVar, b0Var));
                l0.o(k4, ProtectedSandApp.s("Э\u0001"));
                C0934a c0934a = new C0934a(k4);
                this.f60731b = 1;
                if (kotlinx.coroutines.channels.z.a(b0Var, c0934a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("Ь\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    @fg.l
    public static final s a(@fg.l p pVar, @fg.l String str) {
        l0.p(pVar, ProtectedSandApp.s("Ю\u0001"));
        l0.p(str, ProtectedSandApp.s("Я\u0001"));
        s z4 = pVar.z(str);
        l0.o(z4, ProtectedSandApp.s("а\u0001"));
        return z4;
    }

    @fg.l
    public static final kotlinx.coroutines.flow.i<c> b(@fg.l p pVar) {
        l0.p(pVar, ProtectedSandApp.s("Ю\u0001"));
        return kotlinx.coroutines.flow.k.s(new a(pVar, null));
    }

    @fg.l
    public static final p c(@fg.l com.google.firebase.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("Ю\u0001"));
        p t4 = p.t();
        l0.o(t4, ProtectedSandApp.s("б\u0001"));
        return t4;
    }

    @fg.l
    public static final p d(@fg.l com.google.firebase.d dVar, @fg.l com.google.firebase.g gVar) {
        l0.p(dVar, ProtectedSandApp.s("Ю\u0001"));
        l0.p(gVar, ProtectedSandApp.s("в\u0001"));
        p u4 = p.u(gVar);
        l0.o(u4, ProtectedSandApp.s("г\u0001"));
        return u4;
    }

    @fg.l
    public static final r e(@fg.l ld.l<? super r.b, k2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("д\u0001"));
        r.b bVar = new r.b();
        lVar.invoke(bVar);
        r c5 = bVar.c();
        l0.o(c5, ProtectedSandApp.s("е\u0001"));
        return c5;
    }
}
