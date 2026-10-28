package com.google.firebase;

import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.b0;
import com.google.firebase.components.c;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.o0;

/* compiled from: Firebase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001a\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b\u001a\"\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\fH\u0082\b\"\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0015\u0010\t\u001a\u00020\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/d;", "", "name", "Lcom/google/firebase/g;", "a", "Landroid/content/Context;", "context", "e", "Lcom/google/firebase/p;", "options", "f", "g", "", "T", "Lcom/google/firebase/components/c;", "Lkotlinx/coroutines/o0;", "b", "c", "(Lcom/google/firebase/d;)Lcom/google/firebase/g;", "app", "d", "(Lcom/google/firebase/d;)Lcom/google/firebase/p;", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o {

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/o0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/o0;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a<T> implements com.google.firebase.components.g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f17672a = new a<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 a(com.google.firebase.components.d dVar) {
            l0.P();
            Object h5 = dVar.h(new b0<>(Annotation.class, Executor.class));
            l0.o(h5, ProtectedSandApp.s("⬙"));
            return b2.c((Executor) h5);
        }
    }

    @d5.d
    public static final g a(@d5.d d dVar, @d5.d String str) {
        l0.p(dVar, ProtectedSandApp.s("ᣜ"));
        l0.p(str, ProtectedSandApp.s("ᣝ"));
        g q5 = g.q(str);
        l0.o(q5, ProtectedSandApp.s("ᣞ"));
        return q5;
    }

    private static final <T extends Annotation> com.google.firebase.components.c<o0> b() {
        l0.P();
        c.b f6 = com.google.firebase.components.c.f(new b0(Annotation.class, o0.class));
        l0.P();
        c.b b6 = f6.b(com.google.firebase.components.r.l(new b0(Annotation.class, Executor.class)));
        l0.P();
        com.google.firebase.components.c<o0> d6 = b6.f(a.f17672a).d();
        l0.o(d6, ProtectedSandApp.s("ᣟ"));
        return d6;
    }

    @d5.d
    public static final g c(@d5.d d dVar) {
        l0.p(dVar, ProtectedSandApp.s("ᣠ"));
        g p5 = g.p();
        l0.o(p5, ProtectedSandApp.s("ᣡ"));
        return p5;
    }

    @d5.d
    public static final p d(@d5.d d dVar) {
        l0.p(dVar, ProtectedSandApp.s("ᣢ"));
        p s5 = c(d.f16581a).s();
        l0.o(s5, ProtectedSandApp.s("ᣣ"));
        return s5;
    }

    @d5.e
    public static final g e(@d5.d d dVar, @d5.d Context context) {
        l0.p(dVar, ProtectedSandApp.s("ᣤ"));
        l0.p(context, ProtectedSandApp.s("ᣥ"));
        return g.x(context);
    }

    @d5.d
    public static final g f(@d5.d d dVar, @d5.d Context context, @d5.d p pVar) {
        l0.p(dVar, ProtectedSandApp.s("ᣦ"));
        l0.p(context, ProtectedSandApp.s("ᣧ"));
        l0.p(pVar, ProtectedSandApp.s("ᣨ"));
        g y5 = g.y(context, pVar);
        l0.o(y5, ProtectedSandApp.s("ᣩ"));
        return y5;
    }

    @d5.d
    public static final g g(@d5.d d dVar, @d5.d Context context, @d5.d p pVar, @d5.d String str) {
        l0.p(dVar, ProtectedSandApp.s("ᣪ"));
        l0.p(context, ProtectedSandApp.s("ᣫ"));
        l0.p(pVar, ProtectedSandApp.s("ᣬ"));
        l0.p(str, ProtectedSandApp.s("ᣭ"));
        g z5 = g.z(context, pVar, str);
        l0.o(z5, ProtectedSandApp.s("ᣮ"));
        return z5;
    }
}
