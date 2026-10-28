package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* loaded from: classes3.dex */
public class c implements b, a {

    /* renamed from: g, reason: collision with root package name */
    static final String f15523g = ProtectedSandApp.s("⟴");

    /* renamed from: a, reason: collision with root package name */
    private final e f15524a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15525b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f15526c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f15528e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f15527d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f15529f = false;

    public c(@o0 e eVar, int i5, TimeUnit timeUnit) {
        this.f15524a = eVar;
        this.f15525b = i5;
        this.f15526c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@o0 String str, @q0 Bundle bundle) {
        String s5 = ProtectedSandApp.s("⟭");
        synchronized (this.f15527d) {
            g.f().k(s5 + str + ProtectedSandApp.s("⟮") + bundle);
            this.f15528e = new CountDownLatch(1);
            this.f15529f = false;
            this.f15524a.a(str, bundle);
            g.f().k(ProtectedSandApp.s("⟯"));
            try {
                if (this.f15528e.await(this.f15525b, this.f15526c)) {
                    this.f15529f = true;
                    g.f().k(ProtectedSandApp.s("⟰"));
                } else {
                    g.f().m(ProtectedSandApp.s("⟱"));
                }
            } catch (InterruptedException unused) {
                g.f().d(ProtectedSandApp.s("⟲"));
            }
            this.f15528e = null;
        }
    }

    boolean b() {
        return this.f15529f;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void onEvent(@o0 String str, @o0 Bundle bundle) {
        CountDownLatch countDownLatch = this.f15528e;
        if (countDownLatch != null && ProtectedSandApp.s("⟳").equals(str)) {
            countDownLatch.countDown();
        }
    }
}
