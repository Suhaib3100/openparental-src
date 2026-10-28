package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: NotificationParams.java */
/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f17332b = -16777216;

    /* renamed from: c, reason: collision with root package name */
    private static final int f17333c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f17334d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f17335e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f17336f = ProtectedSandApp.s("ᢐ");

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final Bundle f17337a;

    public l0(@androidx.annotation.o0 Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᡰ"));
        }
        this.f17337a = new Bundle(bundle);
    }

    private static String B(String str) {
        return str.startsWith(ProtectedSandApp.s("ᡱ")) ? str.substring(6) : str;
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᡲ"));
    }

    private static boolean t(String str) {
        return str.startsWith(ProtectedSandApp.s("ᡳ")) || str.equals(ProtectedSandApp.s("ᡴ"));
    }

    public static boolean v(Bundle bundle) {
        String s5 = ProtectedSandApp.s("ᡵ");
        String string = bundle.getString(s5);
        String s6 = ProtectedSandApp.s("ᡶ");
        return s6.equals(string) || s6.equals(bundle.getString(x(s5)));
    }

    private static boolean w(String str) {
        return str.startsWith(ProtectedSandApp.s("ᡷ")) || str.startsWith(ProtectedSandApp.s("ᡸ")) || str.startsWith(ProtectedSandApp.s("\u1879"));
    }

    private static String x(String str) {
        String s5 = ProtectedSandApp.s("\u187a");
        return !str.startsWith(s5) ? str : str.replace(s5, ProtectedSandApp.s("\u187b"));
    }

    private String y(String str) {
        if (!this.f17337a.containsKey(str) && str.startsWith(ProtectedSandApp.s("\u187c"))) {
            String x5 = x(str);
            if (this.f17337a.containsKey(x5)) {
                return x5;
            }
        }
        return str;
    }

    public Bundle A() {
        Bundle bundle = new Bundle(this.f17337a);
        for (String str : this.f17337a.keySet()) {
            if (w(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public boolean a(String str) {
        String p5 = p(str);
        return ProtectedSandApp.s("\u187d").equals(p5) || Boolean.parseBoolean(p5);
    }

    public Integer b(String str) {
        String p5 = p(str);
        if (TextUtils.isEmpty(p5)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p5));
        } catch (NumberFormatException unused) {
            B(str);
            return null;
        }
    }

    @androidx.annotation.q0
    public JSONArray c(String str) {
        String p5 = p(str);
        if (TextUtils.isEmpty(p5)) {
            return null;
        }
        try {
            return new JSONArray(p5);
        } catch (JSONException unused) {
            B(str);
            return null;
        }
    }

    @androidx.annotation.q0
    int[] e() {
        JSONArray c6 = c(ProtectedSandApp.s("\u187e"));
        if (c6 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c6.length() != 3) {
                throw new JSONException(ProtectedSandApp.s("\u187f"));
            }
            iArr[0] = d(c6.optString(0));
            iArr[1] = c6.optInt(1);
            iArr[2] = c6.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e6) {
            c6.toString();
            e6.getMessage();
            return null;
        } catch (JSONException unused) {
            c6.toString();
            return null;
        }
    }

    @androidx.annotation.q0
    public Uri f() {
        String p5 = p(ProtectedSandApp.s("ᢀ"));
        if (TextUtils.isEmpty(p5)) {
            p5 = p(ProtectedSandApp.s("ᢁ"));
        }
        if (TextUtils.isEmpty(p5)) {
            return null;
        }
        return Uri.parse(p5);
    }

    @androidx.annotation.q0
    public Object[] g(String str) {
        JSONArray c6 = c(str + ProtectedSandApp.s("ᢂ"));
        if (c6 == null) {
            return null;
        }
        int length = c6.length();
        String[] strArr = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            strArr[i5] = c6.optString(i5);
        }
        return strArr;
    }

    @androidx.annotation.q0
    public String h(String str) {
        return p(str + ProtectedSandApp.s("ᢃ"));
    }

    @androidx.annotation.q0
    public String i(Resources resources, String str, String str2) {
        String h5 = h(str2);
        if (TextUtils.isEmpty(h5)) {
            return null;
        }
        int identifier = resources.getIdentifier(h5, ProtectedSandApp.s("ᢄ"), str);
        if (identifier == 0) {
            B(androidx.concurrent.futures.b.a(str2, ProtectedSandApp.s("ᢅ")));
            return null;
        }
        Object[] g5 = g(str2);
        if (g5 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g5);
        } catch (MissingFormatArgumentException unused) {
            B(str2);
            Arrays.toString(g5);
            return null;
        }
    }

    public Long j(String str) {
        String p5 = p(str);
        if (TextUtils.isEmpty(p5)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p5));
        } catch (NumberFormatException unused) {
            B(str);
            return null;
        }
    }

    public String k() {
        return p(ProtectedSandApp.s("ᢆ"));
    }

    @androidx.annotation.q0
    Integer l() {
        Integer b6 = b(ProtectedSandApp.s("ᢇ"));
        if (b6 != null && b6.intValue() >= 0) {
            return b6;
        }
        return null;
    }

    @androidx.annotation.q0
    Integer m() {
        Integer b6 = b(ProtectedSandApp.s("ᢈ"));
        if (b6 != null && b6.intValue() >= -2 && b6.intValue() <= 2) {
            return b6;
        }
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p5 = p(str2);
        return !TextUtils.isEmpty(p5) ? p5 : i(resources, str, str2);
    }

    @androidx.annotation.q0
    public String o() {
        String p5 = p(ProtectedSandApp.s("ᢉ"));
        return TextUtils.isEmpty(p5) ? p(ProtectedSandApp.s("ᢊ")) : p5;
    }

    public String p(String str) {
        return this.f17337a.getString(y(str));
    }

    @androidx.annotation.q0
    public long[] q() {
        JSONArray c6 = c(ProtectedSandApp.s("ᢋ"));
        if (c6 == null) {
            return null;
        }
        try {
            if (c6.length() <= 1) {
                throw new JSONException(ProtectedSandApp.s("ᢌ"));
            }
            int length = c6.length();
            long[] jArr = new long[length];
            for (int i5 = 0; i5 < length; i5++) {
                jArr[i5] = c6.optLong(i5);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            c6.toString();
            return null;
        }
    }

    Integer r() {
        Integer b6 = b(ProtectedSandApp.s("ᢍ"));
        if (b6 != null && b6.intValue() >= -1 && b6.intValue() <= 1) {
            return b6;
        }
        return null;
    }

    public boolean s() {
        return !TextUtils.isEmpty(p(ProtectedSandApp.s("ᢎ")));
    }

    public boolean u() {
        return a(ProtectedSandApp.s("ᢏ"));
    }

    public Bundle z() {
        Bundle bundle = new Bundle(this.f17337a);
        for (String str : this.f17337a.keySet()) {
            if (!t(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
