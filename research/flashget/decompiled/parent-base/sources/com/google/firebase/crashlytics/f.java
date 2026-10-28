package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.analytics.connector.a;
import java.util.Locale;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes6.dex */
class f implements a.b {

    /* renamed from: c, reason: collision with root package name */
    static final String f58590c = ProtectedSandApp.s("﮽");

    /* renamed from: d, reason: collision with root package name */
    static final String f58591d = ProtectedSandApp.s("﯀");

    /* renamed from: e, reason: collision with root package name */
    static final String f58592e = ProtectedSandApp.s("﯁");

    /* renamed from: f, reason: collision with root package name */
    static final String f58593f = ProtectedSandApp.s("﮾");

    /* renamed from: a, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.analytics.b f58594a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.analytics.b f58595b;

    f() {
    }

    private static void b(@q0 com.google.firebase.crashlytics.internal.analytics.b bVar, @o0 String str, @o0 Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.onEvent(str, bundle);
    }

    private void c(@o0 String str, @o0 Bundle bundle) {
        b(ProtectedSandApp.s("﮾").equals(bundle.getString(ProtectedSandApp.s("﮽"))) ? this.f58594a : this.f58595b, str, bundle);
    }

    @Override // com.google.firebase.analytics.connector.a.b
    public void a(int i4, @q0 Bundle bundle) {
        String string;
        com.google.firebase.crashlytics.internal.g.f().k(String.format(Locale.US, ProtectedSandApp.s("﮿"), Integer.valueOf(i4), bundle));
        if (bundle == null || (string = bundle.getString(ProtectedSandApp.s("﯀"))) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle(ProtectedSandApp.s("﯁"));
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(@q0 com.google.firebase.crashlytics.internal.analytics.b bVar) {
        this.f58595b = bVar;
    }

    public void e(@q0 com.google.firebase.crashlytics.internal.analytics.b bVar) {
        this.f58594a = bVar;
    }
}
