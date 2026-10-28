package com.tencent.liteav.base.http;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.compose.animation.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.HttpDnsUtil;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PasswordAuthentication;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import org.apache.http.HttpStatus;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class HttpClientAndroid {
    private static final int ERROR_CODE_INVALID_REQUEST = 0;
    private static final int READ_STREAM_SIZE = 8192;
    private static final int REDIRECT_REQUEST_MAX = 3;
    private HttpURLConnection mConnection;
    private b mHttpConfig;
    private final Handler mHttpHandler;
    private String mLastRequestURL;
    private long mNativeHttpClientAndroidJni;
    private static final String HTTPS_PREFIX = ProtectedSandApp.s("勒\u0001");
    private static final String METHOD_PUT = ProtectedSandApp.s("勓\u0001");
    private static final String METHOD_POST = ProtectedSandApp.s("勔\u0001");
    private static final String TAG = ProtectedSandApp.s("動\u0001");
    private static final String HTTP_PREFIX = ProtectedSandApp.s("勖\u0001");
    private static final String METHOD_GET = ProtectedSandApp.s("勗\u0001");
    private static final Object mLock = new Object();
    private final ConcurrentHashMap<Long, e> mRunningRequestMap = new ConcurrentHashMap<>();
    private final Object mLocker = new Object();
    private volatile c mInternalState = c.f71817a;
    private long mTotalReadBytes = 0;
    private long mStartReadTime = 0;
    byte[] mReadDataBytes = new byte[8192];
    private boolean mPausedRepeatDownloading = false;
    private d mReallyNetworkChannel = d.f71821a;
    private ConnectivityManager.NetworkCallback mNetworkCallback = null;
    private h mRepeatDownloadingStatusCode = h.f71872x;
    private ByteBuffer mRepeatByteBuffer = null;

    static class a extends Authenticator {

        /* renamed from: a, reason: collision with root package name */
        String f71805a;

        /* renamed from: b, reason: collision with root package name */
        String f71806b;

        a(String str, String str2) {
            this.f71805a = str;
            this.f71806b = str2;
        }

        @Override // java.net.Authenticator
        protected final PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(this.f71805a, this.f71806b.toCharArray());
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f71807a;

        /* renamed from: b, reason: collision with root package name */
        int f71808b;

        /* renamed from: c, reason: collision with root package name */
        int f71809c;

        /* renamed from: d, reason: collision with root package name */
        boolean f71810d;

        /* renamed from: e, reason: collision with root package name */
        int f71811e;

        /* renamed from: f, reason: collision with root package name */
        int f71812f;

        /* renamed from: g, reason: collision with root package name */
        String f71813g;

        /* renamed from: h, reason: collision with root package name */
        String f71814h;

        /* renamed from: i, reason: collision with root package name */
        String f71815i;

        /* renamed from: j, reason: collision with root package name */
        d f71816j;

        b(int i4, int i5, int i6, boolean z4, int i7, int i10, String str, String str2, String str3, d dVar) {
            this.f71807a = i4;
            this.f71808b = i5;
            this.f71809c = i6;
            this.f71810d = z4;
            this.f71811e = i7;
            this.f71812f = i10;
            this.f71813g = str;
            this.f71814h = str2;
            this.f71815i = str3;
            this.f71816j = dVar;
        }
    }

    enum c {
        f71817a,
        f71818b,
        f71819c
    }

    public enum d {
        f71821a(0),
        f71822b(1),
        f71823c(2);

        int nativeValue;

        d(int i4) {
            this.nativeValue = i4;
        }

        public static d a(int i4) {
            for (d dVar : values()) {
                if (dVar.nativeValue == i4) {
                    return dVar;
                }
            }
            LiteavLog.i(ProtectedSandApp.s("劫\u0001"), ProtectedSandApp.s("努\u0001").concat(String.valueOf(i4)));
            return f71821a;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        long f71825a;

        /* renamed from: b, reason: collision with root package name */
        String f71826b;

        /* renamed from: c, reason: collision with root package name */
        String f71827c;

        /* renamed from: d, reason: collision with root package name */
        byte[] f71828d;

        /* renamed from: e, reason: collision with root package name */
        Map<String, String> f71829e;

        /* renamed from: f, reason: collision with root package name */
        int f71830f;

        /* renamed from: g, reason: collision with root package name */
        String f71831g;

        /* renamed from: h, reason: collision with root package name */
        boolean f71832h;

        /* renamed from: i, reason: collision with root package name */
        String f71833i;

        /* renamed from: j, reason: collision with root package name */
        byte[] f71834j;

        /* renamed from: k, reason: collision with root package name */
        byte[] f71835k;

        e(String str, String str2, byte[] bArr, Map<String, String> map, boolean z4) {
            this(str, str2, bArr, map, z4, "", null, null);
        }

        final boolean a() {
            if (TextUtils.isEmpty(this.f71826b)) {
                return false;
            }
            return this.f71826b.startsWith(ProtectedSandApp.s("劬\u0001")) || this.f71826b.startsWith(ProtectedSandApp.s("劭\u0001"));
        }

        final boolean b() {
            byte[] bArr = this.f71828d;
            return bArr != null && bArr.length > 0;
        }

        final boolean c() {
            return ProtectedSandApp.s("劮\u0001").equals(d()) || ProtectedSandApp.s("劯\u0001").equals(d());
        }

        final String d() {
            if (TextUtils.isEmpty(this.f71827c)) {
                return "";
            }
            String str = this.f71827c;
            String s4 = ProtectedSandApp.s("劮\u0001");
            if (s4.equalsIgnoreCase(str)) {
                return s4;
            }
            String str2 = this.f71827c;
            String s5 = ProtectedSandApp.s("劰\u0001");
            if (s5.equalsIgnoreCase(str2)) {
                return s5;
            }
            String str3 = this.f71827c;
            String s6 = ProtectedSandApp.s("劯\u0001");
            return s6.equalsIgnoreCase(str3) ? s6 : "";
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("励\u0001"));
            sb.append(this.f71825a);
            sb.append(ProtectedSandApp.s("劲\u0001"));
            sb.append(this.f71826b);
            sb.append(ProtectedSandApp.s("劳\u0001"));
            sb.append(this.f71827c);
            sb.append(ProtectedSandApp.s("労\u0001"));
            sb.append(b() ? this.f71828d.length : 0);
            sb.append(ProtectedSandApp.s("劵\u0001"));
            sb.append(this.f71829e);
            sb.append(ProtectedSandApp.s("劶\u0001"));
            return l.a(sb, this.f71832h, '}');
        }

        e(String str, String str2, byte[] bArr, Map<String, String> map, boolean z4, String str3, byte[] bArr2, byte[] bArr3) {
            this.f71826b = str;
            this.f71827c = str2;
            this.f71828d = bArr;
            this.f71829e = map;
            this.f71830f = 0;
            this.f71831g = "";
            this.f71832h = z4;
            this.f71833i = str3;
            this.f71834j = bArr2;
            this.f71835k = bArr3;
        }
    }

    public static class f {

        /* renamed from: c, reason: collision with root package name */
        ByteBuffer f71838c;

        /* renamed from: a, reason: collision with root package name */
        h f71836a = h.f71872x;

        /* renamed from: b, reason: collision with root package name */
        String f71837b = "";

        /* renamed from: d, reason: collision with root package name */
        int f71839d = 0;

        /* renamed from: e, reason: collision with root package name */
        String f71840e = "";

        /* renamed from: f, reason: collision with root package name */
        Map<String, String> f71841f = null;

        /* renamed from: g, reason: collision with root package name */
        int f71842g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f71843h = 0;

        /* renamed from: i, reason: collision with root package name */
        String f71844i = "";
    }

    public enum g {
        f71845a(0),
        f71846b(1),
        f71847c(2);

        int nativeValue;

        g(int i4) {
            this.nativeValue = i4;
        }
    }

    enum h {
        f71849a(200),
        f71850b(204),
        f71851c(206),
        f71852d(301),
        f71853e(302),
        f71854f(303),
        f71855g(304),
        f71856h(307),
        f71857i(308),
        f71858j(403),
        f71859k(404),
        f71860l(HttpStatus.SC_METHOD_NOT_ALLOWED),
        f71861m(503),
        f71862n(1001),
        f71863o(1002),
        f71864p(1003),
        f71865q(1004),
        f71866r(1005),
        f71867s(1006),
        f71868t(1007),
        f71869u(1008),
        f71870v(1009),
        f71871w(1010),
        f71872x(1999);

        final int nativeValue;

        h(int i4) {
            this.nativeValue = i4;
        }
    }

    public HttpClientAndroid(int i4, int i5, int i6, boolean z4, int i7, int i10, String str, String str2, String str3, int i11, long j4) {
        this.mHttpConfig = new b(i4, i5, i6, z4, i7, i10, str, str2, str3, d.a(i11));
        this.mNativeHttpClientAndroidJni = j4;
        HandlerThread handlerThread = new HandlerThread(ProtectedSandApp.s("勘\u0001") + hashCode());
        handlerThread.start();
        LiteavLog.i(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("務\u0001") + hashCode() + ProtectedSandApp.s("勚\u0001") + handlerThread.getName() + ProtectedSandApp.s("勛\u0001") + handlerThread.getId() + ProtectedSandApp.s("勜\u0001"));
        this.mHttpHandler = new Handler(handlerThread.getLooper());
    }

    private boolean checkNativeValid() {
        boolean z4;
        synchronized (this.mLocker) {
            z4 = this.mNativeHttpClientAndroidJni != -1;
        }
        return z4;
    }

    private boolean checkRequestValid(long j4) {
        return this.mRunningRequestMap.containsKey(Long.valueOf(j4));
    }

    private void closeConnectionSafely(HttpURLConnection httpURLConnection) {
        if (this.mNetworkCallback != null && LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            try {
                try {
                    ((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("勝\u0001"))).unregisterNetworkCallback(this.mNetworkCallback);
                } finally {
                    this.mNetworkCallback = null;
                }
            } catch (Exception e4) {
                LiteavLog.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("募\u0001") + Log.getStackTraceString(e4));
            }
        }
        if (httpURLConnection != null) {
            try {
                try {
                    closeIO(httpURLConnection.getInputStream());
                } catch (Exception e5) {
                    e5.printStackTrace();
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            } finally {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    private void closeIO(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    private HttpURLConnection createConnection(e eVar) throws Exception {
        Proxy proxy;
        HttpURLConnection createConnection;
        String replace = eVar.f71826b.replace(ProtectedSandApp.s("勠\u0001"), ProtectedSandApp.s("勡\u0001"));
        URL url = new URL(replace);
        if (TextUtils.isEmpty(this.mHttpConfig.f71813g) || this.mHttpConfig.f71812f <= 0) {
            proxy = (ProtectedSandApp.s("勢\u0001").equals(url.getHost()) || ProtectedSandApp.s("勣\u0001").equals(url.getHost())) ? Proxy.NO_PROXY : null;
        } else {
            Proxy.Type type = Proxy.Type.SOCKS;
            b bVar = this.mHttpConfig;
            proxy = new Proxy(type, new InetSocketAddress(bVar.f71813g, bVar.f71812f));
            b bVar2 = this.mHttpConfig;
            Authenticator.setDefault(new a(bVar2.f71814h, bVar2.f71815i));
        }
        if (proxy != null) {
            createConnection = createConnection(url, proxy);
        } else {
            if (HttpDnsUtil.verifyCustomHttpDNS(url.getHost())) {
                try {
                    String convertHttpDNSURL = HttpDnsUtil.convertHttpDNSURL(replace, url.getHost());
                    if (TextUtils.isEmpty(convertHttpDNSURL)) {
                        createConnection = createConnection(new URL(replace), null);
                    } else {
                        createConnection = createConnection(new URL(convertHttpDNSURL), null);
                        createConnection.setRequestProperty(ProtectedSandApp.s("勤\u0001"), url.getHost());
                        HttpDnsUtil.applySniForHttpsConnection(createConnection, url.getHost());
                    }
                } catch (Exception e4) {
                    LiteavLog.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勥\u0001") + Log.getStackTraceString(e4));
                }
            }
            createConnection = createConnection(url, null);
        }
        createConnection.setInstanceFollowRedirects(false);
        createConnection.setConnectTimeout(this.mHttpConfig.f71807a);
        createConnection.setReadTimeout(this.mHttpConfig.f71808b);
        createConnection.setRequestProperty(ProtectedSandApp.s("勦\u0001"), ProtectedSandApp.s("勧\u0001"));
        createConnection.setRequestMethod(eVar.d());
        if (eVar.c()) {
            createConnection.setDoOutput(true);
        }
        boolean z4 = this.mHttpConfig.f71810d;
        String s4 = ProtectedSandApp.s("勨\u0001");
        if (z4) {
            createConnection.setRequestProperty(s4, ProtectedSandApp.s("勩\u0001"));
        } else {
            createConnection.setRequestProperty(s4, ProtectedSandApp.s("勪\u0001"));
        }
        Map<String, String> map = eVar.f71829e;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : eVar.f71829e.entrySet()) {
                createConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return createConnection;
    }

    private HttpURLConnection createConnectionByNetworkType(final URL url, final Proxy proxy) {
        int i4;
        String s4 = ProtectedSandApp.s("勞\u0001");
        String s5 = ProtectedSandApp.s("動\u0001");
        d dVar = this.mHttpConfig.f71816j;
        if (dVar == d.f71822b) {
            i4 = 1;
        } else {
            if (dVar != d.f71823c) {
                return null;
            }
            i4 = 0;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final HttpURLConnection[] httpURLConnectionArr = {null};
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(i4).build();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("勝\u0001"));
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.tencent.liteav.base.http.HttpClientAndroid.2
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                HttpClientAndroid httpClientAndroid = HttpClientAndroid.this;
                httpClientAndroid.mReallyNetworkChannel = httpClientAndroid.mHttpConfig.f71816j;
                String s6 = ProtectedSandApp.s("功\u0001");
                String str = s6 + HttpClientAndroid.this.hashCode() + ProtectedSandApp.s("加\u0001");
                String s7 = ProtectedSandApp.s("务\u0001");
                LiteavLog.i(s7, str);
                try {
                    try {
                        Proxy proxy2 = proxy;
                        if (proxy2 == null) {
                            httpURLConnectionArr[0] = (HttpURLConnection) network.openConnection(url);
                        } else {
                            httpURLConnectionArr[0] = (HttpURLConnection) network.openConnection(url, proxy2);
                        }
                    } catch (IOException e4) {
                        LiteavLog.w(s7, s6 + HttpClientAndroid.this.hashCode() + ProtectedSandApp.s("劢\u0001") + Log.getStackTraceString(e4));
                    }
                    countDownLatch.countDown();
                } catch (Throwable th) {
                    countDownLatch.countDown();
                    throw th;
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                LiteavLog.w(ProtectedSandApp.s("务\u0001"), ProtectedSandApp.s("功\u0001") + HttpClientAndroid.this.hashCode() + ProtectedSandApp.s("劣\u0001"));
                countDownLatch.countDown();
            }
        };
        this.mNetworkCallback = networkCallback;
        connectivityManager.requestNetwork(build, networkCallback);
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LiteavLog.w(s5, s4 + hashCode() + ProtectedSandApp.s("勫\u0001"));
        }
        if (httpURLConnectionArr[0] != null) {
            LiteavLog.i(s5, s4 + hashCode() + ProtectedSandApp.s("勬\u0001"));
        } else {
            LiteavLog.w(s5, s4 + hashCode() + ProtectedSandApp.s("勭\u0001"));
        }
        return httpURLConnectionArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000f, B:10:0x0020, B:13:0x0029, B:15:0x003a, B:17:0x0040, B:18:0x006f), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000f, B:10:0x0020, B:13:0x0029, B:15:0x003a, B:17:0x0040, B:18:0x006f), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.g r23, long r24, com.tencent.liteav.base.http.HttpClientAndroid.f r26, boolean r27) {
        /*
            r22 = this;
            r1 = r22
            r0 = r26
            java.lang.Object r2 = r1.mLocker
            monitor-enter(r2)
            boolean r3 = r22.checkNativeValid()     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1d
            r10 = r24
            boolean r3 = r1.checkRequestValid(r10)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1f
            if (r0 == 0) goto L1f
            r3 = r5
            goto L20
        L1b:
            r0 = move-exception
            goto L7b
        L1d:
            r10 = r24
        L1f:
            r3 = r4
        L20:
            com.tencent.liteav.base.http.HttpClientAndroid$c r6 = com.tencent.liteav.base.http.HttpClientAndroid.c.f71818b     // Catch: java.lang.Throwable -> L1b
            com.tencent.liteav.base.http.HttpClientAndroid$c r7 = r1.mInternalState     // Catch: java.lang.Throwable -> L1b
            if (r6 != r7) goto L28
            r8 = r5
            goto L29
        L28:
            r8 = r4
        L29:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$e> r4 = r1.mRunningRequestMap     // Catch: java.lang.Throwable -> L1b
            java.lang.Long r5 = java.lang.Long.valueOf(r24)     // Catch: java.lang.Throwable -> L1b
            r4.remove(r5)     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$e> r4 = r1.mRunningRequestMap     // Catch: java.lang.Throwable -> L1b
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L3e
            com.tencent.liteav.base.http.HttpClientAndroid$c r4 = com.tencent.liteav.base.http.HttpClientAndroid.c.f71817a     // Catch: java.lang.Throwable -> L1b
            r1.mInternalState = r4     // Catch: java.lang.Throwable -> L1b
        L3e:
            if (r3 == 0) goto L6f
            long r6 = r1.mNativeHttpClientAndroidJni     // Catch: java.lang.Throwable -> L1b
            r3 = r23
            int r9 = r3.nativeValue     // Catch: java.lang.Throwable -> L1b
            com.tencent.liteav.base.http.HttpClientAndroid$h r3 = r0.f71836a     // Catch: java.lang.Throwable -> L1b
            int r12 = r3.nativeValue     // Catch: java.lang.Throwable -> L1b
            java.lang.String r13 = r0.f71837b     // Catch: java.lang.Throwable -> L1b
            int r14 = r0.f71842g     // Catch: java.lang.Throwable -> L1b
            java.nio.ByteBuffer r15 = r0.f71838c     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r0.f71840e     // Catch: java.lang.Throwable -> L1b
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f71841f     // Catch: java.lang.Throwable -> L1b
            int r5 = r0.f71839d     // Catch: java.lang.Throwable -> L1b
            r18 = r5
            int r5 = r0.f71843h     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.f71844i     // Catch: java.lang.Throwable -> L1b
            com.tencent.liteav.base.http.HttpClientAndroid$d r10 = r1.mReallyNetworkChannel     // Catch: java.lang.Throwable -> L1b
            int r10 = r10.nativeValue     // Catch: java.lang.Throwable -> L1b
            r21 = r10
            r10 = r24
            r16 = r3
            r17 = r4
            r19 = r5
            r20 = r0
            nativeOnCallback(r6, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L1b
        L6f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            if (r27 == 0) goto L7a
            java.net.HttpURLConnection r0 = r1.mConnection
            r1.closeConnectionSafely(r0)
            r0 = 0
            r1.mConnection = r0
        L7a:
            return
        L7b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.http.HttpClientAndroid.doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid$g, long, com.tencent.liteav.base.http.HttpClientAndroid$f, boolean):void");
    }

    private boolean doOnCallback(g gVar, long j4, f fVar) {
        synchronized (this.mLocker) {
            try {
                if (!checkNativeValid() || !checkRequestValid(j4) || fVar == null) {
                    return false;
                }
                return nativeOnCallback(this.mNativeHttpClientAndroidJni, c.f71818b == this.mInternalState, gVar.nativeValue, j4, fVar.f71836a.nativeValue, fVar.f71837b, fVar.f71842g, fVar.f71838c, fVar.f71840e, fVar.f71841f, fVar.f71839d, fVar.f71843h, fVar.f71844i, this.mReallyNetworkChannel.nativeValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void doReadData(long j4, f fVar) {
        boolean z4;
        long elapsedRealtime;
        if (!checkRequestValid(j4)) {
            closeConnectionSafely(this.mConnection);
            LiteavLog.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勮\u0001") + j4);
            return;
        }
        try {
            InputStream inputStream = this.mConnection.getInputStream();
            synchronized (this.mLocker) {
                z4 = this.mInternalState == c.f71819c;
            }
            long j5 = 0;
            if (z4) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    do {
                        int read = inputStream.read(this.mReadDataBytes);
                        if (read > 0) {
                            byteArrayOutputStream.write(this.mReadDataBytes, 0, read);
                        }
                        if (read <= 0) {
                            break;
                        }
                    } while (checkRequestValid(j4));
                    int size = byteArrayOutputStream.size();
                    if (size > 0) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size);
                        fVar.f71838c = allocateDirect;
                        allocateDirect.put(byteArrayOutputStream.toByteArray(), 0, size);
                        fVar.f71839d = size;
                    }
                    elapsedRealtime = 0;
                } catch (Throwable th) {
                    th.printStackTrace();
                    LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勯\u0001"));
                    fVar.f71836a = getStatusCode(th);
                    fVar.f71837b = th.toString();
                    doCallbackAndResetState(g.f71846b, j4, fVar, true);
                    return;
                }
            } else {
                try {
                    int read2 = inputStream.read(this.mReadDataBytes);
                    this.mTotalReadBytes += read2;
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    if (read2 > 0) {
                        ByteBuffer byteBuffer = this.mRepeatByteBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < read2) {
                            this.mRepeatByteBuffer = ByteBuffer.allocateDirect(read2);
                        }
                        this.mRepeatByteBuffer.clear();
                        this.mRepeatByteBuffer.put(this.mReadDataBytes, 0, read2);
                        fVar.f71838c = this.mRepeatByteBuffer;
                        fVar.f71839d = read2;
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勯\u0001"));
                    fVar.f71836a = getStatusCode(e4);
                    fVar.f71837b = e4.toString();
                    doCallbackAndResetState(g.f71846b, j4, fVar, true);
                    return;
                }
            }
            if (fVar.f71839d == 0 && !z4) {
                LiteavLog.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勰\u0001"));
                doCallbackAndResetState(g.f71847c, j4, fVar, this.mHttpConfig.f71810d ^ true);
                return;
            }
            if (z4) {
                doCallbackAndResetState(g.f71847c, j4, fVar, !this.mHttpConfig.f71810d);
                return;
            }
            boolean doOnCallback = doOnCallback(g.f71845a, j4, fVar);
            this.mPausedRepeatDownloading = doOnCallback;
            this.mRepeatDownloadingStatusCode = fVar.f71836a;
            if (doOnCallback) {
                return;
            }
            int i4 = this.mHttpConfig.f71811e;
            if (i4 > 0) {
                long j6 = this.mStartReadTime;
                long j7 = elapsedRealtime - j6 == 0 ? 1L : elapsedRealtime - j6;
                long j10 = this.mTotalReadBytes;
                if (j10 / j7 > i4 / 1000) {
                    j5 = ((j10 * 1000) / i4) - j7;
                }
            }
            this.mHttpHandler.postDelayed(com.tencent.liteav.base.http.f.a(this, fVar, j4), j5);
        } catch (Exception e5) {
            e5.printStackTrace();
            LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勱\u0001"));
            fVar.f71836a = getStatusCode(e5);
            fVar.f71837b = e5.toString();
            doCallbackAndResetState(g.f71846b, j4, fVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRequest(e eVar) {
        h hVar;
        f fVar = null;
        for (int i4 = 0; i4 < 4; i4++) {
            fVar = internalRequest(eVar);
            if (fVar == null) {
                return;
            }
            if (!eVar.f71832h || ((hVar = fVar.f71836a) != h.f71852d && hVar != h.f71853e)) {
                break;
            }
            String headerField = this.mConnection.getHeaderField(ProtectedSandApp.s("勲\u0001"));
            eVar.f71826b = headerField;
            eVar.f71830f++;
            eVar.f71831g = headerField;
        }
        this.mTotalReadBytes = 0L;
        this.mStartReadTime = SystemClock.elapsedRealtime();
        doReadData(eVar.f71825a, fVar);
    }

    public static HashMap getJavaHashMap(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return new HashMap();
        }
        if (strArr.length != strArr2.length) {
            LiteavLog.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勳\u0001"));
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            hashMap.put(strArr[i4], strArr2[i4]);
        }
        return hashMap;
    }

    public static String[] getMapKeys(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        Set<String> keySet = map.keySet();
        return (String[]) keySet.toArray(new String[keySet.size()]);
    }

    public static String[] getMapValue(Map<String, String> map, String[] strArr) {
        if (map == null || map.isEmpty() || strArr == null || strArr.length == 0) {
            return new String[0];
        }
        String[] strArr2 = new String[strArr.length];
        for (int i4 = 0; i4 < strArr.length; i4++) {
            strArr2[i4] = map.get(strArr[i4]);
        }
        return strArr2;
    }

    private Map<String, String> getResponseHeaders(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return hashMap;
    }

    private h getStatusCode(int i4) {
        h hVar = h.f71872x;
        if (i4 == 200) {
            return h.f71849a;
        }
        if (i4 == 204) {
            return h.f71850b;
        }
        if (i4 == 206) {
            return h.f71851c;
        }
        if (i4 == 301) {
            return h.f71852d;
        }
        if (i4 == 302) {
            return h.f71853e;
        }
        if (i4 == 303) {
            return h.f71854f;
        }
        if (i4 == 304) {
            return h.f71855g;
        }
        if (i4 == 307) {
            return h.f71856h;
        }
        if (i4 == 308) {
            return h.f71857i;
        }
        if (i4 == 403) {
            return h.f71858j;
        }
        if (i4 == 404) {
            return h.f71859k;
        }
        if (i4 == 405) {
            return h.f71860l;
        }
        if (i4 == 503) {
            return h.f71861m;
        }
        Log.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勴\u0001") + i4, new Object[0]);
        return hVar;
    }

    private f internalRequest(e eVar) {
        boolean z4;
        if (!eVar.a()) {
            LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勶\u0001") + eVar.f71826b + ProtectedSandApp.s("勷\u0001"));
            return null;
        }
        if (!checkRequestValid(eVar.f71825a)) {
            LiteavLog.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勸\u0001") + eVar);
            return null;
        }
        f fVar = new f();
        fVar.f71843h = eVar.f71830f;
        fVar.f71844i = eVar.f71831g;
        synchronized (this.mLocker) {
            z4 = this.mInternalState == c.f71819c;
        }
        if (z4 && this.mConnection != null && !eVar.f71826b.equals(this.mLastRequestURL)) {
            closeConnectionSafely(this.mConnection);
            this.mConnection = null;
        }
        this.mLastRequestURL = eVar.f71826b;
        try {
            this.mConnection = createConnection(eVar);
            writeRequestBody(eVar);
            try {
                fVar.f71836a = getStatusCode(this.mConnection.getResponseCode());
                fVar.f71837b = this.mConnection.getResponseMessage();
                fVar.f71840e = parseHostAddress(this.mConnection.getURL().getHost());
                fVar.f71842g = this.mConnection.getURL().getPort();
                fVar.f71841f = getResponseHeaders(this.mConnection.getHeaderFields());
                if (checkRequestValid(eVar.f71825a)) {
                    return fVar;
                }
                closeConnectionSafely(this.mConnection);
                LiteavLog.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勹\u0001"));
                return null;
            } catch (Exception e4) {
                e4.printStackTrace();
                LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勺\u0001") + Log.getStackTraceString(e4));
                fVar.f71836a = getStatusCode(e4);
                fVar.f71837b = e4.toString();
                doCallbackAndResetState(g.f71846b, eVar.f71825a, fVar, true);
                return null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勻\u0001") + Log.getStackTraceString(e5));
            fVar.f71836a = getStatusCode(e5);
            fVar.f71837b = e5.toString();
            doCallbackAndResetState(g.f71846b, eVar.f71825a, fVar, true);
            return null;
        }
    }

    static /* synthetic */ void lambda$cancelAll$1(HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
    }

    static /* synthetic */ void lambda$destroy$4(HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            httpClientAndroid.mHttpHandler.getLooper().quitSafely();
        } else {
            httpClientAndroid.mHttpHandler.getLooper().quit();
        }
    }

    static /* synthetic */ void lambda$doReadData$5(HttpClientAndroid httpClientAndroid, f fVar, long j4) {
        f fVar2 = new f();
        fVar2.f71836a = fVar.f71836a;
        httpClientAndroid.doReadData(j4, fVar2);
    }

    static /* synthetic */ void lambda$resumeRepeatDownload$2(HttpClientAndroid httpClientAndroid, Long l4) {
        f fVar = new f();
        fVar.f71836a = httpClientAndroid.mRepeatDownloadingStatusCode;
        httpClientAndroid.doReadData(l4.longValue(), fVar);
    }

    static /* synthetic */ void lambda$resumeRepeatDownload$3(HttpClientAndroid httpClientAndroid, long j4) {
        f fVar = new f();
        fVar.f71836a = httpClientAndroid.mRepeatDownloadingStatusCode;
        httpClientAndroid.doReadData(j4, fVar);
    }

    private static native boolean nativeOnCallback(long j4, boolean z4, int i4, long j5, int i5, String str, int i6, ByteBuffer byteBuffer, String str2, Map map, int i7, int i10, String str3, int i11);

    private static native void nativeOnUploadProgress(long j4, long j5, long j6, long j7);

    private HttpURLConnection openConnection(URL url, Proxy proxy) throws Exception {
        return proxy != null ? (HttpURLConnection) url.openConnection(proxy) : (HttpURLConnection) url.openConnection();
    }

    private String parseHostAddress(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Exception unused) {
            LiteavLog.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勼\u0001") + str);
            return "";
        }
    }

    private long sendInternal(long j4, e eVar, boolean z4) {
        if (eVar == null || !eVar.a()) {
            LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("匀\u0001") + eVar.f71826b + ProtectedSandApp.s("勷\u0001"));
            return 0L;
        }
        if (TextUtils.isEmpty(eVar.d())) {
            LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勽\u0001") + eVar.f71827c + ProtectedSandApp.s("勾\u0001"));
            return 0L;
        }
        synchronized (this.mLocker) {
            try {
                if (this.mInternalState == c.f71817a) {
                    this.mInternalState = z4 ? c.f71818b : c.f71819c;
                } else if (this.mInternalState != c.f71819c) {
                    LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勿\u0001") + this.mInternalState);
                    return 0L;
                }
                eVar.f71825a = j4;
                this.mRunningRequestMap.put(Long.valueOf(j4), eVar);
                this.mHttpHandler.post(com.tencent.liteav.base.http.a.a(this, eVar));
                return eVar.f71825a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void uploadFileByPath(e eVar, OutputStream outputStream) throws Exception {
        File file;
        FileInputStream fileInputStream;
        long j4;
        if (TextUtils.isEmpty(eVar.f71833i)) {
            return;
        }
        Closeable closeable = null;
        try {
            file = new File(eVar.f71833i);
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[524288];
            long length = file.length();
            long j5 = 0;
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                synchronized (this.mLocker) {
                    try {
                        if (!checkRequestValid(eVar.f71825a) || !checkNativeValid()) {
                            break;
                        }
                        j4 = j5 + read;
                        outputStream.write(bArr, 0, read);
                        nativeOnUploadProgress(this.mNativeHttpClientAndroidJni, eVar.f71825a, j4, length);
                    } finally {
                    }
                }
                j5 = j4;
            }
            closeIO(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            closeable = fileInputStream;
            closeIO(closeable);
            throw th;
        }
    }

    private void writeRequestBody(e eVar) {
        OutputStream outputStream = null;
        try {
            try {
                if (eVar.c() && eVar.b()) {
                    outputStream = this.mConnection.getOutputStream();
                    outputStream.write(eVar.f71828d);
                    outputStream.flush();
                } else if (eVar.c() && !TextUtils.isEmpty(eVar.f71833i)) {
                    outputStream = this.mConnection.getOutputStream();
                    byte[] bArr = eVar.f71834j;
                    if (bArr != null && bArr.length > 0) {
                        outputStream.write(bArr);
                    }
                    uploadFileByPath(eVar, outputStream);
                    byte[] bArr2 = eVar.f71835k;
                    if (bArr2 != null && bArr2.length > 0) {
                        outputStream.write(bArr2);
                    }
                    outputStream.flush();
                }
                closeIO(outputStream);
            } catch (Exception e4) {
                e4.printStackTrace();
                LiteavLog.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("匁\u0001"));
                closeIO(null);
            }
        } catch (Throwable th) {
            closeIO(null);
            throw th;
        }
    }

    public void cancel(long j4) {
        synchronized (this.mLocker) {
            try {
                if (!checkNativeValid()) {
                    LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("匂\u0001"));
                    return;
                }
                if (this.mRunningRequestMap.size() == 0) {
                    return;
                }
                e remove = this.mRunningRequestMap.remove(Long.valueOf(j4));
                LiteavLog.i(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("匃\u0001") + remove);
                if (this.mRunningRequestMap.size() == 0) {
                    this.mInternalState = c.f71817a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cancelAll() {
        synchronized (this.mLocker) {
            try {
                if (!checkNativeValid()) {
                    LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("匄\u0001"));
                    return;
                }
                c cVar = this.mInternalState;
                c cVar2 = c.f71817a;
                if (cVar == cVar2) {
                    return;
                }
                this.mInternalState = cVar2;
                LiteavLog.i(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("包\u0001") + this.mRunningRequestMap.size());
                this.mRunningRequestMap.clear();
                this.mHttpHandler.post(com.tencent.liteav.base.http.b.a(this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void destroy() {
        synchronized (this.mLocker) {
            this.mRunningRequestMap.clear();
            this.mNativeHttpClientAndroidJni = -1L;
            this.mHttpHandler.post(com.tencent.liteav.base.http.e.a(this));
        }
    }

    public void resumeRepeatDownload(long j4) {
        synchronized (this.mLocker) {
            try {
                if (!checkNativeValid()) {
                    LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("匂\u0001"));
                    return;
                }
                if (this.mRunningRequestMap.size() == 0) {
                    return;
                }
                if (this.mInternalState == c.f71818b && this.mPausedRepeatDownloading) {
                    this.mPausedRepeatDownloading = false;
                    if (j4 == 0) {
                        Iterator<Long> it = this.mRunningRequestMap.keySet().iterator();
                        while (it.hasNext()) {
                            this.mHttpHandler.post(com.tencent.liteav.base.http.c.a(this, it.next()));
                        }
                    } else if (checkRequestValid(j4)) {
                        if (this.mRunningRequestMap.get(Long.valueOf(j4)) == null) {
                        } else {
                            this.mHttpHandler.post(com.tencent.liteav.base.http.d.a(this, j4));
                        }
                    }
                }
            } finally {
            }
        }
    }

    public long send(long j4, String str, String str2, byte[] bArr, Map<String, String> map, boolean z4, boolean z5) {
        if (checkNativeValid()) {
            return sendInternal(j4, new e(str, str2, bArr, map, z5), z4);
        }
        LiteavLog.e(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("匆\u0001"));
        return 0L;
    }

    public void updateConfig(final int i4, final int i5, final int i6, final boolean z4, final int i7, final int i10, final String str, final String str2, final String str3, final int i11, long j4) {
        this.mHttpHandler.post(new Runnable() { // from class: com.tencent.liteav.base.http.HttpClientAndroid.1
            @Override // java.lang.Runnable
            public final void run() {
                HttpClientAndroid.this.mHttpConfig = new b(i4, i5, i6, z4, i7, i10, str, str2, str3, d.a(i11));
                HttpClientAndroid.this.mReallyNetworkChannel = d.f71821a;
                if (i7 > 0) {
                    HttpClientAndroid.this.mTotalReadBytes = 0L;
                    HttpClientAndroid.this.mStartReadTime = SystemClock.elapsedRealtime();
                }
            }
        });
    }

    public long uploadFile(long j4, String str, String str2, byte[] bArr, Map<String, String> map, boolean z4, boolean z5, String str3, byte[] bArr2, byte[] bArr3) {
        boolean checkNativeValid = checkNativeValid();
        String s4 = ProtectedSandApp.s("勞\u0001");
        String s5 = ProtectedSandApp.s("動\u0001");
        if (!checkNativeValid) {
            LiteavLog.e(s5, s4 + hashCode() + ProtectedSandApp.s("匇\u0001"));
            return 0L;
        }
        if (!str3.isEmpty()) {
            return sendInternal(j4, new e(str, str2, bArr, map, z5, str3, bArr2, bArr3), z4);
        }
        LiteavLog.e(s5, s4 + hashCode() + ProtectedSandApp.s("匈\u0001") + str3 + ProtectedSandApp.s("勷\u0001"));
        return 0L;
    }

    private h getStatusCode(Throwable th) {
        h hVar = h.f71872x;
        if (th instanceof FileNotFoundException) {
            return h.f71862n;
        }
        if (th instanceof EOFException) {
            return h.f71863o;
        }
        if (th instanceof UnknownHostException) {
            return h.f71864p;
        }
        if (th instanceof NoRouteToHostException) {
            return h.f71865q;
        }
        if (!(th instanceof SocketException) && !(th instanceof MalformedURLException)) {
            if (th instanceof SocketTimeoutException) {
                return h.f71868t;
            }
            if (th instanceof ConnectException) {
                return h.f71869u;
            }
            if (th instanceof ProtocolException) {
                return h.f71870v;
            }
            if (th instanceof SSLException) {
                return h.f71871w;
            }
            Log.w(ProtectedSandApp.s("動\u0001"), ProtectedSandApp.s("勞\u0001") + hashCode() + ProtectedSandApp.s("勵\u0001"), th.toString());
            return hVar;
        }
        return h.f71866r;
    }

    private HttpURLConnection createConnection(URL url, Proxy proxy) throws Exception {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return openConnection(url, proxy);
        }
        if (this.mHttpConfig.f71816j == d.f71821a) {
            return openConnection(url, proxy);
        }
        HttpURLConnection createConnectionByNetworkType = createConnectionByNetworkType(url, proxy);
        return createConnectionByNetworkType != null ? createConnectionByNetworkType : openConnection(url, proxy);
    }
}
