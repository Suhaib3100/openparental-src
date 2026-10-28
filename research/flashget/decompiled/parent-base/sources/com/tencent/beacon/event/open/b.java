package com.tencent.beacon.event.open;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.base.util.c;

/* compiled from: BeaconReport.java */
/* loaded from: classes6.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BeaconConfig f71634a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BeaconReport f71635b;

    b(BeaconReport beaconReport, BeaconConfig beaconConfig) {
        this.f71635b = beaconReport;
        this.f71634a = beaconConfig;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            i.a();
            i.g();
            this.f71635b.a(this.f71634a);
            this.f71635b.a();
            c.a(ProtectedSandApp.s("㎓\u0001"), ProtectedSandApp.s("㎔\u0001"), com.tencent.beacon.a.c.c.c().e());
        } catch (Throwable th) {
            j.e().a(ProtectedSandApp.s("㎗\u0001"), ProtectedSandApp.s("㎕\u0001") + com.tencent.beacon.a.c.b.b() + ProtectedSandApp.s("㎖\u0001") + th.getMessage(), th);
            c.b(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("㎘\u0001"))), new Object[0]);
            c.a(th);
        }
    }
}
