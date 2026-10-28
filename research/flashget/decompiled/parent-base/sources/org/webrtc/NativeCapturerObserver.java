package org.webrtc;

import android.graphics.Bitmap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;

/* loaded from: classes9.dex */
class NativeCapturerObserver implements CapturerObserver {
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    @CalledByNative
    public NativeCapturerObserver(long j4) {
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j4);
    }

    @Override // org.webrtc.CapturerObserver
    public void onBitmapCaptured(Bitmap bitmap) {
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z4) {
        this.nativeAndroidVideoTrackSource.setState(z4);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        VideoProcessor.FrameAdaptationParameters adaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
        if (adaptFrame == null) {
            return;
        }
        VideoFrame.Buffer cropAndScale = videoFrame.getBuffer().cropAndScale(adaptFrame.cropX, adaptFrame.cropY, adaptFrame.cropWidth, adaptFrame.cropHeight, adaptFrame.scaleWidth, adaptFrame.scaleHeight);
        this.nativeAndroidVideoTrackSource.onFrameCaptured(new VideoFrame(cropAndScale, videoFrame.getRotation(), adaptFrame.timestampNs));
        cropAndScale.release();
    }
}
