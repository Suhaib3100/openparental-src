package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.ObjectRequest;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public class PreviewDocumentInHtmlBytesRequest extends ObjectRequest {
    public PreviewDocumentInHtmlBytesRequest(String str, String str2) {
        super(str, str2);
        this.queryParameters.put(ProtectedSandApp.s("㪒\u0001"), ProtectedSandApp.s("㪓\u0001"));
        this.queryParameters.put(ProtectedSandApp.s("㪔\u0001"), ProtectedSandApp.s("㪕\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㪖\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    public PreviewDocumentInHtmlBytesRequest setCopyable(boolean z4) {
        this.queryParameters.put(ProtectedSandApp.s("㪙\u0001"), z4 ? ProtectedSandApp.s("㪗\u0001") : ProtectedSandApp.s("㪘\u0001"));
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setHtmlParams(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㪚\u0001"), str);
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setSrcType(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㪛\u0001"), str);
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermark(String str) throws CosXmlClientException {
        this.queryParameters.put(ProtectedSandApp.s("㪜\u0001"), DigestUtils.getSecurityBase64(str));
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkColor(String str) throws CosXmlClientException {
        this.queryParameters.put(ProtectedSandApp.s("㪝\u0001"), DigestUtils.getSecurityBase64(str));
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkFont(String str) throws CosXmlClientException {
        this.queryParameters.put(ProtectedSandApp.s("㪞\u0001"), DigestUtils.getSecurityBase64(str));
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkHorizontal(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪟\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkRotate(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪠\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkVertical(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪡\u0001"), String.valueOf(i4));
        return this;
    }
}
