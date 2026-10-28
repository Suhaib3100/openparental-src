package com.tencent.liteav.videoproducer2;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.c;
import com.tencent.liteav.videobase.common.f;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.encoder.a;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class VideoMediaCodecJni {
    public static final int DRAIN_CODEC_CONFIG_ONLY = 2;
    public static final int DRAIN_ERROR = -1;
    public static final int DRAIN_KEY_FRAME_WITH_CODEC_CONFIG = 1;
    public static final int DRAIN_SUCCESS = 0;
    public static final int DRAIN_TRY_AGAIN_LATER = 4;
    public static final int DRAIN_TRY_AGAIN_ONCE = 3;
    public static final int FEED_ERROR = -1;
    public static final int FEED_SUCCESS = 0;
    public static final int FEED_TRY_AGAIN_LATER = 1;
    private static final String TAG = ProtectedSandApp.s("埚\u0001");

    public static MediaFormat configureMediaCodec(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec, VideoEncodeParams videoEncodeParams, boolean z4, int i4, boolean z5) {
        MediaFormat a5;
        String s4 = ProtectedSandApp.s("埙\u0001");
        String s5 = ProtectedSandApp.s("埚\u0001");
        a aVar = new a(mediaCodec, videoEncodeParams.codecType == CodecType.f72198c ? ProtectedSandApp.s("埛\u0001") : ProtectedSandApp.s("埜\u0001"), videoEncodeParams, null);
        aVar.f72607a = videoEncodeParams.bitrateMode == VideoEncoderDef.BitrateMode.f72568b;
        aVar.f72608b = z4;
        if (z5) {
            a5 = aVar.b();
            if (a5 == null) {
                a5 = null;
            } else {
                aVar.a(a5);
            }
        } else {
            a5 = aVar.a();
        }
        if (a5 == null) {
            return null;
        }
        try {
            setMaxBFramesToMediaFormat(a5, i4);
            mediaCodec.configure(a5, (Surface) null, (MediaCrypto) null, 1);
            LiteavLog.i(s5, ProtectedSandApp.s("埝\u0001").concat(String.valueOf(a5)));
            return a5;
        } catch (Exception e4) {
            handleException(mediaCodecExceptionJni, e4);
            LiteavLog.e(s5, s4.concat(String.valueOf(e4)));
            return null;
        } catch (Throwable th) {
            handleThrowable(mediaCodecExceptionJni, th);
            LiteavLog.e(s5, s4.concat(String.valueOf(th)));
            return null;
        }
    }

    public static Surface createInputSurface(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return null;
        }
        try {
            return mediaCodec.createInputSurface();
        } catch (Throwable th) {
            f.a(th, ProtectedSandApp.s("埞\u0001"), ProtectedSandApp.s("埚\u0001"));
            return null;
        }
    }

    public static MediaCodec createMediaCodec(MediaCodecExceptionJni mediaCodecExceptionJni, String str) {
        MediaCodec mediaCodec;
        String s4 = ProtectedSandApp.s("域\u0001");
        String s5 = ProtectedSandApp.s("埚\u0001");
        try {
            mediaCodec = MediaCodec.createEncoderByType(str);
        } catch (Exception e4) {
            e = e4;
            mediaCodec = null;
        } catch (Throwable th) {
            th = th;
            mediaCodec = null;
        }
        try {
            LiteavLog.i(s5, ProtectedSandApp.s("埠\u0001"), mediaCodec.getName());
            if (isSoftOnlyEncoder(mediaCodec.getCodecInfo())) {
                throw new Exception(ProtectedSandApp.s("埡\u0001"));
            }
            return mediaCodec;
        } catch (Exception e5) {
            e = e5;
            handleException(mediaCodecExceptionJni, e);
            LiteavLog.e(s5, s4.concat(String.valueOf(e)));
            destroyMediaCodec(mediaCodec);
            return null;
        } catch (Throwable th2) {
            th = th2;
            handleThrowable(mediaCodecExceptionJni, th);
            LiteavLog.e(s5, s4.concat(String.valueOf(th)));
            destroyMediaCodec(mediaCodec);
            return null;
        }
    }

    public static void destroyMediaCodec(MediaCodec mediaCodec) {
        String s4 = ProtectedSandApp.s("埚\u0001");
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Throwable th) {
            f.a(th, ProtectedSandApp.s("埢\u0001"), s4);
        }
        try {
            mediaCodec.release();
        } catch (Throwable th2) {
            f.a(th2, ProtectedSandApp.s("埣\u0001"), s4);
        }
        LiteavLog.i(s4, ProtectedSandApp.s("埤\u0001").concat(String.valueOf(mediaCodec)));
    }

    public static int drainOutputBuffer(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec, MediaCodecFrameJni mediaCodecFrameJni, int i4) {
        String s4 = ProtectedSandApp.s("埥\u0001");
        String s5 = ProtectedSandApp.s("埚\u0001");
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(i4));
            if (dequeueOutputBuffer == -1) {
                return 4;
            }
            if (dequeueOutputBuffer == -2) {
                try {
                    LiteavLog.i(s5, ProtectedSandApp.s("埦\u0001"), mediaCodec.getOutputFormat());
                } catch (Throwable unused) {
                }
                return 3;
            }
            if (dequeueOutputBuffer == -3) {
                return 3;
            }
            if (dequeueOutputBuffer < 0) {
                return -1;
            }
            if (bufferInfo.size == 0 && (4 & bufferInfo.flags) == 0) {
                LiteavLog.e(s5, ProtectedSandApp.s("埧\u0001"));
                return -1;
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? mediaCodec.getOutputBuffer(dequeueOutputBuffer) : mediaCodec.getOutputBuffers()[dequeueOutputBuffer];
            if (outputBuffer == null) {
                return -1;
            }
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
            mediaCodecFrameJni.data = allocateDirect;
            allocateDirect.put(outputBuffer);
            int i5 = bufferInfo.flags;
            boolean z4 = (i5 & 1) > 0;
            boolean z5 = (i5 & 2) > 0;
            mediaCodecFrameJni.nalType = z4 ? c.f72210b : c.f72211c;
            mediaCodecFrameJni.pts = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            if (z5 && z4) {
                return 1;
            }
            return z5 ? 2 : 0;
        } catch (Exception e4) {
            handleException(mediaCodecExceptionJni, e4);
            LiteavLog.e(s5, s4, e4);
            return -1;
        } catch (Throwable th) {
            handleThrowable(mediaCodecExceptionJni, th);
            LiteavLog.e(s5, s4, th);
            return -1;
        }
    }

    public static int feedYuvBufferToMediaCodec(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec, ByteBuffer byteBuffer, long j4, int i4) {
        String s4 = ProtectedSandApp.s("埨\u0001");
        String s5 = ProtectedSandApp.s("埚\u0001");
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(timeUnit.toMicros(i4));
            if (dequeueInputBuffer < 0) {
                return 1;
            }
            ByteBuffer byteBuffer2 = mediaCodec.getInputBuffers()[dequeueInputBuffer];
            byteBuffer2.clear();
            byteBuffer2.put(byteBuffer);
            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, byteBuffer.capacity(), timeUnit.toMicros(j4), 0);
            return 0;
        } catch (Exception e4) {
            handleException(mediaCodecExceptionJni, e4);
            LiteavLog.e(s5, s4.concat(String.valueOf(e4)));
            return -1;
        } catch (Throwable th) {
            handleThrowable(mediaCodecExceptionJni, th);
            LiteavLog.e(s5, s4.concat(String.valueOf(th)));
            return -1;
        }
    }

    public static int getIntFromMediaFormat(MediaFormat mediaFormat, String str, int i4) {
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger(str);
            } catch (Throwable th) {
                f.a(th, ProtectedSandApp.s("埩\u0001"), ProtectedSandApp.s("埚\u0001"));
            }
        }
        return i4;
    }

    private static void handleException(MediaCodecExceptionJni mediaCodecExceptionJni, Exception exc) {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            mediaCodecExceptionJni.hasException = true;
            mediaCodecExceptionJni.systemErrorCode = -1;
            mediaCodecExceptionJni.isErrorRecoverable = false;
        } else if (!(exc instanceof MediaCodec.CodecException)) {
            mediaCodecExceptionJni.hasException = true;
            mediaCodecExceptionJni.systemErrorCode = -1;
            mediaCodecExceptionJni.isErrorRecoverable = false;
        } else {
            mediaCodecExceptionJni.hasException = true;
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) exc;
            mediaCodecExceptionJni.systemErrorCode = codecException.getErrorCode();
            mediaCodecExceptionJni.isErrorRecoverable = codecException.isRecoverable() || codecException.isTransient();
        }
    }

    public static void handleThrowable(MediaCodecExceptionJni mediaCodecExceptionJni, Throwable th) {
        mediaCodecExceptionJni.hasException = true;
        mediaCodecExceptionJni.systemErrorCode = -2;
        mediaCodecExceptionJni.isErrorRecoverable = false;
    }

    private static boolean isSoftOnlyEncoder(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        if (LiteavSystemInfo.getSystemOSVersionInt() <= 29) {
            return mediaCodecInfo.getName().contains(ProtectedSandApp.s("埪\u0001")) || mediaCodecInfo.getName().contains(ProtectedSandApp.s("埫\u0001"));
        }
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    public static void releaseSurface(Surface surface) {
        if (surface != null) {
            try {
                surface.release();
            } catch (Throwable th) {
                f.a(th, ProtectedSandApp.s("埬\u0001"), ProtectedSandApp.s("埚\u0001"));
            }
        }
    }

    public static void requestKeyFrame(MediaCodec mediaCodec) {
        if (LiteavSystemInfo.getSystemOSVersionInt() <= 19 || mediaCodec == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(ProtectedSandApp.s("埭\u0001"), 0);
            mediaCodec.setParameters(bundle);
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("埚\u0001"), ProtectedSandApp.s("埮\u0001"), th);
        }
    }

    public static void setCallBack(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec, MediaCodec.Callback callback) {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21 || mediaCodec == null || callback == null) {
            return;
        }
        try {
            mediaCodec.setCallback(callback);
        } catch (Throwable th) {
            handleThrowable(mediaCodecExceptionJni, th);
            LiteavLog.e(ProtectedSandApp.s("埚\u0001"), ProtectedSandApp.s("埯\u0001").concat(String.valueOf(th)));
        }
    }

    private static void setMaxBFramesToMediaFormat(MediaFormat mediaFormat, int i4) {
        if (i4 <= 0 || LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            return;
        }
        mediaFormat.setInteger(ProtectedSandApp.s("埰\u0001"), i4);
    }

    public static boolean startMediaCodec(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec) {
        String s4 = ProtectedSandApp.s("埱\u0001");
        String s5 = ProtectedSandApp.s("埚\u0001");
        if (mediaCodec == null) {
            return false;
        }
        try {
            mediaCodec.start();
            return true;
        } catch (Exception e4) {
            handleException(mediaCodecExceptionJni, e4);
            LiteavLog.e(s5, s4.concat(String.valueOf(e4)));
            return false;
        } catch (Throwable th) {
            handleThrowable(mediaCodecExceptionJni, th);
            LiteavLog.e(s5, s4.concat(String.valueOf(th)));
            return false;
        }
    }

    public static void stopMediaCodec(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Throwable th) {
                f.a(th, ProtectedSandApp.s("埢\u0001"), ProtectedSandApp.s("埚\u0001"));
            }
        }
    }

    public static boolean updateBitrate(MediaCodec mediaCodec, int i4) {
        if (mediaCodec != null && LiteavSystemInfo.getSystemOSVersionInt() >= 19) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt(ProtectedSandApp.s("埲\u0001"), i4);
                mediaCodec.setParameters(bundle);
                return true;
            } catch (Throwable th) {
                f.a(th, ProtectedSandApp.s("埳\u0001"), ProtectedSandApp.s("埚\u0001"));
            }
        }
        return false;
    }
}
