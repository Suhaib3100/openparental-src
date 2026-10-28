package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.Tagging;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class PutObjectTaggingRequest extends ObjectRequest {
    private Tagging tagging;
    private String versionId;

    public PutObjectTaggingRequest(String str, String str2) {
        super(str, str2);
        this.tagging = new Tagging();
    }

    public void addTag(String str, String str2) {
        this.tagging.tagSet.addTag(new Tagging.Tag(str, str2));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䦤\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䦥\u0001"), null);
        String str = this.versionId;
        if (str != null) {
            this.queryParameters.put(ProtectedSandApp.s("䦦\u0001"), str);
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return RequestBodySerializer.string(ProtectedSandApp.s("䦧\u0001"), QCloudXmlUtils.toXml(this.tagging));
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }
}
