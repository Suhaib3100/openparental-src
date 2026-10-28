package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AddressBookParsedResult.java */
/* loaded from: classes6.dex */
public final class d extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String[] f62652b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f62653c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62654d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f62655e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f62656f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f62657g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f62658h;

    /* renamed from: i, reason: collision with root package name */
    private final String f62659i;

    /* renamed from: j, reason: collision with root package name */
    private final String f62660j;

    /* renamed from: k, reason: collision with root package name */
    private final String[] f62661k;

    /* renamed from: l, reason: collision with root package name */
    private final String[] f62662l;

    /* renamed from: m, reason: collision with root package name */
    private final String f62663m;

    /* renamed from: n, reason: collision with root package name */
    private final String f62664n;

    /* renamed from: o, reason: collision with root package name */
    private final String f62665o;

    /* renamed from: p, reason: collision with root package name */
    private final String[] f62666p;

    /* renamed from: q, reason: collision with root package name */
    private final String[] f62667q;

    public d(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, null, null, strArr2, strArr3, strArr4, strArr5, null, null, strArr6, strArr7, null, null, null, null, null);
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb = new StringBuilder(100);
        q.d(this.f62652b, sb);
        q.d(this.f62653c, sb);
        q.c(this.f62654d, sb);
        q.c(this.f62665o, sb);
        q.c(this.f62663m, sb);
        q.d(this.f62661k, sb);
        q.d(this.f62655e, sb);
        q.d(this.f62657g, sb);
        q.c(this.f62659i, sb);
        q.d(this.f62666p, sb);
        q.c(this.f62664n, sb);
        q.d(this.f62667q, sb);
        q.c(this.f62660j, sb);
        return sb.toString();
    }

    public String[] e() {
        return this.f62662l;
    }

    public String[] f() {
        return this.f62661k;
    }

    public String g() {
        return this.f62664n;
    }

    public String[] h() {
        return this.f62658h;
    }

    public String[] i() {
        return this.f62657g;
    }

    public String[] j() {
        return this.f62667q;
    }

    public String k() {
        return this.f62659i;
    }

    public String[] l() {
        return this.f62652b;
    }

    public String[] m() {
        return this.f62653c;
    }

    public String n() {
        return this.f62660j;
    }

    public String o() {
        return this.f62663m;
    }

    public String[] p() {
        return this.f62655e;
    }

    public String[] q() {
        return this.f62656f;
    }

    public String r() {
        return this.f62654d;
    }

    public String s() {
        return this.f62665o;
    }

    public String[] t() {
        return this.f62666p;
    }

    public d(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(r.ADDRESSBOOK);
        if (strArr3 != null && strArr4 != null && strArr3.length != strArr4.length) {
            throw new IllegalArgumentException(ProtectedSandApp.s("।\u0001"));
        }
        if (strArr5 != null && strArr6 != null && strArr5.length != strArr6.length) {
            throw new IllegalArgumentException(ProtectedSandApp.s("॥\u0001"));
        }
        if (strArr7 != null && strArr8 != null && strArr7.length != strArr8.length) {
            throw new IllegalArgumentException(ProtectedSandApp.s("०\u0001"));
        }
        this.f62652b = strArr;
        this.f62653c = strArr2;
        this.f62654d = str;
        this.f62655e = strArr3;
        this.f62656f = strArr4;
        this.f62657g = strArr5;
        this.f62658h = strArr6;
        this.f62659i = str2;
        this.f62660j = str3;
        this.f62661k = strArr7;
        this.f62662l = strArr8;
        this.f62663m = str4;
        this.f62664n = str5;
        this.f62665o = str6;
        this.f62666p = strArr9;
        this.f62667q = strArr10;
    }
}
