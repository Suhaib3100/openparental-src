package z1;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import q3.l;

/* compiled from: com.google.firebase:firebase-analytics-ktx@@21.3.0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a+\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0014\u0010\r\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"$\u0010\u000e\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0017\u001a\u00020\u0000*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/analytics/FirebaseAnalytics;", "", "name", "Lkotlin/Function1;", "Lz1/c;", "Lkotlin/m2;", "Lkotlin/u;", "block", "d", "Lz1/b;", "f", "c", "Ljava/lang/String;", "LIBRARY_NAME", "ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "a", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "e", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "Lu2/b;", "b", "(Lu2/b;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "", "LOCK", "Ljava/lang/Object;", "()Ljava/lang/Object;", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @e
    private static volatile FirebaseAnalytics f34394a;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final String f34396c = ProtectedSandApp.s("ᯄ");

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Object f34395b = new Object();

    @e
    public static final FirebaseAnalytics a() {
        return f34394a;
    }

    @d5.d
    public static final FirebaseAnalytics b(@d5.d u2.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("ᯅ"));
        if (f34394a == null) {
            synchronized (f34395b) {
                if (f34394a == null) {
                    f34394a = FirebaseAnalytics.getInstance(u2.c.c(u2.b.f33575a).n());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f34394a;
        l0.m(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @d5.d
    public static final Object c() {
        return f34395b;
    }

    public static final void d(@d5.d FirebaseAnalytics firebaseAnalytics, @d5.d String str, @d5.d l<? super c, m2> lVar) {
        l0.p(firebaseAnalytics, ProtectedSandApp.s("ᯆ"));
        l0.p(str, ProtectedSandApp.s("ᯇ"));
        l0.p(lVar, ProtectedSandApp.s("ᯈ"));
        c cVar = new c();
        lVar.N(cVar);
        firebaseAnalytics.c(str, cVar.getF34399a());
    }

    public static final void e(@e FirebaseAnalytics firebaseAnalytics) {
        f34394a = firebaseAnalytics;
    }

    public static final void f(@d5.d FirebaseAnalytics firebaseAnalytics, @d5.d l<? super b, m2> lVar) {
        l0.p(firebaseAnalytics, ProtectedSandApp.s("ᯉ"));
        l0.p(lVar, ProtectedSandApp.s("ᯊ"));
        b bVar = new b();
        lVar.N(bVar);
        firebaseAnalytics.f(bVar.a());
    }
}
