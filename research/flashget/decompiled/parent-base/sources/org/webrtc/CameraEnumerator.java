package org.webrtc;

import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes9.dex */
public interface CameraEnumerator {
    CameraVideoCapturer createCapture(String str, int i4, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler);

    CameraVideoCapturer createCapture(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler);

    String[] getDeviceNames();

    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
