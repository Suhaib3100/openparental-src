package com.tencent.cos.xml.model.ci.audit;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class GetAuditTextlibKeywordListRequest extends BucketRequest {
    public String content;
    public String label;
    private final String libid;
    public int limit;
    public int offset;

    public GetAuditTextlibKeywordListRequest(@o0 String str, @o0 String str2) {
        super(str);
        this.offset = -1;
        this.limit = -1;
        this.libid = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䂰\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return String.format(ProtectedSandApp.s("䂱\u0001"), this.libid);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        if (!TextUtils.isEmpty(this.content)) {
            this.queryParameters.put(ProtectedSandApp.s("䂲\u0001"), this.content);
        }
        if (!TextUtils.isEmpty(this.label)) {
            this.queryParameters.put(ProtectedSandApp.s("䂳\u0001"), this.label);
        }
        int i4 = this.offset;
        if (i4 != -1) {
            this.queryParameters.put(ProtectedSandApp.s("䂴\u0001"), String.valueOf(i4));
        }
        int i5 = this.limit;
        if (i5 != -1) {
            this.queryParameters.put(ProtectedSandApp.s("䂵\u0001"), String.valueOf(i5));
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("䂶\u0001"));
    }
}
