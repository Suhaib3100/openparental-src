package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.util.OkhttpInternalUtils;
import com.tencent.qcloud.core.util.QCloudHttpUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okio.m;

/* loaded from: classes7.dex */
public class ResponseFileConverter<T> extends ResponseBodyConverter<T> implements ProgressBody {
    private ContentResolver contentResolver;
    private Uri contentUri;
    private CountingSink countingSink;
    private String filePath;
    private InputStream inputStream;
    protected boolean isQuic = false;
    private long offset;
    protected QCloudProgressListener progressListener;

    public ResponseFileConverter(String str, long j4) {
        this.filePath = str;
        this.offset = j4;
    }

    private T downloadToAbsolutePath(HttpResponse<T> httpResponse, long j4) throws QCloudClientException, QCloudServiceException {
        File file = new File(this.filePath);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new QCloudClientException(new IOException(ProtectedSandApp.s("侨\u0001")));
        }
        if (httpResponse.response.o() == null) {
            throw new QCloudServiceException(ProtectedSandApp.s("侪\u0001"));
        }
        try {
            writeRandomAccessFile(file, httpResponse.byteStream(), j4);
            return null;
        } catch (IOException e4) {
            e4.printStackTrace();
            throw new QCloudClientException(ProtectedSandApp.s("侩\u0001") + e4.toString(), e4);
        }
    }

    private T pipeToContentUri(HttpResponse<T> httpResponse, long j4) throws QCloudClientException, QCloudServiceException {
        OutputStream outputStream = getOutputStream();
        InputStream byteStream = httpResponse.byteStream();
        byte[] bArr = new byte[8192];
        this.countingSink = new CountingSink(new m(), j4, this.progressListener);
        while (true) {
            try {
                try {
                    int read = byteStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    this.countingSink.writeBytesInternal(read);
                } catch (IOException e4) {
                    e4.printStackTrace();
                    throw new QCloudClientException(ProtectedSandApp.s("侫\u0001") + e4.toString(), e4);
                }
            } finally {
                if (outputStream != null) {
                    OkhttpInternalUtils.closeQuietly(outputStream);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeRandomAccessFile(java.io.File r15, java.io.InputStream r16, long r17) throws java.io.IOException, com.tencent.qcloud.core.common.QCloudClientException {
        /*
            r14 = this;
            r1 = r14
            r0 = r15
            r2 = r16
            if (r2 == 0) goto L8c
            r3 = 0
            long r8 = r14.getBytesTransferred()     // Catch: java.lang.Throwable -> L35
            long r4 = r1.offset     // Catch: java.lang.Throwable -> L35
            long r4 = r4 + r8
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L39
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "侬\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L35
            r4.<init>(r15, r5)     // Catch: java.lang.Throwable -> L35
            long r5 = r1.offset     // Catch: java.lang.Throwable -> L31
            long r5 = r5 + r8
            r4.seek(r5)     // Catch: java.lang.Throwable -> L31
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L31
            java.io.FileDescriptor r5 = r4.getFD()     // Catch: java.lang.Throwable -> L31
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L31
            r11 = r0
            r12 = r4
            goto L40
        L31:
            r0 = move-exception
            r11 = r3
            r12 = r4
            goto L7c
        L35:
            r0 = move-exception
            r11 = r3
            r12 = r11
            goto L7c
        L39:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L35
            r4.<init>(r15)     // Catch: java.lang.Throwable -> L35
            r12 = r3
            r11 = r4
        L40:
            java.io.BufferedOutputStream r13 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L7b
            r13.<init>(r11)     // Catch: java.lang.Throwable -> L7b
            r0 = 1048576(0x100000, float:1.469368E-39)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L6c
            com.tencent.qcloud.core.http.CountingSink r3 = new com.tencent.qcloud.core.http.CountingSink     // Catch: java.lang.Throwable -> L6c
            okio.m r5 = new okio.m     // Catch: java.lang.Throwable -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L6c
            com.tencent.qcloud.core.common.QCloudProgressListener r10 = r1.progressListener     // Catch: java.lang.Throwable -> L6c
            r4 = r3
            r6 = r17
            r4.<init>(r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L6c
            r1.countingSink = r3     // Catch: java.lang.Throwable -> L6c
        L5a:
            int r3 = r2.read(r0)     // Catch: java.lang.Throwable -> L6c
            r4 = -1
            if (r3 == r4) goto L6f
            r4 = 0
            r13.write(r0, r4, r3)     // Catch: java.lang.Throwable -> L6c
            com.tencent.qcloud.core.http.CountingSink r4 = r1.countingSink     // Catch: java.lang.Throwable -> L6c
            long r5 = (long) r3     // Catch: java.lang.Throwable -> L6c
            r4.writeBytesInternal(r5)     // Catch: java.lang.Throwable -> L6c
            goto L5a
        L6c:
            r0 = move-exception
            r3 = r13
            goto L7c
        L6f:
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r13)
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r11)
            if (r12 == 0) goto L7a
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r12)
        L7a:
            return
        L7b:
            r0 = move-exception
        L7c:
            if (r3 == 0) goto L81
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r3)
        L81:
            if (r11 == 0) goto L86
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r11)
        L86:
            if (r12 == 0) goto L8b
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r12)
        L8b:
            throw r0
        L8c:
            com.tencent.qcloud.core.common.QCloudClientException r0 = new com.tencent.qcloud.core.common.QCloudClientException
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "侭\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r2.<init>(r3)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.core.http.ResponseFileConverter.writeRandomAccessFile(java.io.File, java.io.InputStream, long):void");
    }

    @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
    public T convert(HttpResponse<T> httpResponse) throws QCloudClientException, QCloudServiceException {
        if (this.isQuic) {
            return null;
        }
        HttpResponse.checkResponseSuccessful(httpResponse);
        long[] parseContentRange = QCloudHttpUtils.parseContentRange(httpResponse.header(ProtectedSandApp.s("侮\u0001")));
        long contentLength = parseContentRange != null ? (parseContentRange[1] - parseContentRange[0]) + 1 : httpResponse.contentLength();
        if (!TextUtils.isEmpty(this.filePath)) {
            return downloadToAbsolutePath(httpResponse, contentLength);
        }
        if (this.contentUri != null) {
            return pipeToContentUri(httpResponse, contentLength);
        }
        throw new QCloudClientException(new IllegalArgumentException(ProtectedSandApp.s("侯\u0001")));
    }

    public void enableQuic(boolean z4) {
        this.isQuic = z4;
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public long getBytesTransferred() {
        CountingSink countingSink = this.countingSink;
        if (countingSink != null) {
            return countingSink.getTotalTransferred();
        }
        return 0L;
    }

    public OutputStream getOutputStream() throws QCloudClientException {
        if (TextUtils.isEmpty(this.filePath)) {
            Uri uri = this.contentUri;
            if (uri == null) {
                throw new QCloudClientException(new IllegalArgumentException(ProtectedSandApp.s("侯\u0001")));
            }
            try {
                return this.contentResolver.openOutputStream(uri);
            } catch (FileNotFoundException e4) {
                throw new QCloudClientException(e4);
            }
        }
        File file = new File(this.filePath);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new QCloudClientException(new IOException(ProtectedSandApp.s("侨\u0001")));
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException e5) {
            throw new QCloudClientException(e5);
        }
    }

    public QCloudProgressListener getProgressListener() {
        return this.progressListener;
    }

    public boolean isFilePathConverter() {
        return !TextUtils.isEmpty(this.filePath);
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public void setProgressListener(QCloudProgressListener qCloudProgressListener) {
        this.progressListener = qCloudProgressListener;
    }

    public ResponseFileConverter(Uri uri, ContentResolver contentResolver, long j4) {
        this.contentUri = uri;
        this.contentResolver = contentResolver;
        this.offset = j4;
    }

    public ResponseFileConverter() {
    }
}
