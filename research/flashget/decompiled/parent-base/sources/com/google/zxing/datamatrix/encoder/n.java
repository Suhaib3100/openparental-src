package com.google.zxing.datamatrix.encoder;

/* compiled from: X12Encoder.java */
/* loaded from: classes6.dex */
final class n extends c {
    n() {
    }

    @Override // com.google.zxing.datamatrix.encoder.c, com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.j()) {
                break;
            }
            char d5 = hVar.d();
            hVar.f62864f++;
            d(d5, sb);
            if (sb.length() % 3 == 0) {
                c.g(hVar, sb);
                if (j.o(hVar.e(), hVar.f62864f, 3) != 3) {
                    hVar.p(0);
                    break;
                }
            }
        }
        f(hVar, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.c, com.google.zxing.datamatrix.encoder.g
    public int b() {
        return 3;
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    int d(char c5, StringBuilder sb) {
        if (c5 == '\r') {
            sb.append((char) 0);
        } else if (c5 == ' ') {
            sb.append((char) 3);
        } else if (c5 == '*') {
            sb.append((char) 1);
        } else if (c5 == '>') {
            sb.append((char) 2);
        } else if (c5 >= '0' && c5 <= '9') {
            sb.append((char) (c5 - ','));
        } else if (c5 < 'A' || c5 > 'Z') {
            j.f(c5);
        } else {
            sb.append((char) (c5 - '3'));
        }
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    void f(h hVar, StringBuilder sb) {
        hVar.q();
        int b5 = hVar.h().b() - hVar.a();
        hVar.f62864f -= sb.length();
        if (hVar.g() > 1 || b5 > 1 || hVar.g() != b5) {
            hVar.s((char) 254);
        }
        if (hVar.f() < 0) {
            hVar.p(0);
        }
    }
}
