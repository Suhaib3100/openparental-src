package com.tencent.liteav.videobase.utils;

import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.concurrent.atomic.AtomicLong;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class ConsumerChainTimestamp {
    private AtomicLong mDeliverTimestamp = new AtomicLong(0);
    private AtomicLong mDecodeFinishTimestamp = new AtomicLong(0);
    private AtomicLong mRenderFinishTimestamp = new AtomicLong(0);

    public void copy(ConsumerChainTimestamp consumerChainTimestamp) {
        this.mDeliverTimestamp = consumerChainTimestamp.mDeliverTimestamp;
        this.mDecodeFinishTimestamp = consumerChainTimestamp.mDecodeFinishTimestamp;
        this.mRenderFinishTimestamp = consumerChainTimestamp.mRenderFinishTimestamp;
    }

    public long getDecodeFinishTimestamp() {
        return this.mDecodeFinishTimestamp.get();
    }

    public long getDeliverTimestamp() {
        return this.mDeliverTimestamp.get();
    }

    public long getRenderFinishTimestamp() {
        return this.mRenderFinishTimestamp.get();
    }

    public void setDecodeFinishTimestamp(long j4) {
        this.mDecodeFinishTimestamp.set(j4);
    }

    public void setDeliverTimestamp(long j4) {
        this.mDeliverTimestamp.set(j4);
    }

    public void setRenderFinishTimestamp(long j4) {
        this.mRenderFinishTimestamp.set(j4);
    }
}
