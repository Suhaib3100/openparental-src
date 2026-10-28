package com.tencent.qcloud.core.task;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public abstract class SelfConstraintRetryStrategy extends RetryStrategy {
    private AtomicLong nextDelay;

    public SelfConstraintRetryStrategy(int i4, int i5, int i6) {
        super(i4, i5, i6);
        this.nextDelay = new AtomicLong(0L);
    }

    @Override // com.tencent.qcloud.core.task.RetryStrategy
    public long getNextDelay(int i4) {
        return this.nextDelay.get();
    }

    @Override // com.tencent.qcloud.core.task.RetryStrategy
    public void onTaskEnd(boolean z4, Exception exc) {
        if (z4) {
            this.nextDelay.set(0L);
        } else if (shouldIncreaseDelay(exc)) {
            AtomicLong atomicLong = this.nextDelay;
            atomicLong.set(Math.max(Math.min(this.maxBackoff, atomicLong.get() * 2), this.initBackoff));
        }
    }

    protected abstract boolean shouldIncreaseDelay(Exception exc);
}
