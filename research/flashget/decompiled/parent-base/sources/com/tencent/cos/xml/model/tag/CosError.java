package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class CosError {
    public String code;
    public String message;
    public String requestId;
    public String resource;
    public String traceId;

    public static CosError fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        CosError cosError = new CosError();
        cosError.code = jSONObject.optString(ProtectedSandApp.s("䨉\u0001"));
        cosError.message = jSONObject.optString(ProtectedSandApp.s("䨊\u0001"));
        cosError.requestId = jSONObject.optString(ProtectedSandApp.s("䨋\u0001"));
        cosError.traceId = jSONObject.optString(ProtectedSandApp.s("䨌\u0001"));
        return cosError;
    }
}
