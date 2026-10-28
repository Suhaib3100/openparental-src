package org.webrtc;

import com.tencent.rtmp.TXLivePushConfig;
import org.apache.log4j.Logger;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
public interface VideoProcessor extends CapturerObserver {
    public static final Logger logger = Logger.getLogger("VideoProcessor");

    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public int scaleHeight;
        public int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i4, int i5, int i6, int i7, int i10, int i11, long j4, boolean z4) {
            this.cropX = i4;
            this.cropY = i5;
            this.cropWidth = i6;
            this.cropHeight = i7;
            this.scaleWidth = i10;
            this.scaleHeight = i11;
            this.timestampNs = j4;
            this.drop = z4;
        }
    }

    @androidx.annotation.q0
    static VideoFrame applyFrameAdaptationParameters(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        if (videoFrame.isScreenShare()) {
            if (videoFrame.getVideoMode() == VideoFrame.VideoQualityMode.MODE_RESOLUTION) {
                if (videoFrame.getRotation() == 0 || videoFrame.getRotation() == 180) {
                    frameAdaptationParameters.scaleWidth = videoFrame.getRotatedWidth();
                    frameAdaptationParameters.scaleHeight = videoFrame.getRotatedHeight();
                } else {
                    frameAdaptationParameters.scaleWidth = videoFrame.getRotatedHeight();
                    frameAdaptationParameters.scaleHeight = videoFrame.getRotatedWidth();
                }
            } else if (videoFrame.getVideoMode() == VideoFrame.VideoQualityMode.MODE_AUTO_LIMIT_MIN_LEN) {
                int i4 = (videoFrame.getDPI() <= 0 || videoFrame.getDPI() > 160) ? (videoFrame.getDPI() <= 160 || videoFrame.getDPI() > 320) ? (videoFrame.getDPI() <= 320 || videoFrame.getDPI() > 480) ? 360 : 480 : 640 : TXLivePushConfig.DEFAULT_MIN_VIDEO_BITRATE;
                int i5 = frameAdaptationParameters.scaleWidth;
                int i6 = frameAdaptationParameters.scaleHeight;
                if (i5 <= i6) {
                    i6 = i5;
                }
                if (i6 < i4) {
                    float f4 = i4 / i6;
                    frameAdaptationParameters.scaleWidth = Math.round(i5 * f4);
                    int round = Math.round(frameAdaptationParameters.scaleHeight * f4);
                    frameAdaptationParameters.scaleHeight = round;
                    int i7 = frameAdaptationParameters.scaleWidth;
                    if (i7 % 2 != 0) {
                        frameAdaptationParameters.scaleWidth = i7 + 1;
                    }
                    if (round % 2 != 0) {
                        frameAdaptationParameters.scaleHeight = round + 1;
                    }
                }
            }
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }

    default void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame applyFrameAdaptationParameters = applyFrameAdaptationParameters(videoFrame, frameAdaptationParameters);
        if (applyFrameAdaptationParameters != null) {
            onFrameCaptured(applyFrameAdaptationParameters);
            applyFrameAdaptationParameters.release();
        }
    }

    void setSink(@androidx.annotation.q0 VideoSink videoSink);
}
