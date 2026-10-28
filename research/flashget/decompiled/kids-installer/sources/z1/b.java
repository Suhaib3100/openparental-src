package z1;

import com.google.firebase.analytics.FirebaseAnalytics;
import d5.e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: com.google.firebase:firebase-analytics-ktx@@21.3.0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lz1/b;", "", "", "Lcom/google/firebase/analytics/FirebaseAnalytics$b;", "Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "a", "adStorage", "Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "b", "()Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "d", "(Lcom/google/firebase/analytics/FirebaseAnalytics$a;)V", "analyticsStorage", "c", "e", "<init>", "()V", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @e
    private FirebaseAnalytics.a f34397a;

    /* renamed from: b, reason: collision with root package name */
    @e
    private FirebaseAnalytics.a f34398b;

    @d5.d
    public final Map<FirebaseAnalytics.b, FirebaseAnalytics.a> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.a aVar = this.f34397a;
        if (aVar != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_STORAGE, aVar);
        }
        FirebaseAnalytics.a aVar2 = this.f34398b;
        if (aVar2 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, aVar2);
        }
        return linkedHashMap;
    }

    @e
    /* renamed from: b, reason: from getter */
    public final FirebaseAnalytics.a getF34397a() {
        return this.f34397a;
    }

    @e
    /* renamed from: c, reason: from getter */
    public final FirebaseAnalytics.a getF34398b() {
        return this.f34398b;
    }

    public final void d(@e FirebaseAnalytics.a aVar) {
        this.f34397a = aVar;
    }

    public final void e(@e FirebaseAnalytics.a aVar) {
        this.f34398b = aVar;
    }
}
