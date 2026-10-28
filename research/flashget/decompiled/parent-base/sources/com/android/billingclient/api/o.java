package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@k6
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f40540a;

    private o(@androidx.annotation.q0 String str, String str2) {
        this.f40540a = str2;
    }

    static o a(String str) {
        return new o(null, str);
    }

    @androidx.annotation.o0
    public String b() {
        return this.f40540a;
    }

    o(String str) throws JSONException {
        this.f40540a = new JSONObject(str).optString(ProtectedSandApp.s("Ձ"));
    }
}
