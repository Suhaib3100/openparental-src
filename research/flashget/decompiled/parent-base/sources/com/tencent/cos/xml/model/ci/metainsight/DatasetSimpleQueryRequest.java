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
public class DatasetSimpleQueryRequest extends AppIdRequest {
    private DatasetSimpleQuery datasetSimpleQuery;

    public DatasetSimpleQueryRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䣜\u0001"), ProtectedSandApp.s("䣝\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䣞\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䣟\u0001");
    }

    public void setDatasetSimpleQuery(@o0 DatasetSimpleQuery datasetSimpleQuery) {
        this.datasetSimpleQuery = datasetSimpleQuery;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䣝\u0001"), QCloudJsonUtils.toJson(this.datasetSimpleQuery).getBytes(ProtectedSandApp.s("䣠\u0001")));
    }
}
