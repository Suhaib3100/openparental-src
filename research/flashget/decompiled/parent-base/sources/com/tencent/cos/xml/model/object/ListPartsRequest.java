package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ListPartsRequest extends BaseMultipartUploadRequest {
    private String encodingType;
    private String maxParts;
    private String partNumberMarker;
    private String uploadId;

    public ListPartsRequest(String str, String str2, String str3) {
        super(str, str2);
        this.uploadId = str3;
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (this.requestURL == null && this.uploadId == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䦁\u0001"));
        }
    }

    public String getEncodingType() {
        return this.encodingType;
    }

    public int getMaxParts() {
        return Integer.parseInt(this.maxParts);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䦂\u0001");
    }

    public int getPartNumberMarker() {
        return Integer.parseInt(this.partNumberMarker);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public int getPriority() {
        return 3;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        String str = this.uploadId;
        if (str != null) {
            this.queryParameters.put(ProtectedSandApp.s("䦃\u0001"), str);
        }
        String str2 = this.maxParts;
        if (str2 != null) {
            this.queryParameters.put(ProtectedSandApp.s("䦄\u0001"), str2);
        }
        String str3 = this.partNumberMarker;
        if (str3 != null) {
            this.queryParameters.put(ProtectedSandApp.s("䦅\u0001"), str3);
        }
        String str4 = this.encodingType;
        if (str4 != null) {
            this.queryParameters.put(ProtectedSandApp.s("䦆\u0001"), str4);
        }
        return this.queryParameters;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setMaxParts(int i4) {
        if (i4 <= 0) {
            i4 = 1;
        }
        this.maxParts = String.valueOf(i4);
    }

    public void setPartNumberMarker(int i4) {
        this.partNumberMarker = String.valueOf(i4);
    }

    public void setUploadId(String str) {
        this.uploadId = str;
    }

    public void setPartNumberMarker(String str) {
        this.partNumberMarker = str;
    }
}
