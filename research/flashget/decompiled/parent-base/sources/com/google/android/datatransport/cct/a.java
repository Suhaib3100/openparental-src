package com.google.android.datatransport.cct;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.i;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination.java */
/* loaded from: classes5.dex */
public final class a implements i {

    /* renamed from: d, reason: collision with root package name */
    static final String f51759d;

    /* renamed from: e, reason: collision with root package name */
    static final String f51760e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f51761f;

    /* renamed from: i, reason: collision with root package name */
    private static final Set<com.google.android.datatransport.e> f51764i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f51765j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f51766k;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final String f51767a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final String f51768b;

    /* renamed from: c, reason: collision with root package name */
    static final String f51758c = ProtectedSandApp.s("쒱");

    /* renamed from: g, reason: collision with root package name */
    private static final String f51762g = ProtectedSandApp.s("쒲");

    /* renamed from: h, reason: collision with root package name */
    private static final String f51763h = ProtectedSandApp.s("쒳");

    static {
        String a5 = e.a(ProtectedSandApp.s("쒴"), ProtectedSandApp.s("쒵"));
        f51759d = a5;
        String a6 = e.a(ProtectedSandApp.s("쒶"), ProtectedSandApp.s("쒷"));
        f51760e = a6;
        String a7 = e.a(ProtectedSandApp.s("쒸"), ProtectedSandApp.s("쒹"));
        f51761f = a7;
        f51764i = Collections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.datatransport.e.b(ProtectedSandApp.s("쒺")), com.google.android.datatransport.e.b(ProtectedSandApp.s("쒻")))));
        f51765j = new a(a5, null);
        f51766k = new a(a6, a7);
    }

    public a(@o0 String str, @q0 String str2) {
        this.f51767a = str;
        this.f51768b = str2;
    }

    @o0
    static String c(@o0 byte[] bArr) {
        return new String(bArr, Charset.forName(ProtectedSandApp.s("쒼")));
    }

    @o0
    static byte[] d(@o0 String str) {
        return str.getBytes(Charset.forName(ProtectedSandApp.s("쒼")));
    }

    @o0
    public static a e(@o0 byte[] bArr) {
        String str = new String(bArr, Charset.forName(ProtectedSandApp.s("쒼")));
        if (!str.startsWith(ProtectedSandApp.s("쒲"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쒿"));
        }
        String[] split = str.substring(2).split(Pattern.quote(ProtectedSandApp.s("쒳")), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쒾"));
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쒽"));
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // com.google.android.datatransport.runtime.i
    public Set<com.google.android.datatransport.e> a() {
        return f51764i;
    }

    @q0
    public byte[] b() {
        String str = this.f51768b;
        if (str == null && this.f51767a == null) {
            return null;
        }
        String str2 = this.f51767a;
        if (str == null) {
            str = "";
        }
        return String.format(ProtectedSandApp.s("쓀"), ProtectedSandApp.s("쒲"), str2, ProtectedSandApp.s("쒳"), str).getBytes(Charset.forName(ProtectedSandApp.s("쒼")));
    }

    @q0
    public String f() {
        return this.f51768b;
    }

    @o0
    public String g() {
        return this.f51767a;
    }

    @Override // com.google.android.datatransport.runtime.h
    @q0
    public byte[] getExtras() {
        return b();
    }

    @Override // com.google.android.datatransport.runtime.h
    @o0
    public String getName() {
        return ProtectedSandApp.s("쒱");
    }
}
