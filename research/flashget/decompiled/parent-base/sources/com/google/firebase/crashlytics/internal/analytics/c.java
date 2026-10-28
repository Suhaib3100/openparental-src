package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* loaded from: classes6.dex */
public class c implements b, a {

    /* renamed from: g, reason: collision with root package name */
    static final String f58599g = ProtectedSandApp.s("\ufbc8");

    /* renamed from: a, reason: collision with root package name */
    private final e f58600a;

    /* renamed from: b, reason: collision with root package name */
    private final int f58601b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f58602c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f58604e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f58603d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f58605f = false;

    public c(@o0 e eVar, int i4, TimeUnit timeUnit) {
        this.f58600a = eVar;
        this.f58601b = i4;
        this.f58602c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@o0 String str, @q0 Bundle bundle) {
        String s4 = ProtectedSandApp.s("﯂");
        synchronized (this.f58603d) {
            try {
                g.f().k(s4 + str + ProtectedSandApp.s("\ufbc3") + bundle);
                this.f58604e = new CountDownLatch(1);
                this.f58605f = false;
                this.f58600a.a(str, bundle);
                g.f().k(ProtectedSandApp.s("\ufbc4"));
                try {
                    if (this.f58604e.await(this.f58601b, this.f58602c)) {
                        this.f58605f = true;
                        g.f().k(ProtectedSandApp.s("\ufbc5"));
                    } else {
                        g.f().m(ProtectedSandApp.s("\ufbc6"));
                    }
                } catch (InterruptedException unused) {
                    g.f().d(ProtectedSandApp.s("\ufbc7"));
                }
                this.f58604e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean b() {
        return this.f58605f;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void onEvent(@o0 String str, @o0 Bundle bundle) {
        CountDownLatch countDownLatch = this.f58604e;
        if (countDownLatch != null && ProtectedSandApp.s("\ufbc8").equals(str)) {
            countDownLatch.countDown();
        }
    }
}
