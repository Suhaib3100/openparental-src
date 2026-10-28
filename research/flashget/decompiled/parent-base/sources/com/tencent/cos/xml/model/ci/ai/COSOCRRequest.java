package com.tencent.cos.xml.model.ci.ai;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class COSOCRRequest extends BucketRequest {
    public String ciProcess;
    public String detectUrl;
    public boolean enableWordPolygon;
    public boolean ispdf;
    public boolean isword;
    public String languageType;
    protected final String objectKey;
    public int pdfPagenumber;
    public String type;

    public COSOCRRequest(@o0 String str, @o0 String str2) {
        super(str);
        this.ciProcess = ProtectedSandApp.s("㯐\u0001");
        this.objectKey = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㯑\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㯒\u0001") + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㯓\u0001"), this.ciProcess);
        this.queryParameters.put(ProtectedSandApp.s("㯔\u0001"), this.detectUrl);
        this.queryParameters.put(ProtectedSandApp.s("㯕\u0001"), this.type);
        this.queryParameters.put(ProtectedSandApp.s("㯖\u0001"), this.languageType);
        this.queryParameters.put(ProtectedSandApp.s("㯗\u0001"), String.valueOf(this.ispdf));
        this.queryParameters.put(ProtectedSandApp.s("㯘\u0001"), String.valueOf(this.pdfPagenumber));
        this.queryParameters.put(ProtectedSandApp.s("㯙\u0001"), String.valueOf(this.isword));
        this.queryParameters.put(ProtectedSandApp.s("㯚\u0001"), String.valueOf(this.enableWordPolygon));
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
