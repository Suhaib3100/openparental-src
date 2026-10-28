package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.cos.xml.utils.StringUtils;

/* loaded from: classes7.dex */
public class PreviewDocumentInHtmlRequest extends GetObjectRequest {
    public PreviewDocumentInHtmlRequest(String str, String str2, String str3) {
        this(str, str2, str3, StringUtils.extractNameNoSuffix(str2));
    }

    @Override // com.tencent.cos.xml.model.object.GetObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㪪\u0001");
    }

    public PreviewDocumentInHtmlRequest setCopyable(boolean z4) {
        this.queryParameters.put(ProtectedSandApp.s("㪭\u0001"), z4 ? ProtectedSandApp.s("㪫\u0001") : ProtectedSandApp.s("㪬\u0001"));
        return this;
    }

    public PreviewDocumentInHtmlRequest setHtmlParams(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㪮\u0001"), str);
        return this;
    }

    public PreviewDocumentInHtmlRequest setSrcType(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㪯\u0001"), str);
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermark(String str) throws CosXmlClientException {
        this.queryParameters.put(ProtectedSandApp.s("㪰\u0001"), DigestUtils.getSecurityBase64(str));
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkColor(String str) throws CosXmlClientException {
        this.queryParameters.put(ProtectedSandApp.s("㪱\u0001"), DigestUtils.getSecurityBase64(str));
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkFont(String str) throws CosXmlClientException {
        this.queryParameters.put(ProtectedSandApp.s("㪲\u0001"), DigestUtils.getSecurityBase64(str));
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkHorizontal(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪳\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkRotate(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪴\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkVertical(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪵\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentInHtmlRequest(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
        this.queryParameters.put(ProtectedSandApp.s("㪦\u0001"), ProtectedSandApp.s("㪧\u0001"));
        this.queryParameters.put(ProtectedSandApp.s("㪨\u0001"), ProtectedSandApp.s("㪩\u0001"));
    }
}
