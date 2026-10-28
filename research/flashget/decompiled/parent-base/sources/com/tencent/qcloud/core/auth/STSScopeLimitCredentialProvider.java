package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpResult;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public class STSScopeLimitCredentialProvider extends BasicScopeLimitCredentialProvider {
    private HttpRequest.Builder<String> requestBuilder;

    public STSScopeLimitCredentialProvider(HttpRequest.Builder<String> builder) {
        this.requestBuilder = builder;
    }

    protected HttpRequest<String> buildRequest(HttpRequest.Builder<String> builder) {
        return builder.build();
    }

    @Override // com.tencent.qcloud.core.auth.BasicScopeLimitCredentialProvider
    public SessionQCloudCredentials fetchNewCredentials(STSCredentialScope[] sTSCredentialScopeArr) throws QCloudClientException {
        String s4 = ProtectedSandApp.s("壶\u0001");
        this.requestBuilder.body(RequestBodySerializer.string(ProtectedSandApp.s("壷\u0001"), STSCredentialScope.jsonify(sTSCredentialScopeArr))).method(ProtectedSandApp.s("壸\u0001"));
        try {
            HttpResult executeNow = QCloudHttpClient.getDefault().resolveRequest(buildRequest(this.requestBuilder)).executeNow();
            if (executeNow.isSuccessful()) {
                return parseServerResponse((String) executeNow.content());
            }
            throw new QCloudClientException(s4, new QCloudAuthenticationException(executeNow.asException().getMessage()));
        } catch (QCloudServiceException e4) {
            throw new QCloudClientException(s4, new QCloudAuthenticationException(e4.getMessage()));
        }
    }

    protected SessionQCloudCredentials parseServerResponse(String str) throws QCloudClientException {
        return SessionCredentialProvider.parseStandardSTSJsonResponse(str);
    }
}
