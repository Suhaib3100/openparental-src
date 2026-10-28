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
public class UpdateDatasetRequest extends AppIdRequest {
    private UpdateDataset updateDataset;

    public UpdateDatasetRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䤕\u0001"), ProtectedSandApp.s("䤖\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䤗\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䤘\u0001");
    }

    public void setUpdateDataset(@o0 UpdateDataset updateDataset) {
        this.updateDataset = updateDataset;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䤖\u0001"), QCloudJsonUtils.toJson(this.updateDataset).getBytes(ProtectedSandApp.s("䤙\u0001")));
    }
}
