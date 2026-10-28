package com.tencent.cos.xml.model.object;

import androidx.compose.runtime.snapshots.f0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.CopyObjectRequest;
import java.util.Map;

/* loaded from: classes7.dex */
public class UploadPartCopyRequest extends CopyObjectRequest {
    private int partNumber;
    private String uploadId;

    public UploadPartCopyRequest(String str, String str2, int i4, String str3, CopyObjectRequest.CopySourceStruct copySourceStruct) throws CosXmlClientException {
        this(str, str2, i4, str3, copySourceStruct, -1L, -1L);
    }

    @Override // com.tencent.cos.xml.model.object.CopyObjectRequest, com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (this.requestURL != null) {
            return;
        }
        if (this.partNumber <= 0) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䦲\u0001"));
        }
        if (this.uploadId == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䦱\u0001"));
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䦳\u0001"), String.valueOf(this.partNumber));
        this.queryParameters.put(ProtectedSandApp.s("䦴\u0001"), this.uploadId);
        return super.getQueryString();
    }

    public void setCopyRange(long j4, long j5) {
        if (j4 < 0 || j5 < j4) {
            return;
        }
        StringBuilder a5 = f0.a(ProtectedSandApp.s("䦵\u0001"), j4, ProtectedSandApp.s("䦶\u0001"));
        a5.append(j5);
        addHeader(ProtectedSandApp.s("䦷\u0001"), a5.toString());
    }

    public UploadPartCopyRequest(String str, String str2, int i4, String str3, CopyObjectRequest.CopySourceStruct copySourceStruct, long j4, long j5) {
        super(str, str2, copySourceStruct);
        this.partNumber = i4;
        this.uploadId = str3;
        setCopyRange(j4, j5);
    }
}
