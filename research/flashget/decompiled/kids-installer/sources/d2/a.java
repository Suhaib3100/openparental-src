package d2;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f22325d = ProtectedSandApp.s("ᬠ");

    /* renamed from: e, reason: collision with root package name */
    private static final int f22326e = 10000;

    /* renamed from: f, reason: collision with root package name */
    private static final int f22327f = 8192;

    /* renamed from: a, reason: collision with root package name */
    private final String f22328a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f22329b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f22330c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f22328a = str;
        this.f22329b = map;
    }

    private String a(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        String s5 = ProtectedSandApp.s("ᬘ");
        sb.append(s5);
        String value = next.getValue();
        String s6 = ProtectedSandApp.s("ᬙ");
        sb.append(value != null ? URLEncoder.encode(next.getValue(), s6) : "");
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append(ProtectedSandApp.s("ᬚ"));
            sb.append(next2.getKey());
            sb.append(s5);
            sb.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), s6) : "");
        }
        return sb.toString();
    }

    private String b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String a6 = a(map);
        if (a6.isEmpty()) {
            return str;
        }
        String s5 = ProtectedSandApp.s("ᬛ");
        if (str.contains(s5)) {
            String s6 = ProtectedSandApp.s("ᬜ");
            if (!str.endsWith(s6)) {
                a6 = s6.concat(a6);
            }
            return androidx.concurrent.futures.b.a(str, a6);
        }
        return str + s5 + a6;
    }

    private String f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, ProtectedSandApp.s("ᬝ")));
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
        String s5 = ProtectedSandApp.s("ᬞ");
        InputStream inputStream = null;
        String f6 = null;
        inputStream = null;
        try {
            String b6 = b(this.f22328a, this.f22329b);
            g.f().k(s5 + b6);
            httpsURLConnection = (HttpsURLConnection) new URL(b6).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(ProtectedSandApp.s("ᬟ"));
                for (Map.Entry<String, String> entry : this.f22330c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        f6 = f(inputStream2);
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
                return new c(responseCode, f6);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f22330c.put(str, str2);
        return this;
    }

    public a e(Map.Entry<String, String> entry) {
        return d(entry.getKey(), entry.getValue());
    }
}
