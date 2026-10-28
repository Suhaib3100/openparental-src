package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.qcloud.core.auth.STSCredentialScope;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GetBucketRequest extends BucketRequest {
    private String delimiter;
    private String encodingType;
    private String marker;
    private String maxKeys;
    private String prefix;

    public GetBucketRequest(String str) {
        super(str);
        this.prefix = null;
        this.delimiter = null;
        this.marker = null;
        this.maxKeys = ProtectedSandApp.s("㚈\u0001");
    }

    public String getDelimiter() {
        return this.delimiter;
    }

    public String getEncodingType() {
        return this.encodingType;
    }

    public String getMarker() {
        return this.marker;
    }

    public long getMaxKeys() {
        return Long.parseLong(this.maxKeys);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㚉\u0001");
    }

    public String getPrefix() {
        return this.prefix;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        String str = this.prefix;
        String s4 = ProtectedSandApp.s("㚊\u0001");
        if (str != null) {
            this.queryParameters.put(s4, str);
        }
        String str2 = this.delimiter;
        if (str2 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㚋\u0001"), str2);
        }
        String str3 = this.encodingType;
        if (str3 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㚌\u0001"), str3);
        }
        String str4 = this.marker;
        if (str4 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㚍\u0001"), str4);
        }
        String str5 = this.maxKeys;
        if (str5 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㚎\u0001"), str5);
        }
        String str6 = this.prefix;
        if (str6 != null) {
            this.queryParameters.put(s4, str6);
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public STSCredentialScope[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        String str = ProtectedSandApp.s("㚏\u0001") + ProtectedSandApp.s("㚑\u0001").replace(ProtectedSandApp.s("㚐\u0001"), "");
        String bucket = cosXmlServiceConfig.getBucket(this.bucket);
        String region = cosXmlServiceConfig.getRegion();
        String str2 = this.prefix;
        return new STSCredentialScope(str, bucket, region, str2 == null ? null : cosXmlServiceConfig.getUrlPath(this.bucket, str2)).toArray();
    }

    @Deprecated
    public void setDelimiter(char c5) {
        setDelimiter(String.valueOf(c5));
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setMarker(String str) {
        this.marker = str;
    }

    public void setMaxKeys(long j4) {
        this.maxKeys = String.valueOf(j4);
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public GetBucketRequest(String str, String str2, String str3) {
        super(str2);
        this.delimiter = null;
        this.marker = null;
        this.maxKeys = ProtectedSandApp.s("㚈\u0001");
        this.region = str;
        this.prefix = str3;
    }
}
