package com.tencent.beacon.a.b;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.HttpMethod;
import com.tencent.beacon.base.net.call.HttpRequestEntity;
import java.util.LinkedHashMap;

/* compiled from: AbstractAttaReport.java */
/* loaded from: classes6.dex */
class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f71039a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f71040b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f71041c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f71042d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f71043e;

    g(h hVar, String str, String str2, String str3, Context context) {
        this.f71043e = hVar;
        this.f71039a = str;
        this.f71040b = str2;
        this.f71041c = str3;
        this.f71042d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        obj = this.f71043e.f71047d;
        synchronized (obj) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(ProtectedSandApp.s("⿶\u0001"), this.f71043e.b());
            linkedHashMap.put(ProtectedSandApp.s("⿷\u0001"), this.f71043e.c());
            linkedHashMap.put(ProtectedSandApp.s("⿸\u0001"), ProtectedSandApp.s("⿹\u0001"));
            linkedHashMap.put(ProtectedSandApp.s("⿺\u0001"), "");
            linkedHashMap.put(ProtectedSandApp.s("⿻\u0001"), "");
            linkedHashMap.put(ProtectedSandApp.s("\u2ffc\u0001"), "");
            linkedHashMap.put(ProtectedSandApp.s("\u2ffd\u0001"), "");
            linkedHashMap.put(ProtectedSandApp.s("\u2ffe\u0001"), "");
            linkedHashMap.put(ProtectedSandApp.s("\u2fff\u0001"), com.tencent.beacon.a.c.c.c().i());
            linkedHashMap.put(ProtectedSandApp.s("\u3000\u0001"), this.f71039a);
            linkedHashMap.put(ProtectedSandApp.s("、\u0001"), this.f71040b);
            linkedHashMap.put(ProtectedSandApp.s("。\u0001"), this.f71041c);
            linkedHashMap.put(ProtectedSandApp.s("〃\u0001"), this.f71042d.getPackageName());
            linkedHashMap.put(ProtectedSandApp.s("〄\u0001"), String.valueOf(Math.random()));
            com.tencent.beacon.base.net.c.d().a(HttpRequestEntity.builder().b(ProtectedSandApp.s("々\u0001")).a(ProtectedSandApp.s("〆\u0001")).a(linkedHashMap).a(HttpMethod.POST).a()).a(new f(this));
        }
    }
}
