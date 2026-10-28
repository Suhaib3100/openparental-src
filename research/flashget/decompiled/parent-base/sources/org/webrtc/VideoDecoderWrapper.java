package org.webrtc;

import org.webrtc.VideoDecoder;

/* loaded from: classes9.dex */
class VideoDecoderWrapper {
    VideoDecoderWrapper() {
    }

    @CalledByNative
    static VideoDecoder.Callback createDecoderCallback(final long j4) {
        return new VideoDecoder.Callback() { // from class: org.webrtc.d1
            @Override // org.webrtc.VideoDecoder.Callback
            public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
                VideoDecoderWrapper.nativeOnDecodedFrame(j4, videoFrame, num, num2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j4, VideoFrame videoFrame, Integer num, Integer num2);
}
