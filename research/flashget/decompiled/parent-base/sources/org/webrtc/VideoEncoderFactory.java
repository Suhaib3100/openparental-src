package org.webrtc;

/* loaded from: classes9.dex */
public interface VideoEncoderFactory {

    public interface VideoEncoderSelector {
        @androidx.annotation.q0
        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onAvailableBitrate(int i4);

        @CalledByNative("VideoEncoderSelector")
        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        @androidx.annotation.q0
        @CalledByNative("VideoEncoderSelector")
        VideoCodecInfo onEncoderBroken();

        @androidx.annotation.q0
        @CalledByNative("VideoEncoderSelector")
        default VideoCodecInfo onResolutionChange(int i4, int i5) {
            return null;
        }
    }

    @androidx.annotation.q0
    @CalledByNative
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    default VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    @CalledByNative
    default VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();
}
