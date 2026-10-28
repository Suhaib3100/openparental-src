package com.tencent.liteav.videoproducer2;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.c;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class MediaCodecFrameJni {
    public ByteBuffer data;
    public c nalType = c.f72209a;
    public long pts;

    public static MediaCodecFrameJni create() {
        return new MediaCodecFrameJni();
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public int getNalType() {
        return this.nalType.mValue;
    }

    public long getPTS() {
        return this.pts;
    }
}
