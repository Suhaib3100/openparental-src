package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;
import javax.crypto.SecretKey;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class CipherLite {
    static final CipherLite Null = new CipherLite() { // from class: com.tencent.cos.xml.crypto.CipherLite.1
        @Override // com.tencent.cos.xml.crypto.CipherLite
        CipherLite createAuxiliary(long j4) {
            return this;
        }

        @Override // com.tencent.cos.xml.crypto.CipherLite
        CipherLite createInverse() {
            return this;
        }
    };
    private final Cipher cipher;
    private final int cipherMode;
    private final ContentCryptoScheme scheme;
    private final SecretKey secreteKey;

    CipherLite createAuxiliary(long j4) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidAlgorithmParameterException {
        return this.scheme.createAuxillaryCipher(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider(), j4);
    }

    CipherLite createInverse() throws CosXmlClientException {
        int i4 = this.cipherMode;
        int i5 = 1;
        if (i4 != 2) {
            if (i4 != 1) {
                throw new UnsupportedOperationException();
            }
            i5 = 2;
        }
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), i5, this.cipher.getProvider());
    }

    CipherLite createUsingIV(byte[] bArr) throws CosXmlClientException {
        return this.scheme.createCipherLite(this.secreteKey, bArr, this.cipherMode, this.cipher.getProvider());
    }

    byte[] doFinal() throws IllegalBlockSizeException, BadPaddingException {
        return this.cipher.doFinal();
    }

    final int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    final Cipher getCipher() {
        return this.cipher;
    }

    final String getCipherAlgorithm() {
        return this.cipher.getAlgorithm();
    }

    final int getCipherMode() {
        return this.cipherMode;
    }

    final Provider getCipherProvider() {
        return this.cipher.getProvider();
    }

    final ContentCryptoScheme getContentCryptoScheme() {
        return this.scheme;
    }

    final byte[] getIV() {
        return this.cipher.getIV();
    }

    int getOutputSize(int i4) {
        return this.cipher.getOutputSize(i4);
    }

    final String getSecretKeyAlgorithm() {
        return this.secreteKey.getAlgorithm();
    }

    long mark() {
        return -1L;
    }

    boolean markSupported() {
        return false;
    }

    CipherLite recreate() throws CosXmlClientException {
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider());
    }

    void reset() {
        throw new IllegalStateException(ProtectedSandApp.s("㖏\u0001"));
    }

    byte[] update(byte[] bArr, int i4, int i5) {
        return this.cipher.update(bArr, i4, i5);
    }

    private CipherLite() {
        this.cipher = new NullCipher();
        this.scheme = null;
        this.secreteKey = null;
        this.cipherMode = -1;
    }

    byte[] doFinal(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        return this.cipher.doFinal(bArr);
    }

    byte[] doFinal(byte[] bArr, int i4, int i5) throws IllegalBlockSizeException, BadPaddingException {
        return this.cipher.doFinal(bArr, i4, i5);
    }

    CipherLite(Cipher cipher, ContentCryptoScheme contentCryptoScheme, SecretKey secretKey, int i4) {
        this.cipher = cipher;
        this.scheme = contentCryptoScheme;
        this.secreteKey = secretKey;
        this.cipherMode = i4;
    }
}
