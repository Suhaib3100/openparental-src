package com.google.zxing.client.result;

/* compiled from: ProductParsedResult.java */
/* loaded from: classes6.dex */
public final class s extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f62746b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62747c;

    s(String str) {
        this(str, str);
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        return this.f62746b;
    }

    public String e() {
        return this.f62747c;
    }

    public String f() {
        return this.f62746b;
    }

    s(String str, String str2) {
        super(r.PRODUCT);
        this.f62746b = str;
        this.f62747c = str2;
    }
}
