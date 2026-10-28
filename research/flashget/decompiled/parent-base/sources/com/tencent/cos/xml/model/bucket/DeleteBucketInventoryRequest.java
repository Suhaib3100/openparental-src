package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes6.dex */
public class DeleteBucketInventoryRequest extends BucketRequest {
    private String inventoryId;

    public DeleteBucketInventoryRequest(String str) {
        super(str);
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㙙\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㙚\u0001"), null);
        this.queryParameters.put(ProtectedSandApp.s("㙛\u0001"), this.inventoryId);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    public void setInventoryId(String str) {
        this.inventoryId = str;
    }
}
