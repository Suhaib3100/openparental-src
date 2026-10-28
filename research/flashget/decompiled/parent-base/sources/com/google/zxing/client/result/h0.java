package com.google.zxing.client.result;

import androidx.compose.foundation.layout.f3;

/* compiled from: VINParsedResult.java */
/* loaded from: classes6.dex */
public final class h0 extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f62701b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62702c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62703d;

    /* renamed from: e, reason: collision with root package name */
    private final String f62704e;

    /* renamed from: f, reason: collision with root package name */
    private final String f62705f;

    /* renamed from: g, reason: collision with root package name */
    private final String f62706g;

    /* renamed from: h, reason: collision with root package name */
    private final int f62707h;

    /* renamed from: i, reason: collision with root package name */
    private final char f62708i;

    /* renamed from: j, reason: collision with root package name */
    private final String f62709j;

    public h0(String str, String str2, String str3, String str4, String str5, String str6, int i4, char c5, String str7) {
        super(r.VIN);
        this.f62701b = str;
        this.f62702c = str2;
        this.f62703d = str3;
        this.f62704e = str4;
        this.f62705f = str5;
        this.f62706g = str6;
        this.f62707h = i4;
        this.f62708i = c5;
        this.f62709j = str7;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.f62702c);
        sb.append(' ');
        sb.append(this.f62703d);
        sb.append(' ');
        sb.append(this.f62704e);
        sb.append('\n');
        String str = this.f62705f;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.f62707h);
        sb.append(' ');
        sb.append(this.f62708i);
        sb.append(' ');
        return f3.a(sb, this.f62709j, '\n');
    }

    public String e() {
        return this.f62705f;
    }

    public int f() {
        return this.f62707h;
    }

    public char g() {
        return this.f62708i;
    }

    public String h() {
        return this.f62709j;
    }

    public String i() {
        return this.f62701b;
    }

    public String j() {
        return this.f62706g;
    }

    public String k() {
        return this.f62703d;
    }

    public String l() {
        return this.f62704e;
    }

    public String m() {
        return this.f62702c;
    }
}
