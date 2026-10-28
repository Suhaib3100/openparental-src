package com.tencent.cos.xml.model.ci.media;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class TriggerWorkflowRequest extends BucketRequest {
    private String name;
    private final String object;
    private final String workflowId;

    public TriggerWorkflowRequest(@o0 String str, String str2, String str3) {
        super(str);
        this.workflowId = str2;
        this.object = str3;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䢞\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䢟\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        addQuery(ProtectedSandApp.s("䢠\u0001"), this.workflowId);
        addQuery(ProtectedSandApp.s("䢡\u0001"), this.object);
        if (!TextUtils.isEmpty(this.name)) {
            addQuery(ProtectedSandApp.s("䢢\u0001"), this.name);
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return RequestBodySerializer.bytes(null, new byte[0]);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("䢣\u0001"));
    }

    public void setName(String str) {
        this.name = str;
    }
}
