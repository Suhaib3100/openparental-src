package com.google.firebase.analytics;

import androidx.annotation.q0;
import com.google.android.gms.internal.measurement.zzdy;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes6.dex */
final class f implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f58400a;

    f(FirebaseAnalytics firebaseAnalytics) {
        this.f58400a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @q0
    public final /* synthetic */ String call() throws Exception {
        zzdy zzdyVar;
        zzdyVar = this.f58400a.f58284a;
        return zzdyVar.zze();
    }
}
