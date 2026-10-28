package com.google.zxing.aztec.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.text.m0;

/* compiled from: BinaryShiftToken.java */
/* loaded from: classes6.dex */
final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f62618c;

    /* renamed from: d, reason: collision with root package name */
    private final short f62619d;

    b(g gVar, int i4, int i5) {
        super(gVar);
        this.f62618c = (short) i4;
        this.f62619d = (short) i5;
    }

    @Override // com.google.zxing.aztec.encoder.g
    public void c(com.google.zxing.common.a aVar, byte[] bArr) {
        int i4 = 0;
        while (true) {
            short s4 = this.f62619d;
            if (i4 >= s4) {
                return;
            }
            if (i4 == 0 || (i4 == 31 && s4 <= 62)) {
                aVar.d(31, 5);
                short s5 = this.f62619d;
                if (s5 > 62) {
                    aVar.d(s5 - 31, 16);
                } else if (i4 == 0) {
                    aVar.d(Math.min((int) s5, 31), 5);
                } else {
                    aVar.d(s5 - 31, 5);
                }
            }
            aVar.d(bArr[this.f62618c + i4], 8);
            i4++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("व\u0001"));
        sb.append((int) this.f62618c);
        sb.append(ProtectedSandApp.s("श\u0001"));
        sb.append((this.f62618c + this.f62619d) - 1);
        sb.append(m0.greater);
        return sb.toString();
    }
}
