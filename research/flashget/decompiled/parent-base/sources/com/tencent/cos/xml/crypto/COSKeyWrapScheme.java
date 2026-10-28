package com.tencent.cos.xml.crypto;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.Key;

/* loaded from: classes6.dex */
class COSKeyWrapScheme {
    public static final String AESWrap = ProtectedSandApp.s("㖊\u0001");
    public static final String RSA_ECB_OAEPWithSHA256AndMGF1Padding = ProtectedSandApp.s("㖌\u0001");

    COSKeyWrapScheme() {
    }

    String getKeyWrapAlgorithm(Key key) {
        String algorithm = key.getAlgorithm();
        if (ProtectedSandApp.s("㖉\u0001").equals(algorithm)) {
            return ProtectedSandApp.s("㖊\u0001");
        }
        if (ProtectedSandApp.s("㖋\u0001").equals(algorithm)) {
            return ProtectedSandApp.s("㖌\u0001");
        }
        throw new IllegalArgumentException(c.a(ProtectedSandApp.s("㖍\u0001"), algorithm));
    }

    public String toString() {
        return ProtectedSandApp.s("㖎\u0001");
    }
}
