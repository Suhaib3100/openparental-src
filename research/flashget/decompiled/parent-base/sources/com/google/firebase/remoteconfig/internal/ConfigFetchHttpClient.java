package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.internal.n;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    private static final String f60392h = ProtectedSandApp.s("̼\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final String f60393i = ProtectedSandApp.s("̽\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String f60394j = ProtectedSandApp.s("̾\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final String f60395k = ProtectedSandApp.s("̿\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static final String f60396l = ProtectedSandApp.s("̀\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final String f60397m = ProtectedSandApp.s("́\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f60398n = ProtectedSandApp.s("͂\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final String f60399o = ProtectedSandApp.s("̓\u0001");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f60400p = Pattern.compile(ProtectedSandApp.s("̈́\u0001"));

    /* renamed from: a, reason: collision with root package name */
    private final Context f60401a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60402b;

    /* renamed from: c, reason: collision with root package name */
    private final String f60403c;

    /* renamed from: d, reason: collision with root package name */
    private final String f60404d;

    /* renamed from: e, reason: collision with root package name */
    private final String f60405e;

    /* renamed from: f, reason: collision with root package name */
    private final long f60406f;

    /* renamed from: g, reason: collision with root package name */
    private final long f60407g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j4, long j5) {
        this.f60401a = context;
        this.f60402b = str;
        this.f60403c = str2;
        this.f60404d = f(str);
        this.f60405e = str3;
        this.f60406f = j4;
        this.f60407g = j5;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get(ProtectedSandApp.s("ͅ\u0001")).equals(ProtectedSandApp.s("͆\u0001"));
        } catch (JSONException unused) {
            return true;
        }
    }

    private String b(long j4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("̓\u0001"), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ProtectedSandApp.s("͇\u0001")));
        return simpleDateFormat.format(Long.valueOf(j4));
    }

    private JSONObject c(String str, String str2, Map<String, String> map, Long l4) throws FirebaseRemoteConfigClientException {
        HashMap hashMap = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException(ProtectedSandApp.s("͖\u0001"));
        }
        hashMap.put(ProtectedSandApp.s("͈\u0001"), str);
        hashMap.put(ProtectedSandApp.s("͉\u0001"), str2);
        hashMap.put(ProtectedSandApp.s("͊\u0001"), this.f60402b);
        Locale locale = this.f60401a.getResources().getConfiguration().locale;
        hashMap.put(ProtectedSandApp.s("͋\u0001"), locale.getCountry());
        int i4 = Build.VERSION.SDK_INT;
        hashMap.put(ProtectedSandApp.s("͌\u0001"), locale.toLanguageTag());
        hashMap.put(ProtectedSandApp.s("͍\u0001"), Integer.toString(i4));
        hashMap.put(ProtectedSandApp.s("͎\u0001"), TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f60401a.getPackageManager().getPackageInfo(this.f60401a.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put(ProtectedSandApp.s("͏\u0001"), packageInfo.versionName);
                hashMap.put(ProtectedSandApp.s("͐\u0001"), Long.toString(androidx.core.content.pm.c.c(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put(ProtectedSandApp.s("͑\u0001"), this.f60401a.getPackageName());
        hashMap.put(ProtectedSandApp.s("͒\u0001"), ProtectedSandApp.s("͓\u0001"));
        hashMap.put(ProtectedSandApp.s("͔\u0001"), new JSONObject(map));
        if (l4 != null) {
            hashMap.put(ProtectedSandApp.s("͕\u0001"), b(l4.longValue()));
        }
        return new JSONObject(hashMap);
    }

    private static h e(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        String s4 = ProtectedSandApp.s("͗\u0001");
        try {
            h.b e4 = h.l().e(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(ProtectedSandApp.s("͘\u0001"));
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e4 = e4.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(ProtectedSandApp.s("͙\u0001"));
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e4 = e4.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(ProtectedSandApp.s("͚\u0001"));
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                e4 = e4.f(jSONObject3);
            }
            String string = jSONObject.has(s4) ? jSONObject.getString(s4) : null;
            if (string != null) {
                e4.h(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray(ProtectedSandApp.s("͛\u0001"));
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                e4 = e4.g(jSONArray2);
            }
            return e4.a();
        } catch (JSONException e5) {
            throw new FirebaseRemoteConfigClientException(ProtectedSandApp.s("͜\u0001"), e5);
        }
    }

    private static String f(String str) {
        Matcher matcher = f60400p.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject h(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), ProtectedSandApp.s("͝\u0001")));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    private String i(String str, String str2) {
        return String.format(ProtectedSandApp.s("͞\u0001"), str, str2);
    }

    private String j() {
        try {
            Context context = this.f60401a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            this.f60401a.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f60401a.getPackageName();
            return null;
        }
    }

    private void l(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("̼\u0001"), this.f60403c);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("̿\u0001"), this.f60401a.getPackageName());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("̀\u0001"), j());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("́\u0001"), ProtectedSandApp.s("͟\u0001"));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("͂\u0001"), str);
        String s4 = ProtectedSandApp.s("͠\u0001");
        String s5 = ProtectedSandApp.s("͡\u0001");
        httpURLConnection.setRequestProperty(s4, s5);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("͢\u0001"), s5);
    }

    private void m(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private void n(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void o(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f60406f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f60407g));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("̾\u0001"), str);
        l(httpURLConnection, str2);
        m(httpURLConnection, map);
    }

    HttpURLConnection d() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(i(this.f60404d, this.f60405e)).openConnection();
        } catch (IOException e4) {
            throw new FirebaseRemoteConfigException(e4.getMessage());
        }
    }

    @Keep
    n.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l4, Date date) throws FirebaseRemoteConfigException {
        o(httpURLConnection, str3, str2, map2);
        try {
            try {
                n(httpURLConnection, c(str, str2, map, l4).toString().getBytes(ProtectedSandApp.s("͝\u0001")));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField(ProtectedSandApp.s("̽\u0001"));
                JSONObject h4 = h(httpURLConnection);
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                h e4 = e(h4, date);
                return !a(h4) ? n.a.a(date, e4) : n.a.b(e4, headerField);
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException | JSONException e5) {
            throw new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ͣ\u0001"), e5);
        }
    }

    @m1
    public long g() {
        return this.f60406f;
    }

    @m1
    public long k() {
        return this.f60407g;
    }
}
