package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.ObjectRequest;
import com.tencent.cos.xml.model.tag.pic.PicOperationRule;
import com.tencent.cos.xml.model.tag.pic.PicOperations;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Collections;

/* loaded from: classes7.dex */
public class FormatConversionRequest extends ObjectRequest {
    public String fileId;
    private final String format;
    public String saveBucket;

    public FormatConversionRequest(String str, String str2, String str3) {
        super(str, str2);
        this.format = str3;
        setQueryEncodedString(ProtectedSandApp.s("㩚\u0001"));
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        PicOperations picOperations = getPicOperations();
        if (picOperations != null) {
            addHeader(ProtectedSandApp.s("㩛\u0001"), picOperations.toJsonStr());
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㩜\u0001");
    }

    public PicOperations getPicOperations() {
        PicOperationRule picOperationRule = new PicOperationRule(ProtectedSandApp.s("㩝\u0001") + this.format);
        picOperationRule.setBucket(this.saveBucket);
        picOperationRule.setFileId(this.fileId);
        return new PicOperations(false, Collections.singletonList(picOperationRule));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㩞\u0001"), "");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean headersHasUnsafeNonAscii() {
        return true;
    }
}
