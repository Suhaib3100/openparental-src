package net.minidev.json.parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: JSONParser.java */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: f, reason: collision with root package name */
    public static final int f81752f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f81753g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f81754h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f81755i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f81756j = 16;

    /* renamed from: k, reason: collision with root package name */
    public static final int f81757k = 32;

    /* renamed from: l, reason: collision with root package name */
    public static final int f81758l = 64;

    /* renamed from: m, reason: collision with root package name */
    public static final int f81759m = 128;

    /* renamed from: n, reason: collision with root package name */
    public static final int f81760n = 256;

    /* renamed from: o, reason: collision with root package name */
    public static final int f81761o = -1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f81762p = 400;

    /* renamed from: q, reason: collision with root package name */
    public static final int f81763q = 448;

    /* renamed from: r, reason: collision with root package name */
    public static final int f81764r = 144;

    /* renamed from: s, reason: collision with root package name */
    public static int f81765s;

    /* renamed from: a, reason: collision with root package name */
    private int f81766a;

    /* renamed from: b, reason: collision with root package name */
    private k f81767b;

    /* renamed from: c, reason: collision with root package name */
    private i f81768c;

    /* renamed from: d, reason: collision with root package name */
    private m f81769d;

    /* renamed from: e, reason: collision with root package name */
    private h f81770e;

    static {
        f81765s = System.getProperty(ProtectedSandApp.s("襦\u0001")) != null ? f81763q : -1;
    }

    public f() {
        this.f81766a = f81765s;
    }

    public Object a(InputStream inputStream) throws ParseException {
        if (this.f81768c == null) {
            this.f81768c = new i(this.f81766a);
        }
        return this.f81768c.t(inputStream);
    }

    public Object b(InputStream inputStream, a aVar) throws ParseException {
        if (this.f81768c == null) {
            this.f81768c = new i(this.f81766a);
        }
        return this.f81768c.u(inputStream, aVar);
    }

    public Object c(InputStream inputStream, a aVar, b bVar) throws ParseException {
        if (this.f81768c == null) {
            this.f81768c = new i(this.f81766a);
        }
        return this.f81768c.u(inputStream, aVar);
    }

    public Object d(Reader reader) throws ParseException {
        if (this.f81767b == null) {
            this.f81767b = new k(this.f81766a);
        }
        return this.f81767b.t(reader);
    }

    public Object e(Reader reader, a aVar) throws ParseException {
        if (this.f81767b == null) {
            this.f81767b = new k(this.f81766a);
        }
        return this.f81767b.u(reader, aVar);
    }

    public Object f(Reader reader, a aVar, b bVar) throws ParseException {
        if (this.f81767b == null) {
            this.f81767b = new k(this.f81766a);
        }
        return this.f81767b.u(reader, aVar);
    }

    public Object g(String str) throws ParseException {
        if (this.f81769d == null) {
            this.f81769d = new m(this.f81766a);
        }
        return this.f81769d.w(str);
    }

    public Object h(String str, a aVar) throws ParseException {
        if (this.f81769d == null) {
            this.f81769d = new m(this.f81766a);
        }
        return this.f81769d.x(str, aVar);
    }

    public Object i(String str, a aVar, b bVar) throws ParseException {
        if (this.f81769d == null) {
            this.f81769d = new m(this.f81766a);
        }
        return this.f81769d.y(str, aVar, bVar);
    }

    public Object j(byte[] bArr) throws ParseException {
        if (this.f81770e == null) {
            this.f81770e = new h(this.f81766a);
        }
        return this.f81770e.w(bArr);
    }

    public Object k(byte[] bArr, a aVar) throws ParseException {
        if (this.f81770e == null) {
            this.f81770e = new h(this.f81766a);
        }
        return this.f81770e.x(bArr, aVar);
    }

    public Object l(byte[] bArr, a aVar, b bVar) throws ParseException {
        if (this.f81770e == null) {
            this.f81770e = new h(this.f81766a);
        }
        return this.f81770e.y(bArr, aVar, bVar);
    }

    public f(int i4) {
        this.f81766a = i4;
    }
}
