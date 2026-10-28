package com.tencent.beacon.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.module.StrategyModule;
import com.tencent.beacon.pack.CommonStrategy;
import com.tencent.beacon.pack.ModuleStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: StrategyQueryTask.java */
/* loaded from: classes6.dex */
public class i implements Runnable, Callback<byte[]> {

    /* renamed from: b, reason: collision with root package name */
    private final StrategyModule f71447b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f71449d;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f71448c = false;

    /* renamed from: a, reason: collision with root package name */
    private final Context f71446a = com.tencent.beacon.a.c.c.c().b();

    public i(StrategyModule strategyModule) {
        this.f71447b = strategyModule;
    }

    private void c() {
        f();
        this.f71448c = false;
    }

    private void d() {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㈵\u0001"), Boolean.FALSE);
        com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(7, hashMap));
    }

    private void e() {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㈶\u0001"), new Object[0]);
        com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(10));
    }

    private void f() {
        long b5 = this.f71447b.a().b() * 60000;
        com.tencent.beacon.a.b.b.a().a(b5, this);
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㈷\u0001"), Long.valueOf(b5));
    }

    private void g() {
        if (k.b() || k.c()) {
            com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("㉈\u0001"), new Object[0]);
            this.f71447b.a(true);
        } else {
            com.tencent.beacon.a.c.e l4 = com.tencent.beacon.a.c.e.l();
            com.tencent.beacon.a.c.g e4 = com.tencent.beacon.a.c.g.e();
            com.tencent.beacon.base.net.c.d().b(JceRequestEntity.builder().a(RequestType.STRATEGY).a(100).b(101).a(com.tencent.beacon.a.c.c.c().e()).b(com.tencent.beacon.base.net.b.b.b(false)).a(com.tencent.beacon.base.net.b.b.b(true), 8081).b(ProtectedSandApp.s("㈸\u0001"), com.tencent.beacon.a.c.c.c().k()).b(ProtectedSandApp.s("㈹\u0001"), e4.b()).b(ProtectedSandApp.s("㈺\u0001"), e4.d()).b(ProtectedSandApp.s("㈻\u0001"), e4.f()).b(ProtectedSandApp.s("㈼\u0001"), l4.d()).b(ProtectedSandApp.s("㈽\u0001"), com.tencent.beacon.a.c.c.c().a(com.tencent.beacon.a.c.c.c().e())).b(ProtectedSandApp.s("㈾\u0001"), l4.p()).b(ProtectedSandApp.s("㈿\u0001"), l4.q()).b(ProtectedSandApp.s("㉂\u0001"), com.tencent.beacon.a.c.b.f(this.f71446a) ? ProtectedSandApp.s("㉀\u0001") : ProtectedSandApp.s("㉁\u0001")).b(ProtectedSandApp.s("㉃\u0001"), com.tencent.beacon.a.c.b.c(this.f71446a)).b(ProtectedSandApp.s("㉄\u0001"), String.valueOf(com.tencent.beacon.a.c.b.b(this.f71446a))).b(ProtectedSandApp.s("㉇\u0001"), com.tencent.beacon.a.c.b.f71072d ? ProtectedSandApp.s("㉅\u0001") : ProtectedSandApp.s("㉆\u0001")).a(com.tencent.beacon.a.c.i.d()).a()).b(this);
        }
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResponse(byte[] bArr) {
        a(bArr, true);
        this.f71447b.a(true);
        c();
    }

    public void b() {
        byte[] bArr;
        try {
            try {
                String string = com.tencent.beacon.a.d.a.a().getString(ProtectedSandApp.s("㉊\u0001"), "");
                if (TextUtils.isEmpty(string)) {
                    j a5 = k.a(this.f71446a, 101);
                    bArr = a5 != null ? a5.f71452c : null;
                } else {
                    bArr = Base64.decode(string, 0);
                }
                if (bArr != null) {
                    a(bArr, false);
                } else {
                    com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉎\u0001"), new Object[0]);
                }
            } catch (Exception e4) {
                com.tencent.beacon.base.util.c.a(e4);
            }
            e();
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    @Override // com.tencent.beacon.base.net.call.Callback
    public void onFailure(com.tencent.beacon.base.net.d dVar) {
        c();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71448c = true;
        if (this.f71447b.a().e()) {
            return;
        }
        g();
    }

    private void c(e eVar, b bVar, ModuleStrategy moduleStrategy) {
        ArrayList<String> arrayList = moduleStrategy.sampleEvent;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㈴\u0001"), Byte.valueOf(moduleStrategy.mId));
        this.f71449d = true;
        eVar.b(com.tencent.beacon.base.util.b.a(moduleStrategy.sampleEvent));
        bVar.b(com.tencent.beacon.base.util.b.a(moduleStrategy.sampleEvent));
    }

    public void a(byte[] bArr, boolean z4) {
        try {
            CommonStrategy commonStrategy = new CommonStrategy();
            commonStrategy.readFrom(new com.tencent.beacon.pack.a(bArr));
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉉\u0001"), commonStrategy);
            if (a(commonStrategy, a.a()) && z4) {
                a.SharedPreferencesEditorC0995a edit = com.tencent.beacon.a.d.a.a().edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString(ProtectedSandApp.s("㉊\u0001"), Base64.encodeToString(bArr, 0));
                }
            }
            if (z4) {
                k.d();
            }
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㉋\u0001"), new Object[0]);
        }
    }

    private void b(e eVar, b bVar, ModuleStrategy moduleStrategy) {
        ArrayList<String> arrayList = moduleStrategy.preventEventCode;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㈳\u0001"), Byte.valueOf(moduleStrategy.mId));
        this.f71449d = true;
        eVar.a(com.tencent.beacon.base.util.b.a(moduleStrategy.preventEventCode));
        bVar.a(com.tencent.beacon.base.util.b.a(moduleStrategy.preventEventCode));
    }

    protected boolean a(CommonStrategy commonStrategy, a aVar) {
        if (commonStrategy == null || aVar == null) {
            return false;
        }
        String a5 = com.tencent.beacon.base.net.b.b.a(commonStrategy.url);
        if (!a5.equals(com.tencent.beacon.base.net.b.b.b(true))) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉌\u0001"), commonStrategy.url);
            this.f71449d = true;
            com.tencent.beacon.base.net.b.b.d(a5);
        }
        if (commonStrategy.queryInterval != aVar.b()) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㉍\u0001"), Integer.valueOf(commonStrategy.queryInterval));
            this.f71449d = true;
            aVar.a(commonStrategy.queryInterval);
        }
        if (a(commonStrategy.moduleList)) {
            this.f71449d = true;
        }
        if (a(commonStrategy.cloudParas, aVar)) {
            this.f71449d = true;
        }
        return this.f71449d;
    }

    boolean a(ArrayList<ModuleStrategy> arrayList) {
        e d5 = this.f71447b.a().d();
        if (arrayList == null) {
            d5.a(false);
            d();
            return false;
        }
        b b5 = this.f71447b.b();
        Iterator<ModuleStrategy> it = arrayList.iterator();
        while (it.hasNext()) {
            ModuleStrategy next = it.next();
            if (next.mId == d5.b()) {
                a(d5, next);
                a(next);
                a(d5, b5, next);
                b(d5, b5, next);
                c(d5, b5, next);
            }
        }
        return this.f71449d;
    }

    private void a(e eVar, b bVar, ModuleStrategy moduleStrategy) {
        if (moduleStrategy.detail != null) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㈰\u0001"), Byte.valueOf(moduleStrategy.mId));
            eVar.a(moduleStrategy.detail);
            bVar.a(moduleStrategy.detail);
            this.f71449d = true;
        }
    }

    private void a(e eVar, ModuleStrategy moduleStrategy) {
        boolean z4 = moduleStrategy.onOff == 1;
        if (eVar.c() != z4) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㈱\u0001"), Byte.valueOf(moduleStrategy.mId), Boolean.valueOf(z4));
            eVar.a(z4);
            this.f71449d = true;
        }
    }

    private void a(ModuleStrategy moduleStrategy) {
        String a5 = com.tencent.beacon.base.net.b.b.a(moduleStrategy.url);
        if (com.tencent.beacon.base.net.b.b.a(true).equals(a5)) {
            return;
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㈲\u0001"), Byte.valueOf(moduleStrategy.mId), moduleStrategy.url);
        com.tencent.beacon.base.net.b.b.b(a5);
        this.f71449d = true;
    }

    private boolean a(Map<String, String> map, a aVar) {
        if (aVar == null || map == null) {
            return false;
        }
        aVar.a(map);
        return true;
    }

    public boolean a() {
        return this.f71448c;
    }
}
