package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpResult;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SessionCredentialProvider extends BasicLifecycleCredentialProvider {
    private HttpRequest<String> httpRequest;
    private HttpRequest.Builder<String> requestBuilder;
    private StsVersion stsVersion;

    public enum StsVersion {
        VERSION_2,
        VERSION_3
    }

    public SessionCredentialProvider() {
        this.stsVersion = StsVersion.VERSION_2;
    }

    static SessionQCloudCredentials parseStandardSTS3JsonResponse(String str) throws QCloudClientException {
        String s4 = ProtectedSandApp.s("壻\u0001");
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(ProtectedSandApp.s("壼\u0001"));
                if (optJSONObject != null) {
                    jSONObject = optJSONObject;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject(ProtectedSandApp.s("壽\u0001"));
                JSONObject optJSONObject3 = jSONObject.optJSONObject(ProtectedSandApp.s("壾\u0001"));
                if (optJSONObject2 != null) {
                    return new SessionQCloudCredentials(optJSONObject2.optString(ProtectedSandApp.s("夁\u0001")), optJSONObject2.optString(ProtectedSandApp.s("夂\u0001")), optJSONObject2.optString(ProtectedSandApp.s("夀\u0001")), jSONObject.optLong(ProtectedSandApp.s("壿\u0001")));
                }
                if (optJSONObject3 != null) {
                    throw new QCloudClientException(new QCloudAuthenticationException(s4 + jSONObject.toString()));
                }
            } catch (JSONException e4) {
                throw new QCloudClientException(ProtectedSandApp.s("夃\u0001"), new QCloudAuthenticationException(e4.getMessage()));
            }
        }
        throw new QCloudClientException(new QCloudAuthenticationException(ProtectedSandApp.s("处\u0001")));
    }

    static SessionQCloudCredentials parseStandardSTSJsonResponse(String str) throws QCloudClientException {
        String s4 = ProtectedSandApp.s("壻\u0001");
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(ProtectedSandApp.s("夅\u0001"));
                if (optJSONObject != null) {
                    jSONObject = optJSONObject;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject(ProtectedSandApp.s("夆\u0001"));
                int optInt = jSONObject.optInt(ProtectedSandApp.s("备\u0001"), -1);
                if (optJSONObject2 != null) {
                    long optLong = jSONObject.optLong(ProtectedSandApp.s("夈\u0001"));
                    long optLong2 = jSONObject.optLong(ProtectedSandApp.s("変\u0001"));
                    String optString = optJSONObject2.optString(ProtectedSandApp.s("夊\u0001"));
                    String optString2 = optJSONObject2.optString(ProtectedSandApp.s("夋\u0001"));
                    String optString3 = optJSONObject2.optString(ProtectedSandApp.s("夌\u0001"));
                    return optLong2 > 0 ? new SessionQCloudCredentials(optString2, optString3, optString, optLong2, optLong) : new SessionQCloudCredentials(optString2, optString3, optString, optLong);
                }
                if (optInt > 0) {
                    throw new QCloudClientException(new QCloudAuthenticationException(s4 + jSONObject.toString()));
                }
            } catch (JSONException e4) {
                throw new QCloudClientException(ProtectedSandApp.s("复\u0001"), new QCloudAuthenticationException(e4.getMessage()));
            }
        }
        throw new QCloudClientException(new QCloudAuthenticationException(ProtectedSandApp.s("处\u0001")));
    }

    protected HttpRequest<String> buildRequest(HttpRequest<String> httpRequest) {
        return httpRequest;
    }

    @Override // com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider
    protected QCloudLifecycleCredentials fetchNewCredentials() throws QCloudClientException {
        HttpRequest<String> buildRequest;
        String s4 = ProtectedSandApp.s("夎\u0001");
        HttpRequest<String> httpRequest = this.httpRequest;
        if (httpRequest != null) {
            buildRequest = buildRequest(httpRequest);
        } else {
            HttpRequest.Builder<String> builder = this.requestBuilder;
            buildRequest = builder != null ? buildRequest(builder) : null;
        }
        if (buildRequest == null) {
            throw new QCloudClientException(new QCloudAuthenticationException(ProtectedSandApp.s("夏\u0001")));
        }
        try {
            HttpResult executeNow = QCloudHttpClient.getDefault().resolveRequest(buildRequest).executeNow();
            if (executeNow.isSuccessful()) {
                return parseServerResponse((String) executeNow.content());
            }
            throw new QCloudClientException(s4, new QCloudAuthenticationException(executeNow.asException().getMessage()));
        } catch (QCloudServiceException e4) {
            throw new QCloudClientException(s4, new QCloudAuthenticationException(e4.getMessage()));
        }
    }

    protected SessionQCloudCredentials parseServerResponse(String str) throws QCloudClientException {
        return this.stsVersion == StsVersion.VERSION_2 ? parseStandardSTSJsonResponse(str) : parseStandardSTS3JsonResponse(str);
    }

    protected HttpRequest<String> buildRequest(HttpRequest.Builder<String> builder) {
        return builder.build();
    }

    public SessionCredentialProvider(HttpRequest<String> httpRequest) {
        this(httpRequest, StsVersion.VERSION_2);
    }

    public SessionCredentialProvider(HttpRequest.Builder<String> builder) {
        this(builder, StsVersion.VERSION_2);
    }

    public SessionCredentialProvider(HttpRequest<String> httpRequest, StsVersion stsVersion) {
        StsVersion stsVersion2 = StsVersion.VERSION_2;
        this.httpRequest = httpRequest;
        this.stsVersion = stsVersion;
    }

    public SessionCredentialProvider(HttpRequest.Builder<String> builder, StsVersion stsVersion) {
        StsVersion stsVersion2 = StsVersion.VERSION_2;
        this.requestBuilder = builder;
        this.stsVersion = stsVersion;
    }
}
