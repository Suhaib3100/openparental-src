package org.webrtc;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import androidx.view.C1434k;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

@TargetApi(19)
/* loaded from: classes9.dex */
class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    private static final int VIDEO_AVC_LEVEL_3 = 256;
    private static final int VIDEO_AVC_PROFILE_HIGH = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private VideoEncoder.Callback callback;

    @androidx.annotation.q0
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;

    @androidx.annotation.q0
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private long nextPresentationTimestampUs;
    private final BusyCount outputBuffersBusyCount;

    @androidx.annotation.q0
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;
    private volatile boolean running;
    private final EglBase14.Context sharedContext;

    @androidx.annotation.q0
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private final Integer surfaceColorFormat;

    @androidx.annotation.q0
    private EglBase14 textureEglBase;

    @androidx.annotation.q0
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;
    private static final String KEY_BITRATE_MODE = "bitrate-mode";
    private static final String TAG = "HardwareVideoEncoder";
    private static final Logger logger = Logger.getLogger("HardwareVideoEncoder");
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();

    private static class BusyCount {
        private int count;
        private final Object countLock;

        public void decrement() {
            synchronized (this.countLock) {
                try {
                    int i4 = this.count - 1;
                    this.count = i4;
                    if (i4 == 0) {
                        this.countLock.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z4;
            synchronized (this.countLock) {
                z4 = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e4) {
                        HardwareVideoEncoder.logger.error("Interrupted while waiting on busy count", e4);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }

        private BusyCount() {
            this.countLock = new Object();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class YuvFormat {
        public static final YuvFormat I420 = new AnonymousClass1("I420", 0);
        public static final YuvFormat NV12 = new AnonymousClass2("NV12", 1);
        private static final /* synthetic */ YuvFormat[] $VALUES = $values();

        /* renamed from: org.webrtc.HardwareVideoEncoder$YuvFormat$1, reason: invalid class name */
        enum AnonymousClass1 extends YuvFormat {
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i4, int i5) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), i4, i5, i4 / 2, i5 / 2);
                i420.release();
            }

            private AnonymousClass1(String str, int i4) {
                super(str, i4);
            }
        }

        /* renamed from: org.webrtc.HardwareVideoEncoder$YuvFormat$2, reason: invalid class name */
        enum AnonymousClass2 extends YuvFormat {
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i4, int i5) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), i4, i5);
                i420.release();
            }

            private AnonymousClass2(String str, int i4) {
                super(str, i4);
            }
        }

        private static /* synthetic */ YuvFormat[] $values() {
            return new YuvFormat[]{I420, NV12};
        }

        public static YuvFormat valueOf(String str) {
            return (YuvFormat) Enum.valueOf(YuvFormat.class, str);
        }

        public static YuvFormat[] values() {
            return (YuvFormat[]) $VALUES.clone();
        }

        abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i4, int i5);

        private YuvFormat(String str, int i4) {
        }

        static YuvFormat valueOf(int i4) {
            if (i4 == 19) {
                return I420;
            }
            if (i4 == 21 || i4 == 2141391872 || i4 == 2141391876) {
                return NV12;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a("Unsupported colorFormat: ", i4));
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i4, int i5, BitrateAdjuster bitrateAdjuster, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i4;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i5);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        threadChecker.detachThread();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new Thread() { // from class: org.webrtc.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j4, VideoFrame.Buffer buffer, int i4) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer == -1) {
                logger.debug("Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffer(dequeueInputBuffer), buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i4, j4, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e4) {
                    logger.error("queueInputBuffer failed", e4);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e5) {
                logger.error("getInputBuffer with index=" + dequeueInputBuffer + " failed", e5);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e6) {
            logger.error("dequeueInputBuffer failed", e6);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j4) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j4));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e4) {
            logger.error("encodeTexture failed", e4);
            return VideoCodecStatus.ERROR;
        }
    }

    private static int getSliceHeight(MediaFormat mediaFormat, int i4) {
        return (mediaFormat == null || !mediaFormat.containsKey("slice-height")) ? i4 : mediaFormat.getInteger("slice-height");
    }

    private static int getStride(MediaFormat mediaFormat, int i4) {
        return (mediaFormat == null || !mediaFormat.containsKey("stride")) ? i4 : mediaFormat.getInteger("stride");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[Catch: IllegalArgumentException -> 0x008a, IllegalStateException -> 0x008d, TryCatch #3 {IllegalArgumentException -> 0x008a, IllegalStateException -> 0x008d, blocks: (B:9:0x0029, B:11:0x0062, B:15:0x0071, B:23:0x009d, B:24:0x00a7, B:25:0x0080, B:28:0x0090, B:31:0x00b5, B:33:0x00d0, B:34:0x00ec), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverEncodedImage$0(int i4) {
        try {
            this.codec.releaseOutputBuffer(i4, false);
        } catch (Exception e4) {
            com.flashget.kid.common.servers.forward.data.a.a(e4, new StringBuilder("releaseOutputBuffer failed "), logger);
        }
        this.outputBuffersBusyCount.decrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        logger.debug("Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e4) {
            logger.error("Media encoder stop failed", e4);
        }
        try {
            this.codec.release();
        } catch (Exception e5) {
            logger.error("Media encoder release failed", e5);
            this.shutdownException = e5;
        }
        this.configBuffer = null;
        logger.debug("Release on output thread done");
    }

    private void requestKeyFrame(long j4) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j4;
        } catch (IllegalStateException e4) {
            logger.error("requestKeyFrame failed", e4);
        }
    }

    private VideoCodecStatus resetCodec(int i4, int i5, boolean z4) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        if (i4 % 16 != 0 || i5 % 16 != 0) {
            logger.error("MediaCodec is only tested with resolutions that are 16x16 aligned.");
            return VideoCodecStatus.ERR_SIZE;
        }
        this.width = i4;
        this.height = i5;
        this.useSurfaceMode = z4;
        return initEncodeInternal();
    }

    private boolean shouldForceKeyFrame(long j4) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j5 = this.forcedKeyFrameNs;
        return j5 > 0 && j4 > this.lastKeyFrameNs + j5;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e4) {
            logger.error("updateBitrate failed", e4);
            return VideoCodecStatus.ERROR;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[Catch: IllegalArgumentException -> 0x009d, IllegalStateException -> 0x009f, TryCatch #3 {IllegalArgumentException -> 0x009d, IllegalStateException -> 0x009f, blocks: (B:15:0x003c, B:17:0x0075, B:21:0x0084, B:29:0x00ae, B:30:0x00b8, B:31:0x0093, B:34:0x00a1, B:37:0x00c6, B:39:0x00e1, B:40:0x00fd), top: B:14:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean workAroundForCodecConfig() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.workAroundForCodecConfig():boolean");
    }

    protected void deliverEncodedImage() {
        ByteBuffer slice;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            final int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -3) {
                    this.outputBuffersBusyCount.waitForZero();
                    return;
                }
                return;
            }
            ByteBuffer outputBuffer = this.codec.getOutputBuffer(dequeueOutputBuffer);
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            if ((bufferInfo.flags & 2) != 0) {
                logger.debug("Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                this.configBuffer = allocateDirect;
                allocateDirect.put(outputBuffer);
                return;
            }
            this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
            if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                updateBitrate();
            }
            boolean z4 = true;
            if ((bufferInfo.flags & 1) == 0) {
                z4 = false;
            }
            if (z4) {
                logger.debug("Sync frame generated");
            }
            if (z4 && this.codecType == VideoCodecMimeType.H264) {
                logger.debug("Prepending config frame of size " + this.configBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                slice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                this.configBuffer.rewind();
                slice.put(this.configBuffer);
                slice.put(outputBuffer);
                slice.rewind();
            } else {
                slice = outputBuffer.slice();
            }
            EncodedImage.FrameType frameType = z4 ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta;
            this.outputBuffersBusyCount.increment();
            EncodedImage createEncodedImage = this.outputBuilders.poll().setBuffer(slice, new Runnable() { // from class: org.webrtc.y
                @Override // java.lang.Runnable
                public final void run() {
                    HardwareVideoEncoder.this.lambda$deliverEncodedImage$0(dequeueOutputBuffer);
                }
            }).setFrameType(frameType).createEncodedImage();
            this.callback.onEncodedFrame(createEncodedImage, new VideoEncoder.CodecSpecificInfo());
            createEncodedImage.release();
        } catch (IllegalStateException e4) {
            logger.error("deliverOutput failed", e4);
        }
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        VideoCodecStatus resetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        boolean z4 = buffer instanceof VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        boolean z5 = canUseSurface() && z4;
        if ((width != this.width || height != this.height || z5 != this.useSurfaceMode) && (resetCodec = resetCodec(width, height, z5)) != VideoCodecStatus.OK) {
            return resetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            logger.error("Dropped frame, encoder queue full");
            return VideoCodecStatus.NO_OUTPUT;
        }
        boolean z6 = false;
        for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                z6 = true;
            }
        }
        if (z6 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        int width2 = ((buffer.getWidth() * buffer.getHeight()) * 3) / 2;
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j4 = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (TimeUnit.SECONDS.toMicros(1L) / this.bitrateAdjuster.getAdjustedFramerateFps());
        VideoCodecStatus encodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(videoFrame, j4) : encodeByteBuffer(videoFrame, j4, buffer, width2);
        if (encodeTextureBuffer != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        return encodeTextureBuffer;
    }

    protected void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer, this.stride, this.sliceHeight);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(16, false);
    }

    @Override // org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i4;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        int i5 = settings.width;
        if (i5 % 16 == 0) {
            int i6 = settings.height;
            if (i6 % 16 == 0) {
                this.width = i5;
                this.height = i6;
                this.useSurfaceMode = canUseSurface();
                int i7 = settings.startBitrate;
                if (i7 != 0 && (i4 = settings.maxFramerate) != 0) {
                    this.bitrateAdjuster.setTargets(i7 * 1000, i4);
                }
                this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
                Logger logger2 = logger;
                StringBuilder sb = new StringBuilder("initEncode: codec: ");
                sb.append(this.codecName);
                sb.append(", ");
                sb.append(this.width);
                sb.append(" x ");
                sb.append(this.height);
                sb.append(". @ ");
                sb.append(settings.startBitrate);
                sb.append("kbps. Fps: ");
                sb.append(settings.maxFramerate);
                sb.append(" Use surface mode: ");
                com.flashget.kid.common.components.s.a(sb, this.useSurfaceMode, logger2);
                return initEncodeInternal();
            }
        }
        logger.error("MediaCodec is only tested with resolutions that are 16x16 aligned.");
        return VideoCodecStatus.ERR_SIZE;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, C1434k.f30360a)) {
                logger.error("Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                logger.error("Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i4) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i4 > 30) {
            i4 = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i4);
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }
}
