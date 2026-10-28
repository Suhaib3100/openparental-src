package com.google.zxing.datamatrix.encoder;

import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ASCIIEncoder.java */
/* loaded from: classes6.dex */
final class a implements g {
    a() {
    }

    private static char c(char c5, char c6) {
        if (j.g(c5) && j.g(c6)) {
            return (char) ((c6 - '0') + ((c5 - '0') * 10) + UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ઌ\u0001") + c5 + c6);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        if (j.a(hVar.e(), hVar.f62864f) >= 2) {
            hVar.s(c(hVar.e().charAt(hVar.f62864f), hVar.e().charAt(hVar.f62864f + 1)));
            hVar.f62864f += 2;
            return;
        }
        char d5 = hVar.d();
        int o4 = j.o(hVar.e(), hVar.f62864f, 0);
        if (o4 == 0) {
            if (!j.h(d5)) {
                hVar.s((char) (d5 + 1));
                hVar.f62864f++;
                return;
            } else {
                hVar.s((char) 235);
                hVar.s((char) (d5 - 127));
                hVar.f62864f++;
                return;
            }
        }
        if (o4 == 1) {
            hVar.s((char) 230);
            hVar.p(1);
            return;
        }
        if (o4 == 2) {
            hVar.s((char) 239);
            hVar.p(2);
            return;
        }
        if (o4 == 3) {
            hVar.s((char) 238);
            hVar.p(3);
        } else if (o4 == 4) {
            hVar.s((char) 240);
            hVar.p(4);
        } else {
            if (o4 != 5) {
                throw new IllegalStateException(ProtectedSandApp.s("ઍ\u0001").concat(String.valueOf(o4)));
            }
            hVar.s((char) 231);
            hVar.p(5);
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public int b() {
        return 0;
    }
}
