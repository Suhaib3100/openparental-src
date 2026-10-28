package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Process;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.base.util.q;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public abstract class CameraControllerInterface {
    public static final int CAMERA_ERROR_DEVICE = 4;
    public static final int CAMERA_ERROR_DISABLED = 2;
    public static final int CAMERA_ERROR_OCCUPIED = 1;
    public static final int CAMERA_ERROR_SERVER_DIED = 3;
    public static final int CAMERA_ERROR_UNKNOWN = 0;
    public static final int CAMERA_FACE_AE_STRATEGY_ALWAYS_ON = 1;
    public static final int CAMERA_FACE_AE_STRATEGY_BACK_ONLY = 3;
    public static final int CAMERA_FACE_AE_STRATEGY_FRONT_ONLY = 2;
    public static final int CAMERA_FACE_AE_STRATEGY_OFF = 0;
    private static final String TAG = ProtectedSandApp.s("噺\u0001");

    /* renamed from: com.tencent.liteav.videoproducer.capture.CameraControllerInterface$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72487a;

        static {
            int[] iArr = new int[a.values().length];
            f72487a = iArr;
            try {
                iArr[a.f72490c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72487a[a.f72489b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum a {
        f72488a(0),
        f72489b(1),
        f72490c(2);

        private final int mValue;

        a(int i4) {
            this.mValue = i4;
        }

        public static a a(int i4) {
            for (a aVar : values()) {
                if (aVar.mValue == i4) {
                    return aVar;
                }
            }
            return f72489b;
        }
    }

    public static CameraControllerInterface createCameraController(int i4, final Handler handler) {
        CameraControllerInterface aVar;
        a a5 = a.a(i4);
        if (AnonymousClass1.f72487a[a5.ordinal()] != 1) {
            aVar = new com.tencent.liteav.videoproducer.capture.a.a();
        } else {
            handler.getClass();
            aVar = new com.tencent.liteav.videoproducer.capture.b.a(new q(handler) { // from class: com.tencent.liteav.videoproducer.capture.a

                /* renamed from: a, reason: collision with root package name */
                private final Handler f72497a;

                {
                    this.f72497a = handler;
                }

                @Override // com.tencent.liteav.base.util.q
                public final void a(Runnable runnable) {
                    this.f72497a.post(runnable);
                }
            });
        }
        LiteavLog.i(ProtectedSandApp.s("噺\u0001"), ProtectedSandApp.s("噸\u0001") + a5 + ProtectedSandApp.s("噹\u0001") + aVar);
        return aVar;
    }

    public static boolean hasCameraPermission() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return true;
        }
        return applicationContext.checkPermission(ProtectedSandApp.s("噻\u0001"), Process.myPid(), Process.myUid()) == 0;
    }

    public abstract void enableCameraDynamicFps(boolean z4);

    public abstract void enableFaceDetection(boolean z4);

    public abstract void enableTapToFocus(boolean z4);

    public abstract FaceRect getCameraFaceRect();

    public abstract k getCameraSystemRotation();

    public abstract int getCameraSystemRotationValue();

    public abstract int getCurrentCameraISO();

    public abstract float getExposureCompensationStep();

    public abstract int getMaxZoom();

    public abstract Size getPreviewSize();

    public abstract boolean isCameraAutoFocusFaceModeSupported();

    public abstract boolean isCameraFocusPositionInPreviewSupported();

    public abstract boolean isCurrentPreviewSizeAspectRatioMatch(int i4, int i5, boolean z4);

    public abstract boolean isTorchSupported();

    public abstract boolean isZoomSupported();

    public abstract void setCameraRotationCorrectionValue(int i4);

    public abstract void setExposureCompensation(int i4);

    public abstract void setExposureCompensationNormalization(float f4);

    public abstract void setFaceAEStrategy(int i4);

    public abstract void setZoom(float f4);

    public abstract void startAutoFocusAtPosition(int i4, int i5);

    public abstract boolean startCapture(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, CameraEventCallback cameraEventCallback);

    public abstract void stopCapture();

    public abstract void turnOnTorch(boolean z4);
}
