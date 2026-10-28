package com.tencent.cos.xml.model.ci.media;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class GetPrivateM3U8Result extends CosXmlResult {
    public String response;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        try {
            this.response = httpResponse.string();
        } catch (IOException e4) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e4);
        }
    }
}
