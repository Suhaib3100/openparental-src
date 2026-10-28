package com.tencent.beacon.base.net;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;

/* compiled from: BeaconNet.java */
/* loaded from: classes6.dex */
class a implements Callback<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JceRequestEntity f71137a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f71138b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Callback f71139c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f71140d;

    a(c cVar, JceRequestEntity jceRequestEntity, boolean z4, Callback callback) {
        this.f71140d = cVar;
        this.f71137a = jceRequestEntity;
        this.f71138b = z4;
        this.f71139c = callback;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(byte[] bArr) {
        String s4 = ProtectedSandApp.s("ピ\u0001");
        String s5 = ProtectedSandApp.s("フ\u0001");
        String s6 = ProtectedSandApp.s("ブ\u0001");
        if (bArr == null || bArr.length <= 0) {
            onFailure(new d(this.f71137a.getType().name(), this.f71138b ? ProtectedSandApp.s("ボ\u0001") : ProtectedSandApp.s("ポ\u0001"), 200, ProtectedSandApp.s("マ\u0001"), null));
            return;
        }
        try {
            StringBuilder sb = new StringBuilder(s6);
            sb.append(this.f71137a.getType());
            sb.append(ProtectedSandApp.s("プ\u0001"));
            com.tencent.beacon.base.util.c.a(s4, sb.toString(), new Object[0]);
            com.tencent.beacon.base.util.c.a(s4, s5.concat(this.f71138b ? ProtectedSandApp.s("ヘ\u0001") : ProtectedSandApp.s("ベ\u0001")), new Object[0]);
            this.f71139c.onResponse(bArr);
            this.f71140d.h();
        } catch (Exception e4) {
            onFailure(new d(this.f71137a.getType().name(), this.f71138b ? ProtectedSandApp.s("ペ\u0001") : ProtectedSandApp.s("ホ\u0001"), 200, e4.getMessage(), e4));
        }
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(d dVar) {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ピ\u0001"), ProtectedSandApp.s("ブ\u0001") + dVar.toString(), new Object[0]);
        this.f71140d.a(dVar);
        this.f71139c.onFailure(dVar);
        this.f71140d.h();
    }
}
