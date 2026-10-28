package com.tencent.liteav.videoconsumer2;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.Range;
import android.view.Surface;
import androidx.compose.runtime.changelist.j;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.b.b;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.common.MediaCodecAbility;
import com.tencent.liteav.videobase.utils.d;
import com.tencent.liteav.videoconsumer.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class HardwareVideoDecoder2 implements SurfaceTexture.OnFrameAvailableListener {
    private static final int DRAIN_ERROR = -1;
    private static final int DRAIN_SUCCESS = 0;
    private static final int DRAIN_SUCCESS_MEET_END_OF_STREAM = 1;
    private static final int INVALID_COLOR_FORMAT = 0;
    private int mCodedHeight;
    private int mCodedWidth;
    private Surface mExternalSurface;
    private boolean mIsHevc;
    private boolean mIsRealTime;
    private boolean mIsStarted;
    private long mNativeVideoDecoderImplAndroid;
    private Surface mOutputSurface;
    private SurfaceTexture mSurfaceTexture;
    private final String mTAG;
    private boolean mUseAsyncMode;
    private boolean mUseByteBuffer;
    private boolean mUseSoftwareDecoder;
    private final b mThrottlers = new b();
    private MediaCodec mMediaCodec = null;
    private final Queue<Integer> mInputBufferQueue = new LinkedList();
    private final Queue<Pair<Integer, MediaCodec.BufferInfo>> mOutputBufferQueue = new LinkedList();
    private boolean mEnableLimitMaxDecFrameBufferingInH264Sps = false;
    private final a mSPSModifier = new a();
    private long mLastPresentationTimeUs = 0;

    HardwareVideoDecoder2(String str, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z10, long j4) {
        this.mUseSoftwareDecoder = false;
        this.mUseByteBuffer = false;
        this.mUseAsyncMode = false;
        this.mCodedWidth = 0;
        this.mCodedHeight = 0;
        this.mIsHevc = false;
        this.mTAG = j.a(str, ProtectedSandApp.s("嘽\u0001"));
        this.mIsRealTime = z4;
        this.mUseSoftwareDecoder = z6;
        this.mUseByteBuffer = z7;
        this.mUseAsyncMode = z10;
        this.mNativeVideoDecoderImplAndroid = j4;
        this.mCodedWidth = i4;
        this.mCodedHeight = i5;
        this.mIsHevc = z5;
    }

    private boolean configureDecoder(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface) {
        try {
            mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            mediaCodec.setVideoScalingMode(1);
            mediaCodec.start();
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("嘾\u0001"), mediaCodec.getName());
            return true;
        } catch (Throwable th) {
            LiteavLog.e(this.mTAG, ProtectedSandApp.s("嘿\u0001"), th);
            return false;
        }
    }

    private void destroyMediaCodec(MediaCodec mediaCodec) {
        String s4 = ProtectedSandApp.s("噀\u0001");
        String s5 = ProtectedSandApp.s("噁\u0001");
        try {
            if (mediaCodec != null) {
                try {
                    LiteavLog.i(this.mTAG, ProtectedSandApp.s("噂\u0001"));
                    mediaCodec.stop();
                    LiteavLog.i(this.mTAG, s5);
                    mediaCodec.release();
                } catch (Throwable th) {
                    try {
                        LiteavLog.e(this.mTAG, ProtectedSandApp.s("噃\u0001") + th.getMessage());
                        LiteavLog.i(this.mTAG, s5);
                        mediaCodec.release();
                    } catch (Throwable th2) {
                        try {
                            LiteavLog.i(this.mTAG, s5);
                            mediaCodec.release();
                        } catch (Throwable th3) {
                            LiteavLog.e(this.mTAG, s4, th3);
                        }
                        throw th2;
                    }
                }
            }
        } catch (Throwable th4) {
            LiteavLog.e(this.mTAG, s4, th4);
        }
    }

    private int drainDecodedFrameAsyncMode() {
        if (this.mOutputBufferQueue.isEmpty()) {
            return -1;
        }
        Pair<Integer, MediaCodec.BufferInfo> poll = this.mOutputBufferQueue.poll();
        int intValue = ((Integer) poll.first).intValue();
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) poll.second;
        this.mLastPresentationTimeUs = bufferInfo.presentationTimeUs;
        if ((bufferInfo.flags & 4) != 0) {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("噄\u0001"));
            this.mMediaCodec.releaseOutputBuffer(intValue, true);
            return 1;
        }
        int handleOutputBuffer = this.mUseByteBuffer ? handleOutputBuffer(intValue, bufferInfo) : 0;
        this.mMediaCodec.releaseOutputBuffer(intValue, true);
        if (this.mExternalSurface != null) {
            long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
            long j4 = this.mNativeVideoDecoderImplAndroid;
            if (j4 != 0) {
                nativeOnDecodedFrameWithSurface(j4, millis);
            }
        }
        return handleOutputBuffer;
    }

    private int drainDecodedFrameSyncMode() {
        MediaCodec.BufferInfo bufferInfo;
        int dequeueOutputBuffer;
        int i4 = 0;
        while (true) {
            if (i4 >= 3 || (dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer((bufferInfo = new MediaCodec.BufferInfo()), TimeUnit.MILLISECONDS.toMicros(10L))) == -1) {
                return -1;
            }
            if (dequeueOutputBuffer == -3) {
                LiteavLog.i(this.mTAG, ProtectedSandApp.s("噅\u0001"));
            } else if (dequeueOutputBuffer == -2) {
                outputFormatChange();
            } else {
                if (dequeueOutputBuffer >= 0) {
                    this.mLastPresentationTimeUs = bufferInfo.presentationTimeUs;
                    if ((bufferInfo.flags & 4) != 0) {
                        LiteavLog.i(this.mTAG, ProtectedSandApp.s("噄\u0001"));
                        this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, true);
                        return 1;
                    }
                    int handleOutputBuffer = this.mUseByteBuffer ? handleOutputBuffer(dequeueOutputBuffer, bufferInfo) : 0;
                    this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, true);
                    if (this.mExternalSurface != null) {
                        long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                        long j4 = this.mNativeVideoDecoderImplAndroid;
                        if (j4 != 0) {
                            nativeOnDecodedFrameWithSurface(j4, millis);
                        }
                    }
                    return handleOutputBuffer;
                }
                LiteavLog.d(this.mTAG, ProtectedSandApp.s("噆\u0001"), Integer.valueOf(dequeueOutputBuffer));
            }
            i4++;
        }
    }

    private boolean feedDataToMediaCodec(EncodedVideoFrame encodedVideoFrame) {
        ByteBuffer byteBuffer;
        int i4;
        ByteBuffer byteBuffer2;
        if (this.mMediaCodec == null) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("噇\u0001"));
            return false;
        }
        if (encodedVideoFrame == null || (!encodedVideoFrame.isEosFrame && ((byteBuffer2 = encodedVideoFrame.data) == null || byteBuffer2.remaining() == 0))) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("噊\u0001"));
            return true;
        }
        if (!this.mUseAsyncMode) {
            ByteBuffer[] inputBuffers = this.mMediaCodec.getInputBuffers();
            if (inputBuffers == null || inputBuffers.length == 0) {
                LiteavLog.e(this.mTAG, ProtectedSandApp.s("噉\u0001"));
                return false;
            }
            int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(i0.f35991f);
            if (dequeueInputBuffer < 0) {
                return false;
            }
            byteBuffer = inputBuffers[dequeueInputBuffer];
            i4 = dequeueInputBuffer;
        } else {
            if (this.mInputBufferQueue.isEmpty()) {
                return false;
            }
            int intValue = this.mInputBufferQueue.poll().intValue();
            byteBuffer = this.mMediaCodec.getInputBuffer(intValue);
            i4 = intValue;
        }
        if (encodedVideoFrame.isEosFrame) {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("噈\u0001"));
            this.mMediaCodec.queueInputBuffer(i4, 0, 0, 0L, 4);
        } else {
            limitMaxDecFrameBufferingInH264Sps(encodedVideoFrame);
            int remaining = encodedVideoFrame.data.remaining();
            byteBuffer.put(encodedVideoFrame.data);
            this.mMediaCodec.queueInputBuffer(i4, 0, remaining, TimeUnit.MILLISECONDS.toMicros(encodedVideoFrame.pts), 0);
        }
        return true;
    }

    private byte[] getSpsData(byte[] bArr, int[] iArr) {
        int i4 = 0;
        while (true) {
            if (i4 + 4 >= bArr.length || (i4 = EncodedVideoFrame.getNextNALHeaderPos(i4, ByteBuffer.wrap(bArr))) < 0) {
                break;
            }
            if ((bArr[i4] & c.I) == 7) {
                iArr[0] = i4;
                break;
            }
        }
        int i5 = iArr[0];
        if (i5 < 0) {
            return null;
        }
        int length = bArr.length - i5;
        while (true) {
            int i6 = i5 + 3;
            if (i6 >= bArr.length) {
                break;
            }
            byte b5 = bArr[i5];
            if ((b5 != 0 || bArr[i5 + 1] != 0 || bArr[i5 + 2] != 1) && (b5 != 0 || bArr[i5 + 1] != 0 || bArr[i5 + 2] != 0 || bArr[i6] != 1)) {
                i5++;
            }
        }
        length = i5 - iArr[0];
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, iArr[0], bArr2, 0, length);
        return bArr2;
    }

    private int getSupportedByteBufferColorFormat(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        boolean z4 = false;
        boolean z5 = false;
        for (int i4 : codecCapabilities.colorFormats) {
            if (i4 == 19) {
                z4 = true;
            } else if (i4 == 21) {
                z5 = true;
            }
        }
        if (z4) {
            return 19;
        }
        if (z5) {
            return 21;
        }
        LiteavLog.e(this.mTAG, ProtectedSandApp.s("噋\u0001") + Arrays.toString(codecCapabilities.colorFormats));
        return 0;
    }

    private void handleDecoderError(int i4) {
        long j4 = this.mNativeVideoDecoderImplAndroid;
        if (j4 != 0) {
            nativeOnDecodedFrameFailed(j4, i4);
        }
    }

    private int handleOutputBuffer(int i4, MediaCodec.BufferInfo bufferInfo) {
        int value;
        synchronized (this) {
            try {
                ByteBuffer outputBuffer = this.mMediaCodec.getOutputBuffer(i4);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                outputBuffer.rewind();
                MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
                int integer = outputFormat.getInteger(ProtectedSandApp.s("噌\u0001"));
                if (integer == 19) {
                    value = GLConstants.PixelFormatType.f72156a.getValue();
                } else {
                    if (integer != 21) {
                        LiteavLog.e(this.mTAG, ProtectedSandApp.s("噕\u0001").concat(String.valueOf(integer)));
                        handleDecoderError(6);
                        return -1;
                    }
                    value = GLConstants.PixelFormatType.f72157b.getValue();
                }
                int i5 = value;
                int integer2 = outputFormat.getInteger(ProtectedSandApp.s("噍\u0001"));
                int integer3 = outputFormat.getInteger(ProtectedSandApp.s("噎\u0001"));
                int abs = (outputFormat.containsKey(ProtectedSandApp.s("噏\u0001")) && outputFormat.containsKey(ProtectedSandApp.s("噐\u0001"))) ? Math.abs(outputFormat.getInteger(ProtectedSandApp.s("噏\u0001")) - outputFormat.getInteger(ProtectedSandApp.s("噐\u0001"))) + 1 : integer2;
                int abs2 = (outputFormat.containsKey(ProtectedSandApp.s("噑\u0001")) && outputFormat.containsKey(ProtectedSandApp.s("噒\u0001"))) ? Math.abs(outputFormat.getInteger(ProtectedSandApp.s("噑\u0001")) - outputFormat.getInteger(ProtectedSandApp.s("噒\u0001"))) + 1 : integer3;
                if (outputFormat.containsKey(ProtectedSandApp.s("噓\u0001"))) {
                    integer2 = outputFormat.getInteger(ProtectedSandApp.s("噓\u0001"));
                }
                int i6 = integer2;
                int integer4 = outputFormat.containsKey(ProtectedSandApp.s("噔\u0001")) ? outputFormat.getInteger(ProtectedSandApp.s("噔\u0001")) : integer3;
                long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                long j4 = this.mNativeVideoDecoderImplAndroid;
                if (j4 != 0) {
                    nativeOnByteBuffer(j4, i5, outputBuffer, bufferInfo.size, abs, abs2, i6, integer4, millis);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean initializeSurface(int i4) {
        synchronized (this) {
            try {
                this.mSurfaceTexture = new SurfaceTexture(i4);
                this.mOutputSurface = new Surface(this.mSurfaceTexture);
                this.mSurfaceTexture.setOnFrameAvailableListener(this);
            } catch (Surface.OutOfResourcesException e4) {
                LiteavLog.e(this.mTAG, ProtectedSandApp.s("噗\u0001"), e4);
                return false;
            }
        }
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("噖\u0001"));
        return true;
    }

    private boolean isResolutionSupported(MediaCodecInfo.CodecCapabilities codecCapabilities, int i4, int i5) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21 || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return true;
        }
        Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return true;
        }
        if (i4 < supportedWidths.getLower().intValue() || i5 < supportedHeights.getLower().intValue()) {
            LiteavLog.e(this.mTAG, ProtectedSandApp.s("噙\u0001"), Integer.valueOf(i4), Integer.valueOf(i5), supportedWidths.toString(), supportedHeights.toString());
            return false;
        }
        if (i4 > supportedWidths.getUpper().intValue() || i5 > supportedHeights.getUpper().intValue()) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("噘\u0001"), Integer.valueOf(i4), Integer.valueOf(i5), supportedWidths.toString(), supportedHeights.toString());
        }
        return true;
    }

    private void limitMaxDecFrameBufferingInH264Sps(EncodedVideoFrame encodedVideoFrame) {
        byte[] a5;
        ByteBuffer b5;
        byte[] bArr;
        boolean z4;
        byte b6;
        if (encodedVideoFrame.isIDRFrame() && encodedVideoFrame.codecType == CodecType.f72197b && this.mEnableLimitMaxDecFrameBufferingInH264Sps && (a5 = d.a(encodedVideoFrame.data.remaining())) != null) {
            encodedVideoFrame.data.get(a5);
            encodedVideoFrame.data.rewind();
            int[] iArr = {-1};
            byte[] spsData = getSpsData(a5, iArr);
            if (spsData == null || iArr[0] < 0) {
                return;
            }
            byte[] bArr2 = null;
            try {
                a aVar = this.mSPSModifier;
                byte[] bArr3 = new byte[spsData.length];
                int i4 = 0;
                int i5 = 0;
                while (i4 < spsData.length) {
                    if (i4 < spsData.length - 3 && (b6 = spsData[i4]) == 0) {
                        int i6 = i4 + 1;
                        if (spsData[i6] == 0 && spsData[i4 + 2] == 3) {
                            int i7 = i4 + 3;
                            if (spsData[i7] <= 3) {
                                int i10 = i5 + 1;
                                bArr3[i5] = b6;
                                i5 += 2;
                                bArr3[i10] = spsData[i6];
                                i4 = i7;
                            }
                        }
                    }
                    bArr3[i5] = spsData[i4];
                    i4++;
                    i5++;
                }
                if (i5 != spsData.length) {
                    bArr = new byte[i5];
                    System.arraycopy(bArr3, 0, bArr, 0, i5);
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    z4 = true;
                } else {
                    bArr = spsData;
                    z4 = false;
                }
                byte[] a6 = aVar.a(new ByteArrayInputStream(bArr));
                bArr2 = (a6 == null || !z4) ? a6 : a.a(a6);
            } catch (Throwable th) {
                LiteavLog.e(this.mTAG, ProtectedSandApp.s("噚\u0001"), th);
            }
            if (bArr2 == null || (b5 = d.b((a5.length - spsData.length) + bArr2.length)) == null) {
                return;
            }
            encodedVideoFrame.data = b5;
            int i11 = iArr[0];
            if (i11 > 0) {
                b5.put(a5, 0, i11);
            }
            encodedVideoFrame.data.put(bArr2);
            ByteBuffer byteBuffer = encodedVideoFrame.data;
            int i12 = iArr[0];
            byteBuffer.put(a5, spsData.length + i12, (a5.length - i12) - spsData.length);
            encodedVideoFrame.data.rewind();
        }
    }

    private native void nativeOnByteBuffer(long j4, int i4, ByteBuffer byteBuffer, int i5, int i6, int i7, int i10, int i11, long j5);

    private native void nativeOnDecodedFrameFailed(long j4, int i4);

    private native void nativeOnDecodedFrameWithSurface(long j4, long j5);

    private native void nativeOnFrameAvailable(long j4, long j5);

    private native void nativeOnInputBufferAvailable(long j4);

    private native void nativeOnOutputBufferAvailable(long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (mediaCodec != this.mMediaCodec) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("噛\u0001"));
            return;
        }
        LiteavLog.e(this.mTAG, ProtectedSandApp.s("噜\u0001") + codecException.toString());
        handleDecoderError(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecInputBufferAvailable(MediaCodec mediaCodec, int i4) {
        if (mediaCodec != this.mMediaCodec) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("噝\u0001"));
            return;
        }
        this.mInputBufferQueue.offer(Integer.valueOf(i4));
        long j4 = this.mNativeVideoDecoderImplAndroid;
        if (j4 != 0) {
            nativeOnInputBufferAvailable(j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecOutputBufferAvailable(MediaCodec mediaCodec, int i4, MediaCodec.BufferInfo bufferInfo) {
        if (mediaCodec != this.mMediaCodec) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("噛\u0001"));
            return;
        }
        this.mOutputBufferQueue.offer(new Pair<>(Integer.valueOf(i4), bufferInfo));
        long j4 = this.mNativeVideoDecoderImplAndroid;
        if (j4 != 0) {
            nativeOnOutputBufferAvailable(j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaCodecOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (mediaCodec != this.mMediaCodec) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("噞\u0001"));
            return;
        }
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("噟\u0001").concat(String.valueOf(mediaFormat)));
    }

    private void outputFormatChange() {
        MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("噠\u0001").concat(String.valueOf(outputFormat)));
    }

    private void setCallback(MediaCodec mediaCodec) {
        MediaCodec.Callback callback = new MediaCodec.Callback() { // from class: com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2.1
            @Override // android.media.MediaCodec.Callback
            public final void onError(MediaCodec mediaCodec2, MediaCodec.CodecException codecException) {
                HardwareVideoDecoder2.this.onMediaCodecError(mediaCodec2, codecException);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onInputBufferAvailable(MediaCodec mediaCodec2, int i4) {
                HardwareVideoDecoder2.this.onMediaCodecInputBufferAvailable(mediaCodec2, i4);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onOutputBufferAvailable(MediaCodec mediaCodec2, int i4, MediaCodec.BufferInfo bufferInfo) {
                HardwareVideoDecoder2.this.onMediaCodecOutputBufferAvailable(mediaCodec2, i4, bufferInfo);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onOutputFormatChanged(MediaCodec mediaCodec2, MediaFormat mediaFormat) {
                HardwareVideoDecoder2.this.onMediaCodecOutputFormatChanged(mediaCodec2, mediaFormat);
            }
        };
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            mediaCodec.setCallback(callback);
        } else {
            mediaCodec.setCallback(callback, new Handler(Looper.myLooper()));
        }
    }

    private int startInternal() {
        Surface surface;
        int i4;
        try {
            String s4 = this.mIsHevc ? ProtectedSandApp.s("噡\u0001") : ProtectedSandApp.s("噢\u0001");
            MediaCodec createMediaCodecInternal = createMediaCodecInternal(this.mUseSoftwareDecoder, s4);
            this.mMediaCodec = createMediaCodecInternal;
            MediaCodecInfo.CodecCapabilities capabilitiesForType = createMediaCodecInternal.getCodecInfo().getCapabilitiesForType(s4);
            int i5 = this.mCodedWidth;
            if (i5 > 0 && (i4 = this.mCodedHeight) > 0 && !isResolutionSupported(capabilitiesForType, i5, i4)) {
                return 18;
            }
            com.tencent.liteav.videobase.utils.b bVar = new com.tencent.liteav.videobase.utils.b();
            bVar.f72289c = s4;
            bVar.f72287a = this.mCodedWidth;
            bVar.f72288b = this.mCodedHeight;
            bVar.f72291e = capabilitiesForType;
            bVar.f72290d = this.mIsRealTime;
            MediaFormat a5 = bVar.a();
            if (this.mUseByteBuffer) {
                int supportedByteBufferColorFormat = getSupportedByteBufferColorFormat(capabilitiesForType);
                if (supportedByteBufferColorFormat == 0) {
                    return 6;
                }
                a5.setInteger(ProtectedSandApp.s("噌\u0001"), supportedByteBufferColorFormat);
            }
            if (this.mUseAsyncMode) {
                setCallback(this.mMediaCodec);
            }
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("噣\u0001").concat(String.valueOf(a5)));
            if (this.mUseByteBuffer) {
                surface = null;
            } else {
                surface = this.mExternalSurface;
                if (surface == null) {
                    surface = this.mOutputSurface;
                }
            }
            if (!configureDecoder(this.mMediaCodec, a5, surface)) {
                return 1;
            }
            this.mIsStarted = true;
            return 0;
        } catch (Throwable th) {
            LiteavLog.e(this.mTAG, ProtectedSandApp.s("噤\u0001"), th);
            return 1;
        }
    }

    private void uninitializeSurface() {
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("噥\u0001"));
        synchronized (this) {
            try {
                Surface surface = this.mOutputSurface;
                if (surface != null) {
                    surface.release();
                    this.mOutputSurface = null;
                }
                SurfaceTexture surfaceTexture = this.mSurfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.mSurfaceTexture = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MediaCodec createMediaCodecInternal(boolean z4, String str) throws IOException {
        if (!z4) {
            return MediaCodec.createDecoderByType(str);
        }
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (!mediaCodecInfo.isEncoder()) {
                for (String str2 : supportedTypes) {
                    if (str2.contains(str) && MediaCodecAbility.isSoftOnlyDecoder(mediaCodecInfo)) {
                        LiteavLog.i(this.mTAG, ProtectedSandApp.s("噦\u0001"), mediaCodecInfo.getName());
                        return MediaCodec.createByCodecName(mediaCodecInfo.getName());
                    }
                }
            }
        }
        return MediaCodec.createDecoderByType(str);
    }

    public boolean decodeFrame(EncodedVideoFrame encodedVideoFrame) {
        if (encodedVideoFrame == null) {
            return true;
        }
        try {
            if (this.mMediaCodec != null) {
                return feedDataToMediaCodec(encodedVideoFrame);
            }
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("噇\u0001"));
            return false;
        } catch (Throwable th) {
            try {
                LiteavLog.e(this.mTAG, ProtectedSandApp.s("噧\u0001"), th);
                handleDecoderError(4);
                return false;
            } finally {
                encodedVideoFrame.release();
            }
        }
    }

    public int drainDecodedFrame() {
        try {
            return this.mUseAsyncMode ? drainDecodedFrameAsyncMode() : drainDecodedFrameSyncMode();
        } catch (Throwable th) {
            LiteavLog.e(this.mTAG, ProtectedSandApp.s("器\u0001"), th);
            handleDecoderError(4);
            return -1;
        }
    }

    public void enableVuiModify(boolean z4) {
        if (this.mEnableLimitMaxDecFrameBufferingInH264Sps != z4) {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("噩\u0001").concat(String.valueOf(z4)));
            this.mEnableLimitMaxDecFrameBufferingInH264Sps = z4;
        }
    }

    public int getValidInputBufferCount() {
        return this.mInputBufferQueue.size();
    }

    public int getValidOutputBufferCount() {
        return this.mOutputBufferQueue.size();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            SurfaceTexture surfaceTexture2 = this.mSurfaceTexture;
            if (surfaceTexture2 != null && surfaceTexture2 == surfaceTexture) {
                long millis = TimeUnit.MICROSECONDS.toMillis(this.mLastPresentationTimeUs);
                long j4 = this.mNativeVideoDecoderImplAndroid;
                if (j4 != 0) {
                    nativeOnFrameAvailable(j4, millis);
                }
            }
        }
    }

    public void resetNativeHandle() {
        this.mNativeVideoDecoderImplAndroid = 0L;
    }

    public int start(int i4) {
        if (this.mIsStarted) {
            return 0;
        }
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("噪\u0001"), Integer.valueOf(i4));
        if (!this.mUseByteBuffer && !initializeSurface(i4)) {
            return 16;
        }
        int start = start();
        if (start != 0) {
            uninitializeSurface();
        }
        return start;
    }

    public void stop() {
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("噬\u0001"));
        if (this.mIsStarted) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
            uninitializeSurface();
            this.mIsStarted = false;
            this.mExternalSurface = null;
        }
    }

    public float[] updateTexImage() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            return null;
        }
        try {
            float[] fArr = new float[16];
            surfaceTexture.updateTexImage();
            this.mSurfaceTexture.getTransformMatrix(fArr);
            return fArr;
        } catch (Throwable th) {
            LiteavLog.w(this.mThrottlers.a(ProtectedSandApp.s("噭\u0001")), this.mTAG, ProtectedSandApp.s("噮\u0001").concat(String.valueOf(th)), new Object[0]);
            return null;
        }
    }

    public int start(Surface surface) {
        if (this.mIsStarted) {
            return 0;
        }
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("噫\u0001").concat(String.valueOf(surface)));
        if (surface == null) {
            return 17;
        }
        this.mExternalSurface = surface;
        return start();
    }

    private int start() {
        int startInternal = startInternal();
        if (startInternal != 0 && this.mIsRealTime) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
            this.mIsRealTime = false;
            startInternal = startInternal();
        }
        if (startInternal != 0) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
        }
        return startInternal;
    }
}
