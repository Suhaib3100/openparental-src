package com.tencent.cos.xml.model.ci;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.HttpResponse;

/* loaded from: classes7.dex */
public final class GetDescribeMediaBucketsResult extends CosXmlResult {
    public DescribeMediaBucketsResult describeMediaBucketsResult;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.describeMediaBucketsResult = (DescribeMediaBucketsResult) QCloudXmlUtils.fromXml(httpResponse.byteStream(), DescribeMediaBucketsResult.class);
    }
}
