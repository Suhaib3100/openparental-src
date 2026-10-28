package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* compiled from: HttpClientStack.java */
@Deprecated
/* loaded from: classes3.dex */
public class l implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final String f41034b = ProtectedSandApp.s("ۈ");

    /* renamed from: a, reason: collision with root package name */
    protected final HttpClient f41035a;

    /* compiled from: HttpClientStack.java */
    public static final class a extends HttpEntityEnclosingRequestBase {

        /* renamed from: b, reason: collision with root package name */
        public static final String f41036b = ProtectedSandApp.s("ۇ");

        public a() {
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return ProtectedSandApp.s("ۇ");
        }

        public a(URI uri) {
            setURI(uri);
        }

        public a(String str) {
            setURI(URI.create(str));
        }
    }

    public l(HttpClient httpClient) {
        this.f41035a = httpClient;
    }

    static HttpUriRequest b(com.android.volley.n<?> nVar, Map<String, String> map) throws AuthFailureError {
        int method = nVar.getMethod();
        String s4 = ProtectedSandApp.s("ۈ");
        switch (method) {
            case -1:
                byte[] postBody = nVar.getPostBody();
                if (postBody == null) {
                    return new HttpGet(nVar.getUrl());
                }
                HttpPost httpPost = new HttpPost(nVar.getUrl());
                httpPost.addHeader(s4, nVar.getPostBodyContentType());
                httpPost.setEntity(new ByteArrayEntity(postBody));
                return httpPost;
            case 0:
                return new HttpGet(nVar.getUrl());
            case 1:
                HttpPost httpPost2 = new HttpPost(nVar.getUrl());
                httpPost2.addHeader(s4, nVar.getBodyContentType());
                e(httpPost2, nVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(nVar.getUrl());
                httpPut.addHeader(s4, nVar.getBodyContentType());
                e(httpPut, nVar);
                return httpPut;
            case 3:
                return new HttpDelete(nVar.getUrl());
            case 4:
                return new HttpHead(nVar.getUrl());
            case 5:
                return new HttpOptions(nVar.getUrl());
            case 6:
                return new HttpTrace(nVar.getUrl());
            case 7:
                a aVar = new a(nVar.getUrl());
                aVar.addHeader(s4, nVar.getBodyContentType());
                e(aVar, nVar);
                return aVar;
            default:
                throw new IllegalStateException(ProtectedSandApp.s("ۉ"));
        }
    }

    private static List<NameValuePair> c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new BasicNameValuePair(str, map.get(str)));
        }
        return arrayList;
    }

    private static void e(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, com.android.volley.n<?> nVar) throws AuthFailureError {
        byte[] body = nVar.getBody();
        if (body != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(body));
        }
    }

    private static void f(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // com.android.volley.toolbox.o
    public HttpResponse a(com.android.volley.n<?> nVar, Map<String, String> map) throws IOException, AuthFailureError {
        HttpUriRequest b5 = b(nVar, map);
        f(b5, map);
        f(b5, nVar.getHeaders());
        d(b5);
        HttpParams params = b5.getParams();
        int timeoutMs = nVar.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, timeoutMs);
        return this.f41035a.execute(b5);
    }

    protected void d(HttpUriRequest httpUriRequest) throws IOException {
    }
}
