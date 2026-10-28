package com.tencent.qcloud.network.sonar.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.utils.SonarLog;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class HttpResult {
    public boolean bypassProxy;
    public String domain;
    public int responseCode;
    public Map<String, List<String>> responseHeaders;
    public long timeConsuming;
    public String url;

    public String encode() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ProtectedSandApp.s("嫽\u0001"), ProtectedSandApp.s("嫾\u0001"));
            jSONObject.put(ProtectedSandApp.s("嫿\u0001"), this.domain);
            jSONObject.put(ProtectedSandApp.s("嬀\u0001"), this.url);
            jSONObject.put(ProtectedSandApp.s("嬁\u0001"), this.bypassProxy);
            jSONObject.put(ProtectedSandApp.s("嬂\u0001"), this.responseCode);
            Map<String, List<String>> map = this.responseHeaders;
            if (map != null) {
                jSONObject.put(ProtectedSandApp.s("嬃\u0001"), map);
            }
            jSONObject.put(ProtectedSandApp.s("嬄\u0001"), this.timeConsuming);
            return jSONObject.toString();
        } catch (JSONException e4) {
            if (!SonarLog.openLog) {
                return null;
            }
            e4.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return encode();
    }
}
