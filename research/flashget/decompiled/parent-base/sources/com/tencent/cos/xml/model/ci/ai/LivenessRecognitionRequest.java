package com.tencent.cos.xml.model.ci.ai;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class LivenessRecognitionRequest extends BucketRequest {
    public int bestFrameNum;
    public String ciProcess;
    public String idCard;
    public String livenessType;
    public String name;
    protected final String objectKey;
    public String validateData;

    public LivenessRecognitionRequest(@o0 String str, @o0 String str2) {
        super(str);
        this.ciProcess = ProtectedSandApp.s("㲵\u0001");
        this.objectKey = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㲶\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㲷\u0001") + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㲸\u0001"), this.ciProcess);
        this.queryParameters.put(ProtectedSandApp.s("㲹\u0001"), this.idCard);
        this.queryParameters.put(ProtectedSandApp.s("㲺\u0001"), this.name);
        this.queryParameters.put(ProtectedSandApp.s("㲻\u0001"), this.livenessType);
        this.queryParameters.put(ProtectedSandApp.s("㲼\u0001"), this.validateData);
        this.queryParameters.put(ProtectedSandApp.s("㲽\u0001"), String.valueOf(this.bestFrameNum));
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
