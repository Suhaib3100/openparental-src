package com.google.zxing.datamatrix.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: EdifactEncoder.java */
/* loaded from: classes6.dex */
final class f implements g {
    f() {
    }

    private static void c(char c5, StringBuilder sb) {
        if (c5 >= ' ' && c5 <= '?') {
            sb.append(c5);
        } else if (c5 < '@' || c5 > '^') {
            j.f(c5);
        } else {
            sb.append((char) (c5 - '@'));
        }
    }

    private static String d(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ઙ\u0001"));
        }
        int charAt = (charSequence.charAt(0) << 18) + ((length >= 2 ? charSequence.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(3) : (char) 0);
        char c5 = (char) ((charAt >> 16) & 255);
        char c6 = (char) ((charAt >> 8) & 255);
        char c7 = (char) (charAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c5);
        if (length >= 2) {
            sb.append(c6);
        }
        if (length >= 3) {
            sb.append(c7);
        }
        return sb.toString();
    }

    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z4 = true;
            if (length == 1) {
                hVar.q();
                int b5 = hVar.h().b() - hVar.a();
                int g4 = hVar.g();
                if (g4 > b5) {
                    hVar.r(hVar.a() + 1);
                    b5 = hVar.h().b() - hVar.a();
                }
                if (g4 <= b5 && b5 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException(ProtectedSandApp.s("ચ\u0001"));
            }
            int i4 = length - 1;
            String d5 = d(charSequence);
            if (hVar.j() || i4 > 2) {
                z4 = false;
            }
            if (i4 <= 2) {
                hVar.r(hVar.a() + i4);
                if (hVar.h().b() - hVar.a() >= 3) {
                    hVar.r(hVar.a() + d5.length());
                    z4 = false;
                }
            }
            if (z4) {
                hVar.l();
                hVar.f62864f -= i4;
            } else {
                hVar.t(d5);
            }
        } finally {
            hVar.p(0);
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.j()) {
                break;
            }
            c(hVar.d(), sb);
            hVar.f62864f++;
            if (sb.length() >= 4) {
                hVar.t(d(sb));
                sb.delete(0, 4);
                if (j.o(hVar.e(), hVar.f62864f, 4) != 4) {
                    hVar.p(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        e(hVar, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public int b() {
        return 4;
    }
}
