package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.motion.widget.g;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
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
/* loaded from: classes2.dex */
public class c {
    private static final int B = 10000;
    private static final int D = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16934e = 32768;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16935f = 32769;

    /* renamed from: g, reason: collision with root package name */
    private static final int f16936g = 32770;

    /* renamed from: h, reason: collision with root package name */
    private static final int f16937h = 32771;

    /* renamed from: a, reason: collision with root package name */
    private boolean f16956a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16957b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.b<j> f16958c;

    /* renamed from: d, reason: collision with root package name */
    private final e f16959d = new e();
    private static final String A = ProtectedSandApp.s("ᙽ");
    private static final String F = ProtectedSandApp.s("ᙾ");
    private static final String G = ProtectedSandApp.s("ᙿ");

    @VisibleForTesting
    static final String H = ProtectedSandApp.s("\u1680");

    /* renamed from: i, reason: collision with root package name */
    private static final String f16938i = ProtectedSandApp.s("ᚁ");

    /* renamed from: j, reason: collision with root package name */
    private static final String f16939j = ProtectedSandApp.s("ᚂ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f16940k = ProtectedSandApp.s("ᚃ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f16941l = ProtectedSandApp.s("ᚄ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f16942m = ProtectedSandApp.s("ᚅ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f16943n = ProtectedSandApp.s("ᚆ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f16944o = ProtectedSandApp.s("ᚇ");

    /* renamed from: p, reason: collision with root package name */
    private static final String f16945p = ProtectedSandApp.s("ᚈ");

    /* renamed from: q, reason: collision with root package name */
    private static final String f16946q = ProtectedSandApp.s("ᚉ");

    /* renamed from: r, reason: collision with root package name */
    private static final String f16947r = ProtectedSandApp.s("ᚊ");

    /* renamed from: s, reason: collision with root package name */
    private static final String f16948s = ProtectedSandApp.s("ᚋ");

    /* renamed from: t, reason: collision with root package name */
    private static final String f16949t = ProtectedSandApp.s("ᚌ");

    /* renamed from: u, reason: collision with root package name */
    private static final String f16950u = ProtectedSandApp.s("ᚍ");

    /* renamed from: v, reason: collision with root package name */
    private static final String f16951v = ProtectedSandApp.s("ᚎ");

    /* renamed from: w, reason: collision with root package name */
    private static final String f16952w = ProtectedSandApp.s("ᚏ");

    /* renamed from: x, reason: collision with root package name */
    private static final String f16953x = ProtectedSandApp.s("ᚐ");

    /* renamed from: y, reason: collision with root package name */
    private static final String f16954y = ProtectedSandApp.s("ᚑ");

    /* renamed from: z, reason: collision with root package name */
    private static final String f16955z = ProtectedSandApp.s("ᚒ");
    private static final Pattern C = Pattern.compile(ProtectedSandApp.s("ᚓ"));
    private static final Charset E = Charset.forName(ProtectedSandApp.s("ᚔ"));

    public c(@o0 Context context, @o0 o2.b<j> bVar) {
        this.f16957b = context;
        this.f16958c = bVar;
    }

    private static String a(@q0 String str, @o0 String str2, @o0 String str3) {
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        objArr[2] = TextUtils.isEmpty(str) ? "" : g.a(ProtectedSandApp.s("ᚕ"), str);
        return String.format(ProtectedSandApp.s("ᚖ"), objArr);
    }

    private static JSONObject b(@q0 String str, @o0 String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProtectedSandApp.s("ᚗ"), str);
            jSONObject.put(ProtectedSandApp.s("ᚘ"), str2);
            jSONObject.put(ProtectedSandApp.s("ᚙ"), ProtectedSandApp.s("ᚚ"));
            jSONObject.put(ProtectedSandApp.s("᚛"), ProtectedSandApp.s("᚜"));
            return jSONObject;
        } catch (JSONException e6) {
            throw new IllegalStateException(e6);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProtectedSandApp.s("\u169d"), ProtectedSandApp.s("\u169e"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ProtectedSandApp.s("\u169f"), jSONObject);
            return jSONObject2;
        } catch (JSONException e6) {
            throw new IllegalStateException(e6);
        }
    }

    private String g() {
        try {
            Context context = this.f16957b;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            this.f16957b.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f16957b.getPackageName();
            return null;
        }
    }

    private URL h(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format(ProtectedSandApp.s("ᚠ"), ProtectedSandApp.s("ᚡ"), ProtectedSandApp.s("ᚢ"), str));
        } catch (MalformedURLException e6) {
            throw new FirebaseInstallationsException(e6.getMessage(), FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    private static byte[] i(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes(ProtectedSandApp.s("ᚣ"));
    }

    private static boolean j(int i5) {
        return i5 >= 200 && i5 < 300;
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
            String s5 = ProtectedSandApp.s("ᚤ");
            String s6 = ProtectedSandApp.s("ᚥ");
            httpURLConnection.addRequestProperty(s5, s6);
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ᚦ"), s6);
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ᚧ"), ProtectedSandApp.s("ᚨ"));
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ᚩ"), ProtectedSandApp.s("ᚪ"));
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ᚫ"), this.f16957b.getPackageName());
            j jVar = this.f16958c.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty(ProtectedSandApp.s("ᚬ"), (String) Tasks.await(jVar.a()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ᚭ"), g());
            httpURLConnection.addRequestProperty(ProtectedSandApp.s("ᚮ"), str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new FirebaseInstallationsException(ProtectedSandApp.s("ᚯ"), FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    static long n(String str) {
        Preconditions.checkArgument(C.matcher(str).matches(), ProtectedSandApp.s("ᚰ"));
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d o(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, E));
        f.a a6 = f.a();
        a.b bVar = new a.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(ProtectedSandApp.s("ᚱ"))) {
                bVar.f(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ᚲ"))) {
                bVar.c(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ᚳ"))) {
                bVar.d(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ᚴ"))) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(ProtectedSandApp.s("ᚵ"))) {
                        a6.c(jsonReader.nextString());
                    } else if (nextName2.equals(ProtectedSandApp.s("ᚶ"))) {
                        a6.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                bVar.b(a6.a());
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
                String format = String.format(ProtectedSandApp.s("ᚷ"), Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
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
        f.a a6 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(ProtectedSandApp.s("ᚸ"))) {
                a6.c(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ᚹ"))) {
                a6.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a6.b(f.b.OK).a();
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
            throw new IOException(ProtectedSandApp.s("ᚺ"));
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
        d o5;
        boolean b6 = this.f16959d.b();
        String s5 = ProtectedSandApp.s("ᚻ");
        if (!b6) {
            throw new FirebaseInstallationsException(s5, FirebaseInstallationsException.a.UNAVAILABLE);
        }
        URL h5 = h(String.format(ProtectedSandApp.s("ᚼ"), str3));
        for (int i5 = 0; i5 <= 1; i5++) {
            TrafficStats.setThreadStatsTag(f16935f);
            HttpURLConnection m5 = m(h5, str);
            try {
                try {
                    m5.setRequestMethod(ProtectedSandApp.s("ᚽ"));
                    m5.setDoOutput(true);
                    if (str5 != null) {
                        m5.addRequestProperty(ProtectedSandApp.s("ᚾ"), str5);
                    }
                    r(m5, str2, str4);
                    responseCode = m5.getResponseCode();
                    this.f16959d.f(responseCode);
                } finally {
                    m5.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (j(responseCode)) {
                o5 = o(m5);
            } else {
                l(m5, str4, str, str3);
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException(ProtectedSandApp.s("ᚿ"), FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    o5 = new a.b().e(d.b.BAD_CONFIG).a();
                } else {
                    m5.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            return o5;
        }
        throw new FirebaseInstallationsException(s5, FirebaseInstallationsException.a.UNAVAILABLE);
    }

    @o0
    public void e(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4) throws FirebaseInstallationsException {
        int responseCode;
        int i5 = 0;
        URL h5 = h(String.format(ProtectedSandApp.s("ᛀ"), str3, str2));
        while (i5 <= 1) {
            TrafficStats.setThreadStatsTag(f16936g);
            HttpURLConnection m5 = m(h5, str);
            try {
                m5.setRequestMethod(ProtectedSandApp.s("ᛁ"));
                m5.addRequestProperty(ProtectedSandApp.s("ᛂ"), ProtectedSandApp.s("ᛃ") + str4);
                responseCode = m5.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m5.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                l(m5, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    throw new FirebaseInstallationsException(ProtectedSandApp.s("ᛄ"), FirebaseInstallationsException.a.BAD_CONFIG);
                }
                i5++;
                m5.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m5.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new FirebaseInstallationsException(ProtectedSandApp.s("ᛅ"), FirebaseInstallationsException.a.UNAVAILABLE);
    }

    @o0
    public f f(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4) throws FirebaseInstallationsException {
        int responseCode;
        f q5;
        boolean b6 = this.f16959d.b();
        String s5 = ProtectedSandApp.s("ᛆ");
        if (!b6) {
            throw new FirebaseInstallationsException(s5, FirebaseInstallationsException.a.UNAVAILABLE);
        }
        URL h5 = h(String.format(ProtectedSandApp.s("ᛇ"), str3, str2));
        for (int i5 = 0; i5 <= 1; i5++) {
            TrafficStats.setThreadStatsTag(f16937h);
            HttpURLConnection m5 = m(h5, str);
            try {
                try {
                    m5.setRequestMethod(ProtectedSandApp.s("ᛈ"));
                    m5.addRequestProperty(ProtectedSandApp.s("ᛉ"), ProtectedSandApp.s("ᛊ") + str4);
                    m5.setDoOutput(true);
                    s(m5);
                    responseCode = m5.getResponseCode();
                    this.f16959d.f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (j(responseCode)) {
                    q5 = q(m5);
                } else {
                    l(m5, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException(ProtectedSandApp.s("ᛋ"), FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            q5 = f.a().b(f.b.BAD_CONFIG).a();
                        } else {
                            m5.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    q5 = f.a().b(f.b.AUTH_ERROR).a();
                }
                return q5;
            } finally {
                m5.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException(s5, FirebaseInstallationsException.a.UNAVAILABLE);
    }
}
