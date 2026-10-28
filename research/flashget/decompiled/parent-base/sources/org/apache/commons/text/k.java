package org.apache.commons.text;

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
/* loaded from: classes3.dex */
public class k implements CharSequence, Appendable, Serializable, org.apache.commons.text.b<String> {

    /* renamed from: f, reason: collision with root package name */
    static final int f86470f = 32;

    /* renamed from: g, reason: collision with root package name */
    private static final long f86471g = 7628716375283629643L;

    /* renamed from: b, reason: collision with root package name */
    char[] f86472b;

    /* renamed from: c, reason: collision with root package name */
    private int f86473c;

    /* renamed from: d, reason: collision with root package name */
    private String f86474d;

    /* renamed from: e, reason: collision with root package name */
    private String f86475e;

    /* compiled from: StrBuilder.java */
    class b extends o {
        b() {
        }

        @Override // org.apache.commons.text.o
        protected List<String> Y(char[] cArr, int i4, int i5) {
            if (cArr != null) {
                return super.Y(cArr, i4, i5);
            }
            k kVar = k.this;
            return super.Y(kVar.f86472b, 0, kVar.B1());
        }

        @Override // org.apache.commons.text.o
        public String l() {
            String l4 = super.l();
            return l4 == null ? k.this.toString() : l4;
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
            k.this.append((char) i4);
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            k.this.y(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i4, int i5) {
            k.this.z(cArr, i4, i5);
        }

        @Override // java.io.Writer
        public void write(String str) {
            k.this.m(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i4, int i5) {
            k.this.n(str, i4, i5);
        }
    }

    public k() {
        this(32);
    }

    private void D0(int i4, int i5, int i6) {
        char[] cArr = this.f86472b;
        System.arraycopy(cArr, i5, cArr, i4, this.f86473c - i5);
        this.f86473c -= i6;
    }

    private k t1(m mVar, String str, int i4, int i5, int i6) {
        if (mVar != null && this.f86473c != 0) {
            int length = str == null ? 0 : str.length();
            int i7 = i4;
            while (i7 < i5 && i6 != 0) {
                int g4 = mVar.g(this.f86472b, i7, i4, i5);
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
        int i10 = (this.f86473c - i6) + i7;
        if (i7 != i6) {
            F0(i10);
            char[] cArr = this.f86472b;
            System.arraycopy(cArr, i5, cArr, i4 + i7, this.f86473c - i5);
            this.f86473c = i10;
        }
        if (i7 > 0) {
            str.getChars(0, i7, this.f86472b, i4);
        }
    }

    public k A(Iterable<?> iterable) {
        if (iterable != null) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                l(it.next());
            }
        }
        return this;
    }

    public k A0(char c5) {
        int i4 = 0;
        while (true) {
            if (i4 >= this.f86473c) {
                break;
            }
            if (this.f86472b[i4] == c5) {
                D0(i4, i4 + 1, 1);
                break;
            }
            i4++;
        }
        return this;
    }

    public k A1(String str) {
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.f86475e = str;
        return this;
    }

    public k B(Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                l(it.next());
            }
        }
        return this;
    }

    public k B0(String str) {
        int O0;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (O0 = O0(str, 0)) >= 0) {
            D0(O0, O0 + length, length);
        }
        return this;
    }

    public int B1() {
        return this.f86473c;
    }

    public <T> k C(T... tArr) {
        if (tArr != null && tArr.length > 0) {
            for (T t4 : tArr) {
                l(t4);
            }
        }
        return this;
    }

    public k C0(m mVar) {
        return m1(mVar, null, 0, this.f86473c, 1);
    }

    public boolean C1(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.f86473c) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (this.f86472b[i4] != str.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    public k D(int i4, int i5, char c5) {
        return E(String.valueOf(i4), i5, c5);
    }

    public String D1(int i4) {
        return E1(i4, this.f86473c);
    }

    public k E(Object obj, int i4, char c5) {
        if (i4 > 0) {
            F0(this.f86473c + i4);
            String K0 = obj == null ? K0() : obj.toString();
            if (K0 == null) {
                K0 = "";
            }
            int length = K0.length();
            if (length >= i4) {
                K0.getChars(length - i4, length, this.f86472b, this.f86473c);
            } else {
                int i5 = i4 - length;
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f86472b[this.f86473c + i6] = c5;
                }
                K0.getChars(0, length, this.f86472b, this.f86473c + i5);
            }
            this.f86473c += i4;
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
        int i4 = this.f86473c;
        if (length > i4) {
            return false;
        }
        int i5 = i4 - length;
        int i6 = 0;
        while (i6 < length) {
            if (this.f86472b[i5] != str.charAt(i6)) {
                return false;
            }
            i6++;
            i5++;
        }
        return true;
    }

    public String E1(int i4, int i5) {
        return new String(this.f86472b, i4, L1(i4, i5) - i4);
    }

    public k F(int i4, int i5, char c5) {
        return G(String.valueOf(i4), i5, c5);
    }

    public k F0(int i4) {
        char[] cArr = this.f86472b;
        if (i4 > cArr.length) {
            char[] cArr2 = new char[i4 * 2];
            this.f86472b = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.f86473c);
        }
        return this;
    }

    public char[] F1() {
        int i4 = this.f86473c;
        if (i4 == 0) {
            return org.apache.commons.lang3.e.f85953e;
        }
        char[] cArr = new char[i4];
        System.arraycopy(this.f86472b, 0, cArr, 0, i4);
        return cArr;
    }

    public k G(Object obj, int i4, char c5) {
        if (i4 > 0) {
            F0(this.f86473c + i4);
            String K0 = obj == null ? K0() : obj.toString();
            if (K0 == null) {
                K0 = "";
            }
            int length = K0.length();
            if (length >= i4) {
                K0.getChars(0, i4, this.f86472b, this.f86473c);
            } else {
                int i5 = i4 - length;
                K0.getChars(0, length, this.f86472b, this.f86473c);
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f86472b[this.f86473c + length + i6] = c5;
                }
            }
            this.f86473c += i4;
        }
        return this;
    }

    public boolean G0(k kVar) {
        int i4;
        if (this == kVar) {
            return true;
        }
        if (kVar == null || (i4 = this.f86473c) != kVar.f86473c) {
            return false;
        }
        char[] cArr = this.f86472b;
        char[] cArr2 = kVar.f86472b;
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
        System.arraycopy(this.f86472b, i4, cArr, 0, L1);
        return cArr;
    }

    public k H() {
        String str = this.f86474d;
        if (str != null) {
            return m(str);
        }
        m(System.lineSeparator());
        return this;
    }

    public boolean H0(k kVar) {
        if (this == kVar) {
            return true;
        }
        int i4 = this.f86473c;
        if (i4 != kVar.f86473c) {
            return false;
        }
        char[] cArr = this.f86472b;
        char[] cArr2 = kVar.f86472b;
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
        StringBuffer stringBuffer = new StringBuffer(this.f86473c);
        stringBuffer.append(this.f86472b, 0, this.f86473c);
        return stringBuffer;
    }

    public k I() {
        String str = this.f86475e;
        return str == null ? this : m(str);
    }

    public char[] I0(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.f86472b, 0, cArr, 0, length);
        return cArr;
    }

    public StringBuilder I1() {
        StringBuilder sb = new StringBuilder(this.f86473c);
        sb.append(this.f86472b, 0, this.f86473c);
        return sb;
    }

    public k J(int i4, char c5) {
        if (i4 >= 0) {
            F0(this.f86473c + i4);
            for (int i5 = 0; i5 < i4; i5++) {
                char[] cArr = this.f86472b;
                int i6 = this.f86473c;
                this.f86473c = i6 + 1;
                cArr[i6] = c5;
            }
        }
        return this;
    }

    public String J0() {
        return this.f86474d;
    }

    public k J1() {
        int i4 = this.f86473c;
        if (i4 == 0) {
            return this;
        }
        char[] cArr = this.f86472b;
        int i5 = 0;
        while (i5 < i4 && cArr[i5] <= ' ') {
            i5++;
        }
        while (i5 < i4 && cArr[i4 - 1] <= ' ') {
            i4--;
        }
        int i6 = this.f86473c;
        if (i4 < i6) {
            v0(i4, i6);
        }
        if (i5 > 0) {
            v0(0, i5);
        }
        return this;
    }

    public k K(char c5) {
        if (B1() > 0) {
            append(c5);
        }
        return this;
    }

    public String K0() {
        return this.f86475e;
    }

    protected void K1(int i4) {
        if (i4 < 0 || i4 > this.f86473c) {
            throw new StringIndexOutOfBoundsException(i4);
        }
    }

    public k L(char c5, char c6) {
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
        int i6 = this.f86473c;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i4 <= i5) {
            return i5;
        }
        throw new StringIndexOutOfBoundsException("end < start");
    }

    public k M(char c5, int i4) {
        if (i4 > 0) {
            append(c5);
        }
        return this;
    }

    public int M0(char c5, int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 >= this.f86473c) {
            return -1;
        }
        char[] cArr = this.f86472b;
        while (i4 < this.f86473c) {
            if (cArr[i4] == c5) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public k N(String str) {
        return P(str, null);
    }

    public int N0(String str) {
        return O0(str, 0);
    }

    public k O(String str, int i4) {
        if (str != null && i4 > 0) {
            m(str);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
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
            if (r10 >= 0) goto L4
            r10 = r0
        L4:
            r1 = -1
            if (r9 == 0) goto L3e
            int r2 = r8.f86473c
            if (r10 < r2) goto Lc
            goto L3e
        Lc:
            int r2 = r9.length()
            r3 = 1
            if (r2 != r3) goto L1c
            char r9 = r9.charAt(r0)
            int r9 = r8.M0(r9, r10)
            return r9
        L1c:
            if (r2 != 0) goto L1f
            return r10
        L1f:
            int r4 = r8.f86473c
            if (r2 <= r4) goto L24
            return r1
        L24:
            char[] r5 = r8.f86472b
            int r4 = r4 - r2
            int r4 = r4 + r3
        L28:
            if (r10 >= r4) goto L3e
            r3 = r0
        L2b:
            if (r3 >= r2) goto L3d
            char r6 = r9.charAt(r3)
            int r7 = r10 + r3
            char r7 = r5[r7]
            if (r6 == r7) goto L3a
            int r10 = r10 + 1
            goto L28
        L3a:
            int r3 = r3 + 1
            goto L2b
        L3d:
            return r10
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.k.O0(java.lang.String, int):int");
    }

    public k P(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            m(str);
        }
        return this;
    }

    public int P0(m mVar) {
        return Q0(mVar, 0);
    }

    public void Q(Appendable appendable) throws IOException {
        if (appendable instanceof Writer) {
            ((Writer) appendable).write(this.f86472b, 0, this.f86473c);
            return;
        }
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(this.f86472b, 0, this.f86473c);
            return;
        }
        if (appendable instanceof StringBuffer) {
            ((StringBuffer) appendable).append(this.f86472b, 0, this.f86473c);
        } else if (appendable instanceof CharBuffer) {
            ((CharBuffer) appendable).put(this.f86472b, 0, this.f86473c);
        } else {
            appendable.append(this);
        }
    }

    public int Q0(m mVar, int i4) {
        int i5;
        if (i4 < 0) {
            i4 = 0;
        }
        if (mVar != null && i4 < (i5 = this.f86473c)) {
            char[] cArr = this.f86472b;
            for (int i6 = i4; i6 < i5; i6++) {
                if (mVar.g(cArr, i6, i4, i5) > 0) {
                    return i6;
                }
            }
        }
        return -1;
    }

    public k R(Iterable<?> iterable, String str) {
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

    public k R0(int i4, char c5) {
        K1(i4);
        F0(this.f86473c + 1);
        char[] cArr = this.f86472b;
        System.arraycopy(cArr, i4, cArr, i4 + 1, this.f86473c - i4);
        this.f86472b[i4] = c5;
        this.f86473c++;
        return this;
    }

    public k S(Iterator<?> it, String str) {
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

    public k S0(int i4, double d5) {
        return X0(i4, String.valueOf(d5));
    }

    public k T(Object[] objArr, String str) {
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

    public k T0(int i4, float f4) {
        return X0(i4, String.valueOf(f4));
    }

    public k U(char c5) {
        return append(c5).H();
    }

    public k U0(int i4, int i5) {
        return X0(i4, String.valueOf(i5));
    }

    public k V(double d5) {
        return f(d5).H();
    }

    public k V0(int i4, long j4) {
        return X0(i4, String.valueOf(j4));
    }

    public k W(float f4) {
        return g(f4).H();
    }

    public k W0(int i4, Object obj) {
        return obj == null ? X0(i4, this.f86475e) : X0(i4, obj.toString());
    }

    public k X(int i4) {
        return h(i4).H();
    }

    public k X0(int i4, String str) {
        int length;
        K1(i4);
        if (str == null) {
            str = this.f86475e;
        }
        if (str != null && (length = str.length()) > 0) {
            int i5 = this.f86473c + length;
            F0(i5);
            char[] cArr = this.f86472b;
            System.arraycopy(cArr, i4, cArr, i4 + length, this.f86473c - i4);
            this.f86473c = i5;
            str.getChars(0, length, this.f86472b, i4);
        }
        return this;
    }

    public k Y(long j4) {
        return i(j4).H();
    }

    public k Y0(int i4, boolean z4) {
        K1(i4);
        if (z4) {
            F0(this.f86473c + 4);
            char[] cArr = this.f86472b;
            System.arraycopy(cArr, i4, cArr, i4 + 4, this.f86473c - i4);
            char[] cArr2 = this.f86472b;
            cArr2[i4] = 't';
            cArr2[i4 + 1] = 'r';
            cArr2[i4 + 2] = 'u';
            cArr2[i4 + 3] = 'e';
            this.f86473c += 4;
        } else {
            F0(this.f86473c + 5);
            char[] cArr3 = this.f86472b;
            System.arraycopy(cArr3, i4, cArr3, i4 + 5, this.f86473c - i4);
            char[] cArr4 = this.f86472b;
            cArr4[i4] = 'f';
            cArr4[i4 + 1] = 'a';
            cArr4[i4 + 2] = 'l';
            cArr4[i4 + 3] = 's';
            cArr4[i4 + 4] = 'e';
            this.f86473c += 5;
        }
        return this;
    }

    public k Z(Object obj) {
        return l(obj).H();
    }

    public k Z0(int i4, char[] cArr) {
        K1(i4);
        if (cArr == null) {
            return X0(i4, this.f86475e);
        }
        int length = cArr.length;
        if (length > 0) {
            F0(this.f86473c + length);
            char[] cArr2 = this.f86472b;
            System.arraycopy(cArr2, i4, cArr2, i4 + length, this.f86473c - i4);
            System.arraycopy(cArr, 0, this.f86472b, i4, length);
            this.f86473c += length;
        }
        return this;
    }

    public k a0(String str) {
        return m(str).H();
    }

    public k a1(int i4, char[] cArr, int i5, int i6) {
        K1(i4);
        if (cArr == null) {
            return X0(i4, this.f86475e);
        }
        if (i5 < 0 || i5 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid offset: ", i5));
        }
        if (i6 < 0 || i5 + i6 > cArr.length) {
            throw new StringIndexOutOfBoundsException(android.support.v4.media.a.a("Invalid length: ", i6));
        }
        if (i6 > 0) {
            F0(this.f86473c + i6);
            char[] cArr2 = this.f86472b;
            System.arraycopy(cArr2, i4, cArr2, i4 + i6, this.f86473c - i4);
            System.arraycopy(cArr, i5, this.f86472b, i4, i6);
            this.f86473c += i6;
        }
        return this;
    }

    public k b0(String str, int i4, int i5) {
        return n(str, i4, i5).H();
    }

    public int b1(char c5) {
        return c1(c5, this.f86473c - 1);
    }

    public k c0(String str, Object... objArr) {
        return o(str, objArr).H();
    }

    public int c1(char c5, int i4) {
        int i5 = this.f86473c;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        if (i4 < 0) {
            return -1;
        }
        while (i4 >= 0) {
            if (this.f86472b[i4] == c5) {
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
        return this.f86472b[i4];
    }

    public k d0(StringBuffer stringBuffer) {
        return p(stringBuffer).H();
    }

    public int d1(String str) {
        return e1(str, this.f86473c - 1);
    }

    @Override // java.lang.Appendable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public k append(char c5) {
        F0(length() + 1);
        char[] cArr = this.f86472b;
        int i4 = this.f86473c;
        this.f86473c = i4 + 1;
        cArr[i4] = c5;
        return this;
    }

    public k e0(StringBuffer stringBuffer, int i4, int i5) {
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
            int r0 = r7.f86473c
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
            int r3 = r7.f86473c
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
            char[] r5 = r7.f86472b
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
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.k.e1(java.lang.String, int):int");
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && G0((k) obj);
    }

    public k f(double d5) {
        return m(String.valueOf(d5));
    }

    public k f0(StringBuilder sb) {
        return r(sb).H();
    }

    public int f1(m mVar) {
        return g1(mVar, this.f86473c);
    }

    public k g(float f4) {
        return m(String.valueOf(f4));
    }

    public k g0(StringBuilder sb, int i4, int i5) {
        return s(sb, i4, i5).H();
    }

    public int g1(m mVar, int i4) {
        int i5 = this.f86473c;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        if (mVar != null && i4 >= 0) {
            char[] cArr = this.f86472b;
            int i6 = i4 + 1;
            while (i4 >= 0) {
                if (mVar.g(cArr, i4, 0, i6) > 0) {
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
        System.arraycopy(this.f86472b, i4, cArr, i6, i5 - i4);
    }

    public k h(int i4) {
        return m(String.valueOf(i4));
    }

    public k h0(k kVar) {
        return v(kVar).H();
    }

    public String h1(int i4) {
        if (i4 <= 0) {
            return "";
        }
        int i5 = this.f86473c;
        return i4 >= i5 ? new String(this.f86472b, 0, i5) : new String(this.f86472b, 0, i4);
    }

    public int hashCode() {
        char[] cArr = this.f86472b;
        int i4 = 0;
        for (int i5 = this.f86473c - 1; i5 >= 0; i5--) {
            i4 = (i4 * 31) + cArr[i5];
        }
        return i4;
    }

    public k i(long j4) {
        return m(String.valueOf(j4));
    }

    public k i0(k kVar, int i4, int i5) {
        return w(kVar, i4, i5).H();
    }

    public String i1(int i4, int i5) {
        int i6;
        if (i4 < 0) {
            i4 = 0;
        }
        return (i5 <= 0 || i4 >= (i6 = this.f86473c)) ? "" : i6 <= i4 + i5 ? new String(this.f86472b, i4, i6 - i4) : new String(this.f86472b, i4, i5);
    }

    public boolean isEmpty() {
        return this.f86473c == 0;
    }

    @Override // java.lang.Appendable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public k append(CharSequence charSequence) {
        return charSequence == null ? I() : charSequence instanceof k ? v((k) charSequence) : charSequence instanceof StringBuilder ? r((StringBuilder) charSequence) : charSequence instanceof StringBuffer ? p((StringBuffer) charSequence) : charSequence instanceof CharBuffer ? t((CharBuffer) charSequence) : m(charSequence.toString());
    }

    public k j0(boolean z4) {
        return x(z4).H();
    }

    public k j1() {
        if (this.f86472b.length > length()) {
            char[] cArr = this.f86472b;
            char[] cArr2 = new char[length()];
            this.f86472b = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.f86473c);
        }
        return this;
    }

    @Override // java.lang.Appendable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public k append(CharSequence charSequence, int i4, int i5) {
        return charSequence == null ? I() : n(charSequence.toString(), i4, i5);
    }

    public k k0(char[] cArr) {
        return y(cArr).H();
    }

    public int k1(Readable readable) throws IOException {
        int i4 = this.f86473c;
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            F0(i4 + 1);
            while (true) {
                char[] cArr = this.f86472b;
                int i5 = this.f86473c;
                int read = reader.read(cArr, i5, cArr.length - i5);
                if (read == -1) {
                    break;
                }
                int i6 = this.f86473c + read;
                this.f86473c = i6;
                F0(i6 + 1);
            }
        } else if (readable instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) readable;
            int remaining = charBuffer.remaining();
            F0(this.f86473c + remaining);
            charBuffer.get(this.f86472b, this.f86473c, remaining);
            this.f86473c += remaining;
        } else {
            while (true) {
                F0(this.f86473c + 1);
                char[] cArr2 = this.f86472b;
                int i7 = this.f86473c;
                int read2 = readable.read(CharBuffer.wrap(cArr2, i7, cArr2.length - i7));
                if (read2 == -1) {
                    break;
                }
                this.f86473c += read2;
            }
        }
        return this.f86473c - i4;
    }

    public k l(Object obj) {
        return obj == null ? I() : obj instanceof CharSequence ? append((CharSequence) obj) : m(obj.toString());
    }

    public k l0(char[] cArr, int i4, int i5) {
        return z(cArr, i4, i5).H();
    }

    public k l1(int i4, int i5, String str) {
        int L1 = L1(i4, i5);
        u1(i4, L1, L1 - i4, str, str == null ? 0 : str.length());
        return this;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f86473c;
    }

    public k m(String str) {
        if (str == null) {
            return I();
        }
        int length = str.length();
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            str.getChars(0, length, this.f86472b, length2);
            this.f86473c += length;
        }
        return this;
    }

    public Reader m0() {
        return new a();
    }

    public k m1(m mVar, String str, int i4, int i5, int i6) {
        return t1(mVar, str, i4, L1(i4, i5), i6);
    }

    public k n(String str, int i4, int i5) {
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
            str.getChars(i4, i6, this.f86472b, length);
            this.f86473c += i5;
        }
        return this;
    }

    public o n0() {
        return new b();
    }

    public k n1(char c5, char c6) {
        if (c5 != c6) {
            for (int i4 = 0; i4 < this.f86473c; i4++) {
                char[] cArr = this.f86472b;
                if (cArr[i4] == c5) {
                    cArr[i4] = c6;
                }
            }
        }
        return this;
    }

    public k o(String str, Object... objArr) {
        return m(String.format(str, objArr));
    }

    public Writer o0() {
        return new c();
    }

    public k o1(String str, String str2) {
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

    public k p(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return I();
        }
        int length = stringBuffer.length();
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            stringBuffer.getChars(0, length, this.f86472b, length2);
            this.f86473c += length;
        }
        return this;
    }

    @Override // org.apache.commons.text.b
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public String a() {
        return toString();
    }

    public k p1(m mVar, String str) {
        return m1(mVar, str, 0, this.f86473c, -1);
    }

    public k q(StringBuffer stringBuffer, int i4, int i5) {
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
            stringBuffer.getChars(i4, i6, this.f86472b, length);
            this.f86473c += i5;
        }
        return this;
    }

    public int q0() {
        return this.f86472b.length;
    }

    public k q1(char c5, char c6) {
        if (c5 != c6) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.f86473c) {
                    break;
                }
                char[] cArr = this.f86472b;
                if (cArr[i4] == c5) {
                    cArr[i4] = c6;
                    break;
                }
                i4++;
            }
        }
        return this;
    }

    public k r(StringBuilder sb) {
        if (sb == null) {
            return I();
        }
        int length = sb.length();
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            sb.getChars(0, length, this.f86472b, length2);
            this.f86473c += length;
        }
        return this;
    }

    public k r0() {
        this.f86473c = 0;
        return this;
    }

    public k r1(String str, String str2) {
        int O0;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (O0 = O0(str, 0)) >= 0) {
            u1(O0, O0 + length, length, str2, str2 != null ? str2.length() : 0);
        }
        return this;
    }

    public k s(StringBuilder sb, int i4, int i5) {
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
            sb.getChars(i4, i6, this.f86472b, length);
            this.f86473c += i5;
        }
        return this;
    }

    public boolean s0(char c5) {
        char[] cArr = this.f86472b;
        for (int i4 = 0; i4 < this.f86473c; i4++) {
            if (cArr[i4] == c5) {
                return true;
            }
        }
        return false;
    }

    public k s1(m mVar, String str) {
        return m1(mVar, str, 0, this.f86473c, 1);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        if (i4 < 0) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        if (i5 > this.f86473c) {
            throw new StringIndexOutOfBoundsException(i5);
        }
        if (i4 <= i5) {
            return E1(i4, i5);
        }
        throw new StringIndexOutOfBoundsException(i5 - i4);
    }

    public k t(CharBuffer charBuffer) {
        if (charBuffer == null) {
            return I();
        }
        if (charBuffer.hasArray()) {
            int remaining = charBuffer.remaining();
            int length = length();
            F0(length + remaining);
            System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset(), this.f86472b, length, remaining);
            this.f86473c += remaining;
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
        return new String(this.f86472b, 0, this.f86473c);
    }

    public k u(CharBuffer charBuffer, int i4, int i5) {
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
            System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset() + i4, this.f86472b, length, i5);
            this.f86473c += i5;
        } else {
            n(charBuffer.toString(), i4, i5);
        }
        return this;
    }

    public boolean u0(m mVar) {
        return Q0(mVar, 0) >= 0;
    }

    public k v(k kVar) {
        if (kVar == null) {
            return I();
        }
        int length = kVar.length();
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            System.arraycopy(kVar.f86472b, 0, this.f86472b, length2, length);
            this.f86473c += length;
        }
        return this;
    }

    public k v0(int i4, int i5) {
        int L1 = L1(i4, i5);
        int i6 = L1 - i4;
        if (i6 > 0) {
            D0(i4, L1, i6);
        }
        return this;
    }

    public k v1() {
        int i4 = this.f86473c;
        if (i4 == 0) {
            return this;
        }
        int i5 = i4 / 2;
        char[] cArr = this.f86472b;
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

    public k w(k kVar, int i4, int i5) {
        int i6;
        if (kVar == null) {
            return I();
        }
        if (i4 < 0 || i4 > kVar.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i5 < 0 || (i6 = i4 + i5) > kVar.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i5 > 0) {
            int length = length();
            F0(length + i5);
            kVar.getChars(i4, i6, this.f86472b, length);
            this.f86473c += i5;
        }
        return this;
    }

    public k w0(char c5) {
        int i4 = 0;
        while (i4 < this.f86473c) {
            if (this.f86472b[i4] == c5) {
                int i5 = i4;
                do {
                    i5++;
                    if (i5 >= this.f86473c) {
                        break;
                    }
                } while (this.f86472b[i5] == c5);
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
        int i5 = this.f86473c;
        return i4 >= i5 ? new String(this.f86472b, 0, i5) : new String(this.f86472b, i5 - i4, i4);
    }

    public k x(boolean z4) {
        if (z4) {
            F0(this.f86473c + 4);
            char[] cArr = this.f86472b;
            int i4 = this.f86473c;
            int i5 = i4 + 1;
            this.f86473c = i5;
            cArr[i4] = 't';
            int i6 = i4 + 2;
            this.f86473c = i6;
            cArr[i5] = 'r';
            int i7 = i4 + 3;
            this.f86473c = i7;
            cArr[i6] = 'u';
            this.f86473c = i4 + 4;
            cArr[i7] = 'e';
        } else {
            F0(this.f86473c + 5);
            char[] cArr2 = this.f86472b;
            int i10 = this.f86473c;
            int i11 = i10 + 1;
            this.f86473c = i11;
            cArr2[i10] = 'f';
            int i12 = i10 + 2;
            this.f86473c = i12;
            cArr2[i11] = 'a';
            int i13 = i10 + 3;
            this.f86473c = i13;
            cArr2[i12] = 'l';
            int i14 = i10 + 4;
            this.f86473c = i14;
            cArr2[i13] = 's';
            this.f86473c = i10 + 5;
            cArr2[i14] = 'e';
        }
        return this;
    }

    public k x0(String str) {
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

    public k x1(int i4, char c5) {
        if (i4 < 0 || i4 >= length()) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        this.f86472b[i4] = c5;
        return this;
    }

    public k y(char[] cArr) {
        if (cArr == null) {
            return I();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            F0(length2 + length);
            System.arraycopy(cArr, 0, this.f86472b, length2, length);
            this.f86473c += length;
        }
        return this;
    }

    public k y0(m mVar) {
        return m1(mVar, null, 0, this.f86473c, -1);
    }

    public k y1(int i4) {
        if (i4 < 0) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        int i5 = this.f86473c;
        if (i4 < i5) {
            this.f86473c = i4;
        } else if (i4 > i5) {
            F0(i4);
            this.f86473c = i4;
            for (int i6 = this.f86473c; i6 < i4; i6++) {
                this.f86472b[i6] = 0;
            }
        }
        return this;
    }

    public k z(char[] cArr, int i4, int i5) {
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
            System.arraycopy(cArr, i4, this.f86472b, length, i5);
            this.f86473c += i5;
        }
        return this;
    }

    public k z0(int i4) {
        if (i4 < 0 || i4 >= this.f86473c) {
            throw new StringIndexOutOfBoundsException(i4);
        }
        D0(i4, i4 + 1, 1);
        return this;
    }

    public k z1(String str) {
        this.f86474d = str;
        return this;
    }

    /* compiled from: StrBuilder.java */
    class a extends Reader {

        /* renamed from: b, reason: collision with root package name */
        private int f86476b;

        /* renamed from: c, reason: collision with root package name */
        private int f86477c;

        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Reader
        public void mark(int i4) {
            this.f86477c = this.f86476b;
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
            k kVar = k.this;
            int i4 = this.f86476b;
            this.f86476b = i4 + 1;
            return kVar.charAt(i4);
        }

        @Override // java.io.Reader
        public boolean ready() {
            return this.f86476b < k.this.B1();
        }

        @Override // java.io.Reader
        public void reset() {
            this.f86476b = this.f86477c;
        }

        @Override // java.io.Reader
        public long skip(long j4) {
            if (this.f86476b + j4 > k.this.B1()) {
                j4 = k.this.B1() - this.f86476b;
            }
            if (j4 < 0) {
                return 0L;
            }
            this.f86476b = (int) (this.f86476b + j4);
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
            if (this.f86476b >= k.this.B1()) {
                return -1;
            }
            if (this.f86476b + i5 > k.this.B1()) {
                i5 = k.this.B1() - this.f86476b;
            }
            k kVar = k.this;
            int i7 = this.f86476b;
            kVar.getChars(i7, i7 + i5, cArr, i4);
            this.f86476b += i5;
            return i5;
        }
    }

    public k(int i4) {
        this.f86472b = new char[i4 <= 0 ? 32 : i4];
    }

    public k(String str) {
        if (str == null) {
            this.f86472b = new char[32];
        } else {
            this.f86472b = new char[str.length() + 32];
            m(str);
        }
    }
}
