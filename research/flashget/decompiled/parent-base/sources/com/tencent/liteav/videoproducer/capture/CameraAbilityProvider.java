package com.tencent.liteav.videoproducer.capture;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class CameraAbilityProvider {
    public static int getCamera2SupportLevel() {
        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("噰\u0001"));
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            if (cameraIdList.length > 0) {
                return getSystemHardwareLevel(cameraManager, cameraIdList);
            }
            return -1;
        } catch (Throwable th) {
            com.tencent.liteav.videobase.common.f.a(th, ProtectedSandApp.s("噱\u0001"), ProtectedSandApp.s("噲\u0001"));
            return -1;
        }
    }

    private static int getSystemHardwareLevel(CameraManager cameraManager, String[] strArr) throws Throwable {
        int i4 = -1;
        for (String str : strArr) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num2 == null) {
                    return -1;
                }
                i4 = num2.intValue();
            }
        }
        return i4;
    }
}
