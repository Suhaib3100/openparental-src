package com.tencent.beacon.a.b;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.HttpMethod;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.HttpRequestEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AbstractAttaReport.java */
/* loaded from: classes6.dex */
class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f71031a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f71032b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f71033c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f71034d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Callback f71035e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f71036f;

    d(h hVar, String str, String str2, Throwable th, boolean z4, Callback callback) {
        this.f71036f = hVar;
        this.f71031a = str;
        this.f71032b = str2;
        this.f71033c = th;
        this.f71034d = z4;
        this.f71035e = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Map map;
        obj = this.f71036f.f71047d;
        synchronized (obj) {
            map = h.f71044a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(ProtectedSandApp.s("\u2fec\u0001"), this.f71031a);
            linkedHashMap.put(ProtectedSandApp.s("\u2fed\u0001"), this.f71032b);
            linkedHashMap.put(ProtectedSandApp.s("\u2fee\u0001"), com.tencent.beacon.base.util.b.a(this.f71033c));
            linkedHashMap.put(ProtectedSandApp.s("\u2fef\u0001"), String.valueOf(Math.random()));
            com.tencent.beacon.base.net.c.d().a(HttpRequestEntity.builder().b(this.f71034d ? ProtectedSandApp.s("⿰\u0001") : ProtectedSandApp.s("⿱\u0001")).a(ProtectedSandApp.s("⿲\u0001")).a(linkedHashMap).a(HttpMethod.POST).a()).a(this.f71035e);
            com.tencent.beacon.base.util.c.d(ProtectedSandApp.s("⿳\u0001"), this.f71031a, this.f71032b, com.tencent.beacon.base.util.b.a(this.f71033c));
        }
    }
}
