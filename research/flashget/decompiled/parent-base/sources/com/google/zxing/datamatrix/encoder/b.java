package com.google.zxing.datamatrix.encoder;

import androidx.core.view.h0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Base256Encoder.java */
/* loaded from: classes6.dex */
final class b implements g {
    b() {
    }

    private static char c(char c5, int i4) {
        int i5 = ((i4 * 149) % 255) + 1 + c5;
        return i5 <= 255 ? (char) i5 : (char) (i5 + h0.f27194u);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!hVar.j()) {
                break;
            }
            sb.append(hVar.d());
            hVar.f62864f++;
            if (j.o(hVar.e(), hVar.f62864f, 5) != 5) {
                hVar.p(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a5 = hVar.a() + length + 1;
        hVar.r(a5);
        boolean z4 = hVar.h().b() - a5 > 0;
        if (hVar.j() || z4) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u0a8e\u0001").concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i4 = 0; i4 < length2; i4++) {
            hVar.s(c(sb.charAt(i4), hVar.a() + 1));
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public int b() {
        return 5;
    }
}
