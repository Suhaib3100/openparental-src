package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class InputSubstream extends SdkFilterInputStream {
    private static final int MAX_SKIPS = 100;
    private final boolean closeSourceStream;
    private long currentPosition;
    private long markedPosition;
    private final long requestedLength;
    private final long requestedOffset;

    public InputSubstream(InputStream inputStream, long j4, long j5, boolean z4) {
        super(inputStream);
        this.markedPosition = 0L;
        this.currentPosition = 0L;
        this.requestedLength = j5;
        this.requestedOffset = j4;
        this.closeSourceStream = z4;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        long j4 = this.currentPosition;
        long j5 = this.requestedOffset;
        return (int) Math.min(j4 < j5 ? this.requestedLength : (this.requestedLength + j5) - j4, super.available());
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closeSourceStream) {
            super.close();
        }
    }

    InputStream getWrappedInputStream() {
        return ((FilterInputStream) this).in;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        this.markedPosition = this.currentPosition;
        super.mark(i4);
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read == -1 ? read : bArr[0];
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        this.currentPosition = this.markedPosition;
        super.reset();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        while (true) {
            long j4 = this.currentPosition;
            long j5 = this.requestedOffset;
            if (j4 < j5) {
                long skip = super.skip(j5 - j4);
                if (skip == 0 && (i6 = i6 + 1) > 100) {
                    throw new IOException(ProtectedSandApp.s("㘃\u0001") + this.currentPosition + ProtectedSandApp.s("㘄\u0001") + this.requestedOffset);
                }
                this.currentPosition += skip;
            } else {
                long j6 = (this.requestedLength + j5) - j4;
                if (j6 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i4, (int) Math.min(i5, j6));
                this.currentPosition += read;
                return read;
            }
        }
    }
}
