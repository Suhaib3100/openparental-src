package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker;
import com.tencent.rtmp.ui.TXCloudVideoView;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public abstract class RenderViewHelperInterface {
    private static final String TAG = ProtectedSandApp.s("嘇\u0001");

    /* renamed from: com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72431a;

        static {
            int[] iArr = new int[DisplayTarget.a.values().length];
            f72431a = iArr;
            try {
                iArr[DisplayTarget.a.f72323b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72431a[DisplayTarget.a.f72322a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72431a[DisplayTarget.a.f72324c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72431a[DisplayTarget.a.f72325d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface RenderViewListener {
        void onRequestRedraw(Bitmap bitmap);

        void onSurfaceChanged(Surface surface, boolean z4);

        void onSurfaceDestroy();
    }

    public static RenderViewHelperInterface create(String str, DisplayTarget displayTarget, RenderViewListener renderViewListener) {
        Surface surface;
        TextureView textureView;
        SurfaceView surfaceView;
        TXCloudVideoView tXCloudVideoView;
        String s4 = ProtectedSandApp.s("嘇\u0001");
        if (displayTarget == null || displayTarget.getType() == null) {
            LiteavLog.w(s4, ProtectedSandApp.s("嘊\u0001").concat(String.valueOf(displayTarget)));
            return null;
        }
        int i4 = AnonymousClass1.f72431a[displayTarget.getType().ordinal()];
        if (i4 == 1) {
            surface = null;
            textureView = null;
            surfaceView = displayTarget.getSurfaceView();
            tXCloudVideoView = null;
        } else if (i4 != 2) {
            if (i4 == 3) {
                surface = displayTarget.getSurface();
                tXCloudVideoView = null;
            } else if (i4 != 4) {
                surface = null;
                tXCloudVideoView = null;
            } else {
                TXCloudVideoView tXCloudVideoView2 = displayTarget.getTXCloudVideoView();
                if (tXCloudVideoView2 == null) {
                    LiteavLog.w(s4, ProtectedSandApp.s("嘈\u0001"));
                    surfaceView = null;
                    textureView = null;
                    tXCloudVideoView = tXCloudVideoView2;
                    surface = null;
                } else {
                    SurfaceView surfaceView2 = tXCloudVideoView2.getSurfaceView();
                    textureView = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView2);
                    surfaceView = surfaceView2;
                    tXCloudVideoView = tXCloudVideoView2;
                    surface = null;
                }
            }
            surfaceView = tXCloudVideoView;
            textureView = surfaceView;
        } else {
            surface = null;
            tXCloudVideoView = null;
            textureView = displayTarget.getTextureView();
            surfaceView = null;
        }
        if (surfaceView != null) {
            return new e(str, surfaceView, renderViewListener);
        }
        if (textureView != null) {
            return new j(str, textureView, renderViewListener);
        }
        if (surface != null) {
            return new a(str, surface, renderViewListener);
        }
        if (tXCloudVideoView != null) {
            return new j(str, tXCloudVideoView, renderViewListener);
        }
        LiteavLog.w(s4, ProtectedSandApp.s("嘉\u0001").concat(String.valueOf(displayTarget)));
        return null;
    }

    public static GLConstants.GLScaleType createScaleType(int i4) {
        return GLConstants.GLScaleType.a(i4);
    }

    public static void releaseSurface(Surface surface) {
        if (surface != null) {
            surface.release();
        }
    }

    public static void setBackgroundColor(DisplayTarget displayTarget, int i4) {
        TXCloudVideoView tXCloudVideoView;
        if (displayTarget == null || displayTarget.getType() == null) {
            LiteavLog.w(ProtectedSandApp.s("嘇\u0001"), ProtectedSandApp.s("嘊\u0001").concat(String.valueOf(displayTarget)));
        } else if (AnonymousClass1.f72431a[displayTarget.getType().ordinal()] == 4 && (tXCloudVideoView = displayTarget.getTXCloudVideoView()) != null) {
            TXCCloudVideoViewMethodInvoker.setBackgroundColorForInternalView(tXCloudVideoView, i4);
        }
    }

    public abstract void checkViewAvailability();

    public abstract void enableNonUniformScale(boolean z4);

    public abstract Matrix getTransformMatrix(int i4, int i5);

    public abstract boolean isUsingTextureView();

    public abstract boolean isVisible();

    public abstract void release(boolean z4);

    public abstract void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i4, int i5, boolean z4);

    public static RenderViewHelperInterface create(DisplayTarget displayTarget, RenderViewListener renderViewListener) {
        return create("", displayTarget, renderViewListener);
    }
}
