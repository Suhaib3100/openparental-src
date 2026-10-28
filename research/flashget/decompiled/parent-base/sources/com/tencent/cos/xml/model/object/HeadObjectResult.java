package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;

/* loaded from: classes7.dex */
public final class HeadObjectResult extends CosXmlResult {
    public String cosObjectType;
    public String cosStorageClass;
    public String eTag;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.cosObjectType = httpResponse.header(ProtectedSandApp.s("䥳\u0001"));
        this.cosStorageClass = httpResponse.header(ProtectedSandApp.s("䥴\u0001"));
        this.eTag = httpResponse.header(ProtectedSandApp.s("䥵\u0001"));
    }
}
