package com.tencent.cos.xml.model.ci.asr;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public final class DescribeSpeechBucketsRequest extends CosXmlRequest {
    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㾷\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㾸\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return String.format(ProtectedSandApp.s("㾹\u0001"), cosXmlServiceConfig.getRegion());
    }

    public void setBucketName(@o0 String str) {
        this.queryParameters.put(ProtectedSandApp.s("㾺\u0001"), str);
    }

    public void setBucketNames(@o0 String str) {
        this.queryParameters.put(ProtectedSandApp.s("㾻\u0001"), str);
    }

    public void setPageNumber(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㾼\u0001"), String.valueOf(i4));
    }

    public void setPageSize(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㾽\u0001"), String.valueOf(i4));
    }

    public void setRegions(@o0 String str) {
        this.queryParameters.put(ProtectedSandApp.s("㾾\u0001"), str);
    }
}
