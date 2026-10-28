package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public class DescribeDocProcessBucketsRequest extends CosXmlRequest {
    public DescribeDocProcessBucketsRequest() {
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㩃\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㩄\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, ProtectedSandApp.s("㩅\u0001"));
    }

    public void setBucketName(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㩆\u0001"), str);
    }

    public void setBucketNames(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㩇\u0001"), str);
    }

    public void setPageNumber(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㩈\u0001"), String.valueOf(i4));
    }

    public void setPageSize(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㩉\u0001"), String.valueOf(i4));
    }

    public void setRegions(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㩊\u0001"), str);
    }

    public DescribeDocProcessBucketsRequest(String str) {
        this.region = str;
    }
}
