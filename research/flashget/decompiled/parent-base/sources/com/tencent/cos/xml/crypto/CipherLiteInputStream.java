package com.tencent.cos.xml.crypto;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* loaded from: classes6.dex */
public class CipherLiteInputStream extends SdkFilterInputStream {
    private static final int DEFAULT_IN_BUFFER_SIZE = 512;
    private static final int MAX_RETRY = 1000;
    private byte[] bufin;
    private byte[] bufout;
    private CipherLite cipherLite;
    private int curr_pos;
    private boolean eof;
    private final boolean lastMultiPart;
    private int max_pos;
    private final boolean multipart;

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite) {
        this(inputStream, cipherLite, 512, false, false);
    }

    private int nextChunk() throws IOException {
        abortIfNeeded();
        if (this.eof) {
            return -1;
        }
        this.bufout = null;
        int read = ((FilterInputStream) this).in.read(this.bufin);
        if (read != -1) {
            byte[] update = this.cipherLite.update(this.bufin, 0, read);
            this.bufout = update;
            this.curr_pos = 0;
            int length = update != null ? update.length : 0;
            this.max_pos = length;
            return length;
        }
        this.eof = true;
        if (!this.multipart || this.lastMultiPart) {
            try {
                byte[] doFinal = this.cipherLite.doFinal();
                this.bufout = doFinal;
                if (doFinal == null) {
                    return -1;
                }
                this.curr_pos = 0;
                int length2 = doFinal.length;
                this.max_pos = length2;
                return length2;
            } catch (BadPaddingException e4) {
                if (COSCryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
                    throw new SecurityException(e4);
                }
            } catch (IllegalBlockSizeException unused) {
            }
        }
        return -1;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        abortIfNeeded();
        return this.max_pos - this.curr_pos;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        if (!this.multipart && !COSCryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
            try {
                this.cipherLite.doFinal();
            } catch (BadPaddingException | IllegalBlockSizeException unused) {
            }
        }
        this.max_pos = 0;
        this.curr_pos = 0;
        abortIfNeeded();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        abortIfNeeded();
        ((FilterInputStream) this).in.mark(i4);
        this.cipherLite.mark();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.markSupported() && this.cipherLite.markSupported();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.curr_pos >= this.max_pos) {
            if (this.eof) {
                return -1;
            }
            int i4 = 0;
            while (i4 <= 1000) {
                int nextChunk = nextChunk();
                i4++;
                if (nextChunk != 0) {
                    if (nextChunk == -1) {
                        return -1;
                    }
                }
            }
            throw new IOException(ProtectedSandApp.s("㖓\u0001"));
        }
        byte[] bArr = this.bufout;
        int i5 = this.curr_pos;
        this.curr_pos = i5 + 1;
        return bArr[i5] & 255;
    }

    void renewCipherLite() throws CosXmlClientException {
        this.cipherLite = this.cipherLite.recreate();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        ((FilterInputStream) this).in.reset();
        this.cipherLite.reset();
        resetInternal();
    }

    final void resetInternal() {
        this.max_pos = 0;
        this.curr_pos = 0;
        this.eof = false;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        abortIfNeeded();
        int i4 = this.max_pos;
        int i5 = this.curr_pos;
        long j5 = i4 - i5;
        if (j4 > j5) {
            j4 = j5;
        }
        if (j4 < 0) {
            return 0L;
        }
        this.curr_pos = (int) (i5 + j4);
        return j4;
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i4) {
        this(inputStream, cipherLite, i4, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i4, boolean z4, boolean z5) {
        super(inputStream);
        this.max_pos = -1;
        if (z5 && !z4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㖐\u0001"));
        }
        this.multipart = z4;
        this.lastMultiPart = z5;
        this.cipherLite = cipherLite;
        if (i4 > 0 && i4 % 512 == 0) {
            this.bufin = new byte[i4];
            return;
        }
        throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("㖑\u0001"), i4, ProtectedSandApp.s("㖒\u0001")));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (this.curr_pos >= this.max_pos) {
            if (this.eof) {
                return -1;
            }
            int i6 = 0;
            while (i6 <= 1000) {
                int nextChunk = nextChunk();
                i6++;
                if (nextChunk != 0) {
                    if (nextChunk == -1) {
                        return -1;
                    }
                }
            }
            throw new IOException(ProtectedSandApp.s("㖓\u0001"));
        }
        if (i5 <= 0) {
            return 0;
        }
        int i7 = this.max_pos;
        int i10 = this.curr_pos;
        int i11 = i7 - i10;
        if (i5 >= i11) {
            i5 = i11;
        }
        System.arraycopy(this.bufout, i10, bArr, i4, i5);
        this.curr_pos += i5;
        return i5;
    }

    protected CipherLiteInputStream(InputStream inputStream) {
        this(inputStream, CipherLite.Null, 512, false, false);
    }
}
