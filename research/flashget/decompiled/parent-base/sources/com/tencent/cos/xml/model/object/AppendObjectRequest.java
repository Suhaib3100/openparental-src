package com.tencent.cos.xml.model.object;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlBaseService;
import com.tencent.cos.xml.common.COSACL;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.tag.ACLAccount;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes7.dex */
public final class AppendObjectRequest extends ObjectRequest {
    private byte[] data;
    private long fileLength;
    public InputStream inputStream;
    private long position;
    private CosXmlProgressListener progressListener;
    private String srcPath;

    private AppendObjectRequest(String str, String str2) {
        super(str, str2);
        this.position = 0L;
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        String str = this.srcPath;
        if (str == null && this.data == null && this.inputStream == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䤧\u0001"));
        }
        if (str != null && !new File(this.srcPath).exists()) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䤨\u0001"));
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public long getFileLength() {
        if (this.srcPath != null) {
            this.fileLength = new File(this.srcPath).length();
        } else {
            if (this.data != null) {
                this.fileLength = r0.length;
            }
        }
        return this.fileLength;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䤩\u0001");
    }

    public long getPosition() {
        return this.position;
    }

    public CosXmlProgressListener getProgressListener() {
        return this.progressListener;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䤪\u0001"), null);
        this.queryParameters.put(ProtectedSandApp.s("䤫\u0001"), String.valueOf(this.position));
        return this.queryParameters;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        if (this.srcPath != null) {
            return RequestBodySerializer.file(getContentType(), new File(this.srcPath));
        }
        byte[] bArr = this.data;
        if (bArr != null) {
            return RequestBodySerializer.bytes(null, bArr);
        }
        if (this.inputStream != null) {
            return RequestBodySerializer.stream(getContentType(), new File(CosXmlBaseService.appCachePath, String.valueOf(System.currentTimeMillis())), this.inputStream);
        }
        return null;
    }

    public String getSrcPath() {
        return this.srcPath;
    }

    public void setCacheControl(@o0 String str) {
        addHeader(ProtectedSandApp.s("䤬\u0001"), str);
    }

    public void setContentDisposition(@o0 String str) {
        addHeader(ProtectedSandApp.s("䤭\u0001"), str);
    }

    public void setContentEncodeing(@o0 String str) {
        addHeader(ProtectedSandApp.s("䤮\u0001"), str);
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setExpires(@o0 String str) {
        addHeader(ProtectedSandApp.s("䤯\u0001"), str);
    }

    public void setPosition(long j4) {
        if (j4 < 0) {
            this.position = 0L;
        }
        this.position = j4;
    }

    public void setProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.progressListener = cosXmlProgressListener;
    }

    public void setSrcPath(String str) {
        this.srcPath = str;
    }

    public void setXCOSACL(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䤰\u0001"), str);
        }
    }

    public void setXCOSGrantRead(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䤱\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSGrantWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䤲\u0001"), aCLAccount.getAccount());
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
            addHeader(ProtectedSandApp.s("䤳\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSACL(COSACL cosacl) {
        if (cosacl != null) {
            addHeader(ProtectedSandApp.s("䤰\u0001"), cosacl.getAcl());
        }
    }

    public AppendObjectRequest(String str, String str2, String str3, long j4) {
        this(str, str2);
        this.srcPath = str3;
        this.position = j4;
    }

    public AppendObjectRequest(String str, String str2, byte[] bArr, long j4) {
        this(str, str2);
        this.data = bArr;
        this.position = j4;
    }

    public AppendObjectRequest(String str, String str2, InputStream inputStream, long j4) {
        this(str, str2);
        this.inputStream = inputStream;
        this.position = j4;
    }
}
