package com.google.zxing.client.result;

/* compiled from: TextParsedResult.java */
/* loaded from: classes6.dex */
public final class b0 extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f62648b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62649c;

    public b0(String str, String str2) {
        super(r.TEXT);
        this.f62648b = str;
        this.f62649c = str2;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        return this.f62648b;
    }

    public String e() {
        return this.f62649c;
    }

    public String f() {
        return this.f62648b;
    }
}
