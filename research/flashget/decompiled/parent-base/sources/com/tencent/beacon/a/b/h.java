package com.tencent.beacon.a.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.call.Callback;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AbstractAttaReport.java */
/* loaded from: classes6.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f71044a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private boolean f71045b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71046c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Object f71047d = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, String str2, Throwable th) {
        a(str, str2, th, true, new e(this));
    }

    private synchronized void e() {
        if (this.f71045b) {
            return;
        }
        Map<String, String> map = f71044a;
        map.put(ProtectedSandApp.s("〇\u0001"), b());
        map.put(ProtectedSandApp.s("〈\u0001"), c());
        map.put(ProtectedSandApp.s("〉\u0001"), "");
        map.put(ProtectedSandApp.s("《\u0001"), ProtectedSandApp.s("》\u0001"));
        map.put(ProtectedSandApp.s("「\u0001"), com.tencent.beacon.a.c.e.l().d());
        map.put(ProtectedSandApp.s("『\u0001"), Build.BOARD + ProtectedSandApp.s("」\u0001") + com.tencent.beacon.a.c.g.e().h());
        map.put(ProtectedSandApp.s("』\u0001"), com.tencent.beacon.a.c.e.l().t());
        map.put(ProtectedSandApp.s("【\u0001"), "");
        map.put(ProtectedSandApp.s("】\u0001"), "");
        map.put(ProtectedSandApp.s("〒\u0001"), com.tencent.beacon.a.c.b.a());
        map.put(ProtectedSandApp.s("〓\u0001"), com.tencent.beacon.a.c.c.c().i());
        map.put(ProtectedSandApp.s("〔\u0001"), com.tencent.beacon.a.c.c.c().e());
        map.put(ProtectedSandApp.s("〕\u0001"), "");
        map.put(ProtectedSandApp.s("〖\u0001"), com.tencent.beacon.a.c.b.b());
        this.f71045b = true;
    }

    abstract String b();

    abstract String c();

    public boolean d() {
        if (this.f71046c) {
            return true;
        }
        if (!com.tencent.beacon.d.b.b().p()) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〚\u0001"), new Object[0]);
            return false;
        }
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〛\u0001"), new Object[0]);
        if (com.tencent.beacon.base.util.c.a()) {
            return false;
        }
        return com.tencent.beacon.base.util.b.a(100);
    }

    public void a(boolean z4) {
        this.f71046c = z4;
    }

    public synchronized void a(String str, String str2) {
        a(str, str2, null);
    }

    public synchronized void a(String str, String str2, Throwable th) {
        a(str, str2, th, false, new c(this, str, str2, th));
    }

    public synchronized void a(String str, String str2, Throwable th, boolean z4, Callback<BResponse> callback) {
        try {
            if (d()) {
                if (!this.f71045b) {
                    e();
                }
                if (TextUtils.isEmpty(str)) {
                    com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〗\u0001"), new Object[0]);
                } else {
                    b.a().a(new d(this, str, str2, th, z4, callback));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(Context context, String str, String str2, String str3) {
        if (com.tencent.beacon.base.util.b.b(100)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〗\u0001"), new Object[0]);
        } else if (TextUtils.isEmpty(str)) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〘\u0001"), new Object[0]);
        } else if (context == null) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〙\u0001"), new Object[0]);
        } else {
            b.a().a(new g(this, str, str2, str3, context));
        }
    }
}
