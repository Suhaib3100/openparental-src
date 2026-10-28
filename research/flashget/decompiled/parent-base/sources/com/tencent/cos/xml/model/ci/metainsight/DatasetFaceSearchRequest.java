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
public class DatasetFaceSearchRequest extends AppIdRequest {
    private DatasetFaceSearch datasetFaceSearch;

    public DatasetFaceSearchRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䣗\u0001"), ProtectedSandApp.s("䣘\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䣙\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䣚\u0001");
    }

    public void setDatasetFaceSearch(@o0 DatasetFaceSearch datasetFaceSearch) {
        this.datasetFaceSearch = datasetFaceSearch;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䣘\u0001"), QCloudJsonUtils.toJson(this.datasetFaceSearch).getBytes(ProtectedSandApp.s("䣛\u0001")));
    }
}
