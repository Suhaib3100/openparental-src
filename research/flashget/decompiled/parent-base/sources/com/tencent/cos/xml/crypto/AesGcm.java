package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* loaded from: classes6.dex */
class AesGcm extends ContentCryptoScheme {
    AesGcm() {
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    CipherLite createAuxillaryCipher(SecretKey secretKey, byte[] bArr, int i4, Provider provider, long j4) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidAlgorithmParameterException {
        ContentCryptoScheme contentCryptoScheme = ContentCryptoScheme.AES_CTR;
        try {
            return contentCryptoScheme.createCipherLite(secretKey, contentCryptoScheme.adjustIV(bArr, j4), i4, provider);
        } catch (CosXmlClientException e4) {
            throw new InvalidKeyException(e4);
        }
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getBlockSizeInBytes() {
        return 16;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    String getCipherAlgorithm() {
        return ProtectedSandApp.s("㖃\u0001");
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getIVLengthInBytes() {
        return 12;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    String getKeyGeneratorAlgorithm() {
        return ProtectedSandApp.s("㖄\u0001");
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getKeyLengthInBits() {
        return 256;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    long getMaxPlaintextSize() {
        return 68719476704L;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    String getSpecificCipherProvider() {
        return ProtectedSandApp.s("㖅\u0001");
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getTagLengthInBits() {
        return 128;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    protected CipherLite newCipherLite(Cipher cipher, SecretKey secretKey, int i4) {
        return new GCMCipherLite(cipher, secretKey, i4);
    }
}
