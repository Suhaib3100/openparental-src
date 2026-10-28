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
public class DeleteDatasetRequest extends AppIdRequest {
    private DeleteDataset deleteDataset;

    public DeleteDatasetRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䣦\u0001"), ProtectedSandApp.s("䣧\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䣨\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䣩\u0001");
    }

    public void setDeleteDataset(@o0 DeleteDataset deleteDataset) {
        this.deleteDataset = deleteDataset;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䣧\u0001"), QCloudJsonUtils.toJson(this.deleteDataset).getBytes(ProtectedSandApp.s("䣪\u0001")));
    }
}
