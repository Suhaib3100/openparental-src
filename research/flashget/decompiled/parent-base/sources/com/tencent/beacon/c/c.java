package com.tencent.beacon.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.module.StatModule;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Heartbeat.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f71391a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f71392b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71393c = false;

    public c(Context context) {
        this.f71391a = context;
        this.f71392b = com.tencent.beacon.a.c.b.f(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return ((StatModule) com.tencent.beacon.a.c.c.c().a(ModuleName.STAT)).b(b());
    }

    private Map<String, String> b() {
        this.f71393c = com.tencent.beacon.a.c.b.f71072d;
        HashMap hashMap = new HashMap(8);
        e l4 = e.l();
        g e4 = g.e();
        hashMap.put(ProtectedSandApp.s("\u31ed\u0001"), l4.q());
        hashMap.put(ProtectedSandApp.s("ㇰ\u0001"), com.tencent.beacon.a.c.b.f(this.f71391a) ? ProtectedSandApp.s("\u31ee\u0001") : ProtectedSandApp.s("\u31ef\u0001"));
        hashMap.put(ProtectedSandApp.s("ㇱ\u0001"), "" + com.tencent.beacon.a.c.b.b(this.f71391a));
        hashMap.put(ProtectedSandApp.s("ㇴ\u0001"), this.f71393c ? ProtectedSandApp.s("ㇲ\u0001") : ProtectedSandApp.s("ㇳ\u0001"));
        hashMap.put(ProtectedSandApp.s("ㇵ\u0001"), e4.j());
        hashMap.put(ProtectedSandApp.s("ㇶ\u0001"), e4.k());
        return hashMap;
    }

    public void a(com.tencent.beacon.d.b bVar) {
        String e4 = com.tencent.beacon.base.util.b.e();
        com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
        String string = a5.getString(ProtectedSandApp.s("ㇻ\u0001"), "");
        String string2 = a5.getString(ProtectedSandApp.s("ㇷ\u0001"), "");
        if (e4.equals(string) || string2.equals(e4)) {
            com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("ㇿ\u0001"), new Object[0]);
            return;
        }
        String s4 = ProtectedSandApp.s("ㇼ\u0001");
        if (bVar.a(s4)) {
            com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("ㇽ\u0001"), new Object[0]);
        } else if (bVar.b(s4)) {
            com.tencent.beacon.a.b.b.a().a(new b(this, e4, a5));
        } else {
            com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("ㇾ\u0001"), new Object[0]);
        }
    }

    public void a() {
        com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
        String s4 = ProtectedSandApp.s("ㇷ\u0001");
        if (!com.tencent.beacon.base.util.b.e().equals(a5.getString(s4, ""))) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㇸ\u0001"), new Object[0]);
            if (c()) {
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㇹ\u0001"), new Object[0]);
                a.SharedPreferencesEditorC0995a edit = a5.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString(s4, com.tencent.beacon.base.util.b.e()).apply();
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("ㇺ\u0001"), new Object[0]);
    }
}
