package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: CodedInputStream.java */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25700a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25701b;

    /* renamed from: c, reason: collision with root package name */
    private int f25702c;

    /* renamed from: d, reason: collision with root package name */
    private int f25703d;

    /* renamed from: e, reason: collision with root package name */
    private int f25704e;

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f25705f;

    /* renamed from: g, reason: collision with root package name */
    private int f25706g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25707h;

    /* renamed from: i, reason: collision with root package name */
    private int f25708i;

    /* renamed from: j, reason: collision with root package name */
    private int f25709j;

    /* renamed from: k, reason: collision with root package name */
    private int f25710k;

    /* renamed from: l, reason: collision with root package name */
    private int f25711l;

    /* renamed from: m, reason: collision with root package name */
    private int f25712m;

    /* renamed from: n, reason: collision with root package name */
    private a f25713n;

    /* compiled from: CodedInputStream.java */
    private interface a {
        void a();
    }

    private e(InputStream inputStream) {
        this.f25707h = false;
        this.f25709j = Integer.MAX_VALUE;
        this.f25711l = 64;
        this.f25712m = 67108864;
        this.f25713n = null;
        this.f25700a = new byte[4096];
        this.f25702c = 0;
        this.f25704e = 0;
        this.f25708i = 0;
        this.f25705f = inputStream;
        this.f25701b = false;
    }

    public static int B(int i5, InputStream inputStream) throws IOException {
        if ((i5 & 128) == 0) {
            return i5;
        }
        int i6 = i5 & 127;
        int i7 = 7;
        while (i7 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.k();
            }
            i6 |= (read & 127) << i7;
            if ((read & 128) == 0) {
                return i6;
            }
            i7 += 7;
        }
        while (i7 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            if ((read2 & 128) == 0) {
                return i6;
            }
            i7 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    private void N() {
        int i5 = this.f25702c + this.f25703d;
        this.f25702c = i5;
        int i6 = this.f25708i + i5;
        int i7 = this.f25709j;
        if (i6 <= i7) {
            this.f25703d = 0;
            return;
        }
        int i8 = i6 - i7;
        this.f25703d = i8;
        this.f25702c = i5 - i8;
    }

    private void O(int i5) throws IOException {
        if (!T(i5)) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void S(int i5) throws IOException {
        if (i5 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i6 = this.f25708i;
        int i7 = this.f25704e;
        int i8 = i6 + i7 + i5;
        int i9 = this.f25709j;
        if (i8 > i9) {
            R((i9 - i6) - i7);
            throw InvalidProtocolBufferException.k();
        }
        int i10 = this.f25702c;
        int i11 = i10 - i7;
        this.f25704e = i10;
        O(1);
        while (true) {
            int i12 = i5 - i11;
            int i13 = this.f25702c;
            if (i12 <= i13) {
                this.f25704e = i12;
                return;
            } else {
                i11 += i13;
                this.f25704e = i13;
                O(1);
            }
        }
    }

    private boolean T(int i5) throws IOException {
        int i6 = this.f25704e;
        if (i6 + i5 <= this.f25702c) {
            StringBuilder sb = new StringBuilder(77);
            sb.append(ProtectedSandApp.s("佀"));
            sb.append(i5);
            sb.append(ProtectedSandApp.s("佁"));
            throw new IllegalStateException(sb.toString());
        }
        if (this.f25708i + i6 + i5 > this.f25709j) {
            return false;
        }
        a aVar = this.f25713n;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f25705f != null) {
            int i7 = this.f25704e;
            if (i7 > 0) {
                int i8 = this.f25702c;
                if (i8 > i7) {
                    byte[] bArr = this.f25700a;
                    System.arraycopy(bArr, i7, bArr, 0, i8 - i7);
                }
                this.f25708i += i7;
                this.f25702c -= i7;
                this.f25704e = 0;
            }
            InputStream inputStream = this.f25705f;
            byte[] bArr2 = this.f25700a;
            int i9 = this.f25702c;
            int read = inputStream.read(bArr2, i9, bArr2.length - i9);
            if (read == 0 || read < -1 || read > this.f25700a.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append(ProtectedSandApp.s("伾"));
                sb2.append(read);
                sb2.append(ProtectedSandApp.s("伿"));
                throw new IllegalStateException(sb2.toString());
            }
            if (read > 0) {
                this.f25702c += read;
                if ((this.f25708i + i5) - this.f25712m > 0) {
                    throw InvalidProtocolBufferException.j();
                }
                N();
                if (this.f25702c >= i5) {
                    return true;
                }
                return T(i5);
            }
        }
        return false;
    }

    public static int b(int i5) {
        return (-(i5 & 1)) ^ (i5 >>> 1);
    }

    public static long c(long j5) {
        return (-(j5 & 1)) ^ (j5 >>> 1);
    }

    private void d(int i5) throws IOException {
        if (this.f25702c - this.f25704e < i5) {
            O(i5);
        }
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    static e h(n nVar) {
        e eVar = new e(nVar);
        try {
            eVar.j(nVar.size());
            return eVar;
        } catch (InvalidProtocolBufferException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    private byte[] x(int i5) throws IOException {
        if (i5 <= 0) {
            if (i5 == 0) {
                return i.f25745a;
            }
            throw InvalidProtocolBufferException.g();
        }
        int i6 = this.f25708i;
        int i7 = this.f25704e;
        int i8 = i6 + i7 + i5;
        int i9 = this.f25709j;
        if (i8 > i9) {
            R((i9 - i6) - i7);
            throw InvalidProtocolBufferException.k();
        }
        if (i5 < 4096) {
            byte[] bArr = new byte[i5];
            int i10 = this.f25702c - i7;
            System.arraycopy(this.f25700a, i7, bArr, 0, i10);
            this.f25704e = this.f25702c;
            int i11 = i5 - i10;
            d(i11);
            System.arraycopy(this.f25700a, 0, bArr, i10, i11);
            this.f25704e = i11;
            return bArr;
        }
        int i12 = this.f25702c;
        this.f25708i = i6 + i12;
        this.f25704e = 0;
        this.f25702c = 0;
        int i13 = i12 - i7;
        int i14 = i5 - i13;
        ArrayList arrayList = new ArrayList();
        while (i14 > 0) {
            int min = Math.min(i14, 4096);
            byte[] bArr2 = new byte[min];
            int i15 = 0;
            while (i15 < min) {
                InputStream inputStream = this.f25705f;
                int read = inputStream == null ? -1 : inputStream.read(bArr2, i15, min - i15);
                if (read == -1) {
                    throw InvalidProtocolBufferException.k();
                }
                this.f25708i += read;
                i15 += read;
            }
            i14 -= min;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i5];
        System.arraycopy(this.f25700a, i7, bArr3, 0, i13);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr4 = (byte[]) it.next();
            System.arraycopy(bArr4, 0, bArr3, i13, bArr4.length);
            i13 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r2[r3] < 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f25704e
            int r1 = r9.f25702c
            if (r1 != r0) goto L8
            goto L7c
        L8:
            byte[] r2 = r9.f25700a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.f25704e = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7c
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L82
        L2d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3d:
            r1 = r3
            goto L82
        L3f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L82
        L7c:
            long r0 = r9.D()
            int r0 = (int) r0
            return r0
        L82:
            r9.f25704e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.A():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r2[r0] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long C() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.C():long");
    }

    long D() throws IOException {
        long j5 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j5 |= (r3 & ByteCompanionObject.f23585c) << i5;
            if ((w() & ByteCompanionObject.f23584b) == 0) {
                return j5;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public int E() throws IOException {
        return y();
    }

    public long F() throws IOException {
        return z();
    }

    public int G() throws IOException {
        return b(A());
    }

    public long H() throws IOException {
        return c(C());
    }

    public String I() throws IOException {
        int A = A();
        int i5 = this.f25702c;
        int i6 = this.f25704e;
        int i7 = i5 - i6;
        String s5 = ProtectedSandApp.s("佂");
        if (A > i7 || A <= 0) {
            return A == 0 ? "" : new String(x(A), s5);
        }
        String str = new String(this.f25700a, i6, A, s5);
        this.f25704e += A;
        return str;
    }

    public String J() throws IOException {
        byte[] x5;
        int A = A();
        int i5 = this.f25704e;
        if (A <= this.f25702c - i5 && A > 0) {
            x5 = this.f25700a;
            this.f25704e = i5 + A;
        } else {
            if (A == 0) {
                return "";
            }
            x5 = x(A);
            i5 = 0;
        }
        if (v.f(x5, i5, i5 + A)) {
            return new String(x5, i5, A, ProtectedSandApp.s("佃"));
        }
        throw InvalidProtocolBufferException.d();
    }

    public int K() throws IOException {
        if (f()) {
            this.f25706g = 0;
            return 0;
        }
        int A = A();
        this.f25706g = A;
        if (w.a(A) != 0) {
            return this.f25706g;
        }
        throw InvalidProtocolBufferException.c();
    }

    public int L() throws IOException {
        return A();
    }

    public long M() throws IOException {
        return C();
    }

    public boolean P(int i5, CodedOutputStream codedOutputStream) throws IOException {
        int b6 = w.b(i5);
        if (b6 == 0) {
            long C = C();
            codedOutputStream.o0(i5);
            codedOutputStream.p0(C);
            return true;
        }
        if (b6 == 1) {
            long z5 = z();
            codedOutputStream.o0(i5);
            codedOutputStream.n0(z5);
            return true;
        }
        if (b6 == 2) {
            d l5 = l();
            codedOutputStream.o0(i5);
            codedOutputStream.P(l5);
            return true;
        }
        if (b6 == 3) {
            codedOutputStream.o0(i5);
            Q(codedOutputStream);
            int i6 = ((i5 >>> 3) << 3) | 4;
            a(i6);
            codedOutputStream.o0(i6);
            return true;
        }
        if (b6 == 4) {
            return false;
        }
        if (b6 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        int y5 = y();
        codedOutputStream.o0(i5);
        codedOutputStream.m0(y5);
        return true;
    }

    public void Q(CodedOutputStream codedOutputStream) throws IOException {
        int K;
        do {
            K = K();
            if (K == 0) {
                return;
            }
        } while (P(K, codedOutputStream));
    }

    public void R(int i5) throws IOException {
        int i6 = this.f25702c;
        int i7 = this.f25704e;
        if (i5 > i6 - i7 || i5 < 0) {
            S(i5);
        } else {
            this.f25704e = i7 + i5;
        }
    }

    public void a(int i5) throws InvalidProtocolBufferException {
        if (this.f25706g != i5) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public int e() {
        int i5 = this.f25709j;
        if (i5 == Integer.MAX_VALUE) {
            return -1;
        }
        return i5 - (this.f25708i + this.f25704e);
    }

    public boolean f() throws IOException {
        return this.f25704e == this.f25702c && !T(1);
    }

    public void i(int i5) {
        this.f25709j = i5;
        N();
    }

    public int j(int i5) throws InvalidProtocolBufferException {
        if (i5 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i6 = this.f25708i + this.f25704e + i5;
        int i7 = this.f25709j;
        if (i6 > i7) {
            throw InvalidProtocolBufferException.k();
        }
        this.f25709j = i6;
        N();
        return i7;
    }

    public boolean k() throws IOException {
        return C() != 0;
    }

    public d l() throws IOException {
        int A = A();
        int i5 = this.f25702c;
        int i6 = this.f25704e;
        if (A > i5 - i6 || A <= 0) {
            return A == 0 ? d.f25692o : new n(x(A));
        }
        d cVar = (this.f25701b && this.f25707h) ? new c(this.f25700a, this.f25704e, A) : d.i(this.f25700a, i6, A);
        this.f25704e += A;
        return cVar;
    }

    public double m() throws IOException {
        return Double.longBitsToDouble(z());
    }

    public int n() throws IOException {
        return A();
    }

    public int o() throws IOException {
        return y();
    }

    public long p() throws IOException {
        return z();
    }

    public float q() throws IOException {
        return Float.intBitsToFloat(y());
    }

    public void r(int i5, o.a aVar, f fVar) throws IOException {
        int i6 = this.f25710k;
        if (i6 >= this.f25711l) {
            throw InvalidProtocolBufferException.h();
        }
        this.f25710k = i6 + 1;
        aVar.c(this, fVar);
        a(w.c(i5, 4));
        this.f25710k--;
    }

    public int s() throws IOException {
        return A();
    }

    public long t() throws IOException {
        return C();
    }

    public <T extends o> T u(q<T> qVar, f fVar) throws IOException {
        int A = A();
        if (this.f25710k >= this.f25711l) {
            throw InvalidProtocolBufferException.h();
        }
        int j5 = j(A);
        this.f25710k++;
        T b6 = qVar.b(this, fVar);
        a(0);
        this.f25710k--;
        i(j5);
        return b6;
    }

    public void v(o.a aVar, f fVar) throws IOException {
        int A = A();
        if (this.f25710k >= this.f25711l) {
            throw InvalidProtocolBufferException.h();
        }
        int j5 = j(A);
        this.f25710k++;
        aVar.c(this, fVar);
        a(0);
        this.f25710k--;
        i(j5);
    }

    public byte w() throws IOException {
        if (this.f25704e == this.f25702c) {
            O(1);
        }
        byte[] bArr = this.f25700a;
        int i5 = this.f25704e;
        this.f25704e = i5 + 1;
        return bArr[i5];
    }

    public int y() throws IOException {
        int i5 = this.f25704e;
        if (this.f25702c - i5 < 4) {
            O(4);
            i5 = this.f25704e;
        }
        byte[] bArr = this.f25700a;
        this.f25704e = i5 + 4;
        return ((bArr[i5 + 3] & UByte.f27220r) << 24) | (bArr[i5] & UByte.f27220r) | ((bArr[i5 + 1] & UByte.f27220r) << 8) | ((bArr[i5 + 2] & UByte.f27220r) << 16);
    }

    public long z() throws IOException {
        int i5 = this.f25704e;
        if (this.f25702c - i5 < 8) {
            O(8);
            i5 = this.f25704e;
        }
        byte[] bArr = this.f25700a;
        this.f25704e = i5 + 8;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    private e(n nVar) {
        this.f25707h = false;
        this.f25709j = Integer.MAX_VALUE;
        this.f25711l = 64;
        this.f25712m = 67108864;
        this.f25713n = null;
        this.f25700a = nVar.f25756q;
        int L = nVar.L();
        this.f25704e = L;
        this.f25702c = L + nVar.size();
        this.f25708i = -this.f25704e;
        this.f25705f = null;
        this.f25701b = true;
    }
}
