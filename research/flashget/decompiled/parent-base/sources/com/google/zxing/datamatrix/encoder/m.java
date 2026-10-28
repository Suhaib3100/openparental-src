package com.google.zxing.datamatrix.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TextEncoder.java */
/* loaded from: classes6.dex */
final class m extends c {
    m() {
    }

    @Override // com.google.zxing.datamatrix.encoder.c, com.google.zxing.datamatrix.encoder.g
    public int b() {
        return 2;
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    int d(char c5, StringBuilder sb) {
        if (c5 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c5 >= '0' && c5 <= '9') {
            sb.append((char) (c5 - ','));
            return 1;
        }
        if (c5 >= 'a' && c5 <= 'z') {
            sb.append((char) (c5 - 'S'));
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
        if (c5 >= '[' && c5 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c5 - 'E'));
            return 2;
        }
        if (c5 == '`') {
            sb.append((char) 2);
            sb.append((char) (c5 - '`'));
            return 2;
        }
        if (c5 <= 'Z') {
            sb.append((char) 2);
            sb.append((char) (c5 - '@'));
            return 2;
        }
        if (c5 > 127) {
            sb.append(ProtectedSandApp.s("ધ\u0001"));
            return d((char) (c5 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c5 - '`'));
        return 2;
    }
}
