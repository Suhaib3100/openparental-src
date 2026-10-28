package com.tencent.beacon.event;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import java.util.HashSet;
import java.util.Set;

/* compiled from: EventReportCallback.java */
/* loaded from: classes6.dex */
final class g implements Callback<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Long> f71532a;

    /* renamed from: b, reason: collision with root package name */
    private final String f71533b;

    /* renamed from: c, reason: collision with root package name */
    private final String f71534c;

    /* renamed from: d, reason: collision with root package name */
    private long f71535d = com.tencent.beacon.base.util.b.c();

    /* renamed from: e, reason: collision with root package name */
    private h f71536e;

    /* renamed from: f, reason: collision with root package name */
    private String f71537f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.beacon.event.a.a f71538g;

    g(h hVar, String str, com.tencent.beacon.event.a.a aVar, Set<Long> set, String str2) {
        this.f71536e = hVar;
        this.f71537f = str;
        this.f71538g = aVar;
        this.f71532a = new HashSet(set);
        this.f71533b = android.support.v4.media.d.a(ProtectedSandApp.s("㌙\u0001"), str, ProtectedSandApp.s("㌚\u0001"));
        this.f71534c = str2;
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(com.tencent.beacon.base.net.d dVar) {
        com.tencent.beacon.base.util.c.a(this.f71533b, 3, ProtectedSandApp.s("㌜\u0001"), dVar.toString(), this.f71534c);
        this.f71536e.a(this.f71532a);
        if (dVar.f71357b.equals(ProtectedSandApp.s("㌝\u0001"))) {
            this.f71536e.a();
            com.tencent.beacon.a.b.b.a().a(this.f71536e);
        }
        com.tencent.beacon.base.net.c.d().e();
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(byte[] bArr) {
        boolean a5 = ((EventModule) com.tencent.beacon.a.c.c.c().a(ModuleName.EVENT)).d().a(new f(this, com.tencent.beacon.base.util.b.c() - this.f71535d));
        com.tencent.beacon.base.util.c.a(this.f71533b, 3, ProtectedSandApp.s("㌛\u0001"), Boolean.valueOf(a5));
        if (this.f71532a.size() >= this.f71536e.b()) {
            com.tencent.beacon.a.b.b.a().a(this.f71536e);
        }
        this.f71536e.c();
        com.tencent.beacon.base.net.c.d().a(0);
    }
}
