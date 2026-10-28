package com.tencent.qcloud.core.task;

import com.tencent.qcloud.core.http.QCloudHttpRetryHandler;

/* loaded from: classes7.dex */
public class RetryStrategy {
    protected static final int BACKOFF_MULTIPLIER = 2;
    private static final int DEFAULT_ATTEMPTS = 3;
    private static final int DEFAULT_INIT_BACKOFF = 1000;
    private static final int DEFAULT_MAX_BACKOFF = 2000;
    protected final int baseAttempts;
    protected final int initBackoff;
    protected final int maxBackoff;
    private QCloudHttpRetryHandler qCloudHttpRetryHandler = QCloudHttpRetryHandler.DEFAULT;
    public static RetryStrategy DEFAULT = new RetryStrategy(1000, 2000, 0);
    public static RetryStrategy FAIL_FAST = new RetryStrategy(0, 0, Integer.MIN_VALUE);

    public static class WeightAndReliableAddition {
        private final int maxWeight = 2;
        private final int minWeight = 0;
        private final int minReliable = 0;
        private final int maxReliable = 4;
        private final int[][] addTable = {new int[]{0, 1, 2, 2, 2}, new int[]{0, 1, 2, 3, 3}, new int[]{0, 1, 2, 3, 4}};

        private int regular(int i4, int i5, int i6) {
            return i4 > i5 ? i5 : i4 < i6 ? i6 : i4;
        }

        public int getRetryAddition(int i4, int i5) {
            int regular = regular(i4, 2, 0);
            return this.addTable[regular][regular(i5, 4, 0)] + 1;
        }
    }

    public RetryStrategy(int i4, int i5, int i6) {
        this.initBackoff = i4;
        this.maxBackoff = i5;
        this.baseAttempts = i6;
    }

    public long getNextDelay(int i4) {
        if (i4 < 1) {
            return 0L;
        }
        return Math.min(this.maxBackoff, this.initBackoff * ((int) Math.pow(2.0d, i4 - 1)));
    }

    public QCloudHttpRetryHandler getQCloudHttpRetryHandler() {
        return this.qCloudHttpRetryHandler;
    }

    public void onTaskEnd(boolean z4, Exception exc) {
    }

    public void setRetryHandler(QCloudHttpRetryHandler qCloudHttpRetryHandler) {
        this.qCloudHttpRetryHandler = qCloudHttpRetryHandler;
    }

    public boolean shouldRetry(int i4, long j4, int i5) {
        return i4 < this.baseAttempts + i5;
    }
}
