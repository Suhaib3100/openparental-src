package h9;

import androidx.annotation.q0;
import com.google.firebase.analytics.FirebaseAnalytics;
import fg.l;
import fg.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
@k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lh9/b;", "", "<init>", "()V", "", "Lcom/google/firebase/analytics/FirebaseAnalytics$b;", "Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "a", "()Ljava/util/Map;", "adStorage", "Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "b", "()Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "d", "(Lcom/google/firebase/analytics/FirebaseAnalytics$a;)V", "analyticsStorage", "c", "e", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m
    private FirebaseAnalytics.a f74115a;

    /* renamed from: b, reason: collision with root package name */
    @m
    private FirebaseAnalytics.a f74116b;

    @l
    public final Map<FirebaseAnalytics.b, FirebaseAnalytics.a> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.a aVar = this.f74115a;
        if (aVar != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_STORAGE, aVar);
        }
        FirebaseAnalytics.a aVar2 = this.f74116b;
        if (aVar2 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, aVar2);
        }
        return linkedHashMap;
    }

    @q0
    /* renamed from: b, reason: from getter */
    public final FirebaseAnalytics.a getF74115a() {
        return this.f74115a;
    }

    @q0
    /* renamed from: c, reason: from getter */
    public final FirebaseAnalytics.a getF74116b() {
        return this.f74116b;
    }

    public final void d(@m FirebaseAnalytics.a aVar) {
        this.f74115a = aVar;
    }

    public final void e(@m FirebaseAnalytics.a aVar) {
        this.f74116b = aVar;
    }
}
