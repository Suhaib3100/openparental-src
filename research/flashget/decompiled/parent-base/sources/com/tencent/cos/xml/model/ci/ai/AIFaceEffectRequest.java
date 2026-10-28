package com.tencent.cos.xml.model.ci.ai;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class AIFaceEffectRequest extends BucketRequest {
    public int age;
    public String ciProcess;
    public String detectUrl;
    public int eyeEnlarging;
    public int faceLifting;
    public int gender;
    public String objectKey;
    public int smoothing;
    public String type;
    public int whitening;

    public AIFaceEffectRequest(@o0 String str) {
        super(str);
        this.ciProcess = ProtectedSandApp.s("㭐\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㭑\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        boolean isEmpty = TextUtils.isEmpty(this.objectKey);
        String s4 = ProtectedSandApp.s("㭒\u0001");
        if (isEmpty) {
            return s4;
        }
        return s4 + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㭓\u0001"), this.ciProcess);
        if (!TextUtils.isEmpty(this.detectUrl)) {
            this.queryParameters.put(ProtectedSandApp.s("㭔\u0001"), this.detectUrl);
        }
        this.queryParameters.put(ProtectedSandApp.s("㭕\u0001"), this.type);
        this.queryParameters.put(ProtectedSandApp.s("㭖\u0001"), String.valueOf(this.whitening));
        this.queryParameters.put(ProtectedSandApp.s("㭗\u0001"), String.valueOf(this.smoothing));
        this.queryParameters.put(ProtectedSandApp.s("㭘\u0001"), String.valueOf(this.faceLifting));
        this.queryParameters.put(ProtectedSandApp.s("㭙\u0001"), String.valueOf(this.eyeEnlarging));
        this.queryParameters.put(ProtectedSandApp.s("㭚\u0001"), String.valueOf(this.gender));
        this.queryParameters.put(ProtectedSandApp.s("㭛\u0001"), String.valueOf(this.age));
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
