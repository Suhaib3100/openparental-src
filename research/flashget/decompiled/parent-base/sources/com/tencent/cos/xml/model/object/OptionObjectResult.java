package com.tencent.cos.xml.model.object;

import android.support.v4.media.session.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class OptionObjectResult extends CosXmlResult {
    public List<String> accessControlAllowHeaders;
    public List<String> accessControlAllowMethods;
    public String accessControlAllowOrigin;
    public List<String> accessControlExposeHeaders;
    public long accessControlMaxAge;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.accessControlAllowOrigin = httpResponse.header(ProtectedSandApp.s("䦍\u0001"));
        String s4 = ProtectedSandApp.s("䦎\u0001");
        if (httpResponse.header(s4) != null) {
            this.accessControlMaxAge = Long.parseLong(httpResponse.header(s4));
        }
        String s5 = ProtectedSandApp.s("䦏\u0001");
        String header = httpResponse.header(s5);
        String s6 = ProtectedSandApp.s("䦐\u0001");
        if (header != null) {
            this.accessControlAllowMethods = Arrays.asList(httpResponse.header(s5).split(s6));
        }
        String s7 = ProtectedSandApp.s("䦑\u0001");
        if (httpResponse.header(s7) != null) {
            this.accessControlAllowHeaders = Arrays.asList(httpResponse.header(s7).split(s6));
        }
        String s10 = ProtectedSandApp.s("䦒\u0001");
        if (httpResponse.header(s10) != null) {
            this.accessControlExposeHeaders = Arrays.asList(httpResponse.header(s10).split(s6));
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.printResult());
        String s4 = ProtectedSandApp.s("䦓\u0001");
        sb.append(s4);
        sb.append(this.accessControlAllowOrigin);
        sb.append(s4);
        return b.a(sb, this.accessControlMaxAge, s4);
    }
}
