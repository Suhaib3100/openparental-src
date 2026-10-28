package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public final class DeleteObjectRequest extends ObjectRequest {
    public DeleteObjectRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䥣\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    public void setVersionId(String str) {
        if (str != null) {
            this.queryParameters.put(ProtectedSandApp.s("䥤\u0001"), str);
        }
    }
}
