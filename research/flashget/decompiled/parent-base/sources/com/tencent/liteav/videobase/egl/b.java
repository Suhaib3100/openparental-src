package com.tencent.liteav.videobase.egl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import org.webrtc.EglBase;

/* loaded from: classes7.dex */
public final class b implements e<EGLContext> {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f72240h = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f72241i = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: d, reason: collision with root package name */
    private final int f72245d;

    /* renamed from: e, reason: collision with root package name */
    private final int f72246e;

    /* renamed from: f, reason: collision with root package name */
    private EGLConfig f72247f = null;

    /* renamed from: a, reason: collision with root package name */
    EGLDisplay f72242a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: g, reason: collision with root package name */
    private EGLContext f72248g = EGL14.EGL_NO_CONTEXT;

    /* renamed from: b, reason: collision with root package name */
    EGLSurface f72243b = EGL14.EGL_NO_SURFACE;

    /* renamed from: c, reason: collision with root package name */
    private final String f72244c = ProtectedSandApp.s("唈\u0001") + hashCode();

    private b(int i4, int i5) {
        this.f72245d = i4;
        this.f72246e = i5;
    }

    public static b a(EGLContext eGLContext, Surface surface, int i4, int i5) throws d {
        b bVar = new b(i4, i5);
        try {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            bVar.f72242a = eglGetDisplay;
            if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                LiteavLog.e(bVar.f72244c, ProtectedSandApp.s("唎\u0001"));
                throw new d(0);
            }
            int i6 = 2;
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                bVar.f72242a = null;
                LiteavLog.e(bVar.f72244c, ProtectedSandApp.s("唍\u0001"));
                throw new d(0);
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(bVar.f72242a, surface == null ? f72241i : f72240h, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new d(0);
            }
            bVar.f72247f = eGLConfigArr[0];
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                try {
                    bVar.f72248g = a(bVar.f72242a, bVar.f72247f, 2, eGLContext);
                } catch (d unused) {
                    LiteavLog.i(bVar.f72244c, ProtectedSandApp.s("唉\u0001"));
                    bVar.f72248g = a(bVar.f72242a, bVar.f72247f, 3, eGLContext);
                    i6 = 3;
                }
            } else {
                bVar.f72248g = a(bVar.f72242a, bVar.f72247f, 2, eGLContext);
            }
            LiteavLog.i(bVar.f72244c, ProtectedSandApp.s("唊\u0001") + bVar.f72248g + ProtectedSandApp.s("唋\u0001") + eGLContext + ProtectedSandApp.s("唌\u0001") + i6);
            if (surface == null) {
                bVar.f72243b = EGL14.eglCreatePbufferSurface(bVar.f72242a, bVar.f72247f, new int[]{12375, bVar.f72245d, 12374, bVar.f72246e, 12344}, 0);
            } else {
                try {
                    bVar.f72243b = EGL14.eglCreateWindowSurface(bVar.f72242a, bVar.f72247f, surface, new int[]{12344}, 0);
                } catch (Throwable th) {
                    throw new d(EGL14.eglGetError(), "", th);
                }
            }
            g();
            EGLDisplay eGLDisplay = bVar.f72242a;
            EGLSurface eGLSurface = bVar.f72243b;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.f72248g)) {
                g();
            }
            return bVar;
        } catch (d e4) {
            bVar.c();
            throw e4;
        }
    }

    private static void g() throws d {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new d(eglGetError);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void b() throws d {
        EGLDisplay eGLDisplay = this.f72242a;
        EGLSurface eGLSurface = this.f72243b;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f72248g)) {
            return;
        }
        g();
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void c() {
        EGLDisplay eGLDisplay = this.f72242a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = this.f72243b;
            if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f72242a, eGLSurface2);
                this.f72243b = EGL14.EGL_NO_SURFACE;
            }
            if (this.f72248g != EGL14.EGL_NO_CONTEXT) {
                LiteavLog.i(this.f72244c, ProtectedSandApp.s("唏\u0001") + this.f72248g);
                EGL14.eglDestroyContext(this.f72242a, this.f72248g);
                this.f72248g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f72242a);
        }
        this.f72242a = EGL14.EGL_NO_DISPLAY;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void d() {
        EGLDisplay eGLDisplay = this.f72242a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final Size e() {
        int[] iArr = new int[2];
        return (EGL14.eglQuerySurface(this.f72242a, this.f72243b, 12375, iArr, 0) && EGL14.eglQuerySurface(this.f72242a, this.f72243b, 12374, iArr, 1)) ? new Size(iArr[0], iArr[1]) : new Size(0, 0);
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final /* bridge */ /* synthetic */ EGLContext f() {
        return this.f72248g;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void a() throws d {
        GLES20.glFinish();
        if (EGL14.eglSwapBuffers(this.f72242a, this.f72243b)) {
            return;
        }
        g();
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i4, EGLContext eGLContext) throws d {
        int[] iArr = {12440, i4, 12344};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        g();
        return eglCreateContext;
    }
}
