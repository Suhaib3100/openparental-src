package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.RestoreConfigure;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class RestoreRequest extends ObjectRequest {
    private RestoreConfigure restoreConfigure;

    public RestoreRequest(String str, String str2) {
        super(str, str2);
        RestoreConfigure restoreConfigure = new RestoreConfigure();
        this.restoreConfigure = restoreConfigure;
        restoreConfigure.casJobParameters = new RestoreConfigure.CASJobParameters();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䦨\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䦩\u0001"), null);
        return this.queryParameters;
    }

    public RestoreConfigure getRestoreConfigure() {
        return this.restoreConfigure;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setExpireDays(int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        this.restoreConfigure.days = i4;
    }

    public void setTier(RestoreConfigure.Tier tier) {
        if (tier != null) {
            this.restoreConfigure.casJobParameters.tier = tier.getTier();
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("䦪\u0001"), XmlBuilder.buildRestore(this.restoreConfigure));
    }
}
