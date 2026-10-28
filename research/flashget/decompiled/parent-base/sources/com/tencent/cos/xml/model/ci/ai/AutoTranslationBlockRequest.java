package com.tencent.cos.xml.model.ci.ai;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class AutoTranslationBlockRequest extends BucketRequest {
    public String ciProcess;
    public String inputText;
    public String sourceLang;
    public String targetLang;
    public String textDomain;
    public String textStyle;

    public AutoTranslationBlockRequest(@o0 String str) {
        super(str);
        this.ciProcess = ProtectedSandApp.s("㯆\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㯇\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㯈\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㯉\u0001"), this.ciProcess);
        this.queryParameters.put(ProtectedSandApp.s("㯊\u0001"), this.inputText);
        this.queryParameters.put(ProtectedSandApp.s("㯋\u0001"), this.sourceLang);
        this.queryParameters.put(ProtectedSandApp.s("㯌\u0001"), this.targetLang);
        this.queryParameters.put(ProtectedSandApp.s("㯍\u0001"), this.textDomain);
        this.queryParameters.put(ProtectedSandApp.s("㯎\u0001"), this.textStyle);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
