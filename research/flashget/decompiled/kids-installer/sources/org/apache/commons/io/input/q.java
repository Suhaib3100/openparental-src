package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* compiled from: ReversedLinesFileReader.java */
/* loaded from: classes5.dex */
public class q implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    private final int f31969o;

    /* renamed from: p, reason: collision with root package name */
    private final Charset f31970p;

    /* renamed from: q, reason: collision with root package name */
    private final RandomAccessFile f31971q;

    /* renamed from: r, reason: collision with root package name */
    private final long f31972r;

    /* renamed from: s, reason: collision with root package name */
    private final long f31973s;

    /* renamed from: t, reason: collision with root package name */
    private final byte[][] f31974t;

    /* renamed from: u, reason: collision with root package name */
    private final int f31975u;

    /* renamed from: v, reason: collision with root package name */
    private final int f31976v;

    /* renamed from: w, reason: collision with root package name */
    private b f31977w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f31978x;

    /* compiled from: ReversedLinesFileReader.java */
    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f31979a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f31980b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f31981c;

        /* renamed from: d, reason: collision with root package name */
        private int f31982d;

        private void c() {
            int i5 = this.f31982d + 1;
            if (i5 > 0) {
                byte[] bArr = new byte[i5];
                this.f31981c = bArr;
                System.arraycopy(this.f31980b, 0, bArr, 0, i5);
            } else {
                this.f31981c = null;
            }
            this.f31982d = -1;
        }

        private int d(byte[] bArr, int i5) {
            for (byte[] bArr2 : q.this.f31974t) {
                boolean z5 = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i5 + length) - (bArr2.length - 1);
                    z5 &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z5) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String e() throws IOException {
            String str;
            byte[] bArr;
            boolean z5 = this.f31979a == 1;
            int i5 = this.f31982d;
            while (true) {
                if (i5 > -1) {
                    if (!z5 && i5 < q.this.f31975u) {
                        c();
                        break;
                    }
                    int d6 = d(this.f31980b, i5);
                    if (d6 > 0) {
                        int i6 = i5 + 1;
                        int i7 = (this.f31982d - i6) + 1;
                        if (i7 < 0) {
                            throw new IllegalStateException(androidx.appcompat.view.menu.s.a("Unexpected negative line length=", i7));
                        }
                        byte[] bArr2 = new byte[i7];
                        System.arraycopy(this.f31980b, i6, bArr2, 0, i7);
                        str = new String(bArr2, q.this.f31970p);
                        this.f31982d = i5 - d6;
                    } else {
                        i5 -= q.this.f31976v;
                        if (i5 < 0) {
                            c();
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            str = null;
            if (!z5 || (bArr = this.f31981c) == null) {
                return str;
            }
            String str2 = new String(bArr, q.this.f31970p);
            this.f31981c = null;
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b f() throws IOException {
            if (this.f31982d > -1) {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.f31982d);
            }
            long j5 = this.f31979a;
            if (j5 > 1) {
                q qVar = q.this;
                return qVar.new b(j5 - 1, qVar.f31969o, this.f31981c);
            }
            if (this.f31981c == null) {
                return null;
            }
            throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=".concat(new String(this.f31981c, q.this.f31970p)));
        }

        private b(long j5, int i5, byte[] bArr) throws IOException {
            this.f31979a = j5;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i5];
            this.f31980b = bArr2;
            long j6 = (j5 - 1) * q.this.f31969o;
            if (j5 > 0) {
                q.this.f31971q.seek(j6);
                if (q.this.f31971q.read(bArr2, 0, i5) != i5) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i5, bArr.length);
            }
            this.f31982d = bArr2.length - 1;
            this.f31981c = null;
        }
    }

    public q(File file) throws IOException {
        this(file, 4096, Charset.defaultCharset().toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31971q.close();
    }

    public String j() throws IOException {
        String e6 = this.f31977w.e();
        while (e6 == null) {
            b f6 = this.f31977w.f();
            this.f31977w = f6;
            if (f6 == null) {
                break;
            }
            e6 = f6.e();
        }
        if (!"".equals(e6) || this.f31978x) {
            return e6;
        }
        this.f31978x = true;
        return j();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.io.File r10, int r11, java.nio.charset.Charset r12) throws java.io.IOException {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f31978x = r0
            r9.f31969o = r11
            r9.f31970p = r12
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "r"
            r1.<init>(r10, r2)
            r9.f31971q = r1
            long r1 = r1.length()
            r9.f31972r = r1
            long r3 = (long) r11
            long r5 = r1 % r3
            int r10 = (int) r5
            if (r10 <= 0) goto L26
            long r1 = r1 / r3
            r3 = 1
            long r1 = r1 + r3
            r9.f31973s = r1
            goto L32
        L26:
            long r3 = r1 / r3
            r9.f31973s = r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L32
            r6 = r11
            goto L33
        L32:
            r6 = r10
        L33:
            org.apache.commons.io.input.q$b r10 = new org.apache.commons.io.input.q$b
            long r4 = r9.f31973s
            r7 = 0
            r8 = 0
            r2 = r10
            r3 = r9
            r2.<init>(r4, r6, r7)
            r9.f31977w = r10
            java.nio.charset.Charset r10 = org.apache.commons.io.b.b(r12)
            java.nio.charset.CharsetEncoder r11 = r10.newEncoder()
            float r11 = r11.maxBytesPerChar()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r1 = 2
            r2 = 1
            if (r11 != 0) goto L57
            r9.f31976v = r2
            goto La9
        L57:
            java.lang.String r11 = "UTF-8"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 != r11) goto L62
            r9.f31976v = r2
            goto La9
        L62:
            java.lang.String r11 = "Shift_JIS"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 != r11) goto L6d
            r9.f31976v = r2
            goto La9
        L6d:
            java.lang.String r11 = "UTF-16BE"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 == r11) goto La7
            java.lang.String r11 = "UTF-16LE"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 != r11) goto L7e
            goto La7
        L7e:
            java.lang.String r11 = "UTF-16"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 != r11) goto L8e
            java.io.UnsupportedEncodingException r10 = new java.io.UnsupportedEncodingException
            java.lang.String r11 = "For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)"
            r10.<init>(r11)
            throw r10
        L8e:
            java.io.UnsupportedEncodingException r10 = new java.io.UnsupportedEncodingException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Encoding "
            r11.<init>(r0)
            r11.append(r12)
            java.lang.String r12 = " is not supported yet (feel free to submit a patch)"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        La7:
            r9.f31976v = r1
        La9:
            r10 = 3
            byte[][] r10 = new byte[r10][]
            java.lang.String r11 = "\r\n"
            byte[] r11 = r11.getBytes(r12)
            r10[r0] = r11
            java.lang.String r11 = "\n"
            byte[] r11 = r11.getBytes(r12)
            r10[r2] = r11
            java.lang.String r11 = "\r"
            byte[] r11 = r11.getBytes(r12)
            r10[r1] = r11
            r9.f31974t = r10
            r10 = r10[r0]
            int r10 = r10.length
            r9.f31975u = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.q.<init>(java.io.File, int, java.nio.charset.Charset):void");
    }

    public q(File file, int i5, String str) throws IOException {
        this(file, i5, org.apache.commons.io.b.a(str));
    }
}
