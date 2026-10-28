package com.tencent.cos.xml.model.ci.ai;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class AIDetectFaceRequest extends BucketRequest {
    public String ciProcess;
    public int maxFaceNum;
    protected final String objectKey;

    public AIDetectFaceRequest(@o0 String str, @o0 String str2) {
        super(str);
        this.ciProcess = ProtectedSandApp.s("㬦\u0001");
        this.objectKey = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㬧\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㬨\u0001") + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㬩\u0001"), this.ciProcess);
        this.queryParameters.put(ProtectedSandApp.s("㬪\u0001"), String.valueOf(this.maxFaceNum));
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
