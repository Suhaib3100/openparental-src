package com.google.firebase.crashlytics.internal.settings;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.y;
import com.google.firebase.crashlytics.internal.settings.d;
import com.tencent.mmkv.MMKV;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsV3JsonTransform.java */
/* loaded from: classes3.dex */
class m implements i {
    m() {
    }

    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean(ProtectedSandApp.s("⩡"), true), jSONObject.optBoolean(ProtectedSandApp.s("⩢"), false), jSONObject.optBoolean(ProtectedSandApp.s("⩣"), false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt(ProtectedSandApp.s("⩤"), 8), 4);
    }

    private static long d(y yVar, long j5, JSONObject jSONObject) {
        String s5 = ProtectedSandApp.s("⩥");
        if (jSONObject.has(s5)) {
            return jSONObject.optLong(s5);
        }
        return (j5 * 1000) + yVar.a();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.i
    public d a(y yVar, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt(ProtectedSandApp.s("⩦"), 0);
        int optInt2 = jSONObject.optInt(ProtectedSandApp.s("⩧"), MMKV.ExpireInHour);
        double optDouble = jSONObject.optDouble(ProtectedSandApp.s("⩨"), 10.0d);
        double optDouble2 = jSONObject.optDouble(ProtectedSandApp.s("⩩"), 1.2d);
        int optInt3 = jSONObject.optInt(ProtectedSandApp.s("⩪"), 60);
        String s5 = ProtectedSandApp.s("⩫");
        return new d(d(yVar, optInt2, jSONObject), jSONObject.has(s5) ? c(jSONObject.getJSONObject(s5)) : c(new JSONObject()), b(jSONObject.getJSONObject(ProtectedSandApp.s("⩬"))), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
