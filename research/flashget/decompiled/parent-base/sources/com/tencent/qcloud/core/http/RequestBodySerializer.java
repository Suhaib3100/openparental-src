package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.tencent.qcloud.core.util.QCloudStringUtils;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import okhttp3.e0;
import okhttp3.x;
import okio.p;

/* loaded from: classes7.dex */
public abstract class RequestBodySerializer {

    private static final class BaseRequestBodyWrapper extends RequestBodySerializer {
        private final e0 body;

        public BaseRequestBodyWrapper(e0 e0Var) {
            this.body = e0Var;
        }

        @Override // com.tencent.qcloud.core.http.RequestBodySerializer
        public e0 body() {
            return this.body;
        }
    }

    public static RequestBodySerializer bytes(String str, byte[] bArr) {
        return bytes(str, bArr, 0L, -1L);
    }

    public static RequestBodySerializer file(String str, File file) {
        return file(str, file, 0L, -1L);
    }

    public static RequestBodySerializer multiPart(MultipartStreamRequestBody multipartStreamRequestBody) {
        return new BaseRequestBodyWrapper(multipartStreamRequestBody);
    }

    private static x parseType(String str) {
        if (str != null) {
            return x.j(str);
        }
        return null;
    }

    public static RequestBodySerializer stream(String str, File file, InputStream inputStream) {
        return stream(str, file, inputStream, 0L, -1L);
    }

    public static RequestBodySerializer string(String str, String str2) {
        return new BaseRequestBodyWrapper(e0.create(parseType(str), str2));
    }

    public static RequestBodySerializer uri(String str, Uri uri, Context context) {
        return uri(str, uri, context, 0L, -1L);
    }

    public static RequestBodySerializer url(String str, URL url) {
        return url(str, url, 0L, -1L);
    }

    public static RequestBodySerializer wrap(e0 e0Var) {
        return new BaseRequestBodyWrapper(e0Var);
    }

    public abstract e0 body();

    public static RequestBodySerializer bytes(String str, byte[] bArr, long j4, long j5) {
        return ((j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) < 0 ? ((long) bArr.length) - j4 : Math.min(j5, ((long) bArr.length) - j4)) < 204800 ? new BaseRequestBodyWrapper(e0.create(parseType(str), bArr)) : new BaseRequestBodyWrapper(StreamingRequestBody.bytes(bArr, str, j4, j5));
    }

    public static RequestBodySerializer file(String str, File file, long j4, long j5) {
        if (TextUtils.isEmpty(str)) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(QCloudStringUtils.getExtension(file.getPath()));
        }
        return new BaseRequestBodyWrapper(StreamingRequestBody.file(file, str, j4, j5));
    }

    public static RequestBodySerializer stream(String str, File file, InputStream inputStream, long j4, long j5) {
        return new BaseRequestBodyWrapper(StreamingRequestBody.steam(inputStream, file, str, j4, j5));
    }

    public static RequestBodySerializer string(String str, p pVar) {
        return new BaseRequestBodyWrapper(e0.create(parseType(str), pVar));
    }

    public static RequestBodySerializer uri(String str, Uri uri, Context context, long j4, long j5) {
        ContentResolver contentResolver = context.getContentResolver();
        if (TextUtils.isEmpty(str)) {
            str = contentResolver.getType(uri);
        }
        return new BaseRequestBodyWrapper(StreamingRequestBody.uri(uri, contentResolver, str, j4, j5));
    }

    public static RequestBodySerializer url(String str, URL url, long j4, long j5) {
        if (TextUtils.isEmpty(str)) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(url.toString()));
        }
        return new BaseRequestBodyWrapper(StreamingRequestBody.url(url, str, j4, j5));
    }
}
