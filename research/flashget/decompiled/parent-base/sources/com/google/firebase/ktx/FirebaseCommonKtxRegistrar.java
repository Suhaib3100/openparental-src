package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b0;
import com.google.firebase.components.g;
import com.google.firebase.components.r;
import fg.l;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.x0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.y1;

/* compiled from: Firebase.kt */
@k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @x0(expression = "", imports = {}))
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lcom/google/firebase/components/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/ktx/FirebaseKt\n*L\n1#1,158:1\n152#2,6:159\n152#2,6:165\n152#2,6:171\n152#2,6:177\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseCommonKtxRegistrar\n*L\n143#1:159,6\n144#1:165,6\n145#1:171,6\n146#1:177,6\n*E\n"})
/* loaded from: classes6.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;", "ea/c$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,158:1\n*E\n"})
    public static final class a<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f59838a = new a<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            Object g4 = dVar.g(new b0<>(l9.a.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("Ĝ\u0001"));
            return y1.c((Executor) g4);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;", "ea/c$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,158:1\n*E\n"})
    public static final class b<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T> f59839a = new b<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            Object g4 = dVar.g(new b0<>(l9.c.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("ĝ\u0001"));
            return y1.c((Executor) g4);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;", "ea/c$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,158:1\n*E\n"})
    public static final class c<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T> f59840a = new c<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            Object g4 = dVar.g(new b0<>(l9.b.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("Ğ\u0001"));
            return y1.c((Executor) g4);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;", "ea/c$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,158:1\n*E\n"})
    public static final class d<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T> f59841a = new d<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            Object g4 = dVar.g(new b0<>(l9.d.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("ğ\u0001"));
            return y1.c((Executor) g4);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @l
    public List<com.google.firebase.components.c<?>> getComponents() {
        com.google.firebase.components.c d5 = com.google.firebase.components.c.f(new b0(l9.a.class, m0.class)).b(r.l(new b0(l9.a.class, Executor.class))).f(a.f59838a).d();
        String s4 = ProtectedSandApp.s("Ġ\u0001");
        l0.o(d5, s4);
        com.google.firebase.components.c d6 = com.google.firebase.components.c.f(new b0(l9.c.class, m0.class)).b(r.l(new b0(l9.c.class, Executor.class))).f(b.f59839a).d();
        l0.o(d6, s4);
        com.google.firebase.components.c d7 = com.google.firebase.components.c.f(new b0(l9.b.class, m0.class)).b(r.l(new b0(l9.b.class, Executor.class))).f(c.f59840a).d();
        l0.o(d7, s4);
        com.google.firebase.components.c d10 = com.google.firebase.components.c.f(new b0(l9.d.class, m0.class)).b(r.l(new b0(l9.d.class, Executor.class))).f(d.f59841a).d();
        l0.o(d10, s4);
        return w.O(d5, d6, d7, d10);
    }
}
