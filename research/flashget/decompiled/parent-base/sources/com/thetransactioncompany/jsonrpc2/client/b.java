package com.thetransactioncompany.jsonrpc2.client;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.thetransactioncompany.jsonrpc2.JSONRPC2ParseException;
import com.thetransactioncompany.jsonrpc2.f;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: JSONRPC2Session.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    private static SSLSocketFactory f72823f = b();

    /* renamed from: a, reason: collision with root package name */
    private URL f72824a;

    /* renamed from: b, reason: collision with root package name */
    private c f72825b;

    /* renamed from: c, reason: collision with root package name */
    private com.thetransactioncompany.jsonrpc2.client.a f72826c;

    /* renamed from: d, reason: collision with root package name */
    private e f72827d;

    /* renamed from: e, reason: collision with root package name */
    private CookieManager f72828e;

    /* compiled from: JSONRPC2Session.java */
    static class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public b(URL url) {
        if (!url.getProtocol().equalsIgnoreCase(ProtectedSandApp.s("嶢\u0001")) && !url.getProtocol().equalsIgnoreCase(ProtectedSandApp.s("嶣\u0001"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嶤\u0001"));
        }
        this.f72824a = url;
        this.f72825b = new c();
        this.f72826c = null;
    }

    private void a(URLConnection uRLConnection) throws JSONRPC2SessionException {
        uRLConnection.setRequestProperty(ProtectedSandApp.s("嶥\u0001"), ProtectedSandApp.s("嶦\u0001"));
        if (this.f72825b.j() != null) {
            uRLConnection.setRequestProperty(ProtectedSandApp.s("嶧\u0001"), this.f72825b.j());
        }
        if (this.f72825b.g() != null) {
            uRLConnection.setRequestProperty(ProtectedSandApp.s("嶨\u0001"), this.f72825b.g());
        }
        if (this.f72825b.d()) {
            uRLConnection.setRequestProperty(ProtectedSandApp.s("嶩\u0001"), ProtectedSandApp.s("嶪\u0001"));
        }
        if (this.f72825b.b()) {
            StringBuilder sb = new StringBuilder();
            for (HttpCookie httpCookie : e()) {
                if (sb.length() > 0) {
                    sb.append(ProtectedSandApp.s("嶫\u0001"));
                }
                sb.append(httpCookie.toString());
            }
            uRLConnection.setRequestProperty(ProtectedSandApp.s("嶬\u0001"), sb.toString());
        }
    }

    public static SSLSocketFactory b() {
        TrustManager[] trustManagerArr = {new a()};
        try {
            SSLContext sSLContext = SSLContext.getInstance(ProtectedSandApp.s("嶭\u0001"));
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception unused) {
            return null;
        }
    }

    private URLConnection c() throws JSONRPC2SessionException {
        try {
            URLConnection openConnection = this.f72825b.h() != null ? this.f72824a.openConnection(this.f72825b.h()) : this.f72824a.openConnection();
            openConnection.setConnectTimeout(this.f72825b.f());
            openConnection.setReadTimeout(this.f72825b.i());
            a(openConnection);
            openConnection.setDoOutput(true);
            if ((openConnection instanceof HttpsURLConnection) && this.f72825b.y()) {
                SSLSocketFactory sSLSocketFactory = f72823f;
                if (sSLSocketFactory == null) {
                    throw new JSONRPC2SessionException(ProtectedSandApp.s("嶮\u0001"));
                }
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            com.thetransactioncompany.jsonrpc2.client.a aVar = this.f72826c;
            if (aVar != null) {
                aVar.a((HttpURLConnection) openConnection);
            }
            return openConnection;
        } catch (IOException e4) {
            throw new JSONRPC2SessionException(ProtectedSandApp.s("嶯\u0001") + e4.getMessage(), 1, e4);
        }
    }

    private static void i(URLConnection uRLConnection, String str) throws JSONRPC2SessionException {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(uRLConnection.getOutputStream(), ProtectedSandApp.s("嶦\u0001"));
            outputStreamWriter.write(str);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e4) {
            throw new JSONRPC2SessionException(ProtectedSandApp.s("嶯\u0001") + e4.getMessage(), 1, e4);
        }
    }

    private d j(URLConnection uRLConnection) throws JSONRPC2SessionException {
        String s4 = ProtectedSandApp.s("嶯\u0001");
        try {
            d i4 = d.i((HttpURLConnection) uRLConnection);
            e eVar = this.f72827d;
            if (eVar != null) {
                eVar.a(i4);
            }
            if (this.f72825b.b()) {
                if (this.f72828e == null) {
                    this.f72828e = new CookieManager(null, CookiePolicy.ACCEPT_ALL);
                }
                try {
                    this.f72828e.put(uRLConnection.getURL().toURI(), i4.f());
                } catch (IOException e4) {
                    throw new JSONRPC2SessionException(ProtectedSandApp.s("嶰\u0001") + e4.getMessage(), 1, e4);
                } catch (URISyntaxException e5) {
                    throw new JSONRPC2SessionException(s4 + e5.getMessage(), 1, e5);
                }
            }
            return i4;
        } catch (IOException e6) {
            throw new JSONRPC2SessionException(s4 + e6.getMessage(), 1, e6);
        }
    }

    public com.thetransactioncompany.jsonrpc2.client.a d() {
        return this.f72826c;
    }

    public List<HttpCookie> e() {
        CookieManager cookieManager = this.f72828e;
        return cookieManager == null ? Collections.emptyList() : cookieManager.getCookieStore().getCookies();
    }

    public c f() {
        return this.f72825b;
    }

    public e g() {
        return this.f72827d;
    }

    public URL h() {
        return this.f72824a;
    }

    public f k(com.thetransactioncompany.jsonrpc2.e eVar) throws JSONRPC2SessionException {
        URLConnection c5 = c();
        i(c5, eVar.toString());
        d j4 = j(c5);
        String d5 = j4.d();
        if (!this.f72825b.m(d5)) {
            throw new JSONRPC2SessionException(d5 == null ? ProtectedSandApp.s("嶱\u0001") : android.support.v4.media.d.a(ProtectedSandApp.s("嶲\u0001"), d5, ProtectedSandApp.s("嶳\u0001")), 2);
        }
        try {
            f p4 = f.p(j4.a(), this.f72825b.q(), this.f72825b.l(), this.f72825b.o());
            Object h4 = eVar.h();
            Object j5 = p4.j();
            if ((h4 != null && j5 != null && h4.toString().equals(j5.toString())) || ((h4 == null && j5 == null) || (!p4.l() && (p4.h().c() == -32700 || p4.h().c() == -32600 || p4.h().c() == -32603)))) {
                return p4;
            }
            throw new JSONRPC2SessionException(ProtectedSandApp.s("嶴\u0001") + j5.toString() + ProtectedSandApp.s("嶵\u0001") + h4.toString(), 3);
        } catch (JSONRPC2ParseException e4) {
            throw new JSONRPC2SessionException(ProtectedSandApp.s("嶶\u0001"), 3, e4);
        }
    }

    public void l(com.thetransactioncompany.jsonrpc2.b bVar) throws JSONRPC2SessionException {
        URLConnection c5 = c();
        i(c5, bVar.toString());
        j(c5);
    }

    public void m(com.thetransactioncompany.jsonrpc2.client.a aVar) {
        this.f72826c = aVar;
    }

    public void n(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嶷\u0001"));
        }
        this.f72825b = cVar;
    }

    public void o(e eVar) {
        this.f72827d = eVar;
    }

    public void p(URL url) {
        if (url == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嶸\u0001"));
        }
        this.f72824a = url;
    }
}
