package com.tencent.qcloud.core.http;

import okhttp3.d0;
import okhttp3.f0;

/* loaded from: classes7.dex */
public abstract class QCloudHttpRetryHandler {
    public static QCloudHttpRetryHandler DEFAULT = new QCloudHttpRetryHandler() { // from class: com.tencent.qcloud.core.http.QCloudHttpRetryHandler.1
        @Override // com.tencent.qcloud.core.http.QCloudHttpRetryHandler
        public boolean shouldRetry(d0 d0Var, f0 f0Var, Exception exc) {
            return true;
        }
    };

    public abstract boolean shouldRetry(d0 d0Var, f0 f0Var, Exception exc);
}
