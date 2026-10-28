package com.google.firebase.analytics;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.o;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a8\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"$\u0010\r\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0016\u001a\u00020\u0000*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/analytics/FirebaseAnalytics;", "", "name", "Lkotlin/Function1;", "Lcom/google/firebase/analytics/c;", "Lkotlin/k2;", "Lkotlin/u;", "block", "d", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/lang/String;Lld/l;)V", "Lcom/google/firebase/analytics/b;", "f", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Lld/l;)V", "ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "a", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "e", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "Lcom/google/firebase/d;", "b", "(Lcom/google/firebase/d;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "", "LOCK", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m
    private static volatile FirebaseAnalytics f58357a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final Object f58358b = new Object();

    @q0
    public static final FirebaseAnalytics a() {
        return f58357a;
    }

    @l
    public static final FirebaseAnalytics b(@o0 com.google.firebase.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("\ufb10"));
        if (f58357a == null) {
            synchronized (f58358b) {
                if (f58357a == null) {
                    f58357a = FirebaseAnalytics.getInstance(o.c(com.google.firebase.d.f59602a).n());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f58357a;
        l0.m(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @l
    public static final Object c() {
        return f58358b;
    }

    public static final void d(@o0 FirebaseAnalytics firebaseAnalytics, @o0 String str, @o0 ld.l<? super c, k2> lVar) {
        l0.p(firebaseAnalytics, ProtectedSandApp.s("\ufb10"));
        l0.p(str, ProtectedSandApp.s("\ufb11"));
        l0.p(lVar, ProtectedSandApp.s("\ufb12"));
        c cVar = new c();
        lVar.invoke(cVar);
        firebaseAnalytics.c(str, cVar.getF58363a());
    }

    public static final void e(@m FirebaseAnalytics firebaseAnalytics) {
        f58357a = firebaseAnalytics;
    }

    public static final void f(@o0 FirebaseAnalytics firebaseAnalytics, @o0 ld.l<? super b, k2> lVar) {
        l0.p(firebaseAnalytics, ProtectedSandApp.s("\ufb10"));
        l0.p(lVar, ProtectedSandApp.s("\ufb12"));
        b bVar = new b();
        lVar.invoke(bVar);
        firebaseAnalytics.f(bVar.a());
    }
}
