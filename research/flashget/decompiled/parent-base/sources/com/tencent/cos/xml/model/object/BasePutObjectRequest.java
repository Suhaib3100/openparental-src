package com.tencent.cos.xml.model.object;

import android.content.Context;
import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlBaseService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.tag.UrlUploadPolicy;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class BasePutObjectRequest extends UploadRequest implements TransferRequest {
    protected byte[] data;
    protected long fileLength;
    protected InputStream inputStream;
    protected CosXmlProgressListener progressListener;
    protected String srcPath;
    protected String strData;
    protected Uri uri;
    protected URL url;
    protected UrlUploadPolicy urlUploadPolicy;

    protected BasePutObjectRequest(String str, String str2) {
        super(str, str2);
        setNeedMD5(true);
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        Context appContext;
        super.checkParameters();
        String str = this.srcPath;
        if (str == null && this.data == null && this.inputStream == null && this.strData == null && this.uri == null && this.url == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("㪃\u0001"));
        }
        String s4 = ProtectedSandApp.s("㪄\u0001");
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

    public long getFileLength() {
        if (this.srcPath != null) {
            this.fileLength = new File(this.srcPath).length();
        } else {
            if (this.data != null) {
                this.fileLength = r0.length;
            } else {
                if (this.strData != null) {
                    this.fileLength = r0.getBytes().length;
                }
            }
        }
        return this.fileLength;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㪅\u0001");
    }

    public CosXmlProgressListener getProgressListener() {
        return this.progressListener;
    }

    public String getSrcPath() {
        return this.srcPath;
    }

    public String getStrData() {
        return this.strData;
    }

    public Uri getUri() {
        return this.uri;
    }

    public URL getUrl() {
        return this.url;
    }

    public UrlUploadPolicy getUrlUploadPolicy() {
        return this.urlUploadPolicy;
    }

    public boolean isPriorityLow() {
        return this.priority == 1;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
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

    public void setStrData(String str) {
        this.strData = str;
    }

    @Override // com.tencent.cos.xml.model.object.TransferRequest
    public void setTrafficLimit(long j4) {
        addHeader(ProtectedSandApp.s("㪆\u0001"), String.valueOf(j4));
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public void setUrlUploadPolicy(UrlUploadPolicy urlUploadPolicy) {
        this.urlUploadPolicy = urlUploadPolicy;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        if (this.srcPath != null) {
            return RequestBodySerializer.file(getContentType(), new File(this.srcPath));
        }
        if (this.data != null) {
            return RequestBodySerializer.bytes(getContentType(), this.data);
        }
        if (this.inputStream != null) {
            return RequestBodySerializer.stream(getContentType(), new File(CosXmlBaseService.appCachePath, String.valueOf(System.currentTimeMillis())), this.inputStream);
        }
        if (this.strData != null) {
            return RequestBodySerializer.bytes(getContentType(), this.strData.getBytes());
        }
        if (this.url != null) {
            return RequestBodySerializer.url(getContentType(), this.url);
        }
        if (this.uri == null || ContextHolder.getAppContext() == null) {
            return null;
        }
        return RequestBodySerializer.uri(getContentType(), this.uri, ContextHolder.getAppContext());
    }

    public BasePutObjectRequest(String str, String str2, String str3) {
        this(str, str2);
        this.srcPath = str3;
    }

    public BasePutObjectRequest(String str, String str2, Uri uri) {
        this(str, str2);
        this.uri = uri;
    }

    public BasePutObjectRequest(String str, String str2, byte[] bArr) {
        this(str, str2);
        this.data = bArr;
    }

    public BasePutObjectRequest(String str, String str2, StringBuilder sb) {
        this(str, str2);
        this.strData = sb.toString();
    }

    public BasePutObjectRequest(String str, String str2, InputStream inputStream) {
        this(str, str2);
        this.inputStream = inputStream;
    }

    public BasePutObjectRequest(String str, String str2, URL url) {
        this(str, str2);
        this.url = url;
        setNeedMD5(false);
    }
}
