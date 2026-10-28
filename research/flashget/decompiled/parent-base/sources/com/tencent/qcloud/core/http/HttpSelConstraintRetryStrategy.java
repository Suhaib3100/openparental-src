package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.task.SelfConstraintRetryStrategy;

/* loaded from: classes7.dex */
public class HttpSelConstraintRetryStrategy extends SelfConstraintRetryStrategy {
    public HttpSelConstraintRetryStrategy(int i4, int i5, int i6) {
        super(i4, i5, i6);
    }

    @Override // com.tencent.qcloud.core.task.SelfConstraintRetryStrategy
    protected boolean shouldIncreaseDelay(Exception exc) {
        return HttpUtil.isNetworkTimeoutError(exc);
    }
}
