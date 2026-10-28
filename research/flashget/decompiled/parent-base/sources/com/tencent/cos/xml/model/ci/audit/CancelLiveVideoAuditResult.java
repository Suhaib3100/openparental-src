package com.tencent.cos.xml.model.ci.audit;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.HttpResponse;

/* loaded from: classes7.dex */
public final class CancelLiveVideoAuditResult extends CosXmlResult {
    public CancelLiveVideoAuditResponse response;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.response = (CancelLiveVideoAuditResponse) QCloudXmlUtils.fromXml(httpResponse.byteStream(), CancelLiveVideoAuditResponse.class);
    }
}
