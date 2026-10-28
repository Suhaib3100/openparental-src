package com.tencent.beacon.a.b;

import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.call.Callback;

/* compiled from: AbstractAttaReport.java */
/* loaded from: classes6.dex */
class f implements Callback<BResponse> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f71038a;

    f(g gVar) {
        this.f71038a = gVar;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(BResponse bResponse) {
        String str = this.f71038a.f71040b;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(com.tencent.beacon.base.net.d dVar) {
        String str = this.f71038a.f71040b;
        String str2 = dVar.f71359d;
    }
}
