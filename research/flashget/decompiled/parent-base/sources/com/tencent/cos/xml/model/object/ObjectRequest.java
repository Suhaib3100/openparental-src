package com.tencent.cos.xml.model.object;

import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.utils.DigestUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class ObjectRequest extends CosXmlRequest {
    protected String cosPath;

    public ObjectRequest(String str, String str2) {
        this.bucket = str;
        this.cosPath = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (this.requestURL != null) {
            return;
        }
        String str = this.bucket;
        if (str == null || str.length() < 1) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("㩌\u0001"));
        }
        String str2 = this.cosPath;
        if (str2 == null || str2.length() < 1) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("㩋\u0001"));
        }
    }

    protected String getContentType() {
        List<String> list = this.requestHeaders.get(ProtectedSandApp.s("㩍\u0001"));
        if (list == null || list.isEmpty()) {
            list = this.requestHeaders.get(ProtectedSandApp.s("㩎\u0001"));
        }
        if (list == null || list.isEmpty()) {
            list = this.requestHeaders.get(ProtectedSandApp.s("㩏\u0001"));
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public String getCosPath() {
        return this.cosPath;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getUrlPath(this.bucket, this.cosPath);
    }

    public void setCOSServerSideEncryption() {
        addHeader(ProtectedSandApp.s("㩐\u0001"), ProtectedSandApp.s("㩑\u0001"));
    }

    public void setCOSServerSideEncryptionWithCustomerKey(String str) throws CosXmlClientException {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㩒\u0001"), ProtectedSandApp.s("㩑\u0001"));
            addHeader(ProtectedSandApp.s("㩓\u0001"), DigestUtils.getBase64(str));
            try {
                addHeader(ProtectedSandApp.s("㩖\u0001"), Base64.encodeToString(MessageDigest.getInstance(ProtectedSandApp.s("㩔\u0001")).digest(str.getBytes(Charset.forName(ProtectedSandApp.s("㩕\u0001")))), 2));
            } catch (NoSuchAlgorithmException e4) {
                throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e4);
            }
        }
    }

    public void setCOSServerSideEncryptionWithKMS(String str, String str2) throws CosXmlClientException {
        addHeader(ProtectedSandApp.s("㩐\u0001"), ProtectedSandApp.s("㩗\u0001"));
        if (str != null) {
            addHeader(ProtectedSandApp.s("㩘\u0001"), str);
        }
        if (str2 != null) {
            addHeader(ProtectedSandApp.s("㩙\u0001"), DigestUtils.getBase64(str2));
        }
    }

    public void setCosPath(String str) {
        this.cosPath = str;
    }
}
