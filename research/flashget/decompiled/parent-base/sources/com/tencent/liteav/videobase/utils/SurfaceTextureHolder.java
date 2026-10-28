package com.tencent.liteav.videobase.utils;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class SurfaceTextureHolder implements SurfaceTexture.OnFrameAvailableListener {
    private CustomHandler mCallbackHandler;
    private SurfaceTexture.OnFrameAvailableListener mOnFrameAvailableListener;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private final String mTag = ProtectedSandApp.s("唴\u0001") + Integer.toHexString(hashCode());
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();

    public SurfaceTextureHolder(int i4, boolean z4) {
        this.mSurfaceTexture = new SurfaceTexture(i4);
        if (z4) {
            this.mSurface = new Surface(this.mSurfaceTexture);
        }
    }

    static /* synthetic */ void lambda$onFrameAvailable$0(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = surfaceTextureHolder.mOnFrameAvailableListener;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    public float[] getTransformMatrix(boolean z4, float f4, float f5, float f6, float f7) {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        String s4 = ProtectedSandApp.s("唵\u0001");
        if (surfaceTexture == null) {
            LiteavLog.e(this.mThrottlers.a(s4), this.mTag, ProtectedSandApp.s("唶\u0001"), new Object[0]);
            return null;
        }
        float[] fArr = new float[16];
        try {
            surfaceTexture.getTransformMatrix(fArr);
        } catch (Throwable th) {
            LiteavLog.w(this.mThrottlers.a(s4), this.mTag, ProtectedSandApp.s("唷\u0001").concat(String.valueOf(th)), new Object[0]);
        }
        if (z4) {
            if (!com.tencent.liteav.base.util.f.a(f4, 0.0f) || !com.tencent.liteav.base.util.f.a(f5, 0.0f)) {
                Matrix.translateM(fArr, 0, f4, f5, 0.0f);
            }
            if (!com.tencent.liteav.base.util.f.a(f6, 1.0f) || !com.tencent.liteav.base.util.f.a(f7, 1.0f)) {
                Matrix.scaleM(fArr, 0, f6, f7, 1.0f);
            }
        }
        return fArr;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        CustomHandler customHandler = this.mCallbackHandler;
        if (customHandler != null) {
            customHandler.runOrPost(f.a(this, surfaceTexture));
        }
    }

    public void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
    }

    public void setDefaultBufferSize(int i4, int i5) {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i4, i5);
        } else {
            LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("唸\u0001")), this.mTag, ProtectedSandApp.s("唹\u0001"), new Object[0]);
        }
    }

    public void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        if (this.mSurfaceTexture == null) {
            LiteavLog.e(this.mThrottlers.a(ProtectedSandApp.s("唺\u0001")), this.mTag, ProtectedSandApp.s("唻\u0001"), new Object[0]);
            return;
        }
        this.mCallbackHandler = new CustomHandler(handler != null ? handler.getLooper() : Looper.getMainLooper());
        this.mOnFrameAvailableListener = onFrameAvailableListener;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            this.mSurfaceTexture.setOnFrameAvailableListener(this, this.mCallbackHandler);
        } else {
            this.mSurfaceTexture.setOnFrameAvailableListener(this);
        }
    }

    public void updateTexImage() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        String s4 = ProtectedSandApp.s("唼\u0001");
        if (surfaceTexture == null) {
            LiteavLog.e(this.mThrottlers.a(s4), this.mTag, ProtectedSandApp.s("唽\u0001"), new Object[0]);
            return;
        }
        try {
            surfaceTexture.updateTexImage();
        } catch (Throwable th) {
            LiteavLog.w(this.mThrottlers.a(s4), this.mTag, ProtectedSandApp.s("唷\u0001").concat(String.valueOf(th)), new Object[0]);
        }
    }
}
