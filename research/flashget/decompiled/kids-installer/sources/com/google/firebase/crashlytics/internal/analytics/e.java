package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: CrashlyticsOriginAnalyticsEventLogger.java */
/* loaded from: classes3.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    static final String f15534b = ProtectedSandApp.s("⟾");

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final com.google.firebase.analytics.connector.a f15535a;

    public e(@o0 com.google.firebase.analytics.connector.a aVar) {
        this.f15535a = aVar;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@o0 String str, @q0 Bundle bundle) {
        this.f15535a.c(ProtectedSandApp.s("⟽"), str, bundle);
    }
}
