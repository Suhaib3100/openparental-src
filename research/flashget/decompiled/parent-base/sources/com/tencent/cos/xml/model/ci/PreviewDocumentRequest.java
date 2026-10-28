package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.GetObjectRequest;

/* loaded from: classes7.dex */
public class PreviewDocumentRequest extends GetObjectRequest {
    private int page;

    public PreviewDocumentRequest(String str, String str2, String str3, int i4) {
        this(str, str2, str3, i4 + ProtectedSandApp.s("㪶\u0001"), i4);
    }

    @Override // com.tencent.cos.xml.model.object.GetObjectRequest, com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
    }

    @Override // com.tencent.cos.xml.model.object.GetObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㪺\u0001");
    }

    public PreviewDocumentRequest setComment(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪻\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentRequest setDstType(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㪼\u0001"), str);
        return this;
    }

    public PreviewDocumentRequest setExcelCol(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪽\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentRequest setExcelPaperDirection(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪾\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentRequest setExcelPaperSize(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪿\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentRequest setExcelRow(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㫀\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentRequest setExcelSheet(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㫁\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentRequest setImageDpi(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㫂\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentRequest setImageParams(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㫃\u0001"), String.valueOf(str));
        return this;
    }

    public PreviewDocumentRequest setPassword(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㫄\u0001"), str);
        return this;
    }

    public PreviewDocumentRequest setQuality(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㫅\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentRequest setScale(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㫆\u0001"), String.valueOf(i4));
        return this;
    }

    public PreviewDocumentRequest setSrcType(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㫇\u0001"), str);
        return this;
    }

    public PreviewDocumentRequest setTxtPagination(boolean z4) {
        this.queryParameters.put(ProtectedSandApp.s("㫈\u0001"), String.valueOf(z4));
        return this;
    }

    public PreviewDocumentRequest(String str, String str2, String str3, String str4, int i4) {
        super(str, str2, str3, str4);
        this.queryParameters.put(ProtectedSandApp.s("㪷\u0001"), ProtectedSandApp.s("㪸\u0001"));
        this.page = i4;
        this.queryParameters.put(ProtectedSandApp.s("㪹\u0001"), String.valueOf(i4));
    }
}
