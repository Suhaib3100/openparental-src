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
public class CreateDatasetRequest extends AppIdRequest {
    private CreateDataset createDataset;

    public CreateDatasetRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䣍\u0001"), ProtectedSandApp.s("䣎\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䣏\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䣐\u0001");
    }

    public void setCreateDataset(@o0 CreateDataset createDataset) {
        this.createDataset = createDataset;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䣎\u0001"), QCloudJsonUtils.toJson(this.createDataset).getBytes(ProtectedSandApp.s("䣑\u0001")));
    }
}
