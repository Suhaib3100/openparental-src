package com.google.zxing.qrcode.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: ByteMatrix.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[][] f63339a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63340b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63341c;

    public b(int i4, int i5) {
        this.f63339a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i5, i4);
        this.f63340b = i4;
        this.f63341c = i5;
    }

    public void a(byte b5) {
        for (byte[] bArr : this.f63339a) {
            Arrays.fill(bArr, b5);
        }
    }

    public byte b(int i4, int i5) {
        return this.f63339a[i5][i4];
    }

    public byte[][] c() {
        return this.f63339a;
    }

    public int d() {
        return this.f63341c;
    }

    public int e() {
        return this.f63340b;
    }

    public void f(int i4, int i5, byte b5) {
        this.f63339a[i5][i4] = b5;
    }

    public void g(int i4, int i5, int i6) {
        this.f63339a[i5][i4] = (byte) i6;
    }

    public void h(int i4, int i5, boolean z4) {
        this.f63339a[i5][i4] = z4 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f63340b * 2 * this.f63341c) + 2);
        for (int i4 = 0; i4 < this.f63341c; i4++) {
            byte[] bArr = this.f63339a[i4];
            for (int i5 = 0; i5 < this.f63340b; i5++) {
                byte b5 = bArr[i5];
                if (b5 == 0) {
                    sb.append(ProtectedSandApp.s("్\u0001"));
                } else if (b5 != 1) {
                    sb.append(ProtectedSandApp.s("ో\u0001"));
                } else {
                    sb.append(ProtectedSandApp.s("ౌ\u0001"));
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
