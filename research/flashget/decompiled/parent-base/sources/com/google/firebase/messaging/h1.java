package com.google.firebase.messaging;

import android.text.TextUtils;
import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes6.dex */
final class h1 {

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f60143d = ProtectedSandApp.s("Ʌ\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final String f60144e = ProtectedSandApp.s("Ɇ\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final String f60145f = ProtectedSandApp.s("ɇ\u0001");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f60146g = Pattern.compile(ProtectedSandApp.s("ɇ\u0001"));

    /* renamed from: a, reason: collision with root package name */
    private final String f60147a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60148b;

    /* renamed from: c, reason: collision with root package name */
    private final String f60149c;

    private h1(String str, String str2) {
        this.f60147a = d(str2, str);
        this.f60148b = str;
        this.f60149c = z3.a(str, ProtectedSandApp.s("Ʌ\u0001"), str2);
    }

    @androidx.annotation.q0
    static h1 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(ProtectedSandApp.s("Ʌ\u0001"), -1);
        if (split.length != 2) {
            return null;
        }
        return new h1(split[0], split[1]);
    }

    @androidx.annotation.o0
    private static String d(String str, String str2) {
        if (str != null && str.startsWith(ProtectedSandApp.s("Ɇ\u0001"))) {
            String.format(ProtectedSandApp.s("Ɉ\u0001"), str2);
            str = str.substring(8);
        }
        if (str != null && f60146g.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ɉ\u0001"), str, ProtectedSandApp.s("ɇ\u0001")));
    }

    public static h1 f(@androidx.annotation.o0 String str) {
        return new h1(ProtectedSandApp.s("Ɋ\u0001"), str);
    }

    public static h1 g(@androidx.annotation.o0 String str) {
        return new h1(ProtectedSandApp.s("ɋ\u0001"), str);
    }

    public String b() {
        return this.f60148b;
    }

    public String c() {
        return this.f60147a;
    }

    public String e() {
        return this.f60149c;
    }

    public boolean equals(@androidx.annotation.q0 Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f60147a.equals(h1Var.f60147a) && this.f60148b.equals(h1Var.f60148b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f60148b, this.f60147a);
    }
}
