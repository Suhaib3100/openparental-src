package net.minidev.json.parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.text.m0;

/* compiled from: JSONParserBase.java */
/* loaded from: classes7.dex */
abstract class g {

    /* renamed from: q, reason: collision with root package name */
    public static final byte f81771q = 26;

    /* renamed from: r, reason: collision with root package name */
    protected static final char f81772r = '~';

    /* renamed from: s, reason: collision with root package name */
    protected static boolean[] f81773s;

    /* renamed from: t, reason: collision with root package name */
    protected static boolean[] f81774t;

    /* renamed from: u, reason: collision with root package name */
    protected static boolean[] f81775u;

    /* renamed from: v, reason: collision with root package name */
    protected static boolean[] f81776v;

    /* renamed from: w, reason: collision with root package name */
    protected static boolean[] f81777w;

    /* renamed from: a, reason: collision with root package name */
    protected char f81778a;

    /* renamed from: b, reason: collision with root package name */
    protected net.minidev.json.parser.a f81779b;

    /* renamed from: c, reason: collision with root package name */
    protected b f81780c;

    /* renamed from: d, reason: collision with root package name */
    protected final a f81781d = new a(15);

    /* renamed from: e, reason: collision with root package name */
    protected Object f81782e;

    /* renamed from: f, reason: collision with root package name */
    protected String f81783f;

    /* renamed from: g, reason: collision with root package name */
    protected int f81784g;

    /* renamed from: h, reason: collision with root package name */
    protected final boolean f81785h;

    /* renamed from: i, reason: collision with root package name */
    protected final boolean f81786i;

    /* renamed from: j, reason: collision with root package name */
    protected final boolean f81787j;

    /* renamed from: k, reason: collision with root package name */
    protected final boolean f81788k;

    /* renamed from: l, reason: collision with root package name */
    protected final boolean f81789l;

    /* renamed from: m, reason: collision with root package name */
    protected final boolean f81790m;

    /* renamed from: n, reason: collision with root package name */
    protected final boolean f81791n;

    /* renamed from: o, reason: collision with root package name */
    protected final boolean f81792o;

    /* renamed from: p, reason: collision with root package name */
    protected final boolean f81793p;

    /* compiled from: JSONParserBase.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        char[] f81794a;

        /* renamed from: b, reason: collision with root package name */
        int f81795b = -1;

        public a(int i4) {
            this.f81794a = new char[i4];
        }

        public void a(char c5) {
            int i4 = this.f81795b + 1;
            this.f81795b = i4;
            char[] cArr = this.f81794a;
            if (cArr.length <= i4) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f81794a = cArr2;
            }
            this.f81794a[this.f81795b] = c5;
        }

        public void b(int i4) {
            int i5 = this.f81795b + 1;
            this.f81795b = i5;
            char[] cArr = this.f81794a;
            if (cArr.length <= i5) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f81794a = cArr2;
            }
            this.f81794a[this.f81795b] = (char) i4;
        }

        public void c() {
            this.f81795b = -1;
        }

        public String toString() {
            return new String(this.f81794a, 0, this.f81795b + 1);
        }
    }

    static {
        boolean[] zArr = new boolean[126];
        f81773s = zArr;
        boolean[] zArr2 = new boolean[126];
        f81774t = zArr2;
        boolean[] zArr3 = new boolean[126];
        f81775u = zArr3;
        boolean[] zArr4 = new boolean[126];
        f81776v = zArr4;
        boolean[] zArr5 = new boolean[126];
        f81777w = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public g(int i4) {
        this.f81786i = (i4 & 4) > 0;
        this.f81787j = (i4 & 2) > 0;
        this.f81788k = (i4 & 1) > 0;
        this.f81791n = (i4 & 8) > 0;
        this.f81793p = (i4 & 16) > 0;
        this.f81785h = (i4 & 32) > 0;
        this.f81789l = (i4 & 64) > 0;
        this.f81792o = (i4 & 128) > 0;
        this.f81790m = (i4 & 256) == 0;
    }

    public void a() throws ParseException {
        if (this.f81791n) {
            return;
        }
        int length = this.f81783f.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = this.f81783f.charAt(i4);
            if (charAt >= 0) {
                if (charAt <= 31) {
                    throw new ParseException(this.f81784g + i4, 0, Character.valueOf(charAt));
                }
                if (charAt == 127) {
                    throw new ParseException(this.f81784g + i4, 0, Character.valueOf(charAt));
                }
            }
        }
    }

    public void b() throws ParseException {
        int length = this.f81783f.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (this.f81783f.equals(ProtectedSandApp.s("襧\u0001"))) {
                throw new ParseException(this.f81784g, 6, this.f81783f);
            }
            return;
        }
        char charAt = this.f81783f.charAt(0);
        char charAt2 = this.f81783f.charAt(1);
        if (charAt != '-') {
            if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                throw new ParseException(this.f81784g, 6, this.f81783f);
            }
            return;
        }
        char charAt3 = this.f81783f.charAt(2);
        if (charAt2 == '0' && charAt3 >= '0' && charAt3 <= '9') {
            throw new ParseException(this.f81784g, 6, this.f81783f);
        }
    }

    protected Number c() throws ParseException {
        if (!this.f81785h) {
            b();
        }
        return !this.f81792o ? Float.valueOf(Float.parseFloat(this.f81783f)) : this.f81783f.length() > 18 ? new BigDecimal(this.f81783f) : Double.valueOf(Double.parseDouble(this.f81783f));
    }

    public Object d(net.minidev.json.parser.a aVar, b bVar) throws ParseException {
        this.f81779b = aVar;
        this.f81780c = bVar;
        this.f81784g = -1;
        try {
            f();
            bVar.f();
            Object h4 = h(f81777w);
            bVar.i();
            if (this.f81790m) {
                s();
                if (this.f81778a != 26) {
                    throw new ParseException(this.f81784g - 1, 1, Character.valueOf(this.f81778a));
                }
            }
            this.f81783f = null;
            this.f81782e = null;
            return h4;
        } catch (IOException e4) {
            throw new ParseException(this.f81784g, e4);
        }
    }

    protected Number e(String str) throws ParseException {
        int i4;
        int i5;
        int length = str.length();
        boolean z4 = false;
        if (str.charAt(0) == '-') {
            if (!this.f81785h && length >= 3 && str.charAt(1) == '0') {
                throw new ParseException(this.f81784g, 6, str);
            }
            i4 = 20;
            i5 = 1;
        } else {
            if (!this.f81785h && length >= 2 && str.charAt(0) == '0') {
                throw new ParseException(this.f81784g, 6, str);
            }
            i4 = 19;
            i5 = 0;
        }
        int i6 = i5;
        if (length >= i4) {
            if (length > i4) {
                return new BigInteger(str, 10);
            }
            length--;
            z4 = true;
        }
        long j4 = 0;
        while (i5 < length) {
            j4 = (j4 * 10) + ('0' - str.charAt(i5));
            i5++;
        }
        if (z4) {
            if (j4 <= ve.a.f92845c) {
                if (j4 >= ve.a.f92845c) {
                    if (i6 != 0) {
                    }
                }
                return new BigInteger(str, 10);
            }
            j4 = (j4 * 10) + ('0' - str.charAt(i5));
        }
        if (i6 != 0) {
            return (!this.f81793p || j4 < -2147483648L) ? Long.valueOf(j4) : Integer.valueOf((int) j4);
        }
        long j5 = -j4;
        return (!this.f81793p || j5 > 2147483647L) ? Long.valueOf(j5) : Integer.valueOf((int) j5);
    }

    protected abstract void f() throws IOException;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if (r3 == ':') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0037, code lost:
    
        if (r3 == ']') goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003b, code lost:
    
        if (r3 == '}') goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r2 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004b, code lost:
    
        if (r6.f81789l == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005b, code lost:
    
        throw new net.minidev.json.parser.ParseException(r6.f81784g, 0, java.lang.Character.valueOf(r6.f81778a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005c, code lost:
    
        f();
        r6.f81780c.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.List<java.lang.Object> g() throws net.minidev.json.parser.ParseException, java.io.IOException {
        /*
            r6 = this;
            net.minidev.json.parser.a r0 = r6.f81779b
            java.util.List r0 = r0.a()
            char r1 = r6.f81778a
            r2 = 91
            if (r1 != r2) goto La2
            r6.f()
            net.minidev.json.parser.b r1 = r6.f81780c
            r1.d()
            r1 = 0
        L15:
            r2 = r1
        L16:
            char r3 = r6.f81778a
            r4 = 9
            if (r3 == r4) goto L9d
            r4 = 10
            if (r3 == r4) goto L9d
            r4 = 13
            if (r3 == r4) goto L9d
            r4 = 26
            r5 = 1
            if (r3 == r4) goto L8d
            r4 = 32
            if (r3 == r4) goto L9d
            r4 = 44
            if (r3 == r4) goto L73
            r4 = 58
            if (r3 == r4) goto L65
            r4 = 93
            if (r3 == r4) goto L47
            r2 = 125(0x7d, float:1.75E-43)
            if (r3 == r2) goto L65
            boolean[] r2 = net.minidev.json.parser.g.f81774t
            java.lang.Object r2 = r6.h(r2)
            r0.add(r2)
            goto L15
        L47:
            if (r2 == 0) goto L5c
            boolean r2 = r6.f81789l
            if (r2 == 0) goto L4e
            goto L5c
        L4e:
            net.minidev.json.parser.ParseException r0 = new net.minidev.json.parser.ParseException
            int r2 = r6.f81784g
            char r3 = r6.f81778a
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r0.<init>(r2, r1, r3)
            throw r0
        L5c:
            r6.f()
            net.minidev.json.parser.b r1 = r6.f81780c
            r1.b()
            return r0
        L65:
            net.minidev.json.parser.ParseException r0 = new net.minidev.json.parser.ParseException
            int r2 = r6.f81784g
            char r3 = r6.f81778a
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r0.<init>(r2, r1, r3)
            throw r0
        L73:
            if (r2 == 0) goto L88
            boolean r2 = r6.f81789l
            if (r2 == 0) goto L7a
            goto L88
        L7a:
            net.minidev.json.parser.ParseException r0 = new net.minidev.json.parser.ParseException
            int r2 = r6.f81784g
            char r3 = r6.f81778a
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r0.<init>(r2, r1, r3)
            throw r0
        L88:
            r6.f()
            r2 = r5
            goto L16
        L8d:
            net.minidev.json.parser.ParseException r0 = new net.minidev.json.parser.ParseException
            int r1 = r6.f81784g
            int r1 = r1 - r5
            r2 = 3
            java.lang.String r3 = "襨\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r0.<init>(r1, r2, r3)
            throw r0
        L9d:
            r6.f()
            goto L16
        La2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "襩\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.minidev.json.parser.g.g():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d1, code lost:
    
        throw new net.minidev.json.parser.ParseException(r3.f81784g, 0, java.lang.Character.valueOf(r3.f81778a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011e, code lost:
    
        r4 = k(r4);
        r3.f81782e = r4;
        r3.f81780c.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x012b, code lost:
    
        return r3.f81782e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object h(boolean[] r4) throws net.minidev.json.parser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.minidev.json.parser.g.h(boolean[]):java.lang.Object");
    }

    protected abstract void i(boolean[] zArr) throws IOException;

    protected abstract void j() throws ParseException, IOException;

    protected abstract Object k(boolean[] zArr) throws ParseException, IOException;

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f2, code lost:
    
        throw new net.minidev.json.parser.ParseException(r12.f81784g, 0, java.lang.Character.valueOf(r12.f81778a));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.Map<java.lang.String, java.lang.Object> l() throws net.minidev.json.parser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.minidev.json.parser.g.l():java.util.Map");
    }

    abstract void m() throws IOException;

    protected abstract void n() throws ParseException, IOException;

    protected void o() throws ParseException, IOException {
        char c5 = this.f81778a;
        while (true) {
            f();
            char c6 = this.f81778a;
            if (c6 == '\"' || c6 == '\'') {
                if (c5 == c6) {
                    f();
                    this.f81783f = this.f81781d.toString();
                    return;
                }
                this.f81781d.a(c6);
            } else if (c6 != '\\') {
                if (c6 != 127) {
                    switch (c6) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            break;
                        case 26:
                            throw new ParseException(this.f81784g - 1, 3, null);
                        default:
                            this.f81781d.a(c6);
                            continue;
                    }
                }
                if (!this.f81791n) {
                    throw new ParseException(this.f81784g, 0, Character.valueOf(this.f81778a));
                }
            } else {
                f();
                char c7 = this.f81778a;
                if (c7 == '\"') {
                    this.f81781d.a(m0.quote);
                } else if (c7 == '\'') {
                    this.f81781d.a('\'');
                } else if (c7 == '/') {
                    this.f81781d.a('/');
                } else if (c7 == '\\') {
                    this.f81781d.a('\\');
                } else if (c7 == 'b') {
                    this.f81781d.a('\b');
                } else if (c7 == 'f') {
                    this.f81781d.a('\f');
                } else if (c7 == 'n') {
                    this.f81781d.a('\n');
                } else if (c7 == 'r') {
                    this.f81781d.a(org.apache.commons.lang3.m.f86065d);
                } else if (c7 == 't') {
                    this.f81781d.a('\t');
                } else if (c7 == 'u') {
                    this.f81781d.a(p());
                }
            }
        }
    }

    protected char p() throws ParseException, IOException {
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = i5 * 16;
            f();
            char c5 = this.f81778a;
            if (c5 <= '9' && c5 >= '0') {
                i4 = c5 - '0';
            } else if (c5 <= 'F' && c5 >= 'A') {
                i4 = c5 - '7';
            } else {
                if (c5 < 'a' || c5 > 'f') {
                    if (c5 == 26) {
                        throw new ParseException(this.f81784g, 3, ProtectedSandApp.s("襨\u0001"));
                    }
                    throw new ParseException(this.f81784g, 4, Character.valueOf(this.f81778a));
                }
                i4 = c5 - 'W';
            }
            i5 = i4 + i7;
        }
        return (char) i5;
    }

    protected void q() throws IOException {
        while (true) {
            char c5 = this.f81778a;
            if (c5 < '0' || c5 > '9') {
                return;
            } else {
                m();
            }
        }
    }

    protected void r(boolean[] zArr) throws IOException {
        while (true) {
            char c5 = this.f81778a;
            if (c5 == 26) {
                return;
            }
            if (c5 >= 0 && c5 < '~' && zArr[c5]) {
                return;
            } else {
                m();
            }
        }
    }

    protected void s() throws IOException {
        while (true) {
            char c5 = this.f81778a;
            if (c5 > ' ' || c5 == 26) {
                return;
            } else {
                m();
            }
        }
    }
}
