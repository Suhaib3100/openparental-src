package com.google.zxing.datamatrix.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: C40Encoder.java */
/* loaded from: classes6.dex */
class c implements g {
    c() {
    }

    private int c(h hVar, StringBuilder sb, StringBuilder sb2, int i4) {
        int length = sb.length();
        sb.delete(length - i4, length);
        hVar.f62864f--;
        int d5 = d(hVar.d(), sb2);
        hVar.l();
        return d5;
    }

    private static String e(CharSequence charSequence) {
        int charAt = charSequence.charAt(2) + (charSequence.charAt(1) * '(') + (charSequence.charAt(0) * 1600) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    static void g(h hVar, StringBuilder sb) {
        hVar.t(e(sb));
        sb.delete(0, 3);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.j()) {
                break;
            }
            char d5 = hVar.d();
            hVar.f62864f++;
            int d6 = d(d5, sb);
            int a5 = hVar.a() + ((sb.length() / 3) << 1);
            hVar.r(a5);
            int b5 = hVar.h().b() - a5;
            if (!hVar.j()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && b5 != 2) {
                    d6 = c(hVar, sb, sb2, d6);
                }
                while (sb.length() % 3 == 1 && (d6 > 3 || b5 != 1)) {
                    d6 = c(hVar, sb, sb2, d6);
                }
            } else if (sb.length() % 3 == 0 && j.o(hVar.e(), hVar.f62864f, b()) != b()) {
                hVar.p(0);
                break;
            }
        }
        f(hVar, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public int b() {
        return 1;
    }

    int d(char c5, StringBuilder sb) {
        if (c5 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c5 >= '0' && c5 <= '9') {
            sb.append((char) (c5 - ','));
            return 1;
        }
        if (c5 >= 'A' && c5 <= 'Z') {
            sb.append((char) (c5 - '3'));
            return 1;
        }
        if (c5 < ' ') {
            sb.append((char) 0);
            sb.append(c5);
            return 2;
        }
        if (c5 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c5 - '!'));
            return 2;
        }
        if (c5 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c5 - '+'));
            return 2;
        }
        if (c5 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c5 - 'E'));
            return 2;
        }
        if (c5 > 127) {
            sb.append(ProtectedSandApp.s("એ\u0001"));
            return d((char) (c5 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c5 - '`'));
        return 2;
    }

    void f(h hVar, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int a5 = hVar.a() + length;
        hVar.r(a5);
        int b5 = hVar.h().b() - a5;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                g(hVar, sb);
            }
            if (hVar.j()) {
                hVar.s((char) 254);
            }
        } else if (b5 == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                g(hVar, sb);
            }
            if (hVar.j()) {
                hVar.s((char) 254);
            }
            hVar.f62864f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("ઐ\u0001"));
            }
            while (sb.length() >= 3) {
                g(hVar, sb);
            }
            if (b5 > 0 || hVar.j()) {
                hVar.s((char) 254);
            }
        }
        hVar.p(0);
    }
}
