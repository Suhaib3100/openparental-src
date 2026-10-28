package com.tencent.beacon.c;

import android.content.SharedPreferences;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.net.b.d;

/* compiled from: Heartbeat.java */
/* loaded from: classes6.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f71388a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.tencent.beacon.a.d.a f71389b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f71390c;

    b(c cVar, String str, com.tencent.beacon.a.d.a aVar) {
        this.f71390c = cVar;
        this.f71388a = str;
        this.f71389b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean c5;
        boolean z4;
        if (d.d()) {
            c5 = this.f71390c.c();
            z4 = this.f71390c.f71393c;
            if (z4 && c5) {
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("\u31ea\u0001") + this.f71388a, new Object[0]);
                a.SharedPreferencesEditorC0995a edit = this.f71389b.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString(ProtectedSandApp.s("\u31eb\u0001"), this.f71388a).commit();
                    edit.putString(ProtectedSandApp.s("\u31ec\u0001"), this.f71388a).commit();
                }
            }
        }
    }
}
