package j9;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "a", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Lld/a;)V", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class a {
    public static final void a(@o0 FirebaseAnalytics firebaseAnalytics, @o0 ld.a<k2> aVar) {
        l0.p(firebaseAnalytics, ProtectedSandApp.s("㠤\u0001"));
        l0.p(aVar, ProtectedSandApp.s("㠥\u0001"));
        synchronized (com.google.firebase.analytics.a.c()) {
            FirebaseAnalytics a5 = com.google.firebase.analytics.a.a();
            com.google.firebase.analytics.a.e(firebaseAnalytics);
            try {
                aVar.invoke();
            } finally {
                com.google.firebase.analytics.a.e(a5);
            }
        }
    }
}
