package com.tencent.beacon.event;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.base.net.call.Callback;

/* compiled from: EventManager.java */
/* loaded from: classes6.dex */
class d implements Callback<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventBean f71521a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f71522b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f71523c;

    d(e eVar, EventBean eventBean, String str) {
        this.f71523c = eVar;
        this.f71521a = eventBean;
        this.f71522b = str;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(byte[] bArr) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㌅\u0001"), ProtectedSandApp.s("㌆\u0001"), this.f71521a.getEventCode(), this.f71522b);
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(com.tencent.beacon.base.net.d dVar) {
        com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㌇\u0001"), dVar.toString());
        j.e().a(ProtectedSandApp.s("㌈\u0001"), dVar.toString());
        this.f71523c.c(this.f71522b, this.f71521a);
    }
}
