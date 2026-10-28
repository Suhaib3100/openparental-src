package com.codebutler.android_websockets;

import androidx.collection.p0;
import com.codebutler.android_websockets.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.primitives.u;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

/* loaded from: classes3.dex */
public class HybiParser {
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 8;
    private static final int D = 9;
    private static final int E = 10;

    /* renamed from: p, reason: collision with root package name */
    private static final int f47500p = 255;

    /* renamed from: q, reason: collision with root package name */
    private static final int f47501q = 128;

    /* renamed from: r, reason: collision with root package name */
    private static final int f47502r = 128;

    /* renamed from: s, reason: collision with root package name */
    private static final int f47503s = 64;

    /* renamed from: t, reason: collision with root package name */
    private static final int f47504t = 32;

    /* renamed from: u, reason: collision with root package name */
    private static final int f47505u = 16;

    /* renamed from: v, reason: collision with root package name */
    private static final int f47506v = 15;

    /* renamed from: w, reason: collision with root package name */
    private static final int f47507w = 127;

    /* renamed from: x, reason: collision with root package name */
    private static final int f47508x = 1;

    /* renamed from: y, reason: collision with root package name */
    private static final int f47509y = 2;

    /* renamed from: z, reason: collision with root package name */
    private static final int f47510z = 0;

    /* renamed from: a, reason: collision with root package name */
    private e f47511a;

    /* renamed from: c, reason: collision with root package name */
    private int f47513c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47514d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f47515e;

    /* renamed from: f, reason: collision with root package name */
    private int f47516f;

    /* renamed from: g, reason: collision with root package name */
    private int f47517g;

    /* renamed from: h, reason: collision with root package name */
    private int f47518h;

    /* renamed from: i, reason: collision with root package name */
    private int f47519i;

    /* renamed from: o, reason: collision with root package name */
    private static final String f47499o = ProtectedSandApp.s("༑");

    /* renamed from: n, reason: collision with root package name */
    private static final Logger f47498n = Logger.getLogger(ProtectedSandApp.s("༑"));
    private static final List<Integer> F = Arrays.asList(0, 1, 2, 8, 9, 10);
    private static final List<Integer> G = Arrays.asList(0, 1, 2);

    /* renamed from: b, reason: collision with root package name */
    private boolean f47512b = true;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f47520j = new byte[0];

    /* renamed from: k, reason: collision with root package name */
    private byte[] f47521k = new byte[0];

    /* renamed from: l, reason: collision with root package name */
    private boolean f47522l = false;

    /* renamed from: m, reason: collision with root package name */
    private ByteArrayOutputStream f47523m = new ByteArrayOutputStream();

    public static class ProtocolError extends IOException {
        public ProtocolError(String str) {
            super(str);
        }
    }

    public static class a extends DataInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        public byte[] a(int i4) throws IOException {
            byte[] bArr = new byte[i4];
            int i5 = 0;
            while (i5 < i4) {
                int read = read(bArr, i5, i4 - i5);
                if (read == -1) {
                    break;
                }
                i5 += read;
            }
            if (i5 == i4) {
                return bArr;
            }
            throw new IOException(String.format(ProtectedSandApp.s("༐"), Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    public HybiParser(e eVar) {
        this.f47511a = eVar;
    }

    private static long a(byte[] bArr, int i4, int i5) {
        if (bArr.length < i5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("༒"));
        }
        long j4 = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            j4 += (bArr[i6 + i4] & 255) << (((i5 - 1) - i6) * 8);
        }
        return j4;
    }

    private static byte[] c(byte[] bArr, int i4, int i5) {
        if (i4 > i5) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length;
        if (i4 < 0 || i4 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = i5 - i4;
        int min = Math.min(i6, length - i4);
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i4, bArr2, 0, min);
        return bArr2;
    }

    private byte[] d(String str) {
        try {
            return str.getBytes(ProtectedSandApp.s("༓"));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    private void e() throws IOException {
        byte[] m4 = m(this.f47521k, this.f47520j, 0);
        int i4 = this.f47516f;
        if (i4 == 0) {
            if (this.f47519i == 0) {
                throw new ProtocolError(ProtectedSandApp.s("༔"));
            }
            this.f47523m.write(m4);
            if (this.f47514d) {
                byte[] byteArray = this.f47523m.toByteArray();
                e.c s4 = this.f47511a.s();
                if (s4 != null) {
                    if (this.f47519i == 1) {
                        s4.c(f(byteArray));
                    } else {
                        s4.h(byteArray);
                    }
                }
                r();
                return;
            }
            return;
        }
        if (i4 == 1) {
            if (!this.f47514d) {
                this.f47519i = 1;
                this.f47523m.write(m4);
                return;
            }
            String f4 = f(m4);
            e.c s5 = this.f47511a.s();
            if (s5 != null) {
                s5.c(f4);
                return;
            }
            return;
        }
        if (i4 == 2) {
            if (!this.f47514d) {
                this.f47519i = 2;
                this.f47523m.write(m4);
                return;
            } else {
                e.c s6 = this.f47511a.s();
                if (s6 != null) {
                    s6.h(m4);
                    return;
                }
                return;
            }
        }
        if (i4 == 8) {
            int i5 = m4.length >= 2 ? m4[1] + (m4[0] * 256) : 0;
            String f5 = m4.length > 2 ? f(s(m4, 2)) : null;
            b.a(ProtectedSandApp.s("༕"), i5, ProtectedSandApp.s("༖"), f5, f47498n);
            e.c s7 = this.f47511a.s();
            if (s7 != null) {
                s7.g(i5, f5);
                return;
            }
            return;
        }
        if (i4 != 9) {
            if (i4 == 10) {
                c.a(ProtectedSandApp.s("༙"), f(m4), f47498n);
            }
        } else {
            if (m4.length > 125) {
                throw new ProtocolError(ProtectedSandApp.s("༘"));
            }
            f47498n.debug(ProtectedSandApp.s("༗"));
            this.f47511a.A(k(m4, 10, -1));
        }
    }

    private String f(byte[] bArr) {
        try {
            return new String(bArr, ProtectedSandApp.s("༓"));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] g(java.lang.Object r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codebutler.android_websockets.HybiParser.g(java.lang.Object, int, int):byte[]");
    }

    private byte[] i(String str, int i4, int i5) {
        return g(str, i4, i5);
    }

    private byte[] k(byte[] bArr, int i4, int i5) {
        return g(bArr, i4, i5);
    }

    private int l(byte[] bArr) throws ProtocolError {
        long a5 = a(bArr, 0, bArr.length);
        if (a5 < 0 || a5 > 2147483647L) {
            throw new ProtocolError(p0.a(ProtectedSandApp.s("༚"), a5));
        }
        return (int) a5;
    }

    private static byte[] m(byte[] bArr, byte[] bArr2, int i4) {
        if (bArr2.length == 0) {
            return bArr;
        }
        for (int i5 = 0; i5 < bArr.length - i4; i5++) {
            int i6 = i4 + i5;
            bArr[i6] = (byte) (bArr[i6] ^ bArr2[i5 % 4]);
        }
        return bArr;
    }

    private void n(byte[] bArr) throws ProtocolError {
        this.f47518h = l(bArr);
        this.f47513c = this.f47515e ? 3 : 4;
    }

    private void o(byte b5) {
        boolean z4 = (b5 & 128) == 128;
        this.f47515e = z4;
        int i4 = b5 & Byte.MAX_VALUE;
        this.f47518h = i4;
        if (i4 >= 0 && i4 <= 125) {
            this.f47513c = z4 ? 3 : 4;
        } else {
            this.f47517g = i4 == 126 ? 2 : 8;
            this.f47513c = 2;
        }
    }

    private void p(byte b5) throws ProtocolError {
        boolean z4 = (b5 & u.f57540a) == 64;
        boolean z5 = (b5 & 32) == 32;
        boolean z6 = (b5 & com.google.common.base.c.f54872r) == 16;
        if (z4 || z5 || z6) {
            throw new ProtocolError(ProtectedSandApp.s("༝"));
        }
        this.f47514d = (b5 & 128) == 128;
        int i4 = b5 & com.google.common.base.c.f54871q;
        this.f47516f = i4;
        this.f47520j = new byte[0];
        this.f47521k = new byte[0];
        if (!F.contains(Integer.valueOf(i4))) {
            throw new ProtocolError(ProtectedSandApp.s("༜"));
        }
        if (G.contains(Integer.valueOf(this.f47516f)) && !this.f47514d) {
            throw new ProtocolError(ProtectedSandApp.s("༛"));
        }
        this.f47513c = 1;
    }

    private void r() {
        this.f47519i = 0;
        this.f47523m.reset();
    }

    private byte[] s(byte[] bArr, int i4) {
        return c(bArr, i4, bArr.length);
    }

    public void b(int i4, String str) {
        if (this.f47522l) {
            return;
        }
        this.f47511a.z(i(str, 8, i4));
        this.f47522l = true;
    }

    public byte[] h(String str) {
        return i(str, 1, -1);
    }

    public byte[] j(byte[] bArr) {
        return k(bArr, 2, -1);
    }

    public void q(String str) {
        this.f47511a.z(i(str, 9, -1));
    }

    public void t(a aVar) throws IOException {
        while (aVar.available() != -1) {
            int i4 = this.f47513c;
            if (i4 == 0) {
                p(aVar.readByte());
            } else if (i4 == 1) {
                o(aVar.readByte());
            } else if (i4 == 2) {
                n(aVar.a(this.f47517g));
            } else if (i4 == 3) {
                this.f47520j = aVar.a(4);
                this.f47513c = 4;
            } else if (i4 == 4) {
                this.f47521k = aVar.a(this.f47518h);
                e();
                this.f47513c = 0;
            }
        }
        e.c s4 = this.f47511a.s();
        if (s4 != null) {
            s4.g(0, ProtectedSandApp.s("༞"));
        }
    }
}
