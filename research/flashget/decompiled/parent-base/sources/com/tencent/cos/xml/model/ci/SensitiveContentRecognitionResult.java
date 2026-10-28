package com.tencent.cos.xml.model.ci;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.RecognitionResult;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

/* loaded from: classes7.dex */
public class SensitiveContentRecognitionResult extends CosXmlResult {

    @XmlElement(name = "RecognitionResult")
    public RecognitionResult recognitionResult;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlClientException, CosXmlServiceException {
        super.parseResponseBody(httpResponse);
        this.recognitionResult = (RecognitionResult) QCloudXmlUtils.fromXml(httpResponse.byteStream(), RecognitionResult.class);
    }
}
