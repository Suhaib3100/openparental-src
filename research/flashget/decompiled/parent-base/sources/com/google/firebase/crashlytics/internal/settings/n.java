package com.google.firebase.crashlytics.internal.settings;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.h0;
import com.google.firebase.crashlytics.internal.settings.d;
import com.tencent.mmkv.MMKV;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsV3JsonTransform.java */
/* loaded from: classes6.dex */
class n implements j {
    n() {
    }

    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean(ProtectedSandApp.s("￭"), true), jSONObject.optBoolean(ProtectedSandApp.s("￮"), false), jSONObject.optBoolean(ProtectedSandApp.s("\uffef"), false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt(ProtectedSandApp.s("\ufff0"), 8), 4);
    }

    private static long d(h0 h0Var, long j4, JSONObject jSONObject) {
        String s4 = ProtectedSandApp.s("\ufff1");
        if (jSONObject.has(s4)) {
            return jSONObject.optLong(s4);
        }
        return (j4 * 1000) + h0Var.a();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.j
    public d a(h0 h0Var, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt(ProtectedSandApp.s("\ufff2"), 0);
        int optInt2 = jSONObject.optInt(ProtectedSandApp.s("\ufff3"), MMKV.ExpireInHour);
        double optDouble = jSONObject.optDouble(ProtectedSandApp.s("\ufff4"), 10.0d);
        double optDouble2 = jSONObject.optDouble(ProtectedSandApp.s("\ufff5"), 1.2d);
        int optInt3 = jSONObject.optInt(ProtectedSandApp.s("\ufff6"), 60);
        String s4 = ProtectedSandApp.s("\ufff7");
        return new d(d(h0Var, optInt2, jSONObject), jSONObject.has(s4) ? c(jSONObject.getJSONObject(s4)) : c(new JSONObject()), b(jSONObject.getJSONObject(ProtectedSandApp.s("\ufff8"))), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
