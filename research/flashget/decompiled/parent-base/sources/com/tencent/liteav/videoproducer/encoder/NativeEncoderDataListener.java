package com.tencent.liteav.videoproducer.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;
import com.tencent.liteav.videobase.videobase.e;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class NativeEncoderDataListener extends VideoEncoderDef.b {
    public static final String TAG = ProtectedSandApp.s("圞\u0001");
    private long mNativeVideoEncodeDataListener;
    private int mStreamType;

    public NativeEncoderDataListener(long j4, int i4) {
        this.mNativeVideoEncodeDataListener = j4;
        this.mStreamType = i4;
    }

    private native void nativeOnEncodedFail(long j4, int i4, int i5);

    private native void nativeOnEncodedNAL(long j4, int i4, EncodedVideoFrame encodedVideoFrame, ByteBuffer byteBuffer, ProducerChainTimestamp producerChainTimestamp, int i5, int i6, int i7, int i10, long j5, long j6, long j7, long j10, long j11, long j12, int i11, int i12, boolean z4, int i13);

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
    public synchronized void onEncodedFail(e.a aVar) {
        long j4 = this.mNativeVideoEncodeDataListener;
        if (j4 != 0) {
            nativeOnEncodedFail(j4, this.mStreamType, com.tencent.liteav.videobase.videobase.e.a(aVar));
        } else {
            LiteavLog.i(ProtectedSandApp.s("圞\u0001"), ProtectedSandApp.s("土\u0001"));
        }
    }

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
    public synchronized void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z4) {
        long j4 = this.mNativeVideoEncodeDataListener;
        if (j4 == 0 || z4) {
            LiteavLog.d(ProtectedSandApp.s("圞\u0001"), ProtectedSandApp.s("圠\u0001"), Long.valueOf(j4), Boolean.valueOf(z4));
            return;
        }
        int i4 = this.mStreamType;
        ByteBuffer byteBuffer = encodedVideoFrame.data;
        ProducerChainTimestamp producerChainTimestamp = encodedVideoFrame.producerChainTimestamp;
        int i5 = encodedVideoFrame.nalType.mValue;
        int i6 = encodedVideoFrame.profileType.mValue;
        int i7 = encodedVideoFrame.codecType.mValue;
        int i10 = encodedVideoFrame.rotation;
        long j5 = encodedVideoFrame.dts;
        long j6 = encodedVideoFrame.pts;
        long j7 = encodedVideoFrame.gopIndex;
        long j10 = encodedVideoFrame.gopFrameIndex;
        long j11 = encodedVideoFrame.frameIndex;
        long j12 = encodedVideoFrame.refFrameIndex;
        int i11 = encodedVideoFrame.width;
        int i12 = encodedVideoFrame.height;
        Integer num = encodedVideoFrame.svcInfo;
        nativeOnEncodedNAL(j4, i4, encodedVideoFrame, byteBuffer, producerChainTimestamp, i5, i6, i7, i10, j5, j6, j7, j10, j11, j12, i11, i12, num != null, num == null ? 0 : num.intValue());
    }

    public synchronized void reset() {
        this.mNativeVideoEncodeDataListener = 0L;
    }
}
