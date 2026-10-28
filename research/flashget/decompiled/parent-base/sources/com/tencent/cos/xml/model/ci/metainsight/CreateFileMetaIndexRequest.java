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
public class CreateFileMetaIndexRequest extends AppIdRequest {
    private CreateFileMetaIndex createFileMetaIndex;

    public CreateFileMetaIndexRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䣒\u0001"), ProtectedSandApp.s("䣓\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䣔\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䣕\u0001");
    }

    public void setCreateFileMetaIndex(@o0 CreateFileMetaIndex createFileMetaIndex) {
        this.createFileMetaIndex = createFileMetaIndex;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䣓\u0001"), QCloudJsonUtils.toJson(this.createFileMetaIndex).getBytes(ProtectedSandApp.s("䣖\u0001")));
    }
}
