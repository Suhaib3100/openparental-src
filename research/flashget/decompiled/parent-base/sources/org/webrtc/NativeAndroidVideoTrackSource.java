package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSource;

/* loaded from: classes9.dex */
class NativeAndroidVideoTrackSource {
    private final long nativeAndroidVideoTrackSource;

    public NativeAndroidVideoTrackSource(long j4) {
        this.nativeAndroidVideoTrackSource = j4;
    }

    @CalledByNative
    static VideoProcessor.FrameAdaptationParameters createFrameAdaptationParameters(int i4, int i5, int i6, int i7, int i10, int i11, long j4, boolean z4) {
        return new VideoProcessor.FrameAdaptationParameters(i4, i5, i6, i7, i10, i11, j4, z4);
    }

    @androidx.annotation.q0
    private static native VideoProcessor.FrameAdaptationParameters nativeAdaptFrame(long j4, int i4, int i5, int i6, long j5);

    private static native void nativeAdaptOutputFormat(long j4, int i4, int i5, @androidx.annotation.q0 Integer num, int i6, int i7, @androidx.annotation.q0 Integer num2, @androidx.annotation.q0 Integer num3);

    private static native void nativeOnFrameCaptured(long j4, int i4, long j5, VideoFrame.Buffer buffer);

    private static native void nativeSetIsScreencast(long j4, boolean z4);

    private static native void nativeSetState(long j4, boolean z4);

    @androidx.annotation.q0
    public VideoProcessor.FrameAdaptationParameters adaptFrame(VideoFrame videoFrame) {
        return nativeAdaptFrame(this.nativeAndroidVideoTrackSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs());
    }

    public void adaptOutputFormat(VideoSource.AspectRatio aspectRatio, @androidx.annotation.q0 Integer num, VideoSource.AspectRatio aspectRatio2, @androidx.annotation.q0 Integer num2, @androidx.annotation.q0 Integer num3) {
        nativeAdaptOutputFormat(this.nativeAndroidVideoTrackSource, aspectRatio.width, aspectRatio.height, num, aspectRatio2.width, aspectRatio2.height, num2, num3);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeAndroidVideoTrackSource, videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }

    public void setIsScreencast(boolean z4) {
        nativeSetIsScreencast(this.nativeAndroidVideoTrackSource, z4);
    }

    public void setState(boolean z4) {
        nativeSetState(this.nativeAndroidVideoTrackSource, z4);
    }
}
