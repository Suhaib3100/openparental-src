package com.tencent.beacon.event;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.event.immediate.Beacon2MsfTransferArgs;
import com.tencent.beacon.event.immediate.BeaconImmediateReportCallback;
import com.tencent.beacon.event.open.BeaconReport;

/* compiled from: EventManager.java */
/* loaded from: classes6.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventBean f71475a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f71476b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f71477c;

    b(e eVar, EventBean eventBean, String str) {
        this.f71477c = eVar;
        this.f71475a = eventBean;
        this.f71476b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            BeaconReport.getInstance().getImmediateReport().reportImmediate(new Beacon2MsfTransferArgs(com.tencent.beacon.event.c.d.a(this.f71475a).toByteArray()), new BeaconImmediateReportCallback(this.f71477c, this.f71475a, this.f71476b));
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㊫\u0001"), new Object[0]);
            com.tencent.beacon.base.util.c.a(th);
            this.f71477c.a(this.f71475a, this.f71476b);
            j.e().a(ProtectedSandApp.s("㊬\u0001"), ProtectedSandApp.s("㊭\u0001"), th);
        }
    }
}
