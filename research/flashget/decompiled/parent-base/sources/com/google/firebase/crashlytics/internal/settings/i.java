package com.google.firebase.crashlytics.internal.settings;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final h0 f59545a;

    i(h0 h0Var) {
        this.f59545a = h0Var;
    }

    private static j a(int i4) {
        if (i4 == 3) {
            return new n();
        }
        com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("￪") + i4 + ProtectedSandApp.s("￫"));
        return new b();
    }

    public d b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt(ProtectedSandApp.s("￬"))).a(this.f59545a, jSONObject);
    }
}
