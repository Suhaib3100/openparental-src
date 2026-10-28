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
public class SearchImageRequest extends AppIdRequest {
    private SearchImage searchImage;

    public SearchImageRequest(@o0 String str) {
        super(str);
        addHeader(ProtectedSandApp.s("䤐\u0001"), ProtectedSandApp.s("䤑\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䤒\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䤓\u0001");
    }

    public void setSearchImage(@o0 SearchImage searchImage) {
        this.searchImage = searchImage;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䤑\u0001"), QCloudJsonUtils.toJson(this.searchImage).getBytes(ProtectedSandApp.s("䤔\u0001")));
    }
}
