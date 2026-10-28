package com.tencent.cos.xml.model.object;

import android.content.Context;
import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlBaseService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public final class UploadPartRequest extends BaseMultipartUploadRequest implements TransferRequest {
    private byte[] data;
    private long fileContentLength;
    private long fileOffset;
    private InputStream inputStream;
    private boolean lastPart;
    private int partNumber;
    private CosXmlProgressListener progressListener;
    private String srcPath;
    private String uploadId;
    private Uri uri;
    private URL url;

    private UploadPartRequest(String str, String str2) {
        super(str, str2);
        this.fileOffset = -1L;
        this.fileContentLength = -1L;
        setNeedMD5(true);
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        Context appContext;
        super.checkParameters();
        if (this.requestURL == null) {
            if (this.partNumber <= 0) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䦹\u0001"));
            }
            if (this.uploadId == null) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䦸\u0001"));
            }
        }
        String str = this.srcPath;
        if (str == null && this.data == null && this.inputStream == null && this.uri == null && this.url == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䦺\u0001"));
        }
        String s4 = ProtectedSandApp.s("䦻\u0001");
        if (str != null && !new File(this.srcPath).exists()) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), s4);
        }
        if (this.uri != null && (appContext = ContextHolder.getAppContext()) != null && !QCloudUtils.doesUriFileExist(this.uri, appContext.getContentResolver())) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), s4);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public long getFileContentLength() {
        return this.fileContentLength;
    }

    public long getFileLength() {
        if (this.data != null) {
            this.fileContentLength = r0.length;
        } else if (this.srcPath != null && this.fileContentLength == -1) {
            this.fileContentLength = new File(this.srcPath).length();
        }
        return this.fileContentLength;
    }

    public long getFileOffset() {
        return this.fileOffset;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䦼\u0001");
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public CosXmlProgressListener getProgressListener() {
        return this.progressListener;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䦽\u0001"), String.valueOf(this.partNumber));
        this.queryParameters.put(ProtectedSandApp.s("䦾\u0001"), this.uploadId);
        return super.getQueryString();
    }

    public String getSrcPath() {
        return this.srcPath;
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean isLastPart() {
        return this.lastPart;
    }

    public boolean isPriorityLow() {
        return this.priority == 1;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setFileContentLength(long j4) {
        this.fileContentLength = j4;
    }

    public void setFileOffset(long j4) {
        this.fileOffset = j4;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void setLastPart(boolean z4) {
        this.lastPart = z4;
    }

    public void setPartNumber(int i4) {
        this.partNumber = i4;
    }

    public void setPriorityLow() {
        this.priority = 1;
    }

    public void setProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.progressListener = cosXmlProgressListener;
    }

    public void setSrcPath(String str) {
        this.srcPath = str;
    }

    @Override // com.tencent.cos.xml.model.object.TransferRequest
    public void setTrafficLimit(long j4) {
        addHeader(ProtectedSandApp.s("䦿\u0001"), String.valueOf(j4));
    }

    public void setUploadId(String str) {
        this.uploadId = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        if (this.srcPath != null) {
            return this.fileOffset != -1 ? RequestBodySerializer.file(getContentType(), new File(this.srcPath), this.fileOffset, this.fileContentLength) : RequestBodySerializer.file(getContentType(), new File(this.srcPath));
        }
        if (this.data != null) {
            return RequestBodySerializer.bytes(getContentType(), this.data);
        }
        if (this.inputStream != null) {
            return RequestBodySerializer.stream(getContentType(), new File(CosXmlBaseService.appCachePath, String.valueOf(System.currentTimeMillis())), this.inputStream);
        }
        if (this.uri != null && ContextHolder.getAppContext() != null) {
            return RequestBodySerializer.uri(getContentType(), this.uri, ContextHolder.getAppContext(), this.fileOffset, this.fileContentLength);
        }
        if (this.url != null) {
            return this.fileOffset != -1 ? RequestBodySerializer.url(getContentType(), this.url, this.fileOffset, this.fileContentLength) : RequestBodySerializer.url(getContentType(), this.url);
        }
        return null;
    }

    public void setSrcPath(String str, long j4, long j5) {
        this.srcPath = str;
        this.fileOffset = j4;
        this.fileContentLength = j5;
    }

    public UploadPartRequest(String str, String str2, int i4, String str3, String str4) {
        this(str, str2);
        this.partNumber = i4;
        this.srcPath = str3;
        this.uploadId = str4;
        this.fileOffset = -1L;
        this.fileContentLength = -1L;
    }

    public UploadPartRequest(String str, String str2, int i4, Uri uri, String str3) {
        this(str, str2);
        this.partNumber = i4;
        this.uri = uri;
        this.uploadId = str3;
        this.fileOffset = -1L;
        this.fileContentLength = -1L;
    }

    public UploadPartRequest(String str, String str2, int i4, String str3, long j4, long j5, String str4) {
        this(str, str2);
        this.partNumber = i4;
        setSrcPath(str3, j4, j5);
        this.uploadId = str4;
    }

    public UploadPartRequest(String str, String str2, int i4, Uri uri, long j4, long j5, String str3) {
        this(str, str2);
        this.partNumber = i4;
        this.uri = uri;
        this.fileOffset = j4;
        this.fileContentLength = j5;
        this.uploadId = str3;
    }

    public UploadPartRequest(String str, String str2, int i4, byte[] bArr, String str3) {
        this(str, str2);
        this.partNumber = i4;
        this.data = bArr;
        this.uploadId = str3;
        this.fileOffset = -1L;
        this.fileContentLength = -1L;
    }

    public UploadPartRequest(String str, String str2, int i4, InputStream inputStream, String str3) throws CosXmlClientException {
        this(str, str2);
        this.partNumber = i4;
        this.inputStream = inputStream;
        this.uploadId = str3;
        this.fileOffset = -1L;
        this.fileContentLength = -1L;
    }

    public UploadPartRequest(String str, String str2, int i4, InputStream inputStream, long j4, String str3) throws CosXmlClientException {
        this(str, str2);
        this.partNumber = i4;
        this.inputStream = inputStream;
        this.uploadId = str3;
        this.fileOffset = 0L;
        this.fileContentLength = j4;
    }

    public UploadPartRequest(String str, String str2, int i4, URL url, String str3) {
        this(str, str2);
        this.partNumber = i4;
        this.url = url;
        this.uploadId = str3;
        this.fileOffset = -1L;
        this.fileContentLength = -1L;
        setNeedMD5(false);
    }

    public UploadPartRequest(String str, String str2, int i4, URL url, long j4, long j5, String str3) {
        this(str, str2);
        this.partNumber = i4;
        this.url = url;
        this.fileOffset = j4;
        this.fileContentLength = j5;
        this.uploadId = str3;
        setNeedMD5(false);
    }
}
