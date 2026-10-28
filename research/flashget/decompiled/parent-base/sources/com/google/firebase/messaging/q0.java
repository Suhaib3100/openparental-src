package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: NotificationParams.java */
/* loaded from: classes6.dex */
public class q0 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f60269b = -16777216;

    /* renamed from: c, reason: collision with root package name */
    private static final int f60270c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f60271d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f60272e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f60273f = ProtectedSandApp.s("˲\u0001");

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final Bundle f60274a;

    public q0(@androidx.annotation.o0 Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException(ProtectedSandApp.s("˙\u0001"));
        }
        this.f60274a = new Bundle(bundle);
    }

    private static String B(String str) {
        return str.startsWith(ProtectedSandApp.s("˚\u0001")) ? str.substring(6) : str;
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("˛\u0001"));
    }

    private static boolean t(String str) {
        return str.startsWith(ProtectedSandApp.s("˜\u0001")) || str.equals(ProtectedSandApp.s("˝\u0001"));
    }

    public static boolean v(Bundle bundle) {
        String s4 = ProtectedSandApp.s("˞\u0001");
        String string = bundle.getString(s4);
        String s5 = ProtectedSandApp.s("˟\u0001");
        return s5.equals(string) || s5.equals(bundle.getString(x(s4)));
    }

    private static boolean w(String str) {
        return str.startsWith(ProtectedSandApp.s("ˠ\u0001")) || str.startsWith(ProtectedSandApp.s("˚\u0001")) || str.startsWith(ProtectedSandApp.s("ˡ\u0001"));
    }

    private static String x(String str) {
        String s4 = ProtectedSandApp.s("˚\u0001");
        return !str.startsWith(s4) ? str : str.replace(s4, ProtectedSandApp.s("ˡ\u0001"));
    }

    private String y(String str) {
        if (!this.f60274a.containsKey(str) && str.startsWith(ProtectedSandApp.s("˚\u0001"))) {
            String x4 = x(str);
            if (this.f60274a.containsKey(x4)) {
                return x4;
            }
        }
        return str;
    }

    public Bundle A() {
        Bundle bundle = new Bundle(this.f60274a);
        for (String str : this.f60274a.keySet()) {
            if (w(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public boolean a(String str) {
        String p4 = p(str);
        return ProtectedSandApp.s("˟\u0001").equals(p4) || Boolean.parseBoolean(p4);
    }

    public Integer b(String str) {
        String p4 = p(str);
        if (TextUtils.isEmpty(p4)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p4));
        } catch (NumberFormatException unused) {
            B(str);
            return null;
        }
    }

    @androidx.annotation.q0
    public JSONArray c(String str) {
        String p4 = p(str);
        if (TextUtils.isEmpty(p4)) {
            return null;
        }
        try {
            return new JSONArray(p4);
        } catch (JSONException unused) {
            B(str);
            return null;
        }
    }

    @androidx.annotation.q0
    int[] e() {
        JSONArray c5 = c(ProtectedSandApp.s("ˢ\u0001"));
        if (c5 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c5.length() != 3) {
                throw new JSONException(ProtectedSandApp.s("ˣ\u0001"));
            }
            iArr[0] = d(c5.optString(0));
            iArr[1] = c5.optInt(1);
            iArr[2] = c5.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e4) {
            c5.toString();
            e4.getMessage();
            return null;
        } catch (JSONException unused) {
            c5.toString();
            return null;
        }
    }

    @androidx.annotation.q0
    public Uri f() {
        String p4 = p(ProtectedSandApp.s("ˤ\u0001"));
        if (TextUtils.isEmpty(p4)) {
            p4 = p(ProtectedSandApp.s("˥\u0001"));
        }
        if (TextUtils.isEmpty(p4)) {
            return null;
        }
        return Uri.parse(p4);
    }

    @androidx.annotation.q0
    public Object[] g(String str) {
        JSONArray c5 = c(str + ProtectedSandApp.s("˦\u0001"));
        if (c5 == null) {
            return null;
        }
        int length = c5.length();
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            strArr[i4] = c5.optString(i4);
        }
        return strArr;
    }

    @androidx.annotation.q0
    public String h(String str) {
        return p(str + ProtectedSandApp.s("˧\u0001"));
    }

    @androidx.annotation.q0
    public String i(Resources resources, String str, String str2) {
        String h4 = h(str2);
        if (TextUtils.isEmpty(h4)) {
            return null;
        }
        int identifier = resources.getIdentifier(h4, ProtectedSandApp.s("˨\u0001"), str);
        if (identifier == 0) {
            B(androidx.compose.runtime.changelist.j.a(str2, ProtectedSandApp.s("˧\u0001")));
            return null;
        }
        Object[] g4 = g(str2);
        if (g4 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g4);
        } catch (MissingFormatArgumentException unused) {
            B(str2);
            Arrays.toString(g4);
            return null;
        }
    }

    public Long j(String str) {
        String p4 = p(str);
        if (TextUtils.isEmpty(p4)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p4));
        } catch (NumberFormatException unused) {
            B(str);
            return null;
        }
    }

    public String k() {
        return p(ProtectedSandApp.s("˩\u0001"));
    }

    @androidx.annotation.q0
    Integer l() {
        Integer b5 = b(ProtectedSandApp.s("˪\u0001"));
        if (b5 != null && b5.intValue() >= 0) {
            return b5;
        }
        return null;
    }

    @androidx.annotation.q0
    Integer m() {
        Integer b5 = b(ProtectedSandApp.s("˫\u0001"));
        if (b5 != null && b5.intValue() >= -2 && b5.intValue() <= 2) {
            return b5;
        }
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p4 = p(str2);
        return !TextUtils.isEmpty(p4) ? p4 : i(resources, str, str2);
    }

    @androidx.annotation.q0
    public String o() {
        String p4 = p(ProtectedSandApp.s("ˬ\u0001"));
        return TextUtils.isEmpty(p4) ? p(ProtectedSandApp.s("˭\u0001")) : p4;
    }

    public String p(String str) {
        return this.f60274a.getString(y(str));
    }

    @androidx.annotation.q0
    public long[] q() {
        JSONArray c5 = c(ProtectedSandApp.s("ˮ\u0001"));
        if (c5 == null) {
            return null;
        }
        try {
            if (c5.length() <= 1) {
                throw new JSONException(ProtectedSandApp.s("˯\u0001"));
            }
            int length = c5.length();
            long[] jArr = new long[length];
            for (int i4 = 0; i4 < length; i4++) {
                jArr[i4] = c5.optLong(i4);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            c5.toString();
            return null;
        }
    }

    Integer r() {
        Integer b5 = b(ProtectedSandApp.s("˰\u0001"));
        if (b5 != null && b5.intValue() >= -1 && b5.intValue() <= 1) {
            return b5;
        }
        return null;
    }

    public boolean s() {
        return !TextUtils.isEmpty(p(ProtectedSandApp.s("˱\u0001")));
    }

    public boolean u() {
        return a(ProtectedSandApp.s("˞\u0001"));
    }

    public Bundle z() {
        Bundle bundle = new Bundle(this.f60274a);
        for (String str : this.f60274a.keySet()) {
            if (!t(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
