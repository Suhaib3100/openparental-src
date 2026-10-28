package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* compiled from: ReversedLinesFileReader.java */
/* loaded from: classes4.dex */
public class q implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private final int f85486b;

    /* renamed from: c, reason: collision with root package name */
    private final Charset f85487c;

    /* renamed from: d, reason: collision with root package name */
    private final RandomAccessFile f85488d;

    /* renamed from: e, reason: collision with root package name */
    private final long f85489e;

    /* renamed from: f, reason: collision with root package name */
    private final long f85490f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[][] f85491g;

    /* renamed from: h, reason: collision with root package name */
    private final int f85492h;

    /* renamed from: i, reason: collision with root package name */
    private final int f85493i;

    /* renamed from: j, reason: collision with root package name */
    private b f85494j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f85495k;

    /* compiled from: ReversedLinesFileReader.java */
    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f85496a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f85497b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f85498c;

        /* renamed from: d, reason: collision with root package name */
        private int f85499d;

        private void c() {
            int i4 = this.f85499d + 1;
            if (i4 > 0) {
                byte[] bArr = new byte[i4];
                this.f85498c = bArr;
                System.arraycopy(this.f85497b, 0, bArr, 0, i4);
            } else {
                this.f85498c = null;
            }
            this.f85499d = -1;
        }

        private int d(byte[] bArr, int i4) {
            for (byte[] bArr2 : q.this.f85491g) {
                boolean z4 = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i4 + length) - (bArr2.length - 1);
                    z4 &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z4) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String e() throws IOException {
            String str;
            byte[] bArr;
            boolean z4 = this.f85496a == 1;
            int i4 = this.f85499d;
            while (true) {
                if (i4 > -1) {
                    if (!z4 && i4 < q.this.f85492h) {
                        c();
                        break;
                    }
                    int d5 = d(this.f85497b, i4);
                    if (d5 > 0) {
                        int i5 = i4 + 1;
                        int i6 = (this.f85499d - i5) + 1;
                        if (i6 < 0) {
                            throw new IllegalStateException(android.support.v4.media.a.a("Unexpected negative line length=", i6));
                        }
                        byte[] bArr2 = new byte[i6];
                        System.arraycopy(this.f85497b, i5, bArr2, 0, i6);
                        str = new String(bArr2, q.this.f85487c);
                        this.f85499d = i4 - d5;
                    } else {
                        i4 -= q.this.f85493i;
                        if (i4 < 0) {
                            c();
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            str = null;
            if (!z4 || (bArr = this.f85498c) == null) {
                return str;
            }
            String str2 = new String(bArr, q.this.f85487c);
            this.f85498c = null;
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b f() throws IOException {
            if (this.f85499d > -1) {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.f85499d);
            }
            long j4 = this.f85496a;
            if (j4 > 1) {
                q qVar = q.this;
                return qVar.new b(j4 - 1, qVar.f85486b, this.f85498c);
            }
            if (this.f85498c == null) {
                return null;
            }
            throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=".concat(new String(this.f85498c, q.this.f85487c)));
        }

        private b(long j4, int i4, byte[] bArr) throws IOException {
            this.f85496a = j4;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i4];
            this.f85497b = bArr2;
            long j5 = (j4 - 1) * q.this.f85486b;
            if (j4 > 0) {
                q.this.f85488d.seek(j5);
                if (q.this.f85488d.read(bArr2, 0, i4) != i4) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i4, bArr.length);
            }
            this.f85499d = bArr2.length - 1;
            this.f85498c = null;
        }
    }

    public q(File file) throws IOException {
        this(file, 4096, Charset.defaultCharset().toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f85488d.close();
    }

    public String g() throws IOException {
        String e4 = this.f85494j.e();
        while (e4 == null) {
            b f4 = this.f85494j.f();
            this.f85494j = f4;
            if (f4 == null) {
                break;
            }
            e4 = f4.e();
        }
        if (!"".equals(e4) || this.f85495k) {
            return e4;
        }
        this.f85495k = true;
        return g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.io.File r10, int r11, java.nio.charset.Charset r12) throws java.io.IOException {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f85495k = r0
            r9.f85486b = r11
            r9.f85487c = r12
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "r"
            r1.<init>(r10, r2)
            r9.f85488d = r1
            long r1 = r1.length()
            r9.f85489e = r1
            long r3 = (long) r11
            long r5 = r1 % r3
            int r10 = (int) r5
            if (r10 <= 0) goto L26
            long r1 = r1 / r3
            r3 = 1
            long r1 = r1 + r3
            r9.f85490f = r1
            goto L32
        L26:
            long r3 = r1 / r3
            r9.f85490f = r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L32
            r6 = r11
            goto L33
        L32:
            r6 = r10
        L33:
            org.apache.commons.io.input.q$b r10 = new org.apache.commons.io.input.q$b
            long r4 = r9.f85490f
            r7 = 0
            r8 = 0
            r2 = r10
            r3 = r9
            r2.<init>(r4, r6, r7)
            r9.f85494j = r10
            java.nio.charset.Charset r10 = org.apache.commons.io.b.b(r12)
            java.nio.charset.CharsetEncoder r11 = r10.newEncoder()
            float r11 = r11.maxBytesPerChar()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r1 = 1
            if (r11 != 0) goto L56
            r9.f85493i = r1
            goto La9
        L56:
            java.lang.String r11 = "UTF-8"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 != r11) goto L61
            r9.f85493i = r1
            goto La9
        L61:
            java.lang.String r11 = "Shift_JIS"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 != r11) goto L6c
            r9.f85493i = r1
            goto La9
        L6c:
            java.lang.String r11 = "UTF-16BE"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 == r11) goto La6
            java.lang.String r11 = "UTF-16LE"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 != r11) goto L7d
            goto La6
        L7d:
            java.lang.String r11 = "UTF-16"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            if (r10 != r11) goto L8d
            java.io.UnsupportedEncodingException r10 = new java.io.UnsupportedEncodingException
            java.lang.String r11 = "For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)"
            r10.<init>(r11)
            throw r10
        L8d:
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
        La6:
            r10 = 2
            r9.f85493i = r10
        La9:
            java.lang.String r10 = "\r\n"
            byte[] r10 = r10.getBytes(r12)
            java.lang.String r11 = "\n"
            byte[] r11 = r11.getBytes(r12)
            java.lang.String r1 = "\r"
            byte[] r12 = r1.getBytes(r12)
            byte[][] r10 = new byte[][]{r10, r11, r12}
            r9.f85491g = r10
            r10 = r10[r0]
            int r10 = r10.length
            r9.f85492h = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.q.<init>(java.io.File, int, java.nio.charset.Charset):void");
    }

    public q(File file, int i4, String str) throws IOException {
        this(file, i4, org.apache.commons.io.b.a(str));
    }
}
