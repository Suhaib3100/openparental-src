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
public class GetSearchImageRequest extends BucketRequest {
    public String action;
    public String ciProcess;
    public String filter;
    public int limit;
    public int matchThreshold;
    protected final String objectKey;
    public int offset;

    public GetSearchImageRequest(@o0 String str, @o0 String str2) {
        super(str);
        this.ciProcess = ProtectedSandApp.s("㲌\u0001");
        this.action = ProtectedSandApp.s("㲍\u0001");
        this.objectKey = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㲎\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㲏\u0001") + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㲐\u0001"), this.ciProcess);
        this.queryParameters.put(ProtectedSandApp.s("㲑\u0001"), this.action);
        this.queryParameters.put(ProtectedSandApp.s("㲒\u0001"), String.valueOf(this.matchThreshold));
        this.queryParameters.put(ProtectedSandApp.s("㲓\u0001"), String.valueOf(this.offset));
        this.queryParameters.put(ProtectedSandApp.s("㲔\u0001"), String.valueOf(this.limit));
        if (!TextUtils.isEmpty(this.filter)) {
            this.queryParameters.put(ProtectedSandApp.s("㲕\u0001"), this.filter);
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
