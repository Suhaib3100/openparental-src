package com.tencent.cos.xml.model.object;

import android.util.Base64;
import androidx.compose.material3.j4;
import androidx.constraintlayout.core.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.COSACL;
import com.tencent.cos.xml.common.COSStorageClass;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.common.MetaDataDirective;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.ACLAccount;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.cos.xml.utils.URLEncodeUtils;
import com.tencent.qcloud.core.auth.STSCredentialScope;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes7.dex */
public class CopyObjectRequest extends ObjectRequest {
    private CopySourceStruct copySourceStruct;

    public CopyObjectRequest(String str, String str2, CopySourceStruct copySourceStruct) {
        super(str, str2);
        this.copySourceStruct = copySourceStruct;
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        CopySourceStruct copySourceStruct = this.copySourceStruct;
        if (copySourceStruct == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䥃\u0001"));
        }
        copySourceStruct.checkParameters();
    }

    public CopySourceStruct getCopySource() {
        return this.copySourceStruct;
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest
    public String getCosPath() {
        return this.cosPath;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䥄\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return RequestBodySerializer.bytes(null, new byte[0]);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public STSCredentialScope[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        STSCredentialScope sTSCredentialScope = new STSCredentialScope(ProtectedSandApp.s("䥅\u0001"), cosXmlServiceConfig.getBucket(this.bucket), cosXmlServiceConfig.getRegion(), getPath(cosXmlServiceConfig));
        CopySourceStruct copySourceStruct = this.copySourceStruct;
        return STSCredentialScope.toArray(sTSCredentialScope, new STSCredentialScope(ProtectedSandApp.s("䥆\u0001"), copySourceStruct.bucket, copySourceStruct.region, copySourceStruct.cosPath));
    }

    public void setCopyIfMatch(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䥇\u0001"), str);
        }
    }

    public void setCopyIfModifiedSince(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䥈\u0001"), str);
        }
    }

    public void setCopyIfNoneMatch(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䥉\u0001"), str);
        }
    }

    public void setCopyIfUnmodifiedSince(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䥊\u0001"), str);
        }
    }

    public void setCopyMetaDataDirective(MetaDataDirective metaDataDirective) {
        if (metaDataDirective != null) {
            addHeader(ProtectedSandApp.s("䥋\u0001"), metaDataDirective.getMetaDirective());
        }
    }

    public void setCopySource(CopySourceStruct copySourceStruct, CosXmlServiceConfig cosXmlServiceConfig) throws CosXmlClientException {
        this.copySourceStruct = copySourceStruct;
        if (copySourceStruct != null) {
            addHeader(ProtectedSandApp.s("䥌\u0001"), copySourceStruct.getSource(cosXmlServiceConfig));
        }
    }

    public void setCopySourceServerSideEncryptionCustomerKey(String str) throws CosXmlClientException {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䥍\u0001"), ProtectedSandApp.s("䥎\u0001"));
            addHeader(ProtectedSandApp.s("䥏\u0001"), DigestUtils.getBase64(str));
            try {
                addHeader(ProtectedSandApp.s("䥒\u0001"), Base64.encodeToString(MessageDigest.getInstance(ProtectedSandApp.s("䥐\u0001")).digest(str.getBytes(Charset.forName(ProtectedSandApp.s("䥑\u0001")))), 2));
            } catch (NoSuchAlgorithmException e4) {
                throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e4);
            }
        }
    }

    public void setCopySourceServerSideEncryptionKMS(String str, String str2) throws CosXmlClientException {
        addHeader(ProtectedSandApp.s("䥓\u0001"), ProtectedSandApp.s("䥔\u0001"));
        if (str != null) {
            addHeader(ProtectedSandApp.s("䥕\u0001"), str);
        }
        if (str2 != null) {
            addHeader(ProtectedSandApp.s("䥖\u0001"), DigestUtils.getBase64(str2));
        }
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest
    public void setCosPath(String str) {
        this.cosPath = str;
    }

    public void setCosStorageClass(COSStorageClass cOSStorageClass) {
        if (cOSStorageClass != null) {
            addHeader(ProtectedSandApp.s("䥗\u0001"), cOSStorageClass.getStorageClass());
        }
    }

    public void setXCOSACL(COSACL cosacl) {
        if (cosacl != null) {
            addHeader(ProtectedSandApp.s("䥘\u0001"), cosacl.getAcl());
        }
    }

    public void setXCOSGrantRead(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䥙\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSGrantWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䥚\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSMeta(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        addHeader(str, str2);
    }

    public void setXCOSReadWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䥛\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSACL(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䥘\u0001"), str);
        }
    }

    public static class CopySourceStruct {
        public String bucket;
        public String cosPath;
        public String region;
        public String versionId;

        public CopySourceStruct(String str, String str2, String str3) {
            this.bucket = str;
            this.region = str2;
            this.cosPath = str3;
        }

        public void checkParameters() throws CosXmlClientException {
            if (this.bucket == null) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䥀\u0001"));
            }
            String str = this.cosPath;
            if (str == null) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䤿\u0001"));
            }
            if (this.region == null) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䤾\u0001"));
            }
            this.cosPath = URLEncodeUtils.cosPathEncode(str);
        }

        public String getSource(CosXmlServiceConfig cosXmlServiceConfig) {
            String str = this.cosPath;
            if (str != null) {
                String s4 = ProtectedSandApp.s("䥁\u0001");
                if (!str.startsWith(s4)) {
                    this.cosPath = s4 + this.cosPath;
                }
            }
            StringBuilder a5 = j4.a(cosXmlServiceConfig.getDefaultRequestHost(this.region, this.bucket));
            a5.append(this.cosPath);
            String sb = a5.toString();
            if (this.versionId == null) {
                return sb;
            }
            StringBuilder a6 = e.a(sb, ProtectedSandApp.s("䥂\u0001"));
            a6.append(this.versionId);
            return a6.toString();
        }

        @Deprecated
        public CopySourceStruct(String str, String str2, String str3, String str4) {
            this.bucket = str2.concat(ProtectedSandApp.s("䤽\u0001")).concat(str);
            this.region = str3;
            this.cosPath = str4;
        }

        public CopySourceStruct(String str, String str2, String str3, String str4, String str5) {
            this(str, str2, str3, str4);
            this.versionId = str5;
        }
    }
}
