package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b0;
import com.google.firebase.components.g;
import com.google.firebase.components.r;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.a0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.o0;

/* compiled from: Firebase.kt */
@Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lcom/google/firebase/components/c;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/o0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/o0;", "u2/c$a"}, k = 3, mv = {1, 7, 1})
    public static final class a<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f16970a = new a<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 a(com.google.firebase.components.d dVar) {
            Object h5 = dVar.h(new b0<>(b2.a.class, Executor.class));
            l0.o(h5, ProtectedSandApp.s("⫋"));
            return b2.c((Executor) h5);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/o0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/o0;", "u2/c$a"}, k = 3, mv = {1, 7, 1})
    public static final class b<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T> f16971a = new b<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 a(com.google.firebase.components.d dVar) {
            Object h5 = dVar.h(new b0<>(b2.c.class, Executor.class));
            l0.o(h5, ProtectedSandApp.s("⫌"));
            return b2.c((Executor) h5);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/o0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/o0;", "u2/c$a"}, k = 3, mv = {1, 7, 1})
    public static final class c<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T> f16972a = new c<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 a(com.google.firebase.components.d dVar) {
            Object h5 = dVar.h(new b0<>(b2.b.class, Executor.class));
            l0.o(h5, ProtectedSandApp.s("⫍"));
            return b2.c((Executor) h5);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/o0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/o0;", "u2/c$a"}, k = 3, mv = {1, 7, 1})
    public static final class d<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T> f16973a = new d<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 a(com.google.firebase.components.d dVar) {
            Object h5 = dVar.h(new b0<>(b2.d.class, Executor.class));
            l0.o(h5, ProtectedSandApp.s("⫎"));
            return b2.c((Executor) h5);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @d5.d
    public List<com.google.firebase.components.c<?>> getComponents() {
        List<com.google.firebase.components.c<?>> O;
        com.google.firebase.components.c d6 = com.google.firebase.components.c.f(new b0(b2.a.class, o0.class)).b(r.l(new b0(b2.a.class, Executor.class))).f(a.f16970a).d();
        String s5 = ProtectedSandApp.s("⫏");
        l0.o(d6, s5);
        com.google.firebase.components.c d7 = com.google.firebase.components.c.f(new b0(b2.c.class, o0.class)).b(r.l(new b0(b2.c.class, Executor.class))).f(b.f16971a).d();
        l0.o(d7, s5);
        com.google.firebase.components.c d8 = com.google.firebase.components.c.f(new b0(b2.b.class, o0.class)).b(r.l(new b0(b2.b.class, Executor.class))).f(c.f16972a).d();
        l0.o(d8, s5);
        com.google.firebase.components.c d9 = com.google.firebase.components.c.f(new b0(b2.d.class, o0.class)).b(r.l(new b0(b2.d.class, Executor.class))).f(d.f16973a).d();
        l0.o(d9, s5);
        O = a0.O(d6, d7, d8, d9);
        return O;
    }
}
