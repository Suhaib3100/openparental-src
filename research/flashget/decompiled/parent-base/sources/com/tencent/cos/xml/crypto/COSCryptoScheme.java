package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.SecureRandom;

/* loaded from: classes6.dex */
final class COSCryptoScheme {
    private final ContentCryptoScheme contentCryptoScheme;
    private final COSKeyWrapScheme kwScheme;
    static final String RSA = ProtectedSandApp.s("㖆\u0001");
    static final String AES = ProtectedSandApp.s("㖇\u0001");
    private static final SecureRandom srand = new SecureRandom();

    private COSCryptoScheme(ContentCryptoScheme contentCryptoScheme, COSKeyWrapScheme cOSKeyWrapScheme) {
        this.contentCryptoScheme = contentCryptoScheme;
        this.kwScheme = cOSKeyWrapScheme;
    }

    static COSCryptoScheme from() {
        return new COSCryptoScheme(ContentCryptoScheme.AES_CTR, new COSKeyWrapScheme());
    }

    static boolean isAesGcm(String str) {
        return ContentCryptoScheme.AES_GCM.getCipherAlgorithm().equals(str);
    }

    ContentCryptoScheme getContentCryptoScheme() {
        return this.contentCryptoScheme;
    }

    COSKeyWrapScheme getKeyWrapScheme() {
        return this.kwScheme;
    }

    SecureRandom getSecureRandom() {
        return srand;
    }
}
