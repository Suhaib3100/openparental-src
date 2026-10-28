package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class LengthCheckInputStream extends SdkFilterInputStream {
    public static final boolean EXCLUDE_SKIPPED_BYTES = false;
    public static final boolean INCLUDE_SKIPPED_BYTES = true;
    private long dataLength;
    private final long expectedLength;
    private final boolean includeSkipped;
    private int markCount;
    private long marked;
    private int resetCount;
    private boolean resetSinceLastMarked;

    public LengthCheckInputStream(InputStream inputStream, long j4, boolean z4) {
        super(inputStream);
        if (j4 < 0) {
            throw new IllegalArgumentException();
        }
        this.expectedLength = j4;
        this.includeSkipped = z4;
    }

    private void checkLength(boolean z4) throws IOException {
        if (z4) {
            if (this.dataLength == this.expectedLength) {
                return;
            }
            throw new IOException(ProtectedSandApp.s("㘊\u0001") + diagnosticInfo());
        }
        if (this.dataLength <= this.expectedLength) {
            return;
        }
        throw new IOException(ProtectedSandApp.s("㘋\u0001") + diagnosticInfo());
    }

    private String diagnosticInfo() {
        return ProtectedSandApp.s("㘌\u0001") + this.dataLength + ProtectedSandApp.s("㘍\u0001") + this.expectedLength + ProtectedSandApp.s("㘎\u0001") + this.includeSkipped + ProtectedSandApp.s("㘏\u0001") + ((FilterInputStream) this).in.getClass() + ProtectedSandApp.s("㘐\u0001") + markSupported() + ProtectedSandApp.s("㘑\u0001") + this.marked + ProtectedSandApp.s("㘒\u0001") + this.resetSinceLastMarked + ProtectedSandApp.s("㘓\u0001") + this.markCount + ProtectedSandApp.s("㘔\u0001") + this.resetCount;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        if (markSupported()) {
            super.mark(i4);
            this.marked = this.dataLength;
            this.markCount++;
            this.resetSinceLastMarked = false;
        }
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read >= 0) {
            this.dataLength++;
        }
        checkLength(read == -1);
        return read;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!markSupported()) {
            throw new IOException(ProtectedSandApp.s("㘕\u0001"));
        }
        super.reset();
        this.dataLength = this.marked;
        this.resetCount++;
        this.resetSinceLastMarked = true;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long skip = super.skip(j4);
        if (this.includeSkipped && skip > 0) {
            this.dataLength += skip;
            checkLength(false);
        }
        return skip;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = super.read(bArr, i4, i5);
        this.dataLength += read >= 0 ? read : 0L;
        checkLength(read == -1);
        return read;
    }
}
