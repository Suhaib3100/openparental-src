package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public final class GetObjectBytesRequest extends ObjectRequest {
    private boolean objectKeySimplifyCheck;

    public GetObjectBytesRequest(String str, String str2) {
        super(str, str2);
        this.objectKeySimplifyCheck = true;
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        String s4 = ProtectedSandApp.s("䥪\u0001");
        super.checkParameters();
        if (this.objectKeySimplifyCheck) {
            String str = this.cosPath;
            try {
                str = new File(s4 + this.cosPath).getCanonicalPath();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            if (s4.equals(str)) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䥫\u0001"));
            }
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䥬\u0001");
    }

    public void setObjectKeySimplifyCheck(boolean z4) {
        this.objectKeySimplifyCheck = z4;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return null;
    }
}
