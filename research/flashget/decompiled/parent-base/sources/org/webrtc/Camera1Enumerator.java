package org.webrtc;

import android.hardware.Camera;
import android.os.SystemClock;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.InitWebRTCCameraEvent;

/* loaded from: classes9.dex */
public class Camera1Enumerator implements CameraEnumerator {
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;
    private static final String TAG = ProtectedSandApp.s("ꎚ\u0001");
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꎚ\u0001"));

    public Camera1Enumerator() {
        this(true);
    }

    static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i4) {
        int i5;
        String s4 = ProtectedSandApp.s("ꎛ\u0001");
        String s5 = ProtectedSandApp.s("ꎜ\u0001");
        String s6 = ProtectedSandApp.s("ꎝ\u0001");
        Logger logger2 = logger;
        String s7 = ProtectedSandApp.s("ꎞ\u0001");
        logger2.debug(s7 + i4 + ProtectedSandApp.s("ꎟ\u0001"));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Camera camera = null;
        try {
            try {
                logger2.debug(s6 + i4);
                camera = Camera.open(i4);
                Camera.Parameters parameters = camera.getParameters();
                org.greenrobot.eventbus.c.f().q(new InitWebRTCCameraEvent(InitWebRTCCameraEvent.Type.OPEN_SUCCESS));
                logger2.debug(s4);
                camera.release();
                ArrayList arrayList = new ArrayList();
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i6 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i6 = iArr[0];
                        i5 = iArr[1];
                    } else {
                        i5 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i6, i5));
                    }
                } catch (Exception e4) {
                    logger.error(ProtectedSandApp.s("ꎠ\u0001") + i4, e4);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Logger logger3 = logger;
                StringBuilder a5 = androidx.collection.s.a(s7, i4, ProtectedSandApp.s("ꎡ\u0001"));
                a5.append(elapsedRealtime2 - elapsedRealtime);
                a5.append(ProtectedSandApp.s("ꎢ\u0001"));
                logger3.debug(a5.toString());
                return arrayList;
            } catch (RuntimeException e5) {
                Logger logger4 = logger;
                logger4.error(s5 + i4, e5);
                org.greenrobot.eventbus.c.f().q(new InitWebRTCCameraEvent(InitWebRTCCameraEvent.Type.OPEN_FAIL));
                ArrayList arrayList2 = new ArrayList();
                if (camera != null) {
                    logger4.debug(s4);
                    camera.release();
                }
                return arrayList2;
            }
        } catch (Throwable th) {
            if (camera != null) {
                logger.debug(s4);
                camera.release();
            }
            throw th;
        }
    }

    static int getCameraIndex(String str) {
        com.codebutler.android_websockets.c.a(ProtectedSandApp.s("ꎣ\u0001"), str, logger);
        for (int i4 = 0; i4 < Camera.getNumberOfCameras(); i4++) {
            if (str.equals(getDeviceName(i4))) {
                return i4;
            }
        }
        throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꎤ\u0001"), str));
    }

    @androidx.annotation.q0
    private static Camera.CameraInfo getCameraInfo(int i4) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i4, cameraInfo);
            return cameraInfo;
        } catch (Exception e4) {
            logger.error(ProtectedSandApp.s("ꎥ\u0001") + i4, e4);
            return null;
        }
    }

    @androidx.annotation.q0
    static String getDeviceName(int i4) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i4);
        if (cameraInfo == null) {
            return null;
        }
        StringBuilder a5 = androidx.constraintlayout.motion.widget.s.a(ProtectedSandApp.s("ꎨ\u0001"), i4, ProtectedSandApp.s("ꎩ\u0001"), cameraInfo.facing == 1 ? ProtectedSandApp.s("ꎦ\u0001") : ProtectedSandApp.s("ꎧ\u0001"), ProtectedSandApp.s("ꎪ\u0001"));
        a5.append(cameraInfo.orientation);
        return a5.toString();
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapture(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < Camera.getNumberOfCameras(); i4++) {
            String deviceName = getDeviceName(i4);
            String s4 = ProtectedSandApp.s("ꎫ\u0001");
            if (deviceName != null) {
                arrayList.add(deviceName);
                com.codebutler.android_websockets.b.a(s4, i4, ProtectedSandApp.s("ꎬ\u0001"), deviceName, logger);
            } else {
                logger.error(s4 + i4 + ProtectedSandApp.s("ꎭ\u0001"));
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 1;
    }

    public Camera1Enumerator(boolean z4) {
        this.captureToTexture = z4;
    }

    static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i4) {
        List<CameraEnumerationAndroid.CaptureFormat> list;
        synchronized (Camera1Enumerator.class) {
            try {
                List<List<CameraEnumerationAndroid.CaptureFormat>> list2 = cachedSupportedFormats;
                if (list2 == null) {
                    cachedSupportedFormats = new ArrayList();
                    for (int i5 = 0; i5 < Camera.getNumberOfCameras(); i5++) {
                        cachedSupportedFormats.add(enumerateFormats(i5));
                    }
                } else if (!list2.isEmpty()) {
                    org.greenrobot.eventbus.c.f().q(new InitWebRTCCameraEvent(InitWebRTCCameraEvent.Type.OPEN_BY_CACHE));
                }
                list = cachedSupportedFormats.get(i4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapture(String str, int i4, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }
}
