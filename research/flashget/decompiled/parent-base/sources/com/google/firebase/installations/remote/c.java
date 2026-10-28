package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.j;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.a;
import com.google.firebase.installations.remote.d;
import com.google.firebase.installations.remote.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseInstallationServiceClient.java */
/* loaded from: classes6.dex */
public class c {
    private static final int B = 10000;
    private static final int D = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f59802e = 32768;

    /* renamed from: f, reason: collision with root package name */
    private static final int f59803f = 32769;

    /* renamed from: g, reason: collision with root package name */
    private static final int f59804g = 32770;

    /* renamed from: h, reason: collision with root package name */
    private static final int f59805h = 32771;

    /* renamed from: a, reason: collision with root package name */
    private boolean f59824a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f59825b;

    /* renamed from: c, reason: collision with root package name */
    private final y9.b<j> f59826c;

    /* renamed from: d, reason: collision with root package name */
    private final e f59827d = new e();
    private static final String A = ProtectedSandApp.s("æ\u0001");
    private static final String F = ProtectedSandApp.s("ç\u0001");
    private static final String G = ProtectedSandApp.s("è\u0001");

    @m1
    static final String H = ProtectedSandApp.s("é\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final String f59806i = ProtectedSandApp.s("ê\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String f59807j = ProtectedSandApp.s("ë\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final String f59808k = ProtectedSandApp.s("ì\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static final String f59809l = ProtectedSandApp.s("í\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final String f59810m = ProtectedSandApp.s("î\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f59811n = ProtectedSandApp.s("ï\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final String f59812o = ProtectedSandApp.s("ð\u0001");

    /* renamed from: p, reason: collision with root package name */
    private static final String f59813p = ProtectedSandApp.s("ñ\u0001");

    /* renamed from: q, reason: collision with root package name */
    private static final String f59814q = ProtectedSandApp.s("ò\u0001");

    /* renamed from: r, reason: collision with root package name */
    private static final String f59815r = ProtectedSandApp.s("ó\u0001");

    /* renamed from: s, reason: collision with root package name */
    private static final String f59816s = ProtectedSandApp.s("ô\u0001");

    /* renamed from: t, reason: collision with root package name */
    private static final String f59817t = ProtectedSandApp.s("õ\u0001");

    /* renamed from: u, reason: collision with root package name */
    private static final String f59818u = ProtectedSandApp.s("ö\u0001");

    /* renamed from: v, reason: collision with root package name */
    private static final String f59819v = ProtectedSandApp.s("÷\u0001");

    /* renamed from: w, reason: collision with root package name */
    private static final String f59820w = ProtectedSandApp.s("ø\u0001");

    /* renamed from: x, reason: collision with root package name */
    private static final String f59821x = ProtectedSandApp.s("ù\u0001");

    /* renamed from: y, reason: collision with root package name */
    private static final String f59822y = ProtectedSandApp.s("ú\u0001");

    /* renamed from: z, reason: collision with root package name */
    private static final String f59823z = ProtectedSandApp.s("û\u0001");
    private static final Pattern C = Pattern.compile(ProtectedSandApp.s("ü\u0001"));
    private static final Charset E = Charset.forName(ProtectedSandApp.s("ý\u0001"));

    public c(@o0 Context context, @o0 y9.b<j> bVar) {
        this.f59825b = context;
        this.f59826c = bVar;
    }

    private static String a(@q0 String str, @o0 String str2, @o0 String str3) {
        return String.format(ProtectedSandApp.s("ÿ\u0001"), str2, str3, TextUtils.isEmpty(str) ? "" : androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("þ\u0001"), str));
    }

    private static JSONObject b(@q0 String str, @o0 String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProtectedSandApp.s("Ā\u0001"), str);
            jSONObject.put(ProtectedSandApp.s("ā\u0001"), str2);
            jSONObject.put(ProtectedSandApp.s("Ă\u0001"), ProtectedSandApp.s("ï\u0001"));
            jSONObject.put(ProtectedSandApp.s("ă\u0001"), ProtectedSandApp.s("Ą\u0001"));
            return jSONObject;
        } catch (JSONException e4) {
            throw new IllegalStateException(e4);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProtectedSandApp.s("ă\u0001"), ProtectedSandApp.s("Ą\u0001"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ProtectedSandApp.s("ą\u0001"), jSONObject);
            return jSONObject2;
        } catch (JSONException e4) {
            throw new IllegalStateException(e4);
        }
    }

    private String g() {
        try {
            Context context = this.f59825b;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            this.f59825b.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f59825b.getPackageName();
            return null;
        }
    }

    private URL h(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format(ProtectedSandApp.s("Ć\u0001"), ProtectedSandApp.s("ê\u0001"), ProtectedSandApp.s("î\u0001"), str));
        } catch (MalformedURLException e4) {
            throw new FirebaseInstallationsException(e4.getMessage(), FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    private static byte[] i(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes(ProtectedSandApp.s("ý\u0001"));
    }

    private static boolean j(int i4) {
        return i4 >= 200 && i4 < 300;
    }

    private static void k() {
    }

    private static void l(HttpURLConnection httpURLConnection, @q0 String str, @o0 String str2, @o0 String str3) {
        if (TextUtils.isEmpty(p(httpURLConnection))) {
            return;
        }
        a(str, str2, str3);
    }

    private HttpURLConnection m(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            String s4 = ProtectedSandApp.s("ð\u0001");
            String s5 = ProtectedSandApp.s("ò\u0001");
            httpURLConnection.addRequestProperty(s4, s5);
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ñ\u0001"), s5);
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ó\u0001"), ProtectedSandApp.s("ô\u0001"));
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("õ\u0001"), ProtectedSandApp.s("ö\u0001"));
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ù\u0001"), this.f59825b.getPackageName());
            j jVar = this.f59826c.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty(ProtectedSandApp.s("ø\u0001"), (String) Tasks.await(jVar.a()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ú\u0001"), g());
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("æ\u0001"), str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new FirebaseInstallationsException(ProtectedSandApp.s("ć\u0001"), FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    @m1
    static long n(String str) {
        Preconditions.checkArgument(C.matcher(str).matches(), ProtectedSandApp.s("é\u0001"));
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d o(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, E));
        f.a a5 = f.a();
        a.b bVar = new a.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(ProtectedSandApp.s("Ĉ\u0001"))) {
                bVar.f(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("Ā\u0001"))) {
                bVar.c(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ĉ\u0001"))) {
                bVar.d(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("Ċ\u0001"))) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(ProtectedSandApp.s("ċ\u0001"))) {
                        a5.c(jsonReader.nextString());
                    } else if (nextName2.equals(ProtectedSandApp.s("Č\u0001"))) {
                        a5.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                bVar.b(a5.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return bVar.e(d.b.OK).a();
    }

    @q0
    private static String p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, E));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format(ProtectedSandApp.s("č\u0001"), Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private f q(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, E));
        f.a a5 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(ProtectedSandApp.s("ċ\u0001"))) {
                a5.c(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("Č\u0001"))) {
                a5.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a5.b(f.b.OK).a();
    }

    private void r(HttpURLConnection httpURLConnection, @q0 String str, @o0 String str2) throws IOException {
        t(httpURLConnection, i(b(str, str2)));
    }

    private void s(HttpURLConnection httpURLConnection) throws IOException {
        t(httpURLConnection, i(c()));
    }

    private static void t(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException(ProtectedSandApp.s("Ď\u0001"));
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @o0
    public d d(@o0 String str, @q0 String str2, @o0 String str3, @o0 String str4, @q0 String str5) throws FirebaseInstallationsException {
        int responseCode;
        d o4;
        boolean b5 = this.f59827d.b();
        String s4 = ProtectedSandApp.s("ć\u0001");
        if (!b5) {
            throw new FirebaseInstallationsException(s4, FirebaseInstallationsException.a.UNAVAILABLE);
        }
        URL h4 = h(String.format(ProtectedSandApp.s("ë\u0001"), str3));
        for (int i4 = 0; i4 <= 1; i4++) {
            TrafficStats.setThreadStatsTag(f59803f);
            HttpURLConnection m4 = m(h4, str);
            try {
                try {
                    m4.setRequestMethod(ProtectedSandApp.s("ď\u0001"));
                    m4.setDoOutput(true);
                    if (str5 != null) {
                        m4.addRequestProperty(ProtectedSandApp.s("û\u0001"), str5);
                    }
                    r(m4, str2, str4);
                    responseCode = m4.getResponseCode();
                    this.f59827d.f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (j(responseCode)) {
                    o4 = o(m4);
                } else {
                    l(m4, str4, str, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException(ProtectedSandApp.s("Đ\u0001"), FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        o4 = new a.b().e(d.b.BAD_CONFIG).a();
                    }
                    m4.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                m4.disconnect();
                TrafficStats.clearThreadStatsTag();
                return o4;
            } catch (Throwable th) {
                m4.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException(s4, FirebaseInstallationsException.a.UNAVAILABLE);
    }

    @o0
    public void e(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4) throws FirebaseInstallationsException {
        int responseCode;
        URL h4 = h(String.format(ProtectedSandApp.s("í\u0001"), str3, str2));
        int i4 = 0;
        while (i4 <= 1) {
            TrafficStats.setThreadStatsTag(f59804g);
            HttpURLConnection m4 = m(h4, str);
            try {
                m4.setRequestMethod(ProtectedSandApp.s("đ\u0001"));
                m4.addRequestProperty(ProtectedSandApp.s("Ē\u0001"), ProtectedSandApp.s("ē\u0001") + str4);
                responseCode = m4.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m4.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                l(m4, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    throw new FirebaseInstallationsException(ProtectedSandApp.s("Ĕ\u0001"), FirebaseInstallationsException.a.BAD_CONFIG);
                }
                i4++;
                m4.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m4.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new FirebaseInstallationsException(ProtectedSandApp.s("ć\u0001"), FirebaseInstallationsException.a.UNAVAILABLE);
    }

    @o0
    public f f(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4) throws FirebaseInstallationsException {
        int responseCode;
        f q4;
        boolean b5 = this.f59827d.b();
        String s4 = ProtectedSandApp.s("ć\u0001");
        if (!b5) {
            throw new FirebaseInstallationsException(s4, FirebaseInstallationsException.a.UNAVAILABLE);
        }
        URL h4 = h(String.format(ProtectedSandApp.s("ì\u0001"), str3, str2));
        for (int i4 = 0; i4 <= 1; i4++) {
            TrafficStats.setThreadStatsTag(f59805h);
            HttpURLConnection m4 = m(h4, str);
            try {
                try {
                    m4.setRequestMethod(ProtectedSandApp.s("ď\u0001"));
                    m4.addRequestProperty(ProtectedSandApp.s("Ē\u0001"), ProtectedSandApp.s("ē\u0001") + str4);
                    m4.setDoOutput(true);
                    s(m4);
                    responseCode = m4.getResponseCode();
                    this.f59827d.f(responseCode);
                } finally {
                    m4.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (j(responseCode)) {
                q4 = q(m4);
            } else {
                l(m4, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    q4 = f.a().b(f.b.AUTH_ERROR).a();
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException(ProtectedSandApp.s("Đ\u0001"), FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        q4 = f.a().b(f.b.BAD_CONFIG).a();
                    }
                }
            }
            return q4;
        }
        throw new FirebaseInstallationsException(s4, FirebaseInstallationsException.a.UNAVAILABLE);
    }
}
