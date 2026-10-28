package com.google.zxing.common;

import java.util.List;

/* compiled from: DecoderResult.java */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f62770a;

    /* renamed from: b, reason: collision with root package name */
    private int f62771b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62772c;

    /* renamed from: d, reason: collision with root package name */
    private final List<byte[]> f62773d;

    /* renamed from: e, reason: collision with root package name */
    private final String f62774e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f62775f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f62776g;

    /* renamed from: h, reason: collision with root package name */
    private Object f62777h;

    /* renamed from: i, reason: collision with root package name */
    private final int f62778i;

    /* renamed from: j, reason: collision with root package name */
    private final int f62779j;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.f62773d;
    }

    public String b() {
        return this.f62774e;
    }

    public Integer c() {
        return this.f62776g;
    }

    public Integer d() {
        return this.f62775f;
    }

    public int e() {
        return this.f62771b;
    }

    public Object f() {
        return this.f62777h;
    }

    public byte[] g() {
        return this.f62770a;
    }

    public int h() {
        return this.f62778i;
    }

    public int i() {
        return this.f62779j;
    }

    public String j() {
        return this.f62772c;
    }

    public boolean k() {
        return this.f62778i >= 0 && this.f62779j >= 0;
    }

    public void l(Integer num) {
        this.f62776g = num;
    }

    public void m(Integer num) {
        this.f62775f = num;
    }

    public void n(int i4) {
        this.f62771b = i4;
    }

    public void o(Object obj) {
        this.f62777h = obj;
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i4, int i5) {
        this.f62770a = bArr;
        this.f62771b = bArr == null ? 0 : bArr.length * 8;
        this.f62772c = str;
        this.f62773d = list;
        this.f62774e = str2;
        this.f62778i = i5;
        this.f62779j = i4;
    }
}
