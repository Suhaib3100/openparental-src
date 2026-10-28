package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public class PreviewDocumentInHtmlLinkRequest extends PreviewDocumentInHtmlBytesRequest {
    public PreviewDocumentInHtmlLinkRequest(String str, String str2) {
        super(str, str2);
        this.queryParameters.put(ProtectedSandApp.s("㪢\u0001"), ProtectedSandApp.s("㪣\u0001"));
    }

    @Override // com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlBytesRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㪤\u0001");
    }

    @Override // com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlBytesRequest, com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
