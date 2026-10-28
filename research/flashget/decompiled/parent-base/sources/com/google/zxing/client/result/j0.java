package com.google.zxing.client.result;

/* compiled from: WifiParsedResult.java */
/* loaded from: classes6.dex */
public final class j0 extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f62714b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62715c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62716d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f62717e;

    /* renamed from: f, reason: collision with root package name */
    private final String f62718f;

    /* renamed from: g, reason: collision with root package name */
    private final String f62719g;

    /* renamed from: h, reason: collision with root package name */
    private final String f62720h;

    /* renamed from: i, reason: collision with root package name */
    private final String f62721i;

    public j0(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb = new StringBuilder(80);
        q.c(this.f62714b, sb);
        q.c(this.f62715c, sb);
        q.c(this.f62716d, sb);
        q.c(Boolean.toString(this.f62717e), sb);
        return sb.toString();
    }

    public String e() {
        return this.f62719g;
    }

    public String f() {
        return this.f62720h;
    }

    public String g() {
        return this.f62718f;
    }

    public String h() {
        return this.f62715c;
    }

    public String i() {
        return this.f62716d;
    }

    public String j() {
        return this.f62721i;
    }

    public String k() {
        return this.f62714b;
    }

    public boolean l() {
        return this.f62717e;
    }

    public j0(String str, String str2, String str3, boolean z4) {
        this(str, str2, str3, z4, null, null, null, null);
    }

    public j0(String str, String str2, String str3, boolean z4, String str4, String str5, String str6, String str7) {
        super(r.WIFI);
        this.f62714b = str2;
        this.f62715c = str;
        this.f62716d = str3;
        this.f62717e = z4;
        this.f62718f = str4;
        this.f62719g = str5;
        this.f62720h = str6;
        this.f62721i = str7;
    }
}
