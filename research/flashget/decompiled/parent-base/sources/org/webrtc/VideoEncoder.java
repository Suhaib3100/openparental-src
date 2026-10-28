package org.webrtc;

import org.webrtc.EncodedImage;

/* loaded from: classes9.dex */
public interface VideoEncoder {

    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        @CalledByNative("BitrateAllocation")
        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int i4 = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i5 : iArr) {
                    i4 += i5;
                }
            }
            return i4;
        }
    }

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class Capabilities {
        public final boolean lossNotification;

        @CalledByNative("Capabilities")
        public Capabilities(boolean z4) {
            this.lossNotification = z4;
        }
    }

    public static class CodecSpecificInfo {
    }

    public static class CodecSpecificInfoAV1 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        @CalledByNative("EncodeInfo")
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public static class EncoderInfo {
        public final boolean applyAlignmentToAllSimulcastLayers;
        public final int requestedResolutionAlignment;

        public EncoderInfo(int i4, boolean z4) {
            this.requestedResolutionAlignment = i4;
            this.applyAlignmentToAllSimulcastLayers = z4;
        }

        @CalledByNative("EncoderInfo")
        public boolean getApplyAlignmentToAllSimulcastLayers() {
            return this.applyAlignmentToAllSimulcastLayers;
        }

        @CalledByNative("EncoderInfo")
        public int getRequestedResolutionAlignment() {
            return this.requestedResolutionAlignment;
        }
    }

    public static class RateControlParameters {
        public final BitrateAllocation bitrate;
        public final double framerateFps;

        @CalledByNative("RateControlParameters")
        public RateControlParameters(BitrateAllocation bitrateAllocation, double d5) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d5;
        }
    }

    public static class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i4, int i5, int i6, int i7) {
            this.frameSizePixels = i4;
            this.minStartBitrateBps = i5;
            this.minBitrateBps = i6;
            this.maxBitrateBps = i7;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    public static class Settings {
        public final boolean automaticResizeOn;
        public final Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @Deprecated
        public Settings(int i4, int i5, int i6, int i7, int i10, int i11, boolean z4) {
            this(i4, i5, i6, i7, i10, i11, z4, new Capabilities(false));
        }

        @CalledByNative("Settings")
        public Settings(int i4, int i5, int i6, int i7, int i10, int i11, boolean z4, Capabilities capabilities) {
            this.numberOfCores = i4;
            this.width = i5;
            this.height = i6;
            this.startBitrate = i7;
            this.maxFramerate = i10;
            this.numberOfSimulcastStreams = i11;
            this.automaticResizeOn = z4;
            this.capabilities = capabilities;
        }
    }

    @CalledByNative
    default long createNativeVideoEncoder() {
        return 0L;
    }

    @CalledByNative
    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    @CalledByNative
    default EncoderInfo getEncoderInfo() {
        return new EncoderInfo(1, false);
    }

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    default ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return new ResolutionBitrateLimits[0];
    }

    @CalledByNative
    ScalingSettings getScalingSettings();

    @CalledByNative
    VideoCodecStatus initEncode(Settings settings, Callback callback);

    @CalledByNative
    default boolean isHardwareEncoder() {
        return true;
    }

    @CalledByNative
    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i4);

    @CalledByNative
    default VideoCodecStatus setRates(RateControlParameters rateControlParameters) {
        return setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
    }

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();

        @androidx.annotation.q0
        public final Integer high;

        @androidx.annotation.q0
        public final Integer low;
        public final boolean on;

        public ScalingSettings(int i4, int i5) {
            this.on = true;
            this.low = Integer.valueOf(i4);
            this.high = Integer.valueOf(i5);
        }

        public String toString() {
            if (!this.on) {
                return "OFF";
            }
            return "[ " + this.low + ", " + this.high + " ]";
        }

        private ScalingSettings() {
            this.on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z4) {
            this.on = z4;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z4, int i4, int i5) {
            this.on = z4;
            this.low = Integer.valueOf(i4);
            this.high = Integer.valueOf(i5);
        }
    }
}
