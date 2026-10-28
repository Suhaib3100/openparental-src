package org.apache.commons.lang3.text;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: StrBuilder.java */
@Deprecated
/* loaded from: classes6.dex */
public class e implements CharSequence, Appendable, Serializable, org.apache.commons.lang3.builder.a<String> {

    /* renamed from: f, reason: collision with root package name */
    static final int f86151f = 32;

    /* renamed from: g, reason: collision with root package name */
    private static final long f86152g = 7628716375283629643L;

    /* renamed from: b, reason: collision with root package name */
    protected char[] f86153b;

    /* renamed from: c, reason: collision with root package name */
    protected int f86154c;

    /* renamed from: d, reason: collision with root package name */
    private String f86155d;

    /* renamed from: e, reason: collision with root package name */
    private String f86156e;

    /* compiled from: StrBuilder.java */
    class b extends i {
        b() {
        }

        @Override // org.apache.commons.lang3.text.i
        protected List<String> Y(char[] cArr, int i4, int i5) {
            if (cArr != null) {
                return super.Y(cArr, i4, i5);
            }
            e eVar = e.this;
            return super.Y(eVar.f86153b, 0, eVar.B1());
        }

        @Override // org.apache.commons.lang3.text.i
        public String l() {
            String l4 = super.l();
            return l4 == null ? e.this.toString() : l4;
        }
    }

    /* compiled from: StrBuilder.java */
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
        public void write(int i4) {
            e.this.append((char) i4);
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            e.this.y(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i4, int i5) {
            e.this.z(cArr, i4, i5);
        }

        @Override // java.io.Writer
        public void write(String str) {
            e.this.m(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i4, int i5) {
            e.this.n(str, i4, i5);
        }
    }

    public e() {
        this(32);
    }

    private void D0(int i4, int i5, int i6) {
        char[] cArr = this.f86153b;
        System.arraycopy(cArr, i5, cArr, i4, this.f86154c - i5);
        this.f86154c -= i6;
    }

    private e t1(g gVar, String str, int i4, int i5, int i6) {
        if (gVar != null && this.f86154c != 0) {
            int length = str == null ? 0 : str.length();
            int i7 = i4;
            while (i7 < i5 && i6 != 0) {
                int g4 = gVar.g(this.f86153b, i7, i4, i5);
                if (g4 > 0) {
                    u1(i7, i7 + g4, g4, str, length);
                    i5 = (i5 - g4) + length;
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

    private void u1(int i4, int i5, int i6, String str, int i7) {
        int i10 = (this.f86154c - i6) + i7;
        if (i7 != i6) {
            F0(i10);
            char[] cArr = this.f86153b;
            System.arraycopy(cArr, i5, cArr, i4 + i7, this.f86154c - i5);
            this.f86154c = i10;
        }
        if (i7 > 0) {
            str.getChars(0, i7, this.f86153b, i4);
        }
    }

    public e A(Iterable<?> iterable) {
        if (iterable != null) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                l(it.next());
            }
        }
        return this;
    }

    public e A0(char c5) {
        int i4 = 0;
        while (true) {
            if (i4 >= this.f86154c) {
                break;
            }
            if (this.f86153b[i4] == c5) {
                D0(i4, i4 + 1, 1);
                break;
            }
            i4++;
        }
        return this;
    }

    public e A1(String str) {
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.f86156e = str;
        return this;
    }

    public e B(Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                l(it.next());
            }
        }
        return this;
    }

    public e B0(String str) {
        int O0;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (O0 = O0(str, 0)) >= 0) {
            D0(O0, O0 + length, length);
        }
        return this;
    }

    public int B1() {
        return this.f86154c;
    }

    public <T> e C(T... tArr) {
        if (org.apache.commons.lang3.e.x1(tArr)) {
            for (T t4 : tArr) {
                l(t4);
            }
        }
        return this;
    }

    public e C0(g gVar) {
        return m1(gVar, null, 0, this.f86154c, 1);
    }

    public boolean C1(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.f86154c) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (this.f86153b[i4] != str.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    public e D(int i4, int i5, char c5) {
        return E(String.valueOf(i4), i5, c5);
    }

    public String D1(int i4) {
        return E1(i4, this.f86154c);
    }

    public e E(Object obj, int i4, char c5) {
        if (i4 > 0) {
            F0(this.f86154c + i4);
            String K0 = obj == null ? K0() : obj.toString();
            if (K0 == null) {
                K0 = "";
            }
            int length = K0.length();
            if (length >= i4) {
                K0.getChars(length - i4, length, this.f86153b, this.f86154c);
            } else {
                int i5 = i4 - length;
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f86153b[this.f86154c + i6] = c5;
                }
                K0.getChars(0, length, this.f86153b, this.f86154c + i5);
            }
            this.f86154c += i4;
        }
        return this;
    }

    public boolean E0(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        int i4 = this.f86154c;
        if (length > i4) {
            return false;
        }
        int i5 = i4 - length;
        int i6 = 0;
        while (i6 < length) {
            if (this.f86153b[i5] != str.charAt(i6)) {
                return false;
            }
            i6++;
            i5++;
        }
        return true;
    }

    public String E1(int i4, int i5) {
        return new String(this.f86153b, i4, L1(i4, i5) - i4);
    }

    public e F(int i4, int i5, char c5) {
        return G(String.valueOf(i4), i5, c5);
    }

    public e F0(int i4) {
        char[] cArr = this.f86153b;
        if (i4 > cArr.length) {
            char[] cArr2 = new char[i4 * 2];
            this.f86153b = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.f86154c);
        }
        return this;
    }

    public char[] F1() {
        int i4 = this.f86154c;
        if (i4 == 0) {
            return org.apache.commons.lang3.e.f85953e;
        }
        char[] cArr = new char[i4];
        System.arraycopy(this.f86153b, 0, cArr, 0, i4);
        return cArr;
    }

    public e G(Object obj, int i4, char c5) {
        if (i4 > 0) {
            F0(this.f86154c + i4);
            String K0 = obj == null ? K0() : obj.toString();
            if (K0 == null) {
                K0 = "";
            }
            int length = K0.length();
            if (length >= i4) {
                K0.getChars(0, i4, this.f86153b, this.f86154c);
            } else {
                int i5 = i4 - length;
                K0.getChars(0, length, this.f86153b, this.f86154c);
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f86153b[this.f86154c + length + i6] = c5;
                }
            }
            this.f86154c += i4;
        }
        return this;
    }

    public boolean G0(e eVar) {
        int i4;
        if (this == eVar) {
            return true;
        }
        if (eVar == null || (i4 = this.f86154c) != eVar.f86154c) {
            return false;
        }
        char[] cArr = this.f86153b;
        char[] cArr2 = eVar.f86153b;
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (cArr[i5] != cArr2[i5]) {
                return false;
            }
        }
        return true;
    }

    public char[] G1(int i4, int i5) {
        int L1 = L1(i4, i5) - i4;
        if (L1 == 0) {
            return org.apache.commons.lang3.e.f85953e;
        }
        char[] cArr = new char[L1];
        System.arraycopy(this.f86153b, i4, cArr, 0, L1);
        return cArr;
    }

    public e H() {
        String str = this.f86155d;
        if (str != null) {
            return m(str);
        }
        m(System.lineSeparator());
        return this;
    }

    public boolean H0(e eVar) {
        if (this == eVar) {
            return true;
        }
        int i4 = this.f86154c;
        if (i4 != eVar.f86154c) {
            return false;
        }
        char[] cArr = this.f86153b;
        char[] cArr2 = eVar.f86153b;
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            char c5 = cArr[i5];
            char c6 = cArr2[i5];
            if (c5 != c6 && Character.toUpperCase(c5) != Character.toUpperCase(c6)) {
                return false;
            }
        }
        return true;
    }

    public StringBuffer H1() {
        StringBuffer stringBuffer = new StringBuffer(this.f86154c);
        stringBuffer.append(this.f86153b, 0, this.f86154c);
        return stringBuffer;
    }

    public e I() {
        String str = this.f86156e;
        return str == null ? this : m(str);
    }

    public char[] I0(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.f86153b, 0, cArr, 0, length);
        return cArr;
    }

    public StringBuilder I1() {
        StringBuilder sb = new StringBuilder(this.f86154c);
        sb.append(this.f86153b, 0, this.f86154c);
        return sb;
    }

    public e J(int i4, char c5) {
        if (i4 >= 0) {
            F0(this.f86154c + i4);
            for (int i5 = 0; i5 < i4; i5++) {
                char[] cArr = this.f86153b;
                int i6 = this.f86154c;
                this.f86154c = i6 + 1;
                cArr[i6] = c5;
            }
        }
        return this;
    }

    public String J0() {
        return this.f86155d;
    }

    public e J1() {
        int i4 = this.f86154c;
        if (i4 == 0) {
            return this;
        }
        char[] cArr = this.f86153b;
        int i5 = 0;
        while (i5 < i4 && cArr[i5] <= ' ') {
            i5++;
        }
        while (i5 < i4 && cArr[i4 - 1] <= ' ') {
            i4--;
        }
        int i6 = this.f86154c;
        if (i4 < i6) {
            v0(i4, i6);
        }
        if (i5 > 0) {
            v0(0, i5);
        }
        return this;
    }

    public e K(char c5) {
        if (B1() > 0) {
            append(c5);
        }
        return this;
    }

    public String K0() {
        return this.f86156e;
    }

    protected void K1(int i4) {
        if (i4 < 0 || i4 > this.f86154c) {
            throw new StringIndexOutOfBoundsException(i4);
        }
    }

    public e L(char c5, char c6) {
        if (B1() > 0) {
            append(c5);
        } else {
            append(c6);
        }
        return this;
    }

    public int L0(char c5) {
        return M0(c5, 0);
    }

    protected int L1(int i4, int i5) {
        if (i4 < 0) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        int i6 = this.f86154c;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i4 <= i5) {
            return i5;
        }
        throw new StringIndexOutOfBoundsException("end < start");
    }

    public e M(char c5, int i4) {
        if (i4 > 0) {
            append(c5);
        }
        return this;
    }

    public int M0(char c5, int i4) {
        int max = Math.max(i4, 0);
        if (max >= this.f86154c) {
            return -1;
        }
        char[] cArr = this.f86153b;
        while (max < this.f86154c) {
            if (cArr[max] == c5) {
                return max;
            }
            max++;
        }
        return -1;
    }

    public e N(String str) {
        return P(str, null);
    }

    public int N0(String str) {
        return O0(str, 0);
    }

    public e O(String str, int i4) {
        if (str != null && i4 > 0) {
            m(str);
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
    public int O0(java.lang.String r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            int r10 = java.lang.Math.max(r10, r0)
            r1 = -1
            if (r9 == 0) goto L3f
            int r2 = r8.f86154c
            if (r10 < r2) goto Ld
            goto L3f
        Ld:
            int r2 = r9.length()
            r3 = 1
            if (r2 != r3) goto L1d
            char r9 = r9.charAt(r0)
            int r9 = r8.M0(r9, r10)
            return r9
        L1d:
            if (r2 != 0) goto L20
            return r10
        L20:
            int r4 = r8.f86154c
            if (r2 <= r4) goto L25
            return r1
        L25:
            char[] r5 = r8.f86153b
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
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.text.e.O0(java.lang.String, int):int");
    }

    public e P(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            m(str);
        }
        return this;
    }

    public int P0(g gVar) {
        return Q0(gVar, 0);
    }

    public void Q(Appendable appendable) throws IOException {
        if (appendable instanceof Writer) {
            ((Writer) appendable).write(this.f86153b, 0, this.f86154c);
            return;
        }
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(this.f86153b, 0, this.f86154c);
            return;
        }
        if (appendable instanceof StringBuffer) {
            ((StringBuffer) appendable).append(this.f86153b, 0, this.f86154c);
        } else if (appendable instanceof CharBuffer) {
            ((CharBuffer) appendable).put(this.f86153b, 0, this.f86154c);
        } else {
            appendable.append(this);
        }
    }

    public int Q0(g gVar, int i4) {
        int i5;
        int max = Math.max(i4, 0);
        if (gVar != null && max < (i5 = this.f86154c)) {
            char[] cArr = this.f86153b;
            for (int i6 = max; i6 < i5; i6++) {
                if (gVar.g(cArr, i6, max, i5) > 0) {
                    return i6;
                }
            }
        }
        return -1;
    }

    public e R(Iterable<?> iterable, String str) {
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

    public e R0(int i4, char c5) {
        K1(i4);
        F0(this.f86154c + 1);
        char[] cArr = this.f86153b;
        System.arraycopy(cArr, i4, cArr, i4 + 1, this.f86154c - i4);
        this.f86153b[i4] = c5;
        this.f86154c++;
        return this;
    }

    public e S(Iterator<?> it, String str) {
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

    public e S0(int i4, double d5) {
        return X0(i4, String.valueOf(d5));
    }

    public e T(Object[] objArr, String str) {
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

    public e T0(int i4, float f4) {
        return X0(i4, String.valueOf(f4));
    }

    public e U(char c5) {
        return append(c5).H();
    }

    public e U0(int i4, int i5) {
        return X0(i4, String.valueOf(i5));
    }

    public e V(double d5) {
        return f(d5).H();
    }

    public e V0(int i4, long j4) {
        return X0(i4, String.valueOf(j4));
    }

    public e W(float f4) {
        return g(f4).H();
    }

    public e W0(int i4, Object obj) {
        return obj == null ? X0(i4, this.f86156e) : X0(i4, obj.toString());
    }

    public e X(int i4) {
        return h(i4).H();
    }

    public e X0(int i4, String str) {
        int length;
        K1(i4);
        if (str == null) {
            str = this.f86156e;
        }
        if (str != null && (length = str.length()) > 0) {
            int i5 = this.f86154c + length;
            F0(i5);
            char[] cArr = this.f86153b;
            System.arraycopy(cArr, i4, cArr, i4 + length, this.f86154c - i4);
            this.f86154c = i5;
            str.getChars(0, length, this.f86153b, i4);
        }
        return this;
    }

    public e Y(long j4) {
        return i(j4).H();
    }

    public e Y0(int i4, boolean z4) {
        K1(i4);
        if (z4) {
            F0(this.f86154c + 4);
            char[] cArr = this.f86153b;
            System.arraycopy(cArr, i4, cArr, i4 + 4, this.f86154c - i4);
            char[] cArr2 = this.f86153b;
            cArr2[i4] = 't';
            cArr2[i4 + 1] = 'r';
            cArr2[i4 + 2] = 'u';
            cArr2[i4 + 3] = 'e';
            this.f86154c += 4;
        } else {
            F0(this.f86154c + 5);
            char[] cArr3 = this.f86153b;
            System.arraycopy(cArr3, i4, cArr3, i4 + 5, this.f86154c - i4);
            char[] cArr4 = this.f86153b;
            cArr4[i4] = 'f';
            cArr4[i4 + 1] = 'a';
            cArr4[i4 + 2] = 'l';
            cArr4[i4 + 3] = 's';
            cArr4[i4 + 4] = 'e';
            this.f86154c += 5;
        }
        return this;
    }

    public e Z(Object obj) {
        return l(obj).H();
    }

    public e Z0(int i4, char[] cArr) {
        K1(i4);
        if (cArr == null) {
            return X0(i4, this.f86156e);
        }
        int length = cArr.length;
        if (length > 0) {
            F0(this.f86154c + length);
            char[] cArr2 = this.f86153b;
            System.arraycopy(cArr2, i4, cArr2, i4 + length, this.f86154c - i4);
            System.arraycopy(cArr, 0, this.f86153b, i4, length);
            this.f86154c += length;
        }
        return this;
    }

    public e a0(String str) {
        return m(str).H();
    }

    public e a1(int i4, char[] cArr, int i5, int i6) {
        K1(i4);
        if (cArr == null) {
            return X0(i4, this.f86156e);
        }
        if (i5 < 0 || i5 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid offset: ", i5));
        }
        if (i6 < 0 || i5 + i6 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid length: ", i6));
        }
        if (i6 > 0) {
            F0(this.f86154c + i6);
            char[] cArr2 = this.f86153b;
            System.arraycopy(cArr2, i4, cArr2, i4 + i6, this.f86154c - i4);
            System.arraycopy(cArr, i5, this.f86153b, i4, i6);
            this.f86154c += i6;
        }
        return this;
    }

    public e b0(String str, int i4, int i5) {
        return n(str, i4, i5).H();
    }

    public int b1(char c5) {
        return c1(c5, this.f86154c - 1);
    }

    public e c0(String str, Object... objArr) {
        return o(str, objArr).H();
    }

    public int c1(char c5, int i4) {
        int i5 = this.f86154c;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        if (i4 < 0) {
            return -1;
        }
        while (i4 >= 0) {
            if (this.f86153b[i4] == c5) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        if (i4 < 0 || i4 >= length()) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        return this.f86153b[i4];
    }

    public e d0(StringBuffer stringBuffer) {
        return p(stringBuffer).H();
    }

    public int d1(String str) {
        return e1(str, this.f86154c - 1);
    }

    @Override // java.lang.Appendable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e append(char c5) {
        F0(length() + 1);
        char[] cArr = this.f86153b;
        int i4 = this.f86154c;
        this.f86154c = i4 + 1;
        cArr[i4] = c5;
        return this;
    }

    public e e0(StringBuffer stringBuffer, int i4, int i5) {
        return q(stringBuffer, i4, i5).H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        r9 = r9 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e1(java.lang.String r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.f86154c
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
            int r3 = r7.f86154c
            if (r2 > r3) goto L3d
            r3 = 0
            if (r2 != r1) goto L23
            char r8 = r8.charAt(r3)
            int r8 = r7.c1(r8, r9)
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
            char[] r5 = r7.f86153b
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
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.text.e.e1(java.lang.String, int):int");
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && G0((e) obj);
    }

    public e f(double d5) {
        return m(String.valueOf(d5));
    }

    public e f0(StringBuilder sb) {
        return r(sb).H();
    }

    public int f1(g gVar) {
        return g1(gVar, this.f86154c);
    }

    public e g(float f4) {
        return m(String.valueOf(f4));
    }

    public e g0(StringBuilder sb, int i4, int i5) {
        return s(sb, i4, i5).H();
    }

    public int g1(g gVar, int i4) {
        int i5 = this.f86154c;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        if (gVar != null && i4 >= 0) {
            char[] cArr = this.f86153b;
            int i6 = i4 + 1;
            while (i4 >= 0) {
                if (gVar.g(cArr, i4, 0, i6) > 0) {
                    return i4;
                }
                i4--;
            }
        }
        return -1;
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
        System.arraycopy(this.f86153b, i4, cArr, i6, i5 - i4);
    }

    public e h(int i4) {
        return m(String.valueOf(i4));
    }

    public e h0(e eVar) {
        return v(eVar).H();
    }

    public String h1(int i4) {
        if (i4 <= 0) {
            return "";
        }
        int i5 = this.f86154c;
        return i4 >= i5 ? new String(this.f86153b, 0, i5) : new String(this.f86153b, 0, i4);
    }

    public int hashCode() {
        char[] cArr = this.f86153b;
        int i4 = 0;
        for (int i5 = this.f86154c - 1; i5 >= 0; i5--) {
            i4 = (i4 * 31) + cArr[i5];
        }
        return i4;
    }

    public e i(long j4) {
        return m(String.valueOf(j4));
    }

    public e i0(e eVar, int i4, int i5) {
        return w(eVar, i4, i5).H();
    }

    public String i1(int i4, int i5) {
        int i6;
        if (i4 < 0) {
            i4 = 0;
        }
        return (i5 <= 0 || i4 >= (i6 = this.f86154c)) ? "" : i6 <= i4 + i5 ? new String(this.f86153b, i4, i6 - i4) : new String(this.f86153b, i4, i5);
    }

    public boolean isEmpty() {
        return this.f86154c == 0;
    }

    @Override // java.lang.Appendable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e append(CharSequence charSequence) {
        return charSequence == null ? I() : charSequence instanceof e ? v((e) charSequence) : charSequence instanceof StringBuilder ? r((StringBuilder) charSequence) : charSequence instanceof StringBuffer ? p((StringBuffer) charSequence) : charSequence instanceof CharBuffer ? t((CharBuffer) charSequence) : m(charSequence.toString());
    }

    public e j0(boolean z4) {
        return x(z4).H();
    }

    public e j1() {
        if (this.f86153b.length > length()) {
            char[] cArr = this.f86153b;
            char[] cArr2 = new char[length()];
            this.f86153b = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.f86154c);
        }
        return this;
    }

    @Override // java.lang.Appendable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e append(CharSequence charSequence, int i4, int i5) {
        return charSequence == null ? I() : n(charSequence.toString(), i4, i5);
    }

    public e k0(char[] cArr) {
        return y(cArr).H();
    }

    public int k1(Readable readable) throws IOException {
        int i4 = this.f86154c;
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            F0(i4 + 1);
            while (true) {
                char[] cArr = this.f86153b;
                int i5 = this.f86154c;
                int read = reader.read(cArr, i5, cArr.length - i5);
                if (read == -1) {
                    break;
                }
                int i6 = this.f86154c + read;
                this.f86154c = i6;
                F0(i6 + 1);
            }
        } else if (readable instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) readable;
            int remaining = charBuffer.remaining();
            F0(this.f86154c + remaining);
            charBuffer.get(this.f86153b, this.f86154c, remaining);
            this.f86154c += remaining;
        } else {
            while (true) {
                F0(this.f86154c + 1);
                char[] cArr2 = this.f86153b;
                int i7 = this.f86154c;
                int read2 = readable.read(CharBuffer.wrap(cArr2, i7, cArr2.length - i7));
                if (read2 == -1) {
                    break;
                }
                this.f86154c += read2;
            }
        }
        return this.f86154c - i4;
    }

    public e l(Object obj) {
        return obj == null ? I() : obj instanceof CharSequence ? append((CharSequence) obj) : m(obj.toString());
    }

    public e l0(char[] cArr, int i4, int i5) {
        return z(cArr, i4, i5).H();
    }

    public e l1(int i4, int i5, String str) {
        int L1 = L1(i4, i5);
        u1(i4, L1, L1 - i4, str, str == null ? 0 : str.length());
        return this;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f86154c;
    }

    public e m(String str) {
        if (str == null) {
            return I();
        }
        int length = str.length();
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            str.getChars(0, length, this.f86153b, length2);
            this.f86154c += length;
        }
        return this;
    }

    public Reader m0() {
        return new a();
    }

    public e m1(g gVar, String str, int i4, int i5, int i6) {
        return t1(gVar, str, i4, L1(i4, i5), i6);
    }

    public e n(String str, int i4, int i5) {
        int i6;
        if (str == null) {
            return I();
        }
        if (i4 < 0 || i4 > str.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i5 < 0 || (i6 = i4 + i5) > str.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i5 > 0) {
            int length = length();
            F0(length + i5);
            str.getChars(i4, i6, this.f86153b, length);
            this.f86154c += i5;
        }
        return this;
    }

    public i n0() {
        return new b();
    }

    public e n1(char c5, char c6) {
        if (c5 != c6) {
            for (int i4 = 0; i4 < this.f86154c; i4++) {
                char[] cArr = this.f86153b;
                if (cArr[i4] == c5) {
                    cArr[i4] = c6;
                }
            }
        }
        return this;
    }

    public e o(String str, Object... objArr) {
        return m(String.format(str, objArr));
    }

    public Writer o0() {
        return new c();
    }

    public e o1(String str, String str2) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int length2 = str2 == null ? 0 : str2.length();
            int O0 = O0(str, 0);
            while (O0 >= 0) {
                u1(O0, O0 + length, length, str2, length2);
                O0 = O0(str, O0 + length2);
            }
        }
        return this;
    }

    public e p(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return I();
        }
        int length = stringBuffer.length();
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            stringBuffer.getChars(0, length, this.f86153b, length2);
            this.f86154c += length;
        }
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public String a() {
        return toString();
    }

    public e p1(g gVar, String str) {
        return m1(gVar, str, 0, this.f86154c, -1);
    }

    public e q(StringBuffer stringBuffer, int i4, int i5) {
        int i6;
        if (stringBuffer == null) {
            return I();
        }
        if (i4 < 0 || i4 > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i5 < 0 || (i6 = i4 + i5) > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i5 > 0) {
            int length = length();
            F0(length + i5);
            stringBuffer.getChars(i4, i6, this.f86153b, length);
            this.f86154c += i5;
        }
        return this;
    }

    public int q0() {
        return this.f86153b.length;
    }

    public e q1(char c5, char c6) {
        if (c5 != c6) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.f86154c) {
                    break;
                }
                char[] cArr = this.f86153b;
                if (cArr[i4] == c5) {
                    cArr[i4] = c6;
                    break;
                }
                i4++;
            }
        }
        return this;
    }

    public e r(StringBuilder sb) {
        if (sb == null) {
            return I();
        }
        int length = sb.length();
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            sb.getChars(0, length, this.f86153b, length2);
            this.f86154c += length;
        }
        return this;
    }

    public e r0() {
        this.f86154c = 0;
        return this;
    }

    public e r1(String str, String str2) {
        int O0;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (O0 = O0(str, 0)) >= 0) {
            u1(O0, O0 + length, length, str2, str2 != null ? str2.length() : 0);
        }
        return this;
    }

    public e s(StringBuilder sb, int i4, int i5) {
        int i6;
        if (sb == null) {
            return I();
        }
        if (i4 < 0 || i4 > sb.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i5 < 0 || (i6 = i4 + i5) > sb.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i5 > 0) {
            int length = length();
            F0(length + i5);
            sb.getChars(i4, i6, this.f86153b, length);
            this.f86154c += i5;
        }
        return this;
    }

    public boolean s0(char c5) {
        char[] cArr = this.f86153b;
        for (int i4 = 0; i4 < this.f86154c; i4++) {
            if (cArr[i4] == c5) {
                return true;
            }
        }
        return false;
    }

    public e s1(g gVar, String str) {
        return m1(gVar, str, 0, this.f86154c, 1);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        if (i4 < 0) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        if (i5 > this.f86154c) {
            throw new StringIndexOutOfBoundsException(i5);
        }
        if (i4 <= i5) {
            return E1(i4, i5);
        }
        throw new StringIndexOutOfBoundsException(i5 - i4);
    }

    public e t(CharBuffer charBuffer) {
        if (charBuffer == null) {
            return I();
        }
        if (charBuffer.hasArray()) {
            int remaining = charBuffer.remaining();
            int length = length();
            F0(length + remaining);
            System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset(), this.f86153b, length, remaining);
            this.f86154c += remaining;
        } else {
            m(charBuffer.toString());
        }
        return this;
    }

    public boolean t0(String str) {
        return O0(str, 0) >= 0;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.f86153b, 0, this.f86154c);
    }

    public e u(CharBuffer charBuffer, int i4, int i5) {
        if (charBuffer == null) {
            return I();
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
            F0(length + i5);
            System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset() + i4, this.f86153b, length, i5);
            this.f86154c += i5;
        } else {
            n(charBuffer.toString(), i4, i5);
        }
        return this;
    }

    public boolean u0(g gVar) {
        return Q0(gVar, 0) >= 0;
    }

    public e v(e eVar) {
        if (eVar == null) {
            return I();
        }
        int length = eVar.length();
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            System.arraycopy(eVar.f86153b, 0, this.f86153b, length2, length);
            this.f86154c += length;
        }
        return this;
    }

    public e v0(int i4, int i5) {
        int L1 = L1(i4, i5);
        int i6 = L1 - i4;
        if (i6 > 0) {
            D0(i4, L1, i6);
        }
        return this;
    }

    public e v1() {
        int i4 = this.f86154c;
        if (i4 == 0) {
            return this;
        }
        int i5 = i4 / 2;
        char[] cArr = this.f86153b;
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

    public e w(e eVar, int i4, int i5) {
        int i6;
        if (eVar == null) {
            return I();
        }
        if (i4 < 0 || i4 > eVar.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i5 < 0 || (i6 = i4 + i5) > eVar.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i5 > 0) {
            int length = length();
            F0(length + i5);
            eVar.getChars(i4, i6, this.f86153b, length);
            this.f86154c += i5;
        }
        return this;
    }

    public e w0(char c5) {
        int i4 = 0;
        while (i4 < this.f86154c) {
            if (this.f86153b[i4] == c5) {
                int i5 = i4;
                do {
                    i5++;
                    if (i5 >= this.f86154c) {
                        break;
                    }
                } while (this.f86153b[i5] == c5);
                int i6 = i5 - i4;
                D0(i4, i5, i6);
                i4 = i5 - i6;
            }
            i4++;
        }
        return this;
    }

    public String w1(int i4) {
        if (i4 <= 0) {
            return "";
        }
        int i5 = this.f86154c;
        return i4 >= i5 ? new String(this.f86153b, 0, i5) : new String(this.f86153b, i5 - i4, i4);
    }

    public e x(boolean z4) {
        if (z4) {
            F0(this.f86154c + 4);
            char[] cArr = this.f86153b;
            int i4 = this.f86154c;
            int i5 = i4 + 1;
            this.f86154c = i5;
            cArr[i4] = 't';
            int i6 = i4 + 2;
            this.f86154c = i6;
            cArr[i5] = 'r';
            int i7 = i4 + 3;
            this.f86154c = i7;
            cArr[i6] = 'u';
            this.f86154c = i4 + 4;
            cArr[i7] = 'e';
        } else {
            F0(this.f86154c + 5);
            char[] cArr2 = this.f86153b;
            int i10 = this.f86154c;
            int i11 = i10 + 1;
            this.f86154c = i11;
            cArr2[i10] = 'f';
            int i12 = i10 + 2;
            this.f86154c = i12;
            cArr2[i11] = 'a';
            int i13 = i10 + 3;
            this.f86154c = i13;
            cArr2[i12] = 'l';
            int i14 = i10 + 4;
            this.f86154c = i14;
            cArr2[i13] = 's';
            this.f86154c = i10 + 5;
            cArr2[i14] = 'e';
        }
        return this;
    }

    public e x0(String str) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int O0 = O0(str, 0);
            while (O0 >= 0) {
                D0(O0, O0 + length, length);
                O0 = O0(str, O0);
            }
        }
        return this;
    }

    public e x1(int i4, char c5) {
        if (i4 < 0 || i4 >= length()) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        this.f86153b[i4] = c5;
        return this;
    }

    public e y(char[] cArr) {
        if (cArr == null) {
            return I();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            System.arraycopy(cArr, 0, this.f86153b, length2, length);
            this.f86154c += length;
        }
        return this;
    }

    public e y0(g gVar) {
        return m1(gVar, null, 0, this.f86154c, -1);
    }

    public e y1(int i4) {
        if (i4 < 0) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        int i5 = this.f86154c;
        if (i4 < i5) {
            this.f86154c = i4;
        } else if (i4 > i5) {
            F0(i4);
            this.f86154c = i4;
            for (int i6 = this.f86154c; i6 < i4; i6++) {
                this.f86153b[i6] = 0;
            }
        }
        return this;
    }

    public e z(char[] cArr, int i4, int i5) {
        if (cArr == null) {
            return I();
        }
        if (i4 < 0 || i4 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid startIndex: ", i5));
        }
        if (i5 < 0 || i4 + i5 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid length: ", i5));
        }
        if (i5 > 0) {
            int length = length();
            F0(length + i5);
            System.arraycopy(cArr, i4, this.f86153b, length, i5);
            this.f86154c += i5;
        }
        return this;
    }

    public e z0(int i4) {
        if (i4 < 0 || i4 >= this.f86154c) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        D0(i4, i4 + 1, 1);
        return this;
    }

    public e z1(String str) {
        this.f86155d = str;
        return this;
    }

    /* compiled from: StrBuilder.java */
    class a extends Reader {

        /* renamed from: b, reason: collision with root package name */
        private int f86157b;

        /* renamed from: c, reason: collision with root package name */
        private int f86158c;

        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Reader
        public void mark(int i4) {
            this.f86158c = this.f86157b;
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
            e eVar = e.this;
            int i4 = this.f86157b;
            this.f86157b = i4 + 1;
            return eVar.charAt(i4);
        }

        @Override // java.io.Reader
        public boolean ready() {
            return this.f86157b < e.this.B1();
        }

        @Override // java.io.Reader
        public void reset() {
            this.f86157b = this.f86158c;
        }

        @Override // java.io.Reader
        public long skip(long j4) {
            if (this.f86157b + j4 > e.this.B1()) {
                j4 = e.this.B1() - this.f86157b;
            }
            if (j4 < 0) {
                return 0L;
            }
            this.f86157b = (int) (this.f86157b + j4);
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
            if (this.f86157b >= e.this.B1()) {
                return -1;
            }
            if (this.f86157b + i5 > e.this.B1()) {
                i5 = e.this.B1() - this.f86157b;
            }
            e eVar = e.this;
            int i7 = this.f86157b;
            eVar.getChars(i7, i7 + i5, cArr, i4);
            this.f86157b += i5;
            return i5;
        }
    }

    public e(int i4) {
        this.f86153b = new char[i4 <= 0 ? 32 : i4];
    }

    public e(String str) {
        if (str == null) {
            this.f86153b = new char[32];
        } else {
            this.f86153b = new char[str.length() + 32];
            m(str);
        }
    }
}
