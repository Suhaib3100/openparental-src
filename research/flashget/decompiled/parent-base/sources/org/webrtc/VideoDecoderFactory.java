package org.webrtc;

/* loaded from: classes9.dex */
public interface VideoDecoderFactory {
    @androidx.annotation.q0
    @CalledByNative
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    default VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }
}
