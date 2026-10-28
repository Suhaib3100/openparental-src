package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudDigistListener;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.util.OkhttpInternalUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.e0;
import okhttp3.x;
import okhttp3.y;
import okio.a0;
import okio.n;
import okio.o;

/* loaded from: classes7.dex */
public class MultipartStreamRequestBody extends e0 implements ProgressBody, QCloudDigistListener, ReactiveBody {
    private Map<String, String> bodyParameters = new LinkedHashMap();
    private String fileName;
    y multipartBody;
    private String name;
    StreamingRequestBody streamingRequestBody;

    private static class ExStreamingRequestBody extends StreamingRequestBody {
        protected ExStreamingRequestBody() {
        }

        static StreamingRequestBody bytes(byte[] bArr, String str, long j4, long j5) {
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.bytes = bArr;
            exStreamingRequestBody.contentType = str;
            if (j4 < 0) {
                j4 = 0;
            }
            exStreamingRequestBody.offset = j4;
            exStreamingRequestBody.requiredLength = j5;
            return exStreamingRequestBody;
        }

        static StreamingRequestBody file(File file, String str) {
            return file(file, str, 0L, Long.MAX_VALUE);
        }

        static StreamingRequestBody steam(InputStream inputStream, File file, String str, long j4, long j5) {
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.stream = inputStream;
            exStreamingRequestBody.contentType = str;
            exStreamingRequestBody.file = file;
            if (j4 < 0) {
                j4 = 0;
            }
            exStreamingRequestBody.offset = j4;
            exStreamingRequestBody.requiredLength = j5;
            return exStreamingRequestBody;
        }

        static StreamingRequestBody uri(Uri uri, ContentResolver contentResolver, String str, long j4, long j5) {
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.uri = uri;
            exStreamingRequestBody.contentResolver = contentResolver;
            exStreamingRequestBody.contentType = str;
            if (j4 < 0) {
                j4 = 0;
            }
            exStreamingRequestBody.offset = j4;
            exStreamingRequestBody.requiredLength = j5;
            return exStreamingRequestBody;
        }

        static StreamingRequestBody url(URL url, String str, long j4, long j5) {
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.url = url;
            exStreamingRequestBody.contentType = str;
            if (j4 < 0) {
                j4 = 0;
            }
            exStreamingRequestBody.offset = j4;
            exStreamingRequestBody.requiredLength = j5;
            return exStreamingRequestBody;
        }

        @Override // com.tencent.qcloud.core.http.StreamingRequestBody, okhttp3.e0
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
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.file = file;
            exStreamingRequestBody.contentType = str;
            if (j4 < 0) {
                j4 = 0;
            }
            exStreamingRequestBody.offset = j4;
            exStreamingRequestBody.requiredLength = j5;
            return exStreamingRequestBody;
        }
    }

    public void addMd5() throws IOException {
        this.bodyParameters.put(ProtectedSandApp.s("姛\u0001"), onGetMd5());
    }

    @Override // okhttp3.e0
    public long contentLength() throws IOException {
        return this.multipartBody.contentLength();
    }

    @Override // okhttp3.e0
    /* renamed from: contentType */
    public x getContentType() {
        return this.multipartBody.getContentType();
    }

    @Override // com.tencent.qcloud.core.http.ReactiveBody
    public <T> void end(HttpResult<T> httpResult) throws IOException {
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public long getBytesTransferred() {
        StreamingRequestBody streamingRequestBody = this.streamingRequestBody;
        if (streamingRequestBody != null) {
            return streamingRequestBody.getBytesTransferred();
        }
        return 0L;
    }

    @Override // com.tencent.qcloud.core.common.QCloudDigistListener
    public String onGetMd5() throws IOException {
        StreamingRequestBody streamingRequestBody = this.streamingRequestBody;
        if (streamingRequestBody == null) {
            return null;
        }
        String onGetMd5 = streamingRequestBody.onGetMd5();
        this.bodyParameters.put(ProtectedSandApp.s("姛\u0001"), onGetMd5);
        return onGetMd5;
    }

    @Override // com.tencent.qcloud.core.http.ReactiveBody
    public void prepare() {
        y.a aVar = new y.a();
        aVar.g(x.j(ProtectedSandApp.s("姜\u0001")));
        for (Map.Entry<String, String> entry : this.bodyParameters.entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        aVar.b(this.name, this.fileName, this.streamingRequestBody);
        this.multipartBody = aVar.f();
    }

    public void setBodyParameters(Map<String, String> map) {
        if (map != null) {
            this.bodyParameters.putAll(map);
        }
    }

    public void setContent(String str, String str2, String str3, File file, long j4, long j5) {
        if (str2 != null) {
            this.name = str2;
        }
        this.fileName = str3;
        if (TextUtils.isEmpty(str)) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
        }
        this.streamingRequestBody = ExStreamingRequestBody.file(file, str, j4, j5);
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public void setProgressListener(QCloudProgressListener qCloudProgressListener) {
        StreamingRequestBody streamingRequestBody = this.streamingRequestBody;
        if (streamingRequestBody != null) {
            streamingRequestBody.setProgressListener(qCloudProgressListener);
        }
    }

    public void setSign(String str) {
        if (str != null) {
            this.bodyParameters.put(ProtectedSandApp.s("姝\u0001"), str);
        }
    }

    @Override // okhttp3.e0
    public void writeTo(n nVar) throws IOException {
        this.multipartBody.writeTo(nVar);
    }

    public void setContent(String str, String str2, String str3, byte[] bArr, long j4, long j5) {
        if (str2 != null) {
            this.name = str2;
        }
        this.fileName = str3;
        this.streamingRequestBody = ExStreamingRequestBody.bytes(bArr, str, j4, j5);
    }

    public void setContent(String str, String str2, String str3, File file, InputStream inputStream, long j4, long j5) throws IOException {
        if (str2 != null) {
            this.name = str2;
        }
        this.fileName = str3;
        this.streamingRequestBody = ExStreamingRequestBody.steam(inputStream, file, str, j4, j5);
    }
}
