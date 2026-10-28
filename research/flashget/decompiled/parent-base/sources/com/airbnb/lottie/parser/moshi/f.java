package com.airbnb.lottie.parser.moshi;

import androidx.annotation.q0;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import okio.m;
import okio.o;
import okio.p;

/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes3.dex */
final class f extends c {
    private static final int A = 6;
    private static final int B = 7;
    private static final int C = 8;
    private static final int D = 9;
    private static final int E = 10;
    private static final int F = 11;
    private static final int G = 12;
    private static final int H = 13;
    private static final int I = 14;
    private static final int J = 15;
    private static final int K = 16;
    private static final int L = 17;
    private static final int M = 18;
    private static final int N = 0;
    private static final int O = 1;
    private static final int P = 2;
    private static final int Q = 3;
    private static final int R = 4;
    private static final int X = 5;
    private static final int Y = 6;
    private static final int Z = 7;

    /* renamed from: o, reason: collision with root package name */
    private static final long f39258o = -922337203685477580L;

    /* renamed from: p, reason: collision with root package name */
    private static final p f39259p = p.k(ProtectedSandApp.s("ɍ"));

    /* renamed from: q, reason: collision with root package name */
    private static final p f39260q;

    /* renamed from: r, reason: collision with root package name */
    private static final p f39261r;

    /* renamed from: s, reason: collision with root package name */
    private static final p f39262s;

    /* renamed from: t, reason: collision with root package name */
    private static final p f39263t;

    /* renamed from: u, reason: collision with root package name */
    private static final int f39264u = 0;

    /* renamed from: v, reason: collision with root package name */
    private static final int f39265v = 1;

    /* renamed from: w, reason: collision with root package name */
    private static final int f39266w = 2;

    /* renamed from: x, reason: collision with root package name */
    private static final int f39267x = 3;

    /* renamed from: y, reason: collision with root package name */
    private static final int f39268y = 4;

    /* renamed from: z, reason: collision with root package name */
    private static final int f39269z = 5;

    /* renamed from: i, reason: collision with root package name */
    private final o f39270i;

    /* renamed from: j, reason: collision with root package name */
    private final m f39271j;

    /* renamed from: k, reason: collision with root package name */
    private int f39272k = 0;

    /* renamed from: l, reason: collision with root package name */
    private long f39273l;

    /* renamed from: m, reason: collision with root package name */
    private int f39274m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private String f39275n;

    static {
        p.Companion companion = p.INSTANCE;
        f39260q = companion.l(ProtectedSandApp.s("Ɏ"));
        f39261r = companion.l(ProtectedSandApp.s("ɏ"));
        f39262s = companion.l(ProtectedSandApp.s("ɐ"));
        f39263t = companion.l(ProtectedSandApp.s("ɑ"));
    }

    f(o oVar) {
        if (oVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("ɒ"));
        }
        this.f39270i = oVar;
        this.f39271j = oVar.r();
        o(6);
    }

    private int B(String str, c.a aVar) {
        int length = aVar.f39248a.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(aVar.f39248a[i4])) {
                this.f39272k = 0;
                this.f39244d[this.f39242b - 1] = str;
                return i4;
            }
        }
        return -1;
    }

    private boolean C(int i4) throws IOException {
        if (i4 == 9 || i4 == 10 || i4 == 12 || i4 == 13 || i4 == 32) {
            return false;
        }
        if (i4 != 35) {
            if (i4 == 44) {
                return false;
            }
            if (i4 != 47 && i4 != 61) {
                if (i4 == 123 || i4 == 125 || i4 == 58) {
                    return false;
                }
                if (i4 != 59) {
                    switch (i4) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        y();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.f39271j.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        y();
        L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.f39270i.h1(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        y();
        r3 = r6.f39271j.z(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.f39271j.readByte();
        r6.f39271j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (K() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        throw x(com.flashget.parentalcontrol.ProtectedSandApp.s("ɓ"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.f39271j.readByte();
        r6.f39271j.readByte();
        L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0039, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int D(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            okio.o r2 = r6.f39270i
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.h1(r4)
            if (r2 == 0) goto L85
            okio.m r2 = r6.f39271j
            long r4 = (long) r1
            byte r2 = r2.z(r4)
            r4 = 10
            if (r2 == r4) goto L82
            r4 = 32
            if (r2 == r4) goto L82
            r4 = 13
            if (r2 == r4) goto L82
            r4 = 9
            if (r2 != r4) goto L25
            goto L82
        L25:
            okio.m r3 = r6.f39271j
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L76
            okio.o r3 = r6.f39270i
            r4 = 2
            boolean r3 = r3.h1(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.y()
            okio.m r3 = r6.f39271j
            r4 = 1
            byte r3 = r3.z(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            okio.m r1 = r6.f39271j
            r1.readByte()
            okio.m r1 = r6.f39271j
            r1.readByte()
            r6.L()
            goto L1
        L5a:
            okio.m r1 = r6.f39271j
            r1.readByte()
            okio.m r1 = r6.f39271j
            r1.readByte()
            boolean r1 = r6.K()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "ɓ"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            com.airbnb.lottie.parser.moshi.b r7 = r6.x(r7)
            throw r7
        L76:
            r1 = 35
            if (r2 != r1) goto L81
            r6.y()
            r6.L()
            goto L1
        L81:
            return r2
        L82:
            r1 = r3
            goto L2
        L85:
            if (r7 != 0) goto L89
            r7 = -1
            return r7
        L89:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "ɔ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.f.D(boolean):int");
    }

    private String E(p pVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long w02 = this.f39270i.w0(pVar);
            if (w02 == -1) {
                throw x(ProtectedSandApp.s("ɕ"));
            }
            if (this.f39271j.z(w02) != 92) {
                if (sb == null) {
                    m mVar = this.f39271j;
                    mVar.getClass();
                    String q32 = mVar.q3(w02, kotlin.text.f.UTF_8);
                    this.f39271j.readByte();
                    return q32;
                }
                m mVar2 = this.f39271j;
                mVar2.getClass();
                sb.append(mVar2.q3(w02, kotlin.text.f.UTF_8));
                this.f39271j.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            m mVar3 = this.f39271j;
            mVar3.getClass();
            sb.append(mVar3.q3(w02, kotlin.text.f.UTF_8));
            this.f39271j.readByte();
            sb.append(I());
        }
    }

    private String F() throws IOException {
        long w02 = this.f39270i.w0(f39261r);
        if (w02 == -1) {
            return this.f39271j.n3();
        }
        m mVar = this.f39271j;
        mVar.getClass();
        return mVar.q3(w02, kotlin.text.f.UTF_8);
    }

    private int G() throws IOException {
        String s4;
        String s5;
        int i4;
        byte z4 = this.f39271j.z(0L);
        if (z4 == 116 || z4 == 84) {
            s4 = ProtectedSandApp.s("ɚ");
            s5 = ProtectedSandApp.s("ɛ");
            i4 = 5;
        } else if (z4 == 102 || z4 == 70) {
            s4 = ProtectedSandApp.s("ɘ");
            s5 = ProtectedSandApp.s("ə");
            i4 = 6;
        } else {
            if (z4 != 110 && z4 != 78) {
                return 0;
            }
            s4 = ProtectedSandApp.s("ɖ");
            s5 = ProtectedSandApp.s("ɗ");
            i4 = 7;
        }
        int length = s4.length();
        int i5 = 1;
        while (i5 < length) {
            int i6 = i5 + 1;
            if (!this.f39270i.h1(i6)) {
                return 0;
            }
            byte z5 = this.f39271j.z(i5);
            if (z5 != s4.charAt(i5) && z5 != s5.charAt(i5)) {
                return 0;
            }
            i5 = i6;
        }
        if (this.f39270i.h1(length + 1) && C(this.f39271j.z(length))) {
            return 0;
        }
        this.f39271j.skip(length);
        this.f39272k = i4;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (C(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0099, code lost:
    
        r16.f39273l = r8;
        r16.f39271j.skip(r5);
        r16.f39272k = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        r16.f39274m = r5;
        r16.f39272k = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int H() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.f.H():int");
    }

    private char I() throws IOException {
        int i4;
        if (!this.f39270i.h1(1L)) {
            throw x(ProtectedSandApp.s("ɟ"));
        }
        byte readByte = this.f39271j.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return org.apache.commons.lang3.m.f86065d;
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.f39246f) {
                return (char) readByte;
            }
            throw x(ProtectedSandApp.s("ɜ") + ((char) readByte));
        }
        if (!this.f39270i.h1(4L)) {
            throw new EOFException(ProtectedSandApp.s("ɞ") + getPath());
        }
        char c5 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            byte z4 = this.f39271j.z(i5);
            char c6 = (char) (c5 << 4);
            if (z4 >= 48 && z4 <= 57) {
                i4 = z4 - 48;
            } else if (z4 >= 97 && z4 <= 102) {
                i4 = z4 - 87;
            } else {
                if (z4 < 65 || z4 > 70) {
                    StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ɝ"));
                    m mVar = this.f39271j;
                    mVar.getClass();
                    sb.append(mVar.q3(4L, kotlin.text.f.UTF_8));
                    throw x(sb.toString());
                }
                i4 = z4 - 55;
            }
            c5 = (char) (i4 + c6);
        }
        this.f39271j.skip(4L);
        return c5;
    }

    private void J(p pVar) throws IOException {
        while (true) {
            long w02 = this.f39270i.w0(pVar);
            if (w02 == -1) {
                throw x(ProtectedSandApp.s("ɕ"));
            }
            if (this.f39271j.z(w02) != 92) {
                this.f39271j.skip(w02 + 1);
                return;
            } else {
                this.f39271j.skip(w02 + 1);
                I();
            }
        }
    }

    private boolean K() throws IOException {
        long m02 = this.f39270i.m0(f39263t);
        boolean z4 = m02 != -1;
        m mVar = this.f39271j;
        mVar.skip(z4 ? m02 + r1.q() : mVar.size());
        return z4;
    }

    private void L() throws IOException {
        long w02 = this.f39270i.w0(f39262s);
        m mVar = this.f39271j;
        mVar.skip(w02 != -1 ? w02 + 1 : mVar.size());
    }

    private void M() throws IOException {
        long w02 = this.f39270i.w0(f39261r);
        m mVar = this.f39271j;
        if (w02 == -1) {
            w02 = mVar.size();
        }
        mVar.skip(w02);
    }

    private void y() throws IOException {
        if (!this.f39246f) {
            throw x(ProtectedSandApp.s("ɠ"));
        }
    }

    private int z() throws IOException {
        int[] iArr = this.f39243c;
        int i4 = this.f39242b;
        int i5 = iArr[i4 - 1];
        if (i5 == 1) {
            iArr[i4 - 1] = 2;
        } else if (i5 == 2) {
            int D2 = D(true);
            this.f39271j.readByte();
            if (D2 != 44) {
                if (D2 != 59) {
                    if (D2 != 93) {
                        throw x(ProtectedSandApp.s("ɡ"));
                    }
                    this.f39272k = 4;
                    return 4;
                }
                y();
            }
        } else {
            if (i5 == 3 || i5 == 5) {
                iArr[i4 - 1] = 4;
                if (i5 == 5) {
                    int D3 = D(true);
                    this.f39271j.readByte();
                    if (D3 != 44) {
                        if (D3 != 59) {
                            if (D3 != 125) {
                                throw x(ProtectedSandApp.s("ɦ"));
                            }
                            this.f39272k = 2;
                            return 2;
                        }
                        y();
                    }
                }
                int D4 = D(true);
                if (D4 == 34) {
                    this.f39271j.readByte();
                    this.f39272k = 13;
                    return 13;
                }
                if (D4 == 39) {
                    this.f39271j.readByte();
                    y();
                    this.f39272k = 12;
                    return 12;
                }
                String s4 = ProtectedSandApp.s("ɧ");
                if (D4 != 125) {
                    y();
                    if (!C((char) D4)) {
                        throw x(s4);
                    }
                    this.f39272k = 14;
                    return 14;
                }
                if (i5 == 5) {
                    throw x(s4);
                }
                this.f39271j.readByte();
                this.f39272k = 2;
                return 2;
            }
            if (i5 == 4) {
                iArr[i4 - 1] = 5;
                int D5 = D(true);
                this.f39271j.readByte();
                if (D5 != 58) {
                    if (D5 != 61) {
                        throw x(ProtectedSandApp.s("ɢ"));
                    }
                    y();
                    if (this.f39270i.h1(1L) && this.f39271j.z(0L) == 62) {
                        this.f39271j.readByte();
                    }
                }
            } else if (i5 == 6) {
                iArr[i4 - 1] = 7;
            } else if (i5 == 7) {
                if (D(false) == -1) {
                    this.f39272k = 18;
                    return 18;
                }
                y();
            } else if (i5 == 8) {
                throw new IllegalStateException(ProtectedSandApp.s("ɥ"));
            }
        }
        int D6 = D(true);
        if (D6 == 34) {
            this.f39271j.readByte();
            this.f39272k = 9;
            return 9;
        }
        if (D6 == 39) {
            y();
            this.f39271j.readByte();
            this.f39272k = 8;
            return 8;
        }
        if (D6 != 44 && D6 != 59) {
            if (D6 == 91) {
                this.f39271j.readByte();
                this.f39272k = 3;
                return 3;
            }
            if (D6 != 93) {
                if (D6 == 123) {
                    this.f39271j.readByte();
                    this.f39272k = 1;
                    return 1;
                }
                int G2 = G();
                if (G2 != 0) {
                    return G2;
                }
                int H2 = H();
                if (H2 != 0) {
                    return H2;
                }
                if (!C(this.f39271j.z(0L))) {
                    throw x(ProtectedSandApp.s("ɣ"));
                }
                y();
                this.f39272k = 10;
                return 10;
            }
            if (i5 == 1) {
                this.f39271j.readByte();
                this.f39272k = 4;
                return 4;
            }
        }
        if (i5 != 1 && i5 != 2) {
            throw x(ProtectedSandApp.s("ɤ"));
        }
        y();
        this.f39272k = 7;
        return 7;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void b() throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 == 3) {
            o(1);
            this.f39245e[this.f39242b - 1] = 0;
            this.f39272k = 0;
        } else {
            throw new a(ProtectedSandApp.s("ɨ") + n() + ProtectedSandApp.s("ɩ") + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void c() throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 == 1) {
            o(3);
            this.f39272k = 0;
        } else {
            throw new a(ProtectedSandApp.s("ɪ") + n() + ProtectedSandApp.s("ɩ") + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39272k = 0;
        this.f39243c[0] = 8;
        this.f39242b = 1;
        this.f39271j.d();
        this.f39270i.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void d() throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 != 4) {
            throw new a(ProtectedSandApp.s("ɫ") + n() + ProtectedSandApp.s("ɩ") + getPath());
        }
        int i5 = this.f39242b;
        this.f39242b = i5 - 1;
        int[] iArr = this.f39245e;
        int i6 = i5 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f39272k = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void e() throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 != 2) {
            throw new a(ProtectedSandApp.s("ɬ") + n() + ProtectedSandApp.s("ɩ") + getPath());
        }
        int i5 = this.f39242b;
        int i6 = i5 - 1;
        this.f39242b = i6;
        this.f39244d[i6] = null;
        int[] iArr = this.f39245e;
        int i7 = i5 - 2;
        iArr[i7] = iArr[i7] + 1;
        this.f39272k = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public boolean f() throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        return (i4 == 2 || i4 == 4 || i4 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public boolean g() throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 == 5) {
            this.f39272k = 0;
            int[] iArr = this.f39245e;
            int i5 = this.f39242b - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (i4 == 6) {
            this.f39272k = 0;
            int[] iArr2 = this.f39245e;
            int i6 = this.f39242b - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return false;
        }
        throw new a(ProtectedSandApp.s("ɭ") + n() + ProtectedSandApp.s("ɩ") + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public double h() throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 == 16) {
            this.f39272k = 0;
            int[] iArr = this.f39245e;
            int i5 = this.f39242b - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f39273l;
        }
        String s4 = ProtectedSandApp.s("ɮ");
        String s5 = ProtectedSandApp.s("ɩ");
        if (i4 == 17) {
            m mVar = this.f39271j;
            long j4 = this.f39274m;
            mVar.getClass();
            this.f39275n = mVar.q3(j4, kotlin.text.f.UTF_8);
        } else if (i4 == 9) {
            this.f39275n = E(f39260q);
        } else if (i4 == 8) {
            this.f39275n = E(f39259p);
        } else if (i4 == 10) {
            this.f39275n = F();
        } else if (i4 != 11) {
            throw new a(s4 + n() + s5 + getPath());
        }
        this.f39272k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f39275n);
            if (!this.f39246f && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                StringBuilder a5 = e.a(ProtectedSandApp.s("ɯ"), parseDouble, s5);
                a5.append(getPath());
                throw new b(a5.toString());
            }
            this.f39275n = null;
            this.f39272k = 0;
            int[] iArr2 = this.f39245e;
            int i6 = this.f39242b - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a(s4 + this.f39275n + s5 + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public int i() throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        String s4 = ProtectedSandApp.s("ɩ");
        String s5 = ProtectedSandApp.s("ɰ");
        if (i4 == 16) {
            long j4 = this.f39273l;
            int i5 = (int) j4;
            if (j4 == i5) {
                this.f39272k = 0;
                int[] iArr = this.f39245e;
                int i6 = this.f39242b - 1;
                iArr[i6] = iArr[i6] + 1;
                return i5;
            }
            throw new a(s5 + this.f39273l + s4 + getPath());
        }
        if (i4 == 17) {
            m mVar = this.f39271j;
            long j5 = this.f39274m;
            mVar.getClass();
            this.f39275n = mVar.q3(j5, kotlin.text.f.UTF_8);
        } else if (i4 == 9 || i4 == 8) {
            String E2 = i4 == 9 ? E(f39260q) : E(f39259p);
            this.f39275n = E2;
            try {
                int parseInt = Integer.parseInt(E2);
                this.f39272k = 0;
                int[] iArr2 = this.f39245e;
                int i7 = this.f39242b - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i4 != 11) {
            throw new a(s5 + n() + s4 + getPath());
        }
        this.f39272k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f39275n);
            int i10 = (int) parseDouble;
            if (i10 != parseDouble) {
                throw new a(s5 + this.f39275n + s4 + getPath());
            }
            this.f39275n = null;
            this.f39272k = 0;
            int[] iArr3 = this.f39245e;
            int i11 = this.f39242b - 1;
            iArr3[i11] = iArr3[i11] + 1;
            return i10;
        } catch (NumberFormatException unused2) {
            throw new a(s5 + this.f39275n + s4 + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public String k() throws IOException {
        String str;
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 == 14) {
            str = F();
        } else if (i4 == 13) {
            str = E(f39260q);
        } else if (i4 == 12) {
            str = E(f39259p);
        } else {
            if (i4 != 15) {
                throw new a(ProtectedSandApp.s("ɱ") + n() + ProtectedSandApp.s("ɩ") + getPath());
            }
            str = this.f39275n;
        }
        this.f39272k = 0;
        this.f39244d[this.f39242b - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public String l() throws IOException {
        String q32;
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 == 10) {
            q32 = F();
        } else if (i4 == 9) {
            q32 = E(f39260q);
        } else if (i4 == 8) {
            q32 = E(f39259p);
        } else if (i4 == 11) {
            q32 = this.f39275n;
            this.f39275n = null;
        } else if (i4 == 16) {
            q32 = Long.toString(this.f39273l);
        } else {
            if (i4 != 17) {
                throw new a(ProtectedSandApp.s("ɲ") + n() + ProtectedSandApp.s("ɩ") + getPath());
            }
            m mVar = this.f39271j;
            long j4 = this.f39274m;
            mVar.getClass();
            q32 = mVar.q3(j4, kotlin.text.f.UTF_8);
        }
        this.f39272k = 0;
        int[] iArr = this.f39245e;
        int i5 = this.f39242b - 1;
        iArr[i5] = iArr[i5] + 1;
        return q32;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public c.b n() throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        switch (i4) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public int q(c.a aVar) throws IOException {
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 < 12 || i4 > 15) {
            return -1;
        }
        if (i4 == 15) {
            return B(this.f39275n, aVar);
        }
        int K3 = this.f39270i.K3(aVar.f39249b);
        if (K3 != -1) {
            this.f39272k = 0;
            this.f39244d[this.f39242b - 1] = aVar.f39248a[K3];
            return K3;
        }
        String str = this.f39244d[this.f39242b - 1];
        String k4 = k();
        int B2 = B(k4, aVar);
        if (B2 == -1) {
            this.f39272k = 15;
            this.f39275n = k4;
            this.f39244d[this.f39242b - 1] = str;
        }
        return B2;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void s() throws IOException {
        if (this.f39247g) {
            throw new a(ProtectedSandApp.s("ɳ") + n() + ProtectedSandApp.s("ɴ") + getPath());
        }
        int i4 = this.f39272k;
        if (i4 == 0) {
            i4 = z();
        }
        if (i4 == 14) {
            M();
        } else if (i4 == 13) {
            J(f39260q);
        } else if (i4 == 12) {
            J(f39259p);
        } else if (i4 != 15) {
            throw new a(ProtectedSandApp.s("ɱ") + n() + ProtectedSandApp.s("ɩ") + getPath());
        }
        this.f39272k = 0;
        this.f39244d[this.f39242b - 1] = ProtectedSandApp.s("ɖ");
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void t() throws IOException {
        if (this.f39247g) {
            throw new a(ProtectedSandApp.s("ɳ") + n() + ProtectedSandApp.s("ɴ") + getPath());
        }
        int i4 = 0;
        do {
            int i5 = this.f39272k;
            if (i5 == 0) {
                i5 = z();
            }
            if (i5 == 3) {
                o(1);
            } else if (i5 == 1) {
                o(3);
            } else {
                String s4 = ProtectedSandApp.s("ɩ");
                String s5 = ProtectedSandApp.s("ɵ");
                if (i5 == 4) {
                    i4--;
                    if (i4 < 0) {
                        throw new a(s5 + n() + s4 + getPath());
                    }
                    this.f39242b--;
                } else if (i5 == 2) {
                    i4--;
                    if (i4 < 0) {
                        throw new a(s5 + n() + s4 + getPath());
                    }
                    this.f39242b--;
                } else if (i5 == 14 || i5 == 10) {
                    M();
                } else if (i5 == 9 || i5 == 13) {
                    J(f39260q);
                } else if (i5 == 8 || i5 == 12) {
                    J(f39259p);
                } else if (i5 == 17) {
                    this.f39271j.skip(this.f39274m);
                } else if (i5 == 18) {
                    throw new a(s5 + n() + s4 + getPath());
                }
                this.f39272k = 0;
            }
            i4++;
            this.f39272k = 0;
        } while (i4 != 0);
        int[] iArr = this.f39245e;
        int i6 = this.f39242b;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.f39244d[i6 - 1] = ProtectedSandApp.s("ɖ");
    }

    public String toString() {
        return ProtectedSandApp.s("ɶ") + this.f39270i + ProtectedSandApp.s("ɷ");
    }
}
