package com.android.volley.toolbox;

import androidx.annotation.m1;
import com.android.volley.AuthFailureError;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: HurlStack.java */
/* loaded from: classes3.dex */
public class p extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final int f41046c = 100;

    /* renamed from: a, reason: collision with root package name */
    private final b f41047a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f41048b;

    /* compiled from: HurlStack.java */
    static class a extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        private final HttpURLConnection f41049b;

        a(HttpURLConnection httpURLConnection) {
            super(p.k(httpURLConnection));
            this.f41049b = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f41049b.disconnect();
        }
    }

    /* compiled from: HurlStack.java */
    public interface b extends c0 {
    }

    public p() {
        this(null, null);
    }

    private void d(HttpURLConnection httpURLConnection, com.android.volley.n<?> nVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        String s4 = ProtectedSandApp.s("ۣ");
        if (!requestProperties.containsKey(s4)) {
            httpURLConnection.setRequestProperty(s4, nVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(i(nVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void e(HttpURLConnection httpURLConnection, com.android.volley.n<?> nVar) throws IOException, AuthFailureError {
        byte[] body = nVar.getBody();
        if (body != null) {
            d(httpURLConnection, nVar, body);
        }
    }

    @m1
    static List<com.android.volley.i> f(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.android.volley.i(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private static boolean j(int i4, int i5) {
        return (i4 == 4 || (100 <= i5 && i5 < 200) || i5 == 204 || i5 == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream k(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection l(URL url, com.android.volley.n<?> nVar) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection g4 = g(url);
        int timeoutMs = nVar.getTimeoutMs();
        g4.setConnectTimeout(timeoutMs);
        g4.setReadTimeout(timeoutMs);
        g4.setUseCaches(false);
        g4.setDoInput(true);
        if (ProtectedSandApp.s("ۤ").equals(url.getProtocol()) && (sSLSocketFactory = this.f41048b) != null) {
            ((HttpsURLConnection) g4).setSSLSocketFactory(sSLSocketFactory);
        }
        return g4;
    }

    @Override // com.android.volley.toolbox.e
    public n b(com.android.volley.n<?> nVar, Map<String, String> map) throws IOException, AuthFailureError {
        String url = nVar.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(nVar.getHeaders());
        b bVar = this.f41047a;
        if (bVar != null) {
            String a5 = bVar.a(url);
            if (a5 == null) {
                throw new IOException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ۥ"), url));
            }
            url = a5;
        }
        HttpURLConnection l4 = l(new URL(url), nVar);
        try {
            for (String str : hashMap.keySet()) {
                l4.setRequestProperty(str, (String) hashMap.get(str));
            }
            m(l4, nVar);
            int responseCode = l4.getResponseCode();
            if (responseCode == -1) {
                throw new IOException(ProtectedSandApp.s("ۦ"));
            }
            if (j(nVar.getMethod(), responseCode)) {
                return new n(responseCode, f(l4.getHeaderFields()), l4.getContentLength(), h(nVar, l4));
            }
            n nVar2 = new n(responseCode, f(l4.getHeaderFields()));
            l4.disconnect();
            return nVar2;
        } catch (Throwable th) {
            if (0 == 0) {
                l4.disconnect();
            }
            throw th;
        }
    }

    protected HttpURLConnection g(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    protected InputStream h(com.android.volley.n<?> nVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    protected OutputStream i(com.android.volley.n<?> nVar, HttpURLConnection httpURLConnection, int i4) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    void m(HttpURLConnection httpURLConnection, com.android.volley.n<?> nVar) throws IOException, AuthFailureError {
        int method = nVar.getMethod();
        String s4 = ProtectedSandApp.s("ۧ");
        switch (method) {
            case -1:
                byte[] postBody = nVar.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod(s4);
                    d(httpURLConnection, nVar, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod(ProtectedSandApp.s("ۯ"));
                return;
            case 1:
                httpURLConnection.setRequestMethod(s4);
                e(httpURLConnection, nVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod(ProtectedSandApp.s("ۮ"));
                e(httpURLConnection, nVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod(ProtectedSandApp.s("ۭ"));
                return;
            case 4:
                httpURLConnection.setRequestMethod(ProtectedSandApp.s("۬"));
                return;
            case 5:
                httpURLConnection.setRequestMethod(ProtectedSandApp.s("۫"));
                return;
            case 6:
                httpURLConnection.setRequestMethod(ProtectedSandApp.s("۪"));
                return;
            case 7:
                httpURLConnection.setRequestMethod(ProtectedSandApp.s("۩"));
                e(httpURLConnection, nVar);
                return;
            default:
                throw new IllegalStateException(ProtectedSandApp.s("ۨ"));
        }
    }

    public p(b bVar) {
        this(bVar, null);
    }

    public p(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f41047a = bVar;
        this.f41048b = sSLSocketFactory;
    }
}
