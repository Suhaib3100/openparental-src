package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.h0;
import com.google.firebase.crashlytics.internal.settings.d;
import com.tencent.mmkv.MMKV;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes6.dex */
class b implements j {
    b() {
    }

    static d b(h0 h0Var) {
        return new d(h0Var.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, MMKV.ExpireInHour, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.j
    public d a(h0 h0Var, JSONObject jSONObject) {
        return b(h0Var);
    }
}
