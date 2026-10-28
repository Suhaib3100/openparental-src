package com.tencent.liteav.videobase.videobase;

import android.view.TextureView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.ui.AndroidViewEventListener;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.reflect.Method;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class TXCCloudVideoViewMethodInvoker {
    private static final String TAG = ProtectedSandApp.s("喃\u0001");

    public static void addViewInternal(TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        callMethod(tXCloudVideoView, ProtectedSandApp.s("喂\u0001"), new Class[]{TextureView.class}, textureView);
    }

    private static Object callMethod(TXCloudVideoView tXCloudVideoView, String str, Class<?>[] clsArr, Object... objArr) {
        String s4 = ProtectedSandApp.s("喃\u0001");
        if (tXCloudVideoView == null) {
            LiteavLog.w(s4, str + ProtectedSandApp.s("善\u0001"));
            return null;
        }
        try {
            Method declaredMethod = TXCloudVideoView.class.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(tXCloudVideoView, objArr);
        } catch (Throwable th) {
            LiteavLog.e(s4, str + ProtectedSandApp.s("喅\u0001"), th);
            return null;
        }
    }

    public static TextureView getFreeTextureView(TXCloudVideoView tXCloudVideoView) {
        Object callMethod = callMethod(tXCloudVideoView, ProtectedSandApp.s("喆\u0001"), new Class[0], new Object[0]);
        if (callMethod instanceof TextureView) {
            return (TextureView) callMethod;
        }
        return null;
    }

    public static Object getGLContextFromView(DisplayTarget displayTarget) {
        if (displayTarget == null || displayTarget.getTXCloudVideoView() == null) {
            return null;
        }
        return displayTarget.getTXCloudVideoView().getOpenGLContext();
    }

    public static TextureView getTextureViewSetByUser(TXCloudVideoView tXCloudVideoView) {
        Object callMethod = callMethod(tXCloudVideoView, ProtectedSandApp.s("喇\u0001"), new Class[0], new Object[0]);
        if (callMethod instanceof TextureView) {
            return (TextureView) callMethod;
        }
        return null;
    }

    public static void notifyFirstFrameRendered(TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        callMethod(tXCloudVideoView, ProtectedSandApp.s("喈\u0001"), new Class[]{TextureView.class}, textureView);
    }

    public static void removeViewInternal(TXCloudVideoView tXCloudVideoView, TextureView textureView, boolean z4) {
        callMethod(tXCloudVideoView, ProtectedSandApp.s("喉\u0001"), new Class[]{TextureView.class, Boolean.TYPE}, textureView, Boolean.valueOf(z4));
    }

    public static void setAndroidViewEventListener(TXCloudVideoView tXCloudVideoView, AndroidViewEventListener androidViewEventListener) {
        callMethod(tXCloudVideoView, ProtectedSandApp.s("喊\u0001"), new Class[]{AndroidViewEventListener.class}, androidViewEventListener);
    }

    public static void setBackgroundColorForInternalView(TXCloudVideoView tXCloudVideoView, int i4) {
        callMethod(tXCloudVideoView, ProtectedSandApp.s("喋\u0001"), new Class[]{Integer.TYPE}, Integer.valueOf(i4));
    }

    public static void setTouchToFocusEnabled(TXCloudVideoView tXCloudVideoView, boolean z4) {
        callMethod(tXCloudVideoView, ProtectedSandApp.s("喌\u0001"), new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
    }

    public static void setZoomEnabled(TXCloudVideoView tXCloudVideoView, boolean z4) {
        callMethod(tXCloudVideoView, ProtectedSandApp.s("喍\u0001"), new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
    }

    public static void showFocusView(TXCloudVideoView tXCloudVideoView, int i4, int i5, int i6, int i7) {
        Class cls = Integer.TYPE;
        Object[] objArr = {Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)};
        callMethod(tXCloudVideoView, ProtectedSandApp.s("喎\u0001"), new Class[]{cls, cls, cls, cls}, objArr);
    }
}
