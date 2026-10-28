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
public class AIImageCropRequest extends CiSaveLocalRequest {
    public String ciProcess = ProtectedSandApp.s("㮋\u0001");
    public String detectUrl;
    public int fixed;
    public int height;
    public int ignoreError;
    public String objectKey;
    public int width;

    public AIImageCropRequest(@o0 String str) {
        this.bucket = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㮌\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        boolean isEmpty = TextUtils.isEmpty(this.objectKey);
        String s4 = ProtectedSandApp.s("㮍\u0001");
        if (isEmpty) {
            return s4;
        }
        return s4 + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㮎\u0001"), this.ciProcess);
        if (!TextUtils.isEmpty(this.detectUrl)) {
            this.queryParameters.put(ProtectedSandApp.s("㮏\u0001"), this.detectUrl);
        }
        this.queryParameters.put(ProtectedSandApp.s("㮐\u0001"), String.valueOf(this.width));
        this.queryParameters.put(ProtectedSandApp.s("㮑\u0001"), String.valueOf(this.height));
        this.queryParameters.put(ProtectedSandApp.s("㮒\u0001"), String.valueOf(this.fixed));
        this.queryParameters.put(ProtectedSandApp.s("㮓\u0001"), String.valueOf(this.ignoreError));
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
