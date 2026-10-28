package com.tencent.beacon.base.net.call;

import com.tencent.beacon.base.net.BResponse;

/* compiled from: HttpCall.java */
/* loaded from: classes6.dex */
public class c implements a<BResponse> {

    /* renamed from: a, reason: collision with root package name */
    private HttpRequestEntity f71346a;

    public c(HttpRequestEntity httpRequestEntity) {
        this.f71346a = httpRequestEntity;
    }

    public void a(Callback<BResponse> callback) {
        com.tencent.beacon.base.net.c.d().a(this.f71346a, new b(this, callback));
    }
}
