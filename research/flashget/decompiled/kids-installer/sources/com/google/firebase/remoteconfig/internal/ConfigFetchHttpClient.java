package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
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

/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    private static final String f17868h = ProtectedSandApp.s("ᤓ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f17869i = ProtectedSandApp.s("ᤔ");

    /* renamed from: j, reason: collision with root package name */
    private static final String f17870j = ProtectedSandApp.s("ᤕ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f17871k = ProtectedSandApp.s("ᤖ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f17872l = ProtectedSandApp.s("ᤗ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f17873m = ProtectedSandApp.s("ᤘ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f17874n = ProtectedSandApp.s("ᤙ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f17875o = ProtectedSandApp.s("ᤚ");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f17876p = Pattern.compile(ProtectedSandApp.s("ᤛ"));

    /* renamed from: a, reason: collision with root package name */
    private final Context f17877a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17878b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17879c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17880d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17881e;

    /* renamed from: f, reason: collision with root package name */
    private final long f17882f;

    /* renamed from: g, reason: collision with root package name */
    private final long f17883g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j5, long j6) {
        this.f17877a = context;
        this.f17878b = str;
        this.f17879c = str2;
        this.f17880d = f(str);
        this.f17881e = str3;
        this.f17882f = j5;
        this.f17883g = j6;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get(ProtectedSandApp.s("ᤜ")).equals(ProtectedSandApp.s("ᤝ"));
        } catch (JSONException unused) {
            return true;
        }
    }

    private String b(long j5) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("ᤞ"), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ProtectedSandApp.s("\u191f")));
        return simpleDateFormat.format(Long.valueOf(j5));
    }

    private JSONObject c(String str, String str2, Map<String, String> map, Long l5) throws FirebaseRemoteConfigClientException {
        HashMap hashMap = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException(ProtectedSandApp.s("\u192e"));
        }
        hashMap.put(ProtectedSandApp.s("ᤠ"), str);
        hashMap.put(ProtectedSandApp.s("ᤡ"), str2);
        hashMap.put(ProtectedSandApp.s("ᤢ"), this.f17878b);
        Locale locale = this.f17877a.getResources().getConfiguration().locale;
        hashMap.put(ProtectedSandApp.s("ᤣ"), locale.getCountry());
        int i5 = Build.VERSION.SDK_INT;
        hashMap.put(ProtectedSandApp.s("ᤤ"), locale.toLanguageTag());
        hashMap.put(ProtectedSandApp.s("ᤥ"), Integer.toString(i5));
        hashMap.put(ProtectedSandApp.s("ᤦ"), TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f17877a.getPackageManager().getPackageInfo(this.f17877a.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put(ProtectedSandApp.s("ᤧ"), packageInfo.versionName);
                hashMap.put(ProtectedSandApp.s("ᤨ"), Long.toString(androidx.core.content.pm.h.c(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put(ProtectedSandApp.s("ᤩ"), this.f17877a.getPackageName());
        hashMap.put(ProtectedSandApp.s("ᤪ"), ProtectedSandApp.s("ᤫ"));
        hashMap.put(ProtectedSandApp.s("\u192c"), new JSONObject(map));
        if (l5 != null) {
            hashMap.put(ProtectedSandApp.s("\u192d"), b(l5.longValue()));
        }
        return new JSONObject(hashMap);
    }

    private static h e(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        String s5 = ProtectedSandApp.s("\u192f");
        try {
            h.b e6 = h.j().e(date);
            try {
                jSONObject2 = jSONObject.getJSONObject(ProtectedSandApp.s("ᤰ"));
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e6 = e6.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(ProtectedSandApp.s("ᤱ"));
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e6 = e6.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(ProtectedSandApp.s("ᤲ"));
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                e6 = e6.f(jSONObject3);
            }
            String string = jSONObject.has(s5) ? jSONObject.getString(s5) : null;
            if (string != null) {
                e6.g(Long.parseLong(string));
            }
            return e6.a();
        } catch (JSONException e7) {
            throw new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ᤳ"), e7);
        }
    }

    private static String f(String str) {
        Matcher matcher = f17876p.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject h(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), ProtectedSandApp.s("ᤴ")));
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
        return String.format(ProtectedSandApp.s("ᤵ"), str, str2);
    }

    private String j() {
        try {
            Context context = this.f17877a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            this.f17877a.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f17877a.getPackageName();
            return null;
        }
    }

    private void l(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᤶ"), this.f17879c);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᤷ"), this.f17877a.getPackageName());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("ᤸ"), j());
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("᤹"), ProtectedSandApp.s("᤺"));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("᤻"), str);
        String s5 = ProtectedSandApp.s("\u193c");
        String s6 = ProtectedSandApp.s("\u193d");
        httpURLConnection.setRequestProperty(s5, s6);
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("\u193e"), s6);
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
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f17882f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f17883g));
        httpURLConnection.setRequestProperty(ProtectedSandApp.s("\u193f"), str);
        l(httpURLConnection, str2);
        m(httpURLConnection, map);
    }

    HttpURLConnection d() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(i(this.f17880d, this.f17881e)).openConnection();
        } catch (IOException e6) {
            throw new FirebaseRemoteConfigException(e6.getMessage());
        }
    }

    @Keep
    n.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l5, Date date) throws FirebaseRemoteConfigException {
        o(httpURLConnection, str3, str2, map2);
        try {
            try {
                n(httpURLConnection, c(str, str2, map, l5).toString().getBytes(ProtectedSandApp.s("᥀")));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField(ProtectedSandApp.s("\u1941"));
                JSONObject h5 = h(httpURLConnection);
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                h e6 = e(h5, date);
                return !a(h5) ? n.a.a(date, e6) : n.a.b(e6, headerField);
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException | JSONException e7) {
            throw new FirebaseRemoteConfigClientException(ProtectedSandApp.s("\u1942"), e7);
        }
    }

    @m1
    public long g() {
        return this.f17882f;
    }

    @m1
    public long k() {
        return this.f17883g;
    }
}
