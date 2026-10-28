package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class NativeCapturerParamCreator {
    public static Boolean createBooleanWithValue(boolean z4) {
        return Boolean.valueOf(z4);
    }

    public static CameraCaptureParams createCameraParams(Boolean bool, int i4, int i5, int i6) {
        CameraCaptureParams cameraCaptureParams = new CameraCaptureParams();
        cameraCaptureParams.f72486a = bool;
        cameraCaptureParams.f72492b = i4;
        cameraCaptureParams.f72493c = i5;
        cameraCaptureParams.f72494d = i6;
        return cameraCaptureParams;
    }
}
