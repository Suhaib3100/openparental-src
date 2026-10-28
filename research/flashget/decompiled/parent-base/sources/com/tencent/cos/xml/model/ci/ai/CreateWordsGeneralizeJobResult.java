package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.ci.ai.bean.CreateWordsGeneralizeJobResponse;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.HttpResponse;

/* loaded from: classes7.dex */
public final class CreateWordsGeneralizeJobResult extends CosXmlResult {
    public CreateWordsGeneralizeJobResponse createWordsGeneralizeJobResponse;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.createWordsGeneralizeJobResponse = (CreateWordsGeneralizeJobResponse) QCloudXmlUtils.fromXml(httpResponse.byteStream(), CreateWordsGeneralizeJobResponse.class);
    }
}
