package com.tencent.cos.xml.model.ci.ai;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.ci.CiSaveLocalRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class AIEnhanceImageRequest extends CiSaveLocalRequest {
    public String ciProcess = ProtectedSandApp.s("㭈\u0001");
    public int denoise;
    public String detectUrl;
    public int ignoreError;
    public String objectKey;
    public int sharpen;

    public AIEnhanceImageRequest(@o0 String str) {
        this.bucket = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㭉\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        boolean isEmpty = TextUtils.isEmpty(this.objectKey);
        String s4 = ProtectedSandApp.s("㭊\u0001");
        if (isEmpty) {
            return s4;
        }
        return s4 + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㭋\u0001"), this.ciProcess);
        this.queryParameters.put(ProtectedSandApp.s("㭌\u0001"), String.valueOf(this.denoise));
        this.queryParameters.put(ProtectedSandApp.s("㭍\u0001"), String.valueOf(this.sharpen));
        if (!TextUtils.isEmpty(this.detectUrl)) {
            this.queryParameters.put(ProtectedSandApp.s("㭎\u0001"), this.detectUrl);
        }
        this.queryParameters.put(ProtectedSandApp.s("㭏\u0001"), String.valueOf(this.ignoreError));
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
