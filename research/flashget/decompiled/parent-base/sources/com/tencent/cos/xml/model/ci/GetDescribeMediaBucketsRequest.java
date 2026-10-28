package com.tencent.cos.xml.model.ci;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public final class GetDescribeMediaBucketsRequest extends CosXmlRequest {
    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㩟\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㩠\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return String.format(ProtectedSandApp.s("㩡\u0001"), cosXmlServiceConfig.getRegion());
    }

    public void setBucketName(@o0 String str) {
        this.queryParameters.put(ProtectedSandApp.s("㩢\u0001"), str);
    }

    public void setBucketNames(@o0 String str) {
        this.queryParameters.put(ProtectedSandApp.s("㩣\u0001"), str);
    }

    public void setPageNumber(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㩤\u0001"), String.valueOf(i4));
    }

    public void setPageSize(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㩥\u0001"), String.valueOf(i4));
    }

    public void setRegions(@o0 String str) {
        this.queryParameters.put(ProtectedSandApp.s("㩦\u0001"), str);
    }
}
