package org.webrtc;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.view.C1434k;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

@TargetApi(19)
@Deprecated
/* loaded from: classes9.dex */
public class MediaCodecVideoEncoder {
    private static final int BITRATE_ADJUSTMENT_FPS = 30;
    private static final double BITRATE_CORRECTION_MAX_SCALE = 4.0d;
    private static final double BITRATE_CORRECTION_SEC = 3.0d;
    private static final int BITRATE_CORRECTION_STEPS = 20;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int DEQUEUE_TIMEOUT = 0;
    private static final String[] H264_HW_EXCEPTION_MODELS;
    private static final int MAXIMUM_INITIAL_FPS = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final int VIDEO_AVCLevel3 = 256;
    private static final int VIDEO_AVCProfileHigh = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private static int codecErrors;

    @androidx.annotation.q0
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HighProfileHwProperties;
    private static final MediaCodecProperties exynosH264HwProperties;
    private static final MediaCodecProperties exynosVp8HwProperties;
    private static final MediaCodecProperties exynosVp9HwProperties;
    private static final MediaCodecProperties[] h264HighProfileHwList;
    private static final MediaCodecProperties intelVp8HwProperties;
    private static final MediaCodecProperties mediatekH264HwProperties;
    private static final MediaCodecProperties qcomH264HwProperties;
    private static final MediaCodecProperties qcomVp8HwProperties;
    private static final MediaCodecProperties qcomVp9HwProperties;

    @androidx.annotation.q0
    private static MediaCodecVideoEncoder runningInstance;

    @androidx.annotation.q0
    private static EglBase staticEglBase;
    private static final int[] supportedColorList;
    private static final int[] supportedSurfaceColorList;
    private static final MediaCodecProperties[] vp9HwList;
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private double bitrateObservationTimeMs;
    private int colorFormat;

    @androidx.annotation.q0
    private ByteBuffer configData;

    @androidx.annotation.q0
    private GlRectDrawer drawer;

    @androidx.annotation.q0
    private EglBase14 eglBase;
    private long forcedKeyFrameMs;
    private int height;

    @androidx.annotation.q0
    private Surface inputSurface;
    private long lastKeyFrameMs;

    @androidx.annotation.q0
    private MediaCodec mediaCodec;

    @androidx.annotation.q0
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int profile;
    private int targetBitrateBps;
    private int targetFps;
    private int type;
    private int width;
    private static final String VP9_MIME_TYPE = ProtectedSandApp.s("ꒅ\u0001");
    private static final String TAG = ProtectedSandApp.s("ꒆ\u0001");
    private static final String H264_MIME_TYPE = ProtectedSandApp.s("ꒇ\u0001");
    private static final String VP8_MIME_TYPE = ProtectedSandApp.s("ꒈ\u0001");
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꒆ\u0001"));
    private static Set<String> hwEncoderDisabledTypes = new HashSet();

    /* renamed from: org.webrtc.MediaCodecVideoEncoder$1CaughtException, reason: invalid class name */
    class C1CaughtException {

        /* renamed from: e, reason: collision with root package name */
        Exception f88473e;

        C1CaughtException() {
        }
    }

    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    public static class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;

        public EncoderProperties(String str, int i4, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecName = str;
            this.colorFormat = i4;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    public enum H264Profile {
        CONSTRAINED_BASELINE(0),
        BASELINE(1),
        MAIN(2),
        CONSTRAINED_HIGH(3),
        HIGH(4);

        private final int value;

        H264Profile(int i4) {
            this.value = i4;
        }

        public int getValue() {
            return this.value;
        }
    }

    static class HwEncoderFactory implements VideoEncoderFactory {
        private final VideoCodecInfo[] supportedHardwareCodecs = getSupportedHardwareCodecs();

        HwEncoderFactory() {
        }

        private static VideoCodecInfo[] getSupportedHardwareCodecs() {
            ArrayList arrayList = new ArrayList();
            if (MediaCodecVideoEncoder.isVp8HwSupported()) {
                MediaCodecVideoEncoder.logger.debug("VP8 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
            }
            if (MediaCodecVideoEncoder.isVp9HwSupported()) {
                MediaCodecVideoEncoder.logger.debug("VP9 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isH264HighProfileHwSupported()) {
                MediaCodecVideoEncoder.logger.debug("H.264 High Profile HW Encoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC);
            }
            if (MediaCodecVideoEncoder.isH264HwSupported()) {
                MediaCodecVideoEncoder.logger.debug("H.264 HW Encoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_BASELINE_PROFILE_CODEC);
            }
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
        }

        private static boolean isCodecSupported(VideoCodecInfo[] videoCodecInfoArr, VideoCodecInfo videoCodecInfo) {
            for (VideoCodecInfo videoCodecInfo2 : videoCodecInfoArr) {
                if (isSameCodec(videoCodecInfo2, videoCodecInfo)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isSameCodec(VideoCodecInfo videoCodecInfo, VideoCodecInfo videoCodecInfo2) {
            if (!videoCodecInfo.name.equalsIgnoreCase(videoCodecInfo2.name)) {
                return false;
            }
            if (videoCodecInfo.name.equalsIgnoreCase("H264")) {
                return H264Utils.isSameH264Profile(videoCodecInfo.params, videoCodecInfo2.params);
            }
            return true;
        }

        @Override // org.webrtc.VideoEncoderFactory
        @androidx.annotation.q0
        public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
            if (!isCodecSupported(this.supportedHardwareCodecs, videoCodecInfo)) {
                com.flashget.commonx.billing.ui.v.a(new StringBuilder("No HW video encoder for codec "), videoCodecInfo.name, MediaCodecVideoEncoder.logger);
                return null;
            }
            MediaCodecVideoEncoder.logger.debug("Create HW video encoder for " + videoCodecInfo.name);
            return new WrappedNativeVideoEncoder() { // from class: org.webrtc.MediaCodecVideoEncoder.HwEncoderFactory.1
                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public long createNativeVideoEncoder() {
                    return MediaCodecVideoEncoder.nativeCreateEncoder(videoCodecInfo, MediaCodecVideoEncoder.staticEglBase instanceof EglBase14);
                }

                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public boolean isHardwareEncoder() {
                    return true;
                }
            };
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            return this.supportedHardwareCodecs;
        }
    }

    private static class MediaCodecProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecPrefix;
        public final int minSdk;

        MediaCodecProperties(String str, int i4, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecPrefix = str;
            this.minSdk = i4;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i4);
    }

    static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;

        public OutputBufferInfo(int i4, ByteBuffer byteBuffer, boolean z4, long j4) {
            this.index = i4;
            this.buffer = byteBuffer;
            this.isKeyFrame = z4;
            this.presentationTimestampUs = j4;
        }

        @CalledByNative("OutputBufferInfo")
        ByteBuffer getBuffer() {
            return this.buffer;
        }

        @CalledByNative("OutputBufferInfo")
        int getIndex() {
            return this.index;
        }

        @CalledByNative("OutputBufferInfo")
        long getPresentationTimestampUs() {
            return this.presentationTimestampUs;
        }

        @CalledByNative("OutputBufferInfo")
        boolean isKeyFrame() {
            return this.isKeyFrame;
        }
    }

    static {
        BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
        String s4 = ProtectedSandApp.s("ꒉ\u0001");
        qcomVp8HwProperties = new MediaCodecProperties(s4, 19, bitrateAdjustmentType);
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.DYNAMIC_ADJUSTMENT;
        String s5 = ProtectedSandApp.s("ꒊ\u0001");
        exynosVp8HwProperties = new MediaCodecProperties(s5, 23, bitrateAdjustmentType2);
        intelVp8HwProperties = new MediaCodecProperties(ProtectedSandApp.s("ꒋ\u0001"), 21, bitrateAdjustmentType);
        MediaCodecProperties mediaCodecProperties = new MediaCodecProperties(s4, 24, bitrateAdjustmentType);
        qcomVp9HwProperties = mediaCodecProperties;
        BitrateAdjustmentType bitrateAdjustmentType3 = BitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
        MediaCodecProperties mediaCodecProperties2 = new MediaCodecProperties(s5, 24, bitrateAdjustmentType3);
        exynosVp9HwProperties = mediaCodecProperties2;
        vp9HwList = new MediaCodecProperties[]{mediaCodecProperties, mediaCodecProperties2};
        qcomH264HwProperties = new MediaCodecProperties(s4, 19, bitrateAdjustmentType);
        exynosH264HwProperties = new MediaCodecProperties(s5, 21, bitrateAdjustmentType3);
        mediatekH264HwProperties = new MediaCodecProperties(ProtectedSandApp.s("ꒌ\u0001"), 27, bitrateAdjustmentType3);
        MediaCodecProperties mediaCodecProperties3 = new MediaCodecProperties(s5, 23, bitrateAdjustmentType3);
        exynosH264HighProfileHwProperties = mediaCodecProperties3;
        h264HighProfileHwList = new MediaCodecProperties[]{mediaCodecProperties3};
        H264_HW_EXCEPTION_MODELS = new String[]{ProtectedSandApp.s("\ua48f\u0001"), ProtectedSandApp.s("\ua48d\u0001"), ProtectedSandApp.s("\ua48e\u0001")};
        supportedColorList = new int[]{19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
        supportedSurfaceColorList = new int[]{2130708361};
    }

    @CalledByNative
    MediaCodecVideoEncoder() {
    }

    private void checkOnMediaCodecThread() {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        throw new RuntimeException(ProtectedSandApp.s("꒐\u0001") + this.mediaCodecThread + ProtectedSandApp.s("꒑\u0001") + Thread.currentThread());
    }

    @androidx.annotation.q0
    static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static VideoEncoderFactory createFactory() {
        return new DefaultVideoEncoderFactory(new HwEncoderFactory());
    }

    public static void disableH264HwCodec() {
        logger.warn(ProtectedSandApp.s("꒒\u0001"));
        hwEncoderDisabledTypes.add(ProtectedSandApp.s("ꒇ\u0001"));
    }

    public static void disableVp8HwCodec() {
        logger.warn(ProtectedSandApp.s("꒓\u0001"));
        hwEncoderDisabledTypes.add(ProtectedSandApp.s("ꒈ\u0001"));
    }

    public static void disableVp9HwCodec() {
        logger.warn(ProtectedSandApp.s("꒔\u0001"));
        hwEncoderDisabledTypes.add(ProtectedSandApp.s("ꒅ\u0001"));
    }

    public static void disposeEglContext() {
        EglBase eglBase = staticEglBase;
        if (eglBase != null) {
            eglBase.release();
            staticEglBase = null;
        }
    }

    @androidx.annotation.q0
    private static EncoderProperties findHwEncoder(String str, MediaCodecProperties[] mediaCodecPropertiesArr, int[] iArr) {
        MediaCodecInfo mediaCodecInfo;
        String str2;
        boolean z4;
        if (str.equals(ProtectedSandApp.s("ꒇ\u0001"))) {
            List asList = Arrays.asList(H264_HW_EXCEPTION_MODELS);
            String str3 = Build.MODEL;
            if (asList.contains(str3)) {
                logger.warn(ProtectedSandApp.s("꒕\u0001") + str3 + ProtectedSandApp.s("꒖\u0001"));
                return null;
            }
        }
        for (int i4 = 0; i4 < MediaCodecList.getCodecCount(); i4++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i4);
            } catch (IllegalArgumentException e4) {
                logger.error(ProtectedSandApp.s("꒗\u0001"), e4);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        str2 = null;
                        break;
                    }
                    if (supportedTypes[i5].equals(str)) {
                        str2 = mediaCodecInfo.getName();
                        break;
                    }
                    i5++;
                }
                if (str2 == null) {
                    continue;
                } else {
                    logger.debug(ProtectedSandApp.s("꒘\u0001").concat(str2));
                    BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
                    int length2 = mediaCodecPropertiesArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            z4 = false;
                            break;
                        }
                        MediaCodecProperties mediaCodecProperties = mediaCodecPropertiesArr[i6];
                        if (str2.startsWith(mediaCodecProperties.codecPrefix)) {
                            int i7 = Build.VERSION.SDK_INT;
                            int i10 = mediaCodecProperties.minSdk;
                            String s4 = ProtectedSandApp.s("꒙\u0001");
                            if (i7 < i10) {
                                logger.debug(s4 + str2 + ProtectedSandApp.s("꒚\u0001") + i7);
                            } else {
                                BitrateAdjustmentType bitrateAdjustmentType2 = mediaCodecProperties.bitrateAdjustmentType;
                                if (bitrateAdjustmentType2 != BitrateAdjustmentType.NO_ADJUSTMENT) {
                                    logger.debug(s4 + str2 + ProtectedSandApp.s("꒛\u0001") + bitrateAdjustmentType2);
                                    bitrateAdjustmentType = bitrateAdjustmentType2;
                                }
                                z4 = true;
                            }
                        }
                        i6++;
                    }
                    if (z4) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            for (int i11 : capabilitiesForType.colorFormats) {
                                logger.debug(ProtectedSandApp.s("꒜\u0001") + Integer.toHexString(i11));
                            }
                            for (int i12 : iArr) {
                                for (int i13 : capabilitiesForType.colorFormats) {
                                    if (i13 == i12) {
                                        Logger logger2 = logger;
                                        StringBuilder a5 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("꒝\u0001"), str, ProtectedSandApp.s("꒞\u0001"), str2, ProtectedSandApp.s("꒟\u0001"));
                                        a5.append(Integer.toHexString(i13));
                                        a5.append(ProtectedSandApp.s("꒠\u0001"));
                                        a5.append(bitrateAdjustmentType);
                                        logger2.debug(a5.toString());
                                        return new EncoderProperties(str2, i13, bitrateAdjustmentType);
                                    }
                                }
                            }
                        } catch (IllegalArgumentException e5) {
                            logger.error(ProtectedSandApp.s("꒡\u0001"), e5);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private double getBitrateScale(int i4) {
        return Math.pow(BITRATE_CORRECTION_MAX_SCALE, i4 / 20.0d);
    }

    @androidx.annotation.q0
    static EglBase.Context getEglContext() {
        EglBase eglBase = staticEglBase;
        if (eglBase == null) {
            return null;
        }
        return eglBase.getEglBaseContext();
    }

    private static final MediaCodecProperties[] h264HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomH264HwProperties);
        arrayList.add(exynosH264HwProperties);
        if (PeerConnectionFactory.fieldTrialsFindFullName(ProtectedSandApp.s("꒢\u0001")).equals(ProtectedSandApp.s("꒣\u0001"))) {
            arrayList.add(mediatekH264HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    public static boolean isH264HighProfileHwSupported() {
        Set<String> set = hwEncoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꒇ\u0001");
        return (set.contains(s4) || findHwEncoder(s4, h264HighProfileHwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupported() {
        Set<String> set = hwEncoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꒇ\u0001");
        return (set.contains(s4) || findHwEncoder(s4, h264HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        Set<String> set = hwEncoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꒇ\u0001");
        return (set.contains(s4) || findHwEncoder(s4, h264HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    @CalledByNative
    static boolean isTextureBuffer(VideoFrame.Buffer buffer) {
        return buffer instanceof VideoFrame.TextureBuffer;
    }

    public static boolean isVp8HwSupported() {
        Set<String> set = hwEncoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꒈ\u0001");
        return (set.contains(s4) || findHwEncoder(s4, vp8HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        Set<String> set = hwEncoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꒈ\u0001");
        return (set.contains(s4) || findHwEncoder(s4, vp8HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        Set<String> set = hwEncoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꒅ\u0001");
        return (set.contains(s4) || findHwEncoder(s4, vp9HwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        Set<String> set = hwEncoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꒅ\u0001");
        return (set.contains(s4) || findHwEncoder(s4, vp9HwList, supportedSurfaceColorList) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateEncoder(VideoCodecInfo videoCodecInfo, boolean z4);

    private static native void nativeFillInputBuffer(long j4, int i4, ByteBuffer byteBuffer, int i5, ByteBuffer byteBuffer2, int i6, ByteBuffer byteBuffer3, int i7);

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoEncoder mediaCodecVideoEncoder = runningInstance;
        if (mediaCodecVideoEncoder == null || (thread = mediaCodecVideoEncoder.mediaCodecThread) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace.length > 0) {
            logger.debug(ProtectedSandApp.s("꒤\u0001"));
            for (StackTraceElement stackTraceElement : stackTrace) {
                logger.debug(stackTraceElement.toString());
            }
        }
    }

    private void reportEncodedFrame(int i4) {
        int i5 = this.targetFps;
        if (i5 == 0 || this.bitrateAdjustmentType != BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            return;
        }
        double d5 = (i4 - (this.targetBitrateBps / (i5 * 8.0d))) + this.bitrateAccumulator;
        this.bitrateAccumulator = d5;
        this.bitrateObservationTimeMs = (1000.0d / i5) + this.bitrateObservationTimeMs;
        double d6 = this.bitrateAccumulatorMax * BITRATE_CORRECTION_SEC;
        double min = Math.min(d5, d6);
        this.bitrateAccumulator = min;
        this.bitrateAccumulator = Math.max(min, -d6);
        if (this.bitrateObservationTimeMs > 3000.0d) {
            Logger logger2 = logger;
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("꒥\u0001"));
            sb.append((int) this.bitrateAccumulator);
            sb.append(ProtectedSandApp.s("꒦\u0001"));
            sb.append((int) this.bitrateAccumulatorMax);
            sb.append(ProtectedSandApp.s("꒧\u0001"));
            com.flashget.kid.common.requests.uploadfile.a.a(sb, this.bitrateAdjustmentScaleExp, logger2);
            double d7 = this.bitrateAccumulator;
            double d10 = this.bitrateAccumulatorMax;
            if (d7 <= d10) {
                if (d7 < (-d10)) {
                    this.bitrateAdjustmentScaleExp += (int) (((-d7) / d10) + 0.5d);
                    this.bitrateAccumulator = -d10;
                }
                this.bitrateObservationTimeMs = com.google.firebase.remoteconfig.p.f60679p;
            }
            this.bitrateAdjustmentScaleExp -= (int) ((d7 / d10) + 0.5d);
            this.bitrateAccumulator = d10;
            int min2 = Math.min(this.bitrateAdjustmentScaleExp, 20);
            this.bitrateAdjustmentScaleExp = min2;
            this.bitrateAdjustmentScaleExp = Math.max(min2, -20);
            logger2.debug(ProtectedSandApp.s("꒨\u0001") + this.bitrateAdjustmentScaleExp + ProtectedSandApp.s("꒩\u0001") + getBitrateScale(this.bitrateAdjustmentScaleExp));
            setRates(this.targetBitrateBps / 1000, this.targetFps);
            this.bitrateObservationTimeMs = com.google.firebase.remoteconfig.p.f60679p;
        }
    }

    public static void setEglContext(EglBase.Context context) {
        if (staticEglBase != null) {
            logger.warn(ProtectedSandApp.s("꒪\u0001"));
            staticEglBase.release();
        }
        staticEglBase = EglBase.create(context);
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        logger.debug(ProtectedSandApp.s("꒫\u0001"));
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    @CalledByNativeUnchecked
    private boolean setRates(int i4, int i5) {
        checkOnMediaCodecThread();
        int i6 = i4 * 1000;
        BitrateAdjustmentType bitrateAdjustmentType = this.bitrateAdjustmentType;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.DYNAMIC_ADJUSTMENT;
        if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            double d5 = i6;
            this.bitrateAccumulatorMax = d5 / 8.0d;
            int i7 = this.targetBitrateBps;
            if (i7 > 0 && i6 < i7) {
                this.bitrateAccumulator = (this.bitrateAccumulator * d5) / i7;
            }
        }
        this.targetBitrateBps = i6;
        this.targetFps = i5;
        BitrateAdjustmentType bitrateAdjustmentType3 = BitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
        String s4 = ProtectedSandApp.s("꒬\u0001");
        String s5 = ProtectedSandApp.s("꒭\u0001");
        if (bitrateAdjustmentType == bitrateAdjustmentType3 && i5 > 0) {
            i6 = (i4 * org.apache.log4j.Priority.WARN_INT) / i5;
            Logger logger2 = logger;
            StringBuilder a5 = androidx.collection.s.a(s5, i4, ProtectedSandApp.s("꒮\u0001"));
            a5.append(i6 / 1000);
            a5.append(s4);
            com.flashget.kid.common.requests.uploadfile.a.a(a5, this.targetFps, logger2);
        } else if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            Logger logger3 = logger;
            StringBuilder a6 = androidx.collection.s.a(s5, i4, s4);
            a6.append(this.targetFps);
            a6.append(ProtectedSandApp.s("꒧\u0001"));
            com.flashget.kid.common.requests.uploadfile.a.a(a6, this.bitrateAdjustmentScaleExp, logger3);
            int i10 = this.bitrateAdjustmentScaleExp;
            if (i10 != 0) {
                i6 = (int) (i6 * getBitrateScale(i10));
            }
        } else {
            com.flashget.kid.common.requests.uploadfile.a.a(androidx.collection.s.a(s5, i4, s4), this.targetFps, logger);
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(ProtectedSandApp.s("꒯\u0001"), i6);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException e4) {
            logger.error(ProtectedSandApp.s("꒰\u0001"), e4);
            return false;
        }
    }

    @androidx.annotation.q0
    public static EncoderProperties vp8HwEncoderProperties() {
        Set<String> set = hwEncoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꒈ\u0001");
        if (set.contains(s4)) {
            return null;
        }
        return findHwEncoder(s4, vp8HwList(), supportedColorList);
    }

    private static MediaCodecProperties[] vp8HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomVp8HwProperties);
        arrayList.add(exynosVp8HwProperties);
        if (PeerConnectionFactory.fieldTrialsFindFullName(ProtectedSandApp.s("꒱\u0001")).equals(ProtectedSandApp.s("꒣\u0001"))) {
            arrayList.add(intelVp8HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void checkKeyFrameRequired(boolean r7, long r8) {
        /*
            r6 = this;
            r0 = 500(0x1f4, double:2.47E-321)
            long r8 = r8 + r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r0
            long r0 = r6.lastKeyFrameMs
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L10
            r6.lastKeyFrameMs = r8
        L10:
            r0 = 0
            if (r7 != 0) goto L22
            long r4 = r6.forcedKeyFrameMs
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L22
            long r1 = r6.lastKeyFrameMs
            long r1 = r1 + r4
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = r0
        L23:
            if (r7 != 0) goto L27
            if (r1 == 0) goto L55
        L27:
            if (r7 == 0) goto L35
            org.apache.log4j.Logger r7 = org.webrtc.MediaCodecVideoEncoder.logger
            java.lang.String r1 = "꒲\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r7.debug(r1)
            goto L40
        L35:
            org.apache.log4j.Logger r7 = org.webrtc.MediaCodecVideoEncoder.logger
            java.lang.String r1 = "꒳\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r7.debug(r1)
        L40:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r1 = "꒴\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r7.putInt(r1, r0)
            android.media.MediaCodec r0 = r6.mediaCodec
            r0.setParameters(r7)
            r6.lastKeyFrameMs = r8
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.checkKeyFrameRequired(boolean, long):void");
    }

    @CalledByNativeUnchecked
    int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0L);
        } catch (IllegalStateException e4) {
            logger.error(ProtectedSandApp.s("꒵\u0001"), e4);
            return -2;
        }
    }

    @androidx.annotation.q0
    @CalledByNativeUnchecked
    OutputBufferInfo dequeueOutputBuffer() {
        String s4 = ProtectedSandApp.s("꒶\u0001");
        checkOnMediaCodecThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer >= 0 && (bufferInfo.flags & 2) != 0) {
                logger.debug(s4 + bufferInfo.offset + ProtectedSandApp.s("꒷\u0001") + bufferInfo.size);
                this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                this.outputBuffers[dequeueOutputBuffer].position(bufferInfo.offset);
                this.outputBuffers[dequeueOutputBuffer].limit(bufferInfo.offset + bufferInfo.size);
                this.configData.put(this.outputBuffers[dequeueOutputBuffer]);
                String str = "";
                int i4 = 0;
                while (true) {
                    int i5 = bufferInfo.size;
                    if (i5 >= 8) {
                        i5 = 8;
                    }
                    if (i4 >= i5) {
                        break;
                    }
                    str = str + Integer.toHexString(this.configData.get(i4) & 255) + ProtectedSandApp.s("꒸\u0001");
                    i4++;
                }
                logger.debug(str);
                this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            }
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -3) {
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    return dequeueOutputBuffer();
                }
                if (dequeueOutputBuffer == -2) {
                    return dequeueOutputBuffer();
                }
                if (dequeueOutputBuffer == -1) {
                    return null;
                }
                throw new RuntimeException(ProtectedSandApp.s("꒽\u0001") + dequeueOutputBuffer);
            }
            ByteBuffer duplicate = this.outputBuffers[dequeueOutputBuffer].duplicate();
            duplicate.position(bufferInfo.offset);
            duplicate.limit(bufferInfo.offset + bufferInfo.size);
            reportEncodedFrame(bufferInfo.size);
            boolean z4 = true;
            if ((bufferInfo.flags & 1) == 0) {
                z4 = false;
            }
            if (z4) {
                logger.debug(ProtectedSandApp.s("꒹\u0001"));
            }
            if (!z4 || this.type != 4) {
                return new OutputBufferInfo(dequeueOutputBuffer, duplicate.slice(), z4, bufferInfo.presentationTimeUs);
            }
            logger.debug(ProtectedSandApp.s("꒺\u0001") + this.configData.capacity() + ProtectedSandApp.s("꒻\u0001") + bufferInfo.offset + ProtectedSandApp.s("꒼\u0001") + bufferInfo.size);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.configData.capacity() + bufferInfo.size);
            this.configData.rewind();
            allocateDirect.put(this.configData);
            allocateDirect.put(duplicate);
            allocateDirect.position(0);
            return new OutputBufferInfo(dequeueOutputBuffer, allocateDirect, z4, bufferInfo.presentationTimeUs);
        } catch (IllegalStateException e4) {
            logger.error(ProtectedSandApp.s("꒾\u0001"), e4);
            return new OutputBufferInfo(-1, null, false, -1L);
        }
    }

    @CalledByNativeUnchecked
    boolean encodeBuffer(boolean z4, int i4, int i5, long j4) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z4, j4);
            this.mediaCodec.queueInputBuffer(i4, 0, i5, j4, 0);
            return true;
        } catch (IllegalStateException e4) {
            logger.error(ProtectedSandApp.s("꒿\u0001"), e4);
            return false;
        }
    }

    @CalledByNativeUnchecked
    boolean encodeFrame(long j4, boolean z4, VideoFrame videoFrame, int i4, long j5) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z4, j5);
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (buffer instanceof VideoFrame.TextureBuffer) {
                VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
                this.eglBase.makeCurrent();
                GLES20.glClear(16384);
                GlRectDrawer glRectDrawer = this.drawer;
                Matrix matrix = new Matrix();
                int i5 = this.width;
                int i6 = this.height;
                VideoFrameDrawer.drawTexture(glRectDrawer, textureBuffer, matrix, i5, i6, 0, 0, i5, i6);
                this.eglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j5));
            } else {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                int i7 = (this.height + 1) / 2;
                ByteBuffer dataY = i420.getDataY();
                ByteBuffer dataU = i420.getDataU();
                ByteBuffer dataV = i420.getDataV();
                int strideY = i420.getStrideY();
                int strideU = i420.getStrideU();
                int strideV = i420.getStrideV();
                if (dataY.capacity() < this.height * strideY) {
                    throw new RuntimeException(ProtectedSandApp.s("꓂\u0001"));
                }
                if (dataU.capacity() < strideU * i7) {
                    throw new RuntimeException(ProtectedSandApp.s("꓁\u0001"));
                }
                if (dataV.capacity() < i7 * strideV) {
                    throw new RuntimeException(ProtectedSandApp.s("꓀\u0001"));
                }
                nativeFillInputBuffer(j4, i4, dataY, strideY, dataU, strideU, dataV, strideV);
                i420.release();
                this.mediaCodec.queueInputBuffer(i4, 0, ((this.width * this.height) * 3) / 2, j5, 0);
            }
            return true;
        } catch (RuntimeException e4) {
            logger.error(ProtectedSandApp.s("꓃\u0001"), e4);
            return false;
        }
    }

    @CalledByNative
    int getColorFormat() {
        return this.colorFormat;
    }

    @CalledByNativeUnchecked
    ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
        com.flashget.kid.common.requests.uploadfile.a.a(new StringBuilder(ProtectedSandApp.s("꓄\u0001")), inputBuffers.length, logger);
        return inputBuffers;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0245  */
    @org.webrtc.CalledByNativeUnchecked
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean initEncode(int r19, int r20, int r21, int r22, int r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.initEncode(int, int, int, int, int, int, boolean):boolean");
    }

    @CalledByNativeUnchecked
    void release() {
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꓝ\u0001"));
        checkOnMediaCodecThread();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        boolean z4 = false;
        if (this.mediaCodec != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() { // from class: org.webrtc.MediaCodecVideoEncoder.1
                @Override // java.lang.Runnable
                public void run() {
                    MediaCodecVideoEncoder.logger.debug("Java releaseEncoder on release thread");
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.stop();
                    } catch (Exception e4) {
                        MediaCodecVideoEncoder.logger.error("Media encoder stop failed", e4);
                    }
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.release();
                    } catch (Exception e5) {
                        MediaCodecVideoEncoder.logger.error("Media encoder release failed", e5);
                        c1CaughtException.f88473e = e5;
                    }
                    MediaCodecVideoEncoder.logger.debug("Java releaseEncoder on release thread done");
                    countDownLatch.countDown();
                }
            }).start();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, C1434k.f30360a)) {
                logger2.error(ProtectedSandApp.s("ꓞ\u0001"));
                z4 = true;
            }
            this.mediaCodec = null;
        }
        this.mediaCodecThread = null;
        GlRectDrawer glRectDrawer = this.drawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.drawer = null;
        }
        EglBase14 eglBase14 = this.eglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        if (!z4) {
            if (c1CaughtException.f88473e == null) {
                logger2.debug(ProtectedSandApp.s("ꓡ\u0001"));
                return;
            } else {
                RuntimeException runtimeException = new RuntimeException(c1CaughtException.f88473e);
                runtimeException.setStackTrace(ThreadUtils.concatStackTraces(c1CaughtException.f88473e.getStackTrace(), runtimeException.getStackTrace()));
                throw runtimeException;
            }
        }
        codecErrors++;
        if (errorCallback != null) {
            logger2.error(ProtectedSandApp.s("ꓟ\u0001") + codecErrors);
            errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
        }
        throw new RuntimeException(ProtectedSandApp.s("ꓠ\u0001"));
    }

    @CalledByNativeUnchecked
    boolean releaseOutputBuffer(int i4) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i4, false);
            return true;
        } catch (IllegalStateException e4) {
            logger.error(ProtectedSandApp.s("ꓢ\u0001"), e4);
            return false;
        }
    }
}
