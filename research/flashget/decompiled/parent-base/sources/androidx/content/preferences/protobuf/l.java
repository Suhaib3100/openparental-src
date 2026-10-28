package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.t4;
import com.google.common.base.c;
import java.io.IOException;

/* compiled from: ArrayDecoders.java */
/* loaded from: classes3.dex */
final class l {

    /* compiled from: ArrayDecoders.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28727a;

        static {
            int[] iArr = new int[t4.b.values().length];
            f28727a = iArr;
            try {
                iArr[t4.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28727a[t4.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28727a[t4.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28727a[t4.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28727a[t4.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28727a[t4.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28727a[t4.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28727a[t4.b.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28727a[t4.b.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28727a[t4.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28727a[t4.b.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28727a[t4.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28727a[t4.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28727a[t4.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28727a[t4.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28727a[t4.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28727a[t4.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28727a[t4.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    l() {
    }

    static int A(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i5, bVar);
        n1Var.o2(z.b(bVar.f28728a));
        while (I < i6) {
            int I2 = I(bArr, I, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            I = I(bArr, I2, bVar);
            n1Var.o2(z.b(bVar.f28728a));
        }
        return I;
    }

    static int B(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) {
        z1 z1Var = (z1) kVar;
        int L = L(bArr, i5, bVar);
        z1Var.D2(z.c(bVar.f28729b));
        while (L < i6) {
            int I = I(bArr, L, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            L = L(bArr, I, bVar);
            z1Var.D2(z.c(bVar.f28729b));
        }
        return L;
    }

    static int C(byte[] bArr, int i4, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i5 == 0) {
            bVar.f28730c = "";
            return I;
        }
        bVar.f28730c = new String(bArr, I, i5, p1.f28847a);
        return I + i5;
    }

    static int D(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i5, bVar);
        int i7 = bVar.f28728a;
        if (i7 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i7 == 0) {
            kVar.add("");
        } else {
            kVar.add(new String(bArr, I, i7, p1.f28847a));
            I += i7;
        }
        while (I < i6) {
            int I2 = I(bArr, I, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i10 = bVar.f28728a;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i10 == 0) {
                kVar.add("");
            } else {
                kVar.add(new String(bArr, I, i10, p1.f28847a));
                I += i10;
            }
        }
        return I;
    }

    static int E(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i5, bVar);
        int i7 = bVar.f28728a;
        if (i7 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i7 == 0) {
            kVar.add("");
        } else {
            int i10 = I + i7;
            if (!q4.u(bArr, I, i10)) {
                throw InvalidProtocolBufferException.d();
            }
            kVar.add(new String(bArr, I, i7, p1.f28847a));
            I = i10;
        }
        while (I < i6) {
            int I2 = I(bArr, I, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i11 = bVar.f28728a;
            if (i11 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i11 == 0) {
                kVar.add("");
            } else {
                int i12 = I + i11;
                if (!q4.u(bArr, I, i12)) {
                    throw InvalidProtocolBufferException.d();
                }
                kVar.add(new String(bArr, I, i11, p1.f28847a));
                I = i12;
            }
        }
        return I;
    }

    static int F(byte[] bArr, int i4, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i5 == 0) {
            bVar.f28730c = "";
            return I;
        }
        bVar.f28730c = q4.h(bArr, I, i5);
        return I + i5;
    }

    static int G(int i4, byte[] bArr, int i5, int i6, m4 m4Var, b bVar) throws InvalidProtocolBufferException {
        if (t4.a(i4) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int L = L(bArr, i5, bVar);
            m4Var.r(i4, Long.valueOf(bVar.f28729b));
            return L;
        }
        if (i7 == 1) {
            m4Var.r(i4, Long.valueOf(j(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int I = I(bArr, i5, bVar);
            int i10 = bVar.f28728a;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i10 > bArr.length - I) {
                throw InvalidProtocolBufferException.l();
            }
            if (i10 == 0) {
                m4Var.r(i4, w.f28998f);
            } else {
                m4Var.r(i4, w.x(bArr, I, i10));
            }
            return I + i10;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            m4Var.r(i4, Integer.valueOf(h(bArr, i5)));
            return i5 + 4;
        }
        m4 p4 = m4.p();
        int i11 = (i4 & (-8)) | 4;
        int i12 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int I2 = I(bArr, i5, bVar);
            int i13 = bVar.f28728a;
            if (i13 == i11) {
                i12 = i13;
                i5 = I2;
                break;
            }
            i12 = i13;
            i5 = G(i13, bArr, I2, i6, p4, bVar);
        }
        if (i5 > i6 || i12 != i11) {
            throw InvalidProtocolBufferException.h();
        }
        m4Var.r(i4, p4);
        return i5;
    }

    static int H(int i4, byte[] bArr, int i5, b bVar) {
        int i6 = i4 & 127;
        int i7 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 >= 0) {
            bVar.f28728a = i6 | (b5 << 7);
            return i7;
        }
        int i10 = i6 | ((b5 & Byte.MAX_VALUE) << 7);
        int i11 = i5 + 2;
        byte b6 = bArr[i7];
        if (b6 >= 0) {
            bVar.f28728a = i10 | (b6 << 14);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 14);
        int i13 = i5 + 3;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            bVar.f28728a = i12 | (b7 << c.f54879y);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 21);
        int i15 = i5 + 4;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            bVar.f28728a = i14 | (b10 << c.F);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                bVar.f28728a = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    static int I(byte[] bArr, int i4, b bVar) {
        int i5 = i4 + 1;
        byte b5 = bArr[i4];
        if (b5 < 0) {
            return H(b5, bArr, i5, bVar);
        }
        bVar.f28728a = b5;
        return i5;
    }

    static int J(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i5, bVar);
        n1Var.o2(bVar.f28728a);
        while (I < i6) {
            int I2 = I(bArr, I, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            I = I(bArr, I2, bVar);
            n1Var.o2(bVar.f28728a);
        }
        return I;
    }

    static int K(long j4, byte[] bArr, int i4, b bVar) {
        int i5 = i4 + 1;
        byte b5 = bArr[i4];
        long j5 = (j4 & 127) | ((b5 & Byte.MAX_VALUE) << 7);
        int i6 = 7;
        while (b5 < 0) {
            int i7 = i5 + 1;
            byte b6 = bArr[i5];
            i6 += 7;
            j5 |= (b6 & Byte.MAX_VALUE) << i6;
            i5 = i7;
            b5 = b6;
        }
        bVar.f28729b = j5;
        return i5;
    }

    static int L(byte[] bArr, int i4, b bVar) {
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        if (j4 < 0) {
            return K(j4, bArr, i5, bVar);
        }
        bVar.f28729b = j4;
        return i5;
    }

    static int M(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) {
        z1 z1Var = (z1) kVar;
        int L = L(bArr, i5, bVar);
        z1Var.D2(bVar.f28729b);
        while (L < i6) {
            int I = I(bArr, L, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            L = L(bArr, I, bVar);
            z1Var.D2(bVar.f28729b);
        }
        return L;
    }

    static int N(int i4, byte[] bArr, int i5, int i6, b bVar) throws InvalidProtocolBufferException {
        if (t4.a(i4) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            return L(bArr, i5, bVar);
        }
        if (i7 == 1) {
            return i5 + 8;
        }
        if (i7 == 2) {
            return I(bArr, i5, bVar) + bVar.f28728a;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i5 + 4;
            }
            throw InvalidProtocolBufferException.c();
        }
        int i10 = (i4 & (-8)) | 4;
        int i11 = 0;
        while (i5 < i6) {
            i5 = I(bArr, i5, bVar);
            i11 = bVar.f28728a;
            if (i11 == i10) {
                break;
            }
            i5 = N(i11, bArr, i5, i6, bVar);
        }
        if (i5 > i6 || i11 != i10) {
            throw InvalidProtocolBufferException.h();
        }
        return i5;
    }

    static int a(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) {
        s sVar = (s) kVar;
        int L = L(bArr, i5, bVar);
        sVar.N0(bVar.f28729b != 0);
        while (L < i6) {
            int I = I(bArr, L, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            L = L(bArr, I, bVar);
            sVar.N0(bVar.f28729b != 0);
        }
        return L;
    }

    static int b(byte[] bArr, int i4, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i5 > bArr.length - I) {
            throw InvalidProtocolBufferException.l();
        }
        if (i5 == 0) {
            bVar.f28730c = w.f28998f;
            return I;
        }
        bVar.f28730c = w.x(bArr, I, i5);
        return I + i5;
    }

    static int c(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i5, bVar);
        int i7 = bVar.f28728a;
        if (i7 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i7 > bArr.length - I) {
            throw InvalidProtocolBufferException.l();
        }
        if (i7 == 0) {
            kVar.add(w.f28998f);
        } else {
            kVar.add(w.x(bArr, I, i7));
            I += i7;
        }
        while (I < i6) {
            int I2 = I(bArr, I, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i10 = bVar.f28728a;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i10 > bArr.length - I) {
                throw InvalidProtocolBufferException.l();
            }
            if (i10 == 0) {
                kVar.add(w.f28998f);
            } else {
                kVar.add(w.x(bArr, I, i10));
                I += i10;
            }
        }
        return I;
    }

    static double d(byte[] bArr, int i4) {
        return Double.longBitsToDouble(j(bArr, i4));
    }

    static int e(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) {
        c0 c0Var = (c0) kVar;
        c0Var.V2(d(bArr, i5));
        int i7 = i5 + 8;
        while (i7 < i6) {
            int I = I(bArr, i7, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            c0Var.V2(d(bArr, I));
            i7 = I + 8;
        }
        return i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int f(int i4, byte[] bArr, int i5, int i6, i1.e<?, ?> eVar, i1.h<?, ?> hVar, l4<m4, m4> l4Var, b bVar) throws IOException {
        Object u4;
        c1<i1.g> c1Var = eVar.extensions;
        int i7 = i4 >>> 3;
        i1.g gVar = hVar.f28710d;
        if (gVar.f28705e && gVar.f28706f) {
            switch (a.f28727a[hVar.b().ordinal()]) {
                case 1:
                    c0 c0Var = new c0();
                    int s4 = s(bArr, i5, c0Var, bVar);
                    c1Var.O(hVar.f28710d, c0Var);
                    return s4;
                case 2:
                    e1 e1Var = new e1();
                    int v4 = v(bArr, i5, e1Var, bVar);
                    c1Var.O(hVar.f28710d, e1Var);
                    return v4;
                case 3:
                case 4:
                    z1 z1Var = new z1();
                    int z4 = z(bArr, i5, z1Var, bVar);
                    c1Var.O(hVar.f28710d, z1Var);
                    return z4;
                case 5:
                case 6:
                    n1 n1Var = new n1();
                    int y4 = y(bArr, i5, n1Var, bVar);
                    c1Var.O(hVar.f28710d, n1Var);
                    return y4;
                case 7:
                case 8:
                    z1 z1Var2 = new z1();
                    int u5 = u(bArr, i5, z1Var2, bVar);
                    c1Var.O(hVar.f28710d, z1Var2);
                    return u5;
                case 9:
                case 10:
                    n1 n1Var2 = new n1();
                    int t4 = t(bArr, i5, n1Var2, bVar);
                    c1Var.O(hVar.f28710d, n1Var2);
                    return t4;
                case 11:
                    s sVar = new s();
                    int r4 = r(bArr, i5, sVar, bVar);
                    c1Var.O(hVar.f28710d, sVar);
                    return r4;
                case 12:
                    n1 n1Var3 = new n1();
                    int w4 = w(bArr, i5, n1Var3, bVar);
                    c1Var.O(hVar.f28710d, n1Var3);
                    return w4;
                case 13:
                    z1 z1Var3 = new z1();
                    int x4 = x(bArr, i5, z1Var3, bVar);
                    c1Var.O(hVar.f28710d, z1Var3);
                    return x4;
                case 14:
                    n1 n1Var4 = new n1();
                    int y5 = y(bArr, i5, n1Var4, bVar);
                    m4 m4Var = eVar.unknownFields;
                    m4 m4Var2 = (m4) o3.B(i7, n1Var4, hVar.f28710d.f28702b, m4Var != m4.e() ? m4Var : null, l4Var);
                    if (m4Var2 != null) {
                        eVar.unknownFields = m4Var2;
                    }
                    c1Var.O(hVar.f28710d, n1Var4);
                    return y5;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hVar.f28710d.f28704d);
            }
        }
        if (hVar.b() != t4.b.ENUM) {
            switch (a.f28727a[hVar.b().ordinal()]) {
                case 1:
                    r3 = Double.valueOf(d(bArr, i5));
                    i5 += 8;
                    break;
                case 2:
                    r3 = Float.valueOf(l(bArr, i5));
                    i5 += 4;
                    break;
                case 3:
                case 4:
                    i5 = L(bArr, i5, bVar);
                    r3 = Long.valueOf(bVar.f28729b);
                    break;
                case 5:
                case 6:
                    i5 = I(bArr, i5, bVar);
                    r3 = Integer.valueOf(bVar.f28728a);
                    break;
                case 7:
                case 8:
                    r3 = Long.valueOf(j(bArr, i5));
                    i5 += 8;
                    break;
                case 9:
                case 10:
                    r3 = Integer.valueOf(h(bArr, i5));
                    i5 += 4;
                    break;
                case 11:
                    i5 = L(bArr, i5, bVar);
                    r3 = Boolean.valueOf(bVar.f28729b != 0);
                    break;
                case 12:
                    i5 = I(bArr, i5, bVar);
                    r3 = Integer.valueOf(z.b(bVar.f28728a));
                    break;
                case 13:
                    i5 = L(bArr, i5, bVar);
                    r3 = Long.valueOf(z.c(bVar.f28729b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i5 = b(bArr, i5, bVar);
                    r3 = bVar.f28730c;
                    break;
                case 16:
                    i5 = C(bArr, i5, bVar);
                    r3 = bVar.f28730c;
                    break;
                case 17:
                    i5 = n(f3.a().i(hVar.c().getClass()), bArr, i5, i6, (i7 << 3) | 4, bVar);
                    r3 = bVar.f28730c;
                    break;
                case 18:
                    i5 = p(f3.a().i(hVar.c().getClass()), bArr, i5, i6, bVar);
                    r3 = bVar.f28730c;
                    break;
            }
        } else {
            i5 = I(bArr, i5, bVar);
            if (hVar.f28710d.f28702b.a(bVar.f28728a) == null) {
                m4 m4Var3 = eVar.unknownFields;
                if (m4Var3 == m4.e()) {
                    m4Var3 = m4.p();
                    eVar.unknownFields = m4Var3;
                }
                o3.Q(i7, bVar.f28728a, m4Var3, l4Var);
                return i5;
            }
            r3 = Integer.valueOf(bVar.f28728a);
        }
        if (hVar.f()) {
            c1Var.h(hVar.f28710d, r3);
        } else {
            int i10 = a.f28727a[hVar.b().ordinal()];
            if ((i10 == 17 || i10 == 18) && (u4 = c1Var.u(hVar.f28710d)) != null) {
                r3 = p1.v(u4, r3);
            }
            c1Var.O(hVar.f28710d, r3);
        }
        return i5;
    }

    static int g(int i4, byte[] bArr, int i5, int i6, Object obj, i2 i2Var, l4<m4, m4> l4Var, b bVar) throws IOException {
        i1.h c5 = bVar.f28731d.c(i2Var, i4 >>> 3);
        if (c5 == null) {
            return G(i4, bArr, i5, i6, n2.w(obj), bVar);
        }
        i1.e eVar = (i1.e) obj;
        eVar.J2();
        return f(i4, bArr, i5, i6, eVar, c5, l4Var, bVar);
    }

    static int h(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    static int i(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) {
        n1 n1Var = (n1) kVar;
        n1Var.o2(h(bArr, i5));
        int i7 = i5 + 4;
        while (i7 < i6) {
            int I = I(bArr, i7, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            n1Var.o2(h(bArr, I));
            i7 = I + 4;
        }
        return i7;
    }

    static long j(byte[] bArr, int i4) {
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    static int k(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) {
        z1 z1Var = (z1) kVar;
        z1Var.D2(j(bArr, i5));
        int i7 = i5 + 8;
        while (i7 < i6) {
            int I = I(bArr, i7, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            z1Var.D2(j(bArr, I));
            i7 = I + 8;
        }
        return i7;
    }

    static float l(byte[] bArr, int i4) {
        return Float.intBitsToFloat(h(bArr, i4));
    }

    static int m(int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) {
        e1 e1Var = (e1) kVar;
        e1Var.Y(l(bArr, i5));
        int i7 = i5 + 4;
        while (i7 < i6) {
            int I = I(bArr, i7, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            e1Var.Y(l(bArr, I));
            i7 = I + 4;
        }
        return i7;
    }

    static int n(m3 m3Var, byte[] bArr, int i4, int i5, int i6, b bVar) throws IOException {
        n2 n2Var = (n2) m3Var;
        Object f4 = n2Var.f();
        int e02 = n2Var.e0(f4, bArr, i4, i5, i6, bVar);
        n2Var.c(f4);
        bVar.f28730c = f4;
        return e02;
    }

    static int o(m3 m3Var, int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) throws IOException {
        int i7 = (i4 & (-8)) | 4;
        int n4 = n(m3Var, bArr, i5, i6, i7, bVar);
        kVar.add(bVar.f28730c);
        while (n4 < i6) {
            int I = I(bArr, n4, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            n4 = n(m3Var, bArr, I, i6, i7, bVar);
            kVar.add(bVar.f28730c);
        }
        return n4;
    }

    static int p(m3 m3Var, byte[] bArr, int i4, int i5, b bVar) throws IOException {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = H(i7, bArr, i6, bVar);
            i7 = bVar.f28728a;
        }
        int i10 = i6;
        if (i7 < 0 || i7 > i5 - i10) {
            throw InvalidProtocolBufferException.l();
        }
        Object f4 = m3Var.f();
        int i11 = i7 + i10;
        m3Var.j(f4, bArr, i10, i11, bVar);
        m3Var.c(f4);
        bVar.f28730c = f4;
        return i11;
    }

    static int q(m3<?> m3Var, int i4, byte[] bArr, int i5, int i6, p1.k<?> kVar, b bVar) throws IOException {
        int p4 = p(m3Var, bArr, i5, i6, bVar);
        kVar.add(bVar.f28730c);
        while (p4 < i6) {
            int I = I(bArr, p4, bVar);
            if (i4 != bVar.f28728a) {
                break;
            }
            p4 = p(m3Var, bArr, I, i6, bVar);
            kVar.add(bVar.f28730c);
        }
        return p4;
    }

    static int r(byte[] bArr, int i4, p1.k<?> kVar, b bVar) throws IOException {
        s sVar = (s) kVar;
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a + I;
        while (I < i5) {
            I = L(bArr, I, bVar);
            sVar.N0(bVar.f28729b != 0);
        }
        if (I == i5) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int s(byte[] bArr, int i4, p1.k<?> kVar, b bVar) throws IOException {
        c0 c0Var = (c0) kVar;
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a + I;
        while (I < i5) {
            c0Var.V2(d(bArr, I));
            I += 8;
        }
        if (I == i5) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int t(byte[] bArr, int i4, p1.k<?> kVar, b bVar) throws IOException {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a + I;
        while (I < i5) {
            n1Var.o2(h(bArr, I));
            I += 4;
        }
        if (I == i5) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int u(byte[] bArr, int i4, p1.k<?> kVar, b bVar) throws IOException {
        z1 z1Var = (z1) kVar;
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a + I;
        while (I < i5) {
            z1Var.D2(j(bArr, I));
            I += 8;
        }
        if (I == i5) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int v(byte[] bArr, int i4, p1.k<?> kVar, b bVar) throws IOException {
        e1 e1Var = (e1) kVar;
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a + I;
        while (I < i5) {
            e1Var.Y(l(bArr, I));
            I += 4;
        }
        if (I == i5) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int w(byte[] bArr, int i4, p1.k<?> kVar, b bVar) throws IOException {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a + I;
        while (I < i5) {
            I = I(bArr, I, bVar);
            n1Var.o2(z.b(bVar.f28728a));
        }
        if (I == i5) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int x(byte[] bArr, int i4, p1.k<?> kVar, b bVar) throws IOException {
        z1 z1Var = (z1) kVar;
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a + I;
        while (I < i5) {
            I = L(bArr, I, bVar);
            z1Var.D2(z.c(bVar.f28729b));
        }
        if (I == i5) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int y(byte[] bArr, int i4, p1.k<?> kVar, b bVar) throws IOException {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a + I;
        while (I < i5) {
            I = I(bArr, I, bVar);
            n1Var.o2(bVar.f28728a);
        }
        if (I == i5) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int z(byte[] bArr, int i4, p1.k<?> kVar, b bVar) throws IOException {
        z1 z1Var = (z1) kVar;
        int I = I(bArr, i4, bVar);
        int i5 = bVar.f28728a + I;
        while (I < i5) {
            I = L(bArr, I, bVar);
            z1Var.D2(bVar.f28729b);
        }
        if (I == i5) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    /* compiled from: ArrayDecoders.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f28728a;

        /* renamed from: b, reason: collision with root package name */
        public long f28729b;

        /* renamed from: c, reason: collision with root package name */
        public Object f28730c;

        /* renamed from: d, reason: collision with root package name */
        public final s0 f28731d;

        b() {
            this.f28731d = s0.d();
        }

        b(s0 s0Var) {
            s0Var.getClass();
            this.f28731d = s0Var;
        }
    }
}
