package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.v4;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes3.dex */
public final class m4 {

    /* renamed from: f, reason: collision with root package name */
    private static final int f28764f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final m4 f28765g = new m4(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f28766a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f28767b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f28768c;

    /* renamed from: d, reason: collision with root package name */
    private int f28769d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28770e;

    private m4() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i4 = this.f28766a;
        int[] iArr = this.f28767b;
        if (i4 == iArr.length) {
            int i5 = i4 + (i4 < 4 ? 8 : i4 >> 1);
            this.f28767b = Arrays.copyOf(iArr, i5);
            this.f28768c = Arrays.copyOf(this.f28768c, i5);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (iArr[i5] != iArr2[i5]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (!objArr[i5].equals(objArr2[i5])) {
                return false;
            }
        }
        return true;
    }

    public static m4 e() {
        return f28765g;
    }

    private static int h(int[] iArr, int i4) {
        int i5 = 17;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        return i5;
    }

    private static int i(Object[] objArr, int i4) {
        int i5 = 17;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 = (i5 * 31) + objArr[i6].hashCode();
        }
        return i5;
    }

    private m4 l(z zVar) throws IOException {
        int Y;
        do {
            Y = zVar.Y();
            if (Y == 0) {
                break;
            }
        } while (k(Y, zVar));
        return this;
    }

    static m4 o(m4 m4Var, m4 m4Var2) {
        int i4 = m4Var.f28766a + m4Var2.f28766a;
        int[] copyOf = Arrays.copyOf(m4Var.f28767b, i4);
        System.arraycopy(m4Var2.f28767b, 0, copyOf, m4Var.f28766a, m4Var2.f28766a);
        Object[] copyOf2 = Arrays.copyOf(m4Var.f28768c, i4);
        System.arraycopy(m4Var2.f28768c, 0, copyOf2, m4Var.f28766a, m4Var2.f28766a);
        return new m4(i4, copyOf, copyOf2, true);
    }

    static m4 p() {
        return new m4();
    }

    private static void u(int i4, Object obj, v4 v4Var) throws IOException {
        int a5 = t4.a(i4);
        int i5 = i4 & 7;
        if (i5 == 0) {
            v4Var.D(a5, ((Long) obj).longValue());
            return;
        }
        if (i5 == 1) {
            v4Var.y(a5, ((Long) obj).longValue());
            return;
        }
        if (i5 == 2) {
            v4Var.k(a5, (w) obj);
            return;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.e());
            }
            v4Var.c(a5, ((Integer) obj).intValue());
        } else if (v4Var.z() == v4.a.ASCENDING) {
            v4Var.G(a5);
            ((m4) obj).w(v4Var);
            v4Var.M(a5);
        } else {
            v4Var.M(a5);
            ((m4) obj).w(v4Var);
            v4Var.G(a5);
        }
    }

    void a() {
        if (!this.f28770e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        int i4 = this.f28766a;
        return i4 == m4Var.f28766a && c(this.f28767b, m4Var.f28767b, i4) && d(this.f28768c, m4Var.f28768c, this.f28766a);
    }

    public int f() {
        int a12;
        int i4 = this.f28769d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f28766a; i6++) {
            int i7 = this.f28767b[i6];
            int a5 = t4.a(i7);
            int i10 = i7 & 7;
            if (i10 == 0) {
                a12 = CodedOutputStream.a1(a5, ((Long) this.f28768c[i6]).longValue());
            } else if (i10 == 1) {
                a12 = CodedOutputStream.o0(a5, ((Long) this.f28768c[i6]).longValue());
            } else if (i10 == 2) {
                a12 = CodedOutputStream.g0(a5, (w) this.f28768c[i6]);
            } else if (i10 == 3) {
                i5 = ((m4) this.f28768c[i6]).f() + (CodedOutputStream.X0(a5) * 2) + i5;
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                a12 = CodedOutputStream.m0(a5, ((Integer) this.f28768c[i6]).intValue());
            }
            i5 = a12 + i5;
        }
        this.f28769d = i5;
        return i5;
    }

    public int g() {
        int i4 = this.f28769d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f28766a; i6++) {
            i5 += CodedOutputStream.K0(t4.a(this.f28767b[i6]), (w) this.f28768c[i6]);
        }
        this.f28769d = i5;
        return i5;
    }

    public int hashCode() {
        int i4 = this.f28766a;
        return ((((527 + i4) * 31) + h(this.f28767b, i4)) * 31) + i(this.f28768c, this.f28766a);
    }

    public void j() {
        this.f28770e = false;
    }

    boolean k(int i4, z zVar) throws IOException {
        a();
        int a5 = t4.a(i4);
        int i5 = i4 & 7;
        if (i5 == 0) {
            r(i4, Long.valueOf(zVar.G()));
            return true;
        }
        if (i5 == 1) {
            r(i4, Long.valueOf(zVar.B()));
            return true;
        }
        if (i5 == 2) {
            r(i4, zVar.x());
            return true;
        }
        if (i5 == 3) {
            m4 m4Var = new m4();
            m4Var.l(zVar);
            zVar.a((a5 << 3) | 4);
            r(i4, m4Var);
            return true;
        }
        if (i5 == 4) {
            return false;
        }
        if (i5 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        r(i4, Integer.valueOf(zVar.A()));
        return true;
    }

    m4 m(int i4, w wVar) {
        a();
        if (i4 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(t4.c(i4, 2), wVar);
        return this;
    }

    m4 n(int i4, int i5) {
        a();
        if (i4 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(t4.c(i4, 0), Long.valueOf(i5));
        return this;
    }

    final void q(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.f28766a; i5++) {
            k2.c(sb, i4, String.valueOf(t4.a(this.f28767b[i5])), this.f28768c[i5]);
        }
    }

    void r(int i4, Object obj) {
        a();
        b();
        int[] iArr = this.f28767b;
        int i5 = this.f28766a;
        iArr[i5] = i4;
        this.f28768c[i5] = obj;
        this.f28766a = i5 + 1;
    }

    public void s(CodedOutputStream codedOutputStream) throws IOException {
        for (int i4 = 0; i4 < this.f28766a; i4++) {
            codedOutputStream.Y1(t4.a(this.f28767b[i4]), (w) this.f28768c[i4]);
        }
    }

    void t(v4 v4Var) throws IOException {
        if (v4Var.z() == v4.a.DESCENDING) {
            for (int i4 = this.f28766a - 1; i4 >= 0; i4--) {
                v4Var.b(t4.a(this.f28767b[i4]), this.f28768c[i4]);
            }
            return;
        }
        for (int i5 = 0; i5 < this.f28766a; i5++) {
            v4Var.b(t4.a(this.f28767b[i5]), this.f28768c[i5]);
        }
    }

    public void v(CodedOutputStream codedOutputStream) throws IOException {
        for (int i4 = 0; i4 < this.f28766a; i4++) {
            int i5 = this.f28767b[i4];
            int a5 = t4.a(i5);
            int i6 = i5 & 7;
            if (i6 == 0) {
                codedOutputStream.h(a5, ((Long) this.f28768c[i4]).longValue());
            } else if (i6 == 1) {
                codedOutputStream.y(a5, ((Long) this.f28768c[i4]).longValue());
            } else if (i6 == 2) {
                codedOutputStream.k(a5, (w) this.f28768c[i4]);
            } else if (i6 == 3) {
                codedOutputStream.g2(a5, 3);
                ((m4) this.f28768c[i4]).v(codedOutputStream);
                codedOutputStream.g2(a5, 4);
            } else {
                if (i6 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                codedOutputStream.c(a5, ((Integer) this.f28768c[i4]).intValue());
            }
        }
    }

    public void w(v4 v4Var) throws IOException {
        if (this.f28766a == 0) {
            return;
        }
        if (v4Var.z() == v4.a.ASCENDING) {
            for (int i4 = 0; i4 < this.f28766a; i4++) {
                u(this.f28767b[i4], this.f28768c[i4], v4Var);
            }
            return;
        }
        for (int i5 = this.f28766a - 1; i5 >= 0; i5--) {
            u(this.f28767b[i5], this.f28768c[i5], v4Var);
        }
    }

    private m4(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.f28769d = -1;
        this.f28766a = i4;
        this.f28767b = iArr;
        this.f28768c = objArr;
        this.f28770e = z4;
    }
}
