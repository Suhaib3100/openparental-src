package com.tencent.liteav.videoproducer.producer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.k;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class ServerVideoProducerConfig {
    private k gsensorRotationCorrection;
    private Boolean hardwareEncoderBitrateModeCBRSupported;
    private final String mTAG = ProtectedSandApp.s("垡\u0001") + hashCode();
    private int hardwareEncodeType = 2;
    private boolean hardwareEncoderHighProfileEnable = true;
    private boolean hardwareEncoderHighProfileSupport = true;
    private int camera2SupportMinApiLevel = Integer.MAX_VALUE;
    private int cameraRotationCorrection = 0;
    private boolean mEnableCameraFpsCorrectionLogic = true;

    private k cameraCloudConfigEnumToRotation(int i4) {
        if (i4 == 1) {
            return k.f71939a;
        }
        if (i4 == 2) {
            return k.f71940b;
        }
        if (i4 == 3) {
            return k.f71941c;
        }
        if (i4 != 4) {
            return null;
        }
        return k.f71942d;
    }

    public static boolean isHWHevcEncodeAllowed() {
        return nativeIsHardwareHevcEncodeAllowed();
    }

    private static native boolean nativeIsHardwareHevcEncodeAllowed();

    public int getCamera2SupportMinApiLevel() {
        return this.camera2SupportMinApiLevel;
    }

    public String getCameraRotationCorrectionInfo() {
        return ProtectedSandApp.s("垢\u0001") + getCameraV1FrontRotationCorrection() + ProtectedSandApp.s("垣\u0001") + getCameraV1BackRotationCorrection() + ProtectedSandApp.s("垤\u0001") + getCameraV2FrontRotationCorrection() + ProtectedSandApp.s("垥\u0001") + getCameraV2BackRotationCorrection() + ProtectedSandApp.s("垦\u0001");
    }

    public k getCameraV1BackRotationCorrection() {
        return cameraCloudConfigEnumToRotation((this.cameraRotationCorrection >> 8) & 255);
    }

    public k getCameraV1FrontRotationCorrection() {
        return cameraCloudConfigEnumToRotation(this.cameraRotationCorrection & 255);
    }

    public k getCameraV2BackRotationCorrection() {
        return cameraCloudConfigEnumToRotation((this.cameraRotationCorrection >> 24) & 255);
    }

    public k getCameraV2FrontRotationCorrection() {
        return cameraCloudConfigEnumToRotation((this.cameraRotationCorrection >> 16) & 255);
    }

    public k getGsensorRotationCorrection() {
        return this.gsensorRotationCorrection;
    }

    public boolean isCameraFpsCorrectionLogicEnabled() {
        return this.mEnableCameraFpsCorrectionLogic;
    }

    public boolean isHardwareEncoderAllowed() {
        return this.hardwareEncodeType != 0;
    }

    public Boolean isHardwareEncoderBitrateModeCBRSupported() {
        return this.hardwareEncoderBitrateModeCBRSupported;
    }

    public boolean isHardwareEncoderHighProfileAllowed() {
        return this.hardwareEncodeType == 2 && this.hardwareEncoderHighProfileEnable && this.hardwareEncoderHighProfileSupport;
    }

    public void setCamera2SupportMinApiLevel(int i4) {
        this.camera2SupportMinApiLevel = i4;
    }

    public void setCameraFpsCorrectionLogicEnabled(boolean z4) {
        this.mEnableCameraFpsCorrectionLogic = z4;
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("垧\u0001").concat(String.valueOf(z4)));
    }

    public void setCameraRotationCorrection(int i4) {
        this.cameraRotationCorrection = i4;
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("垨\u0001"), Integer.valueOf(i4));
    }

    public void setGSensorRotationCorrection(int i4) {
        if (i4 < 0 || i4 > 3) {
            return;
        }
        this.gsensorRotationCorrection = k.a(i4 * 90);
    }

    public void setHardwareEncodeType(int i4) {
        this.hardwareEncodeType = i4;
    }

    public void setHardwareEncoderBitrateModeCBRSupported(boolean z4) {
        this.hardwareEncoderBitrateModeCBRSupported = Boolean.valueOf(z4);
    }

    public void setHardwareEncoderHighProfileEnable(boolean z4) {
        this.hardwareEncoderHighProfileEnable = z4;
    }

    public void setHardwareEncoderHighProfileSupport(boolean z4) {
        this.hardwareEncoderHighProfileSupport = z4;
    }

    public String toString() {
        return ProtectedSandApp.s("垩\u0001") + this.hardwareEncodeType + ProtectedSandApp.s("垪\u0001") + this.hardwareEncoderHighProfileEnable + ProtectedSandApp.s("垫\u0001") + this.hardwareEncoderHighProfileSupport + ProtectedSandApp.s("垬\u0001") + this.camera2SupportMinApiLevel + ProtectedSandApp.s("垭\u0001") + this.hardwareEncoderBitrateModeCBRSupported + ProtectedSandApp.s("垮\u0001") + this.gsensorRotationCorrection + ProtectedSandApp.s("垯\u0001") + getCameraRotationCorrectionInfo();
    }
}
