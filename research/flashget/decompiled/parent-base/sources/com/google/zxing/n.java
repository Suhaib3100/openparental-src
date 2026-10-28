package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: Result.java */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final String f62961a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f62962b;

    /* renamed from: c, reason: collision with root package name */
    private final int f62963c;

    /* renamed from: d, reason: collision with root package name */
    private p[] f62964d;

    /* renamed from: e, reason: collision with root package name */
    private final a f62965e;

    /* renamed from: f, reason: collision with root package name */
    private Map<o, Object> f62966f;

    /* renamed from: g, reason: collision with root package name */
    private final long f62967g;

    public n(String str, byte[] bArr, p[] pVarArr, a aVar) {
        this(str, bArr, pVarArr, aVar, System.currentTimeMillis());
    }

    public void a(p[] pVarArr) {
        p[] pVarArr2 = this.f62964d;
        if (pVarArr2 == null) {
            this.f62964d = pVarArr;
            return;
        }
        if (pVarArr == null || pVarArr.length <= 0) {
            return;
        }
        p[] pVarArr3 = new p[pVarArr2.length + pVarArr.length];
        System.arraycopy(pVarArr2, 0, pVarArr3, 0, pVarArr2.length);
        System.arraycopy(pVarArr, 0, pVarArr3, pVarArr2.length, pVarArr.length);
        this.f62964d = pVarArr3;
    }

    public a b() {
        return this.f62965e;
    }

    public int c() {
        return this.f62963c;
    }

    public byte[] d() {
        return this.f62962b;
    }

    public Map<o, Object> e() {
        return this.f62966f;
    }

    public p[] f() {
        return this.f62964d;
    }

    public String g() {
        return this.f62961a;
    }

    public long h() {
        return this.f62967g;
    }

    public void i(Map<o, Object> map) {
        if (map != null) {
            Map<o, Object> map2 = this.f62966f;
            if (map2 == null) {
                this.f62966f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void j(o oVar, Object obj) {
        if (this.f62966f == null) {
            this.f62966f = new EnumMap(o.class);
        }
        this.f62966f.put(oVar, obj);
    }

    public String toString() {
        return this.f62961a;
    }

    public n(String str, byte[] bArr, p[] pVarArr, a aVar, long j4) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, pVarArr, aVar, j4);
    }

    public n(String str, byte[] bArr, int i4, p[] pVarArr, a aVar, long j4) {
        this.f62961a = str;
        this.f62962b = bArr;
        this.f62963c = i4;
        this.f62964d = pVarArr;
        this.f62965e = aVar;
        this.f62966f = null;
        this.f62967g = j4;
    }
}
