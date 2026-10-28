package com.tencent.cos.xml.model.ci.audit;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AddAuditTextlibKeywordRequest extends BucketRequest {
    private AddAuditTextlibKeyword createAuditTextlibKeyword;
    private final String libID;

    public AddAuditTextlibKeywordRequest(@o0 String str, @o0 String str2) {
        super(str);
        this.libID = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䁍\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return String.format(ProtectedSandApp.s("䁎\u0001"), this.libID);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("䁏\u0001"));
    }

    public void setAuditTextlib(@o0 AddAuditTextlibKeyword addAuditTextlibKeyword) {
        this.createAuditTextlibKeyword = addAuditTextlibKeyword;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䁑\u0001"), QCloudXmlUtils.toXml(this.createAuditTextlibKeyword).getBytes(ProtectedSandApp.s("䁐\u0001")));
    }
}
