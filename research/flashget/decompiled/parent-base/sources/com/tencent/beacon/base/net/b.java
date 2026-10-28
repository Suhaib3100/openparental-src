package com.tencent.beacon.base.net;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.HttpRequestEntity;

/* compiled from: BeaconNet.java */
/* loaded from: classes6.dex */
class b implements Callback<BResponse> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HttpRequestEntity f71157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callback f71158b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f71159c;

    b(c cVar, HttpRequestEntity httpRequestEntity, Callback callback) {
        this.f71159c = cVar;
        this.f71157a = httpRequestEntity;
        this.f71158b = callback;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(BResponse bResponse) {
        String s4 = ProtectedSandApp.s("ㅠ\u0001");
        String s5 = ProtectedSandApp.s("ㅡ\u0001");
        try {
            StringBuilder sb = new StringBuilder(s4);
            sb.append(this.f71157a.tag());
            sb.append(ProtectedSandApp.s("ㅢ\u0001"));
            com.tencent.beacon.base.util.c.a(s5, sb.toString(), new Object[0]);
            this.f71158b.onResponse(bResponse);
            this.f71159c.h();
        } catch (Exception e4) {
            onFailure(new d(this.f71157a.tag(), ProtectedSandApp.s("ㅣ\u0001"), 200, e4.getMessage(), e4));
        }
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(d dVar) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅡ\u0001"), ProtectedSandApp.s("ㅠ\u0001") + dVar.toString(), new Object[0]);
        this.f71159c.a(dVar);
        this.f71158b.onFailure(dVar);
        this.f71159c.h();
    }
}
