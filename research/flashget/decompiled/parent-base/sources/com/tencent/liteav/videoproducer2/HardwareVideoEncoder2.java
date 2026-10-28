package com.tencent.liteav.videoproducer2;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.base.util.r;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.egl.d;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.frame.h;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.e;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.encoder.b;
import com.tencent.liteav.videoproducer.encoder.e;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class HardwareVideoEncoder2 {
    private EGLCore mEGLCore;
    private Surface mInputSurface;
    private long mNativeHandler;
    private final VideoEncodeParams mParams;
    private h mPixelFrameRenderer;
    private HWEncoderServerConfig mServerConfig;
    private b mSurfaceInputVideoEncoder;
    private String mTAG;
    private String mTraceId;
    private final Size mSurfaceSize = new Size(0, 0);
    private final AtomicBoolean mNeedRestart = new AtomicBoolean(false);
    private final Bundle mSessionStates = new Bundle();
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private long mPreFrameTimeStamp = 0;
    private final e.a mVideoEncoderListener = new e.a() { // from class: com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.1
        @Override // com.tencent.liteav.videoproducer.encoder.e.a
        public final void a() {
            HardwareVideoEncoder2.this.mNeedRestart.set(true);
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
        public final void onBitrateModeUpdated(VideoEncoderDef.BitrateMode bitrateMode) {
            HardwareVideoEncoder2 hardwareVideoEncoder2 = HardwareVideoEncoder2.this;
            hardwareVideoEncoder2.nativeOnBitrateModeUpdated(hardwareVideoEncoder2.mNativeHandler, bitrateMode.mValue);
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
        public final void onEncodedFail(e.a aVar) {
            e.a aVar2 = e.a.f72334a;
            HardwareVideoEncoder2.this.notifyEncodeFail();
        }

        @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.b
        public final synchronized void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z4) {
            if (HardwareVideoEncoder2.this.mNativeHandler == 0 || z4) {
                LiteavLog.d(HardwareVideoEncoder2.this.mTAG, ProtectedSandApp.s("垳\u0001"), Long.valueOf(HardwareVideoEncoder2.this.mNativeHandler), Boolean.valueOf(z4));
                return;
            }
            HardwareVideoEncoder2 hardwareVideoEncoder2 = HardwareVideoEncoder2.this;
            long j4 = hardwareVideoEncoder2.mNativeHandler;
            ByteBuffer byteBuffer = encodedVideoFrame.data;
            int i4 = encodedVideoFrame.nalType.mValue;
            int i5 = encodedVideoFrame.profileType.mValue;
            int i6 = encodedVideoFrame.codecType.mValue;
            int i7 = encodedVideoFrame.rotation;
            long j5 = encodedVideoFrame.dts;
            long j6 = encodedVideoFrame.pts;
            long j7 = encodedVideoFrame.gopIndex;
            long j10 = encodedVideoFrame.gopFrameIndex;
            long j11 = encodedVideoFrame.frameIndex;
            long j12 = encodedVideoFrame.refFrameIndex;
            int i10 = encodedVideoFrame.width;
            int i11 = encodedVideoFrame.height;
            Integer num = encodedVideoFrame.svcInfo;
            hardwareVideoEncoder2.nativeOnEncodedNAL(j4, encodedVideoFrame, byteBuffer, i4, i5, i6, i7, j5, j6, j7, j10, j11, j12, i10, i11, num != null, num == null ? 0 : num.intValue());
        }
    };

    public HardwareVideoEncoder2(long j4, String str, VideoEncodeParams videoEncodeParams) {
        this.mTraceId = str;
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str, ProtectedSandApp.s("垴\u0001"));
        a5.append(hashCode());
        this.mTAG = a5.toString();
        this.mNativeHandler = j4;
        this.mParams = videoEncodeParams;
    }

    public static PixelFrame createPixelFrameByTexture(int i4, int i5, int i6, int i7, long j4, int i10, boolean z4, boolean z5, int i11, Object obj) {
        if (i6 != GLConstants.a.f72175b.mValue) {
            GLConstants.a aVar = GLConstants.a.f72176c;
        }
        GLConstants.PixelFormatType.f72161f.getValue();
        PixelFrame pixelFrame = new PixelFrame(i4, i5, 0, i6, i7);
        pixelFrame.setMirrorHorizontal(z4);
        pixelFrame.setMirrorVertical(z5);
        pixelFrame.setTextureId(i11);
        pixelFrame.setGLContext(obj);
        pixelFrame.setRotation(k.a(i10));
        pixelFrame.setTimestamp(j4);
        return pixelFrame;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[Catch: d -> 0x0029, TryCatch #0 {d -> 0x0029, blocks: (B:6:0x0005, B:8:0x0016, B:11:0x001f, B:12:0x0035, B:14:0x0042, B:15:0x0048, B:17:0x0056, B:18:0x005f, B:20:0x007b, B:21:0x00a4, B:24:0x002c), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: d -> 0x0029, TryCatch #0 {d -> 0x0029, blocks: (B:6:0x0005, B:8:0x0016, B:11:0x001f, B:12:0x0035, B:14:0x0042, B:15:0x0048, B:17:0x0056, B:18:0x005f, B:20:0x007b, B:21:0x00a4, B:24:0x002c), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[Catch: d -> 0x0029, TryCatch #0 {d -> 0x0029, blocks: (B:6:0x0005, B:8:0x0016, B:11:0x001f, B:12:0x0035, B:14:0x0042, B:15:0x0048, B:17:0x0056, B:18:0x005f, B:20:0x007b, B:21:0x00a4, B:24:0x002c), top: B:5:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void drawFrameToInputSurface(com.tencent.liteav.videobase.frame.PixelFrame r7) {
        /*
            r6 = this;
            com.tencent.liteav.videobase.egl.EGLCore r0 = r6.mEGLCore
            if (r0 != 0) goto L5
            return
        L5:
            r0.makeCurrent()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.videobase.frame.PixelFrame r0 = new com.tencent.liteav.videobase.frame.PixelFrame     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r0.<init>(r7)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.base.util.k r7 = r0.getRotation()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.base.util.k r1 = com.tencent.liteav.base.util.k.f71940b     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r2 = 0
            if (r7 == r1) goto L2c
            com.tencent.liteav.base.util.k r7 = r0.getRotation()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.base.util.k r1 = com.tencent.liteav.base.util.k.f71942d     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            if (r7 != r1) goto L1f
            goto L2c
        L1f:
            boolean r7 = r0.isMirrorVertical()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r7 = r7 ^ 1
            r0.setMirrorVertical(r7)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            goto L35
        L29:
            r7 = move-exception
            goto Lbf
        L2c:
            boolean r7 = r0.isMirrorHorizontal()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r7 = r7 ^ 1
            r0.setMirrorHorizontal(r7)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
        L35:
            com.tencent.liteav.base.util.Size r7 = r6.mSurfaceSize     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            int r1 = r7.width     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            int r7 = r7.height     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.videobase.utils.OpenGlUtils.glViewport(r2, r2, r1, r7)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.videobase.frame.h r7 = r6.mPixelFrameRenderer     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            if (r7 == 0) goto L48
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r1 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.f72151a     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r2 = 0
            r7.a(r0, r1, r2)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
        L48:
            com.tencent.liteav.videoproducer.encoder.b r7 = r6.mSurfaceInputVideoEncoder     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            long r1 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            java.util.Deque<java.lang.Long> r3 = r7.f72623i     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            boolean r3 = r3.isEmpty()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            if (r3 == 0) goto L5f
            java.util.concurrent.atomic.AtomicLong r3 = r7.f72624j     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r3.set(r4)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
        L5f:
            java.util.Deque<java.lang.Long> r3 = r7.f72623i     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r3.addLast(r1)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.base.util.CustomHandler r7 = r7.f72617c     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r1 = 10
            r2 = 10
            r7.sendEmptyMessageDelayed(r1, r2)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            long r1 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            long r3 = r6.mPreFrameTimeStamp     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto La4
            java.lang.String r7 = r6.mTAG     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            java.lang.String r2 = "垵\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r1.<init>(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            long r2 = r6.mPreFrameTimeStamp     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r1.append(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            java.lang.String r2 = "垶\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r1.append(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            long r2 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r1.append(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            java.lang.String r1 = r1.toString()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.base.util.LiteavLog.e(r7, r1)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
        La4:
            long r1 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r6.mPreFrameTimeStamp = r1     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.videobase.egl.EGLCore r7 = r6.mEGLCore     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            long r2 = r0.getTimestamp()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            long r0 = r1.toNanos(r2)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r7.setPresentationTime(r0)     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            com.tencent.liteav.videobase.egl.EGLCore r7 = r6.mEGLCore     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            r7.swapBuffers()     // Catch: com.tencent.liteav.videobase.egl.d -> L29
            return
        Lbf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "垷\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            int r1 = r7.mErrorCode
            r0.append(r1)
            java.lang.String r1 = "垸\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.append(r1)
            java.lang.String r1 = r7.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.liteav.base.b.b r1 = r6.mThrottlers
            java.lang.String r2 = "垹\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            com.tencent.liteav.base.b.a r1 = r1.a(r2)
            java.lang.String r2 = r6.mTAG
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "垺\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            java.lang.String r0 = r3.concat(r0)
            com.tencent.liteav.base.util.LiteavLog.e(r1, r2, r0, r7)
            r6.notifyEncodeFail()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer2.HardwareVideoEncoder2.drawFrameToInputSurface(com.tencent.liteav.videobase.frame.PixelFrame):void");
    }

    public static Object getCurrentContext() {
        return OpenGlUtils.getCurrentContext();
    }

    private ServerVideoProducerConfig getServerVideoProducerConfig(HWEncoderServerConfig hWEncoderServerConfig) {
        ServerVideoProducerConfig serverVideoProducerConfig = new ServerVideoProducerConfig();
        serverVideoProducerConfig.setHardwareEncodeType(hWEncoderServerConfig.getHardwareEncodeType());
        serverVideoProducerConfig.setHardwareEncoderHighProfileEnable(hWEncoderServerConfig.getHardwareEncoderHighProfileEnable());
        serverVideoProducerConfig.setHardwareEncoderHighProfileSupport(hWEncoderServerConfig.getHardwareEncoderHighProfileSupport());
        Boolean isHardwareEncoderBitrateModeCBRSupported = hWEncoderServerConfig.isHardwareEncoderBitrateModeCBRSupported();
        if (isHardwareEncoderBitrateModeCBRSupported != null) {
            serverVideoProducerConfig.setHardwareEncoderBitrateModeCBRSupported(isHardwareEncoderBitrateModeCBRSupported.booleanValue());
        }
        return serverVideoProducerConfig;
    }

    private boolean initOpenGLComponents(Object obj, Surface surface) {
        if (surface == null) {
            LiteavLog.w(this.mThrottlers.a(ProtectedSandApp.s("垻\u0001")), this.mTAG, ProtectedSandApp.s("垼\u0001"), new Object[0]);
            return false;
        }
        LiteavLog.d(this.mThrottlers.a(ProtectedSandApp.s("垽\u0001")), this.mTAG, ProtectedSandApp.s("垾\u0001"), new Object[0]);
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            Size size = this.mSurfaceSize;
            eGLCore.initialize(obj, surface, size.width, size.height);
            Size size2 = this.mSurfaceSize;
            this.mPixelFrameRenderer = new h(size2.width, size2.height);
            return true;
        } catch (d e4) {
            LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("埀\u0001")), this.mTAG, ProtectedSandApp.s("埁\u0001").concat(String.valueOf(ProtectedSandApp.s("垿\u0001") + e4.mErrorCode + ProtectedSandApp.s("垸\u0001") + e4.getMessage())), e4);
            notifyStartEncodedFail();
            this.mEGLCore = null;
            return false;
        }
    }

    public static boolean isInUIThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnBitrateModeUpdated(long j4, int i4);

    private native void nativeOnEncodedFail(long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnEncodedNAL(long j4, EncodedVideoFrame encodedVideoFrame, ByteBuffer byteBuffer, int i4, int i5, int i6, int i7, long j5, long j6, long j7, long j10, long j11, long j12, int i10, int i11, boolean z4, int i12);

    private native void nativeOnStartEncodedFail(long j4);

    private boolean restart() {
        LiteavLog.d(this.mTAG, ProtectedSandApp.s("埂\u0001"));
        stop();
        return start();
    }

    private boolean start() {
        if (this.mSurfaceInputVideoEncoder != null) {
            return this.mInputSurface != null;
        }
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("埃\u0001"), this.mParams);
        b bVar = new b(this.mSessionStates, new com.tencent.liteav.videobase.videobase.d(), this.mTraceId);
        this.mSurfaceInputVideoEncoder = bVar;
        bVar.f72617c = new CustomHandler(Looper.myLooper()) { // from class: com.tencent.liteav.videoproducer.encoder.b.1
            public AnonymousClass1(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 10) {
                    b.this.c();
                }
            }
        };
        this.mSurfaceInputVideoEncoder.a(getServerVideoProducerConfig(this.mServerConfig));
        b bVar2 = this.mSurfaceInputVideoEncoder;
        VideoEncodeParams videoEncodeParams = this.mParams;
        e.a aVar = this.mVideoEncoderListener;
        LiteavLog.d(bVar2.f72615a, ProtectedSandApp.s("埄\u0001"));
        bVar2.f72619e = aVar;
        Surface a5 = bVar2.a(videoEncodeParams);
        LiteavLog.i(bVar2.f72615a, ProtectedSandApp.s("埅\u0001"));
        Size size = new Size(720, 1280);
        VideoEncodeParams videoEncodeParams2 = bVar2.f72620f;
        if (videoEncodeParams2 != null) {
            size.set(videoEncodeParams2.width, videoEncodeParams2.height);
        }
        Pair pair = new Pair(a5, size);
        this.mInputSurface = (Surface) pair.first;
        this.mSurfaceSize.set((Size) pair.second);
        if (this.mInputSurface != null) {
            return true;
        }
        notifyStartEncodedFail();
        return false;
    }

    private void stop() {
        uninitOpenGLComponents();
        Surface surface = this.mInputSurface;
        if (surface != null) {
            surface.release();
            this.mInputSurface = null;
        }
        b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            LiteavLog.i(bVar.f72615a, ProtectedSandApp.s("埆\u0001"));
            bVar.b();
            bVar.a();
            this.mSurfaceInputVideoEncoder.a();
            this.mSurfaceInputVideoEncoder = null;
        }
    }

    public void encodeFrame(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return;
        }
        if (!this.mNeedRestart.getAndSet(false) || restart()) {
            if (this.mSurfaceInputVideoEncoder != null || start()) {
                pixelFrame.getGLContext();
                if (this.mEGLCore != null || initOpenGLComponents(pixelFrame.getGLContext(), this.mInputSurface)) {
                    this.mSurfaceInputVideoEncoder.c();
                    drawFrameToInputSurface(pixelFrame);
                }
            }
        }
    }

    public synchronized void notifyEncodeFail() {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnEncodedFail(j4);
        }
    }

    public synchronized void notifyStartEncodedFail() {
        long j4 = this.mNativeHandler;
        if (j4 != 0) {
            nativeOnStartEncodedFail(j4);
        }
    }

    public synchronized void release() {
        LiteavLog.d(this.mTAG, ProtectedSandApp.s("埇\u0001"));
        this.mNativeHandler = 0L;
        stop();
    }

    public void requestKeyFrame() {
        b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void setBitrate(int i4) {
        MediaCodec mediaCodec;
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("埈\u0001").concat(String.valueOf(i4)));
        this.mParams.bitrate = i4;
        b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar == null) {
            return;
        }
        VideoEncodeParams videoEncodeParams = bVar.f72620f;
        if (videoEncodeParams == null) {
            LiteavLog.w(bVar.f72615a, ProtectedSandApp.s("埉\u0001") + i4 + ProtectedSandApp.s("埊\u0001"));
            return;
        }
        if (videoEncodeParams.bitrate != i4) {
            LiteavLog.i(bVar.f72615a, ProtectedSandApp.s("埋\u0001") + i4 + ProtectedSandApp.s("埌\u0001"));
            boolean z4 = false;
            if (i4 < bVar.f72620f.bitrate) {
                if (bVar.f72616b.getBoolean(ProtectedSandApp.s("埍\u0001"), false)) {
                    z4 = true;
                } else {
                    bVar.a(i4);
                }
            }
            bVar.f72620f.bitrate = i4;
            if (LiteavSystemInfo.getSystemOSVersionInt() < 19 || (mediaCodec = bVar.f72618d) == null) {
                return;
            }
            if (!z4) {
                bVar.a(mediaCodec, i4);
                return;
            }
            bVar.f72617c.removeCallbacks(bVar.f72625k);
            long elapsedRealtime = SystemClock.elapsedRealtime() - bVar.f72621g;
            if (elapsedRealtime >= TimeUnit.SECONDS.toMillis(2L)) {
                bVar.f72625k.run();
            } else {
                bVar.f72617c.postDelayed(bVar.f72625k, 2000 - elapsedRealtime);
            }
        }
    }

    public void setHWEncoderServerConfig(HWEncoderServerConfig hWEncoderServerConfig) {
        this.mServerConfig = hWEncoderServerConfig;
        b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            bVar.a(getServerVideoProducerConfig(hWEncoderServerConfig));
        }
    }

    public void signalEndOfStream() {
        final b bVar = this.mSurfaceInputVideoEncoder;
        if (bVar != null) {
            LiteavLog.i(bVar.f72615a, ProtectedSandApp.s("城\u0001"));
            MediaCodec mediaCodec = bVar.f72618d;
            if (mediaCodec != null) {
                try {
                    mediaCodec.signalEndOfInputStream();
                } catch (Throwable th) {
                    LiteavLog.e(bVar.f72615a, ProtectedSandApp.s("埏\u0001"), th);
                }
            }
            if (bVar.f72622h == null) {
                r rVar = new r(Looper.myLooper(), new r.a(bVar) { // from class: com.tencent.liteav.videoproducer.encoder.d

                    /* renamed from: a, reason: collision with root package name */
                    private final b f72643a;

                    {
                        this.f72643a = bVar;
                    }

                    @Override // com.tencent.liteav.base.util.r.a
                    public final void onTimeout() {
                        this.f72643a.c();
                    }
                });
                bVar.f72622h = rVar;
                rVar.a(30);
            }
        }
    }

    public void uninitOpenGLComponents() {
        if (this.mEGLCore == null) {
            return;
        }
        LiteavLog.d(this.mThrottlers.a(ProtectedSandApp.s("埐\u0001")), this.mTAG, ProtectedSandApp.s("埑\u0001"), new Object[0]);
        try {
            this.mEGLCore.makeCurrent();
            h hVar = this.mPixelFrameRenderer;
            if (hVar != null) {
                hVar.a();
                this.mPixelFrameRenderer = null;
            }
        } catch (d e4) {
            LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("埒\u0001")), this.mTAG, ProtectedSandApp.s("埓\u0001"), e4);
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }
}
