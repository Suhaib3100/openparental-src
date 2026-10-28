package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.c0;
import com.google.firebase.crashlytics.internal.common.i0;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.common.n0;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public class FirebaseCrashlytics {

    /* renamed from: b, reason: collision with root package name */
    static final String f58575b = ProtectedSandApp.s("ﮱ");

    /* renamed from: c, reason: collision with root package name */
    static final String f58576c = ProtectedSandApp.s("﮲");

    /* renamed from: d, reason: collision with root package name */
    static final int f58577d = 500;

    /* renamed from: a, reason: collision with root package name */
    @m1
    final c0 f58578a;

    private FirebaseCrashlytics(@o0 c0 c0Var) {
        this.f58578a = c0Var;
    }

    @q0
    static FirebaseCrashlytics b(@o0 com.google.firebase.g gVar, @o0 com.google.firebase.installations.k kVar, @o0 y9.a<com.google.firebase.crashlytics.internal.a> aVar, @o0 y9.a<com.google.firebase.analytics.connector.a> aVar2, @o0 y9.a<ia.a> aVar3, ExecutorService executorService, ExecutorService executorService2) {
        Context n4 = gVar.n();
        String packageName = n4.getPackageName();
        com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("ﮩ") + packageName);
        com.google.firebase.crashlytics.internal.concurrency.k kVar2 = new com.google.firebase.crashlytics.internal.concurrency.k(executorService, executorService2);
        com.google.firebase.crashlytics.internal.persistence.g gVar2 = new com.google.firebase.crashlytics.internal.persistence.g(n4);
        i0 i0Var = new i0(gVar);
        n0 n0Var = new n0(n4, packageName, kVar, i0Var);
        com.google.firebase.crashlytics.internal.d dVar = new com.google.firebase.crashlytics.internal.d(aVar);
        d dVar2 = new d(aVar2);
        m mVar = new m(i0Var, gVar2);
        com.google.firebase.sessions.api.a.e(mVar);
        c0 c0Var = new c0(gVar, n0Var, dVar, i0Var, new a(dVar2), new b(dVar2), gVar2, mVar, new com.google.firebase.crashlytics.internal.l(aVar3), kVar2);
        String j4 = gVar.s().j();
        String n5 = com.google.firebase.crashlytics.internal.common.i.n(n4);
        List<com.google.firebase.crashlytics.internal.common.f> j5 = com.google.firebase.crashlytics.internal.common.i.j(n4);
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﮪ") + n5);
        for (com.google.firebase.crashlytics.internal.common.f fVar : j5) {
            com.google.firebase.crashlytics.internal.g.f().b(String.format(ProtectedSandApp.s("ﮫ"), fVar.c(), fVar.a(), fVar.b()));
        }
        try {
            com.google.firebase.crashlytics.internal.common.a a5 = com.google.firebase.crashlytics.internal.common.a.a(n4, n0Var, j4, n5, j5, new com.google.firebase.crashlytics.internal.f(n4));
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﮬ") + a5.f58620d);
            com.google.firebase.crashlytics.internal.settings.g l4 = com.google.firebase.crashlytics.internal.settings.g.l(n4, j4, n0Var, new n9.b(), a5.f58622f, a5.f58623g, gVar2, i0Var);
            l4.o(kVar2).addOnFailureListener(new i());
            if (c0Var.N(a5, l4)) {
                c0Var.r(l4);
            }
            return new FirebaseCrashlytics(c0Var);
        } catch (PackageManager.NameNotFoundException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﮭ"), e4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) {
        com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﮮ"), exc);
    }

    @o0
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) com.google.firebase.g.p().l(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException(ProtectedSandApp.s("ﮯ"));
    }

    @o0
    public Task<Boolean> checkForUnsentReports() {
        return this.f58578a.m();
    }

    public void deleteUnsentReports() {
        this.f58578a.n();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f58578a.o();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f58578a.w();
    }

    public void log(@o0 String str) {
        this.f58578a.I(str);
    }

    public void recordException(@o0 Throwable th) {
        if (th == null) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﮰ"));
        } else {
            this.f58578a.J(th);
        }
    }

    public void sendUnsentReports() {
        this.f58578a.O();
    }

    public void setCrashlyticsCollectionEnabled(boolean z4) {
        this.f58578a.P(Boolean.valueOf(z4));
    }

    public void setCustomKey(@o0 String str, boolean z4) {
        this.f58578a.Q(str, Boolean.toString(z4));
    }

    public void setCustomKeys(@o0 h hVar) {
        this.f58578a.R(hVar.f58597a);
    }

    public void setUserId(@o0 String str) {
        this.f58578a.T(str);
    }

    public void setCrashlyticsCollectionEnabled(@q0 Boolean bool) {
        this.f58578a.P(bool);
    }

    public void setCustomKey(@o0 String str, double d5) {
        this.f58578a.Q(str, Double.toString(d5));
    }

    public void setCustomKey(@o0 String str, float f4) {
        this.f58578a.Q(str, Float.toString(f4));
    }

    public void setCustomKey(@o0 String str, int i4) {
        this.f58578a.Q(str, Integer.toString(i4));
    }

    public void setCustomKey(@o0 String str, long j4) {
        this.f58578a.Q(str, Long.toString(j4));
    }

    public void setCustomKey(@o0 String str, @o0 String str2) {
        this.f58578a.Q(str, str2);
    }
}
