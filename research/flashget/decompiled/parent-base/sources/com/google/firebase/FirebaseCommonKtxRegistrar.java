package com.google.firebase;

import androidx.annotation.Keep;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.y1;

/* compiled from: Firebase.kt */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lcom/google/firebase/components/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
/* loaded from: classes6.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;", "com/google/firebase/o$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,82:1\n*E\n"})
    public static final class a<T> implements com.google.firebase.components.g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f58079a = new a<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            Object g4 = dVar.g(new b0<>(l9.a.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("練"));
            return y1.c((Executor) g4);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;", "com/google/firebase/o$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,82:1\n*E\n"})
    public static final class b<T> implements com.google.firebase.components.g {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T> f58080a = new b<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            Object g4 = dVar.g(new b0<>(l9.c.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("縉"));
            return y1.c((Executor) g4);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;", "com/google/firebase/o$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,82:1\n*E\n"})
    public static final class c<T> implements com.google.firebase.components.g {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T> f58081a = new c<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            Object g4 = dVar.g(new b0<>(l9.b.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("繁"));
            return y1.c((Executor) g4);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;", "com/google/firebase/o$a"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,82:1\n*E\n"})
    public static final class d<T> implements com.google.firebase.components.g {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T> f58082a = new d<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            Object g4 = dVar.g(new b0<>(l9.d.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("署"));
            return y1.c((Executor) g4);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @fg.l
    public List<com.google.firebase.components.c<?>> getComponents() {
        com.google.firebase.components.c d5 = com.google.firebase.components.c.f(new b0(l9.a.class, m0.class)).b(com.google.firebase.components.r.l(new b0(l9.a.class, Executor.class))).f(a.f58079a).d();
        String s4 = ProtectedSandApp.s("者");
        l0.o(d5, s4);
        com.google.firebase.components.c d6 = com.google.firebase.components.c.f(new b0(l9.c.class, m0.class)).b(com.google.firebase.components.r.l(new b0(l9.c.class, Executor.class))).f(b.f58080a).d();
        l0.o(d6, s4);
        com.google.firebase.components.c d7 = com.google.firebase.components.c.f(new b0(l9.b.class, m0.class)).b(com.google.firebase.components.r.l(new b0(l9.b.class, Executor.class))).f(c.f58081a).d();
        l0.o(d7, s4);
        com.google.firebase.components.c d10 = com.google.firebase.components.c.f(new b0(l9.d.class, m0.class)).b(com.google.firebase.components.r.l(new b0(l9.d.class, Executor.class))).f(d.f58082a).d();
        l0.o(d10, s4);
        return w.O(d5, d6, d7, d10);
    }
}
