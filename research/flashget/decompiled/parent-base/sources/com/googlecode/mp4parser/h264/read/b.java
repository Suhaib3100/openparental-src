package com.googlecode.mp4parser.h264.read;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: CAVLCReader.java */
/* loaded from: classes6.dex */
public class b extends a {
    public b(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    private void A(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(a.f64075f - this.f64080e.d());
        int length = 8 - valueOf.length();
        sb.append(ProtectedSandApp.s("ᐺ\u0001").concat(valueOf));
        for (int i4 = 0; i4 < length; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - this.f64080e.d();
        for (int i5 = 0; i5 < length2; i5++) {
            sb.append(' ');
        }
        sb.append(this.f64080e);
        sb.append(ProtectedSandApp.s("ᐻ\u0001") + str2 + ProtectedSandApp.s("ᐼ\u0001"));
        this.f64080e.c();
    }

    private int x() throws IOException {
        int i4 = 0;
        while (h() == 0) {
            i4++;
        }
        if (i4 <= 0) {
            return 0;
        }
        return (int) (((1 << i4) - 1) + k(i4));
    }

    public byte[] m(int i4) throws IOException {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) j();
        }
        return bArr;
    }

    public boolean n() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᐽ\u0001"));
    }

    public int o() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ᐽ\u0001"));
    }

    public boolean p(String str) throws IOException {
        boolean z4 = h() != 0;
        A(str, z4 ? ProtectedSandApp.s("ᐾ\u0001") : ProtectedSandApp.s("ᐿ\u0001"));
        return z4;
    }

    public Object q(xa.a aVar, String str) throws IOException {
        Object c5;
        do {
            aVar = aVar.b(h());
            if (aVar == null) {
                throw new RuntimeException(ProtectedSandApp.s("ᑀ\u0001"));
            }
            c5 = aVar.c();
        } while (c5 == null);
        A(str, c5.toString());
        return c5;
    }

    public int r(String str) throws IOException {
        return y(str);
    }

    public long s(int i4, String str) throws IOException {
        long k4 = k(i4);
        A(str, String.valueOf(k4));
        return k4;
    }

    public int t(String str) throws IOException {
        int x4 = x();
        int i4 = ((x4 >> 1) + (x4 & 1)) * ((r1 << 1) - 1);
        A(str, String.valueOf(i4));
        return i4;
    }

    public int u(int i4) throws IOException {
        return i4 > 1 ? x() : (~h()) & 1;
    }

    public void v() throws IOException {
        h();
        l();
    }

    public int w(int i4, String str) throws IOException {
        return (int) s(i4, str);
    }

    public int y(String str) throws IOException {
        int x4 = x();
        A(str, String.valueOf(x4));
        return x4;
    }

    public int z(String str) throws IOException {
        int i4 = 0;
        while (h() == 0) {
            i4++;
        }
        A(str, String.valueOf(i4));
        return i4;
    }
}
