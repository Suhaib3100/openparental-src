package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudProgressListener;
import java.io.IOException;
import okio.m;
import okio.m0;
import okio.r;

/* loaded from: classes7.dex */
class CountingSink extends r {
    private long bytesTotal;
    private long bytesWritten;
    private long lastTimeBytesWritten;
    private QCloudProgressListener progressListener;
    private long recentReportBytes;

    public CountingSink(m0 m0Var, long j4, QCloudProgressListener qCloudProgressListener) {
        super(m0Var);
        this.lastTimeBytesWritten = 0L;
        this.bytesWritten = 0L;
        this.recentReportBytes = 0L;
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
        long j10 = this.lastTimeBytesWritten;
        qCloudProgressListener.onProgress(j4 + j10, j10 + this.bytesTotal);
    }

    long getBytesWritten() {
        return this.bytesWritten;
    }

    long getTotalTransferred() {
        return this.bytesWritten + this.lastTimeBytesWritten;
    }

    @Override // okio.r, okio.m0
    public void write(m mVar, long j4) throws IOException {
        super.write(mVar, j4);
        writeBytesInternal(j4);
    }

    void writeBytesInternal(long j4) {
        this.bytesWritten += j4;
        reportProgress();
    }

    public CountingSink(m0 m0Var, long j4, long j5, QCloudProgressListener qCloudProgressListener) {
        super(m0Var);
        this.bytesWritten = 0L;
        this.recentReportBytes = 0L;
        this.bytesTotal = j4;
        this.lastTimeBytesWritten = j5;
        this.progressListener = qCloudProgressListener;
    }
}
