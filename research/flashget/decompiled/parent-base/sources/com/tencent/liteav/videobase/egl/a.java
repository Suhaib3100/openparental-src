package com.tencent.liteav.videobase.egl;

import android.opengl.GLES20;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;

/* loaded from: classes7.dex */
public final class a implements e<EGLContext> {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f72230i = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f72231j = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: b, reason: collision with root package name */
    private final int f72233b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72234c;

    /* renamed from: g, reason: collision with root package name */
    private EGL10 f72238g;

    /* renamed from: h, reason: collision with root package name */
    private EGLConfig f72239h;

    /* renamed from: d, reason: collision with root package name */
    private EGLDisplay f72235d = EGL10.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    private EGLContext f72236e = EGL10.EGL_NO_CONTEXT;

    /* renamed from: f, reason: collision with root package name */
    private EGLSurface f72237f = EGL10.EGL_NO_SURFACE;

    /* renamed from: a, reason: collision with root package name */
    private final String f72232a = ProtectedSandApp.s("唂\u0001") + hashCode();

    private a(int i4, int i5) {
        this.f72233b = i4;
        this.f72234c = i5;
    }

    public static a a(EGLContext eGLContext, Surface surface, int i4, int i5) throws d {
        a aVar = new a(i4, i5);
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            aVar.f72238g = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            aVar.f72235d = eglGetDisplay;
            int i6 = 2;
            aVar.f72238g.eglInitialize(eglGetDisplay, new int[2]);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            aVar.f72238g.eglChooseConfig(aVar.f72235d, surface == null ? f72230i : f72231j, eGLConfigArr, 1, new int[1]);
            aVar.f72239h = eGLConfigArr[0];
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                try {
                    aVar.f72236e = aVar.a(aVar.f72235d, aVar.f72239h, 2, eGLContext);
                } catch (d unused) {
                    LiteavLog.i(aVar.f72232a, ProtectedSandApp.s("唃\u0001"));
                    i6 = 3;
                    aVar.f72236e = aVar.a(aVar.f72235d, aVar.f72239h, 3, eGLContext);
                }
            } else {
                aVar.f72236e = aVar.a(aVar.f72235d, aVar.f72239h, 2, eGLContext);
            }
            LiteavLog.i(aVar.f72232a, ProtectedSandApp.s("唄\u0001") + aVar.f72236e + ProtectedSandApp.s("唅\u0001") + eGLContext + ProtectedSandApp.s("唆\u0001") + i6);
            if (surface == null) {
                aVar.f72237f = aVar.f72238g.eglCreatePbufferSurface(aVar.f72235d, aVar.f72239h, new int[]{12375, aVar.f72233b, 12374, aVar.f72234c, 12344});
            } else {
                try {
                    aVar.f72237f = aVar.f72238g.eglCreateWindowSurface(aVar.f72235d, aVar.f72239h, surface, null);
                } catch (Throwable th) {
                    throw new d(aVar.f72238g.eglGetError(), "", th);
                }
            }
            if (aVar.f72237f == EGL10.EGL_NO_SURFACE) {
                aVar.h();
            }
            EGL10 egl102 = aVar.f72238g;
            EGLDisplay eGLDisplay = aVar.f72235d;
            EGLSurface eGLSurface = aVar.f72237f;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, aVar.f72236e)) {
                aVar.h();
            }
            return aVar;
        } catch (d e4) {
            aVar.c();
            throw e4;
        }
    }

    private void g() throws d {
        EGLSurface eGLSurface = this.f72237f;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            d();
            if (!this.f72238g.eglDestroySurface(this.f72235d, this.f72237f)) {
                h();
            }
            this.f72237f = eGLSurface2;
        }
    }

    private void h() throws d {
        int eglGetError = this.f72238g.eglGetError();
        if (eglGetError != 12288) {
            throw new d(eglGetError);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void b() throws d {
        EGL10 egl10 = this.f72238g;
        EGLDisplay eGLDisplay = this.f72235d;
        EGLSurface eGLSurface = this.f72237f;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f72236e)) {
            return;
        }
        h();
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void c() throws d {
        EGLDisplay eGLDisplay = this.f72235d;
        EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
        if (eGLDisplay != eGLDisplay2) {
            d();
            g();
            EGLContext eGLContext = this.f72236e;
            EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
            if (eGLContext != eGLContext2) {
                LiteavLog.i(this.f72232a, ProtectedSandApp.s("唇\u0001") + this.f72236e);
                this.f72238g.eglDestroyContext(this.f72235d, this.f72236e);
                this.f72236e = eGLContext2;
            }
            this.f72238g.eglTerminate(this.f72235d);
        }
        this.f72235d = eGLDisplay2;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void d() {
        EGLDisplay eGLDisplay = this.f72235d;
        if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.f72238g;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final Size e() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        return (this.f72238g.eglQuerySurface(this.f72235d, this.f72237f, 12375, iArr) && this.f72238g.eglQuerySurface(this.f72235d, this.f72237f, 12374, iArr2)) ? new Size(iArr[0], iArr2[0]) : new Size(0, 0);
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final /* bridge */ /* synthetic */ EGLContext f() {
        return this.f72236e;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void a() throws d {
        GLES20.glFinish();
        if (this.f72238g.eglSwapBuffers(this.f72235d, this.f72237f)) {
            return;
        }
        h();
    }

    private EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i4, EGLContext eGLContext) throws d {
        int[] iArr = {12440, i4, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eglCreateContext = this.f72238g.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        h();
        return eglCreateContext;
    }
}
