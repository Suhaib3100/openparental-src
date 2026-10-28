package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

@Deprecated
/* loaded from: classes6.dex */
public class ListBucketVersionsRequest extends BucketRequest {
    private String delimiter;
    private String encodingType;
    private String keyMarker;
    private String maxKeys;
    private String prefix;
    private String versionIdMarker;

    public ListBucketVersionsRequest(String str) {
        super(str);
        this.maxKeys = ProtectedSandApp.s("㚜\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㚝\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㚞\u0001"), null);
        String str = this.prefix;
        if (str != null) {
            this.queryParameters.put(ProtectedSandApp.s("㚟\u0001"), str);
        }
        String str2 = this.keyMarker;
        if (str2 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㚠\u0001"), str2);
        }
        String str3 = this.versionIdMarker;
        if (str3 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㚡\u0001"), str3);
        }
        String str4 = this.delimiter;
        if (str4 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㚢\u0001"), str4);
        }
        String str5 = this.encodingType;
        if (str5 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㚣\u0001"), str5);
        }
        if (!this.maxKeys.equals(ProtectedSandApp.s("㚜\u0001"))) {
            this.queryParameters.put(ProtectedSandApp.s("㚤\u0001"), this.maxKeys);
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setKeyMarker(String str) {
        if (str != null) {
            this.keyMarker = str;
        }
    }

    public void setMaxKeys(int i4) {
        this.maxKeys = String.valueOf(i4);
    }

    public void setPrefix(String str) {
        if (str != null) {
            this.prefix = str;
        }
    }

    public void setVersionIdMarker(String str) {
        if (str != null) {
            this.versionIdMarker = str;
        }
    }
}
