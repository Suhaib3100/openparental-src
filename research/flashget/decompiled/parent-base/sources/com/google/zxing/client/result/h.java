package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: EmailAddressParsedResult.java */
/* loaded from: classes6.dex */
public final class h extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String[] f62696b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f62697c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f62698d;

    /* renamed from: e, reason: collision with root package name */
    private final String f62699e;

    /* renamed from: f, reason: collision with root package name */
    private final String f62700f;

    h(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb = new StringBuilder(30);
        q.d(this.f62696b, sb);
        q.d(this.f62697c, sb);
        q.d(this.f62698d, sb);
        q.c(this.f62699e, sb);
        q.c(this.f62700f, sb);
        return sb.toString();
    }

    public String[] e() {
        return this.f62698d;
    }

    public String f() {
        return this.f62700f;
    }

    public String[] g() {
        return this.f62697c;
    }

    @Deprecated
    public String h() {
        String[] strArr = this.f62696b;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @Deprecated
    public String i() {
        return ProtectedSandApp.s("ন\u0001");
    }

    public String j() {
        return this.f62699e;
    }

    public String[] k() {
        return this.f62696b;
    }

    h(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(r.EMAIL_ADDRESS);
        this.f62696b = strArr;
        this.f62697c = strArr2;
        this.f62698d = strArr3;
        this.f62699e = str;
        this.f62700f = str2;
    }
}
