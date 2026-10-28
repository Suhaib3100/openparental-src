package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes6.dex */
public class GetBucketObjectVersionsRequest extends BucketRequest {
    private String delimiter;
    private String encodingType;
    private String keyMarker;
    private int maxKeys;
    private String prefix;
    private String versionIdMarker;

    public GetBucketObjectVersionsRequest(String str) {
        super(str);
        this.maxKeys = 1000;
    }

    public String getDelimiter() {
        return this.delimiter;
    }

    public String getKeyMarker() {
        return this.keyMarker;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㙺\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㙻\u0001"), null);
        addQuery(ProtectedSandApp.s("㙼\u0001"), this.prefix);
        addQuery(ProtectedSandApp.s("㙽\u0001"), this.delimiter);
        addQuery(ProtectedSandApp.s("㙾\u0001"), this.encodingType);
        addQuery(ProtectedSandApp.s("㙿\u0001"), this.keyMarker);
        addQuery(ProtectedSandApp.s("㚀\u0001"), this.versionIdMarker);
        addQuery(ProtectedSandApp.s("㚁\u0001"), String.valueOf(this.maxKeys));
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    public String getVersionIdMarker() {
        return this.versionIdMarker;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setKeyMarker(String str) {
        this.keyMarker = str;
    }

    public void setMaxKeys(int i4) {
        this.maxKeys = i4;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setVersionIdMarker(String str) {
        this.versionIdMarker = str;
    }

    public GetBucketObjectVersionsRequest(String str, String str2, String str3, String str4, String str5) {
        super(str);
        this.maxKeys = 1000;
        this.prefix = str2;
        this.delimiter = str3;
        this.keyMarker = str4;
        this.versionIdMarker = str5;
    }

    public GetBucketObjectVersionsRequest(String str, String str2, String str3, String str4) {
        this(str, "", str2, str3, str4);
    }
}
