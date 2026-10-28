package com.tencent.beacon.d;

import android.content.SharedPreferences;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.d.a;

/* compiled from: StrategyHolder.java */
/* loaded from: classes6.dex */
class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f71435a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f71436b;

    g(h hVar, String str) {
        this.f71436b = hVar;
        this.f71435a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        a.SharedPreferencesEditorC0995a edit = com.tencent.beacon.a.d.a.a().edit();
        if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
            edit.putString(ProtectedSandApp.s("㈫\u0001"), this.f71435a);
        }
    }
}
