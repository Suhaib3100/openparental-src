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
public class ImageRepairRequest extends CiSaveLocalRequest {
    public String ciProcess = ProtectedSandApp.s("㲦\u0001");
    public String detectUrl;
    public String maskPic;
    public String maskPoly;
    protected final String objectKey;

    public ImageRepairRequest(@o0 String str, @o0 String str2) {
        this.bucket = str;
        this.objectKey = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㲧\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        boolean isEmpty = TextUtils.isEmpty(this.objectKey);
        String s4 = ProtectedSandApp.s("㲨\u0001");
        if (isEmpty) {
            return s4;
        }
        return s4 + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㲩\u0001"), this.ciProcess);
        if (!TextUtils.isEmpty(this.detectUrl)) {
            this.queryParameters.put(ProtectedSandApp.s("㲪\u0001"), this.detectUrl);
        }
        this.queryParameters.put(ProtectedSandApp.s("㲫\u0001"), this.maskPic);
        this.queryParameters.put(ProtectedSandApp.s("㲬\u0001"), this.maskPoly);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
