package com.google.android.datatransport.cct;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.i;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination.java */
/* loaded from: classes3.dex */
public final class a implements i {

    /* renamed from: d, reason: collision with root package name */
    static final String f12252d;

    /* renamed from: e, reason: collision with root package name */
    static final String f12253e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f12254f;

    /* renamed from: i, reason: collision with root package name */
    private static final Set<com.google.android.datatransport.c> f12257i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f12258j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f12259k;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final String f12260a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final String f12261b;

    /* renamed from: c, reason: collision with root package name */
    static final String f12251c = ProtectedSandApp.s("Ὄ");

    /* renamed from: g, reason: collision with root package name */
    private static final String f12255g = ProtectedSandApp.s("Ὅ");

    /* renamed from: h, reason: collision with root package name */
    private static final String f12256h = ProtectedSandApp.s("\u1f4e");

    static {
        String a6 = e.a(ProtectedSandApp.s("\u1f4f"), ProtectedSandApp.s("ὐ"));
        f12252d = a6;
        String a7 = e.a(ProtectedSandApp.s("ὑ"), ProtectedSandApp.s("ὒ"));
        f12253e = a7;
        String a8 = e.a(ProtectedSandApp.s("ὓ"), ProtectedSandApp.s("ὔ"));
        f12254f = a8;
        f12257i = Collections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.datatransport.c.b(ProtectedSandApp.s("ὕ")), com.google.android.datatransport.c.b(ProtectedSandApp.s("ὖ")))));
        f12258j = new a(a6, null);
        f12259k = new a(a7, a8);
    }

    public a(@o0 String str, @q0 String str2) {
        this.f12260a = str;
        this.f12261b = str2;
    }

    @o0
    static String c(@o0 byte[] bArr) {
        return new String(bArr, Charset.forName(ProtectedSandApp.s("ὗ")));
    }

    @o0
    static byte[] d(@o0 String str) {
        return str.getBytes(Charset.forName(ProtectedSandApp.s("\u1f58")));
    }

    @o0
    public static a e(@o0 byte[] bArr) {
        String str = new String(bArr, Charset.forName(ProtectedSandApp.s("Ὑ")));
        if (!str.startsWith(ProtectedSandApp.s("\u1f5a"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u1f5e"));
        }
        String[] split = str.substring(2).split(Pattern.quote(ProtectedSandApp.s("Ὓ")), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ὕ"));
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u1f5c"));
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // com.google.android.datatransport.runtime.i
    public Set<com.google.android.datatransport.c> a() {
        return f12257i;
    }

    @q0
    public byte[] b() {
        String str = this.f12261b;
        if (str == null && this.f12260a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = ProtectedSandApp.s("Ὗ");
        objArr[1] = this.f12260a;
        objArr[2] = ProtectedSandApp.s("ὠ");
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format(ProtectedSandApp.s("ὡ"), objArr).getBytes(Charset.forName(ProtectedSandApp.s("ὢ")));
    }

    @q0
    public String f() {
        return this.f12261b;
    }

    @o0
    public String g() {
        return this.f12260a;
    }

    @Override // com.google.android.datatransport.runtime.h
    @q0
    public byte[] getExtras() {
        return b();
    }

    @Override // com.google.android.datatransport.runtime.h
    @o0
    public String getName() {
        return ProtectedSandApp.s("ὣ");
    }
}
