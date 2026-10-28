package android.content.preferences.protobuf;

import android.content.preferences.protobuf.s4;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class j4 {

    /* renamed from: f, reason: collision with root package name */
    private static final int f7282f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final j4 f7283g = new j4(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f7284a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f7285b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f7286c;

    /* renamed from: d, reason: collision with root package name */
    private int f7287d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7288e;

    private j4() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i5 = this.f7284a;
        int[] iArr = this.f7285b;
        if (i5 == iArr.length) {
            int i6 = i5 + (i5 < 4 ? 8 : i5 >> 1);
            this.f7285b = Arrays.copyOf(iArr, i6);
            this.f7286c = Arrays.copyOf(this.f7286c, i6);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (iArr[i6] != iArr2[i6]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (!objArr[i6].equals(objArr2[i6])) {
                return false;
            }
        }
        return true;
    }

    public static j4 e() {
        return f7283g;
    }

    private static int h(int[] iArr, int i5) {
        int i6 = 17;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        return i6;
    }

    private static int i(Object[] objArr, int i5) {
        int i6 = 17;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 = (i6 * 31) + objArr[i7].hashCode();
        }
        return i6;
    }

    private j4 l(z zVar) throws IOException {
        int Y;
        do {
            Y = zVar.Y();
            if (Y == 0) {
                break;
            }
        } while (k(Y, zVar));
        return this;
    }

    static j4 o(j4 j4Var, j4 j4Var2) {
        int i5 = j4Var.f7284a + j4Var2.f7284a;
        int[] copyOf = Arrays.copyOf(j4Var.f7285b, i5);
        System.arraycopy(j4Var2.f7285b, 0, copyOf, j4Var.f7284a, j4Var2.f7284a);
        Object[] copyOf2 = Arrays.copyOf(j4Var.f7286c, i5);
        System.arraycopy(j4Var2.f7286c, 0, copyOf2, j4Var.f7284a, j4Var2.f7284a);
        return new j4(i5, copyOf, copyOf2, true);
    }

    static j4 p() {
        return new j4();
    }

    private static void u(int i5, Object obj, s4 s4Var) throws IOException {
        int a6 = q4.a(i5);
        int i6 = i5 & 7;
        if (i6 == 0) {
            s4Var.s(a6, ((Long) obj).longValue());
            return;
        }
        if (i6 == 1) {
            s4Var.i(a6, ((Long) obj).longValue());
            return;
        }
        if (i6 == 2) {
            s4Var.z(a6, (w) obj);
            return;
        }
        if (i6 != 3) {
            if (i6 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.e());
            }
            s4Var.d(a6, ((Integer) obj).intValue());
        } else if (s4Var.j() == s4.a.ASCENDING) {
            s4Var.v(a6);
            ((j4) obj).w(s4Var);
            s4Var.J(a6);
        } else {
            s4Var.J(a6);
            ((j4) obj).w(s4Var);
            s4Var.v(a6);
        }
    }

    void a() {
        if (!this.f7288e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        int i5 = this.f7284a;
        return i5 == j4Var.f7284a && c(this.f7285b, j4Var.f7285b, i5) && d(this.f7286c, j4Var.f7286c, this.f7284a);
    }

    public int f() {
        int a12;
        int i5 = this.f7287d;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f7284a; i7++) {
            int i8 = this.f7285b[i7];
            int a6 = q4.a(i8);
            int i9 = i8 & 7;
            if (i9 == 0) {
                a12 = CodedOutputStream.a1(a6, ((Long) this.f7286c[i7]).longValue());
            } else if (i9 == 1) {
                a12 = CodedOutputStream.o0(a6, ((Long) this.f7286c[i7]).longValue());
            } else if (i9 == 2) {
                a12 = CodedOutputStream.g0(a6, (w) this.f7286c[i7]);
            } else if (i9 == 3) {
                i6 = ((j4) this.f7286c[i7]).f() + (CodedOutputStream.X0(a6) * 2) + i6;
            } else {
                if (i9 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                a12 = CodedOutputStream.m0(a6, ((Integer) this.f7286c[i7]).intValue());
            }
            i6 = a12 + i6;
        }
        this.f7287d = i6;
        return i6;
    }

    public int g() {
        int i5 = this.f7287d;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f7284a; i7++) {
            i6 += CodedOutputStream.K0(q4.a(this.f7285b[i7]), (w) this.f7286c[i7]);
        }
        this.f7287d = i6;
        return i6;
    }

    public int hashCode() {
        int i5 = this.f7284a;
        return ((((527 + i5) * 31) + h(this.f7285b, i5)) * 31) + i(this.f7286c, this.f7284a);
    }

    public void j() {
        this.f7288e = false;
    }

    boolean k(int i5, z zVar) throws IOException {
        a();
        int a6 = q4.a(i5);
        int i6 = i5 & 7;
        if (i6 == 0) {
            r(i5, Long.valueOf(zVar.G()));
            return true;
        }
        if (i6 == 1) {
            r(i5, Long.valueOf(zVar.B()));
            return true;
        }
        if (i6 == 2) {
            r(i5, zVar.x());
            return true;
        }
        if (i6 == 3) {
            j4 j4Var = new j4();
            j4Var.l(zVar);
            zVar.a((a6 << 3) | 4);
            r(i5, j4Var);
            return true;
        }
        if (i6 == 4) {
            return false;
        }
        if (i6 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        r(i5, Integer.valueOf(zVar.A()));
        return true;
    }

    j4 m(int i5, w wVar) {
        a();
        if (i5 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(q4.c(i5, 2), wVar);
        return this;
    }

    j4 n(int i5, int i6) {
        a();
        if (i5 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(q4.c(i5, 0), Long.valueOf(i6));
        return this;
    }

    final void q(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < this.f7284a; i6++) {
            j2.c(sb, i5, String.valueOf(q4.a(this.f7285b[i6])), this.f7286c[i6]);
        }
    }

    void r(int i5, Object obj) {
        a();
        b();
        int[] iArr = this.f7285b;
        int i6 = this.f7284a;
        iArr[i6] = i5;
        this.f7286c[i6] = obj;
        this.f7284a = i6 + 1;
    }

    public void s(CodedOutputStream codedOutputStream) throws IOException {
        for (int i5 = 0; i5 < this.f7284a; i5++) {
            codedOutputStream.Y1(q4.a(this.f7285b[i5]), (w) this.f7286c[i5]);
        }
    }

    void t(s4 s4Var) throws IOException {
        if (s4Var.j() == s4.a.DESCENDING) {
            for (int i5 = this.f7284a - 1; i5 >= 0; i5--) {
                s4Var.c(q4.a(this.f7285b[i5]), this.f7286c[i5]);
            }
            return;
        }
        for (int i6 = 0; i6 < this.f7284a; i6++) {
            s4Var.c(q4.a(this.f7285b[i6]), this.f7286c[i6]);
        }
    }

    public void v(CodedOutputStream codedOutputStream) throws IOException {
        for (int i5 = 0; i5 < this.f7284a; i5++) {
            int i6 = this.f7285b[i5];
            int a6 = q4.a(i6);
            int i7 = i6 & 7;
            if (i7 == 0) {
                codedOutputStream.p(a6, ((Long) this.f7286c[i5]).longValue());
            } else if (i7 == 1) {
                codedOutputStream.i(a6, ((Long) this.f7286c[i5]).longValue());
            } else if (i7 == 2) {
                codedOutputStream.z(a6, (w) this.f7286c[i5]);
            } else if (i7 == 3) {
                codedOutputStream.g2(a6, 3);
                ((j4) this.f7286c[i5]).v(codedOutputStream);
                codedOutputStream.g2(a6, 4);
            } else {
                if (i7 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                codedOutputStream.d(a6, ((Integer) this.f7286c[i5]).intValue());
            }
        }
    }

    public void w(s4 s4Var) throws IOException {
        if (this.f7284a == 0) {
            return;
        }
        if (s4Var.j() == s4.a.ASCENDING) {
            for (int i5 = 0; i5 < this.f7284a; i5++) {
                u(this.f7285b[i5], this.f7286c[i5], s4Var);
            }
            return;
        }
        for (int i6 = this.f7284a - 1; i6 >= 0; i6--) {
            u(this.f7285b[i6], this.f7286c[i6], s4Var);
        }
    }

    private j4(int i5, int[] iArr, Object[] objArr, boolean z5) {
        this.f7287d = -1;
        this.f7284a = i5;
        this.f7285b = iArr;
        this.f7286c = objArr;
        this.f7288e = z5;
    }
}
