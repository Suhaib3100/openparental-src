package com.tencent.beacon.base.net.b.a.c;

import androidx.core.view.x1;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RCDecoder.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    int f71293a;

    /* renamed from: b, reason: collision with root package name */
    int f71294b;

    /* renamed from: c, reason: collision with root package name */
    InputStream f71295c;

    public final void a(InputStream inputStream) {
        this.f71295c = inputStream;
    }

    public final void b() {
        this.f71295c = null;
    }

    public final void a() throws IOException {
        this.f71294b = 0;
        this.f71293a = -1;
        for (int i4 = 0; i4 < 5; i4++) {
            this.f71294b = (this.f71294b << 8) | this.f71295c.read();
        }
    }

    public final int a(int i4) throws IOException {
        int i5 = 0;
        while (i4 != 0) {
            int i6 = this.f71293a >>> 1;
            this.f71293a = i6;
            int i7 = this.f71294b;
            int i10 = (i7 - i6) >>> 31;
            int i11 = i7 - ((i10 - 1) & i6);
            this.f71294b = i11;
            i5 = (i5 << 1) | (1 - i10);
            if ((i6 & x1.f27484y) == 0) {
                this.f71294b = (i11 << 8) | this.f71295c.read();
                this.f71293a <<= 8;
            }
            i4--;
        }
        return i5;
    }

    public int a(short[] sArr, int i4) throws IOException {
        short s4 = sArr[i4];
        int i5 = this.f71293a;
        int i6 = (i5 >>> 11) * s4;
        int i7 = this.f71294b;
        if ((i7 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i6)) {
            this.f71293a = i6;
            sArr[i4] = (short) (s4 + ((2048 - s4) >>> 5));
            if ((i6 & x1.f27484y) != 0) {
                return 0;
            }
            this.f71294b = (i7 << 8) | this.f71295c.read();
            this.f71293a <<= 8;
            return 0;
        }
        int i10 = i5 - i6;
        this.f71293a = i10;
        int i11 = i7 - i6;
        this.f71294b = i11;
        sArr[i4] = (short) (s4 - (s4 >>> 5));
        if ((i10 & x1.f27484y) != 0) {
            return 1;
        }
        this.f71294b = (i11 << 8) | this.f71295c.read();
        this.f71293a <<= 8;
        return 1;
    }

    public static void a(short[] sArr) {
        for (int i4 = 0; i4 < sArr.length; i4++) {
            sArr[i4] = 1024;
        }
    }
}
