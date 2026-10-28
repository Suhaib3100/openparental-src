package com.tencent.beacon.event;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;

/* compiled from: EventManager.java */
/* loaded from: classes6.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventBean f71458a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f71459b;

    a(e eVar, EventBean eventBean) {
        this.f71459b = eVar;
        this.f71458a = eventBean;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.beacon.event.a.a aVar;
        com.tencent.beacon.event.a.a aVar2;
        aVar = this.f71459b.f71525b;
        boolean a5 = aVar.a(this.f71458a.getEventType());
        String s4 = ProtectedSandApp.s("㊋\u0001");
        if (a5) {
            j.e().a(ProtectedSandApp.s("㊎\u0001"), ProtectedSandApp.s("㊌\u0001") + com.tencent.beacon.event.c.d.a(this.f71458a.getEventType()) + ProtectedSandApp.s("㊍\u0001"));
            com.tencent.beacon.base.util.c.a(s4, 2, ProtectedSandApp.s("㊏\u0001"), this.f71458a.getEventCode());
            return;
        }
        aVar2 = this.f71459b.f71525b;
        boolean a6 = aVar2.a(this.f71458a);
        com.tencent.beacon.base.util.c.a(s4, 2, ProtectedSandApp.s("㊐\u0001"), this.f71458a.getEventCode(), Boolean.valueOf(a6));
        if (a6) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㊑\u0001"), new Object[0]);
            this.f71459b.a(0);
        }
    }
}
