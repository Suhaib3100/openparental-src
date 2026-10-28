package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import java.util.Objects;

/* compiled from: ExpandedProductParsedResult.java */
/* loaded from: classes6.dex */
public final class k extends q {

    /* renamed from: q, reason: collision with root package name */
    public static final String f62722q = ProtectedSandApp.s("\u09d2\u0001");

    /* renamed from: r, reason: collision with root package name */
    public static final String f62723r = ProtectedSandApp.s("\u09d3\u0001");

    /* renamed from: b, reason: collision with root package name */
    private final String f62724b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62725c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62726d;

    /* renamed from: e, reason: collision with root package name */
    private final String f62727e;

    /* renamed from: f, reason: collision with root package name */
    private final String f62728f;

    /* renamed from: g, reason: collision with root package name */
    private final String f62729g;

    /* renamed from: h, reason: collision with root package name */
    private final String f62730h;

    /* renamed from: i, reason: collision with root package name */
    private final String f62731i;

    /* renamed from: j, reason: collision with root package name */
    private final String f62732j;

    /* renamed from: k, reason: collision with root package name */
    private final String f62733k;

    /* renamed from: l, reason: collision with root package name */
    private final String f62734l;

    /* renamed from: m, reason: collision with root package name */
    private final String f62735m;

    /* renamed from: n, reason: collision with root package name */
    private final String f62736n;

    /* renamed from: o, reason: collision with root package name */
    private final String f62737o;

    /* renamed from: p, reason: collision with root package name */
    private final Map<String, String> f62738p;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(r.PRODUCT);
        this.f62724b = str;
        this.f62725c = str2;
        this.f62726d = str3;
        this.f62727e = str4;
        this.f62728f = str5;
        this.f62729g = str6;
        this.f62730h = str7;
        this.f62731i = str8;
        this.f62732j = str9;
        this.f62733k = str10;
        this.f62734l = str11;
        this.f62735m = str12;
        this.f62736n = str13;
        this.f62737o = str14;
        this.f62738p = map;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        return String.valueOf(this.f62724b);
    }

    public String e() {
        return this.f62730h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f62725c, kVar.f62725c) && Objects.equals(this.f62726d, kVar.f62726d) && Objects.equals(this.f62727e, kVar.f62727e) && Objects.equals(this.f62728f, kVar.f62728f) && Objects.equals(this.f62730h, kVar.f62730h) && Objects.equals(this.f62731i, kVar.f62731i) && Objects.equals(this.f62732j, kVar.f62732j) && Objects.equals(this.f62733k, kVar.f62733k) && Objects.equals(this.f62734l, kVar.f62734l) && Objects.equals(this.f62735m, kVar.f62735m) && Objects.equals(this.f62736n, kVar.f62736n) && Objects.equals(this.f62737o, kVar.f62737o) && Objects.equals(this.f62738p, kVar.f62738p);
    }

    public String f() {
        return this.f62731i;
    }

    public String g() {
        return this.f62727e;
    }

    public String h() {
        return this.f62729g;
    }

    public int hashCode() {
        return (((((((((((Objects.hashCode(this.f62725c) ^ Objects.hashCode(this.f62726d)) ^ Objects.hashCode(this.f62727e)) ^ Objects.hashCode(this.f62728f)) ^ Objects.hashCode(this.f62730h)) ^ Objects.hashCode(this.f62731i)) ^ Objects.hashCode(this.f62732j)) ^ Objects.hashCode(this.f62733k)) ^ Objects.hashCode(this.f62734l)) ^ Objects.hashCode(this.f62735m)) ^ Objects.hashCode(this.f62736n)) ^ Objects.hashCode(this.f62737o)) ^ Objects.hashCode(this.f62738p);
    }

    public String i() {
        return this.f62735m;
    }

    public String j() {
        return this.f62737o;
    }

    public String k() {
        return this.f62736n;
    }

    public String l() {
        return this.f62725c;
    }

    public String m() {
        return this.f62728f;
    }

    public String n() {
        return this.f62724b;
    }

    public String o() {
        return this.f62726d;
    }

    public Map<String, String> p() {
        return this.f62738p;
    }

    public String q() {
        return this.f62732j;
    }

    public String r() {
        return this.f62734l;
    }

    public String s() {
        return this.f62733k;
    }
}
