package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;

@p
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public abstract class BaseEncoding {

    /* renamed from: a, reason: collision with root package name */
    private static final BaseEncoding f57046a = new h(ProtectedSandApp.s("\uf663"), ProtectedSandApp.s("\uf664"), '=');

    /* renamed from: b, reason: collision with root package name */
    private static final BaseEncoding f57047b = new h(ProtectedSandApp.s("\uf665"), ProtectedSandApp.s("\uf666"), '=');

    /* renamed from: c, reason: collision with root package name */
    private static final BaseEncoding f57048c = new j(ProtectedSandApp.s("\uf667"), ProtectedSandApp.s("\uf668"), '=');

    /* renamed from: d, reason: collision with root package name */
    private static final BaseEncoding f57049d = new j(ProtectedSandApp.s("\uf669"), ProtectedSandApp.s("\uf66a"), '=');

    /* renamed from: e, reason: collision with root package name */
    private static final BaseEncoding f57050e = new g(ProtectedSandApp.s("\uf66b"), ProtectedSandApp.s("\uf66c"));

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }

        DecodingException(Throwable th) {
            super(th);
        }
    }

    class a extends com.google.common.io.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.io.i f57051a;

        a(com.google.common.io.i iVar) {
            this.f57051a = iVar;
        }

        @Override // com.google.common.io.e
        public OutputStream c() throws IOException {
            return BaseEncoding.this.p(this.f57051a.b());
        }
    }

    class b extends com.google.common.io.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.io.j f57053a;

        b(com.google.common.io.j jVar) {
            this.f57053a = jVar;
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return BaseEncoding.this.k(this.f57053a.m());
        }
    }

    class e extends Writer {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Appendable f57061b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Writer f57062c;

        e(Appendable appendable, Writer writer) {
            this.f57061b = appendable;
            this.f57062c = writer;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f57062c.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.f57062c.flush();
        }

        @Override // java.io.Writer
        public void write(int i4) throws IOException {
            this.f57061b.append((char) i4);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i4, int i5) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final String f57063a;

        /* renamed from: b, reason: collision with root package name */
        private final char[] f57064b;

        /* renamed from: c, reason: collision with root package name */
        final int f57065c;

        /* renamed from: d, reason: collision with root package name */
        final int f57066d;

        /* renamed from: e, reason: collision with root package name */
        final int f57067e;

        /* renamed from: f, reason: collision with root package name */
        final int f57068f;

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f57069g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean[] f57070h;

        f(String str, char[] cArr) {
            str.getClass();
            this.f57063a = str;
            cArr.getClass();
            this.f57064b = cArr;
            try {
                int p4 = com.google.common.math.f.p(cArr.length, RoundingMode.UNNECESSARY);
                this.f57066d = p4;
                int min = Math.min(8, Integer.lowestOneBit(p4));
                try {
                    this.f57067e = 8 / min;
                    this.f57068f = p4 / min;
                    this.f57065c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i4 = 0; i4 < cArr.length; i4++) {
                        char c5 = cArr[i4];
                        l0.f(c5 < 128, ProtectedSandApp.s("\uf659"), c5);
                        l0.f(bArr[c5] == -1, ProtectedSandApp.s("\uf65a"), c5);
                        bArr[c5] = (byte) i4;
                    }
                    this.f57069g = bArr;
                    boolean[] zArr = new boolean[this.f57067e];
                    for (int i5 = 0; i5 < this.f57068f; i5++) {
                        zArr[com.google.common.math.f.g(i5 * 8, this.f57066d, RoundingMode.CEILING)] = true;
                    }
                    this.f57070h = zArr;
                } catch (ArithmeticException e4) {
                    String str2 = new String(cArr);
                    int length = str2.length();
                    String s4 = ProtectedSandApp.s("\uf65b");
                    throw new IllegalArgumentException(length != 0 ? s4.concat(str2) : new String(s4), e4);
                }
            } catch (ArithmeticException e5) {
                throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(35, ProtectedSandApp.s("\uf65c"), cArr.length), e5);
            }
        }

        private boolean e() {
            for (char c5 : this.f57064b) {
                if (com.google.common.base.c.c(c5)) {
                    return true;
                }
            }
            return false;
        }

        private boolean f() {
            for (char c5 : this.f57064b) {
                if (com.google.common.base.c.d(c5)) {
                    return true;
                }
            }
            return false;
        }

        boolean b(char c5) {
            return c5 <= 127 && this.f57069g[c5] != -1;
        }

        int c(char c5) throws DecodingException {
            String s4 = ProtectedSandApp.s("\uf65d");
            if (c5 > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c5));
                throw new DecodingException(valueOf.length() != 0 ? s4.concat(valueOf) : new String(s4));
            }
            byte b5 = this.f57069g[c5];
            if (b5 != -1) {
                return b5;
            }
            if (c5 <= ' ' || c5 == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c5));
                throw new DecodingException(valueOf2.length() != 0 ? s4.concat(valueOf2) : new String(s4));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append(ProtectedSandApp.s("\uf65e"));
            sb.append(c5);
            throw new DecodingException(sb.toString());
        }

        char d(int i4) {
            return this.f57064b[i4];
        }

        public boolean equals(@zc.a Object obj) {
            if (obj instanceof f) {
                return Arrays.equals(this.f57064b, ((f) obj).f57064b);
            }
            return false;
        }

        boolean g(int i4) {
            return this.f57070h[i4 % this.f57067e];
        }

        f h() {
            if (!f()) {
                return this;
            }
            l0.h0(!e(), ProtectedSandApp.s("\uf65f"));
            char[] cArr = new char[this.f57064b.length];
            int i4 = 0;
            while (true) {
                char[] cArr2 = this.f57064b;
                if (i4 >= cArr2.length) {
                    return new f(String.valueOf(this.f57063a).concat(ProtectedSandApp.s("\uf660")), cArr);
                }
                cArr[i4] = com.google.common.base.c.e(cArr2[i4]);
                i4++;
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.f57064b);
        }

        public boolean i(char c5) {
            byte[] bArr = this.f57069g;
            return c5 < bArr.length && bArr[c5] != -1;
        }

        f j() {
            if (!e()) {
                return this;
            }
            l0.h0(!f(), ProtectedSandApp.s("\uf661"));
            char[] cArr = new char[this.f57064b.length];
            int i4 = 0;
            while (true) {
                char[] cArr2 = this.f57064b;
                if (i4 >= cArr2.length) {
                    return new f(String.valueOf(this.f57063a).concat(ProtectedSandApp.s("\uf662")), cArr);
                }
                cArr[i4] = com.google.common.base.c.h(cArr2[i4]);
                i4++;
            }
        }

        public String toString() {
            return this.f57063a;
        }
    }

    static final class g extends j {

        /* renamed from: j, reason: collision with root package name */
        final char[] f57071j;

        g(String str, String str2) {
            this(new f(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.j
        BaseEncoding D(f fVar, @zc.a Character ch) {
            return new g(fVar);
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        int i(byte[] bArr, CharSequence charSequence) throws DecodingException {
            bArr.getClass();
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException(com.google.android.gms.internal.location.a.a(32, ProtectedSandApp.s("\uf675"), charSequence.length()));
            }
            int i4 = 0;
            int i5 = 0;
            while (i4 < charSequence.length()) {
                bArr[i5] = (byte) ((this.f57075f.c(charSequence.charAt(i4)) << 4) | this.f57075f.c(charSequence.charAt(i4 + 1)));
                i4 += 2;
                i5++;
            }
            return i5;
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        void n(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
            appendable.getClass();
            l0.f0(i4, i4 + i5, bArr.length);
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bArr[i4 + i6] & 255;
                appendable.append(this.f57071j[i7]);
                appendable.append(this.f57071j[i7 | 256]);
            }
        }

        private g(f fVar) {
            super(fVar, null);
            this.f57071j = new char[512];
            l0.d(fVar.f57064b.length == 16);
            for (int i4 = 0; i4 < 256; i4++) {
                this.f57071j[i4] = fVar.d(i4 >>> 4);
                this.f57071j[i4 | 256] = fVar.d(i4 & 15);
            }
        }
    }

    static final class h extends j {
        h(String str, String str2, @zc.a Character ch) {
            this(new f(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding.j
        BaseEncoding D(f fVar, @zc.a Character ch) {
            return new h(fVar, ch);
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        int i(byte[] bArr, CharSequence charSequence) throws DecodingException {
            bArr.getClass();
            CharSequence y4 = y(charSequence);
            if (!this.f57075f.g(y4.length())) {
                throw new DecodingException(com.google.android.gms.internal.location.a.a(32, ProtectedSandApp.s("\uf676"), y4.length()));
            }
            int i4 = 0;
            int i5 = 0;
            while (i4 < y4.length()) {
                int i6 = i4 + 2;
                int c5 = (this.f57075f.c(y4.charAt(i4)) << 18) | (this.f57075f.c(y4.charAt(i4 + 1)) << 12);
                int i7 = i5 + 1;
                bArr[i5] = (byte) (c5 >>> 16);
                if (i6 < y4.length()) {
                    int i10 = i4 + 3;
                    int c6 = c5 | (this.f57075f.c(y4.charAt(i6)) << 6);
                    int i11 = i5 + 2;
                    bArr[i7] = (byte) ((c6 >>> 8) & 255);
                    if (i10 < y4.length()) {
                        i4 += 4;
                        i5 += 3;
                        bArr[i11] = (byte) ((c6 | this.f57075f.c(y4.charAt(i10))) & 255);
                    } else {
                        i5 = i11;
                        i4 = i10;
                    }
                } else {
                    i5 = i7;
                    i4 = i6;
                }
            }
            return i5;
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        void n(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
            appendable.getClass();
            int i6 = i4 + i5;
            l0.f0(i4, i6, bArr.length);
            while (i5 >= 3) {
                int i7 = i4 + 2;
                int i10 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
                i4 += 3;
                int i11 = i10 | (bArr[i7] & 255);
                appendable.append(this.f57075f.d(i11 >>> 18));
                appendable.append(this.f57075f.d((i11 >>> 12) & 63));
                appendable.append(this.f57075f.d((i11 >>> 6) & 63));
                appendable.append(this.f57075f.d(i11 & 63));
                i5 -= 3;
            }
            if (i4 < i6) {
                C(appendable, bArr, i4, i6 - i4);
            }
        }

        private h(f fVar, @zc.a Character ch) {
            super(fVar, ch);
            l0.d(fVar.f57064b.length == 64);
        }
    }

    static final class i extends BaseEncoding {

        /* renamed from: f, reason: collision with root package name */
        private final BaseEncoding f57072f;

        /* renamed from: g, reason: collision with root package name */
        private final String f57073g;

        /* renamed from: h, reason: collision with root package name */
        private final int f57074h;

        i(BaseEncoding baseEncoding, String str, int i4) {
            baseEncoding.getClass();
            this.f57072f = baseEncoding;
            str.getClass();
            this.f57073g = str;
            this.f57074h = i4;
            l0.k(i4 > 0, ProtectedSandApp.s("\uf677"), i4);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding A(char c5) {
            return this.f57072f.A(c5).B(this.f57073g, this.f57074h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding B(String str, int i4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf678"));
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean f(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < charSequence.length(); i4++) {
                char charAt = charSequence.charAt(i4);
                if (this.f57073g.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.f57072f.f(sb);
        }

        @Override // com.google.common.io.BaseEncoding
        int i(byte[] bArr, CharSequence charSequence) throws DecodingException {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i4 = 0; i4 < charSequence.length(); i4++) {
                char charAt = charSequence.charAt(i4);
                if (this.f57073g.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.f57072f.i(bArr, sb);
        }

        @Override // com.google.common.io.BaseEncoding
        @d9.c
        public InputStream k(Reader reader) {
            return this.f57072f.k(BaseEncoding.r(reader, this.f57073g));
        }

        @Override // com.google.common.io.BaseEncoding
        void n(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
            this.f57072f.n(BaseEncoding.w(appendable, this.f57073g, this.f57074h), bArr, i4, i5);
        }

        @Override // com.google.common.io.BaseEncoding
        @d9.c
        public OutputStream p(Writer writer) {
            return this.f57072f.p(BaseEncoding.x(writer, this.f57073g, this.f57074h));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding s() {
            return this.f57072f.s().B(this.f57073g, this.f57074h);
        }

        @Override // com.google.common.io.BaseEncoding
        int t(int i4) {
            return this.f57072f.t(i4);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57072f);
            String str = this.f57073g;
            return android.support.v4.media.b.a(com.google.common.base.g.a(com.google.android.gms.common.internal.b.a(str, valueOf.length() + 31), valueOf, ProtectedSandApp.s("\uf679"), str, ProtectedSandApp.s("\uf67a")), this.f57074h, ProtectedSandApp.s("\uf67b"));
        }

        @Override // com.google.common.io.BaseEncoding
        int u(int i4) {
            int u4 = this.f57072f.u(i4);
            return (com.google.common.math.f.g(Math.max(0, u4 - 1), this.f57074h, RoundingMode.FLOOR) * this.f57073g.length()) + u4;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding v() {
            return this.f57072f.v().B(this.f57073g, this.f57074h);
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence y(CharSequence charSequence) {
            return this.f57072f.y(charSequence);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding z() {
            return this.f57072f.z().B(this.f57073g, this.f57074h);
        }
    }

    static class j extends BaseEncoding {

        /* renamed from: f, reason: collision with root package name */
        final f f57075f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        final Character f57076g;

        /* renamed from: h, reason: collision with root package name */
        @g9.b
        @zc.a
        private transient BaseEncoding f57077h;

        /* renamed from: i, reason: collision with root package name */
        @g9.b
        @zc.a
        private transient BaseEncoding f57078i;

        class a extends OutputStream {

            /* renamed from: b, reason: collision with root package name */
            int f57079b = 0;

            /* renamed from: c, reason: collision with root package name */
            int f57080c = 0;

            /* renamed from: d, reason: collision with root package name */
            int f57081d = 0;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Writer f57082e;

            a(Writer writer) {
                this.f57082e = writer;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i4 = this.f57080c;
                if (i4 > 0) {
                    int i5 = this.f57079b;
                    f fVar = j.this.f57075f;
                    this.f57082e.write(fVar.d((i5 << (fVar.f57066d - i4)) & fVar.f57065c));
                    this.f57081d++;
                    if (j.this.f57076g != null) {
                        while (true) {
                            int i6 = this.f57081d;
                            j jVar = j.this;
                            if (i6 % jVar.f57075f.f57067e == 0) {
                                break;
                            }
                            this.f57082e.write(jVar.f57076g.charValue());
                            this.f57081d++;
                        }
                    }
                }
                this.f57082e.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.f57082e.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i4) throws IOException {
                this.f57079b = (i4 & 255) | (this.f57079b << 8);
                this.f57080c += 8;
                while (true) {
                    int i5 = this.f57080c;
                    f fVar = j.this.f57075f;
                    int i6 = fVar.f57066d;
                    if (i5 < i6) {
                        return;
                    }
                    this.f57082e.write(fVar.d((this.f57079b >> (i5 - i6)) & fVar.f57065c));
                    this.f57081d++;
                    this.f57080c -= j.this.f57075f.f57066d;
                }
            }
        }

        j(String str, String str2, @zc.a Character ch) {
            this(new f(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding A(char c5) {
            Character ch;
            return (8 % this.f57075f.f57066d == 0 || ((ch = this.f57076g) != null && ch.charValue() == c5)) ? this : D(this.f57075f, Character.valueOf(c5));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding B(String str, int i4) {
            for (int i5 = 0; i5 < str.length(); i5++) {
                l0.u(!this.f57075f.i(str.charAt(i5)), ProtectedSandApp.s("\uf66e"), str);
            }
            Character ch = this.f57076g;
            if (ch != null) {
                l0.u(str.indexOf(ch.charValue()) < 0, ProtectedSandApp.s("\uf66f"), str);
            }
            return new i(this, str, i4);
        }

        void C(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
            appendable.getClass();
            l0.f0(i4, i4 + i5, bArr.length);
            int i6 = 0;
            l0.d(i5 <= this.f57075f.f57068f);
            long j4 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                j4 = (j4 | (bArr[i4 + i7] & 255)) << 8;
            }
            int i10 = ((i5 + 1) * 8) - this.f57075f.f57066d;
            while (i6 < i5 * 8) {
                f fVar = this.f57075f;
                appendable.append(fVar.d(((int) (j4 >>> (i10 - i6))) & fVar.f57065c));
                i6 += this.f57075f.f57066d;
            }
            if (this.f57076g != null) {
                while (i6 < this.f57075f.f57068f * 8) {
                    appendable.append(this.f57076g.charValue());
                    i6 += this.f57075f.f57066d;
                }
            }
        }

        BaseEncoding D(f fVar, @zc.a Character ch) {
            return new j(fVar, ch);
        }

        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f57075f.equals(jVar.f57075f) && com.google.common.base.f0.a(this.f57076g, jVar.f57076g);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean f(CharSequence charSequence) {
            charSequence.getClass();
            CharSequence y4 = y(charSequence);
            if (!this.f57075f.g(y4.length())) {
                return false;
            }
            for (int i4 = 0; i4 < y4.length(); i4++) {
                if (!this.f57075f.b(y4.charAt(i4))) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.f57075f.hashCode() ^ Arrays.hashCode(new Object[]{this.f57076g});
        }

        @Override // com.google.common.io.BaseEncoding
        int i(byte[] bArr, CharSequence charSequence) throws DecodingException {
            f fVar;
            bArr.getClass();
            CharSequence y4 = y(charSequence);
            if (!this.f57075f.g(y4.length())) {
                throw new DecodingException(com.google.android.gms.internal.location.a.a(32, ProtectedSandApp.s("\uf670"), y4.length()));
            }
            int i4 = 0;
            int i5 = 0;
            while (i4 < y4.length()) {
                long j4 = 0;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    fVar = this.f57075f;
                    if (i6 >= fVar.f57067e) {
                        break;
                    }
                    j4 <<= fVar.f57066d;
                    if (i4 + i6 < y4.length()) {
                        j4 |= this.f57075f.c(y4.charAt(i7 + i4));
                        i7++;
                    }
                    i6++;
                }
                int i10 = fVar.f57068f;
                int i11 = (i10 * 8) - (i7 * fVar.f57066d);
                int i12 = (i10 - 1) * 8;
                while (i12 >= i11) {
                    bArr[i5] = (byte) ((j4 >>> i12) & 255);
                    i12 -= 8;
                    i5++;
                }
                i4 += this.f57075f.f57067e;
            }
            return i5;
        }

        @Override // com.google.common.io.BaseEncoding
        @d9.c
        public InputStream k(Reader reader) {
            reader.getClass();
            return new b(reader);
        }

        @Override // com.google.common.io.BaseEncoding
        void n(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException {
            appendable.getClass();
            l0.f0(i4, i4 + i5, bArr.length);
            int i6 = 0;
            while (i6 < i5) {
                C(appendable, bArr, i4 + i6, Math.min(this.f57075f.f57068f, i5 - i6));
                i6 += this.f57075f.f57068f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        @d9.c
        public OutputStream p(Writer writer) {
            writer.getClass();
            return new a(writer);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding s() {
            BaseEncoding baseEncoding = this.f57078i;
            if (baseEncoding == null) {
                f h4 = this.f57075f.h();
                baseEncoding = h4 == this.f57075f ? this : D(h4, this.f57076g);
                this.f57078i = baseEncoding;
            }
            return baseEncoding;
        }

        @Override // com.google.common.io.BaseEncoding
        int t(int i4) {
            return (int) (((this.f57075f.f57066d * i4) + 7) / 8);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\uf671"));
            sb.append(this.f57075f.toString());
            if (8 % this.f57075f.f57066d != 0) {
                if (this.f57076g == null) {
                    sb.append(ProtectedSandApp.s("\uf672"));
                } else {
                    sb.append(ProtectedSandApp.s("\uf673"));
                    sb.append(this.f57076g);
                    sb.append(ProtectedSandApp.s("\uf674"));
                }
            }
            return sb.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        int u(int i4) {
            f fVar = this.f57075f;
            return com.google.common.math.f.g(i4, fVar.f57068f, RoundingMode.CEILING) * fVar.f57067e;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding v() {
            return this.f57076g == null ? this : D(this.f57075f, null);
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence y(CharSequence charSequence) {
            charSequence.getClass();
            Character ch = this.f57076g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding z() {
            BaseEncoding baseEncoding = this.f57077h;
            if (baseEncoding == null) {
                f j4 = this.f57075f.j();
                baseEncoding = j4 == this.f57075f ? this : D(j4, this.f57076g);
                this.f57077h = baseEncoding;
            }
            return baseEncoding;
        }

        j(f fVar, @zc.a Character ch) {
            fVar.getClass();
            this.f57075f = fVar;
            l0.u(ch == null || !fVar.i(ch.charValue()), ProtectedSandApp.s("\uf66d"), ch);
            this.f57076g = ch;
        }

        class b extends InputStream {

            /* renamed from: b, reason: collision with root package name */
            int f57084b = 0;

            /* renamed from: c, reason: collision with root package name */
            int f57085c = 0;

            /* renamed from: d, reason: collision with root package name */
            int f57086d = 0;

            /* renamed from: e, reason: collision with root package name */
            boolean f57087e = false;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Reader f57088f;

            b(Reader reader) {
                this.f57088f = reader;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f57088f.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int i4;
                while (true) {
                    int read = this.f57088f.read();
                    if (read == -1) {
                        if (this.f57087e || j.this.f57075f.g(this.f57086d)) {
                            return -1;
                        }
                        throw new DecodingException(com.google.android.gms.internal.location.a.a(32, ProtectedSandApp.s("\uf67c"), this.f57086d));
                    }
                    this.f57086d++;
                    char c5 = (char) read;
                    Character ch = j.this.f57076g;
                    if (ch == null || ch.charValue() != c5) {
                        if (this.f57087e) {
                            int i5 = this.f57086d;
                            StringBuilder sb = new StringBuilder(61);
                            sb.append(ProtectedSandApp.s("\uf67e"));
                            sb.append(c5);
                            sb.append(ProtectedSandApp.s("\uf67f"));
                            sb.append(i5);
                            throw new DecodingException(sb.toString());
                        }
                        int i6 = this.f57084b;
                        f fVar = j.this.f57075f;
                        int i7 = i6 << fVar.f57066d;
                        this.f57084b = i7;
                        int c6 = fVar.c(c5) | i7;
                        this.f57084b = c6;
                        int i10 = this.f57085c + j.this.f57075f.f57066d;
                        this.f57085c = i10;
                        if (i10 >= 8) {
                            int i11 = i10 - 8;
                            this.f57085c = i11;
                            return (c6 >> i11) & 255;
                        }
                    } else if (this.f57087e || ((i4 = this.f57086d) != 1 && j.this.f57075f.g(i4 - 1))) {
                        this.f57087e = true;
                    }
                }
                throw new DecodingException(com.google.android.gms.internal.location.a.a(41, ProtectedSandApp.s("\uf67d"), this.f57086d));
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i4, int i5) throws IOException {
                int i6 = i5 + i4;
                l0.f0(i4, i6, bArr.length);
                int i7 = i4;
                while (i7 < i6) {
                    int read = read();
                    if (read == -1) {
                        int i10 = i7 - i4;
                        if (i10 == 0) {
                            return -1;
                        }
                        return i10;
                    }
                    bArr[i7] = (byte) read;
                    i7++;
                }
                return i7 - i4;
            }
        }
    }

    BaseEncoding() {
    }

    public static BaseEncoding a() {
        return f57050e;
    }

    public static BaseEncoding b() {
        return f57048c;
    }

    public static BaseEncoding c() {
        return f57049d;
    }

    public static BaseEncoding d() {
        return f57046a;
    }

    public static BaseEncoding e() {
        return f57047b;
    }

    private static byte[] q(byte[] bArr, int i4) {
        if (i4 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }

    @d9.c
    static Reader r(Reader reader, String str) {
        reader.getClass();
        str.getClass();
        return new c(reader, str);
    }

    static Appendable w(Appendable appendable, String str, int i4) {
        appendable.getClass();
        str.getClass();
        l0.d(i4 > 0);
        return new d(i4, appendable, str);
    }

    @d9.c
    static Writer x(Writer writer, String str, int i4) {
        return new e(w(writer, str, i4), writer);
    }

    public abstract BaseEncoding A(char c5);

    public abstract BaseEncoding B(String str, int i4);

    public abstract boolean f(CharSequence charSequence);

    public final byte[] g(CharSequence charSequence) {
        try {
            return h(charSequence);
        } catch (DecodingException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    final byte[] h(CharSequence charSequence) throws DecodingException {
        CharSequence y4 = y(charSequence);
        byte[] bArr = new byte[t(y4.length())];
        return q(bArr, i(bArr, y4));
    }

    abstract int i(byte[] bArr, CharSequence charSequence) throws DecodingException;

    @d9.c
    public final com.google.common.io.f j(com.google.common.io.j jVar) {
        jVar.getClass();
        return new b(jVar);
    }

    @d9.c
    public abstract InputStream k(Reader reader);

    public String l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public final String m(byte[] bArr, int i4, int i5) {
        l0.f0(i4, i4 + i5, bArr.length);
        StringBuilder sb = new StringBuilder(u(i5));
        try {
            n(sb, bArr, i4, i5);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    abstract void n(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException;

    @d9.c
    public final com.google.common.io.e o(com.google.common.io.i iVar) {
        iVar.getClass();
        return new a(iVar);
    }

    @d9.c
    public abstract OutputStream p(Writer writer);

    public abstract BaseEncoding s();

    abstract int t(int i4);

    abstract int u(int i4);

    public abstract BaseEncoding v();

    CharSequence y(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence;
    }

    public abstract BaseEncoding z();

    class c extends Reader {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Reader f57055b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f57056c;

        c(Reader reader, String str) {
            this.f57055b = reader;
            this.f57056c = str;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f57055b.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int read;
            do {
                read = this.f57055b.read();
                if (read == -1) {
                    break;
                }
            } while (this.f57056c.indexOf((char) read) >= 0);
            return read;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i4, int i5) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    class d implements Appendable {

        /* renamed from: b, reason: collision with root package name */
        int f57057b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f57058c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Appendable f57059d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f57060e;

        d(int i4, Appendable appendable, String str) {
            this.f57058c = i4;
            this.f57059d = appendable;
            this.f57060e = str;
            this.f57057b = i4;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c5) throws IOException {
            if (this.f57057b == 0) {
                this.f57059d.append(this.f57060e);
                this.f57057b = this.f57058c;
            }
            this.f57059d.append(c5);
            this.f57057b--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@zc.a CharSequence charSequence, int i4, int i5) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(@zc.a CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }
    }
}
