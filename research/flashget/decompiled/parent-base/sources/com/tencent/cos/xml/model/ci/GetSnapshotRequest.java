package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.GetObjectRequest;

/* loaded from: classes7.dex */
public class GetSnapshotRequest extends GetObjectRequest {
    private float time;

    public GetSnapshotRequest(String str, String str2, String str3, String str4, float f4) {
        super(str, str2, str3, str4);
        this.time = f4;
        this.queryParameters.put(ProtectedSandApp.s("㩺\u0001"), ProtectedSandApp.s("㩻\u0001"));
        this.queryParameters.put(ProtectedSandApp.s("㩼\u0001"), String.valueOf(f4));
    }

    @Override // com.tencent.cos.xml.model.object.GetObjectRequest, com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
    }

    @Override // com.tencent.cos.xml.model.object.GetObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㩽\u0001");
    }

    public void setFormat(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㩾\u0001"), str);
    }

    public void setHeight(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㩿\u0001"), String.valueOf(i4));
    }

    public void setMode(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㪀\u0001"), str);
    }

    public void setRotate(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㪁\u0001"), str);
    }

    public void setWidth(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㪂\u0001"), String.valueOf(i4));
    }
}
