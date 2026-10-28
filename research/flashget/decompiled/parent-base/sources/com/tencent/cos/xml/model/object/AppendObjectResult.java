package com.tencent.cos.xml.model.object;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;

/* loaded from: classes7.dex */
public final class AppendObjectResult extends CosXmlResult {
    public String eTag;
    public String nextAppendPosition;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.eTag = httpResponse.header(ProtectedSandApp.s("䤴\u0001"));
        this.nextAppendPosition = httpResponse.header(ProtectedSandApp.s("䤵\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.printResult());
        String s4 = ProtectedSandApp.s("䤶\u0001");
        sb.append(s4);
        sb.append(this.eTag);
        sb.append(s4);
        return c.a(sb, this.nextAppendPosition, s4);
    }
}
