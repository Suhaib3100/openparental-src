package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: CodedInputStream.java */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f77682a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f77683b;

    /* renamed from: c, reason: collision with root package name */
    private int f77684c;

    /* renamed from: d, reason: collision with root package name */
    private int f77685d;

    /* renamed from: e, reason: collision with root package name */
    private int f77686e;

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f77687f;

    /* renamed from: g, reason: collision with root package name */
    private int f77688g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f77689h;

    /* renamed from: i, reason: collision with root package name */
    private int f77690i;

    /* renamed from: j, reason: collision with root package name */
    private int f77691j;

    /* renamed from: k, reason: collision with root package name */
    private int f77692k;

    /* renamed from: l, reason: collision with root package name */
    private int f77693l;

    /* renamed from: m, reason: collision with root package name */
    private int f77694m;

    /* renamed from: n, reason: collision with root package name */
    private a f77695n;

    /* compiled from: CodedInputStream.java */
    private interface a {
        void a();
    }

    private e(InputStream inputStream) {
        this.f77689h = false;
        this.f77691j = Integer.MAX_VALUE;
        this.f77693l = 64;
        this.f77694m = androidx.core.view.accessibility.b.f26943s;
        this.f77695n = null;
        this.f77682a = new byte[4096];
        this.f77684c = 0;
        this.f77686e = 0;
        this.f77690i = 0;
        this.f77687f = inputStream;
        this.f77683b = false;
    }

    public static int B(int i4, InputStream inputStream) throws IOException {
        if ((i4 & 128) == 0) {
            return i4;
        }
        int i5 = i4 & 127;
        int i6 = 7;
        while (i6 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.k();
            }
            i5 |= (read & 127) << i6;
            if ((read & 128) == 0) {
                return i5;
            }
            i6 += 7;
        }
        while (i6 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            if ((read2 & 128) == 0) {
                return i5;
            }
            i6 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    private void N() {
        int i4 = this.f77684c + this.f77685d;
        this.f77684c = i4;
        int i5 = this.f77690i + i4;
        int i6 = this.f77691j;
        if (i5 <= i6) {
            this.f77685d = 0;
            return;
        }
        int i7 = i5 - i6;
        this.f77685d = i7;
        this.f77684c = i4 - i7;
    }

    private void O(int i4) throws IOException {
        if (!T(i4)) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void S(int i4) throws IOException {
        if (i4 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i5 = this.f77690i;
        int i6 = this.f77686e;
        int i7 = i5 + i6 + i4;
        int i10 = this.f77691j;
        if (i7 > i10) {
            R((i10 - i5) - i6);
            throw InvalidProtocolBufferException.k();
        }
        int i11 = this.f77684c;
        int i12 = i11 - i6;
        this.f77686e = i11;
        O(1);
        while (true) {
            int i13 = i4 - i12;
            int i14 = this.f77684c;
            if (i13 <= i14) {
                this.f77686e = i13;
                return;
            } else {
                i12 += i14;
                this.f77686e = i14;
                O(1);
            }
        }
    }

    private boolean T(int i4) throws IOException {
        int i5 = this.f77686e;
        if (i5 + i4 <= this.f77684c) {
            StringBuilder sb = new StringBuilder(77);
            sb.append(ProtectedSandApp.s("盌\u0001"));
            sb.append(i4);
            sb.append(ProtectedSandApp.s("盍\u0001"));
            throw new IllegalStateException(sb.toString());
        }
        if (this.f77690i + i5 + i4 > this.f77691j) {
            return false;
        }
        a aVar = this.f77695n;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f77687f != null) {
            int i6 = this.f77686e;
            if (i6 > 0) {
                int i7 = this.f77684c;
                if (i7 > i6) {
                    byte[] bArr = this.f77682a;
                    System.arraycopy(bArr, i6, bArr, 0, i7 - i6);
                }
                this.f77690i += i6;
                this.f77684c -= i6;
                this.f77686e = 0;
            }
            InputStream inputStream = this.f77687f;
            byte[] bArr2 = this.f77682a;
            int i10 = this.f77684c;
            int read = inputStream.read(bArr2, i10, bArr2.length - i10);
            if (read == 0 || read < -1 || read > this.f77682a.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append(ProtectedSandApp.s("益\u0001"));
                sb2.append(read);
                sb2.append(ProtectedSandApp.s("盋\u0001"));
                throw new IllegalStateException(sb2.toString());
            }
            if (read > 0) {
                this.f77684c += read;
                if ((this.f77690i + i4) - this.f77694m > 0) {
                    throw InvalidProtocolBufferException.j();
                }
                N();
                if (this.f77684c >= i4) {
                    return true;
                }
                return T(i4);
            }
        }
        return false;
    }

    public static int b(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public static long c(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    private void d(int i4) throws IOException {
        if (this.f77684c - this.f77686e < i4) {
            O(i4);
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
        } catch (InvalidProtocolBufferException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    private byte[] x(int i4) throws IOException {
        if (i4 <= 0) {
            if (i4 == 0) {
                return i.f77727a;
            }
            throw InvalidProtocolBufferException.g();
        }
        int i5 = this.f77690i;
        int i6 = this.f77686e;
        int i7 = i5 + i6 + i4;
        int i10 = this.f77691j;
        if (i7 > i10) {
            R((i10 - i5) - i6);
            throw InvalidProtocolBufferException.k();
        }
        if (i4 < 4096) {
            byte[] bArr = new byte[i4];
            int i11 = this.f77684c - i6;
            System.arraycopy(this.f77682a, i6, bArr, 0, i11);
            this.f77686e = this.f77684c;
            int i12 = i4 - i11;
            d(i12);
            System.arraycopy(this.f77682a, 0, bArr, i11, i12);
            this.f77686e = i12;
            return bArr;
        }
        int i13 = this.f77684c;
        this.f77690i = i5 + i13;
        this.f77686e = 0;
        this.f77684c = 0;
        int i14 = i13 - i6;
        int i15 = i4 - i14;
        ArrayList arrayList = new ArrayList();
        while (i15 > 0) {
            int min = Math.min(i15, 4096);
            byte[] bArr2 = new byte[min];
            int i16 = 0;
            while (i16 < min) {
                InputStream inputStream = this.f77687f;
                int read = inputStream == null ? -1 : inputStream.read(bArr2, i16, min - i16);
                if (read == -1) {
                    throw InvalidProtocolBufferException.k();
                }
                this.f77690i += read;
                i16 += read;
            }
            i15 -= min;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i4];
        System.arraycopy(this.f77682a, i6, bArr3, 0, i14);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr4 = (byte[]) it.next();
            System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
            i14 += bArr4.length;
        }
        return bArr3;
    }

    public int A() throws IOException {
        int i4;
        int i5 = this.f77686e;
        int i6 = this.f77684c;
        if (i6 != i5) {
            byte[] bArr = this.f77682a;
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.f77686e = i7;
                return b5;
            }
            if (i6 - i7 >= 9) {
                int i10 = i5 + 2;
                int i11 = (bArr[i7] << 7) ^ b5;
                long j4 = i11;
                if (j4 < 0) {
                    i4 = (int) ((-128) ^ j4);
                } else {
                    int i12 = i5 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    long j5 = i13;
                    if (j5 >= 0) {
                        i4 = (int) (16256 ^ j5);
                    } else {
                        int i14 = i5 + 4;
                        long j6 = i13 ^ (bArr[i12] << com.google.common.base.c.f54879y);
                        if (j6 < 0) {
                            i4 = (int) ((-2080896) ^ j6);
                        } else {
                            i12 = i5 + 5;
                            int i15 = (int) ((r1 ^ (r3 << com.google.common.base.c.F)) ^ 266354560);
                            if (bArr[i14] < 0) {
                                i14 = i5 + 6;
                                if (bArr[i12] < 0) {
                                    i12 = i5 + 7;
                                    if (bArr[i14] < 0) {
                                        i14 = i5 + 8;
                                        if (bArr[i12] < 0) {
                                            i12 = i5 + 9;
                                            if (bArr[i14] < 0) {
                                                int i16 = i5 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i10 = i16;
                                                    i4 = i15;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i15;
                            }
                            i4 = i15;
                        }
                        i10 = i14;
                    }
                    i10 = i12;
                }
                this.f77686e = i10;
                return i4;
            }
        }
        return (int) D();
    }

    public long C() throws IOException {
        long j4;
        long j5;
        long j6;
        int i4 = this.f77686e;
        int i5 = this.f77684c;
        if (i5 != i4) {
            byte[] bArr = this.f77682a;
            int i6 = i4 + 1;
            byte b5 = bArr[i4];
            if (b5 >= 0) {
                this.f77686e = i6;
                return b5;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                long j7 = (bArr[i6] << 7) ^ b5;
                if (j7 >= 0) {
                    int i10 = i4 + 3;
                    long j10 = j7 ^ (bArr[i7] << 14);
                    if (j10 >= 0) {
                        j6 = 16256;
                    } else {
                        i7 = i4 + 4;
                        j7 = j10 ^ (bArr[i10] << com.google.common.base.c.f54879y);
                        if (j7 < 0) {
                            j5 = -2080896;
                        } else {
                            i10 = i4 + 5;
                            j10 = j7 ^ (bArr[i7] << 28);
                            if (j10 >= 0) {
                                j6 = 266354560;
                            } else {
                                i7 = i4 + 6;
                                j7 = j10 ^ (bArr[i10] << 35);
                                if (j7 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i10 = i4 + 7;
                                    j10 = j7 ^ (bArr[i7] << 42);
                                    if (j10 >= 0) {
                                        j6 = 4363953127296L;
                                    } else {
                                        i7 = i4 + 8;
                                        j7 = j10 ^ (bArr[i10] << 49);
                                        if (j7 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            i10 = i4 + 9;
                                            long j11 = (j7 ^ (bArr[i7] << 56)) ^ 71499008037633920L;
                                            if (j11 >= 0) {
                                                j4 = j11;
                                                i7 = i10;
                                                this.f77686e = i7;
                                                return j4;
                                            }
                                            i7 = i4 + 10;
                                            if (bArr[i10] >= 0) {
                                                j4 = j11;
                                                this.f77686e = i7;
                                                return j4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j4 = j10 ^ j6;
                    i7 = i10;
                    this.f77686e = i7;
                    return j4;
                }
                j5 = -128;
                j4 = j7 ^ j5;
                this.f77686e = i7;
                return j4;
            }
        }
        return D();
    }

    long D() throws IOException {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((w() & 128) == 0) {
                return j4;
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
        int i4 = this.f77684c;
        int i5 = this.f77686e;
        int i6 = i4 - i5;
        String s4 = ProtectedSandApp.s("盎\u0001");
        if (A > i6 || A <= 0) {
            return A == 0 ? "" : new String(x(A), s4);
        }
        String str = new String(this.f77682a, i5, A, s4);
        this.f77686e += A;
        return str;
    }

    public String J() throws IOException {
        byte[] x4;
        int A = A();
        int i4 = this.f77686e;
        if (A <= this.f77684c - i4 && A > 0) {
            x4 = this.f77682a;
            this.f77686e = i4 + A;
        } else {
            if (A == 0) {
                return "";
            }
            x4 = x(A);
            i4 = 0;
        }
        if (v.f(x4, i4, i4 + A)) {
            return new String(x4, i4, A, ProtectedSandApp.s("盎\u0001"));
        }
        throw InvalidProtocolBufferException.d();
    }

    public int K() throws IOException {
        if (f()) {
            this.f77688g = 0;
            return 0;
        }
        int A = A();
        this.f77688g = A;
        if (w.a(A) != 0) {
            return this.f77688g;
        }
        throw InvalidProtocolBufferException.c();
    }

    public int L() throws IOException {
        return A();
    }

    public long M() throws IOException {
        return C();
    }

    public boolean P(int i4, CodedOutputStream codedOutputStream) throws IOException {
        int b5 = w.b(i4);
        if (b5 == 0) {
            long C = C();
            codedOutputStream.o0(i4);
            codedOutputStream.p0(C);
            return true;
        }
        if (b5 == 1) {
            long z4 = z();
            codedOutputStream.o0(i4);
            codedOutputStream.n0(z4);
            return true;
        }
        if (b5 == 2) {
            d l4 = l();
            codedOutputStream.o0(i4);
            codedOutputStream.P(l4);
            return true;
        }
        if (b5 == 3) {
            codedOutputStream.o0(i4);
            Q(codedOutputStream);
            int i5 = ((i4 >>> 3) << 3) | 4;
            a(i5);
            codedOutputStream.o0(i5);
            return true;
        }
        if (b5 == 4) {
            return false;
        }
        if (b5 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        int y4 = y();
        codedOutputStream.o0(i4);
        codedOutputStream.m0(y4);
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

    public void R(int i4) throws IOException {
        int i5 = this.f77684c;
        int i6 = this.f77686e;
        if (i4 > i5 - i6 || i4 < 0) {
            S(i4);
        } else {
            this.f77686e = i6 + i4;
        }
    }

    public void a(int i4) throws InvalidProtocolBufferException {
        if (this.f77688g != i4) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public int e() {
        int i4 = this.f77691j;
        if (i4 == Integer.MAX_VALUE) {
            return -1;
        }
        return i4 - (this.f77690i + this.f77686e);
    }

    public boolean f() throws IOException {
        return this.f77686e == this.f77684c && !T(1);
    }

    public void i(int i4) {
        this.f77691j = i4;
        N();
    }

    public int j(int i4) throws InvalidProtocolBufferException {
        if (i4 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        int i5 = this.f77690i + this.f77686e + i4;
        int i6 = this.f77691j;
        if (i5 > i6) {
            throw InvalidProtocolBufferException.k();
        }
        this.f77691j = i5;
        N();
        return i6;
    }

    public boolean k() throws IOException {
        return C() != 0;
    }

    public d l() throws IOException {
        int A = A();
        int i4 = this.f77684c;
        int i5 = this.f77686e;
        if (A > i4 - i5 || A <= 0) {
            return A == 0 ? d.f77674b : new n(x(A));
        }
        d cVar = (this.f77683b && this.f77689h) ? new c(this.f77682a, this.f77686e, A) : d.i(this.f77682a, i5, A);
        this.f77686e += A;
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

    public void r(int i4, o.a aVar, f fVar) throws IOException {
        int i5 = this.f77692k;
        if (i5 >= this.f77693l) {
            throw InvalidProtocolBufferException.h();
        }
        this.f77692k = i5 + 1;
        aVar.r0(this, fVar);
        a(w.c(i4, 4));
        this.f77692k--;
    }

    public int s() throws IOException {
        return A();
    }

    public long t() throws IOException {
        return C();
    }

    public <T extends o> T u(q<T> qVar, f fVar) throws IOException {
        int A = A();
        if (this.f77692k >= this.f77693l) {
            throw InvalidProtocolBufferException.h();
        }
        int j4 = j(A);
        this.f77692k++;
        T c5 = qVar.c(this, fVar);
        a(0);
        this.f77692k--;
        i(j4);
        return c5;
    }

    public void v(o.a aVar, f fVar) throws IOException {
        int A = A();
        if (this.f77692k >= this.f77693l) {
            throw InvalidProtocolBufferException.h();
        }
        int j4 = j(A);
        this.f77692k++;
        aVar.r0(this, fVar);
        a(0);
        this.f77692k--;
        i(j4);
    }

    public byte w() throws IOException {
        if (this.f77686e == this.f77684c) {
            O(1);
        }
        byte[] bArr = this.f77682a;
        int i4 = this.f77686e;
        this.f77686e = i4 + 1;
        return bArr[i4];
    }

    public int y() throws IOException {
        int i4 = this.f77686e;
        if (this.f77684c - i4 < 4) {
            O(4);
            i4 = this.f77686e;
        }
        byte[] bArr = this.f77682a;
        this.f77686e = i4 + 4;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public long z() throws IOException {
        int i4 = this.f77686e;
        if (this.f77684c - i4 < 8) {
            O(8);
            i4 = this.f77686e;
        }
        byte[] bArr = this.f77682a;
        this.f77686e = i4 + 8;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    private e(n nVar) {
        this.f77689h = false;
        this.f77691j = Integer.MAX_VALUE;
        this.f77693l = 64;
        this.f77694m = androidx.core.view.accessibility.b.f26943s;
        this.f77695n = null;
        this.f77682a = nVar.f77738d;
        int P = nVar.P();
        this.f77686e = P;
        this.f77684c = P + nVar.size();
        this.f77690i = -this.f77686e;
        this.f77687f = null;
        this.f77683b = true;
    }
}
