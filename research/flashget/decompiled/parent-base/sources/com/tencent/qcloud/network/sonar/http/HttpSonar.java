package com.tencent.qcloud.network.sonar.http;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.network.sonar.Sonar;
import com.tencent.qcloud.network.sonar.SonarRequest;
import com.tencent.qcloud.network.sonar.SonarResult;
import com.tencent.qcloud.network.sonar.SonarType;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

/* loaded from: classes7.dex */
public class HttpSonar implements Sonar<HttpResult> {
    public boolean bypassProxy;

    public HttpSonar(boolean z4) {
        this.bypassProxy = z4;
    }

    @Override // com.tencent.qcloud.network.sonar.Sonar
    public SonarResult<HttpResult> start(SonarRequest sonarRequest) {
        String s4 = ProtectedSandApp.s("嬅\u0001");
        if (!sonarRequest.isNetworkAvailable()) {
            return new SonarResult<>(SonarType.HTTP, new Exception(ProtectedSandApp.s("嬆\u0001")));
        }
        if (TextUtils.isEmpty(sonarRequest.getHost())) {
            return new SonarResult<>(SonarType.HTTP, new Exception(ProtectedSandApp.s("嬇\u0001")));
        }
        HttpResult httpResult = new HttpResult();
        httpResult.domain = sonarRequest.getHost();
        httpResult.bypassProxy = this.bypassProxy;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                URL url = new URL(s4 + sonarRequest.getHost());
                httpResult.url = url.toString();
                httpURLConnection = this.bypassProxy ? (HttpURLConnection) url.openConnection(Proxy.NO_PROXY) : (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setRequestMethod(ProtectedSandApp.s("嬈\u0001"));
                long currentTimeMillis = System.currentTimeMillis();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                httpResult.responseCode = responseCode;
                httpResult.timeConsuming = currentTimeMillis2;
                httpResult.responseHeaders = httpURLConnection.getHeaderFields();
                httpURLConnection.disconnect();
                return new SonarResult<>(SonarType.HTTP, httpResult);
            } catch (Exception e4) {
                SonarResult<HttpResult> sonarResult = new SonarResult<>(SonarType.HTTP, e4);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return sonarResult;
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Override // com.tencent.qcloud.network.sonar.Sonar
    public void stop() {
    }
}
