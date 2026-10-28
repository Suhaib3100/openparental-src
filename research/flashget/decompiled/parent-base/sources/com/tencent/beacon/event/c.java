package com.tencent.beacon.event;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.quic.BeaconQuicReportCallback;
import com.tencent.beacon.event.quic.QuicTransArgs;

/* compiled from: EventManager.java */
/* loaded from: classes6.dex */
class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventBean f71481a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f71482b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f71483c;

    c(e eVar, EventBean eventBean, String str) {
        this.f71483c = eVar;
        this.f71481a = eventBean;
        this.f71482b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            BeaconReport.getInstance().getBeaconQuicReport().reportByQuic(new QuicTransArgs(com.tencent.beacon.base.net.b.b.a(), this.f71481a, com.tencent.beacon.base.net.adapter.g.a().a(com.tencent.beacon.event.c.d.a(this.f71481a))), new BeaconQuicReportCallback(this.f71483c, this.f71481a, this.f71482b));
        } catch (Throwable th) {
            String a5 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("㌂\u0001")));
            com.tencent.beacon.base.util.c.b(a5, new Object[0]);
            com.tencent.beacon.base.util.c.a(th);
            this.f71483c.a(this.f71481a, this.f71482b);
            j.e().a(com.tencent.beacon.d.b.b().c() == 1 ? ProtectedSandApp.s("㌃\u0001") : ProtectedSandApp.s("㌄\u0001"), a5, th);
        }
    }
}
