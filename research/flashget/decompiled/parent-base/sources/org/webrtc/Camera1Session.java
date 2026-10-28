package org.webrtc;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.SystemClock;
import android.view.WindowManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.webrtc.Camera1Session;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;

/* loaded from: classes9.dex */
public class Camera1Session implements CameraSession {
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final int WAIT_TIME_OUT = 20;
    private static int mInfoRotation;
    private static Camera1Session mInstance;
    public static byte[] mLastBytes;
    private static int save_height;
    private static int save_rotation;
    private static int save_width;
    private final Context applicationContext;
    private final Camera camera;
    private final int cameraId;
    private final Handler cameraThreadHandler;
    private final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private final Camera.CameraInfo info;
    private Sensor mAccelerometer;
    private SensorEventListener mAccelerometerListener;
    byte[] mLastTakePic;
    private SensorManager mSensorManager;
    private boolean mSensorOrientationEnabled;
    private SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private static final String TAG = ProtectedSandApp.s("ꎮ\u0001");
    private static final Logger logger = Logger.getLogger(ProtectedSandApp.s("ꎮ\u0001"));
    private static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts(ProtectedSandApp.s("ꎯ\u0001"), 1, 10000, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts(ProtectedSandApp.s("ꎰ\u0001"), 1, 10000, 50);
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration(ProtectedSandApp.s("ꎱ\u0001"), CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static boolean isCorrectVisionForward = false;
    boolean mIsWaitEnd = false;
    private int sensorOrientation = 0;

    /* renamed from: org.webrtc.Camera1Session$2, reason: invalid class name */
    class AnonymousClass2 implements Camera.PreviewCallback {
        AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$0(byte[] bArr) {
            if (Camera1Session.this.state == SessionState.RUNNING) {
                Camera1Session.this.camera.addCallbackBuffer(bArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$1(final byte[] bArr) {
            Camera1Session.this.cameraThreadHandler.post(new Runnable() { // from class: org.webrtc.c
                @Override // java.lang.Runnable
                public final void run() {
                    Camera1Session.AnonymousClass2.this.lambda$onPreviewFrame$0(bArr);
                }
            });
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(final byte[] bArr, Camera camera) {
            Camera1Session.this.checkIsOnCameraThread();
            if (camera != Camera1Session.this.camera) {
                Camera1Session.logger.error("Callback from a different camera. This should never happen.");
                return;
            }
            if (Camera1Session.this.state != SessionState.RUNNING) {
                Camera1Session.logger.debug("Bytebuffer frame captured but camera is no longer running.");
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            if (!Camera1Session.this.firstFrameReported) {
                Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                Camera1Session.this.firstFrameReported = true;
            }
            VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new Runnable() { // from class: org.webrtc.b
                @Override // java.lang.Runnable
                public final void run() {
                    Camera1Session.AnonymousClass2.this.lambda$onPreviewFrame$1(bArr);
                }
            }), Camera1Session.this.info.orientation, nanos);
            Camera1Session.logger.debug("send pic");
            Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
            videoFrame.release();
        }
    }

    private enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera1Session(CameraSession.Events events, boolean z4, Context context, SurfaceTextureHelper surfaceTextureHelper, int i4, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j4) {
        logger.debug(ProtectedSandApp.s("ꎲ\u0001") + i4);
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.captureToTexture = z4;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i4;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j4;
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        mInstance = this;
        startCapturing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            logger.debug(ProtectedSandApp.s("ꎳ\u0001"));
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, boolean z4, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i4, int i5, int i6, boolean z5) {
        long nanoTime = System.nanoTime();
        logger.debug(ProtectedSandApp.s("ꎴ\u0001") + str);
        events.onCameraOpening();
        try {
            int cameraIndex = Camera1Enumerator.getCameraIndex(str);
            try {
                Camera open = Camera.open(cameraIndex);
                if (open == null) {
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, ProtectedSandApp.s("ꎵ\u0001") + cameraIndex);
                    return;
                }
                try {
                    open.setPreviewTexture(surfaceTextureHelper.getSurfaceTexture());
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(cameraIndex, cameraInfo);
                    try {
                        mInfoRotation = cameraInfo.orientation;
                        Camera.Parameters parameters = open.getParameters();
                        CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i4, i5, i6);
                        updateCameraParameters(open, parameters, findClosestCaptureFormat, findClosestPictureSize(parameters, i4, i5), z4, z5, cameraInfo);
                        if (z4) {
                            int frameSize = findClosestCaptureFormat.frameSize();
                            for (int i7 = 0; i7 < 3; i7++) {
                                open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                            }
                        }
                        try {
                            open.setDisplayOrientation(0);
                            createSessionCallback.onDone(new Camera1Session(events, z4, context, surfaceTextureHelper, cameraIndex, open, cameraInfo, findClosestCaptureFormat, nanoTime));
                        } catch (RuntimeException e4) {
                            open.release();
                            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e4.getMessage());
                        }
                    } catch (RuntimeException e5) {
                        open.release();
                        logger.error(ProtectedSandApp.s("ꎶ\u0001"));
                        createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e5.getMessage());
                    }
                } catch (IOException | RuntimeException e6) {
                    open.release();
                    logger.error(ProtectedSandApp.s("ꎷ\u0001"));
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e6.getMessage());
                }
            } catch (RuntimeException e7) {
                Logger logger2 = logger;
                StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("ꎸ\u0001"), cameraIndex, ProtectedSandApp.s("ꎹ\u0001"));
                a5.append(e7.getClass().getName());
                a5.append(ProtectedSandApp.s("ꎺ\u0001"));
                a5.append(e7.getMessage());
                logger2.error(a5.toString(), e7);
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e7.getMessage());
            }
        } catch (IllegalArgumentException e10) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e10.getMessage());
        }
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i4, int i5, int i6) {
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        logger.debug(ProtectedSandApp.s("ꎻ\u0001") + convertFramerates);
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i6);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i4, i5);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i4, int i5) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i4, i5);
    }

    private int getDeviceOrientation() {
        int rotation = ((WindowManager) this.applicationContext.getSystemService(ProtectedSandApp.s("ꎼ\u0001"))).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    private int getFrameOrientation() {
        if (isCorrectVisionForward && this.mSensorOrientationEnabled) {
            int i4 = this.sensorOrientation;
            Camera.CameraInfo cameraInfo = this.info;
            if (cameraInfo.facing == 0) {
                i4 = 360 - i4;
            }
            return (cameraInfo.orientation + i4) % 360;
        }
        int deviceOrientation = CameraSession.getDeviceOrientation(this.applicationContext);
        Camera.CameraInfo cameraInfo2 = this.info;
        if (cameraInfo2.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (cameraInfo2.orientation + deviceOrientation) % 360;
    }

    public static int getInfoRotation() {
        return mInfoRotation;
    }

    public static Camera1Session getInstance() {
        return mInstance;
    }

    private boolean initSensorManager(Context context) {
        String s4 = ProtectedSandApp.s("ꎽ\u0001");
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꎾ\u0001"));
        releaseSensor();
        SensorManager sensorManager = (SensorManager) context.getSystemService(ProtectedSandApp.s("ꎿ\u0001"));
        this.mSensorManager = sensorManager;
        if (sensorManager == null) {
            return false;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.mAccelerometer = defaultSensor;
        if (defaultSensor == null) {
            releaseSensor();
            return false;
        }
        try {
            logger2.debug(s4 + this.mSensorManager.getSensorList(127).size());
        } catch (Exception e4) {
            com.flashget.kid.common.servers.forward.data.a.a(e4, new StringBuilder(ProtectedSandApp.s("ꏀ\u0001")), logger);
        }
        SensorEventListener sensorEventListener = new SensorEventListener() { // from class: org.webrtc.Camera1Session.5
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i4) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Sensor sensor;
                if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != 1) {
                    return;
                }
                float[] fArr = sensorEvent.values;
                float f4 = fArr[0];
                float f5 = fArr[1];
                float abs = Math.abs(f4) - Math.abs(f5);
                if (Math.abs(abs) < 5.0f) {
                    return;
                }
                if (abs > 0.0f) {
                    if (f4 < 0.0f) {
                        Camera1Session.this.sensorOrientation = 270;
                    }
                    if (f4 > 0.0f) {
                        Camera1Session.this.sensorOrientation = 90;
                        return;
                    }
                    return;
                }
                if (f5 < 0.0f) {
                    Camera1Session.this.sensorOrientation = 180;
                }
                if (f5 > 0.0f) {
                    Camera1Session.this.sensorOrientation = 0;
                }
            }
        };
        this.mAccelerometerListener = sensorEventListener;
        try {
            if (this.mSensorManager.registerListener(sensorEventListener, this.mAccelerometer, 3)) {
                this.mSensorOrientationEnabled = true;
                return true;
            }
            logger.error(ProtectedSandApp.s("ꏁ\u0001"));
            releaseSensor();
            return false;
        } catch (RuntimeException e5) {
            logger.error(ProtectedSandApp.s("ꏂ\u0001") + e5.getMessage());
            releaseSensor();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$listenForTextureFrames$0(VideoFrame videoFrame) {
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            logger.debug(ProtectedSandApp.s("ꏃ\u0001"));
            return;
        }
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        save_rotation = getFrameOrientation();
        VideoFrame videoFrame2 = new VideoFrame(CameraSession.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.getBuffer(), this.info.facing == 1, 0), getFrameOrientation(), videoFrame.getTimestampNs());
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new AnonymousClass2());
    }

    private void listenForBytebufferFramesWorkaround() {
        this.camera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: org.webrtc.Camera1Session.3
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(byte[] bArr, Camera camera) {
                Camera1Session.this.checkIsOnCameraThread();
                if (camera != Camera1Session.this.camera) {
                    Camera1Session.logger.error("Callback from a different camera. This should never happen.");
                } else if (Camera1Session.this.state != SessionState.RUNNING) {
                    Camera1Session.logger.debug("Bytebuffer frame captured but camera is no longer running.");
                } else {
                    Camera1Session.mLastBytes = bArr;
                    Camera1Session.this.camera.addCallbackBuffer(bArr);
                }
            }
        });
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new VideoSink() { // from class: org.webrtc.a
            @Override // org.webrtc.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
                Camera1Session.this.lambda$listenForTextureFrames$0(videoFrame);
            }
        });
    }

    private byte[] processByteData(int i4, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            byte[] processDataByBitmap = processDataByBitmap(i4, bArr);
            return processDataByBitmap == null ? processDataByYUV(i4, bArr) : processDataByBitmap;
        } catch (Exception e4) {
            com.flashget.kid.common.servers.forward.data.a.a(e4, new StringBuilder(ProtectedSandApp.s("ꏄ\u0001")), logger);
            return processDataByYUV(i4, bArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] processDataByBitmap(int r13, byte[] r14) {
        /*
            r12 = this;
            java.lang.String r0 = "ꏅ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r1 = 0
            int r2 = r14.length     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r3 = 0
            android.graphics.Bitmap r14 = android.graphics.BitmapFactory.decodeByteArray(r14, r3, r2)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            android.graphics.Matrix r9 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r9.<init>()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            float r13 = (float) r13     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r9.postRotate(r13)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            int r7 = r14.getWidth()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            int r8 = r14.getHeight()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r10 = 1
            r5 = 0
            r6 = 0
            r4 = r14
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r4 = 80
            r13.compress(r3, r4, r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            byte[] r1 = r2.toByteArray()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            org.apache.log4j.Logger r2 = org.webrtc.Camera1Session.logger     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r3 = "ꏆ\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r2.info(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r14.recycle()
            r13.recycle()
            goto L7e
        L48:
            r0 = move-exception
        L49:
            r1 = r14
            goto L80
        L4b:
            r2 = move-exception
            r11 = r1
            r1 = r14
            r14 = r11
            goto L5e
        L50:
            r0 = move-exception
            r13 = r1
            goto L49
        L53:
            r2 = move-exception
            r13 = r1
            r1 = r14
        L56:
            r14 = r13
            goto L5e
        L58:
            r0 = move-exception
            r13 = r1
            goto L80
        L5b:
            r2 = move-exception
            r13 = r1
            goto L56
        L5e:
            org.apache.log4j.Logger r3 = org.webrtc.Camera1Session.logger     // Catch: java.lang.Throwable -> L7f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L7f
            r4.append(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L7f
            r3.error(r0)     // Catch: java.lang.Throwable -> L7f
            if (r1 == 0) goto L78
            r1.recycle()
        L78:
            if (r13 == 0) goto L7d
            r13.recycle()
        L7d:
            r1 = r14
        L7e:
            return r1
        L7f:
            r0 = move-exception
        L80:
            if (r1 == 0) goto L85
            r1.recycle()
        L85:
            if (r13 == 0) goto L8a
            r13.recycle()
        L8a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera1Session.processDataByBitmap(int, byte[]):byte[]");
    }

    private byte[] processDataByYUV(int i4, byte[] bArr) {
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, save_width, save_height, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, save_width, save_height), 100, byteArrayOutputStream);
            logger.info(ProtectedSandApp.s("ꏇ\u0001"));
            return processDataByBitmap(i4, byteArrayOutputStream.toByteArray());
        } catch (Exception e4) {
            com.flashget.kid.common.servers.forward.data.a.a(e4, new StringBuilder(ProtectedSandApp.s("ꏈ\u0001")), logger);
            return null;
        }
    }

    private void releaseSensor() {
        SensorEventListener sensorEventListener;
        logger.debug(ProtectedSandApp.s("ꏉ\u0001"));
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null && (sensorEventListener = this.mAccelerometerListener) != null) {
            Sensor sensor = this.mAccelerometer;
            if (sensor != null) {
                sensorManager.unregisterListener(sensorEventListener, sensor);
            } else {
                sensorManager.unregisterListener(sensorEventListener);
            }
        }
        this.mSensorOrientationEnabled = false;
        this.mAccelerometerListener = null;
        this.mSensorManager = null;
        this.mAccelerometer = null;
    }

    private void startCapturing() {
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꏊ\u0001"));
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() { // from class: org.webrtc.Camera1Session.1
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i4, Camera camera) {
                String a5 = i4 == 100 ? "Camera server died!" : android.support.v4.media.a.a("Camera error: ", i4);
                Camera1Session.logger.error(a5);
                Camera1Session.this.stopInternal();
                if (i4 == 2) {
                    Camera1Session.this.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    Camera1Session.this.events.onCameraError(Camera1Session.this, a5);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
            listenForBytebufferFramesWorkaround();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
            try {
                if (!isCorrectVisionForward || initSensorManager(this.applicationContext)) {
                    return;
                }
                logger2.warn(ProtectedSandApp.s("ꏋ\u0001"));
            } catch (Exception e4) {
                logger.warn(ProtectedSandApp.s("ꏌ\u0001") + e4);
            }
        } catch (RuntimeException e5) {
            stopInternal();
            this.events.onCameraError(this, e5.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        Logger logger2 = logger;
        logger2.debug(ProtectedSandApp.s("ꏍ\u0001"));
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState == sessionState2) {
            logger2.debug(ProtectedSandApp.s("ꏎ\u0001"));
            return;
        }
        try {
            this.state = sessionState2;
            this.surfaceTextureHelper.stopListening();
            this.camera.stopPreview();
            this.camera.release();
            this.events.onCameraClosed(this);
            mInstance = null;
            logger2.info(ProtectedSandApp.s("ꏏ\u0001"));
        } catch (Exception e4) {
            e4.printStackTrace();
            logger.error(ProtectedSandApp.s("ꏐ\u0001") + e4.getLocalizedMessage());
        }
        try {
            releaseSensor();
            logger.info(ProtectedSandApp.s("ꏑ\u0001"));
        } catch (Exception e5) {
            e5.printStackTrace();
            logger.error(ProtectedSandApp.s("ꏒ\u0001") + e5.getLocalizedMessage());
        }
    }

    private static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z4, boolean z5, Camera.CameraInfo cameraInfo) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        parameters.setPictureSize(size.width, size.height);
        save_width = captureFormat.width;
        save_height = captureFormat.height;
        if (z4) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes != null) {
            String s4 = ProtectedSandApp.s("ꏓ\u0001");
            if (supportedFocusModes.contains(s4)) {
                parameters.setFocusMode(s4);
            }
        }
        if (cameraInfo != null && cameraInfo.facing != 1) {
            if (z5) {
                parameters.setFlashMode(ProtectedSandApp.s("ꏔ\u0001"));
            } else {
                parameters.setFlashMode(ProtectedSandApp.s("ꏕ\u0001"));
            }
        }
        logger.debug(ProtectedSandApp.s("ꏖ\u0001") + parameters.getPreviewFormat() + ProtectedSandApp.s("ꏗ\u0001") + parameters.getPictureFormat());
        camera.setParameters(parameters);
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        com.flashget.kid.common.requests.uploadfile.a.a(new StringBuilder(ProtectedSandApp.s("ꏘ\u0001")), this.cameraId, logger);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public synchronized byte[] takePic(int i4) {
        int i5 = 0;
        this.mIsWaitEnd = false;
        try {
            this.camera.autoFocus(new Camera.AutoFocusCallback() { // from class: org.webrtc.Camera1Session.4
                @Override // android.hardware.Camera.AutoFocusCallback
                public void onAutoFocus(boolean z4, Camera camera) {
                    com.flashget.commonx.billing.s.a("onAutoFocus ", z4, Camera1Session.logger);
                    if (z4) {
                        Camera1Session.this.camera.takePicture(null, null, new Camera.PictureCallback() { // from class: org.webrtc.Camera1Session.4.1
                            @Override // android.hardware.Camera.PictureCallback
                            public void onPictureTaken(byte[] bArr, Camera camera2) {
                                if (bArr == null) {
                                    bArr = Camera1Session.mLastBytes;
                                }
                                Camera1Session.logger.info("takepic success");
                                Camera1Session camera1Session = Camera1Session.this;
                                camera1Session.mLastTakePic = bArr;
                                camera1Session.mIsWaitEnd = true;
                            }
                        });
                        return;
                    }
                    Camera1Session camera1Session = Camera1Session.this;
                    camera1Session.mLastTakePic = Camera1Session.mLastBytes;
                    camera1Session.mIsWaitEnd = true;
                }
            });
        } catch (Exception unused) {
        }
        while (true) {
            if (this.mIsWaitEnd) {
                break;
            }
            i5++;
            if (i5 > 20) {
                logger.info(ProtectedSandApp.s("ꏙ\u0001"));
                this.mLastTakePic = mLastBytes;
                break;
            }
            try {
                Thread.sleep(500L);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return processByteData(i4, this.mLastTakePic);
    }
}
