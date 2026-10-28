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
public class AISuperResolutionRequest extends CiSaveLocalRequest {
    public String detectUrl;
    public String objectKey;
    public String ciProcess = ProtectedSandApp.s("㮦\u0001");
    public int magnify = -1;

    public AISuperResolutionRequest(@o0 String str) {
        this.bucket = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㮧\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        boolean isEmpty = TextUtils.isEmpty(this.objectKey);
        String s4 = ProtectedSandApp.s("㮨\u0001");
        if (isEmpty) {
            return s4;
        }
        return s4 + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㮩\u0001"), this.ciProcess);
        if (!TextUtils.isEmpty(this.detectUrl)) {
            this.queryParameters.put(ProtectedSandApp.s("㮪\u0001"), this.detectUrl);
        }
        int i4 = this.magnify;
        if (i4 != -1) {
            this.queryParameters.put(ProtectedSandApp.s("㮫\u0001"), String.valueOf(i4));
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
