package com.googlecode.mp4parser.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.nio.ByteBuffer;

/* compiled from: Matrix.java */
/* loaded from: classes6.dex */
public class k {

    /* renamed from: j, reason: collision with root package name */
    public static final k f64099j = new k(1.0d, p.f60679p, p.f60679p, 1.0d, p.f60679p, p.f60679p, 1.0d, p.f60679p, p.f60679p);

    /* renamed from: k, reason: collision with root package name */
    public static final k f64100k = new k(p.f60679p, 1.0d, -1.0d, p.f60679p, p.f60679p, p.f60679p, 1.0d, p.f60679p, p.f60679p);

    /* renamed from: l, reason: collision with root package name */
    public static final k f64101l = new k(-1.0d, p.f60679p, p.f60679p, -1.0d, p.f60679p, p.f60679p, 1.0d, p.f60679p, p.f60679p);

    /* renamed from: m, reason: collision with root package name */
    public static final k f64102m = new k(p.f60679p, -1.0d, 1.0d, p.f60679p, p.f60679p, p.f60679p, 1.0d, p.f60679p, p.f60679p);

    /* renamed from: a, reason: collision with root package name */
    double f64103a;

    /* renamed from: b, reason: collision with root package name */
    double f64104b;

    /* renamed from: c, reason: collision with root package name */
    double f64105c;

    /* renamed from: d, reason: collision with root package name */
    double f64106d;

    /* renamed from: e, reason: collision with root package name */
    double f64107e;

    /* renamed from: f, reason: collision with root package name */
    double f64108f;

    /* renamed from: g, reason: collision with root package name */
    double f64109g;

    /* renamed from: h, reason: collision with root package name */
    double f64110h;

    /* renamed from: i, reason: collision with root package name */
    double f64111i;

    public k(double d5, double d6, double d7, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f64103a = d11;
        this.f64104b = d12;
        this.f64105c = d13;
        this.f64106d = d5;
        this.f64107e = d6;
        this.f64108f = d7;
        this.f64109g = d10;
        this.f64110h = d14;
        this.f64111i = d15;
    }

    public static k a(ByteBuffer byteBuffer) {
        double d5 = com.coremedia.iso.g.d(byteBuffer);
        double d6 = com.coremedia.iso.g.d(byteBuffer);
        double c5 = com.coremedia.iso.g.c(byteBuffer);
        return new k(d5, d6, com.coremedia.iso.g.d(byteBuffer), com.coremedia.iso.g.d(byteBuffer), c5, com.coremedia.iso.g.c(byteBuffer), com.coremedia.iso.g.c(byteBuffer), com.coremedia.iso.g.d(byteBuffer), com.coremedia.iso.g.d(byteBuffer));
    }

    public static k b(double d5, double d6, double d7, double d10, double d11, double d12, double d13, double d14, double d15) {
        return new k(d5, d6, d10, d11, d7, d12, d15, d13, d14);
    }

    public void c(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.b(byteBuffer, this.f64106d);
        com.coremedia.iso.i.b(byteBuffer, this.f64107e);
        com.coremedia.iso.i.a(byteBuffer, this.f64103a);
        com.coremedia.iso.i.b(byteBuffer, this.f64108f);
        com.coremedia.iso.i.b(byteBuffer, this.f64109g);
        com.coremedia.iso.i.a(byteBuffer, this.f64104b);
        com.coremedia.iso.i.b(byteBuffer, this.f64110h);
        com.coremedia.iso.i.b(byteBuffer, this.f64111i);
        com.coremedia.iso.i.a(byteBuffer, this.f64105c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return Double.compare(kVar.f64106d, this.f64106d) == 0 && Double.compare(kVar.f64107e, this.f64107e) == 0 && Double.compare(kVar.f64108f, this.f64108f) == 0 && Double.compare(kVar.f64109g, this.f64109g) == 0 && Double.compare(kVar.f64110h, this.f64110h) == 0 && Double.compare(kVar.f64111i, this.f64111i) == 0 && Double.compare(kVar.f64103a, this.f64103a) == 0 && Double.compare(kVar.f64104b, this.f64104b) == 0 && Double.compare(kVar.f64105c, this.f64105c) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f64103a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f64104b);
        int i4 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f64105c);
        int i5 = (i4 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f64106d);
        int i6 = (i5 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.f64107e);
        int i7 = (i6 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.f64108f);
        int i10 = (i7 * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)));
        long doubleToLongBits7 = Double.doubleToLongBits(this.f64109g);
        int i11 = (i10 * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
        long doubleToLongBits8 = Double.doubleToLongBits(this.f64110h);
        int i12 = (i11 * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)));
        long doubleToLongBits9 = Double.doubleToLongBits(this.f64111i);
        return (i12 * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public String toString() {
        if (equals(f64099j)) {
            return ProtectedSandApp.s("ᑍ\u0001");
        }
        if (equals(f64100k)) {
            return ProtectedSandApp.s("ᑎ\u0001");
        }
        if (equals(f64101l)) {
            return ProtectedSandApp.s("ᑏ\u0001");
        }
        if (equals(f64102m)) {
            return ProtectedSandApp.s("ᑐ\u0001");
        }
        return ProtectedSandApp.s("ᑑ\u0001") + this.f64103a + ProtectedSandApp.s("ᑒ\u0001") + this.f64104b + ProtectedSandApp.s("ᑓ\u0001") + this.f64105c + ProtectedSandApp.s("ᑔ\u0001") + this.f64106d + ProtectedSandApp.s("ᑕ\u0001") + this.f64107e + ProtectedSandApp.s("ᑖ\u0001") + this.f64108f + ProtectedSandApp.s("ᑗ\u0001") + this.f64109g + ProtectedSandApp.s("ᑘ\u0001") + this.f64110h + ProtectedSandApp.s("ᑙ\u0001") + this.f64111i + '}';
    }
}
