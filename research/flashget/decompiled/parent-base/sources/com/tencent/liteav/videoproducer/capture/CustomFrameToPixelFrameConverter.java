package com.tencent.liteav.videoproducer.capture;

import android.opengl.GLES20;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.frame.h;
import com.tencent.liteav.videobase.utils.OpenGlUtils;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class CustomFrameToPixelFrameConverter {
    private static final String TAG = ProtectedSandApp.s("噽\u0001");
    private final Object mSharedContext;
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private EGLCore mEGLCore = null;
    private h mPixelFrameRenderer = null;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool = null;
    private int mWidth = 0;
    private int mHeight = 0;

    public CustomFrameToPixelFrameConverter(Object obj) {
        this.mSharedContext = obj;
    }

    private void initializeGLComponents(int i4, int i5, PixelFrame pixelFrame) {
        EGLCore eGLCore = this.mEGLCore;
        String s4 = ProtectedSandApp.s("噽\u0001");
        if (eGLCore != null) {
            LiteavLog.w(this.mThrottlers.a(ProtectedSandApp.s("噾\u0001")), s4, ProtectedSandApp.s("噿\u0001"), new Object[0]);
            return;
        }
        Object gLContext = pixelFrame.getGLContext() != null ? pixelFrame.getGLContext() : this.mSharedContext;
        try {
            EGLCore eGLCore2 = new EGLCore();
            this.mEGLCore = eGLCore2;
            eGLCore2.initialize(gLContext, null, i4, i5);
            this.mEGLCore.makeCurrent();
            LiteavLog.i(this.mThrottlers.a(ProtectedSandApp.s("嚀\u0001")), s4, ProtectedSandApp.s("嚁\u0001") + i4 + ProtectedSandApp.s("嚂\u0001") + i5 + ProtectedSandApp.s("嚃\u0001") + gLContext, new Object[0]);
        } catch (com.tencent.liteav.videobase.egl.d e4) {
            LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("嚄\u0001")), s4, ProtectedSandApp.s("嚅\u0001"), e4);
            this.mEGLCore = null;
        }
        if (this.mEGLCore != null) {
            this.mGLTexturePool = new com.tencent.liteav.videobase.frame.e();
            if (this.mPixelFrameRenderer == null) {
                this.mPixelFrameRenderer = new h(i4, i5);
            }
        }
    }

    private boolean isNeedRecreateEGL(PixelFrame pixelFrame, EGLCore eGLCore) {
        return (pixelFrame.getHeight() == this.mHeight && pixelFrame.getWidth() == this.mWidth && !(pixelFrame.getGLContext() != null && !CommonUtil.equals(pixelFrame.getGLContext(), eGLCore.getSharedContext()))) ? false : true;
    }

    private void uninitializedGLComponents() {
        String s4 = ProtectedSandApp.s("噽\u0001");
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.makeCurrent();
        } catch (com.tencent.liteav.videobase.egl.d e4) {
            LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("嚆\u0001")), s4, ProtectedSandApp.s("嚇\u0001"), e4);
        }
        LiteavLog.i(this.mThrottlers.a(ProtectedSandApp.s("嚈\u0001")), s4, ProtectedSandApp.s("嚉\u0001"), new Object[0]);
        h hVar = this.mPixelFrameRenderer;
        if (hVar != null) {
            hVar.a();
            this.mPixelFrameRenderer = null;
        }
        com.tencent.liteav.videobase.frame.e eVar = this.mGLTexturePool;
        if (eVar != null) {
            eVar.a();
            this.mGLTexturePool.b();
            this.mGLTexturePool = null;
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public PixelFrame convertFrame(PixelFrame pixelFrame) {
        String s4 = ProtectedSandApp.s("噽\u0001");
        if (pixelFrame == null) {
            LiteavLog.w(s4, ProtectedSandApp.s("嚊\u0001"));
            return null;
        }
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null || isNeedRecreateEGL(pixelFrame, eGLCore)) {
            this.mWidth = pixelFrame.getWidth();
            this.mHeight = pixelFrame.getHeight();
            uninitializedGLComponents();
            initializeGLComponents(this.mWidth, this.mHeight, pixelFrame);
        }
        EGLCore eGLCore2 = this.mEGLCore;
        if (eGLCore2 == null || this.mGLTexturePool == null || this.mPixelFrameRenderer == null) {
            return null;
        }
        try {
            eGLCore2.makeCurrent();
        } catch (com.tencent.liteav.videobase.egl.d e4) {
            LiteavLog.e(s4, ProtectedSandApp.s("嚋\u0001"), e4);
        }
        OpenGlUtils.glViewport(0, 0, this.mWidth, this.mHeight);
        com.tencent.liteav.videobase.frame.d a5 = this.mGLTexturePool.a(this.mWidth, this.mHeight);
        this.mPixelFrameRenderer.a(pixelFrame, GLConstants.GLScaleType.f72151a, a5);
        GLES20.glFinish();
        PixelFrame a6 = a5.a(this.mEGLCore.getEglContext());
        a6.setTimestamp(pixelFrame.getTimestamp());
        a5.release();
        return a6;
    }

    public void release() {
        uninitializedGLComponents();
    }

    public void releaseFrame(PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            pixelFrame.release();
        }
    }
}
