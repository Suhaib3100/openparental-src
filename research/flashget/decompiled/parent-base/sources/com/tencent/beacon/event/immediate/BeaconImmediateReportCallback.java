package com.tencent.beacon.event.immediate;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.call.e;
import com.tencent.beacon.base.net.d;
import com.tencent.beacon.base.util.b;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.pack.ResponsePackageV2;
import com.tencent.beacon.pack.a;

/* loaded from: classes6.dex */
public class BeaconImmediateReportCallback implements e<BeaconTransferResult> {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.beacon.event.e f71552a;

    /* renamed from: b, reason: collision with root package name */
    private EventBean f71553b;

    /* renamed from: c, reason: collision with root package name */
    private String f71554c;

    /* renamed from: d, reason: collision with root package name */
    private long f71555d = b.c();

    public BeaconImmediateReportCallback(com.tencent.beacon.event.e eVar, EventBean eventBean, String str) {
        this.f71552a = eVar;
        this.f71553b = eventBean;
        this.f71554c = str;
    }

    private void a(d dVar) {
        c.a(ProtectedSandApp.s("㌱\u0001"), dVar.toString(), new Object[0]);
        j.e().a(dVar.f71357b, dVar.f71359d, dVar.f71360e);
        this.f71552a.a(this.f71553b, this.f71554c);
    }

    public void onResponse(BeaconTransferResult beaconTransferResult) {
        if (beaconTransferResult == null) {
            a(new d(RequestType.LONG_CONNECTION.name(), ProtectedSandApp.s("㌳\u0001"), -1, ProtectedSandApp.s("㌲\u0001")));
            return;
        }
        boolean z4 = beaconTransferResult.getCode() == 0 && beaconTransferResult.getBizCode() == 0;
        c.a(ProtectedSandApp.s("㌱\u0001"), ProtectedSandApp.s("㌴\u0001"), beaconTransferResult.toString(), this.f71553b.getEventCode(), this.f71554c);
        if (!z4) {
            a(new d(RequestType.LONG_CONNECTION.name(), ProtectedSandApp.s("㌶\u0001"), beaconTransferResult.getCode(), c.c(ProtectedSandApp.s("㌵\u0001"), beaconTransferResult.toString())));
            return;
        }
        byte[] bizBuffer = beaconTransferResult.getBizBuffer();
        ResponsePackageV2 responsePackageV2 = new ResponsePackageV2();
        try {
            responsePackageV2.readFrom(new a(bizBuffer));
            com.tencent.beacon.base.net.b.d.a(this.f71555d, responsePackageV2.serverTime, responsePackageV2.srcGatewayIp);
        } catch (Throwable th) {
            c.a(th);
            a(new d(RequestType.LONG_CONNECTION.name(), ProtectedSandApp.s("㌶\u0001"), beaconTransferResult.getCode(), th.getMessage(), th));
        }
    }
}
