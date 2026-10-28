package com.google.firebase;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.b0;
import com.google.firebase.components.c;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.y1;

/* compiled from: Firebase.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\u0010H\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/d;", "", "name", "Lcom/google/firebase/g;", "a", "(Lcom/google/firebase/d;Ljava/lang/String;)Lcom/google/firebase/g;", "Landroid/content/Context;", "context", "e", "(Lcom/google/firebase/d;Landroid/content/Context;)Lcom/google/firebase/g;", "Lcom/google/firebase/p;", "options", "f", "(Lcom/google/firebase/d;Landroid/content/Context;Lcom/google/firebase/p;)Lcom/google/firebase/g;", "g", "(Lcom/google/firebase/d;Landroid/content/Context;Lcom/google/firebase/p;Ljava/lang/String;)Lcom/google/firebase/g;", "", "T", "Lcom/google/firebase/components/c;", "Lkotlinx/coroutines/m0;", "b", "()Lcom/google/firebase/components/c;", "c", "(Lcom/google/firebase/d;)Lcom/google/firebase/g;", "app", "d", "(Lcom/google/firebase/d;)Lcom/google/firebase/p;", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class o {

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,82:1\n*E\n"})
    public static final class a<T> implements com.google.firebase.components.g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f60342a = new a<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            l0.P();
            Object g4 = dVar.g(new b0<>(Annotation.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("̉\u0001"));
            return y1.c((Executor) g4);
        }
    }

    @fg.l
    public static final g a(@fg.l d dVar, @fg.l String str) {
        l0.p(dVar, ProtectedSandApp.s("̊\u0001"));
        l0.p(str, ProtectedSandApp.s("̋\u0001"));
        g q4 = g.q(str);
        l0.o(q4, ProtectedSandApp.s("̌\u0001"));
        return q4;
    }

    private static final <T extends Annotation> com.google.firebase.components.c<m0> b() {
        l0.P();
        c.b f4 = com.google.firebase.components.c.f(new b0(Annotation.class, m0.class));
        l0.P();
        c.b b5 = f4.b(com.google.firebase.components.r.l(new b0(Annotation.class, Executor.class)));
        l0.P();
        com.google.firebase.components.c<m0> d5 = b5.f(a.f60342a).d();
        l0.o(d5, ProtectedSandApp.s("̍\u0001"));
        return d5;
    }

    @fg.l
    public static final g c(@fg.l d dVar) {
        l0.p(dVar, ProtectedSandApp.s("̊\u0001"));
        g p4 = g.p();
        l0.o(p4, ProtectedSandApp.s("̎\u0001"));
        return p4;
    }

    @fg.l
    public static final p d(@fg.l d dVar) {
        l0.p(dVar, ProtectedSandApp.s("̊\u0001"));
        p s4 = c(d.f59602a).s();
        l0.o(s4, ProtectedSandApp.s("̏\u0001"));
        return s4;
    }

    @fg.m
    public static final g e(@fg.l d dVar, @fg.l Context context) {
        l0.p(dVar, ProtectedSandApp.s("̊\u0001"));
        l0.p(context, ProtectedSandApp.s("̐\u0001"));
        return g.x(context);
    }

    @fg.l
    public static final g f(@fg.l d dVar, @fg.l Context context, @fg.l p pVar) {
        l0.p(dVar, ProtectedSandApp.s("̊\u0001"));
        l0.p(context, ProtectedSandApp.s("̐\u0001"));
        l0.p(pVar, ProtectedSandApp.s("̑\u0001"));
        g y4 = g.y(context, pVar);
        l0.o(y4, ProtectedSandApp.s("̒\u0001"));
        return y4;
    }

    @fg.l
    public static final g g(@fg.l d dVar, @fg.l Context context, @fg.l p pVar, @fg.l String str) {
        l0.p(dVar, ProtectedSandApp.s("̊\u0001"));
        l0.p(context, ProtectedSandApp.s("̐\u0001"));
        l0.p(pVar, ProtectedSandApp.s("̑\u0001"));
        l0.p(str, ProtectedSandApp.s("̋\u0001"));
        g z4 = g.z(context, pVar, str);
        l0.o(z4, ProtectedSandApp.s("̓\u0001"));
        return z4;
    }
}
