package com.androidquery.callback;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Xml;
import android.view.View;
import androidx.compose.material3.z3;
import com.androidquery.util.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HttpContext;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AbstractAjaxCallback.java */
/* loaded from: classes3.dex */
public abstract class a<T, K> implements Runnable {
    private static int I = 30000;
    private static String J = null;
    private static int K = 4;
    private static boolean L = true;
    private static boolean M = true;
    private static f N;
    private static ExecutorService P;
    private static SocketFactory Q;
    private static DefaultHttpClient R;
    private HttpUriRequest A;
    private HttpHost D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;

    /* renamed from: b, reason: collision with root package name */
    private Class<T> f41103b;

    /* renamed from: c, reason: collision with root package name */
    private Reference<Object> f41104c;

    /* renamed from: d, reason: collision with root package name */
    private Object f41105d;

    /* renamed from: e, reason: collision with root package name */
    private String f41106e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<Object> f41107f;

    /* renamed from: g, reason: collision with root package name */
    private String f41108g;

    /* renamed from: h, reason: collision with root package name */
    private String f41109h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f41110i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, String> f41111j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, String> f41112k;

    /* renamed from: l, reason: collision with root package name */
    private f f41113l;

    /* renamed from: m, reason: collision with root package name */
    protected T f41114m;

    /* renamed from: o, reason: collision with root package name */
    private File f41116o;

    /* renamed from: p, reason: collision with root package name */
    private File f41117p;

    /* renamed from: q, reason: collision with root package name */
    private com.androidquery.auth.a f41118q;

    /* renamed from: r, reason: collision with root package name */
    protected c f41119r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f41120s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f41121t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f41122u;

    /* renamed from: w, reason: collision with root package name */
    private long f41124w;

    /* renamed from: y, reason: collision with root package name */
    private WeakReference<Activity> f41126y;
    private static final String Q1 = ProtectedSandApp.s("ܪ");
    private static final String Y = ProtectedSandApp.s("ܫ");
    private static final String Z = ProtectedSandApp.s("ܬ");
    private static final Class<?>[] O = {String.class, Object.class, c.class};
    private static int X = 200;

    /* renamed from: n, reason: collision with root package name */
    private int f41115n = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f41123v = 0;

    /* renamed from: x, reason: collision with root package name */
    private String f41125x = ProtectedSandApp.s("ܭ");

    /* renamed from: z, reason: collision with root package name */
    private int f41127z = 4;
    private boolean B = true;
    private int C = 0;

    /* compiled from: AbstractAjaxCallback.java */
    /* renamed from: com.androidquery.callback.a$a, reason: collision with other inner class name */
    class RunnableC0680a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f41128b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f41129c;

        RunnableC0680a(Object obj, boolean z4) {
            this.f41128b = obj;
            this.f41129c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.androidquery.util.c.E(this.f41128b, a.this.f41108g, this.f41129c);
        }
    }

    private String B0(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(ProtectedSandApp.s("ܮ"))) == -1) {
            return null;
        }
        int indexOf2 = str.indexOf(ProtectedSandApp.s("ܯ"), indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return str.substring(indexOf + 7, indexOf2).replaceAll(ProtectedSandApp.s("ܰ"), "");
    }

    private void D() {
        if (this.f41114m == null || !this.f41120s) {
            return;
        }
        byte[] n4 = this.f41119r.n();
        if (n4 != null) {
            try {
                if (this.f41119r.z() == 1) {
                    File H = H();
                    if (!this.f41119r.u()) {
                        E(this.f41108g, this.f41114m, H, n4);
                    } else if (H.exists()) {
                        H.delete();
                    }
                }
            } catch (Exception e4) {
                com.androidquery.util.a.k(e4);
            }
        }
        this.f41119r.f(null);
    }

    private static String D0(String str) {
        return str.replaceAll(ProtectedSandApp.s("ܱ"), ProtectedSandApp.s("ܲ")).replaceAll(ProtectedSandApp.s("ܳ"), ProtectedSandApp.s("ܴ"));
    }

    private void F() {
        File c5 = c(this.f41116o, I());
        if (c5 != null) {
            this.f41119r.I(3);
            T C = C(this.f41108g, c5, this.f41119r);
            this.f41114m = C;
            if (C != null) {
                this.f41119r.J(new Date(c5.lastModified())).g();
            }
        }
    }

    public static int G() {
        ExecutorService executorService = P;
        if (executorService instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) executorService).getActiveCount();
        }
        return 0;
    }

    private String I() {
        com.androidquery.auth.a aVar = this.f41118q;
        return aVar != null ? aVar.h(this.f41108g) : this.f41108g;
    }

    private String M(String str) {
        Matcher matcher = Pattern.compile(ProtectedSandApp.s("ܵ"), 2).matcher(str);
        if (matcher.find()) {
            return B0(matcher.group());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private K M0() {
        return this;
    }

    private static DefaultHttpClient N() {
        if (R == null || !M) {
            com.androidquery.util.a.i(ProtectedSandApp.s("ܶ"));
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, I);
            HttpConnectionParams.setSoTimeout(basicHttpParams, I);
            ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(25));
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme(ProtectedSandApp.s("ܷ"), PlainSocketFactory.getSocketFactory(), 80));
            SocketFactory socketFactory = Q;
            if (socketFactory == null) {
                socketFactory = SSLSocketFactory.getSocketFactory();
            }
            schemeRegistry.register(new Scheme(ProtectedSandApp.s("ܸ"), socketFactory, org.java_websocket_new.d.F2));
            R = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        }
        return R;
    }

    public static void N0(String str) {
        J = str;
    }

    public static void O0(boolean z4) {
        L = z4;
    }

    private String P(HttpEntity httpEntity) {
        Header contentEncoding;
        if (httpEntity == null || (contentEncoding = httpEntity.getContentEncoding()) == null) {
            return null;
        }
        return contentEncoding.getValue();
    }

    public static void P0(int i4) {
        int max = Math.max(1, Math.min(25, i4));
        K = max;
        P = null;
        com.androidquery.util.a.j(ProtectedSandApp.s("ܹ"), Integer.valueOf(max));
    }

    public static void Q0(boolean z4) {
        M = z4;
        R = null;
    }

    protected static int R() {
        return X;
    }

    public static void R0(SocketFactory socketFactory) {
        Q = socketFactory;
        R = null;
    }

    public static void S0(int i4) {
        I = i4;
    }

    private String T(String str) {
        String str2 = this.f41109h;
        if (str2 != null) {
            str = str2;
        }
        com.androidquery.auth.a aVar = this.f41118q;
        return aVar != null ? aVar.i(str) : str;
    }

    public static void T0(f fVar) {
        N = fVar;
    }

    private File U() {
        File file;
        if (m0()) {
            file = this.f41117p;
            if (file == null) {
                if (this.f41120s) {
                    file = H();
                } else {
                    File A = com.androidquery.util.a.A();
                    if (A == null) {
                        A = this.f41116o;
                    }
                    file = com.androidquery.util.a.r(A, this.f41108g);
                }
            }
        } else {
            file = null;
        }
        if (file != null && !file.exists()) {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (Exception e4) {
                com.androidquery.util.a.R(e4);
                return null;
            }
        }
        return file;
    }

    private byte[] Y0(String str, InputStream inputStream) throws IOException {
        if (ProtectedSandApp.s("ܺ").equalsIgnoreCase(str)) {
            inputStream = new GZIPInputStream(inputStream);
        }
        return com.androidquery.util.a.c0(inputStream);
    }

    private void d() {
        String str = this.f41108g;
        if (str != null && this.f41121t) {
            r0(str, this.f41114m);
        }
        l();
        o();
    }

    private void d0(String str, Map<String, String> map, c cVar) throws IOException {
        com.androidquery.util.a.j(ProtectedSandApp.s("ܻ"), str);
        String D0 = D0(str);
        e0(new HttpDelete(D0), D0, map, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f2  */
    /* JADX WARN: Type inference failed for: r19v0, types: [org.apache.http.HttpRequest, org.apache.http.client.methods.HttpUriRequest] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e0(org.apache.http.client.methods.HttpUriRequest r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21, com.androidquery.callback.c r22) throws org.apache.http.client.ClientProtocolException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidquery.callback.a.e0(org.apache.http.client.methods.HttpUriRequest, java.lang.String, java.util.Map, com.androidquery.callback.c):void");
    }

    private void e1() {
        if (this.F) {
            synchronized (this) {
                try {
                    notifyAll();
                } catch (Exception unused) {
                }
            }
        }
    }

    private void f0(String str, HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, Map<String, String> map, Map<String, Object> map2, c cVar) throws ClientProtocolException, IOException {
        HttpEntity urlEncodedFormEntity;
        httpEntityEnclosingRequestBase.getParams().setBooleanParameter(ProtectedSandApp.s("݉"), false);
        Object obj = map2.get(ProtectedSandApp.s("݊"));
        if (obj instanceof HttpEntity) {
            urlEncodedFormEntity = (HttpEntity) obj;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    arrayList.add(new BasicNameValuePair(entry.getKey(), value.toString()));
                }
            }
            urlEncodedFormEntity = new UrlEncodedFormEntity(arrayList, ProtectedSandApp.s("ܭ"));
        }
        if (map != null) {
            String s4 = ProtectedSandApp.s("\u074b");
            if (!map.containsKey(s4)) {
                map.put(s4, ProtectedSandApp.s("\u074c"));
            }
        }
        httpEntityEnclosingRequestBase.setEntity(urlEncodedFormEntity);
        e0(httpEntityEnclosingRequestBase, str, map, cVar);
    }

    private void g0(String str, Map<String, String> map, c cVar) throws IOException {
        com.androidquery.util.a.j(ProtectedSandApp.s("ܻ"), str);
        String D0 = D0(str);
        e0(new HttpGet(D0), D0, map, cVar);
    }

    private void g1(Context context) {
        T q02 = q0(this.f41108g);
        if (q02 == null) {
            this.f41116o = com.androidquery.util.a.q(context, this.f41115n);
            w(this);
        } else {
            this.f41114m = q02;
            this.f41119r.I(4).g();
            l();
        }
    }

    private void h0(String str, Map<String, String> map, Map<String, Object> map2, c cVar) throws IOException {
        String str2;
        byte[] bArr;
        com.androidquery.util.a.j(ProtectedSandApp.s("ݍ"), str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(I * 4);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod(ProtectedSandApp.s("ݎ"));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ݏ"), ProtectedSandApp.s("ݐ"));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("\u074b"), ProtectedSandApp.s("ݑ"));
        if (map != null) {
            for (String str3 : map.keySet()) {
                httpURLConnection.setRequestProperty(str3, map.get(str3));
            }
        }
        String n02 = n0();
        if (n02 != null) {
            httpURLConnection.setRequestProperty(ProtectedSandApp.s("ܾ"), n02);
        }
        com.androidquery.auth.a aVar = this.f41118q;
        if (aVar != null) {
            aVar.a(this, httpURLConnection);
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            j1(dataOutputStream, entry.getKey(), entry.getValue());
        }
        dataOutputStream.writeBytes(ProtectedSandApp.s("ݒ"));
        dataOutputStream.flush();
        dataOutputStream.close();
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        String contentEncoding = httpURLConnection.getContentEncoding();
        if (responseCode < 200 || responseCode >= 300) {
            str2 = new String(Y0(contentEncoding, httpURLConnection.getErrorStream()), ProtectedSandApp.s("ܭ"));
            com.androidquery.util.a.j(ProtectedSandApp.s("݆"), str2);
            bArr = null;
        } else {
            bArr = Y0(contentEncoding, httpURLConnection.getInputStream());
            str2 = null;
        }
        com.androidquery.util.a.j(ProtectedSandApp.s("݇"), Integer.valueOf(responseCode));
        if (bArr != null) {
            com.androidquery.util.a.j(Integer.valueOf(bArr.length), str);
        }
        cVar.d(responseCode).D(responseMessage).F(str).J(new Date()).f(bArr).h(str2).a(null);
    }

    private static void h1(DataOutputStream dataOutputStream, String str, String str2, InputStream inputStream) throws IOException {
        dataOutputStream.writeBytes(ProtectedSandApp.s("ݓ"));
        dataOutputStream.writeBytes(ProtectedSandApp.s("ݔ") + str + ProtectedSandApp.s("ݕ") + str2 + ProtectedSandApp.s("ݖ"));
        dataOutputStream.writeBytes(ProtectedSandApp.s("ݗ"));
        String s4 = ProtectedSandApp.s("ܫ");
        dataOutputStream.writeBytes(s4);
        dataOutputStream.writeBytes(ProtectedSandApp.s("ݘ"));
        dataOutputStream.writeBytes(s4);
        dataOutputStream.writeBytes(s4);
        com.androidquery.util.a.g(inputStream, dataOutputStream);
        dataOutputStream.writeBytes(s4);
    }

    private void i() {
        if (!this.f41122u && this.f41120s) {
            F();
        }
        if (this.f41114m == null) {
            t();
        }
        if (this.f41114m == null) {
            x0();
        }
    }

    private void i0(String str, Map<String, String> map, Map<String, Object> map2, c cVar) throws ClientProtocolException, IOException {
        com.androidquery.util.a.j(ProtectedSandApp.s("ݙ"), str);
        f0(str, new HttpPost(str), map, map2, cVar);
    }

    private static void i1(DataOutputStream dataOutputStream, String str, String str2) throws IOException {
        dataOutputStream.writeBytes(ProtectedSandApp.s("ݓ"));
        dataOutputStream.writeBytes(ProtectedSandApp.s("ݔ") + str + ProtectedSandApp.s("ݚ"));
        String s4 = ProtectedSandApp.s("ܫ");
        dataOutputStream.writeBytes(s4);
        dataOutputStream.writeBytes(s4);
        dataOutputStream.write(str2.getBytes(ProtectedSandApp.s("ܭ")));
        dataOutputStream.writeBytes(s4);
    }

    private void j0(String str, Map<String, String> map, Map<String, Object> map2, c cVar) throws ClientProtocolException, IOException {
        com.androidquery.util.a.j(ProtectedSandApp.s("ݛ"), str);
        f0(str, new HttpPut(str), map, map2, cVar);
    }

    private static void j1(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof File) {
            File file = (File) obj;
            h1(dataOutputStream, str, file.getName(), new FileInputStream(file));
        } else if (obj instanceof byte[]) {
            h1(dataOutputStream, str, str, new ByteArrayInputStream((byte[]) obj));
        } else if (obj instanceof InputStream) {
            h1(dataOutputStream, str, str, (InputStream) obj);
        } else {
            i1(dataOutputStream, str, obj.toString());
        }
    }

    private boolean k0() {
        WeakReference<Activity> weakReference = this.f41126y;
        if (weakReference == null) {
            return true;
        }
        Activity activity = weakReference.get();
        return (activity == null || activity.isFinishing()) ? false : true;
    }

    private static boolean l0(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            com.androidquery.util.a.j(entry.getKey(), value);
            if ((value instanceof File) || (value instanceof byte[]) || (value instanceof InputStream)) {
                return true;
            }
        }
        return false;
    }

    public static void n() {
        ExecutorService executorService = P;
        if (executorService != null) {
            executorService.shutdownNow();
            P = null;
        }
        d.v1();
    }

    private String n0() {
        Map<String, String> map = this.f41112k;
        if (map == null || map.size() == 0) {
            return null;
        }
        Iterator<String> it = this.f41112k.keySet().iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            String next = it.next();
            String str = this.f41112k.get(next);
            sb.append(next);
            sb.append(ProtectedSandApp.s("ݜ"));
            sb.append(str);
            if (it.hasNext()) {
                sb.append(ProtectedSandApp.s("ݝ"));
            }
        }
        return sb.toString();
    }

    private void o() {
        this.f41104c = null;
        this.f41105d = null;
        this.f41107f = null;
        this.A = null;
        this.f41113l = null;
        this.f41118q = null;
        this.f41126y = null;
    }

    private void q(InputStream inputStream, OutputStream outputStream, int i4) throws IOException {
        WeakReference<Object> weakReference = this.f41107f;
        Object obj = weakReference != null ? weakReference.get() : null;
        com.androidquery.util.a.h(inputStream, outputStream, i4, obj != null ? new com.androidquery.util.f(obj) : null);
    }

    private String r(byte[] bArr, String str, c cVar) {
        String s4 = ProtectedSandApp.s("ݞ");
        String str2 = null;
        try {
            if (!s4.equalsIgnoreCase(str)) {
                return new String(bArr, str);
            }
            String B0 = B0(cVar.s(ProtectedSandApp.s("\u074b")));
            com.androidquery.util.a.j(ProtectedSandApp.s("ݟ"), B0);
            if (B0 != null) {
                return new String(bArr, B0);
            }
            String str3 = new String(bArr, s4);
            try {
                String M2 = M(str3);
                com.androidquery.util.a.j(ProtectedSandApp.s("ݠ"), M2);
                if (M2 == null || s4.equalsIgnoreCase(M2)) {
                    return str3;
                }
                com.androidquery.util.a.j(ProtectedSandApp.s("ݡ"), M2);
                String str4 = new String(bArr, M2);
                try {
                    cVar.f(str4.getBytes(s4));
                    return str4;
                } catch (Exception e4) {
                    e = e4;
                    str2 = str4;
                    com.androidquery.util.a.R(e);
                    return str2;
                }
            } catch (Exception e5) {
                e = e5;
                str2 = str3;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    private void t() {
        T s4 = s(this.f41108g);
        this.f41114m = s4;
        if (s4 != null) {
            this.f41119r.I(2).g();
        }
    }

    private void t0() throws IOException {
        String str = this.f41108g;
        Map<String, Object> map = this.f41110i;
        if (map == null && str.length() > 2000) {
            Uri parse = Uri.parse(str);
            String z4 = z(parse);
            map = y(parse);
            str = z4;
        }
        String T = T(str);
        int i4 = this.f41127z;
        if (2 == i4) {
            d0(T, this.f41111j, this.f41119r);
            return;
        }
        if (3 == i4) {
            j0(T, this.f41111j, map, this.f41119r);
            return;
        }
        if (1 == i4 && map == null) {
            map = new HashMap<>();
        }
        if (map == null) {
            g0(T, this.f41111j, this.f41119r);
        } else if (l0(map)) {
            h0(T, this.f41111j, map, this.f41119r);
        } else {
            i0(T, this.f41111j, map, this.f41119r);
        }
    }

    private HttpResponse v(HttpUriRequest httpUriRequest, DefaultHttpClient defaultHttpClient, HttpContext httpContext) throws ClientProtocolException, IOException {
        if (!httpUriRequest.getURI().getAuthority().contains(ProtectedSandApp.s("ݢ"))) {
            return defaultHttpClient.execute(httpUriRequest, httpContext);
        }
        URL url = httpUriRequest.getURI().toURL();
        return defaultHttpClient.execute(url.getPort() == -1 ? new HttpHost(url.getHost(), 80, url.getProtocol()) : new HttpHost(url.getHost(), url.getPort(), url.getProtocol()), httpUriRequest, httpContext);
    }

    private void v0(int i4) throws IOException {
        if (i4 <= 1) {
            t0();
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            try {
                t0();
                return;
            } catch (IOException e4) {
                if (i5 == i4 - 1) {
                    throw e4;
                }
            }
        }
    }

    public static void w(Runnable runnable) {
        if (P == null) {
            P = Executors.newFixedThreadPool(K);
        }
        P.execute(runnable);
    }

    private void x0() {
        byte[] bArr;
        if (this.f41108g == null) {
            this.f41119r.d(c.f41136x).g();
            return;
        }
        try {
            v0(this.C + 1);
            com.androidquery.auth.a aVar = this.f41118q;
            if (aVar != null && aVar.f(this, this.f41119r) && !this.G) {
                com.androidquery.util.a.j(ProtectedSandApp.s("ݣ"), this.f41119r.v());
                this.G = true;
                if (!this.f41118q.j(this)) {
                    this.f41119r.E(true);
                    return;
                }
                t0();
            }
            bArr = this.f41119r.n();
        } catch (Exception e4) {
            com.androidquery.util.a.k(e4);
            this.f41119r.d(c.f41136x).D(ProtectedSandApp.s("ݤ"));
            bArr = null;
        }
        try {
            this.f41114m = Z0(this.f41108g, bArr, this.f41119r);
        } catch (Exception e5) {
            com.androidquery.util.a.k(e5);
        }
        if (this.f41114m == null && bArr != null) {
            this.f41119r.d(c.f41138z).D(ProtectedSandApp.s("ݥ"));
        }
        X = this.f41119r.l();
        this.f41119r.g();
    }

    private static Map<String, Object> y(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQuery().split(ProtectedSandApp.s("ݦ"))) {
            String[] split = str.split(ProtectedSandApp.s("ݜ"));
            if (split.length >= 2) {
                hashMap.put(split[0], split[1]);
            } else if (split.length == 1) {
                hashMap.put(split[0], "");
            }
        }
        return hashMap;
    }

    private static String z(Uri uri) {
        String str = uri.getScheme() + ProtectedSandApp.s("ݧ") + uri.getAuthority() + uri.getPath();
        String fragment = uri.getFragment();
        return fragment != null ? z3.a(str, ProtectedSandApp.s("ݨ"), fragment) : str;
    }

    public void A(int i4, String str) {
        c cVar = this.f41119r;
        if (cVar != null) {
            cVar.d(i4).D(str);
            l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K B(boolean z4) {
        this.f41120s = z4;
        return this;
    }

    protected T C(String str, File file, c cVar) {
        byte[] c02;
        try {
            if (m0()) {
                cVar.j(file);
                c02 = null;
            } else {
                c02 = com.androidquery.util.a.c0(new FileInputStream(file));
            }
            return Z0(str, c02, cVar);
        } catch (Exception e4) {
            com.androidquery.util.a.k(e4);
            return null;
        }
    }

    protected void E(String str, T t4, File file, byte[] bArr) {
        if (file == null || bArr == null) {
            return;
        }
        com.androidquery.util.a.Y(file, bArr, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K E0(int i4) {
        this.f41115n = i4;
        return this;
    }

    public K F0(Dialog dialog) {
        return I0(dialog);
    }

    public K G0(View view) {
        return I0(view);
    }

    protected File H() {
        return com.androidquery.util.a.r(this.f41116o, I());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K I0(Object obj) {
        if (obj != null) {
            this.f41107f = new WeakReference<>(obj);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K J0(String str, int i4) {
        this.D = new HttpHost(str, i4);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K K0(boolean z4) {
        this.f41122u = z4;
        return this;
    }

    public String L() {
        return this.f41106e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K L0(int i4) {
        this.C = i4;
        return this;
    }

    public String O() {
        return this.f41125x;
    }

    public Object Q() {
        Object obj = this.f41105d;
        if (obj != null) {
            return obj;
        }
        Reference<Object> reference = this.f41104c;
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    protected void U0(boolean z4) {
        WeakReference<Object> weakReference = this.f41107f;
        Object obj = weakReference == null ? null : weakReference.get();
        if (obj != null) {
            if (com.androidquery.util.a.F()) {
                com.androidquery.util.c.E(obj, this.f41108g, z4);
            } else {
                com.androidquery.util.a.L(new RunnableC0680a(obj, z4));
            }
        }
    }

    public T V() {
        return this.f41114m;
    }

    protected void V0(String str, T t4, c cVar) {
    }

    public c W() {
        return this.f41119r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K W0(File file) {
        this.f41117p = file;
        return this;
    }

    public Class<T> X() {
        return this.f41103b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K X0(int i4) {
        this.f41123v = i4;
        return this;
    }

    public String Z() {
        return this.f41108g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r9v12, types: [T, java.io.Closeable, java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v13, types: [T, org.xmlpull.v1.XmlPullParser] */
    protected T Z0(String str, byte[] bArr, c cVar) {
        String str2;
        if (this.f41103b == null) {
            return null;
        }
        ?? r02 = (T) cVar.r();
        if (bArr != 0) {
            if (this.f41103b.equals(Bitmap.class)) {
                return (T) BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
            if (this.f41103b.equals(JSONObject.class)) {
                try {
                    str2 = new String(bArr, this.f41125x);
                } catch (Exception e4) {
                    e = e4;
                    str2 = null;
                }
                try {
                    return (T) ((JSONObject) new JSONTokener(str2).nextValue());
                } catch (Exception e5) {
                    e = e5;
                    com.androidquery.util.a.k(e);
                    com.androidquery.util.a.i(str2);
                    return null;
                }
            }
            if (this.f41103b.equals(JSONArray.class)) {
                try {
                    return (T) ((JSONArray) new JSONTokener(new String(bArr, this.f41125x)).nextValue());
                } catch (Exception e6) {
                    com.androidquery.util.a.k(e6);
                    return null;
                }
            }
            if (this.f41103b.equals(String.class)) {
                if (cVar.z() == 1) {
                    com.androidquery.util.a.i(ProtectedSandApp.s("ݩ"));
                    return (T) r(bArr, this.f41125x, cVar);
                }
                com.androidquery.util.a.i(ProtectedSandApp.s("ݪ"));
                try {
                    return (T) new String(bArr, this.f41125x);
                } catch (Exception e7) {
                    com.androidquery.util.a.k(e7);
                    return null;
                }
            }
            if (this.f41103b.equals(byte[].class)) {
                return bArr;
            }
            f fVar = this.f41113l;
            if (fVar != null) {
                return (T) fVar.a(str, this.f41103b, this.f41125x, bArr, cVar);
            }
            f fVar2 = N;
            if (fVar2 != null) {
                return (T) fVar2.a(str, this.f41103b, this.f41125x, bArr, cVar);
            }
        } else if (r02 != 0) {
            if (this.f41103b.equals(File.class)) {
                return r02;
            }
            if (this.f41103b.equals(i.class)) {
                try {
                    FileInputStream fileInputStream = new FileInputStream((File) r02);
                    T t4 = (T) new i(fileInputStream);
                    cVar.c(fileInputStream);
                    return t4;
                } catch (Exception e10) {
                    com.androidquery.util.a.R(e10);
                    return null;
                }
            }
            if (this.f41103b.equals(XmlPullParser.class)) {
                ?? r92 = (T) Xml.newPullParser();
                try {
                    FileInputStream fileInputStream2 = new FileInputStream((File) r02);
                    r92.setInput(fileInputStream2, this.f41125x);
                    cVar.c(fileInputStream2);
                    return r92;
                } catch (Exception e11) {
                    com.androidquery.util.a.R(e11);
                    return null;
                }
            }
            if (this.f41103b.equals(InputStream.class)) {
                try {
                    ?? r93 = (T) new FileInputStream((File) r02);
                    cVar.c(r93);
                    return r93;
                } catch (Exception e12) {
                    com.androidquery.util.a.R(e12);
                }
            }
        }
        return null;
    }

    public void a() {
        this.H = true;
        HttpUriRequest httpUriRequest = this.A;
        if (httpUriRequest == null || httpUriRequest.isAborted()) {
            return;
        }
        this.A.abort();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K a0(Object obj, String str) {
        this.f41105d = obj;
        this.f41106e = str;
        this.f41104c = null;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K a1(f fVar) {
        this.f41113l = fVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K b0(String str, String str2) {
        if (this.f41111j == null) {
            this.f41111j = new HashMap();
        }
        this.f41111j.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K b1(Class<T> cls) {
        this.f41103b = cls;
        return this;
    }

    protected File c(File file, String str) {
        if (this.f41124w < 0) {
            return null;
        }
        File u4 = com.androidquery.util.a.u(file, str);
        if (u4 == null || this.f41124w == 0 || System.currentTimeMillis() - u4.lastModified() <= this.f41124w) {
            return u4;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K c1(boolean z4) {
        this.B = z4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K d1(String str) {
        this.f41108g = str;
        return this;
    }

    public void e(Activity activity) {
        boolean isFinishing = activity.isFinishing();
        String s4 = ProtectedSandApp.s("ݫ");
        if (isFinishing) {
            com.androidquery.util.a.e0(s4, ProtectedSandApp.s("ݬ"));
        }
        if (this.f41103b == null) {
            com.androidquery.util.a.e0(s4, ProtectedSandApp.s("ݭ"));
        } else {
            this.f41126y = new WeakReference<>(activity);
            f(activity);
        }
    }

    public void f(Context context) {
        c cVar = this.f41119r;
        if (cVar == null) {
            c cVar2 = new c();
            this.f41119r = cVar2;
            cVar2.F(this.f41108g).G(this.f41122u);
        } else if (cVar.o()) {
            this.f41119r.H();
            this.f41114m = null;
        }
        U0(true);
        com.androidquery.auth.a aVar = this.f41118q;
        if (aVar == null || aVar.e()) {
            g1(context);
        } else {
            com.androidquery.util.a.j(ProtectedSandApp.s("ݮ"), this.f41108g);
            this.f41118q.d(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K f1(Object obj, String str) {
        this.f41104c = new WeakReference(obj);
        this.f41106e = str;
        this.f41105d = null;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K g(Activity activity, String str, String str2) {
        if (str.startsWith(ProtectedSandApp.s("ݯ"))) {
            this.f41118q = new com.androidquery.auth.b(activity, str, str2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K h(com.androidquery.auth.a aVar) {
        this.f41118q = aVar;
        return this;
    }

    public void j() {
        if (com.androidquery.util.a.F()) {
            throw new IllegalStateException(ProtectedSandApp.s("ݰ"));
        }
        if (this.E) {
            return;
        }
        try {
            synchronized (this) {
                this.F = true;
                wait(I + 5000);
            }
        } catch (Exception unused) {
        }
    }

    protected boolean k(Context context) {
        return this.f41120s && com.androidquery.util.a.u(com.androidquery.util.a.q(context, this.f41115n), this.f41108g) != null;
    }

    void l() {
        U0(false);
        this.E = true;
        if (!k0()) {
            V0(this.f41108g, this.f41114m, this.f41119r);
        } else if (this.f41106e != null) {
            com.androidquery.util.a.B(Q(), this.f41106e, true, true, new Class[]{String.class, this.f41103b, c.class}, O, this.f41108g, this.f41114m, this.f41119r);
        } else {
            try {
                m(this.f41108g, this.f41114m, this.f41119r);
            } catch (Exception e4) {
                com.androidquery.util.a.R(e4);
            }
        }
        D();
        if (!this.F) {
            this.f41119r.b();
        }
        e1();
        com.androidquery.util.a.l();
    }

    public void m(String str, T t4, c cVar) {
    }

    protected boolean m0() {
        return File.class.equals(this.f41103b) || XmlPullParser.class.equals(this.f41103b) || InputStream.class.equals(this.f41103b) || i.class.equals(this.f41103b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K p(String str, String str2) {
        if (this.f41112k == null) {
            this.f41112k = new HashMap();
        }
        this.f41112k.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K p0(boolean z4) {
        this.f41121t = z4;
        return this;
    }

    protected T q0(String str) {
        return null;
    }

    protected void r0(String str, T t4) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f41119r.o()) {
            d();
            return;
        }
        try {
            i();
        } catch (Throwable th) {
            com.androidquery.util.a.k(th);
            this.f41119r.d(c.f41136x).g();
        }
        if (this.f41119r.w()) {
            return;
        }
        if (this.B) {
            com.androidquery.util.a.L(this);
        } else {
            d();
        }
    }

    protected T s(String str) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K s0(int i4) {
        this.f41127z = i4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K u(String str) {
        this.f41125x = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K w0(String str) {
        this.f41109h = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K x(long j4) {
        this.f41124w = j4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K y0(String str, Object obj) {
        if (this.f41110i == null) {
            this.f41110i = new HashMap();
        }
        this.f41110i.put(str, obj);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K z0(Map<String, ?> map) {
        this.f41110i = map;
        return this;
    }
}
