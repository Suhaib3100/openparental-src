package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.q4;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: ArrayDecoders.java */
/* loaded from: classes.dex */
final class l {

    /* compiled from: ArrayDecoders.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7316a;

        static {
            int[] iArr = new int[q4.b.values().length];
            f7316a = iArr;
            try {
                iArr[q4.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7316a[q4.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7316a[q4.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7316a[q4.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7316a[q4.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7316a[q4.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7316a[q4.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7316a[q4.b.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7316a[q4.b.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7316a[q4.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7316a[q4.b.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7316a[q4.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7316a[q4.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7316a[q4.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7316a[q4.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7316a[q4.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7316a[q4.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7316a[q4.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    l() {
    }

    static int A(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i6, bVar);
        n1Var.D(z.b(bVar.f7317a));
        while (I < i7) {
            int I2 = I(bArr, I, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            I = I(bArr, I2, bVar);
            n1Var.D(z.b(bVar.f7317a));
        }
        return I;
    }

    static int B(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) {
        y1 y1Var = (y1) kVar;
        int L = L(bArr, i6, bVar);
        y1Var.e0(z.c(bVar.f7318b));
        while (L < i7) {
            int I = I(bArr, L, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            L = L(bArr, I, bVar);
            y1Var.e0(z.c(bVar.f7318b));
        }
        return L;
    }

    static int C(byte[] bArr, int i5, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a;
        if (i6 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i6 == 0) {
            bVar.f7319c = "";
            return I;
        }
        bVar.f7319c = new String(bArr, I, i6, o1.f7439a);
        return I + i6;
    }

    static int D(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i6, bVar);
        int i8 = bVar.f7317a;
        if (i8 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i8 == 0) {
            kVar.add("");
        } else {
            kVar.add(new String(bArr, I, i8, o1.f7439a));
            I += i8;
        }
        while (I < i7) {
            int I2 = I(bArr, I, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i9 = bVar.f7317a;
            if (i9 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i9 == 0) {
                kVar.add("");
            } else {
                kVar.add(new String(bArr, I, i9, o1.f7439a));
                I += i9;
            }
        }
        return I;
    }

    static int E(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i6, bVar);
        int i8 = bVar.f7317a;
        if (i8 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i8 == 0) {
            kVar.add("");
        } else {
            int i9 = I + i8;
            if (!n4.u(bArr, I, i9)) {
                throw InvalidProtocolBufferException.d();
            }
            kVar.add(new String(bArr, I, i8, o1.f7439a));
            I = i9;
        }
        while (I < i7) {
            int I2 = I(bArr, I, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i10 = bVar.f7317a;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i10 == 0) {
                kVar.add("");
            } else {
                int i11 = I + i10;
                if (!n4.u(bArr, I, i11)) {
                    throw InvalidProtocolBufferException.d();
                }
                kVar.add(new String(bArr, I, i10, o1.f7439a));
                I = i11;
            }
        }
        return I;
    }

    static int F(byte[] bArr, int i5, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a;
        if (i6 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i6 == 0) {
            bVar.f7319c = "";
            return I;
        }
        bVar.f7319c = n4.h(bArr, I, i6);
        return I + i6;
    }

    static int G(int i5, byte[] bArr, int i6, int i7, j4 j4Var, b bVar) throws InvalidProtocolBufferException {
        if (q4.a(i5) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int i8 = i5 & 7;
        if (i8 == 0) {
            int L = L(bArr, i6, bVar);
            j4Var.r(i5, Long.valueOf(bVar.f7318b));
            return L;
        }
        if (i8 == 1) {
            j4Var.r(i5, Long.valueOf(j(bArr, i6)));
            return i6 + 8;
        }
        if (i8 == 2) {
            int I = I(bArr, i6, bVar);
            int i9 = bVar.f7317a;
            if (i9 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i9 > bArr.length - I) {
                throw InvalidProtocolBufferException.l();
            }
            if (i9 == 0) {
                j4Var.r(i5, w.f7553s);
            } else {
                j4Var.r(i5, w.y(bArr, I, i9));
            }
            return I + i9;
        }
        if (i8 != 3) {
            if (i8 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            j4Var.r(i5, Integer.valueOf(h(bArr, i6)));
            return i6 + 4;
        }
        j4 p5 = j4.p();
        int i10 = (i5 & (-8)) | 4;
        int i11 = 0;
        while (true) {
            if (i6 >= i7) {
                break;
            }
            int I2 = I(bArr, i6, bVar);
            int i12 = bVar.f7317a;
            if (i12 == i10) {
                i11 = i12;
                i6 = I2;
                break;
            }
            i11 = i12;
            i6 = G(i12, bArr, I2, i7, p5, bVar);
        }
        if (i6 > i7 || i11 != i10) {
            throw InvalidProtocolBufferException.h();
        }
        j4Var.r(i5, p5);
        return i6;
    }

    static int H(int i5, byte[] bArr, int i6, b bVar) {
        int i7 = i5 & 127;
        int i8 = i6 + 1;
        byte b6 = bArr[i6];
        if (b6 >= 0) {
            bVar.f7317a = i7 | (b6 << 7);
            return i8;
        }
        int i9 = i7 | ((b6 & ByteCompanionObject.f23585c) << 7);
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            bVar.f7317a = i9 | (b7 << 14);
            return i10;
        }
        int i11 = i9 | ((b7 & ByteCompanionObject.f23585c) << 14);
        int i12 = i10 + 1;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            bVar.f7317a = i11 | (b8 << 21);
            return i12;
        }
        int i13 = i11 | ((b8 & ByteCompanionObject.f23585c) << 21);
        int i14 = i12 + 1;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            bVar.f7317a = i13 | (b9 << 28);
            return i14;
        }
        int i15 = i13 | ((b9 & ByteCompanionObject.f23585c) << 28);
        while (true) {
            int i16 = i14 + 1;
            if (bArr[i14] >= 0) {
                bVar.f7317a = i15;
                return i16;
            }
            i14 = i16;
        }
    }

    static int I(byte[] bArr, int i5, b bVar) {
        int i6 = i5 + 1;
        byte b6 = bArr[i5];
        if (b6 < 0) {
            return H(b6, bArr, i6, bVar);
        }
        bVar.f7317a = b6;
        return i6;
    }

    static int J(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i6, bVar);
        n1Var.D(bVar.f7317a);
        while (I < i7) {
            int I2 = I(bArr, I, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            I = I(bArr, I2, bVar);
            n1Var.D(bVar.f7317a);
        }
        return I;
    }

    static int K(long j5, byte[] bArr, int i5, b bVar) {
        int i6 = i5 + 1;
        byte b6 = bArr[i5];
        long j6 = (j5 & 127) | ((b6 & ByteCompanionObject.f23585c) << 7);
        int i7 = 7;
        while (b6 < 0) {
            int i8 = i6 + 1;
            byte b7 = bArr[i6];
            i7 += 7;
            j6 |= (b7 & ByteCompanionObject.f23585c) << i7;
            i6 = i8;
            b6 = b7;
        }
        bVar.f7318b = j6;
        return i6;
    }

    static int L(byte[] bArr, int i5, b bVar) {
        int i6 = i5 + 1;
        long j5 = bArr[i5];
        if (j5 < 0) {
            return K(j5, bArr, i6, bVar);
        }
        bVar.f7318b = j5;
        return i6;
    }

    static int M(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) {
        y1 y1Var = (y1) kVar;
        int L = L(bArr, i6, bVar);
        y1Var.e0(bVar.f7318b);
        while (L < i7) {
            int I = I(bArr, L, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            L = L(bArr, I, bVar);
            y1Var.e0(bVar.f7318b);
        }
        return L;
    }

    static int N(int i5, byte[] bArr, int i6, int i7, b bVar) throws InvalidProtocolBufferException {
        if (q4.a(i5) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int i8 = i5 & 7;
        if (i8 == 0) {
            return L(bArr, i6, bVar);
        }
        if (i8 == 1) {
            return i6 + 8;
        }
        if (i8 == 2) {
            return I(bArr, i6, bVar) + bVar.f7317a;
        }
        if (i8 != 3) {
            if (i8 == 5) {
                return i6 + 4;
            }
            throw InvalidProtocolBufferException.c();
        }
        int i9 = (i5 & (-8)) | 4;
        int i10 = 0;
        while (i6 < i7) {
            i6 = I(bArr, i6, bVar);
            i10 = bVar.f7317a;
            if (i10 == i9) {
                break;
            }
            i6 = N(i10, bArr, i6, i7, bVar);
        }
        if (i6 > i7 || i10 != i9) {
            throw InvalidProtocolBufferException.h();
        }
        return i6;
    }

    static int a(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) {
        r rVar = (r) kVar;
        int L = L(bArr, i6, bVar);
        rVar.i0(bVar.f7318b != 0);
        while (L < i7) {
            int I = I(bArr, L, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            L = L(bArr, I, bVar);
            rVar.i0(bVar.f7318b != 0);
        }
        return L;
    }

    static int b(byte[] bArr, int i5, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a;
        if (i6 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i6 > bArr.length - I) {
            throw InvalidProtocolBufferException.l();
        }
        if (i6 == 0) {
            bVar.f7319c = w.f7553s;
            return I;
        }
        bVar.f7319c = w.y(bArr, I, i6);
        return I + i6;
    }

    static int c(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i6, bVar);
        int i8 = bVar.f7317a;
        if (i8 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i8 > bArr.length - I) {
            throw InvalidProtocolBufferException.l();
        }
        if (i8 == 0) {
            kVar.add(w.f7553s);
        } else {
            kVar.add(w.y(bArr, I, i8));
            I += i8;
        }
        while (I < i7) {
            int I2 = I(bArr, I, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i9 = bVar.f7317a;
            if (i9 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i9 > bArr.length - I) {
                throw InvalidProtocolBufferException.l();
            }
            if (i9 == 0) {
                kVar.add(w.f7553s);
            } else {
                kVar.add(w.y(bArr, I, i9));
                I += i9;
            }
        }
        return I;
    }

    static double d(byte[] bArr, int i5) {
        return Double.longBitsToDouble(j(bArr, i5));
    }

    static int e(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) {
        c0 c0Var = (c0) kVar;
        c0Var.o0(d(bArr, i6));
        int i8 = i6 + 8;
        while (i8 < i7) {
            int I = I(bArr, i8, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            c0Var.o0(d(bArr, I));
            i8 = I + 8;
        }
        return i8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int f(int i5, byte[] bArr, int i6, int i7, i1.e<?, ?> eVar, i1.h<?, ?> hVar, i4<j4, j4> i4Var, b bVar) throws IOException {
        Object u5;
        c1<i1.g> c1Var = eVar.extensions;
        int i8 = i5 >>> 3;
        i1.g gVar = hVar.f7255d;
        if (gVar.f7250r && gVar.f7251s) {
            switch (a.f7316a[hVar.b().ordinal()]) {
                case 1:
                    c0 c0Var = new c0();
                    int s5 = s(bArr, i6, c0Var, bVar);
                    c1Var.O(hVar.f7255d, c0Var);
                    return s5;
                case 2:
                    e1 e1Var = new e1();
                    int v5 = v(bArr, i6, e1Var, bVar);
                    c1Var.O(hVar.f7255d, e1Var);
                    return v5;
                case 3:
                case 4:
                    y1 y1Var = new y1();
                    int z5 = z(bArr, i6, y1Var, bVar);
                    c1Var.O(hVar.f7255d, y1Var);
                    return z5;
                case 5:
                case 6:
                    n1 n1Var = new n1();
                    int y5 = y(bArr, i6, n1Var, bVar);
                    c1Var.O(hVar.f7255d, n1Var);
                    return y5;
                case 7:
                case 8:
                    y1 y1Var2 = new y1();
                    int u6 = u(bArr, i6, y1Var2, bVar);
                    c1Var.O(hVar.f7255d, y1Var2);
                    return u6;
                case 9:
                case 10:
                    n1 n1Var2 = new n1();
                    int t5 = t(bArr, i6, n1Var2, bVar);
                    c1Var.O(hVar.f7255d, n1Var2);
                    return t5;
                case 11:
                    r rVar = new r();
                    int r5 = r(bArr, i6, rVar, bVar);
                    c1Var.O(hVar.f7255d, rVar);
                    return r5;
                case 12:
                    n1 n1Var3 = new n1();
                    int w5 = w(bArr, i6, n1Var3, bVar);
                    c1Var.O(hVar.f7255d, n1Var3);
                    return w5;
                case 13:
                    y1 y1Var3 = new y1();
                    int x5 = x(bArr, i6, y1Var3, bVar);
                    c1Var.O(hVar.f7255d, y1Var3);
                    return x5;
                case 14:
                    n1 n1Var4 = new n1();
                    int y6 = y(bArr, i6, n1Var4, bVar);
                    j4 j4Var = eVar.unknownFields;
                    j4 j4Var2 = (j4) l3.B(i8, n1Var4, hVar.f7255d.f7247o, j4Var != j4.e() ? j4Var : null, i4Var);
                    if (j4Var2 != null) {
                        eVar.unknownFields = j4Var2;
                    }
                    c1Var.O(hVar.f7255d, n1Var4);
                    return y6;
                default:
                    StringBuilder sb = new StringBuilder("Type cannot be packed: ");
                    sb.append(hVar.f7255d.f7249q);
                    throw new IllegalStateException(sb.toString());
            }
        }
        if (hVar.b() != q4.b.ENUM) {
            switch (a.f7316a[hVar.b().ordinal()]) {
                case 1:
                    r3 = Double.valueOf(d(bArr, i6));
                    i6 += 8;
                    break;
                case 2:
                    r3 = Float.valueOf(l(bArr, i6));
                    i6 += 4;
                    break;
                case 3:
                case 4:
                    i6 = L(bArr, i6, bVar);
                    r3 = Long.valueOf(bVar.f7318b);
                    break;
                case 5:
                case 6:
                    i6 = I(bArr, i6, bVar);
                    r3 = Integer.valueOf(bVar.f7317a);
                    break;
                case 7:
                case 8:
                    r3 = Long.valueOf(j(bArr, i6));
                    i6 += 8;
                    break;
                case 9:
                case 10:
                    r3 = Integer.valueOf(h(bArr, i6));
                    i6 += 4;
                    break;
                case 11:
                    i6 = L(bArr, i6, bVar);
                    r3 = Boolean.valueOf(bVar.f7318b != 0);
                    break;
                case 12:
                    i6 = I(bArr, i6, bVar);
                    r3 = Integer.valueOf(z.b(bVar.f7317a));
                    break;
                case 13:
                    i6 = L(bArr, i6, bVar);
                    r3 = Long.valueOf(z.c(bVar.f7318b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i6 = b(bArr, i6, bVar);
                    r3 = bVar.f7319c;
                    break;
                case 16:
                    i6 = C(bArr, i6, bVar);
                    r3 = bVar.f7319c;
                    break;
                case 17:
                    i6 = n(c3.a().i(hVar.c().getClass()), bArr, i6, i7, (i8 << 3) | 4, bVar);
                    r3 = bVar.f7319c;
                    break;
                case 18:
                    i6 = p(c3.a().i(hVar.c().getClass()), bArr, i6, i7, bVar);
                    r3 = bVar.f7319c;
                    break;
            }
        } else {
            i6 = I(bArr, i6, bVar);
            if (hVar.f7255d.f7247o.a(bVar.f7317a) == null) {
                j4 j4Var3 = eVar.unknownFields;
                if (j4Var3 == j4.e()) {
                    j4Var3 = j4.p();
                    eVar.unknownFields = j4Var3;
                }
                l3.Q(i8, bVar.f7317a, j4Var3, i4Var);
                return i6;
            }
            r3 = Integer.valueOf(bVar.f7317a);
        }
        if (hVar.f()) {
            c1Var.h(hVar.f7255d, r3);
        } else {
            int i9 = a.f7316a[hVar.b().ordinal()];
            if ((i9 == 17 || i9 == 18) && (u5 = c1Var.u(hVar.f7255d)) != null) {
                r3 = o1.v(u5, r3);
            }
            c1Var.O(hVar.f7255d, r3);
        }
        return i6;
    }

    static int g(int i5, byte[] bArr, int i6, int i7, Object obj, h2 h2Var, i4<j4, j4> i4Var, b bVar) throws IOException {
        i1.h c6 = bVar.f7320d.c(h2Var, i5 >>> 3);
        if (c6 == null) {
            return G(i5, bArr, i6, i7, k2.w(obj), bVar);
        }
        i1.e eVar = (i1.e) obj;
        eVar.K2();
        return f(i5, bArr, i6, i7, eVar, c6, i4Var, bVar);
    }

    static int h(byte[] bArr, int i5) {
        return ((bArr[i5 + 3] & UByte.f27220r) << 24) | (bArr[i5] & UByte.f27220r) | ((bArr[i5 + 1] & UByte.f27220r) << 8) | ((bArr[i5 + 2] & UByte.f27220r) << 16);
    }

    static int i(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) {
        n1 n1Var = (n1) kVar;
        n1Var.D(h(bArr, i6));
        int i8 = i6 + 4;
        while (i8 < i7) {
            int I = I(bArr, i8, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            n1Var.D(h(bArr, I));
            i8 = I + 4;
        }
        return i8;
    }

    static long j(byte[] bArr, int i5) {
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    static int k(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) {
        y1 y1Var = (y1) kVar;
        y1Var.e0(j(bArr, i6));
        int i8 = i6 + 8;
        while (i8 < i7) {
            int I = I(bArr, i8, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            y1Var.e0(j(bArr, I));
            i8 = I + 8;
        }
        return i8;
    }

    static float l(byte[] bArr, int i5) {
        return Float.intBitsToFloat(h(bArr, i5));
    }

    static int m(int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) {
        e1 e1Var = (e1) kVar;
        e1Var.m(l(bArr, i6));
        int i8 = i6 + 4;
        while (i8 < i7) {
            int I = I(bArr, i8, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            e1Var.m(l(bArr, I));
            i8 = I + 4;
        }
        return i8;
    }

    static int n(j3 j3Var, byte[] bArr, int i5, int i6, int i7, b bVar) throws IOException {
        k2 k2Var = (k2) j3Var;
        Object h5 = k2Var.h();
        int e02 = k2Var.e0(h5, bArr, i5, i6, i7, bVar);
        k2Var.c(h5);
        bVar.f7319c = h5;
        return e02;
    }

    static int o(j3 j3Var, int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) throws IOException {
        int i8 = (i5 & (-8)) | 4;
        int n5 = n(j3Var, bArr, i6, i7, i8, bVar);
        kVar.add(bVar.f7319c);
        while (n5 < i7) {
            int I = I(bArr, n5, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            n5 = n(j3Var, bArr, I, i7, i8, bVar);
            kVar.add(bVar.f7319c);
        }
        return n5;
    }

    static int p(j3 j3Var, byte[] bArr, int i5, int i6, b bVar) throws IOException {
        int i7 = i5 + 1;
        int i8 = bArr[i5];
        if (i8 < 0) {
            i7 = H(i8, bArr, i7, bVar);
            i8 = bVar.f7317a;
        }
        int i9 = i7;
        if (i8 < 0 || i8 > i6 - i9) {
            throw InvalidProtocolBufferException.l();
        }
        Object h5 = j3Var.h();
        int i10 = i8 + i9;
        j3Var.i(h5, bArr, i9, i10, bVar);
        j3Var.c(h5);
        bVar.f7319c = h5;
        return i10;
    }

    static int q(j3<?> j3Var, int i5, byte[] bArr, int i6, int i7, o1.k<?> kVar, b bVar) throws IOException {
        int p5 = p(j3Var, bArr, i6, i7, bVar);
        kVar.add(bVar.f7319c);
        while (p5 < i7) {
            int I = I(bArr, p5, bVar);
            if (i5 != bVar.f7317a) {
                break;
            }
            p5 = p(j3Var, bArr, I, i7, bVar);
            kVar.add(bVar.f7319c);
        }
        return p5;
    }

    static int r(byte[] bArr, int i5, o1.k<?> kVar, b bVar) throws IOException {
        r rVar = (r) kVar;
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a + I;
        while (I < i6) {
            I = L(bArr, I, bVar);
            rVar.i0(bVar.f7318b != 0);
        }
        if (I == i6) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int s(byte[] bArr, int i5, o1.k<?> kVar, b bVar) throws IOException {
        c0 c0Var = (c0) kVar;
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a + I;
        while (I < i6) {
            c0Var.o0(d(bArr, I));
            I += 8;
        }
        if (I == i6) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int t(byte[] bArr, int i5, o1.k<?> kVar, b bVar) throws IOException {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a + I;
        while (I < i6) {
            n1Var.D(h(bArr, I));
            I += 4;
        }
        if (I == i6) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int u(byte[] bArr, int i5, o1.k<?> kVar, b bVar) throws IOException {
        y1 y1Var = (y1) kVar;
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a + I;
        while (I < i6) {
            y1Var.e0(j(bArr, I));
            I += 8;
        }
        if (I == i6) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int v(byte[] bArr, int i5, o1.k<?> kVar, b bVar) throws IOException {
        e1 e1Var = (e1) kVar;
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a + I;
        while (I < i6) {
            e1Var.m(l(bArr, I));
            I += 4;
        }
        if (I == i6) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int w(byte[] bArr, int i5, o1.k<?> kVar, b bVar) throws IOException {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a + I;
        while (I < i6) {
            I = I(bArr, I, bVar);
            n1Var.D(z.b(bVar.f7317a));
        }
        if (I == i6) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int x(byte[] bArr, int i5, o1.k<?> kVar, b bVar) throws IOException {
        y1 y1Var = (y1) kVar;
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a + I;
        while (I < i6) {
            I = L(bArr, I, bVar);
            y1Var.e0(z.c(bVar.f7318b));
        }
        if (I == i6) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int y(byte[] bArr, int i5, o1.k<?> kVar, b bVar) throws IOException {
        n1 n1Var = (n1) kVar;
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a + I;
        while (I < i6) {
            I = I(bArr, I, bVar);
            n1Var.D(bVar.f7317a);
        }
        if (I == i6) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    static int z(byte[] bArr, int i5, o1.k<?> kVar, b bVar) throws IOException {
        y1 y1Var = (y1) kVar;
        int I = I(bArr, i5, bVar);
        int i6 = bVar.f7317a + I;
        while (I < i6) {
            I = L(bArr, I, bVar);
            y1Var.e0(bVar.f7318b);
        }
        if (I == i6) {
            return I;
        }
        throw InvalidProtocolBufferException.l();
    }

    /* compiled from: ArrayDecoders.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f7317a;

        /* renamed from: b, reason: collision with root package name */
        public long f7318b;

        /* renamed from: c, reason: collision with root package name */
        public Object f7319c;

        /* renamed from: d, reason: collision with root package name */
        public final s0 f7320d;

        b() {
            this.f7320d = s0.d();
        }

        b(s0 s0Var) {
            s0Var.getClass();
            this.f7320d = s0Var;
        }
    }
}
