package com.tencent.cos.xml.model.ci.ai;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DeleteImageSearchRequest extends BucketRequest {
    public String action;
    public String ciProcess;
    private DeleteImageSearch deleteImageSearch;
    protected final String objectKey;

    public DeleteImageSearchRequest(@o0 String str, @o0 String str2) {
        super(str);
        this.ciProcess = ProtectedSandApp.s("㰦\u0001");
        this.action = ProtectedSandApp.s("㰧\u0001");
        this.objectKey = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㰨\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㰩\u0001") + this.objectKey;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㰪\u0001"), this.ciProcess);
        this.queryParameters.put(ProtectedSandApp.s("㰫\u0001"), this.action);
        return super.getQueryString();
    }

    public void setDeleteImageSearch(@o0 DeleteImageSearch deleteImageSearch) {
        this.deleteImageSearch = deleteImageSearch;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("㰭\u0001"), QCloudXmlUtils.toXml(this.deleteImageSearch).getBytes(ProtectedSandApp.s("㰬\u0001")));
    }
}
