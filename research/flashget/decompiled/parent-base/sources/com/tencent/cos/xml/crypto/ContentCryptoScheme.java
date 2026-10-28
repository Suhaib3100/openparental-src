package com.tencent.cos.xml.crypto;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes6.dex */
abstract class ContentCryptoScheme {
    static final long MAX_CBC_BYTES = 4503599627370496L;
    static final long MAX_CTR_BYTES = -1;
    static final long MAX_GCM_BLOCKS = 4294967294L;
    static final long MAX_GCM_BYTES = 68719476704L;
    static final ContentCryptoScheme AES_GCM = new AesGcm();
    static final ContentCryptoScheme AES_CTR = new AesCtr();

    ContentCryptoScheme() {
    }

    static ContentCryptoScheme fromCEKAlgo(String str) {
        ContentCryptoScheme contentCryptoScheme = AES_CTR;
        if (contentCryptoScheme.getCipherAlgorithm().equals(str)) {
            return contentCryptoScheme;
        }
        throw new UnsupportedOperationException(c.a(ProtectedSandApp.s("㕳\u0001"), str));
    }

    static byte[] incrementBlocks(byte[] bArr, long j4) {
        if (j4 == 0) {
            return bArr;
        }
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (j4 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        for (int i4 = 12; i4 <= 15; i4++) {
            allocate.put(i4 - 8, bArr[i4]);
        }
        long j5 = allocate.getLong() + j4;
        if (j5 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        allocate.rewind();
        byte[] array = allocate.putLong(j5).array();
        for (int i5 = 12; i5 <= 15; i5++) {
            bArr[i5] = array[i5 - 8];
        }
        return bArr;
    }

    byte[] adjustIV(byte[] bArr, long j4) {
        return bArr;
    }

    CipherLite createAuxillaryCipher(SecretKey secretKey, byte[] bArr, int i4, Provider provider, long j4) throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        return null;
    }

    CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i4, Provider provider) throws CosXmlClientException {
        String specificCipherProvider = getSpecificCipherProvider();
        try {
            Cipher cipher = specificCipherProvider != null ? Cipher.getInstance(getCipherAlgorithm(), specificCipherProvider) : provider != null ? Cipher.getInstance(getCipherAlgorithm(), provider) : Cipher.getInstance(getCipherAlgorithm());
            cipher.init(i4, secretKey, new IvParameterSpec(bArr));
            return newCipherLite(cipher, secretKey, i4);
        } catch (Exception e4) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㕴\u0001") + e4.getMessage() + ProtectedSandApp.s("㕵\u0001"));
        }
    }

    abstract int getBlockSizeInBytes();

    abstract String getCipherAlgorithm();

    abstract int getIVLengthInBytes();

    abstract String getKeyGeneratorAlgorithm();

    abstract int getKeyLengthInBits();

    final String getKeySpec() {
        return getKeyGeneratorAlgorithm() + ProtectedSandApp.s("㕶\u0001") + getKeyLengthInBits();
    }

    abstract long getMaxPlaintextSize();

    String getSpecificCipherProvider() {
        return null;
    }

    int getTagLengthInBits() {
        return 0;
    }

    protected CipherLite newCipherLite(Cipher cipher, SecretKey secretKey, int i4) {
        return new CipherLite(cipher, this, secretKey, i4);
    }

    public String toString() {
        return ProtectedSandApp.s("㕷\u0001") + getCipherAlgorithm() + ProtectedSandApp.s("㕸\u0001") + getBlockSizeInBytes() + ProtectedSandApp.s("㕹\u0001") + getIVLengthInBytes() + ProtectedSandApp.s("㕺\u0001") + getKeyGeneratorAlgorithm() + ProtectedSandApp.s("㕻\u0001") + getKeyLengthInBits() + ProtectedSandApp.s("㕼\u0001") + getSpecificCipherProvider() + ProtectedSandApp.s("㕽\u0001") + getTagLengthInBits();
    }

    CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i4) throws CosXmlClientException {
        return createCipherLite(secretKey, bArr, i4, null);
    }
}
