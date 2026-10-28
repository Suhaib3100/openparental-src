package com.tencent.beacon.event.b;

import android.content.Context;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.event.c.g;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.EventType;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DefEventHandler.java */
/* loaded from: classes6.dex */
public class b extends c implements d {

    /* renamed from: b, reason: collision with root package name */
    private boolean f71478b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f71479c;

    public b() {
        com.tencent.beacon.a.a.b.a().a(2, this);
    }

    private boolean c(BeaconEvent beaconEvent) {
        return beaconEvent.getType() == EventType.IMMEDIATE_MSF || beaconEvent.getType() == EventType.IMMEDIATE;
    }

    @Override // com.tencent.beacon.event.b.c
    BeaconEvent a(BeaconEvent beaconEvent) {
        if (this.f71478b && !com.tencent.beacon.base.util.b.a(beaconEvent.getCode())) {
            return beaconEvent;
        }
        com.tencent.beacon.a.c.c c5 = com.tencent.beacon.a.c.c.c();
        Context b5 = c5.b();
        Map<String, String> params = beaconEvent.getParams();
        params.put(ProtectedSandApp.s("㊕\u0001"), i.b());
        params.put(ProtectedSandApp.s("㊖\u0001"), i.c());
        params.put(ProtectedSandApp.s("㊗\u0001"), i.e());
        params.put(ProtectedSandApp.s("㊘\u0001"), e.l().q());
        params.put(ProtectedSandApp.s("㊙\u0001"), "" + com.tencent.beacon.a.c.b.a());
        params.put(ProtectedSandApp.s("㊚\u0001"), com.tencent.beacon.a.c.c.c().d());
        params.put(ProtectedSandApp.s("㊛\u0001"), beaconEvent.getLogidPrefix());
        params.put(ProtectedSandApp.s("㊜\u0001"), c5.i());
        if (!TextUtils.isEmpty(com.tencent.beacon.a.c.c.c().f())) {
            params.put(ProtectedSandApp.s("㊝\u0001"), com.tencent.beacon.a.c.c.c().f());
        }
        if (!TextUtils.isEmpty(com.tencent.beacon.a.c.b.c())) {
            params.put(ProtectedSandApp.s("㊞\u0001"), com.tencent.beacon.a.c.b.c());
        }
        if (TextUtils.isEmpty(i.c())) {
            params.put(ProtectedSandApp.s("㊟\u0001"), i.f());
        }
        String appKey = beaconEvent.getAppKey();
        EventModule eventModule = (EventModule) c5.a(ModuleName.EVENT);
        if (!TextUtils.isEmpty(c5.a(appKey))) {
            params.put(ProtectedSandApp.s("㊠\u0001"), c5.a(appKey));
        }
        if (!TextUtils.isEmpty(eventModule.c(appKey))) {
            params.put(ProtectedSandApp.s("㊡\u0001"), eventModule.c(appKey));
        }
        if (!TextUtils.isEmpty(eventModule.b(appKey))) {
            params.put(ProtectedSandApp.s("㊢\u0001"), eventModule.b(appKey));
        }
        params.put(ProtectedSandApp.s("㊣\u0001"), String.valueOf(com.tencent.beacon.base.util.b.d()));
        params.put(ProtectedSandApp.s("㊦\u0001"), c(beaconEvent) ? ProtectedSandApp.s("㊤\u0001") : ProtectedSandApp.s("㊥\u0001"));
        String s4 = ProtectedSandApp.s("㊧\u0001");
        if (!params.containsKey(s4)) {
            if (TextUtils.isEmpty(this.f71479c)) {
                this.f71479c = com.tencent.beacon.a.c.b.a(b5);
            }
            params.put(s4, this.f71479c);
        }
        params.put(ProtectedSandApp.s("㊨\u0001"), g.a(b5, appKey).a(beaconEvent.getCode(), beaconEvent.getType()));
        Map<String, String> a5 = eventModule.a(appKey);
        if (a5 != null) {
            params.putAll(a5);
        }
        beaconEvent.setParams(params);
        return beaconEvent;
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        HashMap hashMap;
        if (cVar.f71020a == 2 && (hashMap = (HashMap) cVar.f71021b.get(ProtectedSandApp.s("㊩\u0001"))) != null) {
            this.f71478b = com.tencent.beacon.base.util.b.a((String) hashMap.get(ProtectedSandApp.s("㊪\u0001")), this.f71478b);
        }
    }
}
