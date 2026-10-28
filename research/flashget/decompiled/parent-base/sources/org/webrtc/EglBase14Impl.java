package org.webrtc;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.os.Build;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import org.apache.log4j.Logger;
import org.webrtc.EglBase14;

@TargetApi(18)
/* loaded from: classes9.dex */
class EglBase14Impl implements EglBase14 {
    private static final int EGLExt_SDK_VERSION = 18;

    @androidx.annotation.q0
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
    private static final String TAG = ProtectedSandApp.s("ꐎ\u0001");
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꐎ\u0001"));
    private static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;

    public static class Context implements EglBase14.Context {
        private final EGLContext egl14Context;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        @Override // org.webrtc.EglBase.Context
        @TargetApi(21)
        public long getNativeEglContext() {
            return EglBase14Impl.CURRENT_SDK_VERSION >= 21 ? this.egl14Context.getNativeHandle() : this.egl14Context.getHandle();
        }

        @Override // org.webrtc.EglBase14.Context
        public EGLContext getRawContext() {
            return this.egl14Context;
        }
    }

    public EglBase14Impl(EGLContext eGLContext, int[] iArr) {
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        this.eglConfig = getEglConfig(eglDisplay, iArr);
        int openGlesVersionFromConfig = EglBase.getOpenGlesVersionFromConfig(iArr);
        com.flashget.commonx.billing.j.a(ProtectedSandApp.s("ꐏ\u0001"), openGlesVersionFromConfig, logger);
        this.eglContext = createEglContext(eGLContext, this.eglDisplay, this.eglConfig, openGlesVersionFromConfig);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException(ProtectedSandApp.s("ꐐ\u0001"));
        }
    }

    private static EGLContext createEglContext(@androidx.annotation.q0 EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i4) {
        EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == EGL14.EGL_NO_CONTEXT) {
            throw new RuntimeException(ProtectedSandApp.s("ꐑ\u0001"));
        }
        int[] iArr = {12440, i4, 12344};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new GLException(EGL14.eglGetError(), ProtectedSandApp.s("ꐒ\u0001") + Integer.toHexString(EGL14.eglGetError()));
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꐓ\u0001"));
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException(ProtectedSandApp.s("ꐕ\u0001"));
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
        this.eglSurface = eglCreateWindowSurface;
        if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new GLException(EGL14.eglGetError(), ProtectedSandApp.s("ꐔ\u0001") + Integer.toHexString(EGL14.eglGetError()));
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw new GLException(EGL14.eglGetError(), ProtectedSandApp.s("ꐘ\u0001") + Integer.toHexString(EGL14.eglGetError()));
        }
        if (iArr2[0] <= 0) {
            throw new RuntimeException(ProtectedSandApp.s("ꐗ\u0001"));
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new RuntimeException(ProtectedSandApp.s("ꐖ\u0001"));
    }

    private static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new GLException(EGL14.eglGetError(), ProtectedSandApp.s("ꐚ\u0001") + Integer.toHexString(EGL14.eglGetError()));
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new GLException(EGL14.eglGetError(), ProtectedSandApp.s("ꐙ\u0001") + Integer.toHexString(EGL14.eglGetError()));
    }

    public static boolean isEGL14Supported() {
        Logger logger2 = logger;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꐛ\u0001"));
        int i4 = CURRENT_SDK_VERSION;
        sb.append(i4);
        sb.append(ProtectedSandApp.s("ꐜ\u0001"));
        com.flashget.kid.common.components.s.a(sb, i4 >= 18, logger2);
        return i4 >= 18;
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i4, int i5) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException(ProtectedSandApp.s("ꐕ\u0001"));
        }
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i4, 12374, i5, 12344}, 0);
        this.eglSurface = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        int eglGetError = EGL14.eglGetError();
        StringBuilder a5 = androidx.collection.n1.a(ProtectedSandApp.s("ꐝ\u0001"), i4, ProtectedSandApp.s("ꐞ\u0001"), i5, ProtectedSandApp.s("ꐟ\u0001"));
        a5.append(Integer.toHexString(EGL14.eglGetError()));
        throw new GLException(eglGetError, a5.toString());
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        String s4 = ProtectedSandApp.s("ꐠ\u0001");
        synchronized (EglBase.lock) {
            try {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    throw new GLException(EGL14.eglGetError(), s4 + Integer.toHexString(EGL14.eglGetError()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL14.EGL_NO_SURFACE;
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        String s4 = ProtectedSandApp.s("ꐡ\u0001");
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException(ProtectedSandApp.s("ꐢ\u0001"));
        }
        synchronized (EglBase.lock) {
            try {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw new GLException(EGL14.eglGetError(), s4 + Integer.toHexString(EGL14.eglGetError()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        synchronized (EglBase.lock) {
            EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        }
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException(ProtectedSandApp.s("ꐣ\u0001"));
        }
        synchronized (EglBase.lock) {
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j4) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j4);
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new RuntimeException(ProtectedSandApp.s("ꐣ\u0001"));
    }
}
