package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
/* loaded from: classes3.dex */
public class SessionInputBufferImpl implements SessionInputBuffer, BufferInfo {
    private final byte[] buffer;
    private int bufferlen;
    private int bufferpos;
    private CharBuffer cbuf;
    private final MessageConstraints constraints;
    private final CharsetDecoder decoder;
    private InputStream instream;
    private final ByteArrayBuffer linebuffer;
    private final HttpTransportMetricsImpl metrics;
    private final int minChunkLimit;

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i4, int i5, MessageConstraints messageConstraints, CharsetDecoder charsetDecoder) {
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        Args.positive(i4, "Buffer size");
        this.metrics = httpTransportMetricsImpl;
        this.buffer = new byte[i4];
        this.bufferpos = 0;
        this.bufferlen = 0;
        this.minChunkLimit = i5 < 0 ? 512 : i5;
        this.constraints = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.linebuffer = new ByteArrayBuffer(i4);
        this.decoder = charsetDecoder;
    }

    private int appendDecoded(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) throws IOException {
        int i4 = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.cbuf == null) {
            this.cbuf = CharBuffer.allocate(1024);
        }
        this.decoder.reset();
        while (byteBuffer.hasRemaining()) {
            i4 += handleDecodingResult(this.decoder.decode(byteBuffer, this.cbuf, true), charArrayBuffer, byteBuffer);
        }
        int handleDecodingResult = i4 + handleDecodingResult(this.decoder.flush(this.cbuf), charArrayBuffer, byteBuffer);
        this.cbuf.clear();
        return handleDecodingResult;
    }

    private int handleDecodingResult(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.cbuf.flip();
        int remaining = this.cbuf.remaining();
        while (this.cbuf.hasRemaining()) {
            charArrayBuffer.append(this.cbuf.get());
        }
        this.cbuf.compact();
        return remaining;
    }

    private int lineFromLineBuffer(CharArrayBuffer charArrayBuffer) throws IOException {
        int length = this.linebuffer.length();
        if (length > 0) {
            if (this.linebuffer.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.linebuffer.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.decoder == null) {
            charArrayBuffer.append(this.linebuffer, 0, length);
        } else {
            length = appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.linebuffer.buffer(), 0, length));
        }
        this.linebuffer.clear();
        return length;
    }

    private int lineFromReadBuffer(CharArrayBuffer charArrayBuffer, int i4) throws IOException {
        int i5 = this.bufferpos;
        this.bufferpos = i4 + 1;
        if (i4 > i5 && this.buffer[i4 - 1] == 13) {
            i4--;
        }
        int i6 = i4 - i5;
        if (this.decoder != null) {
            return appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.buffer, i5, i6));
        }
        charArrayBuffer.append(this.buffer, i5, i6);
        return i6;
    }

    private int locateLF() {
        for (int i4 = this.bufferpos; i4 < this.bufferlen; i4++) {
            if (this.buffer[i4] == 10) {
                return i4;
            }
        }
        return -1;
    }

    private int streamRead(byte[] bArr, int i4, int i5) throws IOException {
        Asserts.notNull(this.instream, "Input stream");
        return this.instream.read(bArr, i4, i5);
    }

    @Override // org.apache.http.io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    public void bind(InputStream inputStream) {
        this.instream = inputStream;
    }

    @Override // org.apache.http.io.BufferInfo
    public int capacity() {
        return this.buffer.length;
    }

    public void clear() {
        this.bufferpos = 0;
        this.bufferlen = 0;
    }

    public int fillBuffer() throws IOException {
        int i4 = this.bufferpos;
        if (i4 > 0) {
            int i5 = this.bufferlen - i4;
            if (i5 > 0) {
                byte[] bArr = this.buffer;
                System.arraycopy(bArr, i4, bArr, 0, i5);
            }
            this.bufferpos = 0;
            this.bufferlen = i5;
        }
        int i6 = this.bufferlen;
        byte[] bArr2 = this.buffer;
        int streamRead = streamRead(bArr2, i6, bArr2.length - i6);
        if (streamRead == -1) {
            return -1;
        }
        this.bufferlen = i6 + streamRead;
        this.metrics.incrementBytesTransferred(streamRead);
        return streamRead;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    public boolean hasBufferedData() {
        return this.bufferpos < this.bufferlen;
    }

    public boolean isBound() {
        return this.instream != null;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int i4) throws IOException {
        return hasBufferedData();
    }

    @Override // org.apache.http.io.BufferInfo
    public int length() {
        return this.bufferlen - this.bufferpos;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read() throws IOException {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.buffer;
        int i4 = this.bufferpos;
        this.bufferpos = i4 + 1;
        return bArr[i4] & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r2 == (-1)) goto L12;
     */
    @Override // org.apache.http.io.SessionInputBuffer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int readLine(org.apache.http.util.CharArrayBuffer r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "Char array buffer"
            org.apache.http.util.Args.notNull(r8, r0)
            r0 = 0
            r1 = 1
            r2 = r0
        L8:
            r3 = -1
            if (r1 == 0) goto L65
            int r4 = r7.locateLF()
            if (r4 == r3) goto L2f
            org.apache.http.util.ByteArrayBuffer r1 = r7.linebuffer
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1e
            int r8 = r7.lineFromReadBuffer(r8, r4)
            return r8
        L1e:
            int r4 = r4 + 1
            int r1 = r7.bufferpos
            int r3 = r4 - r1
            org.apache.http.util.ByteArrayBuffer r5 = r7.linebuffer
            byte[] r6 = r7.buffer
            r5.append(r6, r1, r3)
            r7.bufferpos = r4
        L2d:
            r1 = r0
            goto L4c
        L2f:
            boolean r2 = r7.hasBufferedData()
            if (r2 == 0) goto L45
            int r2 = r7.bufferlen
            int r4 = r7.bufferpos
            int r2 = r2 - r4
            org.apache.http.util.ByteArrayBuffer r5 = r7.linebuffer
            byte[] r6 = r7.buffer
            r5.append(r6, r4, r2)
            int r2 = r7.bufferlen
            r7.bufferpos = r2
        L45:
            int r2 = r7.fillBuffer()
            if (r2 != r3) goto L4c
            goto L2d
        L4c:
            org.apache.http.config.MessageConstraints r3 = r7.constraints
            int r3 = r3.getMaxLineLength()
            if (r3 <= 0) goto L8
            org.apache.http.util.ByteArrayBuffer r4 = r7.linebuffer
            int r4 = r4.length()
            if (r4 >= r3) goto L5d
            goto L8
        L5d:
            org.apache.http.MessageConstraintException r8 = new org.apache.http.MessageConstraintException
            java.lang.String r0 = "Maximum line length limit exceeded"
            r8.<init>(r0)
            throw r8
        L65:
            if (r2 != r3) goto L70
            org.apache.http.util.ByteArrayBuffer r0 = r7.linebuffer
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L70
            return r3
        L70:
            int r8 = r7.lineFromLineBuffer(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.io.SessionInputBufferImpl.readLine(org.apache.http.util.CharArrayBuffer):int");
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (hasBufferedData()) {
            int min = Math.min(i5, this.bufferlen - this.bufferpos);
            System.arraycopy(this.buffer, this.bufferpos, bArr, i4, min);
            this.bufferpos += min;
            return min;
        }
        if (i5 > this.minChunkLimit) {
            int streamRead = streamRead(bArr, i4, i5);
            if (streamRead > 0) {
                this.metrics.incrementBytesTransferred(streamRead);
            }
            return streamRead;
        }
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        int min2 = Math.min(i5, this.bufferlen - this.bufferpos);
        System.arraycopy(this.buffer, this.bufferpos, bArr, i4, min2);
        this.bufferpos += min2;
        return min2;
    }

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i4) {
        this(httpTransportMetricsImpl, i4, i4, null, null);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] bArr) throws IOException {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public String readLine() throws IOException {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (readLine(charArrayBuffer) != -1) {
            return charArrayBuffer.toString();
        }
        return null;
    }
}
