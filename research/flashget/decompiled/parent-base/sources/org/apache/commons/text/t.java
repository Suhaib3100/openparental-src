package org.apache.commons.text;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.b1;

/* compiled from: TextStringBuilder.java */
/* loaded from: classes3.dex */
public class t implements CharSequence, Appendable, Serializable, org.apache.commons.text.b<String> {

    /* renamed from: g, reason: collision with root package name */
    private static final char f86670g = ' ';

    /* renamed from: h, reason: collision with root package name */
    static final int f86671h = 32;

    /* renamed from: i, reason: collision with root package name */
    private static final int f86672i = -1;

    /* renamed from: k, reason: collision with root package name */
    private static final long f86674k = 1;

    /* renamed from: b, reason: collision with root package name */
    private char[] f86676b;

    /* renamed from: c, reason: collision with root package name */
    private String f86677c;

    /* renamed from: d, reason: collision with root package name */
    private String f86678d;

    /* renamed from: e, reason: collision with root package name */
    private int f86679e;

    /* renamed from: f, reason: collision with root package name */
    private int f86680f;

    /* renamed from: j, reason: collision with root package name */
    private static final int f86673j = Boolean.FALSE.toString().length();

    /* renamed from: l, reason: collision with root package name */
    private static final int f86675l = Boolean.TRUE.toString().length();

    /* compiled from: TextStringBuilder.java */
    class b extends r {
        b() {
        }

        @Override // org.apache.commons.text.r
        protected List<String> Y(char[] cArr, int i4, int i5) {
            return cArr == null ? super.Y(t.this.M0(), 0, t.this.N1()) : super.Y(cArr, i4, i5);
        }

        @Override // org.apache.commons.text.r
        public String l() {
            String l4 = super.l();
            return l4 == null ? t.this.toString() : l4;
        }
    }

    /* compiled from: TextStringBuilder.java */
    class c extends Writer {
        c() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            t.this.y(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i4, int i5) {
            t.this.z(cArr, i4, i5);
        }

        @Override // java.io.Writer
        public void write(int i4) {
            t.this.append((char) i4);
        }

        @Override // java.io.Writer
        public void write(String str) {
            t.this.m(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i4, int i5) {
            t.this.n(str, i4, i5);
        }
    }

    public t() {
        this(32);
    }

    private void D(int i4) {
        char[] cArr = this.f86676b;
        cArr[i4] = 'f';
        cArr[i4 + 1] = 'a';
        cArr[i4 + 2] = 'l';
        cArr[i4 + 3] = 's';
        cArr[i4 + 4] = 'e';
        this.f86680f += f86673j;
    }

    private t E1(org.apache.commons.text.matcher.b bVar, String str, int i4, int i5, int i6) {
        if (bVar != null && this.f86680f != 0) {
            int length = str == null ? 0 : str.length();
            int i7 = i4;
            while (i7 < i5 && i6 != 0) {
                int b5 = bVar.b(this.f86676b, i7, i4, i5);
                if (b5 > 0) {
                    F1(i7, i7 + b5, b5, str, length);
                    i5 = (i5 - b5) + length;
                    i7 = (i7 + length) - 1;
                    if (i6 > 0) {
                        i6--;
                    }
                }
                i7++;
            }
        }
        return this;
    }

    private void F0(int i4, int i5, int i6) {
        char[] cArr = this.f86676b;
        System.arraycopy(cArr, i5, cArr, i4, this.f86680f - i5);
        this.f86680f -= i6;
    }

    private void F1(int i4, int i5, int i6, String str, int i7) {
        int i10 = (this.f86680f - i6) + i7;
        if (i7 != i6) {
            J0(i10);
            char[] cArr = this.f86676b;
            System.arraycopy(cArr, i5, cArr, i4 + i7, this.f86680f - i5);
            this.f86680f = i10;
        }
        if (i7 > 0) {
            str.getChars(0, i7, this.f86676b, i4);
        }
    }

    private void S(int i4) {
        char[] cArr = this.f86676b;
        cArr[i4] = 't';
        cArr[i4 + 1] = 'r';
        cArr[i4 + 2] = 'u';
        cArr[i4 + 3] = 'e';
        this.f86680f += f86675l;
    }

    public static t Y1(char[] cArr) {
        Objects.requireNonNull(cArr, "initialBuffer");
        return new t(cArr, cArr.length);
    }

    public static t Z1(char[] cArr, int i4) {
        return new t(cArr, i4);
    }

    private void v1(int i4) {
        this.f86676b = Arrays.copyOf(this.f86676b, i4);
        this.f86679e++;
    }

    public t A(Iterable<?> iterable) {
        if (iterable != null) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                l(it.next());
            }
        }
        return this;
    }

    public t A0(org.apache.commons.text.matcher.b bVar) {
        return x1(bVar, null, 0, this.f86680f, -1);
    }

    public t A1(org.apache.commons.text.matcher.b bVar, String str) {
        return x1(bVar, str, 0, this.f86680f, -1);
    }

    public t B(Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                l(it.next());
            }
        }
        return this;
    }

    public t B0(int i4) {
        W1(i4);
        F0(i4, i4 + 1, 1);
        return this;
    }

    public t B1(char c5, char c6) {
        if (c5 != c6) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.f86680f) {
                    break;
                }
                char[] cArr = this.f86676b;
                if (cArr[i4] == c5) {
                    cArr[i4] = c6;
                    break;
                }
                i4++;
            }
        }
        return this;
    }

    public <T> t C(T... tArr) {
        if (tArr != null && tArr.length > 0) {
            for (T t4 : tArr) {
                l(t4);
            }
        }
        return this;
    }

    public t C0(char c5) {
        int i4 = 0;
        while (true) {
            if (i4 >= this.f86680f) {
                break;
            }
            if (this.f86676b[i4] == c5) {
                F0(i4, i4 + 1, 1);
                break;
            }
            i4++;
        }
        return this;
    }

    public t C1(String str, String str2) {
        int T0;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (T0 = T0(str, 0)) >= 0) {
            F1(T0, T0 + length, length, str2, str2 != null ? str2.length() : 0);
        }
        return this;
    }

    public t D0(String str) {
        int T0;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (T0 = T0(str, 0)) >= 0) {
            F0(T0, T0 + length, length);
        }
        return this;
    }

    public t D1(org.apache.commons.text.matcher.b bVar, String str) {
        return x1(bVar, str, 0, this.f86680f, 1);
    }

    public t E(int i4, int i5, char c5) {
        return F(String.valueOf(i4), i5, c5);
    }

    public t E0(org.apache.commons.text.matcher.b bVar) {
        return x1(bVar, null, 0, this.f86680f, 1);
    }

    public t F(Object obj, int i4, char c5) {
        if (i4 > 0) {
            J0(this.f86680f + i4);
            String P0 = obj == null ? P0() : obj.toString();
            if (P0 == null) {
                P0 = "";
            }
            int length = P0.length();
            if (length >= i4) {
                P0.getChars(length - i4, length, this.f86676b, this.f86680f);
            } else {
                int i5 = i4 - length;
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f86676b[this.f86680f + i6] = c5;
                }
                P0.getChars(0, length, this.f86676b, this.f86680f + i5);
            }
            this.f86680f += i4;
        }
        return this;
    }

    public t G(int i4, int i5, char c5) {
        return H(String.valueOf(i4), i5, c5);
    }

    public char G0(int i4) {
        W1(i4);
        char c5 = this.f86676b[i4];
        B0(i4);
        return c5;
    }

    public t G1() {
        int i4 = this.f86680f;
        if (i4 == 0) {
            return this;
        }
        int i5 = i4 / 2;
        char[] cArr = this.f86676b;
        int i6 = i4 - 1;
        int i7 = 0;
        while (i7 < i5) {
            char c5 = cArr[i7];
            cArr[i7] = cArr[i6];
            cArr[i6] = c5;
            i7++;
            i6--;
        }
        return this;
    }

    public t H(Object obj, int i4, char c5) {
        if (i4 > 0) {
            J0(this.f86680f + i4);
            String P0 = obj == null ? P0() : obj.toString();
            if (P0 == null) {
                P0 = "";
            }
            int length = P0.length();
            if (length >= i4) {
                P0.getChars(0, i4, this.f86676b, this.f86680f);
            } else {
                int i5 = i4 - length;
                P0.getChars(0, length, this.f86676b, this.f86680f);
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f86676b[this.f86680f + length + i6] = c5;
                }
            }
            this.f86680f += i4;
        }
        return this;
    }

    public int H0(int i4, int i5, char[] cArr, int i6) {
        int i7 = i5 - i4;
        if (isEmpty() || i7 == 0 || cArr.length == 0) {
            return 0;
        }
        int min = Math.min(Math.min(this.f86680f, i7), cArr.length - i6);
        getChars(i4, min, cArr, i6);
        x0(i4, min);
        return min;
    }

    public String H1(int i4) {
        if (i4 <= 0) {
            return "";
        }
        int i5 = this.f86680f;
        return i4 >= i5 ? new String(this.f86676b, 0, i5) : new String(this.f86676b, i5 - i4, i4);
    }

    public t I() {
        String str = this.f86677c;
        if (str != null) {
            return m(str);
        }
        m(System.lineSeparator());
        return this;
    }

    public boolean I0(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        int i4 = this.f86680f;
        if (length > i4) {
            return false;
        }
        int i5 = i4 - length;
        int i6 = 0;
        while (i6 < length) {
            if (this.f86676b[i5] != str.charAt(i6)) {
                return false;
            }
            i6++;
            i5++;
        }
        return true;
    }

    public t I1(CharSequence charSequence) {
        t0();
        append(charSequence);
        return this;
    }

    public t J() {
        String str = this.f86678d;
        return str == null ? this : m(str);
    }

    public t J0(int i4) {
        if (i4 > this.f86676b.length) {
            v1(i4 * 2);
        }
        return this;
    }

    public t J1(int i4, char c5) {
        W1(i4);
        this.f86676b[i4] = c5;
        return this;
    }

    public t K(int i4, char c5) {
        if (i4 >= 0) {
            J0(this.f86680f + i4);
            for (int i5 = 0; i5 < i4; i5++) {
                char[] cArr = this.f86676b;
                int i6 = this.f86680f;
                this.f86680f = i6 + 1;
                cArr[i6] = c5;
            }
        }
        return this;
    }

    public boolean K0(t tVar) {
        return tVar != null && Arrays.equals(this.f86676b, tVar.f86676b);
    }

    public t K1(int i4) {
        if (i4 < 0) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        int i5 = this.f86680f;
        if (i4 < i5) {
            this.f86680f = i4;
        } else if (i4 > i5) {
            J0(i4);
            int i6 = this.f86680f;
            this.f86680f = i4;
            Arrays.fill(this.f86676b, i6, i4, (char) 0);
        }
        return this;
    }

    public t L(char c5) {
        if (g1()) {
            append(c5);
        }
        return this;
    }

    public boolean L0(t tVar) {
        if (this == tVar) {
            return true;
        }
        int i4 = this.f86680f;
        if (i4 != tVar.f86680f) {
            return false;
        }
        char[] cArr = this.f86676b;
        char[] cArr2 = tVar.f86676b;
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            char c5 = cArr[i5];
            char c6 = cArr2[i5];
            if (c5 != c6 && Character.toUpperCase(c5) != Character.toUpperCase(c6)) {
                return false;
            }
        }
        return true;
    }

    public t L1(String str) {
        this.f86677c = str;
        return this;
    }

    public t M(char c5, char c6) {
        if (isEmpty()) {
            append(c6);
        } else {
            append(c5);
        }
        return this;
    }

    char[] M0() {
        return this.f86676b;
    }

    public t M1(String str) {
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.f86678d = str;
        return this;
    }

    public t N(char c5, int i4) {
        if (i4 > 0) {
            append(c5);
        }
        return this;
    }

    public char[] N0(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.f86676b, 0, cArr, 0, length);
        return cArr;
    }

    public int N1() {
        return this.f86680f;
    }

    public t O(String str) {
        return Q(str, null);
    }

    public String O0() {
        return this.f86677c;
    }

    public boolean O1(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.f86680f) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (this.f86676b[i4] != str.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    public t P(String str, int i4) {
        if (str != null && i4 > 0) {
            m(str);
        }
        return this;
    }

    public String P0() {
        return this.f86678d;
    }

    public String P1(int i4) {
        return Q1(i4, this.f86680f);
    }

    public t Q(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            m(str);
        }
        return this;
    }

    public int Q0(char c5) {
        return R0(c5, 0);
    }

    public String Q1(int i4, int i5) {
        return new String(this.f86676b, i4, X1(i4, i5) - i4);
    }

    public void R(Appendable appendable) throws IOException {
        if (appendable instanceof Writer) {
            ((Writer) appendable).write(this.f86676b, 0, this.f86680f);
            return;
        }
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(this.f86676b, 0, this.f86680f);
            return;
        }
        if (appendable instanceof StringBuffer) {
            ((StringBuffer) appendable).append(this.f86676b, 0, this.f86680f);
        } else if (appendable instanceof CharBuffer) {
            ((CharBuffer) appendable).put(this.f86676b, 0, this.f86680f);
        } else {
            appendable.append(this);
        }
    }

    public int R0(char c5, int i4) {
        int max = Math.max(0, i4);
        if (max >= this.f86680f) {
            return -1;
        }
        char[] cArr = this.f86676b;
        while (max < this.f86680f) {
            if (cArr[max] == c5) {
                return max;
            }
            max++;
        }
        return -1;
    }

    public char[] R1() {
        int i4 = this.f86680f;
        return i4 == 0 ? org.apache.commons.lang3.e.f85953e : Arrays.copyOf(this.f86676b, i4);
    }

    public int S0(String str) {
        return T0(str, 0);
    }

    public char[] S1(int i4, int i5) {
        int X1 = X1(i4, i5);
        return X1 - i4 == 0 ? org.apache.commons.lang3.e.f85953e : Arrays.copyOfRange(this.f86676b, i4, X1);
    }

    public t T(Iterable<?> iterable, String str) {
        if (iterable != null) {
            String objects = Objects.toString(str, "");
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                l(it.next());
                if (it.hasNext()) {
                    m(objects);
                }
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int T0(java.lang.String r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            int r10 = java.lang.Math.max(r0, r10)
            r1 = -1
            if (r9 == 0) goto L3f
            int r2 = r8.f86680f
            if (r10 < r2) goto Ld
            goto L3f
        Ld:
            int r2 = r9.length()
            r3 = 1
            if (r2 != r3) goto L1d
            char r9 = r9.charAt(r0)
            int r9 = r8.R0(r9, r10)
            return r9
        L1d:
            if (r2 != 0) goto L20
            return r10
        L20:
            int r4 = r8.f86680f
            if (r2 <= r4) goto L25
            return r1
        L25:
            char[] r5 = r8.f86676b
            int r4 = r4 - r2
            int r4 = r4 + r3
        L29:
            if (r10 >= r4) goto L3f
            r3 = r0
        L2c:
            if (r3 >= r2) goto L3e
            char r6 = r9.charAt(r3)
            int r7 = r10 + r3
            char r7 = r5[r7]
            if (r6 == r7) goto L3b
            int r10 = r10 + 1
            goto L29
        L3b:
            int r3 = r3 + 1
            goto L2c
        L3e:
            return r10
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.t.T0(java.lang.String, int):int");
    }

    public StringBuffer T1() {
        StringBuffer stringBuffer = new StringBuffer(this.f86680f);
        stringBuffer.append(this.f86676b, 0, this.f86680f);
        return stringBuffer;
    }

    public t U(Iterator<?> it, String str) {
        if (it != null) {
            String objects = Objects.toString(str, "");
            while (it.hasNext()) {
                l(it.next());
                if (it.hasNext()) {
                    m(objects);
                }
            }
        }
        return this;
    }

    public int U0(org.apache.commons.text.matcher.b bVar) {
        return V0(bVar, 0);
    }

    public StringBuilder U1() {
        StringBuilder sb = new StringBuilder(this.f86680f);
        sb.append(this.f86676b, 0, this.f86680f);
        return sb;
    }

    public t V(Object[] objArr, String str) {
        if (objArr != null && objArr.length > 0) {
            String objects = Objects.toString(str, "");
            l(objArr[0]);
            for (int i4 = 1; i4 < objArr.length; i4++) {
                m(objects);
                l(objArr[i4]);
            }
        }
        return this;
    }

    public int V0(org.apache.commons.text.matcher.b bVar, int i4) {
        int i5;
        int max = Math.max(0, i4);
        if (bVar != null && max < (i5 = this.f86680f)) {
            char[] cArr = this.f86676b;
            for (int i6 = max; i6 < i5; i6++) {
                if (bVar.b(cArr, i6, max, i5) > 0) {
                    return i6;
                }
            }
        }
        return -1;
    }

    public t V1() {
        int i4 = this.f86680f;
        if (i4 == 0) {
            return this;
        }
        char[] cArr = this.f86676b;
        int i5 = 0;
        while (i5 < i4 && cArr[i5] <= ' ') {
            i5++;
        }
        while (i5 < i4 && cArr[i4 - 1] <= ' ') {
            i4--;
        }
        int i6 = this.f86680f;
        if (i4 < i6) {
            x0(i4, i6);
        }
        if (i5 > 0) {
            x0(0, i5);
        }
        return this;
    }

    public t W(char c5) {
        return append(c5).I();
    }

    public t W0(int i4, char c5) {
        W1(i4);
        J0(this.f86680f + 1);
        char[] cArr = this.f86676b;
        System.arraycopy(cArr, i4, cArr, i4 + 1, this.f86680f - i4);
        this.f86676b[i4] = c5;
        this.f86680f++;
        return this;
    }

    protected void W1(int i4) {
        if (i4 < 0 || i4 >= this.f86680f) {
            throw new StringIndexOutOfBoundsException(i4);
        }
    }

    public t X(double d5) {
        return f(d5).I();
    }

    public t X0(int i4, double d5) {
        return c1(i4, String.valueOf(d5));
    }

    protected int X1(int i4, int i5) {
        if (i4 < 0) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        int i6 = this.f86680f;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i4 <= i5) {
            return i5;
        }
        throw new StringIndexOutOfBoundsException("end < start");
    }

    public t Y(float f4) {
        return g(f4).I();
    }

    public t Y0(int i4, float f4) {
        return c1(i4, String.valueOf(f4));
    }

    public t Z(int i4) {
        return h(i4).I();
    }

    public t Z0(int i4, int i5) {
        return c1(i4, String.valueOf(i5));
    }

    public t a0(long j4) {
        return i(j4).I();
    }

    public t a1(int i4, long j4) {
        return c1(i4, String.valueOf(j4));
    }

    public t b0(Object obj) {
        return l(obj).I();
    }

    public t b1(int i4, Object obj) {
        return obj == null ? c1(i4, this.f86678d) : c1(i4, obj.toString());
    }

    public t c0(String str) {
        return m(str).I();
    }

    public t c1(int i4, String str) {
        int length;
        W1(i4);
        if (str == null) {
            str = this.f86678d;
        }
        if (str != null && (length = str.length()) > 0) {
            int i5 = this.f86680f + length;
            J0(i5);
            char[] cArr = this.f86676b;
            System.arraycopy(cArr, i4, cArr, i4 + length, this.f86680f - i4);
            this.f86680f = i5;
            str.getChars(0, length, this.f86676b, i4);
        }
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        W1(i4);
        return this.f86676b[i4];
    }

    public t d0(String str, int i4, int i5) {
        return n(str, i4, i5).I();
    }

    public t d1(int i4, boolean z4) {
        W1(i4);
        if (z4) {
            int i5 = this.f86680f;
            int i6 = f86675l;
            J0(i5 + i6);
            char[] cArr = this.f86676b;
            System.arraycopy(cArr, i4, cArr, i6 + i4, this.f86680f - i4);
            S(i4);
        } else {
            int i7 = this.f86680f;
            int i10 = f86673j;
            J0(i7 + i10);
            char[] cArr2 = this.f86676b;
            System.arraycopy(cArr2, i4, cArr2, i10 + i4, this.f86680f - i4);
            D(i4);
        }
        return this;
    }

    @Override // java.lang.Appendable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public t append(char c5) {
        J0(length() + 1);
        char[] cArr = this.f86676b;
        int i4 = this.f86680f;
        this.f86680f = i4 + 1;
        cArr[i4] = c5;
        return this;
    }

    public t e0(String str, Object... objArr) {
        return o(str, objArr).I();
    }

    public t e1(int i4, char[] cArr) {
        W1(i4);
        if (cArr == null) {
            return c1(i4, this.f86678d);
        }
        int length = cArr.length;
        if (length > 0) {
            J0(this.f86680f + length);
            char[] cArr2 = this.f86676b;
            System.arraycopy(cArr2, i4, cArr2, i4 + length, this.f86680f - i4);
            System.arraycopy(cArr, 0, this.f86676b, i4, length);
            this.f86680f += length;
        }
        return this;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && K0((t) obj);
    }

    public t f(double d5) {
        return m(String.valueOf(d5));
    }

    public t f0(StringBuffer stringBuffer) {
        return p(stringBuffer).I();
    }

    public t f1(int i4, char[] cArr, int i5, int i6) {
        W1(i4);
        if (cArr == null) {
            return c1(i4, this.f86678d);
        }
        if (i5 < 0 || i5 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid offset: ", i5));
        }
        if (i6 < 0 || i5 + i6 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid length: ", i6));
        }
        if (i6 > 0) {
            J0(this.f86680f + i6);
            char[] cArr2 = this.f86676b;
            System.arraycopy(cArr2, i4, cArr2, i4 + i6, this.f86680f - i4);
            System.arraycopy(cArr, i5, this.f86676b, i4, i6);
            this.f86680f += i6;
        }
        return this;
    }

    public t g(float f4) {
        return m(String.valueOf(f4));
    }

    public t g0(StringBuffer stringBuffer, int i4, int i5) {
        return q(stringBuffer, i4, i5).I();
    }

    public boolean g1() {
        return this.f86680f != 0;
    }

    public void getChars(int i4, int i5, char[] cArr, int i6) {
        if (i4 < 0) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        if (i5 < 0 || i5 > length()) {
            throw new StringIndexOutOfBoundsException(i5);
        }
        if (i4 > i5) {
            throw new StringIndexOutOfBoundsException("end < start");
        }
        System.arraycopy(this.f86676b, i4, cArr, i6, i5 - i4);
    }

    public t h(int i4) {
        return m(String.valueOf(i4));
    }

    public t h0(StringBuilder sb) {
        return r(sb).I();
    }

    public boolean h1() {
        return this.f86679e > 0;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f86676b);
    }

    public t i(long j4) {
        return m(String.valueOf(j4));
    }

    public t i0(StringBuilder sb, int i4, int i5) {
        return s(sb, i4, i5).I();
    }

    public int i1(char c5) {
        return j1(c5, this.f86680f - 1);
    }

    public boolean isEmpty() {
        return this.f86680f == 0;
    }

    @Override // java.lang.Appendable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public t append(CharSequence charSequence) {
        return charSequence == null ? J() : charSequence instanceof t ? v((t) charSequence) : charSequence instanceof StringBuilder ? r((StringBuilder) charSequence) : charSequence instanceof StringBuffer ? p((StringBuffer) charSequence) : charSequence instanceof CharBuffer ? t((CharBuffer) charSequence) : m(charSequence.toString());
    }

    public t j0(t tVar) {
        return v(tVar).I();
    }

    public int j1(char c5, int i4) {
        int i5 = this.f86680f;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        if (i4 < 0) {
            return -1;
        }
        while (i4 >= 0) {
            if (this.f86676b[i4] == c5) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Override // java.lang.Appendable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public t append(CharSequence charSequence, int i4, int i5) {
        if (charSequence == null) {
            return J();
        }
        if (i5 <= 0) {
            throw new StringIndexOutOfBoundsException("endIndex must be valid");
        }
        if (i4 < i5) {
            return n(charSequence.toString(), i4, i5 - i4);
        }
        throw new StringIndexOutOfBoundsException("endIndex must be greater than startIndex");
    }

    public t k0(t tVar, int i4, int i5) {
        return w(tVar, i4, i5).I();
    }

    public int k1(String str) {
        return l1(str, this.f86680f - 1);
    }

    public t l(Object obj) {
        return obj == null ? J() : obj instanceof CharSequence ? append((CharSequence) obj) : m(obj.toString());
    }

    public t l0(boolean z4) {
        return x(z4).I();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        r9 = r9 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l1(java.lang.String r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.f86680f
            r1 = 1
            if (r9 < r0) goto L7
            int r9 = r0 + (-1)
        L7:
            r0 = -1
            if (r8 == 0) goto L40
            if (r9 >= 0) goto Ld
            goto L40
        Ld:
            int r2 = r8.length()
            if (r2 <= 0) goto L3d
            int r3 = r7.f86680f
            if (r2 > r3) goto L3d
            r3 = 0
            if (r2 != r1) goto L23
            char r8 = r8.charAt(r3)
            int r8 = r7.j1(r8, r9)
            return r8
        L23:
            int r9 = r9 - r2
            int r9 = r9 + r1
        L25:
            if (r9 < 0) goto L40
            r1 = r3
        L28:
            if (r1 >= r2) goto L3c
            char r4 = r8.charAt(r1)
            char[] r5 = r7.f86676b
            int r6 = r9 + r1
            char r5 = r5[r6]
            if (r4 == r5) goto L39
            int r9 = r9 + (-1)
            goto L25
        L39:
            int r1 = r1 + 1
            goto L28
        L3c:
            return r9
        L3d:
            if (r2 != 0) goto L40
            return r9
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.t.l1(java.lang.String, int):int");
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f86680f;
    }

    public t m(String str) {
        return n(str, 0, b1.B1(str));
    }

    public t m0(char[] cArr) {
        return y(cArr).I();
    }

    public int m1(org.apache.commons.text.matcher.b bVar) {
        return n1(bVar, this.f86680f);
    }

    public t n(String str, int i4, int i5) {
        int i6;
        if (str == null) {
            return J();
        }
        if (i4 < 0 || i4 > str.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i5 < 0 || (i6 = i4 + i5) > str.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i5 > 0) {
            int length = length();
            J0(length + i5);
            str.getChars(i4, i6, this.f86676b, length);
            this.f86680f += i5;
        }
        return this;
    }

    public t n0(char[] cArr, int i4, int i5) {
        return z(cArr, i4, i5).I();
    }

    public int n1(org.apache.commons.text.matcher.b bVar, int i4) {
        int i5 = this.f86680f;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        if (bVar != null && i4 >= 0) {
            char[] cArr = this.f86676b;
            int i6 = i4 + 1;
            while (i4 >= 0) {
                if (bVar.b(cArr, i4, 0, i6) > 0) {
                    return i4;
                }
                i4--;
            }
        }
        return -1;
    }

    public t o(String str, Object... objArr) {
        return m(String.format(str, objArr));
    }

    public Reader o0() {
        return new a();
    }

    public String o1(int i4) {
        if (i4 <= 0) {
            return "";
        }
        int i5 = this.f86680f;
        return i4 >= i5 ? new String(this.f86676b, 0, i5) : new String(this.f86676b, 0, i4);
    }

    public t p(StringBuffer stringBuffer) {
        return q(stringBuffer, 0, b1.B1(stringBuffer));
    }

    public r p0() {
        return new b();
    }

    public String p1(int i4, int i5) {
        int i6;
        if (i4 < 0) {
            i4 = 0;
        }
        return (i5 <= 0 || i4 >= (i6 = this.f86680f)) ? "" : i6 <= i4 + i5 ? new String(this.f86676b, i4, i6 - i4) : new String(this.f86676b, i4, i5);
    }

    public t q(StringBuffer stringBuffer, int i4, int i5) {
        int i6;
        if (stringBuffer == null) {
            return J();
        }
        if (i4 < 0 || i4 > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i5 < 0 || (i6 = i4 + i5) > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i5 > 0) {
            int length = length();
            J0(length + i5);
            stringBuffer.getChars(i4, i6, this.f86676b, length);
            this.f86680f += i5;
        }
        return this;
    }

    public Writer q0() {
        return new c();
    }

    public t q1() {
        int length = this.f86676b.length;
        int i4 = this.f86680f;
        if (length > i4) {
            v1(i4);
        }
        return this;
    }

    public t r(StringBuilder sb) {
        return s(sb, 0, b1.B1(sb));
    }

    @Override // org.apache.commons.text.b
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public String a() {
        return toString();
    }

    public int r1(Reader reader) throws IOException {
        int i4 = this.f86680f;
        J0(i4 + 1);
        char[] cArr = this.f86676b;
        int i5 = this.f86680f;
        int read = reader.read(cArr, i5, cArr.length - i5);
        if (read == -1) {
            return -1;
        }
        do {
            int i6 = this.f86680f + read;
            this.f86680f = i6;
            J0(i6 + 1);
            char[] cArr2 = this.f86676b;
            int i7 = this.f86680f;
            read = reader.read(cArr2, i7, cArr2.length - i7);
        } while (read != -1);
        return this.f86680f - i4;
    }

    public t s(StringBuilder sb, int i4, int i5) {
        int i6;
        if (sb == null) {
            return J();
        }
        if (i4 < 0 || i4 > sb.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i5 < 0 || (i6 = i4 + i5) > sb.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i5 > 0) {
            int length = length();
            J0(length + i5);
            sb.getChars(i4, i6, this.f86676b, length);
            this.f86680f += i5;
        }
        return this;
    }

    public int s0() {
        return this.f86676b.length;
    }

    public int s1(Reader reader, int i4) throws IOException {
        if (i4 <= 0) {
            return 0;
        }
        int i5 = this.f86680f;
        J0(i5 + i4);
        int read = reader.read(this.f86676b, this.f86680f, i4);
        if (read == -1) {
            return -1;
        }
        do {
            i4 -= read;
            int i6 = this.f86680f + read;
            this.f86680f = i6;
            read = reader.read(this.f86676b, i6, i4);
            if (i4 <= 0) {
                break;
            }
        } while (read != -1);
        return this.f86680f - i5;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        if (i4 < 0) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        if (i5 > this.f86680f) {
            throw new StringIndexOutOfBoundsException(i5);
        }
        if (i4 <= i5) {
            return Q1(i4, i5);
        }
        throw new StringIndexOutOfBoundsException(i5 - i4);
    }

    public t t(CharBuffer charBuffer) {
        return u(charBuffer, 0, b1.B1(charBuffer));
    }

    public t t0() {
        this.f86680f = 0;
        return this;
    }

    public int t1(Readable readable) throws IOException {
        if (readable instanceof Reader) {
            return r1((Reader) readable);
        }
        if (readable instanceof CharBuffer) {
            return u1((CharBuffer) readable);
        }
        int i4 = this.f86680f;
        while (true) {
            J0(this.f86680f + 1);
            char[] cArr = this.f86676b;
            int i5 = this.f86680f;
            int read = readable.read(CharBuffer.wrap(cArr, i5, cArr.length - i5));
            if (read == -1) {
                return this.f86680f - i4;
            }
            this.f86680f += read;
        }
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.f86676b, 0, this.f86680f);
    }

    public t u(CharBuffer charBuffer, int i4, int i5) {
        if (charBuffer == null) {
            return J();
        }
        if (charBuffer.hasArray()) {
            int remaining = charBuffer.remaining();
            if (i4 < 0 || i4 > remaining) {
                throw new StringIndexOutOfBoundsException("startIndex must be valid");
            }
            if (i5 < 0 || i4 + i5 > remaining) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            int length = length();
            J0(length + i5);
            System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset() + i4, this.f86676b, length, i5);
            this.f86680f += i5;
        } else {
            n(charBuffer.toString(), i4, i5);
        }
        return this;
    }

    public boolean u0(char c5) {
        char[] cArr = this.f86676b;
        for (int i4 = 0; i4 < this.f86680f; i4++) {
            if (cArr[i4] == c5) {
                return true;
            }
        }
        return false;
    }

    public int u1(CharBuffer charBuffer) throws IOException {
        int i4 = this.f86680f;
        int remaining = charBuffer.remaining();
        J0(this.f86680f + remaining);
        charBuffer.get(this.f86676b, this.f86680f, remaining);
        int i5 = this.f86680f + remaining;
        this.f86680f = i5;
        return i5 - i4;
    }

    public t v(t tVar) {
        return w(tVar, 0, b1.B1(tVar));
    }

    public boolean v0(String str) {
        return T0(str, 0) >= 0;
    }

    public t w(t tVar, int i4, int i5) {
        int i6;
        if (tVar == null) {
            return J();
        }
        if (i4 < 0 || i4 > tVar.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i5 < 0 || (i6 = i4 + i5) > tVar.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i5 > 0) {
            int length = length();
            J0(length + i5);
            tVar.getChars(i4, i6, this.f86676b, length);
            this.f86680f += i5;
        }
        return this;
    }

    public boolean w0(org.apache.commons.text.matcher.b bVar) {
        return V0(bVar, 0) >= 0;
    }

    public t w1(int i4, int i5, String str) {
        int X1 = X1(i4, i5);
        F1(i4, X1, X1 - i4, str, str == null ? 0 : str.length());
        return this;
    }

    public t x(boolean z4) {
        if (z4) {
            J0(this.f86680f + f86675l);
            S(this.f86680f);
        } else {
            J0(this.f86680f + f86673j);
            D(this.f86680f);
        }
        return this;
    }

    public t x0(int i4, int i5) {
        int X1 = X1(i4, i5);
        int i6 = X1 - i4;
        if (i6 > 0) {
            F0(i4, X1, i6);
        }
        return this;
    }

    public t x1(org.apache.commons.text.matcher.b bVar, String str, int i4, int i5, int i6) {
        return E1(bVar, str, i4, X1(i4, i5), i6);
    }

    public t y(char[] cArr) {
        if (cArr == null) {
            return J();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            J0(length2 + length);
            System.arraycopy(cArr, 0, this.f86676b, length2, length);
            this.f86680f += length;
        }
        return this;
    }

    public t y0(char c5) {
        int i4 = 0;
        while (i4 < this.f86680f) {
            if (this.f86676b[i4] == c5) {
                int i5 = i4;
                do {
                    i5++;
                    if (i5 >= this.f86680f) {
                        break;
                    }
                } while (this.f86676b[i5] == c5);
                int i6 = i5 - i4;
                F0(i4, i5, i6);
                i4 = i5 - i6;
            }
            i4++;
        }
        return this;
    }

    public t y1(char c5, char c6) {
        if (c5 != c6) {
            for (int i4 = 0; i4 < this.f86680f; i4++) {
                char[] cArr = this.f86676b;
                if (cArr[i4] == c5) {
                    cArr[i4] = c6;
                }
            }
        }
        return this;
    }

    public t z(char[] cArr, int i4, int i5) {
        if (cArr == null) {
            return J();
        }
        if (i4 < 0 || i4 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid startIndex: ", i5));
        }
        if (i5 < 0 || i4 + i5 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid length: ", i5));
        }
        if (i5 > 0) {
            int length = length();
            J0(length + i5);
            System.arraycopy(cArr, i4, this.f86676b, length, i5);
            this.f86680f += i5;
        }
        return this;
    }

    public t z0(String str) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int T0 = T0(str, 0);
            while (T0 >= 0) {
                F0(T0, T0 + length, length);
                T0 = T0(str, T0);
            }
        }
        return this;
    }

    public t z1(String str, String str2) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int length2 = str2 == null ? 0 : str2.length();
            int T0 = T0(str, 0);
            while (T0 >= 0) {
                F1(T0, T0 + length, length, str2, length2);
                T0 = T0(str, T0 + length2);
            }
        }
        return this;
    }

    /* compiled from: TextStringBuilder.java */
    class a extends Reader {

        /* renamed from: b, reason: collision with root package name */
        private int f86681b;

        /* renamed from: c, reason: collision with root package name */
        private int f86682c;

        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Reader
        public void mark(int i4) {
            this.f86681b = this.f86682c;
        }

        @Override // java.io.Reader
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.Reader
        public int read() {
            if (!ready()) {
                return -1;
            }
            t tVar = t.this;
            int i4 = this.f86682c;
            this.f86682c = i4 + 1;
            return tVar.charAt(i4);
        }

        @Override // java.io.Reader
        public boolean ready() {
            return this.f86682c < t.this.N1();
        }

        @Override // java.io.Reader
        public void reset() {
            this.f86682c = this.f86681b;
        }

        @Override // java.io.Reader
        public long skip(long j4) {
            if (this.f86682c + j4 > t.this.N1()) {
                j4 = t.this.N1() - this.f86682c;
            }
            if (j4 < 0) {
                return 0L;
            }
            this.f86682c = (int) (this.f86682c + j4);
            return j4;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i4, int i5) {
            int i6;
            if (i4 < 0 || i5 < 0 || i4 > cArr.length || (i6 = i4 + i5) > cArr.length || i6 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i5 == 0) {
                return 0;
            }
            if (this.f86682c >= t.this.N1()) {
                return -1;
            }
            if (this.f86682c + i5 > t.this.N1()) {
                i5 = t.this.N1() - this.f86682c;
            }
            t tVar = t.this;
            int i7 = this.f86682c;
            tVar.getChars(i7, i7 + i5, cArr, i4);
            this.f86682c += i5;
            return i5;
        }
    }

    private t(char[] cArr, int i4) {
        Objects.requireNonNull(cArr, "initialBuffer");
        this.f86676b = cArr;
        if (i4 >= 0 && i4 <= cArr.length) {
            this.f86680f = i4;
            return;
        }
        throw new IllegalArgumentException("initialBuffer.length=" + cArr.length + ", length=" + i4);
    }

    public t(CharSequence charSequence) {
        this(b1.B1(charSequence) + 32);
        if (charSequence != null) {
            append(charSequence);
        }
    }

    public t(int i4) {
        this.f86676b = new char[i4 <= 0 ? 32 : i4];
    }

    public t(String str) {
        this(b1.B1(str) + 32);
        if (str != null) {
            m(str);
        }
    }
}
