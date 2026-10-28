package com.tencent.cos.xml.model.ci.ai;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.ci.ai.bean.OpenBucketAiResponse;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.HttpResponse;

/* loaded from: classes7.dex */
public class OpenBucketAiResult extends CosXmlResult {
    public OpenBucketAiResponse openBucketAiResponse;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlClientException, CosXmlServiceException {
        super.parseResponseBody(httpResponse);
        this.openBucketAiResponse = (OpenBucketAiResponse) QCloudXmlUtils.fromXml(httpResponse.byteStream(), OpenBucketAiResponse.class);
    }
}
