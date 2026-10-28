package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: URIParsedResult.java */
/* loaded from: classes6.dex */
public final class c0 extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f62650b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62651c;

    public c0(String str, String str2) {
        super(r.URI);
        this.f62650b = i(str);
        this.f62651c = str2;
    }

    private static boolean g(String str, int i4) {
        int i5 = i4 + 1;
        int indexOf = str.indexOf(47, i5);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return u.e(str, i5, indexOf - i5);
    }

    private static String i(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        return (indexOf < 0 || g(trim, indexOf)) ? ProtectedSandApp.s("॒\u0001").concat(trim) : trim;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb = new StringBuilder(30);
        q.c(this.f62651c, sb);
        q.c(this.f62650b, sb);
        return sb.toString();
    }

    public String e() {
        return this.f62651c;
    }

    public String f() {
        return this.f62650b;
    }

    @Deprecated
    public boolean h() {
        return d0.r(this.f62650b);
    }
}
