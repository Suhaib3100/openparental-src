package com.tencent.cos.xml.model;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public abstract class CosXmlResult {
    public String accessUrl;
    public Map<String, List<String>> headers;
    public String host;
    public int httpCode;
    public String httpMessage;

    @q0
    public String getHeader(String str) {
        List<String> list;
        if (!this.headers.containsKey(str) || (list = this.headers.get(str)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlClientException, CosXmlServiceException {
        this.httpCode = httpResponse.code();
        this.httpMessage = httpResponse.message();
        this.headers = httpResponse.headers();
        this.host = httpResponse.host();
        try {
            xmlParser(httpResponse);
        } catch (IOException e4) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e4);
        } catch (XmlPullParserException e5) {
            throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e5);
        }
    }

    public String printResult() {
        return this.httpCode + ProtectedSandApp.s("㙇\u0001") + this.httpMessage;
    }

    protected void xmlParser(HttpResponse httpResponse) throws XmlPullParserException, IOException {
    }
}
