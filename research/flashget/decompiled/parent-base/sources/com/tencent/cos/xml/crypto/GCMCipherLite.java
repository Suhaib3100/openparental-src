package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* loaded from: classes6.dex */
final class GCMCipherLite extends CipherLite {
    private static final int TAG_LENGTH = ContentCryptoScheme.AES_GCM.getTagLengthInBits() / 8;
    private CipherLite aux;
    private long currentCount;
    private boolean doneFinal;
    private byte[] finalBytes;
    private boolean invisiblyProcessed;
    private long markedCount;
    private long outputByteCount;
    private boolean securityViolated;
    private final int tagLen;

    GCMCipherLite(Cipher cipher, SecretKey secretKey, int i4) {
        super(cipher, ContentCryptoScheme.AES_GCM, secretKey, i4);
        this.tagLen = i4 == 1 ? TAG_LENGTH : 0;
        if (i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException();
        }
    }

    private int checkMax(int i4) {
        if (this.outputByteCount + i4 <= 68719476704L) {
            return i4;
        }
        this.securityViolated = true;
        throw new SecurityException(ProtectedSandApp.s("㖼\u0001") + this.outputByteCount + ProtectedSandApp.s("㖽\u0001") + i4 + ProtectedSandApp.s("㖾\u0001"));
    }

    private final byte[] doFinal0(byte[] bArr, int i4, int i5) throws IllegalBlockSizeException, BadPaddingException {
        if (!this.doneFinal) {
            this.doneFinal = true;
            byte[] doFinal = super.doFinal(bArr, i4, i5);
            this.finalBytes = doFinal;
            if (doFinal == null) {
                return null;
            }
            this.outputByteCount += checkMax(doFinal.length - this.tagLen);
            return (byte[]) this.finalBytes.clone();
        }
        if (this.securityViolated) {
            throw new SecurityException();
        }
        if (2 == getCipherMode()) {
            byte[] bArr2 = this.finalBytes;
            if (bArr2 == null) {
                return null;
            }
            return (byte[]) bArr2.clone();
        }
        byte[] bArr3 = this.finalBytes;
        int length = bArr3.length;
        int i6 = this.tagLen;
        int i7 = length - i6;
        if (i5 == i7) {
            return (byte[]) bArr3.clone();
        }
        if (i5 >= i7 || i5 + this.currentCount != this.outputByteCount) {
            throw new IllegalStateException(ProtectedSandApp.s("㖿\u0001"));
        }
        return Arrays.copyOfRange(bArr3, (bArr3.length - i6) - i5, bArr3.length);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    byte[] doFinal() throws IllegalBlockSizeException, BadPaddingException {
        if (this.doneFinal) {
            if (this.securityViolated) {
                throw new SecurityException();
            }
            byte[] bArr = this.finalBytes;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }
        this.doneFinal = true;
        byte[] doFinal = super.doFinal();
        this.finalBytes = doFinal;
        if (doFinal == null) {
            return null;
        }
        this.outputByteCount += checkMax(doFinal.length - this.tagLen);
        return (byte[]) this.finalBytes.clone();
    }

    long getCurrentCount() {
        return this.currentCount;
    }

    byte[] getFinalBytes() {
        byte[] bArr = this.finalBytes;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    long getMarkedCount() {
        return this.markedCount;
    }

    long getOutputByteCount() {
        return this.outputByteCount;
    }

    byte[] getTag() {
        byte[] bArr;
        if (getCipherMode() != 1 || (bArr = this.finalBytes) == null) {
            return null;
        }
        return Arrays.copyOfRange(bArr, bArr.length - this.tagLen, bArr.length);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    long mark() {
        long j4 = this.aux == null ? this.outputByteCount : this.currentCount;
        this.markedCount = j4;
        return j4;
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    boolean markSupported() {
        return true;
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    void reset() {
        long j4 = this.markedCount;
        if (j4 < this.outputByteCount || this.invisiblyProcessed) {
            try {
                this.aux = createAuxiliary(j4);
                this.currentCount = this.markedCount;
            } catch (Exception e4) {
                if (!(e4 instanceof RuntimeException)) {
                    throw new IllegalStateException(e4);
                }
            }
        }
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    byte[] update(byte[] bArr, int i4, int i5) {
        byte[] update;
        CipherLite cipherLite = this.aux;
        r1 = false;
        boolean z4 = false;
        if (cipherLite == null) {
            update = super.update(bArr, i4, i5);
            if (update == null) {
                this.invisiblyProcessed = bArr.length > 0;
                return null;
            }
            this.outputByteCount += checkMax(update.length);
            if (update.length == 0 && i5 > 0) {
                z4 = true;
            }
            this.invisiblyProcessed = z4;
        } else {
            update = cipherLite.update(bArr, i4, i5);
            if (update == null) {
                return null;
            }
            long length = this.currentCount + update.length;
            this.currentCount = length;
            long j4 = this.outputByteCount;
            if (length == j4) {
                this.aux = null;
            } else if (length > j4) {
                if (1 == getCipherMode()) {
                    throw new IllegalStateException(ProtectedSandApp.s("㗀\u0001") + this.currentCount + ProtectedSandApp.s("㗁\u0001") + this.outputByteCount);
                }
                byte[] bArr2 = this.finalBytes;
                int length2 = bArr2 != null ? bArr2.length : 0;
                long j5 = this.outputByteCount;
                long j6 = length2;
                long length3 = (j5 - (this.currentCount - update.length)) - j6;
                this.currentCount = j5 - j6;
                this.aux = null;
                return Arrays.copyOf(update, (int) length3);
            }
        }
        return update;
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    final byte[] doFinal(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        return doFinal0(bArr, 0, bArr.length);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLite
    final byte[] doFinal(byte[] bArr, int i4, int i5) throws IllegalBlockSizeException, BadPaddingException {
        return doFinal0(bArr, i4, i5);
    }
}
