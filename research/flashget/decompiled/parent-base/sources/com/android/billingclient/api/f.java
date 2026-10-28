package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@e3
@KeepForSdk
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f40364a;

    f(String str) throws JSONException {
        this.f40364a = new JSONObject(str).optString(ProtectedSandApp.s("ξ"));
    }

    @androidx.annotation.o0
    public String a() {
        return this.f40364a;
    }
}
