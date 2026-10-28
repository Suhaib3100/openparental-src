package com.tencent.beacon.event.b;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.EventType;
import java.util.Map;

/* compiled from: DTEventHandler.java */
/* loaded from: classes6.dex */
public class a extends c {
    @Override // com.tencent.beacon.event.b.c
    protected BeaconEvent a(BeaconEvent beaconEvent) {
        EventType type = beaconEvent.getType();
        if (type == EventType.DT_REALTIME || type == EventType.DT_NORMAL) {
            Map<String, String> params = beaconEvent.getParams();
            e l4 = e.l();
            g e4 = g.e();
            params.put(ProtectedSandApp.s("㊒\u0001"), "" + e4.c());
            params.put(ProtectedSandApp.s("㊓\u0001"), "" + e4.g());
            params.put(ProtectedSandApp.s("㊔\u0001"), "" + l4.o());
            beaconEvent.setParams(params);
        }
        return beaconEvent;
    }
}
