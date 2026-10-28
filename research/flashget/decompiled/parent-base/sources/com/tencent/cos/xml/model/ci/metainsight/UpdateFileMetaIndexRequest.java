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
public class UpdateFileMetaIndexRequest extends AppIdRequest {
    private UpdateFileMetaIndex updateFileMetaIndex;

    public UpdateFileMetaIndexRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䤚\u0001"), ProtectedSandApp.s("䤛\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䤜\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䤝\u0001");
    }

    public void setUpdateFileMetaIndex(@o0 UpdateFileMetaIndex updateFileMetaIndex) {
        this.updateFileMetaIndex = updateFileMetaIndex;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䤛\u0001"), QCloudJsonUtils.toJson(this.updateFileMetaIndex).getBytes(ProtectedSandApp.s("䤞\u0001")));
    }
}
