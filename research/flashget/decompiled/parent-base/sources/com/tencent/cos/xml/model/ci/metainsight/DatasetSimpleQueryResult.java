package com.tencent.cos.xml.model.ci.metainsight;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.utils.QCloudJsonUtils;
import com.tencent.qcloud.core.http.HttpResponse;

/* loaded from: classes7.dex */
public final class DatasetSimpleQueryResult extends CosXmlResult {
    public DatasetSimpleQueryResponse response;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.response = (DatasetSimpleQueryResponse) QCloudJsonUtils.fromJson(httpResponse, DatasetSimpleQueryResponse.class);
    }
}
