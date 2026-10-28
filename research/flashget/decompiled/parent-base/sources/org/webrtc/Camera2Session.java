package org.webrtc;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.webrtc.Camera2Session;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;

@TargetApi(21)
/* loaded from: classes9.dex */
class Camera2Session implements CameraSession {
    private final Context applicationContext;
    private final CameraSession.CreateSessionCallback callback;
    private CameraCharacteristics cameraCharacteristics;

    @androidx.annotation.q0
    private CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    private int cameraOrientation;
    private final Handler cameraThreadHandler;
    private CameraEnumerationAndroid.CaptureFormat captureFormat;

    @androidx.annotation.q0
    private CameraCaptureSession captureSession;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private int fpsUnitFactor;
    private final int framerate;
    private final int height;
    private boolean isCameraFrontFacing;
    private int mode;
    private SessionState state;

    @androidx.annotation.q0
    private Surface surface;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;
    private static final String TAG = ProtectedSandApp.s("ꏦ\u0001");
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꏦ\u0001"));
    private static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts(ProtectedSandApp.s("ꏧ\u0001"), 1, 10000, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts(ProtectedSandApp.s("ꏨ\u0001"), 1, 10000, 50);
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration(ProtectedSandApp.s("ꏩ\u0001"), CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    private static class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Camera2Session.logger.debug("Capture failed: " + captureFailure);
        }

        private CameraCaptureCallback() {
        }
    }

    private class CameraStateCallback extends CameraDevice.StateCallback {
        private String getErrorDescription(int i4) {
            return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? android.support.v4.media.a.a("Unknown camera error: ", i4) : "Camera service has encountered a fatal error." : "Camera device has encountered a fatal error." : "Camera device could not be opened due to a device policy." : "Camera device could not be opened because there are too many other open camera devices." : "Camera device is in use already.";
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            if (Camera2Session.this.sessionNull()) {
                return;
            }
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.logger.debug("Camera device closed.");
            Camera2Session.this.events.onCameraClosed(Camera2Session.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z4 = Camera2Session.this.captureSession == null && Camera2Session.this.state != SessionState.STOPPED;
            Camera2Session.this.state = SessionState.STOPPED;
            Camera2Session.this.stopInternal();
            if (z4) {
                Camera2Session.this.callback.onFailure(CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session.this.events.onCameraDisconnected(Camera2Session.this);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i4) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i4));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.logger.debug("Camera opened.");
            Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.surfaceTextureHelper.setTextureSize(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height);
            Camera2Session.this.surface = new Surface(Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
            try {
                cameraDevice.createCaptureSession(Arrays.asList(Camera2Session.this.surface), new CaptureSessionCallback(), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e4) {
                Camera2Session.this.reportError("Failed to create capture session. " + e4);
            }
        }

        private CameraStateCallback() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        private void chooseFocusMode(CaptureRequest.Builder builder) {
            for (int i4 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i4 == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    Camera2Session.logger.debug("Using continuous video auto-focus.");
                    return;
                }
            }
            Camera2Session.logger.debug("Auto-focus is not available.");
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            int[] iArr = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i4 : iArr) {
                    if (i4 == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        Camera2Session.logger.debug("Using optical stabilization.");
                        return;
                    }
                }
            }
            int[] iArr2 = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if (iArr2 != null) {
                for (int i5 : iArr2) {
                    if (i5 == 1) {
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                        Camera2Session.logger.debug("Using video stabilization.");
                        return;
                    }
                }
            }
            Camera2Session.logger.debug("Stabilization not available.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.state != SessionState.RUNNING) {
                Camera2Session.logger.debug("Texture frame captured but camera is no longer running.");
                return;
            }
            if (!Camera2Session.this.firstFrameReported) {
                Camera2Session.this.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera2Session.this.constructionTimeNs));
            }
            VideoFrame videoFrame2 = new VideoFrame(CameraSession.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.getBuffer(), Camera2Session.this.isCameraFrontFacing, -Camera2Session.this.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            Camera2Session.this.events.onFrameCaptured(Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            CaptureRequest.Builder builder;
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.logger.debug("Camera capture session configured.");
            Camera2Session.this.captureSession = cameraCaptureSession;
            try {
                try {
                    Camera2Session.logger.debug("Camera capture session configured: TEMPLATE_VIDEO_SNAPSHOT");
                    builder = Camera2Session.this.cameraDevice.createCaptureRequest(Camera2Session.this.mode);
                } catch (Exception e4) {
                    Camera2Session.logger.debug("Camera capture session configured error: " + e4.getLocalizedMessage());
                    if (Camera2Session.this.mode == 4) {
                        Camera2Session.logger.debug("Camera capture session configured: TEMPLATE_RECORD");
                        builder = Camera2Session.this.cameraDevice.createCaptureRequest(3);
                    } else {
                        builder = null;
                    }
                }
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(Camera2Session.this.captureFormat.framerate.min / Camera2Session.this.fpsUnitFactor), Integer.valueOf(Camera2Session.this.captureFormat.framerate.max / Camera2Session.this.fpsUnitFactor)));
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                chooseStabilizationMode(builder);
                chooseFocusMode(builder);
                builder.addTarget(Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(builder.build(), new CameraCaptureCallback(), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new VideoSink() { // from class: org.webrtc.f
                    @Override // org.webrtc.VideoSink
                    public final void onFrame(VideoFrame videoFrame) {
                        Camera2Session.CaptureSessionCallback.this.lambda$onConfigured$0(videoFrame);
                    }
                });
                Camera2Session.logger.debug("Camera device successfully started.");
                Camera2Session.this.callback.onDone(Camera2Session.this);
            } catch (Exception e5) {
                Camera2Session.this.reportError("Failed to start capture request. " + e5);
            }
        }

        private CaptureSessionCallback() {
        }
    }

    private enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i4, int i5, int i6, int i7) {
        this.mode = 3;
        this.state = SessionState.RUNNING;
        logger.debug(ProtectedSandApp.s("ꏪ\u0001") + str);
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i4;
        this.height = i5;
        this.framerate = i6;
        this.mode = i7;
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            logger.debug(ProtectedSandApp.s("ꏫ\u0001"));
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i4, int i5, int i6) {
        new Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i4, i5, i6);
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List<Size> supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꏬ\u0001") + supportedSizes);
        logger2.debug(ProtectedSandApp.s("ꏭ\u0001") + convertFramerates);
        if (convertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError(ProtectedSandApp.s("ꏯ\u0001"));
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        logger2.debug(ProtectedSandApp.s("ꏮ\u0001") + this.captureFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.getDeviceOrientation(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.cameraOrientation + deviceOrientation) % 360;
    }

    private void openCamera() {
        checkIsOnCameraThread();
        com.flashget.commonx.billing.ui.v.a(new StringBuilder(ProtectedSandApp.s("ꏰ\u0001")), this.cameraId, logger);
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(), this.cameraThreadHandler);
        } catch (CameraAccessException | IllegalArgumentException | SecurityException e4) {
            reportError(ProtectedSandApp.s("ꏱ\u0001") + e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportError(String str) {
        checkIsOnCameraThread();
        com.flashget.commonx.billing.m.a(ProtectedSandApp.s("ꏲ\u0001"), str, logger);
        boolean z4 = this.captureSession == null && this.state != SessionState.STOPPED;
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z4) {
            this.callback.onFailure(CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sessionNull() {
        if (this.captureSession == null) {
            logger.debug(ProtectedSandApp.s("ꏳ\u0001"));
            return true;
        }
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return false;
        }
        logger.debug(ProtectedSandApp.s("ꏴ\u0001"));
        return true;
    }

    private void start() {
        checkIsOnCameraThread();
        logger.debug(ProtectedSandApp.s("ꏵ\u0001"));
        try {
            CameraCharacteristics cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics;
            this.cameraOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.isCameraFrontFacing = ((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
            findCaptureFormat();
            if (this.captureFormat == null) {
                return;
            }
            openCamera();
        } catch (CameraAccessException | IllegalArgumentException e4) {
            reportError(ProtectedSandApp.s("ꏶ\u0001") + e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꏷ\u0001"));
        if (sessionNull()) {
            return;
        }
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        logger2.debug(ProtectedSandApp.s("ꏸ\u0001"));
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        com.flashget.commonx.billing.ui.v.a(new StringBuilder(ProtectedSandApp.s("ꏹ\u0001")), this.cameraId, logger);
        if (sessionNull()) {
            return;
        }
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i4, int i5, int i6, int i7) {
        new Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i4, i5, i6, i7);
    }

    private Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i4, int i5, int i6) {
        this(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i4, i5, i6, 3);
    }
}
