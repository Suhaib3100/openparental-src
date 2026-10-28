package com.google.firebase.crashlytics.internal.settings;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.y;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final y f16417a;

    h(y yVar) {
        this.f16417a = yVar;
    }

    private static i a(int i5) {
        if (i5 == 3) {
            return new m();
        }
        com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("ᗮ") + i5 + ProtectedSandApp.s("ᗯ"));
        return new b();
    }

    public d b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt(ProtectedSandApp.s("ᗰ"))).a(this.f16417a, jSONObject);
    }
}
