package com.google.firebase.messaging;

import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes2.dex */
final class b1 {

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f17120d = ProtectedSandApp.s("\u171c");

    /* renamed from: e, reason: collision with root package name */
    private static final String f17121e = ProtectedSandApp.s("\u171d");

    /* renamed from: f, reason: collision with root package name */
    private static final String f17122f = ProtectedSandApp.s("\u171e");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f17123g = Pattern.compile(ProtectedSandApp.s("ᜟ"));

    /* renamed from: a, reason: collision with root package name */
    private final String f17124a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17125b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17126c;

    private b1(String str, String str2) {
        this.f17124a = d(str2, str);
        this.f17125b = str;
        this.f17126c = str + ProtectedSandApp.s("ᜠ") + str2;
    }

    @androidx.annotation.q0
    static b1 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(ProtectedSandApp.s("ᜡ"), -1);
        if (split.length != 2) {
            return null;
        }
        return new b1(split[0], split[1]);
    }

    @androidx.annotation.o0
    private static String d(String str, String str2) {
        if (str != null && str.startsWith(ProtectedSandApp.s("ᜢ"))) {
            String.format(ProtectedSandApp.s("ᜣ"), str2);
            str = str.substring(8);
        }
        if (str == null || !f17123g.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ᜥ"), str, ProtectedSandApp.s("ᜤ")));
        }
        return str;
    }

    public static b1 f(@androidx.annotation.o0 String str) {
        return new b1(ProtectedSandApp.s("ᜦ"), str);
    }

    public static b1 g(@androidx.annotation.o0 String str) {
        return new b1(ProtectedSandApp.s("ᜧ"), str);
    }

    public String b() {
        return this.f17125b;
    }

    public String c() {
        return this.f17124a;
    }

    public String e() {
        return this.f17126c;
    }

    public boolean equals(@androidx.annotation.q0 Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f17124a.equals(b1Var.f17124a) && this.f17125b.equals(b1Var.f17125b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f17125b, this.f17124a);
    }
}
