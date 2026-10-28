package com.tencent.beacon.c.a;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.module.StatModule;
import java.util.Map;

/* compiled from: LifecycleCallbacks.java */
/* loaded from: classes6.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f71374a;

    a(c cVar) {
        this.f71374a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        StatModule statModule;
        Map<String, String> map5;
        e l4 = e.l();
        g e4 = g.e();
        map = this.f71374a.f71383g;
        map.put(ProtectedSandApp.s("㇕\u0001"), l4.q());
        map2 = this.f71374a.f71383g;
        map2.put(ProtectedSandApp.s("㇘\u0001"), com.tencent.beacon.a.c.b.f71072d ? ProtectedSandApp.s("㇖\u0001") : ProtectedSandApp.s("㇗\u0001"));
        map3 = this.f71374a.f71383g;
        map3.put(ProtectedSandApp.s("㇙\u0001"), e4.j());
        map4 = this.f71374a.f71383g;
        map4.put(ProtectedSandApp.s("㇚\u0001"), e4.k());
        statModule = this.f71374a.f71384h;
        map5 = this.f71374a.f71383g;
        statModule.a(map5);
    }
}
