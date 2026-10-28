package com.tencent.liteav.device;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.device.TXDeviceManager;

@JNINamespace("liteav::manager")
/* loaded from: classes7.dex */
public class TXDeviceManagerImpl implements TXDeviceManager {
    private long mNativeDeviceMgr;

    static class CameraCaptureParam {
        private TXDeviceManager.TXCameraCaptureParam mParams;

        public CameraCaptureParam(TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam) {
            this.mParams = tXCameraCaptureParam;
        }

        public int getHeight() {
            return this.mParams.height;
        }

        public int getMode() {
            return TXDeviceManagerImpl.cameraCaptureModeAsInt(this.mParams.mode);
        }

        public int getWidth() {
            return this.mParams.width;
        }
    }

    public TXDeviceManagerImpl(long j4) {
        this.mNativeDeviceMgr = j4;
    }

    public static int audioRouteAsInt(TXDeviceManager.TXAudioRoute tXAudioRoute) {
        return (tXAudioRoute != TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone && tXAudioRoute == TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece) ? 1 : 0;
    }

    public static TXDeviceManager.TXAudioRoute audioRouteFromInt(int i4) {
        return i4 == 0 ? TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone : i4 == 1 ? TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece : TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone;
    }

    public static int cameraCaptureModeAsInt(TXDeviceManager.TXCameraCaptureMode tXCameraCaptureMode) {
        if (tXCameraCaptureMode == TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto) {
            return 0;
        }
        if (tXCameraCaptureMode == TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyPerformance) {
            return 1;
        }
        if (tXCameraCaptureMode == TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyHighQuality) {
            return 2;
        }
        return tXCameraCaptureMode == TXDeviceManager.TXCameraCaptureMode.TXCameraCaptureManual ? 3 : 0;
    }

    public static TXDeviceManager.TXCameraCaptureMode cameraCaptureModeFromInt(int i4) {
        return i4 == 0 ? TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto : i4 == 1 ? TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyPerformance : i4 == 2 ? TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyHighQuality : i4 == 3 ? TXDeviceManager.TXCameraCaptureMode.TXCameraCaptureManual : TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto;
    }

    private static native void nativeDestroy(long j4);

    private static native int nativeEnableCameraAutoFocus(long j4, boolean z4);

    private static native boolean nativeEnableCameraTorch(long j4, boolean z4);

    private static native float nativeGetCameraZoomMaxRatio(long j4);

    private static native boolean nativeIsAutoFocusEnabled(long j4);

    private static native boolean nativeIsCameraAutoFocusFaceModeSupported(long j4);

    private static native boolean nativeIsCameraFocusPositionInPreviewSupported(long j4);

    private static native boolean nativeIsCameraTorchSupported(long j4);

    private static native boolean nativeIsCameraZoomSupported(long j4);

    private static native boolean nativeIsFrontCamera(long j4);

    private static native boolean nativeIsLowLatencyEarMonitorSupported(long j4);

    private static native int nativeSetAudioRoute(long j4, int i4);

    private static native void nativeSetCameraCapturerParam(long j4, CameraCaptureParam cameraCaptureParam);

    private static native int nativeSetCameraFocusPosition(long j4, int i4, int i5);

    private static native int nativeSetCameraZoomRatio(long j4, float f4);

    private static native int nativeSetExposureCompensation(long j4, float f4);

    private static native int nativeSetSystemVolumeType(long j4, int i4);

    private static native int nativeSwitchCamera(long j4, boolean z4);

    public static int systemVolumeTypeAsInt(TXDeviceManager.TXSystemVolumeType tXSystemVolumeType) {
        if (tXSystemVolumeType == TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto) {
            return 0;
        }
        if (tXSystemVolumeType == TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia) {
            return 1;
        }
        return tXSystemVolumeType == TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP ? 2 : 0;
    }

    public static TXDeviceManager.TXSystemVolumeType systemVolumeTypefromInt(int i4) {
        return i4 == 0 ? TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto : i4 == 1 ? TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia : i4 == 2 ? TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP : TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int enableCameraAutoFocus(boolean z4) {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeEnableCameraAutoFocus(j4, z4);
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean enableCameraTorch(boolean z4) {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeEnableCameraTorch(j4, z4);
        }
        return false;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            nativeDestroy(j4);
            this.mNativeDeviceMgr = 0L;
        }
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public float getCameraZoomMaxRatio() {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeGetCameraZoomMaxRatio(j4);
        }
        return 0.0f;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean isAutoFocusEnabled() {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeIsAutoFocusEnabled(j4);
        }
        return false;
    }

    public boolean isCameraAutoFocusFaceModeSupported() {
        long j4 = this.mNativeDeviceMgr;
        if (j4 == 0) {
            return false;
        }
        return nativeIsCameraAutoFocusFaceModeSupported(j4);
    }

    public boolean isCameraFocusPositionInPreviewSupported() {
        long j4 = this.mNativeDeviceMgr;
        if (j4 == 0) {
            return false;
        }
        return nativeIsCameraFocusPositionInPreviewSupported(j4);
    }

    public boolean isCameraTorchSupported() {
        long j4 = this.mNativeDeviceMgr;
        if (j4 == 0) {
            return false;
        }
        return nativeIsCameraTorchSupported(j4);
    }

    public boolean isCameraZoomSupported() {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeIsCameraZoomSupported(j4);
        }
        return false;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean isFrontCamera() {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeIsFrontCamera(j4);
        }
        return false;
    }

    public boolean isLowLatencyEarMonitorSupported() {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeIsLowLatencyEarMonitorSupported(j4);
        }
        return false;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setAudioRoute(TXDeviceManager.TXAudioRoute tXAudioRoute) {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeSetAudioRoute(j4, audioRouteAsInt(tXAudioRoute));
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public void setCameraCapturerParam(TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam) {
        long j4 = this.mNativeDeviceMgr;
        if (j4 == 0 || tXCameraCaptureParam == null) {
            return;
        }
        nativeSetCameraCapturerParam(j4, new CameraCaptureParam(tXCameraCaptureParam));
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setCameraFocusPosition(int i4, int i5) {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeSetCameraFocusPosition(j4, i4, i5);
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setCameraZoomRatio(float f4) {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeSetCameraZoomRatio(j4, f4);
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setExposureCompensation(float f4) {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeSetExposureCompensation(j4, f4);
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setSystemVolumeType(TXDeviceManager.TXSystemVolumeType tXSystemVolumeType) {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeSetSystemVolumeType(j4, systemVolumeTypeAsInt(tXSystemVolumeType));
        }
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int switchCamera(boolean z4) {
        long j4 = this.mNativeDeviceMgr;
        if (j4 != 0) {
            return nativeSwitchCamera(j4, z4);
        }
        return 0;
    }
}
