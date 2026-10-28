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
public class DeleteFileMetaIndexRequest extends AppIdRequest {
    private DeleteFileMetaIndex deleteFileMetaIndex;

    public DeleteFileMetaIndexRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䣫\u0001"), ProtectedSandApp.s("䣬\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䣭\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䣮\u0001");
    }

    public void setDeleteFileMetaIndex(@o0 DeleteFileMetaIndex deleteFileMetaIndex) {
        this.deleteFileMetaIndex = deleteFileMetaIndex;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䣬\u0001"), QCloudJsonUtils.toJson(this.deleteFileMetaIndex).getBytes(ProtectedSandApp.s("䣯\u0001")));
    }
}
