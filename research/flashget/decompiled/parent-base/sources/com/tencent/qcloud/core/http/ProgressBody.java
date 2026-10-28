package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudProgressListener;

/* loaded from: classes7.dex */
public interface ProgressBody {
    long getBytesTransferred();

    void setProgressListener(QCloudProgressListener qCloudProgressListener);
}
