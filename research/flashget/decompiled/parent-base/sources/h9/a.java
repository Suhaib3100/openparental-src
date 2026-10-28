package h9;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.k2;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a8\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"$\u0010\r\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0016\u001a\u00020\u0000*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/analytics/FirebaseAnalytics;", "", "name", "Lkotlin/Function1;", "Lh9/d;", "Lkotlin/k2;", "Lkotlin/u;", "block", "d", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/lang/String;Lld/l;)V", "Lh9/b;", "f", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Lld/l;)V", "ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "a", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "e", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "Lea/b;", "b", "(Lea/b;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "", "LOCK", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m
    private static volatile FirebaseAnalytics f74113a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final Object f74114b = new Object();

    @q0
    public static final FirebaseAnalytics a() {
        return f74113a;
    }

    @l
    public static final FirebaseAnalytics b(@o0 ea.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("㟸\u0001"));
        if (f74113a == null) {
            synchronized (f74114b) {
                if (f74113a == null) {
                    f74113a = FirebaseAnalytics.getInstance(ea.c.c(ea.b.f73770a).n());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f74113a;
        l0.m(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @l
    public static final Object c() {
        return f74114b;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public static final void d(@o0 FirebaseAnalytics firebaseAnalytics, @o0 String str, @o0 ld.l<? super d, k2> lVar) {
        l0.p(firebaseAnalytics, ProtectedSandApp.s("㟸\u0001"));
        l0.p(str, ProtectedSandApp.s("㟹\u0001"));
        l0.p(lVar, ProtectedSandApp.s("㟺\u0001"));
        d dVar = new d();
        lVar.invoke(dVar);
        firebaseAnalytics.c(str, dVar.getF74118a());
    }

    public static final void e(@m FirebaseAnalytics firebaseAnalytics) {
        f74113a = firebaseAnalytics;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public static final void f(@o0 FirebaseAnalytics firebaseAnalytics, @o0 ld.l<? super b, k2> lVar) {
        l0.p(firebaseAnalytics, ProtectedSandApp.s("㟸\u0001"));
        l0.p(lVar, ProtectedSandApp.s("㟺\u0001"));
        b bVar = new b();
        lVar.invoke(bVar);
        firebaseAnalytics.f(bVar.a());
    }
}
