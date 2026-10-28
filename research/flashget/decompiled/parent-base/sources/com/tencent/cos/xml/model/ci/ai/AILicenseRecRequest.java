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
public class AILicenseRecRequest extends BucketRequest {
    public String cardType;
    public String ciProcess;
    public String detectUrl;
    protected final String objectKey;

    public AILicenseRecRequest(@o0 String str, @o0 String str2) {
        super(str);
        this.ciProcess = ProtectedSandApp.s("㮔\u0001");
        this.objectKey = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㮕\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        boolean isEmpty = TextUtils.isEmpty(this.detectUrl);
        String s4 = ProtectedSandApp.s("㮖\u0001");
        if (!isEmpty || TextUtils.isEmpty(this.objectKey)) {
            return s4;
        }
        return s4 + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㮗\u0001"), this.ciProcess);
        this.queryParameters.put(ProtectedSandApp.s("㮘\u0001"), this.detectUrl);
        this.queryParameters.put(ProtectedSandApp.s("㮙\u0001"), this.cardType);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
