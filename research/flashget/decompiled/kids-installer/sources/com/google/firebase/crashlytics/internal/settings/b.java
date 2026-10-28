package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.y;
import com.google.firebase.crashlytics.internal.settings.d;
import com.tencent.mmkv.MMKV;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes3.dex */
class b implements i {
    b() {
    }

    static d b(y yVar) {
        return new d(yVar.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, MMKV.ExpireInHour, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.i
    public d a(y yVar, JSONObject jSONObject) {
        return b(yVar);
    }
}
