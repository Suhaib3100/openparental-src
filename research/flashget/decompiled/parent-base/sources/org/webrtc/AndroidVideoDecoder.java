package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import androidx.content.preferences.protobuf.r;
import androidx.view.C1434k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;

    @androidx.annotation.q0
    private VideoDecoder.Callback callback;

    @androidx.annotation.q0
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;

    @androidx.annotation.q0
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;

    @androidx.annotation.q0
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;

    @androidx.annotation.q0
    private final EglBase.Context sharedContext;

    @androidx.annotation.q0
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;

    @androidx.annotation.q0
    private Surface surface;

    @androidx.annotation.q0
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String TAG = "AndroidVideoDecoder";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final Logger logger = h4.a.a.d("AndroidVideDecoder");
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    private static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        DecodedTextureMetadata(long j4, Integer num) {
            this.presentationTimestampUs = j4;
            this.decodeTimeMs = num;
        }
    }

    private static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        FrameInfo(long j4, int i4) {
            this.decodeStartTimeMs = j4;
            this.rotation = i4;
        }
    }

    AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i4, @androidx.annotation.q0 EglBase.Context context) {
        if (!isSupportedColorFormat(i4)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Unsupported color format: ", i4));
        }
        logger.debug("ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i4 + " context: " + context);
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.colorFormat = i4;
        this.sharedContext = context;
        this.frameInfos = new LinkedBlockingDeque();
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i4, int i5, int i6, int i7) {
        if (i4 % 2 != 0) {
            throw new AssertionError(android.support.v4.media.a.a("Stride is not divisible by two: ", i4));
        }
        int i10 = (i6 + 1) / 2;
        int i11 = i5 % 2;
        int i12 = i11 == 0 ? (i7 + 1) / 2 : i7 / 2;
        int i13 = i4 / 2;
        int i14 = i4 * i5;
        int i15 = i13 * i12;
        int a5 = r.a(i13, i5, 2, i14);
        int i16 = a5 + i15;
        VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i6, i7);
        byteBuffer.limit(i4 * i7);
        byteBuffer.position(0);
        copyPlane(byteBuffer.slice(), i4, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i6, i7);
        byteBuffer.limit(i14 + i15);
        byteBuffer.position(i14);
        copyPlane(byteBuffer.slice(), i13, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i10, i12);
        if (i11 == 1) {
            byteBuffer.position(((i12 - 1) * i13) + i14);
            ByteBuffer dataU = allocateI420Buffer.getDataU();
            dataU.position(allocateI420Buffer.getStrideU() * i12);
            dataU.put(byteBuffer);
        }
        byteBuffer.limit(i16);
        byteBuffer.position(a5);
        copyPlane(byteBuffer.slice(), i13, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i10, i12);
        if (i11 == 1) {
            byteBuffer.position(((i12 - 1) * i13) + a5);
            ByteBuffer dataV = allocateI420Buffer.getDataV();
            dataV.position(allocateI420Buffer.getStrideV() * i12);
            dataV.put(byteBuffer);
        }
        return allocateI420Buffer;
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i4, int i5, int i6, int i7) {
        return new NV12Buffer(i6, i7, i4, i5, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i4, MediaCodec.BufferInfo bufferInfo, int i5, Integer num) {
        int i6;
        int i7;
        int i10;
        int i11;
        synchronized (this.dimensionLock) {
            i6 = this.width;
            i7 = this.height;
            i10 = this.stride;
            i11 = this.sliceHeight;
        }
        int i12 = bufferInfo.size;
        if (i12 < ((i6 * i7) * 3) / 2) {
            logger.error("Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        int i13 = (i12 >= ((i10 * i7) * 3) / 2 || i11 != i7 || i10 <= i6) ? i10 : (i12 * 2) / (i7 * 3);
        ByteBuffer outputBuffer = this.codec.getOutputBuffer(i4);
        outputBuffer.position(bufferInfo.offset);
        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = outputBuffer.slice();
        VideoFrame.Buffer copyI420Buffer = this.colorFormat == 19 ? copyI420Buffer(slice, i13, i11, i6, i7) : copyNV12ToI420Buffer(slice, i13, i11, i6, i7);
        this.codec.releaseOutputBuffer(i4, false);
        VideoFrame videoFrame = new VideoFrame(copyI420Buffer, i5, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i4, MediaCodec.BufferInfo bufferInfo, int i5, Integer num) {
        int i6;
        int i7;
        synchronized (this.dimensionLock) {
            i6 = this.width;
            i7 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null) {
                    this.codec.releaseOutputBuffer(i4, false);
                    return;
                }
                this.surfaceTextureHelper.setTextureSize(i6, i7);
                this.surfaceTextureHelper.setFrameRotation(i5);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i4, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i4, int i5) {
        this.decoderThreadChecker.checkIsOnValidThread();
        Logger logger2 = logger;
        StringBuilder sb = new StringBuilder("initDecodeInternal name: ");
        sb.append(this.codecName);
        sb.append(" type: ");
        sb.append(this.codecType);
        sb.append(" width: ");
        sb.append(i4);
        sb.append(" height: ");
        com.flashget.kid.common.requests.uploadfile.a.a(sb, i5, logger2);
        if (this.outputThread != null) {
            logger2.error("initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i4;
        this.height = i5;
        this.stride = i4;
        this.sliceHeight = i5;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                logger2.info("Config type " + this.codecType.mimeType() + " width " + i4 + " height " + i5);
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i4, i5);
                if (this.sharedContext == null) {
                    logger2.debug("set color format");
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
            } catch (IllegalArgumentException e4) {
                logger.error("initDecode failed", e4);
                if (!workaroundTryMediaCodeConfig1(i4, i5)) {
                    release();
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (IllegalStateException e5) {
                logger.error("initDecode failed", e5);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            this.running = true;
            Thread createOutputThread = createOutputThread();
            this.outputThread = createOutputThread;
            createOutputThread.start();
            logger.debug("initDecodeInternal done");
            org.greenrobot.eventbus.c.f().q(new VideoDecoderInit(i4, i5));
            return VideoCodecStatus.OK;
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            logger.error("Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i4) {
        for (int i5 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void reformat(android.media.MediaFormat r9) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.reformat(android.media.MediaFormat):void");
    }

    private VideoCodecStatus reinitDecode(int i4, int i5) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        return releaseInternal != VideoCodecStatus.OK ? releaseInternal : initDecodeInternal(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        logger.debug("Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e4) {
            logger.error("Media decoder stop failed", e4);
        }
        try {
            this.codec.release();
        } catch (Exception e5) {
            logger.error("Media decoder release failed", e5);
            this.shutdownException = e5;
        }
        logger.debug("Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            logger.debug("release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, C1434k.f30360a)) {
                logger.error("Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException != null) {
                logger.error("Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            }
            this.codec = null;
            this.outputThread = null;
            return VideoCodecStatus.OK;
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    private boolean workaroundTryMediaCodeConfig1(int i4, int i5) {
        this.decoderThreadChecker.checkIsOnValidThread();
        int i6 = i4 % 2 != 0 ? i4 - 1 : i4;
        int i7 = i5 % 2 != 0 ? i5 - 1 : i5;
        Logger logger2 = logger;
        StringBuilder sb = new StringBuilder("workaround1 initDecodeInternal name: ");
        sb.append(this.codecName);
        sb.append(" type: ");
        sb.append(this.codecType);
        sb.append(" width: ");
        sb.append(i6);
        sb.append(" height: ");
        com.flashget.kid.common.requests.uploadfile.a.a(sb, i7, logger2);
        if (this.outputThread != null) {
            logger2.error("workaround1 initDecodeInternal called while the codec is already running");
            return false;
        }
        this.width = i6;
        this.height = i7;
        this.stride = i6;
        this.sliceHeight = i7;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                logger2.info("workaround1 Config type " + this.codecType.mimeType() + " width " + i6 + " hieght " + i7);
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i6, i7);
                if (this.sharedContext == null) {
                    logger2.debug("workaround1 set colorformat");
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
            } catch (IllegalArgumentException e4) {
                logger.error("workaround1 initDecode failed", e4);
                if (!workaroundTryMediaCodeConfig2(i4, i5)) {
                    return false;
                }
            } catch (IllegalStateException e5) {
                logger.error("workaround1 initDecode failed", e5);
                release();
                return false;
            }
            return true;
        } catch (IOException | IllegalArgumentException unused) {
            logger.error("workaround Cannot create media decoder " + this.codecName);
            return false;
        }
    }

    private boolean workaroundTryMediaCodeConfig2(int i4, int i5) {
        this.decoderThreadChecker.checkIsOnValidThread();
        int i6 = i4 / 2;
        int i7 = i5 / 2;
        Logger logger2 = logger;
        StringBuilder sb = new StringBuilder("workaround initDecodeInternal name: ");
        sb.append(this.codecName);
        sb.append(" type: ");
        sb.append(this.codecType);
        sb.append(" width: ");
        sb.append(i6);
        sb.append(" height: ");
        com.flashget.kid.common.requests.uploadfile.a.a(sb, i7, logger2);
        if (this.outputThread != null) {
            logger2.error("workaround initDecodeInternal called while the codec is already running");
            return false;
        }
        this.width = i6;
        this.height = i7;
        this.stride = i6;
        this.sliceHeight = i7;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                logger2.info("workaround Config type " + this.codecType.mimeType() + " width " + i6 + " hieght " + i7);
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i6, i7);
                if (this.sharedContext == null) {
                    logger2.debug("workaround set colorformat");
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                return true;
            } catch (IllegalArgumentException e4) {
                logger.error("workaround initDecode failed", e4);
                return false;
            } catch (IllegalStateException e5) {
                logger.error("workaround initDecode failed", e5);
                release();
                return false;
            }
        } catch (IOException | IllegalArgumentException unused) {
            logger.error("workaround Cannot create media decoder " + this.codecName);
            return false;
        }
    }

    protected VideoFrame.I420Buffer allocateI420Buffer(int i4, int i5) {
        return JavaI420Buffer.allocate(i4, i5);
    }

    protected void copyPlane(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, int i6, int i7) {
        YuvHelper.copyPlane(byteBuffer, i4, byteBuffer2, i5, i6, i7);
    }

    protected SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i4;
        int i5;
        VideoCodecStatus reinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        if (this.codec == null || this.callback == null) {
            Logger logger2 = logger;
            StringBuilder sb = new StringBuilder("decode uninitalized, codec: ");
            sb.append(this.codec != null);
            sb.append(", callback: ");
            sb.append(this.callback);
            logger2.debug(sb.toString());
            return VideoCodecStatus.UNINITIALIZED;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            logger.error("decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            logger.error("decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i4 = this.width;
            i5 = this.height;
        }
        int i6 = encodedImage.encodedWidth;
        int i7 = encodedImage.encodedHeight;
        if (i6 * i7 > 0 && ((i6 != i4 || i7 != i5) && (reinitDecode = reinitDecode(i6, i7)) != VideoCodecStatus.OK)) {
            return reinitDecode;
        }
        if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
            logger.error("decode() - key frame required first");
            return VideoCodecStatus.NO_OUTPUT;
        }
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
            if (dequeueInputBuffer < 0) {
                logger.error("decode() - no HW buffers available; decoder falling behind");
                return VideoCodecStatus.ERROR;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer);
                if (inputBuffer.capacity() < remaining) {
                    logger.error("decode() - HW buffer too small");
                    return VideoCodecStatus.ERROR;
                }
                inputBuffer.put(encodedImage.buffer);
                this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                    if (this.keyFrameRequired) {
                        this.keyFrameRequired = false;
                    }
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e4) {
                    logger.error("queueInputBuffer failed", e4);
                    this.frameInfos.pollLast();
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

    protected void deliverDecodedFrame() {
        Integer num;
        int i4;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (dequeueOutputBuffer < 0) {
                logger.debug("dequeueOutputBuffer returned " + dequeueOutputBuffer);
                return;
            }
            FrameInfo poll = this.frameInfos.poll();
            if (poll != null) {
                num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                i4 = poll.rotation;
            } else {
                num = null;
                i4 = 0;
            }
            this.hasDecodedFirstFrame = true;
            if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i4, num);
            } else {
                deliverByteFrame(dequeueOutputBuffer, bufferInfo, i4, num);
            }
            org.greenrobot.eventbus.c.f().q(new AndroidVideoDecoderEvent(true));
        } catch (IllegalStateException e4) {
            logger.error("deliverDecodedFrame failed", e4);
            org.greenrobot.eventbus.c.f().q(new AndroidVideoDecoderEvent(false));
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j4;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j4 = decodedTextureMetadata.presentationTimestampUs * 1000;
            num = decodedTextureMetadata.decodeTimeMs;
            this.renderedTextureMetadata = null;
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j4), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        logger.debug("release");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    protected void releaseSurface() {
        this.surface.release();
    }
}
