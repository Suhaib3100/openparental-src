package com.google.firebase.analytics;

import androidx.annotation.q0;
import com.google.android.gms.internal.measurement.zzef;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes2.dex */
final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseAnalytics f15284a;

    c(FirebaseAnalytics firebaseAnalytics) {
        this.f15284a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @q0
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzef zzefVar;
        zzefVar = this.f15284a.f15210a;
        return zzefVar.zzh();
    }
}
