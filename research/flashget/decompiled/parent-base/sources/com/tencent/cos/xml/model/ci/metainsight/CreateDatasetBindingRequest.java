package com.tencent.cos.xml.model.ci.metainsight;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.model.appid.AppIdRequest;
import com.tencent.cos.xml.utils.QCloudJsonUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class CreateDatasetBindingRequest extends AppIdRequest {
    private CreateDatasetBinding createDatasetBinding;

    public CreateDatasetBindingRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䣈\u0001"), ProtectedSandApp.s("䣉\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䣊\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䣋\u0001");
    }

    public void setCreateDatasetBinding(@o0 CreateDatasetBinding createDatasetBinding) {
        this.createDatasetBinding = createDatasetBinding;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䣉\u0001"), QCloudJsonUtils.toJson(this.createDatasetBinding).getBytes(ProtectedSandApp.s("䣌\u0001")));
    }
}
