package com.google.common.hash;

import com.android.internal.telephony.SmsConstants;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import com.google.common.base.m0;
import com.google.common.hash.h;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: BloomFilter.java */
@d9.a
@k
/* loaded from: classes6.dex */
public final class g<T> implements m0<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final h.c f56943b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56944c;

    /* renamed from: d, reason: collision with root package name */
    private final n<? super T> f56945d;

    /* renamed from: e, reason: collision with root package name */
    private final c f56946e;

    /* compiled from: BloomFilter.java */
    private static class b<T> implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        private static final long f56947f = 1;

        /* renamed from: b, reason: collision with root package name */
        final long[] f56948b;

        /* renamed from: c, reason: collision with root package name */
        final int f56949c;

        /* renamed from: d, reason: collision with root package name */
        final n<? super T> f56950d;

        /* renamed from: e, reason: collision with root package name */
        final c f56951e;

        b(g<T> gVar) {
            this.f56948b = h.c.i(((g) gVar).f56943b.f56953a);
            this.f56949c = ((g) gVar).f56944c;
            this.f56950d = ((g) gVar).f56945d;
            this.f56951e = ((g) gVar).f56946e;
        }

        Object a() {
            return new g(new h.c(this.f56948b), this.f56949c, this.f56950d, this.f56951e);
        }
    }

    /* compiled from: BloomFilter.java */
    interface c extends Serializable {
        <T> boolean mightContain(@f0 T t4, n<? super T> nVar, int i4, h.c cVar);

        int ordinal();

        <T> boolean put(@f0 T t4, n<? super T> nVar, int i4, h.c cVar);
    }

    public static <T> g<T> h(n<? super T> nVar, int i4) {
        return j(nVar, i4);
    }

    public static <T> g<T> i(n<? super T> nVar, int i4, double d5) {
        return l(nVar, i4, d5, h.MURMUR128_MITZ_64);
    }

    public static <T> g<T> j(n<? super T> nVar, long j4) {
        return l(nVar, j4, 0.03d, h.MURMUR128_MITZ_64);
    }

    public static <T> g<T> k(n<? super T> nVar, long j4, double d5) {
        return l(nVar, j4, d5, h.MURMUR128_MITZ_64);
    }

    @d9.d
    static <T> g<T> l(n<? super T> nVar, long j4, double d5, c cVar) {
        nVar.getClass();
        l0.p(j4 >= 0, ProtectedSandApp.s("\uf5f9"), j4);
        l0.u(d5 > com.google.firebase.remoteconfig.p.f60679p, ProtectedSandApp.s("\uf5fa"), Double.valueOf(d5));
        l0.u(d5 < 1.0d, ProtectedSandApp.s("\uf5fb"), Double.valueOf(d5));
        cVar.getClass();
        if (j4 == 0) {
            j4 = 1;
        }
        long p4 = p(j4, d5);
        try {
            return new g<>(new h.c(p4), q(j4, p4), nVar, cVar);
        } catch (IllegalArgumentException e4) {
            StringBuilder sb = new StringBuilder(57);
            sb.append(ProtectedSandApp.s("\uf5fc"));
            sb.append(p4);
            sb.append(ProtectedSandApp.s("\uf5fd"));
            throw new IllegalArgumentException(sb.toString(), e4);
        }
    }

    @d9.d
    static long p(long j4, double d5) {
        if (d5 == com.google.firebase.remoteconfig.p.f60679p) {
            d5 = Double.MIN_VALUE;
        }
        return (long) ((Math.log(d5) * (-j4)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @d9.d
    static int q(long j4, long j5) {
        return Math.max(1, (int) Math.round(Math.log(2.0d) * (j5 / j4)));
    }

    public static <T> g<T> t(InputStream inputStream, n<? super T> nVar) throws IOException {
        int i4;
        int i5;
        l0.F(inputStream, ProtectedSandApp.s("\uf5fe"));
        l0.F(nVar, ProtectedSandApp.s("\uf5ff"));
        int i6 = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte readByte = dataInputStream.readByte();
            try {
                i5 = dataInputStream.readByte() & 255;
                try {
                    i6 = dataInputStream.readInt();
                    h hVar = h.values()[readByte];
                    h.c cVar = new h.c(com.google.common.math.h.d(i6, 64L));
                    for (int i7 = 0; i7 < i6; i7++) {
                        cVar.g(i7, dataInputStream.readLong());
                    }
                    return new g<>(cVar, i5, nVar, hVar);
                } catch (RuntimeException e4) {
                    e = e4;
                    int i10 = i6;
                    i6 = readByte;
                    i4 = i10;
                    StringBuilder sb = new StringBuilder(SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER);
                    sb.append(ProtectedSandApp.s("\uf600"));
                    sb.append(i6);
                    sb.append(ProtectedSandApp.s("\uf601"));
                    sb.append(i5);
                    sb.append(ProtectedSandApp.s("\uf602"));
                    sb.append(i4);
                    throw new IOException(sb.toString(), e);
                }
            } catch (RuntimeException e5) {
                e = e5;
                i5 = -1;
                i6 = readByte;
                i4 = -1;
            }
        } catch (RuntimeException e6) {
            e = e6;
            i4 = -1;
            i5 = -1;
        }
    }

    private Object u() {
        return new b(this);
    }

    @Override // com.google.common.base.m0
    @Deprecated
    public boolean apply(@f0 T t4) {
        return o(t4);
    }

    public long e() {
        double b5 = this.f56943b.b();
        return com.google.common.math.c.q(((-Math.log1p(-(this.f56943b.a() / b5))) * b5) / this.f56944c, RoundingMode.HALF_UP);
    }

    @Override // com.google.common.base.m0
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f56944c == gVar.f56944c && this.f56945d.equals(gVar.f56945d) && this.f56943b.equals(gVar.f56943b) && this.f56946e.equals(gVar.f56946e);
    }

    @d9.d
    long f() {
        return this.f56943b.b();
    }

    public g<T> g() {
        return new g<>(this.f56943b.c(), this.f56944c, this.f56945d, this.f56946e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f56944c), this.f56945d, this.f56946e, this.f56943b});
    }

    public double m() {
        return Math.pow(this.f56943b.a() / this.f56943b.b(), this.f56944c);
    }

    public boolean n(g<T> gVar) {
        gVar.getClass();
        return this != gVar && this.f56944c == gVar.f56944c && this.f56943b.b() == gVar.f56943b.b() && this.f56946e.equals(gVar.f56946e) && this.f56945d.equals(gVar.f56945d);
    }

    public boolean o(@f0 T t4) {
        return this.f56946e.mightContain(t4, this.f56945d, this.f56944c, this.f56943b);
    }

    @f9.a
    public boolean r(@f0 T t4) {
        return this.f56946e.put(t4, this.f56945d, this.f56944c, this.f56943b);
    }

    public void s(g<T> gVar) {
        gVar.getClass();
        l0.e(this != gVar, ProtectedSandApp.s("\uf603"));
        int i4 = this.f56944c;
        int i5 = gVar.f56944c;
        l0.m(i4 == i5, ProtectedSandApp.s("\uf604"), i4, i5);
        l0.s(this.f56943b.b() == gVar.f56943b.b(), ProtectedSandApp.s("\uf605"), this.f56943b.b(), gVar.f56943b.b());
        l0.y(this.f56946e.equals(gVar.f56946e), ProtectedSandApp.s("\uf606"), this.f56946e, gVar.f56946e);
        l0.y(this.f56945d.equals(gVar.f56945d), ProtectedSandApp.s("\uf607"), this.f56945d, gVar.f56945d);
        this.f56943b.f(gVar.f56943b);
    }

    public void v(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(com.google.common.primitives.u.a(this.f56946e.ordinal()));
        dataOutputStream.writeByte(com.google.common.primitives.v.a(this.f56944c));
        dataOutputStream.writeInt(this.f56943b.f56953a.length());
        for (int i4 = 0; i4 < this.f56943b.f56953a.length(); i4++) {
            dataOutputStream.writeLong(this.f56943b.f56953a.get(i4));
        }
    }

    private g(h.c cVar, int i4, n<? super T> nVar, c cVar2) {
        l0.k(i4 > 0, ProtectedSandApp.s("\uf5f7"), i4);
        l0.k(i4 <= 255, ProtectedSandApp.s("\uf5f8"), i4);
        cVar.getClass();
        this.f56943b = cVar;
        this.f56944c = i4;
        nVar.getClass();
        this.f56945d = nVar;
        cVar2.getClass();
        this.f56946e = cVar2;
    }
}
