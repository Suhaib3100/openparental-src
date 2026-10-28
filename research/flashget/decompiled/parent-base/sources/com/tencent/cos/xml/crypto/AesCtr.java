package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
class AesCtr extends ContentCryptoScheme {
    AesCtr() {
    }

    private byte[] computeJ0(byte[] bArr) {
        int blockSizeInBytes = getBlockSizeInBytes();
        byte[] bArr2 = new byte[blockSizeInBytes];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[blockSizeInBytes - 1] = 1;
        return ContentCryptoScheme.incrementBlocks(bArr2, 1L);
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    byte[] adjustIV(byte[] bArr, long j4) {
        if (bArr.length != 12) {
            throw new UnsupportedOperationException();
        }
        int blockSizeInBytes = getBlockSizeInBytes();
        long j5 = blockSizeInBytes;
        long j6 = j4 / j5;
        if (j5 * j6 == j4) {
            return ContentCryptoScheme.incrementBlocks(computeJ0(bArr), j6);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㕾\u0001") + j6 + ProtectedSandApp.s("㕿\u0001") + blockSizeInBytes + ProtectedSandApp.s("㖀\u0001") + j4);
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getBlockSizeInBytes() {
        return 16;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    String getCipherAlgorithm() {
        return ProtectedSandApp.s("㖁\u0001");
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getIVLengthInBytes() {
        return 16;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    String getKeyGeneratorAlgorithm() {
        return ProtectedSandApp.s("㖂\u0001");
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    int getKeyLengthInBits() {
        return 256;
    }

    @Override // com.tencent.cos.xml.crypto.ContentCryptoScheme
    long getMaxPlaintextSize() {
        return -1L;
    }
}
