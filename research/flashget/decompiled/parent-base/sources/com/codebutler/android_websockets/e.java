package com.codebutler.android_websockets;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.codebutler.android_websockets.HybiParser;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.sand.common.a3;
import com.sand.common.d2;
import com.sand.common.r1;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/* compiled from: WebSocketClient.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: l, reason: collision with root package name */
    public static X509Certificate[] f47553l;

    /* renamed from: m, reason: collision with root package name */
    private static Context f47554m;

    /* renamed from: n, reason: collision with root package name */
    public static final X509TrustManager f47555n;

    /* renamed from: o, reason: collision with root package name */
    private static TrustManager[] f47556o;

    /* renamed from: a, reason: collision with root package name */
    private URI f47557a;

    /* renamed from: b, reason: collision with root package name */
    private c f47558b;

    /* renamed from: c, reason: collision with root package name */
    private Socket f47559c;

    /* renamed from: d, reason: collision with root package name */
    private Thread f47560d;

    /* renamed from: e, reason: collision with root package name */
    private List<BasicNameValuePair> f47561e;

    /* renamed from: k, reason: collision with root package name */
    public static final String f47552k = ProtectedSandApp.s("༽");

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f47551j = Logger.getLogger(ProtectedSandApp.s("༾"));

    /* renamed from: g, reason: collision with root package name */
    private final Object f47563g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private int f47564h = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f47565i = false;

    /* renamed from: f, reason: collision with root package name */
    private HybiParser f47562f = new HybiParser(this);

    /* compiled from: WebSocketClient.java */
    class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (x509CertificateArr == null || x509CertificateArr.length == 0) {
                throw new CertificateException(ProtectedSandApp.s("༥"));
            }
            if (str == null || str.length() == 0) {
                throw new CertificateException(ProtectedSandApp.s("༤"));
            }
            if (e.f47554m != null) {
                if (r1.e(ProtectedSandApp.s("༡"), e.f47554m, -1) == 1) {
                    boolean z4 = false;
                    for (X509Certificate x509Certificate : x509CertificateArr) {
                        if (x509Certificate.getSubjectDN().toString().contains(ProtectedSandApp.s("༢"))) {
                            e.f47553l = new X509Certificate[]{x509Certificate};
                            x509Certificate.checkValidity();
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        throw new CertificateException(ProtectedSandApp.s("༣"));
                    }
                }
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return e.f47553l;
        }
    }

    /* compiled from: WebSocketClient.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger logger;
            StringBuilder sb;
            String s4 = ProtectedSandApp.s("༦");
            String s5 = ProtectedSandApp.s("༧");
            String s6 = ProtectedSandApp.s("༨");
            String s7 = ProtectedSandApp.s("༩");
            String s10 = ProtectedSandApp.s("༪");
            String s11 = ProtectedSandApp.s("༫");
            String s12 = ProtectedSandApp.s("༬");
            try {
                try {
                    try {
                        try {
                            int port = e.this.f47557a.getPort();
                            String s13 = ProtectedSandApp.s("༭");
                            int port2 = port != -1 ? e.this.f47557a.getPort() : e.this.f47557a.getScheme().equals(s13) ? org.java_websocket_new.d.F2 : 80;
                            String s14 = TextUtils.isEmpty(e.this.f47557a.getPath()) ? ProtectedSandApp.s("༮") : e.this.f47557a.getPath();
                            if (!TextUtils.isEmpty(e.this.f47557a.getQuery())) {
                                s14 = s14 + ProtectedSandApp.s("༯") + e.this.f47557a.getQuery();
                            }
                            URI uri = new URI(e.this.f47557a.getScheme().equals(s13) ? ProtectedSandApp.s("༰") : ProtectedSandApp.s("༱"), e.this.f47557a.getSchemeSpecificPart(), null);
                            e.this.f47559c = (e.this.f47557a.getScheme().equals(s13) ? e.this.t() : SocketFactory.getDefault()).createSocket();
                            if (e.this.f47564h == 0) {
                                e.this.f47564h = Priority.WARN_INT;
                            }
                            e.this.f47559c.connect(new InetSocketAddress(e.this.f47557a.getHost(), port2), e.this.f47564h);
                            e.this.f47559c.setKeepAlive(true);
                            e.f47551j.info(Integer.toHexString(e.this.hashCode()) + ProtectedSandApp.s("༲") + e.this.f47559c);
                            PrintWriter printWriter = new PrintWriter(e.this.f47559c.getOutputStream());
                            printWriter.print(s12 + s14 + ProtectedSandApp.s("༳"));
                            printWriter.print(ProtectedSandApp.s("༴"));
                            printWriter.print(ProtectedSandApp.s("༵"));
                            printWriter.print(s11 + e.this.f47557a.getHost() + s5);
                            printWriter.print(s10 + uri.toString() + s5);
                            printWriter.print(s7 + e.this.q() + s5);
                            printWriter.print(ProtectedSandApp.s("༶"));
                            if (e.this.f47561e != null) {
                                for (NameValuePair nameValuePair : e.this.f47561e) {
                                    printWriter.print(String.format(ProtectedSandApp.s("༷"), nameValuePair.getName(), nameValuePair.getValue()));
                                }
                            }
                            printWriter.print(s5);
                            printWriter.flush();
                            HybiParser.a aVar = new HybiParser.a(e.this.f47559c.getInputStream());
                            e eVar = e.this;
                            StatusLine w4 = eVar.w(eVar.x(aVar));
                            if (w4.getStatusCode() != 101) {
                                throw new HttpResponseException(w4.getStatusCode(), w4.getReasonPhrase());
                            }
                            while (true) {
                                String x4 = e.this.x(aVar);
                                if (TextUtils.isEmpty(x4)) {
                                    break;
                                } else {
                                    e.this.v(x4).getName().equals(ProtectedSandApp.s("༸"));
                                }
                            }
                            if (e.this.f47558b != null) {
                                e.this.f47558b.f();
                            }
                            e.this.f47562f.t(aVar);
                            try {
                                if (e.this.f47559c != null) {
                                    e.this.f47559c.close();
                                    e.this.f47559c = null;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                logger = e.f47551j;
                                sb = new StringBuilder();
                                sb.append(Integer.toHexString(e.this.hashCode()));
                                sb.append(s6);
                                sb.append(Log.getStackTraceString(e));
                                logger.error(sb.toString());
                            }
                        } catch (Throwable th) {
                            try {
                                if (e.this.f47559c != null) {
                                    e.this.f47559c.close();
                                    e.this.f47559c = null;
                                }
                            } catch (IOException e5) {
                                e.f47551j.error(Integer.toHexString(e.this.hashCode()) + s6 + Log.getStackTraceString(e5));
                            }
                            throw th;
                        }
                    } catch (SocketException e6) {
                        e.f47551j.error(Integer.toHexString(e.this.hashCode()) + ProtectedSandApp.s("༺") + e6);
                        if (e.this.f47558b != null) {
                            if (e.this.f47565i) {
                                e.this.f47558b.g(0, s4 + e6);
                            } else {
                                e.this.f47558b.i(0, e6);
                            }
                        }
                        try {
                            if (e.this.f47559c != null) {
                                e.this.f47559c.close();
                                e.this.f47559c = null;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            logger = e.f47551j;
                            sb = new StringBuilder();
                            sb.append(Integer.toHexString(e.this.hashCode()));
                            sb.append(s6);
                            sb.append(Log.getStackTraceString(e));
                            logger.error(sb.toString());
                        }
                    }
                } catch (EOFException e10) {
                    e.f47551j.error(Integer.toHexString(e.this.hashCode()) + ProtectedSandApp.s("༼") + e10);
                    if (e.this.f47558b != null) {
                        if (e.this.f47565i) {
                            e.this.f47558b.g(0, s4 + e10.getClass().getSimpleName());
                        } else {
                            e.this.f47558b.i(0, e10);
                        }
                    }
                    try {
                        if (e.this.f47559c != null) {
                            e.this.f47559c.close();
                            e.this.f47559c = null;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        logger = e.f47551j;
                        sb = new StringBuilder();
                        sb.append(Integer.toHexString(e.this.hashCode()));
                        sb.append(s6);
                        sb.append(Log.getStackTraceString(e));
                        logger.error(sb.toString());
                    }
                }
            } catch (SSLException e12) {
                e.f47551j.error(Integer.toHexString(e.this.hashCode()) + ProtectedSandApp.s("༻") + e12);
                if (e.this.f47558b != null) {
                    if (e.this.f47565i) {
                        e.this.f47558b.g(0, s4 + e12);
                    } else {
                        e.this.f47558b.i(0, e12);
                    }
                }
                try {
                    if (e.this.f47559c != null) {
                        e.this.f47559c.close();
                        e.this.f47559c = null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    logger = e.f47551j;
                    sb = new StringBuilder();
                    sb.append(Integer.toHexString(e.this.hashCode()));
                    sb.append(s6);
                    sb.append(Log.getStackTraceString(e));
                    logger.error(sb.toString());
                }
            } catch (Exception e14) {
                e.f47551j.error(Integer.toHexString(e.this.hashCode()) + ProtectedSandApp.s("༹") + e14);
                if (e.this.f47558b != null) {
                    e.this.f47558b.onError(e14);
                }
                try {
                    if (e.this.f47559c != null) {
                        e.this.f47559c.close();
                        e.this.f47559c = null;
                    }
                } catch (IOException e15) {
                    e = e15;
                    logger = e.f47551j;
                    sb = new StringBuilder();
                    sb.append(Integer.toHexString(e.this.hashCode()));
                    sb.append(s6);
                    sb.append(Log.getStackTraceString(e));
                    logger.error(sb.toString());
                }
            }
        }
    }

    /* compiled from: WebSocketClient.java */
    public interface c {
        void c(String str);

        void f();

        void g(int i4, String str);

        void h(byte[] bArr);

        void i(int i4, Exception exc);

        void onError(Exception exc);
    }

    static {
        a aVar = new a();
        f47555n = aVar;
        f47556o = new X509TrustManager[]{aVar};
    }

    public e(URI uri, c cVar, List<BasicNameValuePair> list, Context context) {
        this.f47557a = uri;
        this.f47558b = cVar;
        this.f47561e = list;
        f47554m = context;
    }

    public static void D(TrustManager[] trustManagerArr) {
        f47556o = trustManagerArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String q() {
        byte[] bArr = new byte[16];
        for (int i4 = 0; i4 < 16; i4++) {
            bArr[i4] = (byte) (Math.random() * 256.0d);
        }
        return com.codebutler.android_websockets.a.f(bArr, 0).trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SSLSocketFactory t() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance(d2.a());
        sSLContext.init(null, f47556o, null);
        return new a3(sSLContext.getSocketFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Header v(String str) {
        return BasicLineParser.parseHeader(str, new BasicLineParser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StatusLine w(String str) {
        return BasicLineParser.parseStatusLine(str, new BasicLineParser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String x(HybiParser.a aVar) throws IOException {
        int read = aVar.read();
        if (read == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder("");
        while (read != 10) {
            if (read != 13) {
                sb.append((char) read);
            }
            read = aVar.read();
            if (read == -1) {
                return null;
            }
        }
        return sb.toString();
    }

    boolean A(byte[] bArr) {
        try {
            synchronized (this.f47563g) {
                try {
                    Socket socket = this.f47559c;
                    if (socket == null) {
                        f47551j.info(ProtectedSandApp.s("༿"));
                        return false;
                    }
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write(bArr);
                    outputStream.flush();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IOException e4) {
            c cVar = this.f47558b;
            if (cVar != null) {
                cVar.onError(e4);
            }
            return false;
        }
    }

    public void B(c cVar) {
        this.f47558b = cVar;
    }

    public void C(int i4) {
        this.f47564h = i4;
    }

    public void E(URI uri) {
        this.f47557a = uri;
    }

    public void p() {
        Thread thread = this.f47560d;
        if (thread != null && thread.isAlive()) {
            f47551j.error(ProtectedSandApp.s("ཀ"));
            return;
        }
        Thread thread2 = new Thread(new b());
        this.f47560d = thread2;
        thread2.start();
    }

    public void r() throws IOException {
        Socket socket = this.f47559c;
        if (socket != null) {
            this.f47565i = true;
            socket.close();
            this.f47559c = null;
            this.f47565i = false;
        }
    }

    public c s() {
        if (this.f47559c != null) {
            return this.f47558b;
        }
        f47551j.warn(ProtectedSandApp.s("ཁ"));
        return null;
    }

    public Socket u() {
        return this.f47559c;
    }

    public boolean y(String str) {
        return A(this.f47562f.h(str));
    }

    public boolean z(byte[] bArr) {
        return A(this.f47562f.j(bArr));
    }
}
