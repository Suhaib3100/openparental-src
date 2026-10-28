package com.tencent.cos.xml.model.ci.audit;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DeleteAuditTextlibKeywordRequest extends BucketRequest {
    private DeleteAuditTextlibKeyword deleteAuditTextlibKeyword;
    private final String libID;

    public DeleteAuditTextlibKeywordRequest(@o0 String str, @o0 String str2) {
        super(str);
        DeleteAuditTextlibKeyword deleteAuditTextlibKeyword = new DeleteAuditTextlibKeyword();
        this.deleteAuditTextlibKeyword = deleteAuditTextlibKeyword;
        this.libID = str2;
        deleteAuditTextlibKeyword.keywordIDs = new ArrayList();
    }

    public void addKeywordID(@o0 String str) {
        this.deleteAuditTextlibKeyword.keywordIDs.add(str);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䂚\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return String.format(ProtectedSandApp.s("䂛\u0001"), this.libID);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("䂜\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䂞\u0001"), QCloudXmlUtils.toXml(this.deleteAuditTextlibKeyword).getBytes(ProtectedSandApp.s("䂝\u0001")));
    }
}
