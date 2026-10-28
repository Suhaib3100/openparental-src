package com.tencent.qcloud.core.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.logger.COSLogger;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
class CountingInputStream extends FilterInputStream {
    private long bytesTotal;
    private long bytesWritten;
    private long mark;
    private QCloudProgressListener progressListener;
    private long recentReportBytes;

    public CountingInputStream(InputStream inputStream, long j4, QCloudProgressListener qCloudProgressListener) {
        super(inputStream);
        this.bytesWritten = 0L;
        this.recentReportBytes = 0L;
        this.mark = -1L;
        this.bytesTotal = j4;
        this.progressListener = qCloudProgressListener;
    }

    private void reportProgress() {
        QCloudProgressListener qCloudProgressListener = this.progressListener;
        if (qCloudProgressListener == null) {
            return;
        }
        long j4 = this.bytesWritten;
        long j5 = j4 - this.recentReportBytes;
        if (j5 <= 51200) {
            long j6 = j5 * 10;
            long j7 = this.bytesTotal;
            if (j6 <= j7 && j4 != j7) {
                return;
            }
        }
        this.recentReportBytes = j4;
        qCloudProgressListener.onProgress(j4, this.bytesTotal);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        COSLogger.iProcess(ProtectedSandApp.s("奎\u0001"), ProtectedSandApp.s("奏\u0001"));
    }

    long getBytesTotal() {
        return this.bytesTotal;
    }

    long getTotalTransferred() {
        return this.bytesWritten;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        super.mark(i4);
        this.mark = this.bytesWritten;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = super.read(bArr, i4, i5);
        if (read > 0) {
            readBytesInternal(read);
        }
        return read;
    }

    void readBytesInternal(long j4) {
        this.bytesWritten += j4;
        reportProgress();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException(ProtectedSandApp.s("契\u0001"));
        }
        if (this.mark == -1) {
            throw new IOException(ProtectedSandApp.s("奐\u0001"));
        }
        ((FilterInputStream) this).in.reset();
        this.bytesWritten = this.mark;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long skip = super.skip(j4);
        readBytesInternal(skip);
        return skip;
    }
}
