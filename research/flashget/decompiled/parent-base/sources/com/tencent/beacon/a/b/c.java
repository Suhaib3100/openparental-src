package com.tencent.beacon.a.b;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.call.Callback;

/* compiled from: AbstractAttaReport.java */
/* loaded from: classes6.dex */
class c implements Callback<BResponse> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f71027a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f71028b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f71029c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f71030d;

    c(h hVar, String str, String str2, Throwable th) {
        this.f71030d = hVar;
        this.f71027a = str;
        this.f71028b = str2;
        this.f71029c = th;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(BResponse bResponse) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("\u2feb\u0001"), ProtectedSandApp.s("\u2fea\u0001") + bResponse.toString(), new Object[0]);
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(com.tencent.beacon.base.net.d dVar) {
        this.f71030d.b(this.f71027a, this.f71028b, this.f71029c);
    }
}
