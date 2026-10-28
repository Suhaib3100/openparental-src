package com.tencent.liteav.base.util;

import android.net.SSLCertificateSocketFactory;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

@JNINamespace("liteav::dns")
/* loaded from: classes7.dex */
public class HttpDnsUtil {
    private static final List<String> WHITE_LIST_HOST;
    private static a mCustomHttpDNSCallback;
    private static boolean mEnableCustomHttpDNS;
    private static Pattern sValidIPV4Pattern;
    private static final String sVerifyMethodBase64 = ProtectedSandApp.s("卞\u0001");
    private static final String sVClass = ProtectedSandApp.s("卟\u0001");
    private static final String sIPV4Regular = ProtectedSandApp.s("占\u0001");
    private static final String TAG = ProtectedSandApp.s("卡\u0001");
    private static final Object mLock = new Object();

    public interface a {
        void a(String str, List<String> list);
    }

    static class b extends SSLSocketFactory {

        /* renamed from: a, reason: collision with root package name */
        private HttpsURLConnection f71915a;

        public b(HttpsURLConnection httpsURLConnection) {
            this.f71915a = httpsURLConnection;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket() throws IOException {
            return null;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getDefaultCipherSuites() {
            return new String[0];
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getSupportedCipherSuites() {
            return new String[0];
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i4) throws IOException, UnknownHostException {
            return null;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i4, InetAddress inetAddress, int i5) throws IOException, UnknownHostException {
            return null;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i4) throws IOException {
            return null;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i4, InetAddress inetAddress2, int i5) throws IOException {
            return null;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final Socket createSocket(Socket socket, String str, int i4, boolean z4) throws IOException {
            String requestProperty = this.f71915a.getRequestProperty(ProtectedSandApp.s("南\u0001"));
            if (requestProperty != null) {
                str = requestProperty;
            }
            InetAddress inetAddress = socket.getInetAddress();
            if (z4) {
                socket.close();
            }
            SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
            SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i4);
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
            String s4 = ProtectedSandApp.s("単\u0001");
            String s5 = ProtectedSandApp.s("卙\u0001");
            LiteavLog.i(s5, s4);
            sSLCertificateSocketFactory.setHostname(sSLSocket, str);
            SSLSession session = sSLSocket.getSession();
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(str, session)) {
                LiteavLog.i(s5, ProtectedSandApp.s("博\u0001") + session.getProtocol() + ProtectedSandApp.s("卛\u0001") + session.getPeerHost() + ProtectedSandApp.s("卜\u0001") + session.getCipherSuite());
                return sSLSocket;
            }
            throw new SSLPeerUnverifiedException(ProtectedSandApp.s("卝\u0001").concat(String.valueOf(str)));
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        WHITE_LIST_HOST = arrayList;
        arrayList.add(ProtectedSandApp.s("卢\u0001"));
        arrayList.add(ProtectedSandApp.s("卣\u0001"));
        arrayList.add(ProtectedSandApp.s("卤\u0001"));
        arrayList.add(ProtectedSandApp.s("卥\u0001"));
        arrayList.add(ProtectedSandApp.s("卦\u0001"));
        arrayList.add(ProtectedSandApp.s("卧\u0001"));
        arrayList.add(ProtectedSandApp.s("卨\u0001"));
        arrayList.add(ProtectedSandApp.s("卩\u0001"));
        arrayList.add(ProtectedSandApp.s("卪\u0001"));
        arrayList.add(ProtectedSandApp.s("卫\u0001"));
        arrayList.add(ProtectedSandApp.s("卬\u0001"));
        arrayList.add(ProtectedSandApp.s("卭\u0001"));
        arrayList.add(ProtectedSandApp.s("卮\u0001"));
        arrayList.add(ProtectedSandApp.s("卯\u0001"));
        arrayList.add(ProtectedSandApp.s("印\u0001"));
        arrayList.add(ProtectedSandApp.s("危\u0001"));
        arrayList.add(ProtectedSandApp.s("卲\u0001"));
        arrayList.add(ProtectedSandApp.s("即\u0001"));
        arrayList.add(ProtectedSandApp.s("却\u0001"));
        arrayList.add(ProtectedSandApp.s("卵\u0001"));
        arrayList.add(ProtectedSandApp.s("卶\u0001"));
        arrayList.add(ProtectedSandApp.s("卷\u0001"));
        arrayList.add(ProtectedSandApp.s("卸\u0001"));
        arrayList.add(ProtectedSandApp.s("卹\u0001"));
        arrayList.add(ProtectedSandApp.s("卺\u0001"));
        arrayList.add(ProtectedSandApp.s("卻\u0001"));
        arrayList.add(ProtectedSandApp.s("卼\u0001"));
        arrayList.add(ProtectedSandApp.s("卽\u0001"));
        arrayList.add(ProtectedSandApp.s("卾\u0001"));
    }

    public static void applySniForHttpsConnection(HttpURLConnection httpURLConnection, final String str) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(new b(httpsURLConnection));
            try {
                InvocationHandler invocationHandler = new InvocationHandler() { // from class: com.tencent.liteav.base.util.HttpDnsUtil.1
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                        if (!method.getName().equals(ProtectedSandApp.s("卖\u0001"))) {
                            return method.invoke(HttpsURLConnection.getDefaultHostnameVerifier(), objArr);
                        }
                        return Boolean.valueOf(HttpsURLConnection.getDefaultHostnameVerifier().verify(str, (SSLSession) objArr[1]));
                    }
                };
                Class<?> cls = Class.forName(new String(Base64.decode(ProtectedSandApp.s("卟\u0001"), 0)));
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
                Method declaredMethod = HttpsURLConnection.class.getDeclaredMethod(new String(Base64.decode(ProtectedSandApp.s("卞\u0001"), 0)), cls);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(httpsURLConnection, newProxyInstance);
            } catch (Throwable th) {
                LiteavLog.e(ProtectedSandApp.s("卡\u0001"), ProtectedSandApp.s("卿\u0001") + Log.getStackTraceString(th));
            }
        }
    }

    public static String convertHttpDNSURL(String str, String str2) throws Exception {
        String parseAddressUseCustomHttpDns = parseAddressUseCustomHttpDns(str2);
        if (TextUtils.isEmpty(parseAddressUseCustomHttpDns)) {
            return null;
        }
        InetAddress byName = InetAddress.getByName(parseAddressUseCustomHttpDns);
        if (byName instanceof Inet4Address) {
            return str.replaceFirst(str2, parseAddressUseCustomHttpDns);
        }
        if (!(byName instanceof Inet6Address)) {
            return null;
        }
        return str.replaceFirst(str2, ProtectedSandApp.s("厀\u0001") + parseAddressUseCustomHttpDns + ProtectedSandApp.s("厁\u0001"));
    }

    public static HttpURLConnection createConnectionUseCustomHttpDNS(String str, String str2) throws Exception {
        String convertHttpDNSURL = convertHttpDNSURL(str, str2);
        if (TextUtils.isEmpty(convertHttpDNSURL)) {
            return (HttpURLConnection) new URL(str).openConnection();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(convertHttpDNSURL).openConnection();
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("厂\u0001"), str2);
        applySniForHttpsConnection(httpURLConnection, str2);
        LiteavLog.i(ProtectedSandApp.s("卡\u0001"), ProtectedSandApp.s("厃\u0001") + str + ProtectedSandApp.s("厄\u0001") + convertHttpDNSURL);
        return httpURLConnection;
    }

    public static void enableCustomHttpDNS(boolean z4, a aVar) {
        LiteavLog.i(ProtectedSandApp.s("卡\u0001"), ProtectedSandApp.s("厅\u0001").concat(String.valueOf(z4)));
        synchronized (mLock) {
            mEnableCustomHttpDNS = z4;
            mCustomHttpDNSCallback = aVar;
        }
    }

    public static boolean isEnableCustomHttpDNS() {
        return mEnableCustomHttpDNS;
    }

    public static boolean isHostInWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return WHITE_LIST_HOST.contains(new String(Base64.encode(str.getBytes(), 0)).trim());
    }

    public static boolean isIpAddress(String str) {
        if (str != null && !"".equals(str)) {
            if (sValidIPV4Pattern == null) {
                try {
                    sValidIPV4Pattern = Pattern.compile(ProtectedSandApp.s("占\u0001"), 2);
                } catch (Exception e4) {
                    LiteavLog.e(ProtectedSandApp.s("卡\u0001"), ProtectedSandApp.s("历\u0001") + Log.getStackTraceString(e4));
                    return false;
                }
            }
            if (sValidIPV4Pattern.matcher(str).matches() || str.contains(ProtectedSandApp.s("厇\u0001"))) {
                return true;
            }
        }
        return false;
    }

    public static String parseAddressUseCustomHttpDns(String str) {
        if (!verifyCustomHttpDNS(str)) {
            return "";
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        synchronized (mLock) {
            mCustomHttpDNSCallback.a(str, arrayList);
        }
        if (arrayList.size() <= 0) {
            LiteavLog.i(ProtectedSandApp.s("卡\u0001"), ProtectedSandApp.s("厈\u0001") + str + ProtectedSandApp.s("厌\u0001"));
            return "";
        }
        String str2 = (String) arrayList.get(0);
        String s4 = ProtectedSandApp.s("卡\u0001");
        StringBuilder a5 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("厈\u0001"), str, ProtectedSandApp.s("厉\u0001"), str2, ProtectedSandApp.s("厊\u0001"));
        a5.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        a5.append(ProtectedSandApp.s("压\u0001"));
        LiteavLog.i(s4, a5.toString());
        return str2;
    }

    public static boolean verifyCustomHttpDNS(String str) {
        synchronized (mLock) {
            if (mEnableCustomHttpDNS && mCustomHttpDNSCallback != null) {
                if (isHostInWhiteList(str) || isIpAddress(str)) {
                    return false;
                }
                String property = System.getProperty(ProtectedSandApp.s("厍\u0001"));
                String property2 = System.getProperty(ProtectedSandApp.s("厎\u0001"));
                if (property == null || property2 == null) {
                    return true;
                }
                LiteavLog.w(ProtectedSandApp.s("卡\u0001"), ProtectedSandApp.s("厏\u0001") + property + ProtectedSandApp.s("厐\u0001") + property2);
                return false;
            }
            return false;
        }
    }
}
