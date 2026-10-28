package com.tencent.liteav.videoproducer2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.c;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class MediaCodecCallbackJni extends MediaCodec.Callback {
    private static final String TAG = ProtectedSandApp.s("埕\u0001");
    private MediaCodec mMediaCodec;
    private long mNativeHandler;

    public MediaCodecCallbackJni(MediaCodec mediaCodec, long j4) {
        this.mMediaCodec = mediaCodec;
        this.mNativeHandler = j4;
        LiteavLog.i(ProtectedSandApp.s("埕\u0001"), ProtectedSandApp.s("埔\u0001").concat(String.valueOf(mediaCodec)));
    }

    private native void nativeOnError(long j4, MediaCodec mediaCodec, MediaCodecExceptionJni mediaCodecExceptionJni);

    private native void nativeOnOutputBufferAvailable(long j4, MediaCodec mediaCodec, MediaCodecFrameJni mediaCodecFrameJni, int i4);

    private native void nativeOnOutputFormatChanged(long j4, MediaCodec mediaCodec, MediaFormat mediaFormat);

    public void destroy() {
        LiteavLog.i(ProtectedSandApp.s("埕\u0001"), ProtectedSandApp.s("埖\u0001") + this.mMediaCodec);
        this.mMediaCodec = null;
        this.mNativeHandler = 0L;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (this.mMediaCodec != mediaCodec || this.mNativeHandler == 0) {
            return;
        }
        MediaCodecExceptionJni createException = MediaCodecExceptionJni.createException();
        boolean z4 = true;
        createException.hasException = true;
        createException.systemErrorCode = codecException.getErrorCode();
        if (!codecException.isRecoverable() && !codecException.isTransient()) {
            z4 = false;
        }
        createException.isErrorRecoverable = z4;
        nativeOnError(this.mNativeHandler, mediaCodec, createException);
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i4) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i4, MediaCodec.BufferInfo bufferInfo) {
        if (this.mMediaCodec != mediaCodec || this.mNativeHandler == 0) {
            return;
        }
        if (bufferInfo.size == 0 && (bufferInfo.flags & 4) == 0) {
            LiteavLog.e(ProtectedSandApp.s("埕\u0001"), ProtectedSandApp.s("埗\u0001"));
            return;
        }
        ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? mediaCodec.getOutputBuffer(i4) : mediaCodec.getOutputBuffers()[i4];
        if (outputBuffer == null) {
            return;
        }
        outputBuffer.position(bufferInfo.offset);
        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        MediaCodecFrameJni mediaCodecFrameJni = new MediaCodecFrameJni();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        mediaCodecFrameJni.data = allocateDirect;
        allocateDirect.put(outputBuffer);
        mediaCodecFrameJni.nalType = (bufferInfo.flags & 1) > 0 ? c.f72210b : c.f72211c;
        mediaCodecFrameJni.pts = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
        mediaCodec.releaseOutputBuffer(i4, false);
        nativeOnOutputBufferAvailable(this.mNativeHandler, mediaCodec, mediaCodecFrameJni, bufferInfo.flags);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (this.mMediaCodec != mediaCodec || this.mNativeHandler == 0) {
            return;
        }
        LiteavLog.i(ProtectedSandApp.s("埕\u0001"), ProtectedSandApp.s("埘\u0001"), mediaFormat);
        nativeOnOutputFormatChanged(this.mNativeHandler, mediaCodec, mediaFormat);
    }
}
