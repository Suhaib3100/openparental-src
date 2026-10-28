package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import androidx.view.C1434k;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.apache.log4j.Logger;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

@Deprecated
/* loaded from: classes9.dex */
public class MediaCodecVideoDecoder {
    private static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    private static final long MAX_DECODE_TIME_MS = 200;
    private static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static int codecErrors;

    @androidx.annotation.q0
    private static EglBase eglBase;

    @androidx.annotation.q0
    private static MediaCodecVideoDecoderErrorCallback errorCallback;

    @androidx.annotation.q0
    private static MediaCodecVideoDecoder runningInstance;
    private int colorFormat;
    private final Queue<TimeStamps> decodeStartTimeMs = new ArrayDeque();
    private final Queue<DecodedOutputBuffer> dequeuedSurfaceOutputBuffers = new ArrayDeque();
    private int droppedFrames;
    private boolean hasDecodedFirstFrame;
    private int height;
    private ByteBuffer[] inputBuffers;

    @androidx.annotation.q0
    private MediaCodec mediaCodec;

    @androidx.annotation.q0
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;

    @androidx.annotation.q0
    private Surface surface;

    @androidx.annotation.q0
    private TextureListener textureListener;
    private int width;
    private static final String FORMAT_KEY_CROP_TOP = ProtectedSandApp.s("ꐹ\u0001");
    private static final String VP9_MIME_TYPE = ProtectedSandApp.s("ꐺ\u0001");
    private static final String supportedExynosH264HighProfileHwCodecPrefix = ProtectedSandApp.s("ꐻ\u0001");
    private static final String FORMAT_KEY_CROP_BOTTOM = ProtectedSandApp.s("ꐼ\u0001");
    private static final String FORMAT_KEY_CROP_RIGHT = ProtectedSandApp.s("ꐽ\u0001");
    private static final String FORMAT_KEY_CROP_LEFT = ProtectedSandApp.s("ꐾ\u0001");
    private static final String supportedQcomH264HighProfileHwCodecPrefix = ProtectedSandApp.s("ꐿ\u0001");
    private static final String FORMAT_KEY_SLICE_HEIGHT = ProtectedSandApp.s("ꑀ\u0001");
    private static final String FORMAT_KEY_STRIDE = ProtectedSandApp.s("ꑁ\u0001");
    private static final String TAG = ProtectedSandApp.s("ꑂ\u0001");
    private static final String supportedMediaTekH264HighProfileHwCodecPrefix = ProtectedSandApp.s("ꑃ\u0001");
    private static final String H264_MIME_TYPE = ProtectedSandApp.s("ꑄ\u0001");
    private static final String VP8_MIME_TYPE = ProtectedSandApp.s("ꑅ\u0001");
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꑂ\u0001"));
    private static Set<String> hwDecoderDisabledTypes = new HashSet();
    private static final String[] supportedVp9HwCodecPrefixes = {ProtectedSandApp.s("ꐿ\u0001"), ProtectedSandApp.s("ꐻ\u0001")};
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final List<Integer> supportedColorList = Arrays.asList(19, 21, 2141391872, Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka), Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka), Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka), Integer.valueOf(COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m));

    private static class DecodedOutputBuffer {
        private final long decodeTimeMs;
        private final long endDecodeTimeMs;
        private final int index;
        private final long ntpTimeStampMs;
        private final int offset;
        private final long presentationTimeStampMs;
        private final int size;
        private final long timeStampMs;

        public DecodedOutputBuffer(int i4, int i5, int i6, long j4, long j5, long j6, long j7, long j10) {
            this.index = i4;
            this.offset = i5;
            this.size = i6;
            this.presentationTimeStampMs = j4;
            this.timeStampMs = j5;
            this.ntpTimeStampMs = j6;
            this.decodeTimeMs = j7;
            this.endDecodeTimeMs = j10;
        }

        @CalledByNative("DecodedOutputBuffer")
        long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        @CalledByNative("DecodedOutputBuffer")
        int getIndex() {
            return this.index;
        }

        @CalledByNative("DecodedOutputBuffer")
        long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        @CalledByNative("DecodedOutputBuffer")
        int getOffset() {
            return this.offset;
        }

        @CalledByNative("DecodedOutputBuffer")
        long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        @CalledByNative("DecodedOutputBuffer")
        int getSize() {
            return this.size;
        }

        @CalledByNative("DecodedOutputBuffer")
        long getTimestampMs() {
            return this.timeStampMs;
        }
    }

    private static class DecodedTextureBuffer {
        private final long decodeTimeMs;
        private final long frameDelayMs;
        private final long ntpTimeStampMs;
        private final long presentationTimeStampMs;
        private final long timeStampMs;
        private final VideoFrame.Buffer videoFrameBuffer;

        public DecodedTextureBuffer(VideoFrame.Buffer buffer, long j4, long j5, long j6, long j7, long j10) {
            this.videoFrameBuffer = buffer;
            this.presentationTimeStampMs = j4;
            this.timeStampMs = j5;
            this.ntpTimeStampMs = j6;
            this.decodeTimeMs = j7;
            this.frameDelayMs = j10;
        }

        @CalledByNative("DecodedTextureBuffer")
        long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        long getFrameDelayMs() {
            return this.frameDelayMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        long getTimeStampMs() {
            return this.timeStampMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        VideoFrame.Buffer getVideoFrameBuffer() {
            return this.videoFrameBuffer;
        }
    }

    private static class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i4) {
            this.codecName = str;
            this.colorFormat = i4;
        }
    }

    static class HwDecoderFactory implements VideoDecoderFactory {
        private final VideoCodecInfo[] supportedHardwareCodecs = getSupportedHardwareCodecs();

        HwDecoderFactory() {
        }

        private static VideoCodecInfo[] getSupportedHardwareCodecs() {
            ArrayList arrayList = new ArrayList();
            if (MediaCodecVideoDecoder.isVp8HwSupported()) {
                MediaCodecVideoDecoder.logger.debug("VP8 HW Decoder supported.");
                arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isVp9HwSupported()) {
                MediaCodecVideoDecoder.logger.debug("VP9 HW Decoder supported.");
                arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isH264HighProfileHwSupported()) {
                MediaCodecVideoDecoder.logger.debug("H.264 High Profile HW Decoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC);
            }
            if (MediaCodecVideoDecoder.isH264HwSupported()) {
                MediaCodecVideoDecoder.logger.debug("H.264 HW Decoder supported.");
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

        @Override // org.webrtc.VideoDecoderFactory
        @androidx.annotation.q0
        public VideoDecoder createDecoder(final VideoCodecInfo videoCodecInfo) {
            if (!isCodecSupported(this.supportedHardwareCodecs, videoCodecInfo)) {
                com.flashget.commonx.billing.ui.v.a(new StringBuilder("No HW video decoder for codec "), videoCodecInfo.name, MediaCodecVideoDecoder.logger);
                return null;
            }
            MediaCodecVideoDecoder.logger.debug("Create HW video decoder for " + videoCodecInfo.name);
            return new WrappedNativeVideoDecoder() { // from class: org.webrtc.MediaCodecVideoDecoder.HwDecoderFactory.1
                @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
                public long createNative(long j4) {
                    return MediaCodecVideoDecoder.nativeCreateDecoder(videoCodecInfo.name, MediaCodecVideoDecoder.useSurface());
                }
            };
        }

        @Override // org.webrtc.VideoDecoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            return this.supportedHardwareCodecs;
        }
    }

    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i4);
    }

    private class TextureListener implements VideoSink {

        @androidx.annotation.q0
        private DecodedOutputBuffer bufferToRender;
        private final Object newFrameLock = new Object();

        @androidx.annotation.q0
        private DecodedTextureBuffer renderedBuffer;
        private final SurfaceTextureHelper surfaceTextureHelper;

        public TextureListener(SurfaceTextureHelper surfaceTextureHelper) {
            this.surfaceTextureHelper = surfaceTextureHelper;
            surfaceTextureHelper.startListening(this);
        }

        public void addBufferToRender(DecodedOutputBuffer decodedOutputBuffer) {
            if (this.bufferToRender == null) {
                this.bufferToRender = decodedOutputBuffer;
            } else {
                MediaCodecVideoDecoder.logger.error("Unexpected addBufferToRender() called while waiting for a texture.");
                throw new IllegalStateException("Waiting for a texture.");
            }
        }

        @androidx.annotation.q0
        public DecodedTextureBuffer dequeueTextureBuffer(int i4) {
            DecodedTextureBuffer decodedTextureBuffer;
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer == null && i4 > 0 && isWaitingForTexture()) {
                    try {
                        this.newFrameLock.wait(i4);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                decodedTextureBuffer = this.renderedBuffer;
                this.renderedBuffer = null;
            }
            return decodedTextureBuffer;
        }

        public boolean isWaitingForTexture() {
            boolean z4;
            synchronized (this.newFrameLock) {
                z4 = this.bufferToRender != null;
            }
            return z4;
        }

        @Override // org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            synchronized (this.newFrameLock) {
                try {
                    if (this.renderedBuffer != null) {
                        MediaCodecVideoDecoder.logger.error("Unexpected onFrame() called while already holding a texture.");
                        throw new IllegalStateException("Already holding a texture.");
                    }
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    buffer.retain();
                    this.renderedBuffer = new DecodedTextureBuffer(buffer, this.bufferToRender.presentationTimeStampMs, this.bufferToRender.timeStampMs, this.bufferToRender.ntpTimeStampMs, this.bufferToRender.decodeTimeMs, SystemClock.elapsedRealtime() - this.bufferToRender.endDecodeTimeMs);
                    this.bufferToRender = null;
                    this.newFrameLock.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void release() {
            this.surfaceTextureHelper.stopListening();
            synchronized (this.newFrameLock) {
                try {
                    DecodedTextureBuffer decodedTextureBuffer = this.renderedBuffer;
                    if (decodedTextureBuffer != null) {
                        decodedTextureBuffer.getVideoFrameBuffer().release();
                        this.renderedBuffer = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.surfaceTextureHelper.dispose();
        }

        public void setSize(int i4, int i5) {
            this.surfaceTextureHelper.setTextureSize(i4, i5);
        }
    }

    private static class TimeStamps {
        private final long decodeStartTimeMs;
        private final long ntpTimeStampMs;
        private final long timeStampMs;

        public TimeStamps(long j4, long j5, long j6) {
            this.decodeStartTimeMs = j4;
            this.timeStampMs = j5;
            this.ntpTimeStampMs = j6;
        }
    }

    @CalledByNative
    MediaCodecVideoDecoder() {
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (this.dequeuedSurfaceOutputBuffers.isEmpty() || this.textureListener.isWaitingForTexture()) {
            return;
        }
        DecodedOutputBuffer remove = this.dequeuedSurfaceOutputBuffers.remove();
        this.textureListener.addBufferToRender(remove);
        this.mediaCodec.releaseOutputBuffer(remove.index, true);
    }

    private void checkOnMediaCodecThread() throws IllegalStateException {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ꑆ\u0001") + this.mediaCodecThread + ProtectedSandApp.s("ꑇ\u0001") + Thread.currentThread());
    }

    public static VideoDecoderFactory createFactory() {
        return new DefaultVideoDecoderFactory(new HwDecoderFactory());
    }

    @CalledByNativeUnchecked
    private int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(500000L);
        } catch (IllegalStateException e4) {
            logger.error(ProtectedSandApp.s("ꑈ\u0001"), e4);
            return -2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        r2 = new java.lang.StringBuilder(com.flashget.parentalcontrol.ProtectedSandApp.s("ꑏ\u0001"));
        r2.append(r22.width);
        r3 = com.flashget.parentalcontrol.ProtectedSandApp.s("ꑐ\u0001");
        r2.append(r3);
        androidx.paging.l.a(r2, r22.height, com.flashget.parentalcontrol.ProtectedSandApp.s("ꑑ\u0001"), r8, r3);
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014d, code lost:
    
        throw new java.lang.RuntimeException(r2.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d3  */
    @androidx.annotation.q0
    @org.webrtc.CalledByNativeUnchecked
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.webrtc.MediaCodecVideoDecoder.DecodedOutputBuffer dequeueOutputBuffer(int r23) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoDecoder.dequeueOutputBuffer(int):org.webrtc.MediaCodecVideoDecoder$DecodedOutputBuffer");
    }

    @androidx.annotation.q0
    @CalledByNativeUnchecked
    private DecodedTextureBuffer dequeueTextureBuffer(int i4) {
        checkOnMediaCodecThread();
        if (!useSurface()) {
            throw new IllegalStateException(ProtectedSandApp.s("ꑝ\u0001"));
        }
        DecodedOutputBuffer dequeueOutputBuffer = dequeueOutputBuffer(i4);
        if (dequeueOutputBuffer != null) {
            this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
        }
        MaybeRenderDecodedTextureBuffer();
        DecodedTextureBuffer dequeueTextureBuffer = this.textureListener.dequeueTextureBuffer(i4);
        if (dequeueTextureBuffer != null) {
            MaybeRenderDecodedTextureBuffer();
            return dequeueTextureBuffer;
        }
        if (this.dequeuedSurfaceOutputBuffers.size() < Math.min(3, this.outputBuffers.length) && (i4 <= 0 || this.dequeuedSurfaceOutputBuffers.isEmpty())) {
            return null;
        }
        this.droppedFrames++;
        DecodedOutputBuffer remove = this.dequeuedSurfaceOutputBuffers.remove();
        String s4 = ProtectedSandApp.s("ꑙ\u0001");
        if (i4 > 0) {
            logger.warn(ProtectedSandApp.s("ꑚ\u0001") + remove.presentationTimeStampMs + s4 + this.droppedFrames);
        } else {
            logger.warn(ProtectedSandApp.s("ꑛ\u0001") + this.dequeuedSurfaceOutputBuffers.size() + ProtectedSandApp.s("ꑜ\u0001") + remove.presentationTimeStampMs + s4 + this.droppedFrames);
        }
        this.mediaCodec.releaseOutputBuffer(remove.index, false);
        return new DecodedTextureBuffer(null, remove.presentationTimeStampMs, remove.timeStampMs, remove.ntpTimeStampMs, remove.decodeTimeMs, SystemClock.elapsedRealtime() - remove.endDecodeTimeMs);
    }

    public static void disableH264HwCodec() {
        logger.warn(ProtectedSandApp.s("ꑞ\u0001"));
        hwDecoderDisabledTypes.add(ProtectedSandApp.s("ꑄ\u0001"));
    }

    public static void disableVp8HwCodec() {
        logger.warn(ProtectedSandApp.s("ꑟ\u0001"));
        hwDecoderDisabledTypes.add(ProtectedSandApp.s("ꑅ\u0001"));
    }

    public static void disableVp9HwCodec() {
        logger.warn(ProtectedSandApp.s("ꑠ\u0001"));
        hwDecoderDisabledTypes.add(ProtectedSandApp.s("ꐺ\u0001"));
    }

    public static void disposeEglContext() {
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            eglBase2.release();
            eglBase = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00eb, code lost:
    
        continue;
     */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.webrtc.MediaCodecVideoDecoder.DecoderProperties findDecoder(java.lang.String r11, java.lang.String[] r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoDecoder.findDecoder(java.lang.String, java.lang.String[]):org.webrtc.MediaCodecVideoDecoder$DecoderProperties");
    }

    @CalledByNativeUnchecked
    private boolean initDecode(int i4, int i5, int i6) {
        String[] supportedH264HwCodecPrefixes;
        String s4;
        SurfaceTextureHelper create;
        String s5 = ProtectedSandApp.s("ꑩ\u0001");
        String s6 = ProtectedSandApp.s("ꑪ\u0001");
        if (this.mediaCodecThread != null) {
            throw new RuntimeException(ProtectedSandApp.s("ꑴ\u0001"));
        }
        if (i4 == 1) {
            supportedH264HwCodecPrefixes = supportedVp8HwCodecPrefixes();
            s4 = ProtectedSandApp.s("ꑅ\u0001");
        } else if (i4 == 2) {
            supportedH264HwCodecPrefixes = supportedVp9HwCodecPrefixes;
            s4 = ProtectedSandApp.s("ꐺ\u0001");
        } else {
            if (i4 != 4) {
                throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("ꑳ\u0001"), i4));
            }
            supportedH264HwCodecPrefixes = supportedH264HwCodecPrefixes();
            s4 = ProtectedSandApp.s("ꑄ\u0001");
        }
        DecoderProperties findDecoder = findDecoder(s4, supportedH264HwCodecPrefixes);
        if (findDecoder == null) {
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("ꑲ\u0001"), i4));
        }
        Logger logger2 = logger;
        StringBuilder a5 = androidx.collection.n1.a(ProtectedSandApp.s("ꑫ\u0001"), i4, ProtectedSandApp.s("ꑬ\u0001"), i5, ProtectedSandApp.s("ꑖ\u0001"));
        a5.append(i6);
        a5.append(ProtectedSandApp.s("ꑦ\u0001"));
        a5.append(Integer.toHexString(findDecoder.colorFormat));
        a5.append(ProtectedSandApp.s("ꑭ\u0001"));
        com.flashget.kid.common.components.s.a(a5, useSurface(), logger2);
        runningInstance = this;
        this.mediaCodecThread = Thread.currentThread();
        try {
            this.width = i5;
            this.height = i6;
            this.stride = i5;
            this.sliceHeight = i6;
            if (useSurface() && (create = SurfaceTextureHelper.create(ProtectedSandApp.s("ꑮ\u0001"), eglBase.getEglBaseContext())) != null) {
                TextureListener textureListener = new TextureListener(create);
                this.textureListener = textureListener;
                textureListener.setSize(i5, i6);
                this.surface = new Surface(create.getSurfaceTexture());
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(s4, i5, i6);
            if (!useSurface()) {
                createVideoFormat.setInteger(ProtectedSandApp.s("ꑒ\u0001"), findDecoder.colorFormat);
            }
            logger2.debug(s6 + createVideoFormat);
            MediaCodec createByCodecName = MediaCodecVideoEncoder.createByCodecName(findDecoder.codecName);
            this.mediaCodec = createByCodecName;
            if (createByCodecName == null) {
                logger2.error(ProtectedSandApp.s("ꑯ\u0001"));
                return false;
            }
            createByCodecName.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
            this.mediaCodec.start();
            this.colorFormat = findDecoder.colorFormat;
            this.outputBuffers = this.mediaCodec.getOutputBuffers();
            this.inputBuffers = this.mediaCodec.getInputBuffers();
            this.decodeStartTimeMs.clear();
            this.hasDecodedFirstFrame = false;
            this.dequeuedSurfaceOutputBuffers.clear();
            this.droppedFrames = 0;
            logger2.debug(s5 + this.inputBuffers.length + ProtectedSandApp.s("ꑰ\u0001") + this.outputBuffers.length);
            return true;
        } catch (IllegalStateException e4) {
            logger.error(ProtectedSandApp.s("ꑱ\u0001"), e4);
            return false;
        }
    }

    public static boolean isH264HighProfileHwSupported() {
        Set<String> set = hwDecoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꑄ\u0001");
        if (set.contains(s4)) {
            return false;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (findDecoder(s4, new String[]{ProtectedSandApp.s("ꐿ\u0001")}) == null && findDecoder(s4, new String[]{ProtectedSandApp.s("ꐻ\u0001")}) == null) {
            return PeerConnectionFactory.fieldTrialsFindFullName(ProtectedSandApp.s("ꑵ\u0001")).equals(ProtectedSandApp.s("ꑶ\u0001")) && i4 >= 27 && findDecoder(s4, new String[]{ProtectedSandApp.s("ꑃ\u0001")}) != null;
        }
        return true;
    }

    public static boolean isH264HwSupported() {
        Set<String> set = hwDecoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꑄ\u0001");
        return (set.contains(s4) || findDecoder(s4, supportedH264HwCodecPrefixes()) == null) ? false : true;
    }

    public static boolean isVp8HwSupported() {
        Set<String> set = hwDecoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꑅ\u0001");
        return (set.contains(s4) || findDecoder(s4, supportedVp8HwCodecPrefixes()) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        Set<String> set = hwDecoderDisabledTypes;
        String s4 = ProtectedSandApp.s("ꐺ\u0001");
        return (set.contains(s4) || findDecoder(s4, supportedVp9HwCodecPrefixes) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateDecoder(String str, boolean z4);

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoDecoder mediaCodecVideoDecoder = runningInstance;
        if (mediaCodecVideoDecoder == null || (thread = mediaCodecVideoDecoder.mediaCodecThread) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace.length > 0) {
            logger.debug(ProtectedSandApp.s("ꑷ\u0001"));
            for (StackTraceElement stackTraceElement : stackTrace) {
                logger.debug(stackTraceElement.toString());
            }
        }
    }

    @CalledByNativeUnchecked
    private boolean queueInputBuffer(int i4, int i5, long j4, long j5, long j6) {
        checkOnMediaCodecThread();
        try {
            this.inputBuffers[i4].position(0);
            this.inputBuffers[i4].limit(i5);
            this.decodeStartTimeMs.add(new TimeStamps(SystemClock.elapsedRealtime(), j5, j6));
            this.mediaCodec.queueInputBuffer(i4, 0, i5, j4, 0);
            return true;
        } catch (IllegalStateException e4) {
            logger.error(ProtectedSandApp.s("ꑸ\u0001"), e4);
            return false;
        }
    }

    @CalledByNativeUnchecked
    private void release() {
        Logger logger2 = logger;
        com.flashget.kid.common.requests.uploadfile.a.a(new StringBuilder(ProtectedSandApp.s("ꑹ\u0001")), this.droppedFrames, logger2);
        checkOnMediaCodecThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: org.webrtc.MediaCodecVideoDecoder.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MediaCodecVideoDecoder.logger.debug("Java releaseDecoder on release thread");
                    MediaCodecVideoDecoder.this.mediaCodec.stop();
                    MediaCodecVideoDecoder.this.mediaCodec.release();
                    MediaCodecVideoDecoder.logger.debug("Java releaseDecoder on release thread done");
                } catch (Exception e4) {
                    MediaCodecVideoDecoder.logger.error("Media decoder release failed", e4);
                }
                countDownLatch.countDown();
            }
        }).start();
        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, C1434k.f30360a)) {
            logger2.error(ProtectedSandApp.s("ꑺ\u0001"));
            codecErrors++;
            if (errorCallback != null) {
                logger2.error(ProtectedSandApp.s("ꑻ\u0001") + codecErrors);
                errorCallback.onMediaCodecVideoDecoderCriticalError(codecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        if (useSurface()) {
            this.surface.release();
            this.surface = null;
            this.textureListener.release();
        }
        logger2.debug(ProtectedSandApp.s("ꑼ\u0001"));
    }

    @CalledByNativeUnchecked
    private void reset(int i4, int i5) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            throw new RuntimeException(ProtectedSandApp.s("ꑾ\u0001"));
        }
        logger.debug(ProtectedSandApp.s("ꑽ\u0001") + i4 + ProtectedSandApp.s("ꑖ\u0001") + i5);
        this.mediaCodec.flush();
        this.width = i4;
        this.height = i5;
        TextureListener textureListener = this.textureListener;
        if (textureListener != null) {
            textureListener.setSize(i4, i5);
        }
        this.decodeStartTimeMs.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    @CalledByNativeUnchecked
    private void returnDecodedOutputBuffer(int i4) throws IllegalStateException, MediaCodec.CodecException {
        checkOnMediaCodecThread();
        if (useSurface()) {
            throw new IllegalStateException(ProtectedSandApp.s("ꑿ\u0001"));
        }
        this.mediaCodec.releaseOutputBuffer(i4, false);
    }

    public static void setEglContext(EglBase.Context context) {
        if (eglBase != null) {
            logger.warn(ProtectedSandApp.s("ꒀ\u0001"));
            eglBase.release();
        }
        eglBase = EglBase.create(context);
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        logger.debug(ProtectedSandApp.s("ꒁ\u0001"));
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    private static final String[] supportedH264HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProtectedSandApp.s("ꐿ\u0001"));
        arrayList.add(ProtectedSandApp.s("ꒂ\u0001"));
        arrayList.add(ProtectedSandApp.s("ꐻ\u0001"));
        if (PeerConnectionFactory.fieldTrialsFindFullName(ProtectedSandApp.s("ꑵ\u0001")).equals(ProtectedSandApp.s("ꑶ\u0001")) && Build.VERSION.SDK_INT >= 27) {
            arrayList.add(ProtectedSandApp.s("ꑃ\u0001"));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static final String[] supportedVp8HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProtectedSandApp.s("ꐿ\u0001"));
        arrayList.add(ProtectedSandApp.s("ꒃ\u0001"));
        arrayList.add(ProtectedSandApp.s("ꐻ\u0001"));
        arrayList.add(ProtectedSandApp.s("ꒂ\u0001"));
        if (PeerConnectionFactory.fieldTrialsFindFullName(ProtectedSandApp.s("ꒄ\u0001")).equals(ProtectedSandApp.s("ꑶ\u0001"))) {
            arrayList.add(ProtectedSandApp.s("ꑃ\u0001"));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    static boolean useSurface() {
        return eglBase != null;
    }

    @CalledByNative
    int getColorFormat() {
        return this.colorFormat;
    }

    @CalledByNative
    int getHeight() {
        return this.height;
    }

    @CalledByNative
    ByteBuffer[] getInputBuffers() {
        return this.inputBuffers;
    }

    @CalledByNative
    ByteBuffer[] getOutputBuffers() {
        return this.outputBuffers;
    }

    @CalledByNative
    int getSliceHeight() {
        return this.sliceHeight;
    }

    @CalledByNative
    int getStride() {
        return this.stride;
    }

    @CalledByNative
    int getWidth() {
        return this.width;
    }
}
