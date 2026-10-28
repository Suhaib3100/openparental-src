package org.webrtc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes9.dex */
abstract class CameraCapturer implements CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    private static final Logger logger = Logger.getLogger("CameraCapturer");
    private Context applicationContext;
    private final CameraEnumerator cameraEnumerator;
    private String cameraName;

    @androidx.annotation.q0
    private CameraVideoCapturer.CameraStatistics cameraStatistics;

    @androidx.annotation.q0
    private Handler cameraThreadHandler;
    private CapturerObserver capturerObserver;

    @androidx.annotation.q0
    private CameraSession currentSession;

    @androidx.annotation.q0
    private final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private boolean firstFrameObserved;
    private int framerate;
    private int height;
    private boolean mIsPause;
    private boolean mIsSupportSwithcAllCamera;
    private int openAttemptsRemaining;
    private boolean sessionOpening;

    @androidx.annotation.q0
    private SurfaceTextureHelper surfaceHelper;

    @androidx.annotation.q0
    private CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    private final Handler uiThreadHandler;
    private int width;

    @androidx.annotation.q0
    private final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: org.webrtc.CameraCapturer.1
        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread("onDone");
            CameraCapturer.logger.debug("Create session done. Switch state: " + CameraCapturer.this.switchState);
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.currentSession = cameraSession;
                    CameraCapturer.this.cameraStatistics = new CameraVideoCapturer.CameraStatistics(CameraCapturer.this.surfaceHelper, CameraCapturer.this.eventsHandler);
                    CameraCapturer.this.firstFrameObserved = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    if (CameraCapturer.this.switchState == SwitchState.IN_PROGRESS) {
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                    } else if (CameraCapturer.this.switchState == SwitchState.PENDING) {
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        cameraCapturer.switchCameraInternal(cameraCapturer.switchEventsHandler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread("onFailure");
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    cameraCapturer.openAttemptsRemaining--;
                    if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                        CameraCapturer.logger.warn("Opening camera failed, passing: " + str);
                        CameraCapturer.this.sessionOpening = false;
                        CameraCapturer.this.stateLock.notifyAll();
                        SwitchState switchState = CameraCapturer.this.switchState;
                        SwitchState switchState2 = SwitchState.IDLE;
                        if (switchState != switchState2) {
                            if (CameraCapturer.this.switchEventsHandler != null) {
                                CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                                CameraCapturer.this.switchEventsHandler = null;
                            }
                            CameraCapturer.this.switchState = switchState2;
                        }
                        if (failureType == CameraSession.FailureType.DISCONNECTED) {
                            CameraCapturer.this.eventsHandler.onCameraDisconnected();
                        } else {
                            CameraCapturer.this.eventsHandler.onCameraError(str);
                        }
                    } else {
                        CameraCapturer.logger.warn("Opening camera failed, retry: " + str);
                        CameraCapturer.this.createSessionInternal(500, false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    @androidx.annotation.q0
    private final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() { // from class: org.webrtc.CameraCapturer.2
        @Override // org.webrtc.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread("onCameraClosed");
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession && CameraCapturer.this.currentSession != null) {
                        CameraCapturer.logger.debug("onCameraClosed from another session.");
                    } else if (CameraCapturer.this.switchState != SwitchState.IDLE) {
                        CameraCapturer.logger.debug("onCameraClosed during camera operation.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraClosed();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread("onCameraDisconnected");
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        CameraCapturer.logger.warn("onCameraDisconnected from another session.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraDisconnected();
                        CameraCapturer.this.stopCapture();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread("onCameraError");
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession == CameraCapturer.this.currentSession) {
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                        CameraCapturer.this.stopCapture();
                    } else {
                        CameraCapturer.logger.warn("onCameraError from another session: " + str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread("onCameraOpening");
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (CameraCapturer.this.currentSession != null) {
                        CameraCapturer.logger.warn("onCameraOpening while session was open.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            if (CameraCapturer.this.currentSession == null) {
                CameraCapturer.logger.debug("onFrameCaptured currentSession == null");
                return;
            }
            CameraCapturer.this.checkIsOnCameraThread("onFrameCaptured");
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        CameraCapturer.logger.warn("onFrameCaptured from another session.");
                        return;
                    }
                    if (!CameraCapturer.this.firstFrameObserved) {
                        CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                        CameraCapturer.this.firstFrameObserved = true;
                    }
                    CameraCapturer.this.cameraStatistics.addFrame();
                    if (CameraCapturer.this.mIsPause) {
                        return;
                    }
                    CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final Runnable openCameraTimeoutRunnable = new Runnable() { // from class: org.webrtc.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    private final Object stateLock = new Object();
    private SwitchState switchState = SwitchState.IDLE;

    enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(String str, @androidx.annotation.q0 CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: org.webrtc.CameraCapturer.4
            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        if (deviceNames.length == 0) {
            throw new RuntimeException("No cameras attached.");
        }
        if (!Arrays.asList(deviceNames).contains(this.cameraName)) {
            throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("Camera name "), this.cameraName, " does not match any known camera device."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread(String str) {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            com.flashget.commonx.billing.m.a("Check is on camera thread failed.", str, logger);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionInternal(int i4, final boolean z4) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i4 + 10000);
        this.cameraThreadHandler.postDelayed(new Runnable() { // from class: org.webrtc.CameraCapturer.5
            @Override // java.lang.Runnable
            public void run() {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate, z4);
            }
        }, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openCameraFlashInternal(@androidx.annotation.q0 CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, boolean z4) {
        Logger logger2 = logger;
        logger2.debug("openCameraFlashLight Start");
        synchronized (this.stateLock) {
            try {
                if (this.switchState != SwitchState.IDLE) {
                    reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                    return;
                }
                boolean z5 = this.sessionOpening;
                if (!z5 && this.currentSession == null) {
                    reportCameraSwitchError("openCameraFlashLight: camera is not running.", cameraSwitchHandler);
                    return;
                }
                this.switchEventsHandler = cameraSwitchHandler;
                if (z5) {
                    this.switchState = SwitchState.PENDING;
                    return;
                }
                this.switchState = SwitchState.IN_PROGRESS;
                logger2.debug("openCameraFlashLight: Stopping session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.sessionOpening = true;
                this.openAttemptsRemaining = 1;
                createSessionInternal(0, z4);
                logger2.debug("openCameraFlashLight done");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void reportCameraSwitchError(String str, @androidx.annotation.q0 CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        logger.error(str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchCameraInternal(@androidx.annotation.q0 CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logger logger2 = logger;
        logger2.debug("switchCamera internal");
        String[] deviceNames = this.cameraEnumerator.getDeviceNames();
        if (deviceNames.length < 2) {
            if (cameraSwitchHandler != null) {
                cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
                return;
            }
            return;
        }
        synchronized (this.stateLock) {
            try {
                if (this.switchState != SwitchState.IDLE) {
                    reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                    return;
                }
                boolean z4 = this.sessionOpening;
                if (!z4 && this.currentSession == null) {
                    reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                    return;
                }
                this.switchEventsHandler = cameraSwitchHandler;
                if (z4) {
                    this.switchState = SwitchState.PENDING;
                    return;
                }
                this.switchState = SwitchState.IN_PROGRESS;
                logger2.debug("switchCamera: Stopping session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                int indexOf = Arrays.asList(deviceNames).indexOf(this.cameraName);
                logger2.debug("cameraNameIndex " + indexOf);
                if (this.mIsSupportSwithcAllCamera) {
                    this.cameraName = deviceNames[(indexOf + 1) % deviceNames.length];
                } else if (indexOf == 0) {
                    this.cameraName = deviceNames[1];
                } else {
                    this.cameraName = deviceNames[0];
                }
                logger2.info("cameraName " + this.cameraName);
                this.sessionOpening = true;
                this.openAttemptsRemaining = 1;
                createSessionInternal(0, false);
                logger2.debug("switchCamera done");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean IsSupportSwithcAllCamera() {
        return this.mIsSupportSwithcAllCamera;
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i4, int i5, int i6) {
        com.flashget.kid.common.requests.uploadfile.a.a(androidx.collection.n1.a("changeCaptureFormat: ", i4, "x", i5, "@"), i6, logger);
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i4, i5, i6);
        }
    }

    protected abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i4, int i5, int i6, boolean z4);

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        logger.debug("dispose");
        stopCapture();
    }

    protected String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(@androidx.annotation.q0 SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper == null ? null : surfaceTextureHelper.getHandler();
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void openCameraFlashLight(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, final boolean z4) {
        logger.debug("switchCamera");
        this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.8
            @Override // java.lang.Runnable
            public void run() {
                CameraCapturer.this.openCameraFlashInternal(cameraSwitchHandler, z4);
            }
        });
    }

    @Override // org.webrtc.VideoCapturer
    public void pauseCapture(boolean z4) {
        this.mIsPause = z4;
    }

    public void printStackTrace() {
        Handler handler = this.cameraThreadHandler;
        Thread thread = handler != null ? handler.getLooper().getThread() : null;
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                logger.debug("CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    logger.debug(stackTraceElement.toString());
                }
            }
        }
    }

    public boolean setCameraName(String str) {
        if (this.sessionOpening) {
            logger.error("setCameraName, Camera session is opening");
            return false;
        }
        this.cameraName = str;
        return true;
    }

    public void setSwitchAllCamera(boolean z4) {
        this.mIsSupportSwithcAllCamera = z4;
    }

    @Override // org.webrtc.VideoCapturer
    public boolean startCapture(int i4, int i5, int i6) {
        Logger logger2 = logger;
        com.flashget.kid.common.requests.uploadfile.a.a(androidx.collection.n1.a("startCapture: ", i4, "x", i5, "@"), i6, logger2);
        if (this.applicationContext == null) {
            throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
        }
        synchronized (this.stateLock) {
            try {
                if (!this.sessionOpening && this.currentSession == null) {
                    this.width = i4;
                    this.height = i5;
                    this.framerate = i6;
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 3;
                    createSessionInternal(0, false);
                    return true;
                }
                logger2.warn("Session already open");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        logger.debug("Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                logger.debug("Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    logger.warn("Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                logger.debug("Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                logger.debug("Stop capture: No session open");
            }
        }
        logger.debug("Stop capture done");
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        logger.debug("switchCamera");
        this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.CameraCapturer.7
            @Override // java.lang.Runnable
            public void run() {
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler);
            }
        });
    }
}
