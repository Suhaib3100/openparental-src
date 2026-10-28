package com.google.zxing.client.result;

/* compiled from: TelParsedResult.java */
/* loaded from: classes6.dex */
public final class z extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f62758b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62759c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62760d;

    public z(String str, String str2, String str3) {
        super(r.TEL);
        this.f62758b = str;
        this.f62759c = str2;
        this.f62760d = str3;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb = new StringBuilder(20);
        q.c(this.f62758b, sb);
        q.c(this.f62760d, sb);
        return sb.toString();
    }

    public String e() {
        return this.f62758b;
    }

    public String f() {
        return this.f62759c;
    }

    public String g() {
        return this.f62760d;
    }
}
