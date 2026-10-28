package com.tencent.liteav.videobase.frame;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.egl.EGLCore;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class PixelFrameFactory {
    private EGLSurface mCallerEGLDrawSurface;
    private EGLSurface mCallerEGLReadSurface;
    private e mGLTexturePool;
    private final Size mLastFrameSize;
    private h mPixelFrameRenderer;
    private EGLCore mRenderEGLCore;
    private final com.tencent.liteav.base.b.b mThrottlers;
    private final String mTAG = ProtectedSandApp.s("唖\u0001") + hashCode();
    private Object mSharedEGLContext = null;
    private EGLDisplay mCallerEGLDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLContext mCallerEGLContext = EGL14.EGL_NO_CONTEXT;

    public PixelFrameFactory() {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.mCallerEGLReadSurface = eGLSurface;
        this.mCallerEGLDrawSurface = eGLSurface;
        this.mLastFrameSize = new Size();
        this.mThrottlers = new com.tencent.liteav.base.b.b();
    }

    private PixelFrame copyTexture(PixelFrame pixelFrame) {
        if (this.mGLTexturePool == null) {
            this.mGLTexturePool = new e();
        }
        d a5 = this.mGLTexturePool.a(pixelFrame.getWidth(), pixelFrame.getHeight());
        if (this.mLastFrameSize.width != pixelFrame.getWidth() || this.mLastFrameSize.height != pixelFrame.getHeight()) {
            h hVar = this.mPixelFrameRenderer;
            if (hVar != null) {
                hVar.a();
                this.mPixelFrameRenderer = null;
            }
            this.mLastFrameSize.width = pixelFrame.getWidth();
            this.mLastFrameSize.height = pixelFrame.getHeight();
        }
        if (this.mPixelFrameRenderer == null) {
            this.mPixelFrameRenderer = new h(pixelFrame.getWidth(), pixelFrame.getHeight());
        }
        this.mPixelFrameRenderer.a(pixelFrame, GLConstants.GLScaleType.f72153c, a5);
        PixelFrame a6 = a5.a(pixelFrame.getGLContext());
        a5.release();
        return a6;
    }

    private PixelFrame deepCopyDataToPixelFrame(PixelFrame pixelFrame, Object obj) {
        if (obj instanceof byte[]) {
            byte[] a5 = com.tencent.liteav.videobase.utils.d.a(((byte[]) obj).length);
            if (a5 == null) {
                return null;
            }
            System.arraycopy(obj, 0, a5, 0, a5.length);
            pixelFrame.setData(a5);
        } else if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            ByteBuffer b5 = com.tencent.liteav.videobase.utils.d.b(byteBuffer.capacity());
            if (b5 == null) {
                return null;
            }
            byteBuffer.rewind();
            b5.put(byteBuffer);
            b5.rewind();
            pixelFrame.setBuffer(b5);
        }
        pixelFrame.retain();
        return pixelFrame;
    }

    private PixelFrame deepCopyTextureToPixelFrame(PixelFrame pixelFrame, Object obj) {
        saveCallerEGLContext();
        GLES20.glFinish();
        if (!CommonUtil.equals(this.mSharedEGLContext, obj)) {
            uninitOpenGLComponents();
            initRenderEGLContext(obj);
        }
        if (makeCurrent()) {
            PixelFrame copyTexture = copyTexture(pixelFrame);
            GLES20.glFinish();
            restoreCallerEGLContext();
            return copyTexture;
        }
        LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("唗\u0001")), this.mTAG, ProtectedSandApp.s("唘\u0001"), new Object[0]);
        pixelFrame.retain();
        return pixelFrame;
    }

    private void initRenderEGLContext(Object obj) {
        if (this.mRenderEGLCore != null) {
            return;
        }
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("唙\u0001"));
        this.mSharedEGLContext = obj;
        EGLCore eGLCore = new EGLCore();
        this.mRenderEGLCore = eGLCore;
        try {
            eGLCore.initialize(obj, null, 128, 128);
        } catch (com.tencent.liteav.videobase.egl.d e4) {
            this.mRenderEGLCore = null;
            LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("唚\u0001")), this.mTAG, ProtectedSandApp.s("唛\u0001"), e4);
        }
    }

    private boolean makeCurrent() {
        EGLCore eGLCore = this.mRenderEGLCore;
        if (eGLCore == null) {
            LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("唜\u0001")), this.mTAG, ProtectedSandApp.s("唝\u0001"), new Object[0]);
            return false;
        }
        try {
            eGLCore.makeCurrent();
            return true;
        } catch (com.tencent.liteav.videobase.egl.d e4) {
            LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("唞\u0001")), this.mTAG, ProtectedSandApp.s("唟\u0001"), e4);
            return false;
        }
    }

    private void restoreCallerEGLContext() {
        if (!CommonUtil.equals(this.mCallerEGLContext, EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglMakeCurrent(this.mCallerEGLDisplay, this.mCallerEGLDrawSurface, this.mCallerEGLReadSurface, this.mCallerEGLContext);
            return;
        }
        EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetCurrentDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
    }

    private void saveCallerEGLContext() {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (CommonUtil.equals(this.mCallerEGLContext, EGL14.EGL_NO_CONTEXT) || !CommonUtil.equals(eglGetCurrentContext, this.mCallerEGLContext)) {
            this.mCallerEGLContext = eglGetCurrentContext;
            this.mCallerEGLDisplay = EGL14.eglGetCurrentDisplay();
            this.mCallerEGLReadSurface = EGL14.eglGetCurrentSurface(12378);
            this.mCallerEGLDrawSurface = EGL14.eglGetCurrentSurface(12377);
        }
    }

    private PixelFrame shallowCopyDataToPixelFrame(PixelFrame pixelFrame, Object obj) {
        if (obj instanceof byte[]) {
            pixelFrame.setData((byte[]) obj);
        } else if (obj instanceof ByteBuffer) {
            pixelFrame.setBuffer((ByteBuffer) obj);
        }
        pixelFrame.retain();
        return pixelFrame;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r2 = deepCopyDataToPixelFrame(r0, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.tencent.liteav.videobase.frame.PixelFrame create(int r2, int r3, int r4, long r5, int r7, int r8, int r9, java.lang.Object r10, java.lang.Object r11, boolean r12) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.tencent.liteav.videobase.frame.PixelFrame r0 = new com.tencent.liteav.videobase.frame.PixelFrame     // Catch: java.lang.Throwable -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L40
            r0.setWidth(r2)     // Catch: java.lang.Throwable -> L40
            r0.setHeight(r3)     // Catch: java.lang.Throwable -> L40
            com.tencent.liteav.base.util.k r2 = com.tencent.liteav.base.util.k.a(r4)     // Catch: java.lang.Throwable -> L40
            r0.setRotation(r2)     // Catch: java.lang.Throwable -> L40
            r0.setTimestamp(r5)     // Catch: java.lang.Throwable -> L40
            r0.setGLContext(r10)     // Catch: java.lang.Throwable -> L40
            r0.setTextureId(r9)     // Catch: java.lang.Throwable -> L40
            com.tencent.liteav.videobase.base.GLConstants$a r2 = com.tencent.liteav.videobase.base.GLConstants.a.a(r7)     // Catch: java.lang.Throwable -> L40
            r0.setPixelBufferType(r2)     // Catch: java.lang.Throwable -> L40
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r2 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.a(r8)     // Catch: java.lang.Throwable -> L40
            r0.setPixelFormatType(r2)     // Catch: java.lang.Throwable -> L40
            com.tencent.liteav.videobase.base.GLConstants$a r2 = r0.getPixelBufferType()     // Catch: java.lang.Throwable -> L40
            com.tencent.liteav.videobase.base.GLConstants$a r3 = com.tencent.liteav.videobase.base.GLConstants.a.f72177d     // Catch: java.lang.Throwable -> L40
            if (r2 == r3) goto L42
            com.tencent.liteav.videobase.base.GLConstants$a r2 = r0.getPixelBufferType()     // Catch: java.lang.Throwable -> L40
            com.tencent.liteav.videobase.base.GLConstants$a r3 = com.tencent.liteav.videobase.base.GLConstants.a.f72174a     // Catch: java.lang.Throwable -> L40
            if (r2 != r3) goto L3b
            goto L42
        L3b:
            com.tencent.liteav.videobase.frame.PixelFrame r2 = r1.deepCopyTextureToPixelFrame(r0, r10)     // Catch: java.lang.Throwable -> L40
            goto L4d
        L40:
            r2 = move-exception
            goto L4f
        L42:
            if (r12 == 0) goto L49
            com.tencent.liteav.videobase.frame.PixelFrame r2 = r1.deepCopyDataToPixelFrame(r0, r11)     // Catch: java.lang.Throwable -> L40
            goto L4d
        L49:
            com.tencent.liteav.videobase.frame.PixelFrame r2 = r1.shallowCopyDataToPixelFrame(r0, r11)     // Catch: java.lang.Throwable -> L40
        L4d:
            monitor-exit(r1)
            return r2
        L4f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.frame.PixelFrameFactory.create(int, int, int, long, int, int, int, java.lang.Object, java.lang.Object, boolean):com.tencent.liteav.videobase.frame.PixelFrame");
    }

    public synchronized void release(PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            pixelFrame.release();
        }
    }

    public synchronized void uninitOpenGLComponents() {
        try {
            if (this.mRenderEGLCore == null) {
                return;
            }
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("唠\u0001"));
            if (makeCurrent()) {
                e eVar = this.mGLTexturePool;
                if (eVar != null) {
                    eVar.a();
                    this.mGLTexturePool.b();
                    this.mGLTexturePool = null;
                }
                h hVar = this.mPixelFrameRenderer;
                if (hVar != null) {
                    hVar.a();
                    this.mPixelFrameRenderer = null;
                }
            }
            EGLCore.destroy(this.mRenderEGLCore);
            this.mRenderEGLCore = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
