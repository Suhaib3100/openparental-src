package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudDigistListener;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.core.util.Base64Utils;
import com.tencent.qcloud.core.util.OkhttpInternalUtils;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okhttp3.e0;
import okhttp3.x;
import okio.a0;
import okio.n;
import okio.o;

/* loaded from: classes7.dex */
public class StreamingRequestBody extends e0 implements ProgressBody, QCloudDigistListener {
    protected byte[] bytes;
    protected ContentResolver contentResolver;
    protected String contentType;
    protected CountingSink countingSink;
    protected File file;
    protected QCloudProgressListener progressListener;
    protected InputStream stream;
    protected Uri uri;
    protected URL url;
    protected long offset = 0;
    protected long requiredLength = -1;
    protected long contentRawLength = -1;
    private boolean deleteFileWhenComplete = false;

    protected StreamingRequestBody() {
    }

    static StreamingRequestBody bytes(byte[] bArr, String str, long j4, long j5) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.bytes = bArr;
        streamingRequestBody.contentType = str;
        if (j4 < 0) {
            j4 = 0;
        }
        streamingRequestBody.offset = j4;
        streamingRequestBody.requiredLength = j5;
        return streamingRequestBody;
    }

    static StreamingRequestBody file(File file, String str) {
        return file(file, str, 0L, Long.MAX_VALUE);
    }

    static StreamingRequestBody steam(InputStream inputStream, File file, String str, long j4, long j5) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.stream = inputStream;
        streamingRequestBody.contentType = str;
        streamingRequestBody.file = file;
        if (j4 < 0) {
            j4 = 0;
        }
        streamingRequestBody.offset = j4;
        streamingRequestBody.requiredLength = j5;
        streamingRequestBody.deleteFileWhenComplete = true;
        return streamingRequestBody;
    }

    static StreamingRequestBody uri(Uri uri, ContentResolver contentResolver, String str, long j4, long j5) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.uri = uri;
        streamingRequestBody.contentResolver = contentResolver;
        streamingRequestBody.contentType = str;
        if (j4 < 0) {
            j4 = 0;
        }
        streamingRequestBody.offset = j4;
        streamingRequestBody.requiredLength = j5;
        return streamingRequestBody;
    }

    static StreamingRequestBody url(URL url, String str, long j4, long j5) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.url = url;
        streamingRequestBody.contentType = str;
        if (j4 < 0) {
            j4 = 0;
        }
        streamingRequestBody.offset = j4;
        streamingRequestBody.requiredLength = j5;
        return streamingRequestBody;
    }

    @Override // okhttp3.e0
    public long contentLength() throws IOException {
        long max;
        long contentRawLength = getContentRawLength();
        if (contentRawLength <= 0) {
            max = Math.max(this.requiredLength, -1L);
        } else {
            long j4 = this.requiredLength;
            max = j4 <= 0 ? Math.max(contentRawLength - this.offset, -1L) : Math.min(contentRawLength - this.offset, j4);
        }
        if (max < 0) {
            return -1L;
        }
        return max;
    }

    @Override // okhttp3.e0
    /* renamed from: contentType */
    public x getContentType() {
        String str = this.contentType;
        if (str != null) {
            return x.j(str);
        }
        return null;
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public long getBytesTransferred() {
        CountingSink countingSink = this.countingSink;
        if (countingSink != null) {
            return countingSink.getTotalTransferred();
        }
        return 0L;
    }

    protected long getContentRawLength() throws IOException {
        if (this.contentRawLength < 0) {
            if (this.stream != null) {
                this.contentRawLength = r0.available();
            } else {
                File file = this.file;
                if (file != null) {
                    this.contentRawLength = file.length();
                } else {
                    if (this.bytes != null) {
                        this.contentRawLength = r0.length;
                    } else {
                        Uri uri = this.uri;
                        if (uri != null) {
                            this.contentRawLength = QCloudUtils.getUriContentLength(uri, this.contentResolver);
                        }
                    }
                }
            }
        }
        return this.contentRawLength;
    }

    public QCloudProgressListener getProgressListener() {
        return this.progressListener;
    }

    /* JADX WARN: Finally extract failed */
    public InputStream getStream() throws IOException {
        InputStream fileInputStream;
        if (this.bytes != null) {
            fileInputStream = new ByteArrayInputStream(this.bytes);
        } else {
            InputStream inputStream = this.stream;
            if (inputStream != null) {
                try {
                    saveInputStreamToTmpFile(inputStream, this.file);
                    InputStream inputStream2 = this.stream;
                    if (inputStream2 != null) {
                        OkhttpInternalUtils.closeQuietly(inputStream2);
                    }
                    this.stream = null;
                    this.offset = 0L;
                    fileInputStream = new FileInputStream(this.file);
                } catch (Throwable th) {
                    InputStream inputStream3 = this.stream;
                    if (inputStream3 != null) {
                        OkhttpInternalUtils.closeQuietly(inputStream3);
                    }
                    this.stream = null;
                    this.offset = 0L;
                    throw th;
                }
            } else if (this.file != null) {
                fileInputStream = new FileInputStream(this.file);
            } else {
                URL url = this.url;
                if (url != null) {
                    URLConnection openConnection = url.openConnection();
                    if (this.offset > 0) {
                        openConnection.setRequestProperty(ProtectedSandApp.s("姖\u0001"), ProtectedSandApp.s("委\u0001") + this.offset + ProtectedSandApp.s("姕\u0001") + this.offset + this.requiredLength);
                    }
                    fileInputStream = this.url.openStream();
                } else {
                    Uri uri = this.uri;
                    fileInputStream = uri != null ? this.contentResolver.openInputStream(uri) : null;
                }
            }
        }
        if (this.url == null && fileInputStream != null) {
            long j4 = this.offset;
            if (j4 > 0) {
                long skip = fileInputStream.skip(j4);
                if (skip < this.offset) {
                    COSLogger.wNetwork(ProtectedSandApp.s("姗\u0001"), ProtectedSandApp.s("姘\u0001"), Long.valueOf(skip), Long.valueOf(this.offset));
                }
            }
        }
        return fileInputStream;
    }

    boolean isLargeData() {
        return (this.file == null && this.uri == null && this.stream == null) ? false : true;
    }

    @Override // com.tencent.qcloud.core.common.QCloudDigistListener
    public String onGetMd5() throws IOException {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("姙\u0001"));
                byte[] bArr = this.bytes;
                if (bArr != null) {
                    messageDigest.update(bArr, (int) this.offset, (int) contentLength());
                    return Base64Utils.encode(messageDigest.digest());
                }
                InputStream stream = getStream();
                byte[] bArr2 = new byte[8192];
                long contentLength = contentLength();
                while (contentLength > 0) {
                    int read = stream.read(bArr2, 0, ((long) 8192) > contentLength ? (int) contentLength : 8192);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr2, 0, read);
                    contentLength -= read;
                }
                String encode = Base64Utils.encode(messageDigest.digest());
                if (stream != null) {
                    OkhttpInternalUtils.closeQuietly(stream);
                }
                return encode;
            } catch (IOException e4) {
                throw e4;
            } catch (NoSuchAlgorithmException e5) {
                throw new IOException(ProtectedSandApp.s("姚\u0001"), e5);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                OkhttpInternalUtils.closeQuietly(null);
            }
            throw th;
        }
    }

    public void release() {
        File file;
        if (!this.deleteFileWhenComplete || (file = this.file) == null) {
            return;
        }
        file.delete();
    }

    protected void saveInputStreamToTmpFile(InputStream inputStream, File file) throws IOException {
        int read;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                long contentLength = contentLength();
                long j4 = 0;
                if (contentLength < 0) {
                    contentLength = Long.MAX_VALUE;
                }
                long j5 = this.offset;
                if (j5 > 0) {
                    inputStream.skip(j5);
                }
                while (j4 < contentLength && (read = inputStream.read(bArr)) != -1) {
                    long j6 = read;
                    fileOutputStream2.write(bArr, 0, (int) Math.min(j6, contentLength - j4));
                    j4 += j6;
                }
                fileOutputStream2.flush();
                OkhttpInternalUtils.closeQuietly(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    OkhttpInternalUtils.closeQuietly(fileOutputStream);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public void setProgressListener(QCloudProgressListener qCloudProgressListener) {
        this.progressListener = qCloudProgressListener;
    }

    @Override // okhttp3.e0
    public void writeTo(n nVar) throws IOException {
        o oVar;
        InputStream inputStream = null;
        r0 = null;
        o oVar2 = null;
        try {
            InputStream stream = getStream();
            if (stream != null) {
                try {
                    oVar2 = a0.d(a0.m(stream));
                    long contentLength = contentLength();
                    CountingSink countingSink = new CountingSink(nVar, contentLength, this.progressListener);
                    this.countingSink = countingSink;
                    n c5 = a0.c(countingSink);
                    if (contentLength > 0) {
                        c5.f3(oVar2, contentLength);
                    } else {
                        c5.b1(oVar2);
                    }
                    c5.flush();
                } catch (Throwable th) {
                    th = th;
                    oVar = oVar2;
                    inputStream = stream;
                    if (inputStream != null) {
                        OkhttpInternalUtils.closeQuietly(inputStream);
                    }
                    if (oVar != null) {
                        OkhttpInternalUtils.closeQuietly(oVar);
                    }
                    throw th;
                }
            }
            if (stream != null) {
                OkhttpInternalUtils.closeQuietly(stream);
            }
            if (oVar2 != null) {
                OkhttpInternalUtils.closeQuietly(oVar2);
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = null;
        }
    }

    static StreamingRequestBody file(File file, String str, long j4, long j5) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.file = file;
        streamingRequestBody.contentType = str;
        if (j4 < 0) {
            j4 = 0;
        }
        streamingRequestBody.offset = j4;
        streamingRequestBody.requiredLength = j5;
        return streamingRequestBody;
    }
}
