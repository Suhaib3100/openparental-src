package com.tencent.cos.xml.model.ci.metainsight;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.appid.AppIdRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class DescribeDatasetsRequest extends AppIdRequest {
    public int maxresults;
    public String nexttoken;
    public String prefix;

    public DescribeDatasetsRequest(@o0 String str) {
        super(str);
        this.nexttoken = "";
        addHeader(ProtectedSandApp.s("䤃\u0001"), ProtectedSandApp.s("䤄\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䤅\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䤆\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䤇\u0001"), String.valueOf(this.maxresults));
        this.queryParameters.put(ProtectedSandApp.s("䤈\u0001"), this.nexttoken);
        this.queryParameters.put(ProtectedSandApp.s("䤉\u0001"), this.prefix);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
