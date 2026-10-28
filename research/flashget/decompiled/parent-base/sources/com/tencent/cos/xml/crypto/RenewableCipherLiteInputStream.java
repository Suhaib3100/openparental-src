package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class RenewableCipherLiteInputStream extends CipherLiteInputStream {
    private boolean hasBeenAccessed;

    public RenewableCipherLiteInputStream(InputStream inputStream, CipherLite cipherLite) {
        super(inputStream, cipherLite);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        abortIfNeeded();
        if (this.hasBeenAccessed) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㘯\u0001"));
        }
        ((FilterInputStream) this).in.mark(i4);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        this.hasBeenAccessed = true;
        return super.read();
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        ((FilterInputStream) this).in.reset();
        try {
            renewCipherLite();
            resetInternal();
            this.hasBeenAccessed = false;
        } catch (CosXmlClientException e4) {
            e4.printStackTrace();
            throw new IOException(e4);
        }
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        this.hasBeenAccessed = true;
        return super.skip(j4);
    }

    public RenewableCipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i4) {
        super(inputStream, cipherLite, i4);
    }

    public RenewableCipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i4, boolean z4, boolean z5) {
        super(inputStream, cipherLite, i4, z4, z5);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        this.hasBeenAccessed = true;
        return super.read(bArr);
    }

    protected RenewableCipherLiteInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // com.tencent.cos.xml.crypto.CipherLiteInputStream, com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        this.hasBeenAccessed = true;
        return super.read(bArr, i4, i5);
    }
}
