package com.tencent.beacon.base.net.call;

import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.NetException;

/* compiled from: HttpCall.java */
/* loaded from: classes6.dex */
class b implements Callback<BResponse> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Callback f71344a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f71345b;

    b(c cVar, Callback callback) {
        this.f71345b = cVar;
        this.f71344a = callback;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(BResponse bResponse) throws NetException {
        Callback callback = this.f71344a;
        if (callback != null) {
            callback.onResponse(bResponse);
        }
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(com.tencent.beacon.base.net.d dVar) {
        Callback callback = this.f71344a;
        if (callback != null) {
            callback.onFailure(dVar);
        }
    }
}
