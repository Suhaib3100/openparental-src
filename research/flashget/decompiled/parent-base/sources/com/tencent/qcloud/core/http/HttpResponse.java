package com.tencent.qcloud.core.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudServiceException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.f0;

/* loaded from: classes7.dex */
public final class HttpResponse<T> {
    final HttpRequest<T> request;
    final f0 response;

    public HttpResponse(HttpRequest<T> httpRequest, f0 f0Var) {
        this.request = httpRequest;
        this.response = f0Var;
    }

    public static void checkResponseSuccessful(HttpResponse httpResponse) throws QCloudServiceException {
        if (httpResponse == null) {
            throw new QCloudServiceException(ProtectedSandApp.s("妃\u0001"));
        }
        if (httpResponse.isSuccessful()) {
            return;
        }
        QCloudServiceException qCloudServiceException = new QCloudServiceException(httpResponse.message());
        qCloudServiceException.setStatusCode(httpResponse.code());
        String s4 = ProtectedSandApp.s("如\u0001");
        if (httpResponse.header(s4) == null) {
            throw qCloudServiceException;
        }
        qCloudServiceException.setRequestId(httpResponse.header(s4));
        throw qCloudServiceException;
    }

    public final InputStream byteStream() {
        if (this.response.o() == null) {
            return null;
        }
        return this.response.o().a();
    }

    public final byte[] bytes() throws IOException {
        if (this.response.o() == null) {
            return null;
        }
        return this.response.o().c();
    }

    public int code() {
        return this.response.u();
    }

    public final long contentLength() {
        if (this.response.o() == null) {
            return 0L;
        }
        return this.response.o().getF84144f();
    }

    public String header(String str) {
        f0 f0Var = this.response;
        f0Var.getClass();
        return f0.C(f0Var, str, null, 2, null);
    }

    public Map<String, List<String>> headers() {
        return this.response.getHeaders().r();
    }

    public String host() {
        try {
            return this.response.getRequest().q().getHost();
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean isSuccessful() {
        f0 f0Var = this.response;
        return f0Var != null && f0Var.r1();
    }

    public String message() {
        return this.response.getMessage();
    }

    public HttpRequest<T> request() {
        return this.request;
    }

    public final String string() throws IOException {
        if (this.response.o() == null) {
            return null;
        }
        return this.response.o().u();
    }

    public String toString() {
        return String.format(Locale.ENGLISH, ProtectedSandApp.s("妄\u0001"), Integer.valueOf(code()), message(), this.response.getHeaders().r());
    }
}
