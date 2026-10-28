package com.tencent.cos.xml.model.ci.metainsight;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.appid.AppIdRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class DescribeDatasetBindingsRequest extends AppIdRequest {
    public String datasetname;
    public int maxresults;
    public String nexttoken;

    public DescribeDatasetBindingsRequest(@o0 String str) {
        super(str);
        this.nexttoken = "";
        addHeader(ProtectedSandApp.s("䣶\u0001"), ProtectedSandApp.s("䣷\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䣸\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䣹\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䣺\u0001"), this.datasetname);
        this.queryParameters.put(ProtectedSandApp.s("䣻\u0001"), String.valueOf(this.maxresults));
        this.queryParameters.put(ProtectedSandApp.s("䣼\u0001"), this.nexttoken);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
