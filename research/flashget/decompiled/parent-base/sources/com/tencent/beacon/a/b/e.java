package com.tencent.beacon.a.b;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.call.Callback;

/* compiled from: AbstractAttaReport.java */
/* loaded from: classes6.dex */
class e implements Callback<BResponse> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f71037a;

    e(h hVar) {
        this.f71037a = hVar;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(BResponse bResponse) {
        if (bResponse != null) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("⿵\u0001"), ProtectedSandApp.s("⿴\u0001") + bResponse.toString(), new Object[0]);
        }
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(com.tencent.beacon.base.net.d dVar) {
    }
}
