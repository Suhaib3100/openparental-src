package com.tencent.liteav.videobase.egl;

import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import java.util.concurrent.atomic.AtomicInteger;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class EGLCore {
    private static final long DESTROY_EGL_CORE_DELAY_TIME_MS = 100;
    private static final int MAX_EGL_CORE_COUNT = 50;
    private e<?> mEglHelper;
    private boolean mIsOffScreen = false;
    private Object mSharedContext;
    private static final String TAG = ProtectedSandApp.s("哵\u0001");
    private static final l sSequenceTaskRunner = new l();
    private static final AtomicInteger sEGLCoreCount = new AtomicInteger();

    public static EGLCore create(Object obj) {
        EGLCore eGLCore = new EGLCore();
        try {
            eGLCore.initialize(obj, null, 128, 128);
            eGLCore.makeCurrent();
            return eGLCore;
        } catch (d e4) {
            LiteavLog.e(ProtectedSandApp.s("哵\u0001"), ProtectedSandApp.s("哶\u0001"), e4);
            return null;
        }
    }

    public static void destroy(EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        if (eGLCore.mIsOffScreen) {
            destroyAsync(eGLCore);
        } else {
            destroySync(eGLCore);
        }
    }

    public static void destroyAsync(EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        eGLCore.unmakeCurrent();
        sSequenceTaskRunner.a(c.a(eGLCore), 100L);
    }

    public static void destroySync(EGLCore eGLCore) {
        String s4 = ProtectedSandApp.s("哵\u0001");
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.unmakeCurrent();
            eGLCore.uninitialize();
            LiteavLog.i(s4, ProtectedSandApp.s("哷\u0001").concat(String.valueOf(eGLCore)));
        } catch (d e4) {
            LiteavLog.e(s4, ProtectedSandApp.s("哸\u0001"), e4);
        }
    }

    static /* synthetic */ void lambda$destroyAsync$0(EGLCore eGLCore) {
        String s4 = ProtectedSandApp.s("哵\u0001");
        try {
            eGLCore.unmakeCurrent();
            eGLCore.uninitialize();
            LiteavLog.i(s4, ProtectedSandApp.s("哹\u0001").concat(String.valueOf(eGLCore)));
        } catch (d e4) {
            LiteavLog.e(s4, ProtectedSandApp.s("哺\u0001"), e4);
        }
    }

    private void uninitialize() throws d {
        e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.c();
            this.mEglHelper = null;
        }
        this.mSharedContext = null;
        sEGLCoreCount.decrementAndGet();
    }

    public Object getEglContext() {
        e<?> eVar = this.mEglHelper;
        if (eVar == null) {
            return null;
        }
        return eVar.f();
    }

    public Object getSharedContext() {
        return this.mSharedContext;
    }

    public Size getSurfaceSize() {
        e<?> eVar = this.mEglHelper;
        return eVar == null ? new Size(0, 0) : eVar.e();
    }

    public void initialize(Object obj, Surface surface, int i4, int i5) throws d {
        this.mIsOffScreen = surface == null;
        if (obj == null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
                this.mEglHelper = b.a((EGLContext) null, surface, i4, i5);
            } else {
                this.mEglHelper = a.a((javax.microedition.khronos.egl.EGLContext) null, surface, i4, i5);
            }
        } else if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            this.mEglHelper = a.a((javax.microedition.khronos.egl.EGLContext) obj, surface, i4, i5);
        } else {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 17 || !(obj instanceof EGLContext)) {
                throw new d(0, ProtectedSandApp.s("唁\u0001"));
            }
            this.mEglHelper = b.a((EGLContext) obj, surface, i4, i5);
        }
        this.mSharedContext = obj;
        LiteavLog.i(ProtectedSandApp.s("哵\u0001"), ProtectedSandApp.s("哻\u0001") + Thread.currentThread().getId() + ProtectedSandApp.s("哼\u0001") + obj + ProtectedSandApp.s("哽\u0001") + surface + ProtectedSandApp.s("哾\u0001") + i4 + ProtectedSandApp.s("哿\u0001") + i5 + ProtectedSandApp.s("唀\u0001") + sEGLCoreCount.incrementAndGet());
    }

    public void makeCurrent() throws d {
        e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.b();
        }
    }

    public void setPresentationTime(long j4) {
        e<?> eVar = this.mEglHelper;
        if (eVar == null || !(eVar instanceof b)) {
            return;
        }
        b bVar = (b) eVar;
        EGLExt.eglPresentationTimeANDROID(bVar.f72242a, bVar.f72243b, j4);
    }

    public void swapBuffers() throws d {
        e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void unmakeCurrent() {
        e<?> eVar = this.mEglHelper;
        if (eVar != null) {
            eVar.d();
        }
    }
}
