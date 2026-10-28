package com.tencent.cos.xml.model.bucket;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.RefererConfiguration;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class PutBucketRefererRequest extends BucketRequest {
    private final RefererConfiguration refererConfiguration;

    public PutBucketRefererRequest(String str, boolean z4, RefererConfiguration.RefererType refererType) {
        super(str);
        RefererConfiguration refererConfiguration = new RefererConfiguration();
        this.refererConfiguration = refererConfiguration;
        refererConfiguration.setEnabled(z4);
        refererConfiguration.setRefererType(refererType);
        refererConfiguration.setAllowEmptyRefer(false);
        refererConfiguration.domainList = new ArrayList();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        List<RefererConfiguration.Domain> list = this.refererConfiguration.domainList;
        if (list != null) {
            list.size();
        }
    }

    public boolean getAllowEmptyRefer() {
        return this.refererConfiguration.getAllowEmptyRefer();
    }

    public boolean getEnabled() {
        return this.refererConfiguration.getEnabled();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㛬\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㛭\u0001"), null);
        return super.getQueryString();
    }

    public RefererConfiguration.RefererType getRefererType() {
        return this.refererConfiguration.getRefererType();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㛮\u0001"), QCloudXmlUtils.toXml(this.refererConfiguration));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setAllowEmptyRefer(boolean z4) {
        this.refererConfiguration.setAllowEmptyRefer(z4);
    }

    public void setDomainList(@o0 List<RefererConfiguration.Domain> list) {
        this.refererConfiguration.domainList = list;
    }

    public void setEnabled(boolean z4) {
        this.refererConfiguration.setEnabled(z4);
    }

    public void setRefererType(@o0 RefererConfiguration.RefererType refererType) {
        this.refererConfiguration.setRefererType(refererType);
    }
}
