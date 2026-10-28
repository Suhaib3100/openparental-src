package com.tencent.cos.xml.model.ci.ai;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class CreateCRcodeRequest extends BucketRequest {
    public String ciProcess;
    public int mode;
    public String qrcodeContent;
    public String width;

    public CreateCRcodeRequest(@o0 String str) {
        super(str);
        this.ciProcess = ProtectedSandApp.s("㰕\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㰖\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㰗\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㰘\u0001"), this.ciProcess);
        this.queryParameters.put(ProtectedSandApp.s("㰙\u0001"), this.qrcodeContent);
        this.queryParameters.put(ProtectedSandApp.s("㰚\u0001"), String.valueOf(this.mode));
        this.queryParameters.put(ProtectedSandApp.s("㰛\u0001"), this.width);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
