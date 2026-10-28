package n9;

import androidx.compose.material3.z3;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.concurrency.k;
import com.google.firebase.crashlytics.internal.g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: HttpGetRequest.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f81683d = ProtectedSandApp.s("㡳\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final int f81684e = 10000;

    /* renamed from: f, reason: collision with root package name */
    private static final int f81685f = 8192;

    /* renamed from: a, reason: collision with root package name */
    private final String f81686a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f81687b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f81688c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f81686a = str;
        this.f81687b = map;
    }

    private String a(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        String s4 = ProtectedSandApp.s("㡮\u0001");
        sb.append(s4);
        String value = next.getValue();
        String s5 = ProtectedSandApp.s("㡯\u0001");
        sb.append(value != null ? URLEncoder.encode(next.getValue(), s5) : "");
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append(ProtectedSandApp.s("㡰\u0001"));
            sb.append(next2.getKey());
            sb.append(s4);
            sb.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), s5) : "");
        }
        return sb.toString();
    }

    private String b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String a5 = a(map);
        if (a5.isEmpty()) {
            return str;
        }
        String s4 = ProtectedSandApp.s("㡱\u0001");
        if (!str.contains(s4)) {
            return z3.a(str, s4, a5);
        }
        String s5 = ProtectedSandApp.s("㡰\u0001");
        if (!str.endsWith(s5)) {
            a5 = s5.concat(a5);
        }
        return j.a(str, a5);
    }

    private String f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, ProtectedSandApp.s("㡯\u0001")));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public c c() throws IOException {
        HttpsURLConnection httpsURLConnection;
        String s4 = ProtectedSandApp.s("㡲\u0001");
        k.d();
        InputStream inputStream = null;
        String f4 = null;
        inputStream = null;
        try {
            String b5 = b(this.f81686a, this.f81687b);
            g.f().k(s4 + b5);
            httpsURLConnection = (HttpsURLConnection) new URL(b5).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(ProtectedSandApp.s("㡳\u0001"));
                for (Map.Entry<String, String> entry : this.f81688c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        f4 = f(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, f4);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f81688c.put(str, str2);
        return this;
    }

    public a e(Map.Entry<String, String> entry) {
        return d(entry.getKey(), entry.getValue());
    }
}
