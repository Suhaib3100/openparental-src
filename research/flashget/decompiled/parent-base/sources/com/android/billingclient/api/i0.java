package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@h6
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f40391a;

    i0(String str) throws JSONException {
        this.f40391a = new JSONObject(str).optString(ProtectedSandApp.s("ҫ"));
    }

    @androidx.annotation.o0
    public String a() {
        return this.f40391a;
    }
}
