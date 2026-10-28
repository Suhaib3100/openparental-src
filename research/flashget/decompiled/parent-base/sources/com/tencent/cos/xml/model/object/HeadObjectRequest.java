package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public final class HeadObjectRequest extends ObjectRequest {
    public HeadObjectRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䥰\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    public void setIfModifiedSince(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䥱\u0001"), str);
        }
    }

    public void setVersionId(String str) {
        if (str != null) {
            this.queryParameters.put(ProtectedSandApp.s("䥲\u0001"), str);
        }
    }
}
