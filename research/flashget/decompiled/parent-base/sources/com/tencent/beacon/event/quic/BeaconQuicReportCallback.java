package com.tencent.beacon.event.quic;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.a.c;
import com.tencent.beacon.base.net.d;
import com.tencent.beacon.base.util.b;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.e;
import com.tencent.beacon.pack.ResponsePackageV2;
import com.tencent.beacon.pack.SocketResponsePackage;
import com.tencent.beacon.pack.a;

/* loaded from: classes6.dex */
public class BeaconQuicReportCallback implements QuicRequestCallback<BeaconQuicReportResult> {
    private static final String TAG = ProtectedSandApp.s("㎙\u0001");
    private final EventBean eventBean;
    private final e eventManager;
    private final boolean isQuic;
    private final String logID;
    private final c<byte[], SocketResponsePackage> responseConverter = new com.tencent.beacon.base.net.a.e();
    private final long startTime = b.c();

    public BeaconQuicReportCallback(e eVar, EventBean eventBean, String str) {
        this.eventManager = eVar;
        this.eventBean = eventBean;
        this.logID = str;
        this.isQuic = com.tencent.beacon.d.b.b().c() == 1;
    }

    private byte[] analyzeData(byte[] bArr) {
        if (!this.isQuic) {
            return b.a(bArr, 2);
        }
        return this.responseConverter.a(b.a(bArr, 2)).body;
    }

    private void onFailure(d dVar) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㎙\u0001"), dVar.toString(), new Object[0]);
        j.e().a(dVar.f71357b, dVar.f71359d, dVar.f71360e);
        this.eventManager.a(this.eventBean, this.logID);
    }

    @Override // com.tencent.beacon.event.quic.QuicRequestCallback
    public void onResponse(BeaconQuicReportResult beaconQuicReportResult) {
        String s4 = ProtectedSandApp.s("㎚\u0001");
        String s5 = ProtectedSandApp.s("㎛\u0001");
        if (beaconQuicReportResult == null) {
            String name = RequestType.QUIC.name();
            if (this.isQuic) {
                s4 = s5;
            }
            onFailure(new d(name, s4, -1, ProtectedSandApp.s("㎜\u0001")));
            return;
        }
        boolean z4 = beaconQuicReportResult.getCode() == 0;
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㎙\u0001"), ProtectedSandApp.s("㎝\u0001"), beaconQuicReportResult.toString(), this.eventBean.getEventCode(), this.logID);
        if (!z4) {
            String c5 = com.tencent.beacon.base.util.c.c(ProtectedSandApp.s("㎞\u0001"), beaconQuicReportResult.toString());
            String name2 = RequestType.QUIC.name();
            if (this.isQuic) {
                s4 = s5;
            }
            onFailure(new d(name2, s4, beaconQuicReportResult.getCode(), c5));
            return;
        }
        try {
            byte[] analyzeData = analyzeData(beaconQuicReportResult.getResBuffer());
            ResponsePackageV2 responsePackageV2 = new ResponsePackageV2();
            responsePackageV2.readFrom(new a(analyzeData));
            com.tencent.beacon.base.net.b.d.a(this.startTime, responsePackageV2.serverTime, responsePackageV2.srcGatewayIp);
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            onFailure(new d(RequestType.QUIC.name(), this.isQuic ? ProtectedSandApp.s("㎟\u0001") : ProtectedSandApp.s("㎠\u0001"), beaconQuicReportResult.getCode(), th.getMessage(), th));
        }
    }
}
